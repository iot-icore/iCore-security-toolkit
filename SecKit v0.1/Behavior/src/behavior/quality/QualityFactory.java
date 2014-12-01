/**
 */
package behavior.quality;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.quality.QualityPackage
 * @generated
 */
public interface QualityFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    QualityFactory eINSTANCE = behavior.quality.impl.QualityFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Response Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Response Time</em>'.
     * @generated
     */
    ResponseTime createResponseTime();

    /**
     * Returns a new object of class '<em>Service Provider Load</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Provider Load</em>'.
     * @generated
     */
    ServiceProviderLoad createServiceProviderLoad();

    /**
     * Returns a new object of class '<em>Latency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Latency</em>'.
     * @generated
     */
    Latency createLatency();

    /**
     * Returns a new object of class '<em>Throughput</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Throughput</em>'.
     * @generated
     */
    Throughput createThroughput();

    /**
     * Returns a new object of class '<em>Of Data Provisioning</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Of Data Provisioning</em>'.
     * @generated
     */
    QualityOfDataProvisioning createQualityOfDataProvisioning();

    /**
     * Returns a new object of class '<em>Of Event Signalling</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Of Event Signalling</em>'.
     * @generated
     */
    QualityOfEventSignalling createQualityOfEventSignalling();

    /**
     * Returns a new object of class '<em>Cost</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cost</em>'.
     * @generated
     */
    Cost createCost();

    /**
     * Returns a new object of class '<em>Price</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Price</em>'.
     * @generated
     */
    Price createPrice();

    /**
     * Returns a new object of class '<em>Availability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Availability</em>'.
     * @generated
     */
    Availability createAvailability();

    /**
     * Returns a new object of class '<em>Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value</em>'.
     * @generated
     */
    Value createValue();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    QualityPackage getQualityPackage();

} //QualityFactory
