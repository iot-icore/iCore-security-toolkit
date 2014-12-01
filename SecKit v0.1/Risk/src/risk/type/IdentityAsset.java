/**
 */
package risk.type;

import identity.instantiation.IdentityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.IdentityAsset#getIdentityInstantiation <em>Identity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getIdentityAsset()
 * @model
 * @generated
 */
public interface IdentityAsset extends Asset {
    /**
     * Returns the value of the '<em><b>Identity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Instantiation</em>' reference.
     * @see #setIdentityInstantiation(IdentityInstantiation)
     * @see risk.type.TypePackage#getIdentityAsset_IdentityInstantiation()
     * @model required="true"
     * @generated
     */
    IdentityInstantiation getIdentityInstantiation();

    /**
     * Sets the value of the '{@link risk.type.IdentityAsset#getIdentityInstantiation <em>Identity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identity Instantiation</em>' reference.
     * @see #getIdentityInstantiation()
     * @generated
     */
    void setIdentityInstantiation(IdentityInstantiation value);

} // IdentityAsset
