/**
 */
package models.variable;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.VariableDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getVariableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface VariableDeclaration extends Element {
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
     * @see models.variable.VariablePackage#getVariableDeclaration_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link models.variable.VariableDeclaration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // VariableDeclaration
