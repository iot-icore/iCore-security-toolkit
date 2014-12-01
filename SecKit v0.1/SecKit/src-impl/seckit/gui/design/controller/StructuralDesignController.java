package seckit.gui.design.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import role.RolePattern;
import rule.template.RuleTemplate;
import structure.pattern.EntityPattern;
import structure.pattern.PatternFactory;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import structure.StructuralDesignModel;
import structure.StructureFactory;
import structure.event.EntityEventPattern;
import structure.event.EntityLifecycle;
import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.DelegatedInteractionPointParticipation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InstantiationFactory;
import structure.instantiation.InteractionPointInstantiation;
import structure.instantiation.InteractionPointParticipationOfInstantiation;
import structure.instantiation.InteractionPointParticipationOfType;
import structure.type.ActionPointType;
import structure.type.ActivityPointType;
import structure.type.EntityType;
import structure.type.EntityTypePackage;
import structure.type.InteractionPointParticipationType;
import structure.type.InteractionPointType;
import structure.type.TypeFactory;
import structure.variable.EntityInstanceVariable;
import structure.variable.EntityVariable;
import structure.variable.VariableFactory;
import trust.pattern.TrustPattern;
import utils.ecore.ECoreUtils;

public class StructuralDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(StructuralDesignController.class);

    public ModelController model;
    public PackageController pkg;
    public EntityTypeController entityType;
    public EntityInstantiationController entityInst;
    public InteractionPointParticipationTypeController ippType;
    public InteractionPointParticipationOfTypeController ippOfType;
    public DelegatedInteractionPointParticipationController delegIppOfType;
    public ActionPointTypeController apType;
    public InteractionPointTypeController ipType;
    public InteractionPointInstantiationController ipInst;
    public EntityPatternController entityPattern;
    public VariableController var;
    public EventPatternController event;
    
    public StructuralDesignController(DesignViewpointFactory design) {
        super("Structure", design);
        //        '
        model = new ModelController();
        entityType = new EntityTypeController();
        pkg = new PackageController();
        entityInst = new EntityInstantiationController();        
        ippType = new InteractionPointParticipationTypeController();
        ippOfType = new InteractionPointParticipationOfTypeController();
        delegIppOfType = new DelegatedInteractionPointParticipationController();
        apType = new ActionPointTypeController();
        ipType = new InteractionPointTypeController();
        ipInst = new InteractionPointInstantiationController();
        entityPattern = new EntityPatternController();
        var = new VariableController();
        event = new EventPatternController();
    }

    public class ModelController extends ElementController {

        public StructuralDesignModel create(String description) {
            //
            StructuralDesignModel model = StructureFactory.eINSTANCE.createStructuralDesignModel();
            ECoreUtils.setup(model);
            if (description == null) {
                description = "Structural model " + model.getId();
            }
            model.setDescription(description);
            design.viewpoint.getStructuralDesignModels().add(model);
            //
            logger.debug("- Creating structural design model [" + description + "]");
            return model;
        }
        
        public void update(StructuralDesignModel model, String newDescription) {
            model.setDescription(newDescription);
        }
        
        public boolean delete(StructuralDesignModel model) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(model.getEntityTypePackages(), msgs, "package");
            addMessage(model.getAllowedEntityInstantiations(), msgs, "allowed entity instantiations");
            //
            if (msgs.size() > 0) {
                logger.debug("- Can't delete model [" + model.getDescription() + "], it has:");
                printMessages(logger, msgs);
                return false;
            }
            //
            logger.debug("- Deleting model: [" + model.getDescription() + "]");
            design.viewpoint.getStructuralDesignModels().remove(model);
            EcoreUtil.delete(model);
            return true;
        }
        
    }
    
    public void loadModel() {
        /*
        model = design.viewpoint.getStructuralDesignModels().get(0);
        //
        eTypeC.resetMap();
        eTypeC.load(model.getEntityTypePackages());
        //
        ippTypeC.resetMap();
        ippTypeC.load(model.getEntityTypePackages());
        */
        //
    }

    public EntityInstantiation findAllowedInstantiation(String name) {
        for(StructuralDesignModel model : design.viewpoint.getStructuralDesignModels()) {
            for (EntityInstantiation inst : model.getAllowedEntityInstantiations()) {
                if (inst.getName().equals(name)) {
                    return inst;
                }
            }
        }
        return null;
    }

    
    public class PackageController extends ElementController {

        public EntityTypePackage create(StructuralDesignModel model, String name) {
            EntityTypePackage pkg = TypeFactory.eINSTANCE.createEntityTypePackage();            
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            logger.debug("- Creating entity package [" + name + "]");
            model.getEntityTypePackages().add(pkg);
            return pkg;
        }
        
        public EntityTypePackage create(EntityTypePackage superPkg, String name) {
            EntityTypePackage pkg = TypeFactory.eINSTANCE.createEntityTypePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            logger.debug("- Creating entity package [" + name + "]");
            if (superPkg == null) {
                // model.getEntityTypePackages().add(pkg);
                // TOOD: Is the mode default?
            } else {
                superPkg.getSubPackages().add(pkg);
            }
            return pkg;
        }

        public void updateName(EntityTypePackage pkg, String newName) {
            if (newName == null || newName.equals("")) {
                logger.warn("- Updating package name ["+pkg.getName()+"] to null or empty value, aborting");
                return;
            }
            logger.debug("- Updating package name ["+pkg.getName()+"] to [" + newName + "]");
            pkg.setName(newName);
        }
        
        public boolean delete(EntityTypePackage pkg) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(pkg.getActivityPointTypes(), msgs, "activity point type");
            addMessage(pkg.getEntityTypes(), msgs, "entity type");
            addMessage(pkg.getLocationTypes(), msgs, "location type");
            addMessage(pkg.getParticipationTypes(), msgs, "participation type");
            addMessage(pkg.getSubPackages(), msgs, "sub package");
            //
            if (msgs.size() > 0) {
                logger.debug("Can't delete package [" + pkg.getName() + "], it contains elements:");
                printMessages(logger, msgs);
                return false;
            }
            logger.debug("- Deleting entity package: [" + pkg.getName() + "]");
            if (pkg.getSuperPackage() == null) {
                pkg.getModel().getEntityTypePackages().remove(pkg);
            } else {
                pkg.getSuperPackage().getSubPackages().remove(pkg);
            }
            EcoreUtil.remove(pkg);
            return true;
        }

    }

    public class EntityTypeController extends ElementController {
    
        private Map<String, EntityType> entityTypes;
        
        public EntityTypeController() {
            resetMap();
        }  
        
        public EntityType create(EntityTypePackage pkg, String name) {
            EntityType type = TypeFactory.eINSTANCE.createEntityType();
            ECoreUtils.setup(type);
            if (name == null) {
                name = "Type " + type.getId();
            }
            logger.debug("- Creating entity type [" + name + "]");
            type.setName(name);
            pkg.getEntityTypes().add(type);
            // TODO: map should consider full name, including package...entity type
            entityTypes.put(name, type);
            return type;
        }
    
        public void update(EntityType type, String newName) {
            if (!entityTypes.containsKey(newName)) {
                entityTypes.remove(type.getName());
                entityTypes.put(newName, type);
                type.setName(newName);
                /*
                ElementNode.changedAll(type);
                for (EntityInstantiation inst : type.getInstantiations()) {
                    ElementNode.changedAll(inst);
                }
                */
            }
        }
    
        public boolean delete(EntityType type) {            
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(type.getInstantiations(), msgs, "reference entity instantiation");
            addMessage(type.getContainedInstantiations(), msgs, "contained entity instantantiation");
            //
            if (msgs.size() > 0) {
                logger.warn("Can't delete entity type [" + type.getName() + "], it has:");
                printMessages(logger, msgs);
                return false;
            }
            for (AbstractInteractionPointParticipationOfType ippOfType : type.getInteractionPointParticipations()) {
                if (ippOfType instanceof InteractionPointParticipationOfType) {
                    InteractionPointParticipationOfType aIppOfType = (InteractionPointParticipationOfType) ippOfType;
                    aIppOfType.setParticipationType(null);
                }
            }
            logger.debug("- Deleting entity type : [" + type.getName() + "]");
            /*
            type.getPackage().getEntityTypes().remove(type);
            type.setPackage(null);
            type.getInteractionPointParticipations().clear();
            */
            EcoreUtil.delete(type, true);
            return true;
        }
        
        public Map<String, EntityType> getEntityTypes() {
            return entityTypes;
        }
        
        public void resetMap() {
            entityTypes = new HashMap<String, EntityType>();
        }
    
        public void load(EntityTypePackage pkg) {
            for (EntityType type : pkg.getEntityTypes()) {
                entityTypes.put(type.getName(), type);
            }
            load(pkg.getSubPackages());
        }
        
        public void load(EList<EntityTypePackage> pkgs) {
            for (EntityTypePackage pkg : pkgs) {
                load(pkg);
            }
        }
        
        public EntityType find(String name) {
            EntityType type = null;
            for (StructuralDesignModel model : design.viewpoint.getStructuralDesignModels()) {
                type = find(model.getEntityTypePackages(), name);
                if (type != null) {
                    break;
                }
            }
            return type;
        }
        
        public EntityType find(EntityTypePackage pkg, String name) {
            for (EntityType type : pkg.getEntityTypes()) {
                if (type.getName().equals(name)) {
                    return type;
                }
            }
            return null;
        }
    
        public EntityType find(EList<EntityTypePackage> pkgs, String name) {
            for (EntityTypePackage pkg : pkgs) {
                EntityType type = null;
                //
                type = find(pkg, name);
                if (type != null) {
                    return type;
                }
                //
                type = find(pkg.getSubPackages(), name);
                if (type != null) {
                    return type;
                }
                //
            }
            return null;
        }
        
        public AbstractInteractionPointParticipationOfType findIppOfType(EntityType type, String name) {
            for (AbstractInteractionPointParticipationOfType ippOfType : type.getInteractionPointParticipations()) {
                if (ippOfType.getName().equals(name)) {
                    return ippOfType;
                }
            }
            return null;
        }
    
    }

    public class EntityInstantiationController extends ElementController {
        
        public EntityInstantiation create(StructuralDesignModel model, EntityType container, String name, EntityType type) {
    
            if (container == null) {
                // TODO: this may happen for the "allowed instantiations" in the
                // design model
                // is this warning necessary?
                // logger.warn("Entity instantiation "+name+":"+type.getName()+" in a null container!");
                // return null;
            }
            if (type == null) {
                logger.warn("Trying to create a entity instantiation [" + name + "] of a null type, aborting");
                return null;
            }
            if (container != null) {
                logger.trace(" - Creating entity instantiation [" + type.getName() + "]:[" + name + "] child of [" + container.getName() + "]");
            } else {
                logger.trace(" - Creating allowed entity instantiation [" + type.getName() + "]:[" + name + "]");
            }
            EntityInstantiation inst = InstantiationFactory.eINSTANCE.createEntityInstantiation();
            ECoreUtils.setup(inst);
            if (name == null || name.equals("")) {
                name = "Instantiation " + inst.getId();
            }
            inst.setName(name);
            inst.setType(type);
            inst.setMultiplicity(DesignViewpointFactory.ZERO_OR_MORE());
            if (container == null) {
                model.getAllowedEntityInstantiations().add(inst);
            } else {
                container.getContainedInstantiations().add(inst);
            }
    
            // Create instantiations of all interaction point participation of type
            for (AbstractInteractionPointParticipationOfType ippOfType : type.getInteractionPointParticipations()) {
                createParticipationOfInstantiation(inst, ippOfType);
            }
    
            return inst;
        }
    
        // TODO: duplicate??
        public void createParticipationOfInstantiation(EntityInstantiation instantiation, AbstractInteractionPointParticipationOfType ippOfType) {
            InteractionPointParticipationOfInstantiation ippOfInst;
            ippOfInst = InstantiationFactory.eINSTANCE.createInteractionPointParticipationOfInstantiation();
            ECoreUtils.setup(ippOfInst);
            ippOfInst.setParticipationOfType(ippOfType);
            instantiation.getInteractionPointParticipations().add(ippOfInst);
        }
        
        public void createInteractionPointParticipations(EntityInstantiation inst) {
            EntityType type = inst.getType();
            if (type != null) {
                logger.trace("- Adding participations of type to instantiation");
                for (AbstractInteractionPointParticipationOfType ippOfType : type.getInteractionPointParticipations()) {
                    createIppOfInst(inst, ippOfType);
                }
            }
        }
        
        public InteractionPointParticipationOfInstantiation createIppOfInst(EntityInstantiation inst,
                        AbstractInteractionPointParticipationOfType ippOfType) {
            logger.trace(" - Creating interaction point participation of instantiation [" + inst.getName() + "]->[" + ippOfType.getName() + "]");
            InteractionPointParticipationOfInstantiation ippOfInst = InstantiationFactory.eINSTANCE.createInteractionPointParticipationOfInstantiation();
            ECoreUtils.setup(ippOfInst);
            ippOfInst.setParticipationOfType(ippOfType);
            inst.getInteractionPointParticipations().add(ippOfInst);
            return ippOfInst;
        }
        
        public boolean deleteIppOfInst(InteractionPointParticipationOfInstantiation ippOfInst) {
            EcoreUtil.delete(ippOfInst);
            return true;
        }
        
        
        public void clearIpps(EntityInstantiation inst) {
            logger.trace("- Clearing interaction point participations");
            // Clear remove? Is this necessary?
            for (InteractionPointParticipationOfInstantiation ippOfInst : inst.getInteractionPointParticipations()) {
                ippOfInst.setParticipationOfType(null);
                ippOfInst.setDelegatedFrom(null);
            }
            inst.getInteractionPointParticipations().clear();
        }
        
        public InteractionPointParticipationOfInstantiation findIppOfInst(EntityInstantiation instantiation, String name) {
            for (InteractionPointParticipationOfInstantiation ippOfInst : instantiation.getInteractionPointParticipations()) {
                if (ippOfInst.getParticipationOfType().getName().equals(name)) {
                    return ippOfInst;
                }
            }
            logger.warn("Interaction point participation [" + name + "] of instantiation [" + instantiation.getName() + "] not found!");
            return null;
        }
        
        public void update(EntityInstantiation inst, String newName, EntityType newType, String newMultiplicity) {
    
            logger.trace("Updating entity instantiation [" + inst.getName() + "]");
    
            if (newName != null && !newName.equals("")) {
                if (newName.equals(inst.getName())) {
                    logger.trace("- Name has not changed");
                } else {
                    logger.trace("- Setting name to [" + newName + "]");
                    inst.setName(newName);
                }
            } else {
                logger.trace("- New name is null or empty, skiping update");
            }
    
            if (newType == null && inst.getType() == null) {
                // Nothing to update
            } else {
                if (inst.getType() != null) {                    
                    if (newType.getId().equals(inst.getType().getId())) {
                        logger.trace("- Type has not changed");
                    } else {
                        logger.trace("- Changing type");

                        // TODO: this is complicated...
                        boolean canChangeType = false;                                              
                        // If any reference is set to contributions type can not be changed?
                        
                        if (canChangeType) {
                            // current type is set
                            clearIpps(inst);
                            inst.setType(newType);
                            if (newType != null) {
                                if (!inst.getType().getId().equals(newType.getId())) {
                                    // type has changed
                                    createInteractionPointParticipations(inst);
                                }
                            }
                        }
                    }
                }
            }
            if (newMultiplicity != null) {
                DesignViewpointFactory.updateMultiplicity(newMultiplicity, inst.getMultiplicity());
            }
    
        }
        
        public boolean delete(EntityInstantiation inst) {
            //cascadeRemoveViewReferences(inst);
            EcoreUtil.delete(inst, true);
            /*
            inst.getInteractionPointParticipations().clear();
            inst.setType(null);
            EcoreUtil.delete(inst);
            
        public boolean delete(InteractionPointParticipationOfInstantiation ippOfInst) {
            EntityInstantiation eInst = ippOfInst.getEntityInstantiation();
            EcoreUtil.delete(ippOfInst);
            reloadView(eInst);
            return true;            
        }
        
            
            */
            return true;
        }
    
        public EntityInstantiation find(EntityType type, String name) {
            if (type == null) {
                return null;
            }
            for (EntityInstantiation instantiation : type.getContainedInstantiations()) {
                if (instantiation.getName().equals(name)) {
                    logger.trace("Found entity instantiation [" + name + "]");
                    return instantiation;
                }
            }
            logger.error("Entity instantiation [" + name + "] not found!");
            return null;
        }
    
    }

    public class InteractionPointParticipationTypeController extends ElementController {

        private Map<String, InteractionPointParticipationType> ippTypes;
        
        public InteractionPointParticipationTypeController() {
            resetMap();
        }

        public void resetMap() {
            ippTypes = new HashMap<String, InteractionPointParticipationType>();
        }
        
        public Map<String, InteractionPointParticipationType> getIppTypes() {
            return ippTypes;
        }
        
        public void load(EList<EntityTypePackage> pkgs) {
            for (EntityTypePackage pkg : pkgs) {
                load(pkg);
            }
        }

        public void load(EntityTypePackage pkg) {
            for (InteractionPointParticipationType ippType : pkg.getParticipationTypes()) {
                ippTypes.put(ippType.getName(), ippType);
            }
            load(pkg.getSubPackages());
        }
        
        public InteractionPointParticipationType create(EntityTypePackage pkg, String name) {
            InteractionPointParticipationType ippType = TypeFactory.eINSTANCE.createInteractionPointParticipationType();
            ECoreUtils.setup(ippType);
            if (name == null) {
                name = "Participation type " + ippType.getId();
            }
            ippType.setName(name);
            pkg.getParticipationTypes().add(ippType);
            logger.trace("Creating interaction point participation type [" + ippType.getName() + "]");
            ippTypes.put(ippType.getName(), ippType);
            return ippType;
        }

        public void update(InteractionPointParticipationType ippType, String newName) {
            if (newName == null || newName.equals("")) {
                return;
            }
            ippTypes.remove(ippType.getName());
            ippType.setName(newName);
            ippTypes.put(newName, ippType);
        }

        public boolean delete(InteractionPointParticipationType ippType) {
            if (ippType.getInstantiations().size() == 0) {
                ippType.getPackage().getParticipationTypes().remove(ippType);
                ippTypes.remove(ippType.getId());
                EcoreUtil.delete(ippType);
                return true;
            }
            return false;
        }
        
    }
    
    public class ActionPointTypeController extends ElementController {
        
        public ActionPointType create(EntityTypePackage pkg, String name) {
            ActionPointType apType = TypeFactory.eINSTANCE.createActionPointType();
            ECoreUtils.setup(apType);
            if (name == null) {
                name = "Action point type " + apType.getId();
            }
            apType.setName(name);
            pkg.getActivityPointTypes().add(apType);
            logger.trace("Creating action point type [" + apType.getName() + "]");
            return apType;
        }

        public boolean delete(ActionPointType apType) {
            if (apType.getInstantiations().size() == 0) {
                apType.getPackage().getActivityPointTypes().remove(apType);
                EcoreUtil.delete(apType);
                return true;
            }
            logger.warn("Can't delete action point type [" + apType.getName() + "], it has associations");
            return false;
        }
        
    }

    public class InteractionPointParticipationOfTypeController extends ElementController {

        public InteractionPointParticipationOfType create(EntityType type, InteractionPointParticipationType ippType, String name) {
            logger.trace(" - Creating interaction point participation of type [" + type.getName() + "]->[" + name + "]");
            InteractionPointParticipationOfType ippOfType = InstantiationFactory.eINSTANCE.createInteractionPointParticipationOfType();
            ECoreUtils.setup(ippOfType);
            ippOfType.setParticipationType(ippType);
            if (name == null) {
                name = "participation " + ippOfType.getId();
            }
            ippOfType.setName(name);
            type.getInteractionPointParticipations().add(ippOfType);

            for (EntityInstantiation inst : type.getInstantiations()) {
                entityInst.createIppOfInst(inst, ippOfType);
            }

            // Update views
            for (EntityInstantiation inst : type.getInstantiations()) {
            }
            //

            return ippOfType;
        }

        public boolean delete(InteractionPointParticipationOfType ippOfType) {
            List<InteractionPointParticipationOfInstantiation> list = new ArrayList<InteractionPointParticipationOfInstantiation>();
            // Temporary list to prevent concurrent modifications
            list.addAll(ippOfType.getParticipationOfInstantiation());
            
            // In principle can delete all participation of instantiations
            boolean canDelete = true;
            for (InteractionPointParticipationOfInstantiation ippOfInst : list) {
                if (ippOfInst.getInteractionPoint() != null || ippOfInst.getDelegatedFrom() != null) {
                    // if at least one is part of interaction point, can not delete
                    canDelete = false;
                    logger.trace("Reference interaction point participation of instantiation ["+ippOfInst.getEntityInstantiation().getName()+"] can not be deleted");
                    
                    if (ippOfInst.getInteractionPoint() != null) {
                        logger.trace("- It is part of interaction point ["+ippOfInst.getInteractionPoint().getName()+"]");
                    }
                    if (ippOfInst.getDelegatedFrom() != null) {
                        logger.trace("- It is a target of a delegation");
                    }
                    
                }
            }
            
            if (canDelete) {
                for (InteractionPointParticipationOfInstantiation ippOfInst : list) {
                    entityInst.deleteIppOfInst(ippOfInst);
                }
                EcoreUtil.delete(ippOfType);
                return true;            
            }
            
            logger.trace("Can't delete interaction point participation of type");
            return false;
        }
        
    }

    
    public class DelegatedInteractionPointParticipationController extends ElementController {
        
        public DelegatedInteractionPointParticipation create(EntityType entityType,
                        EntityInstantiation containedInstantiation, String name) {
    
            InteractionPointParticipationOfInstantiation ippOfInst = entityInst.findIppOfInst(containedInstantiation, name);
            if (ippOfInst == null) {
                logger.error("Creating delegate interaction point participation, participation [" + name + "] not found in [" + containedInstantiation.getName()
                                + "]");
                return null;
            }
            logger.trace(" - Creating delegate interaction point participation");
            logger.trace("     [" + entityType.getName() + "]->[" + name + "] delegated to ");
            logger.trace("     [" + containedInstantiation.getName() + "]->[" + name + "]");
            DelegatedInteractionPointParticipation delegIpp;
            delegIpp = InstantiationFactory.eINSTANCE.createDelegatedInteractionPointParticipation();
            ECoreUtils.setup(delegIpp);
            delegIpp.setName(name);
            delegIpp.getDelegatedTo().add(ippOfInst);
            entityType.getInteractionPointParticipations().add(delegIpp);
            return delegIpp;
        }
    
        public boolean delete(DelegatedInteractionPointParticipation delegIppOfType) {
            List<InteractionPointParticipationOfInstantiation> list = new ArrayList<InteractionPointParticipationOfInstantiation>();
            // Temporary list to prevent concurrent modifications
            list.addAll(delegIppOfType.getParticipationOfInstantiation());
            
            // In principle can delete all participation of instantiations
            boolean canDelete = true;
            for (InteractionPointParticipationOfInstantiation ippOfInst : list) {
                if (ippOfInst.getInteractionPoint() != null || ippOfInst.getDelegatedFrom() != null) {
                    // if at least one is part of interaction point, can not delete
                    canDelete = false;
                    logger.trace("Delegated interaction point participation  ["+ippOfInst.getEntityInstantiation().getName()+"] can not be deleted");
                    
                    if (ippOfInst.getInteractionPoint() != null) {
                        logger.trace("- It is part of interaction point ["+ippOfInst.getInteractionPoint().getName()+"]");
                    }
                    if (ippOfInst.getDelegatedFrom() != null) {
                        logger.trace("- It is a target of a delegation");
                    }
                    
                }
            }
            
            if (canDelete) {
                for (InteractionPointParticipationOfInstantiation ippOfInst : list) {
                    entityInst.deleteIppOfInst(ippOfInst);
                }
                EcoreUtil.delete(delegIppOfType);
                return true;            
            }
            
            logger.trace("Can't delete delegated interaction point participation of type");
            return false;
        }
        
        
    }

    public class InteractionPointTypeController extends ElementController {
        
        public InteractionPointType create(EntityTypePackage pkg, String name, InteractionPointParticipationType ippPartType) {
            logger.trace(" - Creating interaction point type [" + name + "]");
            InteractionPointType ippType = TypeFactory.eINSTANCE.createInteractionPointType();
            ECoreUtils.setup(ippType);
            ippType.setName(name);
            ippType.setParticipationType(ippPartType);
            pkg.getActivityPointTypes().add(ippType);
            return ippType;
        }

        public InteractionPointType findInteractionPointType(String name) {
            InteractionPointType ippType = null;

            for (StructuralDesignModel model : design.viewpoint.getStructuralDesignModels()) {
                for (EntityTypePackage pkg : model.getEntityTypePackages()) {
                    ippType = findInteractionPointType(pkg, name);
                    if (ippType != null) {
                        break;
                    }
                }
                if (ippType != null) {
                    logger.trace("Found interaction point type [" + name + "]");
                    break;
                }
            }
            if (ippType == null) {
                logger.error("Interaction point type [" + name + "] not found in any package");                
            }
            return ippType;
        }
        
        public InteractionPointType findInteractionPointType(EntityTypePackage pkg, String name) {
            for (ActivityPointType apType : pkg.getActivityPointTypes()) {
                if (apType instanceof InteractionPointType) {
                    logger.trace("Found interaction point type [" + name + "]");
                    return (InteractionPointType)apType;
                }
            }
            logger.error("Interaction point type [" + name + "] not found in package ["+ pkg.getName() +"]");                
            return null;
        }

    }
    
    public class InteractionPointInstantiationController extends ElementController  {
     
        public InteractionPointInstantiation create(EntityType entityType, InteractionPointType ipType, String name, InteractionPointParticipationOfInstantiation[] ippOfInsts) {
            logger.trace(" - Creating interaction point instantiation [" + name + "]");
            InteractionPointInstantiation ippInst = InstantiationFactory.eINSTANCE.createInteractionPointInstantiation();
            ECoreUtils.setup(ippInst);
            ippInst.setName(name);
            ippInst.setType(ipType);
            Collections.addAll(ippInst.getParticipations(), ippOfInsts);
            entityType.getActivityPoints().add(ippInst);
            return ippInst;
        }

        public void addIppOfInst(InteractionPointInstantiation ippInst, InteractionPointParticipationOfInstantiation ippOfInst) {
            ippInst.getParticipations().add(ippOfInst);            
        }
        
        public boolean delete(InteractionPointInstantiation ippInst) {
            EcoreUtil.delete(ippInst);
            return true;
        }
        
        
    }
    

    /*
     * private static StructuralFactoryUtil bootstrap_NOT(String pkgName,
     * BehaviorFactoryUtil behaviorFactoryUtil) { // We assume there is one and
     * only one type package in the model BehaviorTypePackage pkg =
     * behaviorFactoryUtil.getDefaultPkg(); StructuralFactoryUtil
     * structuralFactoryUtil = new StructuralFactoryUtil(pkgName);
     * 
     * // For each behavior type creates a correspondent entity type for
     * (BehaviorType behaviorType : pkg.getBehaviorTypes()) { EntityType
     * entityType =
     * structuralFactoryUtil.createEntityType(behaviorType.getName()); // create
     * assignment relation entity->behavior }
     * 
     * // Create contained instantiations and interaction points for
     * (BehaviorType behaviorType : pkg.getBehaviorTypes()) {
     * 
     * EntityType containerType =
     * structuralFactoryUtil.findEntityType(behaviorType.getName()); if
     * (behaviorType instanceof StructuredBehaviorType) { StructuredBehaviorType
     * structuredBehavior = (StructuredBehaviorType)behaviorType; for
     * (BehaviorInstantiation instantiation :
     * structuredBehavior.getContainedInstantiations()) { EntityType type =
     * structuralFactoryUtil.findEntityType(instantiation.getType().getName());
     * structuralFactoryUtil.createEntityInstantiation(containerType,
     * instantiation.getName(), type); }
     * 
     * 
     * for (InteractionType icType : structuredBehavior.getInteractionTypes()) {
     * 
     * InteractionPointParticipationOfInstantiation ippOfInsts[] = new
     * InteractionPointParticipationOfInstantiation
     * [icType.getContributions().size()]; int p=0; for
     * (InteractionContributionOfInstantiation icOfInst :
     * icType.getContributions()) {
     * 
     * EntityInstantiation instantiation =
     * structureFactoryUtil.findEntityInstantiaton(containerType,
     * icOfInst.getBehaviorInstantiation().getName());
     * 
     * InteractionPointParticipationOfInstantiation ippOfInst; if
     * (instantiation.getInteractionPointParticipations().size() == 0) { // Get
     * the one and only interaction point participation of type
     * InteractionPointParticipationOfType ippOfType; if
     * (instantiation.getType().getInteractionPointParticipations().size() == 0)
     * { ippOfType =
     * structureFactoryUtil.createInteractionPointParticipationOfType
     * (instantiation.getType(), "ic"); } else { ippOfType =
     * instantiation.getType().getInteractionPointParticipations().get(0); } }
     * else { // Get the one and only interaction point participation of type
     * ippOfInst = instantiation.getInteractionPointParticipations().get(0); }
     * 
     * // DO WE NEED ONE INTERACTION POINT TYPE FOR ALL POSSIBLE INTERACTION
     * TYPES?
     * 
     * //
     * instantiation.getType().getInteractionPointParticipations().add(ippOfType
     * ); //InteractionPointParticipationOfInstantiation ippOfInst =
     * structureFactoryUtil.createInteractionPointParticipation(instantiation,
     * name) //
     * 
     * } //structureFactoryUtil.createInteractionPointType(containerType,
     * icType.getName(), ippOfInsts); }
     * 
     * } }
     * 
     * return structuralFactoryUtil; }
     */
    
    public class EntityPatternController extends ElementController {

        public EntityPattern create() {
            EntityPattern entityPattern = PatternFactory.eINSTANCE.createEntityPattern();
            ECoreUtils.setup(entityPattern);
            return entityPattern;
        }

        public EntityPattern create(EntityVariable var) {
            EntityPattern entityPattern = PatternFactory.eINSTANCE.createEntityPattern();
            ECoreUtils.setup(entityPattern);
            entityPattern.getVariables().add(var);
            return entityPattern;
        }

        public EntityPattern create(RolePattern rolePattern) {
            EntityPattern entityPattern = PatternFactory.eINSTANCE.createEntityPattern();
            ECoreUtils.setup(entityPattern);
            entityPattern.setRolePattern(rolePattern);
            return entityPattern;
        }

        public EntityPattern create(TrustPattern trustPattern) {
            EntityPattern entityPattern = PatternFactory.eINSTANCE.createEntityPattern();
            ECoreUtils.setup(entityPattern);
            entityPattern.getTrustPattern().add(trustPattern);
            return entityPattern;
        }
        
        public EntityPattern create(TrustPattern[] trustPatterns) {
            EntityPattern entityPattern = PatternFactory.eINSTANCE.createEntityPattern();
            ECoreUtils.setup(entityPattern);
            for (TrustPattern trustPattern : trustPatterns) {
                entityPattern.getTrustPattern().add(trustPattern);
            }
            return entityPattern;
        }

        
    }

    public class VariableController extends ElementController {
        
        public EntityInstanceVariable createEntityInstanceVariable(RuleTemplate template, String name) {
            EntityInstanceVariable var = VariableFactory.eINSTANCE.createEntityInstanceVariable();
            ECoreUtils.setup(var);
            if (name == null) {
                name = "var " + var.getId();
            }
            var.setName(name);
            template.getVariableDeclarations().add(var);
            return var;
        }
        
    }
    
    
    public class EventPatternController extends ElementController {

        public EntityEventPattern createEntityEventPattern(RuleTemplate template, boolean isTrigger, EntityLifecycle lifecyle, EntityPattern entityPattern) {
            EntityEventPattern pattern = structure.event.EventFactory.eINSTANCE.createEntityEventPattern();            
            design.rule.setup(pattern, template, isTrigger);
            pattern.setLifecycle(lifecyle);
            pattern.setEntityPattern(entityPattern);
            return pattern;
        }
        
    }

    

}
