/**
 */
package structure.event.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rule.condition.impl.EventPatternImpl;
import structure.event.EntityEventPattern;
import structure.event.EntityLifecycle;
import structure.event.EventPackage;
import structure.pattern.EntityPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.event.impl.EntityEventPatternImpl#getEntityPattern <em>Entity Pattern</em>}</li>
 *   <li>{@link structure.event.impl.EntityEventPatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityEventPatternImpl extends EventPatternImpl implements EntityEventPattern {
    /**
     * The cached value of the '{@link #getEntityPattern() <em>Entity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityPattern()
     * @generated
     * @ordered
     */
    protected EntityPattern entityPattern;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ENTITY_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityPattern getEntityPattern() {
        return entityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityPattern(EntityPattern newEntityPattern, NotificationChain msgs) {
        EntityPattern oldEntityPattern = entityPattern;
        entityPattern = newEntityPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN, oldEntityPattern, newEntityPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityPattern(EntityPattern newEntityPattern) {
        if (newEntityPattern != entityPattern) {
            NotificationChain msgs = null;
            if (entityPattern != null)
                msgs = ((InternalEObject)entityPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN, null, msgs);
            if (newEntityPattern != null)
                msgs = ((InternalEObject)newEntityPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN, null, msgs);
            msgs = basicSetEntityPattern(newEntityPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN, newEntityPattern, newEntityPattern));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ENTITY_EVENT_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN:
                return basicSetEntityPattern(null, msgs);
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
            case EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN:
                return getEntityPattern();
            case EventPackage.ENTITY_EVENT_PATTERN__LIFECYCLE:
                return getLifecycle();
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
            case EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN:
                setEntityPattern((EntityPattern)newValue);
                return;
            case EventPackage.ENTITY_EVENT_PATTERN__LIFECYCLE:
                setLifecycle((EntityLifecycle)newValue);
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
            case EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN:
                setEntityPattern((EntityPattern)null);
                return;
            case EventPackage.ENTITY_EVENT_PATTERN__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
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
            case EventPackage.ENTITY_EVENT_PATTERN__ENTITY_PATTERN:
                return entityPattern != null;
            case EventPackage.ENTITY_EVENT_PATTERN__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
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

} //EntityEventPatternImpl
