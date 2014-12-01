/**
 */
package behavior.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionFactory eINSTANCE = behavior.action.impl.ActionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Behavior Execution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Execution</em>'.
     * @generated
     */
    BehaviorExecution createBehaviorExecution();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ActionPackage getActionPackage();

} //ActionFactory
