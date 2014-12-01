/**
 */
package behavior.event.util;

import behavior.event.*;

import models.Element;
import models.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.EventPattern;
import rule.condition.Nullary;

import rule.event.Event;

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
 * @see behavior.event.EventPackage
 * @generated
 */
public class EventSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EventPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventSwitch() {
        if (modelPackage == null) {
            modelPackage = EventPackage.eINSTANCE;
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
            case EventPackage.ACTIVITY_EVENT_PATTERN: {
                ActivityEventPattern activityEventPattern = (ActivityEventPattern)theEObject;
                T result = caseActivityEventPattern(activityEventPattern);
                if (result == null) result = caseEventPattern(activityEventPattern);
                if (result == null) result = casePattern(activityEventPattern);
                if (result == null) result = caseNullary(activityEventPattern);
                if (result == null) result = caseAtom(activityEventPattern);
                if (result == null) result = caseElement(activityEventPattern);
                if (result == null) result = caseArity(activityEventPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.BEHAVIOR_EVENT: {
                BehaviorEvent behaviorEvent = (BehaviorEvent)theEObject;
                T result = caseBehaviorEvent(behaviorEvent);
                if (result == null) result = caseAbstractBehaviorEvent(behaviorEvent);
                if (result == null) result = caseEvent(behaviorEvent);
                if (result == null) result = caseElement(behaviorEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.ABSTRACT_BEHAVIOR_EVENT: {
                AbstractBehaviorEvent abstractBehaviorEvent = (AbstractBehaviorEvent)theEObject;
                T result = caseAbstractBehaviorEvent(abstractBehaviorEvent);
                if (result == null) result = caseEvent(abstractBehaviorEvent);
                if (result == null) result = caseElement(abstractBehaviorEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.ACTION_EVENT: {
                ActionEvent actionEvent = (ActionEvent)theEObject;
                T result = caseActionEvent(actionEvent);
                if (result == null) result = caseActivityEvent(actionEvent);
                if (result == null) result = caseAbstractBehaviorEvent(actionEvent);
                if (result == null) result = caseEvent(actionEvent);
                if (result == null) result = caseElement(actionEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.INTERACTION_EVENT: {
                InteractionEvent interactionEvent = (InteractionEvent)theEObject;
                T result = caseInteractionEvent(interactionEvent);
                if (result == null) result = caseActivityEvent(interactionEvent);
                if (result == null) result = caseAbstractBehaviorEvent(interactionEvent);
                if (result == null) result = caseEvent(interactionEvent);
                if (result == null) result = caseElement(interactionEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.FLOW_POINT_EVENT: {
                FlowPointEvent flowPointEvent = (FlowPointEvent)theEObject;
                T result = caseFlowPointEvent(flowPointEvent);
                if (result == null) result = caseAbstractBehaviorEvent(flowPointEvent);
                if (result == null) result = caseEvent(flowPointEvent);
                if (result == null) result = caseElement(flowPointEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.ACTIVITY_EVENT: {
                ActivityEvent activityEvent = (ActivityEvent)theEObject;
                T result = caseActivityEvent(activityEvent);
                if (result == null) result = caseAbstractBehaviorEvent(activityEvent);
                if (result == null) result = caseEvent(activityEvent);
                if (result == null) result = caseElement(activityEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.BEHAVIOR_EVENT_PATTERN: {
                BehaviorEventPattern behaviorEventPattern = (BehaviorEventPattern)theEObject;
                T result = caseBehaviorEventPattern(behaviorEventPattern);
                if (result == null) result = caseEventPattern(behaviorEventPattern);
                if (result == null) result = casePattern(behaviorEventPattern);
                if (result == null) result = caseNullary(behaviorEventPattern);
                if (result == null) result = caseAtom(behaviorEventPattern);
                if (result == null) result = caseElement(behaviorEventPattern);
                if (result == null) result = caseArity(behaviorEventPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.FLOW_POINT_EVENT_PATTERN: {
                FlowPointEventPattern flowPointEventPattern = (FlowPointEventPattern)theEObject;
                T result = caseFlowPointEventPattern(flowPointEventPattern);
                if (result == null) result = caseEventPattern(flowPointEventPattern);
                if (result == null) result = casePattern(flowPointEventPattern);
                if (result == null) result = caseNullary(flowPointEventPattern);
                if (result == null) result = caseAtom(flowPointEventPattern);
                if (result == null) result = caseElement(flowPointEventPattern);
                if (result == null) result = caseArity(flowPointEventPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityEventPattern(ActivityEventPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorEvent(BehaviorEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Behavior Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Behavior Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractBehaviorEvent(AbstractBehaviorEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionEvent(ActionEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionEvent(InteractionEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointEvent(FlowPointEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityEvent(ActivityEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorEventPattern(BehaviorEventPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointEventPattern(FlowPointEventPattern object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Nullary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nullary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNullary(Nullary object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventPattern(EventPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEvent(Event object) {
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

} //EventSwitch
