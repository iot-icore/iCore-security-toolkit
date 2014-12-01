/**
 */
package data.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = data.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Data Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Type Package</em>'.
     * @generated
     */
    DataTypePackage createDataTypePackage();

    /**
     * Returns a new object of class '<em>Composite Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Composite Type</em>'.
     * @generated
     */
    CompositeType createCompositeType();

    /**
     * Returns a new object of class '<em>Primitive Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primitive Type</em>'.
     * @generated
     */
    PrimitiveType createPrimitiveType();

    /**
     * Returns a new object of class '<em>Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Producer Type</em>'.
     * @generated
     */
    DataProducerType createDataProducerType();

    /**
     * Returns a new object of class '<em>Domain Name Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Domain Name Service</em>'.
     * @generated
     */
    DomainNameService createDomainNameService();

    /**
     * Returns a new object of class '<em>Encoding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Encoding</em>'.
     * @generated
     */
    Encoding createEncoding();

    /**
     * Returns a new object of class '<em>Named Address Space</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Named Address Space</em>'.
     * @generated
     */
    NamedAddressSpace createNamedAddressSpace();

    /**
     * Returns a new object of class '<em>Bit Memory Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bit Memory Block</em>'.
     * @generated
     */
    BitMemoryBlock createBitMemoryBlock();

    /**
     * Returns a new object of class '<em>File System Address Space</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File System Address Space</em>'.
     * @generated
     */
    FileSystemAddressSpace createFileSystemAddressSpace();

    /**
     * Returns a new object of class '<em>Memory Address Space</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Memory Address Space</em>'.
     * @generated
     */
    MemoryAddressSpace createMemoryAddressSpace();

    /**
     * Returns a new object of class '<em>Byte Memory Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Byte Memory Block</em>'.
     * @generated
     */
    ByteMemoryBlock createByteMemoryBlock();

    /**
     * Returns a new object of class '<em>File Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Name</em>'.
     * @generated
     */
    FileName createFileName();

    /**
     * Returns a new object of class '<em>Memory Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Memory Address</em>'.
     * @generated
     */
    MemoryAddress createMemoryAddress();

    /**
     * Returns a new object of class '<em>Java Variable Adress</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Variable Adress</em>'.
     * @generated
     */
    JavaVariableAdress createJavaVariableAdress();

    /**
     * Returns a new object of class '<em>Java Virtual Machine Named Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Virtual Machine Named Address</em>'.
     * @generated
     */
    JavaVirtualMachineNamedAddress createJavaVirtualMachineNamedAddress();

    /**
     * Returns a new object of class '<em>Memory Page</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Memory Page</em>'.
     * @generated
     */
    MemoryPage createMemoryPage();

    /**
     * Returns a new object of class '<em>Minimal Addressable Storage Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Minimal Addressable Storage Unit</em>'.
     * @generated
     */
    MinimalAddressableStorageUnit createMinimalAddressableStorageUnit();

    /**
     * Returns a new object of class '<em>UTF8</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UTF8</em>'.
     * @generated
     */
    UTF8 createUTF8();

    /**
     * Returns a new object of class '<em>Variable Width Encoding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Width Encoding</em>'.
     * @generated
     */
    VariableWidthEncoding createVariableWidthEncoding();

    /**
     * Returns a new object of class '<em>Text Encoding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Encoding</em>'.
     * @generated
     */
    TextEncoding createTextEncoding();

    /**
     * Returns a new object of class '<em>Lead Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lead Unit</em>'.
     * @generated
     */
    LeadUnit createLeadUnit();

    /**
     * Returns a new object of class '<em>Trail Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trail Unit</em>'.
     * @generated
     */
    TrailUnit createTrailUnit();

    /**
     * Returns a new object of class '<em>Java Script Object Notation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Script Object Notation</em>'.
     * @generated
     */
    JavaScriptObjectNotation createJavaScriptObjectNotation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
