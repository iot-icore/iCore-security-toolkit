package seckit.gui.runtime.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import context.ContextRuntimeModel;
import context.impl.ContextRuntimeModelImpl;
import models.Element;
import models.Model;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;

public class ContextRuntimeView extends RuntimeView {

    public ContextRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Context", runtime, runtime.context);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        String p = "context/";
        //
        Icons.addIcon(ContextRuntimeView.class, p+"context-information-type.png");
        Icons.addIcon(ContextRuntimeModelImpl.class, "model.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "contextRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Context Models";
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
            
    class ContextRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ContextRuntimeModel model;
        //
        public ContextRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (ContextRuntimeModel) e;
        }
        
        @Override
        public void load() {
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
