/**
 */
package rule.condition;

import time.TimestampPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Step Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.TimeStepEventPattern#getTimestampPattern <em>Timestamp Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getTimeStepEventPattern()
 * @model
 * @generated
 */
public interface TimeStepEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Timestamp Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp Pattern</em>' containment reference.
     * @see #setTimestampPattern(TimestampPattern)
     * @see rule.condition.ConditionPackage#getTimeStepEventPattern_TimestampPattern()
     * @model containment="true"
     * @generated
     */
    TimestampPattern getTimestampPattern();

    /**
     * Sets the value of the '{@link rule.condition.TimeStepEventPattern#getTimestampPattern <em>Timestamp Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp Pattern</em>' containment reference.
     * @see #getTimestampPattern()
     * @generated
     */
    void setTimestampPattern(TimestampPattern value);

} // TimeStepEventPattern
