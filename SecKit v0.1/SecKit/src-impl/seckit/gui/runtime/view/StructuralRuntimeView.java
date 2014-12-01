package seckit.gui.runtime.view;

import identity.instance.AbstractIdentity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import com.dstc.spectrum.visual.OpinionTriangle;

import context.type.impl.ContextInformationTypeImpl;
import models.Element;
import models.Model;
import seckit.ContextQueryView;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;
import seckit.gui.runtime.controller.TrustRuntimeController;
import structure.StructuralRuntimeModel;
import structure.impl.StructuralRuntimeModelImpl;
import structure.instance.Entity;
import structure.instance.impl.EntityImpl;
import trust.instance.SubjectiveLikelihood;
import trust.instance.TrustRelationship;
import trust.instance.impl.ArbitraryTrustImpl;

public class StructuralRuntimeView extends RuntimeView implements ActionListener {

    JLabel behaviorTypeLabel;
    JComboBox<String> behaviorTypeCombo;

    JLabel serviceUsersComboLabel;
    JComboBox<String> serviceUsersCombo;

    JLabel contextProvidersLabel;
    JComboBox<String> contextProvidersCombo;

    public StructuralRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Entities", runtime, runtime.structure);
        //
        behaviorTypeLabel = new JLabel("Filter entities:");
        behaviorTypeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        behaviorTypeCombo = new JComboBox<String>(runtime.design.behavior.behaviorType.getBehaviorTypes().keySet().toArray(new String[] {}));
        behaviorTypeCombo.addActionListener(this);
        //
        serviceUsersComboLabel = new JLabel("Service user identity:");
        serviceUsersComboLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        serviceUsersCombo = new JComboBox<String>(new String[] { "Ricardo Neisse" });
        //
        contextProvidersLabel = new JLabel("Context provider:");
        contextProvidersLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contextProvidersCombo = new JComboBox<String>(new String[] { "Ricardo's Mobile phone" });
        //
        JPanel p = new JPanel();
        GridBagLayoutManager m = new GridBagLayoutManager(p);
        m.addRow(behaviorTypeLabel, behaviorTypeCombo);
        m.addRow(serviceUsersComboLabel, serviceUsersCombo);
        m.addRow(contextProvidersLabel, contextProvidersCombo);
        panel.add(p, BorderLayout.NORTH);
        p.setVisible(false);
        //
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "structure/";
        //
        Icons.addIcon(StructuralRuntimeView.class, p+"entity.png");
        Icons.addIcon(StructuralRuntimeModelImpl.class, "model.png");
        Icons.addIcon(EntityImpl.class, p + "entity.png");
        Icons.addIcon(ArbitraryTrustImpl.class, "trust/uncertain.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "structuralRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Structural Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add model", Model.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add model")) {
            }
        }
    }    
            
    class StructuralRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        StructuralRuntimeModel model;

        //
        public StructuralRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (StructuralRuntimeModel)e;
        }

        @Override
        public void load() {
            /*
             * for (Entity entity : model.getEntities()) {
             * RuntimeAssignmentRelation relation =
             * factory.viewpoint.getAssignmentRelation(); BehaviorAssignment
             * assignment = relation.getEntityMap().get(entity); if (assignment
             * != null) { if
             * (assignment.getBehavior().getType().getName().equals
             * (behaviorTypeCombo.getSelectedItem().toString())) { n(entity); }
             * }
             * 
             * }
             */
            loadFeatures("entities");
        }

        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
    };

    class EntityImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Entity entity;

        //
        public EntityImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            entity = (Entity) e;
        }

        @Override
        public void load() {

            // TODO: this does not work for the filtering...
            // n(entity.getContainedEntities());

            // Direct trust relationships
            // TODO: what if trust relationship changes? How to synchronize updates since
            //       this is not represented in the model and is dynamic? when to refresh?
            TrustRuntimeController c = runtime.trust;
            for (AbstractIdentity id : entity.getIdentities()) {
                n(c.findTrustRelationships(id.getSubject()));
            }

            /*
             * RuntimeAssignmentRelation relation =
             * runtimeViewpoint.getAssignmentRelation(); BehaviorAssignment
             * assignment = relation.getEntityMap().get(entity); for
             * (AbstractInteractionContributionOfType contribution :
             * assignment.getBehavior().getType().getContributions()) {
             * n(contribution.getServiceRoles()); }
             */
        }

        @Override
        public String getDisplayLabel() {
            if (entity.getIdentities().size() == 0) {
                return entity.getInstantiation().getName();
            } else {
                return entity.getIdentities().get(0).getSubject();
            }
            // Should never reach this line
            // return entity.getId();
        }

        @Override
        public String getStatusLabel() {
            return entity.getId() + " (assigned to ?)";
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Request service", ContextInformationTypeImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Request service")) {
                ContextQueryView dialog = new ContextQueryView(parentFrame);
                dialog.setVisible(true);
            }
        }

    };

    class ArbitraryTrustImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRelationship trust;

        //
        public ArbitraryTrustImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            trust = (TrustRelationship)e;
        }

        @Override
        public void load() {
            updateIcons();
        }

        public void updateIcons() {
            String label = runtime.trust.getLabel(trust.getDegree());

            if (label.equals("Very trustworthy"))
                setIcon("trust/very-trustworthy.png");
            else if (label.equals("Trustworthy"))
                setIcon("trust/trustworthy.png");
            else if (label.equals("Very untrustworthy"))
                setIcon("trust/very-untrustworthy.png");
            else if (label.equals("Untrustworthy"))
                setIcon("trust/untrustworthy.png");
            else
                setIcon("trust/uncertain.png");

        }

        @Override
        public String getDisplayLabel() {
            TrustRuntimeController c = runtime.trust;
            return c.getLabel(trust.getDegree()) + " " + design.trust.aspect.getLabel(trust.getAspect().get(0));
        }

        public JRadioButton cButton(JPanel panel, ButtonGroup group) {
            JRadioButton button = new JRadioButton();
            button.setHorizontalAlignment(SwingConstants.CENTER);
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            panel.add(button, null);
            group.add(button);
            return button;
        }

        public JLabel cLabel(String s, Color c, JPanel panel) {
            JLabel label = new JLabel();
            label.setText(s);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setHorizontalTextPosition(SwingConstants.CENTER);
            label.setFont(new Font("Dialog", Font.PLAIN, 10));
            label.setBackground(c);
            label.setOpaque(true);
            panel.add(label, null);
            return label;
        }

        @Override
        public void doubleClicked() {

            GridLayout l = new GridLayout();
            l.setRows(2);
            l.setHgap(0);

            JPanel p = new JPanel();
            p.setLayout(l);

            cLabel(" Very Untrustworthy ", new Color(255, 102, 102), p);
            cLabel("Unstrustworthy", new Color(255, 204, 204), p);
            cLabel("Uncertain", new Color(204, 204, 204), p);
            cLabel("Trustworthy", new Color(204, 255, 204), p);
            cLabel("Very Trustworthy", new Color(102, 255, 102), p);

            ButtonGroup group = new ButtonGroup();
            cButton(p, group);
            cButton(p, group);
            cButton(p, group);
            cButton(p, group);
            cButton(p, group);
            Enumeration<AbstractButton> buttons = group.getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().addActionListener(this);
            }

            OpinionTriangle opinionTriangle;
            opinionTriangle = new OpinionTriangle();
            opinionTriangle.setComponentOrientation(ComponentOrientation.UNKNOWN);
            opinionTriangle.setPaintGrid(true);
            opinionTriangle.setPointSize(10);
            opinionTriangle.setPaintFilled(true);
            opinionTriangle.setPaintControlLabels(true);
            opinionTriangle.setAtomicityEnabled(false);
            opinionTriangle.setEnabled(true);
            opinionTriangle.setAtomicityText("");
            opinionTriangle.setPreferredSize(new Dimension(300, 300));
            opinionTriangle.setGranularity(0.0050D);
            SubjectiveLikelihood degree = (SubjectiveLikelihood) trust.getDegree();
            // sop = new
            // SubjectiveOpinion(0.33000000000000002D,0.33000000000000002D,
            // 0.34000000000000002D);
            opinionTriangle.createOpinionPoint("degree", degree.getOpinion(), "");
            // op.addPropertyChangeListener(this);

            JPanel main = new JPanel();
            main.setLayout(new BorderLayout());
            main.add(opinionTriangle, BorderLayout.CENTER);
            main.add(p, BorderLayout.SOUTH);

            JOptionPane.showMessageDialog(parentFrame, main, "Opinion Triangle", JOptionPane.PLAIN_MESSAGE);
            degree.setOpinion(opinionTriangle.getOpinionPoints().get("degree").getOpinion());
            updateIcons();
            structuredChanged();
        }
    };

    @Override
    public void actionPerformed(ActionEvent arg0) {

        if (behaviorTypeCombo.getSelectedItem().equals("Context-Aware Service Provider")) {
            serviceUsersComboLabel.setVisible(true);
            serviceUsersCombo.setVisible(true);
        } else {
            serviceUsersComboLabel.setVisible(false);
            serviceUsersCombo.setVisible(false);
        }

        if (behaviorTypeCombo.getSelectedItem().equals("Context-Aware Service Provider")) {
            contextProvidersLabel.setVisible(true);
            contextProvidersCombo.setVisible(true);
        } else {
            contextProvidersLabel.setVisible(false);
            contextProvidersCombo.setVisible(false);
        }

        reloadTree();
    };

}
