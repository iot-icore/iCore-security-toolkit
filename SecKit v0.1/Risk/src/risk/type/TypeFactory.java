/**
 */
package risk.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = risk.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset</em>'.
     * @generated
     */
    Asset createAsset();

    /**
     * Returns a new object of class '<em>Threat Scenario</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Threat Scenario</em>'.
     * @generated
     */
    ThreatScenario createThreatScenario();

    /**
     * Returns a new object of class '<em>Threat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Threat</em>'.
     * @generated
     */
    Threat createThreat();

    /**
     * Returns a new object of class '<em>Vulnerability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vulnerability</em>'.
     * @generated
     */
    Vulnerability createVulnerability();

    /**
     * Returns a new object of class '<em>Incident Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Incident Type</em>'.
     * @generated
     */
    IncidentType createIncidentType();

    /**
     * Returns a new object of class '<em>Response</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Response</em>'.
     * @generated
     */
    Response createResponse();

    /**
     * Returns a new object of class '<em>Countermeasure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Countermeasure</em>'.
     * @generated
     */
    Countermeasure createCountermeasure();

    /**
     * Returns a new object of class '<em>Monetary Amount</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Monetary Amount</em>'.
     * @generated
     */
    MonetaryAmount createMonetaryAmount();

    /**
     * Returns a new object of class '<em>Reputation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reputation</em>'.
     * @generated
     */
    Reputation createReputation();

    /**
     * Returns a new object of class '<em>Structural Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural Asset</em>'.
     * @generated
     */
    StructuralAsset createStructuralAsset();

    /**
     * Returns a new object of class '<em>Competitive Advantage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Competitive Advantage</em>'.
     * @generated
     */
    CompetitiveAdvantage createCompetitiveAdvantage();

    /**
     * Returns a new object of class '<em>Stakeholder</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Stakeholder</em>'.
     * @generated
     */
    Stakeholder createStakeholder();

    /**
     * Returns a new object of class '<em>Data Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Asset</em>'.
     * @generated
     */
    DataAsset createDataAsset();

    /**
     * Returns a new object of class '<em>Identity Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Asset</em>'.
     * @generated
     */
    IdentityAsset createIdentityAsset();

    /**
     * Returns a new object of class '<em>Deliberate Threat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deliberate Threat</em>'.
     * @generated
     */
    DeliberateThreat createDeliberateThreat();

    /**
     * Returns a new object of class '<em>Accidental Threat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accidental Threat</em>'.
     * @generated
     */
    AccidentalThreat createAccidentalThreat();

    /**
     * Returns a new object of class '<em>Negative Consequence</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Negative Consequence</em>'.
     * @generated
     */
    NegativeConsequence createNegativeConsequence();

    /**
     * Returns a new object of class '<em>Loss</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loss</em>'.
     * @generated
     */
    Loss createLoss();

    /**
     * Returns a new object of class '<em>Positive Consequence</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Positive Consequence</em>'.
     * @generated
     */
    PositiveConsequence createPositiveConsequence();

    /**
     * Returns a new object of class '<em>Gain Benefit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gain Benefit</em>'.
     * @generated
     */
    GainBenefit createGainBenefit();

    /**
     * Returns a new object of class '<em>Perceived Risk</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Perceived Risk</em>'.
     * @generated
     */
    PerceivedRisk createPerceivedRisk();

    /**
     * Returns a new object of class '<em>Real Risk</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Real Risk</em>'.
     * @generated
     */
    RealRisk createRealRisk();

    /**
     * Returns a new object of class '<em>Privacy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Privacy</em>'.
     * @generated
     */
    Privacy createPrivacy();

    /**
     * Returns a new object of class '<em>Loss Of Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loss Of Control</em>'.
     * @generated
     */
    LossOfControl createLossOfControl();

    /**
     * Returns a new object of class '<em>Advertisement Revenue</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Advertisement Revenue</em>'.
     * @generated
     */
    AdvertisementRevenue createAdvertisementRevenue();

    /**
     * Returns a new object of class '<em>Privacy Violation Incident</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Privacy Violation Incident</em>'.
     * @generated
     */
    PrivacyViolationIncident createPrivacyViolationIncident();

    /**
     * Returns a new object of class '<em>Data Leak</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Leak</em>'.
     * @generated
     */
    DataLeak createDataLeak();

    /**
     * Returns a new object of class '<em>Risk Assessment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Risk Assessment</em>'.
     * @generated
     */
    RiskAssessment createRiskAssessment();

    /**
     * Returns a new object of class '<em>Risk Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Risk Type Package</em>'.
     * @generated
     */
    RiskTypePackage createRiskTypePackage();

    /**
     * Returns a new object of class '<em>Misuse Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Misuse Case</em>'.
     * @generated
     */
    MisuseCase createMisuseCase();

    /**
     * Returns a new object of class '<em>Attack Scenario</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attack Scenario</em>'.
     * @generated
     */
    AttackScenario createAttackScenario();

    /**
     * Returns a new object of class '<em>Special Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Special Equipment</em>'.
     * @generated
     */
    SpecialEquipment createSpecialEquipment();

    /**
     * Returns a new object of class '<em>Threat Scenario Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Threat Scenario Attribute</em>'.
     * @generated
     */
    ThreatScenarioAttribute createThreatScenarioAttribute();

    /**
     * Returns a new object of class '<em>Cost</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cost</em>'.
     * @generated
     */
    Cost createCost();

    /**
     * Returns a new object of class '<em>Skill</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Skill</em>'.
     * @generated
     */
    Skill createSkill();

    /**
     * Returns a new object of class '<em>Physical Damage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Physical Damage</em>'.
     * @generated
     */
    PhysicalDamage createPhysicalDamage();

    /**
     * Returns a new object of class '<em>Economic Damage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Economic Damage</em>'.
     * @generated
     */
    EconomicDamage createEconomicDamage();

    /**
     * Returns a new object of class '<em>Near Miss Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Near Miss Type</em>'.
     * @generated
     */
    NearMissType createNearMissType();

    /**
     * Returns a new object of class '<em>Accident Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accident Type</em>'.
     * @generated
     */
    AccidentType createAccidentType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
