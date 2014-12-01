/**
 */
package behavior.event.impl;

import behavior.event.AbstractBehaviorEvent;
import behavior.event.EventPackage;

import behavior.instance.Behavior;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.event.impl.EventImpl;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Behavior Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.event.impl.AbstractBehaviorEventImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link behavior.event.impl.AbstractBehaviorEventImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBehaviorEventImpl extends EventImpl implements AbstractBehaviorEvent {
    /**
     * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected Behavior behavior;

    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Entity entity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractBehaviorEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ABSTRACT_BEHAVIOR_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getBehavior() {
        if (behavior != null && behavior.eIsProxy()) {
            InternalEObject oldBehavior = (InternalEObject)behavior;
            behavior = (Behavior)eResolveProxy(oldBehavior);
            if (behavior != oldBehavior) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR, oldBehavior, behavior));
            }
        }
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior basicGetBehavior() {
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehavior(Behavior newBehavior) {
        Behavior oldBehavior = behavior;
        behavior = newBehavior;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR, oldBehavior, behavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
        Entity oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY, oldEntity, newEntity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntity(Entity newEntity) {
        if (newEntity != entity) {
            NotificationChain msgs = null;
            if (entity != null)
                msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY, null, msgs);
            if (newEntity != null)
                msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY, null, msgs);
            msgs = basicSetEntity(newEntity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY, newEntity, newEntity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY:
                return basicSetEntity(null, msgs);
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
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR:
                if (resolve) return getBehavior();
                return basicGetBehavior();
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY:
                return getEntity();
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
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR:
                setBehavior((Behavior)newValue);
                return;
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY:
                setEntity((Entity)newValue);
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
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR:
                setBehavior((Behavior)null);
                return;
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY:
                setEntity((Entity)null);
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
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR:
                return behavior != null;
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT__ENTITY:
                return entity != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractBehaviorEventImpl
