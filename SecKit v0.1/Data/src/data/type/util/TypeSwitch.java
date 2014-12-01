/**
 */
package data.type.util;

import data.instance.Address;
import data.instance.Region;

import data.type.*;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see data.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TypePackage.DATA_TYPE_PACKAGE: {
                DataTypePackage dataTypePackage = (DataTypePackage)theEObject;
                T result = caseDataTypePackage(dataTypePackage);
                if (result == null) result = caseElement(dataTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_TYPE: {
                DataType dataType = (DataType)theEObject;
                T result = caseDataType(dataType);
                if (result == null) result = caseElement(dataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COMPOSITE_TYPE: {
                CompositeType compositeType = (CompositeType)theEObject;
                T result = caseCompositeType(compositeType);
                if (result == null) result = caseDataType(compositeType);
                if (result == null) result = caseElement(compositeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PRIMITIVE_TYPE: {
                PrimitiveType primitiveType = (PrimitiveType)theEObject;
                T result = casePrimitiveType(primitiveType);
                if (result == null) result = caseDataType(primitiveType);
                if (result == null) result = caseElement(primitiveType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_PRODUCER_TYPE: {
                DataProducerType dataProducerType = (DataProducerType)theEObject;
                T result = caseDataProducerType(dataProducerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ADDRESS_SPACE_TYPE: {
                AddressSpaceType addressSpaceType = (AddressSpaceType)theEObject;
                T result = caseAddressSpaceType(addressSpaceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ADDRESS_TYPE: {
                AddressType addressType = (AddressType)theEObject;
                T result = caseAddressType(addressType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DOMAIN_NAME_SERVICE: {
                DomainNameService domainNameService = (DomainNameService)theEObject;
                T result = caseDomainNameService(domainNameService);
                if (result == null) result = caseAddressSpaceType(domainNameService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENCODING: {
                Encoding encoding = (Encoding)theEObject;
                T result = caseEncoding(encoding);
                if (result == null) result = caseDataInterpretation(encoding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NAMED_ADDRESS_SPACE: {
                NamedAddressSpace namedAddressSpace = (NamedAddressSpace)theEObject;
                T result = caseNamedAddressSpace(namedAddressSpace);
                if (result == null) result = caseAddressSpaceType(namedAddressSpace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BIT_MEMORY_BLOCK: {
                BitMemoryBlock bitMemoryBlock = (BitMemoryBlock)theEObject;
                T result = caseBitMemoryBlock(bitMemoryBlock);
                if (result == null) result = caseRegion(bitMemoryBlock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.FILE_SYSTEM_ADDRESS_SPACE: {
                FileSystemAddressSpace fileSystemAddressSpace = (FileSystemAddressSpace)theEObject;
                T result = caseFileSystemAddressSpace(fileSystemAddressSpace);
                if (result == null) result = caseAddressSpaceType(fileSystemAddressSpace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MEMORY_ADDRESS_SPACE: {
                MemoryAddressSpace memoryAddressSpace = (MemoryAddressSpace)theEObject;
                T result = caseMemoryAddressSpace(memoryAddressSpace);
                if (result == null) result = caseAddressSpaceType(memoryAddressSpace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BYTE_MEMORY_BLOCK: {
                ByteMemoryBlock byteMemoryBlock = (ByteMemoryBlock)theEObject;
                T result = caseByteMemoryBlock(byteMemoryBlock);
                if (result == null) result = caseRegion(byteMemoryBlock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.FILE_NAME: {
                FileName fileName = (FileName)theEObject;
                T result = caseFileName(fileName);
                if (result == null) result = caseAddress(fileName);
                if (result == null) result = caseElement(fileName);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MEMORY_ADDRESS: {
                MemoryAddress memoryAddress = (MemoryAddress)theEObject;
                T result = caseMemoryAddress(memoryAddress);
                if (result == null) result = caseAddress(memoryAddress);
                if (result == null) result = caseElement(memoryAddress);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.JAVA_VARIABLE_ADRESS: {
                JavaVariableAdress javaVariableAdress = (JavaVariableAdress)theEObject;
                T result = caseJavaVariableAdress(javaVariableAdress);
                if (result == null) result = caseAddressType(javaVariableAdress);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.JAVA_VIRTUAL_MACHINE_NAMED_ADDRESS: {
                JavaVirtualMachineNamedAddress javaVirtualMachineNamedAddress = (JavaVirtualMachineNamedAddress)theEObject;
                T result = caseJavaVirtualMachineNamedAddress(javaVirtualMachineNamedAddress);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MEMORY_PAGE: {
                MemoryPage memoryPage = (MemoryPage)theEObject;
                T result = caseMemoryPage(memoryPage);
                if (result == null) result = caseByteMemoryBlock(memoryPage);
                if (result == null) result = caseRegion(memoryPage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MINIMAL_ADDRESSABLE_STORAGE_UNIT: {
                MinimalAddressableStorageUnit minimalAddressableStorageUnit = (MinimalAddressableStorageUnit)theEObject;
                T result = caseMinimalAddressableStorageUnit(minimalAddressableStorageUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_INTERPRETATION: {
                DataInterpretation dataInterpretation = (DataInterpretation)theEObject;
                T result = caseDataInterpretation(dataInterpretation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.UTF8: {
                UTF8 utf8 = (UTF8)theEObject;
                T result = caseUTF8(utf8);
                if (result == null) result = caseVariableWidthEncoding(utf8);
                if (result == null) result = caseTextEncoding(utf8);
                if (result == null) result = caseEncoding(utf8);
                if (result == null) result = caseDataInterpretation(utf8);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.VARIABLE_WIDTH_ENCODING: {
                VariableWidthEncoding variableWidthEncoding = (VariableWidthEncoding)theEObject;
                T result = caseVariableWidthEncoding(variableWidthEncoding);
                if (result == null) result = caseTextEncoding(variableWidthEncoding);
                if (result == null) result = caseEncoding(variableWidthEncoding);
                if (result == null) result = caseDataInterpretation(variableWidthEncoding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TEXT_ENCODING: {
                TextEncoding textEncoding = (TextEncoding)theEObject;
                T result = caseTextEncoding(textEncoding);
                if (result == null) result = caseEncoding(textEncoding);
                if (result == null) result = caseDataInterpretation(textEncoding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.LEAD_UNIT: {
                LeadUnit leadUnit = (LeadUnit)theEObject;
                T result = caseLeadUnit(leadUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TRAIL_UNIT: {
                TrailUnit trailUnit = (TrailUnit)theEObject;
                T result = caseTrailUnit(trailUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.JAVA_SCRIPT_OBJECT_NOTATION: {
                JavaScriptObjectNotation javaScriptObjectNotation = (JavaScriptObjectNotation)theEObject;
                T result = caseJavaScriptObjectNotation(javaScriptObjectNotation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypePackage(DataTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeType(CompositeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitiveType(PrimitiveType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProducerType(DataProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressSpaceType(AddressSpaceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressType(AddressType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Domain Name Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Domain Name Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDomainNameService(DomainNameService object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEncoding(Encoding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Address Space</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Address Space</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedAddressSpace(NamedAddressSpace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bit Memory Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bit Memory Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBitMemoryBlock(BitMemoryBlock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File System Address Space</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File System Address Space</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileSystemAddressSpace(FileSystemAddressSpace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory Address Space</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory Address Space</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryAddressSpace(MemoryAddressSpace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Byte Memory Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Byte Memory Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseByteMemoryBlock(ByteMemoryBlock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileName(FileName object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryAddress(MemoryAddress object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Variable Adress</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Variable Adress</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaVariableAdress(JavaVariableAdress object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Virtual Machine Named Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Virtual Machine Named Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaVirtualMachineNamedAddress(JavaVirtualMachineNamedAddress object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory Page</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory Page</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryPage(MemoryPage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Minimal Addressable Storage Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Minimal Addressable Storage Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinimalAddressableStorageUnit(MinimalAddressableStorageUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Interpretation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Interpretation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInterpretation(DataInterpretation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UTF8</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UTF8</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUTF8(UTF8 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Width Encoding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Width Encoding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableWidthEncoding(VariableWidthEncoding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Encoding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Encoding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextEncoding(TextEncoding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lead Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lead Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLeadUnit(LeadUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trail Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trail Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTrailUnit(TrailUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Script Object Notation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Script Object Notation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaScriptObjectNotation(JavaScriptObjectNotation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegion(Region object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddress(Address object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //TypeSwitch
