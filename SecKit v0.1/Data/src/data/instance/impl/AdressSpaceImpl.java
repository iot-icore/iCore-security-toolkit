/**
 */
package data.instance.impl;

import data.instance.Address;
import data.instance.AdressSpace;
import data.instance.InstancePackage;

import data.instantiation.AddressSpaceInstantiation;
import data.instantiation.InstantiationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adress Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.AdressSpaceImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link data.instance.impl.AdressSpaceImpl#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdressSpaceImpl extends MinimalEObjectImpl.Container implements AdressSpace {
    /**
     * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddresses()
     * @generated
     * @ordered
     */
    protected EList<Address> addresses;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected AddressSpaceInstantiation instantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AdressSpaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ADRESS_SPACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Address> getAddresses() {
        if (addresses == null) {
            addresses = new EObjectContainmentWithInverseEList<Address>(Address.class, this, InstancePackage.ADRESS_SPACE__ADDRESSES, InstancePackage.ADDRESS__ADRESS_SPACE);
        }
        return addresses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressSpaceInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (AddressSpaceInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ADRESS_SPACE__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressSpaceInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(AddressSpaceInstantiation newInstantiation, NotificationChain msgs) {
        AddressSpaceInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ADRESS_SPACE__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(AddressSpaceInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES, AddressSpaceInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES, AddressSpaceInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ADRESS_SPACE__INSTANTIATION, newInstantiation, newInstantiation));
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddresses()).basicAdd(otherEnd, msgs);
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__INSTANCES, AddressSpaceInstantiation.class, msgs);
                return basicSetInstantiation((AddressSpaceInstantiation)otherEnd, msgs);
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                return getAddresses();
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                getAddresses().clear();
                getAddresses().addAll((Collection<? extends Address>)newValue);
                return;
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                setInstantiation((AddressSpaceInstantiation)newValue);
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                getAddresses().clear();
                return;
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                setInstantiation((AddressSpaceInstantiation)null);
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
            case InstancePackage.ADRESS_SPACE__ADDRESSES:
                return addresses != null && !addresses.isEmpty();
            case InstancePackage.ADRESS_SPACE__INSTANTIATION:
                return instantiation != null;
        }
        return super.eIsSet(featureID);
    }

} //AdressSpaceImpl
