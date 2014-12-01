/**
 */
package time;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.TimeDuration#getAmount <em>Amount</em>}</li>
 *   <li>{@link time.TimeDuration#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getTimeDuration()
 * @model
 * @generated
 */
public interface TimeDuration extends Element {
    /**
     * Returns the value of the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amount</em>' attribute.
     * @see #setAmount(long)
     * @see time.TimePackage#getTimeDuration_Amount()
     * @model
     * @generated
     */
    long getAmount();

    /**
     * Sets the value of the '{@link time.TimeDuration#getAmount <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amount</em>' attribute.
     * @see #getAmount()
     * @generated
     */
    void setAmount(long value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * The literals are from the enumeration {@link time.TimeUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see time.TimeUnit
     * @see #setUnit(TimeUnit)
     * @see time.TimePackage#getTimeDuration_Unit()
     * @model
     * @generated
     */
    TimeUnit getUnit();

    /**
     * Sets the value of the '{@link time.TimeDuration#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see time.TimeUnit
     * @see #getUnit()
     * @generated
     */
    void setUnit(TimeUnit value);

} // TimeDuration
