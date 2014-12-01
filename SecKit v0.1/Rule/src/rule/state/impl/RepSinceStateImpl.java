/**
 */
package rule.state.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.state.CounterState;
import rule.state.RepSinceState;
import rule.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rep Since State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.RepSinceStateImpl#getUnds <em>Unds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepSinceStateImpl extends RepStateImpl implements RepSinceState {
    /**
     * The cached value of the '{@link #getUnds() <em>Unds</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnds()
     * @generated
     * @ordered
     */
    protected EList<CounterState> unds;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepSinceStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.REP_SINCE_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CounterState> getUnds() {
        if (unds == null) {
            unds = new EObjectContainmentEList<CounterState>(CounterState.class, this, StatePackage.REP_SINCE_STATE__UNDS);
        }
        return unds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StatePackage.REP_SINCE_STATE__UNDS:
                return ((InternalEList<?>)getUnds()).basicRemove(otherEnd, msgs);
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
            case StatePackage.REP_SINCE_STATE__UNDS:
                return getUnds();
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
            case StatePackage.REP_SINCE_STATE__UNDS:
                getUnds().clear();
                getUnds().addAll((Collection<? extends CounterState>)newValue);
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
            case StatePackage.REP_SINCE_STATE__UNDS:
                getUnds().clear();
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
            case StatePackage.REP_SINCE_STATE__UNDS:
                return unds != null && !unds.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RepSinceStateImpl
