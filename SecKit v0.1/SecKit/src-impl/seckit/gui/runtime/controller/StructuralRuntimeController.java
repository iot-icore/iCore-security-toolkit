package seckit.gui.runtime.controller;

import identity.instance.DigitalIdentity;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import behavior.instantiation.BehaviorInstantiation;
import behavior.type.StructuredBehaviorType;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import structure.StructuralRuntimeModel;
import structure.StructureFactory;
import structure.instance.Entity;
import structure.instance.InstanceFactory;
import structure.instantiation.EntityInstantiation;
import utils.ecore.ECoreUtils;

public class StructuralRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(StructuralRuntimeController.class);

    public EntityController entity;
    
    public StructuralRuntimeController(RuntimeViewpointFactory runtime) {
        super("Structure", runtime);
        //
        entity = new EntityController();
    }

    public StructuralRuntimeModel createModel(String desc) {
        StructuralRuntimeModel model = StructureFactory.eINSTANCE.createStructuralRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription("Entity Model");
        viewpoint.getStructuralRuntimeModels().add(model);
        return model;
    }
    
    public class EntityController extends ElementController {
        
        public Entity create(EntityInstantiation inst) {
            Entity entity = InstanceFactory.eINSTANCE.createEntity();
            ECoreUtils.setup(entity);
            entity.setInstantiation(inst);
            return entity;
        }
        
        public Entity create(StructuralRuntimeModel model, DigitalIdentity id, Entity container, EntityInstantiation inst, BehaviorInstantiation behaviorInst,
                        StructuredBehaviorType behaviorType) {
            Entity entity = InstanceFactory.eINSTANCE.createEntity();
            ECoreUtils.setup(entity);
            entity.setInstantiation(inst);

            if (id != null) {
                entity.getIdentities().add(id);
            }

            if (container == null) {
                if (behaviorType != null) {
                    logger.trace("Creating entity with behavior type [" + behaviorType.getName() + "]");
                    // runtime.behavior.createBehavior(entity, behaviorType);
                }
                // An entity that exists by itself, therefore an allowed
                // instantiation
                model.getEntities().add(entity);
                // There is no behavior instantiation associated with it!

            } else {
                logger.trace("Creating entity with behavior inst [" + behaviorInst.getName() + "]");
                // container.getContainedEntities().add(entity);
                model.getEntities().add(entity);
                if (behaviorInst != null) {
                    // runtime.behavior.createBehavior(entity, behaviorInst);
                }
            }
            return entity;
        }        
    }



}
