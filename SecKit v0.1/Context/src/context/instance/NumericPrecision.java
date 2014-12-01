/**
 */
package context.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Precision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.NumericPrecision#getUnit <em>Unit</em>}</li>
 *   <li>{@link context.instance.NumericPrecision#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link context.instance.NumericPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.InstancePackage#getNumericPrecision()
 * @model
 * @generated
 */
public interface NumericPrecision extends Precision {
    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see context.instance.InstancePackage#getNumericPrecision_Unit()
     * @model
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link context.instance.NumericPrecision#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

    /**
     * Returns the value of the '<em><b>Significant Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Significant Digits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Significant Digits</em>' attribute.
     * @see #setSignificantDigits(int)
     * @see context.instance.InstancePackage#getNumericPrecision_SignificantDigits()
     * @model
     * @generated
     */
    int getSignificantDigits();

    /**
     * Sets the value of the '{@link context.instance.NumericPrecision#getSignificantDigits <em>Significant Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Significant Digits</em>' attribute.
     * @see #getSignificantDigits()
     * @generated
     */
    void setSignificantDigits(int value);

    /**
     * Returns the value of the '<em><b>Plus Minus Delta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plus Minus Delta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plus Minus Delta</em>' attribute.
     * @see #setPlusMinusDelta(long)
     * @see context.instance.InstancePackage#getNumericPrecision_PlusMinusDelta()
     * @model
     * @generated
     */
    long getPlusMinusDelta();

    /**
     * Sets the value of the '{@link context.instance.NumericPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plus Minus Delta</em>' attribute.
     * @see #getPlusMinusDelta()
     * @generated
     */
    void setPlusMinusDelta(long value);

} // NumericPrecision
