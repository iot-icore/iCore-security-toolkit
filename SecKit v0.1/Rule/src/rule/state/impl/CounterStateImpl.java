/**
 */
package rule.state.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.state.CounterState;
import rule.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counter State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.CounterStateImpl#getTrue <em>True</em>}</li>
 *   <li>{@link rule.state.impl.CounterStateImpl#getUndetermined <em>Undetermined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CounterStateImpl extends AbstractStateImpl implements CounterState {
    /**
     * The default value of the '{@link #getTrue() <em>True</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrue()
     * @generated
     * @ordered
     */
    protected static final long TRUE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTrue() <em>True</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrue()
     * @generated
     * @ordered
     */
    protected long true_ = TRUE_EDEFAULT;

    /**
     * The default value of the '{@link #getUndetermined() <em>Undetermined</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUndetermined()
     * @generated
     * @ordered
     */
    protected static final long UNDETERMINED_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getUndetermined() <em>Undetermined</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUndetermined()
     * @generated
     * @ordered
     */
    protected long undetermined = UNDETERMINED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CounterStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.COUNTER_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTrue() {
        return true_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrue(long newTrue) {
        long oldTrue = true_;
        true_ = newTrue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.COUNTER_STATE__TRUE, oldTrue, true_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getUndetermined() {
        return undetermined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUndetermined(long newUndetermined) {
        long oldUndetermined = undetermined;
        undetermined = newUndetermined;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.COUNTER_STATE__UNDETERMINED, oldUndetermined, undetermined));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case StatePackage.COUNTER_STATE__TRUE:
                return getTrue();
            case StatePackage.COUNTER_STATE__UNDETERMINED:
                return getUndetermined();
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
            case StatePackage.COUNTER_STATE__TRUE:
                setTrue((Long)newValue);
                return;
            case StatePackage.COUNTER_STATE__UNDETERMINED:
                setUndetermined((Long)newValue);
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
            case StatePackage.COUNTER_STATE__TRUE:
                setTrue(TRUE_EDEFAULT);
                return;
            case StatePackage.COUNTER_STATE__UNDETERMINED:
                setUndetermined(UNDETERMINED_EDEFAULT);
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
            case StatePackage.COUNTER_STATE__TRUE:
                return true_ != TRUE_EDEFAULT;
            case StatePackage.COUNTER_STATE__UNDETERMINED:
                return undetermined != UNDETERMINED_EDEFAULT;
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
        result.append(" (true: ");
        result.append(true_);
        result.append(", undetermined: ");
        result.append(undetermined);
        result.append(')');
        return result.toString();
    }

} //CounterStateImpl
