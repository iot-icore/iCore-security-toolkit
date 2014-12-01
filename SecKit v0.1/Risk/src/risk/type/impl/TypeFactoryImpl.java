/**
 */
package risk.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import risk.type.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TypePackage.ASSET: return createAsset();
            case TypePackage.THREAT_SCENARIO: return createThreatScenario();
            case TypePackage.THREAT: return createThreat();
            case TypePackage.VULNERABILITY: return createVulnerability();
            case TypePackage.INCIDENT_TYPE: return createIncidentType();
            case TypePackage.RESPONSE: return createResponse();
            case TypePackage.COUNTERMEASURE: return createCountermeasure();
            case TypePackage.MONETARY_AMOUNT: return createMonetaryAmount();
            case TypePackage.REPUTATION: return createReputation();
            case TypePackage.STRUCTURAL_ASSET: return createStructuralAsset();
            case TypePackage.COMPETITIVE_ADVANTAGE: return createCompetitiveAdvantage();
            case TypePackage.STAKEHOLDER: return createStakeholder();
            case TypePackage.DATA_ASSET: return createDataAsset();
            case TypePackage.IDENTITY_ASSET: return createIdentityAsset();
            case TypePackage.DELIBERATE_THREAT: return createDeliberateThreat();
            case TypePackage.ACCIDENTAL_THREAT: return createAccidentalThreat();
            case TypePackage.NEGATIVE_CONSEQUENCE: return createNegativeConsequence();
            case TypePackage.LOSS: return createLoss();
            case TypePackage.POSITIVE_CONSEQUENCE: return createPositiveConsequence();
            case TypePackage.GAIN_BENEFIT: return createGainBenefit();
            case TypePackage.PERCEIVED_RISK: return createPerceivedRisk();
            case TypePackage.REAL_RISK: return createRealRisk();
            case TypePackage.PRIVACY: return createPrivacy();
            case TypePackage.LOSS_OF_CONTROL: return createLossOfControl();
            case TypePackage.ADVERTISEMENT_REVENUE: return createAdvertisementRevenue();
            case TypePackage.PRIVACY_VIOLATION_INCIDENT: return createPrivacyViolationIncident();
            case TypePackage.DATA_LEAK: return createDataLeak();
            case TypePackage.RISK_ASSESSMENT: return createRiskAssessment();
            case TypePackage.RISK_TYPE_PACKAGE: return createRiskTypePackage();
            case TypePackage.MISUSE_CASE: return createMisuseCase();
            case TypePackage.ATTACK_SCENARIO: return createAttackScenario();
            case TypePackage.SPECIAL_EQUIPMENT: return createSpecialEquipment();
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE: return createThreatScenarioAttribute();
            case TypePackage.COST: return createCost();
            case TypePackage.SKILL: return createSkill();
            case TypePackage.PHYSICAL_DAMAGE: return createPhysicalDamage();
            case TypePackage.ECONOMIC_DAMAGE: return createEconomicDamage();
            case TypePackage.NEAR_MISS_TYPE: return createNearMissType();
            case TypePackage.ACCIDENT_TYPE: return createAccidentType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case TypePackage.SEVERITY_LEVEL:
                return createSeverityLevelFromString(eDataType, initialValue);
            case TypePackage.SEVERITY_LEVEL_CORAS:
                return createSeverityLevelCORASFromString(eDataType, initialValue);
            case TypePackage.REFINEMENT_TYPE:
                return createRefinementTypeFromString(eDataType, initialValue);
            case TypePackage.ATTRIBUTE_MODALITY:
                return createAttributeModalityFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case TypePackage.SEVERITY_LEVEL:
                return convertSeverityLevelToString(eDataType, instanceValue);
            case TypePackage.SEVERITY_LEVEL_CORAS:
                return convertSeverityLevelCORASToString(eDataType, instanceValue);
            case TypePackage.REFINEMENT_TYPE:
                return convertRefinementTypeToString(eDataType, instanceValue);
            case TypePackage.ATTRIBUTE_MODALITY:
                return convertAttributeModalityToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Asset createAsset() {
        AssetImpl asset = new AssetImpl();
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThreatScenario createThreatScenario() {
        ThreatScenarioImpl threatScenario = new ThreatScenarioImpl();
        return threatScenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Threat createThreat() {
        ThreatImpl threat = new ThreatImpl();
        return threat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vulnerability createVulnerability() {
        VulnerabilityImpl vulnerability = new VulnerabilityImpl();
        return vulnerability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncidentType createIncidentType() {
        IncidentTypeImpl incidentType = new IncidentTypeImpl();
        return incidentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Response createResponse() {
        ResponseImpl response = new ResponseImpl();
        return response;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Countermeasure createCountermeasure() {
        CountermeasureImpl countermeasure = new CountermeasureImpl();
        return countermeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonetaryAmount createMonetaryAmount() {
        MonetaryAmountImpl monetaryAmount = new MonetaryAmountImpl();
        return monetaryAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reputation createReputation() {
        ReputationImpl reputation = new ReputationImpl();
        return reputation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralAsset createStructuralAsset() {
        StructuralAssetImpl structuralAsset = new StructuralAssetImpl();
        return structuralAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompetitiveAdvantage createCompetitiveAdvantage() {
        CompetitiveAdvantageImpl competitiveAdvantage = new CompetitiveAdvantageImpl();
        return competitiveAdvantage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Stakeholder createStakeholder() {
        StakeholderImpl stakeholder = new StakeholderImpl();
        return stakeholder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataAsset createDataAsset() {
        DataAssetImpl dataAsset = new DataAssetImpl();
        return dataAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAsset createIdentityAsset() {
        IdentityAssetImpl identityAsset = new IdentityAssetImpl();
        return identityAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeliberateThreat createDeliberateThreat() {
        DeliberateThreatImpl deliberateThreat = new DeliberateThreatImpl();
        return deliberateThreat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccidentalThreat createAccidentalThreat() {
        AccidentalThreatImpl accidentalThreat = new AccidentalThreatImpl();
        return accidentalThreat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NegativeConsequence createNegativeConsequence() {
        NegativeConsequenceImpl negativeConsequence = new NegativeConsequenceImpl();
        return negativeConsequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Loss createLoss() {
        LossImpl loss = new LossImpl();
        return loss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PositiveConsequence createPositiveConsequence() {
        PositiveConsequenceImpl positiveConsequence = new PositiveConsequenceImpl();
        return positiveConsequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GainBenefit createGainBenefit() {
        GainBenefitImpl gainBenefit = new GainBenefitImpl();
        return gainBenefit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerceivedRisk createPerceivedRisk() {
        PerceivedRiskImpl perceivedRisk = new PerceivedRiskImpl();
        return perceivedRisk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RealRisk createRealRisk() {
        RealRiskImpl realRisk = new RealRiskImpl();
        return realRisk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Privacy createPrivacy() {
        PrivacyImpl privacy = new PrivacyImpl();
        return privacy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LossOfControl createLossOfControl() {
        LossOfControlImpl lossOfControl = new LossOfControlImpl();
        return lossOfControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdvertisementRevenue createAdvertisementRevenue() {
        AdvertisementRevenueImpl advertisementRevenue = new AdvertisementRevenueImpl();
        return advertisementRevenue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrivacyViolationIncident createPrivacyViolationIncident() {
        PrivacyViolationIncidentImpl privacyViolationIncident = new PrivacyViolationIncidentImpl();
        return privacyViolationIncident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataLeak createDataLeak() {
        DataLeakImpl dataLeak = new DataLeakImpl();
        return dataLeak;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskAssessment createRiskAssessment() {
        RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
        return riskAssessment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskTypePackage createRiskTypePackage() {
        RiskTypePackageImpl riskTypePackage = new RiskTypePackageImpl();
        return riskTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MisuseCase createMisuseCase() {
        MisuseCaseImpl misuseCase = new MisuseCaseImpl();
        return misuseCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttackScenario createAttackScenario() {
        AttackScenarioImpl attackScenario = new AttackScenarioImpl();
        return attackScenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialEquipment createSpecialEquipment() {
        SpecialEquipmentImpl specialEquipment = new SpecialEquipmentImpl();
        return specialEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThreatScenarioAttribute createThreatScenarioAttribute() {
        ThreatScenarioAttributeImpl threatScenarioAttribute = new ThreatScenarioAttributeImpl();
        return threatScenarioAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cost createCost() {
        CostImpl cost = new CostImpl();
        return cost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Skill createSkill() {
        SkillImpl skill = new SkillImpl();
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDamage createPhysicalDamage() {
        PhysicalDamageImpl physicalDamage = new PhysicalDamageImpl();
        return physicalDamage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EconomicDamage createEconomicDamage() {
        EconomicDamageImpl economicDamage = new EconomicDamageImpl();
        return economicDamage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NearMissType createNearMissType() {
        NearMissTypeImpl nearMissType = new NearMissTypeImpl();
        return nearMissType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccidentType createAccidentType() {
        AccidentTypeImpl accidentType = new AccidentTypeImpl();
        return accidentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeverityLevel createSeverityLevelFromString(EDataType eDataType, String initialValue) {
        SeverityLevel result = SeverityLevel.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSeverityLevelToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeverityLevelCORAS createSeverityLevelCORASFromString(EDataType eDataType, String initialValue) {
        SeverityLevelCORAS result = SeverityLevelCORAS.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSeverityLevelCORASToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementType createRefinementTypeFromString(EDataType eDataType, String initialValue) {
        RefinementType result = RefinementType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRefinementTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeModality createAttributeModalityFromString(EDataType eDataType, String initialValue) {
        AttributeModality result = AttributeModality.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttributeModalityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
