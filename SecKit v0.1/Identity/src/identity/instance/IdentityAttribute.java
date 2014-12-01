/**
 */
package identity.instance;

import data.instance.Data;

import identity.type.AttributeVerificationMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instance.IdentityAttribute#getVerificationMethod <em>Verification Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instance.InstancePackage#getIdentityAttribute()
 * @model
 * @generated
 */
public interface IdentityAttribute extends Data {
    /**
     * Returns the value of the '<em><b>Verification Method</b></em>' reference list.
     * The list contents are of type {@link identity.type.AttributeVerificationMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Verification Method</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Verification Method</em>' reference list.
     * @see identity.instance.InstancePackage#getIdentityAttribute_VerificationMethod()
     * @model
     * @generated
     */
    EList<AttributeVerificationMethod> getVerificationMethod();

} // IdentityAttribute
