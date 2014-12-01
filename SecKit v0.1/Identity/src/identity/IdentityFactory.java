/**
 */
package identity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see identity.IdentityPackage
 * @generated
 */
public interface IdentityFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IdentityFactory eINSTANCE = identity.impl.IdentityFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Design Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Design Model</em>'.
     * @generated
     */
    IdentityDesignModel createIdentityDesignModel();

    /**
     * Returns a new object of class '<em>Runtime Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Runtime Model</em>'.
     * @generated
     */
    IdentityRuntimeModel createIdentityRuntimeModel();

    /**
     * Returns a new object of class '<em>Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Variable</em>'.
     * @generated
     */
    IdentityInstanceVariable createIdentityInstanceVariable();

    /**
     * Returns a new object of class '<em>Attribute Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Variable</em>'.
     * @generated
     */
    IdentityAttributeVariable createIdentityAttributeVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IdentityPackage getIdentityPackage();

} //IdentityFactory
