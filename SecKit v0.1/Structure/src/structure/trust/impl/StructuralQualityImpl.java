/**
 */
package structure.trust.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.trust.StructuralQuality;
import structure.trust.TrustPackage;

import structure.type.ActivityPointType;
import structure.type.EntityType;

import trust.instance.impl.TrustAspectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.trust.impl.StructuralQualityImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link structure.trust.impl.StructuralQualityImpl#getActivityPointType <em>Activity Point Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralQualityImpl extends TrustAspectImpl implements StructuralQuality {
    /**
     * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityType()
     * @generated
     * @ordered
     */
    protected EntityType entityType;

    /**
     * The cached value of the '{@link #getActivityPointType() <em>Activity Point Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPointType()
     * @generated
     * @ordered
     */
    protected ActivityPointType activityPointType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuralQualityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TrustPackage.Literals.STRUCTURAL_QUALITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getEntityType() {
        if (entityType != null && entityType.eIsProxy()) {
            InternalEObject oldEntityType = (InternalEObject)entityType;
            entityType = (EntityType)eResolveProxy(oldEntityType);
            if (entityType != oldEntityType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE, oldEntityType, entityType));
            }
        }
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetEntityType() {
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityType(EntityType newEntityType) {
        EntityType oldEntityType = entityType;
        entityType = newEntityType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE, oldEntityType, entityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType getActivityPointType() {
        if (activityPointType != null && activityPointType.eIsProxy()) {
            InternalEObject oldActivityPointType = (InternalEObject)activityPointType;
            activityPointType = (ActivityPointType)eResolveProxy(oldActivityPointType);
            if (activityPointType != oldActivityPointType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE, oldActivityPointType, activityPointType));
            }
        }
        return activityPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPointType basicGetActivityPointType() {
        return activityPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityPointType(ActivityPointType newActivityPointType) {
        ActivityPointType oldActivityPointType = activityPointType;
        activityPointType = newActivityPointType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE, oldActivityPointType, activityPointType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE:
                if (resolve) return getEntityType();
                return basicGetEntityType();
            case TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE:
                if (resolve) return getActivityPointType();
                return basicGetActivityPointType();
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
            case TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE:
                setEntityType((EntityType)newValue);
                return;
            case TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE:
                setActivityPointType((ActivityPointType)newValue);
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
            case TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE:
                setEntityType((EntityType)null);
                return;
            case TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE:
                setActivityPointType((ActivityPointType)null);
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
            case TrustPackage.STRUCTURAL_QUALITY__ENTITY_TYPE:
                return entityType != null;
            case TrustPackage.STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE:
                return activityPointType != null;
        }
        return super.eIsSet(featureID);
    }

} //StructuralQualityImpl
