package seckit.gui.runtime.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import data.DataFactory;
import data.DataRuntimeModel;
import data.instance.Data;
import data.instance.InstanceFactory;
import data.instantiation.DataInstantiation;
import data.type.DataType;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import utils.ecore.ECoreUtils;

public class DataRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(DataRuntimeController.class);
    
    static long dataId = 0;
    
    public DataRuntimeController(RuntimeViewpointFactory runtime) {
        super("Data", runtime);
    }

    public DataRuntimeModel createModel(String desc) {
        DataRuntimeModel model = DataFactory.eINSTANCE.createDataRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        viewpoint.getDataRuntimeModels().add(model);        
        return model;
    }
    
    public Data createData(DataRuntimeModel model, String value, DataInstantiation inst, DataType type) {
        Data data = InstanceFactory.eINSTANCE.createData();
        ECoreUtils.setup(data);
        data.setStringValue(value);
        data.setInstantiation(inst);
        data.setType(type);
        synchronized (this) {
            dataId++;
            data.setDataId(new Long(dataId).toString());
        }
        model.getData().add(data);
        return data;
    }

}
