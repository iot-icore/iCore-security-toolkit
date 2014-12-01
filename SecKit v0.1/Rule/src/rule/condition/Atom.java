/**
 */
package rule.condition;

import models.Element;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.util.EList;

import rule.template.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.Atom#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link rule.condition.Atom#getOperator <em>Operator</em>}</li>
 *   <li>{@link rule.condition.Atom#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getAtom()
 * @model abstract="true"
 * @generated
 */
public interface Atom extends Element {
    /**
     * Returns the value of the '<em><b>Variable Assignments</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Assignments</em>' containment reference list.
     * @see rule.condition.ConditionPackage#getAtom_VariableAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getVariableAssignments();

    /**
     * Returns the value of the '<em><b>Operator</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.condition.Operator#getOperands <em>Operands</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' container reference.
     * @see #setOperator(Operator)
     * @see rule.condition.ConditionPackage#getAtom_Operator()
     * @see rule.condition.Operator#getOperands
     * @model opposite="operands" transient="false"
     * @generated
     */
    Operator getOperator();

    /**
     * Sets the value of the '{@link rule.condition.Atom#getOperator <em>Operator</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' container reference.
     * @see #getOperator()
     * @generated
     */
    void setOperator(Operator value);

    /**
     * Returns the value of the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' reference.
     * @see #setTemplate(Template)
     * @see rule.condition.ConditionPackage#getAtom_Template()
     * @model
     * @generated
     */
    Template getTemplate();

    /**
     * Sets the value of the '{@link rule.condition.Atom#getTemplate <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(Template value);

} // Atom
