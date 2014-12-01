/**
 */
package behavior.quality.impl;

import behavior.quality.*;

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
public class QualityFactoryImpl extends EFactoryImpl implements QualityFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QualityFactory init() {
        try {
            QualityFactory theQualityFactory = (QualityFactory)EPackage.Registry.INSTANCE.getEFactory(QualityPackage.eNS_URI);
            if (theQualityFactory != null) {
                return theQualityFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QualityFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityFactoryImpl() {
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
            case QualityPackage.RESPONSE_TIME: return createResponseTime();
            case QualityPackage.SERVICE_PROVIDER_LOAD: return createServiceProviderLoad();
            case QualityPackage.LATENCY: return createLatency();
            case QualityPackage.THROUGHPUT: return createThroughput();
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING: return createQualityOfDataProvisioning();
            case QualityPackage.QUALITY_OF_EVENT_SIGNALLING: return createQualityOfEventSignalling();
            case QualityPackage.COST: return createCost();
            case QualityPackage.PRICE: return createPrice();
            case QualityPackage.AVAILABILITY: return createAvailability();
            case QualityPackage.VALUE: return createValue();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResponseTime createResponseTime() {
        ResponseTimeImpl responseTime = new ResponseTimeImpl();
        return responseTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceProviderLoad createServiceProviderLoad() {
        ServiceProviderLoadImpl serviceProviderLoad = new ServiceProviderLoadImpl();
        return serviceProviderLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Latency createLatency() {
        LatencyImpl latency = new LatencyImpl();
        return latency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Throughput createThroughput() {
        ThroughputImpl throughput = new ThroughputImpl();
        return throughput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfDataProvisioning createQualityOfDataProvisioning() {
        QualityOfDataProvisioningImpl qualityOfDataProvisioning = new QualityOfDataProvisioningImpl();
        return qualityOfDataProvisioning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfEventSignalling createQualityOfEventSignalling() {
        QualityOfEventSignallingImpl qualityOfEventSignalling = new QualityOfEventSignallingImpl();
        return qualityOfEventSignalling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cost createCost() {
        CostImpl cost = new CostImpl();
        return cost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Price createPrice() {
        PriceImpl price = new PriceImpl();
        return price;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Availability createAvailability() {
        AvailabilityImpl availability = new AvailabilityImpl();
        return availability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value createValue() {
        ValueImpl value = new ValueImpl();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityPackage getQualityPackage() {
        return (QualityPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QualityPackage getPackage() {
        return QualityPackage.eINSTANCE;
    }

} //QualityFactoryImpl
