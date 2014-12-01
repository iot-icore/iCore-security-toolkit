/**
 */
package context.event;

import context.pattern.ContextSituationPattern;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.event.ContextSituationEventPattern#getContextSituationPattern <em>Context Situation Pattern</em>}</li>
 *   <li>{@link context.event.ContextSituationEventPattern#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.event.EventPackage#getContextSituationEventPattern()
 * @model
 * @generated
 */
public interface ContextSituationEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Context Situation Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Situation Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Situation Pattern</em>' containment reference.
     * @see #setContextSituationPattern(ContextSituationPattern)
     * @see context.event.EventPackage#getContextSituationEventPattern_ContextSituationPattern()
     * @model containment="true" required="true"
     * @generated
     */
    ContextSituationPattern getContextSituationPattern();

    /**
     * Sets the value of the '{@link context.event.ContextSituationEventPattern#getContextSituationPattern <em>Context Situation Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Situation Pattern</em>' containment reference.
     * @see #getContextSituationPattern()
     * @generated
     */
    void setContextSituationPattern(ContextSituationPattern value);

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
     * @see context.event.EventPackage#getContextSituationEventPattern_Lifecycle()
     * @model
     * @generated
     */
    ContextSituationLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link context.event.ContextSituationEventPattern#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see context.event.ContextSituationLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(ContextSituationLifecycle value);

} // ContextSituationEventPattern
