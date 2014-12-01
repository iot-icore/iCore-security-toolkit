/**
 */
package time.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import time.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeFactoryImpl extends EFactoryImpl implements TimeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeFactory init() {
        try {
            TimeFactory theTimeFactory = (TimeFactory)EPackage.Registry.INSTANCE.getEFactory(TimePackage.eNS_URI);
            if (theTimeFactory != null) {
                return theTimeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TimeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeFactoryImpl() {
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
            case TimePackage.TIMESTAMP: return createTimestamp();
            case TimePackage.TIMESTAMP_PRECISION: return createTimestampPrecision();
            case TimePackage.TIME_INTERVAL: return createTimeInterval();
            case TimePackage.TIME_DURATION: return createTimeDuration();
            case TimePackage.DISCRETE_CLOCK: return createDiscreteClock();
            case TimePackage.TIMESTAMP_PATTERN: return createTimestampPattern();
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
            case TimePackage.TIME_UNIT:
                return createTimeUnitFromString(eDataType, initialValue);
            case TimePackage.DAY_OF_WEEK:
                return createDayOfWeekFromString(eDataType, initialValue);
            case TimePackage.MONTH_OF_YEAR:
                return createMonthOfYearFromString(eDataType, initialValue);
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
            case TimePackage.TIME_UNIT:
                return convertTimeUnitToString(eDataType, instanceValue);
            case TimePackage.DAY_OF_WEEK:
                return convertDayOfWeekToString(eDataType, instanceValue);
            case TimePackage.MONTH_OF_YEAR:
                return convertMonthOfYearToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp createTimestamp() {
        TimestampImpl timestamp = new TimestampImpl();
        return timestamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampPrecision createTimestampPrecision() {
        TimestampPrecisionImpl timestampPrecision = new TimestampPrecisionImpl();
        return timestampPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeInterval createTimeInterval() {
        TimeIntervalImpl timeInterval = new TimeIntervalImpl();
        return timeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration createTimeDuration() {
        TimeDurationImpl timeDuration = new TimeDurationImpl();
        return timeDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscreteClock createDiscreteClock() {
        DiscreteClockImpl discreteClock = new DiscreteClockImpl();
        return discreteClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampPattern createTimestampPattern() {
        TimestampPatternImpl timestampPattern = new TimestampPatternImpl();
        return timestampPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
        TimeUnit result = TimeUnit.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
        DayOfWeek result = DayOfWeek.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonthOfYear createMonthOfYearFromString(EDataType eDataType, String initialValue) {
        MonthOfYear result = MonthOfYear.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMonthOfYearToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimePackage getTimePackage() {
        return (TimePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TimePackage getPackage() {
        return TimePackage.eINSTANCE;
    }

} //TimeFactoryImpl
