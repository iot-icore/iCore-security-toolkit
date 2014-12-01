/**
 */
package data.instance;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.DataSet#getContainedData <em>Contained Data</em>}</li>
 *   <li>{@link data.instance.DataSet#getName <em>Name</em>}</li>
 *   <li>{@link data.instance.DataSet#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getDataSet()
 * @model abstract="true"
 * @generated
 */
public interface DataSet extends TaintTag, Element {
    /**
     * Returns the value of the '<em><b>Contained Data</b></em>' containment reference list.
     * The list contents are of type {@link data.instance.DataQuantity}.
     * It is bidirectional and its opposite is '{@link data.instance.DataQuantity#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Data</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Data</em>' containment reference list.
     * @see data.instance.InstancePackage#getDataSet_ContainedData()
     * @see data.instance.DataQuantity#getDataSet
     * @model opposite="dataSet" containment="true"
     * @generated
     */
    EList<DataQuantity> getContainedData();

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
     * @see data.instance.InstancePackage#getDataSet_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link data.instance.DataSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link data.instance.Data#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' container reference.
     * @see #setInstances(Data)
     * @see data.instance.InstancePackage#getDataSet_Instances()
     * @see data.instance.Data#getDataSet
     * @model opposite="dataSet" transient="false"
     * @generated
     */
    Data getInstances();

    /**
     * Sets the value of the '{@link data.instance.DataSet#getInstances <em>Instances</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instances</em>' container reference.
     * @see #getInstances()
     * @generated
     */
    void setInstances(Data value);

} // DataSet
