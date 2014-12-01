/**
 */
package structure.instantiation.impl;

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

import structure.instance.InstancePackage;
import structure.instance.Location;

import structure.instantiation.InstantiationPackage;
import structure.instantiation.LocationInstantiation;

import structure.type.LocationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.LocationInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.impl.LocationInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.LocationInstantiationImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationInstantiationImpl extends ElementImpl implements LocationInstantiation {
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
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected LocationType type;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Location> instances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocationInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.LOCATION_INSTANTIATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.LOCATION_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (LocationType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.LOCATION_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(LocationType newType, NotificationChain msgs) {
        LocationType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.LOCATION_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(LocationType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.LOCATION_TYPE__INSTANTIATIONS, LocationType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.LOCATION_TYPE__INSTANTIATIONS, LocationType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.LOCATION_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Location> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Location>(Location.class, this, InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES, InstancePackage.LOCATION__INSTANTIATION);
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
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.LOCATION_TYPE__INSTANTIATIONS, LocationType.class, msgs);
                return basicSetType((LocationType)otherEnd, msgs);
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.LOCATION_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.LOCATION_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                setType((LocationType)newValue);
                return;
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Location>)newValue);
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
            case InstantiationPackage.LOCATION_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                setType((LocationType)null);
                return;
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
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
            case InstantiationPackage.LOCATION_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.LOCATION_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.LOCATION_INSTANTIATION__INSTANCES:
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

} //LocationInstantiationImpl
