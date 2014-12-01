/**
 */
package time.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import time.TimeDuration;
import time.TimePackage;
import time.TimeUnit;
import time.TimestampPrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Precision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.TimestampPrecisionImpl#getPlusMinusDelta <em>Plus Minus Delta</em>}</li>
 *   <li>{@link time.impl.TimestampPrecisionImpl#getLeastSignificantUnit <em>Least Significant Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimestampPrecisionImpl extends MinimalEObjectImpl.Container implements TimestampPrecision {
    /**
     * The cached value of the '{@link #getPlusMinusDelta() <em>Plus Minus Delta</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlusMinusDelta()
     * @generated
     * @ordered
     */
    protected TimeDuration plusMinusDelta;

    /**
     * The default value of the '{@link #getLeastSignificantUnit() <em>Least Significant Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeastSignificantUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnit LEAST_SIGNIFICANT_UNIT_EDEFAULT = TimeUnit.NANOSECOND;

    /**
     * The cached value of the '{@link #getLeastSignificantUnit() <em>Least Significant Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeastSignificantUnit()
     * @generated
     * @ordered
     */
    protected TimeUnit leastSignificantUnit = LEAST_SIGNIFICANT_UNIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimestampPrecisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.TIMESTAMP_PRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration getPlusMinusDelta() {
        return plusMinusDelta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlusMinusDelta(TimeDuration newPlusMinusDelta, NotificationChain msgs) {
        TimeDuration oldPlusMinusDelta = plusMinusDelta;
        plusMinusDelta = newPlusMinusDelta;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA, oldPlusMinusDelta, newPlusMinusDelta);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlusMinusDelta(TimeDuration newPlusMinusDelta) {
        if (newPlusMinusDelta != plusMinusDelta) {
            NotificationChain msgs = null;
            if (plusMinusDelta != null)
                msgs = ((InternalEObject)plusMinusDelta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA, null, msgs);
            if (newPlusMinusDelta != null)
                msgs = ((InternalEObject)newPlusMinusDelta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA, null, msgs);
            msgs = basicSetPlusMinusDelta(newPlusMinusDelta, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA, newPlusMinusDelta, newPlusMinusDelta));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnit getLeastSignificantUnit() {
        return leastSignificantUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeastSignificantUnit(TimeUnit newLeastSignificantUnit) {
        TimeUnit oldLeastSignificantUnit = leastSignificantUnit;
        leastSignificantUnit = newLeastSignificantUnit == null ? LEAST_SIGNIFICANT_UNIT_EDEFAULT : newLeastSignificantUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT, oldLeastSignificantUnit, leastSignificantUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA:
                return basicSetPlusMinusDelta(null, msgs);
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
            case TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA:
                return getPlusMinusDelta();
            case TimePackage.TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT:
                return getLeastSignificantUnit();
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
            case TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA:
                setPlusMinusDelta((TimeDuration)newValue);
                return;
            case TimePackage.TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT:
                setLeastSignificantUnit((TimeUnit)newValue);
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
            case TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA:
                setPlusMinusDelta((TimeDuration)null);
                return;
            case TimePackage.TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT:
                setLeastSignificantUnit(LEAST_SIGNIFICANT_UNIT_EDEFAULT);
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
            case TimePackage.TIMESTAMP_PRECISION__PLUS_MINUS_DELTA:
                return plusMinusDelta != null;
            case TimePackage.TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT:
                return leastSignificantUnit != LEAST_SIGNIFICANT_UNIT_EDEFAULT;
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
        result.append(" (leastSignificantUnit: ");
        result.append(leastSignificantUnit);
        result.append(')');
        return result.toString();
    }

} //TimestampPrecisionImpl
