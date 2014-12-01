/**
 */
package data.instantiation.impl;

import data.instance.AdressSpace;
import data.instance.InstancePackage;

import data.instantiation.AddressSpaceInstantiation;
import data.instantiation.InstantiationPackage;

import data.type.AddressSpaceType;
import data.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instantiation.impl.AddressSpaceInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link data.instantiation.impl.AddressSpaceInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link data.instantiation.impl.AddressSpaceInstantiationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressSpaceInstantiationImpl extends ElementImpl implements AddressSpaceInstantiation {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected AddressSpaceType type;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<AdressSpace> instances;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressSpaceInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ADDRESS_SPACE_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressSpaceType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (AddressSpaceType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressSpaceType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(AddressSpaceType newType, NotificationChain msgs) {
        AddressSpaceType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(AddressSpaceType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS, AddressSpaceType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS, AddressSpaceType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AdressSpace> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<AdressSpace>(AdressSpace.class, this, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES, InstancePackage.ADRESS_SPACE__INSTANTIATION);
        }
        return instances;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__NAME, oldName, name));
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS, AddressSpaceType.class, msgs);
                return basicSetType((AddressSpaceType)otherEnd, msgs);
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__NAME:
                return getName();
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                setType((AddressSpaceType)newValue);
                return;
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends AdressSpace>)newValue);
                return;
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__NAME:
                setName((String)newValue);
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                setType((AddressSpaceType)null);
                return;
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
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
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //AddressSpaceInstantiationImpl
