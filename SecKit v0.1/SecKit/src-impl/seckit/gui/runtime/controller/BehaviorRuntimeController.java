package seckit.gui.runtime.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import behavior.BehaviorFactory;
import behavior.BehaviorRuntimeModel;
import behavior.instance.Action;
import behavior.instance.Behavior;
import behavior.instance.Interaction;
import behavior.instantiation.BehaviorInstantiation;
import behavior.type.AbstractBehaviorType;
import behavior.type.ActionType;
import behavior.type.BehaviorType;
import behavior.type.InteractionType;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import structure.instance.Entity;
import behavior.instance.InstanceFactory;
import utils.ecore.ECoreUtils;

public class BehaviorRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(BehaviorRuntimeController.class);
    
    public BehaviorRuntimeController(RuntimeViewpointFactory runtime) {
        super("Behavior", runtime);
    }

    public BehaviorRuntimeModel createModel(String desc) {
        BehaviorRuntimeModel model = BehaviorFactory.eINSTANCE.createBehaviorRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        viewpoint.getBehaviorRuntimeModels().add(model);
        return model;
    }

    public Behavior createBehavior(BehaviorRuntimeModel model, BehaviorType type, BehaviorInstantiation inst, String name) {
        Behavior behavior = InstanceFactory.eINSTANCE.createBehavior();
        ECoreUtils.setup(behavior);
        logger.trace(" - Creating behavior instance");
        logger.trace("   id=[" + behavior.getId() + "]");        
        if (model != null) {
            model.getInstances().add(behavior);
        }
        if (type != null) {
            behavior.setType(type);
        }
        if (inst != null) {
            behavior.setInstantiation(inst);
        }
        if (name != null) {
            behavior.setName(name);
        }
        return behavior;
    }    
    private Behavior createBehavior(AbstractBehaviorType type) {
        Behavior behavior = InstanceFactory.eINSTANCE.createBehavior();
        ECoreUtils.setup(behavior);
        behavior.setType(type);
        // Add to model directly
        return behavior;
    }

    public Behavior createBehavior(BehaviorRuntimeModel model, Entity entity, AbstractBehaviorType type) {
        Behavior behavior = createBehavior(type);
        // Add to model directly
        model.getInstances().add(behavior);
        behavior.setEntity(entity);
        return behavior;
    }

    public Behavior createBehavior(BehaviorRuntimeModel model, Entity entity, BehaviorInstantiation inst) {
        Behavior behavior = createBehavior(inst.getType());
        // TODO: add to contained instantiation?
        model.getInstances().add(behavior);
        behavior.setInstantiation(inst);
        behavior.setEntity(entity);
        //
        return behavior;
    }

    public Behavior findBehavior(String name) {
        Behavior behavior = null;
        for (BehaviorRuntimeModel model : viewpoint.getBehaviorRuntimeModels()) {
            behavior = findBehavior(model, name);
            if (behavior != null) {
                return behavior;
            }
        }
        return null;
    }
    
    public Behavior findBehavior(BehaviorRuntimeModel model, String name) {
        for(Behavior b : model.getInstances()) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;        
    }
    
    
    public Action createAction(String typeName) {
        ActionType type = design.behavior.actionType.getActionTypes().get(typeName);
        if (type == null) {
            return null;
        }
        return createAction(type);
    }

    public Action createAction(ActionType type) {
        Action action = InstanceFactory.eINSTANCE.createAction();
        ECoreUtils.setup(action);
        action.setType(type);
        return action;
    }
    
    public Interaction createInteraction(InteractionType type) {
        Interaction interaction = InstanceFactory.eINSTANCE.createInteraction();
        ECoreUtils.setup(interaction);
        interaction.setType(type);
        return interaction;
    }

    

}
