package seckit.gui.runtime.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Constructor;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;
import seckit.gui.runtime.controller.TrustRuntimeController;
import trust.TrustRuntimeModel;
import trust.impl.TrustRuntimeModelImpl;
import trust.instance.PersonalTrust;
import trust.instance.SubjectiveLikelihood;
import trust.instance.TrustRelationship;
import trust.instance.impl.ArbitraryTrustImpl;
import trust.instance.impl.TrustRelationshipImpl;

import com.dstc.spectrum.opinion.SubjectiveOpinion;
import com.dstc.spectrum.visual.OpinionTriangle;
import com.dstc.spectrum.visual.OpinionTriangle.OpinionPoint;

import models.Element;
import models.Model;

public class TrustRuntimeView extends RuntimeView {

    private static final long serialVersionUID = 1L;

    public TrustRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Trust", runtime, runtime.trust);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        Icons.addIcon(TrustRuntimeView.class, "trust/trust-relationship.png");
        //
        Icons.addIcon(TrustRuntimeModelImpl.class, "model.png");
        Icons.addIcon(ArbitraryTrustImpl.class, "trust/uncertain.png");
        Icons.addIcon(TrustRelationshipImpl.class, "trust/trust-relationship.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "trustRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Trust Models";
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
            
    class TrustRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRuntimeModel model;

        //
        public TrustRuntimeModelImplNode(Node p, Element o) {
            super(p, o);
            model = (TrustRuntimeModel) o;
            n(model.getTrustRelationships());
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
    };

    
    public static JRadioButton cButton(String action, JPanel panel, ButtonGroup group) {
        JRadioButton button = new JRadioButton();
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(button, null);
        group.add(button);
        button.setActionCommand(action);
        return button;
    }

    public static JLabel cLabel(String s, Color c, JPanel panel) {
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

    public static void showOpinionTriangle(JFrame parentFrame, SubjectiveLikelihood degree) {
        //
        GridLayout l = new GridLayout();
        l.setRows(2);
        l.setHgap(0);
        //
        JPanel p = new JPanel();
        p.setLayout(l);
        //
        cLabel(" Very Untrustworthy ", new Color(255, 102, 102), p);
        cLabel("Unstrustworthy", new Color(255, 204, 204), p);
        cLabel("Uncertain", new Color(204, 204, 204), p);
        cLabel("Trustworthy", new Color(204, 255, 204), p);
        cLabel("Very Trustworthy", new Color(102, 255, 102), p);
        //
        ButtonGroup group = new ButtonGroup();
        final JRadioButton rbtnVeryUntrustworthy = cButton(" Very Untrustworthy ", p, group);
        final JRadioButton rbtnUntrustworthy = cButton("Unstrustworthy", p, group);
        final JRadioButton rbtnUncertain = cButton("Uncertain", p, group);
        final JRadioButton rbtnTrustworthy = cButton("Trustworthy", p, group);
        final JRadioButton rbtnVeryTrustworthy = cButton("Very Trustworthy", p, group);
        
        final OpinionTriangle opinionTriangle;
        opinionTriangle = new OpinionTriangle();
        opinionTriangle.setComponentOrientation(ComponentOrientation.UNKNOWN);
        opinionTriangle.setPaintGrid(true);
        opinionTriangle.setPointSize(10);
        opinionTriangle.setPaintFilled(true);
        opinionTriangle.setPaintControlLabels(true);
        opinionTriangle.setAtomicityEnabled(false);
        opinionTriangle.setEnabled(true);
        opinionTriangle.setAtomicityText("");
        opinionTriangle.setPreferredSize(new Dimension(200, 200));
        opinionTriangle.setGranularity(0.0050D);
        final SubjectiveOpinion subjectiveOp = degree.getOpinion();   
        final OpinionPoint op = opinionTriangle.createOpinionPoint("degree", subjectiveOp, "");
        
        op.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                SubjectiveOpinion sop = opinionTriangle.getOpinionPoint("degree").getOpinion();
                if (sop.getBelief() == sop.getDisbelief()) {
                    //rbtnUncertain.setSelected(true);
                } else {
                    if (sop.getBelief() > sop.getDisbelief()) {
                        if (sop.getUncertainty() < 0.33000000000000002D) {
                            rbtnVeryTrustworthy.setSelected(true);
                            // sliderTrustDegree.setValue(900);
                        } else {
                            rbtnTrustworthy.setSelected(true);
                            //sliderTrustDegree.setValue(700);
                        }
                    } else {
                        if (sop.getUncertainty() < 0.33000000000000002D) {
                            rbtnVeryUntrustworthy.setSelected(true);
                            // sliderTrustDegree.setValue(100);
                        } else {
                            // sliderTrustDegree.setValue(300);
                            rbtnUntrustworthy.setSelected(true);
                        }
                    }
                }
                // System.out.println(" Belief:" + sop.getBelief() + " \n Disbelief: " + sop.getDisbelief() + " \n Uncertainty " + sop.getUncertainty());
                
            }
        });
        
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {                    
                    double b = 0.0D; 
                    double d = 0.0D; 
                    double u = 0.0D;
                    
                    OpinionPoint op = opinionTriangle.getOpinionPoint("degree");
                    
                    if (e.getActionCommand().equals("Very Trustworthy")) {
                        b = 0.670D;
                        d = 0.165D;
                        u = 0.165D;
                    } 
                    if (e.getActionCommand().equals("Trustworthy")) {
                        b = 0.300D;
                        d = 0.140D;
                        u = 0.560D;
                    }
                    if (e.getActionCommand().equals("Uncertain")) {
                        
                        double med = (op.getOpinion().getBelief() + op.getOpinion().getDisbelief()) / 2.0D;
                        b = med;
                        d = med;
                        u = 1.0D - (2 * med);
                    }
                    if (e.getActionCommand().equals("Unstrustworthy")) {
                        b = 0.140D;
                        d = 0.300D;
                        u = 0.560D;
                    }
                    if (e.getActionCommand().equals(" Very Untrustworthy ")) {
                        b = 0.165D;
                        d = 0.670D;
                        u = 0.165D;
                    }
                    subjectiveOp.set(b, d, u);
                    opinionTriangle.getOpinionPoint("degree").setOpinion(subjectiveOp);
                }
            });
        }
        // subjectiveOp = new SubjectiveOpinion(0.33000000000000002D,0.33000000000000002D, 0.34000000000000002D);
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        main.add(opinionTriangle, BorderLayout.CENTER);
        main.add(p, BorderLayout.SOUTH);
        // Fire property change to update radio button selection
        for (PropertyChangeListener cl : op.getPropertyChangeListeners()) {
            cl.propertyChange(null);
        }
        //
        
        JOptionPane.showMessageDialog(parentFrame, main, "Opinion Triangle", JOptionPane.PLAIN_MESSAGE);
        //
        degree.setOpinion(opinionTriangle.getOpinionPoints().get("degree").getOpinion());
    }    
    
    class ArbitraryTrustImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRelationship trust;

        //
        public ArbitraryTrustImplNode(Node p, Element o) {
            super(p, o);
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
            logger.trace("Updating icons "+runtime.trust.getIconFilePath(trust.getDegree()));
            setIcon(runtime.trust.getIconFilePath(trust.getDegree()));
        }

        @Override
        public String getDisplayLabel() {
            TrustRuntimeController c = runtime.trust;
            PersonalTrust scope = (PersonalTrust) trust.getTrusteeScope();
            return scope.getTrustee().getSubject() + " - " + c.getLabel(trust.getDegree()) + " " + design.trust.aspect.getLabel(trust.getAspect().get(0));
        }

        @Override
        public void doubleClicked() {
            showOpinionTriangle(parentFrame, (SubjectiveLikelihood) trust.getDegree());
            updateIcons();
            structuredChanged();
        }
    };

}
