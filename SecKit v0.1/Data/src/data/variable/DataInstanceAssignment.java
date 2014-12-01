/**
 */
package data.variable;

import models.variable.StaticAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instance Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.variable.DataInstanceAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.variable.VariablePackage#getDataInstanceAssignment()
 * @model
 * @generated
 */
public interface DataInstanceAssignment extends StaticAssignment {
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
     * @see data.variable.VariablePackage#getDataInstanceAssignment_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link data.variable.DataInstanceAssignment#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // DataInstanceAssignment
