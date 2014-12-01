/**
 */
package context.instance.impl;

import context.instance.InstancePackage;
import context.instance.NumericPrecision;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Precision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.impl.NumericPrecisionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link context.instance.impl.NumericPrecisionImpl#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link context.instance.impl.NumericPrecisionImpl#getPlusMinusDelta <em>Plus Minus Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericPrecisionImpl extends PrecisionImpl implements NumericPrecision {
    /**
     * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected static final String UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected String unit = UNIT_EDEFAULT;

    /**
     * The default value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignificantDigits()
     * @generated
     * @ordered
     */
    protected static final int SIGNIFICANT_DIGITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignificantDigits()
     * @generated
     * @ordered
     */
    protected int significantDigits = SIGNIFICANT_DIGITS_EDEFAULT;

    /**
     * The default value of the '{@link #getPlusMinusDelta() <em>Plus Minus Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlusMinusDelta()
     * @generated
     * @ordered
     */
    protected static final long PLUS_MINUS_DELTA_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getPlusMinusDelta() <em>Plus Minus Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlusMinusDelta()
     * @generated
     * @ordered
     */
    protected long plusMinusDelta = PLUS_MINUS_DELTA_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumericPrecisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.NUMERIC_PRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit(String newUnit) {
        String oldUnit = unit;
        unit = newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.NUMERIC_PRECISION__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSignificantDigits() {
        return significantDigits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignificantDigits(int newSignificantDigits) {
        int oldSignificantDigits = significantDigits;
        significantDigits = newSignificantDigits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.NUMERIC_PRECISION__SIGNIFICANT_DIGITS, oldSignificantDigits, significantDigits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getPlusMinusDelta() {
        return plusMinusDelta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlusMinusDelta(long newPlusMinusDelta) {
        long oldPlusMinusDelta = plusMinusDelta;
        plusMinusDelta = newPlusMinusDelta;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.NUMERIC_PRECISION__PLUS_MINUS_DELTA, oldPlusMinusDelta, plusMinusDelta));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.NUMERIC_PRECISION__UNIT:
                return getUnit();
            case InstancePackage.NUMERIC_PRECISION__SIGNIFICANT_DIGITS:
                return getSignificantDigits();
            case InstancePackage.NUMERIC_PRECISION__PLUS_MINUS_DELTA:
                return getPlusMinusDelta();
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
            case InstancePackage.NUMERIC_PRECISION__UNIT:
                setUnit((String)newValue);
                return;
            case InstancePackage.NUMERIC_PRECISION__SIGNIFICANT_DIGITS:
                setSignificantDigits((Integer)newValue);
                return;
            case InstancePackage.NUMERIC_PRECISION__PLUS_MINUS_DELTA:
                setPlusMinusDelta((Long)newValue);
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
            case InstancePackage.NUMERIC_PRECISION__UNIT:
                setUnit(UNIT_EDEFAULT);
                return;
            case InstancePackage.NUMERIC_PRECISION__SIGNIFICANT_DIGITS:
                setSignificantDigits(SIGNIFICANT_DIGITS_EDEFAULT);
                return;
            case InstancePackage.NUMERIC_PRECISION__PLUS_MINUS_DELTA:
                setPlusMinusDelta(PLUS_MINUS_DELTA_EDEFAULT);
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
            case InstancePackage.NUMERIC_PRECISION__UNIT:
                return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
            case InstancePackage.NUMERIC_PRECISION__SIGNIFICANT_DIGITS:
                return significantDigits != SIGNIFICANT_DIGITS_EDEFAULT;
            case InstancePackage.NUMERIC_PRECISION__PLUS_MINUS_DELTA:
                return plusMinusDelta != PLUS_MINUS_DELTA_EDEFAULT;
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
        result.append(" (unit: ");
        result.append(unit);
        result.append(", significantDigits: ");
        result.append(significantDigits);
        result.append(", plusMinusDelta: ");
        result.append(plusMinusDelta);
        result.append(')');
        return result.toString();
    }

} //NumericPrecisionImpl
