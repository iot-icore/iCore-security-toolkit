/**
 */
package behavior.quality.util;

import behavior.quality.*;

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
 * @see behavior.quality.QualityPackage
 * @generated
 */
public class QualityAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static QualityPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = QualityPackage.eINSTANCE;
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
    protected QualitySwitch<Adapter> modelSwitch =
        new QualitySwitch<Adapter>() {
            @Override
            public Adapter caseQualityProperty(QualityProperty object) {
                return createQualityPropertyAdapter();
            }
            @Override
            public Adapter caseResponseTime(ResponseTime object) {
                return createResponseTimeAdapter();
            }
            @Override
            public Adapter caseServiceProviderLoad(ServiceProviderLoad object) {
                return createServiceProviderLoadAdapter();
            }
            @Override
            public Adapter caseLatency(Latency object) {
                return createLatencyAdapter();
            }
            @Override
            public Adapter caseThroughput(Throughput object) {
                return createThroughputAdapter();
            }
            @Override
            public Adapter caseQualityOfDataProvisioning(QualityOfDataProvisioning object) {
                return createQualityOfDataProvisioningAdapter();
            }
            @Override
            public Adapter caseQualityOfEventSignalling(QualityOfEventSignalling object) {
                return createQualityOfEventSignallingAdapter();
            }
            @Override
            public Adapter caseCost(Cost object) {
                return createCostAdapter();
            }
            @Override
            public Adapter casePrice(Price object) {
                return createPriceAdapter();
            }
            @Override
            public Adapter caseAvailability(Availability object) {
                return createAvailabilityAdapter();
            }
            @Override
            public Adapter caseQuantitative(Quantitative object) {
                return createQuantitativeAdapter();
            }
            @Override
            public Adapter caseQualitative(Qualitative object) {
                return createQualitativeAdapter();
            }
            @Override
            public Adapter caseValue(Value object) {
                return createValueAdapter();
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
     * Creates a new adapter for an object of class '{@link behavior.quality.QualityProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.QualityProperty
     * @generated
     */
    public Adapter createQualityPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.ResponseTime <em>Response Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.ResponseTime
     * @generated
     */
    public Adapter createResponseTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.ServiceProviderLoad <em>Service Provider Load</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.ServiceProviderLoad
     * @generated
     */
    public Adapter createServiceProviderLoadAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Latency <em>Latency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Latency
     * @generated
     */
    public Adapter createLatencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Throughput <em>Throughput</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Throughput
     * @generated
     */
    public Adapter createThroughputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.QualityOfDataProvisioning <em>Of Data Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.QualityOfDataProvisioning
     * @generated
     */
    public Adapter createQualityOfDataProvisioningAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.QualityOfEventSignalling <em>Of Event Signalling</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.QualityOfEventSignalling
     * @generated
     */
    public Adapter createQualityOfEventSignallingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Cost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Cost
     * @generated
     */
    public Adapter createCostAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Price <em>Price</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Price
     * @generated
     */
    public Adapter createPriceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Availability <em>Availability</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Availability
     * @generated
     */
    public Adapter createAvailabilityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Quantitative <em>Quantitative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Quantitative
     * @generated
     */
    public Adapter createQuantitativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Qualitative <em>Qualitative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Qualitative
     * @generated
     */
    public Adapter createQualitativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.quality.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.quality.Value
     * @generated
     */
    public Adapter createValueAdapter() {
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

} //QualityAdapterFactory
