/**
 */
package structure.address;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.address.AddressPackage
 * @generated
 */
public interface AddressFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AddressFactory eINSTANCE = structure.address.impl.AddressFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Ip Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ip Address</em>'.
     * @generated
     */
    IpAddress createIpAddress();

    /**
     * Returns a new object of class '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type</em>'.
     * @generated
     */
    AddressType createAddressType();

    /**
     * Returns a new object of class '<em>Instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance</em>'.
     * @generated
     */
    AddressInstance createAddressInstance();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AddressPackage getAddressPackage();

} //AddressFactory
