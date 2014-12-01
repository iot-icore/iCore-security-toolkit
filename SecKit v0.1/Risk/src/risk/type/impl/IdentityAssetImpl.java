/**
 */
package risk.type.impl;

import identity.instantiation.IdentityInstantiation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import risk.type.IdentityAsset;
import risk.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.IdentityAssetImpl#getIdentityInstantiation <em>Identity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityAssetImpl extends AssetImpl implements IdentityAsset {
    /**
     * The cached value of the '{@link #getIdentityInstantiation() <em>Identity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityInstantiation()
     * @generated
     * @ordered
     */
    protected IdentityInstantiation identityInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityAssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.IDENTITY_ASSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation getIdentityInstantiation() {
        if (identityInstantiation != null && identityInstantiation.eIsProxy()) {
            InternalEObject oldIdentityInstantiation = (InternalEObject)identityInstantiation;
            identityInstantiation = (IdentityInstantiation)eResolveProxy(oldIdentityInstantiation);
            if (identityInstantiation != oldIdentityInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION, oldIdentityInstantiation, identityInstantiation));
            }
        }
        return identityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation basicGetIdentityInstantiation() {
        return identityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentityInstantiation(IdentityInstantiation newIdentityInstantiation) {
        IdentityInstantiation oldIdentityInstantiation = identityInstantiation;
        identityInstantiation = newIdentityInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION, oldIdentityInstantiation, identityInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION:
                if (resolve) return getIdentityInstantiation();
                return basicGetIdentityInstantiation();
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
            case TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION:
                setIdentityInstantiation((IdentityInstantiation)newValue);
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
            case TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION:
                setIdentityInstantiation((IdentityInstantiation)null);
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
            case TypePackage.IDENTITY_ASSET__IDENTITY_INSTANTIATION:
                return identityInstantiation != null;
        }
        return super.eIsSet(featureID);
    }

} //IdentityAssetImpl
