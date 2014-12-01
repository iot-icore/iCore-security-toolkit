/**
 */
package identity.instance;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instance.IdentityRealm#getName <em>Name</em>}</li>
 *   <li>{@link identity.instance.IdentityRealm#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instance.InstancePackage#getIdentityRealm()
 * @model
 * @generated
 */
public interface IdentityRealm extends Element {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see identity.instance.InstancePackage#getIdentityRealm_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link identity.instance.IdentityRealm#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Identities</b></em>' containment reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' containment reference list.
     * @see identity.instance.InstancePackage#getIdentityRealm_Identities()
     * @model containment="true"
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // IdentityRealm
