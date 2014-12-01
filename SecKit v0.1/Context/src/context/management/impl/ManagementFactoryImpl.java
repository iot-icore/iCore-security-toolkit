/**
 */
package context.management.impl;

import context.management.*;

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
public class ManagementFactoryImpl extends EFactoryImpl implements ManagementFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ManagementFactory init() {
        try {
            ManagementFactory theManagementFactory = (ManagementFactory)EPackage.Registry.INSTANCE.getEFactory(ManagementPackage.eNS_URI);
            if (theManagementFactory != null) {
                return theManagementFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ManagementFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagementFactoryImpl() {
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
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION: return createContextProviderCharacterization();
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION: return createSituationProviderCharacterization();
            case ManagementPackage.CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION: return createContextAwareServiceProvisioningDescription();
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION: return createContextProvisioningServiceDescription();
            case ManagementPackage.CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION: return createContextAwareServiceProviderCharacterization();
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION: return createSituationProvisioningServiceDescription();
            case ManagementPackage.QUALITY_OF_CONTEXT_PROVISIONING: return createQualityOfContextProvisioning();
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING: return createQualityOfSituationProvisioning();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextProviderCharacterization createContextProviderCharacterization() {
        ContextProviderCharacterizationImpl contextProviderCharacterization = new ContextProviderCharacterizationImpl();
        return contextProviderCharacterization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SituationProviderCharacterization createSituationProviderCharacterization() {
        SituationProviderCharacterizationImpl situationProviderCharacterization = new SituationProviderCharacterizationImpl();
        return situationProviderCharacterization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextAwareServiceProvisioningDescription createContextAwareServiceProvisioningDescription() {
        ContextAwareServiceProvisioningDescriptionImpl contextAwareServiceProvisioningDescription = new ContextAwareServiceProvisioningDescriptionImpl();
        return contextAwareServiceProvisioningDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextProvisioningServiceDescription createContextProvisioningServiceDescription() {
        ContextProvisioningServiceDescriptionImpl contextProvisioningServiceDescription = new ContextProvisioningServiceDescriptionImpl();
        return contextProvisioningServiceDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextAwareServiceProviderCharacterization createContextAwareServiceProviderCharacterization() {
        ContextAwareServiceProviderCharacterizationImpl contextAwareServiceProviderCharacterization = new ContextAwareServiceProviderCharacterizationImpl();
        return contextAwareServiceProviderCharacterization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SituationProvisioningServiceDescription createSituationProvisioningServiceDescription() {
        SituationProvisioningServiceDescriptionImpl situationProvisioningServiceDescription = new SituationProvisioningServiceDescriptionImpl();
        return situationProvisioningServiceDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfContextProvisioning createQualityOfContextProvisioning() {
        QualityOfContextProvisioningImpl qualityOfContextProvisioning = new QualityOfContextProvisioningImpl();
        return qualityOfContextProvisioning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfSituationProvisioning createQualityOfSituationProvisioning() {
        QualityOfSituationProvisioningImpl qualityOfSituationProvisioning = new QualityOfSituationProvisioningImpl();
        return qualityOfSituationProvisioning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagementPackage getManagementPackage() {
        return (ManagementPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ManagementPackage getPackage() {
        return ManagementPackage.eINSTANCE;
    }

} //ManagementFactoryImpl
