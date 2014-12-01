/**
 */
package identity.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.ElectronicDocument#getContains <em>Contains</em>}</li>
 *   <li>{@link identity.type.ElectronicDocument#getMediaType <em>Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getElectronicDocument()
 * @model
 * @generated
 */
public interface ElectronicDocument extends PhysicalIdentityType {
    /**
     * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.DigitalIdentityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contains</em>' containment reference list.
     * @see identity.type.TypePackage#getElectronicDocument_Contains()
     * @model containment="true"
     * @generated
     */
    EList<DigitalIdentityType> getContains();

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
     * @see identity.type.TypePackage#getElectronicDocument_MediaType()
     * @model containment="true" required="true"
     * @generated
     */
    MediaType getMediaType();

    /**
     * Sets the value of the '{@link identity.type.ElectronicDocument#getMediaType <em>Media Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Media Type</em>' containment reference.
     * @see #getMediaType()
     * @generated
     */
    void setMediaType(MediaType value);

} // ElectronicDocument
