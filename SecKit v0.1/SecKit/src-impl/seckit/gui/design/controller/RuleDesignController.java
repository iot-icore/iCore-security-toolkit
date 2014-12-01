package seckit.gui.design.controller;

import identity.IdentityInstanceVariable;
import identity.pattern.IdentityPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import models.variable.ReferenceVariableAssignment;
import models.variable.RegExpVariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.VariableFactory;
import context.event.ContextSituationEventPattern;
import context.pattern.ContextSituationPattern;
import context.type.EntityRoleType;
import data.action.ModifyData;
import data.instantiation.DataInstantiation;
import behavior.action.BehaviorExecution;
import behavior.condition.EvaluateAction;
import behavior.event.ActivityEventPattern;
import behavior.event.BehaviorEventPattern;
import behavior.event.BehaviorLifecycle;
import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.BehaviorInstantiation;
import behavior.type.ActionType;
import seckit.demo.ContextDesign;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import rule.RuleDesignModel;
import rule.RuleFactory;
import rule.action.Allow;
import rule.action.Authorization;
import rule.action.Delay;
import rule.action.Deny;
import rule.action.Modify;
import rule.condition.Atom;
import rule.condition.ConditionFactory;
import rule.condition.Constant;
import rule.condition.EventPattern;
import rule.condition.FormulaTemplate;
import rule.condition.Operator;
import rule.condition.TimeStepEventPattern;
import rule.condition.TruthValue;
import trust.action.AddBeliefEvidence;
import trust.action.AddDisbeliefEvidence;
import rule.event.EventFactory;
import rule.event.EventModality;
import rule.event.EventSubscription;
import behavior.pattern.ActivityPattern;
import behavior.pattern.BehaviorPattern;
import structure.event.EntityEventPattern;
import structure.event.EntityLifecycle;
import structure.pattern.EntityPattern;
import rule.propositional.And;
import rule.propositional.Implies;
import rule.propositional.Not;
import rule.propositional.Or;
import rule.propositional.PropositionalFactory;
import rule.template.InstantiationStrategy;
import rule.template.RuleTemplate;
import rule.template.CombiningAlgorithm;
import rule.template.DisposalStrategy;
import rule.template.RuleTemplateConfiguration;
import rule.template.Template;
import rule.template.TemplateFactory;
import rule.template.RuleTemplatePackage;
import rule.template.RuleXPathVariableAssignment;
import rule.template.TimeStepSize;
import rule.template.TimeStepVariable;
import rule.template.XPathContext;
import rule.temporal.Always;
import rule.temporal.Before;
import rule.temporal.During;
import rule.temporal.Eventually;
import rule.temporal.Since;
import rule.temporal.TemporalFactory;
import rule.temporal.Within;
import time.TimeUnit;
import utils.ecore.ECoreUtils;

public class RuleDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(RuleDesignController.class);
    
    public ModelController model;    
    public RuleTemplatePackageController pkg;
    public TimeStepSizeController timeStep;
    public FormulaTemplateController formula;
    public RuleTemplateController template;
    public RuleTemplateConfigurationController conf;
    public CombiningAlgorithmController alg;
    public VariableController var;
    public EventPatternController event;
    public ConstantController constant;
    public OperatorController op;
    public EvaluateActionController eval;
    
    public List<EventSubscription> eventSubscriptions = new ArrayList<EventSubscription>();
    
    public RuleDesignController(DesignViewpointFactory design) {
        super("Rule", design);
        //
        model = new ModelController();
        pkg = new RuleTemplatePackageController();
        timeStep = new TimeStepSizeController();
        formula = new FormulaTemplateController();
        template = new RuleTemplateController();
        conf = new RuleTemplateConfigurationController();
        alg = new CombiningAlgorithmController();
        var = new VariableController();
        event = new EventPatternController();
        constant = new ConstantController();
        op = new OperatorController();
        eval = new EvaluateActionController();
        
    }

    public class ModelController extends ElementController {

        public RuleDesignModel create(String desc) {
            RuleDesignModel model = RuleFactory.eINSTANCE.createRuleDesignModel();
            ECoreUtils.setup(model);
            if (desc == null) {
              desc = "Rule model " + model.getId();   
            }            
            model.setDescription(desc);
            design.viewpoint.getRuleDesignModels().add(model);
            return model;
        }
        
    }
    
    public class TimeStepSizeController extends ElementController {
        
        public TimeStepSize create(RuleDesignModel model, long clockMili) {
            //
            TimeStepSize timeStepSize = TemplateFactory.eINSTANCE.createTimeStepSize();
            ECoreUtils.setup(timeStepSize);
            timeStepSize.setTimeDuration(design.time.createTimeDuration(clockMili, TimeUnit.MILLISECOND));
            model.getTimeStepSizes().add(timeStepSize);
            return timeStepSize;
        }
        
        public TimeStepVariable createVariable(RuleTemplate template, String name) {
            TimeStepVariable variable = TemplateFactory.eINSTANCE.createTimeStepVariable();
            ECoreUtils.setup(variable);
            variable.setName(name);
            if (template != null) {
                template.getVariableDeclarations().add(variable);
            }
            return variable;
        }
        
    }
    
    public class RuleTemplatePackageController extends ElementController {
        
        public RuleTemplatePackage create(RuleDesignModel model, String name) {
            RuleTemplatePackage pkg = TemplateFactory.eINSTANCE.createRuleTemplatePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            model.getPackages().add(pkg);
            return pkg;
        }

        public void update(RuleTemplatePackage pkg, String newName) {
            pkg.setName(newName);
        }

        public boolean delete(RuleTemplatePackage pkg) {
            if (pkg.getSubPackages().size() > 0 || pkg.getConfigurations().size() > 0 || pkg.getTemplates().size() > 0) {
                return false;
            }
            return true;
        }
    }
    
    public class FormulaTemplateController extends ElementController {
        
        public FormulaTemplate create(RuleTemplatePackage pkg, String name) {
            FormulaTemplate template = ConditionFactory.eINSTANCE.createFormulaTemplate();
            ECoreUtils.setup(template);
            if (name == null) {
                name = "Template " + template.getId();
            }
            template.setName(name);
            pkg.getFormulaTemplates().add(template);
            return template;
        }
        
        public boolean delete(FormulaTemplate template) {
            EcoreUtil.delete(template);
            return true;            
        }
        
    }
    
    
    public class RuleTemplateController extends ElementController {

        Map<String, RuleTemplate> templatesMap;
        
        public RuleTemplateController() {
            resetMap();
        }

        public void resetMap() {
            templatesMap = new HashMap<String, RuleTemplate>();
        }
        
        public void load() {
            // TODO: ignore sub-packages for now, implement correct loading
            for (RuleDesignModel model : design.viewpoint.getRuleDesignModels()) {
                for (RuleTemplatePackage pkg : model.getPackages()) {
                    for (RuleTemplate template : pkg.getTemplates()) {
                        templatesMap.put(template.getName(), template);
                    }
                }
            }
        }
        
        public RuleTemplate create(RuleTemplatePackage pkg, String name) {
            return create(pkg, null, name);
        }
        
        public RuleTemplate create(RuleTemplatePackage pkg, CombiningAlgorithm combiningAlg, String name) {
            
            if (pkg == null) {
                logger.warn("Package for rule template can not be null, aborting");
                return null;
            }
            
            RuleDesignModel model = null;
            if (pkg != null) {
                model = pkg.getModel();                
            }
            
            RuleTemplate template = TemplateFactory.eINSTANCE.createRuleTemplate();
            
            ECoreUtils.setup(template);
            if (name == null) {
                name = "Enforcement template " + template.getId();
            }
            template.setName(name);
            if (combiningAlg == null) {
                combiningAlg = alg.createAllowOverrides();
            }
            template.setCombiningAlgorithm(combiningAlg);
            
            pkg.getTemplates().add(template);
            
            templatesMap.put(name, template);
            return template;
        }
        
        public AddBeliefEvidence addBeliefEvidence(RuleTemplate template, long amount) {
            AddBeliefEvidence add = trust.action.ActionFactory.eINSTANCE.createAddBeliefEvidence();
            ECoreUtils.setup(add);
            add.setAmount(amount);
            template.getExecute().add(add);
            return add;
        }
    
        public AddDisbeliefEvidence addDisbeliefEvidence(RuleTemplate template, long amount) {
            AddDisbeliefEvidence add = trust.action.ActionFactory.eINSTANCE.createAddDisbeliefEvidence();
            ECoreUtils.setup(add);
            add.setAmount(amount);
            template.getExecute().add(add);
            return add;
        }
        
        public BehaviorExecution addExecution(RuleTemplate template, BehaviorInstantiation inst) {
            BehaviorExecution extend = behavior.action.ActionFactory.eINSTANCE.createBehaviorExecution();
            ECoreUtils.setup(extend);
            extend.setBehaviorInstantiation(inst);
            template.getExecute().add(extend);
            return extend;
        }
        
        public void setupAuthorization(Authorization auth, RuleTemplate template) {
            ECoreUtils.setup(auth);
            if (template != null) {
                template.setAuthorize(auth);
            }
        }
    
        public Allow addAllow(RuleTemplate template) {
            Allow allow = rule.action.ActionFactory.eINSTANCE.createAllow();
            setupAuthorization(allow, template);
            return allow;
        }
    
        public Deny addDeny(RuleTemplate template) {
            Deny deny = rule.action.ActionFactory.eINSTANCE.createDeny();
            setupAuthorization(deny, template);
            return deny;
        }
    
        public boolean delete(Authorization auth) {
            if (auth.getConstraints().size() > 0) {
                return false;
            }
            RuleTemplate template = auth.getTemplate();
            template.setAuthorize(null);
            EcoreUtil.delete(auth);
            return true;
        }

        public Modify addModify(Authorization auth, DataInstantiation target, String newValue) {
            ModifyData modify = data.action.ActionFactory.eINSTANCE.createModifyData();
            ECoreUtils.setup(modify);
            modify.setNewValue(newValue);
            //
            modify.setTarget(design.data.createDataInstantiationHierarchy(target));
            //
            auth.getConstraints().add(modify);
            return modify;
        }

        public Delay addDelay(Authorization auth) {
            // TODO: add time amount, remember to clone time amount it because
            // instances can't be re-used!
            Delay delay = rule.action.ActionFactory.eINSTANCE.createDelay();
            ECoreUtils.setup(delay);
            return delay;
        }        
        
    }

    public class RuleTemplateConfigurationController extends ElementController {

        public RuleTemplateConfiguration create(RuleTemplatePackage pkg, RuleTemplate template, TimeStepSize timeStepSize) {
            return create(pkg, null, template, null, timeStepSize, InstantiationStrategy.NOT_APPLICABLE,  DisposalStrategy.NEVER);
        }
        
        public RuleTemplateConfiguration create(RuleTemplatePackage pkg, RuleTemplate template, String name, TimeStepSize timeStepSize) {
            return create(pkg, null, template, name, timeStepSize, InstantiationStrategy.NOT_APPLICABLE,  DisposalStrategy.NEVER);
        }

        public RuleTemplateConfiguration create(RuleTemplate parentRule, RuleTemplate template) {
            return create(null, parentRule, template, null, null, InstantiationStrategy.WHEN_PARENT_INSTANTIATED, DisposalStrategy.WITH_PARENT);
        }
        
        public RuleTemplateConfiguration create(RuleTemplate parentRule, RuleTemplate template, InstantiationStrategy instStrategy,  DisposalStrategy dispStrategy) {
            return create(null, parentRule, template, null, null, instStrategy,  dispStrategy);
        }
        
        public RuleTemplateConfiguration create(RuleTemplate parentRule, RuleTemplate template, String name, TimeStepSize timeStepSize, InstantiationStrategy instStrategy,  DisposalStrategy dispStrategy) {
            return create(null, parentRule, template, name, timeStepSize, instStrategy,  dispStrategy);
        }
        
        public RuleTemplateConfiguration create(RuleTemplatePackage pkg, RuleTemplate parentRule, RuleTemplate template, String name, TimeStepSize timeStepSize, InstantiationStrategy instStrategy,  DisposalStrategy dispStrategy) {
            if (pkg == null && parentRule==null) {
                logger.warn("Both package and parent rule can't be null in rule template configuration, aborting");
                return null;
            }
            
            // Template Configuration
            RuleTemplateConfiguration conf = TemplateFactory.eINSTANCE.createRuleTemplateConfiguration();
            ECoreUtils.setup(conf);
            if (name == null) {
                name = "Configure";
            }
            conf.setName(name);
            conf.setInstantiationStrategy(instStrategy);
            conf.setDisposalStrategy(dispStrategy);
            conf.setTemplate(template);
            
            RuleDesignModel model = null;
            if (pkg != null) {
                model = pkg.getModel();
                pkg.getConfigurations().add(conf);
            }
            if (parentRule != null) {
                model = parentRule.getPackage().getModel();
                parentRule.getContainedConfigurations().add(conf);
            }
            
            if (timeStepSize == null) {
                // TODO: reference clock must be always provided!
                if (model.getTimeStepSizes().size() == 0) {
                    // TODO: name conflict!
                    RuleDesignController.this.timeStep.create(model, 2000);
                }
                timeStepSize = model.getTimeStepSizes().get(0);
                if (timeStepSize == null) {
                    logger.warn("Time step size in template configuration can not be null, aborting");
                    // TODO: timestep size can be null for contained configurations, but not for 
                    //return null;
                }
            }
            conf.setTimeStepSize(timeStepSize);
            
            return conf;
        }
        
        
    }

    public class CombiningAlgorithmController extends ElementController {
    
        public CombiningAlgorithm createAllowOverrides() {
            CombiningAlgorithm algorithm = TemplateFactory.eINSTANCE.createAllowOverrides();
            ECoreUtils.setup(algorithm);
            return algorithm;
        }
        
    }

    
    public class VariableController extends ElementController {
    
        public ReferenceVariableAssignment createReferenceVariableAssignment(VariableDeclaration target, VariableDeclaration source) {
            ReferenceVariableAssignment assignment = VariableFactory.eINSTANCE.createReferenceVariableAssignment();
            ECoreUtils.setup(assignment);
            assignment.setSource(source);
            assignment.setTarget(target);
            return assignment;
        }
    
        public ReferenceVariableAssignment addReferenceVariableAssignment(RuleTemplateConfiguration conf, VariableDeclaration target,
                        VariableDeclaration source) {
            ReferenceVariableAssignment assignment = VariableFactory.eINSTANCE.createReferenceVariableAssignment();
            ECoreUtils.setup(assignment);
            assignment.setSource(source);
            assignment.setTarget(target);
            conf.getConfigurationAssignments().add(assignment);
            return assignment;
        }
    
        public RuleXPathVariableAssignment createXPathVariableAssignment(VariableDeclaration target, XPathContext context, String expression) {
            RuleXPathVariableAssignment assignment = TemplateFactory.eINSTANCE.createRuleXPathVariableAssignment();
            ECoreUtils.setup(assignment);
            assignment.setTarget(target);
            assignment.setContext(context);
            assignment.setExpression(expression);
            return assignment;
        }
        
        public RuleXPathVariableAssignment createXPathVariableAssignment(RuleTemplate template, VariableDeclaration target, XPathContext context, String expression) {
            RuleXPathVariableAssignment assignment = createXPathVariableAssignment(target, context, expression);
            template.getEvaluationAssignments().add(assignment);
            return assignment;
        }
        
        public RegExpVariableAssignment createRegExpAssignement(VariableDeclaration target, VariableDeclaration source, String expression, int match, int group) {
            RegExpVariableAssignment assignment = VariableFactory.eINSTANCE.createRegExpVariableAssignment();
            ECoreUtils.setup(assignment);
            assignment.setTarget(target);
            assignment.setSource(source);
            assignment.setExpression(expression);
            assignment.setMatch(match);
            assignment.setGroup(group);
            return assignment;
        }
        
        public RegExpVariableAssignment createRegExpAssignement(RuleTemplate template, VariableDeclaration target, VariableDeclaration source, String expression, int match, int group) {
            RegExpVariableAssignment assignment = createRegExpAssignement(target, source, expression, match, group);
            template.getEvaluationAssignments().add(assignment);
            return assignment;
        }
        
    
        public RuleXPathVariableAssignment addXPathVariableAssignment(RuleTemplate template, VariableDeclaration target, XPathContext context,
                        String expression) {
            RuleXPathVariableAssignment assignment = createXPathVariableAssignment(target, context, expression);
            template.getEvaluationAssignments().add(assignment);
            return assignment;
        }
    
    }

    class AtomController extends ElementController {
    
        public boolean delete(Atom atom) {
            
            logger.trace("Deleting atom ("+atom.getId()+")");
            
            if (atom != null) {

                if (atom instanceof Operator) {
                    logger.trace("- Atom is instance of operator");
                    Operator exp = (Operator) atom;
                    if (exp.getOperands().size() > 0) {
                        logger.trace("- Atom has child operands, aborting");
                        return false;
                    } else {
                        logger.trace("- Atom does not have child operands, can delete");
                    }
                } else {
                    logger.trace("- Atom is not instance of operator");
                }
                
                
                Template aTemplate = atom.getTemplate();
                if (aTemplate instanceof RuleTemplate) {
                    logger.trace("- Atom is contained in rule template");
                    RuleTemplate rTemplate = (RuleTemplate)aTemplate;
                    if (rTemplate.getEvent() != null) {
                        if (rTemplate.getEvent().getId().equals(atom.getId())) {
                            rTemplate.setEvent(null);
                            EcoreUtil.delete(atom);
                            logger.trace("- Atom is event of rule template, deleting");
                            return true;
                        } else {
                            logger.trace("- Atom is not event of formula template");
                        }
                    }
                    if (rTemplate.getCondition() != null) {
                        if (rTemplate.getCondition().getId().equals(atom.getId())) {
                            rTemplate.setCondition(null);
                            EcoreUtil.delete(atom);
                            logger.trace("- Atom is condition of rule template, deleting");
                            return true;
                        } else {
                            logger.trace("- Atom is not condition of formula template");
                        }
                    }
                }
                if (aTemplate instanceof FormulaTemplate) {
                    logger.trace("- Atom is contained in formula template");
                    FormulaTemplate fTemplate = (FormulaTemplate)aTemplate;
                    if (fTemplate.getRootAtom().getId().equals(atom.getId())) {
                        fTemplate.setRootAtom(null);
                        EcoreUtil.delete(atom);
                        logger.trace("- Atom is root of formula template, deleting");
                        return true;
                    } else {
                        logger.trace("- Atom is not root of formula template");
                    }
                }
    
                Operator op = atom.getOperator();
                if (op != null) {
                    logger.trace("- Atom is contained in operator");
                    op.getOperands().remove(atom);
                    EcoreUtil.delete(atom);
                    logger.trace("- Removing atom from operator and deleting");
                    return true;
                }
                
            }
    
            return false;
        }
        
    }

    protected void setup(EventPattern pattern, RuleTemplate template, boolean isTrigger) {
        ECoreUtils.setup(pattern);
        //
        if (template != null) {
            pattern.setTemplate(template);
            if (isTrigger) {
                template.setEvent(pattern);
            }
        }
        //
        EventSubscription sub = EventFactory.eINSTANCE.createEventSubscription();
        sub.setEventPattern(pattern);
        eventSubscriptions.add(sub);
        //
    }
    
    public class EventPatternController extends AtomController {
        
        
        public TimeStepEventPattern createTimeStepEventPattern(RuleTemplate template) {
            TimeStepEventPattern pattern = ConditionFactory.eINSTANCE.createTimeStepEventPattern();
            // It is always a trigger event!?
            setup(pattern, template, true);
            return pattern;
        }        

   
        
    }    

    public class ConstantController extends AtomController {
    
        public Constant addTrueCondition(RuleTemplate template) {
            return addConstantCondition(template, TruthValue.TRUE);
        }
    
        public Constant addFalseCondition(RuleTemplate template) {
            // A rule that always evaluates to FALSE is not very useful
            return addConstantCondition(template, TruthValue.FALSE);
        }
    
        public Constant addConstantCondition(RuleTemplate template, TruthValue t) {
            Constant c = ConditionFactory.eINSTANCE.createConstant();
            ECoreUtils.setup(c);
            c.setValue(t);
            template.setCondition(c);
            c.setTemplate(template);
            return c;
        }
    
        public Constant create(Template template, TruthValue t) {
            Constant c = ConditionFactory.eINSTANCE.createConstant();
            ECoreUtils.setup(c);
            c.setValue(t);
            c.setTemplate(template);
            return c;
        }
        
    }
    
    public class OperatorController extends AtomController {
    
        public void setupOperator(Operator op, Template template, Atom operand) {
            ECoreUtils.setup(op);
            if (operand != null) {
                op.getOperands().add(operand);
            }
            op.setTemplate(template);
        }

        public void setupOperator(Operator op, Template template, Atom[] operands) {
            ECoreUtils.setup(op);
            if (operands != null) {
                for (Atom atom : operands) {
                    op.getOperands().add(atom);
                }
            }
            op.setTemplate(template);
        }
        
        public Not addNot(Template template, Atom operand) {
            Not op = PropositionalFactory.eINSTANCE.createNot();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Implies addImplies(Template template, Atom operand) {
            Implies op = PropositionalFactory.eINSTANCE.createImplies();
            setupOperator(op, template, operand);
            return op;
        }
    
        public And addAnd(Template template, Atom[] operand) {
            And op = PropositionalFactory.eINSTANCE.createAnd();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Or addOr(Template template, Atom operand) {
            Or op = PropositionalFactory.eINSTANCE.createOr();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Always addAlways(Template template, Atom operand) {
            Always op = TemporalFactory.eINSTANCE.createAlways();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Eventually addEventually(Template template, Atom operand) {
            Eventually op = TemporalFactory.eINSTANCE.createEventually();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Since addSince(Template template, Atom operand) {
            Since op = TemporalFactory.eINSTANCE.createSince();
            setupOperator(op, template, operand);
            return op;
        }
    
        public Before addBefore(Template template, long timeBound, Atom operand) {
            Before op = TemporalFactory.eINSTANCE.createBefore();
            setupOperator(op, template, operand);
            op.setTimeBoundInTimeSteps(timeBound);
            return op;
        }

        public Before addBefore(Template template, TimeStepVariable var, Atom operand) {
            Before op = TemporalFactory.eINSTANCE.createBefore();
            setupOperator(op, template, operand);
            op.setVariable(var);
            return op;
        }
        
        public Within addWithin(Template template, int timeBound, Atom operand) {
            Within op = TemporalFactory.eINSTANCE.createWithin();
            setupOperator(op, template, operand);
            op.setTimeBoundInTimeSteps(timeBound);
            return op;
        }

        public Within addWithin(Template template, TimeStepVariable var, Atom operand) {
            Within op = TemporalFactory.eINSTANCE.createWithin();
            setupOperator(op, template, operand);
            op.setVariable(var);
            return op;
        }
        
        public During addDuring(Template template, int timeBound, Atom operand) {
            During op = TemporalFactory.eINSTANCE.createDuring();
            setupOperator(op, template, operand);
            op.setTimeBoundInTimeSteps(timeBound);
            return op;
        }

        public During addDuring(Template template, TimeStepVariable var, Atom operand) {
            During op = TemporalFactory.eINSTANCE.createDuring();
            setupOperator(op, template, operand);
            op.setVariable(var);
            return op;
        }
    }

    public class EvaluateActionController extends AtomController {

        public EvaluateAction createEvaluateAction(Template template, String name, ActionType actionType) {
            EvaluateAction evaluate = behavior.condition.ConditionFactory.eINSTANCE.createEvaluateAction();
            ECoreUtils.setup(evaluate);
            if (template != null) {
                evaluate.setTemplate(template);
            }
            //
            ActionInstantiation inst = design.behavior.actionInstantiation.create(null, name, actionType);
            evaluate.setActionInstantiation(inst);
            //
            return evaluate;
        }
        
    }



}
