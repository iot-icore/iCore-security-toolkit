/**
 */
package behavior.event;

import behavior.pattern.BehaviorPattern;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.BehaviorEventPattern#getBehaviorPattern <em>Behavior Pattern</em>}</li>
 *   <li>{@link behavior.event.BehaviorEventPattern#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getBehaviorEventPattern()
 * @model
 * @generated
 */
public interface BehaviorEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Pattern</em>' containment reference.
     * @see #setBehaviorPattern(BehaviorPattern)
     * @see behavior.event.EventPackage#getBehaviorEventPattern_BehaviorPattern()
     * @model containment="true"
     * @generated
     */
    BehaviorPattern getBehaviorPattern();

    /**
     * Sets the value of the '{@link behavior.event.BehaviorEventPattern#getBehaviorPattern <em>Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Pattern</em>' containment reference.
     * @see #getBehaviorPattern()
     * @generated
     */
    void setBehaviorPattern(BehaviorPattern value);

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
     * @see behavior.event.EventPackage#getBehaviorEventPattern_Lifecycle()
     * @model
     * @generated
     */
    BehaviorLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link behavior.event.BehaviorEventPattern#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.BehaviorLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(BehaviorLifecycle value);

} // BehaviorEventPattern
