/**
 */
package rule.state.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.state.StatePackage;
import rule.state.TimeBoundedState;

import utils.CircularBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Bounded State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.TimeBoundedStateImpl#getPreviousValues <em>Previous Values</em>}</li>
 *   <li>{@link rule.state.impl.TimeBoundedStateImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeBoundedStateImpl extends StateImpl implements TimeBoundedState {
    /**
     * The default value of the '{@link #getPreviousValues() <em>Previous Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousValues()
     * @generated
     * @ordered
     */
    protected static final CircularBuffer PREVIOUS_VALUES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreviousValues() <em>Previous Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousValues()
     * @generated
     * @ordered
     */
    protected CircularBuffer previousValues = PREVIOUS_VALUES_EDEFAULT;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final long POSITION_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected long position = POSITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeBoundedStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.TIME_BOUNDED_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CircularBuffer getPreviousValues() {
        return previousValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviousValues(CircularBuffer newPreviousValues) {
        CircularBuffer oldPreviousValues = previousValues;
        previousValues = newPreviousValues;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.TIME_BOUNDED_STATE__PREVIOUS_VALUES, oldPreviousValues, previousValues));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosition(long newPosition) {
        long oldPosition = position;
        position = newPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.TIME_BOUNDED_STATE__POSITION, oldPosition, position));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case StatePackage.TIME_BOUNDED_STATE__PREVIOUS_VALUES:
                return getPreviousValues();
            case StatePackage.TIME_BOUNDED_STATE__POSITION:
                return getPosition();
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
            case StatePackage.TIME_BOUNDED_STATE__PREVIOUS_VALUES:
                setPreviousValues((CircularBuffer)newValue);
                return;
            case StatePackage.TIME_BOUNDED_STATE__POSITION:
                setPosition((Long)newValue);
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
            case StatePackage.TIME_BOUNDED_STATE__PREVIOUS_VALUES:
                setPreviousValues(PREVIOUS_VALUES_EDEFAULT);
                return;
            case StatePackage.TIME_BOUNDED_STATE__POSITION:
                setPosition(POSITION_EDEFAULT);
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
            case StatePackage.TIME_BOUNDED_STATE__PREVIOUS_VALUES:
                return PREVIOUS_VALUES_EDEFAULT == null ? previousValues != null : !PREVIOUS_VALUES_EDEFAULT.equals(previousValues);
            case StatePackage.TIME_BOUNDED_STATE__POSITION:
                return position != POSITION_EDEFAULT;
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
        result.append(" (previousValues: ");
        result.append(previousValues);
        result.append(", position: ");
        result.append(position);
        result.append(')');
        return result.toString();
    }

} //TimeBoundedStateImpl
