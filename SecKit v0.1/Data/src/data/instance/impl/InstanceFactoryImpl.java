/**
 */
package data.instance.impl;

import data.instance.*;

import org.eclipse.emf.ecore.EClass;
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
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstanceFactory init() {
        try {
            InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
            if (theInstanceFactory != null) {
                return theInstanceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstanceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactoryImpl() {
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
            case InstancePackage.BLOCK: return createBlock();
            case InstancePackage.SEGMENT: return createSegment();
            case InstancePackage.REGION: return createRegion();
            case InstancePackage.DATA: return createData();
            case InstancePackage.NUMBER_OF_BYTES: return createNumberOfBytes();
            case InstancePackage.COMPLETE_DATA: return createCompleteData();
            case InstancePackage.ADRESS_SPACE: return createAdressSpace();
            case InstancePackage.ADDRESSABLE: return createAddressable();
            case InstancePackage.CONTENT: return createContent();
            case InstancePackage.MEMORY: return createMemory();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Block createBlock() {
        BlockImpl block = new BlockImpl();
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Segment createSegment() {
        SegmentImpl segment = new SegmentImpl();
        return segment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region createRegion() {
        RegionImpl region = new RegionImpl();
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data createData() {
        DataImpl data = new DataImpl();
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberOfBytes createNumberOfBytes() {
        NumberOfBytesImpl numberOfBytes = new NumberOfBytesImpl();
        return numberOfBytes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompleteData createCompleteData() {
        CompleteDataImpl completeData = new CompleteDataImpl();
        return completeData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdressSpace createAdressSpace() {
        AdressSpaceImpl adressSpace = new AdressSpaceImpl();
        return adressSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Addressable createAddressable() {
        AddressableImpl addressable = new AddressableImpl();
        return addressable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Content createContent() {
        ContentImpl content = new ContentImpl();
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Memory createMemory() {
        MemoryImpl memory = new MemoryImpl();
        return memory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstancePackage getInstancePackage() {
        return (InstancePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstancePackage getPackage() {
        return InstancePackage.eINSTANCE;
    }

} //InstanceFactoryImpl
