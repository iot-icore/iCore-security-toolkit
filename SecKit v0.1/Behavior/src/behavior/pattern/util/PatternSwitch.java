/**
 */
package behavior.pattern.util;

import behavior.pattern.*;

import models.Element;
import models.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see behavior.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PatternPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternSwitch() {
        if (modelPackage == null) {
            modelPackage = PatternPackage.eINSTANCE;
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
            case PatternPackage.BEHAVIOR_PATTERN: {
                BehaviorPattern behaviorPattern = (BehaviorPattern)theEObject;
                T result = caseBehaviorPattern(behaviorPattern);
                if (result == null) result = casePattern(behaviorPattern);
                if (result == null) result = caseElement(behaviorPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.ACTIVITY_PATTERN: {
                ActivityPattern activityPattern = (ActivityPattern)theEObject;
                T result = caseActivityPattern(activityPattern);
                if (result == null) result = casePattern(activityPattern);
                if (result == null) result = caseElement(activityPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.ACTION_PATTERN: {
                ActionPattern actionPattern = (ActionPattern)theEObject;
                T result = caseActionPattern(actionPattern);
                if (result == null) result = caseActivityPattern(actionPattern);
                if (result == null) result = casePattern(actionPattern);
                if (result == null) result = caseElement(actionPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.INTERACTION_PATTERN: {
                InteractionPattern interactionPattern = (InteractionPattern)theEObject;
                T result = caseInteractionPattern(interactionPattern);
                if (result == null) result = caseActivityPattern(interactionPattern);
                if (result == null) result = casePattern(interactionPattern);
                if (result == null) result = caseElement(interactionPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN: {
                InteractionContributionPattern interactionContributionPattern = (InteractionContributionPattern)theEObject;
                T result = caseInteractionContributionPattern(interactionContributionPattern);
                if (result == null) result = casePattern(interactionContributionPattern);
                if (result == null) result = caseElement(interactionContributionPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorPattern(BehaviorPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityPattern(ActivityPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionPattern(ActionPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPattern(InteractionPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionPattern(InteractionContributionPattern object) {
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

} //PatternSwitch
