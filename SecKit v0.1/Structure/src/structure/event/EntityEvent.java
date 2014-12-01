/**
 */
package structure.event;

import rule.event.Event;
import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.event.EntityEvent#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link structure.event.EntityEvent#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.event.EventPackage#getEntityEvent()
 * @model
 * @generated
 */
public interface EntityEvent extends Event {
    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link structure.event.EntityLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see structure.event.EntityLifecycle
     * @see #setLifecycle(EntityLifecycle)
     * @see structure.event.EventPackage#getEntityEvent_Lifecycle()
     * @model
     * @generated
     */
    EntityLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link structure.event.EntityEvent#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see structure.event.EntityLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(EntityLifecycle value);

    /**
     * Returns the value of the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity</em>' containment reference.
     * @see #setEntity(Entity)
     * @see structure.event.EventPackage#getEntityEvent_Entity()
     * @model containment="true"
     * @generated
     */
    Entity getEntity();

    /**
     * Sets the value of the '{@link structure.event.EntityEvent#getEntity <em>Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity</em>' containment reference.
     * @see #getEntity()
     * @generated
     */
    void setEntity(Entity value);

} // EntityEvent
