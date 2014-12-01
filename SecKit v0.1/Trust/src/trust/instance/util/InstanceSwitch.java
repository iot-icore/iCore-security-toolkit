/**
 */
package trust.instance.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.condition.Atom;
import rule.condition.Operator;

import trust.instance.*;

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
 * @see trust.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InstancePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceSwitch() {
    if (modelPackage == null) {
      modelPackage = InstancePackage.eINSTANCE;
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
      case InstancePackage.DIRECT_TRUST: {
        DirectTrust directTrust = (DirectTrust)theEObject;
        T result = caseDirectTrust(directTrust);
        if (result == null) result = caseTrustRelationship(directTrust);
        if (result == null) result = caseElement(directTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.INDIRECT_TRUST: {
        IndirectTrust indirectTrust = (IndirectTrust)theEObject;
        T result = caseIndirectTrust(indirectTrust);
        if (result == null) result = caseTrustRelationship(indirectTrust);
        if (result == null) result = caseElement(indirectTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.ARBITRARY_TRUST: {
        ArbitraryTrust arbitraryTrust = (ArbitraryTrust)theEObject;
        T result = caseArbitraryTrust(arbitraryTrust);
        if (result == null) result = caseDirectTrust(arbitraryTrust);
        if (result == null) result = caseTrustRelationship(arbitraryTrust);
        if (result == null) result = caseElement(arbitraryTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.EXPERIENCE_TRUST: {
        ExperienceTrust experienceTrust = (ExperienceTrust)theEObject;
        T result = caseExperienceTrust(experienceTrust);
        if (result == null) result = caseDirectTrust(experienceTrust);
        if (result == null) result = caseTrustRelationship(experienceTrust);
        if (result == null) result = caseElement(experienceTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.EVIDENCE: {
        Evidence evidence = (Evidence)theEObject;
        T result = caseEvidence(evidence);
        if (result == null) result = caseElement(evidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.BELIEF_EVIDENCE: {
        BeliefEvidence beliefEvidence = (BeliefEvidence)theEObject;
        T result = caseBeliefEvidence(beliefEvidence);
        if (result == null) result = caseEvidence(beliefEvidence);
        if (result == null) result = caseElement(beliefEvidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.DISBELIEF_EVIDENCE: {
        DisbeliefEvidence disbeliefEvidence = (DisbeliefEvidence)theEObject;
        T result = caseDisbeliefEvidence(disbeliefEvidence);
        if (result == null) result = caseEvidence(disbeliefEvidence);
        if (result == null) result = caseElement(disbeliefEvidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_RELATIONSHIP: {
        TrustRelationship trustRelationship = (TrustRelationship)theEObject;
        T result = caseTrustRelationship(trustRelationship);
        if (result == null) result = caseElement(trustRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.DISPOSITIONAL_TRUST: {
        DispositionalTrust dispositionalTrust = (DispositionalTrust)theEObject;
        T result = caseDispositionalTrust(dispositionalTrust);
        if (result == null) result = caseTrusteeScope(dispositionalTrust);
        if (result == null) result = caseElement(dispositionalTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.SYSTEM_TRUST: {
        SystemTrust systemTrust = (SystemTrust)theEObject;
        T result = caseSystemTrust(systemTrust);
        if (result == null) result = caseTrusteeScope(systemTrust);
        if (result == null) result = caseElement(systemTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.SITUATIONAL_TRUST: {
        SituationalTrust situationalTrust = (SituationalTrust)theEObject;
        T result = caseSituationalTrust(situationalTrust);
        if (result == null) result = caseTrusteeScope(situationalTrust);
        if (result == null) result = caseElement(situationalTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_ASPECT: {
        TrustAspect trustAspect = (TrustAspect)theEObject;
        T result = caseTrustAspect(trustAspect);
        if (result == null) result = caseElement(trustAspect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.ESTABLISH_VALUE: {
        EstablishValue establishValue = (EstablishValue)theEObject;
        T result = caseEstablishValue(establishValue);
        if (result == null) result = caseTrustAspect(establishValue);
        if (result == null) result = caseElement(establishValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.RECOMMENDATION_QUALITY: {
        RecommendationQuality recommendationQuality = (RecommendationQuality)theEObject;
        T result = caseRecommendationQuality(recommendationQuality);
        if (result == null) result = caseTrustAspect(recommendationQuality);
        if (result == null) result = caseElement(recommendationQuality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.PERSONAL_TRUST: {
        PersonalTrust personalTrust = (PersonalTrust)theEObject;
        T result = casePersonalTrust(personalTrust);
        if (result == null) result = caseSituationalTrust(personalTrust);
        if (result == null) result = caseTrusteeScope(personalTrust);
        if (result == null) result = caseElement(personalTrust);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_RECOMMENDATION: {
        TrustRecommendation trustRecommendation = (TrustRecommendation)theEObject;
        T result = caseTrustRecommendation(trustRecommendation);
        if (result == null) result = caseElement(trustRecommendation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.SUBJECTIVE_LIKELIHOOD: {
        SubjectiveLikelihood subjectiveLikelihood = (SubjectiveLikelihood)theEObject;
        T result = caseSubjectiveLikelihood(subjectiveLikelihood);
        if (result == null) result = caseLikelihoodMeasurement(subjectiveLikelihood);
        if (result == null) result = caseElement(subjectiveLikelihood);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.LIKELIHOOD_MEASUREMENT: {
        LikelihoodMeasurement likelihoodMeasurement = (LikelihoodMeasurement)theEObject;
        T result = caseLikelihoodMeasurement(likelihoodMeasurement);
        if (result == null) result = caseElement(likelihoodMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUSTEE_SCOPE: {
        TrusteeScope trusteeScope = (TrusteeScope)theEObject;
        T result = caseTrusteeScope(trusteeScope);
        if (result == null) result = caseElement(trusteeScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.GOAL: {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.REQUIREMENT: {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_REQUIREMENT: {
        TrustRequirement trustRequirement = (TrustRequirement)theEObject;
        T result = caseTrustRequirement(trustRequirement);
        if (result == null) result = caseRequirement(trustRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.CONTEXT_PROVISIONING: {
        ContextProvisioning contextProvisioning = (ContextProvisioning)theEObject;
        T result = caseContextProvisioning(contextProvisioning);
        if (result == null) result = caseDataQuality(contextProvisioning);
        if (result == null) result = caseTrustAspect(contextProvisioning);
        if (result == null) result = caseElement(contextProvisioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING: {
        ContextSituationEventsProvisioning contextSituationEventsProvisioning = (ContextSituationEventsProvisioning)theEObject;
        T result = caseContextSituationEventsProvisioning(contextSituationEventsProvisioning);
        if (result == null) result = caseDataQuality(contextSituationEventsProvisioning);
        if (result == null) result = caseTrustAspect(contextSituationEventsProvisioning);
        if (result == null) result = caseElement(contextSituationEventsProvisioning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.INTRINSIC_BEHAVIOR: {
        IntrinsicBehavior intrinsicBehavior = (IntrinsicBehavior)theEObject;
        T result = caseIntrinsicBehavior(intrinsicBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.OBSERVABLE_BEHAVIOR: {
        ObservableBehavior observableBehavior = (ObservableBehavior)theEObject;
        T result = caseObservableBehavior(observableBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.DATA_QUALITY: {
        DataQuality dataQuality = (DataQuality)theEObject;
        T result = caseDataQuality(dataQuality);
        if (result == null) result = caseTrustAspect(dataQuality);
        if (result == null) result = caseElement(dataQuality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.IDENTITY_QUALITY: {
        IdentityQuality identityQuality = (IdentityQuality)theEObject;
        T result = caseIdentityQuality(identityQuality);
        if (result == null) result = caseDataQuality(identityQuality);
        if (result == null) result = caseTrustAspect(identityQuality);
        if (result == null) result = caseElement(identityQuality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.ECLASS0: {
        EClass0 eClass0 = (EClass0)theEObject;
        T result = caseEClass0(eClass0);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_FUSION_OPERATOR: {
        TrustFusionOperator trustFusionOperator = (TrustFusionOperator)theEObject;
        T result = caseTrustFusionOperator(trustFusionOperator);
        if (result == null) result = caseTrustOperator(trustFusionOperator);
        if (result == null) result = caseElement(trustFusionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.SUBJECTIVE_LOGIC_CONSENSUS: {
        SubjectiveLogicConsensus subjectiveLogicConsensus = (SubjectiveLogicConsensus)theEObject;
        T result = caseSubjectiveLogicConsensus(subjectiveLogicConsensus);
        if (result == null) result = caseTrustFusionOperator(subjectiveLogicConsensus);
        if (result == null) result = caseTrustOperator(subjectiveLogicConsensus);
        if (result == null) result = caseElement(subjectiveLogicConsensus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.WEIGHTED_CONSENSUS: {
        WeightedConsensus weightedConsensus = (WeightedConsensus)theEObject;
        T result = caseWeightedConsensus(weightedConsensus);
        if (result == null) result = caseTrustFusionOperator(weightedConsensus);
        if (result == null) result = caseTrustOperator(weightedConsensus);
        if (result == null) result = caseElement(weightedConsensus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.LEVEL_OF_ASSURANCE: {
        LevelOfAssurance levelOfAssurance = (LevelOfAssurance)theEObject;
        T result = caseLevelOfAssurance(levelOfAssurance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.ECLASS1: {
        EClass1 eClass1 = (EClass1)theEObject;
        T result = caseEClass1(eClass1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_OPERATOR: {
        TrustOperator trustOperator = (TrustOperator)theEObject;
        T result = caseTrustOperator(trustOperator);
        if (result == null) result = caseElement(trustOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR: {
        TrustAssessmentOperator trustAssessmentOperator = (TrustAssessmentOperator)theEObject;
        T result = caseTrustAssessmentOperator(trustAssessmentOperator);
        if (result == null) result = caseTrustOperator(trustAssessmentOperator);
        if (result == null) result = caseOperator(trustAssessmentOperator);
        if (result == null) result = caseAtom(trustAssessmentOperator);
        if (result == null) result = caseElement(trustAssessmentOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.AT_LEAST: {
        AtLeast atLeast = (AtLeast)theEObject;
        T result = caseAtLeast(atLeast);
        if (result == null) result = caseTrustAssessmentOperator(atLeast);
        if (result == null) result = caseTrustOperator(atLeast);
        if (result == null) result = caseOperator(atLeast);
        if (result == null) result = caseAtom(atLeast);
        if (result == null) result = caseElement(atLeast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.AT_MOST: {
        AtMost atMost = (AtMost)theEObject;
        T result = caseAtMost(atMost);
        if (result == null) result = caseTrustAssessmentOperator(atMost);
        if (result == null) result = caseTrustOperator(atMost);
        if (result == null) result = caseOperator(atMost);
        if (result == null) result = caseAtom(atMost);
        if (result == null) result = caseElement(atMost);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case InstancePackage.EXACTLY: {
        Exactly exactly = (Exactly)theEObject;
        T result = caseExactly(exactly);
        if (result == null) result = caseTrustAssessmentOperator(exactly);
        if (result == null) result = caseTrustOperator(exactly);
        if (result == null) result = caseOperator(exactly);
        if (result == null) result = caseAtom(exactly);
        if (result == null) result = caseElement(exactly);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectTrust(DirectTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indirect Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indirect Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndirectTrust(IndirectTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arbitrary Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arbitrary Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArbitraryTrust(ArbitraryTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experience Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experience Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperienceTrust(ExperienceTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvidence(Evidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belief Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belief Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeliefEvidence(BeliefEvidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disbelief Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disbelief Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisbeliefEvidence(DisbeliefEvidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustRelationship(TrustRelationship object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dispositional Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dispositional Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDispositionalTrust(DispositionalTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemTrust(SystemTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Situational Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Situational Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSituationalTrust(SituationalTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Aspect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Aspect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustAspect(TrustAspect object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Establish Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Establish Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstablishValue(EstablishValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recommendation Quality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recommendation Quality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecommendationQuality(RecommendationQuality object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personal Trust</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal Trust</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonalTrust(PersonalTrust object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Recommendation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Recommendation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustRecommendation(TrustRecommendation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subjective Likelihood</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subjective Likelihood</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectiveLikelihood(SubjectiveLikelihood object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Likelihood Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Likelihood Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLikelihoodMeasurement(LikelihoodMeasurement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trustee Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trustee Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrusteeScope(TrusteeScope object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustRequirement(TrustRequirement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Provisioning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Provisioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextProvisioning(ContextProvisioning object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Situation Events Provisioning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Situation Events Provisioning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextSituationEventsProvisioning(ContextSituationEventsProvisioning object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intrinsic Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intrinsic Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntrinsicBehavior(IntrinsicBehavior object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observable Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observable Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservableBehavior(ObservableBehavior object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Quality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Quality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataQuality(DataQuality object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identity Quality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identity Quality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentityQuality(IdentityQuality object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass0</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass0</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClass0(EClass0 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Fusion Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Fusion Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustFusionOperator(TrustFusionOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subjective Logic Consensus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subjective Logic Consensus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectiveLogicConsensus(SubjectiveLogicConsensus object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weighted Consensus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weighted Consensus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeightedConsensus(WeightedConsensus object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Level Of Assurance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Level Of Assurance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLevelOfAssurance(LevelOfAssurance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClass1(EClass1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustOperator(TrustOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Assessment Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Assessment Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustAssessmentOperator(TrustAssessmentOperator object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Least</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Least</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtLeast(AtLeast object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Most</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Most</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtMost(AtMost object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exactly</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exactly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactly(Exactly object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object) {
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

} //InstanceSwitch
