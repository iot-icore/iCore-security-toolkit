/**
 */
package data.variable;

import models.variable.StaticAssignment;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.variable.DataTypeAssignment#getEType <em>EType</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.variable.VariablePackage#getDataTypeAssignment()
 * @model
 * @generated
 */
public interface DataTypeAssignment extends StaticAssignment {
    /**
     * Returns the value of the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EType</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EType</em>' reference.
     * @see #setEType(EClassifier)
     * @see data.variable.VariablePackage#getDataTypeAssignment_EType()
     * @model
     * @generated
     */
    EClassifier getEType();

    /**
     * Sets the value of the '{@link data.variable.DataTypeAssignment#getEType <em>EType</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EType</em>' reference.
     * @see #getEType()
     * @generated
     */
    void setEType(EClassifier value);

} // DataTypeAssignment
