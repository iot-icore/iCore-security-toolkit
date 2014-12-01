/**
 */
package rule.state;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.state.StatePackage
 * @generated
 */
public interface StateFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StateFactory eINSTANCE = rule.state.impl.StateFactoryImpl.init();

    /**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
    State createState();

    /**
     * Returns a new object of class '<em>Event Pattern State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Pattern State</em>'.
     * @generated
     */
    EventPatternState createEventPatternState();

    /**
     * Returns a new object of class '<em>Rep State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rep State</em>'.
     * @generated
     */
    RepState createRepState();

    /**
     * Returns a new object of class '<em>Time Bounded State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Bounded State</em>'.
     * @generated
     */
    TimeBoundedState createTimeBoundedState();

    /**
     * Returns a new object of class '<em>Counter State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Counter State</em>'.
     * @generated
     */
    CounterState createCounterState();

    /**
     * Returns a new object of class '<em>Rep Since State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rep Since State</em>'.
     * @generated
     */
    RepSinceState createRepSinceState();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    StatePackage getStatePackage();

} //StateFactory
