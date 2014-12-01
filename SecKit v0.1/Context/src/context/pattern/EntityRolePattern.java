/**
 */
package context.pattern;

import context.type.EntityRoleType;

import identity.pattern.IdentityPattern;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.pattern.EntityRolePattern#getIdentityPattern <em>Identity Pattern</em>}</li>
 *   <li>{@link context.pattern.EntityRolePattern#getEntityRoleType <em>Entity Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.pattern.PatternPackage#getEntityRolePattern()
 * @model
 * @generated
 */
public interface EntityRolePattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Identity Pattern</b></em>' containment reference list.
     * The list contents are of type {@link identity.pattern.IdentityPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Pattern</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Pattern</em>' containment reference list.
     * @see context.pattern.PatternPackage#getEntityRolePattern_IdentityPattern()
     * @model containment="true"
     * @generated
     */
    EList<IdentityPattern> getIdentityPattern();

    /**
     * Returns the value of the '<em><b>Entity Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Role Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Role Type</em>' reference.
     * @see #setEntityRoleType(EntityRoleType)
     * @see context.pattern.PatternPackage#getEntityRolePattern_EntityRoleType()
     * @model
     * @generated
     */
    EntityRoleType getEntityRoleType();

    /**
     * Sets the value of the '{@link context.pattern.EntityRolePattern#getEntityRoleType <em>Entity Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Role Type</em>' reference.
     * @see #getEntityRoleType()
     * @generated
     */
    void setEntityRoleType(EntityRoleType value);

} // EntityRolePattern
