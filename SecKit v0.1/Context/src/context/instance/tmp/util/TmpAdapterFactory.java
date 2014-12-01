/**
 */
package context.instance.tmp.util;

import context.instance.Context;
import context.instance.ContextSituation;

import context.instance.tmp.*;

import context.type.ContextInformationType;
import context.type.ContextSituationType;

import data.instance.AbstractDataInstance;
import data.instance.Addressable;
import data.instance.Data;

import data.type.DataType;

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
 * @see context.instance.tmp.TmpPackage
 * @generated
 */
public class TmpAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TmpPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TmpAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TmpPackage.eINSTANCE;
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
    protected TmpSwitch<Adapter> modelSwitch =
        new TmpSwitch<Adapter>() {
            @Override
            public Adapter caseTemperatureMeasurement(TemperatureMeasurement object) {
                return createTemperatureMeasurementAdapter();
            }
            @Override
            public Adapter caseNearbyMeasurement(NearbyMeasurement object) {
                return createNearbyMeasurementAdapter();
            }
            @Override
            public Adapter caseEventPrecision(EventPrecision object) {
                return createEventPrecisionAdapter();
            }
            @Override
            public Adapter caseMaterialRelationContext(MaterialRelationContext object) {
                return createMaterialRelationContextAdapter();
            }
            @Override
            public Adapter caseIntrinsicSituations(IntrinsicSituations object) {
                return createIntrinsicSituationsAdapter();
            }
            @Override
            public Adapter caseRelationalSituation(RelationalSituation object) {
                return createRelationalSituationAdapter();
            }
            @Override
            public Adapter caseFriendship(Friendship object) {
                return createFriendshipAdapter();
            }
            @Override
            public Adapter caseFormalRelationSituation(FormalRelationSituation object) {
                return createFormalRelationSituationAdapter();
            }
            @Override
            public Adapter caseSituationOfSituations(SituationOfSituations object) {
                return createSituationOfSituationsAdapter();
            }
            @Override
            public Adapter caseRecurrentFever(RecurrentFever object) {
                return createRecurrentFeverAdapter();
            }
            @Override
            public Adapter caseCombinedSituation(CombinedSituation object) {
                return createCombinedSituationAdapter();
            }
            @Override
            public Adapter caseIntrinsicContext(IntrinsicContext object) {
                return createIntrinsicContextAdapter();
            }
            @Override
            public Adapter caseFever(Fever object) {
                return createFeverAdapter();
            }
            @Override
            public Adapter caseAvailableDevices(AvailableDevices object) {
                return createAvailableDevicesAdapter();
            }
            @Override
            public Adapter caseFormalRelationContext(FormalRelationContext object) {
                return createFormalRelationContextAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstance(AbstractDataInstance object) {
                return createAbstractDataInstanceAdapter();
            }
            @Override
            public Adapter caseAddressable(Addressable object) {
                return createAddressableAdapter();
            }
            @Override
            public Adapter caseData(Data object) {
                return createDataAdapter();
            }
            @Override
            public Adapter caseContext(Context object) {
                return createContextAdapter();
            }
            @Override
            public Adapter caseContextSituation(ContextSituation object) {
                return createContextSituationAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public Adapter caseContextInformationType(ContextInformationType object) {
                return createContextInformationTypeAdapter();
            }
            @Override
            public Adapter caseContextSituationType(ContextSituationType object) {
                return createContextSituationTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link context.instance.tmp.TemperatureMeasurement <em>Temperature Measurement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.TemperatureMeasurement
     * @generated
     */
    public Adapter createTemperatureMeasurementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.NearbyMeasurement <em>Nearby Measurement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.NearbyMeasurement
     * @generated
     */
    public Adapter createNearbyMeasurementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.EventPrecision <em>Event Precision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.EventPrecision
     * @generated
     */
    public Adapter createEventPrecisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.MaterialRelationContext <em>Material Relation Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.MaterialRelationContext
     * @generated
     */
    public Adapter createMaterialRelationContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.IntrinsicSituations <em>Intrinsic Situations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.IntrinsicSituations
     * @generated
     */
    public Adapter createIntrinsicSituationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.RelationalSituation <em>Relational Situation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.RelationalSituation
     * @generated
     */
    public Adapter createRelationalSituationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.Friendship <em>Friendship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.Friendship
     * @generated
     */
    public Adapter createFriendshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.FormalRelationSituation <em>Formal Relation Situation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.FormalRelationSituation
     * @generated
     */
    public Adapter createFormalRelationSituationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.SituationOfSituations <em>Situation Of Situations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.SituationOfSituations
     * @generated
     */
    public Adapter createSituationOfSituationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.RecurrentFever <em>Recurrent Fever</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.RecurrentFever
     * @generated
     */
    public Adapter createRecurrentFeverAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.CombinedSituation <em>Combined Situation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.CombinedSituation
     * @generated
     */
    public Adapter createCombinedSituationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.IntrinsicContext <em>Intrinsic Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.IntrinsicContext
     * @generated
     */
    public Adapter createIntrinsicContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.Fever <em>Fever</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.Fever
     * @generated
     */
    public Adapter createFeverAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.AvailableDevices <em>Available Devices</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.AvailableDevices
     * @generated
     */
    public Adapter createAvailableDevicesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.tmp.FormalRelationContext <em>Formal Relation Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.tmp.FormalRelationContext
     * @generated
     */
    public Adapter createFormalRelationContextAdapter() {
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
     * Creates a new adapter for an object of class '{@link context.instance.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.Context
     * @generated
     */
    public Adapter createContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.ContextSituation <em>Context Situation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.ContextSituation
     * @generated
     */
    public Adapter createContextSituationAdapter() {
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
     * Creates a new adapter for an object of class '{@link context.type.ContextInformationType <em>Context Information Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.ContextInformationType
     * @generated
     */
    public Adapter createContextInformationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.ContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.ContextSituationType
     * @generated
     */
    public Adapter createContextSituationTypeAdapter() {
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

} //TmpAdapterFactory
