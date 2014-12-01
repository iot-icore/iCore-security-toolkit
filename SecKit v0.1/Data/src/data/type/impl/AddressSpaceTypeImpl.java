/**
 */
package data.type.impl;

import data.instantiation.AddressSpaceInstantiation;
import data.instantiation.InstantiationPackage;

import data.type.AddressSpaceType;
import data.type.AddressType;
import data.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.type.impl.AddressSpaceTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link data.type.impl.AddressSpaceTypeImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AddressSpaceTypeImpl extends MinimalEObjectImpl.Container implements AddressSpaceType {
    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<AddressSpaceInstantiation> instantiations;

    /**
     * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddressType()
     * @generated
     * @ordered
     */
    protected AddressType addressType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressSpaceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ADDRESS_SPACE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AddressSpaceInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<AddressSpaceInstantiation>(AddressSpaceInstantiation.class, this, TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS, InstantiationPackage.ADDRESS_SPACE_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressType getAddressType() {
        if (addressType != null && addressType.eIsProxy()) {
            InternalEObject oldAddressType = (InternalEObject)addressType;
            addressType = (AddressType)eResolveProxy(oldAddressType);
            if (addressType != oldAddressType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE, oldAddressType, addressType));
            }
        }
        return addressType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressType basicGetAddressType() {
        return addressType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddressType(AddressType newAddressType) {
        AddressType oldAddressType = addressType;
        addressType = newAddressType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE, oldAddressType, addressType));
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE:
                if (resolve) return getAddressType();
                return basicGetAddressType();
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends AddressSpaceInstantiation>)newValue);
                return;
            case TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE:
                setAddressType((AddressType)newValue);
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE:
                setAddressType((AddressType)null);
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
            case TypePackage.ADDRESS_SPACE_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.ADDRESS_SPACE_TYPE__ADDRESS_TYPE:
                return addressType != null;
        }
        return super.eIsSet(featureID);
    }

} //AddressSpaceTypeImpl
