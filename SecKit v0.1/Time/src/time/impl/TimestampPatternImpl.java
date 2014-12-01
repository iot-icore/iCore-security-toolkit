/**
 */
package time.impl;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimeInterval;
import time.TimePackage;
import time.TimestampPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.TimestampPatternImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link time.impl.TimestampPatternImpl#getTimeOfDayMask <em>Time Of Day Mask</em>}</li>
 *   <li>{@link time.impl.TimestampPatternImpl#getDayOfWeekMask <em>Day Of Week Mask</em>}</li>
 *   <li>{@link time.impl.TimestampPatternImpl#getDayOfMonthMask <em>Day Of Month Mask</em>}</li>
 *   <li>{@link time.impl.TimestampPatternImpl#getMonthOfYearMask <em>Month Of Year Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimestampPatternImpl extends PatternImpl implements TimestampPattern {
    /**
     * The cached value of the '{@link #getValidity() <em>Validity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidity()
     * @generated
     * @ordered
     */
    protected TimeInterval validity;

    /**
     * The default value of the '{@link #getTimeOfDayMask() <em>Time Of Day Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeOfDayMask()
     * @generated
     * @ordered
     */
    protected static final String TIME_OF_DAY_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeOfDayMask() <em>Time Of Day Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeOfDayMask()
     * @generated
     * @ordered
     */
    protected String timeOfDayMask = TIME_OF_DAY_MASK_EDEFAULT;

    /**
     * The default value of the '{@link #getDayOfWeekMask() <em>Day Of Week Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfWeekMask()
     * @generated
     * @ordered
     */
    protected static final String DAY_OF_WEEK_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDayOfWeekMask() <em>Day Of Week Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfWeekMask()
     * @generated
     * @ordered
     */
    protected String dayOfWeekMask = DAY_OF_WEEK_MASK_EDEFAULT;

    /**
     * The default value of the '{@link #getDayOfMonthMask() <em>Day Of Month Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfMonthMask()
     * @generated
     * @ordered
     */
    protected static final String DAY_OF_MONTH_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDayOfMonthMask() <em>Day Of Month Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayOfMonthMask()
     * @generated
     * @ordered
     */
    protected String dayOfMonthMask = DAY_OF_MONTH_MASK_EDEFAULT;

    /**
     * The default value of the '{@link #getMonthOfYearMask() <em>Month Of Year Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonthOfYearMask()
     * @generated
     * @ordered
     */
    protected static final String MONTH_OF_YEAR_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMonthOfYearMask() <em>Month Of Year Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonthOfYearMask()
     * @generated
     * @ordered
     */
    protected String monthOfYearMask = MONTH_OF_YEAR_MASK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimestampPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.TIMESTAMP_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeInterval getValidity() {
        return validity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValidity(TimeInterval newValidity, NotificationChain msgs) {
        TimeInterval oldValidity = validity;
        validity = newValidity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__VALIDITY, oldValidity, newValidity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidity(TimeInterval newValidity) {
        if (newValidity != validity) {
            NotificationChain msgs = null;
            if (validity != null)
                msgs = ((InternalEObject)validity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP_PATTERN__VALIDITY, null, msgs);
            if (newValidity != null)
                msgs = ((InternalEObject)newValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP_PATTERN__VALIDITY, null, msgs);
            msgs = basicSetValidity(newValidity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__VALIDITY, newValidity, newValidity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTimeOfDayMask() {
        return timeOfDayMask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeOfDayMask(String newTimeOfDayMask) {
        String oldTimeOfDayMask = timeOfDayMask;
        timeOfDayMask = newTimeOfDayMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__TIME_OF_DAY_MASK, oldTimeOfDayMask, timeOfDayMask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDayOfWeekMask() {
        return dayOfWeekMask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDayOfWeekMask(String newDayOfWeekMask) {
        String oldDayOfWeekMask = dayOfWeekMask;
        dayOfWeekMask = newDayOfWeekMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK, oldDayOfWeekMask, dayOfWeekMask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDayOfMonthMask() {
        return dayOfMonthMask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDayOfMonthMask(String newDayOfMonthMask) {
        String oldDayOfMonthMask = dayOfMonthMask;
        dayOfMonthMask = newDayOfMonthMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK, oldDayOfMonthMask, dayOfMonthMask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMonthOfYearMask() {
        return monthOfYearMask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonthOfYearMask(String newMonthOfYearMask) {
        String oldMonthOfYearMask = monthOfYearMask;
        monthOfYearMask = newMonthOfYearMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK, oldMonthOfYearMask, monthOfYearMask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TimePackage.TIMESTAMP_PATTERN__VALIDITY:
                return basicSetValidity(null, msgs);
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
            case TimePackage.TIMESTAMP_PATTERN__VALIDITY:
                return getValidity();
            case TimePackage.TIMESTAMP_PATTERN__TIME_OF_DAY_MASK:
                return getTimeOfDayMask();
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK:
                return getDayOfWeekMask();
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK:
                return getDayOfMonthMask();
            case TimePackage.TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK:
                return getMonthOfYearMask();
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
            case TimePackage.TIMESTAMP_PATTERN__VALIDITY:
                setValidity((TimeInterval)newValue);
                return;
            case TimePackage.TIMESTAMP_PATTERN__TIME_OF_DAY_MASK:
                setTimeOfDayMask((String)newValue);
                return;
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK:
                setDayOfWeekMask((String)newValue);
                return;
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK:
                setDayOfMonthMask((String)newValue);
                return;
            case TimePackage.TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK:
                setMonthOfYearMask((String)newValue);
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
            case TimePackage.TIMESTAMP_PATTERN__VALIDITY:
                setValidity((TimeInterval)null);
                return;
            case TimePackage.TIMESTAMP_PATTERN__TIME_OF_DAY_MASK:
                setTimeOfDayMask(TIME_OF_DAY_MASK_EDEFAULT);
                return;
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK:
                setDayOfWeekMask(DAY_OF_WEEK_MASK_EDEFAULT);
                return;
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK:
                setDayOfMonthMask(DAY_OF_MONTH_MASK_EDEFAULT);
                return;
            case TimePackage.TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK:
                setMonthOfYearMask(MONTH_OF_YEAR_MASK_EDEFAULT);
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
            case TimePackage.TIMESTAMP_PATTERN__VALIDITY:
                return validity != null;
            case TimePackage.TIMESTAMP_PATTERN__TIME_OF_DAY_MASK:
                return TIME_OF_DAY_MASK_EDEFAULT == null ? timeOfDayMask != null : !TIME_OF_DAY_MASK_EDEFAULT.equals(timeOfDayMask);
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK:
                return DAY_OF_WEEK_MASK_EDEFAULT == null ? dayOfWeekMask != null : !DAY_OF_WEEK_MASK_EDEFAULT.equals(dayOfWeekMask);
            case TimePackage.TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK:
                return DAY_OF_MONTH_MASK_EDEFAULT == null ? dayOfMonthMask != null : !DAY_OF_MONTH_MASK_EDEFAULT.equals(dayOfMonthMask);
            case TimePackage.TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK:
                return MONTH_OF_YEAR_MASK_EDEFAULT == null ? monthOfYearMask != null : !MONTH_OF_YEAR_MASK_EDEFAULT.equals(monthOfYearMask);
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
        result.append(" (timeOfDayMask: ");
        result.append(timeOfDayMask);
        result.append(", dayOfWeekMask: ");
        result.append(dayOfWeekMask);
        result.append(", dayOfMonthMask: ");
        result.append(dayOfMonthMask);
        result.append(", monthOfYearMask: ");
        result.append(monthOfYearMask);
        result.append(')');
        return result.toString();
    }

} //TimestampPatternImpl
