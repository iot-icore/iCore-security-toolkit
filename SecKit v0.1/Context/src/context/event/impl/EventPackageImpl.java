/**
 */
package context.event.impl;

import context.ContextPackage;

import context.event.ContextInformationEvent;
import context.event.ContextInformationEventPattern;
import context.event.ContextSituationEvent;
import context.event.ContextSituationEventPattern;
import context.event.ContextSituationLifecycle;
import context.event.EventFactory;
import context.event.EventPackage;

import context.impl.ContextPackageImpl;

import context.instance.InstancePackage;

import context.instance.impl.InstancePackageImpl;

import context.instance.tmp.TmpPackage;

import context.instance.tmp.impl.TmpPackageImpl;

import context.instantiation.InstantiationPackage;

import context.instantiation.impl.InstantiationPackageImpl;

import context.management.ManagementPackage;

import context.management.impl.ManagementPackageImpl;

import context.pattern.PatternPackage;

import context.pattern.impl.PatternPackageImpl;

import context.type.TypePackage;

import context.type.impl.TypePackageImpl;

import identity.IdentityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
    private EClass contextSituationEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextInformationEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextSituationEventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextInformationEventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum contextSituationLifecycleEEnum = null;

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
     * @see context.event.EventPackage#eNS_URI
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
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) : ManagementPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) : TmpPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

        // Create package meta-data objects
        theEventPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theManagementPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTmpPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();

        // Initialize created meta-data
        theEventPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theManagementPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTmpPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();

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
    public EClass getContextSituationEvent() {
        return contextSituationEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextSituationEvent_Lifecycle() {
        return (EAttribute)contextSituationEventEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationEvent_SituationValue() {
        return (EReference)contextSituationEventEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextInformationEvent() {
        return contextInformationEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextSituationEventPattern() {
        return contextSituationEventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationEventPattern_ContextSituationPattern() {
        return (EReference)contextSituationEventPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextSituationEventPattern_Lifecycle() {
        return (EAttribute)contextSituationEventPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextInformationEventPattern() {
        return contextInformationEventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationEventPattern_ContextInformationPattern() {
        return (EReference)contextInformationEventPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getContextSituationLifecycle() {
        return contextSituationLifecycleEEnum;
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
        contextSituationEventEClass = createEClass(CONTEXT_SITUATION_EVENT);
        createEAttribute(contextSituationEventEClass, CONTEXT_SITUATION_EVENT__LIFECYCLE);
        createEReference(contextSituationEventEClass, CONTEXT_SITUATION_EVENT__SITUATION_VALUE);

        contextInformationEventEClass = createEClass(CONTEXT_INFORMATION_EVENT);

        contextSituationEventPatternEClass = createEClass(CONTEXT_SITUATION_EVENT_PATTERN);
        createEReference(contextSituationEventPatternEClass, CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN);
        createEAttribute(contextSituationEventPatternEClass, CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE);

        contextInformationEventPatternEClass = createEClass(CONTEXT_INFORMATION_EVENT_PATTERN);
        createEReference(contextInformationEventPatternEClass, CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN);

        // Create enums
        contextSituationLifecycleEEnum = createEEnum(CONTEXT_SITUATION_LIFECYCLE);
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
        data.event.EventPackage theEventPackage_2 = (data.event.EventPackage)EPackage.Registry.INSTANCE.getEPackage(data.event.EventPackage.eNS_URI);
        ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextSituationEventEClass.getESuperTypes().add(theEventPackage_1.getEvent());
        contextInformationEventEClass.getESuperTypes().add(theEventPackage_2.getDataEvent());
        contextInformationEventEClass.getESuperTypes().add(theEventPackage_1.getEvent());
        contextSituationEventPatternEClass.getESuperTypes().add(theConditionPackage.getEventPattern());
        contextInformationEventPatternEClass.getESuperTypes().add(theEventPackage_2.getAbstractDataEventPattern());
        contextInformationEventPatternEClass.getESuperTypes().add(theConditionPackage.getEventPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(contextSituationEventEClass, ContextSituationEvent.class, "ContextSituationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContextSituationEvent_Lifecycle(), this.getContextSituationLifecycle(), "lifecycle", null, 0, 1, ContextSituationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituationEvent_SituationValue(), theInstancePackage.getContextSituation(), null, "situationValue", null, 1, 1, ContextSituationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextInformationEventEClass, ContextInformationEvent.class, "ContextInformationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contextSituationEventPatternEClass, ContextSituationEventPattern.class, "ContextSituationEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextSituationEventPattern_ContextSituationPattern(), thePatternPackage.getContextSituationPattern(), null, "contextSituationPattern", null, 1, 1, ContextSituationEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextSituationEventPattern_Lifecycle(), this.getContextSituationLifecycle(), "lifecycle", null, 0, 1, ContextSituationEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextInformationEventPatternEClass, ContextInformationEventPattern.class, "ContextInformationEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextInformationEventPattern_ContextInformationPattern(), thePatternPackage.getContextInformationPattern(), null, "contextInformationPattern", null, 1, 1, ContextInformationEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(contextSituationLifecycleEEnum, ContextSituationLifecycle.class, "ContextSituationLifecycle");
        addEEnumLiteral(contextSituationLifecycleEEnum, ContextSituationLifecycle.STARTED);
        addEEnumLiteral(contextSituationLifecycleEEnum, ContextSituationLifecycle.ONGOING);
        addEEnumLiteral(contextSituationLifecycleEEnum, ContextSituationLifecycle.FINISHED);
    }

} //EventPackageImpl
