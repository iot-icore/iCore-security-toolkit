/**
 */
package structure.instantiation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instantiation.ActionPointInstantiation;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.LocalizableInstantiation;
import structure.instantiation.LocationInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Point Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.ActionPointInstantiationImpl#getLocationInstantiation <em>Location Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionPointInstantiationImpl extends ActivityPointInstantiationImpl implements ActionPointInstantiation {
    /**
     * The cached value of the '{@link #getLocationInstantiation() <em>Location Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationInstantiation()
     * @generated
     * @ordered
     */
    protected LocationInstantiation locationInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionPointInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ACTION_POINT_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationInstantiation getLocationInstantiation() {
        return locationInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocationInstantiation(LocationInstantiation newLocationInstantiation, NotificationChain msgs) {
        LocationInstantiation oldLocationInstantiation = locationInstantiation;
        locationInstantiation = newLocationInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION, oldLocationInstantiation, newLocationInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocationInstantiation(LocationInstantiation newLocationInstantiation) {
        if (newLocationInstantiation != locationInstantiation) {
            NotificationChain msgs = null;
            if (locationInstantiation != null)
                msgs = ((InternalEObject)locationInstantiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION, null, msgs);
            if (newLocationInstantiation != null)
                msgs = ((InternalEObject)newLocationInstantiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION, null, msgs);
            msgs = basicSetLocationInstantiation(newLocationInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION, newLocationInstantiation, newLocationInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION:
                return basicSetLocationInstantiation(null, msgs);
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
            case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION:
                return getLocationInstantiation();
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
            case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION:
                setLocationInstantiation((LocationInstantiation)newValue);
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
            case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION:
                setLocationInstantiation((LocationInstantiation)null);
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
            case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION:
                return locationInstantiation != null;
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
        if (baseClass == LocalizableInstantiation.class) {
            switch (derivedFeatureID) {
                case InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION: return InstantiationPackage.LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION;
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
        if (baseClass == LocalizableInstantiation.class) {
            switch (baseFeatureID) {
                case InstantiationPackage.LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION: return InstantiationPackage.ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActionPointInstantiationImpl
