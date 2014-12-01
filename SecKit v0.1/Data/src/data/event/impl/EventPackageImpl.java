/**
 */
package data.event.impl;

import data.DataPackage;

import data.action.ActionPackage;

import data.action.impl.ActionPackageImpl;

import data.event.AbstractDataEventPattern;
import data.event.DataEvent;
import data.event.DataEventPattern;
import data.event.DataLifecycle;
import data.event.EventFactory;
import data.event.EventPackage;

import data.impl.DataPackageImpl;

import data.instance.InstancePackage;

import data.instance.impl.InstancePackageImpl;

import data.instantiation.InstantiationPackage;

import data.instantiation.impl.InstantiationPackageImpl;

import data.pattern.PatternPackage;

import data.pattern.impl.PatternPackageImpl;

import data.type.TypePackage;

import data.type.impl.TypePackageImpl;

import data.variable.VariablePackage;

import data.variable.impl.VariablePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

import rule.condition.ConditionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventPackageImpl extends EPackageImpl implements EventPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDataEventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataEventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dataLifecycleEEnum = null;

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
     * @see data.event.EventPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EventPackageImpl() {
        super(eNS_URI, EventFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link EventPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EventPackage init() {
        if (isInited) return (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);

        // Obtain or create and register package
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RulePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theEventPackage.createPackageContents();
        theDataPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theEventPackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theEventPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EventPackage.eNS_URI, theEventPackage);
        return theEventPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataEvent() {
        return dataEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataEvent_EType() {
        return (EReference)dataEventEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataEvent_DataInstance() {
        return (EReference)dataEventEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataEvent_Lifecycle() {
        return (EAttribute)dataEventEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDataEventPattern() {
        return abstractDataEventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractDataEventPattern_Lifecycle() {
        return (EAttribute)abstractDataEventPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataEventPattern_DataPattern() {
        return (EReference)abstractDataEventPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataEventPattern() {
        return dataEventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDataLifecycle() {
        return dataLifecycleEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventFactory getEventFactory() {
        return (EventFactory)getEFactoryInstance();
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
        dataEventEClass = createEClass(DATA_EVENT);
        createEReference(dataEventEClass, DATA_EVENT__ETYPE);
        createEReference(dataEventEClass, DATA_EVENT__DATA_INSTANCE);
        createEAttribute(dataEventEClass, DATA_EVENT__LIFECYCLE);

        abstractDataEventPatternEClass = createEClass(ABSTRACT_DATA_EVENT_PATTERN);
        createEAttribute(abstractDataEventPatternEClass, ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE);
        createEReference(abstractDataEventPatternEClass, ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN);

        dataEventPatternEClass = createEClass(DATA_EVENT_PATTERN);

        // Create enums
        dataLifecycleEEnum = createEEnum(DATA_LIFECYCLE);
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
        rule.event.EventPackage theEventPackage_1 = (rule.event.EventPackage)EPackage.Registry.INSTANCE.getEPackage(rule.event.EventPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataEventEClass.getESuperTypes().add(theEventPackage_1.getEvent());
        abstractDataEventPatternEClass.getESuperTypes().add(theConditionPackage.getEventPattern());
        dataEventPatternEClass.getESuperTypes().add(this.getAbstractDataEventPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(dataEventEClass, DataEvent.class, "DataEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataEvent_EType(), ecorePackage.getEClassifier(), null, "eType", null, 0, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataEvent_DataInstance(), theInstancePackage.getData(), null, "dataInstance", null, 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataEvent_Lifecycle(), this.getDataLifecycle(), "lifecycle", null, 0, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractDataEventPatternEClass, AbstractDataEventPattern.class, "AbstractDataEventPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractDataEventPattern_Lifecycle(), this.getDataLifecycle(), "lifecycle", null, 0, 1, AbstractDataEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDataEventPattern_DataPattern(), thePatternPackage.getDataPattern(), null, "dataPattern", null, 0, 1, AbstractDataEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataEventPatternEClass, DataEventPattern.class, "DataEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(dataLifecycleEEnum, DataLifecycle.class, "DataLifecycle");
        addEEnumLiteral(dataLifecycleEEnum, DataLifecycle.CREATED);
        addEEnumLiteral(dataLifecycleEEnum, DataLifecycle.EXISTS);
        addEEnumLiteral(dataLifecycleEEnum, DataLifecycle.DELETED);
    }

} //EventPackageImpl
