/**
 */
package time;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.Clock#getName <em>Name</em>}</li>
 *   <li>{@link time.Clock#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getClock()
 * @model abstract="true"
 * @generated
 */
public interface Clock extends Element {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see time.TimePackage#getClock_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link time.Clock#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution</em>' containment reference.
     * @see #setResolution(TimeDuration)
     * @see time.TimePackage#getClock_Resolution()
     * @model containment="true"
     * @generated
     */
    TimeDuration getResolution();

    /**
     * Sets the value of the '{@link time.Clock#getResolution <em>Resolution</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution</em>' containment reference.
     * @see #getResolution()
     * @generated
     */
    void setResolution(TimeDuration value);

} // Clock
