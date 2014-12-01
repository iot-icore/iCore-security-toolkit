/**
 */
package rule.condition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.Constant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Atom, Nullary {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The literals are from the enumeration {@link rule.condition.TruthValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #setValue(TruthValue)
     * @see rule.condition.ConditionPackage#getConstant_Value()
     * @model
     * @generated
     */
    TruthValue getValue();

    /**
     * Sets the value of the '{@link rule.condition.Constant#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #getValue()
     * @generated
     */
    void setValue(TruthValue value);

} // Constant
