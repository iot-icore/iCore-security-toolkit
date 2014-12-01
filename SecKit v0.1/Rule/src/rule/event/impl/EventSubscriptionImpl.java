/**
 */
package rule.event.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.EventPattern;

import rule.event.EventPackage;
import rule.event.EventSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.event.impl.EventSubscriptionImpl#getEventPattern <em>Event Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSubscriptionImpl extends ElementImpl implements EventSubscription {
    /**
     * The cached value of the '{@link #getEventPattern() <em>Event Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventPattern()
     * @generated
     * @ordered
     */
    protected EventPattern eventPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventSubscriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.EVENT_SUBSCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern getEventPattern() {
        if (eventPattern != null && eventPattern.eIsProxy()) {
            InternalEObject oldEventPattern = (InternalEObject)eventPattern;
            eventPattern = (EventPattern)eResolveProxy(oldEventPattern);
            if (eventPattern != oldEventPattern) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN, oldEventPattern, eventPattern));
            }
        }
        return eventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern basicGetEventPattern() {
        return eventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventPattern(EventPattern newEventPattern) {
        EventPattern oldEventPattern = eventPattern;
        eventPattern = newEventPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN, oldEventPattern, eventPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN:
                if (resolve) return getEventPattern();
                return basicGetEventPattern();
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
            case EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN:
                setEventPattern((EventPattern)newValue);
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
            case EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN:
                setEventPattern((EventPattern)null);
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
            case EventPackage.EVENT_SUBSCRIPTION__EVENT_PATTERN:
                return eventPattern != null;
        }
        return super.eIsSet(featureID);
    }

} //EventSubscriptionImpl
