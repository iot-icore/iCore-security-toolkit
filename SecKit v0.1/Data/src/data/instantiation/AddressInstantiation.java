/**
 */
package data.instantiation;

import data.type.AddressType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.AddressInstantiation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getAddressInstantiation()
 * @model
 * @generated
 */
public interface AddressInstantiation extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.type.AddressType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(AddressType)
     * @see data.instantiation.InstantiationPackage#getAddressInstantiation_Type()
     * @see data.type.AddressType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    AddressType getType();

    /**
     * Sets the value of the '{@link data.instantiation.AddressInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(AddressType value);

} // AddressInstantiation
