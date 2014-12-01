/**
 */
package risk.type.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import risk.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TypePackage.ASSET: {
                Asset asset = (Asset)theEObject;
                T result = caseAsset(asset);
                if (result == null) result = caseElement(asset);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.THREAT_SCENARIO: {
                ThreatScenario threatScenario = (ThreatScenario)theEObject;
                T result = caseThreatScenario(threatScenario);
                if (result == null) result = caseElement(threatScenario);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.THREAT: {
                Threat threat = (Threat)theEObject;
                T result = caseThreat(threat);
                if (result == null) result = caseElement(threat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.VULNERABILITY: {
                Vulnerability vulnerability = (Vulnerability)theEObject;
                T result = caseVulnerability(vulnerability);
                if (result == null) result = caseElement(vulnerability);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.INCIDENT_TYPE: {
                IncidentType incidentType = (IncidentType)theEObject;
                T result = caseIncidentType(incidentType);
                if (result == null) result = caseElement(incidentType);
                if (result == null) result = caseUndesiredEventType(incidentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.RESPONSE: {
                Response response = (Response)theEObject;
                T result = caseResponse(response);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COUNTERMEASURE: {
                Countermeasure countermeasure = (Countermeasure)theEObject;
                T result = caseCountermeasure(countermeasure);
                if (result == null) result = caseElement(countermeasure);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MONETARY_AMOUNT: {
                MonetaryAmount monetaryAmount = (MonetaryAmount)theEObject;
                T result = caseMonetaryAmount(monetaryAmount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CONSEQUENCE: {
                Consequence consequence = (Consequence)theEObject;
                T result = caseConsequence(consequence);
                if (result == null) result = caseElement(consequence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.REPUTATION: {
                Reputation reputation = (Reputation)theEObject;
                T result = caseReputation(reputation);
                if (result == null) result = caseAsset(reputation);
                if (result == null) result = caseElement(reputation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.STRUCTURAL_ASSET: {
                StructuralAsset structuralAsset = (StructuralAsset)theEObject;
                T result = caseStructuralAsset(structuralAsset);
                if (result == null) result = caseAsset(structuralAsset);
                if (result == null) result = caseElement(structuralAsset);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COMPETITIVE_ADVANTAGE: {
                CompetitiveAdvantage competitiveAdvantage = (CompetitiveAdvantage)theEObject;
                T result = caseCompetitiveAdvantage(competitiveAdvantage);
                if (result == null) result = caseAsset(competitiveAdvantage);
                if (result == null) result = caseElement(competitiveAdvantage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.STAKEHOLDER: {
                Stakeholder stakeholder = (Stakeholder)theEObject;
                T result = caseStakeholder(stakeholder);
                if (result == null) result = caseElement(stakeholder);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_ASSET: {
                DataAsset dataAsset = (DataAsset)theEObject;
                T result = caseDataAsset(dataAsset);
                if (result == null) result = caseAsset(dataAsset);
                if (result == null) result = caseElement(dataAsset);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_ASSET: {
                IdentityAsset identityAsset = (IdentityAsset)theEObject;
                T result = caseIdentityAsset(identityAsset);
                if (result == null) result = caseAsset(identityAsset);
                if (result == null) result = caseElement(identityAsset);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DELIBERATE_THREAT: {
                DeliberateThreat deliberateThreat = (DeliberateThreat)theEObject;
                T result = caseDeliberateThreat(deliberateThreat);
                if (result == null) result = caseThreat(deliberateThreat);
                if (result == null) result = caseElement(deliberateThreat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACCIDENTAL_THREAT: {
                AccidentalThreat accidentalThreat = (AccidentalThreat)theEObject;
                T result = caseAccidentalThreat(accidentalThreat);
                if (result == null) result = caseThreat(accidentalThreat);
                if (result == null) result = caseElement(accidentalThreat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NEGATIVE_CONSEQUENCE: {
                NegativeConsequence negativeConsequence = (NegativeConsequence)theEObject;
                T result = caseNegativeConsequence(negativeConsequence);
                if (result == null) result = caseConsequence(negativeConsequence);
                if (result == null) result = caseElement(negativeConsequence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.LOSS: {
                Loss loss = (Loss)theEObject;
                T result = caseLoss(loss);
                if (result == null) result = caseNegativeConsequence(loss);
                if (result == null) result = caseConsequence(loss);
                if (result == null) result = caseElement(loss);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.POSITIVE_CONSEQUENCE: {
                PositiveConsequence positiveConsequence = (PositiveConsequence)theEObject;
                T result = casePositiveConsequence(positiveConsequence);
                if (result == null) result = caseConsequence(positiveConsequence);
                if (result == null) result = caseElement(positiveConsequence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.GAIN_BENEFIT: {
                GainBenefit gainBenefit = (GainBenefit)theEObject;
                T result = caseGainBenefit(gainBenefit);
                if (result == null) result = casePositiveConsequence(gainBenefit);
                if (result == null) result = caseConsequence(gainBenefit);
                if (result == null) result = caseElement(gainBenefit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PERCEIVED_RISK: {
                PerceivedRisk perceivedRisk = (PerceivedRisk)theEObject;
                T result = casePerceivedRisk(perceivedRisk);
                if (result == null) result = caseRiskAssessment(perceivedRisk);
                if (result == null) result = caseElement(perceivedRisk);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.REAL_RISK: {
                RealRisk realRisk = (RealRisk)theEObject;
                T result = caseRealRisk(realRisk);
                if (result == null) result = caseRiskAssessment(realRisk);
                if (result == null) result = caseElement(realRisk);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PRIVACY: {
                Privacy privacy = (Privacy)theEObject;
                T result = casePrivacy(privacy);
                if (result == null) result = caseAsset(privacy);
                if (result == null) result = caseElement(privacy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.LOSS_OF_CONTROL: {
                LossOfControl lossOfControl = (LossOfControl)theEObject;
                T result = caseLossOfControl(lossOfControl);
                if (result == null) result = caseAsset(lossOfControl);
                if (result == null) result = caseElement(lossOfControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ADVERTISEMENT_REVENUE: {
                AdvertisementRevenue advertisementRevenue = (AdvertisementRevenue)theEObject;
                T result = caseAdvertisementRevenue(advertisementRevenue);
                if (result == null) result = caseAsset(advertisementRevenue);
                if (result == null) result = caseElement(advertisementRevenue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PRIVACY_VIOLATION_INCIDENT: {
                PrivacyViolationIncident privacyViolationIncident = (PrivacyViolationIncident)theEObject;
                T result = casePrivacyViolationIncident(privacyViolationIncident);
                if (result == null) result = caseIncidentType(privacyViolationIncident);
                if (result == null) result = caseElement(privacyViolationIncident);
                if (result == null) result = caseUndesiredEventType(privacyViolationIncident);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_LEAK: {
                DataLeak dataLeak = (DataLeak)theEObject;
                T result = caseDataLeak(dataLeak);
                if (result == null) result = caseIncidentType(dataLeak);
                if (result == null) result = caseElement(dataLeak);
                if (result == null) result = caseUndesiredEventType(dataLeak);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.RISK_ASSESSMENT: {
                RiskAssessment riskAssessment = (RiskAssessment)theEObject;
                T result = caseRiskAssessment(riskAssessment);
                if (result == null) result = caseElement(riskAssessment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.RISK_TYPE_PACKAGE: {
                RiskTypePackage riskTypePackage = (RiskTypePackage)theEObject;
                T result = caseRiskTypePackage(riskTypePackage);
                if (result == null) result = caseElement(riskTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MISUSE_CASE: {
                MisuseCase misuseCase = (MisuseCase)theEObject;
                T result = caseMisuseCase(misuseCase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ATTACK_SCENARIO: {
                AttackScenario attackScenario = (AttackScenario)theEObject;
                T result = caseAttackScenario(attackScenario);
                if (result == null) result = caseThreatScenario(attackScenario);
                if (result == null) result = caseElement(attackScenario);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.SPECIAL_EQUIPMENT: {
                SpecialEquipment specialEquipment = (SpecialEquipment)theEObject;
                T result = caseSpecialEquipment(specialEquipment);
                if (result == null) result = caseThreatScenarioAttribute(specialEquipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE: {
                ThreatScenarioAttribute threatScenarioAttribute = (ThreatScenarioAttribute)theEObject;
                T result = caseThreatScenarioAttribute(threatScenarioAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COST: {
                Cost cost = (Cost)theEObject;
                T result = caseCost(cost);
                if (result == null) result = caseThreatScenarioAttribute(cost);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.SKILL: {
                Skill skill = (Skill)theEObject;
                T result = caseSkill(skill);
                if (result == null) result = caseThreatScenarioAttribute(skill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PHYSICAL_DAMAGE: {
                PhysicalDamage physicalDamage = (PhysicalDamage)theEObject;
                T result = casePhysicalDamage(physicalDamage);
                if (result == null) result = caseNegativeConsequence(physicalDamage);
                if (result == null) result = caseConsequence(physicalDamage);
                if (result == null) result = caseElement(physicalDamage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ECONOMIC_DAMAGE: {
                EconomicDamage economicDamage = (EconomicDamage)theEObject;
                T result = caseEconomicDamage(economicDamage);
                if (result == null) result = caseNegativeConsequence(economicDamage);
                if (result == null) result = caseConsequence(economicDamage);
                if (result == null) result = caseElement(economicDamage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NEAR_MISS_TYPE: {
                NearMissType nearMissType = (NearMissType)theEObject;
                T result = caseNearMissType(nearMissType);
                if (result == null) result = caseUndesiredEventType(nearMissType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACCIDENT_TYPE: {
                AccidentType accidentType = (AccidentType)theEObject;
                T result = caseAccidentType(accidentType);
                if (result == null) result = caseUndesiredEventType(accidentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.UNDESIRED_EVENT_TYPE: {
                UndesiredEventType undesiredEventType = (UndesiredEventType)theEObject;
                T result = caseUndesiredEventType(undesiredEventType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsset(Asset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Threat Scenario</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Threat Scenario</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThreatScenario(ThreatScenario object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThreat(Threat object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVulnerability(Vulnerability object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Incident Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Incident Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIncidentType(IncidentType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Response</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResponse(Response object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Countermeasure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Countermeasure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCountermeasure(Countermeasure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monetary Amount</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monetary Amount</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonetaryAmount(MonetaryAmount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consequence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConsequence(Consequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reputation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reputation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReputation(Reputation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structural Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structural Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructuralAsset(StructuralAsset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Competitive Advantage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Competitive Advantage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompetitiveAdvantage(CompetitiveAdvantage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStakeholder(Stakeholder object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataAsset(DataAsset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityAsset(IdentityAsset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deliberate Threat</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deliberate Threat</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeliberateThreat(DeliberateThreat object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accidental Threat</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accidental Threat</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccidentalThreat(AccidentalThreat object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Negative Consequence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Negative Consequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNegativeConsequence(NegativeConsequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loss</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loss</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoss(Loss object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Positive Consequence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Positive Consequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePositiveConsequence(PositiveConsequence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gain Benefit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gain Benefit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGainBenefit(GainBenefit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Perceived Risk</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Perceived Risk</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerceivedRisk(PerceivedRisk object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Real Risk</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Real Risk</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRealRisk(RealRisk object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Privacy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Privacy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivacy(Privacy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loss Of Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loss Of Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLossOfControl(LossOfControl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Advertisement Revenue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Advertisement Revenue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdvertisementRevenue(AdvertisementRevenue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Privacy Violation Incident</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Privacy Violation Incident</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivacyViolationIncident(PrivacyViolationIncident object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Leak</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Leak</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataLeak(DataLeak object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRiskAssessment(RiskAssessment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Risk Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Risk Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRiskTypePackage(RiskTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Misuse Case</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Misuse Case</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMisuseCase(MisuseCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attack Scenario</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attack Scenario</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttackScenario(AttackScenario object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Special Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Special Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpecialEquipment(SpecialEquipment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Threat Scenario Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Threat Scenario Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThreatScenarioAttribute(ThreatScenarioAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCost(Cost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSkill(Skill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Damage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Damage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalDamage(PhysicalDamage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Economic Damage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Economic Damage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEconomicDamage(EconomicDamage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Near Miss Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Near Miss Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNearMissType(NearMissType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accident Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accident Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccidentType(AccidentType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Undesired Event Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Undesired Event Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUndesiredEventType(UndesiredEventType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //TypeSwitch
