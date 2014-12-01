/**
 */
package rule.condition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.PatternOperator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getPatternOperator()
 * @model
 * @generated
 */
public interface PatternOperator extends EObject {
    /**
     * Returns the value of the '<em><b>Operands</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operands</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operands</em>' reference.
     * @see #setOperands(PatternOperator)
     * @see rule.condition.ConditionPackage#getPatternOperator_Operands()
     * @model
     * @generated
     */
    PatternOperator getOperands();

    /**
     * Sets the value of the '{@link rule.condition.PatternOperator#getOperands <em>Operands</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operands</em>' reference.
     * @see #getOperands()
     * @generated
     */
    void setOperands(PatternOperator value);

} // PatternOperator
