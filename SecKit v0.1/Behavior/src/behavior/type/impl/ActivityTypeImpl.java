/**
 */
package behavior.type.impl;

import behavior.instantiation.ActivityInstantiation;
import behavior.instantiation.InstantiationPackage;

import behavior.type.ActivityType;
import behavior.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.ActivityTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.ActivityTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link behavior.type.impl.ActivityTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityTypeImpl extends DataProducerTypeImpl implements ActivityType {
    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<ActivityInstantiation> instantiations;

    /**
     * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubTypes()
     * @generated
     * @ordered
     */
    protected EList<ActivityType> subTypes;

    /**
     * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperTypes()
     * @generated
     * @ordered
     */
    protected ActivityType superTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ACTIVITY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<ActivityInstantiation>(ActivityInstantiation.class, this, TypePackage.ACTIVITY_TYPE__INSTANTIATIONS, InstantiationPackage.ACTIVITY_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityType> getSubTypes() {
        if (subTypes == null) {
            subTypes = new EObjectWithInverseResolvingEList<ActivityType>(ActivityType.class, this, TypePackage.ACTIVITY_TYPE__SUB_TYPES, TypePackage.ACTIVITY_TYPE__SUPER_TYPES);
        }
        return subTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType getSuperTypes() {
        if (superTypes != null && superTypes.eIsProxy()) {
            InternalEObject oldSuperTypes = (InternalEObject)superTypes;
            superTypes = (ActivityType)eResolveProxy(oldSuperTypes);
            if (superTypes != oldSuperTypes) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ACTIVITY_TYPE__SUPER_TYPES, oldSuperTypes, superTypes));
            }
        }
        return superTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType basicGetSuperTypes() {
        return superTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperTypes(ActivityType newSuperTypes, NotificationChain msgs) {
        ActivityType oldSuperTypes = superTypes;
        superTypes = newSuperTypes;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_TYPE__SUPER_TYPES, oldSuperTypes, newSuperTypes);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperTypes(ActivityType newSuperTypes) {
        if (newSuperTypes != superTypes) {
            NotificationChain msgs = null;
            if (superTypes != null)
                msgs = ((InternalEObject)superTypes).eInverseRemove(this, TypePackage.ACTIVITY_TYPE__SUB_TYPES, ActivityType.class, msgs);
            if (newSuperTypes != null)
                msgs = ((InternalEObject)newSuperTypes).eInverseAdd(this, TypePackage.ACTIVITY_TYPE__SUB_TYPES, ActivityType.class, msgs);
            msgs = basicSetSuperTypes(newSuperTypes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ACTIVITY_TYPE__SUPER_TYPES, newSuperTypes, newSuperTypes));
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                if (superTypes != null)
                    msgs = ((InternalEObject)superTypes).eInverseRemove(this, TypePackage.ACTIVITY_TYPE__SUB_TYPES, ActivityType.class, msgs);
                return basicSetSuperTypes((ActivityType)otherEnd, msgs);
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                return basicSetSuperTypes(null, msgs);
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                return getSubTypes();
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                if (resolve) return getSuperTypes();
                return basicGetSuperTypes();
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends ActivityInstantiation>)newValue);
                return;
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                getSubTypes().clear();
                getSubTypes().addAll((Collection<? extends ActivityType>)newValue);
                return;
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                setSuperTypes((ActivityType)newValue);
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                getSubTypes().clear();
                return;
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                setSuperTypes((ActivityType)null);
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
            case TypePackage.ACTIVITY_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.ACTIVITY_TYPE__SUB_TYPES:
                return subTypes != null && !subTypes.isEmpty();
            case TypePackage.ACTIVITY_TYPE__SUPER_TYPES:
                return superTypes != null;
        }
        return super.eIsSet(featureID);
    }

} //ActivityTypeImpl
