/**
 */
package behavior.variable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.variable.VariablePackage
 * @generated
 */
public interface VariableFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariableFactory eINSTANCE = behavior.variable.impl.VariableFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Activity Type Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Type Variable</em>'.
     * @generated
     */
    ActivityTypeVariable createActivityTypeVariable();

    /**
     * Returns a new object of class '<em>Activity Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Instantiation Variable</em>'.
     * @generated
     */
    ActivityInstantiationVariable createActivityInstantiationVariable();

    /**
     * Returns a new object of class '<em>Activity Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Instance Variable</em>'.
     * @generated
     */
    ActivityInstanceVariable createActivityInstanceVariable();

    /**
     * Returns a new object of class '<em>Behavior Type Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Type Variable</em>'.
     * @generated
     */
    BehaviorTypeVariable createBehaviorTypeVariable();

    /**
     * Returns a new object of class '<em>Behavior Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instantiation Variable</em>'.
     * @generated
     */
    BehaviorInstantiationVariable createBehaviorInstantiationVariable();

    /**
     * Returns a new object of class '<em>Behavior Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instance Variable</em>'.
     * @generated
     */
    BehaviorInstanceVariable createBehaviorInstanceVariable();

    /**
     * Returns a new object of class '<em>Flow Point Type Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Point Type Variable</em>'.
     * @generated
     */
    FlowPointTypeVariable createFlowPointTypeVariable();

    /**
     * Returns a new object of class '<em>Flow Point Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Point Instance Variable</em>'.
     * @generated
     */
    FlowPointInstanceVariable createFlowPointInstanceVariable();

    /**
     * Returns a new object of class '<em>Flow Point Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Point Instantiation Variable</em>'.
     * @generated
     */
    FlowPointInstantiationVariable createFlowPointInstantiationVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VariablePackage getVariablePackage();

} //VariableFactory
