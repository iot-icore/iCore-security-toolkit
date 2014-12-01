package seckit.gui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.apache.log4j.Logger;

public abstract class ViewpointGUI {

    protected static Logger logger = Logger.getLogger(ViewpointGUI.class);

    public TabbedGUI gui;
    public JFrame frame;
    public JTabbedPane tabbedPane;
    public JPanel panel;

    protected ArrayList<ModelView> views = new ArrayList<ModelView>();

    public ViewpointGUI(String label, TabbedGUI gui) {
        if (gui == null) {
            gui = new TabbedGUI();
        }
        this.gui = gui;
        frame = gui.frame;
        panel = new JPanel(new BorderLayout());
        tabbedPane = gui.createTabbedPane(this, label, panel);
    }

    public abstract void show();

}
