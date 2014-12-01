/**
 */
package rule.condition;

import models.Element;

import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import rule.template.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.condition.FormulaTemplate#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link rule.condition.FormulaTemplate#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link rule.condition.FormulaTemplate#getName <em>Name</em>}</li>
 *   <li>{@link rule.condition.FormulaTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.condition.FormulaTemplate#getRootAtom <em>Root Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.condition.ConditionPackage#getFormulaTemplate()
 * @model
 * @generated
 */
public interface FormulaTemplate extends Element, Template {
    /**
     * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableDeclaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Declarations</em>' containment reference list.
     * @see rule.condition.ConditionPackage#getFormulaTemplate_VariableDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<VariableDeclaration> getVariableDeclarations();

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
     * @see rule.condition.ConditionPackage#getFormulaTemplate_VariableAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getVariableAssignments();

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
     * @see rule.condition.ConditionPackage#getFormulaTemplate_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rule.condition.FormulaTemplate#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see rule.condition.ConditionPackage#getFormulaTemplate_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link rule.condition.FormulaTemplate#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Root Atom</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Atom</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Atom</em>' containment reference.
     * @see #setRootAtom(Atom)
     * @see rule.condition.ConditionPackage#getFormulaTemplate_RootAtom()
     * @model containment="true" required="true"
     * @generated
     */
    Atom getRootAtom();

    /**
     * Sets the value of the '{@link rule.condition.FormulaTemplate#getRootAtom <em>Root Atom</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Atom</em>' containment reference.
     * @see #getRootAtom()
     * @generated
     */
    void setRootAtom(Atom value);

} // FormulaTemplate
