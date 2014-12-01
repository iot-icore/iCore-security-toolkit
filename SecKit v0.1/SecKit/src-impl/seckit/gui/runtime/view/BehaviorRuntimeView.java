package seckit.gui.runtime.view;

import identity.instance.DigitalIdentity;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import data.instance.Data;
import behavior.BehaviorRuntimeModel;
import behavior.impl.BehaviorRuntimeModelImpl;
import behavior.instance.Action;
import behavior.instance.Behavior;
import behavior.instance.DataProducerInstance;
import behavior.instance.Interaction;
import behavior.instance.impl.ActionImpl;
import behavior.instance.impl.BehaviorImpl;
import behavior.instance.impl.InteractionImpl;
import models.Element;
import models.Model;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.ElementInnerNode;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;

public class BehaviorRuntimeView extends RuntimeView {

    public BehaviorRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Behavior", runtime, runtime.behavior);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        String p = "behavior/";
        //
        Icons.addIcon(BehaviorRuntimeModelImpl.class, "model.png");
        Icons.addIcon(BehaviorRuntimeView.class, p+"behavior-type.png");
        Icons.addIcon(BehaviorImpl.class, p+"behavior-instance.png");
        Icons.addIcon(ActionImpl.class, p+"action-instance.png");
        Icons.addIcon(InteractionImpl.class, p+"interaction-instance.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "behaviorRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Behavior Models";
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
        
    
    class BehaviorRuntimeModelImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        BehaviorRuntimeModel model;
                
        public BehaviorRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            model = (BehaviorRuntimeModel) e;
        }

        @Override
        public void load() {
            loadFeatures("instances");
        }
        
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
    };    

    class BehaviorImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        Behavior behavior;
                
        public BehaviorImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            behavior = (Behavior)e;
        }
        
        @Override
        public void load() {
            loadFeatures("activities");
        }
        
        @Override
        public String getDisplayLabel() {
            if (behavior.getType() != null) {
                return behavior.getName() + " (" + behavior.getType().getName() + ")";
            }
            return behavior.getName();
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
                return action.getId() + " (" + action.getType().getName() + ")";
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
                return interaction.getId() + " (" + interaction.getType().getName() + ")";
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
