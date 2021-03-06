/**
 */
package rule.condition;

import models.variable.StaticAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.FormulaAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getFormulaAssignment()
 * @model
 * @generated
 */
public interface FormulaAssignment extends StaticAssignment {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Atom)
     * @see rule.condition.ConditionPackage#getFormulaAssignment_Value()
     * @model containment="true" required="true"
     * @generated
     */
    Atom getValue();

    /**
     * Sets the value of the '{@link rule.condition.FormulaAssignment#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(Atom value);

} // FormulaAssignment
