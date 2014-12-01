/**
 */
package rule.state.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.state.CounterState;
import rule.state.RepState;
import rule.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rep State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.RepStateImpl#getCounterState <em>Counter State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepStateImpl extends StateImpl implements RepState {
    /**
     * The cached value of the '{@link #getCounterState() <em>Counter State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCounterState()
     * @generated
     * @ordered
     */
    protected CounterState counterState;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.REP_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CounterState getCounterState() {
        return counterState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCounterState(CounterState newCounterState, NotificationChain msgs) {
        CounterState oldCounterState = counterState;
        counterState = newCounterState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatePackage.REP_STATE__COUNTER_STATE, oldCounterState, newCounterState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCounterState(CounterState newCounterState) {
        if (newCounterState != counterState) {
            NotificationChain msgs = null;
            if (counterState != null)
                msgs = ((InternalEObject)counterState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatePackage.REP_STATE__COUNTER_STATE, null, msgs);
            if (newCounterState != null)
                msgs = ((InternalEObject)newCounterState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatePackage.REP_STATE__COUNTER_STATE, null, msgs);
            msgs = basicSetCounterState(newCounterState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.REP_STATE__COUNTER_STATE, newCounterState, newCounterState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StatePackage.REP_STATE__COUNTER_STATE:
                return basicSetCounterState(null, msgs);
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
            case StatePackage.REP_STATE__COUNTER_STATE:
                return getCounterState();
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
            case StatePackage.REP_STATE__COUNTER_STATE:
                setCounterState((CounterState)newValue);
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
            case StatePackage.REP_STATE__COUNTER_STATE:
                setCounterState((CounterState)null);
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
            case StatePackage.REP_STATE__COUNTER_STATE:
                return counterState != null;
        }
        return super.eIsSet(featureID);
    }

} //RepStateImpl
