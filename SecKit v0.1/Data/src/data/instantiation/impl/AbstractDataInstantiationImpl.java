/**
 */
package data.instantiation.impl;

import data.instance.DataSet;

import data.instantiation.AbstractDataInstantiation;
import data.instantiation.InstantiationPackage;

import data.type.DataType;
import data.type.TypePackage;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instantiation.impl.AbstractDataInstantiationImpl#getContainedDataSet <em>Contained Data Set</em>}</li>
 *   <li>{@link data.instantiation.impl.AbstractDataInstantiationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDataInstantiationImpl extends ElementImpl implements AbstractDataInstantiation {
    /**
     * The cached value of the '{@link #getContainedDataSet() <em>Contained Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedDataSet()
     * @generated
     * @ordered
     */
    protected DataSet containedDataSet;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DataType type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractDataInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ABSTRACT_DATA_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet getContainedDataSet() {
        if (containedDataSet != null && containedDataSet.eIsProxy()) {
            InternalEObject oldContainedDataSet = (InternalEObject)containedDataSet;
            containedDataSet = (DataSet)eResolveProxy(oldContainedDataSet);
            if (containedDataSet != oldContainedDataSet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET, oldContainedDataSet, containedDataSet));
            }
        }
        return containedDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet basicGetContainedDataSet() {
        return containedDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainedDataSet(DataSet newContainedDataSet) {
        DataSet oldContainedDataSet = containedDataSet;
        containedDataSet = newContainedDataSet;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET, oldContainedDataSet, containedDataSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (DataType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(DataType newType, NotificationChain msgs) {
        DataType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(DataType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.DATA_TYPE__INSTANTIATIONS, DataType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.DATA_TYPE__INSTANTIATIONS, DataType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.DATA_TYPE__INSTANTIATIONS, DataType.class, msgs);
                return basicSetType((DataType)otherEnd, msgs);
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
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
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
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET:
                if (resolve) return getContainedDataSet();
                return basicGetContainedDataSet();
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET:
                setContainedDataSet((DataSet)newValue);
                return;
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                setType((DataType)newValue);
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
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET:
                setContainedDataSet((DataSet)null);
                return;
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                setType((DataType)null);
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
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET:
                return containedDataSet != null;
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractDataInstantiationImpl
