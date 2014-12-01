/**
 */
package rule.temporal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.temporal.CardinalityOperator#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.temporal.TemporalPackage#getCardinalityOperator()
 * @model abstract="true"
 * @generated
 */
public interface CardinalityOperator extends PastTemporalOperator {
    /**
     * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Bound</em>' attribute.
     * @see #setUpperBound(long)
     * @see rule.temporal.TemporalPackage#getCardinalityOperator_UpperBound()
     * @model
     * @generated
     */
    long getUpperBound();

    /**
     * Sets the value of the '{@link rule.temporal.CardinalityOperator#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Bound</em>' attribute.
     * @see #getUpperBound()
     * @generated
     */
    void setUpperBound(long value);

} // CardinalityOperator
