/**
 */
package data.instantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.instantiation.InstantiationPackage
 * @generated
 */
public interface InstantiationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationFactory eINSTANCE = data.instantiation.impl.InstantiationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Address Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Address Instantiation</em>'.
     * @generated
     */
    AddressInstantiation createAddressInstantiation();

    /**
     * Returns a new object of class '<em>Data Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instantiation</em>'.
     * @generated
     */
    DataInstantiation createDataInstantiation();

    /**
     * Returns a new object of class '<em>Data Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instantiation Hierarchy</em>'.
     * @generated
     */
    DataInstantiationHierarchy createDataInstantiationHierarchy();

    /**
     * Returns a new object of class '<em>Data Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instantiation Reference</em>'.
     * @generated
     */
    DataInstantiationReference createDataInstantiationReference();

    /**
     * Returns a new object of class '<em>Address Space Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Address Space Instantiation</em>'.
     * @generated
     */
    AddressSpaceInstantiation createAddressSpaceInstantiation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstantiationPackage getInstantiationPackage();

} //InstantiationFactory
