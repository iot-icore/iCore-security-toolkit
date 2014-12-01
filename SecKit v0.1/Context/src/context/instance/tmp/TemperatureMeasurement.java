/**
 */
package context.instance.tmp;

import context.instance.Context;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.tmp.TemperatureMeasurement#getValue <em>Value</em>}</li>
 *   <li>{@link context.instance.tmp.TemperatureMeasurement#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.tmp.TmpPackage#getTemperatureMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface TemperatureMeasurement extends Context {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(BigDecimal)
     * @see context.instance.tmp.TmpPackage#getTemperatureMeasurement_Value()
     * @model
     * @generated
     */
    BigDecimal getValue();

    /**
     * Sets the value of the '{@link context.instance.tmp.TemperatureMeasurement#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(BigDecimal value);

    /**
     * Returns the value of the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scale</em>' attribute.
     * @see #setScale(String)
     * @see context.instance.tmp.TmpPackage#getTemperatureMeasurement_Scale()
     * @model
     * @generated
     */
    String getScale();

    /**
     * Sets the value of the '{@link context.instance.tmp.TemperatureMeasurement#getScale <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scale</em>' attribute.
     * @see #getScale()
     * @generated
     */
    void setScale(String value);

} // TemperatureMeasurement
