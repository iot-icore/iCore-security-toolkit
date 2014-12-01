/**
 */
package rule.template.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import models.variable.VariableInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.condition.TruthValue;

import rule.state.EventPatternState;
import rule.state.State;
import rule.state.StatePackage;

import rule.template.RuleInstance;
import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.TemplatePackage;
import rule.template.TimeStepRuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getInstantiationRule <em>Instantiation Rule</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getVariableInstances <em>Variable Instances</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getStates <em>States</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getConditionState <em>Condition State</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getTriggerEventState <em>Trigger Event State</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getDisposalRuleInstance <em>Disposal Rule Instance</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getInstancesToDispose <em>Instances To Dispose</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getCreatedInstances <em>Created Instances</em>}</li>
 *   <li>{@link rule.template.impl.RuleInstanceImpl#getContainedInstances <em>Contained Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleInstanceImpl extends ElementImpl implements RuleInstance {
    /**
     * The cached value of the '{@link #getInstantiationRule() <em>Instantiation Rule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiationRule()
     * @generated
     * @ordered
     */
    protected RuleInstance instantiationRule;

    /**
     * The cached value of the '{@link #getVariableInstances() <em>Variable Instances</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableInstances()
     * @generated
     * @ordered
     */
    protected EList<VariableInstance> variableInstances;

    /**
     * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStates()
     * @generated
     * @ordered
     */
    protected EList<State> states;

    /**
     * The cached value of the '{@link #getConditionState() <em>Condition State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionState()
     * @generated
     * @ordered
     */
    protected State conditionState;

    /**
     * The cached value of the '{@link #getTriggerEventState() <em>Trigger Event State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerEventState()
     * @generated
     * @ordered
     */
    protected EventPatternState triggerEventState;

    /**
     * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplate()
     * @generated
     * @ordered
     */
    protected RuleTemplate template;

    /**
     * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleSet()
     * @generated
     * @ordered
     */
    protected TimeStepRuleSet ruleSet;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected RuleTemplateConfiguration configuration;

    /**
     * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected static final long TIME_STEP_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected long timeStep = TIME_STEP_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final TruthValue VALUE_EDEFAULT = TruthValue.UNDETERMINED;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected TruthValue value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDisposalRuleInstance() <em>Disposal Rule Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisposalRuleInstance()
     * @generated
     * @ordered
     */
    protected RuleInstance disposalRuleInstance;

    /**
     * The cached value of the '{@link #getInstancesToDispose() <em>Instances To Dispose</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstancesToDispose()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> instancesToDispose;

    /**
     * The cached value of the '{@link #getCreatedInstances() <em>Created Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedInstances()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> createdInstances;

    /**
     * The cached value of the '{@link #getContainedInstances() <em>Contained Instances</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedInstances()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> containedInstances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance getInstantiationRule() {
        if (instantiationRule != null && instantiationRule.eIsProxy()) {
            InternalEObject oldInstantiationRule = (InternalEObject)instantiationRule;
            instantiationRule = (RuleInstance)eResolveProxy(oldInstantiationRule);
            if (instantiationRule != oldInstantiationRule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE, oldInstantiationRule, instantiationRule));
            }
        }
        return instantiationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance basicGetInstantiationRule() {
        return instantiationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiationRule(RuleInstance newInstantiationRule, NotificationChain msgs) {
        RuleInstance oldInstantiationRule = instantiationRule;
        instantiationRule = newInstantiationRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE, oldInstantiationRule, newInstantiationRule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiationRule(RuleInstance newInstantiationRule) {
        if (newInstantiationRule != instantiationRule) {
            NotificationChain msgs = null;
            if (instantiationRule != null)
                msgs = ((InternalEObject)instantiationRule).eInverseRemove(this, TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES, RuleInstance.class, msgs);
            if (newInstantiationRule != null)
                msgs = ((InternalEObject)newInstantiationRule).eInverseAdd(this, TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES, RuleInstance.class, msgs);
            msgs = basicSetInstantiationRule(newInstantiationRule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE, newInstantiationRule, newInstantiationRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableInstance> getVariableInstances() {
        if (variableInstances == null) {
            variableInstances = new EObjectContainmentEList<VariableInstance>(VariableInstance.class, this, TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES);
        }
        return variableInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<State> getStates() {
        if (states == null) {
            states = new EObjectContainmentWithInverseEList<State>(State.class, this, TemplatePackage.RULE_INSTANCE__STATES, StatePackage.STATE__RULE_INSTANCE);
        }
        return states;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getConditionState() {
        if (conditionState != null && conditionState.eIsProxy()) {
            InternalEObject oldConditionState = (InternalEObject)conditionState;
            conditionState = (State)eResolveProxy(oldConditionState);
            if (conditionState != oldConditionState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__CONDITION_STATE, oldConditionState, conditionState));
            }
        }
        return conditionState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetConditionState() {
        return conditionState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConditionState(State newConditionState) {
        State oldConditionState = conditionState;
        conditionState = newConditionState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__CONDITION_STATE, oldConditionState, conditionState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPatternState getTriggerEventState() {
        if (triggerEventState != null && triggerEventState.eIsProxy()) {
            InternalEObject oldTriggerEventState = (InternalEObject)triggerEventState;
            triggerEventState = (EventPatternState)eResolveProxy(oldTriggerEventState);
            if (triggerEventState != oldTriggerEventState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE, oldTriggerEventState, triggerEventState));
            }
        }
        return triggerEventState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPatternState basicGetTriggerEventState() {
        return triggerEventState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerEventState(EventPatternState newTriggerEventState) {
        EventPatternState oldTriggerEventState = triggerEventState;
        triggerEventState = newTriggerEventState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE, oldTriggerEventState, triggerEventState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getTemplate() {
        if (template != null && template.eIsProxy()) {
            InternalEObject oldTemplate = (InternalEObject)template;
            template = (RuleTemplate)eResolveProxy(oldTemplate);
            if (template != oldTemplate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__TEMPLATE, oldTemplate, template));
            }
        }
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate basicGetTemplate() {
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(RuleTemplate newTemplate) {
        RuleTemplate oldTemplate = template;
        template = newTemplate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__TEMPLATE, oldTemplate, template));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepRuleSet getRuleSet() {
        if (ruleSet != null && ruleSet.eIsProxy()) {
            InternalEObject oldRuleSet = (InternalEObject)ruleSet;
            ruleSet = (TimeStepRuleSet)eResolveProxy(oldRuleSet);
            if (ruleSet != oldRuleSet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__RULE_SET, oldRuleSet, ruleSet));
            }
        }
        return ruleSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepRuleSet basicGetRuleSet() {
        return ruleSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuleSet(TimeStepRuleSet newRuleSet, NotificationChain msgs) {
        TimeStepRuleSet oldRuleSet = ruleSet;
        ruleSet = newRuleSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__RULE_SET, oldRuleSet, newRuleSet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuleSet(TimeStepRuleSet newRuleSet) {
        if (newRuleSet != ruleSet) {
            NotificationChain msgs = null;
            if (ruleSet != null)
                msgs = ((InternalEObject)ruleSet).eInverseRemove(this, TemplatePackage.TIME_STEP_RULE_SET__RULES, TimeStepRuleSet.class, msgs);
            if (newRuleSet != null)
                msgs = ((InternalEObject)newRuleSet).eInverseAdd(this, TemplatePackage.TIME_STEP_RULE_SET__RULES, TimeStepRuleSet.class, msgs);
            msgs = basicSetRuleSet(newRuleSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__RULE_SET, newRuleSet, newRuleSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplateConfiguration getConfiguration() {
        if (configuration != null && configuration.eIsProxy()) {
            InternalEObject oldConfiguration = (InternalEObject)configuration;
            configuration = (RuleTemplateConfiguration)eResolveProxy(oldConfiguration);
            if (configuration != oldConfiguration) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__CONFIGURATION, oldConfiguration, configuration));
            }
        }
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplateConfiguration basicGetConfiguration() {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfiguration(RuleTemplateConfiguration newConfiguration) {
        RuleTemplateConfiguration oldConfiguration = configuration;
        configuration = newConfiguration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__CONFIGURATION, oldConfiguration, configuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTimeStep() {
        return timeStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeStep(long newTimeStep) {
        long oldTimeStep = timeStep;
        timeStep = newTimeStep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__TIME_STEP, oldTimeStep, timeStep));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TruthValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(TruthValue newValue) {
        TruthValue oldValue = value;
        value = newValue == null ? VALUE_EDEFAULT : newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance getDisposalRuleInstance() {
        if (disposalRuleInstance != null && disposalRuleInstance.eIsProxy()) {
            InternalEObject oldDisposalRuleInstance = (InternalEObject)disposalRuleInstance;
            disposalRuleInstance = (RuleInstance)eResolveProxy(oldDisposalRuleInstance);
            if (disposalRuleInstance != oldDisposalRuleInstance) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE, oldDisposalRuleInstance, disposalRuleInstance));
            }
        }
        return disposalRuleInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance basicGetDisposalRuleInstance() {
        return disposalRuleInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDisposalRuleInstance(RuleInstance newDisposalRuleInstance, NotificationChain msgs) {
        RuleInstance oldDisposalRuleInstance = disposalRuleInstance;
        disposalRuleInstance = newDisposalRuleInstance;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE, oldDisposalRuleInstance, newDisposalRuleInstance);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisposalRuleInstance(RuleInstance newDisposalRuleInstance) {
        if (newDisposalRuleInstance != disposalRuleInstance) {
            NotificationChain msgs = null;
            if (disposalRuleInstance != null)
                msgs = ((InternalEObject)disposalRuleInstance).eInverseRemove(this, TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE, RuleInstance.class, msgs);
            if (newDisposalRuleInstance != null)
                msgs = ((InternalEObject)newDisposalRuleInstance).eInverseAdd(this, TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE, RuleInstance.class, msgs);
            msgs = basicSetDisposalRuleInstance(newDisposalRuleInstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE, newDisposalRuleInstance, newDisposalRuleInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getInstancesToDispose() {
        if (instancesToDispose == null) {
            instancesToDispose = new EObjectWithInverseResolvingEList<RuleInstance>(RuleInstance.class, this, TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE, TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE);
        }
        return instancesToDispose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getCreatedInstances() {
        if (createdInstances == null) {
            createdInstances = new EObjectWithInverseResolvingEList<RuleInstance>(RuleInstance.class, this, TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES, TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE);
        }
        return createdInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getContainedInstances() {
        if (containedInstances == null) {
            containedInstances = new EObjectContainmentEList<RuleInstance>(RuleInstance.class, this, TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES);
        }
        return containedInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                if (instantiationRule != null)
                    msgs = ((InternalEObject)instantiationRule).eInverseRemove(this, TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES, RuleInstance.class, msgs);
                return basicSetInstantiationRule((RuleInstance)otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__STATES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                if (ruleSet != null)
                    msgs = ((InternalEObject)ruleSet).eInverseRemove(this, TemplatePackage.TIME_STEP_RULE_SET__RULES, TimeStepRuleSet.class, msgs);
                return basicSetRuleSet((TimeStepRuleSet)otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                if (disposalRuleInstance != null)
                    msgs = ((InternalEObject)disposalRuleInstance).eInverseRemove(this, TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE, RuleInstance.class, msgs);
                return basicSetDisposalRuleInstance((RuleInstance)otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstancesToDispose()).basicAdd(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreatedInstances()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                return basicSetInstantiationRule(null, msgs);
            case TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES:
                return ((InternalEList<?>)getVariableInstances()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__STATES:
                return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                return basicSetRuleSet(null, msgs);
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                return basicSetDisposalRuleInstance(null, msgs);
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                return ((InternalEList<?>)getInstancesToDispose()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                return ((InternalEList<?>)getCreatedInstances()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES:
                return ((InternalEList<?>)getContainedInstances()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                if (resolve) return getInstantiationRule();
                return basicGetInstantiationRule();
            case TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES:
                return getVariableInstances();
            case TemplatePackage.RULE_INSTANCE__STATES:
                return getStates();
            case TemplatePackage.RULE_INSTANCE__CONDITION_STATE:
                if (resolve) return getConditionState();
                return basicGetConditionState();
            case TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE:
                if (resolve) return getTriggerEventState();
                return basicGetTriggerEventState();
            case TemplatePackage.RULE_INSTANCE__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                if (resolve) return getRuleSet();
                return basicGetRuleSet();
            case TemplatePackage.RULE_INSTANCE__CONFIGURATION:
                if (resolve) return getConfiguration();
                return basicGetConfiguration();
            case TemplatePackage.RULE_INSTANCE__TIME_STEP:
                return getTimeStep();
            case TemplatePackage.RULE_INSTANCE__VALUE:
                return getValue();
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                if (resolve) return getDisposalRuleInstance();
                return basicGetDisposalRuleInstance();
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                return getInstancesToDispose();
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                return getCreatedInstances();
            case TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES:
                return getContainedInstances();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                setInstantiationRule((RuleInstance)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES:
                getVariableInstances().clear();
                getVariableInstances().addAll((Collection<? extends VariableInstance>)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__STATES:
                getStates().clear();
                getStates().addAll((Collection<? extends State>)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__CONDITION_STATE:
                setConditionState((State)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE:
                setTriggerEventState((EventPatternState)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__TEMPLATE:
                setTemplate((RuleTemplate)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                setRuleSet((TimeStepRuleSet)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__CONFIGURATION:
                setConfiguration((RuleTemplateConfiguration)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__TIME_STEP:
                setTimeStep((Long)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__VALUE:
                setValue((TruthValue)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                setDisposalRuleInstance((RuleInstance)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                getInstancesToDispose().clear();
                getInstancesToDispose().addAll((Collection<? extends RuleInstance>)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                getCreatedInstances().clear();
                getCreatedInstances().addAll((Collection<? extends RuleInstance>)newValue);
                return;
            case TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES:
                getContainedInstances().clear();
                getContainedInstances().addAll((Collection<? extends RuleInstance>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                setInstantiationRule((RuleInstance)null);
                return;
            case TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES:
                getVariableInstances().clear();
                return;
            case TemplatePackage.RULE_INSTANCE__STATES:
                getStates().clear();
                return;
            case TemplatePackage.RULE_INSTANCE__CONDITION_STATE:
                setConditionState((State)null);
                return;
            case TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE:
                setTriggerEventState((EventPatternState)null);
                return;
            case TemplatePackage.RULE_INSTANCE__TEMPLATE:
                setTemplate((RuleTemplate)null);
                return;
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                setRuleSet((TimeStepRuleSet)null);
                return;
            case TemplatePackage.RULE_INSTANCE__CONFIGURATION:
                setConfiguration((RuleTemplateConfiguration)null);
                return;
            case TemplatePackage.RULE_INSTANCE__TIME_STEP:
                setTimeStep(TIME_STEP_EDEFAULT);
                return;
            case TemplatePackage.RULE_INSTANCE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                setDisposalRuleInstance((RuleInstance)null);
                return;
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                getInstancesToDispose().clear();
                return;
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                getCreatedInstances().clear();
                return;
            case TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES:
                getContainedInstances().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE__INSTANTIATION_RULE:
                return instantiationRule != null;
            case TemplatePackage.RULE_INSTANCE__VARIABLE_INSTANCES:
                return variableInstances != null && !variableInstances.isEmpty();
            case TemplatePackage.RULE_INSTANCE__STATES:
                return states != null && !states.isEmpty();
            case TemplatePackage.RULE_INSTANCE__CONDITION_STATE:
                return conditionState != null;
            case TemplatePackage.RULE_INSTANCE__TRIGGER_EVENT_STATE:
                return triggerEventState != null;
            case TemplatePackage.RULE_INSTANCE__TEMPLATE:
                return template != null;
            case TemplatePackage.RULE_INSTANCE__RULE_SET:
                return ruleSet != null;
            case TemplatePackage.RULE_INSTANCE__CONFIGURATION:
                return configuration != null;
            case TemplatePackage.RULE_INSTANCE__TIME_STEP:
                return timeStep != TIME_STEP_EDEFAULT;
            case TemplatePackage.RULE_INSTANCE__VALUE:
                return value != VALUE_EDEFAULT;
            case TemplatePackage.RULE_INSTANCE__DISPOSAL_RULE_INSTANCE:
                return disposalRuleInstance != null;
            case TemplatePackage.RULE_INSTANCE__INSTANCES_TO_DISPOSE:
                return instancesToDispose != null && !instancesToDispose.isEmpty();
            case TemplatePackage.RULE_INSTANCE__CREATED_INSTANCES:
                return createdInstances != null && !createdInstances.isEmpty();
            case TemplatePackage.RULE_INSTANCE__CONTAINED_INSTANCES:
                return containedInstances != null && !containedInstances.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (timeStep: ");
        result.append(timeStep);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //RuleInstanceImpl
