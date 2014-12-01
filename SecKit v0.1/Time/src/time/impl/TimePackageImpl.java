/**
 */
package time.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import time.Clock;
import time.DayOfWeek;
import time.DiscreteClock;
import time.MonthOfYear;
import time.SystemClock;
import time.TimeDuration;
import time.TimeFactory;
import time.TimeInterval;
import time.TimePackage;
import time.TimeUnit;
import time.Timestamp;
import time.TimestampPattern;
import time.TimestampPrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimePackageImpl extends EPackageImpl implements TimePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timestampEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timestampPrecisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeIntervalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeDurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass discreteClockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemClockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timestampPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum timeUnitEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dayOfWeekEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum monthOfYearEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see time.TimePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TimePackageImpl() {
        super(eNS_URI, TimeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TimePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TimePackage init() {
        if (isInited) return (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

        // Obtain or create and register package
        TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ModelsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theTimePackage.createPackageContents();

        // Initialize created meta-data
        theTimePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTimePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TimePackage.eNS_URI, theTimePackage);
        return theTimePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimestamp() {
        return timestampEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimestamp_Precision() {
        return (EReference)timestampEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestamp_Date() {
        return (EAttribute)timestampEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimestampPrecision() {
        return timestampPrecisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimestampPrecision_PlusMinusDelta() {
        return (EReference)timestampPrecisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampPrecision_LeastSignificantUnit() {
        return (EAttribute)timestampPrecisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeInterval() {
        return timeIntervalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeInterval_Begin() {
        return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeInterval_End() {
        return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeInterval_Duration() {
        return (EReference)timeIntervalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeDuration() {
        return timeDurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeDuration_Amount() {
        return (EAttribute)timeDurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeDuration_Unit() {
        return (EAttribute)timeDurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClock() {
        return clockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClock_Name() {
        return (EAttribute)clockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClock_Resolution() {
        return (EReference)clockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiscreteClock() {
        return discreteClockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiscreteClock_Start() {
        return (EReference)discreteClockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiscreteClock_TimeStep() {
        return (EAttribute)discreteClockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemClock() {
        return systemClockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimestampPattern() {
        return timestampPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimestampPattern_Validity() {
        return (EReference)timestampPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampPattern_TimeOfDayMask() {
        return (EAttribute)timestampPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampPattern_DayOfWeekMask() {
        return (EAttribute)timestampPatternEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampPattern_DayOfMonthMask() {
        return (EAttribute)timestampPatternEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampPattern_MonthOfYearMask() {
        return (EAttribute)timestampPatternEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTimeUnit() {
        return timeUnitEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDayOfWeek() {
        return dayOfWeekEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMonthOfYear() {
        return monthOfYearEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeFactory getTimeFactory() {
        return (TimeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        timestampEClass = createEClass(TIMESTAMP);
        createEReference(timestampEClass, TIMESTAMP__PRECISION);
        createEAttribute(timestampEClass, TIMESTAMP__DATE);

        timestampPrecisionEClass = createEClass(TIMESTAMP_PRECISION);
        createEReference(timestampPrecisionEClass, TIMESTAMP_PRECISION__PLUS_MINUS_DELTA);
        createEAttribute(timestampPrecisionEClass, TIMESTAMP_PRECISION__LEAST_SIGNIFICANT_UNIT);

        timeIntervalEClass = createEClass(TIME_INTERVAL);
        createEReference(timeIntervalEClass, TIME_INTERVAL__BEGIN);
        createEReference(timeIntervalEClass, TIME_INTERVAL__END);
        createEReference(timeIntervalEClass, TIME_INTERVAL__DURATION);

        timeDurationEClass = createEClass(TIME_DURATION);
        createEAttribute(timeDurationEClass, TIME_DURATION__AMOUNT);
        createEAttribute(timeDurationEClass, TIME_DURATION__UNIT);

        clockEClass = createEClass(CLOCK);
        createEAttribute(clockEClass, CLOCK__NAME);
        createEReference(clockEClass, CLOCK__RESOLUTION);

        discreteClockEClass = createEClass(DISCRETE_CLOCK);
        createEReference(discreteClockEClass, DISCRETE_CLOCK__START);
        createEAttribute(discreteClockEClass, DISCRETE_CLOCK__TIME_STEP);

        systemClockEClass = createEClass(SYSTEM_CLOCK);

        timestampPatternEClass = createEClass(TIMESTAMP_PATTERN);
        createEReference(timestampPatternEClass, TIMESTAMP_PATTERN__VALIDITY);
        createEAttribute(timestampPatternEClass, TIMESTAMP_PATTERN__TIME_OF_DAY_MASK);
        createEAttribute(timestampPatternEClass, TIMESTAMP_PATTERN__DAY_OF_WEEK_MASK);
        createEAttribute(timestampPatternEClass, TIMESTAMP_PATTERN__DAY_OF_MONTH_MASK);
        createEAttribute(timestampPatternEClass, TIMESTAMP_PATTERN__MONTH_OF_YEAR_MASK);

        // Create enums
        timeUnitEEnum = createEEnum(TIME_UNIT);
        dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);
        monthOfYearEEnum = createEEnum(MONTH_OF_YEAR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        timestampEClass.getESuperTypes().add(theModelsPackage.getElement());
        timeIntervalEClass.getESuperTypes().add(theModelsPackage.getElement());
        timeDurationEClass.getESuperTypes().add(theModelsPackage.getElement());
        clockEClass.getESuperTypes().add(theModelsPackage.getElement());
        discreteClockEClass.getESuperTypes().add(this.getClock());
        systemClockEClass.getESuperTypes().add(this.getClock());
        timestampPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(timestampEClass, Timestamp.class, "Timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimestamp_Precision(), this.getTimestampPrecision(), null, "precision", null, 0, 1, Timestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestamp_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Timestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timestampPrecisionEClass, TimestampPrecision.class, "TimestampPrecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimestampPrecision_PlusMinusDelta(), this.getTimeDuration(), null, "plusMinusDelta", null, 0, 1, TimestampPrecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampPrecision_LeastSignificantUnit(), this.getTimeUnit(), "leastSignificantUnit", null, 0, 1, TimestampPrecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimeInterval_Begin(), this.getTimestamp(), null, "begin", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeInterval_End(), this.getTimestamp(), null, "end", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeInterval_Duration(), this.getTimeDuration(), null, "duration", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeDurationEClass, TimeDuration.class, "TimeDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeDuration_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, TimeDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeDuration_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(clockEClass, Clock.class, "Clock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClock_Resolution(), this.getTimeDuration(), null, "resolution", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(discreteClockEClass, DiscreteClock.class, "DiscreteClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiscreteClock_Start(), this.getTimestamp(), null, "start", null, 1, 1, DiscreteClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiscreteClock_TimeStep(), ecorePackage.getELong(), "timeStep", null, 0, 1, DiscreteClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemClockEClass, SystemClock.class, "SystemClock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timestampPatternEClass, TimestampPattern.class, "TimestampPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimestampPattern_Validity(), this.getTimeInterval(), null, "validity", null, 0, 1, TimestampPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampPattern_TimeOfDayMask(), ecorePackage.getEString(), "timeOfDayMask", null, 0, 1, TimestampPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampPattern_DayOfWeekMask(), ecorePackage.getEString(), "dayOfWeekMask", null, 0, 1, TimestampPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampPattern_DayOfMonthMask(), ecorePackage.getEString(), "dayOfMonthMask", null, 0, 1, TimestampPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampPattern_MonthOfYearMask(), ecorePackage.getEString(), "monthOfYearMask", null, 0, 1, TimestampPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
        addEEnumLiteral(timeUnitEEnum, TimeUnit.NANOSECOND);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MICROSECOND);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLISECOND);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.HOUR);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.WEEK);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.MONTH);
        addEEnumLiteral(timeUnitEEnum, TimeUnit.YEAR);

        initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.MONDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.TUESDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.WEDNESDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.THURSDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.FRIDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SATURDAY);
        addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SUNDAY);

        initEEnum(monthOfYearEEnum, MonthOfYear.class, "MonthOfYear");
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.JANUARY);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.FEBRUARY);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.MARCH);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.APRIL);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.MAY);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.JUNE);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.JULY);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.AUGUST);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.SEPTEMBER);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.OCTOBER);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.NOVEMBER);
        addEEnumLiteral(monthOfYearEEnum, MonthOfYear.DECEMBER);

        // Create resource
        createResource(eNS_URI);
    }

} //TimePackageImpl
