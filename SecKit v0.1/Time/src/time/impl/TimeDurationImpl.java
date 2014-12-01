/**
 */
package time.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimeDuration;
import time.TimePackage;
import time.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.TimeDurationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link time.impl.TimeDurationImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeDurationImpl extends ElementImpl implements TimeDuration {
    /**
     * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected static final long AMOUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected long amount = AMOUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.NANOSECOND;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected TimeUnit unit = UNIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeDurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.TIME_DURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getAmount() {
        return amount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAmount(long newAmount) {
        long oldAmount = amount;
        amount = newAmount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_DURATION__AMOUNT, oldAmount, amount));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnit getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit(TimeUnit newUnit) {
        TimeUnit oldUnit = unit;
        unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_DURATION__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TimePackage.TIME_DURATION__AMOUNT:
                return getAmount();
            case TimePackage.TIME_DURATION__UNIT:
                return getUnit();
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
            case TimePackage.TIME_DURATION__AMOUNT:
                setAmount((Long)newValue);
                return;
            case TimePackage.TIME_DURATION__UNIT:
                setUnit((TimeUnit)newValue);
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
            case TimePackage.TIME_DURATION__AMOUNT:
                setAmount(AMOUNT_EDEFAULT);
                return;
            case TimePackage.TIME_DURATION__UNIT:
                setUnit(UNIT_EDEFAULT);
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
            case TimePackage.TIME_DURATION__AMOUNT:
                return amount != AMOUNT_EDEFAULT;
            case TimePackage.TIME_DURATION__UNIT:
                return unit != UNIT_EDEFAULT;
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
        result.append(" (amount: ");
        result.append(amount);
        result.append(", unit: ");
        result.append(unit);
        result.append(')');
        return result.toString();
    }

} //TimeDurationImpl
