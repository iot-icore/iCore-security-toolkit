/**
 */
package data.instantiation;

import data.instance.Data;

import data.pattern.DataPattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.DataInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link data.instantiation.DataInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link data.instantiation.DataInstantiation#isArray <em>Array</em>}</li>
 *   <li>{@link data.instantiation.DataInstantiation#getDescription <em>Description</em>}</li>
 *   <li>{@link data.instantiation.DataInstantiation#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getDataInstantiation()
 * @model
 * @generated
 */
public interface DataInstantiation extends AbstractDataInstantiation {
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
     * @see data.instantiation.InstantiationPackage#getDataInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiation#getName <em>Name</em>}' attribute.
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
     * It is bidirectional and its opposite is '{@link data.instance.Data#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see data.instantiation.InstantiationPackage#getDataInstantiation_Instances()
     * @see data.instance.Data#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<Data> getInstances();

    /**
     * Returns the value of the '<em><b>Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Array</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array</em>' attribute.
     * @see #setArray(boolean)
     * @see data.instantiation.InstantiationPackage#getDataInstantiation_Array()
     * @model
     * @generated
     */
    boolean isArray();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiation#isArray <em>Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Array</em>' attribute.
     * @see #isArray()
     * @generated
     */
    void setArray(boolean value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see data.instantiation.InstantiationPackage#getDataInstantiation_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiation#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Patterns</b></em>' reference list.
     * The list contents are of type {@link data.pattern.DataPattern}.
     * It is bidirectional and its opposite is '{@link data.pattern.DataPattern#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Patterns</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Patterns</em>' reference list.
     * @see data.instantiation.InstantiationPackage#getDataInstantiation_Patterns()
     * @see data.pattern.DataPattern#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<DataPattern> getPatterns();

} // DataInstantiation
