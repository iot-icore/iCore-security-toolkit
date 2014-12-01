/**
 */
package trust.instance.impl;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trust.instance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstanceFactory init() {
    try {
      InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
      if (theInstanceFactory != null) {
        return theInstanceFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InstanceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceFactoryImpl() {
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
      case InstancePackage.ARBITRARY_TRUST: return createArbitraryTrust();
      case InstancePackage.EXPERIENCE_TRUST: return createExperienceTrust();
      case InstancePackage.BELIEF_EVIDENCE: return createBeliefEvidence();
      case InstancePackage.DISBELIEF_EVIDENCE: return createDisbeliefEvidence();
      case InstancePackage.DISPOSITIONAL_TRUST: return createDispositionalTrust();
      case InstancePackage.SYSTEM_TRUST: return createSystemTrust();
      case InstancePackage.SITUATIONAL_TRUST: return createSituationalTrust();
      case InstancePackage.TRUST_ASPECT: return createTrustAspect();
      case InstancePackage.RECOMMENDATION_QUALITY: return createRecommendationQuality();
      case InstancePackage.PERSONAL_TRUST: return createPersonalTrust();
      case InstancePackage.TRUST_RECOMMENDATION: return createTrustRecommendation();
      case InstancePackage.SUBJECTIVE_LIKELIHOOD: return createSubjectiveLikelihood();
      case InstancePackage.TRUST_REQUIREMENT: return createTrustRequirement();
      case InstancePackage.CONTEXT_PROVISIONING: return createContextProvisioning();
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING: return createContextSituationEventsProvisioning();
      case InstancePackage.DATA_QUALITY: return createDataQuality();
      case InstancePackage.IDENTITY_QUALITY: return createIdentityQuality();
      case InstancePackage.ECLASS0: return createEClass0();
      case InstancePackage.SUBJECTIVE_LOGIC_CONSENSUS: return createSubjectiveLogicConsensus();
      case InstancePackage.WEIGHTED_CONSENSUS: return createWeightedConsensus();
      case InstancePackage.LEVEL_OF_ASSURANCE: return createLevelOfAssurance();
      case InstancePackage.ECLASS1: return createEClass1();
      case InstancePackage.TRUST_OPERATOR: return createTrustOperator();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR: return createTrustAssessmentOperator();
      case InstancePackage.AT_LEAST: return createAtLeast();
      case InstancePackage.AT_MOST: return createAtMost();
      case InstancePackage.EXACTLY: return createExactly();
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
      case InstancePackage.TRUST_LEVEL:
        return createTrustLevelFromString(eDataType, initialValue);
      case InstancePackage.LIKELIHOOD_LEVEL:
        return createLikelihoodLevelFromString(eDataType, initialValue);
      case InstancePackage.LIKELIHOOD_LEVEL_CORAS:
        return createLikelihoodLevelCORASFromString(eDataType, initialValue);
      case InstancePackage.UNCERTAINTY_LEVEL:
        return createUncertaintyLevelFromString(eDataType, initialValue);
      case InstancePackage.LIKELIHOOD_LEVEL_SL:
        return createLikelihoodLevelSLFromString(eDataType, initialValue);
      case InstancePackage.SUBJECTIVE_OPINION:
        return createSubjectiveOpinionFromString(eDataType, initialValue);
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
      case InstancePackage.TRUST_LEVEL:
        return convertTrustLevelToString(eDataType, instanceValue);
      case InstancePackage.LIKELIHOOD_LEVEL:
        return convertLikelihoodLevelToString(eDataType, instanceValue);
      case InstancePackage.LIKELIHOOD_LEVEL_CORAS:
        return convertLikelihoodLevelCORASToString(eDataType, instanceValue);
      case InstancePackage.UNCERTAINTY_LEVEL:
        return convertUncertaintyLevelToString(eDataType, instanceValue);
      case InstancePackage.LIKELIHOOD_LEVEL_SL:
        return convertLikelihoodLevelSLToString(eDataType, instanceValue);
      case InstancePackage.SUBJECTIVE_OPINION:
        return convertSubjectiveOpinionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArbitraryTrust createArbitraryTrust() {
    ArbitraryTrustImpl arbitraryTrust = new ArbitraryTrustImpl();
    return arbitraryTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperienceTrust createExperienceTrust() {
    ExperienceTrustImpl experienceTrust = new ExperienceTrustImpl();
    return experienceTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeliefEvidence createBeliefEvidence() {
    BeliefEvidenceImpl beliefEvidence = new BeliefEvidenceImpl();
    return beliefEvidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisbeliefEvidence createDisbeliefEvidence() {
    DisbeliefEvidenceImpl disbeliefEvidence = new DisbeliefEvidenceImpl();
    return disbeliefEvidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispositionalTrust createDispositionalTrust() {
    DispositionalTrustImpl dispositionalTrust = new DispositionalTrustImpl();
    return dispositionalTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemTrust createSystemTrust() {
    SystemTrustImpl systemTrust = new SystemTrustImpl();
    return systemTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SituationalTrust createSituationalTrust() {
    SituationalTrustImpl situationalTrust = new SituationalTrustImpl();
    return situationalTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustAspect createTrustAspect() {
    TrustAspectImpl trustAspect = new TrustAspectImpl();
    return trustAspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecommendationQuality createRecommendationQuality() {
    RecommendationQualityImpl recommendationQuality = new RecommendationQualityImpl();
    return recommendationQuality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalTrust createPersonalTrust() {
    PersonalTrustImpl personalTrust = new PersonalTrustImpl();
    return personalTrust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRecommendation createTrustRecommendation() {
    TrustRecommendationImpl trustRecommendation = new TrustRecommendationImpl();
    return trustRecommendation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectiveLikelihood createSubjectiveLikelihood() {
    SubjectiveLikelihoodImpl subjectiveLikelihood = new SubjectiveLikelihoodImpl();
    return subjectiveLikelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRequirement createTrustRequirement() {
    TrustRequirementImpl trustRequirement = new TrustRequirementImpl();
    return trustRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextProvisioning createContextProvisioning() {
    ContextProvisioningImpl contextProvisioning = new ContextProvisioningImpl();
    return contextProvisioning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextSituationEventsProvisioning createContextSituationEventsProvisioning() {
    ContextSituationEventsProvisioningImpl contextSituationEventsProvisioning = new ContextSituationEventsProvisioningImpl();
    return contextSituationEventsProvisioning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataQuality createDataQuality() {
    DataQualityImpl dataQuality = new DataQualityImpl();
    return dataQuality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityQuality createIdentityQuality() {
    IdentityQualityImpl identityQuality = new IdentityQualityImpl();
    return identityQuality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass0 createEClass0() {
    EClass0Impl eClass0 = new EClass0Impl();
    return eClass0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectiveLogicConsensus createSubjectiveLogicConsensus() {
    SubjectiveLogicConsensusImpl subjectiveLogicConsensus = new SubjectiveLogicConsensusImpl();
    return subjectiveLogicConsensus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeightedConsensus createWeightedConsensus() {
    WeightedConsensusImpl weightedConsensus = new WeightedConsensusImpl();
    return weightedConsensus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelOfAssurance createLevelOfAssurance() {
    LevelOfAssuranceImpl levelOfAssurance = new LevelOfAssuranceImpl();
    return levelOfAssurance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass1 createEClass1() {
    EClass1Impl eClass1 = new EClass1Impl();
    return eClass1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustOperator createTrustOperator() {
    TrustOperatorImpl trustOperator = new TrustOperatorImpl();
    return trustOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustAssessmentOperator createTrustAssessmentOperator() {
    TrustAssessmentOperatorImpl trustAssessmentOperator = new TrustAssessmentOperatorImpl();
    return trustAssessmentOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtLeast createAtLeast() {
    AtLeastImpl atLeast = new AtLeastImpl();
    return atLeast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtMost createAtMost() {
    AtMostImpl atMost = new AtMostImpl();
    return atMost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exactly createExactly() {
    ExactlyImpl exactly = new ExactlyImpl();
    return exactly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustLevel createTrustLevelFromString(EDataType eDataType, String initialValue) {
    TrustLevel result = TrustLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTrustLevelToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikelihoodLevel createLikelihoodLevelFromString(EDataType eDataType, String initialValue) {
    LikelihoodLevel result = LikelihoodLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLikelihoodLevelToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikelihoodLevelCORAS createLikelihoodLevelCORASFromString(EDataType eDataType, String initialValue) {
    LikelihoodLevelCORAS result = LikelihoodLevelCORAS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLikelihoodLevelCORASToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UncertaintyLevel createUncertaintyLevelFromString(EDataType eDataType, String initialValue) {
    UncertaintyLevel result = UncertaintyLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUncertaintyLevelToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikelihoodLevelSL createLikelihoodLevelSLFromString(EDataType eDataType, String initialValue) {
    LikelihoodLevelSL result = LikelihoodLevelSL.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLikelihoodLevelSLToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectiveOpinion createSubjectiveOpinionFromString(EDataType eDataType, String initialValue) {
    return (SubjectiveOpinion)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSubjectiveOpinionToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstancePackage getInstancePackage() {
    return (InstancePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InstancePackage getPackage() {
    return InstancePackage.eINSTANCE;
  }

} //InstanceFactoryImpl
