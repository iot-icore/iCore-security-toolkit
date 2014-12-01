/**
 */
package structure.instance;

import models.Element;

import structure.instantiation.LocationInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.Location#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instance.Location#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Element {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.LocationInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(LocationInstantiation)
     * @see structure.instance.InstancePackage#getLocation_Instantiation()
     * @see structure.instantiation.LocationInstantiation#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    LocationInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link structure.instance.Location#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(LocationInstantiation value);

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
     * @see structure.instance.InstancePackage#getLocation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instance.Location#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Location
