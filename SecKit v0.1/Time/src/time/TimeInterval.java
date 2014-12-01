/**
 */
package time;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.TimeInterval#getBegin <em>Begin</em>}</li>
 *   <li>{@link time.TimeInterval#getEnd <em>End</em>}</li>
 *   <li>{@link time.TimeInterval#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends Element {
    /**
     * Returns the value of the '<em><b>Begin</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Begin</em>' containment reference.
     * @see #setBegin(Timestamp)
     * @see time.TimePackage#getTimeInterval_Begin()
     * @model containment="true" required="true"
     * @generated
     */
    Timestamp getBegin();

    /**
     * Sets the value of the '{@link time.TimeInterval#getBegin <em>Begin</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Begin</em>' containment reference.
     * @see #getBegin()
     * @generated
     */
    void setBegin(Timestamp value);

    /**
     * Returns the value of the '<em><b>End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' containment reference.
     * @see #setEnd(Timestamp)
     * @see time.TimePackage#getTimeInterval_End()
     * @model containment="true"
     * @generated
     */
    Timestamp getEnd();

    /**
     * Sets the value of the '{@link time.TimeInterval#getEnd <em>End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' containment reference.
     * @see #getEnd()
     * @generated
     */
    void setEnd(Timestamp value);

    /**
     * Returns the value of the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' containment reference.
     * @see #setDuration(TimeDuration)
     * @see time.TimePackage#getTimeInterval_Duration()
     * @model containment="true"
     * @generated
     */
    TimeDuration getDuration();

    /**
     * Sets the value of the '{@link time.TimeInterval#getDuration <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' containment reference.
     * @see #getDuration()
     * @generated
     */
    void setDuration(TimeDuration value);

} // TimeInterval
