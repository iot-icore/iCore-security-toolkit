/**
 */
package behavior.constraint;

import data.instance.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Of Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.RangeOfValues#getLowerBoundInclusive <em>Lower Bound Inclusive</em>}</li>
 *   <li>{@link behavior.constraint.RangeOfValues#getUpperBoundInclusive <em>Upper Bound Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getRangeOfValues()
 * @model abstract="true"
 * @generated
 */
public interface RangeOfValues extends ValueCheckingConstraint {
    /**
     * Returns the value of the '<em><b>Lower Bound Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Bound Inclusive</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Bound Inclusive</em>' containment reference.
     * @see #setLowerBoundInclusive(Data)
     * @see behavior.constraint.ConstraintPackage#getRangeOfValues_LowerBoundInclusive()
     * @model containment="true" required="true"
     * @generated
     */
    Data getLowerBoundInclusive();

    /**
     * Sets the value of the '{@link behavior.constraint.RangeOfValues#getLowerBoundInclusive <em>Lower Bound Inclusive</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Bound Inclusive</em>' containment reference.
     * @see #getLowerBoundInclusive()
     * @generated
     */
    void setLowerBoundInclusive(Data value);

    /**
     * Returns the value of the '<em><b>Upper Bound Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Bound Inclusive</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Bound Inclusive</em>' containment reference.
     * @see #setUpperBoundInclusive(Data)
     * @see behavior.constraint.ConstraintPackage#getRangeOfValues_UpperBoundInclusive()
     * @model containment="true" required="true"
     * @generated
     */
    Data getUpperBoundInclusive();

    /**
     * Sets the value of the '{@link behavior.constraint.RangeOfValues#getUpperBoundInclusive <em>Upper Bound Inclusive</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Bound Inclusive</em>' containment reference.
     * @see #getUpperBoundInclusive()
     * @generated
     */
    void setUpperBoundInclusive(Data value);

} // RangeOfValues
