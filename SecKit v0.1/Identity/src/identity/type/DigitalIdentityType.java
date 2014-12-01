/**
 */
package identity.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.DigitalIdentityType#getAttributeInstantiations <em>Attribute Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getDigitalIdentityType()
 * @model
 * @generated
 */
public interface DigitalIdentityType extends Element, IdentityType {
    /**
     * Returns the value of the '<em><b>Attribute Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.IdentityAttributeInstantiation}.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityAttributeInstantiation#getIdentityType <em>Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Instantiations</em>' containment reference list.
     * @see identity.type.TypePackage#getDigitalIdentityType_AttributeInstantiations()
     * @see identity.type.IdentityAttributeInstantiation#getIdentityType
     * @model opposite="identityType" containment="true"
     * @generated
     */
    EList<IdentityAttributeInstantiation> getAttributeInstantiations();

} // DigitalIdentityType
