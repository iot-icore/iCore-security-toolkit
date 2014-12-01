/**
 */
package time;

import models.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.TimestampPattern#getValidity <em>Validity</em>}</li>
 *   <li>{@link time.TimestampPattern#getTimeOfDayMask <em>Time Of Day Mask</em>}</li>
 *   <li>{@link time.TimestampPattern#getDayOfWeekMask <em>Day Of Week Mask</em>}</li>
 *   <li>{@link time.TimestampPattern#getDayOfMonthMask <em>Day Of Month Mask</em>}</li>
 *   <li>{@link time.TimestampPattern#getMonthOfYearMask <em>Month Of Year Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getTimestampPattern()
 * @model
 * @generated
 */
public interface TimestampPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Validity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Validity</em>' containment reference.
     * @see #setValidity(TimeInterval)
     * @see time.TimePackage#getTimestampPattern_Validity()
     * @model containment="true"
     * @generated
     */
    TimeInterval getValidity();

    /**
     * Sets the value of the '{@link time.TimestampPattern#getValidity <em>Validity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validity</em>' containment reference.
     * @see #getValidity()
     * @generated
     */
    void setValidity(TimeInterval value);

    /**
     * Returns the value of the '<em><b>Time Of Day Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Of Day Mask</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Of Day Mask</em>' attribute.
     * @see #setTimeOfDayMask(String)
     * @see time.TimePackage#getTimestampPattern_TimeOfDayMask()
     * @model
     * @generated
     */
    String getTimeOfDayMask();

    /**
     * Sets the value of the '{@link time.TimestampPattern#getTimeOfDayMask <em>Time Of Day Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Of Day Mask</em>' attribute.
     * @see #getTimeOfDayMask()
     * @generated
     */
    void setTimeOfDayMask(String value);

    /**
     * Returns the value of the '<em><b>Day Of Week Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Day Of Week Mask</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Day Of Week Mask</em>' attribute.
     * @see #setDayOfWeekMask(String)
     * @see time.TimePackage#getTimestampPattern_DayOfWeekMask()
     * @model
     * @generated
     */
    String getDayOfWeekMask();

    /**
     * Sets the value of the '{@link time.TimestampPattern#getDayOfWeekMask <em>Day Of Week Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Day Of Week Mask</em>' attribute.
     * @see #getDayOfWeekMask()
     * @generated
     */
    void setDayOfWeekMask(String value);

    /**
     * Returns the value of the '<em><b>Day Of Month Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Day Of Month Mask</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Day Of Month Mask</em>' attribute.
     * @see #setDayOfMonthMask(String)
     * @see time.TimePackage#getTimestampPattern_DayOfMonthMask()
     * @model
     * @generated
     */
    String getDayOfMonthMask();

    /**
     * Sets the value of the '{@link time.TimestampPattern#getDayOfMonthMask <em>Day Of Month Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Day Of Month Mask</em>' attribute.
     * @see #getDayOfMonthMask()
     * @generated
     */
    void setDayOfMonthMask(String value);

    /**
     * Returns the value of the '<em><b>Month Of Year Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Month Of Year Mask</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Month Of Year Mask</em>' attribute.
     * @see #setMonthOfYearMask(String)
     * @see time.TimePackage#getTimestampPattern_MonthOfYearMask()
     * @model
     * @generated
     */
    String getMonthOfYearMask();

    /**
     * Sets the value of the '{@link time.TimestampPattern#getMonthOfYearMask <em>Month Of Year Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Month Of Year Mask</em>' attribute.
     * @see #getMonthOfYearMask()
     * @generated
     */
    void setMonthOfYearMask(String value);

} // TimestampPattern
