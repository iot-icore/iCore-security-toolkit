/**
 */
package identity.action;

import data.action.ModifyData;

import identity.instantiation.IdentityInstantiation;

import org.eclipse.emf.common.util.EList;

import rule.action.Modify;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.action.ModifyIdentity#getTarget <em>Target</em>}</li>
 *   <li>{@link identity.action.ModifyIdentity#getModifyData <em>Modify Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.action.ActionPackage#getModifyIdentity()
 * @model
 * @generated
 */
public interface ModifyIdentity extends Modify {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(IdentityInstantiation)
     * @see identity.action.ActionPackage#getModifyIdentity_Target()
     * @model
     * @generated
     */
    IdentityInstantiation getTarget();

    /**
     * Sets the value of the '{@link identity.action.ModifyIdentity#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(IdentityInstantiation value);

    /**
     * Returns the value of the '<em><b>Modify Data</b></em>' containment reference list.
     * The list contents are of type {@link data.action.ModifyData}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modify Data</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modify Data</em>' containment reference list.
     * @see identity.action.ActionPackage#getModifyIdentity_ModifyData()
     * @model containment="true"
     * @generated
     */
    EList<ModifyData> getModifyData();

} // ModifyIdentity
