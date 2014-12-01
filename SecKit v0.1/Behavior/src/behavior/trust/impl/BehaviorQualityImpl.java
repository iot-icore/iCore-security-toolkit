/**
 */
package behavior.trust.impl;

import behavior.trust.BehaviorQuality;
import behavior.trust.TrustPackage;

import behavior.type.ActivityType;
import behavior.type.InteractionContributionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.impl.TrustAspectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.trust.impl.BehaviorQualityImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link behavior.trust.impl.BehaviorQualityImpl#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorQualityImpl extends TrustAspectImpl implements BehaviorQuality {
    /**
     * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityType()
     * @generated
     * @ordered
     */
    protected ActivityType activityType;

    /**
     * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributionType()
     * @generated
     * @ordered
     */
    protected InteractionContributionType contributionType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorQualityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TrustPackage.Literals.BEHAVIOR_QUALITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType getActivityType() {
        if (activityType != null && activityType.eIsProxy()) {
            InternalEObject oldActivityType = (InternalEObject)activityType;
            activityType = (ActivityType)eResolveProxy(oldActivityType);
            if (activityType != oldActivityType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE, oldActivityType, activityType));
            }
        }
        return activityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType basicGetActivityType() {
        return activityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityType(ActivityType newActivityType) {
        ActivityType oldActivityType = activityType;
        activityType = newActivityType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE, oldActivityType, activityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionType getContributionType() {
        if (contributionType != null && contributionType.eIsProxy()) {
            InternalEObject oldContributionType = (InternalEObject)contributionType;
            contributionType = (InteractionContributionType)eResolveProxy(oldContributionType);
            if (contributionType != oldContributionType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE, oldContributionType, contributionType));
            }
        }
        return contributionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionType basicGetContributionType() {
        return contributionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContributionType(InteractionContributionType newContributionType) {
        InteractionContributionType oldContributionType = contributionType;
        contributionType = newContributionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE, oldContributionType, contributionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE:
                if (resolve) return getActivityType();
                return basicGetActivityType();
            case TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE:
                if (resolve) return getContributionType();
                return basicGetContributionType();
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
            case TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE:
                setActivityType((ActivityType)newValue);
                return;
            case TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE:
                setContributionType((InteractionContributionType)newValue);
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
            case TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE:
                setActivityType((ActivityType)null);
                return;
            case TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE:
                setContributionType((InteractionContributionType)null);
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
            case TrustPackage.BEHAVIOR_QUALITY__ACTIVITY_TYPE:
                return activityType != null;
            case TrustPackage.BEHAVIOR_QUALITY__CONTRIBUTION_TYPE:
                return contributionType != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorQualityImpl
