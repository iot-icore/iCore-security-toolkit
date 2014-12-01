package seckit.gui.design.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Constructor;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;

import models.Element;
import models.Model;
import identity.type.DigitalIdentityType;
import identity.type.IdentityAttributeInstantiation;
import identity.IdentityDesignModel;
import identity.type.IdentityTypePackage;
import identity.type.impl.DigitalIdentityTypeImpl;
import identity.type.impl.IdentityAttributeInstantiationImpl;
import identity.impl.IdentityDesignModelImpl;
import identity.type.impl.IdentityTypePackageImpl;
import seckit.gui.Icons;
import seckit.gui.MyTreeCellEditor;
import seckit.gui.Node;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;

public class IdentityDesignView extends DesignView {

    public IdentityDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Identity", design, design.identity);
        //
        legend.add(IdentityDesignModelImpl.class, "Model");
        legend.add(IdentityTypePackageImpl.class, "Package");
        legend.add(DigitalIdentityTypeImpl.class, "Identity type");
        legend.add(IdentityAttributeInstantiationImpl.class, "Attribute");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "identity/";
        Icons.addIcon(IdentityDesignView.class, p + "identity-type.png");
        Icons.addIcon(IdentityDesignModelImpl.class, "model.png");
        Icons.addIcon(IdentityTypePackageImpl.class, p + "identity-package.png");
        Icons.addIcon(DigitalIdentityTypeImpl.class, p + "identity-type.png");
        Icons.addIcon(IdentityAttributeInstantiationImpl.class, p + "identity-att-inst.png");
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;
        
        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(design.viewpoint, "identityDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Identity Models";
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
                design.identity.model.create(null);
            }
        }
        
    }

    class IdentityDesignModelImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        IdentityDesignModel model;
        
        public IdentityDesignModelImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }
        
        @Override
        public void configure(Element e) {
            model = (IdentityDesignModel) e;
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
            design.identity.model.update(model, newValue.toString());
        }
        
        @Override
        public boolean deleteObject() {
            return design.identity.model.delete(model);
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add package", IdentityTypePackageImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add package")) {
                design.identity.pkg.create(model, null);
            }
        }
    };

    class IdentityTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IdentityTypePackage pkg;

        //
        public IdentityTypePackageImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            pkg = (IdentityTypePackage) e;
        }

        @Override
        public void load() {
            loadFeatures("identityTypes");
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            design.identity.pkg.updateName(pkg, newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.identity.pkg.delete(pkg);
        }

        @Override
        public void addDefaultChild() {
            actionPerformed("Add identity type");
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add identity type", DigitalIdentityTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add identity type")) {
                design.identity.type.create(pkg, null);
            }
        }
    };

    class DigitalIdentityTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DigitalIdentityType identityType;

        //
        public DigitalIdentityTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            identityType = (DigitalIdentityType) e;
        }

        @Override
        public void load() {
            loadFeatures("attributeInstantiations");
        }

        @Override
        public String getDisplayLabel() {
            return identityType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            design.identity.type.update(identityType, newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.identity.type.delete(identityType);
        }

        @Override
        public void addDefaultChild() {
            actionPerformed("Add attribute instantiation");
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add attribute instantiation", IdentityAttributeInstantiationImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add attribute instantiation")) {
                design.identity.att.create(identityType, null, null);
            }
        }
    }

    class IdentityAttributeInstantiationImplNode extends ElementInnerNode implements KeyListener {
        //
        private static final long serialVersionUID = 1L;
        IdentityAttributeInstantiation att;
    
        //
        public IdentityAttributeInstantiationImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }
    
        @Override
        public void configure(Element e) {
            att = (IdentityAttributeInstantiation) e;
        }
    
        @Override
        public void load() {
        }
    
        @Override
        public String getDisplayLabel() {
            return att.getName() + " : " + att.getType().getEType().getName();
        }
    
        @Override
        public String getEditLabel() {
            return att.getName();
        }
    
        @Override
        public void setUserObject(Object newValue) {
            if (newValue instanceof Object[]) {
                Object[] values = (Object[]) newValue;                
                design.identity.att.update(att, values[0].toString(), design.data.findDataType(values[1].toString()));
            }
        }
    
        @Override
        public boolean deleteObject() {
            return design.identity.att.delete(att);
        }
    
        // Override to customize cell editor
        JPanel panel = null;
        JTextField field = null;
        JComboBox<String> combo = null;
    
        public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
            if (panel == null) {
                panel = new JPanel();
                panel.setLayout(new FlowLayout(0, 3, 0));
                panel.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel.setOpaque(false);
                panel.add(new JLabel(MyTreeCellEditor.pencilIcon));
                field = new JTextField(25);
                field.addKeyListener(this);
                panel.add(field);
                combo = new JComboBox<String>(design.data.typesMap.keySet().toArray(new String[] {}));
                combo.setFont(new Font("Dialog", Font.PLAIN, 12));
                combo.addKeyListener(this);
                panel.add(combo);
            }
            combo.setSelectedItem(att.getType().getEType().getName());
            field.setText(att.getName());
            return panel;
        }
    
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                stopEditing();
            }
        }
    
        @Override
        public void keyReleased(KeyEvent arg0) {
        }
    
        @Override
        public void keyTyped(KeyEvent arg0) {
        }
    
        // Override to customize cell editor
        public Object getCellEditorValue() {
            return new Object[] { field.getText(), combo.getSelectedItem() };
        }
    
    }

}
