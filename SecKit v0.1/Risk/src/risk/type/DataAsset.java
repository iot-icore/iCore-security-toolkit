/**
 */
package risk.type;

import data.instantiation.AbstractDataInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.DataAsset#getDataInstantiation <em>Data Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getDataAsset()
 * @model
 * @generated
 */
public interface DataAsset extends Asset {
    /**
     * Returns the value of the '<em><b>Data Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Instantiation</em>' reference.
     * @see #setDataInstantiation(AbstractDataInstantiation)
     * @see risk.type.TypePackage#getDataAsset_DataInstantiation()
     * @model required="true"
     * @generated
     */
    AbstractDataInstantiation getDataInstantiation();

    /**
     * Sets the value of the '{@link risk.type.DataAsset#getDataInstantiation <em>Data Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Instantiation</em>' reference.
     * @see #getDataInstantiation()
     * @generated
     */
    void setDataInstantiation(AbstractDataInstantiation value);

} // DataAsset
