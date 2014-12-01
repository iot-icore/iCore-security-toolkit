/**
 */
package rule.condition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.ConditionPackage;
import rule.condition.TimeStepEventPattern;

import time.TimestampPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Step Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.TimeStepEventPatternImpl#getTimestampPattern <em>Timestamp Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeStepEventPatternImpl extends EventPatternImpl implements TimeStepEventPattern {
    /**
     * The cached value of the '{@link #getTimestampPattern() <em>Timestamp Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestampPattern()
     * @generated
     * @ordered
     */
    protected TimestampPattern timestampPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeStepEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.TIME_STEP_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampPattern getTimestampPattern() {
        return timestampPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimestampPattern(TimestampPattern newTimestampPattern, NotificationChain msgs) {
        TimestampPattern oldTimestampPattern = timestampPattern;
        timestampPattern = newTimestampPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN, oldTimestampPattern, newTimestampPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestampPattern(TimestampPattern newTimestampPattern) {
        if (newTimestampPattern != timestampPattern) {
            NotificationChain msgs = null;
            if (timestampPattern != null)
                msgs = ((InternalEObject)timestampPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN, null, msgs);
            if (newTimestampPattern != null)
                msgs = ((InternalEObject)newTimestampPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN, null, msgs);
            msgs = basicSetTimestampPattern(newTimestampPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN, newTimestampPattern, newTimestampPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN:
                return basicSetTimestampPattern(null, msgs);
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
            case ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN:
                return getTimestampPattern();
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
            case ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN:
                setTimestampPattern((TimestampPattern)newValue);
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
            case ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN:
                setTimestampPattern((TimestampPattern)null);
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
            case ConditionPackage.TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN:
                return timestampPattern != null;
        }
        return super.eIsSet(featureID);
    }

} //TimeStepEventPatternImpl
