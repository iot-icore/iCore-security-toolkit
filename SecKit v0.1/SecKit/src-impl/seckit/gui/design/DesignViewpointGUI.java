package seckit.gui.design;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import seckit.SystemDesignViewpoint;
import utils.ecore.ECoreUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import seckit.gui.ModelController;
import seckit.gui.Icons;
import seckit.gui.ViewpointGUI;
import seckit.gui.TabbedGUI;
import seckit.gui.ModelView;
import seckit.gui.design.view.BehaviorDesignView;
import seckit.gui.design.view.ContextDesignView;
import seckit.gui.design.view.DataDesignView;
import seckit.gui.design.view.IdentityDesignView;
import seckit.gui.design.view.RiskDesignView;
import seckit.gui.design.view.RoleDesignView;
import seckit.gui.design.view.RuleDesignView;
import seckit.gui.design.view.StructuralDesignView;
import seckit.gui.design.view.TrustDesignView;

public class DesignViewpointGUI extends ViewpointGUI implements ActionListener {

    /*
     * Steps to add new design view: - Create a new design view class extending
     * DesignView - Create a new design controller class extending
     * DesignController - Add a new member to DesignViewpointFactory for the
     * controller -
     */
    DesignViewpointFactory design;

    public boolean toolbarVisible = false;    
    
    public boolean dataDesignVisible = true;
    public boolean identityDesignVisible = true;
    public boolean contextDesignVisible = true;
    public boolean trustDesignVisible = true;
    public boolean roleDesignVisible = true;
    public boolean structureDesignVisible = true;
    public boolean behaviorDesignVisible = true;
    public boolean riskDesignVisible = true;
    public boolean ruleDesignVisible = true;

    JTextField txtDesignModel;
    JTextField txtDataDesignModel;
    JCheckBox selectNewNode;

    public DesignViewpointGUI(TabbedGUI gui, DesignViewpointFactory design) {
        super("Design Models", gui);
        this.design = design;
    }

    public void show() {
        logger.info("- Creating and loading DESIGN views");
        JFrame f = frame;
        JTabbedPane t = tabbedPane;

        if (dataDesignVisible)
            views.add(new DataDesignView(f, t, design));
        if (identityDesignVisible)
            views.add(new IdentityDesignView(f, t, design));
        if (contextDesignVisible)
            views.add(new ContextDesignView(f, t, design));
        if (trustDesignVisible) 
            views.add(new TrustDesignView(f, t, design));
        if (roleDesignVisible)
            views.add(new RoleDesignView(f, t, design));        
        if (structureDesignVisible)
            views.add(new StructuralDesignView(f, t, design));
        if (behaviorDesignVisible)
            views.add(new BehaviorDesignView(f, t, design));
        if (riskDesignVisible) 
            views.add(new RiskDesignView(f, t, design));
        if (ruleDesignVisible)
            views.add(new RuleDesignView(f, t, design));
        for (ModelView view : views)
            view.legend.add();
        /*
        */
        
        /*
         * tabbedPane.addTab("Requirements", null, new JPanel(),
         * "Does nothing"); tabbedPaneSec.addTab("Risk Analysis", null, new
         * JPanel(), "Does nothing");
         */
        // tabbedPane.setSelectedIndex(2);


        if (toolbarVisible) {
            JButton btnSave;
            btnSave = new JButton(Icons.createIcon("toolbar/save-icon.png"));
            btnSave.setActionCommand("Save");
            btnSave.addActionListener(this);
    
            JButton btnLoad;
            btnLoad = new JButton(Icons.createIcon("toolbar/folder-icon.png"));
            btnLoad.setActionCommand("Load");
            btnLoad.addActionListener(this);
    
            /*
             * JPanel topPanel = new JPanel(); GridBagLayoutManager m = new
             * GridBagLayoutManager(topPanel); m.addRow(new JLabel(""), new
             * JCheckBox("Show legend")); m.addRow(new JLabel(""), new
             * JCheckBox("Sync package names")); m.addRow(new JLabel(""), new
             * JCheckBox("Select new node")); frame.getContentPane().add(topPanel,
             * BorderLayout.NORTH);
             */
            
            JToolBar toolBar = new JToolBar("Drag me!");
            toolBar.add(btnSave);
            toolBar.add(btnLoad);
            // toolBar.add(txtDataDesignModel);        
            panel.add(toolBar, BorderLayout.PAGE_START);
        }
    }

    String lastSelected = null;
    String[] targetFilenames = { "System", "iCore", "ContextAware", "CognitiveRadio", "Identity", "Android" };

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Save")) {
            //

            String s = (String) JOptionPane.showInputDialog(frame, "Save model to file:", "Save", JOptionPane.PLAIN_MESSAGE, null, targetFilenames, lastSelected);
            lastSelected = s;
            if ((s != null) && (s.length() > 0)) {

                String filename = s + "DesignViewpoint.xmi";
                String file = "./models/" + filename;
                logger.info("Saving design viewpoint to file [" + file + "]");
                ECoreUtils.objectToXmlFile(design.viewpoint, file, filename);

                /*
                 * try {
                 * System.out.println(ECoreUtils.objectToJson(design.viewpoint
                 * )); } catch (IOException e1) { e1.printStackTrace(); }
                 * 
                 * logger.info("Subscriptions: " +
                 * RuleDesignController.eventSubscriptions.size()); for
                 * (EventSubscription sub :
                 * RuleDesignController.eventSubscriptions) {
                 * logger.info(ECoreUtils.objectToXmlString((EObject) sub,
                 * "eventSubscriptions.xmi")); }
                 */

                // Publishes design model, default file name
                /*
                MqttPublisher publisher = new MqttPublisher("DesignModelsGUI", "DesignViewpoint");
                publisher.publish(ECoreUtils.objectToXmlString(design.viewpoint, filename), true);
                publisher.disconnect();
                */
            }

        }

        if (e.getActionCommand().equals("Load")) {
            //
            String s = (String) JOptionPane.showInputDialog(frame, "Load model from file:", "Load", JOptionPane.PLAIN_MESSAGE, null, targetFilenames,
                            lastSelected);
            if ((s != null) && (s.length() > 0)) {

                lastSelected = s;
                String filename = s + "DesignViewpoint.xmi";
                String file = "./models/" + filename;
                logger.info("Loading design view point from file [" + file + "]");
                design.viewpoint = (SystemDesignViewpoint) ECoreUtils.xmlFileToEObject(file);

                //
                logger.trace("Loading controllers");
                for (ModelController controller : design.controllers) {
                    logger.trace(" - " + controller.getClass().getSimpleName());
                    
                    // TODO: FIX LOADING!
                    // controller.loadModels();
                    // controller.reloadAllViews();
                }
            }

            /*
             * // TODO: load runtimeViewpoint? for (View view : views) {
             * view.reloadTree(); Does not work! what is the problem?? } //
             * IdentityDesignView identityView =
             * (IdentityDesignView)dfactory.identityController.getView();
             * //identityView.setDesignViewpoint(dfactory.viewpoint);
             */
        }
    }

}
