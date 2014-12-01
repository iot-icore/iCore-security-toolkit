/**
 */
package rule.condition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.Operator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends Atom {
    /**
     * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
     * The list contents are of type {@link rule.condition.Atom}.
     * It is bidirectional and its opposite is '{@link rule.condition.Atom#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operands</em>' containment reference list.
     * @see rule.condition.ConditionPackage#getOperator_Operands()
     * @see rule.condition.Atom#getOperator
     * @model opposite="operator" containment="true" required="true"
     * @generated
     */
    EList<Atom> getOperands();

} // Operator
