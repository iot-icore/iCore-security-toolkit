/**
 */
package context.event.impl;

import context.event.ContextSituationEventPattern;
import context.event.ContextSituationLifecycle;
import context.event.EventPackage;

import context.pattern.ContextSituationPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.impl.EventPatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Situation Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.event.impl.ContextSituationEventPatternImpl#getContextSituationPattern <em>Context Situation Pattern</em>}</li>
 *   <li>{@link context.event.impl.ContextSituationEventPatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationEventPatternImpl extends EventPatternImpl implements ContextSituationEventPattern {
    /**
     * The cached value of the '{@link #getContextSituationPattern() <em>Context Situation Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextSituationPattern()
     * @generated
     * @ordered
     */
    protected ContextSituationPattern contextSituationPattern;

    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final ContextSituationLifecycle LIFECYCLE_EDEFAULT = ContextSituationLifecycle.STARTED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected ContextSituationLifecycle lifecycle = LIFECYCLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSituationEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.CONTEXT_SITUATION_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationPattern getContextSituationPattern() {
        return contextSituationPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextSituationPattern(ContextSituationPattern newContextSituationPattern, NotificationChain msgs) {
        ContextSituationPattern oldContextSituationPattern = contextSituationPattern;
        contextSituationPattern = newContextSituationPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN, oldContextSituationPattern, newContextSituationPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextSituationPattern(ContextSituationPattern newContextSituationPattern) {
        if (newContextSituationPattern != contextSituationPattern) {
            NotificationChain msgs = null;
            if (contextSituationPattern != null)
                msgs = ((InternalEObject)contextSituationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN, null, msgs);
            if (newContextSituationPattern != null)
                msgs = ((InternalEObject)newContextSituationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN, null, msgs);
            msgs = basicSetContextSituationPattern(newContextSituationPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN, newContextSituationPattern, newContextSituationPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(ContextSituationLifecycle newLifecycle) {
        ContextSituationLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN:
                return basicSetContextSituationPattern(null, msgs);
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
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN:
                return getContextSituationPattern();
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN:
                setContextSituationPattern((ContextSituationPattern)newValue);
                return;
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE:
                setLifecycle((ContextSituationLifecycle)newValue);
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
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN:
                setContextSituationPattern((ContextSituationPattern)null);
                return;
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE:
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
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN:
                return contextSituationPattern != null;
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE:
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

} //ContextSituationEventPatternImpl
