/**
 */
package trust.instance.impl;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

import context.ContextPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.condition.ConditionPackage;

import time.TimePackage;

import trust.TrustPackage;

import trust.action.ActionPackage;

import trust.action.impl.ActionPackageImpl;

import trust.impl.TrustPackageImpl;

import trust.instance.ArbitraryTrust;
import trust.instance.AtLeast;
import trust.instance.AtMost;
import trust.instance.BeliefEvidence;
import trust.instance.ContextProvisioning;
import trust.instance.ContextSituationEventsProvisioning;
import trust.instance.DataQuality;
import trust.instance.DirectTrust;
import trust.instance.DisbeliefEvidence;
import trust.instance.DispositionalTrust;
import trust.instance.EClass0;
import trust.instance.EClass1;
import trust.instance.EstablishValue;
import trust.instance.Evidence;
import trust.instance.Exactly;
import trust.instance.ExperienceTrust;
import trust.instance.Goal;
import trust.instance.IdentityQuality;
import trust.instance.IndirectTrust;
import trust.instance.InstanceFactory;
import trust.instance.InstancePackage;
import trust.instance.IntrinsicBehavior;
import trust.instance.LevelOfAssurance;
import trust.instance.LikelihoodLevel;
import trust.instance.LikelihoodLevelCORAS;
import trust.instance.LikelihoodLevelSL;
import trust.instance.LikelihoodMeasurement;
import trust.instance.ObservableBehavior;
import trust.instance.PersonalTrust;
import trust.instance.RecommendationQuality;
import trust.instance.Requirement;
import trust.instance.SituationalTrust;
import trust.instance.SubjectiveLikelihood;
import trust.instance.SubjectiveLogicConsensus;
import trust.instance.SystemTrust;
import trust.instance.TrustAspect;
import trust.instance.TrustAssessmentOperator;
import trust.instance.TrustFusionOperator;
import trust.instance.TrustLevel;
import trust.instance.TrustOperator;
import trust.instance.TrustRecommendation;
import trust.instance.TrustRelationship;
import trust.instance.TrustRequirement;
import trust.instance.TrusteeScope;
import trust.instance.UncertaintyLevel;
import trust.instance.WeightedConsensus;

import trust.pattern.PatternPackage;

import trust.pattern.impl.PatternPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indirectTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arbitraryTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experienceTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beliefEvidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disbeliefEvidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dispositionalTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass situationalTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustAspectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass establishValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recommendationQualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personalTrustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRecommendationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subjectiveLikelihoodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likelihoodMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trusteeScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRequirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextProvisioningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextSituationEventsProvisioningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intrinsicBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass observableBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataQualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identityQualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClass0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustFusionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subjectiveLogicConsensusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weightedConsensusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass levelOfAssuranceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClass1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustAssessmentOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atLeastEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atMostEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exactlyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum trustLevelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum likelihoodLevelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum likelihoodLevelCORASEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum uncertaintyLevelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum likelihoodLevelSLEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType subjectiveOpinionEDataType = null;

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
   * @see trust.instance.InstancePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private InstancePackageImpl() {
    super(eNS_URI, InstanceFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static InstancePackage init() {
    if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

    // Obtain or create and register package
    InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ContextPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);
    PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
    ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

    // Create package meta-data objects
    theInstancePackage.createPackageContents();
    theTrustPackage.createPackageContents();
    thePatternPackage.createPackageContents();
    theActionPackage.createPackageContents();

    // Initialize created meta-data
    theInstancePackage.initializePackageContents();
    theTrustPackage.initializePackageContents();
    thePatternPackage.initializePackageContents();
    theActionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theInstancePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
    return theInstancePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectTrust() {
    return directTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndirectTrust() {
    return indirectTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArbitraryTrust() {
    return arbitraryTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperienceTrust() {
    return experienceTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperienceTrust_Evidence() {
    return (EReference)experienceTrustEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvidence() {
    return evidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvidence_Timestamp() {
    return (EReference)evidenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeliefEvidence() {
    return beliefEvidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisbeliefEvidence() {
    return disbeliefEvidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRelationship() {
    return trustRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationship_Aspect() {
    return (EReference)trustRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationship_Degree() {
    return (EReference)trustRelationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationship_Timestamp() {
    return (EReference)trustRelationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationship_TrusteeScope() {
    return (EReference)trustRelationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationship_Trustor() {
    return (EReference)trustRelationshipEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrustRelationship_Description() {
    return (EAttribute)trustRelationshipEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDispositionalTrust() {
    return dispositionalTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemTrust() {
    return systemTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSituationalTrust() {
    return situationalTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSituationalTrust_ContextSituation() {
    return (EReference)situationalTrustEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustAspect() {
    return trustAspectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrustAspect_Name() {
    return (EAttribute)trustAspectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrustAspect_Description() {
    return (EAttribute)trustAspectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstablishValue() {
    return establishValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecommendationQuality() {
    return recommendationQualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecommendationQuality_AspectsToRecommend() {
    return (EReference)recommendationQualityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersonalTrust() {
    return personalTrustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPersonalTrust_Trustee() {
    return (EReference)personalTrustEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRecommendation() {
    return trustRecommendationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRecommendation_TrustRelationship() {
    return (EReference)trustRecommendationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRecommendation_Timestamp() {
    return (EReference)trustRecommendationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRecommendation_Recommender() {
    return (EReference)trustRecommendationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubjectiveLikelihood() {
    return subjectiveLikelihoodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubjectiveLikelihood_Opinion() {
    return (EAttribute)subjectiveLikelihoodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLikelihoodMeasurement() {
    return likelihoodMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrusteeScope() {
    return trusteeScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal() {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_RequirementsToSatisfyGoal() {
    return (EReference)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_SubGoal() {
    return (EReference)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement() {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRequirement() {
    return trustRequirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRequirement_TrustBelief() {
    return (EReference)trustRequirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextProvisioning() {
    return contextProvisioningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextProvisioning_ContextInformationPattern() {
    return (EReference)contextProvisioningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextSituationEventsProvisioning() {
    return contextSituationEventsProvisioningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextSituationEventsProvisioning_DetectSituations() {
    return (EAttribute)contextSituationEventsProvisioningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextSituationEventsProvisioning_ReportSituations() {
    return (EAttribute)contextSituationEventsProvisioningEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextSituationEventsProvisioning_ContextSituationPattern() {
    return (EReference)contextSituationEventsProvisioningEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntrinsicBehavior() {
    return intrinsicBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObservableBehavior() {
    return observableBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataQuality() {
    return dataQualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentityQuality() {
    return identityQualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentityQuality_Loa() {
    return (EReference)identityQualityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClass0() {
    return eClass0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustFusionOperator() {
    return trustFusionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustFusionOperator_Operands() {
    return (EReference)trustFusionOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubjectiveLogicConsensus() {
    return subjectiveLogicConsensusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeightedConsensus() {
    return weightedConsensusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLevelOfAssurance() {
    return levelOfAssuranceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClass1() {
    return eClass1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustOperator() {
    return trustOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustOperator_TrustPattern() {
    return (EReference)trustOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustAssessmentOperator() {
    return trustAssessmentOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustAssessmentOperator_TrustFusionOperator() {
    return (EReference)trustAssessmentOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustAssessmentOperator_Degree() {
    return (EReference)trustAssessmentOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtLeast() {
    return atLeastEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtMost() {
    return atMostEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExactly() {
    return exactlyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTrustLevel() {
    return trustLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLikelihoodLevel() {
    return likelihoodLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLikelihoodLevelCORAS() {
    return likelihoodLevelCORASEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUncertaintyLevel() {
    return uncertaintyLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLikelihoodLevelSL() {
    return likelihoodLevelSLEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSubjectiveOpinion() {
    return subjectiveOpinionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceFactory getInstanceFactory() {
    return (InstanceFactory)getEFactoryInstance();
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
    directTrustEClass = createEClass(DIRECT_TRUST);

    indirectTrustEClass = createEClass(INDIRECT_TRUST);

    arbitraryTrustEClass = createEClass(ARBITRARY_TRUST);

    experienceTrustEClass = createEClass(EXPERIENCE_TRUST);
    createEReference(experienceTrustEClass, EXPERIENCE_TRUST__EVIDENCE);

    evidenceEClass = createEClass(EVIDENCE);
    createEReference(evidenceEClass, EVIDENCE__TIMESTAMP);

    beliefEvidenceEClass = createEClass(BELIEF_EVIDENCE);

    disbeliefEvidenceEClass = createEClass(DISBELIEF_EVIDENCE);

    trustRelationshipEClass = createEClass(TRUST_RELATIONSHIP);
    createEReference(trustRelationshipEClass, TRUST_RELATIONSHIP__ASPECT);
    createEReference(trustRelationshipEClass, TRUST_RELATIONSHIP__DEGREE);
    createEReference(trustRelationshipEClass, TRUST_RELATIONSHIP__TIMESTAMP);
    createEReference(trustRelationshipEClass, TRUST_RELATIONSHIP__TRUSTEE_SCOPE);
    createEReference(trustRelationshipEClass, TRUST_RELATIONSHIP__TRUSTOR);
    createEAttribute(trustRelationshipEClass, TRUST_RELATIONSHIP__DESCRIPTION);

    dispositionalTrustEClass = createEClass(DISPOSITIONAL_TRUST);

    systemTrustEClass = createEClass(SYSTEM_TRUST);

    situationalTrustEClass = createEClass(SITUATIONAL_TRUST);
    createEReference(situationalTrustEClass, SITUATIONAL_TRUST__CONTEXT_SITUATION);

    trustAspectEClass = createEClass(TRUST_ASPECT);
    createEAttribute(trustAspectEClass, TRUST_ASPECT__NAME);
    createEAttribute(trustAspectEClass, TRUST_ASPECT__DESCRIPTION);

    establishValueEClass = createEClass(ESTABLISH_VALUE);

    recommendationQualityEClass = createEClass(RECOMMENDATION_QUALITY);
    createEReference(recommendationQualityEClass, RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND);

    personalTrustEClass = createEClass(PERSONAL_TRUST);
    createEReference(personalTrustEClass, PERSONAL_TRUST__TRUSTEE);

    trustRecommendationEClass = createEClass(TRUST_RECOMMENDATION);
    createEReference(trustRecommendationEClass, TRUST_RECOMMENDATION__TRUST_RELATIONSHIP);
    createEReference(trustRecommendationEClass, TRUST_RECOMMENDATION__TIMESTAMP);
    createEReference(trustRecommendationEClass, TRUST_RECOMMENDATION__RECOMMENDER);

    subjectiveLikelihoodEClass = createEClass(SUBJECTIVE_LIKELIHOOD);
    createEAttribute(subjectiveLikelihoodEClass, SUBJECTIVE_LIKELIHOOD__OPINION);

    likelihoodMeasurementEClass = createEClass(LIKELIHOOD_MEASUREMENT);

    trusteeScopeEClass = createEClass(TRUSTEE_SCOPE);

    goalEClass = createEClass(GOAL);
    createEReference(goalEClass, GOAL__REQUIREMENTS_TO_SATISFY_GOAL);
    createEReference(goalEClass, GOAL__SUB_GOAL);

    requirementEClass = createEClass(REQUIREMENT);

    trustRequirementEClass = createEClass(TRUST_REQUIREMENT);
    createEReference(trustRequirementEClass, TRUST_REQUIREMENT__TRUST_BELIEF);

    contextProvisioningEClass = createEClass(CONTEXT_PROVISIONING);
    createEReference(contextProvisioningEClass, CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN);

    contextSituationEventsProvisioningEClass = createEClass(CONTEXT_SITUATION_EVENTS_PROVISIONING);
    createEAttribute(contextSituationEventsProvisioningEClass, CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS);
    createEAttribute(contextSituationEventsProvisioningEClass, CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS);
    createEReference(contextSituationEventsProvisioningEClass, CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN);

    intrinsicBehaviorEClass = createEClass(INTRINSIC_BEHAVIOR);

    observableBehaviorEClass = createEClass(OBSERVABLE_BEHAVIOR);

    dataQualityEClass = createEClass(DATA_QUALITY);

    identityQualityEClass = createEClass(IDENTITY_QUALITY);
    createEReference(identityQualityEClass, IDENTITY_QUALITY__LOA);

    eClass0EClass = createEClass(ECLASS0);

    trustFusionOperatorEClass = createEClass(TRUST_FUSION_OPERATOR);
    createEReference(trustFusionOperatorEClass, TRUST_FUSION_OPERATOR__OPERANDS);

    subjectiveLogicConsensusEClass = createEClass(SUBJECTIVE_LOGIC_CONSENSUS);

    weightedConsensusEClass = createEClass(WEIGHTED_CONSENSUS);

    levelOfAssuranceEClass = createEClass(LEVEL_OF_ASSURANCE);

    eClass1EClass = createEClass(ECLASS1);

    trustOperatorEClass = createEClass(TRUST_OPERATOR);
    createEReference(trustOperatorEClass, TRUST_OPERATOR__TRUST_PATTERN);

    trustAssessmentOperatorEClass = createEClass(TRUST_ASSESSMENT_OPERATOR);
    createEReference(trustAssessmentOperatorEClass, TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR);
    createEReference(trustAssessmentOperatorEClass, TRUST_ASSESSMENT_OPERATOR__DEGREE);

    atLeastEClass = createEClass(AT_LEAST);

    atMostEClass = createEClass(AT_MOST);

    exactlyEClass = createEClass(EXACTLY);

    // Create enums
    trustLevelEEnum = createEEnum(TRUST_LEVEL);
    likelihoodLevelEEnum = createEEnum(LIKELIHOOD_LEVEL);
    likelihoodLevelCORASEEnum = createEEnum(LIKELIHOOD_LEVEL_CORAS);
    uncertaintyLevelEEnum = createEEnum(UNCERTAINTY_LEVEL);
    likelihoodLevelSLEEnum = createEEnum(LIKELIHOOD_LEVEL_SL);

    // Create data types
    subjectiveOpinionEDataType = createEDataType(SUBJECTIVE_OPINION);
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
    TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
    identity.instance.InstancePackage theInstancePackage_1 = (identity.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(identity.instance.InstancePackage.eNS_URI);
    context.pattern.PatternPackage thePatternPackage_1 = (context.pattern.PatternPackage)EPackage.Registry.INSTANCE.getEPackage(context.pattern.PatternPackage.eNS_URI);
    identity.pattern.PatternPackage thePatternPackage_2 = (identity.pattern.PatternPackage)EPackage.Registry.INSTANCE.getEPackage(identity.pattern.PatternPackage.eNS_URI);
    PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
    ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    directTrustEClass.getESuperTypes().add(this.getTrustRelationship());
    indirectTrustEClass.getESuperTypes().add(this.getTrustRelationship());
    arbitraryTrustEClass.getESuperTypes().add(this.getDirectTrust());
    experienceTrustEClass.getESuperTypes().add(this.getDirectTrust());
    evidenceEClass.getESuperTypes().add(theModelsPackage.getElement());
    beliefEvidenceEClass.getESuperTypes().add(this.getEvidence());
    disbeliefEvidenceEClass.getESuperTypes().add(this.getEvidence());
    trustRelationshipEClass.getESuperTypes().add(theModelsPackage.getElement());
    dispositionalTrustEClass.getESuperTypes().add(this.getTrusteeScope());
    systemTrustEClass.getESuperTypes().add(this.getTrusteeScope());
    situationalTrustEClass.getESuperTypes().add(this.getTrusteeScope());
    trustAspectEClass.getESuperTypes().add(theModelsPackage.getElement());
    establishValueEClass.getESuperTypes().add(this.getTrustAspect());
    recommendationQualityEClass.getESuperTypes().add(this.getTrustAspect());
    personalTrustEClass.getESuperTypes().add(this.getSituationalTrust());
    trustRecommendationEClass.getESuperTypes().add(theModelsPackage.getElement());
    subjectiveLikelihoodEClass.getESuperTypes().add(this.getLikelihoodMeasurement());
    likelihoodMeasurementEClass.getESuperTypes().add(theModelsPackage.getElement());
    trusteeScopeEClass.getESuperTypes().add(theModelsPackage.getElement());
    trustRequirementEClass.getESuperTypes().add(this.getRequirement());
    contextProvisioningEClass.getESuperTypes().add(this.getDataQuality());
    contextSituationEventsProvisioningEClass.getESuperTypes().add(this.getDataQuality());
    dataQualityEClass.getESuperTypes().add(this.getTrustAspect());
    identityQualityEClass.getESuperTypes().add(this.getDataQuality());
    trustFusionOperatorEClass.getESuperTypes().add(this.getTrustOperator());
    subjectiveLogicConsensusEClass.getESuperTypes().add(this.getTrustFusionOperator());
    weightedConsensusEClass.getESuperTypes().add(this.getTrustFusionOperator());
    trustOperatorEClass.getESuperTypes().add(theModelsPackage.getElement());
    trustAssessmentOperatorEClass.getESuperTypes().add(this.getTrustOperator());
    trustAssessmentOperatorEClass.getESuperTypes().add(theConditionPackage.getOperator());
    atLeastEClass.getESuperTypes().add(this.getTrustAssessmentOperator());
    atMostEClass.getESuperTypes().add(this.getTrustAssessmentOperator());
    exactlyEClass.getESuperTypes().add(this.getTrustAssessmentOperator());

    // Initialize classes, features, and operations; add parameters
    initEClass(directTrustEClass, DirectTrust.class, "DirectTrust", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indirectTrustEClass, IndirectTrust.class, "IndirectTrust", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arbitraryTrustEClass, ArbitraryTrust.class, "ArbitraryTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(experienceTrustEClass, ExperienceTrust.class, "ExperienceTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExperienceTrust_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ExperienceTrust.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evidenceEClass, Evidence.class, "Evidence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvidence_Timestamp(), theTimePackage.getTimestamp(), null, "timestamp", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beliefEvidenceEClass, BeliefEvidence.class, "BeliefEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(disbeliefEvidenceEClass, DisbeliefEvidence.class, "DisbeliefEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trustRelationshipEClass, TrustRelationship.class, "TrustRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRelationship_Aspect(), this.getTrustAspect(), null, "aspect", null, 1, -1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationship_Degree(), this.getLikelihoodMeasurement(), null, "degree", null, 1, 1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationship_Timestamp(), theTimePackage.getTimestamp(), null, "timestamp", null, 0, 1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationship_TrusteeScope(), this.getTrusteeScope(), null, "trusteeScope", null, 1, 1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationship_Trustor(), theInstancePackage_1.getAbstractIdentity(), null, "trustor", null, 1, 1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrustRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, TrustRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dispositionalTrustEClass, DispositionalTrust.class, "DispositionalTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemTrustEClass, SystemTrust.class, "SystemTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(situationalTrustEClass, SituationalTrust.class, "SituationalTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSituationalTrust_ContextSituation(), thePatternPackage_1.getContextSituationPattern(), null, "contextSituation", null, 0, 1, SituationalTrust.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustAspectEClass, TrustAspect.class, "TrustAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrustAspect_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrustAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrustAspect_Description(), ecorePackage.getEString(), "description", null, 0, 1, TrustAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(establishValueEClass, EstablishValue.class, "EstablishValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(recommendationQualityEClass, RecommendationQuality.class, "RecommendationQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecommendationQuality_AspectsToRecommend(), this.getTrustAspect(), null, "aspectsToRecommend", null, 0, -1, RecommendationQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personalTrustEClass, PersonalTrust.class, "PersonalTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPersonalTrust_Trustee(), thePatternPackage_2.getIdentityPattern(), null, "trustee", null, 0, 1, PersonalTrust.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustRecommendationEClass, TrustRecommendation.class, "TrustRecommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRecommendation_TrustRelationship(), this.getTrustRelationship(), null, "trustRelationship", null, 1, 1, TrustRecommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRecommendation_Timestamp(), theTimePackage.getTimestamp(), null, "timestamp", null, 0, 1, TrustRecommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRecommendation_Recommender(), theInstancePackage_1.getAbstractIdentity(), null, "recommender", null, 1, 1, TrustRecommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subjectiveLikelihoodEClass, SubjectiveLikelihood.class, "SubjectiveLikelihood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubjectiveLikelihood_Opinion(), this.getSubjectiveOpinion(), "opinion", null, 0, 1, SubjectiveLikelihood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(likelihoodMeasurementEClass, LikelihoodMeasurement.class, "LikelihoodMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trusteeScopeEClass, TrusteeScope.class, "TrusteeScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalEClass, Goal.class, "Goal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoal_RequirementsToSatisfyGoal(), this.getRequirement(), null, "requirementsToSatisfyGoal", null, 1, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_SubGoal(), this.getGoal(), null, "subGoal", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trustRequirementEClass, TrustRequirement.class, "TrustRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRequirement_TrustBelief(), this.getTrustRelationship(), null, "trustBelief", null, 1, 1, TrustRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextProvisioningEClass, ContextProvisioning.class, "ContextProvisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextProvisioning_ContextInformationPattern(), thePatternPackage_1.getContextInformationPattern(), null, "contextInformationPattern", null, 0, 1, ContextProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextSituationEventsProvisioningEClass, ContextSituationEventsProvisioning.class, "ContextSituationEventsProvisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContextSituationEventsProvisioning_DetectSituations(), ecorePackage.getEBoolean(), "detectSituations", null, 0, 1, ContextSituationEventsProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContextSituationEventsProvisioning_ReportSituations(), ecorePackage.getEBoolean(), "reportSituations", null, 0, 1, ContextSituationEventsProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContextSituationEventsProvisioning_ContextSituationPattern(), thePatternPackage_1.getContextSituationPattern(), null, "contextSituationPattern", null, 0, 1, ContextSituationEventsProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intrinsicBehaviorEClass, IntrinsicBehavior.class, "IntrinsicBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(observableBehaviorEClass, ObservableBehavior.class, "ObservableBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataQualityEClass, DataQuality.class, "DataQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(identityQualityEClass, IdentityQuality.class, "IdentityQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdentityQuality_Loa(), this.getLevelOfAssurance(), null, "loa", null, 0, 1, IdentityQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eClass0EClass, EClass0.class, "EClass0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trustFusionOperatorEClass, TrustFusionOperator.class, "TrustFusionOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustFusionOperator_Operands(), this.getTrustFusionOperator(), null, "operands", null, 0, -1, TrustFusionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subjectiveLogicConsensusEClass, SubjectiveLogicConsensus.class, "SubjectiveLogicConsensus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(weightedConsensusEClass, WeightedConsensus.class, "WeightedConsensus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(levelOfAssuranceEClass, LevelOfAssurance.class, "LevelOfAssurance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eClass1EClass, EClass1.class, "EClass1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trustOperatorEClass, TrustOperator.class, "TrustOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustOperator_TrustPattern(), thePatternPackage.getTrustPattern(), null, "trustPattern", null, 1, 1, TrustOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustAssessmentOperatorEClass, TrustAssessmentOperator.class, "TrustAssessmentOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustAssessmentOperator_TrustFusionOperator(), this.getTrustFusionOperator(), null, "trustFusionOperator", null, 0, 1, TrustAssessmentOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustAssessmentOperator_Degree(), thePatternPackage.getTrustDegreePattern(), null, "degree", null, 0, 1, TrustAssessmentOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atLeastEClass, AtLeast.class, "AtLeast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atMostEClass, AtMost.class, "AtMost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exactlyEClass, Exactly.class, "Exactly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(trustLevelEEnum, TrustLevel.class, "TrustLevel");
    addEEnumLiteral(trustLevelEEnum, TrustLevel.UNSPECIFIED);
    addEEnumLiteral(trustLevelEEnum, TrustLevel.VERY_UNTRUSTWORTHY);
    addEEnumLiteral(trustLevelEEnum, TrustLevel.UNTRUSTWORTHY);
    addEEnumLiteral(trustLevelEEnum, TrustLevel.UNCERTAIN);
    addEEnumLiteral(trustLevelEEnum, TrustLevel.TRUSTWORTHY);
    addEEnumLiteral(trustLevelEEnum, TrustLevel.VERY_TRUSTWORTHY);

    initEEnum(likelihoodLevelEEnum, LikelihoodLevel.class, "LikelihoodLevel");
    addEEnumLiteral(likelihoodLevelEEnum, LikelihoodLevel.RARE);
    addEEnumLiteral(likelihoodLevelEEnum, LikelihoodLevel.UNLIKELY);
    addEEnumLiteral(likelihoodLevelEEnum, LikelihoodLevel.POSSIBLE);
    addEEnumLiteral(likelihoodLevelEEnum, LikelihoodLevel.LIKELY);
    addEEnumLiteral(likelihoodLevelEEnum, LikelihoodLevel.CERTAIN);

    initEEnum(likelihoodLevelCORASEEnum, LikelihoodLevelCORAS.class, "LikelihoodLevelCORAS");
    addEEnumLiteral(likelihoodLevelCORASEEnum, LikelihoodLevelCORAS.RARELY);
    addEEnumLiteral(likelihoodLevelCORASEEnum, LikelihoodLevelCORAS.SOMETIMES);
    addEEnumLiteral(likelihoodLevelCORASEEnum, LikelihoodLevelCORAS.REGULARLY);
    addEEnumLiteral(likelihoodLevelCORASEEnum, LikelihoodLevelCORAS.OFTEN);

    initEEnum(uncertaintyLevelEEnum, UncertaintyLevel.class, "UncertaintyLevel");
    addEEnumLiteral(uncertaintyLevelEEnum, UncertaintyLevel.COMPLETELY_UNCERTAIN);
    addEEnumLiteral(uncertaintyLevelEEnum, UncertaintyLevel.VERY_UNCERTAIN);
    addEEnumLiteral(uncertaintyLevelEEnum, UncertaintyLevel.UNCERTAIN);
    addEEnumLiteral(uncertaintyLevelEEnum, UncertaintyLevel.SLIGHTLY_UNCERTAIN);
    addEEnumLiteral(uncertaintyLevelEEnum, UncertaintyLevel.COMPLETELY_CERTAIN);

    initEEnum(likelihoodLevelSLEEnum, LikelihoodLevelSL.class, "LikelihoodLevelSL");
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.ABSOLUTELY_NOT);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.VERY_UNLIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.UNLIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.SOMEWHAT_UNLIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.CHANCES_ABOUT_EVEN);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.SOMEWHAT_LIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.LIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.VERY_LIKELY);
    addEEnumLiteral(likelihoodLevelSLEEnum, LikelihoodLevelSL.ABSOLUTELY);

    // Initialize data types
    initEDataType(subjectiveOpinionEDataType, SubjectiveOpinion.class, "SubjectiveOpinion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
  }

} //InstancePackageImpl
