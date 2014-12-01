package seckit.gui.design.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import models.Element;
import models.Model;
import role.RoleDesignModel;
import role.RoleType;
import role.RoleTypePackage;
import role.impl.RoleDesignModelImpl;
import role.impl.RoleTypeImpl;
import role.impl.RoleTypePackageImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;

public class RoleDesignView extends DesignView {

    public RoleDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Roles", design, design.role);
        //
        legend.add(RoleDesignModelImpl.class, "Model");
        legend.add(RoleTypePackageImpl.class, "Package");
        legend.add(RoleTypeImpl.class, "Role type");
        legend.add(Icons.createIcon("role/role-type-ref.png"), "Role reference");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "role/";
        Icons.addIcon(RoleDesignView.class, p + "role-type.png");
        Icons.addIcon(RoleDesignModelImpl.class, "model.png");
        Icons.addIcon(RoleTypePackageImpl.class, p + "role-package.png");
        Icons.addIcon(RoleTypeImpl.class, p + "role-type.png");
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "roleDesignModels");
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
    
    class RoleDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleDesignModel model;
        //
        public RoleDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (RoleDesignModel) e;
        }
        @Override
        public void load() {
            loadFeatures("packages");
        }
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add package", RoleTypePackageImpl.class);
            return menu;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add package")) {
                design.role.pkg.create(model, null);
            }
        }
    };

    class RoleTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleTypePackage pkg;

        //
        public RoleTypePackageImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            pkg = (RoleTypePackage) e;
        }

        @Override
        public void load() {
            loadFeatures("subPackages");
            // Constraint: do not add all roles to root,
            // only roles that have no parents.
            // Maybe we don't need this
            loadFeatures("roleTypes");
            /*
             * for (RoleType roleType : pkg.getRoleTypes()) { if
             * (roleType.getSuperRoles().size() == 0) { n(roleType); } }
             */
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            pkg.setName(newValue.toString());
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add role type", RoleTypeImpl.class);
            return menu;
        }

        @Override
        public void addDefaultChild() {
            actionPerformed("Add role type");
        }

        @Override
        public boolean deleteObject() {
            if (design.role.pkg.delete(pkg)) {
                deleteNode();
                return true;
            }
            return false;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add role type")) {
                design.role.type.create(pkg, null, null);
            }
        }
    };

    static Map<String, ArrayList<Node>> roleTypeNodes = new HashMap<String, ArrayList<Node>>();

    class RoleTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleType type;

        //
        public RoleTypeImplNode(Node p, Element e) throws Exception {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            type = (RoleType) e;
            setEditAllowed(true);
        }

        @Override
        public void load() {
            loadFeatures("subRoles", RoleTypeReferenceImplNode.class);
            /*
            ArrayList<Node> nodes = roleTypeNodes.get(type.getId());
            if (nodes == null) {
                nodes = new ArrayList<Node>();
                roleTypeNodes.put(type.getId(), nodes);
            }
            nodes.add(this);
            if (!(parent instanceof RoleTypeImplNode)) {
                for (RoleType sType : type.getSubRoles()) {
                   n(RoleTypeReferenceImplNode.class, sType);
                }                
                setEditAllowed(true);
            } else {
                // Overwrite icon
                setIconFilePath("role/role-type-ref.png");
            }
            */
        }

        @Override
        public String getDisplayLabel() {
            return type.getName();
        }

        @Override
        public void drop(Node node) {
            if (node.getUserObject() instanceof RoleType) {
                RoleType droppedType = (RoleType) node.getUserObject();
                if (!droppedType.getId().equals(type.getId()) && !type.getSubRoles().contains(droppedType)) {
                    design.role.type.addSubRole(type, droppedType);
                }
            }
        }

        @Override
        public void setUserObject(Object newValue) {
            design.role.type.updateName(type, newValue.toString());
        }

        @Override
        public synchronized boolean deleteObject() {
            return design.role.type.delete(type); 
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = null;
            if (!(parent instanceof RoleTypeImplNode)) {
                menu = new JPopupMenu();
                addItem(menu, "Add sub-role type", RoleTypeImpl.class);
            }
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add sub-role type")) {

                // TODO: prevent circular references??
                // normalize role tree?
                // update reference nodes?

                // Get the one and only package
                                
                Map<String, RoleType> roleTypes = new HashMap<String, RoleType>();
                for (RoleDesignModel model : design.viewpoint.getRoleDesignModels()) {
                    for (RoleTypePackage pkg : model.getPackages()) {
                        for (RoleType roleType : pkg.getRoleTypes()) {
                            if (!type.getId().equals(roleType.getId()) && 
                                !design.role.type.aIsAncestorOfb(roleType, type) && 
                                !type.getSubRoles().contains(roleType)) {
                                //
                                roleTypes.put(roleType.getName(), roleType);
                            }
                        }
                    }
                }                
                
                if (roleTypes.size() > 0) {                
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select role type to add", "Role Type", JOptionPane.PLAIN_MESSAGE, null, roleTypes
                                    .keySet().toArray(new String[] {}), null);
                    RoleType roleType = roleTypes.get(s);
                    if (roleType != null) {
                        type.getSubRoles().add(roleType);
                    }
                }
            }
        }
    };

    public class RoleTypeReferenceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RoleType type;

        //
        public RoleTypeReferenceImplNode(Node p, Element e) throws Exception {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            type = (RoleType) e;
        }

        @Override
        public void load() {
            setIcon("role/role-type-ref.png");
        }

        @Override
        public String getDisplayLabel() {
            return type.getName();
        }
        
        @Override
        public synchronized boolean deleteObject() {
            RoleType superRole = ((RoleTypeImplNode) parent).type;
            if (design.role.type.deleteSubRole(superRole, type)) {
                deleteNode();
                return true;
            }
            return false;
        }
        
    }
    
}
