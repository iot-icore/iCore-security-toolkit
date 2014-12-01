package seckit.gui.design.view;

import identity.instantiation.IdentityInstantiation;
import identity.instantiation.impl.IdentityInstantiationImpl;

import java.awt.event.ActionEvent;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import models.Model;
import models.Element;
import models.variable.VariableDeclaration;
import data.instantiation.DataInstantiation;
import data.instantiation.impl.DataInstantiationImpl;
import data.type.impl.DataTypePackageImpl;
import data.variable.impl.DataInstanceVariableImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.design.view.DataDesignView.DataInstantiationNode;
import structure.type.EntityType;
import behavior.BehaviorDesignModel;
import behavior.constraint.Constraint;
import behavior.constraint.DataEstablishment;
import behavior.constraint.IdentityEstablishment;
import behavior.constraint.impl.DataEstablishmentImpl;
import behavior.constraint.impl.IdentityEstablishmentImpl;
import behavior.impl.BehaviorDesignModelImpl;
import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.InteractionContributionOfInstantiation;
import behavior.instantiation.InteractionContributionOfType;
import behavior.instantiation.InteractionInstantiation;
import behavior.instantiation.impl.ActionInstantiationImpl;
import behavior.instantiation.impl.BehaviorInstantiationImpl;
import behavior.instantiation.impl.DelegatedInteractionContributionImpl;
import behavior.instantiation.impl.EntryPointOfInstantiationImpl;
import behavior.instantiation.impl.EntryPointOfTypeImpl;
import behavior.instantiation.impl.ExitPointOfInstantiationImpl;
import behavior.instantiation.impl.ExitPointOfTypeImpl;
import behavior.instantiation.impl.FlowPointInstantiationImpl;
import behavior.instantiation.impl.InteractionContributionInstantiationImpl;
import behavior.instantiation.impl.InteractionContributionOfInstantiationImpl;
import behavior.instantiation.impl.InteractionContributionOfTypeImpl;
import behavior.instantiation.impl.InteractionInstantiationImpl;
import behavior.type.AbstractBehaviorType;
import behavior.type.ActionType;
import behavior.type.BehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.FlowPointType;
import behavior.type.InteractionContributionType;
import behavior.type.InteractionType;
import behavior.type.impl.ActionTypeImpl;
import behavior.type.impl.BehaviorTypePackageImpl;
import behavior.type.impl.EntryPointTypeImpl;
import behavior.type.impl.ExitPointTypeImpl;
import behavior.type.impl.FlowPointTypeImpl;
import behavior.type.impl.InteractionContributionTypeImpl;
import behavior.type.impl.InteractionTypeImpl;
import behavior.type.impl.BehaviorTypeImpl;

public class BehaviorDesignView extends DesignView {

    public BehaviorDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Behavior", design, design.behavior);

        legend.add(BehaviorDesignModelImpl.class, "Model");
        legend.add(BehaviorTypePackageImpl.class, "Package");
        legend.add(IdentityInstantiationImpl.class, "Identity instantiation");
        legend.add(DataInstantiationImpl.class, "Data instantiation");
        legend.add(DataInstanceVariableImpl.class, "Variable");
        //
        legend.add("Behavior");
        legend.add(BehaviorTypeImpl.class, "Type");
        legend.add(BehaviorInstantiationImpl.class, "Instantiation");
        //
        legend.add("Action");
        legend.add(ActionTypeImpl.class, "Type");
        legend.add(ActionInstantiationImpl.class, "Instantiation");
        //
        legend.add("Interaction Contribution");
        legend.add(InteractionContributionTypeImpl.class, "Type");
        legend.add(InteractionContributionInstantiationImpl.class, "Instantiation");
        //
        legend.add("Interaction");
        legend.add(InteractionTypeImpl.class, "Type");
        legend.add(InteractionInstantiationImpl.class, "Instantiation");
        //
        legend.add("Flow Point Type");
        legend.add(EntryPointTypeImpl.class, "Entry");
        legend.add(ExitPointTypeImpl.class, "Exit");
        //
        legend.add("Flow Point Instantiation");
        legend.add(EntryPointOfInstantiationImpl.class, "Entry");
        legend.add(ExitPointOfInstantiationImpl.class, "Exit");
        
        //
        /*
         * legend.add(InteractionContributionOfInstantiationImpl.class,
         * "IC of inst"); legend.add(InteractionContributionOfTypeImpl.class,
         * "IC of type"); legend.add(DelegatedInteractionContributionImpl.class,
         * "Delegated IC");
         */
        //
        /*
         * legend.add(FlowPointTypeImpl.class, "Flow point type");
         * legend.add(FlowPointInstantiationImpl.class, "Flow point inst");
         * legend.add(EntryPointTypeImpl.class, "Entry point type");
         * legend.add(EntryPointOfInstantiationImpl.class,
         * "Entry point of inst"); legend.add(EntryPointOfTypeImpl.class,
         * "Entry point of type"); // legend.add(ExitPointTypeImpl.class,
         * "Exit point type"); legend.add(ExitPointOfInstantiationImpl.class,
         * "Exit point of inst"); legend.add(ExitPointOfTypeImpl.class,
         * "Exit point of type");
         */
        //
    }

    //
    // BehaviorPackageStructure
    // - Sub packages
    // - Interaction Contribution Types
    // - Data Instantiations
    // - Behavior Types
    // + Contained instantiations
    // + Interaction Contribution of Type
    // - Behavior Instantiations
    // + Interaction Contribution of Instantiation
    //

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "behavior/";
        //
        Icons.addIcon(BehaviorDesignView.class, p+"behavior-type.png");
        //
        Icons.addIcon(BehaviorDesignModelImpl.class, "model.png");
        Icons.addIcon(BehaviorTypePackageImpl.class, p + "behavior-package.png");
        // Icons.addIcon(BehaviorTypeImpl.class, p+"behavior-type.png");
        Icons.addIcon(BehaviorTypeImpl.class, p + "behavior-type.png");
        //
        Icons.addIcon(BehaviorInstantiationImpl.class, p + "behavior-inst.png");
        //
        Icons.addIcon(DataInstanceVariableImpl.class, "variable-declaration.png");
        //
        Icons.addIcon(InteractionContributionInstantiationImpl.class, p + "interaction-contribution-inst.png");
        Icons.addIcon(InteractionContributionOfInstantiationImpl.class, p + "interaction-contribution-inst.png");
        Icons.addIcon(InteractionContributionOfTypeImpl.class, p + "interaction-contribution-inst.png");
        Icons.addIcon(DelegatedInteractionContributionImpl.class, p + "delegated-interaction-contribution.png");
        //
        Icons.addIcon(ActionTypeImpl.class, p + "action-type.png");
        Icons.addIcon(ActionInstantiationImpl.class, p + "action-inst.png");
        //
        Icons.addIcon(FlowPointTypeImpl.class, p + "flow-point-type.png");
        Icons.addIcon(FlowPointInstantiationImpl.class, p + "flow-point-type.png");
        //
        Icons.addIcon(EntryPointTypeImpl.class, p + "entry-point-type.png");
        Icons.addIcon(EntryPointOfInstantiationImpl.class, p + "entry-point-inst.png");
        Icons.addIcon(EntryPointOfTypeImpl.class, p + "entry-point-inst.png");
        //
        Icons.addIcon(ExitPointTypeImpl.class, p + "exit-point-type.png");
        Icons.addIcon(ExitPointOfInstantiationImpl.class, p + "exit-point-inst.png");
        Icons.addIcon(ExitPointOfTypeImpl.class, p + "exit-point-inst.png");
        //
        Icons.addIcon(InteractionTypeImpl.class, p + "interaction-type.png");
        Icons.addIcon(InteractionInstantiationImpl.class, p + "interaction-inst.png");
        Icons.addIcon(InteractionContributionTypeImpl.class, p + "interaction-contribution-type.png");
        //
        Icons.addIcon(DataInstantiationImpl.class, "data/data-instantiation.png");
        Icons.addIcon(DataEstablishmentImpl.class, "data/data-instantiation.png");
        //
        Icons.addIcon(IdentityInstantiationImpl.class, "identity/identity-inst.png");
        Icons.addIcon(IdentityEstablishmentImpl.class, "identity/identity-inst.png");
        //

    }
    
    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(design.viewpoint, "behaviorDesignModels");
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
                // node = ...;
            }
        }
    }    

    class BehaviorDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        BehaviorDesignModel model;
        //
        public BehaviorDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (BehaviorDesignModel) e;
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
        public void addDefaultChild() {
            actionPerformed("Add behavior type package");
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add behavior type package", BehaviorTypePackageImpl.class);
            return menu;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add behavior type package")) {
                design.behavior.typePackage.create(model, null, null);
            }
        }
    };

    class BehaviorTypePackageImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        BehaviorTypePackage pkg;
        
        public BehaviorTypePackageImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }
        @Override
        public void configure(Element e) {
            pkg = (BehaviorTypePackage) e;
        }
        @Override
        public void load() {
            loadFeatures(new String[] {"subPackages", "behaviorTypes", "dataProducerTypes"});
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
        public boolean deleteObject() {
            return design.behavior.typePackage.delete(pkg);
        }
        @Override
        public void addDefaultChild() {
            actionPerformed("Add behavior type package");
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add behavior type package", BehaviorTypePackageImpl.class);
            addItem(menu, "Add behavior type", BehaviorTypeImpl.class);
            /*
             * addItem(menu, "Add monolithic behavior type",
             * MonolithicBehaviorTypeImpl.class); addItem(menu,
             * "Add structured behavior type",
             * StructuredBehaviorTypeImpl.class);
             */
            addItem(menu, "Add interaction contribution type", InteractionContributionTypeImpl.class);
            addItem(menu, "Add action type", ActionTypeImpl.class);
            addItem(menu, "Add flow point type", FlowPointTypeImpl.class);
            return menu;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // Sub-classes must observe the popup menu actions

            if (e.getActionCommand().equals("Add behavior type package")) {
                design.behavior.typePackage.create(pkg.getModel(), pkg, null);
                //
                /*
                 * structuralModelView.reloadTree(); AssignmentRelations rels =
                 * design.behavior.getDesignViewpoint().getAssignmentRelations();
                 * EntityTypePackage ePkg =
                 * rels.getBehaviorTypePackageMap().get(
                 * nPkg).getEntityTypePackage(); logger.info(""+ePkg); Node n2 =
                 * objectToNodes.get(ePkg);
                 * structuralModelView.treePanel.selectNode(n2);
                 */
                //

            } else if (e.getActionCommand().equals("Add behavior type")) {

                // Select entity type to assign
                EntityType entityType = null;
                Map<String, EntityType> typesMap = design.structure.entityType.getEntityTypes();
                if (typesMap.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select entity type to assign to", "Entity Type", JOptionPane.PLAIN_MESSAGE,
                                    null, typesMap.keySet().toArray(new String[] {}), null);
                    entityType = typesMap.get(s);
                    if (entityType != null) {
                        // Entity type selected
                        design.behavior.behaviorType.create(pkg, null, entityType);

                        // Add option to automatically create a new type?
                        /*
                         * structuralModelView.reloadTree(); AssignmentRelations
                         * relations =
                         * design.behavior.getDesignViewpoint().getAssignmentRelations
                         * (); EntityType entityType =
                         * relations.getBehaviorTypeMap
                         * ().get(behaviorType).getEntityType(); Node n =
                         * objectToNodes.get(entityType.getId());
                         * structuralModelView.treePanel.selectNode(n);
                         */
                        //

                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You must define entity types first!");
                }

            } else if (e.getActionCommand().equals("Add action type")) {
                design.behavior.actionType.create(pkg, null);

            } else if (e.getActionCommand().equals("Add flow point type")) {

                Object[] possibilities = { "entry", "exit" };
                String s = (String) JOptionPane.showInputDialog(parentFrame, "Flow point type:", "Add Flow Point Type", JOptionPane.PLAIN_MESSAGE, null,
                                possibilities, "entry");

                // If a string was returned, say so.
                if ((s != null) && (s.length() > 0)) {

                    FlowPointType fpType;

                    if (s.equals("entry")) {
                        design.behavior.flowPointType.createEntryPointType(pkg, null);
                    } else {
                        design.behavior.flowPointType.createExitPointType(pkg, null);
                    }

               }
                //

            }
        }
    }

    class InteractionContributionTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionContributionType icType;
        //
        public InteractionContributionTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }
        @Override
        public void configure(Element e) {
            icType = (InteractionContributionType) e;
        }
        
        @Override
        public void load() {
            loadFeatures("constraints");
        }
        
        @Override
        public String getDisplayLabel() {
            StringBuffer s = new StringBuffer();
            boolean first = true;
            for (Constraint c : icType.getConstraints()) {
                
                if (first) {
                    first = false;
                } else {
                    s.append(", ");
                }
                
                if (c instanceof IdentityEstablishment) {
                    s.append(((IdentityEstablishment)c).getTarget().getName());
                } else if (c instanceof DataEstablishment) {
                    s.append(((DataEstablishment)c).getTarget().getName());
                }
                
            }

            if (s.length() > 0) {
                return icType.getRole() + " {" + s.toString() + "}";
            }
            return icType.getRole();
        }
        @Override
        public void setUserObject(Object newValue) {
            icType.setRole(newValue.toString());
        }
        @Override
        public boolean deleteObject() {            
            return design.behavior.icType.delete(icType);
        }
    };

    class DataEstablishmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DataEstablishment ve;
        //
        public DataEstablishmentImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            ve = (DataEstablishment)e;
        }
        
        @Override
        public void load() {
        }
        
        @Override
        public String getDisplayLabel() {
            return ve.getTarget().getName();
        }
    };

    class IdentityEstablishmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IdentityEstablishment ve;
        //
        public IdentityEstablishmentImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            ve = (IdentityEstablishment)e;
        }
        @Override
        public void load() {
        }
        
        @Override
        public String getDisplayLabel() {
            return ve.getTarget().getName();
        }
    };
    
    class BehaviorTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        BehaviorType behaviorType;

        //
        public BehaviorTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        // structuredType.setName(newValue.toString());
        @Override
        public void configure(Element e) {
            behaviorType = (BehaviorType) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "variableDeclarations",
                            "containedInstantiations",
                            "contributions",
                            "interactions",
                            "actions"
            });
        }

        @Override
        public String getDisplayLabel() {
            return behaviorType.getName();
        }

        @Override
        public String getStatusLabel() {
            if (behaviorType.getEntityType() == null) {
                return behaviorType.getName() + " (not assigned)";
            }
            return behaviorType.getName() + " (assigned to " + behaviorType.getEntityType().getName() + ")";
        }

        @Override
        public void setUserObject(Object newValue) {
            behaviorType.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.behaviorType.delete(behaviorType);
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add behavior instantiation", BehaviorInstantiationImpl.class);
            // addItem(menu, "Add recursive behavior instantiation",
            // BehaviorInstantiationImpl.class);
            addItem(menu, "Add interaction contribution", InteractionContributionOfTypeImpl.class);
            addItem(menu, "Add delegated contribution", DelegatedInteractionContributionImpl.class);
            addItem(menu, "Add interaction type", InteractionTypeImpl.class);
            addItem(menu, "Add action instantiation", ActionInstantiationImpl.class);
            addItem(menu, "Add flow point (entry/exit)", FlowPointInstantiationImpl.class);

            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("Add behavior instantiation")) {
                Map<String, AbstractBehaviorType> behaviorTypes = new HashMap<String, AbstractBehaviorType>();
                for (AbstractBehaviorType type : design.behavior.behaviorType.getBehaviorTypes().values()) {
                    // TODO: allow behavior recursion? Allow cross/circular
                    // references? A type instantiates B, B type instantiates A
                    if (!type.getId().equals(behaviorType.getId())) {
                        behaviorTypes.put(type.getName(), type);
                    }
                }
                if (behaviorTypes.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select type to instantiate", "Behavior Instantiation",
                                    JOptionPane.PLAIN_MESSAGE, null, behaviorTypes.keySet().toArray(new String[] {}), null);
                    AbstractBehaviorType type = behaviorTypes.get(s);
                    if (type != null) {
                        // Behavior Type selected
                        // TODO: select a behavior instantiation to assign to!
                        design.behavior.behaviorInstantiation.create(behaviorType, null, (BehaviorType) type, null);
                        //
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You should define at least one additional behavior type first");
                }
                //

            } else if (e.getActionCommand().equals("Add interaction contribution")) {

                Map<String, InteractionContributionType> icTypes = new HashMap<String, InteractionContributionType>();
                for (InteractionType iType : design.behavior.interactionType.getInteractionTypes().values()) {
                    for (InteractionContributionType icType : iType.getContributionTypes()) {
                        // TODO: prefix interaction type?
                        icTypes.put(iType.getName() + " > " + icType.getRole(), icType);
                    }
                }
                
                if (icTypes.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(
                                    parentFrame, 
                                    "Select type to instantiate", 
                                    "Behavior Instantiation",
                                    JOptionPane.PLAIN_MESSAGE, 
                                    null, 
                                    icTypes.keySet().toArray(new String[] {}), null);
                    InteractionContributionType icType = icTypes.get(s);
                    if (icType != null) {
                        design.behavior.icOfType.create(behaviorType, icType);
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You should define interaction contribution types first");
                }

                /*
                 * AssignmentRelations relations =
                 * factoryUtil.getDesignViewpoint().getAssignmentRelations();
                 * BehaviorTypeAssignment typeAssignment =
                 * relations.getBehaviorTypeMap().get(structuredType);
                 * InteractionContributionOfTypeAssignment icOfTypeAssignment =
                 * typeAssignment.getInteractionContributionMap().get(icOfType);
                 * BehaviorInstantiationAssignment instAssignment =
                 * typeAssignment
                 * .getBehaviorInstantiationMap().get(behaviorInst);
                 * structuralModelView.reloadTree(); Node n =
                 * objectToNodes.get(instAssignment
                 * .getEntityInstantiation().getId());
                 * structuralModelView.treePanel.selectNode(n);
                 */

                // TODO: Add the contribution to all existing instantiations
                // the same when deleting

            } else if (e.getActionCommand().equals("Add delegated contribution")) {

                Map<String, InteractionContributionOfInstantiation> contributionsMap = design.behavior.behaviorType.getAllContributionsOfContainedTypes(behaviorType);
                if (contributionsMap.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select contribution to delegate to:", "Delegated contribution",
                                    JOptionPane.PLAIN_MESSAGE, null, contributionsMap.keySet().toArray(new String[] {}), null);
                    logger.trace("Selected contribution: " + s);
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "There are no contained contributions to delegate to");
                }

            } else if (e.getActionCommand().equals("Add interaction type")) {

            }

        }
    };

    public class BehaviorInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        BehaviorInstantiation inst;

        //
        public BehaviorInstantiationImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            inst = (BehaviorInstantiation) e;
            addChangedObserver(inst.getType(), "name");
        }

        @Override
        public void load() {
            loadFeatures("contributions");
        }

        @Override
        public String getDisplayLabel() {
            return inst.getName() + " : " + inst.getType().getName();
        }

        @Override
        public String getEditLabel() {
            return inst.getName();
        }

        /*
         * @Override public String getStatusLabel() { AssignmentRelations
         * relations = design.behavior.getDesignViewpoint().getAssignmentRelations();
         * BehaviorTypeAssignment assignment =
         * relations.getBehaviorTypeMap().get(inst.getContainerType());
         * BehaviorInstantiationAssignment instAss =
         * assignment.getBehaviorInstantiationMap().get(inst); return
         * inst.getName() +
         * " (assigned to "+instAss.getEntityInstantiation().getContainerType
         * ().getName() +":"+instAss.getEntityInstantiation().getName()+")"; }
         */
        @Override
        public void setUserObject(Object newValue) {
            inst.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.behaviorInstantiation.delete(inst);
        }
    };

    class InteractionContributionOfTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionContributionOfType icOfType;

        //
        public InteractionContributionOfTypeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            icOfType = (InteractionContributionOfType) e;
        }

        @Override
        public String getDisplayLabel() {            
            return icOfType.getRole() + " (" + icOfType.getType().getInteractionType().getName() + ":" + icOfType.getType().getRole()+")";
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.icOfType.delete(icOfType);
        }

        /*
         * @Override public String getStatusLabel() { AssignmentRelations
         * relations = design.behavior.getDesignViewpoint().getAssignmentRelations();
         * BehaviorTypeAssignment typeAssignment =
         * relations.getBehaviorTypeMap().get(icOfType.getBehaviorType());
         * InteractionContributionOfTypeAssignment icOfTypeAssignment =
         * typeAssignment.getInteractionContributionMap().get(icOfType);
         * AbstractInteractionPointParticipationOfType ippOfType =
         * icOfTypeAssignment.getInteractionPointParticipation(); if (ippOfType
         * != null) { return icOfType.getRole() +
         * " (assigned to "+ippOfType.getEntityType
         * ().getName()+" > "+ippOfType.getName()+")"; } return
         * icOfType.getRole() + " (not assigned)"; }
         */
    };

    class DelegatedInteractionContributionImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DelegatedInteractionContribution delegIc;

        public DelegatedInteractionContributionImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            delegIc = (DelegatedInteractionContribution) e;
        }

        @Override
        public String getDisplayLabel() {
            // TODO: may be delegated to many contributions, which must all
            // complete to enable it.
            InteractionContributionOfInstantiation icOfInst = delegIc.getDelegatedTo().get(0);
            return delegIc.getType().getRole() + " (" + 
                            icOfInst.getBehaviorInstantiation().getName() + ":" + 
                            icOfInst.getContributionOfType().getType().getRole() + ")";
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.icOfType.delete(delegIc);
        }
        /*
         * @Override public String getStatusLabel() { // TODO: this is exactly
         * like interaction contribution of type node AssignmentRelations
         * relations = design.behavior.getDesignViewpoint().getAssignmentRelations();
         * BehaviorTypeAssignment typeAssignment =
         * relations.getBehaviorTypeMap().get(delegIc.getBehaviorType());
         * InteractionContributionOfTypeAssignment icOfTypeAssignment =
         * typeAssignment.getInteractionContributionMap().get(delegIc);
         * AbstractInteractionPointParticipationOfType ippOfType =
         * icOfTypeAssignment.getInteractionPointParticipation(); if (ippOfType
         * != null) { return delegIc.getRole() +
         * " (assigned to "+ippOfType.getEntityType
         * ().getName()+" > "+ippOfType.getName()+")"; } return
         * delegIc.getRole() + " (not assigned)"; }
         */
    };

    class InteractionContributionOfInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionContributionOfInstantiation icOfInst;

        //
        public InteractionContributionOfInstantiationImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            icOfInst = (InteractionContributionOfInstantiation) e;
        }

        @Override
        public String getDisplayLabel() {
            return icOfInst.getContributionOfType().getRole();
            // +
            // " : "
            // +
            // icOfInst.getInteractionContributionOfType().getType().getName();
        }

        /*
        @Override
        public String getStatusLabel() {
            return getDisplayLabel();
            AbstractInteractionContributionOfType icOfType = icOfInst.getInteractionContributionOfType();
            AbstractInteractionPointParticipationOfType ippOfType = icOfType.getInteractionPointParticipation();
            if (ippOfType != null) {
                return icOfType.getRole() + " (assigned to " + ippOfType.getName() + ")";
            }
            return icOfType.getRole() + " (not assigned)";
        }
        */
    };

    class InteractionTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionType iType;

        //
        public InteractionTypeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            iType = (InteractionType) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "identityInstantiations",
                            "dataInstantiations",
                            "contributionTypes"});
        }

        @Override
        public String getDisplayLabel() {
            return iType.getName();
        }
        
        @Override
        public boolean deleteObject() {
            return design.behavior.interactionType.delete(iType);
        }

        /*
        if (e.getActionCommand().equals("Add interaction contribution type")) {
        InteractionContributionType icType = design.behavior.icType.create(pkg, null);
        node = n(icType);
        //
        */
        
    };
    
    class InteractionInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        InteractionInstantiation iInst;
        
        public InteractionInstantiationImplNode(Node p, Element e) {
            super(p, e);            
        }
        
        @Override
        public void configure(Element e) {
            iInst = (InteractionInstantiation) e;
        }

        @Override
        public void load() {
            loadFeatures("contributions");
        }

        /*
        @Override
        public String getDisplayLabel() {
            return iInst.getName() + " : " + iInst.getType().getName();
        }
        */
        
        @Override
        public String getDisplayLabel() {            
            boolean first = true;
            StringBuffer s = new StringBuffer();
            for (InteractionContributionOfInstantiation icOfInst : iInst.getContributions()) {
                if (first) {
                    first = false;
                } else {
                    s.append(",<br>");
                }
                s.append("&nbsp;&nbsp;&nbsp;"+icOfInst.getBehaviorInstantiation().getName() + " > "
                  + icOfInst.getContributionOfType().getRole());
                // s.append(icOfInst.getBehaviorInstantiation().getName());
            }
            return "<html><b>" + iInst.getName() + "</b>:"+iInst.getType().getName()+" {<br>" + s.toString() + "}</html>";
        }
    
        
        
    }

    class FlowPointTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        FlowPointType fpType;

        //
        public FlowPointTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            fpType = (FlowPointType) e;
        }

        @Override
        public void load() {
            loadFeatures("dataInstantiations");
        }

        @Override
        public String getDisplayLabel() {
            return fpType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            fpType.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.flowPointType.delete(fpType);
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add attribute", DataInstantiationImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add attribute")) {
                // TODO: select data type?
                design.behavior.dataInstantiation.create(fpType, null, design.data.findDataType("EString"));
            }

        }

    };

    class EntryPointTypeImplNode extends FlowPointTypeImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public EntryPointTypeImplNode(Node p, Element e) {
            super(p, e);
        }
    };

    class ExitPointTypeImplNode extends FlowPointTypeImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public ExitPointTypeImplNode(Node p, Element e) {
            super(p, e);
        }
    };

    class ActionTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ActionType aType;

        //
        public ActionTypeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            aType = (ActionType) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "identityInstantiations", 
                            "dataInstantiations", 
                            "constraints"});
        }

        @Override
        public String getDisplayLabel() {
            return aType.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            aType.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.actionType.delete(aType);
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add attribute", DataInstantiationImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add attribute")) {
                // TODO: select data type?
                design.behavior.dataInstantiation.create(aType, null, design.data.findDataType("EString"));
            }
        }

    };

    class ActionInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ActionInstantiation inst;

        //
        public ActionInstantiationImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            inst = (ActionInstantiation) e;
        }

        @Override
        public String getDisplayLabel() {
            return inst.getName() + " : " + inst.getType().getName();
        }

        @Override
        public String getEditLabel() {
            // TODO: edit the action type as well
            return inst.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            inst.setName(newValue.toString());
        }

        @Override
        public boolean deleteObject() {
            return design.behavior.actionInstantiation.delete(inst);
        }
    };

    class DataInstantiationImplNode extends DataInstantiationNode {
        //
        private static final long serialVersionUID = 1L;
        DataInstantiation dataInst;

        //
        public DataInstantiationImplNode(Node p, Element e) {
            super(BehaviorDesignView.this, p, e);
        }

        @Override
        public void configure(Element e) {
            dataInst = (DataInstantiation) e;
        }

        @Override
        public String getDisplayLabel() {
            if (dataInst.getType().getEType() != null) {
                if (dataInst.isArray()) {
                    return dataInst.getName() + " : " + dataInst.getType().getEType().getName() + "[]";
                }
                return dataInst.getName() + " : " + dataInst.getType().getEType().getName();
            }
            return dataInst.getName() + " : " + dataInst.getType();
        }

        @Override
        public String getEditLabel() {
            return dataInst.getName();
        }
    }

    class IdentityInstantiationImplNode extends ElementInnerNode {
        //
        static final long serialVersionUID = 1L;
        private IdentityInstantiation inst;

        //
        public IdentityInstantiationImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            inst = (IdentityInstantiation) e;
        }

        @Override
        public String getDisplayLabel() {
            // Display value
            if (inst.isArray()) {
                return inst.getName() + " : " + inst.getType().getName()+"[]";
            }
            return inst.getName() + " : " + inst.getType().getName();
        }
    };

    class VariableDeclarationNode extends ElementInnerNode {
        //
        static final long serialVersionUID = 1L;
        private VariableDeclaration var;

        //
        public VariableDeclarationNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            var = (VariableDeclaration) e;
        }

        @Override
        public String getDisplayLabel() {
            // Display value
            return var.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            var.setName(newValue.toString());
        }
    };

    class DataInstanceVariableImplNode extends VariableDeclarationNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public DataInstanceVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };

}
