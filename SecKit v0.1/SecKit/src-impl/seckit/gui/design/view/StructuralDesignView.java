package seckit.gui.design.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;

import models.Element;
import models.Model;
import seckit.SystemDesignViewpoint;
import seckit.gui.Icons;
import seckit.gui.MyTreeCellEditor;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;
import structure.StructuralDesignModel;
import structure.impl.StructuralDesignModelImpl;
import structure.instance.impl.ActionPointImpl;
import structure.instantiation.DelegatedInteractionPointParticipation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InteractionPointInstantiation;
import structure.instantiation.InteractionPointParticipationOfInstantiation;
import structure.instantiation.InteractionPointParticipationOfType;
import structure.instantiation.impl.DelegatedInteractionPointParticipationImpl;
import structure.instantiation.impl.EntityInstantiationImpl;
import structure.instantiation.impl.InteractionPointInstantiationImpl;
import structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl;
import structure.instantiation.impl.InteractionPointParticipationOfTypeImpl;
import structure.type.ActionPointType;
import structure.type.EntityType;
import structure.type.EntityTypePackage;
import structure.type.InteractionPointParticipationType;
import structure.type.InteractionPointType;
import structure.type.impl.ActionPointTypeImpl;
import structure.type.impl.EntityTypeImpl;
import structure.type.impl.EntityTypePackageImpl;
import structure.type.impl.InteractionPointParticipationTypeImpl;
import structure.type.impl.InteractionPointTypeImpl;
import structure.type.impl.LocationTypeImpl;

public class StructuralDesignView extends DesignView {

    static {
        String p = "structure/";
        Icons.addIcon(StructuralDesignView.class, p + "entity-type.png");
        Icons.addIcon(StructuralDesignModelImpl.class, "model.png");
        Icons.addIcon(EntityTypePackageImpl.class, p + "entity-package.png");
        Icons.addIcon(EntityTypeImpl.class, p + "entity-type.png");
        Icons.addIcon(InteractionPointParticipationOfTypeImpl.class, p + "interaction-part-inst.png");
        Icons.addIcon(EntityInstantiationImpl.class, p + "entity-inst.png");
        Icons.addIcon(InteractionPointParticipationOfInstantiationImpl.class, p + "interaction-part-inst.png");
        Icons.addIcon(DelegatedInteractionPointParticipationImpl.class, p + "interaction-part-delegation.png");
        Icons.addIcon(InteractionPointTypeImpl.class, p + "interaction-point-type.png");
        Icons.addIcon(InteractionPointInstantiationImpl.class, p + "interaction-point-inst.png");
        Icons.addIcon(InteractionPointParticipationTypeImpl.class, p + "interaction-part-type.png");
        Icons.addIcon(LocationTypeImpl.class, p + "location-type.png");
        Icons.addIcon(ActionPointTypeImpl.class, p + "action-point-type.png");
        Icons.addIcon(ActionPointImpl.class, p + "action-point-inst.png");
    }

    public StructuralDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Structure", design, design.structure);
        //
        legend.add(StructuralDesignModelImpl.class, "Model");
        legend.add(EntityTypePackageImpl.class, "Package");
        //
        legend.add("Entity");
        legend.add(EntityTypeImpl.class, "Type");
        legend.add(EntityInstantiationImpl.class, "Instantiation");
        //
        legend.add("Action Point");
        legend.add(ActionPointTypeImpl.class, "Type");
        legend.add(ActionPointImpl.class, "Instantiation");
        //
        legend.add("Interaction Point");
        legend.add(InteractionPointTypeImpl.class, "Type");
        legend.add(InteractionPointInstantiationImpl.class, "Instantiation");
        //
        legend.add("Interaction Participation");
        legend.add(InteractionPointParticipationTypeImpl.class, " Type");
        legend.add(InteractionPointParticipationOfTypeImpl.class, "Instantiation"); // of Entity, Type, and Instantiation
        // InteractionPointParticipationOfInstantiationImpl.class
        legend.add(DelegatedInteractionPointParticipationImpl.class, "Delegated");
        //
        legend.add("Location");
        legend.add(LocationTypeImpl.class, "Type");
        // legend.add(LocationInstantiationImpl.class, "Instantiation");
    }

    // Icons.addIcon(InteractionPointParticipationOfTypeImpl.class,
    // "interaction-part-inst.png");
    // Icons.addIcon(InteractionPointParticipationOfInstantiationImpl.class,
    // "interaction-part-inst.png");

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;
        
        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void load() {
            loadFeatures(viewpoint, "structuralDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Structural Models";
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
                design.structure.model.create(null);
            }
        }
        
    }
    
    class StructuralDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        StructuralDesignModel model;

        //
        public StructuralDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (StructuralDesignModel) e;
            //addReloadChildrenObserver(this, model, "entityTypePackages");            
            //addReloadChildrenObserver(this, model, "allowedEntityInstantiations");            
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "entityTypePackages",
                            "allowedEntityInstantiations"
            });
        }

        @Override
        public boolean deleteObject() {
            return design.structure.model.delete(model);
        }
        
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }

        @Override
        public void addDefaultChild() {
            actionPerformed("Add entity type package");
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add entity type package", EntityTypePackageImpl.class);
            addItem(menu, "Add allowed entity instantiation", EntityInstantiationImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //
            if (e.getActionCommand().equals("Add entity type package")) {
                design.structure.pkg.create(model, null);
                //
            } else if (e.getActionCommand().equals("Add allowed entity instantiation")) {
                //
                Map<String, EntityType> entityTypes = new HashMap<String, EntityType>();
                entityTypes.putAll(design.structure.entityType.getEntityTypes());
                if (entityTypes.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select type to instantiate", "Entity Instantiation",
                                    JOptionPane.PLAIN_MESSAGE, null, entityTypes.keySet().toArray(new String[] {}), null);
                    EntityType type = entityTypes.get(s);
                    if (type != null) {
                        // Entity Type selected
                        design.structure.entityInst.create(null, null, null, type);
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You must define entity types first");
                }
                //
            }
        }
    };

    class EntityTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EntityTypePackage pkg;

        //
        public EntityTypePackageImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            pkg = (EntityTypePackage) e;
            //addReloadChildrenObserver(this, pkg, "entityTypes");            
        }

        @Override
        public void load() {
            n(pkg.getSubPackages());
            n(pkg.getParticipationTypes());
            n(pkg.getActivityPointTypes());
            n(pkg.getLocationTypes());
            n(pkg.getEntityTypes());
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getName();
        }

        @Override
        public boolean deleteObject() {
            return design.structure.pkg.delete(pkg);
        }

        @Override
        public void setUserObject(Object newValue) {
            design.structure.pkg.updateName(pkg, newValue.toString());
        }

        @Override
        public void addDefaultChild() {
            actionPerformed("Add entity type");
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add entity type package", EntityTypePackageImpl.class);
            addItem(menu, "Add entity type", EntityTypeImpl.class);
            addItem(menu, "Add interaction point participation type", InteractionPointParticipationTypeImpl.class);
            addItem(menu, "Add action point type", ActionPointTypeImpl.class);
            // addItem(menu, "Add location type", LocationTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //
            if (e.getActionCommand().equals("Add entity type package")) {
                design.structure.pkg.create(pkg, null);

            } else if (e.getActionCommand().equals("Add entity type")) {
                design.structure.entityType.create(pkg, null);

            } else if (e.getActionCommand().equals("Add interaction point participation type")) {
                design.structure.ippType.create(pkg, null);

            } else if (e.getActionCommand().equals("Add action point type")) {
                design.structure.apType.create(pkg, null);

            } else if (e.getActionCommand().equals("Add location type")) {

            }

        }
    };

    class EntityTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EntityType type;

        //
        public EntityTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            type = (EntityType) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "containedInstantiations",
                            "activityPoints",
                            "interactionPointParticipations"
            });
        }

        @Override
        public String getDisplayLabel() {
            return type.getName()
            // + " ("+type.getInstantiations().size()+")"
            ;
        }

        @Override
        public boolean deleteObject() {
            return design.structure.entityType.delete(type); 
        }

        @Override
        public String getStatusLabel() {
            /*
             * TODO: find all assignments? DesignAssignmentRelation relation =
             * factory.viewpoint.getAssignmentRelation();
             * List<BehaviorTypeAssignment> assignments =
             * relation.getEntityTypeMap().get(type); if (assignments != null) {
             * return type.getName() +
             * " (assigned to "+assignments.size()+" behaviors)"; }
             */
            return type.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            design.structure.entityType.update(type, newValue.toString());
        }

        @Override
        public void drop(Node node) {
            if (node.getUserObject() instanceof EntityType) {
                EntityType droppedType = (EntityType) node.getUserObject();
                if (!droppedType.getId().equals(type.getId())) {
                    Node newNode = n(design.structure.entityInst.create(null, type, null, droppedType));
                    selectNode(newNode);
                }
            }
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add interaction point participation", InteractionPointParticipationOfTypeImpl.class);
            addItem(menu, "Add delegated participation", DelegatedInteractionPointParticipationImpl.class);
            addItem(menu, "Add entity instantiation", EntityInstantiationImpl.class);
            addItem(menu, "Add action point", ActionPointImpl.class);
            addItem(menu, "Add interaction point", InteractionPointTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add entity instantiation")) {
                //
                Map<String, EntityType> entityTypes = new HashMap<String, EntityType>();
                entityTypes.putAll(design.structure.entityType.getEntityTypes());
                // Avoid recursion for now
                entityTypes.remove(type.getName());
                if (entityTypes.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select type to instantiate", "Entity Instantiation",
                                    JOptionPane.PLAIN_MESSAGE, null, entityTypes.keySet().toArray(new String[] {}), null);
                    EntityType nType = entityTypes.get(s);
                    if (nType != null) {
                        // Entity Type selected
                        design.structure.entityInst.create(null, type, null, nType);
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You must define other entity types first");
                }
                //

            } else if (e.getActionCommand().equals("Add interaction point participation")) {
                //
                Map<String, InteractionPointParticipationType> ippTypes = design.structure.ippType.getIppTypes();
                if (ippTypes.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, 
                                    "Select type to instantiate", 
                                    "Interaction Point Participation Instantiation",
                                    JOptionPane.PLAIN_MESSAGE, null, ippTypes.keySet().toArray(new String[] {}), null);
                    InteractionPointParticipationType ippType = ippTypes.get(s);
                    if (ippType != null) {
                        // Entity Type selected
                        // InteractionPointParticipationOfType ippOfType =
                        design.structure.ippOfType.create(type, ippType, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You must define participation types first");
                }
                //

            } else if (e.getActionCommand().equals("Add interaction point")) {


                // design.structure.ipInstC.create(type, ipType, "", ippOfInsts)
                /*
                Map<String, InteractionPointParticipationOfInstantiation> ippOfInsts = new HashMap<String, InteractionPointParticipationOfInstantiation>();
                for (EntityInstantiation inst : type.getContainedInstantiations()) {
                    for (InteractionPointParticipationOfInstantiation ippOfInst : inst.getInteractionPointParticipations()) {
                        ippOfInsts.put(inst.getName() + " > " + ippOfInst.getParticipationOfType().getName(), ippOfInst);
                    }
                }
                if (ippOfInsts.size() >= 2) {

                    JList<String> list = new JList<String>(ippOfInsts.keySet().toArray(new String[] {}));
                    list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                    list.setLayoutOrientation(JList.VERTICAL);
                    list.setVisibleRowCount(3);
                    JScrollPane listScroller = new JScrollPane(list);
                    listScroller.setPreferredSize(new Dimension(250, 80));
                    listScroller.add(list);

                    JDialog dialog = new JDialog(parentFrame);
                    dialog.add(listScroller);
                    dialog.pack();
                    dialog.setVisible(true);

                    JOptionPane.showInputDialog(parentFrame, listScroller, "Select interaction participations", JOptionPane.PLAIN_MESSAGE);

                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select interaction participations", "Interaction Point Type",
                                    JOptionPane.PLAIN_MESSAGE, null, ippOfInsts.keySet().toArray(new String[] {}), null);
                    InteractionPointParticipationOfInstantiation ippOfInst = ippOfInsts.get(s);

                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You must define at least 2 interaction point participations first");
                }
                    */

            } else if (e.getActionCommand().equals("Add action point")) {

            }

        }
    };

    class InteractionPointParticipationTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionPointParticipationType ippType;

        //
        public InteractionPointParticipationTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            ippType = (InteractionPointParticipationType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return ippType.getName()
            // + " ("+ippType.getInstantiations().size()+")"
            ;
        }

        @Override
        public void setUserObject(Object newValue) {
            design.structure.ippType.update(ippType, newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.structure.ippType.delete(ippType);
        }
    };

    class InteractionPointTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionPointType ipType;

        //
        public InteractionPointTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            ipType = (InteractionPointType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return ipType.getName() + " : " + ipType.getParticipationType().getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            ipType.setName(newValue.toString());
        }
    };

    class InteractionPointInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionPointInstantiation ippInst;
        
        public InteractionPointInstantiationImplNode(Node p, Element e) {
            super(p, e);            
        }
        
        @Override
        public void configure(Element e) {
            ippInst = (InteractionPointInstantiation) e;
        }

        @Override
        public void drop(Node node) {
            Element e = (Element)node.getUserObject();            
            if (e instanceof InteractionPointParticipationOfInstantiation) {
                InteractionPointParticipationOfInstantiation ippOfInst = (InteractionPointParticipationOfInstantiation)e;
                design.structure.ipInst.addIppOfInst(ippInst, ippOfInst);
            }
        }
        
        @Override
        public void load() {
        }

        @Override
        public boolean deleteObject() {
            if (design.structure.ipInst.delete(ippInst)) {
                deleteNode();
                return true;
            }
            return false;
        }
        
        @Override
        public String getDisplayLabel() {
            boolean first = true;
            StringBuffer s = new StringBuffer();
            for (InteractionPointParticipationOfInstantiation ippOfInst : ippInst.getParticipations()) {
                if (first) {
                    first = false;
                } else {
                    s.append(",<br>");
                }
                if (ippOfInst.getEntityInstantiation() != null && ippOfInst.getParticipationOfType() != null) { 
                    s.append("&nbsp;&nbsp;&nbsp;"+ippOfInst.getEntityInstantiation().getName() + ">" + ippOfInst.getParticipationOfType().getName());
                }
            }
            if (first) {
                return "<html><b>" + ippInst.getName() + "</b> {}</html>";
            } else {
                return "<html><b>" + ippInst.getName() + "</b> {<br>" + s.toString() + "}</html>";
            }
        }
        
        
    }

    class ActionPointTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ActionPointType apType;

        //
        public ActionPointTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            apType = (ActionPointType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return apType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            apType.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.structure.apType.delete(apType);
        }
    };

    class EntityInstantiationImplNode extends ElementInnerNode implements KeyListener {
        //
        private static final long serialVersionUID = 1L;
        EntityInstantiation inst;

        //
        public EntityInstantiationImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            inst = (EntityInstantiation) e;
            addChangedObserver(inst.getType(), "name");
        }

        @Override
        public void load() {
            loadFeatures("interactionPointParticipations");
        }

        @Override
        public String getDisplayLabel() {
            if (inst.getType() == null) {
                return inst.getName() + " : null (" + DesignViewpointFactory.toString(inst.getMultiplicity()) + ")";
            }
            return inst.getName() + " : " + inst.getType().getName() + " (" + DesignViewpointFactory.toString(inst.getMultiplicity()) + ")";
        }

        @Override
        public void setUserObject(Object newValue) {
            // TODO: what if type changes? remove container interaction point
            // participations?
            // What if participations are used in interaction point? Just remove
            // them?
            // Not easy... :(
            Object[] values = (Object[]) newValue;
            //
            String newName = values[0].toString();
            //
            EntityType newType = null;
            if (!values[1].equals("null")) {
                newType = design.structure.entityType.find(values[1].toString());
            }
            //
            String newMultiplicity = values[2].toString();
            //
            design.structure.entityInst.update(inst, newName, newType, newMultiplicity);
            //
        }

        @Override
        public boolean deleteObject() {
            return design.structure.entityInst.delete(inst);
        }

        // Override to customize cell editor
        JPanel panel = null;
        JTextField field = null;
        JComboBox<String> typeCombo = null;
        JComboBox<String> multCombo = null;

        @Override
        public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
            panel = new JPanel();
            panel.setLayout(new FlowLayout(0, 3, 0));
            panel.setBorder(new EmptyBorder(0, 0, 0, 0));
            panel.setOpaque(false);
            panel.add(new JLabel(MyTreeCellEditor.pencilIcon));
            field = new JTextField(25);
            field.addKeyListener(this);
            panel.add(field);
            //
            Map<String, EntityType> entityTypes = new HashMap<String, EntityType>();
            entityTypes.putAll(design.structure.entityType.getEntityTypes());
            entityTypes.put("null", null);
            if (inst.getContainerType() != null) {
                // Only for contained instantiations, not for allowed
                // instantiations
                entityTypes.remove(inst.getContainerType().getName());
            }
            typeCombo = new JComboBox<String>(entityTypes.keySet().toArray(new String[] {}));
            typeCombo.setFont(new Font("Dialog", Font.PLAIN, 12));
            typeCombo.addKeyListener(this);
            panel.add(typeCombo);
            //
            multCombo = new JComboBox<String>(DesignViewpointFactory.multiplicities);
            multCombo.addKeyListener(this);
            panel.add(multCombo);
            //
            field.setText(inst.getName());
            if (inst.getType() == null) {
                typeCombo.setSelectedItem("null");
            } else {
                typeCombo.setSelectedItem(inst.getType().getName());
            }
            multCombo.setSelectedItem(DesignViewpointFactory.toString(inst.getMultiplicity()));
            return panel;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                view.stopEditing();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyTyped(KeyEvent e) {}

        // Override to customize cell editor
        public Object getCellEditorValue() {
            return new Object[] { field.getText(), typeCombo.getSelectedItem(), multCombo.getSelectedItem() };
        }

    };

    class InteractionPointParticipationOfInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionPointParticipationOfInstantiation ippOfInst;

        //
        public InteractionPointParticipationOfInstantiationImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            ippOfInst = (InteractionPointParticipationOfInstantiation) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            if (ippOfInst.getParticipationOfType() != null) {
                return ippOfInst.getParticipationOfType().getName();
            }
            return ippOfInst.getId();
        }
    };

    class DelegatedInteractionPointParticipationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DelegatedInteractionPointParticipation delegIppOfType;

        //
        public DelegatedInteractionPointParticipationImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            delegIppOfType = (DelegatedInteractionPointParticipation) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            if (delegIppOfType.getDelegatedTo().size() > 0) {
                InteractionPointParticipationOfInstantiation ippOfInst = delegIppOfType.getDelegatedTo().get(0);                
                if (ippOfInst != null) {
                    return delegIppOfType.getName() + " (" + ippOfInst.getEntityInstantiation().getName() + " : "
                                    + ippOfInst.getParticipationOfType().getName() + ")";
                }
            }
            return delegIppOfType.getName() + " (not delegated)";
        }
        
        @Override
        public boolean deleteObject() {
            if (design.structure.delegIppOfType.delete(delegIppOfType)) {
                deleteNode();
                return true;
            }
            return false;
        }

    };

    class InteractionPointParticipationOfTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionPointParticipationOfType ippOfType;

        //
        public InteractionPointParticipationOfTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            ippOfType = (InteractionPointParticipationOfType) e;
        }

        @Override
        public void load() {
        }

        @Override
        public boolean deleteObject() {
            return design.structure.ippOfType.delete(ippOfType); 
        }
        
        @Override
        public String getDisplayLabel() {
            return ippOfType.getName()
            // + " ("+ippOfType.getParticipationOfInstantiation().size()+")"
            ;
        }

        @Override
        public void setUserObject(Object newValue) {
            ippOfType.setName(newValue.toString());
        }
    };

}
