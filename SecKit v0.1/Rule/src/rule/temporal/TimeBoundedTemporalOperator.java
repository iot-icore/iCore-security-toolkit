/**
 */
package rule.temporal;

import rule.template.TimeStepVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Bounded Temporal Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.temporal.TimeBoundedTemporalOperator#getTimeBoundInTimeSteps <em>Time Bound In Time Steps</em>}</li>
 *   <li>{@link rule.temporal.TimeBoundedTemporalOperator#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.temporal.TemporalPackage#getTimeBoundedTemporalOperator()
 * @model abstract="true"
 * @generated
 */
public interface TimeBoundedTemporalOperator extends PastTemporalOperator {
    /**
     * Returns the value of the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Bound In Time Steps</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Bound In Time Steps</em>' attribute.
     * @see #setTimeBoundInTimeSteps(long)
     * @see rule.temporal.TemporalPackage#getTimeBoundedTemporalOperator_TimeBoundInTimeSteps()
     * @model required="true"
     * @generated
     */
    long getTimeBoundInTimeSteps();

    /**
     * Sets the value of the '{@link rule.temporal.TimeBoundedTemporalOperator#getTimeBoundInTimeSteps <em>Time Bound In Time Steps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Bound In Time Steps</em>' attribute.
     * @see #getTimeBoundInTimeSteps()
     * @generated
     */
    void setTimeBoundInTimeSteps(long value);

    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(TimeStepVariable)
     * @see rule.temporal.TemporalPackage#getTimeBoundedTemporalOperator_Variable()
     * @model
     * @generated
     */
    TimeStepVariable getVariable();

    /**
     * Sets the value of the '{@link rule.temporal.TimeBoundedTemporalOperator#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(TimeStepVariable value);

} // TimeBoundedTemporalOperator
