/**
 */
package time;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Precision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.TimestampPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}</li>
 *   <li>{@link time.TimestampPrecision#getLeastSignificantUnit <em>Least Significant Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getTimestampPrecision()
 * @model
 * @generated
 */
public interface TimestampPrecision extends EObject {
    /**
     * Returns the value of the '<em><b>Plus Minus Delta</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plus Minus Delta</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plus Minus Delta</em>' containment reference.
     * @see #setPlusMinusDelta(TimeDuration)
     * @see time.TimePackage#getTimestampPrecision_PlusMinusDelta()
     * @model containment="true"
     * @generated
     */
    TimeDuration getPlusMinusDelta();

    /**
     * Sets the value of the '{@link time.TimestampPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plus Minus Delta</em>' containment reference.
     * @see #getPlusMinusDelta()
     * @generated
     */
    void setPlusMinusDelta(TimeDuration value);

    /**
     * Returns the value of the '<em><b>Least Significant Unit</b></em>' attribute.
     * The literals are from the enumeration {@link time.TimeUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Least Significant Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Least Significant Unit</em>' attribute.
     * @see time.TimeUnit
     * @see #setLeastSignificantUnit(TimeUnit)
     * @see time.TimePackage#getTimestampPrecision_LeastSignificantUnit()
     * @model
     * @generated
     */
    TimeUnit getLeastSignificantUnit();

    /**
     * Sets the value of the '{@link time.TimestampPrecision#getLeastSignificantUnit <em>Least Significant Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Least Significant Unit</em>' attribute.
     * @see time.TimeUnit
     * @see #getLeastSignificantUnit()
     * @generated
     */
    void setLeastSignificantUnit(TimeUnit value);

} // TimestampPrecision
