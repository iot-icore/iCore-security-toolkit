/**
 */
package time;

import java.util.Date;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.Timestamp#getPrecision <em>Precision</em>}</li>
 *   <li>{@link time.Timestamp#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getTimestamp()
 * @model
 * @generated
 */
public interface Timestamp extends Element {
    /**
     * Returns the value of the '<em><b>Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' containment reference.
     * @see #setPrecision(TimestampPrecision)
     * @see time.TimePackage#getTimestamp_Precision()
     * @model containment="true"
     * @generated
     */
    TimestampPrecision getPrecision();

    /**
     * Sets the value of the '{@link time.Timestamp#getPrecision <em>Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' containment reference.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(TimestampPrecision value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see time.TimePackage#getTimestamp_Date()
     * @model
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link time.Timestamp#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

} // Timestamp
