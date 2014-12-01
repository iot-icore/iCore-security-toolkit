/**
 */
package rule.test.impl;

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

import rule.temporal.TemporalPackage;

import rule.temporal.impl.TemporalPackageImpl;

import rule.test.SimulatedTimeStepWindow;
import rule.test.TestCase;
import rule.test.TestFactory;
import rule.test.TestPackage;
import rule.test.TestSet;

import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass testCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass testSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simulatedTimeStepWindowEClass = null;

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
     * @see rule.test.TestPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TestPackageImpl() {
        super(eNS_URI, TestFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TestPackage init() {
        if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

        // Obtain or create and register package
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTestPackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        theConditionPackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theTestPackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTestPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
        return theTestPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTestCase() {
        return testCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTestCase_EventTrace() {
        return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTestSet() {
        return testSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTestSet_TestCases() {
        return (EReference)testSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTestSet_EventSet() {
        return (EReference)testSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimulatedTimeStepWindow() {
        return simulatedTimeStepWindowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimulatedTimeStepWindow_ExpectedToBeTriggeredRules() {
        return (EReference)simulatedTimeStepWindowEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestFactory getTestFactory() {
        return (TestFactory)getEFactoryInstance();
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
        testCaseEClass = createEClass(TEST_CASE);
        createEReference(testCaseEClass, TEST_CASE__EVENT_TRACE);

        testSetEClass = createEClass(TEST_SET);
        createEReference(testSetEClass, TEST_SET__TEST_CASES);
        createEReference(testSetEClass, TEST_SET__EVENT_SET);

        simulatedTimeStepWindowEClass = createEClass(SIMULATED_TIME_STEP_WINDOW);
        createEReference(simulatedTimeStepWindowEClass, SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES);
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
        EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
        TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        simulatedTimeStepWindowEClass.getESuperTypes().add(theEventPackage.getTimeWindow());

        // Initialize classes, features, and operations; add parameters
        initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTestCase_EventTrace(), theEventPackage.getEventTrace(), null, "eventTrace", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(testSetEClass, TestSet.class, "TestSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTestSet_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, TestSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTestSet_EventSet(), theEventPackage.getEventSet(), null, "eventSet", null, 0, 1, TestSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(simulatedTimeStepWindowEClass, SimulatedTimeStepWindow.class, "SimulatedTimeStepWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimulatedTimeStepWindow_ExpectedToBeTriggeredRules(), theTemplatePackage.getRuleTemplateConfiguration(), null, "expectedToBeTriggeredRules", null, 0, -1, SimulatedTimeStepWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //TestPackageImpl
