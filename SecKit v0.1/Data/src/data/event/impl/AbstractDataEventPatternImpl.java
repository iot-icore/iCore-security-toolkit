/**
 */
package data.event.impl;

import data.event.AbstractDataEventPattern;
import data.event.DataLifecycle;
import data.event.EventPackage;

import data.pattern.DataPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.impl.EventPatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.event.impl.AbstractDataEventPatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link data.event.impl.AbstractDataEventPatternImpl#getDataPattern <em>Data Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDataEventPatternImpl extends EventPatternImpl implements AbstractDataEventPattern {
    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final DataLifecycle LIFECYCLE_EDEFAULT = DataLifecycle.CREATED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected DataLifecycle lifecycle = LIFECYCLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDataPattern() <em>Data Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataPattern()
     * @generated
     * @ordered
     */
    protected DataPattern dataPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractDataEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ABSTRACT_DATA_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(DataLifecycle newLifecycle) {
        DataLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataPattern getDataPattern() {
        return dataPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataPattern(DataPattern newDataPattern, NotificationChain msgs) {
        DataPattern oldDataPattern = dataPattern;
        dataPattern = newDataPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN, oldDataPattern, newDataPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataPattern(DataPattern newDataPattern) {
        if (newDataPattern != dataPattern) {
            NotificationChain msgs = null;
            if (dataPattern != null)
                msgs = ((InternalEObject)dataPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN, null, msgs);
            if (newDataPattern != null)
                msgs = ((InternalEObject)newDataPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN, null, msgs);
            msgs = basicSetDataPattern(newDataPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN, newDataPattern, newDataPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN:
                return basicSetDataPattern(null, msgs);
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
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE:
                return getLifecycle();
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN:
                return getDataPattern();
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
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE:
                setLifecycle((DataLifecycle)newValue);
                return;
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN:
                setDataPattern((DataPattern)newValue);
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
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
                return;
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN:
                setDataPattern((DataPattern)null);
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
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
            case EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN:
                return dataPattern != null;
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
        result.append(" (lifecycle: ");
        result.append(lifecycle);
        result.append(')');
        return result.toString();
    }

} //AbstractDataEventPatternImpl
