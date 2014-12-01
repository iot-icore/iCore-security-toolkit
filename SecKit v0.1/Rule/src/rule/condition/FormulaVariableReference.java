/**
 */
package rule.condition;

import models.variable.VariableReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.FormulaVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getFormulaVariableReference()
 * @model
 * @generated
 */
public interface FormulaVariableReference extends Atom, VariableReference {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(FormulaVariable)
     * @see rule.condition.ConditionPackage#getFormulaVariableReference_Variable()
     * @model required="true"
     * @generated
     */
    FormulaVariable getVariable();

    /**
     * Sets the value of the '{@link rule.condition.FormulaVariableReference#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(FormulaVariable value);

} // FormulaVariableReference
