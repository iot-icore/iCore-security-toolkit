/**
 */
package models.variable;

import models.Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.VariableInstance#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getVariableInstance()
 * @model abstract="true"
 * @generated
 */
public interface VariableInstance extends Element {
    /**
     * Returns the value of the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' reference.
     * @see #setValue(EObject)
     * @see models.variable.VariablePackage#getVariableInstance_Value()
     * @model
     * @generated
     */
    EObject getValue();

    /**
     * Sets the value of the '{@link models.variable.VariableInstance#getValue <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' reference.
     * @see #getValue()
     * @generated
     */
    void setValue(EObject value);

} // VariableInstance
