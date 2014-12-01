/**
 */
package rule.test.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.test.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFactoryImpl extends EFactoryImpl implements TestFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TestFactory init() {
        try {
            TestFactory theTestFactory = (TestFactory)EPackage.Registry.INSTANCE.getEFactory(TestPackage.eNS_URI);
            if (theTestFactory != null) {
                return theTestFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TestFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TestPackage.TEST_CASE: return createTestCase();
            case TestPackage.TEST_SET: return createTestSet();
            case TestPackage.SIMULATED_TIME_STEP_WINDOW: return createSimulatedTimeStepWindow();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestCase createTestCase() {
        TestCaseImpl testCase = new TestCaseImpl();
        return testCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestSet createTestSet() {
        TestSetImpl testSet = new TestSetImpl();
        return testSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimulatedTimeStepWindow createSimulatedTimeStepWindow() {
        SimulatedTimeStepWindowImpl simulatedTimeStepWindow = new SimulatedTimeStepWindowImpl();
        return simulatedTimeStepWindow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestPackage getTestPackage() {
        return (TestPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TestPackage getPackage() {
        return TestPackage.eINSTANCE;
    }

} //TestFactoryImpl
