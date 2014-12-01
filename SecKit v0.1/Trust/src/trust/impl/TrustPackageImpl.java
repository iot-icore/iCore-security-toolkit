/**
 */
package trust.impl;

import context.ContextPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import trust.TrustDesignModel;
import trust.TrustFactory;
import trust.TrustPackage;
import trust.TrustRuntimeModel;

import trust.action.ActionPackage;

import trust.action.impl.ActionPackageImpl;

import trust.instance.InstancePackage;

import trust.instance.impl.InstancePackageImpl;

import trust.pattern.PatternPackage;

import trust.pattern.impl.PatternPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustPackageImpl extends EPackageImpl implements TrustPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustRuntimeModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustDesignModelEClass = null;

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
   * @see trust.TrustPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TrustPackageImpl() {
    super(eNS_URI, TrustFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TrustPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TrustPackage init() {
    if (isInited) return (TrustPackage)EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI);

    // Obtain or create and register package
    TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TrustPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ContextPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
    PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
    ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

    // Create package meta-data objects
    theTrustPackage.createPackageContents();
    theInstancePackage.createPackageContents();
    thePatternPackage.createPackageContents();
    theActionPackage.createPackageContents();

    // Initialize created meta-data
    theTrustPackage.initializePackageContents();
    theInstancePackage.initializePackageContents();
    thePatternPackage.initializePackageContents();
    theActionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTrustPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TrustPackage.eNS_URI, theTrustPackage);
    return theTrustPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustRuntimeModel() {
    return trustRuntimeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRuntimeModel_TrustRecommendations() {
    return (EReference)trustRuntimeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRuntimeModel_TrustRelationships() {
    return (EReference)trustRuntimeModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustRuntimeModel_Evidence() {
    return (EReference)trustRuntimeModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustDesignModel() {
    return trustDesignModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustDesignModel_TrustAspects() {
    return (EReference)trustDesignModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustFactory getTrustFactory() {
    return (TrustFactory)getEFactoryInstance();
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
    trustRuntimeModelEClass = createEClass(TRUST_RUNTIME_MODEL);
    createEReference(trustRuntimeModelEClass, TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS);
    createEReference(trustRuntimeModelEClass, TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS);
    createEReference(trustRuntimeModelEClass, TRUST_RUNTIME_MODEL__EVIDENCE);

    trustDesignModelEClass = createEClass(TRUST_DESIGN_MODEL);
    createEReference(trustDesignModelEClass, TRUST_DESIGN_MODEL__TRUST_ASPECTS);
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
    PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
    ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
    ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

    // Add subpackages
    getESubpackages().add(theInstancePackage);
    getESubpackages().add(thePatternPackage);
    getESubpackages().add(theActionPackage);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    trustRuntimeModelEClass.getESuperTypes().add(theModelsPackage.getModel());
    trustDesignModelEClass.getESuperTypes().add(theModelsPackage.getModel());

    // Initialize classes, features, and operations; add parameters
    initEClass(trustRuntimeModelEClass, TrustRuntimeModel.class, "TrustRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustRuntimeModel_TrustRecommendations(), theInstancePackage.getTrustRecommendation(), null, "trustRecommendations", null, 0, -1, TrustRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRuntimeModel_TrustRelationships(), theInstancePackage.getTrustRelationship(), null, "trustRelationships", null, 0, -1, TrustRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrustRuntimeModel_Evidence(), theInstancePackage.getEvidence(), null, "evidence", null, 0, -1, TrustRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trustDesignModelEClass, TrustDesignModel.class, "TrustDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustDesignModel_TrustAspects(), theInstancePackage.getTrustAspect(), null, "trustAspects", null, 0, -1, TrustDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TrustPackageImpl
