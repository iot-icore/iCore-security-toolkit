/**
 */
package time.impl;

import java.util.Date;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimePackage;
import time.Timestamp;
import time.TimestampPrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.TimestampImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link time.impl.TimestampImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimestampImpl extends ElementImpl implements Timestamp {
    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected TimestampPrecision precision;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimestampImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.TIMESTAMP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampPrecision getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPrecision(TimestampPrecision newPrecision, NotificationChain msgs) {
        TimestampPrecision oldPrecision = precision;
        precision = newPrecision;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP__PRECISION, oldPrecision, newPrecision);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrecision(TimestampPrecision newPrecision) {
        if (newPrecision != precision) {
            NotificationChain msgs = null;
            if (precision != null)
                msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP__PRECISION, null, msgs);
            if (newPrecision != null)
                msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIMESTAMP__PRECISION, null, msgs);
            msgs = basicSetPrecision(newPrecision, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP__PRECISION, newPrecision, newPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMESTAMP__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TimePackage.TIMESTAMP__PRECISION:
                return basicSetPrecision(null, msgs);
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
            case TimePackage.TIMESTAMP__PRECISION:
                return getPrecision();
            case TimePackage.TIMESTAMP__DATE:
                return getDate();
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
            case TimePackage.TIMESTAMP__PRECISION:
                setPrecision((TimestampPrecision)newValue);
                return;
            case TimePackage.TIMESTAMP__DATE:
                setDate((Date)newValue);
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
            case TimePackage.TIMESTAMP__PRECISION:
                setPrecision((TimestampPrecision)null);
                return;
            case TimePackage.TIMESTAMP__DATE:
                setDate(DATE_EDEFAULT);
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
            case TimePackage.TIMESTAMP__PRECISION:
                return precision != null;
            case TimePackage.TIMESTAMP__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
        result.append(" (date: ");
        result.append(date);
        result.append(')');
        return result.toString();
    }

} //TimestampImpl
