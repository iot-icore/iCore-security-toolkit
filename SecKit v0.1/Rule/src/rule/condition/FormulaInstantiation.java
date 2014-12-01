/**
 */
package rule.condition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.FormulaInstantiation#getFormulaTemplate <em>Formula Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getFormulaInstantiation()
 * @model
 * @generated
 */
public interface FormulaInstantiation extends Atom, Nullary {
    /**
     * Returns the value of the '<em><b>Formula Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formula Template</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formula Template</em>' reference.
     * @see #setFormulaTemplate(FormulaTemplate)
     * @see rule.condition.ConditionPackage#getFormulaInstantiation_FormulaTemplate()
     * @model required="true"
     * @generated
     */
    FormulaTemplate getFormulaTemplate();

    /**
     * Sets the value of the '{@link rule.condition.FormulaInstantiation#getFormulaTemplate <em>Formula Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formula Template</em>' reference.
     * @see #getFormulaTemplate()
     * @generated
     */
    void setFormulaTemplate(FormulaTemplate value);

} // FormulaInstantiation
