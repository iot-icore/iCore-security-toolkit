package seckit.gui.design.controller;

import identity.IdentityFactory;
import identity.IdentityInstanceVariable;
import identity.instantiation.IdentityInstantiation;
import identity.type.IdentityType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Model;
import models.variable.VariableDeclaration;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import data.type.DataType;
import data.instantiation.DataInstantiation;
import behavior.pattern.ActionPattern;
import behavior.pattern.BehaviorPattern;
import rule.event.EventModality;
import rule.template.RuleTemplate;
import structure.pattern.EntityPattern;
import behavior.pattern.ActivityPattern;
import behavior.pattern.InteractionContributionPattern;
import behavior.pattern.InteractionPattern;
import behavior.pattern.PatternFactory;
import seckit.gui.Node;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InteractionPointParticipationOfType;
import structure.type.EntityType;
import utils.ecore.ECoreUtils;
import behavior.BehaviorDesignModel;
import behavior.BehaviorFactory;
import behavior.causality.CausalityParameter;
import behavior.constraint.ConstraintFactory;
import behavior.constraint.DataEstablishment;
import behavior.constraint.DataEstablishmentFromVariable;
import behavior.constraint.IdentityEstablishment;
import behavior.constraint.IdentityEstablishmentFromVariable;
import behavior.event.ActivityEventPattern;
import behavior.event.BehaviorEventPattern;
import behavior.event.BehaviorLifecycle;
import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.ActivityInstantiation;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.InstantiationFactory;
import behavior.instantiation.InteractionContributionOfInstantiation;
import behavior.instantiation.InteractionContributionOfType;
import behavior.instantiation.InteractionInstantiation;
import behavior.type.AbstractBehaviorType;
import behavior.type.ActionType;
import behavior.type.ActivityType;
import behavior.type.BehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.DataProducerType;
import behavior.type.EntryPointType;
import behavior.type.ExitPointType;
import behavior.type.FlowPointType;
import behavior.type.InteractionContributionType;
import behavior.type.InteractionType;
import behavior.type.MonolithicBehaviorType;
import behavior.type.TypeFactory;

public class BehaviorDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(BehaviorDesignController.class);
    
    public BehaviorTypePackageController typePackage;
    public BehaviorTypeController behaviorType;
    public BehaviorInstantiationController behaviorInstantiation;
    public InteractionContributionTypeController icType;
    public InteractionContributionOfTypeController icOfType;
    public InteractionContributionOfInstantiationController icOfInst;
    public ActionTypeController actionType;
    public ActionInstantiationController actionInstantiation;
    public InteractionTypeController interactionType;
    public InteractionInstantiationController interactionInstantiation;
    public FlowPointTypeController flowPointType;
    public DataInstantiationController dataInstantiation;
    public IdentityInstantiationController identityInstantiation;
    public BehaviorPatternController behaviorPattern;
    public ActivityPatternController activityPattern;
    public EventPatternController event;

    public BehaviorDesignController(DesignViewpointFactory design) {
        super("Behavior", design);
        //
        typePackage = new BehaviorTypePackageController();
        behaviorType = new BehaviorTypeController();
        behaviorInstantiation = new BehaviorInstantiationController();
        icType = new InteractionContributionTypeController();
        icOfType = new InteractionContributionOfTypeController();
        icOfInst = new InteractionContributionOfInstantiationController();
        actionType = new ActionTypeController();
        actionInstantiation = new ActionInstantiationController();
        interactionType = new InteractionTypeController();
        interactionInstantiation = new InteractionInstantiationController();
        flowPointType = new FlowPointTypeController();
        dataInstantiation = new DataInstantiationController();
        identityInstantiation = new IdentityInstantiationController();
        behaviorPattern = new BehaviorPatternController();
        activityPattern = new ActivityPatternController();
        event = new EventPatternController();
    }

    public BehaviorDesignModel createModel(String desc) {
        BehaviorDesignModel model = BehaviorFactory.eINSTANCE.createBehaviorDesignModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        design.viewpoint.getBehaviorDesignModels().add(model);
        return model;
    }

    public void loadModel() {
        // models = design.viewpoint.getBehaviorDesignModels();
        /*
        behaviorType.resetMap();
        behaviorType.load(model.getPackages());        
        //
        actionType.resetMap();
        actionType.load(model.getPackages());
        //
        interactionType.resetMap();
        interactionType.load(model.getPackages());
        */
    }

    public class BehaviorTypePackageController extends ElementController {
        
        public BehaviorTypePackage create(BehaviorDesignModel model, BehaviorTypePackage superPkg, String name) {
            BehaviorTypePackage pkg = TypeFactory.eINSTANCE.createBehaviorTypePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);

            if (superPkg != null) {
                superPkg.getSubPackages().add(pkg);
            } else {
                // add directly to design model
                model.getPackages().add(pkg);
            }
            //
            return pkg;
        }

        public boolean delete(BehaviorTypePackage pkg) {
            BehaviorDesignModel model = pkg.getModel();
            if (pkg.getSubPackages().size() > 0 || pkg.getBehaviorTypes().size() > 0 || pkg.getDataProducerTypes().size() > 0) {
                //
                logger.warn("Can't delete package [" + pkg.getName() + "], it contains elements");
                return false;
            }
            //
            if (pkg.getSuperPackage() != null) {
                pkg.getSuperPackage().getSubPackages().remove(pkg);
            } else {
                model.getPackages().remove(pkg);                
            }
            return true;
        }
    }
    
    public class BehaviorTypeController extends ElementController {
        
        /*
         * Coverage of mappings: (search for (X)) (0) Package assignments (1)
         * Behavior Type is associated to Entity Type (2) Behavior Instantiation is
         * associated to Entity Instantiation, type association must be respected
         * (3) Interaction Contribution Instantiation (A: of Type, B: Delegated of
         * Type, and C: of Instantiation) are associated to Interaction Point
         * Participation Of Type (4) Interaction Type are associated to Interaction
         * Point Type, an Interaction Point may support multiple Interactions
         * 
         * TODO: (5) Action Type is associated to Action Point Type (one to one?)
         * (6) Multiple Action Instantiations may be associated to Action Point
         * Instantiation (7) Flow Points have no correspondence? (8) Interaction
         * contribution type is associated to Interaction Point Participation Type?
         */
        
        // TODO: easy search of possible behaviors of an entity
        private Map<EntityType, List<AbstractBehaviorType>> assignedBehaviors;
        
        private Map<String, AbstractBehaviorType> behaviorTypes;

        public BehaviorTypeController() {
            resetMap();
        }
        
        public void resetMap() {
            behaviorTypes = new HashMap<String, AbstractBehaviorType>();
        }
        
        public void load(EList<BehaviorTypePackage> pkgs) {
            for (BehaviorTypePackage pkg : pkgs) {
                load(pkg);
            }
        }

        public void load(BehaviorTypePackage pkg) {
            for (AbstractBehaviorType type : pkg.getBehaviorTypes()) {
                behaviorTypes.put(type.getName(), type);
            }
            load(pkg.getSubPackages());
        }
        
        public Map<String, AbstractBehaviorType> getBehaviorTypes() {
            return behaviorTypes;
        }
        
        public Map<EntityType, List<AbstractBehaviorType>> getAssignedBehaviors() {
            return assignedBehaviors;
        }
        
        public BehaviorType create(BehaviorTypePackage pkg, String name, EntityType entityType) {
            //
            BehaviorType type = TypeFactory.eINSTANCE.createBehaviorType();
            ECoreUtils.setup(type);
            if (name == null) {
                name = "Type " + type.getId();
            }
            // TODO: how about duplicate names?
            /*
             * if (behaviorTypes.get(name) != null) { String tmpName = null; for
             * (int i=0; i < 100; i++) { tmpName = name + " ("+i+")"; if
             * (behaviorTypes.get(tmpName) == null) { // found name break; } } name
             * = tmpName; }
             */
            type.setName(name);
            type.setEntityType(entityType);
            pkg.getBehaviorTypes().add(type);
            //
            behaviorTypes.put(name, type);
            logger.trace("Behavior type created: [" + name + "]");
            return type;
        }

        public void createContributionOfTypeAssignments(BehaviorType behaviorType, EntityType entityType) {
            /*
             * BehaviorTypeAssignment assignment =
             * designViewpoint.getAssignmentRelations
             * ().getBehaviorTypeMap().get(behaviorType);
             * ECoreUtils.setupModelElement(assignment); for
             * (AbstractInteractionContributionOfType icOfType :
             * behaviorType.getContributions()) { // Find correspondent interaction
             * point participation in entity type
             * AbstractInteractionPointParticipationOfType ippOfType =
             * structuralController.findIppOfType( assignment.getEntityType(),
             * icOfType.getRole()); createContributionOfTypeAssignment(assignment,
             * icOfType, ippOfType); }
             */
        }

        
        public boolean delete(BehaviorType behaviorType) {
            if (behaviorType.getInstantiations().size() == 0) {
                behaviorType.setPackage(null);
                EcoreUtil.delete(behaviorType);
                // TODO: remove associations??
                return true;
            }
            return false;
        }
        
        public BehaviorType find(String name) {
            AbstractBehaviorType type = behaviorTypes.get(name);
            if (type == null || !(type instanceof BehaviorType)) {
                logger.warn("Behavior type [" + name + "] not found!");
                return null;
            }
            return (BehaviorType) type;
        }
        
        public InteractionInstantiation findIInst(BehaviorType type, String name) {
            if (type == null) {
                return null;
            }
            for (ActionInstantiation aInst : type.getActions()) {
                if (aInst instanceof InteractionInstantiation) {
                    InteractionInstantiation icInst = (InteractionInstantiation)aInst;
                    if (icInst.getName().equals(name)) {
                        logger.trace("Found interaction instantiation [" + name + "] of [" + type.getName() + "]");
                        return icInst;
                    }
                }
            }
            logger.warn("Interaction instantiation [" + name + "] of [" + type.getName() + "] not found!");
            return null;
        }

        public InteractionInstantiation findIInst(String typeName, String name) {
            return findIInst(find(typeName), name);
        }
        
        public AbstractInteractionContributionOfType findIcOfType(String behaviorTypeName, String role) {
            AbstractBehaviorType behaviorType = find(behaviorTypeName);
            return findIcOfType(behaviorType, role);
        }

        public AbstractInteractionContributionOfType findIcOfType(AbstractBehaviorType behaviorType, String role) {
            if (behaviorType == null || role == null || role.equals("")) {
                // TODO: error messages
                return null;
            }
            for (AbstractInteractionContributionOfType icOfType : behaviorType.getContributions()) {
                if (icOfType.getType().getRole().equals(role)) {
                    logger.trace("Found interaction contribution of type [" + role + "]");
                    return icOfType;
                }
            }
            logger.warn("Interaction contribution of type [" + role + "] not found!");
            return null;
        }

        public Map<String, InteractionContributionOfInstantiation> getAllContributionsOfContainedTypes(BehaviorType type) {
            Map<String, InteractionContributionOfInstantiation> contributions = new HashMap<String, InteractionContributionOfInstantiation>();
            if (type == null)
                return contributions;
            for (BehaviorInstantiation inst : type.getContainedInstantiations()) {
                for (InteractionContributionOfInstantiation contribution : inst.getContributions()) {
                    contributions.put(inst.getName() + " -> " + contribution.getType().getRole(), contribution);
                }
            }
            return contributions;
        }        
        
    }

    public class BehaviorInstantiationController extends ElementController {
        

        // TODO: we should also support monolithic behaviors and general behaviors
        public BehaviorInstantiation create(BehaviorType container, String name, String typeName, EntityInstantiation entityInst) {
            AbstractBehaviorType type = behaviorType.getBehaviorTypes().get(typeName);
            return create(container, name, type, entityInst);
        }
        
        // TODO: we should also support monolithic behaviors and general behaviors
        public BehaviorInstantiation create(BehaviorType container, String name, AbstractBehaviorType type, EntityInstantiation entityInst) {

            /*
             * if (container == null) { logger.error(
             * "Trying to create a child behavior instantiation of a null container!, aborting"
             * ); return null; }
             */

            if (type == null) {
                logger.error("Trying to create a child behavior instantiation of a null type!, aborting");
                return null;
            }
            BehaviorInstantiation behaviorInstantiation = InstantiationFactory.eINSTANCE.createBehaviorInstantiation();
            ECoreUtils.setup(behaviorInstantiation);
            if (name == null || name.equals("")) {
                name = "Instantiation " + behaviorInstantiation.getId();
            }
            behaviorInstantiation.setName(name);
            behaviorInstantiation.setType(type);

            logger.trace(" - Creating behavior instantiation");
            logger.trace("   id=[" + behaviorInstantiation.getId() + "]");
            logger.trace("   type::name=[" + type.getName() + "]::[" + name + "]");
            if (container != null) {
                container.getContainedInstantiations().add(behaviorInstantiation);
                logger.trace("   child of [" + container.getName() + "]");
            } else {
                logger.trace("   no parent");
            }

            // Create instantiations of all interaction contributions of type
            // Includes also the delegated contributions
            //
            for (AbstractInteractionContributionOfType icOfType : type.getContributions()) {
                // InteractionContributionOfInstantiation icOfInst =
                icOfInst.create(behaviorInstantiation, icOfType);
                // InteractionPointParticipationOfInstantiation ippOfInst =
                // structuralController.findIppOfInstByName(entityInstantiation,
                // icOfInst.getInteractionContributionOfType().getRole());
                // createContributionOfInstantiationAssignment(icOfInst, ippOfInst);
            }
            // createContributionOfInstantiationAssignments(entityInstantiation,
            // behaviorInstantiation);

            // Create correspondent contained entity
            // When entity instantiation is create all interaction point
            // participations are also created
            /*
                 */

            // Create contribution
            return behaviorInstantiation;
        }

        public boolean delete(BehaviorInstantiation inst) {
            inst.setContainerType(null);
            EcoreUtil.delete(inst);
            return true;
        }
        
        public BehaviorInstantiation find(BehaviorType container, String name) {
            for (BehaviorInstantiation inst : container.getContainedInstantiations()) {
                if (inst.getName().equals(name)) {
                    logger.trace("Found behavior inst [" + name + "] contained in [" + container.getName() + "]");
                    return inst;
                }
            }
            logger.trace("Behavior inst [" + name + "] contained in [" + container.getName() + "] not found!");
            return null;
        }
        
        public InteractionContributionOfInstantiation findIcOfInst(BehaviorInstantiation containedInstantiation, InteractionContributionType icType) {
            if (containedInstantiation == null || icType == null) {
                // TODO: error messages
                return null;
            }
            for (InteractionContributionOfInstantiation icOfInst : containedInstantiation.getContributions()) {
                if (icOfInst.getType().getId().equals(icType.getId())) {
                    logger.trace("Found interaction contribution of instantiation [" + icType.getRole() + "]");
                    return icOfInst;
                }
            }
            logger.warn("Interaction contribution [" + icType.getRole() + "] of instantiation [" + containedInstantiation.getName() + "] not found!");
            return null;
        }

        
    }

    public class InteractionContributionOfTypeController extends ElementController {

        public InteractionContributionOfType create(BehaviorType type, InteractionContributionType icType) {
            if (icType == null || type == null) {
                return null;
            }
            return create(type, icType, icType.getRole());
        }
        
        public InteractionContributionOfType create(BehaviorType type, InteractionContributionType icType, String role) {
            return create(type, icType, role, null);
        }

        public InteractionContributionOfType create(BehaviorType type, InteractionType iType, String roleOfType) {
            return create(type, icType.find(iType, roleOfType), roleOfType, null);
        }
        
        public InteractionContributionOfType create(BehaviorType type, InteractionType iType, String roleOfType, String roleOfInst) {
            return create(type, icType.find(iType, roleOfType), roleOfInst, null);
        }
        
        public void create(BehaviorType type, InteractionContributionType icType, String[] roles) {
            for (String role : roles) {
                create(type, icType, role, null);
            }
        }
        
        public InteractionContributionOfType create(BehaviorType type, InteractionContributionType icType, String role,
                        InteractionPointParticipationOfType ippOfType) {
            if (icType == null) {
                return null;
            }
            InteractionContributionOfType icOfType = InstantiationFactory.eINSTANCE.createInteractionContributionOfType();
            ECoreUtils.setup(icOfType);
            icOfType.setRole(role);
            icOfType.setType(icType);
            type.getContributions().add(icOfType);
            logger.trace(" - Creating interaction contribution [" + icOfType.getId() + "][" + type.getName() + "]->[" + icType.getRole() + "]");

            // Create contributions in existing instantiations
            for (BehaviorInstantiation inst : type.getInstantiations()) {
                icOfInst.create(inst, icOfType);
                // create interaction participation of type and instantiation...and
                // etc etc...
                // this.createContributionOfInstantiationAssignment(icOfInst,
                // ippOfInst);
            }
            //
            /*
            for (BehaviorInstantiation inst : type.getInstantiations()) {
                ElementNode.reloadAll(inst);
            }
            ElementNode.reloadAll(type);
            */
            //
            return icOfType;
        }
        
        public DelegatedInteractionContribution createDelegated(BehaviorType type, InteractionContributionOfInstantiation icOfInst) {
            // TODO: constraints here to check: instantiation must be of a contained behavior instantiation .. ?
            if (icOfInst == null) {
                return null;
            }
            BehaviorInstantiation containedInstantiation = icOfInst.getBehaviorInstantiation();
            String role = icOfInst.getContributionOfType().getRole();
            //
            logger.trace(" - Creating delegate interaction contribution");
            logger.trace("     [" + type.getName() + "]->[" + role + "] delegated to ");
            logger.trace("     [" + containedInstantiation.getName() + "]->[" + role + "]");
            //
            DelegatedInteractionContribution delegIc;
            delegIc = InstantiationFactory.eINSTANCE.createDelegatedInteractionContribution();
            ECoreUtils.setup(delegIc);
            delegIc.setRole(icOfInst.getContributionOfType().getRole());
            delegIc.setType(icOfInst.getType());
            delegIc.getDelegatedTo().add(icOfInst);
            type.getContributions().add(delegIc);

            /*
             * // Get container type BehaviorTypeAssignment typeAssignment =
             * designViewpoint
             * .getAssignmentRelations().getBehaviorTypeMap().get(type); EntityType
             * eType = typeAssignment.getEntityType();
             * 
             * // Create correspondent delegated interaction point
             * EntityInstantiation eContainedInstantiation =
             * structuralController.findEntityInstantiaton(eType,
             * containedInstantiation.getName());
             * DelegatedInteractionPointParticipation delegIpp =
             * structuralController
             * .createDelegatedInteractionPointParticipation(eType,
             * eContainedInstantiation, role); // (3)
             * createContributionOfTypeAssignment(typeAssignment, delegIc,
             * delegIpp);
             */

            return delegIc;
        }
        
        public boolean delete(AbstractInteractionContributionOfType icOfType) {
            // TODO: Check for causality targets???
            icOfType.setBehaviorType(null);
            icOfType.setType(null);
            EcoreUtil.delete(icOfType);
            return true;
        }
        
    }

    public class InteractionContributionOfInstantiationController extends ElementController {

        public InteractionContributionOfInstantiation create(BehaviorInstantiation behaviorInst, AbstractInteractionContributionOfType icOfType) {
            InteractionContributionOfInstantiation icOfInst;
            icOfInst = InstantiationFactory.eINSTANCE.createInteractionContributionOfInstantiation();
            ECoreUtils.setup(icOfInst);
            icOfInst.setType(icOfType.getType());
            icOfInst.setContributionOfType(icOfType);
            behaviorInst.getContributions().add(icOfInst);
            return icOfInst;
        }

        public InteractionContributionOfInstantiation find(BehaviorInstantiation behaviorInst, InteractionContributionType icType) {
            if (icType == null) {
                return null;
            }
            return find(behaviorInst, icType.getRole());
        }
        
        // TODO: this method should be private in the future
        public InteractionContributionOfInstantiation find(BehaviorInstantiation behaviorInst, String role) {
            if (behaviorInst == null || role == null) {
                return null;
            }
            for (InteractionContributionOfInstantiation icOfInst : behaviorInst.getContributions()) {
                if (icOfInst.getContributionOfType().getRole().equals(role)) {
                    return icOfInst;
                }
            }
            return null;
        }
        
        
    }
    

    public class  ActionTypeController extends ElementController {

        private Map<String, ActionType> map;
        
        public ActionTypeController() {
            resetMap();
        }

        public void resetMap() {
            map = new HashMap<String, ActionType>();
        }
        
        public Map<String, ActionType> getActionTypes() {
            return map;
        }
        
        public void load(EList<BehaviorTypePackage> pkgs) {
            for (BehaviorTypePackage pkg : pkgs) {
                load(pkg);
            }
        }
        
        public void load(BehaviorTypePackage pkg) {
            for (DataProducerType pType : pkg.getDataProducerTypes()) {
                if (pType instanceof ActionType) {
                    ActionType aType = (ActionType)pType;
                    map.put(aType.getName(), aType);
                }
            }
            load(pkg.getSubPackages());
        }
        
        public ActionType create(BehaviorTypePackage pkg, String name) {
            ActionType actionType = TypeFactory.eINSTANCE.createActionType();
            ECoreUtils.setup(actionType);
            if (name == null) {
                name = "Action type " + actionType.getId();
            }
            actionType.setName(name);
            pkg.getDataProducerTypes().add(actionType);
            map.put(name, actionType);
            //
            return actionType;
        }

        public boolean delete(ActionType aType) {
            if (aType.getInstantiations().size() == 0) {
                for (DataInstantiation inst : aType.getDataInstantiations()) {
                    EcoreUtil.delete(inst);
                }
                aType.getDataInstantiations().clear();
                aType.setPackage(null);
                EcoreUtil.delete(aType);
                return true;
            }
            return false;
        }
    }
    
    public class ActionInstantiationController extends ElementController {
        public ActionInstantiation create(MonolithicBehaviorType behaviorType, String name, ActionType actionType) {
            if (actionType == null) {
                logger.warn("Trying to create action instantiation [" + name + "] with null type, aborting");
                return null;
            }
            /*
             * TODO: can we really have actions floating around? without a
             * container? if (behaviorType == null) {
             * logger.warn("Trying to create action instantiation ["
             * +name+"] with null container behavior, aborting"); return null; }
             */
            ActionInstantiation actionInst = InstantiationFactory.eINSTANCE.createActionInstantiation();
            ECoreUtils.setup(actionInst);
            if (name == null || name.equals("")) {
                name = "action " + actionInst.getId();
            }
            actionInst.setName(name);
            actionInst.setType(actionType);
            if (behaviorType != null) {
                behaviorType.getActions().add(actionInst);
            }
            return actionInst;
        }

        public boolean delete(ActionInstantiation aInst) {
            aInst.setType(null);
            EcoreUtil.delete(aInst);
            return true;
        }
    }

    public class InteractionTypeController extends ElementController {
        
        private Map<String, InteractionType> map;
        
        public InteractionTypeController() {
            resetMap();
        }

        public void resetMap() {
            map = new HashMap<String, InteractionType>();
        }
        
        public Map<String, InteractionType> getInteractionTypes() {
            return map;
        }
        
        public void load(EList<BehaviorTypePackage> pkgs) {
            for (BehaviorTypePackage pkg : pkgs) {
                load(pkg);
            }
        }
        
        public void load(BehaviorTypePackage pkg) {
            for (DataProducerType pType : pkg.getDataProducerTypes()) {
                if (pType instanceof InteractionType) {
                    InteractionType iType = (InteractionType)pType;
                    map.put(iType.getName(), iType);
                }
            }
            load(pkg.getSubPackages());
        }
        
        public InteractionType create(BehaviorTypePackage pkg, String name, String[] roles) {
            InteractionType iType = create(pkg, name);
            if (iType != null) {
                icType.create(iType, roles);
            }
            return iType;
        }
        
        public InteractionType create(BehaviorTypePackage pkg, String name) {

            logger.trace("Creating interaction type [" + name+ "]");

            InteractionType itType = TypeFactory.eINSTANCE.createInteractionType();
            ECoreUtils.setup(itType);
            itType.setName(name);
            map.put(name, itType);

            // BehaviorTypeAssignment typeAssignment =
            // designViewpoint.getAssignmentRelations().getBehaviorTypeMap().get(containerType);
            // InteractionPointParticipationOfInstantiation ippOfInsts[] = new
            // InteractionPointParticipationOfInstantiation[icOfInsts.length];
            // int i=0;
            /*
            for (InteractionContributionType icType : icTypes) {
                itType.getContributionTypes().add(icType);
                //
                 * BehaviorInstantiationAssignment instAssignment =
                 * typeAssignment.getBehaviorInstantiationMap
                 * ().get(icOfInst.getBehaviorInstantiation()); if (instAssignment
                 * != null) { InteractionContributionOfInstantiationAssignment
                 * icOfInstAssignement =
                 * instAssignment.getInteractionContributionMap().get(icOfInst); if
                 * (icOfInstAssignement != null) { ippOfInsts[i] =
                 * icOfInstAssignement.getInteractionPointParticipation(); } else {
                 * logger.trace(
                 * "Missing association between interaction contribution and interaction point participation (of instantiation)"
                 * ); } } else { logger.trace(
                 * "Missing association between contained behavior and entity instantiations (of type)"
                 * ); } // i++;
            
            }
            */
            pkg.getDataProducerTypes().add(itType);
            /*
             * EntityType entityType = typeAssignment.getEntityType();
             * InteractionPointType ipType =
             * structuralController.createInteractionPointType(entityType, name,
             * ippOfInsts); createInteractionTypeAssignment(itType, ipType);
             */

            return itType;
        }
        
        public boolean delete(InteractionType iType) {
            iType.getContributionTypes().clear();
            EcoreUtil.delete(iType);
            return true;
        }

        public InteractionType find(String name) {
            InteractionType iType = null;
            for(BehaviorDesignModel model : design.viewpoint.getBehaviorDesignModels()) {
                iType = find(model, name);
                if (iType != null) {
                    break;
                }
            }
            if (iType == null) {
                logger.warn("Interaction type [" + name + "] not found!");
            } else {
                logger.trace("Found interaction type [" + name + "]");
            }
            return iType;
        }
        
        public InteractionType find(BehaviorDesignModel model, String name) {
            InteractionType iType = null;
            // TODO: recursively search packages in more than one level
            for (BehaviorTypePackage pkg : model.getPackages()) {
              iType = find(pkg, name);
              if (iType != null)
                  break;
            }            
            return iType;
        }
        
        public InteractionType find(BehaviorTypePackage pkg, String name) {
            InteractionType iType = null;
            for (DataProducerType dpType : pkg.getDataProducerTypes()) {
                if (dpType instanceof InteractionType) {
                    iType = (InteractionType)dpType;
                    if (iType.getName().equals(name)) {
                        break;
                    }
                }
            }
            return iType;
        }
        
        
    }

    public class InteractionInstantiationController extends ElementController {
        

        public InteractionInstantiation create(BehaviorType behaviorType, InteractionType iType, InteractionContributionOfInstantiation[] icOfInsts) {
            return create(behaviorType, iType, iType.getName(), icOfInsts);
        }
        
        public InteractionInstantiation create(BehaviorType behaviorType, InteractionType iType, String name, InteractionContributionOfInstantiation[] icOfInsts) {
            InteractionInstantiation icInst = InstantiationFactory.eINSTANCE.createInteractionInstantiation();
            ECoreUtils.setup(icInst);
            icInst.setName(name);
            icInst.setType(iType);
            Collections.addAll(icInst.getContributions(), icOfInsts);
            behaviorType.getInteractions().add(icInst);
            return icInst;
        }

    }
    
    public class InteractionContributionTypeController extends ElementController {
        
        public InteractionContributionType create(InteractionType iType, String role) {
            InteractionContributionType icType = TypeFactory.eINSTANCE.createInteractionContributionType();
            ECoreUtils.setup(icType);
            if (role == null) {
                role = "Role " + icType.getId();
            }
            icType.setRole(role);
            logger.trace("- Creating interaction contribution type [" + role + "]");
            iType.getContributionTypes().add(icType);
            return icType;
        }

        public void create(InteractionType iType, String[] roles) {
            for (String role : roles) {
                InteractionContributionType icType = TypeFactory.eINSTANCE.createInteractionContributionType();
                ECoreUtils.setup(icType);
                if (role == null) {
                    role = "Role " + icType.getId();
                }
                icType.setRole(role);
                logger.trace("- Creating interaction contribution type [" + role + "]");
                iType.getContributionTypes().add(icType);
            }
        }

        public IdentityEstablishment addIdentityEstablishment(InteractionType iType, String role, IdentityInstantiation target) {
            return addIdentityEstablishment(icType.find(iType, role), target);
        }
        
        public IdentityEstablishment addIdentityEstablishment(InteractionContributionType icType, IdentityInstantiation target) {
            IdentityEstablishment ie = ConstraintFactory.eINSTANCE.createIdentityEstablishment();
            ECoreUtils.setup(ie);
            ie.setTarget(target);
            icType.getConstraints().add(ie);
            return ie;
        }
        

        public DataEstablishment addDataEstablishment(InteractionType iType, String role, DataInstantiation target) {
            return addDataEstablishment(icType.find(iType, role), target);
        }
        
        public DataEstablishment addDataEstablishment(InteractionContributionType icType, DataInstantiation target) {
            DataEstablishment de = ConstraintFactory.eINSTANCE.createDataEstablishment();
            ECoreUtils.setup(de);
            de.setTarget(target);
            icType.getConstraints().add(de);
            return de;
        }

        public boolean delete(InteractionContributionType icType) {
            if (icType.getInstantiations().size() == 0) {
                icType.setInteractionType(null);
                EcoreUtil.delete(icType);
                return true;
            }
            return false;
        }
        
        public InteractionContributionType find(InteractionType iType, String role) {
            for (InteractionContributionType icType : iType.getContributionTypes()) {
                if (icType.getRole().equals(role)) {
                    return icType;
                }
            }
            return null;
        }
        

    }
    
    public class FlowPointTypeController extends ElementController {
        public EntryPointType createEntryPointType(BehaviorTypePackage pkg, String name) {
            EntryPointType fpType = TypeFactory.eINSTANCE.createEntryPointType();
            ECoreUtils.setup(fpType);
            if (name == null) {
                name = "Entry " + fpType.getId();
            }
            fpType.setName(name);
            pkg.getDataProducerTypes().add(fpType);
            return fpType;
        }

        public ExitPointType createExitPointType(BehaviorTypePackage pkg, String name) {
            ExitPointType fpType = TypeFactory.eINSTANCE.createExitPointType();
            ECoreUtils.setup(fpType);
            if (name == null) {
                name = "Exit " + fpType.getId();
            }
            fpType.setName(name);
            pkg.getDataProducerTypes().add(fpType);
            return fpType;
        }

        public boolean delete(FlowPointType flowPointType) {
            if (flowPointType.getInstantiations().size() == 0) {
                flowPointType.setPackage(null);
                EcoreUtil.delete(flowPointType);
                return true;
            }
            return false;
        }
    }
    
    public class DataInstantiationController extends ElementController {

        public DataInstantiation create(DataProducerType producer, String name, DataType dataType) {
            return create(producer, name, dataType, false);
        }
        
        public DataInstantiation create(DataProducerType producer, String name, DataType dataType, boolean isArray) {
            DataInstantiation dataInst = data.instantiation.InstantiationFactory.eINSTANCE.createDataInstantiation();
            ECoreUtils.setup(dataInst);
            if (name == null) {
                name = "Attribute " + dataInst.getId();
            }
            dataInst.setName(name);
            dataInst.setType(dataType);
            dataInst.setArray(isArray);
            producer.getDataInstantiations().add(dataInst);            
            return dataInst;
        }
        
        public DataInstantiation find(DataProducerType producer, String name) {
            for (DataInstantiation inst : producer.getDataInstantiations()) {
              if (inst.getName().equals(name)) {
                  return inst;
              }
            }
            return null;
        }
        
    }

    public class IdentityInstantiationController extends ElementController {

        public IdentityInstantiation create(DataProducerType producer, String name, IdentityType idType) {
            return create(producer, name, idType, false);
        }
        
        public IdentityInstantiation create(DataProducerType producer, String name, IdentityType idType, boolean isArray) {
            IdentityInstantiation idInst = identity.instantiation.InstantiationFactory.eINSTANCE.createIdentityInstantiation();
            ECoreUtils.setup(idInst);
            if (name == null) {
                name = "Identity " + idInst.getId();
            }
            idInst.setName(name);
            idInst.setType(idType);
            idInst.setArray(isArray);
            producer.getIdentityInstantiations().add(idInst);            
            return idInst;
        }
        
    }
    
    public class BehaviorPatternController extends ElementController {
        
        public BehaviorPattern create(EntityPattern entityPattern) {
            BehaviorPattern behaviorPattern = PatternFactory.eINSTANCE.createBehaviorPattern();
            ECoreUtils.setup(behaviorPattern);
            behaviorPattern.setEntityPattern(entityPattern);
            return behaviorPattern;
        }

        public BehaviorPattern create(BehaviorType type) {
            BehaviorPattern behaviorPattern = PatternFactory.eINSTANCE.createBehaviorPattern();
            ECoreUtils.setup(behaviorPattern);
            behaviorPattern.setType(type);
            return behaviorPattern;
        }

        
    }
    
    public class ActivityPatternController extends ElementController {
        
        public ActionPattern create(ActionType type) {
            ActionPattern actionPattern = PatternFactory.eINSTANCE.createActionPattern();
            ECoreUtils.setup(actionPattern);
            actionPattern.setType(type);
            return actionPattern;
        }
        
        
        public InteractionPattern create(InteractionType iType) {
            InteractionPattern icPattern = PatternFactory.eINSTANCE.createInteractionPattern();
            ECoreUtils.setup(icPattern);
            icPattern.setType(iType);

            // InteractionContributionPattern icPartPattern =
            // ConditionFactory.eINSTANCE.createInteractionContributionPattern();
            // ECoreUtils.setup(icPartPattern);
            // EntityPattern participantEntityPattern,
            // AbstractInteractionContributionOfType icOfType
            // icPartPattern.setContributionOfType(icOfType);
            // icPartPattern.setParticipantEntityPattern(participantEntityPattern);
            // icPattern.getContributionPatterns().add(icPartPattern);

            return icPattern;
        }

        public ActivityPattern createActivityPattern() {
            ActivityPattern pattern = PatternFactory.eINSTANCE.createActivityPattern();
            ECoreUtils.setup(pattern);
            return pattern;
        }
        
        public ActionPattern createActionPattern() {
            ActionPattern pattern = PatternFactory.eINSTANCE.createActionPattern();
            ECoreUtils.setup(pattern);
            return pattern;
        }
        
        public InteractionPattern createInteractionPattern() {
            InteractionPattern interactionPattern = PatternFactory.eINSTANCE.createInteractionPattern();
            ECoreUtils.setup(interactionPattern);
            return interactionPattern;
        }
        
        public InteractionContributionPattern addParticipantPattern(InteractionPattern icPattern, AbstractInteractionContributionOfType ic, BehaviorPattern behaviorPattern) {
            InteractionContributionPattern icPartPattern = PatternFactory.eINSTANCE.createInteractionContributionPattern();
            ECoreUtils.setup(icPartPattern);
            icPartPattern.setContributionOfType(ic);
            icPartPattern.setParticipantBehaviorPattern(behaviorPattern);
            icPattern.getContributionPatterns().add(icPartPattern);
            return icPartPattern;
        }

        public InteractionContributionPattern addParticipantPattern(InteractionPattern icPattern, InteractionContributionType icType, BehaviorPattern behaviorPattern) {
            InteractionContributionPattern icPartPattern = PatternFactory.eINSTANCE.createInteractionContributionPattern();
            ECoreUtils.setup(icPartPattern);
            icPartPattern.setType(icType);
            icPartPattern.setParticipantBehaviorPattern(behaviorPattern);
            icPattern.getContributionPatterns().add(icPartPattern);
            return icPartPattern;
        }
        
    }


    public class EventPatternController extends ElementController {

        public BehaviorEventPattern createBehaviorEventPattern(RuleTemplate template, boolean isTrigger, BehaviorLifecycle lifecyle, BehaviorPattern behaviorPattern) {
            BehaviorEventPattern pattern = behavior.event.EventFactory.eINSTANCE.createBehaviorEventPattern();
            design.rule.setup(pattern, template, isTrigger);
            pattern.setLifecycle(lifecyle);
            pattern.setBehaviorPattern(behaviorPattern);
            return pattern;
        }

        public ActivityEventPattern createActivityEventPattern(RuleTemplate template, boolean isTrigger, ActionType actionType) {
            return createActivityEventPattern(template, isTrigger, activityPattern.create(actionType), EventModality.ACTUAL);
        }

        public ActivityEventPattern createActivityEventPattern(RuleTemplate template, boolean isTrigger, ActivityPattern activityPattern) {
            return createActivityEventPattern(template, isTrigger, activityPattern, EventModality.ACTUAL);
        }

        public ActivityEventPattern createActivityEventPattern(RuleTemplate template, boolean isTrigger, InteractionType iType, EventModality modality) {
            return createActivityEventPattern(template, isTrigger, activityPattern.create(iType), modality);
        }
        
        public ActivityEventPattern createActivityEventPattern(RuleTemplate template, boolean isTrigger, InteractionType iType) {
            return createActivityEventPattern(template, isTrigger, activityPattern.create(iType), EventModality.ACTUAL);
        }
        
        public ActivityEventPattern createActivityEventPattern(RuleTemplate template, boolean isTrigger, ActivityPattern activityPattern, EventModality modality) {
            ActivityEventPattern pattern = behavior.event.EventFactory.eINSTANCE.createActivityEventPattern();
            design.rule.setup(pattern, template, isTrigger);
            pattern.setModality(modality);
            if (activityPattern != null) {
                pattern.setActivityPattern(activityPattern);
            }
            return pattern;
        }
    }


    public DataEstablishmentFromVariable createDataEstablishment(CausalityParameter inst, DataInstantiation target, VariableDeclaration source) {
        DataEstablishmentFromVariable assignment = ConstraintFactory.eINSTANCE.createDataEstablishmentFromVariable();
        assignment.setSource(source);
        assignment.setTarget(target);
        inst.getConstraints().add(assignment);
        return assignment;
    }
    
    public IdentityEstablishmentFromVariable createIdentityEstablishment(IdentityInstantiation instantiation, IdentityInstanceVariable variable) {
        IdentityEstablishmentFromVariable assignment = ConstraintFactory.eINSTANCE.createIdentityEstablishmentFromVariable();
        assignment.setTarget(instantiation);
        assignment.setSource(variable);
        return assignment;
    }
    
    

}
