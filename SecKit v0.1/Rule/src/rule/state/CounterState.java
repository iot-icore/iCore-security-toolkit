/**
 */
package rule.state;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.CounterState#getTrue <em>True</em>}</li>
 *   <li>{@link rule.state.CounterState#getUndetermined <em>Undetermined</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getCounterState()
 * @model
 * @generated
 */
public interface CounterState extends AbstractState {
    /**
     * Returns the value of the '<em><b>True</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>True</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>True</em>' attribute.
     * @see #setTrue(long)
     * @see rule.state.StatePackage#getCounterState_True()
     * @model
     * @generated
     */
    long getTrue();

    /**
     * Sets the value of the '{@link rule.state.CounterState#getTrue <em>True</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>True</em>' attribute.
     * @see #getTrue()
     * @generated
     */
    void setTrue(long value);

    /**
     * Returns the value of the '<em><b>Undetermined</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undetermined</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Undetermined</em>' attribute.
     * @see #setUndetermined(long)
     * @see rule.state.StatePackage#getCounterState_Undetermined()
     * @model
     * @generated
     */
    long getUndetermined();

    /**
     * Sets the value of the '{@link rule.state.CounterState#getUndetermined <em>Undetermined</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Undetermined</em>' attribute.
     * @see #getUndetermined()
     * @generated
     */
    void setUndetermined(long value);

} // CounterState
