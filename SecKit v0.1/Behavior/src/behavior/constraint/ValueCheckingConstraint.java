/**
 */
package behavior.constraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Checking Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.ValueCheckingConstraint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getValueCheckingConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ValueCheckingConstraint extends DataConstraint {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.constraint.ConstraintType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see behavior.constraint.ConstraintType
     * @see #setType(ConstraintType)
     * @see behavior.constraint.ConstraintPackage#getValueCheckingConstraint_Type()
     * @model
     * @generated
     */
    ConstraintType getType();

    /**
     * Sets the value of the '{@link behavior.constraint.ValueCheckingConstraint#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see behavior.constraint.ConstraintType
     * @see #getType()
     * @generated
     */
    void setType(ConstraintType value);

} // ValueCheckingConstraint
