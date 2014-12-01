/**
 */
package data.instance.impl;

import data.instance.Address;
import data.instance.Addressable;
import data.instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.AddressableImpl#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressableImpl extends MinimalEObjectImpl.Container implements Addressable {
    /**
     * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddresses()
     * @generated
     * @ordered
     */
    protected EList<Address> addresses;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ADDRESSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Address> getAddresses() {
        if (addresses == null) {
            addresses = new EObjectResolvingEList<Address>(Address.class, this, InstancePackage.ADDRESSABLE__ADDRESSES);
        }
        return addresses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.ADDRESSABLE__ADDRESSES:
                return getAddresses();
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
            case InstancePackage.ADDRESSABLE__ADDRESSES:
                getAddresses().clear();
                getAddresses().addAll((Collection<? extends Address>)newValue);
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
            case InstancePackage.ADDRESSABLE__ADDRESSES:
                getAddresses().clear();
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
            case InstancePackage.ADDRESSABLE__ADDRESSES:
                return addresses != null && !addresses.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AddressableImpl
