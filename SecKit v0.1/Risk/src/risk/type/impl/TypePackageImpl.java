/**
 */
package risk.type.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import risk.RiskPackage;

import risk.impl.RiskPackageImpl;

import risk.type.AccidentType;
import risk.type.AccidentalThreat;
import risk.type.AdvertisementRevenue;
import risk.type.Asset;
import risk.type.AttackScenario;
import risk.type.AttributeModality;
import risk.type.CompetitiveAdvantage;
import risk.type.Consequence;
import risk.type.Cost;
import risk.type.Countermeasure;
import risk.type.DataAsset;
import risk.type.DataLeak;
import risk.type.DeliberateThreat;
import risk.type.EconomicDamage;
import risk.type.GainBenefit;
import risk.type.IdentityAsset;
import risk.type.IncidentType;
import risk.type.Loss;
import risk.type.LossOfControl;
import risk.type.MisuseCase;
import risk.type.MonetaryAmount;
import risk.type.NearMissType;
import risk.type.NegativeConsequence;
import risk.type.PerceivedRisk;
import risk.type.PhysicalDamage;
import risk.type.PositiveConsequence;
import risk.type.Privacy;
import risk.type.PrivacyViolationIncident;
import risk.type.RealRisk;
import risk.type.RefinementType;
import risk.type.Reputation;
import risk.type.Response;
import risk.type.RiskAssessment;
import risk.type.RiskTypePackage;
import risk.type.SeverityLevel;
import risk.type.SeverityLevelCORAS;
import risk.type.Skill;
import risk.type.SpecialEquipment;
import risk.type.Stakeholder;
import risk.type.StructuralAsset;
import risk.type.Threat;
import risk.type.ThreatScenario;
import risk.type.ThreatScenarioAttribute;
import risk.type.TypeFactory;
import risk.type.TypePackage;
import risk.type.UndesiredEventType;
import risk.type.Vulnerability;

import rule.template.TemplatePackage;

import structure.StructurePackage;

import structure.instantiation.InstantiationPackage;

import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass threatScenarioEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass threatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vulnerabilityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass incidentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass responseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass countermeasureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monetaryAmountEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass consequenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reputationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralAssetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass competitiveAdvantageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stakeholderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataAssetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAssetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deliberateThreatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accidentalThreatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass negativeConsequenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lossEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass positiveConsequenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gainBenefitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass perceivedRiskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass realRiskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privacyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lossOfControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass advertisementRevenueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privacyViolationIncidentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataLeakEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskAssessmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass misuseCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attackScenarioEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specialEquipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass threatScenarioAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass costEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass skillEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalDamageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass economicDamageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nearMissTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accidentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass undesiredEventTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum severityLevelEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum severityLevelCORASEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum refinementTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum attributeModalityEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see risk.type.TypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TypePackageImpl() {
        super(eNS_URI, TypeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TypePackage init() {
        if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Obtain or create and register package
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RiskPackageImpl theRiskPackage = (RiskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI) instanceof RiskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI) : RiskPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theRiskPackage.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theRiskPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTypePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
        return theTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAsset() {
        return assetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAsset_Value() {
        return (EReference)assetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAsset_InterestedStakeholder() {
        return (EReference)assetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAsset_IndirectlyImpacts() {
        return (EReference)assetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAsset_Description() {
        return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThreatScenario() {
        return threatScenarioEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_Threat() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_Vulnerability() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_UnwantedIncidents() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_RequiresScenario() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_EnablesScenario() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThreatScenario_Description() {
        return (EAttribute)threatScenarioEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_Countermeasures() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThreatScenario_RefinementType() {
        return (EAttribute)threatScenarioEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_Attributes() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThreatScenario_Likelihood() {
        return (EAttribute)threatScenarioEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreatScenario_LikelihoodMeasurement() {
        return (EReference)threatScenarioEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThreat() {
        return threatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThreat_Description() {
        return (EAttribute)threatEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThreat_EntityInstantiation() {
        return (EReference)threatEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVulnerability() {
        return vulnerabilityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVulnerability_Description() {
        return (EAttribute)vulnerabilityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVulnerability_Countermeasures() {
        return (EReference)vulnerabilityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVulnerability_EntityInstantiation() {
        return (EReference)vulnerabilityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIncidentType() {
        return incidentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncidentType_Description() {
        return (EAttribute)incidentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncidentType_Likelihood() {
        return (EAttribute)incidentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIncidentType_Enables() {
        return (EReference)incidentTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIncidentType_NegativeConsequences() {
        return (EReference)incidentTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIncidentType_LikelihoodMeasurement() {
        return (EReference)incidentTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResponse() {
        return responseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCountermeasure() {
        return countermeasureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCountermeasure_Cost() {
        return (EReference)countermeasureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCountermeasure_Description() {
        return (EAttribute)countermeasureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCountermeasure_RuleTemplates() {
        return (EReference)countermeasureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonetaryAmount() {
        return monetaryAmountEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConsequence() {
        return consequenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConsequence_AffectedAsset() {
        return (EReference)consequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConsequence_Description() {
        return (EAttribute)consequenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReputation() {
        return reputationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralAsset() {
        return structuralAssetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralAsset_EntityInstantiation() {
        return (EReference)structuralAssetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompetitiveAdvantage() {
        return competitiveAdvantageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStakeholder() {
        return stakeholderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStakeholder_OwnedEntityInstantiations() {
        return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStakeholder_AssetsToProtect() {
        return (EReference)stakeholderEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStakeholder_Name() {
        return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataAsset() {
        return dataAssetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataAsset_DataInstantiation() {
        return (EReference)dataAssetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAsset() {
        return identityAssetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAsset_IdentityInstantiation() {
        return (EReference)identityAssetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeliberateThreat() {
        return deliberateThreatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccidentalThreat() {
        return accidentalThreatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNegativeConsequence() {
        return negativeConsequenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNegativeConsequence_Likelihood() {
        return (EAttribute)negativeConsequenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNegativeConsequence_Severity() {
        return (EAttribute)negativeConsequenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoss() {
        return lossEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPositiveConsequence() {
        return positiveConsequenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGainBenefit() {
        return gainBenefitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerceivedRisk() {
        return perceivedRiskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRealRisk() {
        return realRiskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrivacy() {
        return privacyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLossOfControl() {
        return lossOfControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdvertisementRevenue() {
        return advertisementRevenueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrivacyViolationIncident() {
        return privacyViolationIncidentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataLeak() {
        return dataLeakEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskAssessment() {
        return riskAssessmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiskAssessment_Description() {
        return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskTypePackage() {
        return riskTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Stakeholders() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Assets() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Threats() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Vulnerabilities() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_UnwantedIncidents() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Scenarios() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_RiskAssessments() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Countermeasures() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_SuperPackage() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_SubPackages() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRiskTypePackage_Name() {
        return (EAttribute)riskTypePackageEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskTypePackage_Model() {
        return (EReference)riskTypePackageEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMisuseCase() {
        return misuseCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttackScenario() {
        return attackScenarioEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecialEquipment() {
        return specialEquipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThreatScenarioAttribute() {
        return threatScenarioAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThreatScenarioAttribute_Modality() {
        return (EAttribute)threatScenarioAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCost() {
        return costEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSkill() {
        return skillEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalDamage() {
        return physicalDamageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEconomicDamage() {
        return economicDamageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNearMissType() {
        return nearMissTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccidentType() {
        return accidentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUndesiredEventType() {
        return undesiredEventTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSeverityLevel() {
        return severityLevelEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSeverityLevelCORAS() {
        return severityLevelCORASEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRefinementType() {
        return refinementTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttributeModality() {
        return attributeModalityEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactory getTypeFactory() {
        return (TypeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        assetEClass = createEClass(ASSET);
        createEReference(assetEClass, ASSET__VALUE);
        createEReference(assetEClass, ASSET__INTERESTED_STAKEHOLDER);
        createEReference(assetEClass, ASSET__INDIRECTLY_IMPACTS);
        createEAttribute(assetEClass, ASSET__DESCRIPTION);

        threatScenarioEClass = createEClass(THREAT_SCENARIO);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__THREAT);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__VULNERABILITY);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__UNWANTED_INCIDENTS);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__REQUIRES_SCENARIO);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__ENABLES_SCENARIO);
        createEAttribute(threatScenarioEClass, THREAT_SCENARIO__DESCRIPTION);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__COUNTERMEASURES);
        createEAttribute(threatScenarioEClass, THREAT_SCENARIO__REFINEMENT_TYPE);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__ATTRIBUTES);
        createEAttribute(threatScenarioEClass, THREAT_SCENARIO__LIKELIHOOD);
        createEReference(threatScenarioEClass, THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT);

        threatEClass = createEClass(THREAT);
        createEAttribute(threatEClass, THREAT__DESCRIPTION);
        createEReference(threatEClass, THREAT__ENTITY_INSTANTIATION);

        vulnerabilityEClass = createEClass(VULNERABILITY);
        createEAttribute(vulnerabilityEClass, VULNERABILITY__DESCRIPTION);
        createEReference(vulnerabilityEClass, VULNERABILITY__COUNTERMEASURES);
        createEReference(vulnerabilityEClass, VULNERABILITY__ENTITY_INSTANTIATION);

        incidentTypeEClass = createEClass(INCIDENT_TYPE);
        createEAttribute(incidentTypeEClass, INCIDENT_TYPE__DESCRIPTION);
        createEAttribute(incidentTypeEClass, INCIDENT_TYPE__LIKELIHOOD);
        createEReference(incidentTypeEClass, INCIDENT_TYPE__ENABLES);
        createEReference(incidentTypeEClass, INCIDENT_TYPE__NEGATIVE_CONSEQUENCES);
        createEReference(incidentTypeEClass, INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT);

        responseEClass = createEClass(RESPONSE);

        countermeasureEClass = createEClass(COUNTERMEASURE);
        createEReference(countermeasureEClass, COUNTERMEASURE__COST);
        createEAttribute(countermeasureEClass, COUNTERMEASURE__DESCRIPTION);
        createEReference(countermeasureEClass, COUNTERMEASURE__RULE_TEMPLATES);

        monetaryAmountEClass = createEClass(MONETARY_AMOUNT);

        consequenceEClass = createEClass(CONSEQUENCE);
        createEReference(consequenceEClass, CONSEQUENCE__AFFECTED_ASSET);
        createEAttribute(consequenceEClass, CONSEQUENCE__DESCRIPTION);

        reputationEClass = createEClass(REPUTATION);

        structuralAssetEClass = createEClass(STRUCTURAL_ASSET);
        createEReference(structuralAssetEClass, STRUCTURAL_ASSET__ENTITY_INSTANTIATION);

        competitiveAdvantageEClass = createEClass(COMPETITIVE_ADVANTAGE);

        stakeholderEClass = createEClass(STAKEHOLDER);
        createEReference(stakeholderEClass, STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS);
        createEReference(stakeholderEClass, STAKEHOLDER__ASSETS_TO_PROTECT);
        createEAttribute(stakeholderEClass, STAKEHOLDER__NAME);

        dataAssetEClass = createEClass(DATA_ASSET);
        createEReference(dataAssetEClass, DATA_ASSET__DATA_INSTANTIATION);

        identityAssetEClass = createEClass(IDENTITY_ASSET);
        createEReference(identityAssetEClass, IDENTITY_ASSET__IDENTITY_INSTANTIATION);

        deliberateThreatEClass = createEClass(DELIBERATE_THREAT);

        accidentalThreatEClass = createEClass(ACCIDENTAL_THREAT);

        negativeConsequenceEClass = createEClass(NEGATIVE_CONSEQUENCE);
        createEAttribute(negativeConsequenceEClass, NEGATIVE_CONSEQUENCE__LIKELIHOOD);
        createEAttribute(negativeConsequenceEClass, NEGATIVE_CONSEQUENCE__SEVERITY);

        lossEClass = createEClass(LOSS);

        positiveConsequenceEClass = createEClass(POSITIVE_CONSEQUENCE);

        gainBenefitEClass = createEClass(GAIN_BENEFIT);

        perceivedRiskEClass = createEClass(PERCEIVED_RISK);

        realRiskEClass = createEClass(REAL_RISK);

        privacyEClass = createEClass(PRIVACY);

        lossOfControlEClass = createEClass(LOSS_OF_CONTROL);

        advertisementRevenueEClass = createEClass(ADVERTISEMENT_REVENUE);

        privacyViolationIncidentEClass = createEClass(PRIVACY_VIOLATION_INCIDENT);

        dataLeakEClass = createEClass(DATA_LEAK);

        riskAssessmentEClass = createEClass(RISK_ASSESSMENT);
        createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__DESCRIPTION);

        riskTypePackageEClass = createEClass(RISK_TYPE_PACKAGE);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__STAKEHOLDERS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__ASSETS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__THREATS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__VULNERABILITIES);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__SCENARIOS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__RISK_ASSESSMENTS);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__COUNTERMEASURES);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__SUPER_PACKAGE);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__SUB_PACKAGES);
        createEAttribute(riskTypePackageEClass, RISK_TYPE_PACKAGE__NAME);
        createEReference(riskTypePackageEClass, RISK_TYPE_PACKAGE__MODEL);

        misuseCaseEClass = createEClass(MISUSE_CASE);

        attackScenarioEClass = createEClass(ATTACK_SCENARIO);

        specialEquipmentEClass = createEClass(SPECIAL_EQUIPMENT);

        threatScenarioAttributeEClass = createEClass(THREAT_SCENARIO_ATTRIBUTE);
        createEAttribute(threatScenarioAttributeEClass, THREAT_SCENARIO_ATTRIBUTE__MODALITY);

        costEClass = createEClass(COST);

        skillEClass = createEClass(SKILL);

        physicalDamageEClass = createEClass(PHYSICAL_DAMAGE);

        economicDamageEClass = createEClass(ECONOMIC_DAMAGE);

        nearMissTypeEClass = createEClass(NEAR_MISS_TYPE);

        accidentTypeEClass = createEClass(ACCIDENT_TYPE);

        undesiredEventTypeEClass = createEClass(UNDESIRED_EVENT_TYPE);

        // Create enums
        severityLevelEEnum = createEEnum(SEVERITY_LEVEL);
        severityLevelCORASEEnum = createEEnum(SEVERITY_LEVEL_CORAS);
        refinementTypeEEnum = createEEnum(REFINEMENT_TYPE);
        attributeModalityEEnum = createEEnum(ATTRIBUTE_MODALITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);
        data.instantiation.InstantiationPackage theInstantiationPackage_1 = (data.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(data.instantiation.InstantiationPackage.eNS_URI);
        identity.instantiation.InstantiationPackage theInstantiationPackage_2 = (identity.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(identity.instantiation.InstantiationPackage.eNS_URI);
        RiskPackage theRiskPackage = (RiskPackage)EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        assetEClass.getESuperTypes().add(theModelsPackage.getElement());
        threatScenarioEClass.getESuperTypes().add(theModelsPackage.getElement());
        threatEClass.getESuperTypes().add(theModelsPackage.getElement());
        vulnerabilityEClass.getESuperTypes().add(theModelsPackage.getElement());
        incidentTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        incidentTypeEClass.getESuperTypes().add(this.getUndesiredEventType());
        countermeasureEClass.getESuperTypes().add(theModelsPackage.getElement());
        consequenceEClass.getESuperTypes().add(theModelsPackage.getElement());
        reputationEClass.getESuperTypes().add(this.getAsset());
        structuralAssetEClass.getESuperTypes().add(this.getAsset());
        competitiveAdvantageEClass.getESuperTypes().add(this.getAsset());
        stakeholderEClass.getESuperTypes().add(theModelsPackage.getElement());
        dataAssetEClass.getESuperTypes().add(this.getAsset());
        identityAssetEClass.getESuperTypes().add(this.getAsset());
        deliberateThreatEClass.getESuperTypes().add(this.getThreat());
        accidentalThreatEClass.getESuperTypes().add(this.getThreat());
        negativeConsequenceEClass.getESuperTypes().add(this.getConsequence());
        lossEClass.getESuperTypes().add(this.getNegativeConsequence());
        positiveConsequenceEClass.getESuperTypes().add(this.getConsequence());
        gainBenefitEClass.getESuperTypes().add(this.getPositiveConsequence());
        perceivedRiskEClass.getESuperTypes().add(this.getRiskAssessment());
        realRiskEClass.getESuperTypes().add(this.getRiskAssessment());
        privacyEClass.getESuperTypes().add(this.getAsset());
        lossOfControlEClass.getESuperTypes().add(this.getAsset());
        advertisementRevenueEClass.getESuperTypes().add(this.getAsset());
        privacyViolationIncidentEClass.getESuperTypes().add(this.getIncidentType());
        dataLeakEClass.getESuperTypes().add(this.getIncidentType());
        riskAssessmentEClass.getESuperTypes().add(theModelsPackage.getElement());
        riskTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        attackScenarioEClass.getESuperTypes().add(this.getThreatScenario());
        specialEquipmentEClass.getESuperTypes().add(this.getThreatScenarioAttribute());
        costEClass.getESuperTypes().add(this.getThreatScenarioAttribute());
        skillEClass.getESuperTypes().add(this.getThreatScenarioAttribute());
        physicalDamageEClass.getESuperTypes().add(this.getNegativeConsequence());
        economicDamageEClass.getESuperTypes().add(this.getNegativeConsequence());
        nearMissTypeEClass.getESuperTypes().add(this.getUndesiredEventType());
        accidentTypeEClass.getESuperTypes().add(this.getUndesiredEventType());

        // Initialize classes, features, and operations; add parameters
        initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAsset_Value(), this.getMonetaryAmount(), null, "value", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAsset_InterestedStakeholder(), this.getStakeholder(), this.getStakeholder_AssetsToProtect(), "interestedStakeholder", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAsset_IndirectlyImpacts(), this.getAsset(), null, "indirectlyImpacts", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(threatScenarioEClass, ThreatScenario.class, "ThreatScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getThreatScenario_Threat(), this.getThreat(), null, "threat", null, 1, 1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_Vulnerability(), this.getVulnerability(), null, "vulnerability", null, 1, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_UnwantedIncidents(), this.getIncidentType(), null, "unwantedIncidents", null, 0, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_RequiresScenario(), this.getThreatScenario(), this.getThreatScenario_EnablesScenario(), "requiresScenario", null, 0, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_EnablesScenario(), this.getThreatScenario(), this.getThreatScenario_RequiresScenario(), "enablesScenario", null, 0, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getThreatScenario_Description(), ecorePackage.getEString(), "description", null, 0, 1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_Countermeasures(), this.getCountermeasure(), null, "countermeasures", null, 0, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getThreatScenario_RefinementType(), this.getRefinementType(), "refinementType", null, 0, 1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_Attributes(), this.getThreatScenarioAttribute(), null, "attributes", null, 0, -1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getThreatScenario_Likelihood(), theInstancePackage.getLikelihoodLevel(), "likelihood", null, 0, 1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreatScenario_LikelihoodMeasurement(), theInstancePackage.getLikelihoodMeasurement(), null, "likelihoodMeasurement", null, 0, 1, ThreatScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getThreat_Description(), ecorePackage.getEString(), "description", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getThreat_EntityInstantiation(), theInstantiationPackage.getEntityInstantiationReference(), null, "entityInstantiation", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVulnerability_Description(), ecorePackage.getEString(), "description", null, 0, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVulnerability_Countermeasures(), this.getCountermeasure(), null, "countermeasures", null, 0, -1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVulnerability_EntityInstantiation(), theInstantiationPackage.getEntityInstantiationReference(), null, "entityInstantiation", null, 0, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(incidentTypeEClass, IncidentType.class, "IncidentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIncidentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, IncidentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncidentType_Likelihood(), theInstancePackage.getLikelihoodLevel(), "likelihood", null, 0, 1, IncidentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIncidentType_Enables(), this.getIncidentType(), null, "enables", null, 0, -1, IncidentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIncidentType_NegativeConsequences(), this.getNegativeConsequence(), null, "negativeConsequences", null, 0, -1, IncidentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIncidentType_LikelihoodMeasurement(), theInstancePackage.getLikelihoodMeasurement(), null, "likelihoodMeasurement", null, 0, 1, IncidentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(countermeasureEClass, Countermeasure.class, "Countermeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCountermeasure_Cost(), this.getMonetaryAmount(), null, "cost", null, 0, 1, Countermeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCountermeasure_Description(), ecorePackage.getEString(), "description", null, 0, 1, Countermeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCountermeasure_RuleTemplates(), theTemplatePackage.getRuleTemplate(), null, "ruleTemplates", null, 0, -1, Countermeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(monetaryAmountEClass, MonetaryAmount.class, "MonetaryAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(consequenceEClass, Consequence.class, "Consequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConsequence_AffectedAsset(), this.getAsset(), null, "affectedAsset", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConsequence_Description(), ecorePackage.getEString(), "description", null, 0, 1, Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(reputationEClass, Reputation.class, "Reputation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuralAssetEClass, StructuralAsset.class, "StructuralAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuralAsset_EntityInstantiation(), theInstantiationPackage.getEntityInstantiation(), null, "entityInstantiation", null, 1, 1, StructuralAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(competitiveAdvantageEClass, CompetitiveAdvantage.class, "CompetitiveAdvantage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStakeholder_OwnedEntityInstantiations(), theInstantiationPackage.getEntityInstantiation(), null, "ownedEntityInstantiations", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStakeholder_AssetsToProtect(), this.getAsset(), this.getAsset_InterestedStakeholder(), "assetsToProtect", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStakeholder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataAssetEClass, DataAsset.class, "DataAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataAsset_DataInstantiation(), theInstantiationPackage_1.getAbstractDataInstantiation(), null, "dataInstantiation", null, 1, 1, DataAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityAssetEClass, IdentityAsset.class, "IdentityAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityAsset_IdentityInstantiation(), theInstantiationPackage_2.getIdentityInstantiation(), null, "identityInstantiation", null, 1, 1, IdentityAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deliberateThreatEClass, DeliberateThreat.class, "DeliberateThreat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(accidentalThreatEClass, AccidentalThreat.class, "AccidentalThreat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(negativeConsequenceEClass, NegativeConsequence.class, "NegativeConsequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNegativeConsequence_Likelihood(), theInstancePackage.getLikelihoodLevel(), "likelihood", null, 0, 1, NegativeConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNegativeConsequence_Severity(), this.getSeverityLevel(), "severity", null, 0, 1, NegativeConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lossEClass, Loss.class, "Loss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(positiveConsequenceEClass, PositiveConsequence.class, "PositiveConsequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gainBenefitEClass, GainBenefit.class, "GainBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(perceivedRiskEClass, PerceivedRisk.class, "PerceivedRisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(realRiskEClass, RealRisk.class, "RealRisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(privacyEClass, Privacy.class, "Privacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lossOfControlEClass, LossOfControl.class, "LossOfControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(advertisementRevenueEClass, AdvertisementRevenue.class, "AdvertisementRevenue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(privacyViolationIncidentEClass, PrivacyViolationIncident.class, "PrivacyViolationIncident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataLeakEClass, DataLeak.class, "DataLeak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(riskAssessmentEClass, RiskAssessment.class, "RiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRiskAssessment_Description(), ecorePackage.getEString(), "description", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(riskTypePackageEClass, RiskTypePackage.class, "RiskTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRiskTypePackage_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Assets(), this.getAsset(), null, "assets", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Threats(), this.getThreat(), null, "threats", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Vulnerabilities(), this.getVulnerability(), null, "vulnerabilities", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_UnwantedIncidents(), this.getIncidentType(), null, "unwantedIncidents", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Scenarios(), this.getThreatScenario(), null, "scenarios", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_RiskAssessments(), this.getRiskAssessment(), null, "riskAssessments", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Countermeasures(), this.getCountermeasure(), null, "countermeasures", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_SuperPackage(), this.getRiskTypePackage(), this.getRiskTypePackage_SubPackages(), "superPackage", null, 0, 1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_SubPackages(), this.getRiskTypePackage(), this.getRiskTypePackage_SuperPackage(), "subPackages", null, 0, -1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRiskTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRiskTypePackage_Model(), theRiskPackage.getRiskDesignModel(), theRiskPackage.getRiskDesignModel_Packages(), "model", null, 0, 1, RiskTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(misuseCaseEClass, MisuseCase.class, "MisuseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attackScenarioEClass, AttackScenario.class, "AttackScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(specialEquipmentEClass, SpecialEquipment.class, "SpecialEquipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(threatScenarioAttributeEClass, ThreatScenarioAttribute.class, "ThreatScenarioAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getThreatScenarioAttribute_Modality(), this.getAttributeModality(), "modality", null, 0, 1, ThreatScenarioAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(physicalDamageEClass, PhysicalDamage.class, "PhysicalDamage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(economicDamageEClass, EconomicDamage.class, "EconomicDamage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nearMissTypeEClass, NearMissType.class, "NearMissType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(accidentTypeEClass, AccidentType.class, "AccidentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(undesiredEventTypeEClass, UndesiredEventType.class, "UndesiredEventType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(severityLevelEEnum, SeverityLevel.class, "SeverityLevel");
        addEEnumLiteral(severityLevelEEnum, SeverityLevel.NEGLIGIBLE);
        addEEnumLiteral(severityLevelEEnum, SeverityLevel.MARGINAL);
        addEEnumLiteral(severityLevelEEnum, SeverityLevel.CRITICAL);
        addEEnumLiteral(severityLevelEEnum, SeverityLevel.CATASTROPHIC);

        initEEnum(severityLevelCORASEEnum, SeverityLevelCORAS.class, "SeverityLevelCORAS");
        addEEnumLiteral(severityLevelCORASEEnum, SeverityLevelCORAS.HARMLESS);
        addEEnumLiteral(severityLevelCORASEEnum, SeverityLevelCORAS.MODERATA);
        addEEnumLiteral(severityLevelCORASEEnum, SeverityLevelCORAS.SERIOUS);
        addEEnumLiteral(severityLevelCORASEEnum, SeverityLevelCORAS.CATASTROPHIC);

        initEEnum(refinementTypeEEnum, RefinementType.class, "RefinementType");
        addEEnumLiteral(refinementTypeEEnum, RefinementType.AND);
        addEEnumLiteral(refinementTypeEEnum, RefinementType.OR);

        initEEnum(attributeModalityEEnum, AttributeModality.class, "AttributeModality");
        addEEnumLiteral(attributeModalityEEnum, AttributeModality.REQUIRED);
        addEEnumLiteral(attributeModalityEEnum, AttributeModality.MISSING);
    }

} //TypePackageImpl
