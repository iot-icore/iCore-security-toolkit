/**
 */
package context.pattern;

import context.type.ContextSituationType;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.pattern.ContextSituationPattern#getEntityRolePatterns <em>Entity Role Patterns</em>}</li>
 *   <li>{@link context.pattern.ContextSituationPattern#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.pattern.PatternPackage#getContextSituationPattern()
 * @model
 * @generated
 */
public interface ContextSituationPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Entity Role Patterns</b></em>' containment reference list.
     * The list contents are of type {@link context.pattern.EntityRolePattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Role Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Role Patterns</em>' containment reference list.
     * @see context.pattern.PatternPackage#getContextSituationPattern_EntityRolePatterns()
     * @model containment="true"
     * @generated
     */
    EList<EntityRolePattern> getEntityRolePatterns();

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ContextSituationType)
     * @see context.pattern.PatternPackage#getContextSituationPattern_Type()
     * @model
     * @generated
     */
    ContextSituationType getType();

    /**
     * Sets the value of the '{@link context.pattern.ContextSituationPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ContextSituationType value);

} // ContextSituationPattern
