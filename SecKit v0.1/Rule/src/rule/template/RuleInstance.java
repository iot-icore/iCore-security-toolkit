/**
 */
package rule.template;

import models.Element;

import models.variable.VariableInstance;

import org.eclipse.emf.common.util.EList;

import rule.condition.TruthValue;

import rule.state.EventPatternState;
import rule.state.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleInstance#getInstantiationRule <em>Instantiation Rule</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getVariableInstances <em>Variable Instances</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getStates <em>States</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getConditionState <em>Condition State</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getTriggerEventState <em>Trigger Event State</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getTemplate <em>Template</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getValue <em>Value</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getDisposalRuleInstance <em>Disposal Rule Instance</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getInstancesToDispose <em>Instances To Dispose</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getCreatedInstances <em>Created Instances</em>}</li>
 *   <li>{@link rule.template.RuleInstance#getContainedInstances <em>Contained Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleInstance()
 * @model
 * @generated
 */
public interface RuleInstance extends Element {
    /**
     * Returns the value of the '<em><b>Instantiation Rule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getCreatedInstances <em>Created Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation Rule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation Rule</em>' reference.
     * @see #setInstantiationRule(RuleInstance)
     * @see rule.template.TemplatePackage#getRuleInstance_InstantiationRule()
     * @see rule.template.RuleInstance#getCreatedInstances
     * @model opposite="createdInstances"
     * @generated
     */
    RuleInstance getInstantiationRule();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getInstantiationRule <em>Instantiation Rule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation Rule</em>' reference.
     * @see #getInstantiationRule()
     * @generated
     */
    void setInstantiationRule(RuleInstance value);

    /**
     * Returns the value of the '<em><b>Variable Instances</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableInstance}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Instances</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Instances</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleInstance_VariableInstances()
     * @model containment="true"
     * @generated
     */
    EList<VariableInstance> getVariableInstances();

    /**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link rule.state.State}.
     * It is bidirectional and its opposite is '{@link rule.state.State#getRuleInstance <em>Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleInstance_States()
     * @see rule.state.State#getRuleInstance
     * @model opposite="ruleInstance" containment="true"
     * @generated
     */
    EList<State> getStates();

    /**
     * Returns the value of the '<em><b>Condition State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition State</em>' reference.
     * @see #setConditionState(State)
     * @see rule.template.TemplatePackage#getRuleInstance_ConditionState()
     * @model required="true"
     * @generated
     */
    State getConditionState();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getConditionState <em>Condition State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition State</em>' reference.
     * @see #getConditionState()
     * @generated
     */
    void setConditionState(State value);

    /**
     * Returns the value of the '<em><b>Trigger Event State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Event State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Event State</em>' reference.
     * @see #setTriggerEventState(EventPatternState)
     * @see rule.template.TemplatePackage#getRuleInstance_TriggerEventState()
     * @model required="true"
     * @generated
     */
    EventPatternState getTriggerEventState();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getTriggerEventState <em>Trigger Event State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Event State</em>' reference.
     * @see #getTriggerEventState()
     * @generated
     */
    void setTriggerEventState(EventPatternState value);

    /**
     * Returns the value of the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.template.TemplatePackage#getRuleInstance_Template()
     * @model
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getTemplate <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

    /**
     * Returns the value of the '<em><b>Rule Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.TimeStepRuleSet#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Set</em>' reference.
     * @see #setRuleSet(TimeStepRuleSet)
     * @see rule.template.TemplatePackage#getRuleInstance_RuleSet()
     * @see rule.template.TimeStepRuleSet#getRules
     * @model opposite="rules" required="true"
     * @generated
     */
    TimeStepRuleSet getRuleSet();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getRuleSet <em>Rule Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule Set</em>' reference.
     * @see #getRuleSet()
     * @generated
     */
    void setRuleSet(TimeStepRuleSet value);

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration</em>' reference.
     * @see #setConfiguration(RuleTemplateConfiguration)
     * @see rule.template.TemplatePackage#getRuleInstance_Configuration()
     * @model required="true"
     * @generated
     */
    RuleTemplateConfiguration getConfiguration();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getConfiguration <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration</em>' reference.
     * @see #getConfiguration()
     * @generated
     */
    void setConfiguration(RuleTemplateConfiguration value);

    /**
     * Returns the value of the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step</em>' attribute.
     * @see #setTimeStep(long)
     * @see rule.template.TemplatePackage#getRuleInstance_TimeStep()
     * @model
     * @generated
     */
    long getTimeStep();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step</em>' attribute.
     * @see #getTimeStep()
     * @generated
     */
    void setTimeStep(long value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The literals are from the enumeration {@link rule.condition.TruthValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #setValue(TruthValue)
     * @see rule.template.TemplatePackage#getRuleInstance_Value()
     * @model
     * @generated
     */
    TruthValue getValue();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #getValue()
     * @generated
     */
    void setValue(TruthValue value);

    /**
     * Returns the value of the '<em><b>Disposal Rule Instance</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getInstancesToDispose <em>Instances To Dispose</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disposal Rule Instance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disposal Rule Instance</em>' reference.
     * @see #setDisposalRuleInstance(RuleInstance)
     * @see rule.template.TemplatePackage#getRuleInstance_DisposalRuleInstance()
     * @see rule.template.RuleInstance#getInstancesToDispose
     * @model opposite="instancesToDispose"
     * @generated
     */
    RuleInstance getDisposalRuleInstance();

    /**
     * Sets the value of the '{@link rule.template.RuleInstance#getDisposalRuleInstance <em>Disposal Rule Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disposal Rule Instance</em>' reference.
     * @see #getDisposalRuleInstance()
     * @generated
     */
    void setDisposalRuleInstance(RuleInstance value);

    /**
     * Returns the value of the '<em><b>Instances To Dispose</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getDisposalRuleInstance <em>Disposal Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances To Dispose</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances To Dispose</em>' reference list.
     * @see rule.template.TemplatePackage#getRuleInstance_InstancesToDispose()
     * @see rule.template.RuleInstance#getDisposalRuleInstance
     * @model opposite="disposalRuleInstance"
     * @generated
     */
    EList<RuleInstance> getInstancesToDispose();

    /**
     * Returns the value of the '<em><b>Created Instances</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getInstantiationRule <em>Instantiation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Created Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Created Instances</em>' reference list.
     * @see rule.template.TemplatePackage#getRuleInstance_CreatedInstances()
     * @see rule.template.RuleInstance#getInstantiationRule
     * @model opposite="instantiationRule"
     * @generated
     */
    EList<RuleInstance> getCreatedInstances();

    /**
     * Returns the value of the '<em><b>Contained Instances</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Instances</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Instances</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleInstance_ContainedInstances()
     * @model containment="true"
     * @generated
     */
    EList<RuleInstance> getContainedInstances();

} // RuleInstance
