/**
 */
package behavior.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstanceFactory eINSTANCE = behavior.instance.impl.InstanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Behavior</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior</em>'.
     * @generated
     */
    Behavior createBehavior();

    /**
     * Returns a new object of class '<em>Flow Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Point</em>'.
     * @generated
     */
    FlowPoint createFlowPoint();

    /**
     * Returns a new object of class '<em>Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action</em>'.
     * @generated
     */
    Action createAction();

    /**
     * Returns a new object of class '<em>Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction</em>'.
     * @generated
     */
    Interaction createInteraction();

    /**
     * Returns a new object of class '<em>Interaction Contribution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution</em>'.
     * @generated
     */
    InteractionContribution createInteractionContribution();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstancePackage getInstancePackage();

} //InstanceFactory
