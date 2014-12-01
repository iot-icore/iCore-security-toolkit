package seckit.gui.runtime.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import models.Element;
import models.Model;
import risk.RiskRuntimeModel;
import risk.impl.RiskRuntimeModelImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;

public class RiskRuntimeView extends RuntimeView {
    
    public RiskRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Risk", runtime, runtime.risk);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        String p = "risk/";
        //
        Icons.addIcon(RiskRuntimeView.class, p+"risk.png");
        Icons.addIcon(RiskRuntimeModelImpl.class, "model.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "riskRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Risk Models";
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
            
    class RiskRuntimeModelImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        RiskRuntimeModel model;
        
        public RiskRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            model = (RiskRuntimeModel) e;
        }
        
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
        
        @Override
        public void addDefaultChild() {
            // actionPerformed("Add ...");
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            // addItem(menu, "Add ...", ...Impl.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add ...")) {
            }
        }
    };    
    
}
