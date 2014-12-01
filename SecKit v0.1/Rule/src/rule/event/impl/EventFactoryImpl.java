/**
 */
package rule.event.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.event.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventFactoryImpl extends EFactoryImpl implements EventFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventFactory init() {
        try {
            EventFactory theEventFactory = (EventFactory)EPackage.Registry.INSTANCE.getEFactory(EventPackage.eNS_URI);
            if (theEventFactory != null) {
                return theEventFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EventFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EventPackage.TIME_WINDOW: return createTimeWindow();
            case EventPackage.EVENT_TRACE: return createEventTrace();
            case EventPackage.EVENT: return createEvent();
            case EventPackage.EVENT_SUBSCRIPTION: return createEventSubscription();
            case EventPackage.EVENT_PROVIDER_REGISTRATION: return createEventProviderRegistration();
            case EventPackage.EVENT_SET: return createEventSet();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case EventPackage.EVENT_MODALITY:
                return createEventModalityFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case EventPackage.EVENT_MODALITY:
                return convertEventModalityToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeWindow createTimeWindow() {
        TimeWindowImpl timeWindow = new TimeWindowImpl();
        return timeWindow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventTrace createEventTrace() {
        EventTraceImpl eventTrace = new EventTraceImpl();
        return eventTrace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event createEvent() {
        EventImpl event = new EventImpl();
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventSubscription createEventSubscription() {
        EventSubscriptionImpl eventSubscription = new EventSubscriptionImpl();
        return eventSubscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProviderRegistration createEventProviderRegistration() {
        EventProviderRegistrationImpl eventProviderRegistration = new EventProviderRegistrationImpl();
        return eventProviderRegistration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventSet createEventSet() {
        EventSetImpl eventSet = new EventSetImpl();
        return eventSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventModality createEventModalityFromString(EDataType eDataType, String initialValue) {
        EventModality result = EventModality.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventModalityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPackage getEventPackage() {
        return (EventPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EventPackage getPackage() {
        return EventPackage.eINSTANCE;
    }

} //EventFactoryImpl
