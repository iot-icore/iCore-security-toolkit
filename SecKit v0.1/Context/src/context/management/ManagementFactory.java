/**
 */
package context.management;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.management.ManagementPackage
 * @generated
 */
public interface ManagementFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ManagementFactory eINSTANCE = context.management.impl.ManagementFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Provider Characterization</em>'.
     * @generated
     */
    ContextProviderCharacterization createContextProviderCharacterization();

    /**
     * Returns a new object of class '<em>Situation Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Situation Provider Characterization</em>'.
     * @generated
     */
    SituationProviderCharacterization createSituationProviderCharacterization();

    /**
     * Returns a new object of class '<em>Context Aware Service Provisioning Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Aware Service Provisioning Description</em>'.
     * @generated
     */
    ContextAwareServiceProvisioningDescription createContextAwareServiceProvisioningDescription();

    /**
     * Returns a new object of class '<em>Context Provisioning Service Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Provisioning Service Description</em>'.
     * @generated
     */
    ContextProvisioningServiceDescription createContextProvisioningServiceDescription();

    /**
     * Returns a new object of class '<em>Context Aware Service Provider Characterization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Aware Service Provider Characterization</em>'.
     * @generated
     */
    ContextAwareServiceProviderCharacterization createContextAwareServiceProviderCharacterization();

    /**
     * Returns a new object of class '<em>Situation Provisioning Service Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Situation Provisioning Service Description</em>'.
     * @generated
     */
    SituationProvisioningServiceDescription createSituationProvisioningServiceDescription();

    /**
     * Returns a new object of class '<em>Quality Of Context Provisioning</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quality Of Context Provisioning</em>'.
     * @generated
     */
    QualityOfContextProvisioning createQualityOfContextProvisioning();

    /**
     * Returns a new object of class '<em>Quality Of Situation Provisioning</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quality Of Situation Provisioning</em>'.
     * @generated
     */
    QualityOfSituationProvisioning createQualityOfSituationProvisioning();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ManagementPackage getManagementPackage();

} //ManagementFactory
