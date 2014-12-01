/**
 */
package models.variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.StringAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getStringAssignment()
 * @model
 * @generated
 */
public interface StringAssignment extends StaticAssignment {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see models.variable.VariablePackage#getStringAssignment_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link models.variable.StringAssignment#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // StringAssignment
