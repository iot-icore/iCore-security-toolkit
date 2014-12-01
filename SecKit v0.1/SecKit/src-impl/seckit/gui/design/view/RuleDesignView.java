package seckit.gui.design.view;

import identity.impl.IdentityAttributeVariableImpl;
import identity.impl.IdentityInstanceVariableImpl;
import identity.pattern.IdentityAttributePattern;
import identity.pattern.IdentityPattern;
import identity.pattern.impl.IdentityAttributePatternImpl;
import identity.pattern.impl.IdentityPatternImpl;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;

import org.eclipse.emf.ecore.EObject;

import context.pattern.ContextSituationPattern;
import context.pattern.EntityRolePattern;
import context.pattern.impl.EntityRolePatternImpl;
import data.instantiation.DataInstantiation;
import data.instantiation.DataInstantiationHierarchy;
import data.instantiation.DataInstantiationReference;
import data.pattern.DataPattern;
import data.pattern.impl.DataPatternImpl;
import data.pattern.impl.LiteralPatternImpl;
import data.pattern.impl.RegExpPatternImpl;
import data.pattern.impl.XPathPatternImpl;
import data.variable.DataVariable;
import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.impl.BehaviorInstantiationImpl;
import models.Element;
import models.Model;
import models.variable.ReferenceVariableAssignment;
import models.variable.RegExpVariableAssignment;
import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.impl.ReferenceVariableAssignmentImpl;
import models.variable.impl.RegExpVariableAssignmentImpl;
import role.IdentityRolePattern;
import role.RolePattern;
import role.impl.IdentityRolePatternImpl;
import role.impl.RolePatternImpl;
import rule.RuleDesignModel;
import behavior.event.ActivityEventPattern;
import rule.condition.Atom;
import behavior.event.BehaviorEventPattern;
import rule.condition.Binary;
import rule.condition.Constant;
import context.event.ContextSituationEventPattern;
import structure.event.EntityEventPattern;
import behavior.condition.EvaluateAction;
import rule.condition.EventPattern;
import rule.condition.FormulaTemplate;
import rule.condition.Multiary;
import rule.condition.Operator;
import rule.condition.TimeStepEventPattern;
import rule.condition.TruthValue;
import rule.condition.Unary;
import behavior.event.impl.ActivityEventPatternImpl;
import behavior.event.impl.BehaviorEventPatternImpl;
import rule.condition.impl.ConstantImpl;
import context.event.impl.ContextSituationEventPatternImpl;
import structure.event.impl.EntityEventPatternImpl;
import behavior.condition.impl.EvaluateActionImpl;
import behavior.constraint.DataConstraint;
import behavior.constraint.DataEstablishmentFromVariable;
import behavior.constraint.IdentityEstablishmentFromVariable;
import rule.condition.impl.FormulaInstantiationImpl;
import rule.condition.impl.FormulaTemplateImpl;
import rule.condition.impl.TimeStepEventPatternImpl;
import trust.action.AddBeliefEvidence;
import trust.action.AddDisbeliefEvidence;
import rule.action.Allow;
import behavior.action.BehaviorExecution;
import rule.action.Deny;
import data.action.ModifyData;
import trust.action.impl.AddBeliefEvidenceImpl;
import trust.action.impl.AddDisbeliefEvidenceImpl;
import rule.action.impl.AllowImpl;
import behavior.action.impl.BehaviorExecutionImpl;
import rule.action.impl.DelayImpl;
import rule.action.impl.DenyImpl;
import data.action.impl.ModifyDataImpl;
import identity.action.impl.ModifyIdentityImpl;
import rule.event.EventModality;
import rule.impl.RuleDesignModelImpl;
import behavior.pattern.ActionPattern;
import behavior.pattern.ActivityPattern;
import behavior.pattern.BehaviorPattern;
import structure.pattern.EntityPattern;
import behavior.pattern.InteractionContributionPattern;
import behavior.pattern.InteractionPattern;
import trust.pattern.ArbitraryTrustPattern;
import trust.pattern.ExperienceTrustPattern;
import trust.pattern.PersonalScopePattern;
import trust.pattern.TrustLevelPattern;
import trust.pattern.TrustPattern;
import trust.pattern.TrustRecommendationPattern;
import trust.pattern.TrustRelationshipPattern;
import behavior.pattern.impl.BehaviorPatternImpl;
import structure.pattern.impl.EntityPatternImpl;
import behavior.pattern.impl.InteractionContributionPatternImpl;
import behavior.trust.BehaviorQuality;
import behavior.trust.CompleteServiceAsAgreed;
import behavior.trust.PrivacyProtection;
import behavior.type.ActionType;
import behavior.type.InteractionContributionType;
import behavior.type.InteractionType;
import trust.pattern.impl.ArbitraryTrustPatternImpl;
import trust.pattern.impl.PersonalScopePatternImpl;
import trust.pattern.impl.TrustPatternImpl;
import trust.pattern.impl.TrustRecommendationPatternImpl;
import trust.pattern.impl.TrustRelationshipPatternImpl;
import rule.propositional.impl.AndImpl;
import rule.propositional.impl.ImpliesImpl;
import rule.propositional.impl.NotImpl;
import rule.propositional.impl.OrImpl;
import rule.template.CombiningAlgorithm;
import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.RuleXPathVariableAssignment;
import rule.template.Template;
import rule.template.TimeStepSize;
import rule.template.XPathContext;
import rule.template.impl.AllowOverridesImpl;
import rule.template.impl.RuleTemplateConfigurationImpl;
import rule.template.impl.RuleTemplateImpl;
import rule.template.impl.RuleTemplatePackageImpl;
import rule.template.impl.RuleXPathVariableAssignmentImpl;
import rule.template.impl.TimeStepSizeImpl;
import rule.template.impl.TimeStepVariableImpl;
import rule.temporal.Before;
import rule.temporal.Eventually;
import rule.temporal.TimeBoundedTemporalOperator;
import rule.temporal.Within;
import rule.temporal.impl.AlwaysImpl;
import rule.temporal.impl.BeforeImpl;
import rule.temporal.impl.DuringImpl;
import rule.temporal.impl.EventuallyImpl;
import rule.temporal.impl.RepeatLimitImpl;
import rule.temporal.impl.RepeatMaximumImpl;
import rule.temporal.impl.RepeatSinceImpl;
import rule.temporal.impl.SinceImpl;
import rule.temporal.impl.WithinImpl;
import seckit.gui.Icons;
import seckit.gui.MyTreeCellEditor;
import seckit.gui.Node;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;
import structure.instantiation.EntityInstantiationHierarchy;
import structure.instantiation.EntityInstantiationReference;
import structure.variable.impl.EntityInstanceVariableImpl;
import time.TimeDuration;
import trust.instance.ArbitraryTrust;
import trust.instance.AtLeast;
import trust.instance.AtMost;
import trust.instance.ExperienceTrust;
import trust.instance.SubjectiveLogicConsensus;
import trust.instance.TrustLevel;
import trust.instance.impl.AtLeastImpl;
import trust.instance.impl.AtMostImpl;
import trust.instance.impl.SubjectiveLogicConsensusImpl;

public class RuleDesignView extends DesignView {

    public RuleDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Rule", design, design.rule);

        legend.add(RuleDesignModelImpl.class, "Model");
        legend.add(RuleTemplatePackageImpl.class, "Package");

        legend.add(TimeStepSizeImpl.class, "Time step size");

        legend.add(FormulaTemplateImpl.class, "Formula template");
        
        legend.add("Enforcement Rule");
        legend.add(RuleTemplateImpl.class, "Template");
        legend.add(RuleTemplateConfigurationImpl.class, "Configuration");
        legend.add(CombiningAlgorithm.class, "Combining alg.");

        /*
         * 
         * legend.add(EntityPatternImpl.class, "Entity");
         * legend.add(BehaviorPatternImpl.class, "Behavior");
         * legend.add(SituationRolePatternImpl.class, "Situation role type");
         * 
         * legend.add(BehaviorInstantiationImpl.class, "Behavior inst");
         * 
         * legend.add(RolePatternImpl.class, "Role type");
         * legend.add(EvaluateActionImpl.class, "Action inst");
         */
        //
        legend.add("Variable");
        legend.add(EntityInstanceVariableImpl.class, "Declaration");
        legend.add(ReferenceVariableAssignmentImpl.class, "Assignment");
        //
        legend.add("Atoms");
        legend.add(TimeStepEventPatternImpl.class, "Event");
        legend.add(IdentityRolePatternImpl.class, "Identity role");
        legend.add(DataPatternImpl.class, "Attribute pattern");
        legend.add(ConstantImpl.class, "Constant");
        //
        legend.add(NotImpl.class, "Not");
        legend.add(AndImpl.class, "And");
        legend.add(OrImpl.class, "Or");
        legend.add(ImpliesImpl.class, "Implies");
        //
        legend.add(AlwaysImpl.class, "Always");
        legend.add(EventuallyImpl.class, "Eventually");
        legend.add(SinceImpl.class, "Since");
        legend.add(BeforeImpl.class, "Before");
        legend.add(WithinImpl.class, "Within");
        legend.add(DuringImpl.class, "During");
        legend.add(RepeatSinceImpl.class, "Repeat Since");
        legend.add(RepeatMaximumImpl.class, "Repeat Maximum");
        legend.add(RepeatLimitImpl.class, "Repeat Limit");
        //

        //
        legend.add("Enforcement action");
        legend.add(AllowImpl.class, "Allow");
        legend.add(DenyImpl.class, "Deny");
        legend.add(DelayImpl.class, "Delay");
        legend.add(ModifyDataImpl.class, "Modify");
        legend.add(BehaviorExecutionImpl.class, "Execute");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "rule/";
        //
        Icons.addIcon(RuleDesignView.class, p+"rule-template-enf.png");
        //
        Icons.addIcon(RuleDesignModelImpl.class, "model.png");
        //
        Icons.addIcon(TimeStepSizeImpl.class, p + "clock.png");
        //
        Icons.addIcon(RuleTemplatePackageImpl.class, p + "package.png");
        //
        Icons.addIcon(FormulaTemplateImpl.class, p+"formula_template.png");
        Icons.addIcon(FormulaInstantiationImpl.class, p+"formula_instantiation.png");
        //
        Icons.addIcon(RuleTemplateImpl.class, p + "rule-template-enf.png");
        Icons.addIcon(RuleTemplateConfigurationImpl.class, p + "rule-template-enf-conf.png");
        //
        Icons.addIcon(EntityInstanceVariableImpl.class, "variable-declaration.png");
        Icons.addIcon(IdentityInstanceVariableImpl.class, "variable-declaration.png");
        Icons.addIcon(IdentityAttributeVariableImpl.class, "variable-declaration.png");
        Icons.addIcon(TimeStepVariableImpl.class, "variable-declaration.png");        
        //
        Icons.addIcon(RuleXPathVariableAssignmentImpl.class, "variable-assignment.png");
        Icons.addIcon(RegExpVariableAssignmentImpl.class, "variable-assignment.png");
        Icons.addIcon(ReferenceVariableAssignmentImpl.class, "variable-assignment.png");
        //
        Icons.addIcon(TimeStepEventPatternImpl.class, p + "event_pattern.png");
        //
        Icons.addIcon(ActivityEventPatternImpl.class, p + "event_pattern.png");
        Icons.addIcon(EntityEventPatternImpl.class, p + "event_pattern.png");
        Icons.addIcon(BehaviorEventPatternImpl.class, p + "event_pattern.png");
        //
        Icons.addIcon(TrustPatternImpl.class, "trust/uncertain.png");
        Icons.addIcon(TrustRelationshipPatternImpl.class, "trust/uncertain.png");
        Icons.addIcon(ArbitraryTrustPatternImpl.class, "trust/uncertain.png");
        Icons.addIcon(AtLeastImpl.class, "atleast.png");        
        Icons.addIcon(AtMostImpl.class, "atmost.png");        
        Icons.addIcon(PersonalScopePatternImpl.class, "default.png");
        Icons.addIcon(SubjectiveLogicConsensusImpl.class, "trust/consensus.png");
        Icons.addIcon(TrustRecommendationPatternImpl.class, "trust/recommendation.png");        
        //
        // Icons.addIcon(ActivityTypePatternImpl.class, "activity-type.png");
        Icons.addIcon(InteractionContributionPatternImpl.class, "behavior/interaction-participant.png");
        //
        Icons.addIcon(IdentityRolePatternImpl.class, "role/identity-role.png");
        Icons.addIcon(IdentityPatternImpl.class, "identity/identity-inst.png");
        Icons.addIcon(RegExpPatternImpl.class, "data/data-instantiation.png");
        Icons.addIcon(DataPatternImpl.class, "data/data-instantiation.png");                
        Icons.addIcon(LiteralPatternImpl.class, "data/data-instantiation.png");
        Icons.addIcon(XPathPatternImpl.class, "data/data-instantiation.png");
        Icons.addIcon(IdentityAttributePatternImpl.class, "identity/identity-att-inst.png");

        //
        Icons.addIcon(EntityPatternImpl.class, "structure/entity-inst.png");
        // Icons.addIcon(EntityInstancePatternImpl.class, "entity-inst.png");
        //
        Icons.addIcon(BehaviorPatternImpl.class, p + "behavior-pattern.png");
        // Icons.addIcon(BehaviorTypePatternImpl.class, "behavior-type.png");
        //
        Icons.addIcon(RolePatternImpl.class, "role/role-type.png");
        //
        Icons.addIcon(ContextSituationEventPatternImpl.class, p + "event_pattern.png");
        Icons.addIcon(EntityRolePatternImpl.class, "context/entity-role-type.png");
        //
        Icons.addIcon(ConstantImpl.class, p + "condition.png");

        Icons.addIcon(EvaluateActionImpl.class, "behavior/action-inst.png");

        Icons.addIcon(CombiningAlgorithm.class, p + "combining-alg.png");
        Icons.addIcon(AllowOverridesImpl.class, p + "combining-alg.png");

        //
        Icons.addIcon(NotImpl.class, p + "not.png");
        Icons.addIcon(AndImpl.class, p + "and.png");
        Icons.addIcon(OrImpl.class, p + "or.png");
        Icons.addIcon(ImpliesImpl.class, p + "implies.png");
        //
        Icons.addIcon(AlwaysImpl.class, p + "always.png");
        Icons.addIcon(EventuallyImpl.class, p + "eventually.png");
        Icons.addIcon(SinceImpl.class, p + "since.png");
        Icons.addIcon(BeforeImpl.class, p + "before.png");
        Icons.addIcon(WithinImpl.class, p + "within.png");
        Icons.addIcon(DuringImpl.class, p + "during.png");
        Icons.addIcon(RepeatSinceImpl.class, p + "repeat_since.png");
        Icons.addIcon(RepeatMaximumImpl.class, p + "repeat_max.png");
        Icons.addIcon(RepeatLimitImpl.class, p + "repeat_limit.png");
        //
        Icons.addIcon(AllowImpl.class, p + "allow.png");
        Icons.addIcon(DenyImpl.class, p + "deny.png");
        Icons.addIcon(ModifyDataImpl.class, p + "modify.png");
        Icons.addIcon(ModifyIdentityImpl.class, p + "modify.png");
        Icons.addIcon(DelayImpl.class, p + "delay.png");
        Icons.addIcon(BehaviorExecutionImpl.class, p + "execute.png");
        Icons.addIcon(AddBeliefEvidenceImpl.class, "trust/belief.png");
        Icons.addIcon(AddDisbeliefEvidenceImpl.class, "trust/disbelief.png");
        //
        Icons.addIcon(BehaviorInstantiationImpl.class, "behavior/behavior-inst.png");
        //
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "ruleDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Rule Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add model", Model.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            //
            if (e.getActionCommand().equals("Add model"))
                design.rule.model.create(null);
        }
    }    
    
    class RuleDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RuleDesignModel designModel;

        //
        public RuleDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            designModel = (RuleDesignModel) e;
        }
        
        @Override
        public void load() {
            loadFeatures(new String[] {"timeStepSizes", "packages"});
        }

        @Override
        public String getDisplayLabel() {
            return designModel.getDescription();
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add package", RuleTemplatePackageImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add package"))
                design.rule.pkg.create(designModel, null);
        }
    };

    class TimeStepSizeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private TimeStepSize timeStepSize;
        TimeDuration duration;

        //
        public TimeStepSizeImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            timeStepSize = (TimeStepSize) e;
        }

        @Override
        public void load() {
            TimeDuration d = timeStepSize.getTimeDuration();
            duration = design.time.normalize(d.getAmount(), d.getUnit());
        }

        @Override
        public String getDisplayLabel() {
            if (duration.getAmount() > 1) {
                return "Time step size: " + duration.getAmount() + " " + duration.getUnit().getLiteral() + "s";
            }
            return "Time step size: " + duration.getAmount() + " " + duration.getUnit().getLiteral();
        }
    };

    class RuleTemplatePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RuleTemplatePackage pkg;

        //
        public RuleTemplatePackageImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            pkg = (RuleTemplatePackage) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {"formulaTemplates", "templates", "configurations"});
        }

        @Override
        public boolean deleteObject() {
            return design.rule.pkg.delete(pkg);
        }

        @Override
        public void setUserObject(Object newValue) {
            design.rule.pkg.update(pkg, (String) newValue);
        }

        @Override
        public String getDisplayLabel() {
            return pkg.getName();
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = super.getPopupMenu();
            addItem(menu, "Add formula template", FormulaTemplateImpl.class);
            addItem(menu, "Add rule template", RuleTemplateImpl.class);
            addItem(menu, "Add rule configuration", RuleTemplateConfigurationImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
            
            if (e.getActionCommand().equals("Add formula template")) {
                design.rule.formula.create(pkg, null);
                
            } else if (e.getActionCommand().equals("Add rule template")) {
                RuleTemplate template = design.rule.template.create(pkg, null, null);

            } else if (e.getActionCommand().equals("Add rule configuration")) {

                Map<String, RuleTemplate> templates = new HashMap<String, RuleTemplate>();
                for (RuleTemplatePackage pkg : design.viewpoint.getRuleDesignModels().get(0).getPackages()) {
                    for (RuleTemplate template : pkg.getTemplates()) {
                        templates.put(template.getName(), (RuleTemplate) template);
                    }
                }
                String s = (String) JOptionPane.showInputDialog(parentFrame, "Select template to configure", "Template Configuration",
                                JOptionPane.PLAIN_MESSAGE, null, templates.keySet().toArray(new String[] {}), null);
                RuleTemplate template = templates.get(s);
                if (template != null) {
                    // Template selected!
                    RuleTemplateConfiguration templateConf = design.rule.conf.create(pkg, template, "Configure", null);
                    templateConf.setTemplate(template);
                }

            }

        }

    };

    class FormulaTemplateImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private FormulaTemplate template;

        //
        public FormulaTemplateImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            template = (FormulaTemplate)e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {"variableDeclarations", "variableAssignments", "rootAtom"});
        }

        @Override
        public String getDisplayLabel() {
            return template.getName();
        }

        @Override
        public void setUserObject(Object newValue) {
            template.setName((String)newValue);
        }
        
        @Override
        public boolean deleteObject() {
            return design.rule.formula.delete(template);
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = super.getPopupMenu();
            if (this.getChildCount() == 0) {
                setupAtomMenu(this, null, menu);
            }
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            super.actionPerformed(e);
            Atom atom = handleAtomMenuAction(e, template, this);
            if (atom != null) {
                logger.info("Setting root "+atom);
                template.setRootAtom(atom);
            }
        }

    };
    
    
    class RuleTemplateConfigurationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RuleTemplateConfiguration configuration;
        private RuleTemplate template;

        //
        public RuleTemplateConfigurationImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            configuration = (RuleTemplateConfiguration) e;
            n(configuration.getConfigurationAssignments());
            n(configuration.getEvaluationAssignments());
            template = configuration.getTemplate();
        }

        @Override
        public String getDisplayLabel() {
            return "<html>"+configuration.getName() + " [" + template.getName() + "]"+"</html>";
        }

        @Override
        public void setUserObject(Object newValue) {
            configuration.setName(newValue.toString());
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add variable assignement", ConstantImpl.class);
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add variable assignement")) {
                // select which type of assignement
            }
        }

    };


    public void setupVariableMenu(Node n, JPopupMenu menu) {
        JMenu emenu;
        //
        emenu = new JMenu("Varible declarations");
        n.addItem(emenu, "Entity instance", EntityInstanceVariableImpl.class);
        n.addItem(emenu, "Identity instance", EntityInstanceVariableImpl.class);
        n.addItem(emenu, "Data instance", EntityInstanceVariableImpl.class);
        menu.add(emenu);
        //
        emenu = new JMenu("Varible assignments");
        n.addItem(emenu, "By reference", ReferenceVariableAssignmentImpl.class);
        n.addItem(emenu, "XPath expression", ReferenceVariableAssignmentImpl.class);
        n.addItem(emenu, "Regular expression", ReferenceVariableAssignmentImpl.class);
        menu.add(emenu);
        
    }

    
    public void setupAtomMenu(Node n, String label, JPopupMenu menu) {
        
        setupVariableMenu(n, menu);
        
        n.addItem(menu, "Formula instantiation", FormulaInstantiationImpl.class);
        
        JMenu emenu = new JMenu("Event");
        n.addItem(emenu, "Entity Event", ActivityEventPatternImpl.class);
        n.addItem(emenu, "Action Event", ActivityEventPatternImpl.class);
        n.addItem(emenu, "Interaction Event", ActivityEventPatternImpl.class);
        n.addItem(emenu, "Context Situation Event", ActivityEventPatternImpl.class);
        n.addItem(emenu, "Context Information Event", ActivityEventPatternImpl.class);

        JMenu pmenu = new JMenu("Propositional");
        n.addItem(pmenu, "Not", NotImpl.class);
        n.addItem(pmenu, "Implies", ImpliesImpl.class);
        n.addItem(pmenu, "And", AndImpl.class);
        n.addItem(pmenu, "Or", OrImpl.class);

        JMenu tmenu = new JMenu("Temporal");
        n.addItem(tmenu, "Always", AlwaysImpl.class);
        n.addItem(tmenu, "Eventually", EventuallyImpl.class);
        n.addItem(tmenu, "Since", SinceImpl.class);
        n.addItem(tmenu, "Before", BeforeImpl.class);
        n.addItem(tmenu, "Within", WithinImpl.class);
        n.addItem(tmenu, "During", DuringImpl.class);
        n.addItem(tmenu, "Repeat Since", RepeatSinceImpl.class);
        n.addItem(tmenu, "Repeat Maximum", RepeatMaximumImpl.class);
        n.addItem(tmenu, "Repeat Limit", RepeatLimitImpl.class);

        if (label != null) {
            JMenu cmenu = new JMenu(label);
            n.addItem(cmenu, "Constant", ConstantImpl.class);
            cmenu.add(emenu);
            cmenu.add(pmenu);
            cmenu.add(tmenu);
            menu.add(cmenu);
        } else {
            n.addItem(menu, "Constant", ConstantImpl.class);
            menu.add(emenu);
            menu.add(pmenu);
            menu.add(tmenu);
        }

    }

    public Atom handleAtomMenuAction(ActionEvent e, Template template, Node n) {
        
        if (e.getActionCommand().equals("Formula instantiation")) {
        }
        
        // Condition
        if (e.getActionCommand().equals("Entity Event")) {
        }
        if (e.getActionCommand().equals("Action Event")) {
        }
        if (e.getActionCommand().equals("Interaction Event")) {
        }
        if (e.getActionCommand().equals("Flow Point Event")) {
        }
        if (e.getActionCommand().equals("Data Event")) {
        }
        if (e.getActionCommand().equals("Context Situation Event")) {
        }
        if (e.getActionCommand().equals("Context Information Event")) {
        }
        //
        if (e.getActionCommand().equals("Constant")) {
            return design.rule.constant.create(template, TruthValue.TRUE);
        }
        //
        if (e.getActionCommand().equals("Not")) {
            return design.rule.op.addNot(template, null);
        }
        if (e.getActionCommand().equals("Implies")) {
            return design.rule.op.addImplies(template, null);
        }
        if (e.getActionCommand().equals("And")) {
            return design.rule.op.addAnd(template, null);
        }
        if (e.getActionCommand().equals("Or")) {
            return design.rule.op.addOr(template, null);
        }
        //
        if (e.getActionCommand().equals("Always")) {
            return design.rule.op.addAlways(template, null);
        }
        if (e.getActionCommand().equals("Eventually")) {
            return design.rule.op.addEventually(template, null);
        }
        if (e.getActionCommand().equals("Since")) {
            return design.rule.op.addSince(template, null);
        }
        if (e.getActionCommand().equals("Before")) {
            return design.rule.op.addBefore(template, 1, null);
        }
        if (e.getActionCommand().equals("Within")) {
            return design.rule.op.addWithin(template, 1, null);
        }
        if (e.getActionCommand().equals("During")) {
            return design.rule.op.addDuring(template, 1, null);
        }

        if (e.getActionCommand().equals("Repeat Since")) {
        }
        if (e.getActionCommand().equals("Repeat Max")) {
        }
        if (e.getActionCommand().equals("Repeat Limit")) {
        }

        return null;
    }

    class RuleTemplateImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RuleTemplate template;

        //
        public RuleTemplateImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            template = (RuleTemplate) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "variableDeclarations",
                            "evaluationAssignments",
                            "event",
                            "condition",
                            "authorize",
                            "execute"
            });
            if (template.getContainedConfigurations().size() > 0) {
                loadFeatures(new String[] {
                                "combiningAlgorithm",
                                "containedConfigurations"
                });
            }
        }

        @Override
        public String getEditLabel() {
            return template.getName();
        }
        
        @Override
        public String getDisplayLabel() {
            return "<html>"+template.getName()+"</html>";
        }

        @Override
        public void setUserObject(Object newValue) {
            template.setName(newValue.toString());
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            // addItem(menu, "Enforcement Rule Template" ,
            // EnforcementRuleTemplateImpl.class);
            // menu.addSeparator();

            setupVariableMenu(this, menu);
            //
            if (template.getEvent() == null) {
                menu.addSeparator();
                JMenu smenu = new JMenu("Event");
                addItem(smenu, "Time step Event", ActivityEventPatternImpl.class, "E:");
                addItem(smenu, "Entity Event", ActivityEventPatternImpl.class, "E:");
                addItem(smenu, "Action Event", ActivityEventPatternImpl.class, "E:");
                addItem(smenu, "Interaction Event", ActivityEventPatternImpl.class, "E:");
                menu.add(smenu);
                /*
                 * addItem(menu, "Flow Point Event",
                 * ActivityEventPatternImpl.class, "E:"); addItem(menu,
                 * "Data Event", ActivityEventPatternImpl.class, "E:");
                 * addItem(menu, "Context Situation Event",
                 * ActivityEventPatternImpl.class, "E:"); addItem(menu,
                 * "Context Information Event", ActivityEventPatternImpl.class,
                 * "E:");
                 */
            }
            if (template.getCondition() == null) {
                setupAtomMenu(this, "Condition", menu);
            }
            if (template.getAuthorize() == null) {
                menu.addSeparator();
                addItem(menu, "Allow", AllowImpl.class);
                addItem(menu, "Deny", DenyImpl.class);
            }
            return menu;
        }

        
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("Add variable declaration")) {
                // TODO: prevent duplicate names?
                design.structure.var.createEntityInstanceVariable(template, null);
            }

            if (e.getActionCommand().equals("Add variable assignement")) {
                // TODO: prevent duplicate assignments?
                Map<String, VariableDeclaration> variableDeclarations = new HashMap<String, VariableDeclaration>();
                for (VariableDeclaration declaration : template.getVariableDeclarations()) {
                    variableDeclarations.put(declaration.getName(), declaration);
                }
                if (variableDeclarations.size() > 0) {
                    String s = (String) JOptionPane.showInputDialog(parentFrame, "Select target variable", "Variable Assignment", JOptionPane.PLAIN_MESSAGE,
                                    null, variableDeclarations.keySet().toArray(new String[] {}), null);
                    VariableDeclaration target = variableDeclarations.get(s);
                    if (target != null) {
                        design.rule.var.createXPathVariableAssignment(target, XPathContext.TRIGGER_EVENT, "");
                        //
                    }
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "You should define at least one variable declaration first");
                }
                //
            }

            // Trigger Event
            if (e.getActionCommand().equals("E:TimeStep Event")) {
                design.rule.event.createTimeStepEventPattern(template);
            }
            if (e.getActionCommand().equals("E:Entity Event")) {
            }
            if (e.getActionCommand().equals("E:Action Event")) {
            }
            if (e.getActionCommand().equals("E:Interaction Event")) {
            }
            if (e.getActionCommand().equals("E:Flow Point Event")) {
            }
            if (e.getActionCommand().equals("E:Data Event")) {
            }

            Atom atom = handleAtomMenuAction(e, template, this);
            if (atom != null) {
                template.setCondition(atom);
            }
                
            if (e.getActionCommand().equals("Allow")) {
                design.rule.template.addAllow(template);
            }

            if (e.getActionCommand().equals("Deny")) {
                design.rule.template.addDeny(template);
            }
            
        }

    };
        
    public static String v(String s) {
        return "<b><font color='#6699FF'>"+s+"</font></b>";
    }
    
    class VariableDeclarationNode extends ElementInnerNode {
        //
        static final long serialVersionUID = 1L;
        private VariableDeclaration var;
        //
        public VariableDeclarationNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            var = (VariableDeclaration) e;
        }

        @Override
        public void load() {
        }

        @Override
        public void addToParent(DefaultMutableTreeNode parent) {
            super.addToParent(parent, VariableDeclaration.class, true);
        }

        @Override
        public String getDisplayLabel() {
            // Display value
            return "<html>"+v(var.getName())+"</html>";
        }

        @Override
        public void setUserObject(Object newValue) {
            var.setName(newValue.toString());
        }
    };

    class RuleXPathVariableAssignmentImplNode extends ElementInnerNode implements KeyListener {
        //
        private static final long serialVersionUID = 1L;
        private RuleXPathVariableAssignment var;

        //
        public RuleXPathVariableAssignmentImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }

        @Override
        public void configure(Element e) {
            var = (RuleXPathVariableAssignment) e;
        }

        @Override
        public void load() {
        }

        @Override
        public void setUserObject(Object newValue) {
            Object[] values = (Object[]) newValue;
            // TODO: call controller for this?
            var.setExpression(values[0].toString());
            var.setTarget(variableDeclarations.get(values[1]));
        }

        @Override
        public String getDisplayLabel() {
            return "<html>"+ v(var.getTarget().getName()) + " = " + var.getExpression() + "</html>";
        }

        // Override to customize cell editor
        JPanel panel = null;
        JTextField field = null;
        JComboBox<String> declarationsCombo = null;
        Map<String, VariableDeclaration> variableDeclarations;

        @Override
        public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
            panel = new JPanel();
            panel.setLayout(new FlowLayout(0, 3, 0));
            panel.setBorder(new EmptyBorder(0, 0, 0, 0));
            panel.setOpaque(false);
            panel.add(new JLabel(MyTreeCellEditor.pencilIcon));
            //
            variableDeclarations = new HashMap<String, VariableDeclaration>();
            // TODO: assignments may be contained anywhere, parent may be not
            // template,
            // it may be an atom.
            Node parent = (Node) getParent();
            RuleTemplate template = (RuleTemplate) parent.getUserObject();
            //
            for (VariableDeclaration declaration : template.getVariableDeclarations()) {
                variableDeclarations.put(declaration.getName(), declaration);
            }
            declarationsCombo = new JComboBox<String>(variableDeclarations.keySet().toArray(new String[] {}));
            declarationsCombo.setFont(new Font("Dialog", Font.PLAIN, 12));
            declarationsCombo.addKeyListener(this);
            panel.add(declarationsCombo);
            //
            panel.add(new JLabel("="));
            //
            field = new JTextField(25);
            field.addKeyListener(this);
            panel.add(field);
            //
            field.setText(var.getExpression());
            declarationsCombo.setSelectedItem(var.getTarget().getName());
            return panel;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                view.stopEditing();
            }
        }

        @Override
        public void keyReleased(KeyEvent arg0) {
        }

        @Override
        public void keyTyped(KeyEvent arg0) {
        }

        // Override to customize cell editor
        public Object getCellEditorValue() {
            return new Object[] { field.getText(), declarationsCombo.getSelectedItem() };
        }

    };
    
    class RegExpVariableAssignmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RegExpVariableAssignment var;

        //
        public RegExpVariableAssignmentImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            var = (RegExpVariableAssignment) e;
        }

        @Override
        public String getDisplayLabel() {
            return "<html>"+v(var.getTarget().getName()) + " = regexp("+ v(var.getSource().getName()) +", '" + var.getExpression() + "', match="+ var.getMatch()+")</html>";
        }

    };
    

    class EntityInstanceVariableImplNode extends VariableDeclarationNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public EntityInstanceVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };

    class TimeStepVariableImplNode extends VariableDeclarationNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public TimeStepVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };
    
    class IdentityInstanceVariableImplNode extends VariableDeclarationNode {
        private static final long serialVersionUID = 1L;
        public IdentityInstanceVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };

    class IdentityAttributeVariableImplNode extends VariableDeclarationNode {
        private static final long serialVersionUID = 1L;
        public IdentityAttributeVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };
    
    class DataInstanceVariableImplNode extends VariableDeclarationNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public DataInstanceVariableImplNode(Node p, Element e) {
            super(p, e);
        }
    };


    class ReferenceVariableAssignmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private ReferenceVariableAssignment assignment;

        //
        public ReferenceVariableAssignmentImplNode(Node p, Element e) {
            super(p, e);
            assignment = (ReferenceVariableAssignment) e;
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return "<html>"+v(assignment.getTarget().getName()) + " = " + v(assignment.getSource().getName())+"</html>";
        }
    };

    class AllowImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private Allow allow;

        //
        public AllowImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            allow = (Allow) e;
        }

        @Override
        public boolean deleteObject() {
            return design.rule.template.delete(allow);
        }

        @Override
        public void load() {
            loadFeatures("constraints");
        }

        @Override
        public String getDisplayLabel() {
            return "<html><b>Authorization</b>: Allow</html>";
        }
    };

    class DenyImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private Deny deny;

        //
        public DenyImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            deny = (Deny) e;
        }

        @Override
        public boolean deleteObject() {
            return design.rule.template.delete(deny);
        }

        @Override
        public void load() {
            loadFeatures("constraints");
        }

        @Override
        public String getDisplayLabel() {
            return "<html><b>Authorization</b>: Deny</html>";
        }
    };

    class ModifyDataImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private ModifyData modify;

        //
        public ModifyDataImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            modify = (ModifyData) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            // TODO: print the whole hiearchy?
            DataInstantiationHierarchy hierarchy = modify.getTarget();
            if (hierarchy != null) {
                DataInstantiationReference reference = hierarchy.getRoot();
                if (reference != null) {
                    DataInstantiation instantiation = reference.getInstantiation();
                    if (instantiation != null) {
                        return "Modify data [" + instantiation.getName() + "] = [" + modify.getNewValue() + "]";
                    }
                }
            }
            return "Modify";
        }
    };

    class DelayImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        // private Delay delay;
        //
        public DelayImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            // delay = (Delay) e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return "Delay";
        }
    };
    
    class AddBeliefEvidenceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        AddBeliefEvidence add;
        //
        public AddBeliefEvidenceImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            add = (AddBeliefEvidence)e;
        }
        @Override
        public void load() {
            loadFeatures("trustPattern");
        }
        @Override
        public String getDisplayLabel() {
            return "Add belief evidence"; // + amount?
        }
    };

    class AddDisbeliefEvidenceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        AddDisbeliefEvidence add;
        //
        public AddDisbeliefEvidenceImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            add = (AddDisbeliefEvidence)e;
        }
        @Override
        public void load() {
            // n(add.getTrustPattern().getTrusteeScope());
            n(add.getTrustPattern());
            //loadFeatures("trustPattern");
        }
        @Override
        public String getDisplayLabel() {
            if (add.getTrustPattern() != null) {
                if(add.getTrustPattern().getAspect() != null) {
                    return "Add disbelief evidence"+ " (" + design.trust.aspect.getLabel(add.getTrustPattern().getAspect()) + ")";
                }
            }
            return "Add disbelief evidence"; // + amount?
            
        }
    };
    

    class AllowOverridesImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        // private CombiningAlgorithm combiningAlg;

        //
        public AllowOverridesImplNode(Node p, Element e) {
            super(p, e);
            // combiningAlg = (CombiningAlgorithm) e;
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return "Allow overrides";
        }
    };

    class EntityPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private EntityPattern pattern;
        //
        public EntityPatternImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            pattern = (EntityPattern) e;
        }
        @Override
        public void load() {
            n(pattern.getRolePattern());
            loadFeatures(new String[] {
                            "rolePatterns",
                            "identityPattern",
                            "variables",
                            "trustPattern"
            });
            // n(entityPattern.getIdentityPattern());
            // TODO:?
            // n(entityPattern.getTrustPattern());            
            // n(entityPattern.getTypePattern());
            // n(entityPattern.getInstantiationPattern());
            // n(entityPattern.getInstancePattern());
            // n(entityPattern.getRolePattern());
            // n(entityPattern.getBehaviorPattern());
        }

        @Override
        public String getDisplayLabel() {
            StringBuffer s = new StringBuffer();
            boolean first = true;
            if (pattern.getType() != null) {
                s.append("type=" + pattern.getType().getName());
                first = false;
            }
            //
            if (pattern.getInstantiationHierarchy() != null) {
                EntityInstantiationHierarchy h = pattern.getInstantiationHierarchy();
                EntityInstantiationReference inst = null;
                if (h.getRoot() != null) {
                    inst = h.getRoot();
                    if (inst.getInstantiation() != null) {
                        if (!first)
                            s.append(", ");
                        s.append("instantiation=" + inst.getInstantiation().getName());
                        first = false;
                    }

                }
            }
            //
            if (s.length() > 0) {
                return "Entity(" + s.toString() + ")";
            }
            return "Entity";
        }
    };

    public final String f(Atom a, String s) {
        if (a != null) {
            
            Template aTemplate = a.getTemplate();

            if (aTemplate instanceof RuleTemplate &&
                            aTemplate != null) {
                RuleTemplate template = (RuleTemplate)aTemplate;
                //
                String id = a.getId();
                EventPattern event = template.getEvent();
                Atom condition = template.getCondition();
                //
                if (event != null) {
                    if (event.getId().equals(id)) {
                        return "<html><b>Event</b>: " + s + "</html>";
                    }
                }
                if (condition != null) {
                    if (condition.getId().equals(id)) {
                        if (s.length() > 0) {
                            return "<html><b>Condition</b>: " + s + "</html>";
                        } else {
                            return "<html><b>Condition</b></html>";
                        }
                    }
                }
            }
        }
        return s;
    }

    class TimeStepEventPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private TimeStepEventPattern event;

        //
        public TimeStepEventPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            event = (TimeStepEventPattern) e;
        }

        @Override
        public boolean deleteObject() {
            return design.rule.event.delete(event);
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return f(event, "Time Step Event");
        }
    };


    class EntityEventPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private EntityEventPattern event;
        //
        public EntityEventPatternImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            event = (EntityEventPattern) e;
        }
        @Override
        public void load() {
            loadFeatures("entityPattern");
        }
        @Override
        public String getDisplayLabel() {
            String s = "Entity Event (" + event.getLifecycle().getLiteral() + ")";
            return f(event, s);

        }
    };
    
    class BehaviorEventPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private BehaviorEventPattern pattern;
        //
        public BehaviorEventPatternImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            pattern = (BehaviorEventPattern) e;
        }
        @Override
        public void load() {
            loadFeatures("behaviorPattern");
            if (pattern.getBehaviorPattern() != null) {
                loadFeatures(pattern.getBehaviorPattern(), "entityPattern");
            }
        }
        @Override
        public String getDisplayLabel() {
            String s = "Behavior Event (" + pattern.getLifecycle().getLiteral() + ")";
            return f(pattern, s);

        }
    };
    
    class AbstractInteractionContributionOfTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private AbstractInteractionContributionOfType icInst;

        //
        public AbstractInteractionContributionOfTypeImplNode(Node p, Element e) {
            super(p, e);
            icInst = (AbstractInteractionContributionOfType) e;
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return icInst.getType().getRole();
        }
    };

    class InteractionContributionPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private InteractionContributionPattern pattern;
        //
        public InteractionContributionPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (InteractionContributionPattern) e;
        }

        @Override
        public void load() {
            BehaviorPattern p = pattern.getParticipantBehaviorPattern();
            if (p != null) {
                if (p.getInstantiationHierarchy() != null ||
                    p.getType() != null ||
                    p.getVariables().size() > 0) {
                    loadFeatures("participantBehaviorPattern");
                }
                n(pattern.getParticipantBehaviorPattern());
                n(pattern.getParticipantBehaviorPattern().getEntityPattern());
                loadFeatures("entityPattern");
            }
             /*
             n(pattern.getInteractionContribution()); // focus
             n(pattern.getInstancePattern());
             n(pattern.getTypePattern());
             n(pattern.getAttributePatterns()); //
             // "Container Entity"
             n(pattern.getContainerEntityPattern()); //
             // "Participant Entity"
             n(pattern.getParticipantEntityPattern());
             */
        }

        @Override
        public String getDisplayLabel() {
            if (pattern.getType() != null) {
                return "Participant ("+pattern.getType().getInteractionType().getName() + " > " + pattern.getType().getRole()+")";
            }
            return "Participant";
        }
    };

    class EntityRolePatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private EntityRolePattern pattern;

        //
        public EntityRolePatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (EntityRolePattern) e;
        }

        @Override
        public void load() {
            loadFeatures("identityPattern");
        }

        @Override
        public String getDisplayLabel() {
            if (pattern.getEntityRoleType() != null) {
                return pattern.getEntityRoleType().getName();
            }
            return "Role Pattern";
        }
    };

    class RolePatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RolePattern rolePattern;

        //
        public RolePatternImplNode(Node p, Element e) {
            super(p, e);
            rolePattern = (RolePattern) e;
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return rolePattern.getRoleType().getName();
        }
    };

    class DelegatedInteractionContributionImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private DelegatedInteractionContribution delegatedIc;

        //
        public DelegatedInteractionContributionImplNode(Node p, Element e) {
            super(p, e);
            delegatedIc = (DelegatedInteractionContribution) e;
        }

        @Override
        public void configure(Element e) {
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return delegatedIc.getBehaviorType().getName() + " -> " + delegatedIc.getType().getRole();
        }
    };

    class BehaviorPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private BehaviorPattern pattern;

        //
        public BehaviorPatternImplNode(Node p, Element e) {
            super(p, e);
            // TODO: add the entity pattern to the parent?
        }

        @Override
        public void configure(Element e) {
            pattern = (BehaviorPattern) e;
        }

        @Override
        public void load() {
            loadFeatures("variables");
        }

        @Override
        public String getDisplayLabel() {
            if (pattern.getType() != null) {
                return "Behavior (type = "+pattern.getType().getName()+")";
            }
            return "Behavior";
        }
    };

    class ActivityEventPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private ActivityEventPattern activityEvent;
        ActivityPattern activityPattern;
        //
        private ActionPattern actionPattern;
        private InteractionPattern interactionPattern;

        //
        public ActivityEventPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            activityEvent = (ActivityEventPattern) e;
            activityPattern = activityEvent.getActivityPattern();
            if (activityPattern != null) {

                BehaviorPattern behaviorPattern = activityPattern.getContainerBehaviorPattern();
                if (behaviorPattern != null) {
                    n(behaviorPattern);
                    n(behaviorPattern.getEntityPattern());
                }

                n(activityPattern.getIdentityRolePatterns());
                n(activityPattern.getIdentityPatterns());
                n(activityPattern.getDataPatterns());

                //
                if (activityPattern instanceof ActionPattern) {
                    actionPattern = (ActionPattern) activityPattern;
                } else if (activityPattern instanceof InteractionPattern) {
                    interactionPattern = (InteractionPattern) activityPattern;
                }
            }
        }

        @Override
        public void load() {
            if (actionPattern != null) {
                // n(actionPattern.getInstantiationPattern());
            }
            //
            if (interactionPattern != null) {
                loadFeatures(interactionPattern, "contributionPatterns");                
            }
            //
            // ActivityTypePattern typePattern =
            // activityPattern.getTypePattern();
            // EntityPattern containedEntityPattern =
            // activityPattern.getContainedEntityPattern();
            // activityPattern.getInstancePattern();
            // activityPattern.getAttributePatterns();
            //
            // n(activityPattern.getAttributePatterns());
            loadFeatures("variableAssignments");
        }

        @Override
        public String getDisplayLabel() {
            String s = "";
            if (activityEvent.getModality() == EventModality.TENTATIVE) {
                s = " (tentative)";
            }
            if (actionPattern != null) {

                if (actionPattern.getType() != null) {
                    s = actionPattern.getType().getName() + s;
                } else {
                    s = "Action Event" + s;
                }

            } else if (interactionPattern != null) {

                if (interactionPattern.getType() != null) {
                    s = interactionPattern.getType().getName() + s;
                } else {
                    s = "Interaction Event" + s;
                }

            } else {
                s = "Activity Event" + s;
            }
            return f(activityEvent, s);
        }
    };

    class IdentityPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IdentityPattern pattern;
        //
        public IdentityPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    
        @Override
        public void configure(Element e) {
            pattern = (IdentityPattern)e;
        }
        
        @Override
        public void load() {            
            loadFeatures("attributePatterns");
            // n(pattern.getVariables());
        }
    
        @Override
        public String getDisplayLabel() {
            StringBuffer s = new StringBuffer();
            boolean first = true;
            if (pattern.getSubject() != null) {
                if (!first) s.append(", "); else first = false;
                s.append("subject = "+pattern.getSubject());
            }
            if (pattern.getInstantiation() != null) {
                if (!first) s.append(", "); else first = false;
                s.append("instantiation = "+pattern.getInstantiation().getName());
            }
            if (pattern.getVariables().size() > 0) {
                for (VariableDeclaration var : pattern.getVariables()) {
                    if (!first) s.append(", "); else first = false;
                    s.append(v(var.getName()));
                }
            }
            return "<html>Identity (" + s.toString() + ")</html>";
        }
    }

    class IdentityRolePatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        protected IdentityRolePattern pattern;

        //
        public IdentityRolePatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (IdentityRolePattern) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            // TODO: identity pattern maybe does not contain instantiation?
            return "Role of [" + pattern.getIdentityPattern().getInstantiation().getName() + "] is [" + pattern.getRoleType().getName() + "]";
        }
    };

    class IdentityAttributePatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        protected IdentityAttributePattern pattern;

        //
        public IdentityAttributePatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (IdentityAttributePattern) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return pattern.getInstantiation().getName() + " = $" + pattern.getVariable().getName();
            
        }
    };
    
    class DataPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        protected DataPattern pattern;
        //
        public DataPatternImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            pattern = (DataPattern) e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            String patternType = pattern.getClass().getSimpleName();
            
            if (pattern.getVariables().size() == 1) {
                
                DataVariable v = pattern.getVariables().get(0);
                return "<html>"+pattern.getInstantiation().getName() + " = " + v(v.getName())+"</html>";
            }
            
            if (pattern.getValue() != null && !pattern.getValue().equals("")) {
                return "<html>"+pattern.getInstantiation().getName() + " = " 
                     + pattern.getValue() + " (" + 
                     patternType + ")</html>";
            }
            
            return patternType;
        }
    };
    
    
    class XPathPatternImplNode extends DataPatternImplNode {
        private static final long serialVersionUID = 1L;
        public XPathPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class RegExpPatternImplNode extends DataPatternImplNode {
        private static final long serialVersionUID = 1L;
        public RegExpPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class LiteralPatternImplNode extends DataPatternImplNode {
        private static final long serialVersionUID = 1L;
        public LiteralPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class OperatorImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        protected Operator operator;

        //
        public OperatorImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            operator = (Operator) e;
        }

        @Override
        public void load() {
            loadFeatures("operands");
        }

        @Override
        public String getDisplayLabel() {
            if (operator != null) {
                return operator.toString();
            }
            return "null";
        }

        @Override
        public boolean deleteObject() {
            return design.rule.op.delete(operator);
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            if ((operator instanceof Unary && operator.getOperands().size() == 0) || (operator instanceof Binary && operator.getOperands().size() < 2)
                            || (operator instanceof Multiary)) {
                setupAtomMenu(this, null, menu);
            }
            return menu;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Atom atom = handleAtomMenuAction(e, operator.getTemplate(), this);
            if (atom != null) {
                operator.getOperands().add(atom);
            }
        }
    };

    public final String f(TimeBoundedTemporalOperator op) {
        /*
        if (op.getTemplate() instanceof RuleTemplate) {
            RuleTemplate template = (RuleTemplate)op.getTemplate();
            if (template != null) {
                TimeDuration d = template.getTimeStepSize().getTimeDuration();
                TimeDuration d2 = design.time.normalize(d.getAmount() * op.getTimeBoundInTimeSteps(), d.getUnit());
                if (d2.getAmount() == 1) {
                    return "(" + d2.getAmount() + " " + d2.getUnit() + ")";
                }
                return "(" + d2.getAmount() + " " + d2.getUnit() + "s)";
            }
        }
        */
        if (op.getVariable() != null) {
            return "<html>("+v(op.getVariable().getName())+" time steps)</html>";
        }
        
        if (op.getTimeBoundInTimeSteps() == 1) {
            return "(" + op.getTimeBoundInTimeSteps() + " time step)";
        }
        if (op.getTimeBoundInTimeSteps() == 0) {
            return "(current time step)";
        }
        return "(" + op.getTimeBoundInTimeSteps() + " time steps)";
    }

    class TimeBoundedTemporalOperatorImplNode extends OperatorImplNode implements KeyListener, ChangeListener {
        //
        private static final long serialVersionUID = 1L;
        //
        public TimeBoundedTemporalOperatorImplNode(Node p, Element e) {
            super(p, e);
        }
        
        // Override to customize cell editor
        JPanel panel = null;

        JSpinner spinner;
        JLabel lblAbsTime = new JLabel("");
        
        @Override
        public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
            panel = new JPanel();
            panel.setLayout(new FlowLayout(0, 3, 0));
            panel.setBorder(new EmptyBorder(0, 0, 0, 0));
            panel.setOpaque(false);
            panel.add(new JLabel(MyTreeCellEditor.pencilIcon));
            TimeBoundedTemporalOperator op = (TimeBoundedTemporalOperator)getUserObject();
            SpinnerModel model = new SpinnerNumberModel(op.getTimeBoundInTimeSteps(), //initial value
                                                        1, //min
                                                        Long.MAX_VALUE, //max
                                                        1); //step            
            spinner = new JSpinner(model);
            //
            JTextField txtEditor = ((JSpinner.DefaultEditor)spinner.getEditor()).getTextField(); 
            txtEditor.addKeyListener(this);
            txtEditor.setColumns(5);
            /*
            Dimension prefSize = txtEditor.getPreferredSize();
            prefSize = new Dimension(20, prefSize.height);
            txtEditor.setPreferredSize(prefSize);
            */
            //
            spinner.addChangeListener(this);
            panel.add(spinner);
            panel.add(lblAbsTime);
            stateChanged(null);
            return panel;
        }

        
        // Override to customize cell editor
        public Object getCellEditorValue() {
            return spinner.getValue();
        }
        
        @Override
        public void setUserObject(Object newValue) {
            TimeBoundedTemporalOperator op = (TimeBoundedTemporalOperator)getUserObject();
            long value = ((Double)newValue).longValue();
            op.setTimeBoundInTimeSteps(value);
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                view.stopEditing();
            }
        }

        @Override
        public void keyReleased(KeyEvent arg0) {
        }

        @Override
        public void keyTyped(KeyEvent arg0) {
        }


        @Override
        public void stateChanged(ChangeEvent e) {
            TimeBoundedTemporalOperator op = (TimeBoundedTemporalOperator)getUserObject();
            Template template = op.getTemplate();
            if (template instanceof RuleTemplate) {
                // long value = ((Double)spinner.getValue()).longValue();
                // RuleTemplate ruleTemplate = (RuleTemplate)template;              
               // TODO: template does not define a timestep size anymore, only the configuration.
                // TimeDuration duration = ruleTemplate.getTimeStepSize().getTimeDuration();
                // duration = design.time.normalize((duration.getAmount()*value), duration.getUnit());
                // lblAbsTime.setText(" (time step finished "+duration.getAmount()+" "+duration.getUnit().getLiteral()+" ago)");
                
            }
        }
        
        
    }
    
    class BeforeImplNode extends TimeBoundedTemporalOperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public BeforeImplNode(Node p, Element e) {
            super(p, e);
            setEditAllowed(true);
        }
        
        @Override
        public String getDisplayLabel() {
            if (operator instanceof Before) {
                Before before = (Before) operator;
                String s = "Before " + f(before);
                return f(operator, s);

            }
            return super.getDisplayLabel();
        }
    };
    
    class WithinImplNode extends OperatorImplNode {
        private static final long serialVersionUID = 1L;

        public WithinImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            if (operator instanceof Within) {
                Within within = (Within) operator;
                String s = "Within " + f(within);
                return f(operator, s);
            }
            return super.getDisplayLabel();
        }
    };

    

    class EventuallyImplNode extends OperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public EventuallyImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            if (operator instanceof Eventually) {
                return f(operator, "Eventually");
            }
            return super.getDisplayLabel();
        }
    };

    class NotImplNode extends OperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public NotImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            return f(operator, "Not");
        }
    };

    class ImpliesImplNode extends OperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public ImpliesImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            return f(operator, "Implies");
        }
    };

    class AndImplNode extends OperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public AndImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            return f(operator, "");
        }
    };

    class OrImplNode extends OperatorImplNode {
        //
        private static final long serialVersionUID = 1L;

        //
        public OrImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public String getDisplayLabel() {
            return f(operator, "Or");
        }
    };

    class ContextSituationEventPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private ContextSituationEventPattern situationEvent;
        private ContextSituationPattern situationPattern;

        //
        public ContextSituationEventPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            situationEvent = (ContextSituationEventPattern) e;
            situationPattern = situationEvent.getContextSituationPattern();
        }

        @Override
        public void load() {
            loadFeatures(situationPattern,  "entityRolePatterns");
            // TODO: EntityPattern string...
        }

        @Override
        public String getDisplayLabel() {
            String s = "Any context situation";
            if (situationEvent.getContextSituationPattern().getType() != null
            // && situationEvent.getContextSituationPattern().getLifecycle() !=
            // null
            ) {
                s = "Context Situation (" + situationEvent.getContextSituationPattern().getType().getName()
                // + ", " +
                // situationEvent.getContextSituationPattern().getLifecycle().getLiteral()
                                + ")";
            }
            return f(situationEvent, s);

        }
    };

    class ConstantImplNode extends ElementInnerNode {
        private static final long serialVersionUID = 1L;
        private Constant c;
        //
        public ConstantImplNode(Node p, Element e) {
            super(p, e);
            c = (Constant) e;
        }
        @Override
        public void configure(Element e) {
        }
        @Override
        public boolean deleteObject() {
            return design.rule.constant.delete(c);
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return f(c, c.getValue().getLiteral());
        }
    }

    class BehaviorExecutionImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private BehaviorExecution execute;
        //
        public BehaviorExecutionImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            execute = (BehaviorExecution) e;
        }
        @Override
        public void load() {
            loadFeatures("behaviorInstantiation");
            // n(extendBehavior.getTargetEntity());
        }
        @Override
        public String getDisplayLabel() {
            return "Execute";
        }
    }

    class BehaviorInstantiationImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private BehaviorInstantiation inst;
        //
        public BehaviorInstantiationImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            inst = (BehaviorInstantiation) e;
        }
        @Override
        public void load() {
            loadFeatures("variableAssignments");
        }
        @Override
        public String getDisplayLabel() {
            return inst.getName() + " : " + inst.getType().getName();
        }
    }

    class PrivacyProtectionImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        PrivacyProtection aspect;
        //
        public PrivacyProtectionImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            aspect = (PrivacyProtection)e;
        }
        
        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {
            return design.trust.aspect.getLabel(aspect);
        }
    };    
    
    
    class TrustRelationshipPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRelationshipPattern trustPattern;
        //
        public TrustRelationshipPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            trustPattern = (TrustRelationshipPattern)e;
            setIcons();
        }
        
        public void setIcons() {
            
            if (trustPattern.getDegree() instanceof TrustLevelPattern) {
            
                TrustLevelPattern levelPattern = (TrustLevelPattern)trustPattern.getDegree(); 
                
                if (levelPattern.getLevel() == TrustLevel.UNSPECIFIED)
                    setIcon("trust/unspecified.png");
    
                if (levelPattern.getLevel() == TrustLevel.UNCERTAIN)
                    setIcon("trust/uncertain.png");
                
                if (levelPattern.getLevel() == TrustLevel.VERY_TRUSTWORTHY)
                    setIcon("trust/very-trustworthy.png");
    
                if (levelPattern.getLevel() == TrustLevel.TRUSTWORTHY)
                    setIcon("trust/trustworthy.png");
    
                if (levelPattern.getLevel() == TrustLevel.UNTRUSTWORTHY)
                    setIcon("trust/untrustworthy.png");
    
                if (levelPattern.getLevel() == TrustLevel.VERY_UNTRUSTWORTHY)
                    setIcon("trust/very-untrustworthy.png");
            }
        }

        @Override
        public void load() {
            // loadFeatures("degree"); already in the label...
            if (trustPattern.getAspect() instanceof BehaviorQuality) {
                BehaviorQuality bq = (BehaviorQuality)trustPattern.getAspect();
                n(bq.getActivityType());
                n(bq.getContributionType());
              }           
            loadFeatures("trusteeScope");
            // loadFeatures("aspect");
        }

        @Override
        public String getDisplayLabel() {
            String p = "";
            if (trustPattern instanceof ArbitraryTrustPattern) {
                p = "Arbitrary";
            } else if (trustPattern instanceof ExperienceTrustPattern) {
                p = "Experience";
            }
            if (trustPattern.getDegree() instanceof TrustLevelPattern) {
                TrustLevelPattern levelPattern = (TrustLevelPattern)trustPattern.getDegree();
                if (levelPattern.getLevel() == TrustLevel.UNSPECIFIED) {
                    return p+" trust "+ " (" + design.trust.aspect.getLabel(trustPattern.getAspect()) + ")";
                }                
                return levelPattern.getLevel().getLiteral() + " trust - "+ p + ": " + design.trust.aspect.getLabel(trustPattern.getAspect());
            }
            return p+" trust";
        }
    };

    class ActionTypeImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        ActionType type;        
        
        public ActionTypeImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            type = (ActionType)e;
        }

        @Override
        public String getDisplayLabel() {
            return type.getName();
        }
        
    }
    
    class InteractionContributionTypeImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        InteractionContributionType type;        
        
        public InteractionContributionTypeImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            type = (InteractionContributionType)e;
        }

        @Override
        public String getDisplayLabel() {
            return type.getRole();
        }
        
    }

    class InteractionTypeImplNode extends ElementInnerNode {
        
        private static final long serialVersionUID = 1L;
        InteractionType type;        
        
        public InteractionTypeImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            type = (InteractionType)e;
        }

        @Override
        public String getDisplayLabel() {
            return type.getName();
        }
        
    }
    
    class ArbitraryTrustPatternImplNode extends TrustRelationshipPatternImplNode {
        //
        private static final long serialVersionUID = 1L;
        //
        public ArbitraryTrustPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class ExperienceTrustPatternImplNode extends TrustRelationshipPatternImplNode {
        //
        private static final long serialVersionUID = 1L;
        //
        public ExperienceTrustPatternImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class TrustRecommendationPatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRecommendationPattern pattern;
        //
        public TrustRecommendationPatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (TrustRecommendationPattern)e;
        }
        
        @Override
        public void load() {
            n(pattern.getTrustRelationship());
        }

        @Override
        public String getDisplayLabel() {
            return "Trust Recommendations";
        }
    };

    class SubjectiveLogicConsensusImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        SubjectiveLogicConsensus op;
        //
        public SubjectiveLogicConsensusImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            op = (SubjectiveLogicConsensus)e;
        }
        
        @Override
        public void load() {
            loadFeatures("trustPattern");
        }

        @Override
        public String getDisplayLabel() {
            return "Subjective Logic Consensus";
        }
    };
    
    class PersonalScopePatternImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        PersonalScopePattern pattern;
        //
        public PersonalScopePatternImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            pattern = (PersonalScopePattern)e;
        }
        
        @Override
        public void load() {
            loadFeatures("trustee");
        }

        @Override
        public String getDisplayLabel() {
            return "Personal Scope";
        }
    };
    
    class AtLeastImplNode extends ElementInnerNode {
        //
        static final long serialVersionUID = 1L;
        private AtLeast op;
        //
        public AtLeastImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            op = (AtLeast) e;
        }

        @Override
        public void load() {
            loadFeatures("trustPattern");
            loadFeatures("trustFusionOperator");
        }        
        
        public String getDisplayLabel() {                        
            String s = "At least";   
            if (op.getDegree() instanceof TrustLevelPattern) {
                TrustLevelPattern levelPattern = (TrustLevelPattern)op.getDegree();
                s = "At least: " + levelPattern.getLevel().getLiteral();
            }
            return f(op, s);
        }
        
    }

    class AtMostImplNode extends ElementInnerNode {
        //
        static final long serialVersionUID = 1L;
        private AtMost op;
        //
        public AtMostImplNode(Node p, Element e) {
            super(p, e);
        }
        
        @Override
        public void configure(Element e) {
            op = (AtMost) e;
        }

        @Override
        public void load() {
            loadFeatures("trustPattern");
            loadFeatures("trustFusionOperator");
        }        
        
        public String getDisplayLabel() {
            String s = "At most";
            if (op.getDegree() instanceof TrustLevelPattern) {
                TrustLevelPattern levelPattern = (TrustLevelPattern)op.getDegree();
                s = "At most: " + levelPattern.getLevel().getLiteral();
            }
            return f(op, s);
        }
        
    }
    
    
    class EvaluateActionImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        EvaluateAction evaluate;

        //
        public EvaluateActionImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            evaluate = (EvaluateAction) e;
        }

        @Override
        public void load() {
        }

        @Override
        public String getDisplayLabel() {

            boolean first = true;
            String str;
            StringBuffer s = new StringBuffer();
            
            for (DataConstraint constraint : evaluate.getActionInstantiation().getConstraints()) {

                if (constraint instanceof IdentityEstablishmentFromVariable) {
                    IdentityEstablishmentFromVariable vassignement = (IdentityEstablishmentFromVariable) constraint;
                    if (first) first = false; else s.append(", ");
                    s.append("" + vassignement.getTarget().getName() + " = " + v(vassignement.getSource().getName()));
                    
                }
                
                if (constraint instanceof DataEstablishmentFromVariable) {
                    DataEstablishmentFromVariable vassignement = (DataEstablishmentFromVariable) constraint;
                    if (first) first = false; else s.append(", ");
                    s.append("" + vassignement.getTarget().getName() + " = " + v(vassignement.getSource().getName()));
                }

            }
            
            if (first) {
                str = evaluate.getActionInstantiation().getType().getName();
            }
            str = evaluate.getActionInstantiation().getType().getName() + "(" + s.toString() + ")";

            return f(evaluate, str);
        }
    };

    
    
}
