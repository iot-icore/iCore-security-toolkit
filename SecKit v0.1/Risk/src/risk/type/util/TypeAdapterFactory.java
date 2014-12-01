/**
 */
package risk.type.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import risk.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseAsset(Asset object) {
                return createAssetAdapter();
            }
            @Override
            public Adapter caseThreatScenario(ThreatScenario object) {
                return createThreatScenarioAdapter();
            }
            @Override
            public Adapter caseThreat(Threat object) {
                return createThreatAdapter();
            }
            @Override
            public Adapter caseVulnerability(Vulnerability object) {
                return createVulnerabilityAdapter();
            }
            @Override
            public Adapter caseIncidentType(IncidentType object) {
                return createIncidentTypeAdapter();
            }
            @Override
            public Adapter caseResponse(Response object) {
                return createResponseAdapter();
            }
            @Override
            public Adapter caseCountermeasure(Countermeasure object) {
                return createCountermeasureAdapter();
            }
            @Override
            public Adapter caseMonetaryAmount(MonetaryAmount object) {
                return createMonetaryAmountAdapter();
            }
            @Override
            public Adapter caseConsequence(Consequence object) {
                return createConsequenceAdapter();
            }
            @Override
            public Adapter caseReputation(Reputation object) {
                return createReputationAdapter();
            }
            @Override
            public Adapter caseStructuralAsset(StructuralAsset object) {
                return createStructuralAssetAdapter();
            }
            @Override
            public Adapter caseCompetitiveAdvantage(CompetitiveAdvantage object) {
                return createCompetitiveAdvantageAdapter();
            }
            @Override
            public Adapter caseStakeholder(Stakeholder object) {
                return createStakeholderAdapter();
            }
            @Override
            public Adapter caseDataAsset(DataAsset object) {
                return createDataAssetAdapter();
            }
            @Override
            public Adapter caseIdentityAsset(IdentityAsset object) {
                return createIdentityAssetAdapter();
            }
            @Override
            public Adapter caseDeliberateThreat(DeliberateThreat object) {
                return createDeliberateThreatAdapter();
            }
            @Override
            public Adapter caseAccidentalThreat(AccidentalThreat object) {
                return createAccidentalThreatAdapter();
            }
            @Override
            public Adapter caseNegativeConsequence(NegativeConsequence object) {
                return createNegativeConsequenceAdapter();
            }
            @Override
            public Adapter caseLoss(Loss object) {
                return createLossAdapter();
            }
            @Override
            public Adapter casePositiveConsequence(PositiveConsequence object) {
                return createPositiveConsequenceAdapter();
            }
            @Override
            public Adapter caseGainBenefit(GainBenefit object) {
                return createGainBenefitAdapter();
            }
            @Override
            public Adapter casePerceivedRisk(PerceivedRisk object) {
                return createPerceivedRiskAdapter();
            }
            @Override
            public Adapter caseRealRisk(RealRisk object) {
                return createRealRiskAdapter();
            }
            @Override
            public Adapter casePrivacy(Privacy object) {
                return createPrivacyAdapter();
            }
            @Override
            public Adapter caseLossOfControl(LossOfControl object) {
                return createLossOfControlAdapter();
            }
            @Override
            public Adapter caseAdvertisementRevenue(AdvertisementRevenue object) {
                return createAdvertisementRevenueAdapter();
            }
            @Override
            public Adapter casePrivacyViolationIncident(PrivacyViolationIncident object) {
                return createPrivacyViolationIncidentAdapter();
            }
            @Override
            public Adapter caseDataLeak(DataLeak object) {
                return createDataLeakAdapter();
            }
            @Override
            public Adapter caseRiskAssessment(RiskAssessment object) {
                return createRiskAssessmentAdapter();
            }
            @Override
            public Adapter caseRiskTypePackage(RiskTypePackage object) {
                return createRiskTypePackageAdapter();
            }
            @Override
            public Adapter caseMisuseCase(MisuseCase object) {
                return createMisuseCaseAdapter();
            }
            @Override
            public Adapter caseAttackScenario(AttackScenario object) {
                return createAttackScenarioAdapter();
            }
            @Override
            public Adapter caseSpecialEquipment(SpecialEquipment object) {
                return createSpecialEquipmentAdapter();
            }
            @Override
            public Adapter caseThreatScenarioAttribute(ThreatScenarioAttribute object) {
                return createThreatScenarioAttributeAdapter();
            }
            @Override
            public Adapter caseCost(Cost object) {
                return createCostAdapter();
            }
            @Override
            public Adapter caseSkill(Skill object) {
                return createSkillAdapter();
            }
            @Override
            public Adapter casePhysicalDamage(PhysicalDamage object) {
                return createPhysicalDamageAdapter();
            }
            @Override
            public Adapter caseEconomicDamage(EconomicDamage object) {
                return createEconomicDamageAdapter();
            }
            @Override
            public Adapter caseNearMissType(NearMissType object) {
                return createNearMissTypeAdapter();
            }
            @Override
            public Adapter caseAccidentType(AccidentType object) {
                return createAccidentTypeAdapter();
            }
            @Override
            public Adapter caseUndesiredEventType(UndesiredEventType object) {
                return createUndesiredEventTypeAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link risk.type.Asset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Asset
     * @generated
     */
    public Adapter createAssetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.ThreatScenario <em>Threat Scenario</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.ThreatScenario
     * @generated
     */
    public Adapter createThreatScenarioAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Threat <em>Threat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Threat
     * @generated
     */
    public Adapter createThreatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Vulnerability <em>Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Vulnerability
     * @generated
     */
    public Adapter createVulnerabilityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.IncidentType <em>Incident Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.IncidentType
     * @generated
     */
    public Adapter createIncidentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Response <em>Response</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Response
     * @generated
     */
    public Adapter createResponseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Countermeasure <em>Countermeasure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Countermeasure
     * @generated
     */
    public Adapter createCountermeasureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.MonetaryAmount <em>Monetary Amount</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.MonetaryAmount
     * @generated
     */
    public Adapter createMonetaryAmountAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Consequence <em>Consequence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Consequence
     * @generated
     */
    public Adapter createConsequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Reputation <em>Reputation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Reputation
     * @generated
     */
    public Adapter createReputationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.StructuralAsset <em>Structural Asset</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.StructuralAsset
     * @generated
     */
    public Adapter createStructuralAssetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.CompetitiveAdvantage <em>Competitive Advantage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.CompetitiveAdvantage
     * @generated
     */
    public Adapter createCompetitiveAdvantageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Stakeholder <em>Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Stakeholder
     * @generated
     */
    public Adapter createStakeholderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.DataAsset <em>Data Asset</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.DataAsset
     * @generated
     */
    public Adapter createDataAssetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.IdentityAsset <em>Identity Asset</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.IdentityAsset
     * @generated
     */
    public Adapter createIdentityAssetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.DeliberateThreat <em>Deliberate Threat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.DeliberateThreat
     * @generated
     */
    public Adapter createDeliberateThreatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.AccidentalThreat <em>Accidental Threat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.AccidentalThreat
     * @generated
     */
    public Adapter createAccidentalThreatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.NegativeConsequence <em>Negative Consequence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.NegativeConsequence
     * @generated
     */
    public Adapter createNegativeConsequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Loss <em>Loss</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Loss
     * @generated
     */
    public Adapter createLossAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.PositiveConsequence <em>Positive Consequence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.PositiveConsequence
     * @generated
     */
    public Adapter createPositiveConsequenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.GainBenefit <em>Gain Benefit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.GainBenefit
     * @generated
     */
    public Adapter createGainBenefitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.PerceivedRisk <em>Perceived Risk</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.PerceivedRisk
     * @generated
     */
    public Adapter createPerceivedRiskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.RealRisk <em>Real Risk</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.RealRisk
     * @generated
     */
    public Adapter createRealRiskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Privacy <em>Privacy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Privacy
     * @generated
     */
    public Adapter createPrivacyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.LossOfControl <em>Loss Of Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.LossOfControl
     * @generated
     */
    public Adapter createLossOfControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.AdvertisementRevenue <em>Advertisement Revenue</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.AdvertisementRevenue
     * @generated
     */
    public Adapter createAdvertisementRevenueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.PrivacyViolationIncident <em>Privacy Violation Incident</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.PrivacyViolationIncident
     * @generated
     */
    public Adapter createPrivacyViolationIncidentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.DataLeak <em>Data Leak</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.DataLeak
     * @generated
     */
    public Adapter createDataLeakAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.RiskAssessment <em>Risk Assessment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.RiskAssessment
     * @generated
     */
    public Adapter createRiskAssessmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.RiskTypePackage <em>Risk Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.RiskTypePackage
     * @generated
     */
    public Adapter createRiskTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.MisuseCase <em>Misuse Case</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.MisuseCase
     * @generated
     */
    public Adapter createMisuseCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.AttackScenario <em>Attack Scenario</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.AttackScenario
     * @generated
     */
    public Adapter createAttackScenarioAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.SpecialEquipment <em>Special Equipment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.SpecialEquipment
     * @generated
     */
    public Adapter createSpecialEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.ThreatScenarioAttribute <em>Threat Scenario Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.ThreatScenarioAttribute
     * @generated
     */
    public Adapter createThreatScenarioAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Cost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Cost
     * @generated
     */
    public Adapter createCostAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.Skill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.Skill
     * @generated
     */
    public Adapter createSkillAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.PhysicalDamage <em>Physical Damage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.PhysicalDamage
     * @generated
     */
    public Adapter createPhysicalDamageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.EconomicDamage <em>Economic Damage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.EconomicDamage
     * @generated
     */
    public Adapter createEconomicDamageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.NearMissType <em>Near Miss Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.NearMissType
     * @generated
     */
    public Adapter createNearMissTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.AccidentType <em>Accident Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.AccidentType
     * @generated
     */
    public Adapter createAccidentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link risk.type.UndesiredEventType <em>Undesired Event Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see risk.type.UndesiredEventType
     * @generated
     */
    public Adapter createUndesiredEventTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeAdapterFactory
