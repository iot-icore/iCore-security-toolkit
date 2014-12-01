/**
 */
package data.instance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.Addressable#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getAddressable()
 * @model
 * @generated
 */
public interface Addressable extends EObject {
    /**
     * Returns the value of the '<em><b>Addresses</b></em>' reference list.
     * The list contents are of type {@link data.instance.Address}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Addresses</em>' reference list.
     * @see data.instance.InstancePackage#getAddressable_Addresses()
     * @model
     * @generated
     */
    EList<Address> getAddresses();

} // Addressable
