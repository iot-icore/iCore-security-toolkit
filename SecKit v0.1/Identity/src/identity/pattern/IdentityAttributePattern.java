/**
 */
package identity.pattern;

import data.pattern.DataPattern;

import identity.IdentityAttributeVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Attribute Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.pattern.IdentityAttributePattern#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.pattern.PatternPackage#getIdentityAttributePattern()
 * @model
 * @generated
 */
public interface IdentityAttributePattern extends DataPattern {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(IdentityAttributeVariable)
     * @see identity.pattern.PatternPackage#getIdentityAttributePattern_Variable()
     * @model
     * @generated
     */
    IdentityAttributeVariable getVariable();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityAttributePattern#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(IdentityAttributeVariable value);

} // IdentityAttributePattern
