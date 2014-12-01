/**
 */
package rule.event.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.event.*;

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
 * @see rule.event.EventPackage
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
            case EventPackage.TIME_WINDOW: {
                TimeWindow timeWindow = (TimeWindow)theEObject;
                T result = caseTimeWindow(timeWindow);
                if (result == null) result = caseElement(timeWindow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_TRACE: {
                EventTrace eventTrace = (EventTrace)theEObject;
                T result = caseEventTrace(eventTrace);
                if (result == null) result = caseElement(eventTrace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT: {
                Event event = (Event)theEObject;
                T result = caseEvent(event);
                if (result == null) result = caseElement(event);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_PROVIDER: {
                EventProvider eventProvider = (EventProvider)theEObject;
                T result = caseEventProvider(eventProvider);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_CONSUMER: {
                EventConsumer eventConsumer = (EventConsumer)theEObject;
                T result = caseEventConsumer(eventConsumer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_SUBSCRIPTION: {
                EventSubscription eventSubscription = (EventSubscription)theEObject;
                T result = caseEventSubscription(eventSubscription);
                if (result == null) result = caseElement(eventSubscription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_PROVIDER_REGISTRATION: {
                EventProviderRegistration eventProviderRegistration = (EventProviderRegistration)theEObject;
                T result = caseEventProviderRegistration(eventProviderRegistration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EventPackage.EVENT_SET: {
                EventSet eventSet = (EventSet)theEObject;
                T result = caseEventSet(eventSet);
                if (result == null) result = caseElement(eventSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Window</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Window</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeWindow(TimeWindow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventTrace(EventTrace object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventProvider(EventProvider object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventConsumer(EventConsumer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventSubscription(EventSubscription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provider Registration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provider Registration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventProviderRegistration(EventProviderRegistration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventSet(EventSet object) {
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

} //EventSwitch
