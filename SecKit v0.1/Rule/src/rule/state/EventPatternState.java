/**
 */
package rule.state;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Pattern State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.EventPatternState#getEventPattern <em>Event Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getEventPatternState()
 * @model
 * @generated
 */
public interface EventPatternState extends State {
    /**
     * Returns the value of the '<em><b>Event Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Pattern</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Pattern</em>' reference.
     * @see #setEventPattern(EventPattern)
     * @see rule.state.StatePackage#getEventPatternState_EventPattern()
     * @model required="true"
     * @generated
     */
    EventPattern getEventPattern();

    /**
     * Sets the value of the '{@link rule.state.EventPatternState#getEventPattern <em>Event Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Pattern</em>' reference.
     * @see #getEventPattern()
     * @generated
     */
    void setEventPattern(EventPattern value);

} // EventPatternState
