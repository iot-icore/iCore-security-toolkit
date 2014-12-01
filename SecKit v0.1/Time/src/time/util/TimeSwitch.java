/**
 */
package time.util;

import models.Element;
import models.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import time.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see time.TimePackage
 * @generated
 */
public class TimeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TimePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeSwitch() {
        if (modelPackage == null) {
            modelPackage = TimePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TimePackage.TIMESTAMP: {
                Timestamp timestamp = (Timestamp)theEObject;
                T result = caseTimestamp(timestamp);
                if (result == null) result = caseElement(timestamp);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.TIMESTAMP_PRECISION: {
                TimestampPrecision timestampPrecision = (TimestampPrecision)theEObject;
                T result = caseTimestampPrecision(timestampPrecision);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.TIME_INTERVAL: {
                TimeInterval timeInterval = (TimeInterval)theEObject;
                T result = caseTimeInterval(timeInterval);
                if (result == null) result = caseElement(timeInterval);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.TIME_DURATION: {
                TimeDuration timeDuration = (TimeDuration)theEObject;
                T result = caseTimeDuration(timeDuration);
                if (result == null) result = caseElement(timeDuration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.CLOCK: {
                Clock clock = (Clock)theEObject;
                T result = caseClock(clock);
                if (result == null) result = caseElement(clock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.DISCRETE_CLOCK: {
                DiscreteClock discreteClock = (DiscreteClock)theEObject;
                T result = caseDiscreteClock(discreteClock);
                if (result == null) result = caseClock(discreteClock);
                if (result == null) result = caseElement(discreteClock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.SYSTEM_CLOCK: {
                SystemClock systemClock = (SystemClock)theEObject;
                T result = caseSystemClock(systemClock);
                if (result == null) result = caseClock(systemClock);
                if (result == null) result = caseElement(systemClock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TimePackage.TIMESTAMP_PATTERN: {
                TimestampPattern timestampPattern = (TimestampPattern)theEObject;
                T result = caseTimestampPattern(timestampPattern);
                if (result == null) result = casePattern(timestampPattern);
                if (result == null) result = caseElement(timestampPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestamp(Timestamp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp Precision</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp Precision</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestampPrecision(TimestampPrecision object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeInterval(TimeInterval object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeDuration(TimeDuration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClock(Clock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete Clock</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete Clock</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteClock(DiscreteClock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Clock</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Clock</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemClock(SystemClock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestampPattern(TimestampPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePattern(Pattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //TimeSwitch
