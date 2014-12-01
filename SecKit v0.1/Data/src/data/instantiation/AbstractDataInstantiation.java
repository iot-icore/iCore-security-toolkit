/**
 */
package data.instantiation;

import data.instance.DataSet;

import data.type.DataType;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.AbstractDataInstantiation#getContainedDataSet <em>Contained Data Set</em>}</li>
 *   <li>{@link data.instantiation.AbstractDataInstantiation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getAbstractDataInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Contained Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Data Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Data Set</em>' reference.
     * @see #setContainedDataSet(DataSet)
     * @see data.instantiation.InstantiationPackage#getAbstractDataInstantiation_ContainedDataSet()
     * @model
     * @generated
     */
    DataSet getContainedDataSet();

    /**
     * Sets the value of the '{@link data.instantiation.AbstractDataInstantiation#getContainedDataSet <em>Contained Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contained Data Set</em>' reference.
     * @see #getContainedDataSet()
     * @generated
     */
    void setContainedDataSet(DataSet value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.type.DataType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(DataType)
     * @see data.instantiation.InstantiationPackage#getAbstractDataInstantiation_Type()
     * @see data.type.DataType#getInstantiations
     * @model opposite="instantiations"
     * @generated
     */
    DataType getType();

    /**
     * Sets the value of the '{@link data.instantiation.AbstractDataInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DataType value);

} // AbstractDataInstantiation
