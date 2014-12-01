/**
 */
package role;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see role.RolePackage
 * @generated
 */
public interface RoleFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RoleFactory eINSTANCE = role.impl.RoleFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type</em>'.
     * @generated
     */
    RoleType createRoleType();

    /**
     * Returns a new object of class '<em>Design Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Design Model</em>'.
     * @generated
     */
    RoleDesignModel createRoleDesignModel();

    /**
     * Returns a new object of class '<em>Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Package</em>'.
     * @generated
     */
    RoleTypePackage createRoleTypePackage();

    /**
     * Returns a new object of class '<em>Runtime Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Runtime Model</em>'.
     * @generated
     */
    RoleRuntimeModel createRoleRuntimeModel();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    RoleAssignment createRoleAssignment();

    /**
     * Returns a new object of class '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pattern</em>'.
     * @generated
     */
    RolePattern createRolePattern();

    /**
     * Returns a new object of class '<em>Identity Role Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Role Pattern</em>'.
     * @generated
     */
    IdentityRolePattern createIdentityRolePattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RolePackage getRolePackage();

} //RoleFactory
