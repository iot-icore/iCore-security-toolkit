/**
 */
package time;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see time.TimePackage#getTimeUnit()
 * @model
 * @generated
 */
public enum TimeUnit implements Enumerator {
    /**
     * The '<em><b>Nanosecond</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NANOSECOND_VALUE
     * @generated
     * @ordered
     */
    NANOSECOND(0, "nanosecond", "nanosecond"), /**
     * The '<em><b>Microsecond</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MICROSECOND_VALUE
     * @generated
     * @ordered
     */
    MICROSECOND(1, "microsecond", "microsecond"), /**
     * The '<em><b>Millisecond</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLISECOND_VALUE
     * @generated
     * @ordered
     */
    MILLISECOND(2, "millisecond", "millisecond"), /**
     * The '<em><b>Second</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SECOND_VALUE
     * @generated
     * @ordered
     */
    SECOND(3, "second", "second"), /**
     * The '<em><b>Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUTE_VALUE
     * @generated
     * @ordered
     */
    MINUTE(4, "minute", "minute"), /**
     * The '<em><b>Hour</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOUR_VALUE
     * @generated
     * @ordered
     */
    HOUR(5, "hour", "hour"), /**
     * The '<em><b>Day</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAY_VALUE
     * @generated
     * @ordered
     */
    DAY(6, "day", "day"), /**
     * The '<em><b>Week</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEEK_VALUE
     * @generated
     * @ordered
     */
    WEEK(7, "week", "week"), /**
     * The '<em><b>Month</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MONTH_VALUE
     * @generated
     * @ordered
     */
    MONTH(8, "month", "month"), /**
     * The '<em><b>Year</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YEAR_VALUE
     * @generated
     * @ordered
     */
    YEAR(9, "year", "year");

    /**
     * The '<em><b>Nanosecond</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nanosecond</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NANOSECOND
     * @model name="nanosecond"
     * @generated
     * @ordered
     */
    public static final int NANOSECOND_VALUE = 0;

    /**
     * The '<em><b>Microsecond</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Microsecond</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MICROSECOND
     * @model name="microsecond"
     * @generated
     * @ordered
     */
    public static final int MICROSECOND_VALUE = 1;

    /**
     * The '<em><b>Millisecond</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Millisecond</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLISECOND
     * @model name="millisecond"
     * @generated
     * @ordered
     */
    public static final int MILLISECOND_VALUE = 2;

    /**
     * The '<em><b>Second</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Second</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SECOND
     * @model name="second"
     * @generated
     * @ordered
     */
    public static final int SECOND_VALUE = 3;

    /**
     * The '<em><b>Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINUTE
     * @model name="minute"
     * @generated
     * @ordered
     */
    public static final int MINUTE_VALUE = 4;

    /**
     * The '<em><b>Hour</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hour</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOUR
     * @model name="hour"
     * @generated
     * @ordered
     */
    public static final int HOUR_VALUE = 5;

    /**
     * The '<em><b>Day</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAY
     * @model name="day"
     * @generated
     * @ordered
     */
    public static final int DAY_VALUE = 6;

    /**
     * The '<em><b>Week</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Week</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEEK
     * @model name="week"
     * @generated
     * @ordered
     */
    public static final int WEEK_VALUE = 7;

    /**
     * The '<em><b>Month</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MONTH
     * @model name="month"
     * @generated
     * @ordered
     */
    public static final int MONTH_VALUE = 8;

    /**
     * The '<em><b>Year</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YEAR
     * @model name="year"
     * @generated
     * @ordered
     */
    public static final int YEAR_VALUE = 9;

    /**
     * An array of all the '<em><b>Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TimeUnit[] VALUES_ARRAY =
        new TimeUnit[] {
            NANOSECOND,
            MICROSECOND,
            MILLISECOND,
            SECOND,
            MINUTE,
            HOUR,
            DAY,
            WEEK,
            MONTH,
            YEAR,
        };

    /**
     * A public read-only list of all the '<em><b>Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TimeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Unit</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TimeUnit result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TimeUnit result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TimeUnit get(int value) {
        switch (value) {
            case NANOSECOND_VALUE: return NANOSECOND;
            case MICROSECOND_VALUE: return MICROSECOND;
            case MILLISECOND_VALUE: return MILLISECOND;
            case SECOND_VALUE: return SECOND;
            case MINUTE_VALUE: return MINUTE;
            case HOUR_VALUE: return HOUR;
            case DAY_VALUE: return DAY;
            case WEEK_VALUE: return WEEK;
            case MONTH_VALUE: return MONTH;
            case YEAR_VALUE: return YEAR;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private TimeUnit(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //TimeUnit
