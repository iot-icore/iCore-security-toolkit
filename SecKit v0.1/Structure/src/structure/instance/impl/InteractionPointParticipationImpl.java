/**
 */
package structure.instance.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instance.InstancePackage;
import structure.instance.InteractionPointParticipation;
import structure.instance.LocalizableInstance;
import structure.instance.Location;

import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.InteractionPointParticipationImpl#getLocationInstance <em>Location Instance</em>}</li>
 *   <li>{@link structure.instance.impl.InteractionPointParticipationImpl#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointParticipationImpl extends ElementImpl implements InteractionPointParticipation {
    /**
     * The cached value of the '{@link #getLocationInstance() <em>Location Instance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationInstance()
     * @generated
     * @ordered
     */
    protected Location locationInstance;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected InteractionPointParticipationInstantiation instantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointParticipationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.INTERACTION_POINT_PARTICIPATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location getLocationInstance() {
        return locationInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocationInstance(Location newLocationInstance, NotificationChain msgs) {
        Location oldLocationInstance = locationInstance;
        locationInstance = newLocationInstance;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE, oldLocationInstance, newLocationInstance);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocationInstance(Location newLocationInstance) {
        if (newLocationInstance != locationInstance) {
            NotificationChain msgs = null;
            if (locationInstance != null)
                msgs = ((InternalEObject)locationInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE, null, msgs);
            if (newLocationInstance != null)
                msgs = ((InternalEObject)newLocationInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE, null, msgs);
            msgs = basicSetLocationInstance(newLocationInstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE, newLocationInstance, newLocationInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (InteractionPointParticipationInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(InteractionPointParticipationInstantiation newInstantiation, NotificationChain msgs) {
        InteractionPointParticipationInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(InteractionPointParticipationInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES, InteractionPointParticipationInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES, InteractionPointParticipationInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES, InteractionPointParticipationInstantiation.class, msgs);
                return basicSetInstantiation((InteractionPointParticipationInstantiation)otherEnd, msgs);
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
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE:
                return basicSetLocationInstance(null, msgs);
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
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
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE:
                return getLocationInstance();
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
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
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE:
                setLocationInstance((Location)newValue);
                return;
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                setInstantiation((InteractionPointParticipationInstantiation)newValue);
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
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE:
                setLocationInstance((Location)null);
                return;
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                setInstantiation((InteractionPointParticipationInstantiation)null);
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
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE:
                return locationInstance != null;
            case InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION:
                return instantiation != null;
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
        if (baseClass == LocalizableInstance.class) {
            switch (derivedFeatureID) {
                case InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE: return InstancePackage.LOCALIZABLE_INSTANCE__LOCATION_INSTANCE;
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
        if (baseClass == LocalizableInstance.class) {
            switch (baseFeatureID) {
                case InstancePackage.LOCALIZABLE_INSTANCE__LOCATION_INSTANCE: return InstancePackage.INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InteractionPointParticipationImpl
