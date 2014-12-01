/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import rule.state.StatePackage;

import rule.state.impl.StatePackageImpl;

import rule.template.TemplatePackage;

import rule.template.impl.TemplatePackageImpl;

import rule.temporal.Always;
import rule.temporal.Before;
import rule.temporal.CardinalityOperator;
import rule.temporal.During;
import rule.temporal.Eventually;
import rule.temporal.PastTemporalOperator;
import rule.temporal.RepeatLimit;
import rule.temporal.RepeatMaximum;
import rule.temporal.RepeatSince;
import rule.temporal.Since;
import rule.temporal.TemporalFactory;
import rule.temporal.TemporalPackage;
import rule.temporal.TimeBoundedOccurrence;
import rule.temporal.TimeBoundedTemporalOperator;
import rule.temporal.Within;

import rule.test.TestPackage;

import rule.test.impl.TestPackageImpl;

import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalPackageImpl extends EPackageImpl implements TemporalPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass alwaysEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sinceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass beforeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass withinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass duringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cardinalityOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeBoundedTemporalOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pastTemporalOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeBoundedOccurrenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventuallyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repeatLimitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repeatSinceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repeatMaximumEClass = null;

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
     * @see rule.temporal.TemporalPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TemporalPackageImpl() {
        super(eNS_URI, TemporalFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TemporalPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TemporalPackage init() {
        if (isInited) return (TemporalPackage)EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI);

        // Obtain or create and register package
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemporalPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTemporalPackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        theConditionPackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theTemporalPackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTemporalPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TemporalPackage.eNS_URI, theTemporalPackage);
        return theTemporalPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAlways() {
        return alwaysEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSince() {
        return sinceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBefore() {
        return beforeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWithin() {
        return withinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDuring() {
        return duringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCardinalityOperator() {
        return cardinalityOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCardinalityOperator_UpperBound() {
        return (EAttribute)cardinalityOperatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeBoundedTemporalOperator() {
        return timeBoundedTemporalOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeBoundedTemporalOperator_TimeBoundInTimeSteps() {
        return (EAttribute)timeBoundedTemporalOperatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeBoundedTemporalOperator_Variable() {
        return (EReference)timeBoundedTemporalOperatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPastTemporalOperator() {
        return pastTemporalOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeBoundedOccurrence() {
        return timeBoundedOccurrenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventually() {
        return eventuallyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepeatLimit() {
        return repeatLimitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRepeatLimit_LowerBound() {
        return (EAttribute)repeatLimitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepeatSince() {
        return repeatSinceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepeatMaximum() {
        return repeatMaximumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalFactory getTemporalFactory() {
        return (TemporalFactory)getEFactoryInstance();
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
        alwaysEClass = createEClass(ALWAYS);

        sinceEClass = createEClass(SINCE);

        beforeEClass = createEClass(BEFORE);

        withinEClass = createEClass(WITHIN);

        duringEClass = createEClass(DURING);

        cardinalityOperatorEClass = createEClass(CARDINALITY_OPERATOR);
        createEAttribute(cardinalityOperatorEClass, CARDINALITY_OPERATOR__UPPER_BOUND);

        timeBoundedTemporalOperatorEClass = createEClass(TIME_BOUNDED_TEMPORAL_OPERATOR);
        createEAttribute(timeBoundedTemporalOperatorEClass, TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS);
        createEReference(timeBoundedTemporalOperatorEClass, TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE);

        pastTemporalOperatorEClass = createEClass(PAST_TEMPORAL_OPERATOR);

        timeBoundedOccurrenceEClass = createEClass(TIME_BOUNDED_OCCURRENCE);

        eventuallyEClass = createEClass(EVENTUALLY);

        repeatLimitEClass = createEClass(REPEAT_LIMIT);
        createEAttribute(repeatLimitEClass, REPEAT_LIMIT__LOWER_BOUND);

        repeatSinceEClass = createEClass(REPEAT_SINCE);

        repeatMaximumEClass = createEClass(REPEAT_MAXIMUM);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        alwaysEClass.getESuperTypes().add(this.getPastTemporalOperator());
        alwaysEClass.getESuperTypes().add(theConditionPackage.getUnary());
        sinceEClass.getESuperTypes().add(this.getPastTemporalOperator());
        sinceEClass.getESuperTypes().add(theConditionPackage.getBinary());
        beforeEClass.getESuperTypes().add(this.getTimeBoundedOccurrence());
        beforeEClass.getESuperTypes().add(theConditionPackage.getUnary());
        withinEClass.getESuperTypes().add(this.getTimeBoundedOccurrence());
        withinEClass.getESuperTypes().add(theConditionPackage.getUnary());
        duringEClass.getESuperTypes().add(this.getTimeBoundedOccurrence());
        duringEClass.getESuperTypes().add(theConditionPackage.getUnary());
        cardinalityOperatorEClass.getESuperTypes().add(this.getPastTemporalOperator());
        timeBoundedTemporalOperatorEClass.getESuperTypes().add(this.getPastTemporalOperator());
        pastTemporalOperatorEClass.getESuperTypes().add(theConditionPackage.getOperator());
        timeBoundedOccurrenceEClass.getESuperTypes().add(this.getTimeBoundedTemporalOperator());
        eventuallyEClass.getESuperTypes().add(this.getPastTemporalOperator());
        eventuallyEClass.getESuperTypes().add(theConditionPackage.getUnary());
        repeatLimitEClass.getESuperTypes().add(this.getCardinalityOperator());
        repeatLimitEClass.getESuperTypes().add(this.getTimeBoundedTemporalOperator());
        repeatLimitEClass.getESuperTypes().add(theConditionPackage.getBinary());
        repeatSinceEClass.getESuperTypes().add(this.getCardinalityOperator());
        repeatSinceEClass.getESuperTypes().add(theConditionPackage.getBinary());
        repeatMaximumEClass.getESuperTypes().add(this.getRepeatSince());

        // Initialize classes, features, and operations; add parameters
        initEClass(alwaysEClass, Always.class, "Always", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sinceEClass, Since.class, "Since", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(beforeEClass, Before.class, "Before", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(withinEClass, Within.class, "Within", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(duringEClass, During.class, "During", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cardinalityOperatorEClass, CardinalityOperator.class, "CardinalityOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCardinalityOperator_UpperBound(), ecorePackage.getELong(), "upperBound", null, 0, 1, CardinalityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeBoundedTemporalOperatorEClass, TimeBoundedTemporalOperator.class, "TimeBoundedTemporalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeBoundedTemporalOperator_TimeBoundInTimeSteps(), ecorePackage.getELong(), "timeBoundInTimeSteps", null, 1, 1, TimeBoundedTemporalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeBoundedTemporalOperator_Variable(), theTemplatePackage.getTimeStepVariable(), null, "variable", null, 0, 1, TimeBoundedTemporalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pastTemporalOperatorEClass, PastTemporalOperator.class, "PastTemporalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeBoundedOccurrenceEClass, TimeBoundedOccurrence.class, "TimeBoundedOccurrence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eventuallyEClass, Eventually.class, "Eventually", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(repeatLimitEClass, RepeatLimit.class, "RepeatLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRepeatLimit_LowerBound(), ecorePackage.getELong(), "lowerBound", null, 0, 1, RepeatLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repeatSinceEClass, RepeatSince.class, "RepeatSince", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(repeatMaximumEClass, RepeatMaximum.class, "RepeatMaximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //TemporalPackageImpl
