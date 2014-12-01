/**
 */
package behavior.event.impl;

import behavior.event.BehaviorEventPattern;
import behavior.event.BehaviorLifecycle;
import behavior.event.EventPackage;

import behavior.pattern.BehaviorPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.impl.EventPatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.event.impl.BehaviorEventPatternImpl#getBehaviorPattern <em>Behavior Pattern</em>}</li>
 *   <li>{@link behavior.event.impl.BehaviorEventPatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorEventPatternImpl extends EventPatternImpl implements BehaviorEventPattern {
    /**
     * The cached value of the '{@link #getBehaviorPattern() <em>Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorPattern()
     * @generated
     * @ordered
     */
    protected BehaviorPattern behaviorPattern;

    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final BehaviorLifecycle LIFECYCLE_EDEFAULT = BehaviorLifecycle.INSTANTIATED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected BehaviorLifecycle lifecycle = LIFECYCLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.BEHAVIOR_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorPattern getBehaviorPattern() {
        return behaviorPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorPattern(BehaviorPattern newBehaviorPattern, NotificationChain msgs) {
        BehaviorPattern oldBehaviorPattern = behaviorPattern;
        behaviorPattern = newBehaviorPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN, oldBehaviorPattern, newBehaviorPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorPattern(BehaviorPattern newBehaviorPattern) {
        if (newBehaviorPattern != behaviorPattern) {
            NotificationChain msgs = null;
            if (behaviorPattern != null)
                msgs = ((InternalEObject)behaviorPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN, null, msgs);
            if (newBehaviorPattern != null)
                msgs = ((InternalEObject)newBehaviorPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN, null, msgs);
            msgs = basicSetBehaviorPattern(newBehaviorPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN, newBehaviorPattern, newBehaviorPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(BehaviorLifecycle newLifecycle) {
        BehaviorLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.BEHAVIOR_EVENT_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN:
                return basicSetBehaviorPattern(null, msgs);
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
            case EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN:
                return getBehaviorPattern();
            case EventPackage.BEHAVIOR_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN:
                setBehaviorPattern((BehaviorPattern)newValue);
                return;
            case EventPackage.BEHAVIOR_EVENT_PATTERN__LIFECYCLE:
                setLifecycle((BehaviorLifecycle)newValue);
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
            case EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN:
                setBehaviorPattern((BehaviorPattern)null);
                return;
            case EventPackage.BEHAVIOR_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN:
                return behaviorPattern != null;
            case EventPackage.BEHAVIOR_EVENT_PATTERN__LIFECYCLE:
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

} //BehaviorEventPatternImpl
