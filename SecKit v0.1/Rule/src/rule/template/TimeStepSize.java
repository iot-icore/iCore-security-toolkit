/**
 */
package rule.template;

import models.Element;

import time.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Step Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.TimeStepSize#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link rule.template.TimeStepSize#getRuleSet <em>Rule Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getTimeStepSize()
 * @model
 * @generated
 */
public interface TimeStepSize extends Element {
    /**
     * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Duration</em>' containment reference.
     * @see #setTimeDuration(TimeDuration)
     * @see rule.template.TemplatePackage#getTimeStepSize_TimeDuration()
     * @model containment="true"
     * @generated
     */
    TimeDuration getTimeDuration();

    /**
     * Sets the value of the '{@link rule.template.TimeStepSize#getTimeDuration <em>Time Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Duration</em>' containment reference.
     * @see #getTimeDuration()
     * @generated
     */
    void setTimeDuration(TimeDuration value);

    /**
     * Returns the value of the '<em><b>Rule Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.TimeStepRuleSet#getTimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Set</em>' reference.
     * @see #setRuleSet(TimeStepRuleSet)
     * @see rule.template.TemplatePackage#getTimeStepSize_RuleSet()
     * @see rule.template.TimeStepRuleSet#getTimeStepSize
     * @model opposite="timeStepSize"
     * @generated
     */
    TimeStepRuleSet getRuleSet();

    /**
     * Sets the value of the '{@link rule.template.TimeStepSize#getRuleSet <em>Rule Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule Set</em>' reference.
     * @see #getRuleSet()
     * @generated
     */
    void setRuleSet(TimeStepRuleSet value);

} // TimeStepSize
