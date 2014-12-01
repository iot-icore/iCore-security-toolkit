/**
 */
package identity.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.IdentityAttributeType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getIdentityAttributeType()
 * @model
 * @generated
 */
public interface IdentityAttributeType extends EObject {
    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityTypePackage#getAttributeTypes <em>Attribute Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(IdentityTypePackage)
     * @see identity.type.TypePackage#getIdentityAttributeType_Package()
     * @see identity.type.IdentityTypePackage#getAttributeTypes
     * @model opposite="attributeTypes" transient="false"
     * @generated
     */
    IdentityTypePackage getPackage();

    /**
     * Sets the value of the '{@link identity.type.IdentityAttributeType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(IdentityTypePackage value);

} // IdentityAttributeType
