/**
 */
package behavior.condition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.condition.ConditionPackage
 * @generated
 */
public interface ConditionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConditionFactory eINSTANCE = behavior.condition.impl.ConditionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Evaluate Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Evaluate Action</em>'.
     * @generated
     */
    EvaluateAction createEvaluateAction();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConditionPackage getConditionPackage();

} //ConditionFactory
