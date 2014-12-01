package seckit.gui.runtime;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.ModelController;
import seckit.gui.ModelView;

public abstract class RuntimeView extends ModelView {

    protected DesignViewpointFactory design;
    protected RuntimeViewpointFactory runtime;

    public RuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, String tabName, RuntimeViewpointFactory runtime, ModelController controller) {
        super(parentFrame, tabbedPane, tabName, controller);
        this.runtime = runtime;
        this.design = runtime.design;
        loadTree();
    }

}
