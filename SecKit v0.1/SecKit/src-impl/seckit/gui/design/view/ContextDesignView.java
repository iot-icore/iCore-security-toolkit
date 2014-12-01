package seckit.gui.design.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.tree.DefaultMutableTreeNode;

import models.Element;
import models.Model;
import context.ContextDesignModel;
import context.type.ContextInformationType;
import context.type.ContextSituationType;
import context.type.ContextTypePackage;
import context.type.EntityRoleType;
import context.impl.ContextDesignModelImpl;
import context.type.impl.ContextInformationTypeImpl;
import context.type.impl.ContextSituationTypeImpl;
import context.type.impl.ContextTypePackageImpl;
import context.type.impl.EntityRoleTypeImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;

public class ContextDesignView extends DesignView {

    private static final long serialVersionUID = 1L;

    public ContextDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Context", design, design.context);
        //
        legend.add(ContextDesignModelImpl.class, "Model");
        legend.add(ContextTypePackageImpl.class, "Package");
        legend.add(ContextInformationTypeImpl.class, "Context information type");
        legend.add(ContextSituationTypeImpl.class, "Context situation type");
        legend.add(EntityRoleTypeImpl.class, "Situation Role type");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "context/";
        Icons.addIcon(ContextDesignView.class, p + "context-information-type.png");
        Icons.addIcon(ContextDesignModelImpl.class, "model.png");
        Icons.addIcon(ContextTypePackageImpl.class, p + "context-package.png");
        Icons.addIcon(ContextInformationTypeImpl.class, p + "context-information-type.png");
        Icons.addIcon(ContextSituationTypeImpl.class, p + "context-situation-type.png");
        Icons.addIcon(EntityRoleTypeImpl.class, p + "entity-role-type.png");
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "contextDesignModels");
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
                design.context.model.create(null);
            }
        }
    }    
    
    class ContextDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ContextDesignModel model;

        //
        public ContextDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (ContextDesignModel) e;
            setEditAllowed(true);
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
        public void setUserObject(Object newValue) {
            design.context.model.update(model, (String)newValue);
        }
        
        public boolean deleteObject() {
            return design.context.model.delete(model);
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add context type package", ContextTypePackageImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add context type package")) {
                design.context.pkg.create(model, null);
            }
        }
    };

    class ContextTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ContextTypePackage pkg;

        //
        public ContextTypePackageImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pkg = (ContextTypePackage) e;
            setEditAllowed(true);
        }

        @Override
        public void load() {
            loadFeatures(new String[]{
                            "situationTypes",
                            "contextInformationTypes"                           
            });
        }

        @Override
        public void setUserObject(Object newValue) {
            pkg.setName(newValue.toString());
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getName()
            // + "("+(pkg.getContextInformationTypes().size() +
            // pkg.getSituationTypes().size())+")"
            ;
        }

        @Override
        public boolean deleteObject() {
            return design.context.pkg.delete(pkg);
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add context information type", ContextInformationTypeImpl.class);
            addItem(menu, "Add context situation type", ContextSituationTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add context information type")) {
                design.context.contextType.create(pkg, null);
            }
            if (e.getActionCommand().equals("Add context situation type")) {
                design.context.situationType.create(pkg, null, new String[] {});
            }
        }
    };

    class ContextInformationTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ContextInformationType contextType;

        //
        public ContextInformationTypeImplNode(Node p, Element e) {
            super(p, e); // , ContextDesignView.this , factory.data);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            contextType = (ContextInformationType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public boolean deleteObject() {
            return design.context.contextType.delete(contextType);
        }

        @Override
        public void addToParent(DefaultMutableTreeNode parent) {
            super.addToParent(parent, ContextInformationType.class, true);
        }

        @Override
        public String getDisplayLabel() {
            return contextType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            contextType.setName(newValue.toString());
        }
    }

    class ContextSituationTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ContextSituationType situationType;

        //
        public ContextSituationTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            situationType = (ContextSituationType) e;
        }

        @Override
        public void load() {
            loadFeatures("entityRoleTypes");
        }

        @Override
        public void addToParent(DefaultMutableTreeNode parent) {
            super.addToParent(parent, ContextSituationType.class, true);
        }

        @Override
        public boolean deleteObject() {
            return design.context.situationType.delete(situationType);
        }

        @Override
        public String getDisplayLabel() {
            return situationType.getName()
            // + " ("+situationType.getEntityRoleTypes().size()+")"
            ;
        }

        @Override
        public void setUserObject(Object newValue) {
            situationType.setName(newValue.toString());
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add entity role", EntityRoleTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add entity role")) {
                design.context.roleType.create(situationType, null);
            }
        }
    };

    class EntityRoleTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EntityRoleType roleType;

        //
        public EntityRoleTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            roleType = (EntityRoleType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public boolean deleteObject() {
            return design.context.roleType.delete(roleType);
        }

        @Override
        public String getDisplayLabel() {
            return roleType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            roleType.setName(newValue.toString());
        }
    };

}
