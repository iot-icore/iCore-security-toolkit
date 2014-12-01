/**
 */
package behavior.type.action.impl;

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

import behavior.type.action.ActionFactory;
import behavior.type.action.ActionPackage;
import behavior.type.action.Create;
import behavior.type.action.Delete;
import behavior.type.action.DiscoverEntity;
import behavior.type.action.HumanAction;
import behavior.type.action.PersistenceStorageActionType;
import behavior.type.action.Read;
import behavior.type.action.Update;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

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
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass createEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass updateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deleteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass persistenceStorageActionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass humanActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass discoverEntityEClass = null;

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
     * @see behavior.type.action.ActionPackage#eNS_URI
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
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theActionPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theActionPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

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
    public EClass getCreate() {
        return createEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRead() {
        return readEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUpdate() {
        return updateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelete() {
        return deleteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPersistenceStorageActionType() {
        return persistenceStorageActionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHumanAction() {
        return humanActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiscoverEntity() {
        return discoverEntityEClass;
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
        createEClass = createEClass(CREATE);

        readEClass = createEClass(READ);

        updateEClass = createEClass(UPDATE);

        deleteEClass = createEClass(DELETE);

        persistenceStorageActionTypeEClass = createEClass(PERSISTENCE_STORAGE_ACTION_TYPE);

        humanActionEClass = createEClass(HUMAN_ACTION);

        discoverEntityEClass = createEClass(DISCOVER_ENTITY);
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
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        createEClass.getESuperTypes().add(this.getPersistenceStorageActionType());
        readEClass.getESuperTypes().add(this.getPersistenceStorageActionType());
        updateEClass.getESuperTypes().add(this.getPersistenceStorageActionType());
        deleteEClass.getESuperTypes().add(this.getPersistenceStorageActionType());
        persistenceStorageActionTypeEClass.getESuperTypes().add(theTypePackage.getActionType());
        humanActionEClass.getESuperTypes().add(theTypePackage.getActionType());
        discoverEntityEClass.getESuperTypes().add(theTypePackage.getActionType());

        // Initialize classes, features, and operations; add parameters
        initEClass(createEClass, Create.class, "Create", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(readEClass, Read.class, "Read", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(updateEClass, Update.class, "Update", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(deleteEClass, Delete.class, "Delete", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(persistenceStorageActionTypeEClass, PersistenceStorageActionType.class, "PersistenceStorageActionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(humanActionEClass, HumanAction.class, "HumanAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(discoverEntityEClass, DiscoverEntity.class, "DiscoverEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //ActionPackageImpl
