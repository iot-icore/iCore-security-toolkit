/**
 */
package rule.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.RulePackage;
import rule.RuleRuntimeModel;

import rule.event.EventSet;
import rule.event.EventTrace;

import rule.template.RuleInstance;
import rule.template.TimeStepRuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.impl.RuleRuntimeModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link rule.impl.RuleRuntimeModelImpl#getEventTraces <em>Event Traces</em>}</li>
 *   <li>{@link rule.impl.RuleRuntimeModelImpl#getRuleSets <em>Rule Sets</em>}</li>
 *   <li>{@link rule.impl.RuleRuntimeModelImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link rule.impl.RuleRuntimeModelImpl#getEventSet <em>Event Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleRuntimeModelImpl extends ModelImpl implements RuleRuntimeModel {
    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> rules;

    /**
     * The cached value of the '{@link #getEventTraces() <em>Event Traces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventTraces()
     * @generated
     * @ordered
     */
    protected EList<EventTrace> eventTraces;

    /**
     * The cached value of the '{@link #getRuleSets() <em>Rule Sets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleSets()
     * @generated
     * @ordered
     */
    protected EList<TimeStepRuleSet> ruleSets;

    /**
     * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRunning()
     * @generated
     * @ordered
     */
    protected static final boolean RUNNING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRunning()
     * @generated
     * @ordered
     */
    protected boolean running = RUNNING_EDEFAULT;

    /**
     * The cached value of the '{@link #getEventSet() <em>Event Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventSet()
     * @generated
     * @ordered
     */
    protected EventSet eventSet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleRuntimeModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulePackage.Literals.RULE_RUNTIME_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getRules() {
        if (rules == null) {
            rules = new EObjectContainmentEList<RuleInstance>(RuleInstance.class, this, RulePackage.RULE_RUNTIME_MODEL__RULES);
        }
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventTrace> getEventTraces() {
        if (eventTraces == null) {
            eventTraces = new EObjectContainmentEList<EventTrace>(EventTrace.class, this, RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES);
        }
        return eventTraces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TimeStepRuleSet> getRuleSets() {
        if (ruleSets == null) {
            ruleSets = new EObjectContainmentEList<TimeStepRuleSet>(TimeStepRuleSet.class, this, RulePackage.RULE_RUNTIME_MODEL__RULE_SETS);
        }
        return ruleSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRunning(boolean newRunning) {
        boolean oldRunning = running;
        running = newRunning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.RULE_RUNTIME_MODEL__RUNNING, oldRunning, running));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventSet getEventSet() {
        return eventSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventSet(EventSet newEventSet, NotificationChain msgs) {
        EventSet oldEventSet = eventSet;
        eventSet = newEventSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulePackage.RULE_RUNTIME_MODEL__EVENT_SET, oldEventSet, newEventSet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventSet(EventSet newEventSet) {
        if (newEventSet != eventSet) {
            NotificationChain msgs = null;
            if (eventSet != null)
                msgs = ((InternalEObject)eventSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulePackage.RULE_RUNTIME_MODEL__EVENT_SET, null, msgs);
            if (newEventSet != null)
                msgs = ((InternalEObject)newEventSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulePackage.RULE_RUNTIME_MODEL__EVENT_SET, null, msgs);
            msgs = basicSetEventSet(newEventSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulePackage.RULE_RUNTIME_MODEL__EVENT_SET, newEventSet, newEventSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulePackage.RULE_RUNTIME_MODEL__RULES:
                return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES:
                return ((InternalEList<?>)getEventTraces()).basicRemove(otherEnd, msgs);
            case RulePackage.RULE_RUNTIME_MODEL__RULE_SETS:
                return ((InternalEList<?>)getRuleSets()).basicRemove(otherEnd, msgs);
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_SET:
                return basicSetEventSet(null, msgs);
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
            case RulePackage.RULE_RUNTIME_MODEL__RULES:
                return getRules();
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES:
                return getEventTraces();
            case RulePackage.RULE_RUNTIME_MODEL__RULE_SETS:
                return getRuleSets();
            case RulePackage.RULE_RUNTIME_MODEL__RUNNING:
                return isRunning();
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_SET:
                return getEventSet();
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
            case RulePackage.RULE_RUNTIME_MODEL__RULES:
                getRules().clear();
                getRules().addAll((Collection<? extends RuleInstance>)newValue);
                return;
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES:
                getEventTraces().clear();
                getEventTraces().addAll((Collection<? extends EventTrace>)newValue);
                return;
            case RulePackage.RULE_RUNTIME_MODEL__RULE_SETS:
                getRuleSets().clear();
                getRuleSets().addAll((Collection<? extends TimeStepRuleSet>)newValue);
                return;
            case RulePackage.RULE_RUNTIME_MODEL__RUNNING:
                setRunning((Boolean)newValue);
                return;
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_SET:
                setEventSet((EventSet)newValue);
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
            case RulePackage.RULE_RUNTIME_MODEL__RULES:
                getRules().clear();
                return;
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES:
                getEventTraces().clear();
                return;
            case RulePackage.RULE_RUNTIME_MODEL__RULE_SETS:
                getRuleSets().clear();
                return;
            case RulePackage.RULE_RUNTIME_MODEL__RUNNING:
                setRunning(RUNNING_EDEFAULT);
                return;
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_SET:
                setEventSet((EventSet)null);
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
            case RulePackage.RULE_RUNTIME_MODEL__RULES:
                return rules != null && !rules.isEmpty();
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_TRACES:
                return eventTraces != null && !eventTraces.isEmpty();
            case RulePackage.RULE_RUNTIME_MODEL__RULE_SETS:
                return ruleSets != null && !ruleSets.isEmpty();
            case RulePackage.RULE_RUNTIME_MODEL__RUNNING:
                return running != RUNNING_EDEFAULT;
            case RulePackage.RULE_RUNTIME_MODEL__EVENT_SET:
                return eventSet != null;
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
        result.append(" (running: ");
        result.append(running);
        result.append(')');
        return result.toString();
    }

} //RuleRuntimeModelImpl
