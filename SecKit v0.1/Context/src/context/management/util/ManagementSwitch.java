/**
 */
package context.management.util;

import context.management.*;

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
 * @see context.management.ManagementPackage
 * @generated
 */
public class ManagementSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ManagementPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagementSwitch() {
        if (modelPackage == null) {
            modelPackage = ManagementPackage.eINSTANCE;
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
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION: {
                ContextProviderCharacterization contextProviderCharacterization = (ContextProviderCharacterization)theEObject;
                T result = caseContextProviderCharacterization(contextProviderCharacterization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION: {
                SituationProviderCharacterization situationProviderCharacterization = (SituationProviderCharacterization)theEObject;
                T result = caseSituationProviderCharacterization(situationProviderCharacterization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION: {
                ContextAwareServiceProvisioningDescription contextAwareServiceProvisioningDescription = (ContextAwareServiceProvisioningDescription)theEObject;
                T result = caseContextAwareServiceProvisioningDescription(contextAwareServiceProvisioningDescription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION: {
                ContextProvisioningServiceDescription contextProvisioningServiceDescription = (ContextProvisioningServiceDescription)theEObject;
                T result = caseContextProvisioningServiceDescription(contextProvisioningServiceDescription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION: {
                ContextAwareServiceProviderCharacterization contextAwareServiceProviderCharacterization = (ContextAwareServiceProviderCharacterization)theEObject;
                T result = caseContextAwareServiceProviderCharacterization(contextAwareServiceProviderCharacterization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION: {
                SituationProvisioningServiceDescription situationProvisioningServiceDescription = (SituationProvisioningServiceDescription)theEObject;
                T result = caseSituationProvisioningServiceDescription(situationProvisioningServiceDescription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.QUALITY_OF_CONTEXT_PROVISIONING: {
                QualityOfContextProvisioning qualityOfContextProvisioning = (QualityOfContextProvisioning)theEObject;
                T result = caseQualityOfContextProvisioning(qualityOfContextProvisioning);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING: {
                QualityOfSituationProvisioning qualityOfSituationProvisioning = (QualityOfSituationProvisioning)theEObject;
                T result = caseQualityOfSituationProvisioning(qualityOfSituationProvisioning);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Provider Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextProviderCharacterization(ContextProviderCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Situation Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Situation Provider Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSituationProviderCharacterization(SituationProviderCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Aware Service Provisioning Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Aware Service Provisioning Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextAwareServiceProvisioningDescription(ContextAwareServiceProvisioningDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Provisioning Service Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Provisioning Service Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextProvisioningServiceDescription(ContextProvisioningServiceDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Aware Service Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Aware Service Provider Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextAwareServiceProviderCharacterization(ContextAwareServiceProviderCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Situation Provisioning Service Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Situation Provisioning Service Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSituationProvisioningServiceDescription(SituationProvisioningServiceDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality Of Context Provisioning</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality Of Context Provisioning</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfContextProvisioning(QualityOfContextProvisioning object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality Of Situation Provisioning</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality Of Situation Provisioning</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualityOfSituationProvisioning(QualityOfSituationProvisioning object) {
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

} //ManagementSwitch
