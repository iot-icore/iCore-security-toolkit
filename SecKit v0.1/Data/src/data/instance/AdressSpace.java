/**
 */
package data.instance;

import data.instantiation.AddressSpaceInstantiation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adress Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.AdressSpace#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link data.instance.AdressSpace#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getAdressSpace()
 * @model
 * @generated
 */
public interface AdressSpace extends EObject {
    /**
     * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
     * The list contents are of type {@link data.instance.Address}.
     * It is bidirectional and its opposite is '{@link data.instance.Address#getAdressSpace <em>Adress Space</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Addresses</em>' containment reference list.
     * @see data.instance.InstancePackage#getAdressSpace_Addresses()
     * @see data.instance.Address#getAdressSpace
     * @model opposite="adressSpace" containment="true"
     * @generated
     */
    EList<Address> getAddresses();

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.instantiation.AddressSpaceInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(AddressSpaceInstantiation)
     * @see data.instance.InstancePackage#getAdressSpace_Instantiation()
     * @see data.instantiation.AddressSpaceInstantiation#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    AddressSpaceInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link data.instance.AdressSpace#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(AddressSpaceInstantiation value);

} // AdressSpace
