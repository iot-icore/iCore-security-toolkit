/**
 */
package behavior.quality.util;

import behavior.quality.*;

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
 * @see behavior.quality.QualityPackage
 * @generated
 */
public class QualitySwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static QualityPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualitySwitch() {
        if (modelPackage == null) {
            modelPackage = QualityPackage.eINSTANCE;
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
            case QualityPackage.QUALITY_PROPERTY: {
                QualityProperty qualityProperty = (QualityProperty)theEObject;
                T result = caseQualityProperty(qualityProperty);
                if (result == null) result = caseElement(qualityProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.RESPONSE_TIME: {
                ResponseTime responseTime = (ResponseTime)theEObject;
                T result = caseResponseTime(responseTime);
                if (result == null) result = caseQuantitative(responseTime);
                if (result == null) result = caseQualityProperty(responseTime);
                if (result == null) result = caseElement(responseTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.SERVICE_PROVIDER_LOAD: {
                ServiceProviderLoad serviceProviderLoad = (ServiceProviderLoad)theEObject;
                T result = caseServiceProviderLoad(serviceProviderLoad);
                if (result == null) result = caseQuantitative(serviceProviderLoad);
                if (result == null) result = caseQualityProperty(serviceProviderLoad);
                if (result == null) result = caseElement(serviceProviderLoad);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.LATENCY: {
                Latency latency = (Latency)theEObject;
                T result = caseLatency(latency);
                if (result == null) result = caseQuantitative(latency);
                if (result == null) result = caseQualityProperty(latency);
                if (result == null) result = caseElement(latency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.THROUGHPUT: {
                Throughput throughput = (Throughput)theEObject;
                T result = caseThroughput(throughput);
                if (result == null) result = caseQuantitative(throughput);
                if (result == null) result = caseQualityProperty(throughput);
                if (result == null) result = caseElement(throughput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.QUALITY_OF_DATA_PROVISIONING: {
                QualityOfDataProvisioning qualityOfDataProvisioning = (QualityOfDataProvisioning)theEObject;
                T result = caseQualityOfDataProvisioning(qualityOfDataProvisioning);
                if (result == null) result = caseQuantitative(qualityOfDataProvisioning);
                if (result == null) result = caseQualityProperty(qualityOfDataProvisioning);
                if (result == null) result = caseElement(qualityOfDataProvisioning);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.QUALITY_OF_EVENT_SIGNALLING: {
                QualityOfEventSignalling qualityOfEventSignalling = (QualityOfEventSignalling)theEObject;
                T result = caseQualityOfEventSignalling(qualityOfEventSignalling);
                if (result == null) result = caseQuantitative(qualityOfEventSignalling);
                if (result == null) result = caseQualityProperty(qualityOfEventSignalling);
                if (result == null) result = caseElement(qualityOfEventSignalling);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.COST: {
                Cost cost = (Cost)theEObject;
                T result = caseCost(cost);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.PRICE: {
                Price price = (Price)theEObject;
                T result = casePrice(price);
                if (result == null) result = caseQuantitative(price);
                if (result == null) result = caseQualityProperty(price);
                if (result == null) result = caseElement(price);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.AVAILABILITY: {
                Availability availability = (Availability)theEObject;
                T result = caseAvailability(availability);
                if (result == null) result = caseQuantitative(availability);
                if (result == null) result = caseQualityProperty(availability);
                if (result == null) result = caseElement(availability);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.QUANTITATIVE: {
                Quantitative quantitative = (Quantitative)theEObject;
                T result = caseQuantitative(quantitative);
                if (result == null) result = caseQualityProperty(quantitative);
                if (result == null) result = caseElement(quantitative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.QUALITATIVE: {
                Qualitative qualitative = (Qualitative)theEObject;
                T result = caseQualitative(qualitative);
                if (result == null) result = caseQualityProperty(qualitative);
                if (result == null) result = caseElement(qualitative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case QualityPackage.VALUE: {
                Value value = (Value)theEObject;
                T result = caseValue(value);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityProperty(QualityProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Response Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Response Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResponseTime(ResponseTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Provider Load</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Provider Load</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceProviderLoad(ServiceProviderLoad object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Latency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Latency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLatency(Latency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Throughput</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throughput</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThroughput(Throughput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Of Data Provisioning</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Of Data Provisioning</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfDataProvisioning(QualityOfDataProvisioning object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Of Event Signalling</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Of Event Signalling</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfEventSignalling(QualityOfEventSignalling object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCost(Cost object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Price</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Price</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrice(Price object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Availability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Availability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAvailability(Availability object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quantitative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quantitative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuantitative(Quantitative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Qualitative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Qualitative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualitative(Qualitative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValue(Value object) {
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

} //QualitySwitch
