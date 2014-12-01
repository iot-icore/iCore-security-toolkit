/**
 */
package rule.template.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.template.TemplatePackage;
import rule.template.TimeStepRuleSet;
import rule.template.TimeStepSize;

import time.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Step Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.TimeStepSizeImpl#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link rule.template.impl.TimeStepSizeImpl#getRuleSet <em>Rule Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeStepSizeImpl extends ElementImpl implements TimeStepSize {
    /**
     * The cached value of the '{@link #getTimeDuration() <em>Time Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDuration()
     * @generated
     * @ordered
     */
    protected TimeDuration timeDuration;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeStepSizeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.TIME_STEP_SIZE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration getTimeDuration() {
        return timeDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeDuration(TimeDuration newTimeDuration, NotificationChain msgs) {
        TimeDuration oldTimeDuration = timeDuration;
        timeDuration = newTimeDuration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_SIZE__TIME_DURATION, oldTimeDuration, newTimeDuration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeDuration(TimeDuration newTimeDuration) {
        if (newTimeDuration != timeDuration) {
            NotificationChain msgs = null;
            if (timeDuration != null)
                msgs = ((InternalEObject)timeDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_SIZE__TIME_DURATION, null, msgs);
            if (newTimeDuration != null)
                msgs = ((InternalEObject)newTimeDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.TIME_STEP_SIZE__TIME_DURATION, null, msgs);
            msgs = basicSetTimeDuration(newTimeDuration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_SIZE__TIME_DURATION, newTimeDuration, newTimeDuration));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.TIME_STEP_SIZE__RULE_SET, oldRuleSet, ruleSet));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_SIZE__RULE_SET, oldRuleSet, newRuleSet);
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
                msgs = ((InternalEObject)ruleSet).eInverseRemove(this, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, TimeStepRuleSet.class, msgs);
            if (newRuleSet != null)
                msgs = ((InternalEObject)newRuleSet).eInverseAdd(this, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, TimeStepRuleSet.class, msgs);
            msgs = basicSetRuleSet(newRuleSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.TIME_STEP_SIZE__RULE_SET, newRuleSet, newRuleSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                if (ruleSet != null)
                    msgs = ((InternalEObject)ruleSet).eInverseRemove(this, TemplatePackage.TIME_STEP_RULE_SET__TIME_STEP_SIZE, TimeStepRuleSet.class, msgs);
                return basicSetRuleSet((TimeStepRuleSet)otherEnd, msgs);
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
            case TemplatePackage.TIME_STEP_SIZE__TIME_DURATION:
                return basicSetTimeDuration(null, msgs);
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                return basicSetRuleSet(null, msgs);
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
            case TemplatePackage.TIME_STEP_SIZE__TIME_DURATION:
                return getTimeDuration();
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                if (resolve) return getRuleSet();
                return basicGetRuleSet();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TemplatePackage.TIME_STEP_SIZE__TIME_DURATION:
                setTimeDuration((TimeDuration)newValue);
                return;
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                setRuleSet((TimeStepRuleSet)newValue);
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
            case TemplatePackage.TIME_STEP_SIZE__TIME_DURATION:
                setTimeDuration((TimeDuration)null);
                return;
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                setRuleSet((TimeStepRuleSet)null);
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
            case TemplatePackage.TIME_STEP_SIZE__TIME_DURATION:
                return timeDuration != null;
            case TemplatePackage.TIME_STEP_SIZE__RULE_SET:
                return ruleSet != null;
        }
        return super.eIsSet(featureID);
    }

} //TimeStepSizeImpl
