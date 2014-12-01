/**
 */
package trust.instance.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.condition.Atom;
import rule.condition.Operator;

import trust.instance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InstancePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = InstancePackage.eINSTANCE;
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
  protected InstanceSwitch<Adapter> modelSwitch =
    new InstanceSwitch<Adapter>() {
      @Override
      public Adapter caseDirectTrust(DirectTrust object) {
        return createDirectTrustAdapter();
      }
      @Override
      public Adapter caseIndirectTrust(IndirectTrust object) {
        return createIndirectTrustAdapter();
      }
      @Override
      public Adapter caseArbitraryTrust(ArbitraryTrust object) {
        return createArbitraryTrustAdapter();
      }
      @Override
      public Adapter caseExperienceTrust(ExperienceTrust object) {
        return createExperienceTrustAdapter();
      }
      @Override
      public Adapter caseEvidence(Evidence object) {
        return createEvidenceAdapter();
      }
      @Override
      public Adapter caseBeliefEvidence(BeliefEvidence object) {
        return createBeliefEvidenceAdapter();
      }
      @Override
      public Adapter caseDisbeliefEvidence(DisbeliefEvidence object) {
        return createDisbeliefEvidenceAdapter();
      }
      @Override
      public Adapter caseTrustRelationship(TrustRelationship object) {
        return createTrustRelationshipAdapter();
      }
      @Override
      public Adapter caseDispositionalTrust(DispositionalTrust object) {
        return createDispositionalTrustAdapter();
      }
      @Override
      public Adapter caseSystemTrust(SystemTrust object) {
        return createSystemTrustAdapter();
      }
      @Override
      public Adapter caseSituationalTrust(SituationalTrust object) {
        return createSituationalTrustAdapter();
      }
      @Override
      public Adapter caseTrustAspect(TrustAspect object) {
        return createTrustAspectAdapter();
      }
      @Override
      public Adapter caseEstablishValue(EstablishValue object) {
        return createEstablishValueAdapter();
      }
      @Override
      public Adapter caseRecommendationQuality(RecommendationQuality object) {
        return createRecommendationQualityAdapter();
      }
      @Override
      public Adapter casePersonalTrust(PersonalTrust object) {
        return createPersonalTrustAdapter();
      }
      @Override
      public Adapter caseTrustRecommendation(TrustRecommendation object) {
        return createTrustRecommendationAdapter();
      }
      @Override
      public Adapter caseSubjectiveLikelihood(SubjectiveLikelihood object) {
        return createSubjectiveLikelihoodAdapter();
      }
      @Override
      public Adapter caseLikelihoodMeasurement(LikelihoodMeasurement object) {
        return createLikelihoodMeasurementAdapter();
      }
      @Override
      public Adapter caseTrusteeScope(TrusteeScope object) {
        return createTrusteeScopeAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object) {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object) {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseTrustRequirement(TrustRequirement object) {
        return createTrustRequirementAdapter();
      }
      @Override
      public Adapter caseContextProvisioning(ContextProvisioning object) {
        return createContextProvisioningAdapter();
      }
      @Override
      public Adapter caseContextSituationEventsProvisioning(ContextSituationEventsProvisioning object) {
        return createContextSituationEventsProvisioningAdapter();
      }
      @Override
      public Adapter caseIntrinsicBehavior(IntrinsicBehavior object) {
        return createIntrinsicBehaviorAdapter();
      }
      @Override
      public Adapter caseObservableBehavior(ObservableBehavior object) {
        return createObservableBehaviorAdapter();
      }
      @Override
      public Adapter caseDataQuality(DataQuality object) {
        return createDataQualityAdapter();
      }
      @Override
      public Adapter caseIdentityQuality(IdentityQuality object) {
        return createIdentityQualityAdapter();
      }
      @Override
      public Adapter caseEClass0(EClass0 object) {
        return createEClass0Adapter();
      }
      @Override
      public Adapter caseTrustFusionOperator(TrustFusionOperator object) {
        return createTrustFusionOperatorAdapter();
      }
      @Override
      public Adapter caseSubjectiveLogicConsensus(SubjectiveLogicConsensus object) {
        return createSubjectiveLogicConsensusAdapter();
      }
      @Override
      public Adapter caseWeightedConsensus(WeightedConsensus object) {
        return createWeightedConsensusAdapter();
      }
      @Override
      public Adapter caseLevelOfAssurance(LevelOfAssurance object) {
        return createLevelOfAssuranceAdapter();
      }
      @Override
      public Adapter caseEClass1(EClass1 object) {
        return createEClass1Adapter();
      }
      @Override
      public Adapter caseTrustOperator(TrustOperator object) {
        return createTrustOperatorAdapter();
      }
      @Override
      public Adapter caseTrustAssessmentOperator(TrustAssessmentOperator object) {
        return createTrustAssessmentOperatorAdapter();
      }
      @Override
      public Adapter caseAtLeast(AtLeast object) {
        return createAtLeastAdapter();
      }
      @Override
      public Adapter caseAtMost(AtMost object) {
        return createAtMostAdapter();
      }
      @Override
      public Adapter caseExactly(Exactly object) {
        return createExactlyAdapter();
      }
      @Override
      public Adapter caseElement(Element object) {
        return createElementAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object) {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object) {
        return createOperatorAdapter();
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
   * Creates a new adapter for an object of class '{@link trust.instance.DirectTrust <em>Direct Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.DirectTrust
   * @generated
   */
  public Adapter createDirectTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.IndirectTrust <em>Indirect Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.IndirectTrust
   * @generated
   */
  public Adapter createIndirectTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.ArbitraryTrust <em>Arbitrary Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.ArbitraryTrust
   * @generated
   */
  public Adapter createArbitraryTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.ExperienceTrust <em>Experience Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.ExperienceTrust
   * @generated
   */
  public Adapter createExperienceTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.Evidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.Evidence
   * @generated
   */
  public Adapter createEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.BeliefEvidence <em>Belief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.BeliefEvidence
   * @generated
   */
  public Adapter createBeliefEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.DisbeliefEvidence <em>Disbelief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.DisbeliefEvidence
   * @generated
   */
  public Adapter createDisbeliefEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustRelationship <em>Trust Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustRelationship
   * @generated
   */
  public Adapter createTrustRelationshipAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.DispositionalTrust <em>Dispositional Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.DispositionalTrust
   * @generated
   */
  public Adapter createDispositionalTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.SystemTrust <em>System Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.SystemTrust
   * @generated
   */
  public Adapter createSystemTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.SituationalTrust <em>Situational Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.SituationalTrust
   * @generated
   */
  public Adapter createSituationalTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustAspect <em>Trust Aspect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustAspect
   * @generated
   */
  public Adapter createTrustAspectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.EstablishValue <em>Establish Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.EstablishValue
   * @generated
   */
  public Adapter createEstablishValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.RecommendationQuality <em>Recommendation Quality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.RecommendationQuality
   * @generated
   */
  public Adapter createRecommendationQualityAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.PersonalTrust <em>Personal Trust</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.PersonalTrust
   * @generated
   */
  public Adapter createPersonalTrustAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustRecommendation <em>Trust Recommendation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustRecommendation
   * @generated
   */
  public Adapter createTrustRecommendationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.SubjectiveLikelihood <em>Subjective Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.SubjectiveLikelihood
   * @generated
   */
  public Adapter createSubjectiveLikelihoodAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.LikelihoodMeasurement <em>Likelihood Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.LikelihoodMeasurement
   * @generated
   */
  public Adapter createLikelihoodMeasurementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrusteeScope <em>Trustee Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrusteeScope
   * @generated
   */
  public Adapter createTrusteeScopeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.Goal
   * @generated
   */
  public Adapter createGoalAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustRequirement <em>Trust Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustRequirement
   * @generated
   */
  public Adapter createTrustRequirementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.ContextProvisioning <em>Context Provisioning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.ContextProvisioning
   * @generated
   */
  public Adapter createContextProvisioningAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.ContextSituationEventsProvisioning <em>Context Situation Events Provisioning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.ContextSituationEventsProvisioning
   * @generated
   */
  public Adapter createContextSituationEventsProvisioningAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.IntrinsicBehavior <em>Intrinsic Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.IntrinsicBehavior
   * @generated
   */
  public Adapter createIntrinsicBehaviorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.ObservableBehavior <em>Observable Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.ObservableBehavior
   * @generated
   */
  public Adapter createObservableBehaviorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.DataQuality <em>Data Quality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.DataQuality
   * @generated
   */
  public Adapter createDataQualityAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.IdentityQuality <em>Identity Quality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.IdentityQuality
   * @generated
   */
  public Adapter createIdentityQualityAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.EClass0 <em>EClass0</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.EClass0
   * @generated
   */
  public Adapter createEClass0Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustFusionOperator <em>Trust Fusion Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustFusionOperator
   * @generated
   */
  public Adapter createTrustFusionOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.SubjectiveLogicConsensus <em>Subjective Logic Consensus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.SubjectiveLogicConsensus
   * @generated
   */
  public Adapter createSubjectiveLogicConsensusAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.WeightedConsensus <em>Weighted Consensus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.WeightedConsensus
   * @generated
   */
  public Adapter createWeightedConsensusAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.LevelOfAssurance <em>Level Of Assurance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.LevelOfAssurance
   * @generated
   */
  public Adapter createLevelOfAssuranceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.EClass1 <em>EClass1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.EClass1
   * @generated
   */
  public Adapter createEClass1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustOperator <em>Trust Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustOperator
   * @generated
   */
  public Adapter createTrustOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.TrustAssessmentOperator <em>Trust Assessment Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.TrustAssessmentOperator
   * @generated
   */
  public Adapter createTrustAssessmentOperatorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.AtLeast <em>At Least</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.AtLeast
   * @generated
   */
  public Adapter createAtLeastAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.AtMost <em>At Most</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.AtMost
   * @generated
   */
  public Adapter createAtMostAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.instance.Exactly <em>Exactly</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.instance.Exactly
   * @generated
   */
  public Adapter createExactlyAdapter() {
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
   * Creates a new adapter for an object of class '{@link rule.condition.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rule.condition.Atom
   * @generated
   */
  public Adapter createAtomAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rule.condition.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rule.condition.Operator
   * @generated
   */
  public Adapter createOperatorAdapter() {
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

} //InstanceAdapterFactory
