/**
 */
package structure.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.type.ActionPointType;
import structure.type.LocalizableType;
import structure.type.LocationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.ActionPointTypeImpl#getLocationType <em>Location Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionPointTypeImpl extends ActivityPointTypeImpl implements ActionPointType {
    /**
     * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationType()
     * @generated
     * @ordered
     */
    protected LocationType locationType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionPointTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ACTION_POINT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType getLocationType() {
        if (locationType != null && locationType.eIsProxy()) {
            InternalEObject oldLocationType = (InternalEObject)locationType;
            locationType = (LocationType)eResolveProxy(oldLocationType);
            if (locationType != oldLocationType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE, oldLocationType, locationType));
            }
        }
        return locationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType basicGetLocationType() {
        return locationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocationType(LocationType newLocationType) {
        LocationType oldLocationType = locationType;
        locationType = newLocationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE, oldLocationType, locationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE:
                if (resolve) return getLocationType();
                return basicGetLocationType();
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
            case TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE:
                setLocationType((LocationType)newValue);
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
            case TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE:
                setLocationType((LocationType)null);
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
            case TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE:
                return locationType != null;
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
        if (baseClass == LocalizableType.class) {
            switch (derivedFeatureID) {
                case TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE: return TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE;
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
        if (baseClass == LocalizableType.class) {
            switch (baseFeatureID) {
                case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE: return TypePackage.ACTION_POINT_TYPE__LOCATION_TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActionPointTypeImpl
