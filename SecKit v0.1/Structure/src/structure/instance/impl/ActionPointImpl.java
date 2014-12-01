/**
 */
package structure.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instance.ActionPoint;
import structure.instance.InstancePackage;
import structure.instance.LocalizableInstance;
import structure.instance.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.ActionPointImpl#getLocationInstance <em>Location Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionPointImpl extends ActivityPointImpl implements ActionPoint {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ACTION_POINT;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ACTION_POINT__LOCATION_INSTANCE, oldLocationInstance, newLocationInstance);
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
                msgs = ((InternalEObject)locationInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ACTION_POINT__LOCATION_INSTANCE, null, msgs);
            if (newLocationInstance != null)
                msgs = ((InternalEObject)newLocationInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ACTION_POINT__LOCATION_INSTANCE, null, msgs);
            msgs = basicSetLocationInstance(newLocationInstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTION_POINT__LOCATION_INSTANCE, newLocationInstance, newLocationInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ACTION_POINT__LOCATION_INSTANCE:
                return basicSetLocationInstance(null, msgs);
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
            case InstancePackage.ACTION_POINT__LOCATION_INSTANCE:
                return getLocationInstance();
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
            case InstancePackage.ACTION_POINT__LOCATION_INSTANCE:
                setLocationInstance((Location)newValue);
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
            case InstancePackage.ACTION_POINT__LOCATION_INSTANCE:
                setLocationInstance((Location)null);
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
            case InstancePackage.ACTION_POINT__LOCATION_INSTANCE:
                return locationInstance != null;
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
                case InstancePackage.ACTION_POINT__LOCATION_INSTANCE: return InstancePackage.LOCALIZABLE_INSTANCE__LOCATION_INSTANCE;
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
                case InstancePackage.LOCALIZABLE_INSTANCE__LOCATION_INSTANCE: return InstancePackage.ACTION_POINT__LOCATION_INSTANCE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActionPointImpl
