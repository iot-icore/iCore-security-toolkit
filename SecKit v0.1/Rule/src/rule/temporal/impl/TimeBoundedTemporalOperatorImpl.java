/**
 */
package rule.temporal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.template.TimeStepVariable;

import rule.temporal.TemporalPackage;
import rule.temporal.TimeBoundedTemporalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Bounded Temporal Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.temporal.impl.TimeBoundedTemporalOperatorImpl#getTimeBoundInTimeSteps <em>Time Bound In Time Steps</em>}</li>
 *   <li>{@link rule.temporal.impl.TimeBoundedTemporalOperatorImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TimeBoundedTemporalOperatorImpl extends PastTemporalOperatorImpl implements TimeBoundedTemporalOperator {
    /**
     * The default value of the '{@link #getTimeBoundInTimeSteps() <em>Time Bound In Time Steps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeBoundInTimeSteps()
     * @generated
     * @ordered
     */
    protected static final long TIME_BOUND_IN_TIME_STEPS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTimeBoundInTimeSteps() <em>Time Bound In Time Steps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeBoundInTimeSteps()
     * @generated
     * @ordered
     */
    protected long timeBoundInTimeSteps = TIME_BOUND_IN_TIME_STEPS_EDEFAULT;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected TimeStepVariable variable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeBoundedTemporalOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.TIME_BOUNDED_TEMPORAL_OPERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTimeBoundInTimeSteps() {
        return timeBoundInTimeSteps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeBoundInTimeSteps(long newTimeBoundInTimeSteps) {
        long oldTimeBoundInTimeSteps = timeBoundInTimeSteps;
        timeBoundInTimeSteps = newTimeBoundInTimeSteps;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS, oldTimeBoundInTimeSteps, timeBoundInTimeSteps));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepVariable getVariable() {
        if (variable != null && variable.eIsProxy()) {
            InternalEObject oldVariable = (InternalEObject)variable;
            variable = (TimeStepVariable)eResolveProxy(oldVariable);
            if (variable != oldVariable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE, oldVariable, variable));
            }
        }
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepVariable basicGetVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable(TimeStepVariable newVariable) {
        TimeStepVariable oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE, oldVariable, variable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS:
                return getTimeBoundInTimeSteps();
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE:
                if (resolve) return getVariable();
                return basicGetVariable();
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
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS:
                setTimeBoundInTimeSteps((Long)newValue);
                return;
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE:
                setVariable((TimeStepVariable)newValue);
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
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS:
                setTimeBoundInTimeSteps(TIME_BOUND_IN_TIME_STEPS_EDEFAULT);
                return;
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE:
                setVariable((TimeStepVariable)null);
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
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS:
                return timeBoundInTimeSteps != TIME_BOUND_IN_TIME_STEPS_EDEFAULT;
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE:
                return variable != null;
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
        result.append(" (timeBoundInTimeSteps: ");
        result.append(timeBoundInTimeSteps);
        result.append(')');
        return result.toString();
    }

} //TimeBoundedTemporalOperatorImpl
