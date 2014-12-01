package seckit.gui.runtime.view;

import identity.instance.DigitalIdentity;
import identity.instance.impl.DigitalIdentityImpl;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import models.Element;
import models.Model;
import role.RoleAssignment;
import role.RoleRuntimeModel;
import role.impl.RoleAssignmentImpl;
import role.impl.RoleRuntimeModelImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;

public class RoleRuntimeView extends RuntimeView {

    public RoleRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Role", runtime, runtime.role);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        String p = "role/";
        //
        Icons.addIcon(RoleRuntimeView.class, p+"role-type.png");
        Icons.addIcon(RoleRuntimeModelImpl.class, "model.png");
        Icons.addIcon(RoleAssignmentImpl.class, "role/role-type.png");
        Icons.addIcon(DigitalIdentityImpl.class, "identity/identity-inst.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "roleRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Role Models";
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
            
    class RoleRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleRuntimeModel model;
        //
        public RoleRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (RoleRuntimeModel) e;
        }
        @Override
        public void load() {
            loadFeatures("assignments");
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

    class RoleAssignmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleAssignment assignment;
        //
        public RoleAssignmentImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            assignment = (RoleAssignment) e;
        }
        @Override
        public void load() {
            loadFeatures("identities");
        }
        @Override
        public String getDisplayLabel() {
            return assignment.getRoleType().getName();
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Assign identity", DigitalIdentityImpl.class);
            return menu;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Assign identity")) {
            }
        }
    };        

    class DigitalIdentityImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        DigitalIdentity identity;
                
        public DigitalIdentityImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            identity = (DigitalIdentity) e;
        }
        
        @Override
        public String getDisplayLabel() {
            return identity.getSubject();
        }
    };        
    
}
