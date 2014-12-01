package seckit.gui.design.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import behavior.event.impl.ActivityEventPatternImpl;
import models.Element;
import models.Model;
import risk.RiskDesignModel;
import risk.type.RiskTypePackage;
import risk.impl.RiskDesignModelImpl;
import risk.type.impl.RiskTypePackageImpl;
import risk.type.Asset;
import risk.type.Countermeasure;
import risk.type.IncidentType;
import risk.type.NegativeConsequence;
import risk.type.RiskAssessment;
import risk.type.Stakeholder;
import risk.type.Threat;
import risk.type.ThreatScenario;
import risk.type.Vulnerability;
import risk.type.impl.AccidentalThreatImpl;
import risk.type.impl.AssetImpl;
import risk.type.impl.CountermeasureImpl;
import risk.type.impl.DeliberateThreatImpl;
import risk.type.impl.IncidentTypeImpl;
import risk.type.impl.NegativeConsequenceImpl;
import risk.type.impl.RiskAssessmentImpl;
import risk.type.impl.StakeholderImpl;
import risk.type.impl.ThreatImpl;
import risk.type.impl.ThreatScenarioImpl;
import risk.type.impl.VulnerabilityImpl;
import rule.action.impl.AllowImpl;
import rule.action.impl.DenyImpl;
import rule.template.RuleTemplate;
import rule.template.impl.RuleTemplateImpl;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.ElementInnerNode;
import seckit.gui.ModelView.SystemDesignViewpointInnerNode;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;
import trust.instance.LikelihoodLevel;

public class RiskDesignView extends DesignView {
    
    public RiskDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Risk", design, design.risk);
        //
        legend.add(RiskTypePackageImpl.class, "Package");
        //
        legend.add("Scenario");
        legend.add(StakeholderImpl.class, "Stakeholder");
        legend.add(AssetImpl.class,"Asset");
        //
        legend.add("Threats");
        legend.add(AccidentalThreatImpl.class, "Human Accidental");
        legend.add(DeliberateThreatImpl.class, "Human Deliberate");
        legend.add(ThreatImpl.class, "Non-Human");
        //
        legend.add("What can go wrong?");
        legend.add(IncidentTypeImpl.class, "Unwanted Incident");
        legend.add(NegativeConsequenceImpl.class, "Negative consequence");
        //
        legend.add("Why can it go wrong?");
        legend.add(VulnerabilityImpl.class, "Vulnerability");
        //
        legend.add("Analysis and treatments");
        legend.add(ThreatScenarioImpl.class, "Threat Scenario");
        legend.add(RiskAssessmentImpl.class, "Risk assessment");
        legend.add(CountermeasureImpl.class, "Countermeasure");
        //        
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "risk/";
        //
        Icons.addIcon(RiskDesignView.class, "risk/risk.png");
        //
        Icons.addIcon(RiskDesignModelImpl.class, "model.png");
        Icons.addIcon(RiskTypePackageImpl.class, p+"risk-package.png");
        //
        Icons.addIcon(StakeholderImpl.class, p+"stakeholder.png");
        Icons.addIcon(AssetImpl.class, p+"asset.png");
        //
        Icons.addIcon(ThreatImpl.class, p+"threat.png");
        Icons.addIcon(AccidentalThreatImpl.class, p+"threat-human-accidental.png");
        Icons.addIcon(DeliberateThreatImpl.class, p+"threat-human-deliberate.png");
        //
        Icons.addIcon(VulnerabilityImpl.class, p+"vulnerability.png");
        Icons.addIcon(IncidentTypeImpl.class, p+"unwanted-incident.png");
        Icons.addIcon(NegativeConsequenceImpl.class, p+"negative_consequence.png");
        //
        Icons.addIcon(ThreatScenarioImpl.class, p+"threat-scenario.png");
        Icons.addIcon(RiskAssessmentImpl.class, p+"risk.png");
        Icons.addIcon(CountermeasureImpl.class, p+"countermeasure.png");
        //
        //
        Icons.addIcon(RuleTemplateImpl.class, "rule/rule-template-enf.png");
        
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "riskDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Risk Models";
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
    
    class RiskDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RiskDesignModel model;
        //
        public RiskDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (RiskDesignModel) e;
        }
        @Override
        public void load() {   
            loadFeatures("packages");
        }
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add package", RiskTypePackageImpl.class);
            return menu;
        }
        @Override
        public void addDefaultChild() {
            actionPerformed("Add package");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add package")) {
                design.risk.createRiskTypePackage(model, null, null);
            }
        }        
    };   

    class RiskTypePackageImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RiskTypePackage pkg;
        //
        public RiskTypePackageImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            pkg = (RiskTypePackage) e;
        }
        
        @Override
        public boolean canAddFeature(Element e) {
            if (e instanceof ThreatScenario) {
                ThreatScenario scenario = (ThreatScenario)e;
                if (scenario.getRequiresScenario().size() > 0) {
                    return false;
                }
            } 
            return true;
        }
        
        @Override
        public void load() {   
            loadFeatures(new String[] {
                            "subPackages",
                            "scenarios",
                            "stakeholders",
                            "assets",
                            "threats",
                            "vulnerabilities",
                            "unwantedIncidents",
                            "countermeasures",
            });
        }
        @Override
        public String getDisplayLabel() {
            return pkg.getName();
        }
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add package", RiskTypePackageImpl.class);
            //
            addItem(menu, "Add stakeholder", StakeholderImpl.class);
            addItem(menu, "Add asset", AssetImpl.class);
            //
            addItem(menu, "Add accidental human threat", AccidentalThreatImpl.class);
            addItem(menu, "Add deliberate human threat", DeliberateThreatImpl.class);
            addItem(menu, "Add non-human threat", ThreatImpl.class);
            //
            addItem(menu, "Add vulnerability", VulnerabilityImpl.class);
            addItem(menu, "Add unwanted incident", IncidentTypeImpl.class);
            //
            addItem(menu, "Add threat scenario", ThreatScenarioImpl.class);
            addItem(menu, "Add risk assessment", RiskAssessmentImpl.class);
            addItem(menu, "Add countermeasure", CountermeasureImpl.class);
            //
            return menu;
        }
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Add package")) {
                design.risk.createRiskTypePackage(pkg.getModel(), pkg, null);
            } else if (command.equals("Add stakeholder")) {
                design.risk.createStakeholder(pkg, null);
            } else if (command.equals("Add asset")) {
                design.risk.createAsset(pkg, null);
            } else if (command.equals("Add accidental human threat")) {
                design.risk.createAccidentalHumanThreat(pkg, null);
            } else if (command.equals("Add deliberate human threat")) {
                design.risk.createDeliberateThreat(pkg, null);
            } else if (command.equals("Add non-human threat")) {
                design.risk.createThreat(pkg, null);
            } else if (command.equals("Add vulnerability")) {
                design.risk.createVulnerability(pkg, null);
            } else if (command.equals("Add unwanted incident")) {
                design.risk.createIncidentType(pkg, null, null);
            } else if (command.equals("Add threat scenario")) {
                design.risk.createThreatScenario(pkg, null, null, LikelihoodLevel.POSSIBLE, null, null, null);
            } else if (command.equals("Add risk assessment")) {
                design.risk.createRiskAssessment(pkg, null);
            } else if (command.equals("Add countermeasure")) {
                design.risk.createCountermeasure(pkg, null);
            }            
        }        
    };   
    
    class StakeholderImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Stakeholder stakeholder;
        //
        public StakeholderImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            stakeholder = (Stakeholder) e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return stakeholder.getName();
        }
    };   
    

    class ThreatImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Threat threat;
        //
        public ThreatImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            threat = (Threat) e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return threat.getDescription();
        }
    };
    
    class AccidentalThreatImplNode extends ThreatImplNode {
        //
        private static final long serialVersionUID = 1L;
        //
        public AccidentalThreatImplNode(Node p, Element e) {
            super(p, e);
        }
    };   

    class DeliberateThreatImplNode extends ThreatImplNode {
        //
        private static final long serialVersionUID = 1L;
        //
        public DeliberateThreatImplNode(Node p, Element e) {
            super(p, e);
        }
    };   
    
    
    class AssetImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Asset asset;
        //
        public AssetImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            asset = (Asset)e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return asset.getDescription();
        }
    };   

    class VulnerabilityImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Vulnerability vulnerability;
        //
        public VulnerabilityImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            vulnerability = (Vulnerability)e;
        }
        
        @Override
        public void load() {
            loadFeatures("countermeasures");
        }
        
        @Override
        public String getDisplayLabel() {
            return vulnerability.getDescription();
        }
    };   
    
    class IncidentTypeImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IncidentType incident;
        //
        public IncidentTypeImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            incident = (IncidentType)e;
        }
        @Override
        public void load() {
            loadFeatures("negativeConsequences");
        }
        @Override
        public String getDisplayLabel() {
            return incident.getDescription();
        }
    }; 

    class NegativeConsequenceImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        NegativeConsequence consequence;
        //
        public NegativeConsequenceImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            consequence = (NegativeConsequence)e;
        }
        @Override
        public void load() {
            n(consequence.getAffectedAsset());
            loadFeatures("affectedAsset");
        }
        @Override
        public String getDisplayLabel() {
            return consequence.getDescription() + " ("+consequence.getSeverity()+")";
        }
    }; 
    
    class ThreatScenarioImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        ThreatScenario scenario;
        //
        public ThreatScenarioImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            scenario = (ThreatScenario)e;
        }
        @Override
        public void load() {
            n(scenario.getThreat());
            n(scenario.getVulnerability());
            n(scenario.getUnwantedIncidents());
            n(scenario.getCountermeasures());
            n(scenario.getEnablesScenario());
            loadFeatures(new String[] {
                            "threat",
                            "vulnerability",
                            "unwantedIncidents",
                            "countermeasures",
                            "enablesScenario"
            });
        }
        @Override
        public String getDisplayLabel() {
            return scenario.getDescription() + " ("+scenario.getLikelihood()+")";
        }
    };

    class RiskAssessmentImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        RiskAssessment risk;
        //
        public RiskAssessmentImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            risk = (RiskAssessment)e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return risk.getDescription();
        }
    };    

    class CountermeasureImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Countermeasure countermeasure;
        //
        public CountermeasureImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            countermeasure = (Countermeasure)e;
        }
        @Override
        public void load() {
            n(countermeasure.getRuleTemplates());
            loadFeatures("ruleTemplates");
        }
        @Override
        public String getDisplayLabel() {
            return countermeasure.getDescription();
        }
    };  
    
    
    class RuleTemplateImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        private RuleTemplate template;

        //
        public RuleTemplateImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            template = (RuleTemplate) e;
        }

        @Override
        public void load() {}

        @Override
        public String getDisplayLabel() {
            return "<html>"+template.getName()+"</html>";
        }

    }
    
}
