package seckit.gui.design.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.lang.reflect.Constructor;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;

import data.type.CompositeType;
import data.DataDesignModel;
import data.type.DataTypePackage;
import data.type.PrimitiveType;
import data.type.impl.CompositeTypeImpl;
import data.impl.DataDesignModelImpl;
import data.type.impl.DataTypePackageImpl;
import data.type.impl.PrimitiveTypeImpl;
import data.instantiation.DataInstantiation;
import data.instantiation.impl.DataInstantiationImpl;
import seckit.SystemDesignViewpoint;
import seckit.gui.Icons;
import seckit.gui.MyTreeCellEditor;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;

public class DataDesignView extends DesignView {

    public DataDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Data", design, design.data);
        //
        legend.add(DataDesignModelImpl.class, "Model");
        legend.add(DataTypePackageImpl.class, "Package");
        legend.add(CompositeTypeImpl.class, "Data Type");
        legend.add(DataInstantiationImpl.class, "Attribute");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "data/";
        Icons.addIcon(DataDesignModelImpl.class, "model.png");
        Icons.addIcon(DataDesignView.class, p + "data-type.png");
        Icons.addIcon(DataTypePackageImpl.class, p + "data-model.png");
        Icons.addIcon(CompositeTypeImpl.class, p + "data-type.png");
        Icons.addIcon(PrimitiveTypeImpl.class, p + "data-type.png");
        Icons.addIcon(DataInstantiationImpl.class, p + "attribute.png");
    }

    
    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "dataDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Data Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Load .ecore model", DataTypePackageImpl.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Load .ecore model")) {
                JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fc.setCurrentDirectory(new File("./models"));
                int returnVal = fc.showOpenDialog(parentFrame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    design.data.createModelFromECore(null, fc.getSelectedFile().getAbsolutePath());
                }
            }
        }
    }
    
    
    class DataDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DataDesignModel model;

        //
        public DataDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (DataDesignModel) e;
        }

        @Override
        public void load() {
            loadFeatures("packages");
        }

        @Override
        public String getDisplayLabel() {
            if (model.getFilename() != null) {
                return model.getFilename();
            }
            return model.getDescription();
        }
        
        @Override
        public String getStatusLabel() {
          if (model.getUri() != null) {
              return model.getUri();
          }
          return getDisplayLabel();
        }

    };

    class DataTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DataTypePackage pkg;

        //
        public DataTypePackageImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pkg = (DataTypePackage) e;
        }

        @Override
        public void load() {
            loadFeatures("dataTypes");
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getEPackage().getName();
        }
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = super.getPopupMenu();
            // TODO: when closing, set all references to null if user agrees?
            // addItem(menu, "Close model", null);
            return menu;
        }
    };

    class PrimitiveTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        PrimitiveType c;

        //
        public PrimitiveTypeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            c = (PrimitiveType) e;
        }

        @Override
        public String getDisplayLabel() {
            return c.getEType().getName();
        }
    };

    class CompositeTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        CompositeType c;

        //
        public CompositeTypeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            c = (CompositeType) e;
        }

        @Override
        public void load() {
            loadFeatures("attributes");
        }

        @Override
        public String getDisplayLabel() {
            return c.getEType().getName();
        }
    };

    class DataInstantiationImplNode extends DataInstantiationNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public DataInstantiationImplNode(Node p, Element e) {
            super(DataDesignView.this, p, e);
        }
    };

    class EDataTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EDataType dt;

        //
        public EDataTypeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            dt = (EDataType) e;
        }

        @Override
        public String getDisplayLabel() {
            return dt.getName();
        }
    };

    static class DataInstantiationNode extends Node implements KeyListener {
        //
        private static final long serialVersionUID = 1L;
        DesignViewpointFactory design;
        DataInstantiation att;

        //
        public DataInstantiationNode(DesignView mv, Node p, Element e) {
            super(mv, p, e);
            this.design = mv.design;
            att = (DataInstantiation) e;
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
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
            Object[] values = (Object[]) newValue;
            att.setName(values[0].toString());
            att.setType(design.data.findDataType(values[1].toString()));
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
                view.stopEditing();
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
