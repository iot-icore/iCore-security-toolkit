/**
 */
package identity.type;

import data.instantiation.DataInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Attribute Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.IdentityAttributeInstantiation#getIdentityType <em>Identity Type</em>}</li>
 *   <li>{@link identity.type.IdentityAttributeInstantiation#getVerificationMethod <em>Verification Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getIdentityAttributeInstantiation()
 * @model
 * @generated
 */
public interface IdentityAttributeInstantiation extends DataInstantiation {
    /**
     * Returns the value of the '<em><b>Identity Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link identity.type.DigitalIdentityType#getAttributeInstantiations <em>Attribute Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Type</em>' container reference.
     * @see #setIdentityType(DigitalIdentityType)
     * @see identity.type.TypePackage#getIdentityAttributeInstantiation_IdentityType()
     * @see identity.type.DigitalIdentityType#getAttributeInstantiations
     * @model opposite="attributeInstantiations" transient="false"
     * @generated
     */
    DigitalIdentityType getIdentityType();

    /**
     * Sets the value of the '{@link identity.type.IdentityAttributeInstantiation#getIdentityType <em>Identity Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identity Type</em>' container reference.
     * @see #getIdentityType()
     * @generated
     */
    void setIdentityType(DigitalIdentityType value);

    /**
     * Returns the value of the '<em><b>Verification Method</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Verification Method</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Verification Method</em>' containment reference.
     * @see #setVerificationMethod(AttributeVerificationMethod)
     * @see identity.type.TypePackage#getIdentityAttributeInstantiation_VerificationMethod()
     * @model containment="true" required="true"
     * @generated
     */
    AttributeVerificationMethod getVerificationMethod();

    /**
     * Sets the value of the '{@link identity.type.IdentityAttributeInstantiation#getVerificationMethod <em>Verification Method</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Verification Method</em>' containment reference.
     * @see #getVerificationMethod()
     * @generated
     */
    void setVerificationMethod(AttributeVerificationMethod value);

} // IdentityAttributeInstantiation
