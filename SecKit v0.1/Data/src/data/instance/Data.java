/**
 */
package data.instance;

import data.instantiation.DataInstantiation;

import data.type.AddressType;
import data.type.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.Data#getEObject <em>EObject</em>}</li>
 *   <li>{@link data.instance.Data#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link data.instance.Data#getLocation <em>Location</em>}</li>
 *   <li>{@link data.instance.Data#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.instance.Data#getType <em>Type</em>}</li>
 *   <li>{@link data.instance.Data#getInitialRepresentation <em>Initial Representation</em>}</li>
 *   <li>{@link data.instance.Data#getDataId <em>Data Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getData()
 * @model
 * @generated
 */
public interface Data extends AbstractDataInstance, Addressable {
    /**
     * Returns the value of the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EObject</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EObject</em>' reference.
     * @see #setEObject(EObject)
     * @see data.instance.InstancePackage#getData_EObject()
     * @model
     * @generated
     */
    EObject getEObject();

    /**
     * Sets the value of the '{@link data.instance.Data#getEObject <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EObject</em>' reference.
     * @see #getEObject()
     * @generated
     */
    void setEObject(EObject value);

    /**
     * Returns the value of the '<em><b>Data Set</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link data.instance.DataSet#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Set</em>' containment reference.
     * @see #setDataSet(DataSet)
     * @see data.instance.InstancePackage#getData_DataSet()
     * @see data.instance.DataSet#getInstances
     * @model opposite="instances" containment="true"
     * @generated
     */
    DataSet getDataSet();

    /**
     * Sets the value of the '{@link data.instance.Data#getDataSet <em>Data Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Set</em>' containment reference.
     * @see #getDataSet()
     * @generated
     */
    void setDataSet(DataSet value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' containment reference.
     * @see #setLocation(AddressType)
     * @see data.instance.InstancePackage#getData_Location()
     * @model containment="true"
     * @generated
     */
    AddressType getLocation();

    /**
     * Sets the value of the '{@link data.instance.Data#getLocation <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' containment reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(AddressType value);

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.instantiation.DataInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(DataInstantiation)
     * @see data.instance.InstancePackage#getData_Instantiation()
     * @see data.instantiation.DataInstantiation#getInstances
     * @model opposite="instances"
     * @generated
     */
    DataInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link data.instance.Data#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(DataInstantiation value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.type.DataType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(DataType)
     * @see data.instance.InstancePackage#getData_Type()
     * @see data.type.DataType#getInstances
     * @model opposite="instances"
     * @generated
     */
    DataType getType();

    /**
     * Sets the value of the '{@link data.instance.Data#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DataType value);

    /**
     * Returns the value of the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Representation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Representation</em>' reference.
     * @see #setInitialRepresentation(DataInstantiation)
     * @see data.instance.InstancePackage#getData_InitialRepresentation()
     * @model required="true"
     * @generated
     */
    DataInstantiation getInitialRepresentation();

    /**
     * Sets the value of the '{@link data.instance.Data#getInitialRepresentation <em>Initial Representation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Representation</em>' reference.
     * @see #getInitialRepresentation()
     * @generated
     */
    void setInitialRepresentation(DataInstantiation value);

    /**
     * Returns the value of the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Id</em>' attribute.
     * @see #setDataId(String)
     * @see data.instance.InstancePackage#getData_DataId()
     * @model
     * @generated
     */
    String getDataId();

    /**
     * Sets the value of the '{@link data.instance.Data#getDataId <em>Data Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Id</em>' attribute.
     * @see #getDataId()
     * @generated
     */
    void setDataId(String value);

} // Data
