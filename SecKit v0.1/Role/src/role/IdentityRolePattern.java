/**
 */
package role;

import identity.pattern.IdentityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.IdentityRolePattern#getIdentityPattern <em>Identity Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getIdentityRolePattern()
 * @model
 * @generated
 */
public interface IdentityRolePattern extends AbstractRolePattern {
    /**
     * Returns the value of the '<em><b>Identity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Pattern</em>' containment reference.
     * @see #setIdentityPattern(IdentityPattern)
     * @see role.RolePackage#getIdentityRolePattern_IdentityPattern()
     * @model containment="true" required="true"
     * @generated
     */
    IdentityPattern getIdentityPattern();

    /**
     * Sets the value of the '{@link role.IdentityRolePattern#getIdentityPattern <em>Identity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identity Pattern</em>' containment reference.
     * @see #getIdentityPattern()
     * @generated
     */
    void setIdentityPattern(IdentityPattern value);

} // IdentityRolePattern
