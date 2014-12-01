/**
 */
package behavior.event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.BehaviorEvent#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getBehaviorEvent()
 * @model
 * @generated
 */
public interface BehaviorEvent extends AbstractBehaviorEvent {
    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.event.BehaviorLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.BehaviorLifecycle
     * @see #setLifecycle(BehaviorLifecycle)
     * @see behavior.event.EventPackage#getBehaviorEvent_Lifecycle()
     * @model
     * @generated
     */
    BehaviorLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link behavior.event.BehaviorEvent#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.BehaviorLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(BehaviorLifecycle value);

} // BehaviorEvent
