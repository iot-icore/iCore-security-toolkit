/**
 */
package risk.type.impl;

import data.instantiation.AbstractDataInstantiation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import risk.type.DataAsset;
import risk.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.DataAssetImpl#getDataInstantiation <em>Data Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAssetImpl extends AssetImpl implements DataAsset {
    /**
     * The cached value of the '{@link #getDataInstantiation() <em>Data Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInstantiation()
     * @generated
     * @ordered
     */
    protected AbstractDataInstantiation dataInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataAssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.DATA_ASSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractDataInstantiation getDataInstantiation() {
        if (dataInstantiation != null && dataInstantiation.eIsProxy()) {
            InternalEObject oldDataInstantiation = (InternalEObject)dataInstantiation;
            dataInstantiation = (AbstractDataInstantiation)eResolveProxy(oldDataInstantiation);
            if (dataInstantiation != oldDataInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.DATA_ASSET__DATA_INSTANTIATION, oldDataInstantiation, dataInstantiation));
            }
        }
        return dataInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractDataInstantiation basicGetDataInstantiation() {
        return dataInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInstantiation(AbstractDataInstantiation newDataInstantiation) {
        AbstractDataInstantiation oldDataInstantiation = dataInstantiation;
        dataInstantiation = newDataInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DATA_ASSET__DATA_INSTANTIATION, oldDataInstantiation, dataInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.DATA_ASSET__DATA_INSTANTIATION:
                if (resolve) return getDataInstantiation();
                return basicGetDataInstantiation();
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
            case TypePackage.DATA_ASSET__DATA_INSTANTIATION:
                setDataInstantiation((AbstractDataInstantiation)newValue);
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
            case TypePackage.DATA_ASSET__DATA_INSTANTIATION:
                setDataInstantiation((AbstractDataInstantiation)null);
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
            case TypePackage.DATA_ASSET__DATA_INSTANTIATION:
                return dataInstantiation != null;
        }
        return super.eIsSet(featureID);
    }

} //DataAssetImpl
