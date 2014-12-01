/**
 */
package context.event;

import context.instance.ContextSituation;

import rule.event.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.event.ContextSituationEvent#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link context.event.ContextSituationEvent#getSituationValue <em>Situation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.event.EventPackage#getContextSituationEvent()
 * @model
 * @generated
 */
public interface ContextSituationEvent extends Event {
    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link context.event.ContextSituationLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see context.event.ContextSituationLifecycle
     * @see #setLifecycle(ContextSituationLifecycle)
     * @see context.event.EventPackage#getContextSituationEvent_Lifecycle()
     * @model
     * @generated
     */
    ContextSituationLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link context.event.ContextSituationEvent#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see context.event.ContextSituationLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(ContextSituationLifecycle value);

    /**
     * Returns the value of the '<em><b>Situation Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Value</em>' containment reference.
     * @see #setSituationValue(ContextSituation)
     * @see context.event.EventPackage#getContextSituationEvent_SituationValue()
     * @model containment="true" required="true"
     * @generated
     */
    ContextSituation getSituationValue();

    /**
     * Sets the value of the '{@link context.event.ContextSituationEvent#getSituationValue <em>Situation Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Situation Value</em>' containment reference.
     * @see #getSituationValue()
     * @generated
     */
    void setSituationValue(ContextSituation value);

} // ContextSituationEvent
