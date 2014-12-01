/**
 */
package data.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.DataQuantity#getData <em>Data</em>}</li>
 *   <li>{@link data.instance.DataQuantity#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getDataQuantity()
 * @model abstract="true"
 * @generated
 */
public interface DataQuantity extends EObject {
    /**
     * Returns the value of the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' reference.
     * @see #setData(Data)
     * @see data.instance.InstancePackage#getDataQuantity_Data()
     * @model required="true"
     * @generated
     */
    Data getData();

    /**
     * Sets the value of the '{@link data.instance.DataQuantity#getData <em>Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' reference.
     * @see #getData()
     * @generated
     */
    void setData(Data value);

    /**
     * Returns the value of the '<em><b>Data Set</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link data.instance.DataSet#getContainedData <em>Contained Data</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Set</em>' container reference.
     * @see #setDataSet(DataSet)
     * @see data.instance.InstancePackage#getDataQuantity_DataSet()
     * @see data.instance.DataSet#getContainedData
     * @model opposite="containedData" required="true" transient="false"
     * @generated
     */
    DataSet getDataSet();

    /**
     * Sets the value of the '{@link data.instance.DataQuantity#getDataSet <em>Data Set</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Set</em>' container reference.
     * @see #getDataSet()
     * @generated
     */
    void setDataSet(DataSet value);

} // DataQuantity
