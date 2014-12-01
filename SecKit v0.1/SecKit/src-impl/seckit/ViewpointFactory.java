package seckit;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import seckit.gui.ModelController;

public class ViewpointFactory {

    protected static Logger logger = Logger.getLogger(ViewpointFactory.class);
    
    public List<ModelController> controllers;

    public ViewpointFactory() {
        controllers = new ArrayList<ModelController>();
    }
    
    public void load() {
        logger.info("+ Loading models");
        for (ModelController controller : controllers) {
            controller.load();
        }
    }
    
}
