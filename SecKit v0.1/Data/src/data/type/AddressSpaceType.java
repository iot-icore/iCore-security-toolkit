/**
 */
package data.type;

import data.instantiation.AddressSpaceInstantiation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.AddressSpaceType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link data.type.AddressSpaceType#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getAddressSpaceType()
 * @model abstract="true"
 * @generated
 */
public interface AddressSpaceType extends EObject {
    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link data.instantiation.AddressSpaceInstantiation}.
     * It is bidirectional and its opposite is '{@link data.instantiation.AddressSpaceInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see data.type.TypePackage#getAddressSpaceType_Instantiations()
     * @see data.instantiation.AddressSpaceInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<AddressSpaceInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address Type</em>' reference.
     * @see #setAddressType(AddressType)
     * @see data.type.TypePackage#getAddressSpaceType_AddressType()
     * @model
     * @generated
     */
    AddressType getAddressType();

    /**
     * Sets the value of the '{@link data.type.AddressSpaceType#getAddressType <em>Address Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address Type</em>' reference.
     * @see #getAddressType()
     * @generated
     */
    void setAddressType(AddressType value);

} // AddressSpaceType
