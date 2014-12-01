/**
 */
package context.instance;

import context.type.EntityRoleType;

import identity.instance.AbstractIdentity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.EntityRole#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link context.instance.EntityRole#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.InstancePackage#getEntityRole()
 * @model
 * @generated
 */
public interface EntityRole extends EObject {
    /**
     * Returns the value of the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Type</em>' reference.
     * @see #setRoleType(EntityRoleType)
     * @see context.instance.InstancePackage#getEntityRole_RoleType()
     * @model required="true"
     * @generated
     */
    EntityRoleType getRoleType();

    /**
     * Sets the value of the '{@link context.instance.EntityRole#getRoleType <em>Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Type</em>' reference.
     * @see #getRoleType()
     * @generated
     */
    void setRoleType(EntityRoleType value);

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
     * @see context.instance.InstancePackage#getEntityRole_Identities()
     * @model
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // EntityRole
