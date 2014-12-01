package seckit.gui.runtime.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import context.ContextFactory;
import context.ContextRuntimeModel;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import utils.ecore.ECoreUtils;

public class ContextRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(ContextRuntimeController.class);    
    
    public ContextRuntimeController(RuntimeViewpointFactory runtime) {
        super("Context", runtime);
    }

    public ContextRuntimeModel createModel(String desc) {
        ContextRuntimeModel model = ContextFactory.eINSTANCE.createContextRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        viewpoint.getContextRuntimeModels().add(model);
        return model;
    }

}
