/**
 */
package behavior.quality;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see behavior.quality.QualityFactory
 * @model kind="package"
 * @generated
 */
public interface QualityPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "quality";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/quality/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-quality";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    QualityPackage eINSTANCE = behavior.quality.impl.QualityPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.quality.impl.QualityPropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.QualityPropertyImpl
     * @see behavior.quality.impl.QualityPackageImpl#getQualityProperty()
     * @generated
     */
    int QUALITY_PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_PROPERTY__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_PROPERTY__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_PROPERTY_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_PROPERTY_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.QuantitativeImpl <em>Quantitative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.QuantitativeImpl
     * @see behavior.quality.impl.QualityPackageImpl#getQuantitative()
     * @generated
     */
    int QUANTITATIVE = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTITATIVE__VISUAL_ELEMENTS = QUALITY_PROPERTY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTITATIVE__ID = QUALITY_PROPERTY__ID;

    /**
     * The number of structural features of the '<em>Quantitative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTITATIVE_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Quantitative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUANTITATIVE_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.ResponseTimeImpl <em>Response Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.ResponseTimeImpl
     * @see behavior.quality.impl.QualityPackageImpl#getResponseTime()
     * @generated
     */
    int RESPONSE_TIME = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Response Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Response Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.ServiceProviderLoadImpl <em>Service Provider Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.ServiceProviderLoadImpl
     * @see behavior.quality.impl.QualityPackageImpl#getServiceProviderLoad()
     * @generated
     */
    int SERVICE_PROVIDER_LOAD = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PROVIDER_LOAD__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PROVIDER_LOAD__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Service Provider Load</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PROVIDER_LOAD_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Service Provider Load</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PROVIDER_LOAD_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.LatencyImpl <em>Latency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.LatencyImpl
     * @see behavior.quality.impl.QualityPackageImpl#getLatency()
     * @generated
     */
    int LATENCY = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATENCY__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATENCY__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Latency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATENCY_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Latency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LATENCY_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.ThroughputImpl <em>Throughput</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.ThroughputImpl
     * @see behavior.quality.impl.QualityPackageImpl#getThroughput()
     * @generated
     */
    int THROUGHPUT = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROUGHPUT__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROUGHPUT__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Throughput</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROUGHPUT_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Throughput</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROUGHPUT_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.QualityOfDataProvisioningImpl <em>Of Data Provisioning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.QualityOfDataProvisioningImpl
     * @see behavior.quality.impl.QualityPackageImpl#getQualityOfDataProvisioning()
     * @generated
     */
    int QUALITY_OF_DATA_PROVISIONING = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING__ID = QUANTITATIVE__ID;

    /**
     * The feature id for the '<em><b>Timestamp Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION = QUANTITATIVE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refresh Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE = QUANTITATIVE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Of Data Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Of Data Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_DATA_PROVISIONING_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.QualityOfEventSignallingImpl <em>Of Event Signalling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.QualityOfEventSignallingImpl
     * @see behavior.quality.impl.QualityPackageImpl#getQualityOfEventSignalling()
     * @generated
     */
    int QUALITY_OF_EVENT_SIGNALLING = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EVENT_SIGNALLING__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EVENT_SIGNALLING__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Of Event Signalling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EVENT_SIGNALLING_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Of Event Signalling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EVENT_SIGNALLING_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.CostImpl <em>Cost</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.CostImpl
     * @see behavior.quality.impl.QualityPackageImpl#getCost()
     * @generated
     */
    int COST = 7;

    /**
     * The number of structural features of the '<em>Cost</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COST_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Cost</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COST_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.PriceImpl <em>Price</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.PriceImpl
     * @see behavior.quality.impl.QualityPackageImpl#getPrice()
     * @generated
     */
    int PRICE = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRICE__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRICE__ID = QUANTITATIVE__ID;

    /**
     * The feature id for the '<em><b>Amount</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRICE__AMOUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Price</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRICE_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Price</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRICE_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.AvailabilityImpl <em>Availability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.AvailabilityImpl
     * @see behavior.quality.impl.QualityPackageImpl#getAvailability()
     * @generated
     */
    int AVAILABILITY = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABILITY__VISUAL_ELEMENTS = QUANTITATIVE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABILITY__ID = QUANTITATIVE__ID;

    /**
     * The number of structural features of the '<em>Availability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABILITY_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Availability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABILITY_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.QualitativeImpl <em>Qualitative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.QualitativeImpl
     * @see behavior.quality.impl.QualityPackageImpl#getQualitative()
     * @generated
     */
    int QUALITATIVE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITATIVE__VISUAL_ELEMENTS = QUALITY_PROPERTY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITATIVE__ID = QUALITY_PROPERTY__ID;

    /**
     * The number of structural features of the '<em>Qualitative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITATIVE_FEATURE_COUNT = QUALITY_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Qualitative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITATIVE_OPERATION_COUNT = QUALITY_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.quality.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.quality.impl.ValueImpl
     * @see behavior.quality.impl.QualityPackageImpl#getValue()
     * @generated
     */
    int VALUE = 12;

    /**
     * The number of structural features of the '<em>Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link behavior.quality.QualityProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see behavior.quality.QualityProperty
     * @generated
     */
    EClass getQualityProperty();

    /**
     * Returns the meta object for class '{@link behavior.quality.ResponseTime <em>Response Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response Time</em>'.
     * @see behavior.quality.ResponseTime
     * @generated
     */
    EClass getResponseTime();

    /**
     * Returns the meta object for class '{@link behavior.quality.ServiceProviderLoad <em>Service Provider Load</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Provider Load</em>'.
     * @see behavior.quality.ServiceProviderLoad
     * @generated
     */
    EClass getServiceProviderLoad();

    /**
     * Returns the meta object for class '{@link behavior.quality.Latency <em>Latency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Latency</em>'.
     * @see behavior.quality.Latency
     * @generated
     */
    EClass getLatency();

    /**
     * Returns the meta object for class '{@link behavior.quality.Throughput <em>Throughput</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Throughput</em>'.
     * @see behavior.quality.Throughput
     * @generated
     */
    EClass getThroughput();

    /**
     * Returns the meta object for class '{@link behavior.quality.QualityOfDataProvisioning <em>Of Data Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Of Data Provisioning</em>'.
     * @see behavior.quality.QualityOfDataProvisioning
     * @generated
     */
    EClass getQualityOfDataProvisioning();

    /**
     * Returns the meta object for the attribute '{@link behavior.quality.QualityOfDataProvisioning#getTimestampPrecision <em>Timestamp Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timestamp Precision</em>'.
     * @see behavior.quality.QualityOfDataProvisioning#getTimestampPrecision()
     * @see #getQualityOfDataProvisioning()
     * @generated
     */
    EAttribute getQualityOfDataProvisioning_TimestampPrecision();

    /**
     * Returns the meta object for the attribute '{@link behavior.quality.QualityOfDataProvisioning#getMaxPrecision <em>Max Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Precision</em>'.
     * @see behavior.quality.QualityOfDataProvisioning#getMaxPrecision()
     * @see #getQualityOfDataProvisioning()
     * @generated
     */
    EAttribute getQualityOfDataProvisioning_MaxPrecision();

    /**
     * Returns the meta object for the attribute '{@link behavior.quality.QualityOfDataProvisioning#getRefreshRate <em>Refresh Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refresh Rate</em>'.
     * @see behavior.quality.QualityOfDataProvisioning#getRefreshRate()
     * @see #getQualityOfDataProvisioning()
     * @generated
     */
    EAttribute getQualityOfDataProvisioning_RefreshRate();

    /**
     * Returns the meta object for class '{@link behavior.quality.QualityOfEventSignalling <em>Of Event Signalling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Of Event Signalling</em>'.
     * @see behavior.quality.QualityOfEventSignalling
     * @generated
     */
    EClass getQualityOfEventSignalling();

    /**
     * Returns the meta object for class '{@link behavior.quality.Cost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cost</em>'.
     * @see behavior.quality.Cost
     * @generated
     */
    EClass getCost();

    /**
     * Returns the meta object for class '{@link behavior.quality.Price <em>Price</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Price</em>'.
     * @see behavior.quality.Price
     * @generated
     */
    EClass getPrice();

    /**
     * Returns the meta object for the containment reference '{@link behavior.quality.Price#getAmount <em>Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Amount</em>'.
     * @see behavior.quality.Price#getAmount()
     * @see #getPrice()
     * @generated
     */
    EReference getPrice_Amount();

    /**
     * Returns the meta object for class '{@link behavior.quality.Availability <em>Availability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Availability</em>'.
     * @see behavior.quality.Availability
     * @generated
     */
    EClass getAvailability();

    /**
     * Returns the meta object for class '{@link behavior.quality.Quantitative <em>Quantitative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quantitative</em>'.
     * @see behavior.quality.Quantitative
     * @generated
     */
    EClass getQuantitative();

    /**
     * Returns the meta object for class '{@link behavior.quality.Qualitative <em>Qualitative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Qualitative</em>'.
     * @see behavior.quality.Qualitative
     * @generated
     */
    EClass getQualitative();

    /**
     * Returns the meta object for class '{@link behavior.quality.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value</em>'.
     * @see behavior.quality.Value
     * @generated
     */
    EClass getValue();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    QualityFactory getQualityFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link behavior.quality.impl.QualityPropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.QualityPropertyImpl
         * @see behavior.quality.impl.QualityPackageImpl#getQualityProperty()
         * @generated
         */
        EClass QUALITY_PROPERTY = eINSTANCE.getQualityProperty();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.ResponseTimeImpl <em>Response Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.ResponseTimeImpl
         * @see behavior.quality.impl.QualityPackageImpl#getResponseTime()
         * @generated
         */
        EClass RESPONSE_TIME = eINSTANCE.getResponseTime();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.ServiceProviderLoadImpl <em>Service Provider Load</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.ServiceProviderLoadImpl
         * @see behavior.quality.impl.QualityPackageImpl#getServiceProviderLoad()
         * @generated
         */
        EClass SERVICE_PROVIDER_LOAD = eINSTANCE.getServiceProviderLoad();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.LatencyImpl <em>Latency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.LatencyImpl
         * @see behavior.quality.impl.QualityPackageImpl#getLatency()
         * @generated
         */
        EClass LATENCY = eINSTANCE.getLatency();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.ThroughputImpl <em>Throughput</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.ThroughputImpl
         * @see behavior.quality.impl.QualityPackageImpl#getThroughput()
         * @generated
         */
        EClass THROUGHPUT = eINSTANCE.getThroughput();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.QualityOfDataProvisioningImpl <em>Of Data Provisioning</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.QualityOfDataProvisioningImpl
         * @see behavior.quality.impl.QualityPackageImpl#getQualityOfDataProvisioning()
         * @generated
         */
        EClass QUALITY_OF_DATA_PROVISIONING = eINSTANCE.getQualityOfDataProvisioning();

        /**
         * The meta object literal for the '<em><b>Timestamp Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION = eINSTANCE.getQualityOfDataProvisioning_TimestampPrecision();

        /**
         * The meta object literal for the '<em><b>Max Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION = eINSTANCE.getQualityOfDataProvisioning_MaxPrecision();

        /**
         * The meta object literal for the '<em><b>Refresh Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE = eINSTANCE.getQualityOfDataProvisioning_RefreshRate();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.QualityOfEventSignallingImpl <em>Of Event Signalling</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.QualityOfEventSignallingImpl
         * @see behavior.quality.impl.QualityPackageImpl#getQualityOfEventSignalling()
         * @generated
         */
        EClass QUALITY_OF_EVENT_SIGNALLING = eINSTANCE.getQualityOfEventSignalling();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.CostImpl <em>Cost</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.CostImpl
         * @see behavior.quality.impl.QualityPackageImpl#getCost()
         * @generated
         */
        EClass COST = eINSTANCE.getCost();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.PriceImpl <em>Price</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.PriceImpl
         * @see behavior.quality.impl.QualityPackageImpl#getPrice()
         * @generated
         */
        EClass PRICE = eINSTANCE.getPrice();

        /**
         * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRICE__AMOUNT = eINSTANCE.getPrice_Amount();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.AvailabilityImpl <em>Availability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.AvailabilityImpl
         * @see behavior.quality.impl.QualityPackageImpl#getAvailability()
         * @generated
         */
        EClass AVAILABILITY = eINSTANCE.getAvailability();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.QuantitativeImpl <em>Quantitative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.QuantitativeImpl
         * @see behavior.quality.impl.QualityPackageImpl#getQuantitative()
         * @generated
         */
        EClass QUANTITATIVE = eINSTANCE.getQuantitative();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.QualitativeImpl <em>Qualitative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.QualitativeImpl
         * @see behavior.quality.impl.QualityPackageImpl#getQualitative()
         * @generated
         */
        EClass QUALITATIVE = eINSTANCE.getQualitative();

        /**
         * The meta object literal for the '{@link behavior.quality.impl.ValueImpl <em>Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.quality.impl.ValueImpl
         * @see behavior.quality.impl.QualityPackageImpl#getValue()
         * @generated
         */
        EClass VALUE = eINSTANCE.getValue();

    }

} //QualityPackage
