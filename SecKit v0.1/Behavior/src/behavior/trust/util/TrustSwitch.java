/**
 */
package behavior.trust.util;

import behavior.trust.*;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import trust.instance.TrustAspect;

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
 * @see behavior.trust.TrustPackage
 * @generated
 */
public class TrustSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TrustPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrustSwitch() {
        if (modelPackage == null) {
            modelPackage = TrustPackage.eINSTANCE;
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
            case TrustPackage.PRIVACY_PROTECTION: {
                PrivacyProtection privacyProtection = (PrivacyProtection)theEObject;
                T result = casePrivacyProtection(privacyProtection);
                if (result == null) result = caseQualityOfProtection(privacyProtection);
                if (result == null) result = caseBehaviorQuality(privacyProtection);
                if (result == null) result = caseTrustAspect(privacyProtection);
                if (result == null) result = caseElement(privacyProtection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.BEHAVIOR_QUALITY: {
                BehaviorQuality behaviorQuality = (BehaviorQuality)theEObject;
                T result = caseBehaviorQuality(behaviorQuality);
                if (result == null) result = caseTrustAspect(behaviorQuality);
                if (result == null) result = caseElement(behaviorQuality);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.ADAPT_SERVICE_TO_CONTEXT: {
                AdaptServiceToContext adaptServiceToContext = (AdaptServiceToContext)theEObject;
                T result = caseAdaptServiceToContext(adaptServiceToContext);
                if (result == null) result = caseQualityOfExperience(adaptServiceToContext);
                if (result == null) result = caseBehaviorQuality(adaptServiceToContext);
                if (result == null) result = caseTrustAspect(adaptServiceToContext);
                if (result == null) result = caseElement(adaptServiceToContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.RESPONSE_TIME: {
                ResponseTime responseTime = (ResponseTime)theEObject;
                T result = caseResponseTime(responseTime);
                if (result == null) result = caseQualityOfService(responseTime);
                if (result == null) result = caseBehaviorQuality(responseTime);
                if (result == null) result = caseTrustAspect(responseTime);
                if (result == null) result = caseElement(responseTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.QUALITY_OF_SERVICE: {
                QualityOfService qualityOfService = (QualityOfService)theEObject;
                T result = caseQualityOfService(qualityOfService);
                if (result == null) result = caseBehaviorQuality(qualityOfService);
                if (result == null) result = caseTrustAspect(qualityOfService);
                if (result == null) result = caseElement(qualityOfService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.QUALITY_OF_EXPERIENCE: {
                QualityOfExperience qualityOfExperience = (QualityOfExperience)theEObject;
                T result = caseQualityOfExperience(qualityOfExperience);
                if (result == null) result = caseBehaviorQuality(qualityOfExperience);
                if (result == null) result = caseTrustAspect(qualityOfExperience);
                if (result == null) result = caseElement(qualityOfExperience);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.INTERACTION_CONTRIBUTION_TRUST: {
                InteractionContributionTrust interactionContributionTrust = (InteractionContributionTrust)theEObject;
                T result = caseInteractionContributionTrust(interactionContributionTrust);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.QUALITY_OF_PROTECTION: {
                QualityOfProtection qualityOfProtection = (QualityOfProtection)theEObject;
                T result = caseQualityOfProtection(qualityOfProtection);
                if (result == null) result = caseBehaviorQuality(qualityOfProtection);
                if (result == null) result = caseTrustAspect(qualityOfProtection);
                if (result == null) result = caseElement(qualityOfProtection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.EMPLOYEE_THEFT: {
                EmployeeTheft employeeTheft = (EmployeeTheft)theEObject;
                T result = caseEmployeeTheft(employeeTheft);
                if (result == null) result = caseQualityOfProtection(employeeTheft);
                if (result == null) result = caseBehaviorQuality(employeeTheft);
                if (result == null) result = caseTrustAspect(employeeTheft);
                if (result == null) result = caseElement(employeeTheft);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.COMPLETE_SERVICE_AS_AGREED: {
                CompleteServiceAsAgreed completeServiceAsAgreed = (CompleteServiceAsAgreed)theEObject;
                T result = caseCompleteServiceAsAgreed(completeServiceAsAgreed);
                if (result == null) result = caseQualityOfService(completeServiceAsAgreed);
                if (result == null) result = caseBehaviorQuality(completeServiceAsAgreed);
                if (result == null) result = caseTrustAspect(completeServiceAsAgreed);
                if (result == null) result = caseElement(completeServiceAsAgreed);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.ECLASS0: {
                EClass0 eClass0 = (EClass0)theEObject;
                T result = caseEClass0(eClass0);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TrustPackage.PROVIDE_SECURE_FIRMWARE: {
                ProvideSecureFirmware provideSecureFirmware = (ProvideSecureFirmware)theEObject;
                T result = caseProvideSecureFirmware(provideSecureFirmware);
                if (result == null) result = caseQualityOfProtection(provideSecureFirmware);
                if (result == null) result = caseBehaviorQuality(provideSecureFirmware);
                if (result == null) result = caseTrustAspect(provideSecureFirmware);
                if (result == null) result = caseElement(provideSecureFirmware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Privacy Protection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Privacy Protection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivacyProtection(PrivacyProtection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Quality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Quality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorQuality(BehaviorQuality object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Adapt Service To Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Adapt Service To Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdaptServiceToContext(AdaptServiceToContext object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Quality Of Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality Of Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfService(QualityOfService object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality Of Experience</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality Of Experience</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfExperience(QualityOfExperience object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Trust</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Trust</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionTrust(InteractionContributionTrust object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality Of Protection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality Of Protection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfProtection(QualityOfProtection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Employee Theft</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Employee Theft</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmployeeTheft(EmployeeTheft object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complete Service As Agreed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complete Service As Agreed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompleteServiceAsAgreed(CompleteServiceAsAgreed object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EClass0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EClass0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEClass0(EClass0 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provide Secure Firmware</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provide Secure Firmware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvideSecureFirmware(ProvideSecureFirmware object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Trust Aspect</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trust Aspect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTrustAspect(TrustAspect object) {
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

} //TrustSwitch
