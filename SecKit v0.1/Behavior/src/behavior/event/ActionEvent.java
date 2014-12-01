/**
 */
package behavior.event;

import behavior.instance.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.ActionEvent#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getActionEvent()
 * @model
 * @generated
 */
public interface ActionEvent extends ActivityEvent {
    /**
     * Returns the value of the '<em><b>Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' reference.
     * @see #setAction(Action)
     * @see behavior.event.EventPackage#getActionEvent_Action()
     * @model required="true"
     * @generated
     */
    Action getAction();

    /**
     * Sets the value of the '{@link behavior.event.ActionEvent#getAction <em>Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' reference.
     * @see #getAction()
     * @generated
     */
    void setAction(Action value);

} // ActionEvent
