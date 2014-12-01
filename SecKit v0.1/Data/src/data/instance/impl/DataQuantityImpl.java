/**
 */
package data.instance.impl;

import data.instance.Data;
import data.instance.DataQuantity;
import data.instance.DataSet;
import data.instance.InstancePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.DataQuantityImpl#getData <em>Data</em>}</li>
 *   <li>{@link data.instance.impl.DataQuantityImpl#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataQuantityImpl extends MinimalEObjectImpl.Container implements DataQuantity {
    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected Data data;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataQuantityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.DATA_QUANTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data getData() {
        if (data != null && data.eIsProxy()) {
            InternalEObject oldData = (InternalEObject)data;
            data = (Data)eResolveProxy(oldData);
            if (data != oldData) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DATA_QUANTITY__DATA, oldData, data));
            }
        }
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data basicGetData() {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setData(Data newData) {
        Data oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_QUANTITY__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet getDataSet() {
        if (eContainerFeatureID() != InstancePackage.DATA_QUANTITY__DATA_SET) return null;
        return (DataSet)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDataSet, InstancePackage.DATA_QUANTITY__DATA_SET, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataSet(DataSet newDataSet) {
        if (newDataSet != eInternalContainer() || (eContainerFeatureID() != InstancePackage.DATA_QUANTITY__DATA_SET && newDataSet != null)) {
            if (EcoreUtil.isAncestor(this, newDataSet))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataSet != null)
                msgs = ((InternalEObject)newDataSet).eInverseAdd(this, InstancePackage.DATA_SET__CONTAINED_DATA, DataSet.class, msgs);
            msgs = basicSetDataSet(newDataSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_QUANTITY__DATA_SET, newDataSet, newDataSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDataSet((DataSet)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                return basicSetDataSet(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                return eInternalContainer().eInverseRemove(this, InstancePackage.DATA_SET__CONTAINED_DATA, DataSet.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.DATA_QUANTITY__DATA:
                if (resolve) return getData();
                return basicGetData();
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                return getDataSet();
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
            case InstancePackage.DATA_QUANTITY__DATA:
                setData((Data)newValue);
                return;
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                setDataSet((DataSet)newValue);
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
            case InstancePackage.DATA_QUANTITY__DATA:
                setData((Data)null);
                return;
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                setDataSet((DataSet)null);
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
            case InstancePackage.DATA_QUANTITY__DATA:
                return data != null;
            case InstancePackage.DATA_QUANTITY__DATA_SET:
                return getDataSet() != null;
        }
        return super.eIsSet(featureID);
    }

} //DataQuantityImpl
