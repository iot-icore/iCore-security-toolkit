/**
 */
package rule.state.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.state.*;

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
 * @see rule.state.StatePackage
 * @generated
 */
public class StateSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StatePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateSwitch() {
        if (modelPackage == null) {
            modelPackage = StatePackage.eINSTANCE;
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
            case StatePackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = caseAbstractState(state);
                if (result == null) result = caseElement(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.EVENT_PATTERN_STATE: {
                EventPatternState eventPatternState = (EventPatternState)theEObject;
                T result = caseEventPatternState(eventPatternState);
                if (result == null) result = caseState(eventPatternState);
                if (result == null) result = caseAbstractState(eventPatternState);
                if (result == null) result = caseElement(eventPatternState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.REP_STATE: {
                RepState repState = (RepState)theEObject;
                T result = caseRepState(repState);
                if (result == null) result = caseState(repState);
                if (result == null) result = caseAbstractState(repState);
                if (result == null) result = caseElement(repState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.TIME_BOUNDED_STATE: {
                TimeBoundedState timeBoundedState = (TimeBoundedState)theEObject;
                T result = caseTimeBoundedState(timeBoundedState);
                if (result == null) result = caseState(timeBoundedState);
                if (result == null) result = caseAbstractState(timeBoundedState);
                if (result == null) result = caseElement(timeBoundedState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.COUNTER_STATE: {
                CounterState counterState = (CounterState)theEObject;
                T result = caseCounterState(counterState);
                if (result == null) result = caseAbstractState(counterState);
                if (result == null) result = caseElement(counterState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.REP_SINCE_STATE: {
                RepSinceState repSinceState = (RepSinceState)theEObject;
                T result = caseRepSinceState(repSinceState);
                if (result == null) result = caseRepState(repSinceState);
                if (result == null) result = caseState(repSinceState);
                if (result == null) result = caseAbstractState(repSinceState);
                if (result == null) result = caseElement(repSinceState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StatePackage.ABSTRACT_STATE: {
                AbstractState abstractState = (AbstractState)theEObject;
                T result = caseAbstractState(abstractState);
                if (result == null) result = caseElement(abstractState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseState(State object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Pattern State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Pattern State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventPatternState(EventPatternState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rep State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rep State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepState(RepState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Bounded State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Bounded State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeBoundedState(TimeBoundedState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Counter State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Counter State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCounterState(CounterState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rep Since State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rep Since State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepSinceState(RepSinceState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractState(AbstractState object) {
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

} //StateSwitch
