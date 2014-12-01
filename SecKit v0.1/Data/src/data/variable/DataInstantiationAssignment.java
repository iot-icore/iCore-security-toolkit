/**
 */
package data.variable;

import data.instantiation.DataInstantiation;

import models.variable.StaticAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instantiation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.variable.DataInstantiationAssignment#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.variable.VariablePackage#getDataInstantiationAssignment()
 * @model
 * @generated
 */
public interface DataInstantiationAssignment extends StaticAssignment {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(DataInstantiation)
     * @see data.variable.VariablePackage#getDataInstantiationAssignment_Instantiation()
     * @model required="true"
     * @generated
     */
    DataInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link data.variable.DataInstantiationAssignment#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(DataInstantiation value);

} // DataInstantiationAssignment
