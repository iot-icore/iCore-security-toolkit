/**
 */
package trust.action.impl;

import context.ContextPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import trust.TrustPackage;

import trust.action.ActionFactory;
import trust.action.ActionPackage;
import trust.action.AddBeliefEvidence;
import trust.action.AddDisbeliefEvidence;
import trust.action.AddEvidence;
import trust.action.FuseOpinion;
import trust.action.ManageOpinion;
import trust.action.SetOpinion;
import trust.action.TrustManagementAction;

import trust.impl.TrustPackageImpl;

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
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trustManagementActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addBeliefEvidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addDisbeliefEvidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addEvidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuseOpinionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setOpinionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manageOpinionEClass = null;

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
   * @see trust.action.ActionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ActionPackageImpl() {
    super(eNS_URI, ActionFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ActionPackage init() {
    if (isInited) return (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

    // Obtain or create and register package
    ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ContextPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);
    InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
    PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

    // Create package meta-data objects
    theActionPackage.createPackageContents();
    theTrustPackage.createPackageContents();
    theInstancePackage.createPackageContents();
    thePatternPackage.createPackageContents();

    // Initialize created meta-data
    theActionPackage.initializePackageContents();
    theTrustPackage.initializePackageContents();
    theInstancePackage.initializePackageContents();
    thePatternPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theActionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
    return theActionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrustManagementAction() {
    return trustManagementActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrustManagementAction_TrustPattern() {
    return (EReference)trustManagementActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddBeliefEvidence() {
    return addBeliefEvidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddDisbeliefEvidence() {
    return addDisbeliefEvidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddEvidence() {
    return addEvidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddEvidence_Amount() {
    return (EAttribute)addEvidenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuseOpinion() {
    return fuseOpinionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetOpinion() {
    return setOpinionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManageOpinion() {
    return manageOpinionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManageOpinion_Opinion() {
    return (EAttribute)manageOpinionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionFactory getActionFactory() {
    return (ActionFactory)getEFactoryInstance();
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
    trustManagementActionEClass = createEClass(TRUST_MANAGEMENT_ACTION);
    createEReference(trustManagementActionEClass, TRUST_MANAGEMENT_ACTION__TRUST_PATTERN);

    addBeliefEvidenceEClass = createEClass(ADD_BELIEF_EVIDENCE);

    addDisbeliefEvidenceEClass = createEClass(ADD_DISBELIEF_EVIDENCE);

    addEvidenceEClass = createEClass(ADD_EVIDENCE);
    createEAttribute(addEvidenceEClass, ADD_EVIDENCE__AMOUNT);

    fuseOpinionEClass = createEClass(FUSE_OPINION);

    setOpinionEClass = createEClass(SET_OPINION);

    manageOpinionEClass = createEClass(MANAGE_OPINION);
    createEAttribute(manageOpinionEClass, MANAGE_OPINION__OPINION);
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
    rule.action.ActionPackage theActionPackage_1 = (rule.action.ActionPackage)EPackage.Registry.INSTANCE.getEPackage(rule.action.ActionPackage.eNS_URI);
    PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
    InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    trustManagementActionEClass.getESuperTypes().add(theActionPackage_1.getExecute());
    addBeliefEvidenceEClass.getESuperTypes().add(this.getAddEvidence());
    addDisbeliefEvidenceEClass.getESuperTypes().add(this.getAddEvidence());
    addEvidenceEClass.getESuperTypes().add(this.getTrustManagementAction());
    fuseOpinionEClass.getESuperTypes().add(this.getManageOpinion());
    setOpinionEClass.getESuperTypes().add(this.getManageOpinion());
    manageOpinionEClass.getESuperTypes().add(this.getTrustManagementAction());

    // Initialize classes, features, and operations; add parameters
    initEClass(trustManagementActionEClass, TrustManagementAction.class, "TrustManagementAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrustManagementAction_TrustPattern(), thePatternPackage.getTrustRelationshipPattern(), null, "trustPattern", null, 0, 1, TrustManagementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addBeliefEvidenceEClass, AddBeliefEvidence.class, "AddBeliefEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addDisbeliefEvidenceEClass, AddDisbeliefEvidence.class, "AddDisbeliefEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addEvidenceEClass, AddEvidence.class, "AddEvidence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddEvidence_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, AddEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fuseOpinionEClass, FuseOpinion.class, "FuseOpinion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setOpinionEClass, SetOpinion.class, "SetOpinion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(manageOpinionEClass, ManageOpinion.class, "ManageOpinion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManageOpinion_Opinion(), theInstancePackage.getSubjectiveOpinion(), "opinion", null, 0, 1, ManageOpinion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  }

} //ActionPackageImpl
