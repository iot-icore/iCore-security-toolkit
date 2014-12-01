/**
 */
package rule.test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import rule.event.EventPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rule.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "test";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/test/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-test";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestPackage eINSTANCE = rule.test.impl.TestPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.test.impl.TestCaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.test.impl.TestCaseImpl
     * @see rule.test.impl.TestPackageImpl#getTestCase()
     * @generated
     */
    int TEST_CASE = 0;

    /**
     * The feature id for the '<em><b>Event Trace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CASE__EVENT_TRACE = 0;

    /**
     * The number of structural features of the '<em>Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CASE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CASE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.test.impl.TestSetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.test.impl.TestSetImpl
     * @see rule.test.impl.TestPackageImpl#getTestSet()
     * @generated
     */
    int TEST_SET = 1;

    /**
     * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_SET__TEST_CASES = 0;

    /**
     * The feature id for the '<em><b>Event Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_SET__EVENT_SET = 1;

    /**
     * The number of structural features of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_SET_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_SET_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.test.impl.SimulatedTimeStepWindowImpl <em>Simulated Time Step Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.test.impl.SimulatedTimeStepWindowImpl
     * @see rule.test.impl.TestPackageImpl#getSimulatedTimeStepWindow()
     * @generated
     */
    int SIMULATED_TIME_STEP_WINDOW = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__VISUAL_ELEMENTS = EventPackage.TIME_WINDOW__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__ID = EventPackage.TIME_WINDOW__ID;

    /**
     * The feature id for the '<em><b>Events</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__EVENTS = EventPackage.TIME_WINDOW__EVENTS;

    /**
     * The feature id for the '<em><b>Reference Clock</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__REFERENCE_CLOCK = EventPackage.TIME_WINDOW__REFERENCE_CLOCK;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__INDEX = EventPackage.TIME_WINDOW__INDEX;

    /**
     * The feature id for the '<em><b>Trace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__TRACE = EventPackage.TIME_WINDOW__TRACE;

    /**
     * The feature id for the '<em><b>Expected To Be Triggered Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES = EventPackage.TIME_WINDOW_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simulated Time Step Window</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW_FEATURE_COUNT = EventPackage.TIME_WINDOW_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Simulated Time Step Window</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMULATED_TIME_STEP_WINDOW_OPERATION_COUNT = EventPackage.TIME_WINDOW_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link rule.test.TestCase <em>Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case</em>'.
     * @see rule.test.TestCase
     * @generated
     */
    EClass getTestCase();

    /**
     * Returns the meta object for the containment reference '{@link rule.test.TestCase#getEventTrace <em>Event Trace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Trace</em>'.
     * @see rule.test.TestCase#getEventTrace()
     * @see #getTestCase()
     * @generated
     */
    EReference getTestCase_EventTrace();

    /**
     * Returns the meta object for class '{@link rule.test.TestSet <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set</em>'.
     * @see rule.test.TestSet
     * @generated
     */
    EClass getTestSet();

    /**
     * Returns the meta object for the containment reference list '{@link rule.test.TestSet#getTestCases <em>Test Cases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Test Cases</em>'.
     * @see rule.test.TestSet#getTestCases()
     * @see #getTestSet()
     * @generated
     */
    EReference getTestSet_TestCases();

    /**
     * Returns the meta object for the containment reference '{@link rule.test.TestSet#getEventSet <em>Event Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Set</em>'.
     * @see rule.test.TestSet#getEventSet()
     * @see #getTestSet()
     * @generated
     */
    EReference getTestSet_EventSet();

    /**
     * Returns the meta object for class '{@link rule.test.SimulatedTimeStepWindow <em>Simulated Time Step Window</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simulated Time Step Window</em>'.
     * @see rule.test.SimulatedTimeStepWindow
     * @generated
     */
    EClass getSimulatedTimeStepWindow();

    /**
     * Returns the meta object for the containment reference list '{@link rule.test.SimulatedTimeStepWindow#getExpectedToBeTriggeredRules <em>Expected To Be Triggered Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Expected To Be Triggered Rules</em>'.
     * @see rule.test.SimulatedTimeStepWindow#getExpectedToBeTriggeredRules()
     * @see #getSimulatedTimeStepWindow()
     * @generated
     */
    EReference getSimulatedTimeStepWindow_ExpectedToBeTriggeredRules();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TestFactory getTestFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link rule.test.impl.TestCaseImpl <em>Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.test.impl.TestCaseImpl
         * @see rule.test.impl.TestPackageImpl#getTestCase()
         * @generated
         */
        EClass TEST_CASE = eINSTANCE.getTestCase();

        /**
         * The meta object literal for the '<em><b>Event Trace</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_CASE__EVENT_TRACE = eINSTANCE.getTestCase_EventTrace();

        /**
         * The meta object literal for the '{@link rule.test.impl.TestSetImpl <em>Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.test.impl.TestSetImpl
         * @see rule.test.impl.TestPackageImpl#getTestSet()
         * @generated
         */
        EClass TEST_SET = eINSTANCE.getTestSet();

        /**
         * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_SET__TEST_CASES = eINSTANCE.getTestSet_TestCases();

        /**
         * The meta object literal for the '<em><b>Event Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEST_SET__EVENT_SET = eINSTANCE.getTestSet_EventSet();

        /**
         * The meta object literal for the '{@link rule.test.impl.SimulatedTimeStepWindowImpl <em>Simulated Time Step Window</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.test.impl.SimulatedTimeStepWindowImpl
         * @see rule.test.impl.TestPackageImpl#getSimulatedTimeStepWindow()
         * @generated
         */
        EClass SIMULATED_TIME_STEP_WINDOW = eINSTANCE.getSimulatedTimeStepWindow();

        /**
         * The meta object literal for the '<em><b>Expected To Be Triggered Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES = eINSTANCE.getSimulatedTimeStepWindow_ExpectedToBeTriggeredRules();

    }

} //TestPackage
