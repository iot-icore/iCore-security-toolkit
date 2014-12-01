/**
 */
package rule.temporal.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.Binary;
import rule.condition.Operator;
import rule.condition.Unary;

import rule.temporal.*;

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
 * @see rule.temporal.TemporalPackage
 * @generated
 */
public class TemporalSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TemporalPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalSwitch() {
        if (modelPackage == null) {
            modelPackage = TemporalPackage.eINSTANCE;
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
            case TemporalPackage.ALWAYS: {
                Always always = (Always)theEObject;
                T result = caseAlways(always);
                if (result == null) result = casePastTemporalOperator(always);
                if (result == null) result = caseUnary(always);
                if (result == null) result = caseOperator(always);
                if (result == null) result = caseArity(always);
                if (result == null) result = caseAtom(always);
                if (result == null) result = caseElement(always);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.SINCE: {
                Since since = (Since)theEObject;
                T result = caseSince(since);
                if (result == null) result = casePastTemporalOperator(since);
                if (result == null) result = caseBinary(since);
                if (result == null) result = caseOperator(since);
                if (result == null) result = caseArity(since);
                if (result == null) result = caseAtom(since);
                if (result == null) result = caseElement(since);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.BEFORE: {
                Before before = (Before)theEObject;
                T result = caseBefore(before);
                if (result == null) result = caseTimeBoundedOccurrence(before);
                if (result == null) result = caseUnary(before);
                if (result == null) result = caseTimeBoundedTemporalOperator(before);
                if (result == null) result = caseArity(before);
                if (result == null) result = casePastTemporalOperator(before);
                if (result == null) result = caseOperator(before);
                if (result == null) result = caseAtom(before);
                if (result == null) result = caseElement(before);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.WITHIN: {
                Within within = (Within)theEObject;
                T result = caseWithin(within);
                if (result == null) result = caseTimeBoundedOccurrence(within);
                if (result == null) result = caseUnary(within);
                if (result == null) result = caseTimeBoundedTemporalOperator(within);
                if (result == null) result = caseArity(within);
                if (result == null) result = casePastTemporalOperator(within);
                if (result == null) result = caseOperator(within);
                if (result == null) result = caseAtom(within);
                if (result == null) result = caseElement(within);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.DURING: {
                During during = (During)theEObject;
                T result = caseDuring(during);
                if (result == null) result = caseTimeBoundedOccurrence(during);
                if (result == null) result = caseUnary(during);
                if (result == null) result = caseTimeBoundedTemporalOperator(during);
                if (result == null) result = caseArity(during);
                if (result == null) result = casePastTemporalOperator(during);
                if (result == null) result = caseOperator(during);
                if (result == null) result = caseAtom(during);
                if (result == null) result = caseElement(during);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.CARDINALITY_OPERATOR: {
                CardinalityOperator cardinalityOperator = (CardinalityOperator)theEObject;
                T result = caseCardinalityOperator(cardinalityOperator);
                if (result == null) result = casePastTemporalOperator(cardinalityOperator);
                if (result == null) result = caseOperator(cardinalityOperator);
                if (result == null) result = caseAtom(cardinalityOperator);
                if (result == null) result = caseElement(cardinalityOperator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.TIME_BOUNDED_TEMPORAL_OPERATOR: {
                TimeBoundedTemporalOperator timeBoundedTemporalOperator = (TimeBoundedTemporalOperator)theEObject;
                T result = caseTimeBoundedTemporalOperator(timeBoundedTemporalOperator);
                if (result == null) result = casePastTemporalOperator(timeBoundedTemporalOperator);
                if (result == null) result = caseOperator(timeBoundedTemporalOperator);
                if (result == null) result = caseAtom(timeBoundedTemporalOperator);
                if (result == null) result = caseElement(timeBoundedTemporalOperator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.PAST_TEMPORAL_OPERATOR: {
                PastTemporalOperator pastTemporalOperator = (PastTemporalOperator)theEObject;
                T result = casePastTemporalOperator(pastTemporalOperator);
                if (result == null) result = caseOperator(pastTemporalOperator);
                if (result == null) result = caseAtom(pastTemporalOperator);
                if (result == null) result = caseElement(pastTemporalOperator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.TIME_BOUNDED_OCCURRENCE: {
                TimeBoundedOccurrence timeBoundedOccurrence = (TimeBoundedOccurrence)theEObject;
                T result = caseTimeBoundedOccurrence(timeBoundedOccurrence);
                if (result == null) result = caseTimeBoundedTemporalOperator(timeBoundedOccurrence);
                if (result == null) result = casePastTemporalOperator(timeBoundedOccurrence);
                if (result == null) result = caseOperator(timeBoundedOccurrence);
                if (result == null) result = caseAtom(timeBoundedOccurrence);
                if (result == null) result = caseElement(timeBoundedOccurrence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.EVENTUALLY: {
                Eventually eventually = (Eventually)theEObject;
                T result = caseEventually(eventually);
                if (result == null) result = casePastTemporalOperator(eventually);
                if (result == null) result = caseUnary(eventually);
                if (result == null) result = caseOperator(eventually);
                if (result == null) result = caseArity(eventually);
                if (result == null) result = caseAtom(eventually);
                if (result == null) result = caseElement(eventually);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.REPEAT_LIMIT: {
                RepeatLimit repeatLimit = (RepeatLimit)theEObject;
                T result = caseRepeatLimit(repeatLimit);
                if (result == null) result = caseCardinalityOperator(repeatLimit);
                if (result == null) result = caseTimeBoundedTemporalOperator(repeatLimit);
                if (result == null) result = caseBinary(repeatLimit);
                if (result == null) result = casePastTemporalOperator(repeatLimit);
                if (result == null) result = caseArity(repeatLimit);
                if (result == null) result = caseOperator(repeatLimit);
                if (result == null) result = caseAtom(repeatLimit);
                if (result == null) result = caseElement(repeatLimit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.REPEAT_SINCE: {
                RepeatSince repeatSince = (RepeatSince)theEObject;
                T result = caseRepeatSince(repeatSince);
                if (result == null) result = caseCardinalityOperator(repeatSince);
                if (result == null) result = caseBinary(repeatSince);
                if (result == null) result = casePastTemporalOperator(repeatSince);
                if (result == null) result = caseArity(repeatSince);
                if (result == null) result = caseOperator(repeatSince);
                if (result == null) result = caseAtom(repeatSince);
                if (result == null) result = caseElement(repeatSince);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemporalPackage.REPEAT_MAXIMUM: {
                RepeatMaximum repeatMaximum = (RepeatMaximum)theEObject;
                T result = caseRepeatMaximum(repeatMaximum);
                if (result == null) result = caseRepeatSince(repeatMaximum);
                if (result == null) result = caseCardinalityOperator(repeatMaximum);
                if (result == null) result = caseBinary(repeatMaximum);
                if (result == null) result = casePastTemporalOperator(repeatMaximum);
                if (result == null) result = caseArity(repeatMaximum);
                if (result == null) result = caseOperator(repeatMaximum);
                if (result == null) result = caseAtom(repeatMaximum);
                if (result == null) result = caseElement(repeatMaximum);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Always</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Always</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlways(Always object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Since</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Since</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSince(Since object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Before</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Before</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBefore(Before object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Within</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Within</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWithin(Within object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>During</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>During</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDuring(During object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cardinality Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cardinality Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCardinalityOperator(CardinalityOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Bounded Temporal Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Bounded Temporal Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeBoundedTemporalOperator(TimeBoundedTemporalOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Past Temporal Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Past Temporal Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePastTemporalOperator(PastTemporalOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Bounded Occurrence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Bounded Occurrence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeBoundedOccurrence(TimeBoundedOccurrence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Eventually</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Eventually</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventually(Eventually object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repeat Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repeat Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepeatLimit(RepeatLimit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repeat Since</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repeat Since</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepeatSince(RepeatSince object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repeat Maximum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repeat Maximum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepeatMaximum(RepeatMaximum object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAtom(Atom object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperator(Operator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Arity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Arity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArity(Arity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnary(Unary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinary(Binary object) {
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

} //TemporalSwitch
