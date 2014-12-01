/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.ActivityInstantiation;
import behavior.instantiation.InstantiationPackage;

import behavior.type.ActivityType;
import behavior.type.TypePackage;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instantiation.ActivityPointInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.ActivityInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActivityInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActivityInstantiationImpl#getActivityPointInstantiation <em>Activity Point Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityInstantiationImpl extends ElementImpl implements ActivityInstantiation {
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
    protected ActivityType type;

    /**
     * The cached value of the '{@link #getActivityPointInstantiation() <em>Activity Point Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPointInstantiation()
     * @generated
     * @ordered
     */
    protected ActivityPointInstantiation activityPointInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ACTIVITY_INSTANTIATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ActivityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(ActivityType newType, NotificationChain msgs) {
        ActivityType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ActivityType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_TYPE__INSTANTIATIONS, ActivityType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ACTIVITY_TYPE__INSTANTIATIONS, ActivityType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointInstantiation getActivityPointInstantiation() {
        if (activityPointInstantiation != null && activityPointInstantiation.eIsProxy()) {
            InternalEObject oldActivityPointInstantiation = (InternalEObject)activityPointInstantiation;
            activityPointInstantiation = (ActivityPointInstantiation)eResolveProxy(oldActivityPointInstantiation);
            if (activityPointInstantiation != oldActivityPointInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION, oldActivityPointInstantiation, activityPointInstantiation));
            }
        }
        return activityPointInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointInstantiation basicGetActivityPointInstantiation() {
        return activityPointInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityPointInstantiation(ActivityPointInstantiation newActivityPointInstantiation) {
        ActivityPointInstantiation oldActivityPointInstantiation = activityPointInstantiation;
        activityPointInstantiation = newActivityPointInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION, oldActivityPointInstantiation, activityPointInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_TYPE__INSTANTIATIONS, ActivityType.class, msgs);
                return basicSetType((ActivityType)otherEnd, msgs);
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION:
                if (resolve) return getActivityPointInstantiation();
                return basicGetActivityPointInstantiation();
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
                setType((ActivityType)newValue);
                return;
            case InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION:
                setActivityPointInstantiation((ActivityPointInstantiation)newValue);
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
                setType((ActivityType)null);
                return;
            case InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION:
                setActivityPointInstantiation((ActivityPointInstantiation)null);
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION:
                return activityPointInstantiation != null;
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

} //ActivityInstantiationImpl
