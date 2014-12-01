/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.ActionInstantiationHierarchy;
import behavior.instantiation.ActivityInstantiation;
import behavior.instantiation.BehaviorInstantiationHierarchy;
import behavior.instantiation.InstantiationPackage;

import models.impl.InstantiationHierarchyImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationHierarchyImpl#getBehaviorTarget <em>Behavior Target</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationHierarchyImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInstantiationHierarchyImpl extends InstantiationHierarchyImpl implements ActionInstantiationHierarchy {
    /**
     * The cached value of the '{@link #getBehaviorTarget() <em>Behavior Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorTarget()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiationHierarchy behaviorTarget;

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected ActivityInstantiation activity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionInstantiationHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ACTION_INSTANTIATION_HIERARCHY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationHierarchy getBehaviorTarget() {
        return behaviorTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorTarget(BehaviorInstantiationHierarchy newBehaviorTarget, NotificationChain msgs) {
        BehaviorInstantiationHierarchy oldBehaviorTarget = behaviorTarget;
        behaviorTarget = newBehaviorTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET, oldBehaviorTarget, newBehaviorTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorTarget(BehaviorInstantiationHierarchy newBehaviorTarget) {
        if (newBehaviorTarget != behaviorTarget) {
            NotificationChain msgs = null;
            if (behaviorTarget != null)
                msgs = ((InternalEObject)behaviorTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET, null, msgs);
            if (newBehaviorTarget != null)
                msgs = ((InternalEObject)newBehaviorTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET, null, msgs);
            msgs = basicSetBehaviorTarget(newBehaviorTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET, newBehaviorTarget, newBehaviorTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstantiation getActivity() {
        if (activity != null && activity.eIsProxy()) {
            InternalEObject oldActivity = (InternalEObject)activity;
            activity = (ActivityInstantiation)eResolveProxy(oldActivity);
            if (activity != oldActivity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY, oldActivity, activity));
            }
        }
        return activity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstantiation basicGetActivity() {
        return activity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivity(ActivityInstantiation newActivity) {
        ActivityInstantiation oldActivity = activity;
        activity = newActivity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY, oldActivity, activity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET:
                return basicSetBehaviorTarget(null, msgs);
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
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET:
                return getBehaviorTarget();
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY:
                if (resolve) return getActivity();
                return basicGetActivity();
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
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET:
                setBehaviorTarget((BehaviorInstantiationHierarchy)newValue);
                return;
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY:
                setActivity((ActivityInstantiation)newValue);
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
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET:
                setBehaviorTarget((BehaviorInstantiationHierarchy)null);
                return;
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY:
                setActivity((ActivityInstantiation)null);
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
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET:
                return behaviorTarget != null;
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY__ACTIVITY:
                return activity != null;
        }
        return super.eIsSet(featureID);
    }

} //ActionInstantiationHierarchyImpl
