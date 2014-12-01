/**
 */
package rule.temporal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.Arity;
import rule.condition.Binary;

import rule.template.TimeStepVariable;

import rule.temporal.RepeatLimit;
import rule.temporal.TemporalPackage;
import rule.temporal.TimeBoundedTemporalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.temporal.impl.RepeatLimitImpl#getTimeBoundInTimeSteps <em>Time Bound In Time Steps</em>}</li>
 *   <li>{@link rule.temporal.impl.RepeatLimitImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link rule.temporal.impl.RepeatLimitImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatLimitImpl extends CardinalityOperatorImpl implements RepeatLimit {
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
     * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
    protected static final long LOWER_BOUND_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
    protected long lowerBound = LOWER_BOUND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepeatLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.REPEAT_LIMIT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS, oldTimeBoundInTimeSteps, timeBoundInTimeSteps));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalPackage.REPEAT_LIMIT__VARIABLE, oldVariable, variable));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.REPEAT_LIMIT__VARIABLE, oldVariable, variable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getLowerBound() {
        return lowerBound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerBound(long newLowerBound) {
        long oldLowerBound = lowerBound;
        lowerBound = newLowerBound;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.REPEAT_LIMIT__LOWER_BOUND, oldLowerBound, lowerBound));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS:
                return getTimeBoundInTimeSteps();
            case TemporalPackage.REPEAT_LIMIT__VARIABLE:
                if (resolve) return getVariable();
                return basicGetVariable();
            case TemporalPackage.REPEAT_LIMIT__LOWER_BOUND:
                return getLowerBound();
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
            case TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS:
                setTimeBoundInTimeSteps((Long)newValue);
                return;
            case TemporalPackage.REPEAT_LIMIT__VARIABLE:
                setVariable((TimeStepVariable)newValue);
                return;
            case TemporalPackage.REPEAT_LIMIT__LOWER_BOUND:
                setLowerBound((Long)newValue);
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
            case TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS:
                setTimeBoundInTimeSteps(TIME_BOUND_IN_TIME_STEPS_EDEFAULT);
                return;
            case TemporalPackage.REPEAT_LIMIT__VARIABLE:
                setVariable((TimeStepVariable)null);
                return;
            case TemporalPackage.REPEAT_LIMIT__LOWER_BOUND:
                setLowerBound(LOWER_BOUND_EDEFAULT);
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
            case TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS:
                return timeBoundInTimeSteps != TIME_BOUND_IN_TIME_STEPS_EDEFAULT;
            case TemporalPackage.REPEAT_LIMIT__VARIABLE:
                return variable != null;
            case TemporalPackage.REPEAT_LIMIT__LOWER_BOUND:
                return lowerBound != LOWER_BOUND_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == TimeBoundedTemporalOperator.class) {
            switch (derivedFeatureID) {
                case TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS: return TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS;
                case TemporalPackage.REPEAT_LIMIT__VARIABLE: return TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE;
                default: return -1;
            }
        }
        if (baseClass == Arity.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Binary.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == TimeBoundedTemporalOperator.class) {
            switch (baseFeatureID) {
                case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS: return TemporalPackage.REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS;
                case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE: return TemporalPackage.REPEAT_LIMIT__VARIABLE;
                default: return -1;
            }
        }
        if (baseClass == Arity.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Binary.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(", lowerBound: ");
        result.append(lowerBound);
        result.append(')');
        return result.toString();
    }

} //RepeatLimitImpl
