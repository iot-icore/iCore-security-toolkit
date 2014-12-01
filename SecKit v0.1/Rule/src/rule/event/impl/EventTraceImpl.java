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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.event.EventPackage;
import rule.event.EventTrace;
import rule.event.TimeWindow;

import rule.template.TimeStepSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.event.impl.EventTraceImpl#getTimeWindows <em>Time Windows</em>}</li>
 *   <li>{@link rule.event.impl.EventTraceImpl#getTimeStepSize <em>Time Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTraceImpl extends ElementImpl implements EventTrace {
    /**
     * The cached value of the '{@link #getTimeWindows() <em>Time Windows</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeWindows()
     * @generated
     * @ordered
     */
    protected EList<TimeWindow> timeWindows;

    /**
     * The cached value of the '{@link #getTimeStepSize() <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStepSize()
     * @generated
     * @ordered
     */
    protected TimeStepSize timeStepSize;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventTraceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.EVENT_TRACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TimeWindow> getTimeWindows() {
        if (timeWindows == null) {
            timeWindows = new EObjectContainmentWithInverseEList<TimeWindow>(TimeWindow.class, this, EventPackage.EVENT_TRACE__TIME_WINDOWS, EventPackage.TIME_WINDOW__TRACE);
        }
        return timeWindows;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize getTimeStepSize() {
        if (timeStepSize != null && timeStepSize.eIsProxy()) {
            InternalEObject oldTimeStepSize = (InternalEObject)timeStepSize;
            timeStepSize = (TimeStepSize)eResolveProxy(oldTimeStepSize);
            if (timeStepSize != oldTimeStepSize) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.EVENT_TRACE__TIME_STEP_SIZE, oldTimeStepSize, timeStepSize));
            }
        }
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize basicGetTimeStepSize() {
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeStepSize(TimeStepSize newTimeStepSize) {
        TimeStepSize oldTimeStepSize = timeStepSize;
        timeStepSize = newTimeStepSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.EVENT_TRACE__TIME_STEP_SIZE, oldTimeStepSize, timeStepSize));
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeWindows()).basicAdd(otherEnd, msgs);
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                return ((InternalEList<?>)getTimeWindows()).basicRemove(otherEnd, msgs);
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                return getTimeWindows();
            case EventPackage.EVENT_TRACE__TIME_STEP_SIZE:
                if (resolve) return getTimeStepSize();
                return basicGetTimeStepSize();
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                getTimeWindows().clear();
                getTimeWindows().addAll((Collection<? extends TimeWindow>)newValue);
                return;
            case EventPackage.EVENT_TRACE__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)newValue);
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                getTimeWindows().clear();
                return;
            case EventPackage.EVENT_TRACE__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)null);
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
            case EventPackage.EVENT_TRACE__TIME_WINDOWS:
                return timeWindows != null && !timeWindows.isEmpty();
            case EventPackage.EVENT_TRACE__TIME_STEP_SIZE:
                return timeStepSize != null;
        }
        return super.eIsSet(featureID);
    }

} //EventTraceImpl
