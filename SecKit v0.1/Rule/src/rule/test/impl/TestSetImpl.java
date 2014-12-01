/**
 */
package rule.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.event.EventSet;

import rule.test.TestCase;
import rule.test.TestPackage;
import rule.test.TestSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.test.impl.TestSetImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link rule.test.impl.TestSetImpl#getEventSet <em>Event Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSetImpl extends MinimalEObjectImpl.Container implements TestSet {
    /**
     * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestCases()
     * @generated
     * @ordered
     */
    protected EList<TestCase> testCases;

    /**
     * The cached value of the '{@link #getEventSet() <em>Event Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventSet()
     * @generated
     * @ordered
     */
    protected EventSet eventSet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TestPackage.Literals.TEST_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestCase> getTestCases() {
        if (testCases == null) {
            testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, TestPackage.TEST_SET__TEST_CASES);
        }
        return testCases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventSet getEventSet() {
        return eventSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventSet(EventSet newEventSet, NotificationChain msgs) {
        EventSet oldEventSet = eventSet;
        eventSet = newEventSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SET__EVENT_SET, oldEventSet, newEventSet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventSet(EventSet newEventSet) {
        if (newEventSet != eventSet) {
            NotificationChain msgs = null;
            if (eventSet != null)
                msgs = ((InternalEObject)eventSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_SET__EVENT_SET, null, msgs);
            if (newEventSet != null)
                msgs = ((InternalEObject)newEventSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TEST_SET__EVENT_SET, null, msgs);
            msgs = basicSetEventSet(newEventSet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SET__EVENT_SET, newEventSet, newEventSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TestPackage.TEST_SET__TEST_CASES:
                return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
            case TestPackage.TEST_SET__EVENT_SET:
                return basicSetEventSet(null, msgs);
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
            case TestPackage.TEST_SET__TEST_CASES:
                return getTestCases();
            case TestPackage.TEST_SET__EVENT_SET:
                return getEventSet();
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
            case TestPackage.TEST_SET__TEST_CASES:
                getTestCases().clear();
                getTestCases().addAll((Collection<? extends TestCase>)newValue);
                return;
            case TestPackage.TEST_SET__EVENT_SET:
                setEventSet((EventSet)newValue);
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
            case TestPackage.TEST_SET__TEST_CASES:
                getTestCases().clear();
                return;
            case TestPackage.TEST_SET__EVENT_SET:
                setEventSet((EventSet)null);
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
            case TestPackage.TEST_SET__TEST_CASES:
                return testCases != null && !testCases.isEmpty();
            case TestPackage.TEST_SET__EVENT_SET:
                return eventSet != null;
        }
        return super.eIsSet(featureID);
    }

} //TestSetImpl
