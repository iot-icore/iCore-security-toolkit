/**
 */
package rule.action.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.action.*;

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
 * @see rule.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ActionPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionSwitch() {
        if (modelPackage == null) {
            modelPackage = ActionPackage.eINSTANCE;
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
            case ActionPackage.ACTION_BEHAVIOR: {
                ActionBehavior actionBehavior = (ActionBehavior)theEObject;
                T result = caseActionBehavior(actionBehavior);
                if (result == null) result = caseElement(actionBehavior);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.ALLOW: {
                Allow allow = (Allow)theEObject;
                T result = caseAllow(allow);
                if (result == null) result = caseAuthorization(allow);
                if (result == null) result = caseActionBehavior(allow);
                if (result == null) result = caseElement(allow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.DENY: {
                Deny deny = (Deny)theEObject;
                T result = caseDeny(deny);
                if (result == null) result = caseAuthorization(deny);
                if (result == null) result = caseActionBehavior(deny);
                if (result == null) result = caseElement(deny);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.MODIFY: {
                Modify modify = (Modify)theEObject;
                T result = caseModify(modify);
                if (result == null) result = caseConstraint(modify);
                if (result == null) result = caseActionBehavior(modify);
                if (result == null) result = caseElement(modify);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.DELAY: {
                Delay delay = (Delay)theEObject;
                T result = caseDelay(delay);
                if (result == null) result = caseConstraint(delay);
                if (result == null) result = caseActionBehavior(delay);
                if (result == null) result = caseElement(delay);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.AUTHORIZATION: {
                Authorization authorization = (Authorization)theEObject;
                T result = caseAuthorization(authorization);
                if (result == null) result = caseActionBehavior(authorization);
                if (result == null) result = caseElement(authorization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.CONSTRAINT: {
                Constraint constraint = (Constraint)theEObject;
                T result = caseConstraint(constraint);
                if (result == null) result = caseActionBehavior(constraint);
                if (result == null) result = caseElement(constraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.EXECUTE: {
                Execute execute = (Execute)theEObject;
                T result = caseExecute(execute);
                if (result == null) result = caseActionBehavior(execute);
                if (result == null) result = caseElement(execute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionBehavior(ActionBehavior object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllow(Allow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deny</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deny</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeny(Deny object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modify</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modify</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModify(Modify object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDelay(Delay object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthorization(Authorization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstraint(Constraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecute(Execute object) {
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

} //ActionSwitch
