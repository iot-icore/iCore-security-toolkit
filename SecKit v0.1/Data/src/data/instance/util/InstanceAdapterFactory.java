/**
 */
package data.instance.util;

import data.instance.*;

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
 * @see data.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
    protected InstanceSwitch<Adapter> modelSwitch =
        new InstanceSwitch<Adapter>() {
            @Override
            public Adapter caseBlock(Block object) {
                return createBlockAdapter();
            }
            @Override
            public Adapter caseSegment(Segment object) {
                return createSegmentAdapter();
            }
            @Override
            public Adapter caseRegion(Region object) {
                return createRegionAdapter();
            }
            @Override
            public Adapter caseData(Data object) {
                return createDataAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstance(AbstractDataInstance object) {
                return createAbstractDataInstanceAdapter();
            }
            @Override
            public Adapter caseStaticData(StaticData object) {
                return createStaticDataAdapter();
            }
            @Override
            public Adapter caseDynamicData(DynamicData object) {
                return createDynamicDataAdapter();
            }
            @Override
            public Adapter caseDataSet(DataSet object) {
                return createDataSetAdapter();
            }
            @Override
            public Adapter caseDataQuantity(DataQuantity object) {
                return createDataQuantityAdapter();
            }
            @Override
            public Adapter caseTaintTag(TaintTag object) {
                return createTaintTagAdapter();
            }
            @Override
            public Adapter caseNumberOfBytes(NumberOfBytes object) {
                return createNumberOfBytesAdapter();
            }
            @Override
            public Adapter caseCompleteData(CompleteData object) {
                return createCompleteDataAdapter();
            }
            @Override
            public Adapter casePartialData(PartialData object) {
                return createPartialDataAdapter();
            }
            @Override
            public Adapter caseByteOffSet(ByteOffSet object) {
                return createByteOffSetAdapter();
            }
            @Override
            public Adapter caseAddress(Address object) {
                return createAddressAdapter();
            }
            @Override
            public Adapter caseAdressSpace(AdressSpace object) {
                return createAdressSpaceAdapter();
            }
            @Override
            public Adapter caseAddressable(Addressable object) {
                return createAddressableAdapter();
            }
            @Override
            public Adapter caseContent(Content object) {
                return createContentAdapter();
            }
            @Override
            public Adapter caseMemory(Memory object) {
                return createMemoryAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
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
     * Creates a new adapter for an object of class '{@link data.instance.Block <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Block
     * @generated
     */
    public Adapter createBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Segment <em>Segment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Segment
     * @generated
     */
    public Adapter createSegmentAdapter() {
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
     * Creates a new adapter for an object of class '{@link data.instance.Data <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Data
     * @generated
     */
    public Adapter createDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.AbstractDataInstance <em>Abstract Data Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.AbstractDataInstance
     * @generated
     */
    public Adapter createAbstractDataInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.StaticData <em>Static Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.StaticData
     * @generated
     */
    public Adapter createStaticDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.DynamicData <em>Dynamic Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.DynamicData
     * @generated
     */
    public Adapter createDynamicDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.DataSet
     * @generated
     */
    public Adapter createDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.DataQuantity <em>Data Quantity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.DataQuantity
     * @generated
     */
    public Adapter createDataQuantityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.TaintTag <em>Taint Tag</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.TaintTag
     * @generated
     */
    public Adapter createTaintTagAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.NumberOfBytes <em>Number Of Bytes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.NumberOfBytes
     * @generated
     */
    public Adapter createNumberOfBytesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.CompleteData <em>Complete Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.CompleteData
     * @generated
     */
    public Adapter createCompleteDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.PartialData <em>Partial Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.PartialData
     * @generated
     */
    public Adapter createPartialDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.ByteOffSet <em>Byte Off Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.ByteOffSet
     * @generated
     */
    public Adapter createByteOffSetAdapter() {
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
     * Creates a new adapter for an object of class '{@link data.instance.AdressSpace <em>Adress Space</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.AdressSpace
     * @generated
     */
    public Adapter createAdressSpaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Addressable <em>Addressable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Addressable
     * @generated
     */
    public Adapter createAddressableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Content <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Content
     * @generated
     */
    public Adapter createContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Memory <em>Memory</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Memory
     * @generated
     */
    public Adapter createMemoryAdapter() {
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

} //InstanceAdapterFactory
