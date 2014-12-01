package seckit.gui.design.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import risk.RiskDesignModel;
import risk.RiskFactory;
import risk.type.AccidentalThreat;
import risk.type.Asset;
import risk.type.Countermeasure;
import risk.type.DeliberateThreat;
import risk.type.IncidentType;
import risk.type.NegativeConsequence;
import risk.type.RiskAssessment;
import risk.type.RiskTypePackage;
import risk.type.SeverityLevel;
import risk.type.Stakeholder;
import risk.type.Threat;
import risk.type.ThreatScenario;
import risk.type.TypeFactory;
import risk.type.Vulnerability;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import trust.instance.LikelihoodLevel;
import utils.ecore.ECoreUtils;

public class RiskDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(RiskDesignController.class);
    
    public RiskDesignController(DesignViewpointFactory design) {
        super("Risk", design);
    }

    public RiskDesignModel createModel() {
        //
        RiskDesignModel model = RiskFactory.eINSTANCE.createRiskDesignModel();
        ECoreUtils.setup(model);
        model.setDescription("Risk Model");
        design.viewpoint.getRiskDesignModels().add(model);
        return model;
    }

    
    /*
    Source: How to break Web software
    Attack Tree
    Command injection
    AND
    - Obtain knowledge on used server side operating system, commands, and applications
    - Create injection command
    - Inject command for execution on server
      + Piggyback malicious command to existing server side command
      + Replace existing server side command with malicious command   
    
    
    */
    public RiskTypePackage createRiskTypePackage(RiskDesignModel model, RiskTypePackage parent, String name) {
        // TODO: sub and super packages?        
        RiskTypePackage pkg = TypeFactory.eINSTANCE.createRiskTypePackage();
        ECoreUtils.setup(pkg);
        if (name == null) {
            name = "Package "+pkg.getId();
        }
        pkg.setName(name);
        if (parent != null) {
            parent.getSubPackages().add(pkg);
        } else {
            model.getPackages().add(pkg);
        }
        return pkg;
    }
    
    public AccidentalThreat createAccidentalHumanThreat(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        AccidentalThreat threat = TypeFactory.eINSTANCE.createAccidentalThreat();
        ECoreUtils.setup(threat);
        if (description == null) {
            description = "Threat "+threat.getId();
        }
        threat.setDescription(description);
        pkg.getThreats().add(threat);
        return threat;
    }
    
    public DeliberateThreat createDeliberateThreat(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        DeliberateThreat threat = TypeFactory.eINSTANCE.createDeliberateThreat();
        ECoreUtils.setup(threat);
        if (description == null) {
            description = "Threat "+threat.getId();
        }
        threat.setDescription(description);
        pkg.getThreats().add(threat);
        return threat;
    }

    public Threat createThreat(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        Threat threat = TypeFactory.eINSTANCE.createThreat();
        ECoreUtils.setup(threat);
        if (description == null) {
            description = "Threat "+threat.getId();
        }
        threat.setDescription(description);
        pkg.getThreats().add(threat);
        return threat;
    }
    
    public Asset createAsset(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        Asset asset = TypeFactory.eINSTANCE.createAsset();
        ECoreUtils.setup(asset);
        if (description == null) {
            description = "Asset "+asset.getId();
        }
        asset.setDescription(description);
        pkg.getAssets().add(asset);
        return asset;
    }

    public Stakeholder createStakeholder(RiskTypePackage pkg, String name) {
        if (pkg == null) return null;
        Stakeholder stakeholder = TypeFactory.eINSTANCE.createStakeholder();
        ECoreUtils.setup(stakeholder);
        if (name == null) {
            name = "Stakeholder "+stakeholder.getId();
        }
        stakeholder.setName(name);
        pkg.getStakeholders().add(stakeholder);
        return stakeholder;
    }
    
    public IncidentType createIncidentType(RiskTypePackage pkg, String description, NegativeConsequence[] consequences) {
        if (pkg == null) return null;
        IncidentType incident = TypeFactory.eINSTANCE.createIncidentType();
        ECoreUtils.setup(incident);
        if (description == null) {
            description = "Incident "+incident.getId();
        }
        incident.setDescription(description);
        if (consequences != null) {
            for (NegativeConsequence consequence : consequences) {
                incident.getNegativeConsequences().add(consequence);
            }
        }
        pkg.getUnwantedIncidents().add(incident);
        return incident;
    }

    public Countermeasure createCountermeasure(RiskTypePackage pkg, Vulnerability vulnerability, String description) {
        if (pkg == null) return null;
        Countermeasure countermeasure = createCountermeasure(pkg, description);
        vulnerability.getCountermeasures().add(countermeasure);
        return countermeasure;
    }
    
    public Countermeasure createCountermeasure(RiskTypePackage pkg, ThreatScenario scenario, String description) {
        if (pkg == null) return null;
        Countermeasure countermeasure = createCountermeasure(pkg, description);
        scenario.getCountermeasures().add(countermeasure);
        return countermeasure;
    }

    public Countermeasure createCountermeasure(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        Countermeasure countermeasure = TypeFactory.eINSTANCE.createCountermeasure();
        ECoreUtils.setup(countermeasure);
        if (description == null) {
            description = "Countermeasure  "+countermeasure.getId();
        }
        countermeasure.setDescription(description);
        pkg.getCountermeasures().add(countermeasure);
        return countermeasure;
    }

    public RiskAssessment createRiskAssessment(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        RiskAssessment assessment  = TypeFactory.eINSTANCE.createRiskAssessment();
        ECoreUtils.setup(assessment);
        if (description == null) {
            description = "Assessment  "+assessment.getId();
        }
        assessment.setDescription(description);
        pkg.getRiskAssessments().add(assessment);
        return assessment;
    }
    
    public NegativeConsequence createNegativeConsequence(String description, SeverityLevel severity, Asset affectedAsset) {
        NegativeConsequence consequence = TypeFactory.eINSTANCE.createNegativeConsequence();
        ECoreUtils.setup(consequence);
        consequence.setDescription(description);
        consequence.setSeverity(severity);
        consequence.setAffectedAsset(affectedAsset);        
        return consequence;
    }
    
    public Vulnerability createVulnerability(RiskTypePackage pkg, String description) {
        if (pkg == null) return null;
        Vulnerability vulnerability = TypeFactory.eINSTANCE.createVulnerability();
        ECoreUtils.setup(vulnerability);
        if (description == null) {
            description = "Vulnerability  "+vulnerability.getId();
        }
        vulnerability.setDescription(description);
        pkg.getVulnerabilities().add(vulnerability);
        return vulnerability;
    }
    
    public ThreatScenario createThreatScenario(RiskTypePackage pkg, ThreatScenario[] requiredScenarios, String description, LikelihoodLevel likelihood, Threat threat, Vulnerability vulnerability, IncidentType[] incidents) {
        if (pkg == null) return null;
        ThreatScenario scenario = TypeFactory.eINSTANCE.createThreatScenario();
        ECoreUtils.setup(scenario);
        if (description == null) {
            description = "Scenario  "+scenario.getId();
        }
        scenario.setDescription(description);
        if (requiredScenarios != null) {
            for (ThreatScenario rScenario : requiredScenarios) {
                scenario.getRequiresScenario().add(rScenario);
            }
        }
        if (threat != null) {
            scenario.setThreat(threat);
        }
        if (likelihood != null) {
            scenario.setLikelihood(likelihood);
        }
        if (vulnerability != null) {
            scenario.getVulnerability().add(vulnerability);
        }
        if (incidents != null) {
            for (IncidentType incident : incidents) {
                scenario.getUnwantedIncidents().add(incident);
            }
        }
        pkg.getScenarios().add(scenario);
        return scenario;
    }
    

}
