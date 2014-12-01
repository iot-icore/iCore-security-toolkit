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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instance.ActivityPoint;
import structure.instance.InstancePackage;

import structure.instantiation.ActivityPointInstantiation;
import structure.instantiation.InstantiationPackage;

import structure.type.ActivityPointType;
import structure.type.EntityType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Point Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.ActivityPointInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.ActivityPointInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.impl.ActivityPointInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.impl.ActivityPointInstantiationImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityPointInstantiationImpl extends ElementImpl implements ActivityPointInstantiation {
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
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<ActivityPoint> instances;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityPointInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ACTIVITY_POINT_INSTANTIATION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE, oldType, type));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE, oldType, newType);
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
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS, ActivityPointType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS, ActivityPointType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE, newType, newType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPoint> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<ActivityPoint>(ActivityPoint.class, this, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES, InstancePackage.ACTIVITY_POINT__INSTANTIATION);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getEntityType() {
        if (eContainerFeatureID() != InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE) return null;
        return (EntityType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityType(EntityType newEntityType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEntityType, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityType(EntityType newEntityType) {
        if (newEntityType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE && newEntityType != null)) {
            if (EcoreUtil.isAncestor(this, newEntityType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEntityType != null)
                msgs = ((InternalEObject)newEntityType).eInverseAdd(this, TypePackage.ENTITY_TYPE__ACTIVITY_POINTS, EntityType.class, msgs);
            msgs = basicSetEntityType(newEntityType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE, newEntityType, newEntityType));
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
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS, ActivityPointType.class, msgs);
                return basicSetType((ActivityPointType)otherEnd, msgs);
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEntityType((EntityType)otherEnd, msgs);
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
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                return basicSetEntityType(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE__ACTIVITY_POINTS, EntityType.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                return getEntityType();
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
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                setType((ActivityPointType)newValue);
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends ActivityPoint>)newValue);
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                setEntityType((EntityType)newValue);
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
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                setType((ActivityPointType)null);
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                setEntityType((EntityType)null);
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
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE:
                return getEntityType() != null;
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

} //ActivityPointInstantiationImpl
