/**
 */
package trust.pattern.impl;

import context.ContextPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import time.TimePackage;

import trust.TrustPackage;

import trust.action.ActionPackage;

import trust.action.impl.ActionPackageImpl;

import trust.impl.TrustPackageImpl;

import trust.instance.InstancePackage;

import trust.instance.impl.InstancePackageImpl;

import trust.pattern.ArbitraryTrustPattern;
import trust.pattern.DirectTrustPattern;
import trust.pattern.DispositionalScopePattern;
import trust.pattern.ExperienceTrustPattern;
import trust.pattern.PatternFactory;
import trust.pattern.PatternPackage;
import trust.pattern.PersonalScopePattern;
import trust.pattern.SituationalScopePattern;
import trust.pattern.SystemScopePattern;
import trust.pattern.TrustDegreePattern;
import trust.pattern.TrustLevelPattern;
import trust.pattern.TrustPattern;
import trust.pattern.TrustRecommendationPattern;
import trust.pattern.TrustRelationshipPattern;
import trust.pattern.TrusteeScopePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRelationshipPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustDegreePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRecommendationPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trusteeScopePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dispositionalScopePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemScopePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass situationalScopePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personalScopePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustLevelPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directTrustPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arbitraryTrustPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experienceTrustPatternEClass = null;

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
   * @see trust.pattern.PatternPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PatternPackageImpl() {
    super(eNS_URI, PatternFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PatternPackage init() {
    if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

    // Obtain or create and register package
    PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ContextPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);
    InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
    ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

    // Create package meta-data objects
    thePatternPackage.createPackageContents();
    theTrustPackage.createPackageContents();
    theInstancePackage.createPackageContents();
    theActionPackage.createPackageContents();

    // Initialize created meta-data
    thePatternPackage.initializePackageContents();
    theTrustPackage.initializePackageContents();
    theInstancePackage.initializePackageContents();
    theActionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePatternPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
    return thePatternPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRelationshipPattern() {
    return trustRelationshipPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationshipPattern_Aspect() {
    return (EReference)trustRelationshipPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationshipPattern_Degree() {
    return (EReference)trustRelationshipPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationshipPattern_Trustor() {
    return (EReference)trustRelationshipPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationshipPattern_TimeInterval() {
    return (EReference)trustRelationshipPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRelationshipPattern_TrusteeScope() {
    return (EReference)trustRelationshipPatternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustDegreePattern() {
    return trustDegreePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustDegreePattern_Degree() {
    return (EReference)trustDegreePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRecommendationPattern() {
    return trustRecommendationPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRecommendationPattern_Recommender() {
    return (EReference)trustRecommendationPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRecommendationPattern_TrustRelationship() {
    return (EReference)trustRecommendationPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustPattern() {
    return trustPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrusteeScopePattern() {
    return trusteeScopePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDispositionalScopePattern() {
    return dispositionalScopePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemScopePattern() {
    return systemScopePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSituationalScopePattern() {
    return situationalScopePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersonalScopePattern() {
    return personalScopePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPersonalScopePattern_Trustee() {
    return (EReference)personalScopePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustLevelPattern() {
    return trustLevelPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrustLevelPattern_Level() {
    return (EAttribute)trustLevelPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectTrustPattern() {
    return directTrustPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArbitraryTrustPattern() {
    return arbitraryTrustPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperienceTrustPattern() {
    return experienceTrustPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternFactory getPatternFactory() {
    return (PatternFactory)getEFactoryInstance();
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
    trustRelationshipPatternEClass = createEClass(TRUST_RELATIONSHIP_PATTERN);
    createEReference(trustRelationshipPatternEClass, TRUST_RELATIONSHIP_PATTERN__ASPECT);
    createEReference(trustRelationshipPatternEClass, TRUST_RELATIONSHIP_PATTERN__DEGREE);
    createEReference(trustRelationshipPatternEClass, TRUST_RELATIONSHIP_PATTERN__TRUSTOR);
    createEReference(trustRelationshipPatternEClass, TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL);
    createEReference(trustRelationshipPatternEClass, TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE);

    trustDegreePatternEClass = createEClass(TRUST_DEGREE_PATTERN);
    createEReference(trustDegreePatternEClass, TRUST_DEGREE_PATTERN__DEGREE);

    trustRecommendationPatternEClass = createEClass(TRUST_RECOMMENDATION_PATTERN);
    createEReference(trustRecommendationPatternEClass, TRUST_RECOMMENDATION_PATTERN__RECOMMENDER);
    createEReference(trustRecommendationPatternEClass, TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP);

    trustPatternEClass = createEClass(TRUST_PATTERN);

    trusteeScopePatternEClass = createEClass(TRUSTEE_SCOPE_PATTERN);

    dispositionalScopePatternEClass = createEClass(DISPOSITIONAL_SCOPE_PATTERN);

    systemScopePatternEClass = createEClass(SYSTEM_SCOPE_PATTERN);

    situationalScopePatternEClass = createEClass(SITUATIONAL_SCOPE_PATTERN);

    personalScopePatternEClass = createEClass(PERSONAL_SCOPE_PATTERN);
    createEReference(personalScopePatternEClass, PERSONAL_SCOPE_PATTERN__TRUSTEE);

    trustLevelPatternEClass = createEClass(TRUST_LEVEL_PATTERN);
    createEAttribute(trustLevelPatternEClass, TRUST_LEVEL_PATTERN__LEVEL);

    directTrustPatternEClass = createEClass(DIRECT_TRUST_PATTERN);

    arbitraryTrustPatternEClass = createEClass(ARBITRARY_TRUST_PATTERN);

    experienceTrustPatternEClass = createEClass(EXPERIENCE_TRUST_PATTERN);
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
    InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
    identity.pattern.PatternPackage thePatternPackage_1 = (identity.pattern.PatternPackage)EPackage.Registry.INSTANCE.getEPackage(identity.pattern.PatternPackage.eNS_URI);
    TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
    ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    trustRelationshipPatternEClass.getESuperTypes().add(this.getTrustPattern());
    trustDegreePatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
    trustRecommendationPatternEClass.getESuperTypes().add(this.getTrustPattern());
    trustPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
    trusteeScopePatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
    dispositionalScopePatternEClass.getESuperTypes().add(this.getTrusteeScopePattern());
    systemScopePatternEClass.getESuperTypes().add(this.getTrusteeScopePattern());
    situationalScopePatternEClass.getESuperTypes().add(this.getTrusteeScopePattern());
    personalScopePatternEClass.getESuperTypes().add(this.getSituationalScopePattern());
    trustLevelPatternEClass.getESuperTypes().add(this.getTrustDegreePattern());
    directTrustPatternEClass.getESuperTypes().add(this.getTrustRelationshipPattern());
    arbitraryTrustPatternEClass.getESuperTypes().add(this.getDirectTrustPattern());
    experienceTrustPatternEClass.getESuperTypes().add(this.getDirectTrustPattern());

    // Initialize classes, features, and operations; add parameters
    initEClass(trustRelationshipPatternEClass, TrustRelationshipPattern.class, "TrustRelationshipPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRelationshipPattern_Aspect(), theInstancePackage.getTrustAspect(), null, "aspect", null, 0, 1, TrustRelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationshipPattern_Degree(), this.getTrustDegreePattern(), null, "degree", null, 0, 1, TrustRelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationshipPattern_Trustor(), thePatternPackage_1.getIdentityPattern(), null, "trustor", null, 0, 1, TrustRelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationshipPattern_TimeInterval(), theTimePackage.getTimeInterval(), null, "timeInterval", null, 0, 1, TrustRelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRelationshipPattern_TrusteeScope(), this.getTrusteeScopePattern(), null, "trusteeScope", null, 0, 1, TrustRelationshipPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustDegreePatternEClass, TrustDegreePattern.class, "TrustDegreePattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustDegreePattern_Degree(), theInstancePackage.getLikelihoodMeasurement(), null, "degree", null, 0, 1, TrustDegreePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustRecommendationPatternEClass, TrustRecommendationPattern.class, "TrustRecommendationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRecommendationPattern_Recommender(), thePatternPackage_1.getIdentityPattern(), null, "recommender", null, 0, 1, TrustRecommendationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRecommendationPattern_TrustRelationship(), this.getTrustRelationshipPattern(), null, "trustRelationship", null, 0, 1, TrustRecommendationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustPatternEClass, TrustPattern.class, "TrustPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trusteeScopePatternEClass, TrusteeScopePattern.class, "TrusteeScopePattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dispositionalScopePatternEClass, DispositionalScopePattern.class, "DispositionalScopePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemScopePatternEClass, SystemScopePattern.class, "SystemScopePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(situationalScopePatternEClass, SituationalScopePattern.class, "SituationalScopePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(personalScopePatternEClass, PersonalScopePattern.class, "PersonalScopePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPersonalScopePattern_Trustee(), thePatternPackage_1.getIdentityPattern(), null, "trustee", null, 0, 1, PersonalScopePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustLevelPatternEClass, TrustLevelPattern.class, "TrustLevelPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrustLevelPattern_Level(), theInstancePackage.getTrustLevel(), "level", "Unspecified", 0, 1, TrustLevelPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directTrustPatternEClass, DirectTrustPattern.class, "DirectTrustPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arbitraryTrustPatternEClass, ArbitraryTrustPattern.class, "ArbitraryTrustPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(experienceTrustPatternEClass, ExperienceTrustPattern.class, "ExperienceTrustPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
  }

} //PatternPackageImpl
