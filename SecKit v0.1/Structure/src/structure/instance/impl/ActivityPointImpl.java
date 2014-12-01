/**
 */
package structure.instance.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instance.ActivityPoint;
import structure.instance.InstancePackage;

import structure.instantiation.ActivityPointInstantiation;
import structure.instantiation.InstantiationPackage;

import structure.type.ActivityPointType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.ActivityPointImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instance.impl.ActivityPointImpl#getType <em>Type</em>}</li>
 *   <li>{@link structure.instance.impl.ActivityPointImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityPointImpl extends ElementImpl implements ActivityPoint {
    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected ActivityPointInstantiation instantiation;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ActivityPointType type;

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
    protected ActivityPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ACTIVITY_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (ActivityPointInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ACTIVITY_POINT__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(ActivityPointInstantiation newInstantiation, NotificationChain msgs) {
        ActivityPointInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY_POINT__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(ActivityPointInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES, ActivityPointInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES, ActivityPointInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY_POINT__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ActivityPointType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ACTIVITY_POINT__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(ActivityPointType newType, NotificationChain msgs) {
        ActivityPointType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY_POINT__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ActivityPointType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANCES, ActivityPointType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANCES, ActivityPointType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY_POINT__TYPE, newType, newType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY_POINT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES, ActivityPointInstantiation.class, msgs);
                return basicSetInstantiation((ActivityPointInstantiation)otherEnd, msgs);
            case InstancePackage.ACTIVITY_POINT__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANCES, ActivityPointType.class, msgs);
                return basicSetType((ActivityPointType)otherEnd, msgs);
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
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
            case InstancePackage.ACTIVITY_POINT__TYPE:
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
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstancePackage.ACTIVITY_POINT__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstancePackage.ACTIVITY_POINT__NAME:
                return getName();
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
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                setInstantiation((ActivityPointInstantiation)newValue);
                return;
            case InstancePackage.ACTIVITY_POINT__TYPE:
                setType((ActivityPointType)newValue);
                return;
            case InstancePackage.ACTIVITY_POINT__NAME:
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
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                setInstantiation((ActivityPointInstantiation)null);
                return;
            case InstancePackage.ACTIVITY_POINT__TYPE:
                setType((ActivityPointType)null);
                return;
            case InstancePackage.ACTIVITY_POINT__NAME:
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
            case InstancePackage.ACTIVITY_POINT__INSTANTIATION:
                return instantiation != null;
            case InstancePackage.ACTIVITY_POINT__TYPE:
                return type != null;
            case InstancePackage.ACTIVITY_POINT__NAME:
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

} //ActivityPointImpl
