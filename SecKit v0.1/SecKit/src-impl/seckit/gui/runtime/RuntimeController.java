package seckit.gui.runtime;

import seckit.SystemRuntimeViewpoint;
import seckit.SystemViewpoint;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.ModelController;

public class RuntimeController extends ModelController {

    protected SystemRuntimeViewpoint viewpoint;
    public RuntimeViewpointFactory runtime;
    public DesignViewpointFactory design;

    public RuntimeController(String name, RuntimeViewpointFactory runtime) {
        super(name, runtime);
        this.runtime = runtime;
        this.design = runtime.design;
        viewpoint = runtime.viewpoint;
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
