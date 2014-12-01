/**
 */
package data.instance.impl;

import data.instance.Address;
import data.instance.Addressable;
import data.instance.Data;
import data.instance.DataSet;
import data.instance.InstancePackage;

import data.instantiation.DataInstantiation;
import data.instantiation.InstantiationPackage;

import data.type.AddressType;
import data.type.DataType;
import data.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.DataImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getEObject <em>EObject</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getType <em>Type</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getInitialRepresentation <em>Initial Representation</em>}</li>
 *   <li>{@link data.instance.impl.DataImpl#getDataId <em>Data Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends AbstractDataInstanceImpl implements Data {
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
     * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEObject()
     * @generated
     * @ordered
     */
    protected EObject eObject;

    /**
     * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected DataSet dataSet;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected AddressType location;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected DataInstantiation instantiation;

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
     * The cached value of the '{@link #getInitialRepresentation() <em>Initial Representation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialRepresentation()
     * @generated
     * @ordered
     */
    protected DataInstantiation initialRepresentation;

    /**
     * The default value of the '{@link #getDataId() <em>Data Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataId()
     * @generated
     * @ordered
     */
    protected static final String DATA_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataId() <em>Data Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataId()
     * @generated
     * @ordered
     */
    protected String dataId = DATA_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Address> getAddresses() {
        if (addresses == null) {
            addresses = new EObjectResolvingEList<Address>(Address.class, this, InstancePackage.DATA__ADDRESSES);
        }
        return addresses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getEObject() {
        if (eObject != null && eObject.eIsProxy()) {
            InternalEObject oldEObject = (InternalEObject)eObject;
            eObject = eResolveProxy(oldEObject);
            if (eObject != oldEObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DATA__EOBJECT, oldEObject, eObject));
            }
        }
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetEObject() {
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEObject(EObject newEObject) {
        EObject oldEObject = eObject;
        eObject = newEObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__EOBJECT, oldEObject, eObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet getDataSet() {
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs) {
        DataSet oldDataSet = dataSet;
        dataSet = newDataSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__DATA_SET, oldDataSet, newDataSet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataSet(DataSet newDataSet) {
        if (newDataSet != dataSet) {
            NotificationChain msgs = null;
            if (dataSet != null)
                msgs = ((InternalEObject)dataSet).eInverseRemove(this, InstancePackage.DATA_SET__INSTANCES, DataSet.class, msgs);
            if (newDataSet != null)
                msgs = ((InternalEObject)newDataSet).eInverseAdd(this, InstancePackage.DATA_SET__INSTANCES, DataSet.class, msgs);
            msgs = basicSetDataSet(newDataSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__DATA_SET, newDataSet, newDataSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressType getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation(AddressType newLocation, NotificationChain msgs) {
        AddressType oldLocation = location;
        location = newLocation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__LOCATION, oldLocation, newLocation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(AddressType newLocation) {
        if (newLocation != location) {
            NotificationChain msgs = null;
            if (location != null)
                msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.DATA__LOCATION, null, msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.DATA__LOCATION, null, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__LOCATION, newLocation, newLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (DataInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DATA__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(DataInstantiation newInstantiation, NotificationChain msgs) {
        DataInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(DataInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.DATA_INSTANTIATION__INSTANCES, DataInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.DATA_INSTANTIATION__INSTANCES, DataInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__INSTANTIATION, newInstantiation, newInstantiation));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DATA__TYPE, oldType, type));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__TYPE, oldType, newType);
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
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.DATA_TYPE__INSTANCES, DataType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.DATA_TYPE__INSTANCES, DataType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation getInitialRepresentation() {
        if (initialRepresentation != null && initialRepresentation.eIsProxy()) {
            InternalEObject oldInitialRepresentation = (InternalEObject)initialRepresentation;
            initialRepresentation = (DataInstantiation)eResolveProxy(oldInitialRepresentation);
            if (initialRepresentation != oldInitialRepresentation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DATA__INITIAL_REPRESENTATION, oldInitialRepresentation, initialRepresentation));
            }
        }
        return initialRepresentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation basicGetInitialRepresentation() {
        return initialRepresentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialRepresentation(DataInstantiation newInitialRepresentation) {
        DataInstantiation oldInitialRepresentation = initialRepresentation;
        initialRepresentation = newInitialRepresentation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__INITIAL_REPRESENTATION, oldInitialRepresentation, initialRepresentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataId(String newDataId) {
        String oldDataId = dataId;
        dataId = newDataId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA__DATA_ID, oldDataId, dataId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.DATA__DATA_SET:
                if (dataSet != null)
                    msgs = ((InternalEObject)dataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.DATA__DATA_SET, null, msgs);
                return basicSetDataSet((DataSet)otherEnd, msgs);
            case InstancePackage.DATA__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.DATA_INSTANTIATION__INSTANCES, DataInstantiation.class, msgs);
                return basicSetInstantiation((DataInstantiation)otherEnd, msgs);
            case InstancePackage.DATA__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.DATA_TYPE__INSTANCES, DataType.class, msgs);
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
            case InstancePackage.DATA__DATA_SET:
                return basicSetDataSet(null, msgs);
            case InstancePackage.DATA__LOCATION:
                return basicSetLocation(null, msgs);
            case InstancePackage.DATA__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
            case InstancePackage.DATA__TYPE:
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
            case InstancePackage.DATA__ADDRESSES:
                return getAddresses();
            case InstancePackage.DATA__EOBJECT:
                if (resolve) return getEObject();
                return basicGetEObject();
            case InstancePackage.DATA__DATA_SET:
                return getDataSet();
            case InstancePackage.DATA__LOCATION:
                return getLocation();
            case InstancePackage.DATA__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstancePackage.DATA__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstancePackage.DATA__INITIAL_REPRESENTATION:
                if (resolve) return getInitialRepresentation();
                return basicGetInitialRepresentation();
            case InstancePackage.DATA__DATA_ID:
                return getDataId();
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
            case InstancePackage.DATA__ADDRESSES:
                getAddresses().clear();
                getAddresses().addAll((Collection<? extends Address>)newValue);
                return;
            case InstancePackage.DATA__EOBJECT:
                setEObject((EObject)newValue);
                return;
            case InstancePackage.DATA__DATA_SET:
                setDataSet((DataSet)newValue);
                return;
            case InstancePackage.DATA__LOCATION:
                setLocation((AddressType)newValue);
                return;
            case InstancePackage.DATA__INSTANTIATION:
                setInstantiation((DataInstantiation)newValue);
                return;
            case InstancePackage.DATA__TYPE:
                setType((DataType)newValue);
                return;
            case InstancePackage.DATA__INITIAL_REPRESENTATION:
                setInitialRepresentation((DataInstantiation)newValue);
                return;
            case InstancePackage.DATA__DATA_ID:
                setDataId((String)newValue);
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
            case InstancePackage.DATA__ADDRESSES:
                getAddresses().clear();
                return;
            case InstancePackage.DATA__EOBJECT:
                setEObject((EObject)null);
                return;
            case InstancePackage.DATA__DATA_SET:
                setDataSet((DataSet)null);
                return;
            case InstancePackage.DATA__LOCATION:
                setLocation((AddressType)null);
                return;
            case InstancePackage.DATA__INSTANTIATION:
                setInstantiation((DataInstantiation)null);
                return;
            case InstancePackage.DATA__TYPE:
                setType((DataType)null);
                return;
            case InstancePackage.DATA__INITIAL_REPRESENTATION:
                setInitialRepresentation((DataInstantiation)null);
                return;
            case InstancePackage.DATA__DATA_ID:
                setDataId(DATA_ID_EDEFAULT);
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
            case InstancePackage.DATA__ADDRESSES:
                return addresses != null && !addresses.isEmpty();
            case InstancePackage.DATA__EOBJECT:
                return eObject != null;
            case InstancePackage.DATA__DATA_SET:
                return dataSet != null;
            case InstancePackage.DATA__LOCATION:
                return location != null;
            case InstancePackage.DATA__INSTANTIATION:
                return instantiation != null;
            case InstancePackage.DATA__TYPE:
                return type != null;
            case InstancePackage.DATA__INITIAL_REPRESENTATION:
                return initialRepresentation != null;
            case InstancePackage.DATA__DATA_ID:
                return DATA_ID_EDEFAULT == null ? dataId != null : !DATA_ID_EDEFAULT.equals(dataId);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Addressable.class) {
            switch (derivedFeatureID) {
                case InstancePackage.DATA__ADDRESSES: return InstancePackage.ADDRESSABLE__ADDRESSES;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Addressable.class) {
            switch (baseFeatureID) {
                case InstancePackage.ADDRESSABLE__ADDRESSES: return InstancePackage.DATA__ADDRESSES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (dataId: ");
        result.append(dataId);
        result.append(')');
        return result.toString();
    }

} //DataImpl
