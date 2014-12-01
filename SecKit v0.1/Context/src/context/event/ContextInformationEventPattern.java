/**
 */
package context.event;

import context.pattern.ContextInformationPattern;

import data.event.AbstractDataEventPattern;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Information Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.event.ContextInformationEventPattern#getContextInformationPattern <em>Context Information Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.event.EventPackage#getContextInformationEventPattern()
 * @model
 * @generated
 */
public interface ContextInformationEventPattern extends AbstractDataEventPattern, EventPattern {
    /**
     * Returns the value of the '<em><b>Context Information Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Information Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Information Pattern</em>' containment reference.
     * @see #setContextInformationPattern(ContextInformationPattern)
     * @see context.event.EventPackage#getContextInformationEventPattern_ContextInformationPattern()
     * @model containment="true" required="true"
     * @generated
     */
    ContextInformationPattern getContextInformationPattern();

    /**
     * Sets the value of the '{@link context.event.ContextInformationEventPattern#getContextInformationPattern <em>Context Information Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Information Pattern</em>' containment reference.
     * @see #getContextInformationPattern()
     * @generated
     */
    void setContextInformationPattern(ContextInformationPattern value);

} // ContextInformationEventPattern
