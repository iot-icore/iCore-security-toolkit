/**
 */
package context.instance.impl;

import context.instance.InstancePackage;
import context.instance.Precision;
import context.instance.QualityOfContext;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimeDuration;
import time.TimestampPrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Of Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.impl.QualityOfContextImpl#getDeclaredPrecision <em>Declared Precision</em>}</li>
 *   <li>{@link context.instance.impl.QualityOfContextImpl#getImplicitPrecision <em>Implicit Precision</em>}</li>
 *   <li>{@link context.instance.impl.QualityOfContextImpl#getTimestampPrecision <em>Timestamp Precision</em>}</li>
 *   <li>{@link context.instance.impl.QualityOfContextImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityOfContextImpl extends ElementImpl implements QualityOfContext {
    /**
     * The cached value of the '{@link #getDeclaredPrecision() <em>Declared Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeclaredPrecision()
     * @generated
     * @ordered
     */
    protected Precision declaredPrecision;

    /**
     * The cached value of the '{@link #getImplicitPrecision() <em>Implicit Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplicitPrecision()
     * @generated
     * @ordered
     */
    protected Precision implicitPrecision;

    /**
     * The cached value of the '{@link #getTimestampPrecision() <em>Timestamp Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestampPrecision()
     * @generated
     * @ordered
     */
    protected TimestampPrecision timestampPrecision;

    /**
     * The cached value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefreshRate()
     * @generated
     * @ordered
     */
    protected TimeDuration refreshRate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.QUALITY_OF_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Precision getDeclaredPrecision() {
        return declaredPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDeclaredPrecision(Precision newDeclaredPrecision, NotificationChain msgs) {
        Precision oldDeclaredPrecision = declaredPrecision;
        declaredPrecision = newDeclaredPrecision;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION, oldDeclaredPrecision, newDeclaredPrecision);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeclaredPrecision(Precision newDeclaredPrecision) {
        if (newDeclaredPrecision != declaredPrecision) {
            NotificationChain msgs = null;
            if (declaredPrecision != null)
                msgs = ((InternalEObject)declaredPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION, null, msgs);
            if (newDeclaredPrecision != null)
                msgs = ((InternalEObject)newDeclaredPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION, null, msgs);
            msgs = basicSetDeclaredPrecision(newDeclaredPrecision, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION, newDeclaredPrecision, newDeclaredPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Precision getImplicitPrecision() {
        return implicitPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImplicitPrecision(Precision newImplicitPrecision, NotificationChain msgs) {
        Precision oldImplicitPrecision = implicitPrecision;
        implicitPrecision = newImplicitPrecision;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION, oldImplicitPrecision, newImplicitPrecision);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplicitPrecision(Precision newImplicitPrecision) {
        if (newImplicitPrecision != implicitPrecision) {
            NotificationChain msgs = null;
            if (implicitPrecision != null)
                msgs = ((InternalEObject)implicitPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION, null, msgs);
            if (newImplicitPrecision != null)
                msgs = ((InternalEObject)newImplicitPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION, null, msgs);
            msgs = basicSetImplicitPrecision(newImplicitPrecision, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION, newImplicitPrecision, newImplicitPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampPrecision getTimestampPrecision() {
        return timestampPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimestampPrecision(TimestampPrecision newTimestampPrecision, NotificationChain msgs) {
        TimestampPrecision oldTimestampPrecision = timestampPrecision;
        timestampPrecision = newTimestampPrecision;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION, oldTimestampPrecision, newTimestampPrecision);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestampPrecision(TimestampPrecision newTimestampPrecision) {
        if (newTimestampPrecision != timestampPrecision) {
            NotificationChain msgs = null;
            if (timestampPrecision != null)
                msgs = ((InternalEObject)timestampPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION, null, msgs);
            if (newTimestampPrecision != null)
                msgs = ((InternalEObject)newTimestampPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION, null, msgs);
            msgs = basicSetTimestampPrecision(newTimestampPrecision, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION, newTimestampPrecision, newTimestampPrecision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration getRefreshRate() {
        return refreshRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefreshRate(TimeDuration newRefreshRate, NotificationChain msgs) {
        TimeDuration oldRefreshRate = refreshRate;
        refreshRate = newRefreshRate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE, oldRefreshRate, newRefreshRate);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefreshRate(TimeDuration newRefreshRate) {
        if (newRefreshRate != refreshRate) {
            NotificationChain msgs = null;
            if (refreshRate != null)
                msgs = ((InternalEObject)refreshRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE, null, msgs);
            if (newRefreshRate != null)
                msgs = ((InternalEObject)newRefreshRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE, null, msgs);
            msgs = basicSetRefreshRate(newRefreshRate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE, newRefreshRate, newRefreshRate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION:
                return basicSetDeclaredPrecision(null, msgs);
            case InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION:
                return basicSetImplicitPrecision(null, msgs);
            case InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION:
                return basicSetTimestampPrecision(null, msgs);
            case InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE:
                return basicSetRefreshRate(null, msgs);
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
            case InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION:
                return getDeclaredPrecision();
            case InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION:
                return getImplicitPrecision();
            case InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION:
                return getTimestampPrecision();
            case InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE:
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
            case InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION:
                setDeclaredPrecision((Precision)newValue);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION:
                setImplicitPrecision((Precision)newValue);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION:
                setTimestampPrecision((TimestampPrecision)newValue);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE:
                setRefreshRate((TimeDuration)newValue);
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
            case InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION:
                setDeclaredPrecision((Precision)null);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION:
                setImplicitPrecision((Precision)null);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION:
                setTimestampPrecision((TimestampPrecision)null);
                return;
            case InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE:
                setRefreshRate((TimeDuration)null);
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
            case InstancePackage.QUALITY_OF_CONTEXT__DECLARED_PRECISION:
                return declaredPrecision != null;
            case InstancePackage.QUALITY_OF_CONTEXT__IMPLICIT_PRECISION:
                return implicitPrecision != null;
            case InstancePackage.QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION:
                return timestampPrecision != null;
            case InstancePackage.QUALITY_OF_CONTEXT__REFRESH_RATE:
                return refreshRate != null;
        }
        return super.eIsSet(featureID);
    }

} //QualityOfContextImpl
