/**
 */
package data.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.DataTypePackage#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link data.type.DataTypePackage#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link data.type.DataTypePackage#getSuPackages <em>Su Packages</em>}</li>
 *   <li>{@link data.type.DataTypePackage#getSuperPackages <em>Super Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getDataTypePackage()
 * @model
 * @generated
 */
public interface DataTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
     * The list contents are of type {@link data.type.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Types</em>' containment reference list.
     * @see data.type.TypePackage#getDataTypePackage_DataTypes()
     * @model containment="true"
     * @generated
     */
    EList<DataType> getDataTypes();

    /**
     * Returns the value of the '<em><b>EPackage</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EPackage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EPackage</em>' reference.
     * @see #setEPackage(EPackage)
     * @see data.type.TypePackage#getDataTypePackage_EPackage()
     * @model
     * @generated
     */
    EPackage getEPackage();

    /**
     * Sets the value of the '{@link data.type.DataTypePackage#getEPackage <em>EPackage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EPackage</em>' reference.
     * @see #getEPackage()
     * @generated
     */
    void setEPackage(EPackage value);

    /**
     * Returns the value of the '<em><b>Su Packages</b></em>' containment reference list.
     * The list contents are of type {@link data.type.DataTypePackage}.
     * It is bidirectional and its opposite is '{@link data.type.DataTypePackage#getSuperPackages <em>Super Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Su Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Su Packages</em>' containment reference list.
     * @see data.type.TypePackage#getDataTypePackage_SuPackages()
     * @see data.type.DataTypePackage#getSuperPackages
     * @model opposite="superPackages" containment="true"
     * @generated
     */
    EList<DataTypePackage> getSuPackages();

    /**
     * Returns the value of the '<em><b>Super Packages</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link data.type.DataTypePackage#getSuPackages <em>Su Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Packages</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Packages</em>' container reference.
     * @see #setSuperPackages(DataTypePackage)
     * @see data.type.TypePackage#getDataTypePackage_SuperPackages()
     * @see data.type.DataTypePackage#getSuPackages
     * @model opposite="suPackages" transient="false"
     * @generated
     */
    DataTypePackage getSuperPackages();

    /**
     * Sets the value of the '{@link data.type.DataTypePackage#getSuperPackages <em>Super Packages</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Packages</em>' container reference.
     * @see #getSuperPackages()
     * @generated
     */
    void setSuperPackages(DataTypePackage value);

} // DataTypePackage
