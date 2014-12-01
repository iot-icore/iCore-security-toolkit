/**
 */
package rule.state;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rep State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.RepState#getCounterState <em>Counter State</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getRepState()
 * @model
 * @generated
 */
public interface RepState extends State {
    /**
     * Returns the value of the '<em><b>Counter State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Counter State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Counter State</em>' containment reference.
     * @see #setCounterState(CounterState)
     * @see rule.state.StatePackage#getRepState_CounterState()
     * @model containment="true" required="true"
     * @generated
     */
    CounterState getCounterState();

    /**
     * Sets the value of the '{@link rule.state.RepState#getCounterState <em>Counter State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Counter State</em>' containment reference.
     * @see #getCounterState()
     * @generated
     */
    void setCounterState(CounterState value);

} // RepState
