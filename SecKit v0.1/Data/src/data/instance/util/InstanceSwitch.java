/**
 */
package data.instance.util;

import data.instance.*;

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
 * @see data.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceSwitch() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
            case InstancePackage.BLOCK: {
                Block block = (Block)theEObject;
                T result = caseBlock(block);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.SEGMENT: {
                Segment segment = (Segment)theEObject;
                T result = caseSegment(segment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.REGION: {
                Region region = (Region)theEObject;
                T result = caseRegion(region);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.DATA: {
                Data data = (Data)theEObject;
                T result = caseData(data);
                if (result == null) result = caseAbstractDataInstance(data);
                if (result == null) result = caseAddressable(data);
                if (result == null) result = caseElement(data);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ABSTRACT_DATA_INSTANCE: {
                AbstractDataInstance abstractDataInstance = (AbstractDataInstance)theEObject;
                T result = caseAbstractDataInstance(abstractDataInstance);
                if (result == null) result = caseElement(abstractDataInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.STATIC_DATA: {
                StaticData staticData = (StaticData)theEObject;
                T result = caseStaticData(staticData);
                if (result == null) result = caseData(staticData);
                if (result == null) result = caseAbstractDataInstance(staticData);
                if (result == null) result = caseAddressable(staticData);
                if (result == null) result = caseElement(staticData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.DYNAMIC_DATA: {
                DynamicData dynamicData = (DynamicData)theEObject;
                T result = caseDynamicData(dynamicData);
                if (result == null) result = caseData(dynamicData);
                if (result == null) result = caseAbstractDataInstance(dynamicData);
                if (result == null) result = caseAddressable(dynamicData);
                if (result == null) result = caseElement(dynamicData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.DATA_SET: {
                DataSet dataSet = (DataSet)theEObject;
                T result = caseDataSet(dataSet);
                if (result == null) result = caseTaintTag(dataSet);
                if (result == null) result = caseElement(dataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.DATA_QUANTITY: {
                DataQuantity dataQuantity = (DataQuantity)theEObject;
                T result = caseDataQuantity(dataQuantity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.TAINT_TAG: {
                TaintTag taintTag = (TaintTag)theEObject;
                T result = caseTaintTag(taintTag);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.NUMBER_OF_BYTES: {
                NumberOfBytes numberOfBytes = (NumberOfBytes)theEObject;
                T result = caseNumberOfBytes(numberOfBytes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.COMPLETE_DATA: {
                CompleteData completeData = (CompleteData)theEObject;
                T result = caseCompleteData(completeData);
                if (result == null) result = caseDataQuantity(completeData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.PARTIAL_DATA: {
                PartialData partialData = (PartialData)theEObject;
                T result = casePartialData(partialData);
                if (result == null) result = caseDataQuantity(partialData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.BYTE_OFF_SET: {
                ByteOffSet byteOffSet = (ByteOffSet)theEObject;
                T result = caseByteOffSet(byteOffSet);
                if (result == null) result = casePartialData(byteOffSet);
                if (result == null) result = caseDataQuantity(byteOffSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ADDRESS: {
                Address address = (Address)theEObject;
                T result = caseAddress(address);
                if (result == null) result = caseElement(address);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ADRESS_SPACE: {
                AdressSpace adressSpace = (AdressSpace)theEObject;
                T result = caseAdressSpace(adressSpace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ADDRESSABLE: {
                Addressable addressable = (Addressable)theEObject;
                T result = caseAddressable(addressable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.CONTENT: {
                Content content = (Content)theEObject;
                T result = caseContent(content);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.MEMORY: {
                Memory memory = (Memory)theEObject;
                T result = caseMemory(memory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlock(Block object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSegment(Segment object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseData(Data object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataInstance(AbstractDataInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticData(StaticData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dynamic Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dynamic Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynamicData(DynamicData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSet(DataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Quantity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataQuantity(DataQuantity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Taint Tag</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Taint Tag</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaintTag(TaintTag object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Number Of Bytes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Number Of Bytes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberOfBytes(NumberOfBytes object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complete Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complete Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompleteData(CompleteData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Partial Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Partial Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePartialData(PartialData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Byte Off Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Byte Off Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseByteOffSet(ByteOffSet object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Adress Space</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Adress Space</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdressSpace(AdressSpace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Addressable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Addressable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressable(Addressable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContent(Content object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemory(Memory object) {
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

} //InstanceSwitch
