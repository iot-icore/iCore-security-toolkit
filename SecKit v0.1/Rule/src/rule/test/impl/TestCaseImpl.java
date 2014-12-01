/**
 */
package rule.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rule.event.EventTrace;

import rule.test.TestCase;
import rule.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.test.impl.TestCaseImpl#getEventTrace <em>Event Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
    /**
     * The cached value of the '{@link #getEventTrace() <em>Event Trace</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventTrace()
     * @generated
     * @ordered
     */
    protected EventTrace eventTrace;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestCaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TestPackage.Literals.TEST_CASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventTrace getEventTrace() {
        return eventTrace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventTrace(EventTrace newEventTrace, NotificationChain msgs) {
        EventTrace oldEventTrace = eventTrace;
        eventTrace = newEventTrace;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__EVENT_TRACE, oldEventTrace, newEventTrace);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventTrace(EventTrace newEventTrace) {
        if (newEventTrace != eventTrace) {
            NotificationChain msgs = null;
            if (eventTrace != null)
                msgs = ((InternalEObject)eventTrace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_CASE__EVENT_TRACE, null, msgs);
            if (newEventTrace != null)
                msgs = ((InternalEObject)newEventTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_CASE__EVENT_TRACE, null, msgs);
            msgs = basicSetEventTrace(newEventTrace, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__EVENT_TRACE, newEventTrace, newEventTrace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TestPackage.TEST_CASE__EVENT_TRACE:
                return basicSetEventTrace(null, msgs);
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
            case TestPackage.TEST_CASE__EVENT_TRACE:
                return getEventTrace();
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
            case TestPackage.TEST_CASE__EVENT_TRACE:
                setEventTrace((EventTrace)newValue);
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
            case TestPackage.TEST_CASE__EVENT_TRACE:
                setEventTrace((EventTrace)null);
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
            case TestPackage.TEST_CASE__EVENT_TRACE:
                return eventTrace != null;
        }
        return super.eIsSet(featureID);
    }

} //TestCaseImpl
