/**
 */
package rule.template.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.template.RuleInstance;
import rule.template.RuleTemplateConfiguration;
import rule.template.TemplatePackage;
import rule.template.TimeStepRuleSet;
import rule.template.TimeStepSize;

import time.DiscreteClock;
import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Step Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getRulesToRemove <em>Rules To Remove</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getTimeStepSize <em>Time Step Size</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepRuleSetImpl#getConfigurationsToInstantiate <em>Configurations To Instantiate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeStepRuleSetImpl extends ElementImpl implements TimeStepRuleSet {
    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> rules;

    /**
     * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClock()
     * @generated
     * @ordered
     */
    protected DiscreteClock clock;

    /**
     * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastUpdate()
     * @generated
     * @ordered
     */
    protected Timestamp lastUpdate;

    /**
     * The cached value of the '{@link #getRulesToRemove() <em>Rules To Remove</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRulesToRemove()
     * @generated
     * @ordered
     */
    protected EList<RuleInstance> rulesToRemove;

    /**
     * The cached value of the '{@link #getTimeStepSize() <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStepSize()
     * @generated
     * @ordered
     */
    protected TimeStepSize timeStepSize;

    /**
     * The cached value of the '{@link #getConfigurationsToInstantiate() <em>Configurations To Instantiate</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationsToInstantiate()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplateConfiguration> configurationsToInstantiate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeStepRuleSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.TIME_STEP_RULE_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getRules() {
        if (rules == null) {
            rules = new EObjectWithInverseResolvingEList<RuleInstance>(RuleInstance.class, this, TemplatePackage.TIME_STEP_RULE_SET__RULES, TemplatePackage.RULE_INSTANCE__RULE_SET);
        }
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscreteClock getClock() {
        return clock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClock(DiscreteClock newClock, NotificationChain msgs) {
        DiscreteClock oldClock = clock;
        clock = newClock;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__CLOCK, oldClock, newClock);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClock(DiscreteClock newClock) {
        if (newClock != clock) {
            NotificationChain msgs = null;
            if (clock != null)
                msgs = ((InternalEObject)clock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_RULE_SET__CLOCK, null, msgs);
            if (newClock != null)
                msgs = ((InternalEObject)newClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_RULE_SET__CLOCK, null, msgs);
            msgs = basicSetClock(newClock, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__CLOCK, newClock, newClock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLastUpdate(Timestamp newLastUpdate, NotificationChain msgs) {
        Timestamp oldLastUpdate = lastUpdate;
        lastUpdate = newLastUpdate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE, oldLastUpdate, newLastUpdate);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastUpdate(Timestamp newLastUpdate) {
        if (newLastUpdate != lastUpdate) {
            NotificationChain msgs = null;
            if (lastUpdate != null)
                msgs = ((InternalEObject)lastUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE, null, msgs);
            if (newLastUpdate != null)
                msgs = ((InternalEObject)newLastUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE, null, msgs);
            msgs = basicSetLastUpdate(newLastUpdate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE, newLastUpdate, newLastUpdate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleInstance> getRulesToRemove() {
        if (rulesToRemove == null) {
            rulesToRemove = new EObjectResolvingEList<RuleInstance>(RuleInstance.class, this, TemplatePackage.TIME_STEP_RULE_SET__RULES_TO_REMOVE);
        }
        return rulesToRemove;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize getTimeStepSize() {
        if (timeStepSize != null && timeStepSize.eIsProxy()) {
            InternalEObject oldTimeStepSize = (InternalEObject)timeStepSize;
            timeStepSize = (TimeStepSize)eResolveProxy(oldTimeStepSize);
            if (timeStepSize != oldTimeStepSize) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, oldTimeStepSize, timeStepSize));
            }
        }
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize basicGetTimeStepSize() {
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeStepSize(TimeStepSize newTimeStepSize, NotificationChain msgs) {
        TimeStepSize oldTimeStepSize = timeStepSize;
        timeStepSize = newTimeStepSize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, oldTimeStepSize, newTimeStepSize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeStepSize(TimeStepSize newTimeStepSize) {
        if (newTimeStepSize != timeStepSize) {
            NotificationChain msgs = null;
            if (timeStepSize != null)
                msgs = ((InternalEObject)timeStepSize).eInverseRemove(this, TemplatePackage.TIME_STEP_SIZE__RULE_SET, TimeStepSize.class, msgs);
            if (newTimeStepSize != null)
                msgs = ((InternalEObject)newTimeStepSize).eInverseAdd(this, TemplatePackage.TIME_STEP_SIZE__RULE_SET, TimeStepSize.class, msgs);
            msgs = basicSetTimeStepSize(newTimeStepSize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, newTimeStepSize, newTimeStepSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplateConfiguration> getConfigurationsToInstantiate() {
        if (configurationsToInstantiate == null) {
            configurationsToInstantiate = new EObjectResolvingEList<RuleTemplateConfiguration>(RuleTemplateConfiguration.class, this, TemplatePackage.TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE);
        }
        return configurationsToInstantiate;
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                if (timeStepSize != null)
                    msgs = ((InternalEObject)timeStepSize).eInverseRemove(this, TemplatePackage.TIME_STEP_SIZE__RULE_SET, TimeStepSize.class, msgs);
                return basicSetTimeStepSize((TimeStepSize)otherEnd, msgs);
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
            case TemplatePackage.TIME_STEP_RULE_SET__CLOCK:
                return basicSetClock(null, msgs);
            case TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE:
                return basicSetLastUpdate(null, msgs);
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                return basicSetTimeStepSize(null, msgs);
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                return getRules();
            case TemplatePackage.TIME_STEP_RULE_SET__CLOCK:
                return getClock();
            case TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE:
                return getLastUpdate();
            case TemplatePackage.TIME_STEP_RULE_SET__RULES_TO_REMOVE:
                return getRulesToRemove();
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                if (resolve) return getTimeStepSize();
                return basicGetTimeStepSize();
            case TemplatePackage.TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE:
                return getConfigurationsToInstantiate();
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                getRules().clear();
                getRules().addAll((Collection<? extends RuleInstance>)newValue);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__CLOCK:
                setClock((DiscreteClock)newValue);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE:
                setLastUpdate((Timestamp)newValue);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__RULES_TO_REMOVE:
                getRulesToRemove().clear();
                getRulesToRemove().addAll((Collection<? extends RuleInstance>)newValue);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)newValue);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE:
                getConfigurationsToInstantiate().clear();
                getConfigurationsToInstantiate().addAll((Collection<? extends RuleTemplateConfiguration>)newValue);
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                getRules().clear();
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__CLOCK:
                setClock((DiscreteClock)null);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE:
                setLastUpdate((Timestamp)null);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__RULES_TO_REMOVE:
                getRulesToRemove().clear();
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)null);
                return;
            case TemplatePackage.TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE:
                getConfigurationsToInstantiate().clear();
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
            case TemplatePackage.TIME_STEP_RULE_SET__RULES:
                return rules != null && !rules.isEmpty();
            case TemplatePackage.TIME_STEP_RULE_SET__CLOCK:
                return clock != null;
            case TemplatePackage.TIME_STEP_RULE_SET__LAST_UPDATE:
                return lastUpdate != null;
            case TemplatePackage.TIME_STEP_RULE_SET__RULES_TO_REMOVE:
                return rulesToRemove != null && !rulesToRemove.isEmpty();
            case TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE:
                return timeStepSize != null;
            case TemplatePackage.TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE:
                return configurationsToInstantiate != null && !configurationsToInstantiate.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TimeStepRuleSetImpl
