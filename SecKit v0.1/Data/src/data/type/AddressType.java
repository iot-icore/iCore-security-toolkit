/**
 */
package data.type;

import data.instantiation.AddressInstantiation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.AddressType#getInstantiations <em>Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getAddressType()
 * @model abstract="true"
 * @generated
 */
public interface AddressType extends EObject {
    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link data.instantiation.AddressInstantiation}.
     * It is bidirectional and its opposite is '{@link data.instantiation.AddressInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see data.type.TypePackage#getAddressType_Instantiations()
     * @see data.instantiation.AddressInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<AddressInstantiation> getInstantiations();

} // AddressType
