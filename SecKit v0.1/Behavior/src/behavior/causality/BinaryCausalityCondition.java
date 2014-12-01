/**
 */
package behavior.causality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Causality Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.BinaryCausalityCondition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getBinaryCausalityCondition()
 * @model abstract="true"
 * @generated
 */
public interface BinaryCausalityCondition extends BasicCausalityCondition {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(CausalityParameter)
     * @see behavior.causality.CausalityPackage#getBinaryCausalityCondition_Source()
     * @model required="true"
     * @generated
     */
    CausalityParameter getSource();

    /**
     * Sets the value of the '{@link behavior.causality.BinaryCausalityCondition#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(CausalityParameter value);

} // BinaryCausalityCondition
