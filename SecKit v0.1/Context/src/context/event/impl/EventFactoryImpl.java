/**
 */
package context.event.impl;

import context.event.*;

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
            case EventPackage.CONTEXT_SITUATION_EVENT: return createContextSituationEvent();
            case EventPackage.CONTEXT_INFORMATION_EVENT: return createContextInformationEvent();
            case EventPackage.CONTEXT_SITUATION_EVENT_PATTERN: return createContextSituationEventPattern();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN: return createContextInformationEventPattern();
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
            case EventPackage.CONTEXT_SITUATION_LIFECYCLE:
                return createContextSituationLifecycleFromString(eDataType, initialValue);
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
            case EventPackage.CONTEXT_SITUATION_LIFECYCLE:
                return convertContextSituationLifecycleToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationEvent createContextSituationEvent() {
        ContextSituationEventImpl contextSituationEvent = new ContextSituationEventImpl();
        return contextSituationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationEvent createContextInformationEvent() {
        ContextInformationEventImpl contextInformationEvent = new ContextInformationEventImpl();
        return contextInformationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationEventPattern createContextSituationEventPattern() {
        ContextSituationEventPatternImpl contextSituationEventPattern = new ContextSituationEventPatternImpl();
        return contextSituationEventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationEventPattern createContextInformationEventPattern() {
        ContextInformationEventPatternImpl contextInformationEventPattern = new ContextInformationEventPatternImpl();
        return contextInformationEventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationLifecycle createContextSituationLifecycleFromString(EDataType eDataType, String initialValue) {
        ContextSituationLifecycle result = ContextSituationLifecycle.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertContextSituationLifecycleToString(EDataType eDataType, Object instanceValue) {
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
