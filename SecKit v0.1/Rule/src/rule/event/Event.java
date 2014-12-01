/**
 */
package rule.event;

import models.Element;

import org.eclipse.emf.common.util.EList;

import rule.action.Authorization;

import rule.condition.EventPattern;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.event.Event#getSubscribedEventPatterns <em>Subscribed Event Patterns</em>}</li>
 *   <li>{@link rule.event.Event#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link rule.event.Event#getWindows <em>Windows</em>}</li>
 *   <li>{@link rule.event.Event#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link rule.event.Event#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.event.EventPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Element {
    /**
     * Returns the value of the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * The list contents are of type {@link rule.condition.EventPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subscribed Event Patterns</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subscribed Event Patterns</em>' reference list.
     * @see rule.event.EventPackage#getEvent_SubscribedEventPatterns()
     * @model
     * @generated
     */
    EList<EventPattern> getSubscribedEventPatterns();

    /**
     * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp</em>' containment reference.
     * @see #setTimestamp(Timestamp)
     * @see rule.event.EventPackage#getEvent_Timestamp()
     * @model containment="true" required="true"
     * @generated
     */
    Timestamp getTimestamp();

    /**
     * Sets the value of the '{@link rule.event.Event#getTimestamp <em>Timestamp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp</em>' containment reference.
     * @see #getTimestamp()
     * @generated
     */
    void setTimestamp(Timestamp value);

    /**
     * Returns the value of the '<em><b>Windows</b></em>' reference list.
     * The list contents are of type {@link rule.event.TimeWindow}.
     * It is bidirectional and its opposite is '{@link rule.event.TimeWindow#getEvents <em>Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Windows</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Windows</em>' reference list.
     * @see rule.event.EventPackage#getEvent_Windows()
     * @see rule.event.TimeWindow#getEvents
     * @model opposite="events"
     * @generated
     */
    EList<TimeWindow> getWindows();

    /**
     * Returns the value of the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authorization</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authorization</em>' reference.
     * @see #setAuthorization(Authorization)
     * @see rule.event.EventPackage#getEvent_Authorization()
     * @model
     * @generated
     */
    Authorization getAuthorization();

    /**
     * Sets the value of the '{@link rule.event.Event#getAuthorization <em>Authorization</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authorization</em>' reference.
     * @see #getAuthorization()
     * @generated
     */
    void setAuthorization(Authorization value);

    /**
     * Returns the value of the '<em><b>Modality</b></em>' attribute.
     * The literals are from the enumeration {@link rule.event.EventModality}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modality</em>' attribute.
     * @see rule.event.EventModality
     * @see #setModality(EventModality)
     * @see rule.event.EventPackage#getEvent_Modality()
     * @model
     * @generated
     */
    EventModality getModality();

    /**
     * Sets the value of the '{@link rule.event.Event#getModality <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modality</em>' attribute.
     * @see rule.event.EventModality
     * @see #getModality()
     * @generated
     */
    void setModality(EventModality value);

} // Event
