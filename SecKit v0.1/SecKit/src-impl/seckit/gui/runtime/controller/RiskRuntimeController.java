package seckit.gui.runtime.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import risk.RiskFactory;
import risk.RiskRuntimeModel;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import utils.ecore.ECoreUtils;

public class RiskRuntimeController extends RuntimeController {
    
    static Logger logger = Logger.getLogger(RiskRuntimeController.class);
    
    public RiskRuntimeController(RuntimeViewpointFactory runtime) {
        super("Risk", runtime);
    }

    public RiskRuntimeModel createModel(String desc) {
        RiskRuntimeModel model = RiskFactory.eINSTANCE.createRiskRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription("Risk Model");
        viewpoint.getRiskRuntimeModels().add(model);
        return model;
    }
    
}
