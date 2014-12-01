/**
 */
package behavior.event.impl;

import behavior.event.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
            case EventPackage.ACTIVITY_EVENT_PATTERN: return createActivityEventPattern();
            case EventPackage.BEHAVIOR_EVENT: return createBehaviorEvent();
            case EventPackage.ACTION_EVENT: return createActionEvent();
            case EventPackage.INTERACTION_EVENT: return createInteractionEvent();
            case EventPackage.FLOW_POINT_EVENT: return createFlowPointEvent();
            case EventPackage.BEHAVIOR_EVENT_PATTERN: return createBehaviorEventPattern();
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
            case EventPackage.BEHAVIOR_LIFECYCLE:
                return createBehaviorLifecycleFromString(eDataType, initialValue);
            case EventPackage.ACTIVITY_LIFECYCLE:
                return createActivityLifecycleFromString(eDataType, initialValue);
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
            case EventPackage.BEHAVIOR_LIFECYCLE:
                return convertBehaviorLifecycleToString(eDataType, instanceValue);
            case EventPackage.ACTIVITY_LIFECYCLE:
                return convertActivityLifecycleToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityEventPattern createActivityEventPattern() {
        ActivityEventPatternImpl activityEventPattern = new ActivityEventPatternImpl();
        return activityEventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorEvent createBehaviorEvent() {
        BehaviorEventImpl behaviorEvent = new BehaviorEventImpl();
        return behaviorEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionEvent createActionEvent() {
        ActionEventImpl actionEvent = new ActionEventImpl();
        return actionEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionEvent createInteractionEvent() {
        InteractionEventImpl interactionEvent = new InteractionEventImpl();
        return interactionEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointEvent createFlowPointEvent() {
        FlowPointEventImpl flowPointEvent = new FlowPointEventImpl();
        return flowPointEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorEventPattern createBehaviorEventPattern() {
        BehaviorEventPatternImpl behaviorEventPattern = new BehaviorEventPatternImpl();
        return behaviorEventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorLifecycle createBehaviorLifecycleFromString(EDataType eDataType, String initialValue) {
        BehaviorLifecycle result = BehaviorLifecycle.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBehaviorLifecycleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityLifecycle createActivityLifecycleFromString(EDataType eDataType, String initialValue) {
        ActivityLifecycle result = ActivityLifecycle.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertActivityLifecycleToString(EDataType eDataType, Object instanceValue) {
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
