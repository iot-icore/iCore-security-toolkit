/**
 */
package rule.event;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rule.event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "event";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/event/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-event";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventPackage eINSTANCE = rule.event.impl.EventPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.event.impl.TimeWindowImpl <em>Time Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.TimeWindowImpl
     * @see rule.event.impl.EventPackageImpl#getTimeWindow()
     * @generated
     */
    int TIME_WINDOW = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Events</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__EVENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reference Clock</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__REFERENCE_CLOCK = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__INDEX = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Trace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW__TRACE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Time Window</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Time Window</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_WINDOW_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.event.impl.EventTraceImpl <em>Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.EventTraceImpl
     * @see rule.event.impl.EventPackageImpl#getEventTrace()
     * @generated
     */
    int EVENT_TRACE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Time Windows</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE__TIME_WINDOWS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time Step Size</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE__TIME_STEP_SIZE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Trace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Trace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_TRACE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.event.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.EventImpl
     * @see rule.event.impl.EventPackageImpl#getEvent()
     * @generated
     */
    int EVENT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__SUBSCRIBED_EVENT_PATTERNS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__TIMESTAMP = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__WINDOWS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__AUTHORIZATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__MODALITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.event.EventProvider <em>Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.EventProvider
     * @see rule.event.impl.EventPackageImpl#getEventProvider()
     * @generated
     */
    int EVENT_PROVIDER = 3;

    /**
     * The number of structural features of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROVIDER_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Subscribe To Event</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROVIDER___SUBSCRIBE_TO_EVENT__STRING_EVENTPATTERN = 0;

    /**
     * The number of operations of the '<em>Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROVIDER_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link rule.event.EventConsumer <em>Consumer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.EventConsumer
     * @see rule.event.impl.EventPackageImpl#getEventConsumer()
     * @generated
     */
    int EVENT_CONSUMER = 4;

    /**
     * The number of structural features of the '<em>Consumer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Notify Actual Event</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER___NOTIFY_ACTUAL_EVENT__STRING_EVENT = 0;

    /**
     * The operation id for the '<em>Notify Tentative Event</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER___NOTIFY_TENTATIVE_EVENT__STRING_EVENT = 1;

    /**
     * The number of operations of the '<em>Consumer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONSUMER_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link rule.event.impl.EventSubscriptionImpl <em>Subscription</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.EventSubscriptionImpl
     * @see rule.event.impl.EventPackageImpl#getEventSubscription()
     * @generated
     */
    int EVENT_SUBSCRIPTION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SUBSCRIPTION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SUBSCRIPTION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Event Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SUBSCRIPTION__EVENT_PATTERN = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SUBSCRIPTION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SUBSCRIPTION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.event.impl.EventProviderRegistrationImpl <em>Provider Registration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.EventProviderRegistrationImpl
     * @see rule.event.impl.EventPackageImpl#getEventProviderRegistration()
     * @generated
     */
    int EVENT_PROVIDER_REGISTRATION = 6;

    /**
     * The number of structural features of the '<em>Provider Registration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROVIDER_REGISTRATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Provider Registration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PROVIDER_REGISTRATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.event.impl.EventSetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.impl.EventSetImpl
     * @see rule.event.impl.EventPackageImpl#getEventSet()
     * @generated
     */
    int EVENT_SET = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SET__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SET__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Events</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SET__EVENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SET_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_SET_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.event.EventModality <em>Modality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.event.EventModality
     * @see rule.event.impl.EventPackageImpl#getEventModality()
     * @generated
     */
    int EVENT_MODALITY = 8;


    /**
     * Returns the meta object for class '{@link rule.event.TimeWindow <em>Time Window</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Window</em>'.
     * @see rule.event.TimeWindow
     * @generated
     */
    EClass getTimeWindow();

    /**
     * Returns the meta object for the reference list '{@link rule.event.TimeWindow#getEvents <em>Events</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Events</em>'.
     * @see rule.event.TimeWindow#getEvents()
     * @see #getTimeWindow()
     * @generated
     */
    EReference getTimeWindow_Events();

    /**
     * Returns the meta object for the reference '{@link rule.event.TimeWindow#getReferenceClock <em>Reference Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference Clock</em>'.
     * @see rule.event.TimeWindow#getReferenceClock()
     * @see #getTimeWindow()
     * @generated
     */
    EReference getTimeWindow_ReferenceClock();

    /**
     * Returns the meta object for the attribute '{@link rule.event.TimeWindow#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index</em>'.
     * @see rule.event.TimeWindow#getIndex()
     * @see #getTimeWindow()
     * @generated
     */
    EAttribute getTimeWindow_Index();

    /**
     * Returns the meta object for the container reference '{@link rule.event.TimeWindow#getTrace <em>Trace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Trace</em>'.
     * @see rule.event.TimeWindow#getTrace()
     * @see #getTimeWindow()
     * @generated
     */
    EReference getTimeWindow_Trace();

    /**
     * Returns the meta object for class '{@link rule.event.EventTrace <em>Trace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trace</em>'.
     * @see rule.event.EventTrace
     * @generated
     */
    EClass getEventTrace();

    /**
     * Returns the meta object for the containment reference list '{@link rule.event.EventTrace#getTimeWindows <em>Time Windows</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Time Windows</em>'.
     * @see rule.event.EventTrace#getTimeWindows()
     * @see #getEventTrace()
     * @generated
     */
    EReference getEventTrace_TimeWindows();

    /**
     * Returns the meta object for the reference '{@link rule.event.EventTrace#getTimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Time Step Size</em>'.
     * @see rule.event.EventTrace#getTimeStepSize()
     * @see #getEventTrace()
     * @generated
     */
    EReference getEventTrace_TimeStepSize();

    /**
     * Returns the meta object for class '{@link rule.event.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event</em>'.
     * @see rule.event.Event
     * @generated
     */
    EClass getEvent();

    /**
     * Returns the meta object for the reference list '{@link rule.event.Event#getSubscribedEventPatterns <em>Subscribed Event Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Subscribed Event Patterns</em>'.
     * @see rule.event.Event#getSubscribedEventPatterns()
     * @see #getEvent()
     * @generated
     */
    EReference getEvent_SubscribedEventPatterns();

    /**
     * Returns the meta object for the containment reference '{@link rule.event.Event#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timestamp</em>'.
     * @see rule.event.Event#getTimestamp()
     * @see #getEvent()
     * @generated
     */
    EReference getEvent_Timestamp();

    /**
     * Returns the meta object for the reference list '{@link rule.event.Event#getWindows <em>Windows</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Windows</em>'.
     * @see rule.event.Event#getWindows()
     * @see #getEvent()
     * @generated
     */
    EReference getEvent_Windows();

    /**
     * Returns the meta object for the reference '{@link rule.event.Event#getAuthorization <em>Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Authorization</em>'.
     * @see rule.event.Event#getAuthorization()
     * @see #getEvent()
     * @generated
     */
    EReference getEvent_Authorization();

    /**
     * Returns the meta object for the attribute '{@link rule.event.Event#getModality <em>Modality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modality</em>'.
     * @see rule.event.Event#getModality()
     * @see #getEvent()
     * @generated
     */
    EAttribute getEvent_Modality();

    /**
     * Returns the meta object for class '{@link rule.event.EventProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provider</em>'.
     * @see rule.event.EventProvider
     * @generated
     */
    EClass getEventProvider();

    /**
     * Returns the meta object for the '{@link rule.event.EventProvider#subscribeToEvent(java.lang.String, rule.condition.EventPattern) <em>Subscribe To Event</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Subscribe To Event</em>' operation.
     * @see rule.event.EventProvider#subscribeToEvent(java.lang.String, rule.condition.EventPattern)
     * @generated
     */
    EOperation getEventProvider__SubscribeToEvent__String_EventPattern();

    /**
     * Returns the meta object for class '{@link rule.event.EventConsumer <em>Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer</em>'.
     * @see rule.event.EventConsumer
     * @generated
     */
    EClass getEventConsumer();

    /**
     * Returns the meta object for the '{@link rule.event.EventConsumer#notifyActualEvent(java.lang.String, rule.event.Event) <em>Notify Actual Event</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Notify Actual Event</em>' operation.
     * @see rule.event.EventConsumer#notifyActualEvent(java.lang.String, rule.event.Event)
     * @generated
     */
    EOperation getEventConsumer__NotifyActualEvent__String_Event();

    /**
     * Returns the meta object for the '{@link rule.event.EventConsumer#notifyTentativeEvent(java.lang.String, rule.event.Event) <em>Notify Tentative Event</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Notify Tentative Event</em>' operation.
     * @see rule.event.EventConsumer#notifyTentativeEvent(java.lang.String, rule.event.Event)
     * @generated
     */
    EOperation getEventConsumer__NotifyTentativeEvent__String_Event();

    /**
     * Returns the meta object for class '{@link rule.event.EventSubscription <em>Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subscription</em>'.
     * @see rule.event.EventSubscription
     * @generated
     */
    EClass getEventSubscription();

    /**
     * Returns the meta object for the reference '{@link rule.event.EventSubscription#getEventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Event Pattern</em>'.
     * @see rule.event.EventSubscription#getEventPattern()
     * @see #getEventSubscription()
     * @generated
     */
    EReference getEventSubscription_EventPattern();

    /**
     * Returns the meta object for class '{@link rule.event.EventProviderRegistration <em>Provider Registration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provider Registration</em>'.
     * @see rule.event.EventProviderRegistration
     * @generated
     */
    EClass getEventProviderRegistration();

    /**
     * Returns the meta object for class '{@link rule.event.EventSet <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set</em>'.
     * @see rule.event.EventSet
     * @generated
     */
    EClass getEventSet();

    /**
     * Returns the meta object for the containment reference list '{@link rule.event.EventSet#getEvents <em>Events</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Events</em>'.
     * @see rule.event.EventSet#getEvents()
     * @see #getEventSet()
     * @generated
     */
    EReference getEventSet_Events();

    /**
     * Returns the meta object for enum '{@link rule.event.EventModality <em>Modality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Modality</em>'.
     * @see rule.event.EventModality
     * @generated
     */
    EEnum getEventModality();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EventFactory getEventFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link rule.event.impl.TimeWindowImpl <em>Time Window</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.TimeWindowImpl
         * @see rule.event.impl.EventPackageImpl#getTimeWindow()
         * @generated
         */
        EClass TIME_WINDOW = eINSTANCE.getTimeWindow();

        /**
         * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_WINDOW__EVENTS = eINSTANCE.getTimeWindow_Events();

        /**
         * The meta object literal for the '<em><b>Reference Clock</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_WINDOW__REFERENCE_CLOCK = eINSTANCE.getTimeWindow_ReferenceClock();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_WINDOW__INDEX = eINSTANCE.getTimeWindow_Index();

        /**
         * The meta object literal for the '<em><b>Trace</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_WINDOW__TRACE = eINSTANCE.getTimeWindow_Trace();

        /**
         * The meta object literal for the '{@link rule.event.impl.EventTraceImpl <em>Trace</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.EventTraceImpl
         * @see rule.event.impl.EventPackageImpl#getEventTrace()
         * @generated
         */
        EClass EVENT_TRACE = eINSTANCE.getEventTrace();

        /**
         * The meta object literal for the '<em><b>Time Windows</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_TRACE__TIME_WINDOWS = eINSTANCE.getEventTrace_TimeWindows();

        /**
         * The meta object literal for the '<em><b>Time Step Size</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_TRACE__TIME_STEP_SIZE = eINSTANCE.getEventTrace_TimeStepSize();

        /**
         * The meta object literal for the '{@link rule.event.impl.EventImpl <em>Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.EventImpl
         * @see rule.event.impl.EventPackageImpl#getEvent()
         * @generated
         */
        EClass EVENT = eINSTANCE.getEvent();

        /**
         * The meta object literal for the '<em><b>Subscribed Event Patterns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT__SUBSCRIBED_EVENT_PATTERNS = eINSTANCE.getEvent_SubscribedEventPatterns();

        /**
         * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

        /**
         * The meta object literal for the '<em><b>Windows</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT__WINDOWS = eINSTANCE.getEvent_Windows();

        /**
         * The meta object literal for the '<em><b>Authorization</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT__AUTHORIZATION = eINSTANCE.getEvent_Authorization();

        /**
         * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT__MODALITY = eINSTANCE.getEvent_Modality();

        /**
         * The meta object literal for the '{@link rule.event.EventProvider <em>Provider</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.EventProvider
         * @see rule.event.impl.EventPackageImpl#getEventProvider()
         * @generated
         */
        EClass EVENT_PROVIDER = eINSTANCE.getEventProvider();

        /**
         * The meta object literal for the '<em><b>Subscribe To Event</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EVENT_PROVIDER___SUBSCRIBE_TO_EVENT__STRING_EVENTPATTERN = eINSTANCE.getEventProvider__SubscribeToEvent__String_EventPattern();

        /**
         * The meta object literal for the '{@link rule.event.EventConsumer <em>Consumer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.EventConsumer
         * @see rule.event.impl.EventPackageImpl#getEventConsumer()
         * @generated
         */
        EClass EVENT_CONSUMER = eINSTANCE.getEventConsumer();

        /**
         * The meta object literal for the '<em><b>Notify Actual Event</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EVENT_CONSUMER___NOTIFY_ACTUAL_EVENT__STRING_EVENT = eINSTANCE.getEventConsumer__NotifyActualEvent__String_Event();

        /**
         * The meta object literal for the '<em><b>Notify Tentative Event</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EVENT_CONSUMER___NOTIFY_TENTATIVE_EVENT__STRING_EVENT = eINSTANCE.getEventConsumer__NotifyTentativeEvent__String_Event();

        /**
         * The meta object literal for the '{@link rule.event.impl.EventSubscriptionImpl <em>Subscription</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.EventSubscriptionImpl
         * @see rule.event.impl.EventPackageImpl#getEventSubscription()
         * @generated
         */
        EClass EVENT_SUBSCRIPTION = eINSTANCE.getEventSubscription();

        /**
         * The meta object literal for the '<em><b>Event Pattern</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_SUBSCRIPTION__EVENT_PATTERN = eINSTANCE.getEventSubscription_EventPattern();

        /**
         * The meta object literal for the '{@link rule.event.impl.EventProviderRegistrationImpl <em>Provider Registration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.EventProviderRegistrationImpl
         * @see rule.event.impl.EventPackageImpl#getEventProviderRegistration()
         * @generated
         */
        EClass EVENT_PROVIDER_REGISTRATION = eINSTANCE.getEventProviderRegistration();

        /**
         * The meta object literal for the '{@link rule.event.impl.EventSetImpl <em>Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.impl.EventSetImpl
         * @see rule.event.impl.EventPackageImpl#getEventSet()
         * @generated
         */
        EClass EVENT_SET = eINSTANCE.getEventSet();

        /**
         * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_SET__EVENTS = eINSTANCE.getEventSet_Events();

        /**
         * The meta object literal for the '{@link rule.event.EventModality <em>Modality</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.event.EventModality
         * @see rule.event.impl.EventPackageImpl#getEventModality()
         * @generated
         */
        EEnum EVENT_MODALITY = eINSTANCE.getEventModality();

    }

} //EventPackage
