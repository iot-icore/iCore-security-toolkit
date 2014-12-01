/**
 */
package data.type.util;

import data.instance.Address;
import data.instance.Region;

import data.type.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see data.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseDataTypePackage(DataTypePackage object) {
                return createDataTypePackageAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public Adapter caseCompositeType(CompositeType object) {
                return createCompositeTypeAdapter();
            }
            @Override
            public Adapter casePrimitiveType(PrimitiveType object) {
                return createPrimitiveTypeAdapter();
            }
            @Override
            public Adapter caseDataProducerType(DataProducerType object) {
                return createDataProducerTypeAdapter();
            }
            @Override
            public Adapter caseAddressSpaceType(AddressSpaceType object) {
                return createAddressSpaceTypeAdapter();
            }
            @Override
            public Adapter caseAddressType(AddressType object) {
                return createAddressTypeAdapter();
            }
            @Override
            public Adapter caseDomainNameService(DomainNameService object) {
                return createDomainNameServiceAdapter();
            }
            @Override
            public Adapter caseEncoding(Encoding object) {
                return createEncodingAdapter();
            }
            @Override
            public Adapter caseNamedAddressSpace(NamedAddressSpace object) {
                return createNamedAddressSpaceAdapter();
            }
            @Override
            public Adapter caseBitMemoryBlock(BitMemoryBlock object) {
                return createBitMemoryBlockAdapter();
            }
            @Override
            public Adapter caseFileSystemAddressSpace(FileSystemAddressSpace object) {
                return createFileSystemAddressSpaceAdapter();
            }
            @Override
            public Adapter caseMemoryAddressSpace(MemoryAddressSpace object) {
                return createMemoryAddressSpaceAdapter();
            }
            @Override
            public Adapter caseByteMemoryBlock(ByteMemoryBlock object) {
                return createByteMemoryBlockAdapter();
            }
            @Override
            public Adapter caseFileName(FileName object) {
                return createFileNameAdapter();
            }
            @Override
            public Adapter caseMemoryAddress(MemoryAddress object) {
                return createMemoryAddressAdapter();
            }
            @Override
            public Adapter caseJavaVariableAdress(JavaVariableAdress object) {
                return createJavaVariableAdressAdapter();
            }
            @Override
            public Adapter caseJavaVirtualMachineNamedAddress(JavaVirtualMachineNamedAddress object) {
                return createJavaVirtualMachineNamedAddressAdapter();
            }
            @Override
            public Adapter caseMemoryPage(MemoryPage object) {
                return createMemoryPageAdapter();
            }
            @Override
            public Adapter caseMinimalAddressableStorageUnit(MinimalAddressableStorageUnit object) {
                return createMinimalAddressableStorageUnitAdapter();
            }
            @Override
            public Adapter caseDataInterpretation(DataInterpretation object) {
                return createDataInterpretationAdapter();
            }
            @Override
            public Adapter caseUTF8(UTF8 object) {
                return createUTF8Adapter();
            }
            @Override
            public Adapter caseVariableWidthEncoding(VariableWidthEncoding object) {
                return createVariableWidthEncodingAdapter();
            }
            @Override
            public Adapter caseTextEncoding(TextEncoding object) {
                return createTextEncodingAdapter();
            }
            @Override
            public Adapter caseLeadUnit(LeadUnit object) {
                return createLeadUnitAdapter();
            }
            @Override
            public Adapter caseTrailUnit(TrailUnit object) {
                return createTrailUnitAdapter();
            }
            @Override
            public Adapter caseJavaScriptObjectNotation(JavaScriptObjectNotation object) {
                return createJavaScriptObjectNotationAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseRegion(Region object) {
                return createRegionAdapter();
            }
            @Override
            public Adapter caseAddress(Address object) {
                return createAddressAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link data.type.DataTypePackage <em>Data Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DataTypePackage
     * @generated
     */
    public Adapter createDataTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.CompositeType <em>Composite Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.CompositeType
     * @generated
     */
    public Adapter createCompositeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.PrimitiveType
     * @generated
     */
    public Adapter createPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.DataProducerType <em>Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DataProducerType
     * @generated
     */
    public Adapter createDataProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.AddressSpaceType <em>Address Space Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.AddressSpaceType
     * @generated
     */
    public Adapter createAddressSpaceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.AddressType <em>Address Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.AddressType
     * @generated
     */
    public Adapter createAddressTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.DomainNameService <em>Domain Name Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DomainNameService
     * @generated
     */
    public Adapter createDomainNameServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.Encoding <em>Encoding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.Encoding
     * @generated
     */
    public Adapter createEncodingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.NamedAddressSpace <em>Named Address Space</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.NamedAddressSpace
     * @generated
     */
    public Adapter createNamedAddressSpaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.BitMemoryBlock <em>Bit Memory Block</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.BitMemoryBlock
     * @generated
     */
    public Adapter createBitMemoryBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.FileSystemAddressSpace <em>File System Address Space</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.FileSystemAddressSpace
     * @generated
     */
    public Adapter createFileSystemAddressSpaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.MemoryAddressSpace <em>Memory Address Space</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.MemoryAddressSpace
     * @generated
     */
    public Adapter createMemoryAddressSpaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.ByteMemoryBlock <em>Byte Memory Block</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.ByteMemoryBlock
     * @generated
     */
    public Adapter createByteMemoryBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.FileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.FileName
     * @generated
     */
    public Adapter createFileNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.MemoryAddress <em>Memory Address</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.MemoryAddress
     * @generated
     */
    public Adapter createMemoryAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.JavaVariableAdress <em>Java Variable Adress</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.JavaVariableAdress
     * @generated
     */
    public Adapter createJavaVariableAdressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.JavaVirtualMachineNamedAddress <em>Java Virtual Machine Named Address</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.JavaVirtualMachineNamedAddress
     * @generated
     */
    public Adapter createJavaVirtualMachineNamedAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.MemoryPage <em>Memory Page</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.MemoryPage
     * @generated
     */
    public Adapter createMemoryPageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.MinimalAddressableStorageUnit <em>Minimal Addressable Storage Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.MinimalAddressableStorageUnit
     * @generated
     */
    public Adapter createMinimalAddressableStorageUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.DataInterpretation <em>Data Interpretation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DataInterpretation
     * @generated
     */
    public Adapter createDataInterpretationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.UTF8 <em>UTF8</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.UTF8
     * @generated
     */
    public Adapter createUTF8Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.VariableWidthEncoding <em>Variable Width Encoding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.VariableWidthEncoding
     * @generated
     */
    public Adapter createVariableWidthEncodingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.TextEncoding <em>Text Encoding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.TextEncoding
     * @generated
     */
    public Adapter createTextEncodingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.LeadUnit <em>Lead Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.LeadUnit
     * @generated
     */
    public Adapter createLeadUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.TrailUnit <em>Trail Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.TrailUnit
     * @generated
     */
    public Adapter createTrailUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.type.JavaScriptObjectNotation <em>Java Script Object Notation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.JavaScriptObjectNotation
     * @generated
     */
    public Adapter createJavaScriptObjectNotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Region
     * @generated
     */
    public Adapter createRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Address <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Address
     * @generated
     */
    public Adapter createAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeAdapterFactory
