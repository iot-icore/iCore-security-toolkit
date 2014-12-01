/**
 */
package behavior.constraint;

import identity.instantiation.IdentityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.IdentityEstablishment#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getIdentityEstablishment()
 * @model
 * @generated
 */
public interface IdentityEstablishment extends IdentityConstraint {
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
     * @see behavior.constraint.ConstraintPackage#getIdentityEstablishment_Target()
     * @model required="true"
     * @generated
     */
    IdentityInstantiation getTarget();

    /**
     * Sets the value of the '{@link behavior.constraint.IdentityEstablishment#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(IdentityInstantiation value);

} // IdentityEstablishment
