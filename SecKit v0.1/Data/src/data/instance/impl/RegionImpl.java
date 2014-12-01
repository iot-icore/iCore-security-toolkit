/**
 */
package data.instance.impl;

import data.instance.Address;
import data.instance.InstancePackage;
import data.instance.Region;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.RegionImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link data.instance.impl.RegionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link data.instance.impl.RegionImpl#getEndAddress <em>End Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
    /**
     * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartAddress()
     * @generated
     * @ordered
     */
    protected Address startAddress;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final long LENGTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected long length = LENGTH_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndAddress()
     * @generated
     * @ordered
     */
    protected Address endAddress;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.REGION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Address getStartAddress() {
        return startAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartAddress(Address newStartAddress, NotificationChain msgs) {
        Address oldStartAddress = startAddress;
        startAddress = newStartAddress;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.REGION__START_ADDRESS, oldStartAddress, newStartAddress);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartAddress(Address newStartAddress) {
        if (newStartAddress != startAddress) {
            NotificationChain msgs = null;
            if (startAddress != null)
                msgs = ((InternalEObject)startAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.REGION__START_ADDRESS, null, msgs);
            if (newStartAddress != null)
                msgs = ((InternalEObject)newStartAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.REGION__START_ADDRESS, null, msgs);
            msgs = basicSetStartAddress(newStartAddress, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.REGION__START_ADDRESS, newStartAddress, newStartAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(long newLength) {
        long oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.REGION__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Address getEndAddress() {
        return endAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndAddress(Address newEndAddress, NotificationChain msgs) {
        Address oldEndAddress = endAddress;
        endAddress = newEndAddress;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.REGION__END_ADDRESS, oldEndAddress, newEndAddress);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndAddress(Address newEndAddress) {
        if (newEndAddress != endAddress) {
            NotificationChain msgs = null;
            if (endAddress != null)
                msgs = ((InternalEObject)endAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.REGION__END_ADDRESS, null, msgs);
            if (newEndAddress != null)
                msgs = ((InternalEObject)newEndAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.REGION__END_ADDRESS, null, msgs);
            msgs = basicSetEndAddress(newEndAddress, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.REGION__END_ADDRESS, newEndAddress, newEndAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.REGION__START_ADDRESS:
                return basicSetStartAddress(null, msgs);
            case InstancePackage.REGION__END_ADDRESS:
                return basicSetEndAddress(null, msgs);
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
            case InstancePackage.REGION__START_ADDRESS:
                return getStartAddress();
            case InstancePackage.REGION__LENGTH:
                return getLength();
            case InstancePackage.REGION__END_ADDRESS:
                return getEndAddress();
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
            case InstancePackage.REGION__START_ADDRESS:
                setStartAddress((Address)newValue);
                return;
            case InstancePackage.REGION__LENGTH:
                setLength((Long)newValue);
                return;
            case InstancePackage.REGION__END_ADDRESS:
                setEndAddress((Address)newValue);
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
            case InstancePackage.REGION__START_ADDRESS:
                setStartAddress((Address)null);
                return;
            case InstancePackage.REGION__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case InstancePackage.REGION__END_ADDRESS:
                setEndAddress((Address)null);
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
            case InstancePackage.REGION__START_ADDRESS:
                return startAddress != null;
            case InstancePackage.REGION__LENGTH:
                return length != LENGTH_EDEFAULT;
            case InstancePackage.REGION__END_ADDRESS:
                return endAddress != null;
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
        result.append(" (length: ");
        result.append(length);
        result.append(')');
        return result.toString();
    }

} //RegionImpl
