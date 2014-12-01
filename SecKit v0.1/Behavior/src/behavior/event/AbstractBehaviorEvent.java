/**
 */
package behavior.event;

import behavior.instance.Behavior;

import rule.event.Event;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Behavior Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.AbstractBehaviorEvent#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link behavior.event.AbstractBehaviorEvent#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getAbstractBehaviorEvent()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBehaviorEvent extends Event {
    /**
     * Returns the value of the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior</em>' reference.
     * @see #setBehavior(Behavior)
     * @see behavior.event.EventPackage#getAbstractBehaviorEvent_Behavior()
     * @model
     * @generated
     */
    Behavior getBehavior();

    /**
     * Sets the value of the '{@link behavior.event.AbstractBehaviorEvent#getBehavior <em>Behavior</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior</em>' reference.
     * @see #getBehavior()
     * @generated
     */
    void setBehavior(Behavior value);

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
     * @see behavior.event.EventPackage#getAbstractBehaviorEvent_Entity()
     * @model containment="true"
     * @generated
     */
    Entity getEntity();

    /**
     * Sets the value of the '{@link behavior.event.AbstractBehaviorEvent#getEntity <em>Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity</em>' containment reference.
     * @see #getEntity()
     * @generated
     */
    void setEntity(Entity value);

} // AbstractBehaviorEvent
