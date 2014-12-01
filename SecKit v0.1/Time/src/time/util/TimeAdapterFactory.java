/**
 */
package time.util;

import models.Element;
import models.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import time.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see time.TimePackage
 * @generated
 */
public class TimeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TimePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TimePackage.eINSTANCE;
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
    protected TimeSwitch<Adapter> modelSwitch =
        new TimeSwitch<Adapter>() {
            @Override
            public Adapter caseTimestamp(Timestamp object) {
                return createTimestampAdapter();
            }
            @Override
            public Adapter caseTimestampPrecision(TimestampPrecision object) {
                return createTimestampPrecisionAdapter();
            }
            @Override
            public Adapter caseTimeInterval(TimeInterval object) {
                return createTimeIntervalAdapter();
            }
            @Override
            public Adapter caseTimeDuration(TimeDuration object) {
                return createTimeDurationAdapter();
            }
            @Override
            public Adapter caseClock(Clock object) {
                return createClockAdapter();
            }
            @Override
            public Adapter caseDiscreteClock(DiscreteClock object) {
                return createDiscreteClockAdapter();
            }
            @Override
            public Adapter caseSystemClock(SystemClock object) {
                return createSystemClockAdapter();
            }
            @Override
            public Adapter caseTimestampPattern(TimestampPattern object) {
                return createTimestampPatternAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
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
     * Creates a new adapter for an object of class '{@link time.Timestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.Timestamp
     * @generated
     */
    public Adapter createTimestampAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.TimestampPrecision <em>Timestamp Precision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.TimestampPrecision
     * @generated
     */
    public Adapter createTimestampPrecisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.TimeInterval <em>Interval</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.TimeInterval
     * @generated
     */
    public Adapter createTimeIntervalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.TimeDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.TimeDuration
     * @generated
     */
    public Adapter createTimeDurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.Clock <em>Clock</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.Clock
     * @generated
     */
    public Adapter createClockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.DiscreteClock <em>Discrete Clock</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.DiscreteClock
     * @generated
     */
    public Adapter createDiscreteClockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.SystemClock <em>System Clock</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.SystemClock
     * @generated
     */
    public Adapter createSystemClockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link time.TimestampPattern <em>Timestamp Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see time.TimestampPattern
     * @generated
     */
    public Adapter createTimestampPatternAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Pattern
     * @generated
     */
    public Adapter createPatternAdapter() {
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

} //TimeAdapterFactory
