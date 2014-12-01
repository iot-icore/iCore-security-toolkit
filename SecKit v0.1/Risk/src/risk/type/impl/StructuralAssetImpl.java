/**
 */
package risk.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import risk.type.StructuralAsset;
import risk.type.TypePackage;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.StructuralAssetImpl#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralAssetImpl extends AssetImpl implements StructuralAsset {
    /**
     * The cached value of the '{@link #getEntityInstantiation() <em>Entity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityInstantiation()
     * @generated
     * @ordered
     */
    protected EntityInstantiation entityInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuralAssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.STRUCTURAL_ASSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation getEntityInstantiation() {
        if (entityInstantiation != null && entityInstantiation.eIsProxy()) {
            InternalEObject oldEntityInstantiation = (InternalEObject)entityInstantiation;
            entityInstantiation = (EntityInstantiation)eResolveProxy(oldEntityInstantiation);
            if (entityInstantiation != oldEntityInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION, oldEntityInstantiation, entityInstantiation));
            }
        }
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation basicGetEntityInstantiation() {
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityInstantiation(EntityInstantiation newEntityInstantiation) {
        EntityInstantiation oldEntityInstantiation = entityInstantiation;
        entityInstantiation = newEntityInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION, oldEntityInstantiation, entityInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION:
                if (resolve) return getEntityInstantiation();
                return basicGetEntityInstantiation();
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
            case TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)newValue);
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
            case TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)null);
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
            case TypePackage.STRUCTURAL_ASSET__ENTITY_INSTANTIATION:
                return entityInstantiation != null;
        }
        return super.eIsSet(featureID);
    }

} //StructuralAssetImpl
