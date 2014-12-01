/**
 */
package context.event.impl;

import context.event.ContextSituationEvent;
import context.event.ContextSituationLifecycle;
import context.event.EventPackage;

import context.instance.ContextSituation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.event.impl.EventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Situation Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.event.impl.ContextSituationEventImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link context.event.impl.ContextSituationEventImpl#getSituationValue <em>Situation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationEventImpl extends EventImpl implements ContextSituationEvent {
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
     * The cached value of the '{@link #getSituationValue() <em>Situation Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationValue()
     * @generated
     * @ordered
     */
    protected ContextSituation situationValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSituationEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.CONTEXT_SITUATION_EVENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituation getSituationValue() {
        return situationValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSituationValue(ContextSituation newSituationValue, NotificationChain msgs) {
        ContextSituation oldSituationValue = situationValue;
        situationValue = newSituationValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE, oldSituationValue, newSituationValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSituationValue(ContextSituation newSituationValue) {
        if (newSituationValue != situationValue) {
            NotificationChain msgs = null;
            if (situationValue != null)
                msgs = ((InternalEObject)situationValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE, null, msgs);
            if (newSituationValue != null)
                msgs = ((InternalEObject)newSituationValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE, null, msgs);
            msgs = basicSetSituationValue(newSituationValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE, newSituationValue, newSituationValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE:
                return basicSetSituationValue(null, msgs);
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
            case EventPackage.CONTEXT_SITUATION_EVENT__LIFECYCLE:
                return getLifecycle();
            case EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE:
                return getSituationValue();
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
            case EventPackage.CONTEXT_SITUATION_EVENT__LIFECYCLE:
                setLifecycle((ContextSituationLifecycle)newValue);
                return;
            case EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE:
                setSituationValue((ContextSituation)newValue);
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
            case EventPackage.CONTEXT_SITUATION_EVENT__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
                return;
            case EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE:
                setSituationValue((ContextSituation)null);
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
            case EventPackage.CONTEXT_SITUATION_EVENT__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
            case EventPackage.CONTEXT_SITUATION_EVENT__SITUATION_VALUE:
                return situationValue != null;
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

} //ContextSituationEventImpl
