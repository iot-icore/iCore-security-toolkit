/**
 */
package structure.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import structure.type.LocalizableType;
import structure.type.LocationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localizable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.LocalizableTypeImpl#getLocationType <em>Location Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocalizableTypeImpl extends MinimalEObjectImpl.Container implements LocalizableType {
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
    protected LocalizableTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.LOCALIZABLE_TYPE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE, oldLocationType, locationType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE, oldLocationType, locationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE:
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
            case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE:
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
            case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE:
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
            case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE:
                return locationType != null;
        }
        return super.eIsSet(featureID);
    }

} //LocalizableTypeImpl
