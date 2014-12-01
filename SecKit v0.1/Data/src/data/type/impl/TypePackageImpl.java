/**
 */
package data.type.impl;

import data.DataPackage;

import data.action.ActionPackage;

import data.action.impl.ActionPackageImpl;

import data.event.EventPackage;

import data.event.impl.EventPackageImpl;

import data.impl.DataPackageImpl;

import data.instance.InstancePackage;

import data.instance.impl.InstancePackageImpl;

import data.instantiation.InstantiationPackage;

import data.instantiation.impl.InstantiationPackageImpl;

import data.pattern.PatternPackage;

import data.pattern.impl.PatternPackageImpl;

import data.type.AddressSpaceType;
import data.type.AddressType;
import data.type.AddressableStorageUnit;
import data.type.BitMemoryBlock;
import data.type.ByteMemoryBlock;
import data.type.CompositeType;
import data.type.DataInterpretation;
import data.type.DataProducerType;
import data.type.DataType;
import data.type.DataTypePackage;
import data.type.DomainNameService;
import data.type.Encoding;
import data.type.FileName;
import data.type.FileSystemAddressSpace;
import data.type.JavaScriptObjectNotation;
import data.type.JavaVariableAdress;
import data.type.JavaVirtualMachineNamedAddress;
import data.type.LeadUnit;
import data.type.MemoryAddress;
import data.type.MemoryAddressSpace;
import data.type.MemoryPage;
import data.type.MinimalAddressableStorageUnit;
import data.type.NamedAddressSpace;
import data.type.PrimitiveType;
import data.type.TextEncoding;
import data.type.TrailUnit;
import data.type.TypeFactory;
import data.type.TypePackage;
import data.type.VariableWidthEncoding;

import data.variable.VariablePackage;

import data.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compositeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressSpaceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass domainNameServiceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass encodingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedAddressSpaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bitMemoryBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileSystemAddressSpaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memoryAddressSpaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass byteMemoryBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memoryAddressEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaVariableAdressEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaVirtualMachineNamedAddressEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memoryPageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minimalAddressableStorageUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInterpretationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass utf8EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableWidthEncodingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textEncodingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass leadUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trailUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaScriptObjectNotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum addressableStorageUnitEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see data.type.TypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TypePackageImpl() {
        super(eNS_URI, TypeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TypePackage init() {
        if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Obtain or create and register package
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RulePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theDataPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTypePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
        return theTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataTypePackage() {
        return dataTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataTypePackage_DataTypes() {
        return (EReference)dataTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataTypePackage_EPackage() {
        return (EReference)dataTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataTypePackage_SuPackages() {
        return (EReference)dataTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataTypePackage_SuperPackages() {
        return (EReference)dataTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataType() {
        return dataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataType_EType() {
        return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataType_Instantiations() {
        return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataType_Name() {
        return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataType_Instances() {
        return (EReference)dataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompositeType() {
        return compositeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompositeType_Attributes() {
        return (EReference)compositeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrimitiveType() {
        return primitiveTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataProducerType() {
        return dataProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAddressSpaceType() {
        return addressSpaceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressSpaceType_Instantiations() {
        return (EReference)addressSpaceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressSpaceType_AddressType() {
        return (EReference)addressSpaceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAddressType() {
        return addressTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressType_Instantiations() {
        return (EReference)addressTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDomainNameService() {
        return domainNameServiceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEncoding() {
        return encodingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedAddressSpace() {
        return namedAddressSpaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBitMemoryBlock() {
        return bitMemoryBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileSystemAddressSpace() {
        return fileSystemAddressSpaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemoryAddressSpace() {
        return memoryAddressSpaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getByteMemoryBlock() {
        return byteMemoryBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileName() {
        return fileNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemoryAddress() {
        return memoryAddressEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJavaVariableAdress() {
        return javaVariableAdressEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJavaVirtualMachineNamedAddress() {
        return javaVirtualMachineNamedAddressEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemoryPage() {
        return memoryPageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMinimalAddressableStorageUnit() {
        return minimalAddressableStorageUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInterpretation() {
        return dataInterpretationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUTF8() {
        return utf8EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableWidthEncoding() {
        return variableWidthEncodingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextEncoding() {
        return textEncodingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextEncoding_Singletons() {
        return (EAttribute)textEncodingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextEncoding_LeadUnits() {
        return (EReference)textEncodingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLeadUnit() {
        return leadUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLeadUnit_Value() {
        return (EAttribute)leadUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLeadUnit_TrailUnits() {
        return (EReference)leadUnitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrailUnit() {
        return trailUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTrailUnit_Value() {
        return (EAttribute)trailUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTrailUnit_Description() {
        return (EAttribute)trailUnitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJavaScriptObjectNotation() {
        return javaScriptObjectNotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAddressableStorageUnit() {
        return addressableStorageUnitEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactory getTypeFactory() {
        return (TypeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        dataTypePackageEClass = createEClass(DATA_TYPE_PACKAGE);
        createEReference(dataTypePackageEClass, DATA_TYPE_PACKAGE__DATA_TYPES);
        createEReference(dataTypePackageEClass, DATA_TYPE_PACKAGE__EPACKAGE);
        createEReference(dataTypePackageEClass, DATA_TYPE_PACKAGE__SU_PACKAGES);
        createEReference(dataTypePackageEClass, DATA_TYPE_PACKAGE__SUPER_PACKAGES);

        dataTypeEClass = createEClass(DATA_TYPE);
        createEReference(dataTypeEClass, DATA_TYPE__ETYPE);
        createEReference(dataTypeEClass, DATA_TYPE__INSTANTIATIONS);
        createEAttribute(dataTypeEClass, DATA_TYPE__NAME);
        createEReference(dataTypeEClass, DATA_TYPE__INSTANCES);

        compositeTypeEClass = createEClass(COMPOSITE_TYPE);
        createEReference(compositeTypeEClass, COMPOSITE_TYPE__ATTRIBUTES);

        primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

        dataProducerTypeEClass = createEClass(DATA_PRODUCER_TYPE);

        addressSpaceTypeEClass = createEClass(ADDRESS_SPACE_TYPE);
        createEReference(addressSpaceTypeEClass, ADDRESS_SPACE_TYPE__INSTANTIATIONS);
        createEReference(addressSpaceTypeEClass, ADDRESS_SPACE_TYPE__ADDRESS_TYPE);

        addressTypeEClass = createEClass(ADDRESS_TYPE);
        createEReference(addressTypeEClass, ADDRESS_TYPE__INSTANTIATIONS);

        domainNameServiceEClass = createEClass(DOMAIN_NAME_SERVICE);

        encodingEClass = createEClass(ENCODING);

        namedAddressSpaceEClass = createEClass(NAMED_ADDRESS_SPACE);

        bitMemoryBlockEClass = createEClass(BIT_MEMORY_BLOCK);

        fileSystemAddressSpaceEClass = createEClass(FILE_SYSTEM_ADDRESS_SPACE);

        memoryAddressSpaceEClass = createEClass(MEMORY_ADDRESS_SPACE);

        byteMemoryBlockEClass = createEClass(BYTE_MEMORY_BLOCK);

        fileNameEClass = createEClass(FILE_NAME);

        memoryAddressEClass = createEClass(MEMORY_ADDRESS);

        javaVariableAdressEClass = createEClass(JAVA_VARIABLE_ADRESS);

        javaVirtualMachineNamedAddressEClass = createEClass(JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS);

        memoryPageEClass = createEClass(MEMORY_PAGE);

        minimalAddressableStorageUnitEClass = createEClass(MINIMAL_ADDRESSABLE_STORAGE_UNIT);

        dataInterpretationEClass = createEClass(DATA_INTERPRETATION);

        utf8EClass = createEClass(UTF8);

        variableWidthEncodingEClass = createEClass(VARIABLE_WIDTH_ENCODING);

        textEncodingEClass = createEClass(TEXT_ENCODING);
        createEAttribute(textEncodingEClass, TEXT_ENCODING__SINGLETONS);
        createEReference(textEncodingEClass, TEXT_ENCODING__LEAD_UNITS);

        leadUnitEClass = createEClass(LEAD_UNIT);
        createEAttribute(leadUnitEClass, LEAD_UNIT__VALUE);
        createEReference(leadUnitEClass, LEAD_UNIT__TRAIL_UNITS);

        trailUnitEClass = createEClass(TRAIL_UNIT);
        createEAttribute(trailUnitEClass, TRAIL_UNIT__VALUE);
        createEAttribute(trailUnitEClass, TRAIL_UNIT__DESCRIPTION);

        javaScriptObjectNotationEClass = createEClass(JAVA_SCRIPT_OBJECT_NOTATION);

        // Create enums
        addressableStorageUnitEEnum = createEEnum(ADDRESSABLE_STORAGE_UNIT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        dataTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        compositeTypeEClass.getESuperTypes().add(this.getDataType());
        primitiveTypeEClass.getESuperTypes().add(this.getDataType());
        domainNameServiceEClass.getESuperTypes().add(this.getAddressSpaceType());
        encodingEClass.getESuperTypes().add(this.getDataInterpretation());
        namedAddressSpaceEClass.getESuperTypes().add(this.getAddressSpaceType());
        bitMemoryBlockEClass.getESuperTypes().add(theInstancePackage.getRegion());
        fileSystemAddressSpaceEClass.getESuperTypes().add(this.getAddressSpaceType());
        memoryAddressSpaceEClass.getESuperTypes().add(this.getAddressSpaceType());
        byteMemoryBlockEClass.getESuperTypes().add(theInstancePackage.getRegion());
        fileNameEClass.getESuperTypes().add(theInstancePackage.getAddress());
        memoryAddressEClass.getESuperTypes().add(theInstancePackage.getAddress());
        javaVariableAdressEClass.getESuperTypes().add(this.getAddressType());
        memoryPageEClass.getESuperTypes().add(this.getByteMemoryBlock());
        utf8EClass.getESuperTypes().add(this.getVariableWidthEncoding());
        variableWidthEncodingEClass.getESuperTypes().add(this.getTextEncoding());
        textEncodingEClass.getESuperTypes().add(this.getEncoding());

        // Initialize classes, features, and operations; add parameters
        initEClass(dataTypePackageEClass, DataTypePackage.class, "DataTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataTypePackage_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, DataTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataTypePackage_EPackage(), ecorePackage.getEPackage(), null, "ePackage", null, 0, 1, DataTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataTypePackage_SuPackages(), this.getDataTypePackage(), this.getDataTypePackage_SuperPackages(), "suPackages", null, 0, -1, DataTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataTypePackage_SuperPackages(), this.getDataTypePackage(), this.getDataTypePackage_SuPackages(), "superPackages", null, 0, 1, DataTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataType_EType(), ecorePackage.getEClassifier(), null, "eType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataType_Instantiations(), theInstantiationPackage.getAbstractDataInstantiation(), theInstantiationPackage.getAbstractDataInstantiation_Type(), "instantiations", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataType_Instances(), theInstancePackage.getData(), theInstancePackage.getData_Type(), "instances", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compositeTypeEClass, CompositeType.class, "CompositeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompositeType_Attributes(), theInstantiationPackage.getDataInstantiation(), null, "attributes", null, 0, -1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataProducerTypeEClass, DataProducerType.class, "DataProducerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(addressSpaceTypeEClass, AddressSpaceType.class, "AddressSpaceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddressSpaceType_Instantiations(), theInstantiationPackage.getAddressSpaceInstantiation(), theInstantiationPackage.getAddressSpaceInstantiation_Type(), "instantiations", null, 0, -1, AddressSpaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAddressSpaceType_AddressType(), this.getAddressType(), null, "addressType", null, 0, 1, AddressSpaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(addressTypeEClass, AddressType.class, "AddressType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddressType_Instantiations(), theInstantiationPackage.getAddressInstantiation(), theInstantiationPackage.getAddressInstantiation_Type(), "instantiations", null, 0, -1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(domainNameServiceEClass, DomainNameService.class, "DomainNameService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(encodingEClass, Encoding.class, "Encoding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(namedAddressSpaceEClass, NamedAddressSpace.class, "NamedAddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bitMemoryBlockEClass, BitMemoryBlock.class, "BitMemoryBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileSystemAddressSpaceEClass, FileSystemAddressSpace.class, "FileSystemAddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memoryAddressSpaceEClass, MemoryAddressSpace.class, "MemoryAddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(byteMemoryBlockEClass, ByteMemoryBlock.class, "ByteMemoryBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileNameEClass, FileName.class, "FileName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memoryAddressEClass, MemoryAddress.class, "MemoryAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(javaVariableAdressEClass, JavaVariableAdress.class, "JavaVariableAdress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(javaVirtualMachineNamedAddressEClass, JavaVirtualMachineNamedAddress.class, "JavaVirtualMachineNamedAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memoryPageEClass, MemoryPage.class, "MemoryPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(minimalAddressableStorageUnitEClass, MinimalAddressableStorageUnit.class, "MinimalAddressableStorageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataInterpretationEClass, DataInterpretation.class, "DataInterpretation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(utf8EClass, data.type.UTF8.class, "UTF8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(variableWidthEncodingEClass, VariableWidthEncoding.class, "VariableWidthEncoding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(textEncodingEClass, TextEncoding.class, "TextEncoding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextEncoding_Singletons(), ecorePackage.getEByteArray(), "singletons", null, 0, 1, TextEncoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTextEncoding_LeadUnits(), this.getLeadUnit(), null, "leadUnits", null, 0, -1, TextEncoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(leadUnitEClass, LeadUnit.class, "LeadUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLeadUnit_Value(), ecorePackage.getEByteArray(), "value", null, 0, 1, LeadUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLeadUnit_TrailUnits(), this.getTrailUnit(), null, "trailUnits", null, 0, -1, LeadUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trailUnitEClass, TrailUnit.class, "TrailUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTrailUnit_Value(), ecorePackage.getEByteArray(), "value", null, 0, 1, TrailUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrailUnit_Description(), ecorePackage.getEString(), "description", null, 0, 1, TrailUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(javaScriptObjectNotationEClass, JavaScriptObjectNotation.class, "JavaScriptObjectNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(addressableStorageUnitEEnum, AddressableStorageUnit.class, "AddressableStorageUnit");
        addEEnumLiteral(addressableStorageUnitEEnum, AddressableStorageUnit.BIT);
        addEEnumLiteral(addressableStorageUnitEEnum, AddressableStorageUnit.BYTE);
    }

} //TypePackageImpl
