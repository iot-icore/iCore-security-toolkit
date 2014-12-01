/**
 */
package rule.state.impl;

import java.util.BitSet;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

import rule.action.ActionPackage;

import rule.action.impl.ActionPackageImpl;

import rule.condition.ConditionPackage;

import rule.condition.impl.ConditionPackageImpl;

import rule.event.EventPackage;

import rule.event.impl.EventPackageImpl;

import rule.impl.RulePackageImpl;

import rule.propositional.PropositionalPackage;

import rule.propositional.impl.PropositionalPackageImpl;

import rule.state.AbstractState;
import rule.state.CounterState;
import rule.state.EventPatternState;
import rule.state.RepSinceState;
import rule.state.RepState;
import rule.state.State;
import rule.state.StateFactory;
import rule.state.StatePackage;
import rule.state.TimeBoundedState;

import rule.template.TemplatePackage;

import rule.template.impl.TemplatePackageImpl;

import rule.temporal.TemporalPackage;

import rule.temporal.impl.TemporalPackageImpl;

import rule.test.TestPackage;

import rule.test.impl.TestPackageImpl;

import time.TimePackage;

import utils.CircularBuffer;
import utils.StateHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatePackageImpl extends EPackageImpl implements StatePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventPatternStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeBoundedStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass counterStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repSinceStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType circularBufferEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType bitSetEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stateHandlerEDataType = null;

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
     * @see rule.state.StatePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StatePackageImpl() {
        super(eNS_URI, StateFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link StatePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StatePackage init() {
        if (isInited) return (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

        // Obtain or create and register package
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theStatePackage.createPackageContents();
        theRulePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        theConditionPackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theStatePackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStatePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, theStatePackage);
        return theStatePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getState() {
        return stateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Parent() {
        return (EReference)stateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Children() {
        return (EReference)stateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Atom() {
        return (EReference)stateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Value() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_PreviousValue() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_RuleInstance() {
        return (EReference)stateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Handler() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Immutable() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventPatternState() {
        return eventPatternStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEventPatternState_EventPattern() {
        return (EReference)eventPatternStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepState() {
        return repStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRepState_CounterState() {
        return (EReference)repStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeBoundedState() {
        return timeBoundedStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeBoundedState_PreviousValues() {
        return (EAttribute)timeBoundedStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeBoundedState_Position() {
        return (EAttribute)timeBoundedStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCounterState() {
        return counterStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCounterState_True() {
        return (EAttribute)counterStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCounterState_Undetermined() {
        return (EAttribute)counterStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepSinceState() {
        return repSinceStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRepSinceState_Unds() {
        return (EReference)repSinceStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractState() {
        return abstractStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getCircularBuffer() {
        return circularBufferEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBitSet() {
        return bitSetEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getStateHandler() {
        return stateHandlerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateFactory getStateFactory() {
        return (StateFactory)getEFactoryInstance();
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
        stateEClass = createEClass(STATE);
        createEReference(stateEClass, STATE__PARENT);
        createEReference(stateEClass, STATE__CHILDREN);
        createEReference(stateEClass, STATE__ATOM);
        createEAttribute(stateEClass, STATE__VALUE);
        createEAttribute(stateEClass, STATE__PREVIOUS_VALUE);
        createEReference(stateEClass, STATE__RULE_INSTANCE);
        createEAttribute(stateEClass, STATE__HANDLER);
        createEAttribute(stateEClass, STATE__IMMUTABLE);

        eventPatternStateEClass = createEClass(EVENT_PATTERN_STATE);
        createEReference(eventPatternStateEClass, EVENT_PATTERN_STATE__EVENT_PATTERN);

        repStateEClass = createEClass(REP_STATE);
        createEReference(repStateEClass, REP_STATE__COUNTER_STATE);

        timeBoundedStateEClass = createEClass(TIME_BOUNDED_STATE);
        createEAttribute(timeBoundedStateEClass, TIME_BOUNDED_STATE__PREVIOUS_VALUES);
        createEAttribute(timeBoundedStateEClass, TIME_BOUNDED_STATE__POSITION);

        counterStateEClass = createEClass(COUNTER_STATE);
        createEAttribute(counterStateEClass, COUNTER_STATE__TRUE);
        createEAttribute(counterStateEClass, COUNTER_STATE__UNDETERMINED);

        repSinceStateEClass = createEClass(REP_SINCE_STATE);
        createEReference(repSinceStateEClass, REP_SINCE_STATE__UNDS);

        abstractStateEClass = createEClass(ABSTRACT_STATE);

        // Create data types
        circularBufferEDataType = createEDataType(CIRCULAR_BUFFER);
        bitSetEDataType = createEDataType(BIT_SET);
        stateHandlerEDataType = createEDataType(STATE_HANDLER);
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
        ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);
        TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        stateEClass.getESuperTypes().add(this.getAbstractState());
        eventPatternStateEClass.getESuperTypes().add(this.getState());
        repStateEClass.getESuperTypes().add(this.getState());
        timeBoundedStateEClass.getESuperTypes().add(this.getState());
        counterStateEClass.getESuperTypes().add(this.getAbstractState());
        repSinceStateEClass.getESuperTypes().add(this.getRepState());
        abstractStateEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getState_Parent(), this.getState(), this.getState_Children(), "parent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Children(), this.getState(), this.getState_Parent(), "children", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Atom(), theConditionPackage.getAtom(), null, "atom", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Value(), theConditionPackage.getTruthValue(), "value", "FALSE", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_PreviousValue(), theConditionPackage.getTruthValue(), "previousValue", "TRUE", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_RuleInstance(), theTemplatePackage.getRuleInstance(), theTemplatePackage.getRuleInstance_States(), "ruleInstance", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Handler(), this.getStateHandler(), "handler", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Immutable(), ecorePackage.getEBoolean(), "immutable", "false", 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventPatternStateEClass, EventPatternState.class, "EventPatternState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEventPatternState_EventPattern(), theConditionPackage.getEventPattern(), null, "eventPattern", null, 1, 1, EventPatternState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repStateEClass, RepState.class, "RepState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRepState_CounterState(), this.getCounterState(), null, "counterState", null, 1, 1, RepState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeBoundedStateEClass, TimeBoundedState.class, "TimeBoundedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeBoundedState_PreviousValues(), this.getCircularBuffer(), "previousValues", null, 0, 1, TimeBoundedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeBoundedState_Position(), ecorePackage.getELong(), "position", null, 0, 1, TimeBoundedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(counterStateEClass, CounterState.class, "CounterState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCounterState_True(), ecorePackage.getELong(), "true", null, 0, 1, CounterState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCounterState_Undetermined(), ecorePackage.getELong(), "undetermined", null, 0, 1, CounterState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repSinceStateEClass, RepSinceState.class, "RepSinceState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRepSinceState_Unds(), this.getCounterState(), null, "unds", null, 0, -1, RepSinceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(circularBufferEDataType, CircularBuffer.class, "CircularBuffer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(bitSetEDataType, BitSet.class, "BitSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(stateHandlerEDataType, StateHandler.class, "StateHandler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    }

} //StatePackageImpl
