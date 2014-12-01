/**
 */
package rule.event.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.event.Event;
import rule.event.EventPackage;
import rule.event.EventSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.event.impl.EventSetImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSetImpl extends ElementImpl implements EventSet {
    /**
     * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvents()
     * @generated
     * @ordered
     */
    protected EList<Event> events;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.EVENT_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Event> getEvents() {
        if (events == null) {
            events = new EObjectContainmentEList<Event>(Event.class, this, EventPackage.EVENT_SET__EVENTS);
        }
        return events;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.EVENT_SET__EVENTS:
                return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
            case EventPackage.EVENT_SET__EVENTS:
                return getEvents();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EventPackage.EVENT_SET__EVENTS:
                getEvents().clear();
                getEvents().addAll((Collection<? extends Event>)newValue);
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
            case EventPackage.EVENT_SET__EVENTS:
                getEvents().clear();
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
            case EventPackage.EVENT_SET__EVENTS:
                return events != null && !events.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EventSetImpl
