/**
 */
package rule.state.impl;

import java.util.BitSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.state.*;

import utils.CircularBuffer;
import utils.StateHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateFactoryImpl extends EFactoryImpl implements StateFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StateFactory init() {
        try {
            StateFactory theStateFactory = (StateFactory)EPackage.Registry.INSTANCE.getEFactory(StatePackage.eNS_URI);
            if (theStateFactory != null) {
                return theStateFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StateFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateFactoryImpl() {
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
            case StatePackage.STATE: return createState();
            case StatePackage.EVENT_PATTERN_STATE: return createEventPatternState();
            case StatePackage.REP_STATE: return createRepState();
            case StatePackage.TIME_BOUNDED_STATE: return createTimeBoundedState();
            case StatePackage.COUNTER_STATE: return createCounterState();
            case StatePackage.REP_SINCE_STATE: return createRepSinceState();
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
            case StatePackage.CIRCULAR_BUFFER:
                return createCircularBufferFromString(eDataType, initialValue);
            case StatePackage.BIT_SET:
                return createBitSetFromString(eDataType, initialValue);
            case StatePackage.STATE_HANDLER:
                return createStateHandlerFromString(eDataType, initialValue);
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
            case StatePackage.CIRCULAR_BUFFER:
                return convertCircularBufferToString(eDataType, instanceValue);
            case StatePackage.BIT_SET:
                return convertBitSetToString(eDataType, instanceValue);
            case StatePackage.STATE_HANDLER:
                return convertStateHandlerToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State createState() {
        StateImpl state = new StateImpl();
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPatternState createEventPatternState() {
        EventPatternStateImpl eventPatternState = new EventPatternStateImpl();
        return eventPatternState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepState createRepState() {
        RepStateImpl repState = new RepStateImpl();
        return repState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeBoundedState createTimeBoundedState() {
        TimeBoundedStateImpl timeBoundedState = new TimeBoundedStateImpl();
        return timeBoundedState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CounterState createCounterState() {
        CounterStateImpl counterState = new CounterStateImpl();
        return counterState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepSinceState createRepSinceState() {
        RepSinceStateImpl repSinceState = new RepSinceStateImpl();
        return repSinceState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CircularBuffer createCircularBufferFromString(EDataType eDataType, String initialValue) {
        return (CircularBuffer)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCircularBufferToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BitSet createBitSetFromString(EDataType eDataType, String initialValue) {
        return (BitSet)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBitSetToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateHandler createStateHandlerFromString(EDataType eDataType, String initialValue) {
        return (StateHandler)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStateHandlerToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StatePackage getStatePackage() {
        return (StatePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StatePackage getPackage() {
        return StatePackage.eINSTANCE;
    }

} //StateFactoryImpl
