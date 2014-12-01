/**
 */
package data.event.impl;

import data.event.DataEvent;
import data.event.DataLifecycle;
import data.event.EventPackage;

import data.instance.Data;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.event.impl.EventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.event.impl.DataEventImpl#getEType <em>EType</em>}</li>
 *   <li>{@link data.event.impl.DataEventImpl#getDataInstance <em>Data Instance</em>}</li>
 *   <li>{@link data.event.impl.DataEventImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataEventImpl extends EventImpl implements DataEvent {
    /**
     * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEType()
     * @generated
     * @ordered
     */
    protected EClassifier eType;

    /**
     * The cached value of the '{@link #getDataInstance() <em>Data Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInstance()
     * @generated
     * @ordered
     */
    protected Data dataInstance;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.DATA_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier getEType() {
        if (eType != null && eType.eIsProxy()) {
            InternalEObject oldEType = (InternalEObject)eType;
            eType = (EClassifier)eResolveProxy(oldEType);
            if (eType != oldEType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.DATA_EVENT__ETYPE, oldEType, eType));
            }
        }
        return eType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier basicGetEType() {
        return eType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEType(EClassifier newEType) {
        EClassifier oldEType = eType;
        eType = newEType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.DATA_EVENT__ETYPE, oldEType, eType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data getDataInstance() {
        if (dataInstance != null && dataInstance.eIsProxy()) {
            InternalEObject oldDataInstance = (InternalEObject)dataInstance;
            dataInstance = (Data)eResolveProxy(oldDataInstance);
            if (dataInstance != oldDataInstance) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.DATA_EVENT__DATA_INSTANCE, oldDataInstance, dataInstance));
            }
        }
        return dataInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data basicGetDataInstance() {
        return dataInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInstance(Data newDataInstance) {
        Data oldDataInstance = dataInstance;
        dataInstance = newDataInstance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.DATA_EVENT__DATA_INSTANCE, oldDataInstance, dataInstance));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.DATA_EVENT__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EventPackage.DATA_EVENT__ETYPE:
                if (resolve) return getEType();
                return basicGetEType();
            case EventPackage.DATA_EVENT__DATA_INSTANCE:
                if (resolve) return getDataInstance();
                return basicGetDataInstance();
            case EventPackage.DATA_EVENT__LIFECYCLE:
                return getLifecycle();
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
            case EventPackage.DATA_EVENT__ETYPE:
                setEType((EClassifier)newValue);
                return;
            case EventPackage.DATA_EVENT__DATA_INSTANCE:
                setDataInstance((Data)newValue);
                return;
            case EventPackage.DATA_EVENT__LIFECYCLE:
                setLifecycle((DataLifecycle)newValue);
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
            case EventPackage.DATA_EVENT__ETYPE:
                setEType((EClassifier)null);
                return;
            case EventPackage.DATA_EVENT__DATA_INSTANCE:
                setDataInstance((Data)null);
                return;
            case EventPackage.DATA_EVENT__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
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
            case EventPackage.DATA_EVENT__ETYPE:
                return eType != null;
            case EventPackage.DATA_EVENT__DATA_INSTANCE:
                return dataInstance != null;
            case EventPackage.DATA_EVENT__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
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

} //DataEventImpl
