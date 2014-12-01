/**
 */
package context.management;

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
 * @see context.management.ManagementFactory
 * @model kind="package"
 * @generated
 */
public interface ManagementPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "management";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/management/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "management";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ManagementPackage eINSTANCE = context.management.impl.ManagementPackageImpl.init();

    /**
     * The meta object id for the '{@link context.management.impl.ContextProviderCharacterizationImpl <em>Context Provider Characterization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.ContextProviderCharacterizationImpl
     * @see context.management.impl.ManagementPackageImpl#getContextProviderCharacterization()
     * @generated
     */
    int CONTEXT_PROVIDER_CHARACTERIZATION = 0;

    /**
     * The feature id for the '<em><b>Context Owners</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS = 0;

    /**
     * The feature id for the '<em><b>Owner Context Attribute Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF = 1;

    /**
     * The number of structural features of the '<em>Context Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVIDER_CHARACTERIZATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Context Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVIDER_CHARACTERIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.SituationProviderCharacterizationImpl <em>Situation Provider Characterization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.SituationProviderCharacterizationImpl
     * @see context.management.impl.ManagementPackageImpl#getSituationProviderCharacterization()
     * @generated
     */
    int SITUATION_PROVIDER_CHARACTERIZATION = 1;

    /**
     * The feature id for the '<em><b>Context Owners</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS = 0;

    /**
     * The feature id for the '<em><b>Owner Situation Attribute Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF = 1;

    /**
     * The number of structural features of the '<em>Situation Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVIDER_CHARACTERIZATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Situation Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVIDER_CHARACTERIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.ContextAwareServiceProvisioningDescriptionImpl <em>Context Aware Service Provisioning Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.ContextAwareServiceProvisioningDescriptionImpl
     * @see context.management.impl.ManagementPackageImpl#getContextAwareServiceProvisioningDescription()
     * @generated
     */
    int CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION = 2;

    /**
     * The number of structural features of the '<em>Context Aware Service Provisioning Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Context Aware Service Provisioning Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.ContextProvisioningServiceDescriptionImpl <em>Context Provisioning Service Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.ContextProvisioningServiceDescriptionImpl
     * @see context.management.impl.ManagementPackageImpl#getContextProvisioningServiceDescription()
     * @generated
     */
    int CONTEXT_PROVISIONING_SERVICE_DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Context Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE = 0;

    /**
     * The number of structural features of the '<em>Context Provisioning Service Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVISIONING_SERVICE_DESCRIPTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Context Provisioning Service Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PROVISIONING_SERVICE_DESCRIPTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.ContextAwareServiceProviderCharacterizationImpl <em>Context Aware Service Provider Characterization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.ContextAwareServiceProviderCharacterizationImpl
     * @see context.management.impl.ManagementPackageImpl#getContextAwareServiceProviderCharacterization()
     * @generated
     */
    int CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION = 4;

    /**
     * The number of structural features of the '<em>Context Aware Service Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Context Aware Service Provider Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.SituationProvisioningServiceDescriptionImpl <em>Situation Provisioning Service Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.SituationProvisioningServiceDescriptionImpl
     * @see context.management.impl.ManagementPackageImpl#getSituationProvisioningServiceDescription()
     * @generated
     */
    int SITUATION_PROVISIONING_SERVICE_DESCRIPTION = 5;

    /**
     * The feature id for the '<em><b>Situation Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE = 0;

    /**
     * The number of structural features of the '<em>Situation Provisioning Service Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVISIONING_SERVICE_DESCRIPTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Situation Provisioning Service Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_PROVISIONING_SERVICE_DESCRIPTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.QualityOfContextProvisioningImpl <em>Quality Of Context Provisioning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.QualityOfContextProvisioningImpl
     * @see context.management.impl.ManagementPackageImpl#getQualityOfContextProvisioning()
     * @generated
     */
    int QUALITY_OF_CONTEXT_PROVISIONING = 6;

    /**
     * The number of structural features of the '<em>Quality Of Context Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT_PROVISIONING_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Quality Of Context Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT_PROVISIONING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.management.impl.QualityOfSituationProvisioningImpl <em>Quality Of Situation Provisioning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.management.impl.QualityOfSituationProvisioningImpl
     * @see context.management.impl.ManagementPackageImpl#getQualityOfSituationProvisioning()
     * @generated
     */
    int QUALITY_OF_SITUATION_PROVISIONING = 7;

    /**
     * The feature id for the '<em><b>Detect Situations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS = 0;

    /**
     * The feature id for the '<em><b>Report Situations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS = 1;

    /**
     * The feature id for the '<em><b>Report Situation On Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME = 2;

    /**
     * The feature id for the '<em><b>Max Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY = 3;

    /**
     * The number of structural features of the '<em>Quality Of Situation Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Quality Of Situation Provisioning</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SITUATION_PROVISIONING_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link context.management.ContextProviderCharacterization <em>Context Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Provider Characterization</em>'.
     * @see context.management.ContextProviderCharacterization
     * @generated
     */
    EClass getContextProviderCharacterization();

    /**
     * Returns the meta object for the reference list '{@link context.management.ContextProviderCharacterization#getContextOwners <em>Context Owners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Owners</em>'.
     * @see context.management.ContextProviderCharacterization#getContextOwners()
     * @see #getContextProviderCharacterization()
     * @generated
     */
    EReference getContextProviderCharacterization_ContextOwners();

    /**
     * Returns the meta object for the attribute '{@link context.management.ContextProviderCharacterization#getOwnerContextAttributeRef <em>Owner Context Attribute Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner Context Attribute Ref</em>'.
     * @see context.management.ContextProviderCharacterization#getOwnerContextAttributeRef()
     * @see #getContextProviderCharacterization()
     * @generated
     */
    EAttribute getContextProviderCharacterization_OwnerContextAttributeRef();

    /**
     * Returns the meta object for class '{@link context.management.SituationProviderCharacterization <em>Situation Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Situation Provider Characterization</em>'.
     * @see context.management.SituationProviderCharacterization
     * @generated
     */
    EClass getSituationProviderCharacterization();

    /**
     * Returns the meta object for the reference list '{@link context.management.SituationProviderCharacterization#getContextOwners <em>Context Owners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Owners</em>'.
     * @see context.management.SituationProviderCharacterization#getContextOwners()
     * @see #getSituationProviderCharacterization()
     * @generated
     */
    EReference getSituationProviderCharacterization_ContextOwners();

    /**
     * Returns the meta object for the attribute '{@link context.management.SituationProviderCharacterization#getOwnerSituationAttributeRef <em>Owner Situation Attribute Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner Situation Attribute Ref</em>'.
     * @see context.management.SituationProviderCharacterization#getOwnerSituationAttributeRef()
     * @see #getSituationProviderCharacterization()
     * @generated
     */
    EAttribute getSituationProviderCharacterization_OwnerSituationAttributeRef();

    /**
     * Returns the meta object for class '{@link context.management.ContextAwareServiceProvisioningDescription <em>Context Aware Service Provisioning Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Aware Service Provisioning Description</em>'.
     * @see context.management.ContextAwareServiceProvisioningDescription
     * @generated
     */
    EClass getContextAwareServiceProvisioningDescription();

    /**
     * Returns the meta object for class '{@link context.management.ContextProvisioningServiceDescription <em>Context Provisioning Service Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Provisioning Service Description</em>'.
     * @see context.management.ContextProvisioningServiceDescription
     * @generated
     */
    EClass getContextProvisioningServiceDescription();

    /**
     * Returns the meta object for the containment reference '{@link context.management.ContextProvisioningServiceDescription#getContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Type</em>'.
     * @see context.management.ContextProvisioningServiceDescription#getContextType()
     * @see #getContextProvisioningServiceDescription()
     * @generated
     */
    EReference getContextProvisioningServiceDescription_ContextType();

    /**
     * Returns the meta object for class '{@link context.management.ContextAwareServiceProviderCharacterization <em>Context Aware Service Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Aware Service Provider Characterization</em>'.
     * @see context.management.ContextAwareServiceProviderCharacterization
     * @generated
     */
    EClass getContextAwareServiceProviderCharacterization();

    /**
     * Returns the meta object for class '{@link context.management.SituationProvisioningServiceDescription <em>Situation Provisioning Service Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Situation Provisioning Service Description</em>'.
     * @see context.management.SituationProvisioningServiceDescription
     * @generated
     */
    EClass getSituationProvisioningServiceDescription();

    /**
     * Returns the meta object for the containment reference '{@link context.management.SituationProvisioningServiceDescription#getSituationType <em>Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Situation Type</em>'.
     * @see context.management.SituationProvisioningServiceDescription#getSituationType()
     * @see #getSituationProvisioningServiceDescription()
     * @generated
     */
    EReference getSituationProvisioningServiceDescription_SituationType();

    /**
     * Returns the meta object for class '{@link context.management.QualityOfContextProvisioning <em>Quality Of Context Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Context Provisioning</em>'.
     * @see context.management.QualityOfContextProvisioning
     * @generated
     */
    EClass getQualityOfContextProvisioning();

    /**
     * Returns the meta object for class '{@link context.management.QualityOfSituationProvisioning <em>Quality Of Situation Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Situation Provisioning</em>'.
     * @see context.management.QualityOfSituationProvisioning
     * @generated
     */
    EClass getQualityOfSituationProvisioning();

    /**
     * Returns the meta object for the attribute '{@link context.management.QualityOfSituationProvisioning#isDetectSituations <em>Detect Situations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Detect Situations</em>'.
     * @see context.management.QualityOfSituationProvisioning#isDetectSituations()
     * @see #getQualityOfSituationProvisioning()
     * @generated
     */
    EAttribute getQualityOfSituationProvisioning_DetectSituations();

    /**
     * Returns the meta object for the attribute '{@link context.management.QualityOfSituationProvisioning#isReportSituations <em>Report Situations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Situations</em>'.
     * @see context.management.QualityOfSituationProvisioning#isReportSituations()
     * @see #getQualityOfSituationProvisioning()
     * @generated
     */
    EAttribute getQualityOfSituationProvisioning_ReportSituations();

    /**
     * Returns the meta object for the attribute '{@link context.management.QualityOfSituationProvisioning#isReportSituationOnTime <em>Report Situation On Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Situation On Time</em>'.
     * @see context.management.QualityOfSituationProvisioning#isReportSituationOnTime()
     * @see #getQualityOfSituationProvisioning()
     * @generated
     */
    EAttribute getQualityOfSituationProvisioning_ReportSituationOnTime();

    /**
     * Returns the meta object for the containment reference '{@link context.management.QualityOfSituationProvisioning#getMaxDelay <em>Max Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Max Delay</em>'.
     * @see context.management.QualityOfSituationProvisioning#getMaxDelay()
     * @see #getQualityOfSituationProvisioning()
     * @generated
     */
    EReference getQualityOfSituationProvisioning_MaxDelay();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ManagementFactory getManagementFactory();

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
         * The meta object literal for the '{@link context.management.impl.ContextProviderCharacterizationImpl <em>Context Provider Characterization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.ContextProviderCharacterizationImpl
         * @see context.management.impl.ManagementPackageImpl#getContextProviderCharacterization()
         * @generated
         */
        EClass CONTEXT_PROVIDER_CHARACTERIZATION = eINSTANCE.getContextProviderCharacterization();

        /**
         * The meta object literal for the '<em><b>Context Owners</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS = eINSTANCE.getContextProviderCharacterization_ContextOwners();

        /**
         * The meta object literal for the '<em><b>Owner Context Attribute Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF = eINSTANCE.getContextProviderCharacterization_OwnerContextAttributeRef();

        /**
         * The meta object literal for the '{@link context.management.impl.SituationProviderCharacterizationImpl <em>Situation Provider Characterization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.SituationProviderCharacterizationImpl
         * @see context.management.impl.ManagementPackageImpl#getSituationProviderCharacterization()
         * @generated
         */
        EClass SITUATION_PROVIDER_CHARACTERIZATION = eINSTANCE.getSituationProviderCharacterization();

        /**
         * The meta object literal for the '<em><b>Context Owners</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS = eINSTANCE.getSituationProviderCharacterization_ContextOwners();

        /**
         * The meta object literal for the '<em><b>Owner Situation Attribute Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF = eINSTANCE.getSituationProviderCharacterization_OwnerSituationAttributeRef();

        /**
         * The meta object literal for the '{@link context.management.impl.ContextAwareServiceProvisioningDescriptionImpl <em>Context Aware Service Provisioning Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.ContextAwareServiceProvisioningDescriptionImpl
         * @see context.management.impl.ManagementPackageImpl#getContextAwareServiceProvisioningDescription()
         * @generated
         */
        EClass CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION = eINSTANCE.getContextAwareServiceProvisioningDescription();

        /**
         * The meta object literal for the '{@link context.management.impl.ContextProvisioningServiceDescriptionImpl <em>Context Provisioning Service Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.ContextProvisioningServiceDescriptionImpl
         * @see context.management.impl.ManagementPackageImpl#getContextProvisioningServiceDescription()
         * @generated
         */
        EClass CONTEXT_PROVISIONING_SERVICE_DESCRIPTION = eINSTANCE.getContextProvisioningServiceDescription();

        /**
         * The meta object literal for the '<em><b>Context Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE = eINSTANCE.getContextProvisioningServiceDescription_ContextType();

        /**
         * The meta object literal for the '{@link context.management.impl.ContextAwareServiceProviderCharacterizationImpl <em>Context Aware Service Provider Characterization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.ContextAwareServiceProviderCharacterizationImpl
         * @see context.management.impl.ManagementPackageImpl#getContextAwareServiceProviderCharacterization()
         * @generated
         */
        EClass CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION = eINSTANCE.getContextAwareServiceProviderCharacterization();

        /**
         * The meta object literal for the '{@link context.management.impl.SituationProvisioningServiceDescriptionImpl <em>Situation Provisioning Service Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.SituationProvisioningServiceDescriptionImpl
         * @see context.management.impl.ManagementPackageImpl#getSituationProvisioningServiceDescription()
         * @generated
         */
        EClass SITUATION_PROVISIONING_SERVICE_DESCRIPTION = eINSTANCE.getSituationProvisioningServiceDescription();

        /**
         * The meta object literal for the '<em><b>Situation Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE = eINSTANCE.getSituationProvisioningServiceDescription_SituationType();

        /**
         * The meta object literal for the '{@link context.management.impl.QualityOfContextProvisioningImpl <em>Quality Of Context Provisioning</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.QualityOfContextProvisioningImpl
         * @see context.management.impl.ManagementPackageImpl#getQualityOfContextProvisioning()
         * @generated
         */
        EClass QUALITY_OF_CONTEXT_PROVISIONING = eINSTANCE.getQualityOfContextProvisioning();

        /**
         * The meta object literal for the '{@link context.management.impl.QualityOfSituationProvisioningImpl <em>Quality Of Situation Provisioning</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.management.impl.QualityOfSituationProvisioningImpl
         * @see context.management.impl.ManagementPackageImpl#getQualityOfSituationProvisioning()
         * @generated
         */
        EClass QUALITY_OF_SITUATION_PROVISIONING = eINSTANCE.getQualityOfSituationProvisioning();

        /**
         * The meta object literal for the '<em><b>Detect Situations</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS = eINSTANCE.getQualityOfSituationProvisioning_DetectSituations();

        /**
         * The meta object literal for the '<em><b>Report Situations</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS = eINSTANCE.getQualityOfSituationProvisioning_ReportSituations();

        /**
         * The meta object literal for the '<em><b>Report Situation On Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME = eINSTANCE.getQualityOfSituationProvisioning_ReportSituationOnTime();

        /**
         * The meta object literal for the '<em><b>Max Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY = eINSTANCE.getQualityOfSituationProvisioning_MaxDelay();

    }

} //ManagementPackage
