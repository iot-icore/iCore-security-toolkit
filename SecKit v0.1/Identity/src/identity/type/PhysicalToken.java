/**
 */
package identity.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.PhysicalToken#getMediaType <em>Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getPhysicalToken()
 * @model
 * @generated
 */
public interface PhysicalToken extends AuthenticationCredential {
    /**
     * Returns the value of the '<em><b>Media Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Media Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Media Type</em>' containment reference.
     * @see #setMediaType(MediaType)
     * @see identity.type.TypePackage#getPhysicalToken_MediaType()
     * @model containment="true"
     * @generated
     */
    MediaType getMediaType();

    /**
     * Sets the value of the '{@link identity.type.PhysicalToken#getMediaType <em>Media Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Media Type</em>' containment reference.
     * @see #getMediaType()
     * @generated
     */
    void setMediaType(MediaType value);

} // PhysicalToken
