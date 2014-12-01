package seckit.gui;

import java.util.ArrayList;
import java.util.List;

import models.Element;
import models.Model;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import seckit.SystemViewpoint;
import seckit.ViewpointFactory;

public abstract class ModelController extends Controller {

    private List<ModelView> views;
    private static Logger logger = Logger.getLogger(ModelController.class);
    
    public ModelController(String name, ViewpointFactory factory) {
        super(name);
        logger.info("+ " + name);
        factory.controllers.add(this);
        views = new ArrayList<ModelView>();
    }

    public abstract SystemViewpoint getViewpoint();
    
    public abstract void reset();
    
    public abstract void load();
    
    public final void reload() {
        reset();
        load();
    }
    
    public void addView(ModelView view) {
        views.add(view);
    }

    public void nodeChanged(Element e) {
        for (ModelView view : views) {
        }
    }
    
    public void reloadAllViews() {
        for (ModelView view : views) {
            view.reloadTree();
        }
    }
    
    public class ElementController {}
    
}
