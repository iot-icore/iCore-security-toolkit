/**
 */
package rule.event.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.event.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.event.EventPackage
 * @generated
 */
public class EventAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EventPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EventPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventSwitch<Adapter> modelSwitch =
        new EventSwitch<Adapter>() {
            @Override
            public Adapter caseTimeWindow(TimeWindow object) {
                return createTimeWindowAdapter();
            }
            @Override
            public Adapter caseEventTrace(EventTrace object) {
                return createEventTraceAdapter();
            }
            @Override
            public Adapter caseEvent(Event object) {
                return createEventAdapter();
            }
            @Override
            public Adapter caseEventProvider(EventProvider object) {
                return createEventProviderAdapter();
            }
            @Override
            public Adapter caseEventConsumer(EventConsumer object) {
                return createEventConsumerAdapter();
            }
            @Override
            public Adapter caseEventSubscription(EventSubscription object) {
                return createEventSubscriptionAdapter();
            }
            @Override
            public Adapter caseEventProviderRegistration(EventProviderRegistration object) {
                return createEventProviderRegistrationAdapter();
            }
            @Override
            public Adapter caseEventSet(EventSet object) {
                return createEventSetAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link rule.event.TimeWindow <em>Time Window</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.TimeWindow
     * @generated
     */
    public Adapter createTimeWindowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventTrace <em>Trace</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventTrace
     * @generated
     */
    public Adapter createEventTraceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventProvider
     * @generated
     */
    public Adapter createEventProviderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventConsumer <em>Consumer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventConsumer
     * @generated
     */
    public Adapter createEventConsumerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventSubscription <em>Subscription</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventSubscription
     * @generated
     */
    public Adapter createEventSubscriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventProviderRegistration <em>Provider Registration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventProviderRegistration
     * @generated
     */
    public Adapter createEventProviderRegistrationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.event.EventSet <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.EventSet
     * @generated
     */
    public Adapter createEventSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //EventAdapterFactory
