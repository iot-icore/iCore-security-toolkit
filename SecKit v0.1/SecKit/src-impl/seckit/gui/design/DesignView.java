package seckit.gui.design;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import seckit.gui.ModelController;
import seckit.gui.ModelView;

public abstract class DesignView extends ModelView {

    public DesignViewpointFactory design;

    public DesignView(JFrame parentFrame, JTabbedPane tabbedPane, String name, DesignViewpointFactory design, ModelController controller) {
        super(parentFrame, tabbedPane, name, controller);
        this.design = design;
        loadTree();
    }

}
