/**
 */
package models.variable;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.VariableAssignment#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getVariableAssignment()
 * @model abstract="true"
 * @generated
 */
public interface VariableAssignment extends Element {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(VariableDeclaration)
     * @see models.variable.VariablePackage#getVariableAssignment_Target()
     * @model required="true"
     * @generated
     */
    VariableDeclaration getTarget();

    /**
     * Sets the value of the '{@link models.variable.VariableAssignment#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(VariableDeclaration value);

} // VariableAssignment
