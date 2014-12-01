/**
 */
package structure.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.LocationInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.LocationType#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.LocationType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.LocationType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getLocationType()
 * @model
 * @generated
 */
public interface LocationType extends Element {
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
     * @see structure.type.TypePackage#getLocationType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.type.LocationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.LocationInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.LocationInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see structure.type.TypePackage#getLocationType_Instantiations()
     * @see structure.instantiation.LocationInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<LocationInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getLocationTypes <em>Location Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(EntityTypePackage)
     * @see structure.type.TypePackage#getLocationType_Package()
     * @see structure.type.EntityTypePackage#getLocationTypes
     * @model opposite="locationTypes" required="true" transient="false"
     * @generated
     */
    EntityTypePackage getPackage();

    /**
     * Sets the value of the '{@link structure.type.LocationType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(EntityTypePackage value);

} // LocationType
