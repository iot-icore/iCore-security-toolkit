/**
 */
package identity.instance;

import identity.type.AuthenticationCredential;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instance.DigitalIdentity#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link identity.instance.DigitalIdentity#getAuthenticationCredentials <em>Authentication Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instance.InstancePackage#getDigitalIdentity()
 * @model
 * @generated
 */
public interface DigitalIdentity extends SelfSignedIdentity {
    /**
     * Returns the value of the '<em><b>Issuer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuer</em>' reference.
     * @see #setIssuer(AbstractIdentity)
     * @see identity.instance.InstancePackage#getDigitalIdentity_Issuer()
     * @model required="true"
     * @generated
     */
    AbstractIdentity getIssuer();

    /**
     * Sets the value of the '{@link identity.instance.DigitalIdentity#getIssuer <em>Issuer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issuer</em>' reference.
     * @see #getIssuer()
     * @generated
     */
    void setIssuer(AbstractIdentity value);

    /**
     * Returns the value of the '<em><b>Authentication Credentials</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.AuthenticationCredential}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authentication Credentials</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authentication Credentials</em>' containment reference list.
     * @see identity.instance.InstancePackage#getDigitalIdentity_AuthenticationCredentials()
     * @model containment="true"
     * @generated
     */
    EList<AuthenticationCredential> getAuthenticationCredentials();

} // DigitalIdentity
