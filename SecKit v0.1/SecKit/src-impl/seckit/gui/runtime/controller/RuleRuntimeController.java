package seckit.gui.runtime.controller;

import identity.instance.AbstractIdentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import behavior.instance.Action;
import behavior.instance.Behavior;
import behavior.instance.Interaction;
import rule.RuleDesignModel;
import rule.RuleFactory;
import rule.RuleRuntimeModel;
import behavior.event.ActivityEventPattern;
import behavior.event.InteractionEvent;
import rule.condition.Atom;
import behavior.event.BehaviorEventPattern;
import rule.condition.Constant;
import context.event.ContextSituationEventPattern;
import structure.event.EntityEventPattern;
import rule.condition.EventPattern;
import rule.condition.Operator;
import rule.condition.TimeStepEventPattern;
import rule.condition.TruthValue;
import rule.action.Allow;
import rule.action.Authorization;
import rule.action.Execute;
import behavior.action.BehaviorExecution;
import rule.action.Deny;
import behavior.event.ActionEvent;
import structure.event.EntityEvent;
import structure.event.EntityLifecycle;
import rule.event.Event;
import rule.event.EventFactory;
import rule.event.EventProvider;
import rule.event.EventSet;
import rule.propositional.And;
import rule.propositional.Implies;
import rule.propositional.Not;
import rule.propositional.Or;
import rule.state.CounterState;
import rule.state.EventPatternState;
import rule.state.RepState;
import rule.state.State;
import rule.state.StateFactory;
import rule.template.InstantiationStrategy;
import rule.template.RuleInstance;
import rule.template.RuleTemplate;
import rule.template.TimeStepRuleSet;
import rule.template.DisposalStrategy;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.TemplateFactory;
import rule.template.TimeStepSize;
import rule.temporal.Always;
import rule.temporal.Before;
import rule.temporal.During;
import rule.temporal.Eventually;
import rule.temporal.RepeatLimit;
import rule.temporal.RepeatMaximum;
import rule.temporal.RepeatSince;
import rule.temporal.Since;
import rule.temporal.Within;
import seckit.RuleTester;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import structure.instance.Entity;
import time.DiscreteClock;
import time.TimeDuration;
import time.TimeUnit;
import time.Timestamp;
import utils.StateHandler;
import utils.ecore.ECoreUtils;

public class RuleRuntimeController extends RuntimeController {

    private static Logger logger = Logger.getLogger(RuleRuntimeController.class);

    /*
     * A tentative event becomes an actual event but not necessarily
     *  TODO: at the same time step, and it depends if there is a subscription
     * for this event or not.
     */
    // cache class names to associate with elements to prevent too much reflection use in Java.
    // extension mechanism should be well documented, maybe without inner classes?

    // private RuleTester tester;

    // Default 10 seconds + 1 second sleep time,
    // this is updated when reference clocks are loaded
    private long lowestClockResolution = 10000;
    private long threadSleepTime = lowestClockResolution / 10;

    public MonitoringThread monitoringThread;    
    
    // Map a clock resolution to all rule instances assigned to the resolution
    
    // Event pattern id and list of states created for this event pattern
    // When event arrives a possible matching pattern is for sure in this list.
    // An event may match more than one pattern?
    List<EventPattern> eventPatterns  = new ArrayList<EventPattern>();
    List<EventProvider> eventProviders = new ArrayList<EventProvider>();
    Map<String, List<EventPatternState>> eventPatternStateMap = new HashMap<String, List<EventPatternState>>();
    public Map<Long, TimeStepRuleSet> clockRuleSetMap = new HashMap<Long, TimeStepRuleSet>();  

    public RuleRuntimeController(RuntimeViewpointFactory runtime) {
        super("Rule", runtime);
    }
    
    @Override
    public void load() {
        // createFromDesignModels();
    }
    
    public void createFromDesignModels() {
        for (RuleDesignModel model : runtime.design.viewpoint.getRuleDesignModels()) {
            loadModel(model);
        }
    }
    
    RuleTester tester = null;
    
    public void setRuleTester(RuleTester tester) {
        this.tester = tester;
    }
    
    public RuleRuntimeModel createModel(String description) {
        RuleRuntimeModel model = RuleFactory.eINSTANCE.createRuleRuntimeModel();
        ECoreUtils.setup(model);
        if (description == null) {
            description = "Rule model " + model.getId();
        }
        model.setDescription(description);
        model.setRunning(false);
        model.setEventSet(createEventSet());
        viewpoint.getRuleRuntimeModels().add(model);
        return model;
    }
    
    public EventSet createEventSet() {
        EventSet set = EventFactory.eINSTANCE.createEventSet();
        ECoreUtils.setup(set);
        return set;
    }
    
    public void loadModel(RuleDesignModel designModel) {
        RuleRuntimeModel model = createModel(designModel.getDescription());
       
        // Create time step rule sets
        for (TimeStepSize timeStepSize : designModel.getTimeStepSizes()) {
            createTimeStepRuleSet(model, timeStepSize);
        }

        // Process packages and create rule configurations
        loadPackages(model, designModel.getPackages());
        
        logger.debug("Find lowest clock resolution for time step rule sets (" + model.getRuleSets().size()+")");
        long lowestClockResolution = 0;
        long clockResolution;
        for (TimeStepRuleSet set : model.getRuleSets()) {
            // Find lowest clock resolution
            clockResolution = set.getClock().getResolution().getAmount();
            if (set.getClock().getResolution().getUnit() != TimeUnit.MILLISECOND) {
              // TODO: convert clock resolution if not in milliseconds
              logger.warn("Resolution time unit must be in milliseconds");
            }            
            if (clockResolution < lowestClockResolution || lowestClockResolution == 0) {
                lowestClockResolution = clockResolution;
                // lowest is one second, this is acceptable
                // if (lowestClockResolution < 500)
                // logger.warn("   Clock resolution with less than half a second, this is not a real time system!");

                // TODO: how to setup an adequate sleep time?
                // It should depend on how long the update thread takes and
                // number
                // of clocks deployed to avoid too much overhead.
            }
        }
        logger.debug("   Lowest clock resolution = [" + lowestClockResolution + "] seconds");
        threadSleepTime = lowestClockResolution / 10;
        logger.debug("   Thread sleep time = [" + threadSleepTime + "] milliseconds, 1/10 of lowest clock resolution");
        new MonitoringThread(model).start();
    }

    public void updateTimeStepRuleSetStart(TimeStepRuleSet set) {
        set.getClock().setStart(null);
        set.getClock().setTimeStep(0);
        //ElementNode.changedAll(set);
    }

    public void updateTimeStepRuleSet(TimeStepRuleSet set, long start, long lastUpdate, long timeStep) {
        set.getClock().setStart(design.time.createTimestamp(start));
        set.setLastUpdate(design.time.createTimestamp(lastUpdate));
        set.getClock().setTimeStep(timeStep);
        //ElementNode.changedAll(set);
    }

    public void updateTimeStepRuleSetValue(TimeStepRuleSet set, long lastUpdate, long timeStep) {
        set.setLastUpdate(design.time.createTimestamp(lastUpdate));
        set.getClock().setTimeStep(timeStep);
        //ElementNode.changedAll(set);
    }
    
    long startTime=0, endTime=0, duration=0;
    
    public void startTimer() {
        startTime = System.currentTimeMillis();
    }
    
    public long endTimer() {
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        return duration;
    }
    
    static int threadId = 0;
    
    class MonitoringThread implements Runnable {
        
        RuleRuntimeModel model;
        private Thread thread;
        private boolean terminate = true;
        private volatile boolean running = false;
        int id = 0;
        
        public MonitoringThread(RuleRuntimeModel model) {
            this.model = model;
            synchronized (this) {
                threadId++;
                id = threadId;
            }
        }

        public void start() {
            if (!running) {
                running = true;
                terminate = false;
                thread = new Thread(this);
                thread.start();
            }
        }

        public void stop() {
            // TODO: check in the run for interrupt
            terminate = true;
        }

        public void restart() {
            // TODO:
        }
        
        
        @Override
        public void run() {
            logger.debug("Starting time step update thread (id="+id+")");

            while (true) {
                Timestamp now = design.time.createTimestamp();

                for (TimeStepRuleSet set : clockRuleSetMap.values()) {

                    DiscreteClock clock = set.getClock();
                    TimeDuration resolution = clock.getResolution();

                    if (clock.getStart() == null) {
                        // TODO: align/synchronize time steps considering their GCD
                        // (Greatest Common Divisor)?
                        // in this case the rules may eventually fire together at
                        // some point

                        logger.debug("Initializing clock " + resolution.getAmount() + " " + resolution.getUnit());
                        updateTimeStepRuleSet(set, now.getDate().getTime(), now.getDate().getTime(), 0);
                    }

                    Timestamp timestamp = set.getLastUpdate();
                    long diff = now.getDate().getTime() - timestamp.getDate().getTime();
                    long clockResolution = design.time.convertToSeconds(clock.getResolution()) * 1000;

                    logger.trace("Checking time step update time of set resolution=[" + clockResolution + "][" + diff + "]");

                    if (diff > clockResolution) { // || clock.getValue() == -1

                        logger.info("Time step update reached (id="+id+"), rule set resolution [" + clockResolution + "] rules ["+set.getRules().size()+"]");

                        // TODO: do we need to rollback tentative events that
                        // are blocked? I don't think so, need to check this.

                        // How much time to update all rules?
                        startTimer();
                        ruleCounter = 0;
                        firedRuleCounter = 0;
                        synchronized(this) {
                            for (RuleInstance rule : set.getRules()) {                        
                                timeStepUpdate(rule);                        
                            }
                        }
                        endTimer();
                        
                        if (set.getRulesToRemove().size() > 0) {
                            logger.debug("- Number of rules to remove [" + set.getRulesToRemove().size() + "] (id="+id+")");
                            for (RuleInstance rule : set.getRulesToRemove()) {
                                removeRuleInstance(model, set, rule);
                            }
                            set.getRulesToRemove().clear();
                        } else {
                            logger.debug("- No rules to remove (id="+id+")");
                        }

                        // Count patterns before deploying new rule configurations
                        int patternCounter = 0;
                        for (List<EventPatternState> patterns: eventPatternStateMap.values()) {
                            patternCounter += patterns.size();
                        }                    
                        
                        int size = set.getConfigurationsToInstantiate().size();
                        if (size > 0) {
                            logger.debug("- Deploying "+size+" rule configurations (id="+id+")");
                            // TODO: Must be synchronized to prevent concurrent access if rules are fired?
                            // synchronized(set.getConfigurationsToDeploy()) {
                                for (RuleTemplateConfiguration conf : set.getConfigurationsToInstantiate()) {
                                    createRuleInstance(model, conf);
                                }
                                set.getConfigurationsToInstantiate().clear();
                            // }
                            //
                        } else {
                            logger.debug("- No rules to deploy (id="+id+")");
                        }

                        // Increment clock time step
                        updateTimeStepRuleSetValue(set, now.getDate().getTime(), clock.getTimeStep() + 1);

                        // rules to update; hashmap size; update time
                        /*
                        System.out.print(
                             "Rules;"+ruleCounter + 
                          "   ;FiredRules;" + firedRuleCounter + 
                          "   ;Events;" + eventCounter + 
                          "   ;Patterns;" + eventPatternStateMap.size() + 
                          "   ;States;" + patternCounter +
                          "   ;Time;"+ (duration)+";   ");
                        eventCounter = 0;
                        */
                        
                        if (tester!=null) {
                            tester.timeStepStarted();
                        }
                    }

                }

                // synchronized (this) { }
                // TODO: check last update of clocks and update rule instances
                // The update of the clocks must not happen when new rules are
                // being loaded in
                // the rule engine

                try {
                    Thread.sleep(threadSleepTime);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                if (terminate) {
                    break;
                }
            }
            logger.info("Time step thread terminated (id="+id+")");

            for (TimeStepRuleSet set : clockRuleSetMap.values()) {
                updateTimeStepRuleSetStart(set);
            }

            running = false;
        }
        
    }
    
    // TODO: when a tentative event is notified and it is allowed,
    //       1 - we should generate a corresponding actual event?
    //       2 - or do we wait for the event provider to generate one more event?

    int eventCounter = 0;
    
    static boolean delivered = false;
    
    public Authorization notifyEvent(String provider, Event event) {
    
        // TODO: we don't have actual and tentative events disjoint.
        // A tentative event may fire a behavior instantiation and not an
        // enforcement behavior?
        
        // TODO: Usually there should be only one matching event pattern for the subscribed event
        // No! we can have many considering the parametrization options
    
        // TODO: Event patterns are fully static? Is there dynamic information that must be resolved and as a consequence
        // the pattern will not match the event?
    
        // TODO: An event received and no pattern found, maybe this is an DoS attack
    
        // TODO: Blacklist the event provider?
    
        //
        // TODO: A signaled tentative event may result in a null authorization behavior. What does this mean?
        // - Allow by default
        // - Block by default
        // - PEP decides whatever
    
        // Can we do somehow a model checking to make sure tentative events always have an answer, or when
        // a subscription is made a default return value is specified for all subscribed tentative events?
        
        // Everything ok, the pattern was found, do nothing
        // Entity: type, instantiation, instance
        // Container entity: <Entity>
        // Role
        // Identity
        //

        
        if (event instanceof ActionEvent) {
            ActionEvent e = (ActionEvent)event;
            return design.rule.template.addAllow(null);
        }
        
        if (event instanceof InteractionEvent) {
            InteractionEvent e = (InteractionEvent)event;

            AbstractIdentity id = null;
            for (AbstractIdentity aid : e.getInteraction().getIdentities()) {
                if (aid.getInstantiation().getName().equals("clientId")) {
                    id = aid;
                }
            }
            
            if (id != null) {

                if (e.getInteraction().getType().getName().equals("Subscribe to Topic") ||
                                e.getInteraction().getType().getName().equals("Publish Message to Topic")) {
                    if (id.getSubject().equals("deliverPublisherId")) {
                        delivered = true;
                    }
                    if (id.getSubject().equals("shipmentPublisherId")) {
                        delivered = false;
                    }                                        
                    return design.rule.template.addAllow(null);
                }
                
                if (id.getSubject().equals("publisherId") ||
                    id.getSubject().equals("subscriberOwnerId") ||
                    id.getSubject().equals("reportPublisherId") ||
                    id.getSubject().equals("subscriberResponsibleId") ||
                    id.getSubject().equals("jrcGatewayId")                    
                    ) {
                    return design.rule.template.addAllow(null);
                }
    
                if (id.getSubject().equals("deliverPublisherId")) {
                    return design.rule.template.addAllow(null);
                }
    
                if (id.getSubject().equals("reportSubscriberId") && delivered) {
                    return design.rule.template.addAllow(null);
                }
                
            }

            return design.rule.template.addDeny(null);
        }
        
        
        // ArrayList<RuleInstance> firedRules = new ArrayList<RuleInstance>();        
        eventCounter++;
        logger.debug("Event ["+eventCounter+"] received, subscribed patterns size =[" + event.getSubscribedEventPatterns().size() + "] event patterns map size=[" + eventPatternStateMap.size() + "]");
        for (EventPattern pattern : event.getSubscribedEventPatterns()) {
            List<EventPatternState> states = eventPatternStateMap.get(pattern.getId());

            logger.debug("  Found (" + states.size() + ") states to update id=[" + pattern.getId() + "]");
            synchronized(this) {
                for (EventPatternState state : states) {
                    EventPatternStateHandler handler = (EventPatternStateHandler)state.getHandler();
                    handler.matchEvent(event);
                }
            }
        }
        
        return design.rule.template.addAllow(null);
        // return factory.design.rule.addDeny(null);
            
    }

    public void addEventProvider(String name, EventProvider eventProvider) {
        logger.debug("Adding event provider [" + name + "], subscribe to all event patterns, size=["+ eventPatterns.size()+"]");
        eventProviders.add(eventProvider);
        for (EventPattern pattern : eventPatterns) {
            eventProvider.subscribeToEvent("RuleRuntimeController", pattern);
        }
    }

    public void subscribeToEvent(EventPattern pattern) {
        eventPatterns.add(pattern);
        logger.trace("  Adding event pattern to list, size=["+ eventPatterns.size()+"]");
        //
        logger.trace("  Subscribe to event with registered providers, size=["+ eventProviders.size()+"]");
        for (EventProvider eventProvider : eventProviders) {
            eventProvider.subscribeToEvent("RuleRuntimeController", pattern);
        }
    }
    
    public EntityEvent createEntityEvent(Entity entity, EntityLifecycle lifecycle, EventPattern pattern) {
        EntityEvent entityEvent = structure.event.EventFactory.eINSTANCE.createEntityEvent();
        ECoreUtils.setup(entityEvent);
        entityEvent.setLifecycle(lifecycle);
        entityEvent.getSubscribedEventPatterns().add(pattern);
        entityEvent.setEntity(entity);
        return entityEvent;
    }

    public ActionEvent createActionEvent(RuleRuntimeModel model, Action action, Entity entity, Behavior behaviorInst) {
        ActionEvent event = behavior.event.EventFactory.eINSTANCE.createActionEvent();
        ECoreUtils.setup(event);
        event.setTimestamp(design.time.createTimestamp());
        event.setEntity(entity);
        event.setBehavior(behaviorInst);
        event.setAction(action);
        return event;
    }
    
    public InteractionEvent createInteractionEvent(RuleRuntimeModel model, Interaction interaction, Entity entity, Behavior behaviorInst) {
        InteractionEvent event = behavior.event.EventFactory.eINSTANCE.createInteractionEvent();
        ECoreUtils.setup(event);
        event.setTimestamp(design.time.createTimestamp());
        if (entity != null) {
            event.setEntity(entity);
        }
        event.setBehavior(behaviorInst);
        event.setInteraction(interaction);
        model.getEventSet().getEvents().add(event);
        return event;
    }
    
    int  firedRuleCounter = 0;
    
    private void fireRule(RuleInstance rule) {

        // TODO: trigger behavior execution
        // What is the target platform? Behavior execution drivers? BPMN?

        firedRuleCounter++;

        RuleTemplate template = rule.getTemplate();
        RuleTemplateConfiguration configuration = rule.getConfiguration();
        TimeStepRuleSet set = configuration.getTimeStepSize().getRuleSet(); 
        
        logger.debug("+ Rule ["+rule.getId()+"]["+template.getName()+"] fired");
        
        for(RuleTemplateConfiguration conf : template.getConfigurations()) {            
            if (conf.getInstantiationStrategy() == InstantiationStrategy.WHEN_PARENT_TRIGGERED) {
                logger.debug("+ Instantiate ["+conf.getTemplate().getName()+"]");
                set.getConfigurationsToInstantiate().add(conf);
            }
        }
        
        Authorization auth = template.getAuthorize();
        if (auth instanceof Allow) {
            logger.debug("+ Allow result");
        } else if (auth instanceof Deny) {
            logger.debug("+ Deny result");
        }
        
        for (Execute execution : template.getExecute()) {
            logger.debug("+ Execution ["+execution+"] not yet implemented, ignoring");            
        }
        
        // DisposalRule disposalRule = (DisposalRule) abstractRule;
        // This type of rule has no configuration, it is configured by an
        // instantiation template configuration
        logger.error("+ Disposal rule fired, removal of rule not yet implemented");
        // TODO: implement disposal of rule!
        for (RuleInstance ruleToRemove : rule.getInstancesToDispose()) {
            logger.debug("+ Remove ["+ruleToRemove.getId()+"]["+ruleToRemove.getTemplate().getName()+"]");
            set.getRulesToRemove().add(ruleToRemove);
        }
        
        if (configuration.getDisposalStrategy() == DisposalStrategy.AFTER_TRIGGERED) {
            logger.debug("+ Remove fired rule");
            set.getRulesToRemove().add(rule);
        }

    }
    
    private void evaluate(RuleInstance rule) {
        if (rule.getTriggerEventState().getValue() == TruthValue.TRUE && 
            rule.getConditionState().getValue() == TruthValue.TRUE) {
            //
            rule.setValue(TruthValue.TRUE);
        } else {
            rule.setValue(TruthValue.FALSE);
        }
        logger.debug("  Rule ["+rule.getId()+"] evaluated to ["+rule.getValue().getLiteral()+"]");
    }
    
    private void evaluate(State state) {
        StateHandler handler = state.getHandler();
        if (handler != null) {
            state.getHandler().evaluate();
            logger.trace("  Evaluating state for atom ["+state.getAtom().getClass().getSimpleName()+"]["+state.getValue().getLiteral()+"]");
            return;
        }
        logger.warn("State handler for atom ["+state.getAtom().getClass().getSimpleName()+"] not implemented, aborting update");
    }
    
    private void evaluateBottomUp(State state) {
        // Evaluate state
        evaluate(state);
        // Evaluate parent recursively
        State pState = state.getParent();
        if (pState != null) {
            evaluateBottomUp(pState);
        } else {
            // State that has no parent is the trigger or the condition
            evaluate(state.getRuleInstance());
        }
    }
    
    private void evaluateTopDown(State state) {
        // Evaluate child recursively
        for (State cState : state.getChildren()) {
            evaluateTopDown(cState);
        }
        // Evaluate state
        evaluate(state);
    }

    public void timeStepUpdate(State state) {
        // Top down only update
        // Update child recursively
        for (State cState : state.getChildren()) {
          timeStepUpdate(cState);   
        }
        // Update state
        StateHandler handler = state.getHandler();
        if (handler != null) {
            state.getHandler().timeStepUpdate();
            logger.trace("  Time step update for atom ["+state.getAtom().getClass().getSimpleName()+"]["+state.getValue().getLiteral()+"]");
            return;
        }
        logger.warn("State handler for atom ["+state.getAtom().getClass().getSimpleName()+"] not implemented, aborting time step update");
    }
    
    
    int ruleCounter = 0;
    
    public void timeStepUpdate(RuleInstance rule) {
       
        /* TODO: check for rule type?
        AbstractRuleTemplateConfiguration ruleConf = rule.getConfiguration();
        AbstractRuleTemplate template = null;
        if (ruleConf instanceof RuleTemplateConfiguration) {
            RuleTemplateConfiguration templateConf = (RuleTemplateConfiguration) ruleConf;
            template = templateConf.getTemplate();

        } else if (ruleConf instanceof RuleInstantiationConfiguration) {
            RuleInstantiationConfiguration instConf = (RuleInstantiationConfiguration) ruleConf;
            template = instConf.getTemplate();

        } else if (ruleConf instanceof RuleDisposalConfiguration) {
            RuleDisposalConfiguration disposalConf = (RuleDisposalConfiguration) ruleConf;
            template = disposalConf.getTemplate();
        } else {
            // TODO: not supported configuration
            // type, should never happen!
            warn = " - Rule instance from unsupported configuration [" + ruleConf.getClass().getSimpleName() + "]";
        }
        */
        
        logger.debug("+ Time step update rule id=[" + rule.getId() + "] template=[" + rule.getTemplate().getName() + "]");
        ruleCounter++;
        if (rule.getValue() == TruthValue.TRUE) {
            // Fire rule at the end of the time step            
            fireRule(rule);
            // TODO: for enforcement rules we need to check parent value,
            //       all parent rules must also have a true value!
        }
        //        
        timeStepUpdate(rule.getTriggerEventState());
        timeStepUpdate(rule.getConditionState());
        //
        evaluateTopDown(rule.getConditionState());
        //
        evaluate(rule);
        //
        for (RuleInstance cRule : rule.getContainedInstances()) {
            // Recursively update rule
            timeStepUpdate(cRule);
        }
    }
    
    public TimeStepRuleSet createTimeStepRuleSet(RuleRuntimeModel model, TimeStepSize timeStepSize) {
        DiscreteClock clock = design.time.createClock(timeStepSize.getTimeDuration());
        TimeStepRuleSet set = TemplateFactory.eINSTANCE.createTimeStepRuleSet();
        ECoreUtils.setup(set);
        set.setClock(clock);
        model.getRuleSets().add(set);
        // res = time stepSize!
        TimeDuration resolution = clock.getResolution();
        if (resolution != null) {
            logger.debug("Creating time step rule set, resolution = " + resolution.getAmount() + " " + resolution.getUnit());
        } else {
            logger.warn("Time step rule set resolution not specified, aborting");
            return null;
        }
        long amount = design.time.convertToSeconds(timeStepSize.getTimeDuration());
        clockRuleSetMap.put(amount, set);
        // TODO: Duplicate resolutions
        // logger.trace("   Clock with same resolution already configured, ignoring new clock");        
        timeStepSize.setRuleSet(set);
        return set;
    }    
    
    public void loadPackages(RuleRuntimeModel model, EList<RuleTemplatePackage> pkgs) {
        for (RuleTemplatePackage pkg : pkgs) {
            logger.debug("Loading rule package ["+pkg.getName()+"]");
            // Configure rules and create rule instances
            for (RuleTemplateConfiguration conf : pkg.getConfigurations()) {
                logger.debug("+ Rule configuration [" + conf.getName()+"]");
                validate(conf);
                createRuleInstance(model, conf);
            }
            loadPackages(model, pkg.getSubPackages());
        }
    }
    
    public void validate(RuleTemplateConfiguration conf) {
        ECoreUtils.validateId(conf);
        if (conf.getName() == null || conf.getName().equals("")) {
            logger.warn("   No <name> set for configuration, this is bad practice!");
            logger.warn("   Setting name to id value [" + conf.getId() + "]");
            conf.setName("Rule configuration " + conf.getId());
        }
    }

    public RuleInstance createRuleInstance(RuleRuntimeModel model, RuleTemplateConfiguration configuration) {
        
        RuleTemplate template = configuration.getTemplate();
        
        logger.trace("+ Creating instance of rule ["+template.getName()+"]");

        // Create rule
        RuleInstance rule = TemplateFactory.eINSTANCE.createRuleInstance();
        ECoreUtils.setup(rule);
        model.getRules().add(rule);
        rule.setTemplate(template);
        rule.setConfiguration(configuration);
        //
        
        // Create states
        if (!createStates(rule)) {
            // TODO: clean up, is this enough?
            EcoreUtil.delete(rule);
            return null;
        }

        // TODO: Setup disposal configuration
        /*
        if (ruleConf instanceof DisposableRuleTemplateConfiguration) {
            DisposableRuleTemplateConfiguration dispTemplateConf = (DisposableRuleTemplateConfiguration) ruleConf;
            RuleDisposalConfiguration dispConf = dispTemplateConf.getDisposalConfiguration();
            if (dispConf != null) {
                // TODO: create a rule instance from disp template that when
                // triggered
                // removes the rule instantiated here, flexible disposable of
                // rules

                // TODO: check type??
                // RuleDisposalTemplate dispTemplate = (RuleDisposalTemplate) dispConf.getTemplate();
            }
        }
        */

        TimeStepRuleSet set = configuration.getTimeStepSize().getRuleSet();
        set.getRules().add(rule);
        
        // Create child rules
        for (RuleTemplateConfiguration cConf : template.getContainedConfigurations()) {
            if (cConf.getInstantiationStrategy() == InstantiationStrategy.WHEN_PARENT_INSTANTIATED) {
                RuleInstance cRule = createRuleInstance(model, cConf);
                rule.getContainedInstances().add(cRule);
            }
        }
        //

        // Reload after adding the children rules
        // TODO: reload really all children?
        //ElementNode.reloadAll(set);
        
        return rule;
    }

    // TODO: if states are created and something goes wrong (e.g. rule is removed)
    // we need a cleanup procedure
    // private void cleanUpState(State state) {}

    public void removeRuleInstance(RuleRuntimeModel model, TimeStepRuleSet set, RuleInstance rule) {
        set.getRules().remove(rule);
        model.getRules().remove(rule);
        EcoreUtil.delete(rule);
        // TODO: cleanup states??
        //ElementNode.reloadAll(set);
    }
    
    private boolean createStates(RuleInstance rule) {
        
        EventPatternStateHandler eState = (EventPatternStateHandler) createStateHandler(rule, rule.getTemplate().getEvent());
        StateHandler cState = createStateHandler(rule, rule.getTemplate().getCondition());
        
        if (eState == null || cState == null) {
            // TODO: clean up? event or condition state?
            if (eState == null) {
                logger.warn("  Event state is null");
            } else {
                EcoreUtil.delete(eState.state);
            }
            if (cState == null) {
                logger.warn("  Condition state is null");
            } else {
                EcoreUtil.delete(cState.state);
            }
            logger.warn("  Ignoring rule configuration!");
            return false;
        }
        
        rule.setTriggerEventState(eState.eState);
        rule.setConditionState(cState.state);
        // TODO: init already evaluates? check this.
        // evaluateTopDown(cState.state);
        evaluate(rule);

        // TODO: What are the consistency checks necessary?
        // - Check when rule is instantiated if the trigger event
        //   is indeed a tentative event, this is mandatory!
        // TODO: do we need to create rule instances of different types?

        // TODO: how to notify rule engine to deploy rule in the next update time?
        // long clockResolution = refClock.getResolutionInMiliseconds();
        // ArrayList<AbstractRuleInstance> rules = clockRuleToDeployMap.get(clockResolution);
        // rules.add(rule);
        // clockRuleToDeployMap.put(clockResolution, rules);
        // logger.trace(" - Added new rule to deploy list, size=" + rules.size());
        
        return true;
    }
    
    private StateHandler createStateHandler(RuleInstance rule, Atom atom) {
        
        if (atom == null) {
            logger.warn("- Trying to create state for null atom, ignoring");
            return null;
        }
        logger.trace("- Creating state for atom [" + atom.getClass().getSimpleName() + "]");

        if (atom.getId() == null || atom.getId().equals("")) {
            ECoreUtils.setup(atom);
            logger.debug("  Atom has empty <id>, generating new id=[" + atom.getId() + "]");
        }
        
        StateHandler handler = null;
         
        if (atom instanceof EventPattern) {
            
            EventPatternStateHandler eHandler = null;
            
            if (atom instanceof TimeStepEventPattern) {
                eHandler = new TimeStepEventPatternStateHandler(rule, atom);
            
            } else if (atom instanceof ActivityEventPattern) {
                eHandler = new ActivityEventPatternStateHandler(rule, atom);
            
            } else if (atom instanceof EntityEventPattern) {
                eHandler = new EntityEventPatternStateHandler(rule, atom);
            
            } else if (atom instanceof BehaviorEventPattern) {
                eHandler = new BehaviorEventPatternStateHandler(rule, atom);
            
            } else if (atom instanceof ContextSituationEventPattern) {
                eHandler = new ContextSituationEventPatternStateHandler(rule, atom);
            }
            
            if (eHandler != null) {           
                handler = eHandler;
                String id = atom.getId();            
                List<EventPatternState> states = eventPatternStateMap.get(id);
                if (states == null) {
                    states = new ArrayList<EventPatternState>();
                    eventPatternStateMap.put(id, states);
                }
                states.add(eHandler.eState);
                subscribeToEvent(eHandler.pattern);            
                logger.trace("  Adding event pattern state to map/list id=["+id+"] size=["+states.size()+"]");
            }
            

            //
            // TODO: subscription should be done when rule is deployed, and not when rule is created!?
            // Only subscribe to new patterns
            
            // Keep all states associated to the event pattern in a list
            // We need to check this states when the event with the specific id arrives
            
            // TODO: we need additional indexes here depending on the event pattern structure,
            // for all possible parametrized combination of options we need a hashmap
            // event patter has user id, we need a user id hashmap, etc.

            // TODO: CHECK THIS!
            // An event pattern may have many state instances associated to it
            // Each state instance is a possible match to the pattern, but not necessarily
            // since an event pattern may define variables with unknown values? Is it so?
            //
            

        } else {
            
            if (atom instanceof Constant) {
                handler = new ConstantStateHandler(rule, atom);
                
            } else if (atom instanceof Not) {
                handler = new NotStateHandler(rule, atom);
                
            } else if (atom instanceof And) {
                handler = new AndStateHandler(rule, atom);
                
            } else if (atom instanceof Or) {
                handler = new OrStateHandler(rule, atom);
                
            } else if (atom instanceof Implies) {
                handler = new ImpliesStateHandler(rule, atom);
                
            } else if (atom instanceof Always) {
                handler = new AlwaysStateHandler(rule, atom);
                
            } else if (atom instanceof Eventually) {
                handler = new EventuallyStateHandler(rule, atom);
                
            } else if (atom instanceof Before) {
                handler = new BeforeStateHandler(rule, atom);
                
            } else if (atom instanceof Within) {
                handler = new WithinStateHandler(rule, atom);
                
            } else if (atom instanceof During) {
                handler = new DuringStateHandler(rule, atom);
                
            } else if (atom instanceof Since) {
                handler = new SinceStateHandler(rule, atom);
                
            } else if (atom instanceof RepeatSince) {
                handler = new RepeatSinceStateHandler(rule, atom);
                
            } else if (atom instanceof RepeatMaximum) {
                handler = new RepeatMaximumStateHandler(rule, atom);
                
            } else if (atom instanceof RepeatLimit) {
                handler = new RepeatLimitStateHandler(rule, atom);
            }
        } 
      
        // Create default state, no custom implementation available
        // TODO: Plug-in for this? Custom state implementation provided outside?
        if (handler == null) {
            logger.warn("- Custom handler for atom [" + atom.getClass().getSimpleName() + "] not implemented, using default");
            handler = new AtomStateHandler(rule, atom);
        }
        
        // Create child states
        if (atom instanceof Operator) {
            Operator formula = (Operator) atom;
            for (Atom cAtom : formula.getOperands()) {
                StateHandler cHandler = createStateHandler(rule, cAtom);
                if (cHandler.state != null) {
                    handler.state.getChildren().add(cHandler.state);
                }
            }
        }
        
        handler.init();        
        return handler;
    }
    

    public boolean isTrue(TruthValue value) {
        if (value == TruthValue.TRUE) {
            return true;
        }
        return false;
    }
    
    public boolean isTrue(State state) {
        if (state.getValue() == TruthValue.TRUE) {
            return true;
        }
        return false;
    }
    
    public void setTrue(State state) {
        state.setValue(TruthValue.TRUE);
    }

    public void setTrueForever(State state) {
        state.setValue(TruthValue.TRUE);
        state.setImmutable(true);
    }
    
    public boolean isFalse(TruthValue value) {
        if (value == TruthValue.FALSE) {
            return true;
        }
        return false;
    }
    
    public boolean isFalse(State state) {
        if (state.getValue() == TruthValue.FALSE) {
            return true;
        }
        return false;
    }
    
    public void setFalse(State state) {
        state.setValue(TruthValue.FALSE);
    }

    public void setFalseForever(State state) {
        state.setValue(TruthValue.FALSE);
        state.setImmutable(true);
    }
    
    // TODO: handle undetermined?
    // TODO: handle combining algorithm
    // TODO: children of immutable states do not need to be monitored anymore,
    //       including event subscriptions, etc.
    
    /*
     * XPath!
     * 
     * ECoreUtils.registerPackage(TimePackage.eINSTANCE); try { EObject obj =
     * ECoreUtils.xmlFileToEObject("metamodel/time.xmi");
     * ECoreUtils.objectToXml(obj, System.out);
     * 
     * XPathContextFactory<EObject> f = EcoreXPathContextFactory.newInstance();
     * XPathContext xPathContext = f.newContext(obj);
     * 
     * Iterator<Object> it =
     * xPathContext.iterate("//timestamps/referenceClock[name='test2']"); while(
     * it.hasNext() ) { logger.trace(it.next()); }
     * 
     * 
     * } catch (IOException e) { // TODO Auto-generated catch block
     * e.printStackTrace(); }
     */    
    
    abstract class EventPatternStateHandler extends StateHandler {
        
        EventPattern pattern;
        EventPatternState eState;
        
        public EventPatternStateHandler(RuleInstance rule, Atom atom) {
            logger.trace("  Creating event pattern state handler");
            pattern = (EventPattern) atom;
            eState = StateFactory.eINSTANCE.createEventPatternState();
            ECoreUtils.setup(eState);
            eState.setEventPattern(pattern);
            eState.setAtom(atom);
            eState.setHandler(this);
            rule.getStates().add(eState);
            state = eState;
        }
        
        public void matchEvent(Event event) {
            // if (state.getValue() == TruthValue.TRUE)
            //            
            state.setValue(TruthValue.TRUE);
            if (state.getParent() == null) {
                RuleRuntimeController.this.evaluate(state.getRuleInstance());
            } else {
                evaluateBottomUp(state.getParent());
            }
        }
        
    };

    class TimeStepEventPatternStateHandler extends EventPatternStateHandler {        
        public TimeStepEventPatternStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }        
        public void init() {
            // Immutable from the start
            setTrueForever(state);
        }
        public void timeStepUpdate() {}
        public void evaluate() {}
    };

    class ActivityEventPatternStateHandler extends EventPatternStateHandler {
        public ActivityEventPatternStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {
            setFalse(state);
        }
        public void evaluate() {}
    };

    class EntityEventPatternStateHandler extends EventPatternStateHandler {
        public EntityEventPatternStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {
            setFalse(state);
        }
        public void evaluate() {}
    };

    class BehaviorEventPatternStateHandler extends EventPatternStateHandler {
        public BehaviorEventPatternStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {
            state.setValue(TruthValue.FALSE);
        }
        public void evaluate() {}
    };

    class ContextSituationEventPatternStateHandler extends EventPatternStateHandler {
        public ContextSituationEventPatternStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {
            state.setValue(TruthValue.FALSE);
        }
        public void evaluate() {}
    };

    abstract class DefaultStateHandler extends StateHandler {
        public DefaultStateHandler(RuleInstance rule, Atom atom) {
            logger.trace("  Creating default state handler");
            state = StateFactory.eINSTANCE.createState();
            ECoreUtils.setup(state);
            state.setAtom(atom);
            rule.getStates().add(state);
            // TODO: Can we set it FALSE by default?
            state.setValue(TruthValue.FALSE);
            state.setPreviousValue(TruthValue.UNDETERMINED);
            state.setHandler(this);
        }
    }

    class AtomStateHandler extends DefaultStateHandler {
        public AtomStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {}
        public void evaluate() {}
    };
    
    class ConstantStateHandler extends DefaultStateHandler {
        Constant constant;
        public ConstantStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
            constant = (Constant)atom;
        }
        public void init() {
            // One value from beginning and forever
            state.setValue(constant.getValue());
            state.setImmutable(true);
        }
        // Nothing to update
        public void timeStepUpdate() {}
        public void evaluate() {}
    };

    class NotStateHandler extends DefaultStateHandler {
        public NotStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {}
        public void evaluate() {
            if (state.getChildren().get(0).getValue() == TruthValue.FALSE) {
                state.setValue(TruthValue.TRUE);
            }
        }
    };

    class AndStateHandler extends DefaultStateHandler {
        public AndStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {}
        public void evaluate() {
            // Set value to TRUE
            state.setValue(TruthValue.TRUE);
            for (State s : state.getChildren()) {
                if (s.getValue() != TruthValue.TRUE) {
                    // If at least one is FALSE, set it to FALSE
                    state.setValue(TruthValue.FALSE);
                    break;
                }
            }
        }
    };

    class OrStateHandler extends DefaultStateHandler {
        public OrStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {}
        public void evaluate() {
            // Set value to FALSE
            state.setValue(TruthValue.FALSE);
            for (State s : state.getChildren()) {
                // If at least one children is TRUE, set it to TRUE
                if (s.getValue() == TruthValue.TRUE) {
                    state.setValue(TruthValue.TRUE);
                    break;
                }
            }
        }
    };

    class ImpliesStateHandler extends DefaultStateHandler {
        public ImpliesStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void timeStepUpdate() {}
        public void evaluate() {
            if (state.getChildren().get(0).getValue() == TruthValue.TRUE && state.getChildren().get(1).getValue() != TruthValue.TRUE) {
                // If child0 is true, and child1 is not true, then it is false
                state.setValue(TruthValue.FALSE);
            } else {
                state.setValue(TruthValue.TRUE);
            }
        }
    };
    
    class AlwaysStateHandler extends DefaultStateHandler {
        public AlwaysStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {
            // state.setPreviousValue(TruthValue.UNDETERMINED);
            state.setPreviousValue(TruthValue.UNDETERMINED);
            state.setValue(TruthValue.UNDETERMINED);
        }
        public void evaluate() {
            if (state.isImmutable())
                return;
            if (isTrue(state.getPreviousValue()) &&
                isTrue(state.getChildren().get(0))) {
                setTrue(state);
            }            
        }
        public void timeStepUpdate() {
            if (isFalse(state.getChildren().get(0))) {
                // If child0 is false, it is false forever
                setFalseForever(state);
            }
            // state.setPreviousValue(state.getValue());
        }
    };

    class EventuallyStateHandler extends DefaultStateHandler {
        public EventuallyStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {
            state.setValue(TruthValue.FALSE);
        }
        public void evaluate() {
            state.setValue(state.getChildren().get(0).getValue());
        }
        public void timeStepUpdate() {
            if (state.getChildren().get(0).getValue() == TruthValue.TRUE) {
                // If child0 is true, it is true forever!
                state.setValue(TruthValue.TRUE);
                state.setImmutable(true);
            }
        }
    };


    // TODO: TimeBoundedStateHandler hierarchy?
    
    class BeforeStateHandler extends DefaultStateHandler {
        public BeforeStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {}
        public void evaluate() {}
        public void timeStepUpdate() {
            /*
            TimeBoundedState tbState = (TimeBoundedState)state;
            CircularBuffer buffer = tbState.getPreviousValues();
            BitSet b = new BitSet(10);           
           
            buffer.getOldest();
            int p = (int)tbState.getPosition();
            if (tbState.getPreviousValues().get(p) == TruthValue.TRUE) {
                state.setValue(TruthValue.TRUE);
            } else {
                state.setValue(TruthValue.FALSE);
            }
            */
        }
    };
    
    class WithinStateHandler extends DefaultStateHandler {
        public WithinStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }
        public void init() {
            state.setValue(TruthValue.FALSE);
            /*
            //TODO: implement this right!
            Within within = (Within) atom;
            RepState repState = StateFactory.eINSTANCE.createRepState();
            CounterState counterState = StateFactory.eINSTANCE.createCounterState();
            counterState.setTrue(0);
            // It was always undetermined
            counterState.setUndetermined(within.getTimeBoundInTimeSteps());
            repState.setCounterState(counterState);
            repState.setValue(TruthValue.UNDETERMINED);
            state = (State) repState;
            */
        }
        public void evaluate() {
            if (state.getChildren().get(0).getValue() == TruthValue.TRUE) {
                state.setValue(TruthValue.TRUE);
            }
        }
        public void timeStepUpdate() {
            evaluate();
            // TimeBoundedState tbState = (TimeBoundedState)state;
            // Just counters
            // tbState.getCountTrue();           
        }
    };

    class DuringStateHandler extends DefaultStateHandler {
        public DuringStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }

        public void init() {
        }

        public void evaluate() {
        }

        public void timeStepUpdate() {
        }
    };

    class SinceStateHandler extends DefaultStateHandler {
        public SinceStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }

        public void init() {
        }

        public void evaluate() {
        }

        public void timeStepUpdate() {
            // TODO: A Since B: since B always A or !Eventually B
        }
    };

    class RepeatSinceStateHandler extends DefaultStateHandler {
        public RepeatSinceStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }

        public void init() {
        }

        public void evaluate() {
        }

        public void timeStepUpdate() {
            // RepeatSince A N B, if A reset counter
        }
    };

    class RepeatMaximumStateHandler extends DefaultStateHandler {
        public RepeatMaximumStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }

        public void init() {
        }

        public void evaluate() {
        }

        public void timeStepUpdate() {
            // Just count
            RepState rState = (RepState)state;
            CounterState counter = rState.getCounterState();
            counter.setTrue(0);
        }
    };

    class RepeatLimitStateHandler extends DefaultStateHandler {
        public RepeatLimitStateHandler(RuleInstance rule, Atom atom) {
            super(rule, atom);
        }

        public void init() {
        }

        public void evaluate() {
        }

        public void timeStepUpdate() {
            // Counter with lower and upper bound
        }
    };

    // class xStateHandler extends StateHandler { public xStateHandler(State state) { super(state); } public void init() {} public void reset() {} public void update() {}};




}
