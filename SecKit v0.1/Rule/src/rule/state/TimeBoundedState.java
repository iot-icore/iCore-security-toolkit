/**
 */
package rule.state;

import utils.CircularBuffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Bounded State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.TimeBoundedState#getPreviousValues <em>Previous Values</em>}</li>
 *   <li>{@link rule.state.TimeBoundedState#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getTimeBoundedState()
 * @model
 * @generated
 */
public interface TimeBoundedState extends State {
    /**
     * Returns the value of the '<em><b>Previous Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous Values</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous Values</em>' attribute.
     * @see #setPreviousValues(CircularBuffer)
     * @see rule.state.StatePackage#getTimeBoundedState_PreviousValues()
     * @model dataType="rule.state.CircularBuffer"
     * @generated
     */
    CircularBuffer getPreviousValues();

    /**
     * Sets the value of the '{@link rule.state.TimeBoundedState#getPreviousValues <em>Previous Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previous Values</em>' attribute.
     * @see #getPreviousValues()
     * @generated
     */
    void setPreviousValues(CircularBuffer value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see #setPosition(long)
     * @see rule.state.StatePackage#getTimeBoundedState_Position()
     * @model
     * @generated
     */
    long getPosition();

    /**
     * Sets the value of the '{@link rule.state.TimeBoundedState#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see #getPosition()
     * @generated
     */
    void setPosition(long value);

} // TimeBoundedState
