/**
 */
package trust.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InstanceFactory eINSTANCE = trust.instance.impl.InstanceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Arbitrary Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arbitrary Trust</em>'.
   * @generated
   */
  ArbitraryTrust createArbitraryTrust();

  /**
   * Returns a new object of class '<em>Experience Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experience Trust</em>'.
   * @generated
   */
  ExperienceTrust createExperienceTrust();

  /**
   * Returns a new object of class '<em>Belief Evidence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belief Evidence</em>'.
   * @generated
   */
  BeliefEvidence createBeliefEvidence();

  /**
   * Returns a new object of class '<em>Disbelief Evidence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disbelief Evidence</em>'.
   * @generated
   */
  DisbeliefEvidence createDisbeliefEvidence();

  /**
   * Returns a new object of class '<em>Dispositional Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dispositional Trust</em>'.
   * @generated
   */
  DispositionalTrust createDispositionalTrust();

  /**
   * Returns a new object of class '<em>System Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Trust</em>'.
   * @generated
   */
  SystemTrust createSystemTrust();

  /**
   * Returns a new object of class '<em>Situational Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Situational Trust</em>'.
   * @generated
   */
  SituationalTrust createSituationalTrust();

  /**
   * Returns a new object of class '<em>Trust Aspect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Aspect</em>'.
   * @generated
   */
  TrustAspect createTrustAspect();

  /**
   * Returns a new object of class '<em>Recommendation Quality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recommendation Quality</em>'.
   * @generated
   */
  RecommendationQuality createRecommendationQuality();

  /**
   * Returns a new object of class '<em>Personal Trust</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal Trust</em>'.
   * @generated
   */
  PersonalTrust createPersonalTrust();

  /**
   * Returns a new object of class '<em>Trust Recommendation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Recommendation</em>'.
   * @generated
   */
  TrustRecommendation createTrustRecommendation();

  /**
   * Returns a new object of class '<em>Subjective Likelihood</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subjective Likelihood</em>'.
   * @generated
   */
  SubjectiveLikelihood createSubjectiveLikelihood();

  /**
   * Returns a new object of class '<em>Trust Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Requirement</em>'.
   * @generated
   */
  TrustRequirement createTrustRequirement();

  /**
   * Returns a new object of class '<em>Context Provisioning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Provisioning</em>'.
   * @generated
   */
  ContextProvisioning createContextProvisioning();

  /**
   * Returns a new object of class '<em>Context Situation Events Provisioning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Situation Events Provisioning</em>'.
   * @generated
   */
  ContextSituationEventsProvisioning createContextSituationEventsProvisioning();

  /**
   * Returns a new object of class '<em>Data Quality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Quality</em>'.
   * @generated
   */
  DataQuality createDataQuality();

  /**
   * Returns a new object of class '<em>Identity Quality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Quality</em>'.
   * @generated
   */
  IdentityQuality createIdentityQuality();

  /**
   * Returns a new object of class '<em>EClass0</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClass0</em>'.
   * @generated
   */
  EClass0 createEClass0();

  /**
   * Returns a new object of class '<em>Subjective Logic Consensus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subjective Logic Consensus</em>'.
   * @generated
   */
  SubjectiveLogicConsensus createSubjectiveLogicConsensus();

  /**
   * Returns a new object of class '<em>Weighted Consensus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weighted Consensus</em>'.
   * @generated
   */
  WeightedConsensus createWeightedConsensus();

  /**
   * Returns a new object of class '<em>Level Of Assurance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Level Of Assurance</em>'.
   * @generated
   */
  LevelOfAssurance createLevelOfAssurance();

  /**
   * Returns a new object of class '<em>EClass1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClass1</em>'.
   * @generated
   */
  EClass1 createEClass1();

  /**
   * Returns a new object of class '<em>Trust Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Operator</em>'.
   * @generated
   */
  TrustOperator createTrustOperator();

  /**
   * Returns a new object of class '<em>Trust Assessment Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Assessment Operator</em>'.
   * @generated
   */
  TrustAssessmentOperator createTrustAssessmentOperator();

  /**
   * Returns a new object of class '<em>At Least</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Least</em>'.
   * @generated
   */
  AtLeast createAtLeast();

  /**
   * Returns a new object of class '<em>At Most</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Most</em>'.
   * @generated
   */
  AtMost createAtMost();

  /**
   * Returns a new object of class '<em>Exactly</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exactly</em>'.
   * @generated
   */
  Exactly createExactly();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  InstancePackage getInstancePackage();

} //InstanceFactory
