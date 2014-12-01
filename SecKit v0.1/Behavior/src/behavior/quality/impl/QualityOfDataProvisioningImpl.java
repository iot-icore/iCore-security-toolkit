/**
 */
package behavior.quality.impl;

import behavior.quality.QualityOfDataProvisioning;
import behavior.quality.QualityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Of Data Provisioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.quality.impl.QualityOfDataProvisioningImpl#getTimestampPrecision <em>Timestamp Precision</em>}</li>
 *   <li>{@link behavior.quality.impl.QualityOfDataProvisioningImpl#getMaxPrecision <em>Max Precision</em>}</li>
 *   <li>{@link behavior.quality.impl.QualityOfDataProvisioningImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityOfDataProvisioningImpl extends QuantitativeImpl implements QualityOfDataProvisioning {
    /**
     * The default value of the '{@link #getTimestampPrecision() <em>Timestamp Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestampPrecision()
     * @generated
     * @ordered
     */
    protected static final String TIMESTAMP_PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimestampPrecision() <em>Timestamp Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestampPrecision()
     * @generated
     * @ordered
     */
    protected String timestampPrecision = TIMESTAMP_PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxPrecision() <em>Max Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxPrecision()
     * @generated
     * @ordered
     */
    protected static final String MAX_PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxPrecision() <em>Max Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxPrecision()
     * @generated
     * @ordered
     */
    protected String maxPrecision = MAX_PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefreshRate()
     * @generated
     * @ordered
     */
    protected static final String REFRESH_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefreshRate()
     * @generated
     * @ordered
     */
    protected String refreshRate = REFRESH_RATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfDataProvisioningImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityPackage.Literals.QUALITY_OF_DATA_PROVISIONING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTimestampPrecision() {
        return timestampPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestampPrecision(String newTimestampPrecision) {
        String oldTimestampPrecision = timestampPrecision;
        timestampPrecision = newTimestampPrecision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QualityPackage.QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION, oldTimestampPrecision, timestampPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMaxPrecision() {
        return maxPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxPrecision(String newMaxPrecision) {
        String oldMaxPrecision = maxPrecision;
        maxPrecision = newMaxPrecision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QualityPackage.QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION, oldMaxPrecision, maxPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRefreshRate() {
        return refreshRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefreshRate(String newRefreshRate) {
        String oldRefreshRate = refreshRate;
        refreshRate = newRefreshRate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QualityPackage.QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE, oldRefreshRate, refreshRate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION:
                return getTimestampPrecision();
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION:
                return getMaxPrecision();
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE:
                return getRefreshRate();
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
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION:
                setTimestampPrecision((String)newValue);
                return;
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION:
                setMaxPrecision((String)newValue);
                return;
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE:
                setRefreshRate((String)newValue);
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
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION:
                setTimestampPrecision(TIMESTAMP_PRECISION_EDEFAULT);
                return;
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION:
                setMaxPrecision(MAX_PRECISION_EDEFAULT);
                return;
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE:
                setRefreshRate(REFRESH_RATE_EDEFAULT);
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
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION:
                return TIMESTAMP_PRECISION_EDEFAULT == null ? timestampPrecision != null : !TIMESTAMP_PRECISION_EDEFAULT.equals(timestampPrecision);
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION:
                return MAX_PRECISION_EDEFAULT == null ? maxPrecision != null : !MAX_PRECISION_EDEFAULT.equals(maxPrecision);
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE:
                return REFRESH_RATE_EDEFAULT == null ? refreshRate != null : !REFRESH_RATE_EDEFAULT.equals(refreshRate);
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
        result.append(" (timestampPrecision: ");
        result.append(timestampPrecision);
        result.append(", maxPrecision: ");
        result.append(maxPrecision);
        result.append(", refreshRate: ");
        result.append(refreshRate);
        result.append(')');
        return result.toString();
    }

} //QualityOfDataProvisioningImpl
