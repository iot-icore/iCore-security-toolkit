/**
 */
package rule.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestFactory eINSTANCE = rule.test.impl.TestFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Case</em>'.
     * @generated
     */
    TestCase createTestCase();

    /**
     * Returns a new object of class '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set</em>'.
     * @generated
     */
    TestSet createTestSet();

    /**
     * Returns a new object of class '<em>Simulated Time Step Window</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simulated Time Step Window</em>'.
     * @generated
     */
    SimulatedTimeStepWindow createSimulatedTimeStepWindow();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TestPackage getTestPackage();

} //TestFactory
