/**
 */
package behavior.event;

import behavior.instance.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.InteractionEvent#getInteraction <em>Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getInteractionEvent()
 * @model
 * @generated
 */
public interface InteractionEvent extends ActivityEvent {
    /**
     * Returns the value of the '<em><b>Interaction</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction</em>' reference.
     * @see #setInteraction(Interaction)
     * @see behavior.event.EventPackage#getInteractionEvent_Interaction()
     * @model required="true"
     * @generated
     */
    Interaction getInteraction();

    /**
     * Sets the value of the '{@link behavior.event.InteractionEvent#getInteraction <em>Interaction</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction</em>' reference.
     * @see #getInteraction()
     * @generated
     */
    void setInteraction(Interaction value);

} // InteractionEvent
