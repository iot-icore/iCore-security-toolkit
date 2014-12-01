/**
 */
package rule.temporal;

import rule.condition.Binary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.temporal.RepeatLimit#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.temporal.TemporalPackage#getRepeatLimit()
 * @model
 * @generated
 */
public interface RepeatLimit extends CardinalityOperator, TimeBoundedTemporalOperator, Binary {
    /**
     * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Bound</em>' attribute.
     * @see #setLowerBound(long)
     * @see rule.temporal.TemporalPackage#getRepeatLimit_LowerBound()
     * @model
     * @generated
     */
    long getLowerBound();

    /**
     * Sets the value of the '{@link rule.temporal.RepeatLimit#getLowerBound <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Bound</em>' attribute.
     * @see #getLowerBound()
     * @generated
     */
    void setLowerBound(long value);

} // RepeatLimit
