/**
 */
package identity.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.IdentityRegistration#getRequiredAttributes <em>Required Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getIdentityRegistration()
 * @model
 * @generated
 */
public interface IdentityRegistration extends Element {
    /**
     * Returns the value of the '<em><b>Required Attributes</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.IdentityAttributeInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required Attributes</em>' containment reference list.
     * @see identity.type.TypePackage#getIdentityRegistration_RequiredAttributes()
     * @model containment="true"
     * @generated
     */
    EList<IdentityAttributeInstantiation> getRequiredAttributes();

} // IdentityRegistration
