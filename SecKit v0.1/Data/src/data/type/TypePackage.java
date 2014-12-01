/**
 */
package data.type;

import data.instance.InstancePackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see data.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://data/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = data.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link data.type.impl.DataTypePackageImpl <em>Data Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.DataTypePackageImpl
     * @see data.type.impl.TypePackageImpl#getDataTypePackage()
     * @generated
     */
    int DATA_TYPE_PACKAGE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__DATA_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>EPackage</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__EPACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Su Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__SU_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Super Packages</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE__SUPER_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Data Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.DataTypeImpl
     * @see data.type.impl.TypePackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__ETYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.CompositeTypeImpl
     * @see data.type.impl.TypePackageImpl#getCompositeType()
     * @generated
     */
    int COMPOSITE_TYPE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__VISUAL_ELEMENTS = DATA_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__ID = DATA_TYPE__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__ETYPE = DATA_TYPE__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__INSTANTIATIONS = DATA_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__INSTANCES = DATA_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE__ATTRIBUTES = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Composite Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Composite Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.PrimitiveTypeImpl
     * @see data.type.impl.TypePackageImpl#getPrimitiveType()
     * @generated
     */
    int PRIMITIVE_TYPE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__VISUAL_ELEMENTS = DATA_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__ID = DATA_TYPE__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__ETYPE = DATA_TYPE__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__INSTANTIATIONS = DATA_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__INSTANCES = DATA_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.DataProducerTypeImpl <em>Data Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.DataProducerTypeImpl
     * @see data.type.impl.TypePackageImpl#getDataProducerType()
     * @generated
     */
    int DATA_PRODUCER_TYPE = 4;

    /**
     * The number of structural features of the '<em>Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.AddressSpaceTypeImpl <em>Address Space Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.AddressSpaceTypeImpl
     * @see data.type.impl.TypePackageImpl#getAddressSpaceType()
     * @generated
     */
    int ADDRESS_SPACE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_TYPE__INSTANTIATIONS = 0;

    /**
     * The feature id for the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_TYPE__ADDRESS_TYPE = 1;

    /**
     * The number of structural features of the '<em>Address Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Address Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.AddressTypeImpl <em>Address Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.AddressTypeImpl
     * @see data.type.impl.TypePackageImpl#getAddressType()
     * @generated
     */
    int ADDRESS_TYPE = 6;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_TYPE__INSTANTIATIONS = 0;

    /**
     * The number of structural features of the '<em>Address Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Address Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.DomainNameServiceImpl <em>Domain Name Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.DomainNameServiceImpl
     * @see data.type.impl.TypePackageImpl#getDomainNameService()
     * @generated
     */
    int DOMAIN_NAME_SERVICE = 7;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_NAME_SERVICE__INSTANTIATIONS = ADDRESS_SPACE_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_NAME_SERVICE__ADDRESS_TYPE = ADDRESS_SPACE_TYPE__ADDRESS_TYPE;

    /**
     * The number of structural features of the '<em>Domain Name Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_NAME_SERVICE_FEATURE_COUNT = ADDRESS_SPACE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Domain Name Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_NAME_SERVICE_OPERATION_COUNT = ADDRESS_SPACE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.DataInterpretationImpl <em>Data Interpretation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.DataInterpretationImpl
     * @see data.type.impl.TypePackageImpl#getDataInterpretation()
     * @generated
     */
    int DATA_INTERPRETATION = 20;

    /**
     * The number of structural features of the '<em>Data Interpretation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INTERPRETATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Data Interpretation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INTERPRETATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.EncodingImpl <em>Encoding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.EncodingImpl
     * @see data.type.impl.TypePackageImpl#getEncoding()
     * @generated
     */
    int ENCODING = 8;

    /**
     * The number of structural features of the '<em>Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCODING_FEATURE_COUNT = DATA_INTERPRETATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCODING_OPERATION_COUNT = DATA_INTERPRETATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.NamedAddressSpaceImpl <em>Named Address Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.NamedAddressSpaceImpl
     * @see data.type.impl.TypePackageImpl#getNamedAddressSpace()
     * @generated
     */
    int NAMED_ADDRESS_SPACE = 9;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ADDRESS_SPACE__INSTANTIATIONS = ADDRESS_SPACE_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ADDRESS_SPACE__ADDRESS_TYPE = ADDRESS_SPACE_TYPE__ADDRESS_TYPE;

    /**
     * The number of structural features of the '<em>Named Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ADDRESS_SPACE_FEATURE_COUNT = ADDRESS_SPACE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Named Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ADDRESS_SPACE_OPERATION_COUNT = ADDRESS_SPACE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.BitMemoryBlockImpl <em>Bit Memory Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.BitMemoryBlockImpl
     * @see data.type.impl.TypePackageImpl#getBitMemoryBlock()
     * @generated
     */
    int BIT_MEMORY_BLOCK = 10;

    /**
     * The feature id for the '<em><b>Start Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_MEMORY_BLOCK__START_ADDRESS = InstancePackage.REGION__START_ADDRESS;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_MEMORY_BLOCK__LENGTH = InstancePackage.REGION__LENGTH;

    /**
     * The feature id for the '<em><b>End Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_MEMORY_BLOCK__END_ADDRESS = InstancePackage.REGION__END_ADDRESS;

    /**
     * The number of structural features of the '<em>Bit Memory Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_MEMORY_BLOCK_FEATURE_COUNT = InstancePackage.REGION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Bit Memory Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_MEMORY_BLOCK_OPERATION_COUNT = InstancePackage.REGION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.FileSystemAddressSpaceImpl <em>File System Address Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.FileSystemAddressSpaceImpl
     * @see data.type.impl.TypePackageImpl#getFileSystemAddressSpace()
     * @generated
     */
    int FILE_SYSTEM_ADDRESS_SPACE = 11;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_ADDRESS_SPACE__INSTANTIATIONS = ADDRESS_SPACE_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_ADDRESS_SPACE__ADDRESS_TYPE = ADDRESS_SPACE_TYPE__ADDRESS_TYPE;

    /**
     * The number of structural features of the '<em>File System Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_ADDRESS_SPACE_FEATURE_COUNT = ADDRESS_SPACE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>File System Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SYSTEM_ADDRESS_SPACE_OPERATION_COUNT = ADDRESS_SPACE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.MemoryAddressSpaceImpl <em>Memory Address Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.MemoryAddressSpaceImpl
     * @see data.type.impl.TypePackageImpl#getMemoryAddressSpace()
     * @generated
     */
    int MEMORY_ADDRESS_SPACE = 12;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_SPACE__INSTANTIATIONS = ADDRESS_SPACE_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Address Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_SPACE__ADDRESS_TYPE = ADDRESS_SPACE_TYPE__ADDRESS_TYPE;

    /**
     * The number of structural features of the '<em>Memory Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_SPACE_FEATURE_COUNT = ADDRESS_SPACE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Memory Address Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_SPACE_OPERATION_COUNT = ADDRESS_SPACE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.ByteMemoryBlockImpl <em>Byte Memory Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.ByteMemoryBlockImpl
     * @see data.type.impl.TypePackageImpl#getByteMemoryBlock()
     * @generated
     */
    int BYTE_MEMORY_BLOCK = 13;

    /**
     * The feature id for the '<em><b>Start Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_MEMORY_BLOCK__START_ADDRESS = InstancePackage.REGION__START_ADDRESS;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_MEMORY_BLOCK__LENGTH = InstancePackage.REGION__LENGTH;

    /**
     * The feature id for the '<em><b>End Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_MEMORY_BLOCK__END_ADDRESS = InstancePackage.REGION__END_ADDRESS;

    /**
     * The number of structural features of the '<em>Byte Memory Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_MEMORY_BLOCK_FEATURE_COUNT = InstancePackage.REGION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Byte Memory Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_MEMORY_BLOCK_OPERATION_COUNT = InstancePackage.REGION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.FileNameImpl <em>File Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.FileNameImpl
     * @see data.type.impl.TypePackageImpl#getFileName()
     * @generated
     */
    int FILE_NAME = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME__VISUAL_ELEMENTS = InstancePackage.ADDRESS__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME__ID = InstancePackage.ADDRESS__ID;

    /**
     * The feature id for the '<em><b>Content</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME__CONTENT = InstancePackage.ADDRESS__CONTENT;

    /**
     * The feature id for the '<em><b>Adress Space</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME__ADRESS_SPACE = InstancePackage.ADDRESS__ADRESS_SPACE;

    /**
     * The number of structural features of the '<em>File Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME_FEATURE_COUNT = InstancePackage.ADDRESS_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>File Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_NAME_OPERATION_COUNT = InstancePackage.ADDRESS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.MemoryAddressImpl <em>Memory Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.MemoryAddressImpl
     * @see data.type.impl.TypePackageImpl#getMemoryAddress()
     * @generated
     */
    int MEMORY_ADDRESS = 15;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS__VISUAL_ELEMENTS = InstancePackage.ADDRESS__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS__ID = InstancePackage.ADDRESS__ID;

    /**
     * The feature id for the '<em><b>Content</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS__CONTENT = InstancePackage.ADDRESS__CONTENT;

    /**
     * The feature id for the '<em><b>Adress Space</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS__ADRESS_SPACE = InstancePackage.ADDRESS__ADRESS_SPACE;

    /**
     * The number of structural features of the '<em>Memory Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_FEATURE_COUNT = InstancePackage.ADDRESS_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Memory Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_ADDRESS_OPERATION_COUNT = InstancePackage.ADDRESS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.JavaVariableAdressImpl <em>Java Variable Adress</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.JavaVariableAdressImpl
     * @see data.type.impl.TypePackageImpl#getJavaVariableAdress()
     * @generated
     */
    int JAVA_VARIABLE_ADRESS = 16;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_VARIABLE_ADRESS__INSTANTIATIONS = ADDRESS_TYPE__INSTANTIATIONS;

    /**
     * The number of structural features of the '<em>Java Variable Adress</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_VARIABLE_ADRESS_FEATURE_COUNT = ADDRESS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Java Variable Adress</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_VARIABLE_ADRESS_OPERATION_COUNT = ADDRESS_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.JavaVirtualMachineNamedAddressImpl <em>Java Virtual Machine Named Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.JavaVirtualMachineNamedAddressImpl
     * @see data.type.impl.TypePackageImpl#getJavaVirtualMachineNamedAddress()
     * @generated
     */
    int JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS = 17;

    /**
     * The number of structural features of the '<em>Java Virtual Machine Named Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Java Virtual Machine Named Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.MemoryPageImpl <em>Memory Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.MemoryPageImpl
     * @see data.type.impl.TypePackageImpl#getMemoryPage()
     * @generated
     */
    int MEMORY_PAGE = 18;

    /**
     * The feature id for the '<em><b>Start Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_PAGE__START_ADDRESS = BYTE_MEMORY_BLOCK__START_ADDRESS;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_PAGE__LENGTH = BYTE_MEMORY_BLOCK__LENGTH;

    /**
     * The feature id for the '<em><b>End Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_PAGE__END_ADDRESS = BYTE_MEMORY_BLOCK__END_ADDRESS;

    /**
     * The number of structural features of the '<em>Memory Page</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_PAGE_FEATURE_COUNT = BYTE_MEMORY_BLOCK_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Memory Page</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_PAGE_OPERATION_COUNT = BYTE_MEMORY_BLOCK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.MinimalAddressableStorageUnitImpl <em>Minimal Addressable Storage Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.MinimalAddressableStorageUnitImpl
     * @see data.type.impl.TypePackageImpl#getMinimalAddressableStorageUnit()
     * @generated
     */
    int MINIMAL_ADDRESSABLE_STORAGE_UNIT = 19;

    /**
     * The number of structural features of the '<em>Minimal Addressable Storage Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMAL_ADDRESSABLE_STORAGE_UNIT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Minimal Addressable Storage Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMAL_ADDRESSABLE_STORAGE_UNIT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.TextEncodingImpl <em>Text Encoding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.TextEncodingImpl
     * @see data.type.impl.TypePackageImpl#getTextEncoding()
     * @generated
     */
    int TEXT_ENCODING = 23;

    /**
     * The feature id for the '<em><b>Singletons</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ENCODING__SINGLETONS = ENCODING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lead Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ENCODING__LEAD_UNITS = ENCODING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Text Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ENCODING_FEATURE_COUNT = ENCODING_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Text Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ENCODING_OPERATION_COUNT = ENCODING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.VariableWidthEncodingImpl <em>Variable Width Encoding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.VariableWidthEncodingImpl
     * @see data.type.impl.TypePackageImpl#getVariableWidthEncoding()
     * @generated
     */
    int VARIABLE_WIDTH_ENCODING = 22;

    /**
     * The feature id for the '<em><b>Singletons</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_WIDTH_ENCODING__SINGLETONS = TEXT_ENCODING__SINGLETONS;

    /**
     * The feature id for the '<em><b>Lead Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_WIDTH_ENCODING__LEAD_UNITS = TEXT_ENCODING__LEAD_UNITS;

    /**
     * The number of structural features of the '<em>Variable Width Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_WIDTH_ENCODING_FEATURE_COUNT = TEXT_ENCODING_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Variable Width Encoding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_WIDTH_ENCODING_OPERATION_COUNT = TEXT_ENCODING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.UTF8Impl <em>UTF8</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.UTF8Impl
     * @see data.type.impl.TypePackageImpl#getUTF8()
     * @generated
     */
    int UTF8 = 21;

    /**
     * The feature id for the '<em><b>Singletons</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UTF8__SINGLETONS = VARIABLE_WIDTH_ENCODING__SINGLETONS;

    /**
     * The feature id for the '<em><b>Lead Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UTF8__LEAD_UNITS = VARIABLE_WIDTH_ENCODING__LEAD_UNITS;

    /**
     * The number of structural features of the '<em>UTF8</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UTF8_FEATURE_COUNT = VARIABLE_WIDTH_ENCODING_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>UTF8</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UTF8_OPERATION_COUNT = VARIABLE_WIDTH_ENCODING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.type.impl.LeadUnitImpl <em>Lead Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.LeadUnitImpl
     * @see data.type.impl.TypePackageImpl#getLeadUnit()
     * @generated
     */
    int LEAD_UNIT = 24;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEAD_UNIT__VALUE = 0;

    /**
     * The feature id for the '<em><b>Trail Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEAD_UNIT__TRAIL_UNITS = 1;

    /**
     * The number of structural features of the '<em>Lead Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEAD_UNIT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Lead Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEAD_UNIT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.TrailUnitImpl <em>Trail Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.TrailUnitImpl
     * @see data.type.impl.TypePackageImpl#getTrailUnit()
     * @generated
     */
    int TRAIL_UNIT = 25;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAIL_UNIT__VALUE = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAIL_UNIT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Trail Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAIL_UNIT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Trail Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAIL_UNIT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.impl.JavaScriptObjectNotationImpl <em>Java Script Object Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.impl.JavaScriptObjectNotationImpl
     * @see data.type.impl.TypePackageImpl#getJavaScriptObjectNotation()
     * @generated
     */
    int JAVA_SCRIPT_OBJECT_NOTATION = 26;

    /**
     * The number of structural features of the '<em>Java Script Object Notation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_SCRIPT_OBJECT_NOTATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Java Script Object Notation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_SCRIPT_OBJECT_NOTATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.type.AddressableStorageUnit <em>Addressable Storage Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.type.AddressableStorageUnit
     * @see data.type.impl.TypePackageImpl#getAddressableStorageUnit()
     * @generated
     */
    int ADDRESSABLE_STORAGE_UNIT = 27;


    /**
     * Returns the meta object for class '{@link data.type.DataTypePackage <em>Data Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type Package</em>'.
     * @see data.type.DataTypePackage
     * @generated
     */
    EClass getDataTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link data.type.DataTypePackage#getDataTypes <em>Data Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Types</em>'.
     * @see data.type.DataTypePackage#getDataTypes()
     * @see #getDataTypePackage()
     * @generated
     */
    EReference getDataTypePackage_DataTypes();

    /**
     * Returns the meta object for the reference '{@link data.type.DataTypePackage#getEPackage <em>EPackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EPackage</em>'.
     * @see data.type.DataTypePackage#getEPackage()
     * @see #getDataTypePackage()
     * @generated
     */
    EReference getDataTypePackage_EPackage();

    /**
     * Returns the meta object for the containment reference list '{@link data.type.DataTypePackage#getSuPackages <em>Su Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Su Packages</em>'.
     * @see data.type.DataTypePackage#getSuPackages()
     * @see #getDataTypePackage()
     * @generated
     */
    EReference getDataTypePackage_SuPackages();

    /**
     * Returns the meta object for the container reference '{@link data.type.DataTypePackage#getSuperPackages <em>Super Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Super Packages</em>'.
     * @see data.type.DataTypePackage#getSuperPackages()
     * @see #getDataTypePackage()
     * @generated
     */
    EReference getDataTypePackage_SuperPackages();

    /**
     * Returns the meta object for class '{@link data.type.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type</em>'.
     * @see data.type.DataType
     * @generated
     */
    EClass getDataType();

    /**
     * Returns the meta object for the reference '{@link data.type.DataType#getEType <em>EType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EType</em>'.
     * @see data.type.DataType#getEType()
     * @see #getDataType()
     * @generated
     */
    EReference getDataType_EType();

    /**
     * Returns the meta object for the reference list '{@link data.type.DataType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see data.type.DataType#getInstantiations()
     * @see #getDataType()
     * @generated
     */
    EReference getDataType_Instantiations();

    /**
     * Returns the meta object for the attribute '{@link data.type.DataType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see data.type.DataType#getName()
     * @see #getDataType()
     * @generated
     */
    EAttribute getDataType_Name();

    /**
     * Returns the meta object for the reference list '{@link data.type.DataType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see data.type.DataType#getInstances()
     * @see #getDataType()
     * @generated
     */
    EReference getDataType_Instances();

    /**
     * Returns the meta object for class '{@link data.type.CompositeType <em>Composite Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Composite Type</em>'.
     * @see data.type.CompositeType
     * @generated
     */
    EClass getCompositeType();

    /**
     * Returns the meta object for the containment reference list '{@link data.type.CompositeType#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see data.type.CompositeType#getAttributes()
     * @see #getCompositeType()
     * @generated
     */
    EReference getCompositeType_Attributes();

    /**
     * Returns the meta object for class '{@link data.type.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Type</em>'.
     * @see data.type.PrimitiveType
     * @generated
     */
    EClass getPrimitiveType();

    /**
     * Returns the meta object for class '{@link data.type.DataProducerType <em>Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Producer Type</em>'.
     * @see data.type.DataProducerType
     * @generated
     */
    EClass getDataProducerType();

    /**
     * Returns the meta object for class '{@link data.type.AddressSpaceType <em>Address Space Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address Space Type</em>'.
     * @see data.type.AddressSpaceType
     * @generated
     */
    EClass getAddressSpaceType();

    /**
     * Returns the meta object for the reference list '{@link data.type.AddressSpaceType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see data.type.AddressSpaceType#getInstantiations()
     * @see #getAddressSpaceType()
     * @generated
     */
    EReference getAddressSpaceType_Instantiations();

    /**
     * Returns the meta object for the reference '{@link data.type.AddressSpaceType#getAddressType <em>Address Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Address Type</em>'.
     * @see data.type.AddressSpaceType#getAddressType()
     * @see #getAddressSpaceType()
     * @generated
     */
    EReference getAddressSpaceType_AddressType();

    /**
     * Returns the meta object for class '{@link data.type.AddressType <em>Address Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address Type</em>'.
     * @see data.type.AddressType
     * @generated
     */
    EClass getAddressType();

    /**
     * Returns the meta object for the reference list '{@link data.type.AddressType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see data.type.AddressType#getInstantiations()
     * @see #getAddressType()
     * @generated
     */
    EReference getAddressType_Instantiations();

    /**
     * Returns the meta object for class '{@link data.type.DomainNameService <em>Domain Name Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Domain Name Service</em>'.
     * @see data.type.DomainNameService
     * @generated
     */
    EClass getDomainNameService();

    /**
     * Returns the meta object for class '{@link data.type.Encoding <em>Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Encoding</em>'.
     * @see data.type.Encoding
     * @generated
     */
    EClass getEncoding();

    /**
     * Returns the meta object for class '{@link data.type.NamedAddressSpace <em>Named Address Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Address Space</em>'.
     * @see data.type.NamedAddressSpace
     * @generated
     */
    EClass getNamedAddressSpace();

    /**
     * Returns the meta object for class '{@link data.type.BitMemoryBlock <em>Bit Memory Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bit Memory Block</em>'.
     * @see data.type.BitMemoryBlock
     * @generated
     */
    EClass getBitMemoryBlock();

    /**
     * Returns the meta object for class '{@link data.type.FileSystemAddressSpace <em>File System Address Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File System Address Space</em>'.
     * @see data.type.FileSystemAddressSpace
     * @generated
     */
    EClass getFileSystemAddressSpace();

    /**
     * Returns the meta object for class '{@link data.type.MemoryAddressSpace <em>Memory Address Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Memory Address Space</em>'.
     * @see data.type.MemoryAddressSpace
     * @generated
     */
    EClass getMemoryAddressSpace();

    /**
     * Returns the meta object for class '{@link data.type.ByteMemoryBlock <em>Byte Memory Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Byte Memory Block</em>'.
     * @see data.type.ByteMemoryBlock
     * @generated
     */
    EClass getByteMemoryBlock();

    /**
     * Returns the meta object for class '{@link data.type.FileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Name</em>'.
     * @see data.type.FileName
     * @generated
     */
    EClass getFileName();

    /**
     * Returns the meta object for class '{@link data.type.MemoryAddress <em>Memory Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Memory Address</em>'.
     * @see data.type.MemoryAddress
     * @generated
     */
    EClass getMemoryAddress();

    /**
     * Returns the meta object for class '{@link data.type.JavaVariableAdress <em>Java Variable Adress</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Variable Adress</em>'.
     * @see data.type.JavaVariableAdress
     * @generated
     */
    EClass getJavaVariableAdress();

    /**
     * Returns the meta object for class '{@link data.type.JavaVirtualMachineNamedAddress <em>Java Virtual Machine Named Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Virtual Machine Named Address</em>'.
     * @see data.type.JavaVirtualMachineNamedAddress
     * @generated
     */
    EClass getJavaVirtualMachineNamedAddress();

    /**
     * Returns the meta object for class '{@link data.type.MemoryPage <em>Memory Page</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Memory Page</em>'.
     * @see data.type.MemoryPage
     * @generated
     */
    EClass getMemoryPage();

    /**
     * Returns the meta object for class '{@link data.type.MinimalAddressableStorageUnit <em>Minimal Addressable Storage Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Minimal Addressable Storage Unit</em>'.
     * @see data.type.MinimalAddressableStorageUnit
     * @generated
     */
    EClass getMinimalAddressableStorageUnit();

    /**
     * Returns the meta object for class '{@link data.type.DataInterpretation <em>Data Interpretation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Interpretation</em>'.
     * @see data.type.DataInterpretation
     * @generated
     */
    EClass getDataInterpretation();

    /**
     * Returns the meta object for class '{@link data.type.UTF8 <em>UTF8</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UTF8</em>'.
     * @see data.type.UTF8
     * @generated
     */
    EClass getUTF8();

    /**
     * Returns the meta object for class '{@link data.type.VariableWidthEncoding <em>Variable Width Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Width Encoding</em>'.
     * @see data.type.VariableWidthEncoding
     * @generated
     */
    EClass getVariableWidthEncoding();

    /**
     * Returns the meta object for class '{@link data.type.TextEncoding <em>Text Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Encoding</em>'.
     * @see data.type.TextEncoding
     * @generated
     */
    EClass getTextEncoding();

    /**
     * Returns the meta object for the attribute '{@link data.type.TextEncoding#getSingletons <em>Singletons</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Singletons</em>'.
     * @see data.type.TextEncoding#getSingletons()
     * @see #getTextEncoding()
     * @generated
     */
    EAttribute getTextEncoding_Singletons();

    /**
     * Returns the meta object for the containment reference list '{@link data.type.TextEncoding#getLeadUnits <em>Lead Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lead Units</em>'.
     * @see data.type.TextEncoding#getLeadUnits()
     * @see #getTextEncoding()
     * @generated
     */
    EReference getTextEncoding_LeadUnits();

    /**
     * Returns the meta object for class '{@link data.type.LeadUnit <em>Lead Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lead Unit</em>'.
     * @see data.type.LeadUnit
     * @generated
     */
    EClass getLeadUnit();

    /**
     * Returns the meta object for the attribute '{@link data.type.LeadUnit#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see data.type.LeadUnit#getValue()
     * @see #getLeadUnit()
     * @generated
     */
    EAttribute getLeadUnit_Value();

    /**
     * Returns the meta object for the containment reference list '{@link data.type.LeadUnit#getTrailUnits <em>Trail Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trail Units</em>'.
     * @see data.type.LeadUnit#getTrailUnits()
     * @see #getLeadUnit()
     * @generated
     */
    EReference getLeadUnit_TrailUnits();

    /**
     * Returns the meta object for class '{@link data.type.TrailUnit <em>Trail Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trail Unit</em>'.
     * @see data.type.TrailUnit
     * @generated
     */
    EClass getTrailUnit();

    /**
     * Returns the meta object for the attribute '{@link data.type.TrailUnit#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see data.type.TrailUnit#getValue()
     * @see #getTrailUnit()
     * @generated
     */
    EAttribute getTrailUnit_Value();

    /**
     * Returns the meta object for the attribute '{@link data.type.TrailUnit#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see data.type.TrailUnit#getDescription()
     * @see #getTrailUnit()
     * @generated
     */
    EAttribute getTrailUnit_Description();

    /**
     * Returns the meta object for class '{@link data.type.JavaScriptObjectNotation <em>Java Script Object Notation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Script Object Notation</em>'.
     * @see data.type.JavaScriptObjectNotation
     * @generated
     */
    EClass getJavaScriptObjectNotation();

    /**
     * Returns the meta object for enum '{@link data.type.AddressableStorageUnit <em>Addressable Storage Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Addressable Storage Unit</em>'.
     * @see data.type.AddressableStorageUnit
     * @generated
     */
    EEnum getAddressableStorageUnit();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link data.type.impl.DataTypePackageImpl <em>Data Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.DataTypePackageImpl
         * @see data.type.impl.TypePackageImpl#getDataTypePackage()
         * @generated
         */
        EClass DATA_TYPE_PACKAGE = eINSTANCE.getDataTypePackage();

        /**
         * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE_PACKAGE__DATA_TYPES = eINSTANCE.getDataTypePackage_DataTypes();

        /**
         * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE_PACKAGE__EPACKAGE = eINSTANCE.getDataTypePackage_EPackage();

        /**
         * The meta object literal for the '<em><b>Su Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE_PACKAGE__SU_PACKAGES = eINSTANCE.getDataTypePackage_SuPackages();

        /**
         * The meta object literal for the '<em><b>Super Packages</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE_PACKAGE__SUPER_PACKAGES = eINSTANCE.getDataTypePackage_SuperPackages();

        /**
         * The meta object literal for the '{@link data.type.impl.DataTypeImpl <em>Data Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.DataTypeImpl
         * @see data.type.impl.TypePackageImpl#getDataType()
         * @generated
         */
        EClass DATA_TYPE = eINSTANCE.getDataType();

        /**
         * The meta object literal for the '<em><b>EType</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE__ETYPE = eINSTANCE.getDataType_EType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE__INSTANTIATIONS = eINSTANCE.getDataType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE__INSTANCES = eINSTANCE.getDataType_Instances();

        /**
         * The meta object literal for the '{@link data.type.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.CompositeTypeImpl
         * @see data.type.impl.TypePackageImpl#getCompositeType()
         * @generated
         */
        EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPOSITE_TYPE__ATTRIBUTES = eINSTANCE.getCompositeType_Attributes();

        /**
         * The meta object literal for the '{@link data.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.PrimitiveTypeImpl
         * @see data.type.impl.TypePackageImpl#getPrimitiveType()
         * @generated
         */
        EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

        /**
         * The meta object literal for the '{@link data.type.impl.DataProducerTypeImpl <em>Data Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.DataProducerTypeImpl
         * @see data.type.impl.TypePackageImpl#getDataProducerType()
         * @generated
         */
        EClass DATA_PRODUCER_TYPE = eINSTANCE.getDataProducerType();

        /**
         * The meta object literal for the '{@link data.type.impl.AddressSpaceTypeImpl <em>Address Space Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.AddressSpaceTypeImpl
         * @see data.type.impl.TypePackageImpl#getAddressSpaceType()
         * @generated
         */
        EClass ADDRESS_SPACE_TYPE = eINSTANCE.getAddressSpaceType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_SPACE_TYPE__INSTANTIATIONS = eINSTANCE.getAddressSpaceType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Address Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_SPACE_TYPE__ADDRESS_TYPE = eINSTANCE.getAddressSpaceType_AddressType();

        /**
         * The meta object literal for the '{@link data.type.impl.AddressTypeImpl <em>Address Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.AddressTypeImpl
         * @see data.type.impl.TypePackageImpl#getAddressType()
         * @generated
         */
        EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_TYPE__INSTANTIATIONS = eINSTANCE.getAddressType_Instantiations();

        /**
         * The meta object literal for the '{@link data.type.impl.DomainNameServiceImpl <em>Domain Name Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.DomainNameServiceImpl
         * @see data.type.impl.TypePackageImpl#getDomainNameService()
         * @generated
         */
        EClass DOMAIN_NAME_SERVICE = eINSTANCE.getDomainNameService();

        /**
         * The meta object literal for the '{@link data.type.impl.EncodingImpl <em>Encoding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.EncodingImpl
         * @see data.type.impl.TypePackageImpl#getEncoding()
         * @generated
         */
        EClass ENCODING = eINSTANCE.getEncoding();

        /**
         * The meta object literal for the '{@link data.type.impl.NamedAddressSpaceImpl <em>Named Address Space</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.NamedAddressSpaceImpl
         * @see data.type.impl.TypePackageImpl#getNamedAddressSpace()
         * @generated
         */
        EClass NAMED_ADDRESS_SPACE = eINSTANCE.getNamedAddressSpace();

        /**
         * The meta object literal for the '{@link data.type.impl.BitMemoryBlockImpl <em>Bit Memory Block</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.BitMemoryBlockImpl
         * @see data.type.impl.TypePackageImpl#getBitMemoryBlock()
         * @generated
         */
        EClass BIT_MEMORY_BLOCK = eINSTANCE.getBitMemoryBlock();

        /**
         * The meta object literal for the '{@link data.type.impl.FileSystemAddressSpaceImpl <em>File System Address Space</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.FileSystemAddressSpaceImpl
         * @see data.type.impl.TypePackageImpl#getFileSystemAddressSpace()
         * @generated
         */
        EClass FILE_SYSTEM_ADDRESS_SPACE = eINSTANCE.getFileSystemAddressSpace();

        /**
         * The meta object literal for the '{@link data.type.impl.MemoryAddressSpaceImpl <em>Memory Address Space</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.MemoryAddressSpaceImpl
         * @see data.type.impl.TypePackageImpl#getMemoryAddressSpace()
         * @generated
         */
        EClass MEMORY_ADDRESS_SPACE = eINSTANCE.getMemoryAddressSpace();

        /**
         * The meta object literal for the '{@link data.type.impl.ByteMemoryBlockImpl <em>Byte Memory Block</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.ByteMemoryBlockImpl
         * @see data.type.impl.TypePackageImpl#getByteMemoryBlock()
         * @generated
         */
        EClass BYTE_MEMORY_BLOCK = eINSTANCE.getByteMemoryBlock();

        /**
         * The meta object literal for the '{@link data.type.impl.FileNameImpl <em>File Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.FileNameImpl
         * @see data.type.impl.TypePackageImpl#getFileName()
         * @generated
         */
        EClass FILE_NAME = eINSTANCE.getFileName();

        /**
         * The meta object literal for the '{@link data.type.impl.MemoryAddressImpl <em>Memory Address</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.MemoryAddressImpl
         * @see data.type.impl.TypePackageImpl#getMemoryAddress()
         * @generated
         */
        EClass MEMORY_ADDRESS = eINSTANCE.getMemoryAddress();

        /**
         * The meta object literal for the '{@link data.type.impl.JavaVariableAdressImpl <em>Java Variable Adress</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.JavaVariableAdressImpl
         * @see data.type.impl.TypePackageImpl#getJavaVariableAdress()
         * @generated
         */
        EClass JAVA_VARIABLE_ADRESS = eINSTANCE.getJavaVariableAdress();

        /**
         * The meta object literal for the '{@link data.type.impl.JavaVirtualMachineNamedAddressImpl <em>Java Virtual Machine Named Address</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.JavaVirtualMachineNamedAddressImpl
         * @see data.type.impl.TypePackageImpl#getJavaVirtualMachineNamedAddress()
         * @generated
         */
        EClass JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS = eINSTANCE.getJavaVirtualMachineNamedAddress();

        /**
         * The meta object literal for the '{@link data.type.impl.MemoryPageImpl <em>Memory Page</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.MemoryPageImpl
         * @see data.type.impl.TypePackageImpl#getMemoryPage()
         * @generated
         */
        EClass MEMORY_PAGE = eINSTANCE.getMemoryPage();

        /**
         * The meta object literal for the '{@link data.type.impl.MinimalAddressableStorageUnitImpl <em>Minimal Addressable Storage Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.MinimalAddressableStorageUnitImpl
         * @see data.type.impl.TypePackageImpl#getMinimalAddressableStorageUnit()
         * @generated
         */
        EClass MINIMAL_ADDRESSABLE_STORAGE_UNIT = eINSTANCE.getMinimalAddressableStorageUnit();

        /**
         * The meta object literal for the '{@link data.type.impl.DataInterpretationImpl <em>Data Interpretation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.DataInterpretationImpl
         * @see data.type.impl.TypePackageImpl#getDataInterpretation()
         * @generated
         */
        EClass DATA_INTERPRETATION = eINSTANCE.getDataInterpretation();

        /**
         * The meta object literal for the '{@link data.type.impl.UTF8Impl <em>UTF8</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.UTF8Impl
         * @see data.type.impl.TypePackageImpl#getUTF8()
         * @generated
         */
        EClass UTF8 = eINSTANCE.getUTF8();

        /**
         * The meta object literal for the '{@link data.type.impl.VariableWidthEncodingImpl <em>Variable Width Encoding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.VariableWidthEncodingImpl
         * @see data.type.impl.TypePackageImpl#getVariableWidthEncoding()
         * @generated
         */
        EClass VARIABLE_WIDTH_ENCODING = eINSTANCE.getVariableWidthEncoding();

        /**
         * The meta object literal for the '{@link data.type.impl.TextEncodingImpl <em>Text Encoding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.TextEncodingImpl
         * @see data.type.impl.TypePackageImpl#getTextEncoding()
         * @generated
         */
        EClass TEXT_ENCODING = eINSTANCE.getTextEncoding();

        /**
         * The meta object literal for the '<em><b>Singletons</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_ENCODING__SINGLETONS = eINSTANCE.getTextEncoding_Singletons();

        /**
         * The meta object literal for the '<em><b>Lead Units</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT_ENCODING__LEAD_UNITS = eINSTANCE.getTextEncoding_LeadUnits();

        /**
         * The meta object literal for the '{@link data.type.impl.LeadUnitImpl <em>Lead Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.LeadUnitImpl
         * @see data.type.impl.TypePackageImpl#getLeadUnit()
         * @generated
         */
        EClass LEAD_UNIT = eINSTANCE.getLeadUnit();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LEAD_UNIT__VALUE = eINSTANCE.getLeadUnit_Value();

        /**
         * The meta object literal for the '<em><b>Trail Units</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LEAD_UNIT__TRAIL_UNITS = eINSTANCE.getLeadUnit_TrailUnits();

        /**
         * The meta object literal for the '{@link data.type.impl.TrailUnitImpl <em>Trail Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.TrailUnitImpl
         * @see data.type.impl.TypePackageImpl#getTrailUnit()
         * @generated
         */
        EClass TRAIL_UNIT = eINSTANCE.getTrailUnit();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAIL_UNIT__VALUE = eINSTANCE.getTrailUnit_Value();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAIL_UNIT__DESCRIPTION = eINSTANCE.getTrailUnit_Description();

        /**
         * The meta object literal for the '{@link data.type.impl.JavaScriptObjectNotationImpl <em>Java Script Object Notation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.impl.JavaScriptObjectNotationImpl
         * @see data.type.impl.TypePackageImpl#getJavaScriptObjectNotation()
         * @generated
         */
        EClass JAVA_SCRIPT_OBJECT_NOTATION = eINSTANCE.getJavaScriptObjectNotation();

        /**
         * The meta object literal for the '{@link data.type.AddressableStorageUnit <em>Addressable Storage Unit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.type.AddressableStorageUnit
         * @see data.type.impl.TypePackageImpl#getAddressableStorageUnit()
         * @generated
         */
        EEnum ADDRESSABLE_STORAGE_UNIT = eINSTANCE.getAddressableStorageUnit();

    }

} //TypePackage
