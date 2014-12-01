package seckit.gui.runtime.controller;

import identity.instance.AbstractIdentity;
import models.Model;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import role.RoleAssignment;
import role.RoleFactory;
import role.RoleRuntimeModel;
import role.RoleType;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import utils.ecore.ECoreUtils;

public class RoleRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(RoleRuntimeController.class);

    public RoleRuntimeController(RuntimeViewpointFactory runtime) {
        super("Role", runtime);
    }

    public RoleRuntimeModel createModel(String desc) {
        RoleRuntimeModel model = RoleFactory.eINSTANCE.createRoleRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        viewpoint.getRoleRuntimeModels().add(model);
        return model;
    }
    
    public void createRoleAssignment(RoleRuntimeModel model, RoleType type, AbstractIdentity identity) {
        if (type != null) {
            RoleAssignment assignment = model.getRoleMap().get(type);
            if (assignment == null) {
                assignment = RoleFactory.eINSTANCE.createRoleAssignment();
                ECoreUtils.setup(assignment);
                assignment.setRoleType(type);
                model.getAssignments().add(assignment);
                model.getRoleMap().put(type, assignment);                
            }
            logger.debug("- Creating role assignment ["+type.getName()+"] ["+identity.getSubject()+"]");
            assignment.getIdentities().add(identity);
        }
    }

}
