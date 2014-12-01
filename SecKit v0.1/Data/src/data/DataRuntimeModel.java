/**
 */
package data;

import data.instance.Data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.DataRuntimeModel#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getDataRuntimeModel()
 * @model
 * @generated
 */
public interface DataRuntimeModel extends DataModel {
    /**
     * Returns the value of the '<em><b>Data</b></em>' containment reference list.
     * The list contents are of type {@link data.instance.Data}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' containment reference list.
     * @see data.DataPackage#getDataRuntimeModel_Data()
     * @model containment="true"
     * @generated
     */
    EList<Data> getData();

} // DataRuntimeModel
