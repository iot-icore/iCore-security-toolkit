/**
 */
package role;

import identity.instance.AbstractIdentity;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.RoleAssignment#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link role.RoleAssignment#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getRoleAssignment()
 * @model
 * @generated
 */
public interface RoleAssignment extends Element {
    /**
     * Returns the value of the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Type</em>' reference.
     * @see #setRoleType(RoleType)
     * @see role.RolePackage#getRoleAssignment_RoleType()
     * @model
     * @generated
     */
    RoleType getRoleType();

    /**
     * Sets the value of the '{@link role.RoleAssignment#getRoleType <em>Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Type</em>' reference.
     * @see #getRoleType()
     * @generated
     */
    void setRoleType(RoleType value);

    /**
     * Returns the value of the '<em><b>Identities</b></em>' reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' reference list.
     * @see role.RolePackage#getRoleAssignment_Identities()
     * @model
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // RoleAssignment
