/**
 */
package behavior.event;

import behavior.pattern.ActivityPattern;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.ActivityEventPattern#getActivityPattern <em>Activity Pattern</em>}</li>
 *   <li>{@link behavior.event.ActivityEventPattern#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getActivityEventPattern()
 * @model
 * @generated
 */
public interface ActivityEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Activity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Pattern</em>' containment reference.
     * @see #setActivityPattern(ActivityPattern)
     * @see behavior.event.EventPackage#getActivityEventPattern_ActivityPattern()
     * @model containment="true"
     * @generated
     */
    ActivityPattern getActivityPattern();

    /**
     * Sets the value of the '{@link behavior.event.ActivityEventPattern#getActivityPattern <em>Activity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Pattern</em>' containment reference.
     * @see #getActivityPattern()
     * @generated
     */
    void setActivityPattern(ActivityPattern value);

    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.event.ActivityLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.ActivityLifecycle
     * @see #setLifecycle(ActivityLifecycle)
     * @see behavior.event.EventPackage#getActivityEventPattern_Lifecycle()
     * @model
     * @generated
     */
    ActivityLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link behavior.event.ActivityEventPattern#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.ActivityLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(ActivityLifecycle value);

} // ActivityEventPattern
