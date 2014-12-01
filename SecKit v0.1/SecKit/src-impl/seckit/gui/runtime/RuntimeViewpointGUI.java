package seckit.gui.runtime;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import rule.event.EventSubscription;
import seckit.SeckitFactory;
import seckit.SystemViewpoints;
import utils.ecore.ECoreUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.ecore.EObject;

import seckit.gui.Icons;
import seckit.gui.ViewpointGUI;
import seckit.gui.TabbedGUI;
import seckit.gui.ModelView;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.design.controller.RuleDesignController;
import seckit.gui.runtime.view.BehaviorRuntimeView;
import seckit.gui.runtime.view.ContextRuntimeView;
import seckit.gui.runtime.view.DataRuntimeView;
import seckit.gui.runtime.view.IdentityRuntimeView;
import seckit.gui.runtime.view.RiskRuntimeView;
import seckit.gui.runtime.view.RoleRuntimeView;
import seckit.gui.runtime.view.RuleRuntimeView;
import seckit.gui.runtime.view.StructuralRuntimeView;
import seckit.gui.runtime.view.TrustRuntimeView;

public class RuntimeViewpointGUI extends ViewpointGUI implements ActionListener {

    DesignViewpointFactory design;
    RuntimeViewpointFactory runtime;

    public boolean dataRuntimeVisible = true;
    public boolean identityRuntimeVisible = true;
    public boolean contextRuntimeVisible = true;
    public boolean trustRuntimeVisible = true;
    public boolean roleRuntimeVisible = true;
    public boolean structureRuntimeVisible = true;
    public boolean behaviorRuntimeVisible = true;
    public boolean riskRuntimeVisible = true;
    public boolean ruleRuntimeVisible = true;

    JTextField txtDesignModel;
    JTextField txtDataDesignModel;
    JCheckBox selectNewNode;

    public RuntimeViewpointGUI(TabbedGUI gui, RuntimeViewpointFactory runtime) {
        super("Runtime Models", gui);
        this.runtime = runtime;
        this.design = runtime.design;
    }

    public void show() {
        logger.info("- Creating and loading RUNTIME views");

        JFrame f = frame;
        JTabbedPane t = tabbedPane;

        // JTabbedPane tabbedPane;
        // tabbedPane = new JTabbedPane();
        if (runtime != null) {
            
            if (dataRuntimeVisible)
                views.add(new DataRuntimeView(f, t, runtime));            
            if (identityRuntimeVisible)
                views.add(new IdentityRuntimeView(f, t, runtime));
            if (contextRuntimeVisible)
                views.add(new ContextRuntimeView(f, t, runtime));            
            if (trustRuntimeVisible)
                views.add(new TrustRuntimeView(f, t, runtime));
            if (roleRuntimeVisible)
                views.add(new RoleRuntimeView(f, t, runtime));            
            if (structureRuntimeVisible)
                views.add(new StructuralRuntimeView(f, t, runtime));
            if (behaviorRuntimeVisible)
                views.add(new BehaviorRuntimeView(f, t, runtime));            
            if (riskRuntimeVisible)
                views.add(new RiskRuntimeView(f, t, runtime));            
            if (ruleRuntimeVisible)
                views.add(new RuleRuntimeView(f, t, runtime));
            
        }
        // this.tabbedPane.addTab("Runtime Models", tabbedPane);

        /*
         * tabbedPane.addTab("Requirements", null, new JPanel(),
         * "Does nothing"); tabbedPaneSec.addTab("Risk Analysis", null, new
         * JPanel(), "Does nothing");
         */
        // tabbedPane.setSelectedIndex(2);

        for (ModelView view : views)
            view.legend.add();

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
        // panel.add(toolBar, BorderLayout.PAGE_START);
    }

    SystemViewpoints viewpoints;

    String lastSelected = null;
    String[] possibilities = { "iCore", "ContextAware", "CognitiveRadio", "Identity", "Android" };

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Save")) {
            //

            String s = (String) JOptionPane.showInputDialog(frame, "Save model to file:", "Save", JOptionPane.PLAIN_MESSAGE, null, possibilities, lastSelected);
            lastSelected = s;
            if ((s != null) && (s.length() > 0)) {
                viewpoints = SeckitFactory.eINSTANCE.createSystemViewpoints();

                // viewpoints.setDesignViewpoint(design.viewpoint);

                viewpoints.setRuntime(runtime.viewpoint);
                String file = "./models/" + s + "Viewpoints.xmi";
                logger.info("Saving design viewpoints to file [" + file + "]");
                ECoreUtils.objectToXmlFile(viewpoints, file, "viewpoints.xml");

                logger.info("Subscriptions: " + design.rule.eventSubscriptions.size());
                for (EventSubscription sub : design.rule.eventSubscriptions) {
                    logger.info(ECoreUtils.objectToXmlString((EObject) sub, "viewpoints.xml"));
                }

                // Publishes design model, default file name
                /*
                MqttPublisher modelPub = new MqttPublisher("DesignModelRepository");
                modelPub.publish(ECoreUtils.objectToXmlString(viewpoints, "viewpoints.xml"), true);
                modelPub.disconnect();
                */
            }

        }

        if (e.getActionCommand().equals("Load")) {
            //
            String s = (String) JOptionPane.showInputDialog(frame, "Load model from file:", "Load", JOptionPane.PLAIN_MESSAGE, null, possibilities,
                            lastSelected);
            if ((s != null) && (s.length() > 0)) {
                lastSelected = s;
                String file = "./models/" + s + "Viewpoints.xmi";
                logger.info("Loading design view point from file [" + file + "]");
                viewpoints = (SystemViewpoints) ECoreUtils.xmlFileToEObject(file);

                // design.viewpoint = viewpoints.getDesignViewpoint();

                runtime.viewpoint = viewpoints.getRuntime();
                //

                /*
                 * logger.trace("Loading controllers"); for (Controller
                 * controller : design.controllers) {
                 * logger.trace(" - "+controller.getClass().getSimpleName());
                 * controller.loadModel(); controller.reloadViews(); }
                 */

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
