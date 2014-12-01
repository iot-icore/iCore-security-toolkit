/**
 */
package role;

import models.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.AbstractRolePattern#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getAbstractRolePattern()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRolePattern extends Pattern {
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
     * @see role.RolePackage#getAbstractRolePattern_RoleType()
     * @model
     * @generated
     */
    RoleType getRoleType();

    /**
     * Sets the value of the '{@link role.AbstractRolePattern#getRoleType <em>Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Type</em>' reference.
     * @see #getRoleType()
     * @generated
     */
    void setRoleType(RoleType value);

} // AbstractRolePattern
