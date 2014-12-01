/**
 */
package behavior.trust;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import trust.instance.InstancePackage;

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
 * @see behavior.trust.TrustFactory
 * @model kind="package"
 * @generated
 */
public interface TrustPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "trust";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/trust/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-trust";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TrustPackage eINSTANCE = behavior.trust.impl.TrustPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.trust.impl.BehaviorQualityImpl <em>Behavior Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.BehaviorQualityImpl
     * @see behavior.trust.impl.TrustPackageImpl#getBehaviorQuality()
     * @generated
     */
    int BEHAVIOR_QUALITY = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__VISUAL_ELEMENTS = InstancePackage.TRUST_ASPECT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__ID = InstancePackage.TRUST_ASPECT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__NAME = InstancePackage.TRUST_ASPECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__DESCRIPTION = InstancePackage.TRUST_ASPECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__ACTIVITY_TYPE = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY__CONTRIBUTION_TYPE = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Behavior Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY_FEATURE_COUNT = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Behavior Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_QUALITY_OPERATION_COUNT = InstancePackage.TRUST_ASPECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.QualityOfProtectionImpl <em>Quality Of Protection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.QualityOfProtectionImpl
     * @see behavior.trust.impl.TrustPackageImpl#getQualityOfProtection()
     * @generated
     */
    int QUALITY_OF_PROTECTION = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__VISUAL_ELEMENTS = BEHAVIOR_QUALITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__ID = BEHAVIOR_QUALITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__NAME = BEHAVIOR_QUALITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__DESCRIPTION = BEHAVIOR_QUALITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__ACTIVITY_TYPE = BEHAVIOR_QUALITY__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION__CONTRIBUTION_TYPE = BEHAVIOR_QUALITY__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Quality Of Protection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION_FEATURE_COUNT = BEHAVIOR_QUALITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Quality Of Protection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_PROTECTION_OPERATION_COUNT = BEHAVIOR_QUALITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.PrivacyProtectionImpl <em>Privacy Protection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.PrivacyProtectionImpl
     * @see behavior.trust.impl.TrustPackageImpl#getPrivacyProtection()
     * @generated
     */
    int PRIVACY_PROTECTION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__VISUAL_ELEMENTS = QUALITY_OF_PROTECTION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__ID = QUALITY_OF_PROTECTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__NAME = QUALITY_OF_PROTECTION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__DESCRIPTION = QUALITY_OF_PROTECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__ACTIVITY_TYPE = QUALITY_OF_PROTECTION__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__CONTRIBUTION_TYPE = QUALITY_OF_PROTECTION__CONTRIBUTION_TYPE;

    /**
     * The feature id for the '<em><b>Is Administrator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__IS_ADMINISTRATOR = QUALITY_OF_PROTECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Pep Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION__IS_PEP_ENABLED = QUALITY_OF_PROTECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Privacy Protection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION_FEATURE_COUNT = QUALITY_OF_PROTECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Privacy Protection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_PROTECTION_OPERATION_COUNT = QUALITY_OF_PROTECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.QualityOfExperienceImpl <em>Quality Of Experience</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.QualityOfExperienceImpl
     * @see behavior.trust.impl.TrustPackageImpl#getQualityOfExperience()
     * @generated
     */
    int QUALITY_OF_EXPERIENCE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__VISUAL_ELEMENTS = BEHAVIOR_QUALITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__ID = BEHAVIOR_QUALITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__NAME = BEHAVIOR_QUALITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__DESCRIPTION = BEHAVIOR_QUALITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__ACTIVITY_TYPE = BEHAVIOR_QUALITY__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE__CONTRIBUTION_TYPE = BEHAVIOR_QUALITY__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Quality Of Experience</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE_FEATURE_COUNT = BEHAVIOR_QUALITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Quality Of Experience</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_EXPERIENCE_OPERATION_COUNT = BEHAVIOR_QUALITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.AdaptServiceToContextImpl <em>Adapt Service To Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.AdaptServiceToContextImpl
     * @see behavior.trust.impl.TrustPackageImpl#getAdaptServiceToContext()
     * @generated
     */
    int ADAPT_SERVICE_TO_CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__VISUAL_ELEMENTS = QUALITY_OF_EXPERIENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__ID = QUALITY_OF_EXPERIENCE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__NAME = QUALITY_OF_EXPERIENCE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__DESCRIPTION = QUALITY_OF_EXPERIENCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__ACTIVITY_TYPE = QUALITY_OF_EXPERIENCE__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT__CONTRIBUTION_TYPE = QUALITY_OF_EXPERIENCE__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Adapt Service To Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT_FEATURE_COUNT = QUALITY_OF_EXPERIENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Adapt Service To Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPT_SERVICE_TO_CONTEXT_OPERATION_COUNT = QUALITY_OF_EXPERIENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.QualityOfServiceImpl <em>Quality Of Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.QualityOfServiceImpl
     * @see behavior.trust.impl.TrustPackageImpl#getQualityOfService()
     * @generated
     */
    int QUALITY_OF_SERVICE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__VISUAL_ELEMENTS = BEHAVIOR_QUALITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__ID = BEHAVIOR_QUALITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__NAME = BEHAVIOR_QUALITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__DESCRIPTION = BEHAVIOR_QUALITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__ACTIVITY_TYPE = BEHAVIOR_QUALITY__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE__CONTRIBUTION_TYPE = BEHAVIOR_QUALITY__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Quality Of Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE_FEATURE_COUNT = BEHAVIOR_QUALITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Quality Of Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_SERVICE_OPERATION_COUNT = BEHAVIOR_QUALITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.ResponseTimeImpl <em>Response Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.ResponseTimeImpl
     * @see behavior.trust.impl.TrustPackageImpl#getResponseTime()
     * @generated
     */
    int RESPONSE_TIME = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__VISUAL_ELEMENTS = QUALITY_OF_SERVICE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__ID = QUALITY_OF_SERVICE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__NAME = QUALITY_OF_SERVICE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__DESCRIPTION = QUALITY_OF_SERVICE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__ACTIVITY_TYPE = QUALITY_OF_SERVICE__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME__CONTRIBUTION_TYPE = QUALITY_OF_SERVICE__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Response Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME_FEATURE_COUNT = QUALITY_OF_SERVICE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Response Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TIME_OPERATION_COUNT = QUALITY_OF_SERVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.InteractionContributionTrustImpl <em>Interaction Contribution Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.InteractionContributionTrustImpl
     * @see behavior.trust.impl.TrustPackageImpl#getInteractionContributionTrust()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_TRUST = 6;

    /**
     * The number of structural features of the '<em>Interaction Contribution Trust</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TRUST_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Interaction Contribution Trust</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TRUST_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.EmployeeTheftImpl <em>Employee Theft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.EmployeeTheftImpl
     * @see behavior.trust.impl.TrustPackageImpl#getEmployeeTheft()
     * @generated
     */
    int EMPLOYEE_THEFT = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__VISUAL_ELEMENTS = QUALITY_OF_PROTECTION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__ID = QUALITY_OF_PROTECTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__NAME = QUALITY_OF_PROTECTION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__DESCRIPTION = QUALITY_OF_PROTECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__ACTIVITY_TYPE = QUALITY_OF_PROTECTION__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT__CONTRIBUTION_TYPE = QUALITY_OF_PROTECTION__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Employee Theft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT_FEATURE_COUNT = QUALITY_OF_PROTECTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Employee Theft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYEE_THEFT_OPERATION_COUNT = QUALITY_OF_PROTECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.CompleteServiceAsAgreedImpl <em>Complete Service As Agreed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.CompleteServiceAsAgreedImpl
     * @see behavior.trust.impl.TrustPackageImpl#getCompleteServiceAsAgreed()
     * @generated
     */
    int COMPLETE_SERVICE_AS_AGREED = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__VISUAL_ELEMENTS = QUALITY_OF_SERVICE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__ID = QUALITY_OF_SERVICE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__NAME = QUALITY_OF_SERVICE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__DESCRIPTION = QUALITY_OF_SERVICE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__ACTIVITY_TYPE = QUALITY_OF_SERVICE__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED__CONTRIBUTION_TYPE = QUALITY_OF_SERVICE__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Complete Service As Agreed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED_FEATURE_COUNT = QUALITY_OF_SERVICE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Complete Service As Agreed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_SERVICE_AS_AGREED_OPERATION_COUNT = QUALITY_OF_SERVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.EClass0Impl <em>EClass0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.EClass0Impl
     * @see behavior.trust.impl.TrustPackageImpl#getEClass0()
     * @generated
     */
    int ECLASS0 = 10;

    /**
     * The number of structural features of the '<em>EClass0</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASS0_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>EClass0</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASS0_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.trust.impl.ProvideSecureFirmwareImpl <em>Provide Secure Firmware</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.trust.impl.ProvideSecureFirmwareImpl
     * @see behavior.trust.impl.TrustPackageImpl#getProvideSecureFirmware()
     * @generated
     */
    int PROVIDE_SECURE_FIRMWARE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__VISUAL_ELEMENTS = QUALITY_OF_PROTECTION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__ID = QUALITY_OF_PROTECTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__NAME = QUALITY_OF_PROTECTION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__DESCRIPTION = QUALITY_OF_PROTECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__ACTIVITY_TYPE = QUALITY_OF_PROTECTION__ACTIVITY_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE__CONTRIBUTION_TYPE = QUALITY_OF_PROTECTION__CONTRIBUTION_TYPE;

    /**
     * The number of structural features of the '<em>Provide Secure Firmware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE_FEATURE_COUNT = QUALITY_OF_PROTECTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Provide Secure Firmware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROVIDE_SECURE_FIRMWARE_OPERATION_COUNT = QUALITY_OF_PROTECTION_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.trust.PrivacyProtection <em>Privacy Protection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Protection</em>'.
     * @see behavior.trust.PrivacyProtection
     * @generated
     */
    EClass getPrivacyProtection();

    /**
     * Returns the meta object for the attribute '{@link behavior.trust.PrivacyProtection#isIsAdministrator <em>Is Administrator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Administrator</em>'.
     * @see behavior.trust.PrivacyProtection#isIsAdministrator()
     * @see #getPrivacyProtection()
     * @generated
     */
    EAttribute getPrivacyProtection_IsAdministrator();

    /**
     * Returns the meta object for the attribute '{@link behavior.trust.PrivacyProtection#isIsPepEnabled <em>Is Pep Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Pep Enabled</em>'.
     * @see behavior.trust.PrivacyProtection#isIsPepEnabled()
     * @see #getPrivacyProtection()
     * @generated
     */
    EAttribute getPrivacyProtection_IsPepEnabled();

    /**
     * Returns the meta object for class '{@link behavior.trust.BehaviorQuality <em>Behavior Quality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Quality</em>'.
     * @see behavior.trust.BehaviorQuality
     * @generated
     */
    EClass getBehaviorQuality();

    /**
     * Returns the meta object for the reference '{@link behavior.trust.BehaviorQuality#getActivityType <em>Activity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Activity Type</em>'.
     * @see behavior.trust.BehaviorQuality#getActivityType()
     * @see #getBehaviorQuality()
     * @generated
     */
    EReference getBehaviorQuality_ActivityType();

    /**
     * Returns the meta object for the reference '{@link behavior.trust.BehaviorQuality#getContributionType <em>Contribution Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contribution Type</em>'.
     * @see behavior.trust.BehaviorQuality#getContributionType()
     * @see #getBehaviorQuality()
     * @generated
     */
    EReference getBehaviorQuality_ContributionType();

    /**
     * Returns the meta object for class '{@link behavior.trust.AdaptServiceToContext <em>Adapt Service To Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Adapt Service To Context</em>'.
     * @see behavior.trust.AdaptServiceToContext
     * @generated
     */
    EClass getAdaptServiceToContext();

    /**
     * Returns the meta object for class '{@link behavior.trust.ResponseTime <em>Response Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response Time</em>'.
     * @see behavior.trust.ResponseTime
     * @generated
     */
    EClass getResponseTime();

    /**
     * Returns the meta object for class '{@link behavior.trust.QualityOfService <em>Quality Of Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Service</em>'.
     * @see behavior.trust.QualityOfService
     * @generated
     */
    EClass getQualityOfService();

    /**
     * Returns the meta object for class '{@link behavior.trust.QualityOfExperience <em>Quality Of Experience</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Experience</em>'.
     * @see behavior.trust.QualityOfExperience
     * @generated
     */
    EClass getQualityOfExperience();

    /**
     * Returns the meta object for class '{@link behavior.trust.InteractionContributionTrust <em>Interaction Contribution Trust</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Trust</em>'.
     * @see behavior.trust.InteractionContributionTrust
     * @generated
     */
    EClass getInteractionContributionTrust();

    /**
     * Returns the meta object for class '{@link behavior.trust.QualityOfProtection <em>Quality Of Protection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Protection</em>'.
     * @see behavior.trust.QualityOfProtection
     * @generated
     */
    EClass getQualityOfProtection();

    /**
     * Returns the meta object for class '{@link behavior.trust.EmployeeTheft <em>Employee Theft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Employee Theft</em>'.
     * @see behavior.trust.EmployeeTheft
     * @generated
     */
    EClass getEmployeeTheft();

    /**
     * Returns the meta object for class '{@link behavior.trust.CompleteServiceAsAgreed <em>Complete Service As Agreed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complete Service As Agreed</em>'.
     * @see behavior.trust.CompleteServiceAsAgreed
     * @generated
     */
    EClass getCompleteServiceAsAgreed();

    /**
     * Returns the meta object for class '{@link behavior.trust.EClass0 <em>EClass0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EClass0</em>'.
     * @see behavior.trust.EClass0
     * @generated
     */
    EClass getEClass0();

    /**
     * Returns the meta object for class '{@link behavior.trust.ProvideSecureFirmware <em>Provide Secure Firmware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Provide Secure Firmware</em>'.
     * @see behavior.trust.ProvideSecureFirmware
     * @generated
     */
    EClass getProvideSecureFirmware();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TrustFactory getTrustFactory();

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
         * The meta object literal for the '{@link behavior.trust.impl.PrivacyProtectionImpl <em>Privacy Protection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.PrivacyProtectionImpl
         * @see behavior.trust.impl.TrustPackageImpl#getPrivacyProtection()
         * @generated
         */
        EClass PRIVACY_PROTECTION = eINSTANCE.getPrivacyProtection();

        /**
         * The meta object literal for the '<em><b>Is Administrator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRIVACY_PROTECTION__IS_ADMINISTRATOR = eINSTANCE.getPrivacyProtection_IsAdministrator();

        /**
         * The meta object literal for the '<em><b>Is Pep Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRIVACY_PROTECTION__IS_PEP_ENABLED = eINSTANCE.getPrivacyProtection_IsPepEnabled();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.BehaviorQualityImpl <em>Behavior Quality</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.BehaviorQualityImpl
         * @see behavior.trust.impl.TrustPackageImpl#getBehaviorQuality()
         * @generated
         */
        EClass BEHAVIOR_QUALITY = eINSTANCE.getBehaviorQuality();

        /**
         * The meta object literal for the '<em><b>Activity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_QUALITY__ACTIVITY_TYPE = eINSTANCE.getBehaviorQuality_ActivityType();

        /**
         * The meta object literal for the '<em><b>Contribution Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_QUALITY__CONTRIBUTION_TYPE = eINSTANCE.getBehaviorQuality_ContributionType();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.AdaptServiceToContextImpl <em>Adapt Service To Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.AdaptServiceToContextImpl
         * @see behavior.trust.impl.TrustPackageImpl#getAdaptServiceToContext()
         * @generated
         */
        EClass ADAPT_SERVICE_TO_CONTEXT = eINSTANCE.getAdaptServiceToContext();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.ResponseTimeImpl <em>Response Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.ResponseTimeImpl
         * @see behavior.trust.impl.TrustPackageImpl#getResponseTime()
         * @generated
         */
        EClass RESPONSE_TIME = eINSTANCE.getResponseTime();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.QualityOfServiceImpl <em>Quality Of Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.QualityOfServiceImpl
         * @see behavior.trust.impl.TrustPackageImpl#getQualityOfService()
         * @generated
         */
        EClass QUALITY_OF_SERVICE = eINSTANCE.getQualityOfService();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.QualityOfExperienceImpl <em>Quality Of Experience</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.QualityOfExperienceImpl
         * @see behavior.trust.impl.TrustPackageImpl#getQualityOfExperience()
         * @generated
         */
        EClass QUALITY_OF_EXPERIENCE = eINSTANCE.getQualityOfExperience();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.InteractionContributionTrustImpl <em>Interaction Contribution Trust</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.InteractionContributionTrustImpl
         * @see behavior.trust.impl.TrustPackageImpl#getInteractionContributionTrust()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_TRUST = eINSTANCE.getInteractionContributionTrust();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.QualityOfProtectionImpl <em>Quality Of Protection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.QualityOfProtectionImpl
         * @see behavior.trust.impl.TrustPackageImpl#getQualityOfProtection()
         * @generated
         */
        EClass QUALITY_OF_PROTECTION = eINSTANCE.getQualityOfProtection();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.EmployeeTheftImpl <em>Employee Theft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.EmployeeTheftImpl
         * @see behavior.trust.impl.TrustPackageImpl#getEmployeeTheft()
         * @generated
         */
        EClass EMPLOYEE_THEFT = eINSTANCE.getEmployeeTheft();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.CompleteServiceAsAgreedImpl <em>Complete Service As Agreed</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.CompleteServiceAsAgreedImpl
         * @see behavior.trust.impl.TrustPackageImpl#getCompleteServiceAsAgreed()
         * @generated
         */
        EClass COMPLETE_SERVICE_AS_AGREED = eINSTANCE.getCompleteServiceAsAgreed();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.EClass0Impl <em>EClass0</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.EClass0Impl
         * @see behavior.trust.impl.TrustPackageImpl#getEClass0()
         * @generated
         */
        EClass ECLASS0 = eINSTANCE.getEClass0();

        /**
         * The meta object literal for the '{@link behavior.trust.impl.ProvideSecureFirmwareImpl <em>Provide Secure Firmware</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.trust.impl.ProvideSecureFirmwareImpl
         * @see behavior.trust.impl.TrustPackageImpl#getProvideSecureFirmware()
         * @generated
         */
        EClass PROVIDE_SECURE_FIRMWARE = eINSTANCE.getProvideSecureFirmware();

    }

} //TrustPackage
