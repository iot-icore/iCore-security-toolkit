/**
 */
package data.event;

import data.pattern.DataPattern;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.event.AbstractDataEventPattern#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link data.event.AbstractDataEventPattern#getDataPattern <em>Data Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.event.EventPackage#getAbstractDataEventPattern()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link data.event.DataLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see data.event.DataLifecycle
     * @see #setLifecycle(DataLifecycle)
     * @see data.event.EventPackage#getAbstractDataEventPattern_Lifecycle()
     * @model
     * @generated
     */
    DataLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link data.event.AbstractDataEventPattern#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see data.event.DataLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(DataLifecycle value);

    /**
     * Returns the value of the '<em><b>Data Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Pattern</em>' containment reference.
     * @see #setDataPattern(DataPattern)
     * @see data.event.EventPackage#getAbstractDataEventPattern_DataPattern()
     * @model containment="true"
     * @generated
     */
    DataPattern getDataPattern();

    /**
     * Sets the value of the '{@link data.event.AbstractDataEventPattern#getDataPattern <em>Data Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Pattern</em>' containment reference.
     * @see #getDataPattern()
     * @generated
     */
    void setDataPattern(DataPattern value);

} // AbstractDataEventPattern
