/**
 */
package rule.event;

import models.Element;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.event.EventSubscription#getEventPattern <em>Event Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.event.EventPackage#getEventSubscription()
 * @model
 * @generated
 */
public interface EventSubscription extends Element {
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
     * @see rule.event.EventPackage#getEventSubscription_EventPattern()
     * @model
     * @generated
     */
    EventPattern getEventPattern();

    /**
     * Sets the value of the '{@link rule.event.EventSubscription#getEventPattern <em>Event Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Pattern</em>' reference.
     * @see #getEventPattern()
     * @generated
     */
    void setEventPattern(EventPattern value);

} // EventSubscription
