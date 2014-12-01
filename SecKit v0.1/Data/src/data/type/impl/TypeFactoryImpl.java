/**
 */
package data.type.impl;

import data.type.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TypePackage.DATA_TYPE_PACKAGE: return createDataTypePackage();
            case TypePackage.COMPOSITE_TYPE: return createCompositeType();
            case TypePackage.PRIMITIVE_TYPE: return createPrimitiveType();
            case TypePackage.DATA_PRODUCER_TYPE: return createDataProducerType();
            case TypePackage.DOMAIN_NAME_SERVICE: return createDomainNameService();
            case TypePackage.ENCODING: return createEncoding();
            case TypePackage.NAMED_ADDRESS_SPACE: return createNamedAddressSpace();
            case TypePackage.BIT_MEMORY_BLOCK: return createBitMemoryBlock();
            case TypePackage.FILE_SYSTEM_ADDRESS_SPACE: return createFileSystemAddressSpace();
            case TypePackage.MEMORY_ADDRESS_SPACE: return createMemoryAddressSpace();
            case TypePackage.BYTE_MEMORY_BLOCK: return createByteMemoryBlock();
            case TypePackage.FILE_NAME: return createFileName();
            case TypePackage.MEMORY_ADDRESS: return createMemoryAddress();
            case TypePackage.JAVA_VARIABLE_ADRESS: return createJavaVariableAdress();
            case TypePackage.JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS: return createJavaVirtualMachineNamedAddress();
            case TypePackage.MEMORY_PAGE: return createMemoryPage();
            case TypePackage.MINIMAL_ADDRESSABLE_STORAGE_UNIT: return createMinimalAddressableStorageUnit();
            case TypePackage.UTF8: return createUTF8();
            case TypePackage.VARIABLE_WIDTH_ENCODING: return createVariableWidthEncoding();
            case TypePackage.TEXT_ENCODING: return createTextEncoding();
            case TypePackage.LEAD_UNIT: return createLeadUnit();
            case TypePackage.TRAIL_UNIT: return createTrailUnit();
            case TypePackage.JAVA_SCRIPT_OBJECT_NOTATION: return createJavaScriptObjectNotation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case TypePackage.ADDRESSABLE_STORAGE_UNIT:
                return createAddressableStorageUnitFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case TypePackage.ADDRESSABLE_STORAGE_UNIT:
                return convertAddressableStorageUnitToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypePackage createDataTypePackage() {
        DataTypePackageImpl dataTypePackage = new DataTypePackageImpl();
        return dataTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompositeType createCompositeType() {
        CompositeTypeImpl compositeType = new CompositeTypeImpl();
        return compositeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveType createPrimitiveType() {
        PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataProducerType createDataProducerType() {
        DataProducerTypeImpl dataProducerType = new DataProducerTypeImpl();
        return dataProducerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DomainNameService createDomainNameService() {
        DomainNameServiceImpl domainNameService = new DomainNameServiceImpl();
        return domainNameService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Encoding createEncoding() {
        EncodingImpl encoding = new EncodingImpl();
        return encoding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedAddressSpace createNamedAddressSpace() {
        NamedAddressSpaceImpl namedAddressSpace = new NamedAddressSpaceImpl();
        return namedAddressSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BitMemoryBlock createBitMemoryBlock() {
        BitMemoryBlockImpl bitMemoryBlock = new BitMemoryBlockImpl();
        return bitMemoryBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileSystemAddressSpace createFileSystemAddressSpace() {
        FileSystemAddressSpaceImpl fileSystemAddressSpace = new FileSystemAddressSpaceImpl();
        return fileSystemAddressSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemoryAddressSpace createMemoryAddressSpace() {
        MemoryAddressSpaceImpl memoryAddressSpace = new MemoryAddressSpaceImpl();
        return memoryAddressSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ByteMemoryBlock createByteMemoryBlock() {
        ByteMemoryBlockImpl byteMemoryBlock = new ByteMemoryBlockImpl();
        return byteMemoryBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileName createFileName() {
        FileNameImpl fileName = new FileNameImpl();
        return fileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemoryAddress createMemoryAddress() {
        MemoryAddressImpl memoryAddress = new MemoryAddressImpl();
        return memoryAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaVariableAdress createJavaVariableAdress() {
        JavaVariableAdressImpl javaVariableAdress = new JavaVariableAdressImpl();
        return javaVariableAdress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaVirtualMachineNamedAddress createJavaVirtualMachineNamedAddress() {
        JavaVirtualMachineNamedAddressImpl javaVirtualMachineNamedAddress = new JavaVirtualMachineNamedAddressImpl();
        return javaVirtualMachineNamedAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemoryPage createMemoryPage() {
        MemoryPageImpl memoryPage = new MemoryPageImpl();
        return memoryPage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinimalAddressableStorageUnit createMinimalAddressableStorageUnit() {
        MinimalAddressableStorageUnitImpl minimalAddressableStorageUnit = new MinimalAddressableStorageUnitImpl();
        return minimalAddressableStorageUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UTF8 createUTF8() {
        UTF8Impl utf8 = new UTF8Impl();
        return utf8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableWidthEncoding createVariableWidthEncoding() {
        VariableWidthEncodingImpl variableWidthEncoding = new VariableWidthEncodingImpl();
        return variableWidthEncoding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextEncoding createTextEncoding() {
        TextEncodingImpl textEncoding = new TextEncodingImpl();
        return textEncoding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LeadUnit createLeadUnit() {
        LeadUnitImpl leadUnit = new LeadUnitImpl();
        return leadUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrailUnit createTrailUnit() {
        TrailUnitImpl trailUnit = new TrailUnitImpl();
        return trailUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaScriptObjectNotation createJavaScriptObjectNotation() {
        JavaScriptObjectNotationImpl javaScriptObjectNotation = new JavaScriptObjectNotationImpl();
        return javaScriptObjectNotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressableStorageUnit createAddressableStorageUnitFromString(EDataType eDataType, String initialValue) {
        AddressableStorageUnit result = AddressableStorageUnit.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAddressableStorageUnitToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
