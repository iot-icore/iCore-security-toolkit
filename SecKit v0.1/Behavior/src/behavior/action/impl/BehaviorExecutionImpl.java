/**
 */
package behavior.action.impl;

import behavior.action.ActionPackage;
import behavior.action.BehaviorExecution;

import behavior.instantiation.BehaviorInstantiation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.action.impl.ExecuteImpl;

import structure.instance.EntityInstanceHiearchy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.action.impl.BehaviorExecutionImpl#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 *   <li>{@link behavior.action.impl.BehaviorExecutionImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorExecutionImpl extends ExecuteImpl implements BehaviorExecution {
    /**
     * The cached value of the '{@link #getBehaviorInstantiation() <em>Behavior Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorInstantiation()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiation behaviorInstantiation;

    /**
     * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetEntity()
     * @generated
     * @ordered
     */
    protected EntityInstanceHiearchy targetEntity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorExecutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.BEHAVIOR_EXECUTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation getBehaviorInstantiation() {
        return behaviorInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation, NotificationChain msgs) {
        BehaviorInstantiation oldBehaviorInstantiation = behaviorInstantiation;
        behaviorInstantiation = newBehaviorInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION, oldBehaviorInstantiation, newBehaviorInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation) {
        if (newBehaviorInstantiation != behaviorInstantiation) {
            NotificationChain msgs = null;
            if (behaviorInstantiation != null)
                msgs = ((InternalEObject)behaviorInstantiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION, null, msgs);
            if (newBehaviorInstantiation != null)
                msgs = ((InternalEObject)newBehaviorInstantiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION, null, msgs);
            msgs = basicSetBehaviorInstantiation(newBehaviorInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION, newBehaviorInstantiation, newBehaviorInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceHiearchy getTargetEntity() {
        return targetEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetEntity(EntityInstanceHiearchy newTargetEntity, NotificationChain msgs) {
        EntityInstanceHiearchy oldTargetEntity = targetEntity;
        targetEntity = newTargetEntity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetEntity(EntityInstanceHiearchy newTargetEntity) {
        if (newTargetEntity != targetEntity) {
            NotificationChain msgs = null;
            if (targetEntity != null)
                msgs = ((InternalEObject)targetEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY, null, msgs);
            if (newTargetEntity != null)
                msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY, null, msgs);
            msgs = basicSetTargetEntity(newTargetEntity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY, newTargetEntity, newTargetEntity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION:
                return basicSetBehaviorInstantiation(null, msgs);
            case ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY:
                return basicSetTargetEntity(null, msgs);
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
            case ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION:
                return getBehaviorInstantiation();
            case ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY:
                return getTargetEntity();
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
            case ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)newValue);
                return;
            case ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY:
                setTargetEntity((EntityInstanceHiearchy)newValue);
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
            case ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)null);
                return;
            case ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY:
                setTargetEntity((EntityInstanceHiearchy)null);
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
            case ActionPackage.BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION:
                return behaviorInstantiation != null;
            case ActionPackage.BEHAVIOR_EXECUTION__TARGET_ENTITY:
                return targetEntity != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorExecutionImpl
