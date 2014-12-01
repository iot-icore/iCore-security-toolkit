/**
 */
package data.instantiation;

import data.instance.AdressSpace;

import data.type.AddressSpaceType;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.AddressSpaceInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link data.instantiation.AddressSpaceInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link data.instantiation.AddressSpaceInstantiation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getAddressSpaceInstantiation()
 * @model
 * @generated
 */
public interface AddressSpaceInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.type.AddressSpaceType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(AddressSpaceType)
     * @see data.instantiation.InstantiationPackage#getAddressSpaceInstantiation_Type()
     * @see data.type.AddressSpaceType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    AddressSpaceType getType();

    /**
     * Sets the value of the '{@link data.instantiation.AddressSpaceInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(AddressSpaceType value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link data.instance.AdressSpace}.
     * It is bidirectional and its opposite is '{@link data.instance.AdressSpace#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see data.instantiation.InstantiationPackage#getAddressSpaceInstantiation_Instances()
     * @see data.instance.AdressSpace#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<AdressSpace> getInstances();

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
     * @see data.instantiation.InstantiationPackage#getAddressSpaceInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link data.instantiation.AddressSpaceInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // AddressSpaceInstantiation
