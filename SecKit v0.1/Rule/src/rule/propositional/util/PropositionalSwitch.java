/**
 */
package rule.propositional.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.Binary;
import rule.condition.Multiary;
import rule.condition.Operator;
import rule.condition.Unary;

import rule.propositional.*;

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
 * @see rule.propositional.PropositionalPackage
 * @generated
 */
public class PropositionalSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PropositionalPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropositionalSwitch() {
        if (modelPackage == null) {
            modelPackage = PropositionalPackage.eINSTANCE;
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
            case PropositionalPackage.AND: {
                And and = (And)theEObject;
                T result = caseAnd(and);
                if (result == null) result = casePropositionalOperator(and);
                if (result == null) result = caseMultiary(and);
                if (result == null) result = caseOperator(and);
                if (result == null) result = caseArity(and);
                if (result == null) result = caseAtom(and);
                if (result == null) result = caseElement(and);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropositionalPackage.OR: {
                Or or = (Or)theEObject;
                T result = caseOr(or);
                if (result == null) result = casePropositionalOperator(or);
                if (result == null) result = caseMultiary(or);
                if (result == null) result = caseOperator(or);
                if (result == null) result = caseArity(or);
                if (result == null) result = caseAtom(or);
                if (result == null) result = caseElement(or);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropositionalPackage.NOT: {
                Not not = (Not)theEObject;
                T result = caseNot(not);
                if (result == null) result = casePropositionalOperator(not);
                if (result == null) result = caseUnary(not);
                if (result == null) result = caseOperator(not);
                if (result == null) result = caseArity(not);
                if (result == null) result = caseAtom(not);
                if (result == null) result = caseElement(not);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropositionalPackage.IMPLIES: {
                Implies implies = (Implies)theEObject;
                T result = caseImplies(implies);
                if (result == null) result = casePropositionalOperator(implies);
                if (result == null) result = caseBinary(implies);
                if (result == null) result = caseOperator(implies);
                if (result == null) result = caseArity(implies);
                if (result == null) result = caseAtom(implies);
                if (result == null) result = caseElement(implies);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PropositionalPackage.PROPOSITIONAL_OPERATOR: {
                PropositionalOperator propositionalOperator = (PropositionalOperator)theEObject;
                T result = casePropositionalOperator(propositionalOperator);
                if (result == null) result = caseOperator(propositionalOperator);
                if (result == null) result = caseAtom(propositionalOperator);
                if (result == null) result = caseElement(propositionalOperator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>And</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>And</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnd(And object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Or</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOr(Or object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Not</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNot(Not object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implies</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implies</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplies(Implies object) {
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
    public T casePropositionalOperator(PropositionalOperator object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Multiary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiary(Multiary object) {
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

} //PropositionalSwitch
