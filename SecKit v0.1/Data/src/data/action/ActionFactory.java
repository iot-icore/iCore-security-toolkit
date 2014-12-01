/**
 */
package data.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionFactory eINSTANCE = data.action.impl.ActionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Modify Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Modify Data</em>'.
     * @generated
     */
    ModifyData createModifyData();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ActionPackage getActionPackage();

} //ActionFactory
