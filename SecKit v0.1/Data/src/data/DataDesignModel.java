/**
 */
package data;

import data.type.DataTypePackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.DataDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.DataPackage#getDataDesignModel()
 * @model
 * @generated
 */
public interface DataDesignModel extends DataModel {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link data.type.DataTypePackage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see data.DataPackage#getDataDesignModel_Packages()
     * @model containment="true"
     * @generated
     */
    EList<DataTypePackage> getPackages();

} // DataDesignModel
