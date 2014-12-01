/**
 */
package structure.instantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instance.Location;

import structure.type.LocationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.LocationInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.LocationInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.LocationInstantiation#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getLocationInstantiation()
 * @model
 * @generated
 */
public interface LocationInstantiation extends Element {
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
     * @see structure.instantiation.InstantiationPackage#getLocationInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instantiation.LocationInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.LocationType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(LocationType)
     * @see structure.instantiation.InstantiationPackage#getLocationInstantiation_Type()
     * @see structure.type.LocationType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    LocationType getType();

    /**
     * Sets the value of the '{@link structure.instantiation.LocationInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(LocationType value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link structure.instance.Location}.
     * It is bidirectional and its opposite is '{@link structure.instance.Location#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getLocationInstantiation_Instances()
     * @see structure.instance.Location#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<Location> getInstances();

} // LocationInstantiation
