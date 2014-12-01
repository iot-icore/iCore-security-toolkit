/**
 */
package structure.event.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rule.event.impl.EventImpl;
import structure.event.EntityEvent;
import structure.event.EntityLifecycle;
import structure.event.EventPackage;
import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.event.impl.EntityEventImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link structure.event.impl.EntityEventImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityEventImpl extends EventImpl implements EntityEvent {
    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final EntityLifecycle LIFECYCLE_EDEFAULT = EntityLifecycle.INSTANTIATIATED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected EntityLifecycle lifecycle = LIFECYCLE_EDEFAULT;

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
    protected EntityEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ENTITY_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(EntityLifecycle newLifecycle) {
        EntityLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT__LIFECYCLE, oldLifecycle, lifecycle));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT__ENTITY, oldEntity, newEntity);
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
                msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.ENTITY_EVENT__ENTITY, null, msgs);
            if (newEntity != null)
                msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.ENTITY_EVENT__ENTITY, null, msgs);
            msgs = basicSetEntity(newEntity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT__ENTITY, newEntity, newEntity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ENTITY_EVENT__ENTITY:
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
            case EventPackage.ENTITY_EVENT__LIFECYCLE:
                return getLifecycle();
            case EventPackage.ENTITY_EVENT__ENTITY:
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
            case EventPackage.ENTITY_EVENT__LIFECYCLE:
                setLifecycle((EntityLifecycle)newValue);
                return;
            case EventPackage.ENTITY_EVENT__ENTITY:
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
            case EventPackage.ENTITY_EVENT__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
                return;
            case EventPackage.ENTITY_EVENT__ENTITY:
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
            case EventPackage.ENTITY_EVENT__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
            case EventPackage.ENTITY_EVENT__ENTITY:
                return entity != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (lifecycle: ");
        result.append(lifecycle);
        result.append(')');
        return result.toString();
    }

} //EntityEventImpl
