/**
 */
package behavior.event.impl;

import behavior.event.ActivityEventPattern;
import behavior.event.ActivityLifecycle;
import behavior.event.EventPackage;

import behavior.pattern.ActivityPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.impl.EventPatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.event.impl.ActivityEventPatternImpl#getActivityPattern <em>Activity Pattern</em>}</li>
 *   <li>{@link behavior.event.impl.ActivityEventPatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEventPatternImpl extends EventPatternImpl implements ActivityEventPattern {
    /**
     * The cached value of the '{@link #getActivityPattern() <em>Activity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPattern()
     * @generated
     * @ordered
     */
    protected ActivityPattern activityPattern;

    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final ActivityLifecycle LIFECYCLE_EDEFAULT = ActivityLifecycle.STARTED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected ActivityLifecycle lifecycle = LIFECYCLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ACTIVITY_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPattern getActivityPattern() {
        return activityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivityPattern(ActivityPattern newActivityPattern, NotificationChain msgs) {
        ActivityPattern oldActivityPattern = activityPattern;
        activityPattern = newActivityPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN, oldActivityPattern, newActivityPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityPattern(ActivityPattern newActivityPattern) {
        if (newActivityPattern != activityPattern) {
            NotificationChain msgs = null;
            if (activityPattern != null)
                msgs = ((InternalEObject)activityPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN, null, msgs);
            if (newActivityPattern != null)
                msgs = ((InternalEObject)newActivityPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN, null, msgs);
            msgs = basicSetActivityPattern(newActivityPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN, newActivityPattern, newActivityPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(ActivityLifecycle newLifecycle) {
        ActivityLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ACTIVITY_EVENT_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN:
                return basicSetActivityPattern(null, msgs);
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
            case EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN:
                return getActivityPattern();
            case EventPackage.ACTIVITY_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN:
                setActivityPattern((ActivityPattern)newValue);
                return;
            case EventPackage.ACTIVITY_EVENT_PATTERN__LIFECYCLE:
                setLifecycle((ActivityLifecycle)newValue);
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
            case EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN:
                setActivityPattern((ActivityPattern)null);
                return;
            case EventPackage.ACTIVITY_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN:
                return activityPattern != null;
            case EventPackage.ACTIVITY_EVENT_PATTERN__LIFECYCLE:
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

} //ActivityEventPatternImpl
