/**
 */
package data.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstanceFactory eINSTANCE = data.instance.impl.InstanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block</em>'.
     * @generated
     */
    Block createBlock();

    /**
     * Returns a new object of class '<em>Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Segment</em>'.
     * @generated
     */
    Segment createSegment();

    /**
     * Returns a new object of class '<em>Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Region</em>'.
     * @generated
     */
    Region createRegion();

    /**
     * Returns a new object of class '<em>Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data</em>'.
     * @generated
     */
    Data createData();

    /**
     * Returns a new object of class '<em>Number Of Bytes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Number Of Bytes</em>'.
     * @generated
     */
    NumberOfBytes createNumberOfBytes();

    /**
     * Returns a new object of class '<em>Complete Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Complete Data</em>'.
     * @generated
     */
    CompleteData createCompleteData();

    /**
     * Returns a new object of class '<em>Adress Space</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Adress Space</em>'.
     * @generated
     */
    AdressSpace createAdressSpace();

    /**
     * Returns a new object of class '<em>Addressable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Addressable</em>'.
     * @generated
     */
    Addressable createAddressable();

    /**
     * Returns a new object of class '<em>Content</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Content</em>'.
     * @generated
     */
    Content createContent();

    /**
     * Returns a new object of class '<em>Memory</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Memory</em>'.
     * @generated
     */
    Memory createMemory();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstancePackage getInstancePackage();

} //InstanceFactory
