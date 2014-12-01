/**
 */
package rule.template;

import models.Element;

import org.eclipse.emf.common.util.EList;

import time.DiscreteClock;
import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Step Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.TimeStepRuleSet#getRules <em>Rules</em>}</li>
 *   <li>{@link rule.template.TimeStepRuleSet#getClock <em>Clock</em>}</li>
 *   <li>{@link rule.template.TimeStepRuleSet#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link rule.template.TimeStepRuleSet#getRulesToRemove <em>Rules To Remove</em>}</li>
 *   <li>{@link rule.template.TimeStepRuleSet#getTimeStepSize <em>Time Step Size</em>}</li>
 *   <li>{@link rule.template.TimeStepRuleSet#getConfigurationsToInstantiate <em>Configurations To Instantiate</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getTimeStepRuleSet()
 * @model
 * @generated
 */
public interface TimeStepRuleSet extends Element {
    /**
     * Returns the value of the '<em><b>Rules</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getRuleSet <em>Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' reference list.
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_Rules()
     * @see rule.template.RuleInstance#getRuleSet
     * @model opposite="ruleSet"
     * @generated
     */
    EList<RuleInstance> getRules();

    /**
     * Returns the value of the '<em><b>Clock</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clock</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clock</em>' containment reference.
     * @see #setClock(DiscreteClock)
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_Clock()
     * @model containment="true"
     * @generated
     */
    DiscreteClock getClock();

    /**
     * Sets the value of the '{@link rule.template.TimeStepRuleSet#getClock <em>Clock</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clock</em>' containment reference.
     * @see #getClock()
     * @generated
     */
    void setClock(DiscreteClock value);

    /**
     * Returns the value of the '<em><b>Last Update</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Update</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Update</em>' containment reference.
     * @see #setLastUpdate(Timestamp)
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_LastUpdate()
     * @model containment="true"
     * @generated
     */
    Timestamp getLastUpdate();

    /**
     * Sets the value of the '{@link rule.template.TimeStepRuleSet#getLastUpdate <em>Last Update</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Update</em>' containment reference.
     * @see #getLastUpdate()
     * @generated
     */
    void setLastUpdate(Timestamp value);

    /**
     * Returns the value of the '<em><b>Rules To Remove</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules To Remove</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules To Remove</em>' reference list.
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_RulesToRemove()
     * @model
     * @generated
     */
    EList<RuleInstance> getRulesToRemove();

    /**
     * Returns the value of the '<em><b>Time Step Size</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.TimeStepSize#getRuleSet <em>Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step Size</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step Size</em>' reference.
     * @see #setTimeStepSize(TimeStepSize)
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_TimeStepSize()
     * @see rule.template.TimeStepSize#getRuleSet
     * @model opposite="ruleSet"
     * @generated
     */
    TimeStepSize getTimeStepSize();

    /**
     * Sets the value of the '{@link rule.template.TimeStepRuleSet#getTimeStepSize <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step Size</em>' reference.
     * @see #getTimeStepSize()
     * @generated
     */
    void setTimeStepSize(TimeStepSize value);

    /**
     * Returns the value of the '<em><b>Configurations To Instantiate</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleTemplateConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations To Instantiate</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations To Instantiate</em>' reference list.
     * @see rule.template.TemplatePackage#getTimeStepRuleSet_ConfigurationsToInstantiate()
     * @model
     * @generated
     */
    EList<RuleTemplateConfiguration> getConfigurationsToInstantiate();

} // TimeStepRuleSet
