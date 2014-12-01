/**
 */
package rule.event.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.event.Event;
import rule.event.EventPackage;
import rule.event.EventTrace;
import rule.event.TimeWindow;

import rule.template.TimeStepRuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.event.impl.TimeWindowImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link rule.event.impl.TimeWindowImpl#getReferenceClock <em>Reference Clock</em>}</li>
 *   <li>{@link rule.event.impl.TimeWindowImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link rule.event.impl.TimeWindowImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeWindowImpl extends ElementImpl implements TimeWindow {
    /**
     * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvents()
     * @generated
     * @ordered
     */
    protected EList<Event> events;

    /**
     * The cached value of the '{@link #getReferenceClock() <em>Reference Clock</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceClock()
     * @generated
     * @ordered
     */
    protected TimeStepRuleSet referenceClock;

    /**
     * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected static final long INDEX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected long index = INDEX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeWindowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.TIME_WINDOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Event> getEvents() {
        if (events == null) {
            events = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, EventPackage.TIME_WINDOW__EVENTS, EventPackage.EVENT__WINDOWS);
        }
        return events;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepRuleSet getReferenceClock() {
        if (referenceClock != null && referenceClock.eIsProxy()) {
            InternalEObject oldReferenceClock = (InternalEObject)referenceClock;
            referenceClock = (TimeStepRuleSet)eResolveProxy(oldReferenceClock);
            if (referenceClock != oldReferenceClock) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.TIME_WINDOW__REFERENCE_CLOCK, oldReferenceClock, referenceClock));
            }
        }
        return referenceClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepRuleSet basicGetReferenceClock() {
        return referenceClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferenceClock(TimeStepRuleSet newReferenceClock) {
        TimeStepRuleSet oldReferenceClock = referenceClock;
        referenceClock = newReferenceClock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.TIME_WINDOW__REFERENCE_CLOCK, oldReferenceClock, referenceClock));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getIndex() {
        return index;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndex(long newIndex) {
        long oldIndex = index;
        index = newIndex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.TIME_WINDOW__INDEX, oldIndex, index));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventTrace getTrace() {
        if (eContainerFeatureID() != EventPackage.TIME_WINDOW__TRACE) return null;
        return (EventTrace)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrace(EventTrace newTrace, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTrace, EventPackage.TIME_WINDOW__TRACE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrace(EventTrace newTrace) {
        if (newTrace != eInternalContainer() || (eContainerFeatureID() != EventPackage.TIME_WINDOW__TRACE && newTrace != null)) {
            if (EcoreUtil.isAncestor(this, newTrace))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTrace != null)
                msgs = ((InternalEObject)newTrace).eInverseAdd(this, EventPackage.EVENT_TRACE__TIME_WINDOWS, EventTrace.class, msgs);
            msgs = basicSetTrace(newTrace, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.TIME_WINDOW__TRACE, newTrace, newTrace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.TIME_WINDOW__EVENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvents()).basicAdd(otherEnd, msgs);
            case EventPackage.TIME_WINDOW__TRACE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTrace((EventTrace)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.TIME_WINDOW__EVENTS:
                return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
            case EventPackage.TIME_WINDOW__TRACE:
                return basicSetTrace(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case EventPackage.TIME_WINDOW__TRACE:
                return eInternalContainer().eInverseRemove(this, EventPackage.EVENT_TRACE__TIME_WINDOWS, EventTrace.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EventPackage.TIME_WINDOW__EVENTS:
                return getEvents();
            case EventPackage.TIME_WINDOW__REFERENCE_CLOCK:
                if (resolve) return getReferenceClock();
                return basicGetReferenceClock();
            case EventPackage.TIME_WINDOW__INDEX:
                return getIndex();
            case EventPackage.TIME_WINDOW__TRACE:
                return getTrace();
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
            case EventPackage.TIME_WINDOW__EVENTS:
                getEvents().clear();
                getEvents().addAll((Collection<? extends Event>)newValue);
                return;
            case EventPackage.TIME_WINDOW__REFERENCE_CLOCK:
                setReferenceClock((TimeStepRuleSet)newValue);
                return;
            case EventPackage.TIME_WINDOW__INDEX:
                setIndex((Long)newValue);
                return;
            case EventPackage.TIME_WINDOW__TRACE:
                setTrace((EventTrace)newValue);
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
            case EventPackage.TIME_WINDOW__EVENTS:
                getEvents().clear();
                return;
            case EventPackage.TIME_WINDOW__REFERENCE_CLOCK:
                setReferenceClock((TimeStepRuleSet)null);
                return;
            case EventPackage.TIME_WINDOW__INDEX:
                setIndex(INDEX_EDEFAULT);
                return;
            case EventPackage.TIME_WINDOW__TRACE:
                setTrace((EventTrace)null);
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
            case EventPackage.TIME_WINDOW__EVENTS:
                return events != null && !events.isEmpty();
            case EventPackage.TIME_WINDOW__REFERENCE_CLOCK:
                return referenceClock != null;
            case EventPackage.TIME_WINDOW__INDEX:
                return index != INDEX_EDEFAULT;
            case EventPackage.TIME_WINDOW__TRACE:
                return getTrace() != null;
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
        result.append(" (index: ");
        result.append(index);
        result.append(')');
        return result.toString();
    }

} //TimeWindowImpl
