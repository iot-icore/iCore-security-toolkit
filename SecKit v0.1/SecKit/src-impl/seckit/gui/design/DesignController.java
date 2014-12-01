package seckit.gui.design;

import seckit.SystemDesignViewpoint;
import seckit.SystemViewpoint;
import seckit.gui.ModelController;

public class DesignController extends ModelController {

    protected DesignViewpointFactory design;
    protected SystemDesignViewpoint viewpoint;

    public DesignController(String name, DesignViewpointFactory design) {
        super(name, design);
        this.design = design;
        viewpoint = design.viewpoint;
    }

    @Override
    public SystemViewpoint getViewpoint() {
        return viewpoint;
    }

    @Override
    public void reset() {
    }

    @Override
    public void load() {
    }

}
