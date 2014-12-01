/**
 */
package identity.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see identity.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstanceFactory eINSTANCE = identity.instance.impl.InstanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Digital Identity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Digital Identity</em>'.
     * @generated
     */
    DigitalIdentity createDigitalIdentity();

    /**
     * Returns a new object of class '<em>Identity Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Attribute</em>'.
     * @generated
     */
    IdentityAttribute createIdentityAttribute();

    /**
     * Returns a new object of class '<em>Identity Realm</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Realm</em>'.
     * @generated
     */
    IdentityRealm createIdentityRealm();

    /**
     * Returns a new object of class '<em>Self Signed Identity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Self Signed Identity</em>'.
     * @generated
     */
    SelfSignedIdentity createSelfSignedIdentity();

    /**
     * Returns a new object of class '<em>Identity Federation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Federation</em>'.
     * @generated
     */
    IdentityFederation createIdentityFederation();

    /**
     * Returns a new object of class '<em>Identity Owner</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Owner</em>'.
     * @generated
     */
    IdentityOwner createIdentityOwner();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstancePackage getInstancePackage();

} //InstanceFactory
