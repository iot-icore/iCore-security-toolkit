/**
 */
package data.type;

import data.instance.Data;

import data.instantiation.AbstractDataInstantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.DataType#getEType <em>EType</em>}</li>
 *   <li>{@link data.type.DataType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link data.type.DataType#getName <em>Name</em>}</li>
 *   <li>{@link data.type.DataType#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends Element {
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
     * @see data.type.TypePackage#getDataType_EType()
     * @model
     * @generated
     */
    EClassifier getEType();

    /**
     * Sets the value of the '{@link data.type.DataType#getEType <em>EType</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EType</em>' reference.
     * @see #getEType()
     * @generated
     */
    void setEType(EClassifier value);

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link data.instantiation.AbstractDataInstantiation}.
     * It is bidirectional and its opposite is '{@link data.instantiation.AbstractDataInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see data.type.TypePackage#getDataType_Instantiations()
     * @see data.instantiation.AbstractDataInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<AbstractDataInstantiation> getInstantiations();

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
     * @see data.type.TypePackage#getDataType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link data.type.DataType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link data.instance.Data}.
     * It is bidirectional and its opposite is '{@link data.instance.Data#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see data.type.TypePackage#getDataType_Instances()
     * @see data.instance.Data#getType
     * @model opposite="type"
     * @generated
     */
    EList<Data> getInstances();

} // DataType
