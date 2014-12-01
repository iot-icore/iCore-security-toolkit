/**
 */
package behavior.address;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.address.AddressPackage
 * @generated
 */
public interface AddressFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AddressFactory eINSTANCE = behavior.address.impl.AddressFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Behavior Address Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Address Type</em>'.
     * @generated
     */
    BehaviorAddressType createBehaviorAddressType();

    /**
     * Returns a new object of class '<em>Process Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Identifier</em>'.
     * @generated
     */
    ProcessIdentifier createProcessIdentifier();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AddressPackage getAddressPackage();

} //AddressFactory
