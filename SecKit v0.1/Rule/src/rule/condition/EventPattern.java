/**
 */
package rule.condition;

import models.Pattern;

import rule.event.EventModality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.EventPattern#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getEventPattern()
 * @model
 * @generated
 */
public interface EventPattern extends Pattern, Nullary, Atom {
    /**
     * Returns the value of the '<em><b>Modality</b></em>' attribute.
     * The literals are from the enumeration {@link rule.event.EventModality}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modality</em>' attribute.
     * @see rule.event.EventModality
     * @see #setModality(EventModality)
     * @see rule.condition.ConditionPackage#getEventPattern_Modality()
     * @model
     * @generated
     */
    EventModality getModality();

    /**
     * Sets the value of the '{@link rule.condition.EventPattern#getModality <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modality</em>' attribute.
     * @see rule.event.EventModality
     * @see #getModality()
     * @generated
     */
    void setModality(EventModality value);

} // EventPattern
