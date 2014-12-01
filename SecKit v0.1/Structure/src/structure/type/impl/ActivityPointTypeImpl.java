/**
 */
package structure.type.impl;

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
import structure.type.EntityTypePackage;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link structure.type.impl.ActivityPointTypeImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityPointTypeImpl extends ElementImpl implements ActivityPointType {
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
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<ActivityPointInstantiation> instantiations;

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
     * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubTypes()
     * @generated
     * @ordered
     */
    protected EList<ActivityPointType> subTypes;

    /**
     * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperType()
     * @generated
     * @ordered
     */
    protected ActivityPointType superType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityPointTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ACTIVITY_POINT_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_POINT_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPointInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<ActivityPointInstantiation>(ActivityPointInstantiation.class, this, TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPoint> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<ActivityPoint>(ActivityPoint.class, this, TypePackage.ACTIVITY_POINT_TYPE__INSTANCES, InstancePackage.ACTIVITY_POINT__TYPE);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.ACTIVITY_POINT_TYPE__PACKAGE) return null;
        return (EntityTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(EntityTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.ACTIVITY_POINT_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(EntityTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.ACTIVITY_POINT_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES, EntityTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_POINT_TYPE__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPointType> getSubTypes() {
        if (subTypes == null) {
            subTypes = new EObjectWithInverseResolvingEList<ActivityPointType>(ActivityPointType.class, this, TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES, TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE);
        }
        return subTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType getSuperType() {
        if (superType != null && superType.eIsProxy()) {
            InternalEObject oldSuperType = (InternalEObject)superType;
            superType = (ActivityPointType)eResolveProxy(oldSuperType);
            if (superType != oldSuperType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE, oldSuperType, superType));
            }
        }
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType basicGetSuperType() {
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperType(ActivityPointType newSuperType, NotificationChain msgs) {
        ActivityPointType oldSuperType = superType;
        superType = newSuperType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE, oldSuperType, newSuperType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperType(ActivityPointType newSuperType) {
        if (newSuperType != superType) {
            NotificationChain msgs = null;
            if (superType != null)
                msgs = ((InternalEObject)superType).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES, ActivityPointType.class, msgs);
            if (newSuperType != null)
                msgs = ((InternalEObject)newSuperType).eInverseAdd(this, TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES, ActivityPointType.class, msgs);
            msgs = basicSetSuperType(newSuperType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE, newSuperType, newSuperType));
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
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((EntityTypePackage)otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                if (superType != null)
                    msgs = ((InternalEObject)superType).eInverseRemove(this, TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES, ActivityPointType.class, msgs);
                return basicSetSuperType((ActivityPointType)otherEnd, msgs);
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
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                return basicSetSuperType(null, msgs);
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
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES, EntityTypePackage.class, msgs);
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
            case TypePackage.ACTIVITY_POINT_TYPE__NAME:
                return getName();
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                return getInstances();
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                return getPackage();
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                return getSubTypes();
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                if (resolve) return getSuperType();
                return basicGetSuperType();
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
            case TypePackage.ACTIVITY_POINT_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends ActivityPointInstantiation>)newValue);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends ActivityPoint>)newValue);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                setPackage((EntityTypePackage)newValue);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                getSubTypes().clear();
                getSubTypes().addAll((Collection<? extends ActivityPointType>)newValue);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                setSuperType((ActivityPointType)newValue);
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
            case TypePackage.ACTIVITY_POINT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                getInstances().clear();
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                setPackage((EntityTypePackage)null);
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                getSubTypes().clear();
                return;
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                setSuperType((ActivityPointType)null);
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
            case TypePackage.ACTIVITY_POINT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.ACTIVITY_POINT_TYPE__INSTANCES:
                return instances != null && !instances.isEmpty();
            case TypePackage.ACTIVITY_POINT_TYPE__PACKAGE:
                return getPackage() != null;
            case TypePackage.ACTIVITY_POINT_TYPE__SUB_TYPES:
                return subTypes != null && !subTypes.isEmpty();
            case TypePackage.ACTIVITY_POINT_TYPE__SUPER_TYPE:
                return superType != null;
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

} //ActivityPointTypeImpl
