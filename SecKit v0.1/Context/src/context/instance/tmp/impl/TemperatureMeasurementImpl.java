/**
 */
package context.instance.tmp.impl;

import context.instance.impl.ContextImpl;

import context.instance.tmp.TemperatureMeasurement;
import context.instance.tmp.TmpPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temperature Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.tmp.impl.TemperatureMeasurementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link context.instance.tmp.impl.TemperatureMeasurementImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TemperatureMeasurementImpl extends ContextImpl implements TemperatureMeasurement {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected BigDecimal value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final String SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected String scale = SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemperatureMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TmpPackage.Literals.TEMPERATURE_MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(BigDecimal newValue) {
        BigDecimal oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TmpPackage.TEMPERATURE_MEASUREMENT__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScale() {
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScale(String newScale) {
        String oldScale = scale;
        scale = newScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TmpPackage.TEMPERATURE_MEASUREMENT__SCALE, oldScale, scale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TmpPackage.TEMPERATURE_MEASUREMENT__VALUE:
                return getValue();
            case TmpPackage.TEMPERATURE_MEASUREMENT__SCALE:
                return getScale();
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
            case TmpPackage.TEMPERATURE_MEASUREMENT__VALUE:
                setValue((BigDecimal)newValue);
                return;
            case TmpPackage.TEMPERATURE_MEASUREMENT__SCALE:
                setScale((String)newValue);
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
            case TmpPackage.TEMPERATURE_MEASUREMENT__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case TmpPackage.TEMPERATURE_MEASUREMENT__SCALE:
                setScale(SCALE_EDEFAULT);
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
            case TmpPackage.TEMPERATURE_MEASUREMENT__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case TmpPackage.TEMPERATURE_MEASUREMENT__SCALE:
                return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
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
        result.append(" (value: ");
        result.append(value);
        result.append(", scale: ");
        result.append(scale);
        result.append(')');
        return result.toString();
    }

} //TemperatureMeasurementImpl
