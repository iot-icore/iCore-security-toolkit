/**
 */
package time;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "time";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://time/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "time";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TimePackage eINSTANCE = time.impl.TimePackageImpl.init();

    /**
     * The meta object id for the '{@link time.impl.TimestampImpl <em>Timestamp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.TimestampImpl
     * @see time.impl.TimePackageImpl#getTimestamp()
     * @generated
     */
    int TIMESTAMP = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP__PRECISION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP__DATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Timestamp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Timestamp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.TimestampPrecisionImpl <em>Timestamp Precision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.TimestampPrecisionImpl
     * @see time.impl.TimePackageImpl#getTimestampPrecision()
     * @generated
     */
    int TIMESTAMP_PRECISION = 1;

    /**
     * The feature id for the '<em><b>Plus Minus Delta</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PRECISION__PLUS_MINUS_DELTA = 0;

    /**
     * The feature id for the '<em><b>Least Significant Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT = 1;

    /**
     * The number of structural features of the '<em>Timestamp Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PRECISION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Timestamp Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PRECISION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link time.impl.TimeIntervalImpl <em>Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.TimeIntervalImpl
     * @see time.impl.TimePackageImpl#getTimeInterval()
     * @generated
     */
    int TIME_INTERVAL = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Begin</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL__BEGIN = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL__END = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL__DURATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Interval</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Interval</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_INTERVAL_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.TimeDurationImpl <em>Duration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.TimeDurationImpl
     * @see time.impl.TimePackageImpl#getTimeDuration()
     * @generated
     */
    int TIME_DURATION = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_DURATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_DURATION__AMOUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_DURATION__UNIT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Duration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_DURATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Duration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_DURATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.ClockImpl <em>Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.ClockImpl
     * @see time.impl.TimePackageImpl#getClock()
     * @generated
     */
    int CLOCK = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOCK__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOCK__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOCK__RESOLUTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOCK_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOCK_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.DiscreteClockImpl <em>Discrete Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.DiscreteClockImpl
     * @see time.impl.TimePackageImpl#getDiscreteClock()
     * @generated
     */
    int DISCRETE_CLOCK = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK__ID = CLOCK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK__NAME = CLOCK__NAME;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK__RESOLUTION = CLOCK__RESOLUTION;

    /**
     * The feature id for the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK__START = CLOCK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK__TIME_STEP = CLOCK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Discrete Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Discrete Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCRETE_CLOCK_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.SystemClockImpl <em>System Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.SystemClockImpl
     * @see time.impl.TimePackageImpl#getSystemClock()
     * @generated
     */
    int SYSTEM_CLOCK = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_CLOCK__ID = CLOCK__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_CLOCK__NAME = CLOCK__NAME;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_CLOCK__RESOLUTION = CLOCK__RESOLUTION;

    /**
     * The number of structural features of the '<em>System Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>System Clock</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_CLOCK_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.impl.TimestampPatternImpl <em>Timestamp Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.impl.TimestampPatternImpl
     * @see time.impl.TimePackageImpl#getTimestampPattern()
     * @generated
     */
    int TIMESTAMP_PATTERN = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Validity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__VALIDITY = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time Of Day Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__TIME_OF_DAY_MASK = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Day Of Week Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Day Of Month Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Month Of Year Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Timestamp Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Timestamp Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link time.TimeUnit <em>Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.TimeUnit
     * @see time.impl.TimePackageImpl#getTimeUnit()
     * @generated
     */
    int TIME_UNIT = 8;

    /**
     * The meta object id for the '{@link time.DayOfWeek <em>Day Of Week</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.DayOfWeek
     * @see time.impl.TimePackageImpl#getDayOfWeek()
     * @generated
     */
    int DAY_OF_WEEK = 9;

    /**
     * The meta object id for the '{@link time.MonthOfYear <em>Month Of Year</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see time.MonthOfYear
     * @see time.impl.TimePackageImpl#getMonthOfYear()
     * @generated
     */
    int MONTH_OF_YEAR = 10;


    /**
     * Returns the meta object for class '{@link time.Timestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timestamp</em>'.
     * @see time.Timestamp
     * @generated
     */
    EClass getTimestamp();

    /**
     * Returns the meta object for the containment reference '{@link time.Timestamp#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Precision</em>'.
     * @see time.Timestamp#getPrecision()
     * @see #getTimestamp()
     * @generated
     */
    EReference getTimestamp_Precision();

    /**
     * Returns the meta object for the attribute '{@link time.Timestamp#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see time.Timestamp#getDate()
     * @see #getTimestamp()
     * @generated
     */
    EAttribute getTimestamp_Date();

    /**
     * Returns the meta object for class '{@link time.TimestampPrecision <em>Timestamp Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timestamp Precision</em>'.
     * @see time.TimestampPrecision
     * @generated
     */
    EClass getTimestampPrecision();

    /**
     * Returns the meta object for the containment reference '{@link time.TimestampPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plus Minus Delta</em>'.
     * @see time.TimestampPrecision#getPlusMinusDelta()
     * @see #getTimestampPrecision()
     * @generated
     */
    EReference getTimestampPrecision_PlusMinusDelta();

    /**
     * Returns the meta object for the attribute '{@link time.TimestampPrecision#getLeastSignificantUnit <em>Least Significant Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Least Significant Unit</em>'.
     * @see time.TimestampPrecision#getLeastSignificantUnit()
     * @see #getTimestampPrecision()
     * @generated
     */
    EAttribute getTimestampPrecision_LeastSignificantUnit();

    /**
     * Returns the meta object for class '{@link time.TimeInterval <em>Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interval</em>'.
     * @see time.TimeInterval
     * @generated
     */
    EClass getTimeInterval();

    /**
     * Returns the meta object for the containment reference '{@link time.TimeInterval#getBegin <em>Begin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Begin</em>'.
     * @see time.TimeInterval#getBegin()
     * @see #getTimeInterval()
     * @generated
     */
    EReference getTimeInterval_Begin();

    /**
     * Returns the meta object for the containment reference '{@link time.TimeInterval#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End</em>'.
     * @see time.TimeInterval#getEnd()
     * @see #getTimeInterval()
     * @generated
     */
    EReference getTimeInterval_End();

    /**
     * Returns the meta object for the containment reference '{@link time.TimeInterval#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duration</em>'.
     * @see time.TimeInterval#getDuration()
     * @see #getTimeInterval()
     * @generated
     */
    EReference getTimeInterval_Duration();

    /**
     * Returns the meta object for class '{@link time.TimeDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Duration</em>'.
     * @see time.TimeDuration
     * @generated
     */
    EClass getTimeDuration();

    /**
     * Returns the meta object for the attribute '{@link time.TimeDuration#getAmount <em>Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Amount</em>'.
     * @see time.TimeDuration#getAmount()
     * @see #getTimeDuration()
     * @generated
     */
    EAttribute getTimeDuration_Amount();

    /**
     * Returns the meta object for the attribute '{@link time.TimeDuration#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see time.TimeDuration#getUnit()
     * @see #getTimeDuration()
     * @generated
     */
    EAttribute getTimeDuration_Unit();

    /**
     * Returns the meta object for class '{@link time.Clock <em>Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Clock</em>'.
     * @see time.Clock
     * @generated
     */
    EClass getClock();

    /**
     * Returns the meta object for the attribute '{@link time.Clock#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see time.Clock#getName()
     * @see #getClock()
     * @generated
     */
    EAttribute getClock_Name();

    /**
     * Returns the meta object for the containment reference '{@link time.Clock#getResolution <em>Resolution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resolution</em>'.
     * @see time.Clock#getResolution()
     * @see #getClock()
     * @generated
     */
    EReference getClock_Resolution();

    /**
     * Returns the meta object for class '{@link time.DiscreteClock <em>Discrete Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discrete Clock</em>'.
     * @see time.DiscreteClock
     * @generated
     */
    EClass getDiscreteClock();

    /**
     * Returns the meta object for the containment reference '{@link time.DiscreteClock#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start</em>'.
     * @see time.DiscreteClock#getStart()
     * @see #getDiscreteClock()
     * @generated
     */
    EReference getDiscreteClock_Start();

    /**
     * Returns the meta object for the attribute '{@link time.DiscreteClock#getTimeStep <em>Time Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Step</em>'.
     * @see time.DiscreteClock#getTimeStep()
     * @see #getDiscreteClock()
     * @generated
     */
    EAttribute getDiscreteClock_TimeStep();

    /**
     * Returns the meta object for class '{@link time.SystemClock <em>System Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Clock</em>'.
     * @see time.SystemClock
     * @generated
     */
    EClass getSystemClock();

    /**
     * Returns the meta object for class '{@link time.TimestampPattern <em>Timestamp Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timestamp Pattern</em>'.
     * @see time.TimestampPattern
     * @generated
     */
    EClass getTimestampPattern();

    /**
     * Returns the meta object for the containment reference '{@link time.TimestampPattern#getValidity <em>Validity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validity</em>'.
     * @see time.TimestampPattern#getValidity()
     * @see #getTimestampPattern()
     * @generated
     */
    EReference getTimestampPattern_Validity();

    /**
     * Returns the meta object for the attribute '{@link time.TimestampPattern#getTimeOfDayMask <em>Time Of Day Mask</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Of Day Mask</em>'.
     * @see time.TimestampPattern#getTimeOfDayMask()
     * @see #getTimestampPattern()
     * @generated
     */
    EAttribute getTimestampPattern_TimeOfDayMask();

    /**
     * Returns the meta object for the attribute '{@link time.TimestampPattern#getDayOfWeekMask <em>Day Of Week Mask</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Day Of Week Mask</em>'.
     * @see time.TimestampPattern#getDayOfWeekMask()
     * @see #getTimestampPattern()
     * @generated
     */
    EAttribute getTimestampPattern_DayOfWeekMask();

    /**
     * Returns the meta object for the attribute '{@link time.TimestampPattern#getDayOfMonthMask <em>Day Of Month Mask</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Day Of Month Mask</em>'.
     * @see time.TimestampPattern#getDayOfMonthMask()
     * @see #getTimestampPattern()
     * @generated
     */
    EAttribute getTimestampPattern_DayOfMonthMask();

    /**
     * Returns the meta object for the attribute '{@link time.TimestampPattern#getMonthOfYearMask <em>Month Of Year Mask</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month Of Year Mask</em>'.
     * @see time.TimestampPattern#getMonthOfYearMask()
     * @see #getTimestampPattern()
     * @generated
     */
    EAttribute getTimestampPattern_MonthOfYearMask();

    /**
     * Returns the meta object for enum '{@link time.TimeUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Unit</em>'.
     * @see time.TimeUnit
     * @generated
     */
    EEnum getTimeUnit();

    /**
     * Returns the meta object for enum '{@link time.DayOfWeek <em>Day Of Week</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Day Of Week</em>'.
     * @see time.DayOfWeek
     * @generated
     */
    EEnum getDayOfWeek();

    /**
     * Returns the meta object for enum '{@link time.MonthOfYear <em>Month Of Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Month Of Year</em>'.
     * @see time.MonthOfYear
     * @generated
     */
    EEnum getMonthOfYear();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TimeFactory getTimeFactory();

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
         * The meta object literal for the '{@link time.impl.TimestampImpl <em>Timestamp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.TimestampImpl
         * @see time.impl.TimePackageImpl#getTimestamp()
         * @generated
         */
        EClass TIMESTAMP = eINSTANCE.getTimestamp();

        /**
         * The meta object literal for the '<em><b>Precision</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIMESTAMP__PRECISION = eINSTANCE.getTimestamp_Precision();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP__DATE = eINSTANCE.getTimestamp_Date();

        /**
         * The meta object literal for the '{@link time.impl.TimestampPrecisionImpl <em>Timestamp Precision</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.TimestampPrecisionImpl
         * @see time.impl.TimePackageImpl#getTimestampPrecision()
         * @generated
         */
        EClass TIMESTAMP_PRECISION = eINSTANCE.getTimestampPrecision();

        /**
         * The meta object literal for the '<em><b>Plus Minus Delta</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIMESTAMP_PRECISION__PLUS_MINUS_DELTA = eINSTANCE.getTimestampPrecision_PlusMinusDelta();

        /**
         * The meta object literal for the '<em><b>Least Significant Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT = eINSTANCE.getTimestampPrecision_LeastSignificantUnit();

        /**
         * The meta object literal for the '{@link time.impl.TimeIntervalImpl <em>Interval</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.TimeIntervalImpl
         * @see time.impl.TimePackageImpl#getTimeInterval()
         * @generated
         */
        EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

        /**
         * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_INTERVAL__BEGIN = eINSTANCE.getTimeInterval_Begin();

        /**
         * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_INTERVAL__END = eINSTANCE.getTimeInterval_End();

        /**
         * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_INTERVAL__DURATION = eINSTANCE.getTimeInterval_Duration();

        /**
         * The meta object literal for the '{@link time.impl.TimeDurationImpl <em>Duration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.TimeDurationImpl
         * @see time.impl.TimePackageImpl#getTimeDuration()
         * @generated
         */
        EClass TIME_DURATION = eINSTANCE.getTimeDuration();

        /**
         * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_DURATION__AMOUNT = eINSTANCE.getTimeDuration_Amount();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_DURATION__UNIT = eINSTANCE.getTimeDuration_Unit();

        /**
         * The meta object literal for the '{@link time.impl.ClockImpl <em>Clock</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.ClockImpl
         * @see time.impl.TimePackageImpl#getClock()
         * @generated
         */
        EClass CLOCK = eINSTANCE.getClock();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLOCK__NAME = eINSTANCE.getClock_Name();

        /**
         * The meta object literal for the '<em><b>Resolution</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLOCK__RESOLUTION = eINSTANCE.getClock_Resolution();

        /**
         * The meta object literal for the '{@link time.impl.DiscreteClockImpl <em>Discrete Clock</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.DiscreteClockImpl
         * @see time.impl.TimePackageImpl#getDiscreteClock()
         * @generated
         */
        EClass DISCRETE_CLOCK = eINSTANCE.getDiscreteClock();

        /**
         * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DISCRETE_CLOCK__START = eINSTANCE.getDiscreteClock_Start();

        /**
         * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISCRETE_CLOCK__TIME_STEP = eINSTANCE.getDiscreteClock_TimeStep();

        /**
         * The meta object literal for the '{@link time.impl.SystemClockImpl <em>System Clock</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.SystemClockImpl
         * @see time.impl.TimePackageImpl#getSystemClock()
         * @generated
         */
        EClass SYSTEM_CLOCK = eINSTANCE.getSystemClock();

        /**
         * The meta object literal for the '{@link time.impl.TimestampPatternImpl <em>Timestamp Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.impl.TimestampPatternImpl
         * @see time.impl.TimePackageImpl#getTimestampPattern()
         * @generated
         */
        EClass TIMESTAMP_PATTERN = eINSTANCE.getTimestampPattern();

        /**
         * The meta object literal for the '<em><b>Validity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIMESTAMP_PATTERN__VALIDITY = eINSTANCE.getTimestampPattern_Validity();

        /**
         * The meta object literal for the '<em><b>Time Of Day Mask</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP_PATTERN__TIME_OF_DAY_MASK = eINSTANCE.getTimestampPattern_TimeOfDayMask();

        /**
         * The meta object literal for the '<em><b>Day Of Week Mask</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK = eINSTANCE.getTimestampPattern_DayOfWeekMask();

        /**
         * The meta object literal for the '<em><b>Day Of Month Mask</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK = eINSTANCE.getTimestampPattern_DayOfMonthMask();

        /**
         * The meta object literal for the '<em><b>Month Of Year Mask</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK = eINSTANCE.getTimestampPattern_MonthOfYearMask();

        /**
         * The meta object literal for the '{@link time.TimeUnit <em>Unit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.TimeUnit
         * @see time.impl.TimePackageImpl#getTimeUnit()
         * @generated
         */
        EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

        /**
         * The meta object literal for the '{@link time.DayOfWeek <em>Day Of Week</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.DayOfWeek
         * @see time.impl.TimePackageImpl#getDayOfWeek()
         * @generated
         */
        EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

        /**
         * The meta object literal for the '{@link time.MonthOfYear <em>Month Of Year</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see time.MonthOfYear
         * @see time.impl.TimePackageImpl#getMonthOfYear()
         * @generated
         */
        EEnum MONTH_OF_YEAR = eINSTANCE.getMonthOfYear();

    }

} //TimePackage
