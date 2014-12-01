package seckit.gui.runtime.view;

import identity.instance.DigitalIdentity;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import data.instance.Data;
import models.Element;
import models.Model;
import rule.RuleRuntimeModel;
import rule.action.Allow;
import rule.event.EventSet;
import rule.event.EventTrace;
import behavior.action.impl.BehaviorExecutionImpl;
import behavior.event.impl.ActionEventImpl;
import behavior.event.impl.InteractionEventImpl;
import behavior.instance.Action;
import behavior.instance.DataProducerInstance;
import behavior.instance.Interaction;
import rule.event.impl.EventSetImpl;
import rule.event.impl.EventTraceImpl;
import rule.impl.RuleRuntimeModelImpl;
import rule.state.EventPatternState;
import rule.state.State;
import rule.state.impl.EventPatternStateImpl;
import rule.state.impl.RepStateImpl;
import rule.state.impl.StateImpl;
import rule.template.RuleInstance;
import rule.template.TimeStepRuleSet;
import rule.template.impl.RuleInstanceImpl;
import rule.template.impl.TimeStepRuleSetImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.ElementInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;
import seckit.gui.runtime.view.BehaviorRuntimeView.DataProducerInstanceImplNode;
import time.Timestamp;
import time.TimeDuration;

public class RuleRuntimeView extends RuntimeView  {

    JButton toogle;

    public RuleRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Rules", runtime, runtime.rule);
    }

    @Override
    public void configureTab() {
        super.configureTab();
        /*
        toogle = new JButton("Start Rule Engine");
        toogle.setActionCommand("Start");
        toogle.addActionListener(this);
        panel.add(toogle, BorderLayout.NORTH);
        */
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "rule/";
        Icons.addIcon(RuleRuntimeView.class, p + "rule-enf.png");
        Icons.addIcon(RuleRuntimeModelImpl.class, "model.png");
        Icons.addIcon(TimeStepRuleSetImpl.class, p + "clock.png");
        // Event
        Icons.addIcon(EventSetImpl.class, p + "event_set.png");
        Icons.addIcon(EventTraceImpl.class, p + "event_trace.png");
        Icons.addIcon(ActionEventImpl.class, p + "event.png");
        Icons.addIcon(InteractionEventImpl.class, p + "event.png");
        //
        // Rules
        Icons.addIcon(RuleInstanceImpl.class, p + "rule-inst.png");
        // States
        Icons.addIcon(EventPatternStateImpl.class, p + "condition.png");
        Icons.addIcon(StateImpl.class, p + "condition.png");
        Icons.addIcon(RepStateImpl.class, p + "condition.png");        
        //
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {            
            loadFeatures(viewpoint, "ruleRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Rule Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add model", Model.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add model")) {
            }
        }
    }    
            
    class RuleRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RuleRuntimeModel model;

        //
        public RuleRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (RuleRuntimeModel) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "ruleSets",
                            "eventSet",
                            "eventTrace"
            });
            // n(model.getRules());
            // n(model.getEventTrace());
        }

        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            if (model.isRunning()) {
                addItem(menu, "Stop monitoring", BehaviorExecutionImpl.class);
            } else {
                addItem(menu, "Start monitoring", BehaviorExecutionImpl.class);
            }
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add model")) {
            }
        }        
    };

    class TimeStepRuleSetImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TimeStepRuleSet set;

        //
        public TimeStepRuleSetImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            set = (TimeStepRuleSet) e;
            addChangedObserver(set.getClock(), "timeStep");
        }

        @Override
        public void load() {
            loadFeatures("rules");
        }

        @Override
        public String getDisplayLabel() {
            Timestamp start = set.getClock().getStart();
            //
            TimeDuration resolution = set.getClock().getResolution();
            resolution = design.time.normalize(resolution.getAmount(), resolution.getUnit());
            String au = "";
            if (resolution.getAmount() > 1) {
                au = resolution.getAmount() + " " + resolution.getUnit() + "s";                
            } else {
                au = resolution.getAmount() + " " + resolution.getUnit();
            }
            //            
            if (start == null) {
                return au + " (not running)";
            }
            String sdate = design.time.getTimestampFormat().format(start.getDate());
            return au + " (started at " + sdate + ", time step = " + set.getClock().getTimeStep() + ")";
        }
    };


    class RuleInstanceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RuleInstance rule;

        //
        public RuleInstanceImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            rule = (RuleInstance) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "triggerEventState",
                            "conditionState",
                            "containedInstances"
            });
        }

        @Override
        public String getDisplayLabel() {
            return "Enforcement rule instance of [" + rule.getTemplate().getName() + "]";
        }
    };

    class EventPatternStateImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EventPatternState state;

        //
        public EventPatternStateImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            state = (EventPatternState) e;
        }

        @Override
        public String getDisplayLabel() {
            return state.getValue() + " ("+state.getAtom().getClass().getSimpleName()+")";
        }
    };

    class StateImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        State state;
        //
        public StateImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            state = (State) e;
        }
        @Override
        public void load() {
            loadFeatures("children");
        }
        @Override
        public String getDisplayLabel() {
            return state.getValue() + " ("+state.getAtom().getClass().getSimpleName()+")";
        }
    }

    class RepStateImplNode extends StateImplNode {
        //
        private static final long serialVersionUID = 1L;
        //
        public RepStateImplNode(Node p, Element e) {
            super(p, e);
        }
    }    
    
    class EventSetImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EventSet set;

        //
        public EventSetImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            set = (EventSet) e;
        }

        @Override
        public void load() {
            loadFeatures("events");
        }

        @Override
        public String getDisplayLabel() {
            return "Event Set";
        }
    };
    
    class EventTraceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EventTrace trace;

        //
        public EventTraceImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            trace = (EventTrace) e;
        }

        @Override
        public void load() {
            loadFeatures("events");
        }

        @Override
        public String getDisplayLabel() {
            return "Event Trace";
        }
    };


    class ActivityEventImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        behavior.event.ActivityEvent event;
        
        //
        public ActivityEventImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            super.configure(e);
            event = (behavior.event.ActivityEvent)e;
            if (event.getAuthorization() != null) {
                if (event.getAuthorization() instanceof Allow) {
                    setIcon("rule/event_allow.png");
                } else {
                    setIcon("rule/event_deny.png");
                }
            }
        }
    }
    
    class ActionEventImplNode extends ActivityEventImplNode {
        //
        private static final long serialVersionUID = 1L;
        behavior.event.ActionEvent event;

        //
        public ActionEventImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures("action");
        }
        
        @Override
        public void configure(Element e) {
            super.configure(e);
            event = (behavior.event.ActionEvent) e;
        }
        
        @Override
        public String getDisplayLabel() {
            return "Action event";
            
        }
    };

    class InteractionEventImplNode extends ActivityEventImplNode {
        //
        private static final long serialVersionUID = 1L;
        behavior.event.InteractionEvent event;

        //
        public InteractionEventImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures("interaction");
        }
        
        @Override
        public void configure(Element e) {
            super.configure(e);
            event = (behavior.event.InteractionEvent) e;
        }

        @Override
        public String getDisplayLabel() {
            return "Interaction event";
        }
    };
    
   class DataProducerInstanceImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        DataProducerInstance dataProducer;
                
        public DataProducerInstanceImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            super.configure(e);
            dataProducer = (DataProducerInstance)e;
        }
        
        @Override
        public void load() {
            loadFeatures(new String[] {"identities", "data"});
        }
        
        @Override
        public String getDisplayLabel() {
            return dataProducer.getName();
        }
    };    

    class ActionImplNode extends DataProducerInstanceImplNode {
        
        private static final long serialVersionUID = 1L;
        Action action;
                
        public ActionImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            super.configure(e);
            action = (Action)e;
        }
        
        @Override
        public String getDisplayLabel() {
            if (action.getType() != null) {
                return action.getType().getName() + " (" + action.getId() + ")";
            }
            return action.getId();   
        }
    };    

    class InteractionImplNode extends DataProducerInstanceImplNode {
        
        private static final long serialVersionUID = 1L;
        Interaction interaction;
                
        public InteractionImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            super.configure(e);
            interaction = (Interaction)e;
        }
        
        @Override
        public String getDisplayLabel() {
            if (interaction.getType() != null) {
                return interaction.getType().getName() + " (" + interaction.getId() + ")";
            }
            return interaction.getId();
        }
    };    


    
    class DataImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Data d;
        //
        public DataImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
           d = (Data)e;
        }
        
        @Override
        public String getDisplayLabel() {
            return d.getInstantiation().getName() + " = [" + d.getStringValue() + "]";
        }
        
    };    

    class DigitalIdentityImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DigitalIdentity id;
        //
        public DigitalIdentityImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
           id = (DigitalIdentity)e;
        }
        
        @Override
        public String getDisplayLabel() {
            return id.getInstantiation().getName() + " = [" + id.getSubject() + "]";
        }
        
    };    
        
    
    
}
