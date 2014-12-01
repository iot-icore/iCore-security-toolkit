/**
 */
package behavior.variable.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.CausalityPackage;

import behavior.causality.impl.CausalityPackageImpl;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.ConstraintPackage;

import behavior.constraint.impl.ConstraintPackageImpl;

import behavior.event.EventPackage;

import behavior.event.impl.EventPackageImpl;

import behavior.impl.BehaviorPackageImpl;

import behavior.instance.InstancePackage;

import behavior.instance.impl.InstancePackageImpl;

import behavior.instantiation.InstantiationPackage;

import behavior.instantiation.impl.InstantiationPackageImpl;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.QualityPackage;

import behavior.quality.impl.QualityPackageImpl;

import behavior.trust.TrustPackage;

import behavior.trust.impl.TrustPackageImpl;

import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.ActivityInstanceVariable;
import behavior.variable.ActivityInstantiationVariable;
import behavior.variable.ActivityTypeVariable;
import behavior.variable.ActivityVariable;
import behavior.variable.BehaviorInstanceVariable;
import behavior.variable.BehaviorInstantiationVariable;
import behavior.variable.BehaviorTypeVariable;
import behavior.variable.BehaviorVariable;
import behavior.variable.FlowPointInstanceVariable;
import behavior.variable.FlowPointInstantiationVariable;
import behavior.variable.FlowPointTypeVariable;
import behavior.variable.FlowPointVariable;
import behavior.variable.VariableFactory;
import behavior.variable.VariablePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariablePackageImpl extends EPackageImpl implements VariablePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityTypeVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityInstantiationVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorTypeVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointTypeVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointInstantiationVariableEClass = null;

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
     * @see behavior.variable.VariablePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VariablePackageImpl() {
        super(eNS_URI, VariableFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VariablePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VariablePackage init() {
        if (isInited) return (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

        // Obtain or create and register package
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariablePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theVariablePackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theVariablePackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theVariablePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VariablePackage.eNS_URI, theVariablePackage);
        return theVariablePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityVariable() {
        return activityVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityTypeVariable() {
        return activityTypeVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityInstantiationVariable() {
        return activityInstantiationVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityInstanceVariable() {
        return activityInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointVariable() {
        return flowPointVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorVariable() {
        return behaviorVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorTypeVariable() {
        return behaviorTypeVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiationVariable() {
        return behaviorInstantiationVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstanceVariable() {
        return behaviorInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointTypeVariable() {
        return flowPointTypeVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointInstanceVariable() {
        return flowPointInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointInstantiationVariable() {
        return flowPointInstantiationVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableFactory getVariableFactory() {
        return (VariableFactory)getEFactoryInstance();
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
        activityVariableEClass = createEClass(ACTIVITY_VARIABLE);

        activityTypeVariableEClass = createEClass(ACTIVITY_TYPE_VARIABLE);

        activityInstantiationVariableEClass = createEClass(ACTIVITY_INSTANTIATION_VARIABLE);

        activityInstanceVariableEClass = createEClass(ACTIVITY_INSTANCE_VARIABLE);

        flowPointVariableEClass = createEClass(FLOW_POINT_VARIABLE);

        behaviorVariableEClass = createEClass(BEHAVIOR_VARIABLE);

        behaviorTypeVariableEClass = createEClass(BEHAVIOR_TYPE_VARIABLE);

        behaviorInstantiationVariableEClass = createEClass(BEHAVIOR_INSTANTIATION_VARIABLE);

        behaviorInstanceVariableEClass = createEClass(BEHAVIOR_INSTANCE_VARIABLE);

        flowPointTypeVariableEClass = createEClass(FLOW_POINT_TYPE_VARIABLE);

        flowPointInstanceVariableEClass = createEClass(FLOW_POINT_INSTANCE_VARIABLE);

        flowPointInstantiationVariableEClass = createEClass(FLOW_POINT_INSTANTIATION_VARIABLE);
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
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        activityVariableEClass.getESuperTypes().add(theVariablePackage_1.getVariableDeclaration());
        activityTypeVariableEClass.getESuperTypes().add(this.getActivityVariable());
        activityInstantiationVariableEClass.getESuperTypes().add(this.getActivityVariable());
        activityInstanceVariableEClass.getESuperTypes().add(this.getActivityVariable());
        flowPointVariableEClass.getESuperTypes().add(theVariablePackage_1.getVariableDeclaration());
        behaviorVariableEClass.getESuperTypes().add(theVariablePackage_1.getVariableDeclaration());
        behaviorTypeVariableEClass.getESuperTypes().add(this.getBehaviorVariable());
        behaviorInstantiationVariableEClass.getESuperTypes().add(this.getBehaviorVariable());
        behaviorInstanceVariableEClass.getESuperTypes().add(this.getBehaviorVariable());
        flowPointTypeVariableEClass.getESuperTypes().add(this.getFlowPointVariable());
        flowPointInstanceVariableEClass.getESuperTypes().add(this.getFlowPointVariable());
        flowPointInstantiationVariableEClass.getESuperTypes().add(this.getFlowPointVariable());

        // Initialize classes, features, and operations; add parameters
        initEClass(activityVariableEClass, ActivityVariable.class, "ActivityVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(activityTypeVariableEClass, ActivityTypeVariable.class, "ActivityTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(activityInstantiationVariableEClass, ActivityInstantiationVariable.class, "ActivityInstantiationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(activityInstanceVariableEClass, ActivityInstanceVariable.class, "ActivityInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(flowPointVariableEClass, FlowPointVariable.class, "FlowPointVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorVariableEClass, BehaviorVariable.class, "BehaviorVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorTypeVariableEClass, BehaviorTypeVariable.class, "BehaviorTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorInstantiationVariableEClass, BehaviorInstantiationVariable.class, "BehaviorInstantiationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorInstanceVariableEClass, BehaviorInstanceVariable.class, "BehaviorInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(flowPointTypeVariableEClass, FlowPointTypeVariable.class, "FlowPointTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(flowPointInstanceVariableEClass, FlowPointInstanceVariable.class, "FlowPointInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(flowPointInstantiationVariableEClass, FlowPointInstantiationVariable.class, "FlowPointInstantiationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //VariablePackageImpl
