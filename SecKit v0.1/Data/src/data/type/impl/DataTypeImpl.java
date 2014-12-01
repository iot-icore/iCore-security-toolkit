/**
 */
package data.type.impl;

import data.instance.Data;
import data.instance.InstancePackage;

import data.instantiation.AbstractDataInstantiation;
import data.instantiation.InstantiationPackage;

import data.type.DataType;
import data.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.type.impl.DataTypeImpl#getEType <em>EType</em>}</li>
 *   <li>{@link data.type.impl.DataTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link data.type.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link data.type.impl.DataTypeImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataTypeImpl extends ElementImpl implements DataType {
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
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<AbstractDataInstantiation> instantiations;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Data> instances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.DATA_TYPE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.DATA_TYPE__ETYPE, oldEType, eType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DATA_TYPE__ETYPE, oldEType, eType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractDataInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<AbstractDataInstantiation>(AbstractDataInstantiation.class, this, TypePackage.DATA_TYPE__INSTANTIATIONS, InstantiationPackage.ABSTRACT_DATA_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DATA_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Data> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Data>(Data.class, this, TypePackage.DATA_TYPE__INSTANCES, InstancePackage.DATA__TYPE);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.DATA_TYPE__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.DATA_TYPE__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
            case TypePackage.DATA_TYPE__ETYPE:
                if (resolve) return getEType();
                return basicGetEType();
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.DATA_TYPE__NAME:
                return getName();
            case TypePackage.DATA_TYPE__INSTANCES:
                return getInstances();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TypePackage.DATA_TYPE__ETYPE:
                setEType((EClassifier)newValue);
                return;
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends AbstractDataInstantiation>)newValue);
                return;
            case TypePackage.DATA_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.DATA_TYPE__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Data>)newValue);
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
            case TypePackage.DATA_TYPE__ETYPE:
                setEType((EClassifier)null);
                return;
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.DATA_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.DATA_TYPE__INSTANCES:
                getInstances().clear();
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
            case TypePackage.DATA_TYPE__ETYPE:
                return eType != null;
            case TypePackage.DATA_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.DATA_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.DATA_TYPE__INSTANCES:
                return instances != null && !instances.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DataTypeImpl
