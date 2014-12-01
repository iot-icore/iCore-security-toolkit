/**
 */
package identity.type;

import data.instantiation.InstantiationPackage;

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
 * @see identity.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://identity/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = identity.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link identity.type.impl.DigitalIdentityTypeImpl <em>Digital Identity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.DigitalIdentityTypeImpl
     * @see identity.type.impl.TypePackageImpl#getDigitalIdentityType()
     * @generated
     */
    int DIGITAL_IDENTITY_TYPE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Attribute Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Digital Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Digital Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentityTypePackageImpl <em>Identity Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentityTypePackageImpl
     * @see identity.type.impl.TypePackageImpl#getIdentityTypePackage()
     * @generated
     */
    int IDENTITY_TYPE_PACKAGE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Identity Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Attribute Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Identity Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Identity Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.AuthenticationMethodImpl <em>Authentication Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.AuthenticationMethodImpl
     * @see identity.type.impl.TypePackageImpl#getAuthenticationMethod()
     * @generated
     */
    int AUTHENTICATION_METHOD = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_METHOD__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_METHOD__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The number of structural features of the '<em>Authentication Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_METHOD_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Authentication Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_METHOD_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PasswordAuthenticationImpl <em>Password Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PasswordAuthenticationImpl
     * @see identity.type.impl.TypePackageImpl#getPasswordAuthentication()
     * @generated
     */
    int PASSWORD_AUTHENTICATION = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_AUTHENTICATION__VISUAL_ELEMENTS = AUTHENTICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_AUTHENTICATION__ID = AUTHENTICATION_METHOD__ID;

    /**
     * The number of structural features of the '<em>Password Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Password Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.TokenAuthenticationImpl <em>Token Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.TokenAuthenticationImpl
     * @see identity.type.impl.TypePackageImpl#getTokenAuthentication()
     * @generated
     */
    int TOKEN_AUTHENTICATION = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN_AUTHENTICATION__VISUAL_ELEMENTS = AUTHENTICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN_AUTHENTICATION__ID = AUTHENTICATION_METHOD__ID;

    /**
     * The number of structural features of the '<em>Token Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Token Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ExternalAuthenticationImpl <em>External Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ExternalAuthenticationImpl
     * @see identity.type.impl.TypePackageImpl#getExternalAuthentication()
     * @generated
     */
    int EXTERNAL_AUTHENTICATION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_AUTHENTICATION__VISUAL_ELEMENTS = AUTHENTICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_AUTHENTICATION__ID = AUTHENTICATION_METHOD__ID;

    /**
     * The number of structural features of the '<em>External Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>External Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.AttributeVerificationMethodImpl <em>Attribute Verification Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.AttributeVerificationMethodImpl
     * @see identity.type.impl.TypePackageImpl#getAttributeVerificationMethod()
     * @generated
     */
    int ATTRIBUTE_VERIFICATION_METHOD = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VERIFICATION_METHOD__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VERIFICATION_METHOD__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VERIFICATION_METHOD__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attribute Verification Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VERIFICATION_METHOD_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Attribute Verification Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_VERIFICATION_METHOD_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.DirectVerificationImpl <em>Direct Verification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.DirectVerificationImpl
     * @see identity.type.impl.TypePackageImpl#getDirectVerification()
     * @generated
     */
    int DIRECT_VERIFICATION = 20;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_VERIFICATION__VISUAL_ELEMENTS = ATTRIBUTE_VERIFICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_VERIFICATION__ID = ATTRIBUTE_VERIFICATION_METHOD__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_VERIFICATION__NAME = ATTRIBUTE_VERIFICATION_METHOD__NAME;

    /**
     * The number of structural features of the '<em>Direct Verification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_VERIFICATION_FEATURE_COUNT = ATTRIBUTE_VERIFICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Direct Verification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_VERIFICATION_OPERATION_COUNT = ATTRIBUTE_VERIFICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.RemoteImpl <em>Remote</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.RemoteImpl
     * @see identity.type.impl.TypePackageImpl#getRemote()
     * @generated
     */
    int REMOTE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE__VISUAL_ELEMENTS = DIRECT_VERIFICATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE__ID = DIRECT_VERIFICATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE__NAME = DIRECT_VERIFICATION__NAME;

    /**
     * The number of structural features of the '<em>Remote</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FEATURE_COUNT = DIRECT_VERIFICATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Remote</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_OPERATION_COUNT = DIRECT_VERIFICATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.AuthenticationCredentialImpl <em>Authentication Credential</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.AuthenticationCredentialImpl
     * @see identity.type.impl.TypePackageImpl#getAuthenticationCredential()
     * @generated
     */
    int AUTHENTICATION_CREDENTIAL = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_CREDENTIAL__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_CREDENTIAL__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_CREDENTIAL__VALUE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Authentication Credential</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_CREDENTIAL_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Authentication Credential</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_CREDENTIAL_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.BiometricCredentialImpl <em>Biometric Credential</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.BiometricCredentialImpl
     * @see identity.type.impl.TypePackageImpl#getBiometricCredential()
     * @generated
     */
    int BIOMETRIC_CREDENTIAL = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIOMETRIC_CREDENTIAL__VISUAL_ELEMENTS = AUTHENTICATION_CREDENTIAL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIOMETRIC_CREDENTIAL__ID = AUTHENTICATION_CREDENTIAL__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIOMETRIC_CREDENTIAL__VALUE = AUTHENTICATION_CREDENTIAL__VALUE;

    /**
     * The number of structural features of the '<em>Biometric Credential</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIOMETRIC_CREDENTIAL_FEATURE_COUNT = AUTHENTICATION_CREDENTIAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Biometric Credential</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIOMETRIC_CREDENTIAL_OPERATION_COUNT = AUTHENTICATION_CREDENTIAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PhysicalTokenImpl <em>Physical Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PhysicalTokenImpl
     * @see identity.type.impl.TypePackageImpl#getPhysicalToken()
     * @generated
     */
    int PHYSICAL_TOKEN = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN__VISUAL_ELEMENTS = AUTHENTICATION_CREDENTIAL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN__ID = AUTHENTICATION_CREDENTIAL__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN__VALUE = AUTHENTICATION_CREDENTIAL__VALUE;

    /**
     * The feature id for the '<em><b>Media Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN__MEDIA_TYPE = AUTHENTICATION_CREDENTIAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Physical Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN_FEATURE_COUNT = AUTHENTICATION_CREDENTIAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Physical Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_TOKEN_OPERATION_COUNT = AUTHENTICATION_CREDENTIAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PhysicalPresenceFace2FaceImpl <em>Physical Presence Face2 Face</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PhysicalPresenceFace2FaceImpl
     * @see identity.type.impl.TypePackageImpl#getPhysicalPresenceFace2Face()
     * @generated
     */
    int PHYSICAL_PRESENCE_FACE2_FACE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_PRESENCE_FACE2_FACE__VISUAL_ELEMENTS = DIRECT_VERIFICATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_PRESENCE_FACE2_FACE__ID = DIRECT_VERIFICATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_PRESENCE_FACE2_FACE__NAME = DIRECT_VERIFICATION__NAME;

    /**
     * The number of structural features of the '<em>Physical Presence Face2 Face</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_PRESENCE_FACE2_FACE_FEATURE_COUNT = DIRECT_VERIFICATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Physical Presence Face2 Face</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_PRESENCE_FACE2_FACE_OPERATION_COUNT = DIRECT_VERIFICATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentifierImpl
     * @see identity.type.impl.TypePackageImpl#getIdentifier()
     * @generated
     */
    int IDENTIFIER = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__VISUAL_ELEMENTS = AUTHENTICATION_CREDENTIAL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__ID = AUTHENTICATION_CREDENTIAL__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER__VALUE = AUTHENTICATION_CREDENTIAL__VALUE;

    /**
     * The number of structural features of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_FEATURE_COUNT = AUTHENTICATION_CREDENTIAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_OPERATION_COUNT = AUTHENTICATION_CREDENTIAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.SharedSecretImpl <em>Shared Secret</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.SharedSecretImpl
     * @see identity.type.impl.TypePackageImpl#getSharedSecret()
     * @generated
     */
    int SHARED_SECRET = 33;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHARED_SECRET__VISUAL_ELEMENTS = AUTHENTICATION_CREDENTIAL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHARED_SECRET__ID = AUTHENTICATION_CREDENTIAL__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHARED_SECRET__VALUE = AUTHENTICATION_CREDENTIAL__VALUE;

    /**
     * The number of structural features of the '<em>Shared Secret</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHARED_SECRET_FEATURE_COUNT = AUTHENTICATION_CREDENTIAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Shared Secret</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHARED_SECRET_OPERATION_COUNT = AUTHENTICATION_CREDENTIAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PasswordImpl <em>Password</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PasswordImpl
     * @see identity.type.impl.TypePackageImpl#getPassword()
     * @generated
     */
    int PASSWORD = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD__VISUAL_ELEMENTS = SHARED_SECRET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD__ID = SHARED_SECRET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD__VALUE = SHARED_SECRET__VALUE;

    /**
     * The number of structural features of the '<em>Password</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_FEATURE_COUNT = SHARED_SECRET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Password</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_OPERATION_COUNT = SHARED_SECRET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentityAttributeInstantiationImpl <em>Identity Attribute Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentityAttributeInstantiationImpl
     * @see identity.type.impl.TypePackageImpl#getIdentityAttributeInstantiation()
     * @generated
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__VISUAL_ELEMENTS = InstantiationPackage.DATA_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__ID = InstantiationPackage.DATA_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Contained Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__CONTAINED_DATA_SET = InstantiationPackage.DATA_INSTANTIATION__CONTAINED_DATA_SET;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__TYPE = InstantiationPackage.DATA_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__NAME = InstantiationPackage.DATA_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__INSTANCES = InstantiationPackage.DATA_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__ARRAY = InstantiationPackage.DATA_INSTANTIATION__ARRAY;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__DESCRIPTION = InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__PATTERNS = InstantiationPackage.DATA_INSTANTIATION__PATTERNS;

    /**
     * The feature id for the '<em><b>Identity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE = InstantiationPackage.DATA_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Verification Method</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD = InstantiationPackage.DATA_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Identity Attribute Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION_FEATURE_COUNT = InstantiationPackage.DATA_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Identity Attribute Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_INSTANTIATION_OPERATION_COUNT = InstantiationPackage.DATA_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentityTypeImpl <em>Identity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentityTypeImpl
     * @see identity.type.impl.TypePackageImpl#getIdentityType()
     * @generated
     */
    int IDENTITY_TYPE = 16;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PhysicalIdentityTypeImpl <em>Physical Identity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PhysicalIdentityTypeImpl
     * @see identity.type.impl.TypePackageImpl#getPhysicalIdentityType()
     * @generated
     */
    int PHYSICAL_IDENTITY_TYPE = 15;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__VISUAL_ELEMENTS = IDENTITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__ID = IDENTITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__PACKAGE = IDENTITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__NAME = IDENTITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__INSTANTIATIONS = IDENTITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE__DESCRIPTION = IDENTITY_TYPE__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Physical Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE_FEATURE_COUNT = IDENTITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Physical Identity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_IDENTITY_TYPE_OPERATION_COUNT = IDENTITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.NotVerifiedImpl <em>Not Verified</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.NotVerifiedImpl
     * @see identity.type.impl.TypePackageImpl#getNotVerified()
     * @generated
     */
    int NOT_VERIFIED = 17;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_VERIFIED__VISUAL_ELEMENTS = ATTRIBUTE_VERIFICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_VERIFIED__ID = ATTRIBUTE_VERIFICATION_METHOD__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_VERIFIED__NAME = ATTRIBUTE_VERIFICATION_METHOD__NAME;

    /**
     * The number of structural features of the '<em>Not Verified</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_VERIFIED_FEATURE_COUNT = ATTRIBUTE_VERIFICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Not Verified</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_VERIFIED_OPERATION_COUNT = ATTRIBUTE_VERIFICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentityRegistrationImpl <em>Identity Registration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentityRegistrationImpl
     * @see identity.type.impl.TypePackageImpl#getIdentityRegistration()
     * @generated
     */
    int IDENTITY_REGISTRATION = 18;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REGISTRATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REGISTRATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Required Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Registration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REGISTRATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Registration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REGISTRATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.OpenSignUpImpl <em>Open Sign Up</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.OpenSignUpImpl
     * @see identity.type.impl.TypePackageImpl#getOpenSignUp()
     * @generated
     */
    int OPEN_SIGN_UP = 19;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_SIGN_UP__VISUAL_ELEMENTS = IDENTITY_REGISTRATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_SIGN_UP__ID = IDENTITY_REGISTRATION__ID;

    /**
     * The feature id for the '<em><b>Required Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_SIGN_UP__REQUIRED_ATTRIBUTES = IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES;

    /**
     * The number of structural features of the '<em>Open Sign Up</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_SIGN_UP_FEATURE_COUNT = IDENTITY_REGISTRATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Open Sign Up</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_SIGN_UP_OPERATION_COUNT = IDENTITY_REGISTRATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ElectronicDocumentImpl <em>Electronic Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ElectronicDocumentImpl
     * @see identity.type.impl.TypePackageImpl#getElectronicDocument()
     * @generated
     */
    int ELECTRONIC_DOCUMENT = 21;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__VISUAL_ELEMENTS = PHYSICAL_IDENTITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__ID = PHYSICAL_IDENTITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__PACKAGE = PHYSICAL_IDENTITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__NAME = PHYSICAL_IDENTITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__INSTANTIATIONS = PHYSICAL_IDENTITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__DESCRIPTION = PHYSICAL_IDENTITY_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Contains</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__CONTAINS = PHYSICAL_IDENTITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Media Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT__MEDIA_TYPE = PHYSICAL_IDENTITY_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Electronic Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT_FEATURE_COUNT = PHYSICAL_IDENTITY_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Electronic Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_DOCUMENT_OPERATION_COUNT = PHYSICAL_IDENTITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.MediaTypeImpl <em>Media Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.MediaTypeImpl
     * @see identity.type.impl.TypePackageImpl#getMediaType()
     * @generated
     */
    int MEDIA_TYPE = 22;

    /**
     * The number of structural features of the '<em>Media Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIA_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Media Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDIA_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ContactlessSmartCardImpl <em>Contactless Smart Card</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ContactlessSmartCardImpl
     * @see identity.type.impl.TypePackageImpl#getContactlessSmartCard()
     * @generated
     */
    int CONTACTLESS_SMART_CARD = 23;

    /**
     * The number of structural features of the '<em>Contactless Smart Card</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACTLESS_SMART_CARD_FEATURE_COUNT = MEDIA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Contactless Smart Card</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTACTLESS_SMART_CARD_OPERATION_COUNT = MEDIA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.AuthenticationAssertionImpl <em>Authentication Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.AuthenticationAssertionImpl
     * @see identity.type.impl.TypePackageImpl#getAuthenticationAssertion()
     * @generated
     */
    int AUTHENTICATION_ASSERTION = 24;

    /**
     * The number of structural features of the '<em>Authentication Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_ASSERTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Authentication Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_ASSERTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.GovernmentImpl <em>Government</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.GovernmentImpl
     * @see identity.type.impl.TypePackageImpl#getGovernment()
     * @generated
     */
    int GOVERNMENT = 25;

    /**
     * The number of structural features of the '<em>Government</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOVERNMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Government</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOVERNMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.EmploymentImpl <em>Employment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.EmploymentImpl
     * @see identity.type.impl.TypePackageImpl#getEmployment()
     * @generated
     */
    int EMPLOYMENT = 26;

    /**
     * The number of structural features of the '<em>Employment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Employment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPLOYMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PrivateImpl <em>Private</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PrivateImpl
     * @see identity.type.impl.TypePackageImpl#getPrivate()
     * @generated
     */
    int PRIVATE = 27;

    /**
     * The number of structural features of the '<em>Private</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Private</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ProfessionalImpl <em>Professional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ProfessionalImpl
     * @see identity.type.impl.TypePackageImpl#getProfessional()
     * @generated
     */
    int PROFESSIONAL = 28;

    /**
     * The number of structural features of the '<em>Professional</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROFESSIONAL_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Professional</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROFESSIONAL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.MobilePhoneImpl
     * @see identity.type.impl.TypePackageImpl#getMobilePhone()
     * @generated
     */
    int MOBILE_PHONE = 29;

    /**
     * The number of structural features of the '<em>Mobile Phone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOBILE_PHONE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Mobile Phone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOBILE_PHONE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.BanksImpl <em>Banks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.BanksImpl
     * @see identity.type.impl.TypePackageImpl#getBanks()
     * @generated
     */
    int BANKS = 30;

    /**
     * The number of structural features of the '<em>Banks</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BANKS_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Banks</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BANKS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ElectronicMailAddressImpl <em>Electronic Mail Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ElectronicMailAddressImpl
     * @see identity.type.impl.TypePackageImpl#getElectronicMailAddress()
     * @generated
     */
    int ELECTRONIC_MAIL_ADDRESS = 31;

    /**
     * The number of structural features of the '<em>Electronic Mail Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_MAIL_ADDRESS_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Electronic Mail Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELECTRONIC_MAIL_ADDRESS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.SocialNetworkImpl <em>Social Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.SocialNetworkImpl
     * @see identity.type.impl.TypePackageImpl#getSocialNetwork()
     * @generated
     */
    int SOCIAL_NETWORK = 32;

    /**
     * The number of structural features of the '<em>Social Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCIAL_NETWORK_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Social Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCIAL_NETWORK_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.PublicKeyAuthenticationImpl <em>Public Key Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.PublicKeyAuthenticationImpl
     * @see identity.type.impl.TypePackageImpl#getPublicKeyAuthentication()
     * @generated
     */
    int PUBLIC_KEY_AUTHENTICATION = 34;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PUBLIC_KEY_AUTHENTICATION__VISUAL_ELEMENTS = AUTHENTICATION_METHOD__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PUBLIC_KEY_AUTHENTICATION__ID = AUTHENTICATION_METHOD__ID;

    /**
     * The number of structural features of the '<em>Public Key Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PUBLIC_KEY_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Public Key Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PUBLIC_KEY_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.type.impl.ChallengeResponseImpl <em>Challenge Response</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.ChallengeResponseImpl
     * @see identity.type.impl.TypePackageImpl#getChallengeResponse()
     * @generated
     */
    int CHALLENGE_RESPONSE = 35;

    /**
     * The number of structural features of the '<em>Challenge Response</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHALLENGE_RESPONSE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Challenge Response</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHALLENGE_RESPONSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.IdentityAttributeTypeImpl <em>Identity Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.IdentityAttributeTypeImpl
     * @see identity.type.impl.TypePackageImpl#getIdentityAttributeType()
     * @generated
     */
    int IDENTITY_ATTRIBUTE_TYPE = 36;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_TYPE__PACKAGE = 0;

    /**
     * The number of structural features of the '<em>Identity Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Identity Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.type.impl.LevelOfAssuranceImpl <em>Level Of Assurance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.type.impl.LevelOfAssuranceImpl
     * @see identity.type.impl.TypePackageImpl#getLevelOfAssurance()
     * @generated
     */
    int LEVEL_OF_ASSURANCE = 37;

    /**
     * The number of structural features of the '<em>Level Of Assurance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_OF_ASSURANCE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Level Of Assurance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_OF_ASSURANCE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link identity.type.DigitalIdentityType <em>Digital Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Digital Identity Type</em>'.
     * @see identity.type.DigitalIdentityType
     * @generated
     */
    EClass getDigitalIdentityType();

    /**
     * Returns the meta object for the containment reference list '{@link identity.type.DigitalIdentityType#getAttributeInstantiations <em>Attribute Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Instantiations</em>'.
     * @see identity.type.DigitalIdentityType#getAttributeInstantiations()
     * @see #getDigitalIdentityType()
     * @generated
     */
    EReference getDigitalIdentityType_AttributeInstantiations();

    /**
     * Returns the meta object for class '{@link identity.type.IdentityTypePackage <em>Identity Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Type Package</em>'.
     * @see identity.type.IdentityTypePackage
     * @generated
     */
    EClass getIdentityTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link identity.type.IdentityTypePackage#getIdentityTypes <em>Identity Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Types</em>'.
     * @see identity.type.IdentityTypePackage#getIdentityTypes()
     * @see #getIdentityTypePackage()
     * @generated
     */
    EReference getIdentityTypePackage_IdentityTypes();

    /**
     * Returns the meta object for the attribute '{@link identity.type.IdentityTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see identity.type.IdentityTypePackage#getName()
     * @see #getIdentityTypePackage()
     * @generated
     */
    EAttribute getIdentityTypePackage_Name();

    /**
     * Returns the meta object for the container reference '{@link identity.type.IdentityTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see identity.type.IdentityTypePackage#getModel()
     * @see #getIdentityTypePackage()
     * @generated
     */
    EReference getIdentityTypePackage_Model();

    /**
     * Returns the meta object for the containment reference list '{@link identity.type.IdentityTypePackage#getAttributeTypes <em>Attribute Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Types</em>'.
     * @see identity.type.IdentityTypePackage#getAttributeTypes()
     * @see #getIdentityTypePackage()
     * @generated
     */
    EReference getIdentityTypePackage_AttributeTypes();

    /**
     * Returns the meta object for class '{@link identity.type.AuthenticationMethod <em>Authentication Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication Method</em>'.
     * @see identity.type.AuthenticationMethod
     * @generated
     */
    EClass getAuthenticationMethod();

    /**
     * Returns the meta object for class '{@link identity.type.PasswordAuthentication <em>Password Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Password Authentication</em>'.
     * @see identity.type.PasswordAuthentication
     * @generated
     */
    EClass getPasswordAuthentication();

    /**
     * Returns the meta object for class '{@link identity.type.TokenAuthentication <em>Token Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Token Authentication</em>'.
     * @see identity.type.TokenAuthentication
     * @generated
     */
    EClass getTokenAuthentication();

    /**
     * Returns the meta object for class '{@link identity.type.ExternalAuthentication <em>External Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>External Authentication</em>'.
     * @see identity.type.ExternalAuthentication
     * @generated
     */
    EClass getExternalAuthentication();

    /**
     * Returns the meta object for class '{@link identity.type.Remote <em>Remote</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote</em>'.
     * @see identity.type.Remote
     * @generated
     */
    EClass getRemote();

    /**
     * Returns the meta object for class '{@link identity.type.BiometricCredential <em>Biometric Credential</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Biometric Credential</em>'.
     * @see identity.type.BiometricCredential
     * @generated
     */
    EClass getBiometricCredential();

    /**
     * Returns the meta object for class '{@link identity.type.PhysicalToken <em>Physical Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Token</em>'.
     * @see identity.type.PhysicalToken
     * @generated
     */
    EClass getPhysicalToken();

    /**
     * Returns the meta object for the containment reference '{@link identity.type.PhysicalToken#getMediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Media Type</em>'.
     * @see identity.type.PhysicalToken#getMediaType()
     * @see #getPhysicalToken()
     * @generated
     */
    EReference getPhysicalToken_MediaType();

    /**
     * Returns the meta object for class '{@link identity.type.PhysicalPresenceFace2Face <em>Physical Presence Face2 Face</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Presence Face2 Face</em>'.
     * @see identity.type.PhysicalPresenceFace2Face
     * @generated
     */
    EClass getPhysicalPresenceFace2Face();

    /**
     * Returns the meta object for class '{@link identity.type.AuthenticationCredential <em>Authentication Credential</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication Credential</em>'.
     * @see identity.type.AuthenticationCredential
     * @generated
     */
    EClass getAuthenticationCredential();

    /**
     * Returns the meta object for the attribute '{@link identity.type.AuthenticationCredential#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see identity.type.AuthenticationCredential#getValue()
     * @see #getAuthenticationCredential()
     * @generated
     */
    EAttribute getAuthenticationCredential_Value();

    /**
     * Returns the meta object for class '{@link identity.type.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifier</em>'.
     * @see identity.type.Identifier
     * @generated
     */
    EClass getIdentifier();

    /**
     * Returns the meta object for class '{@link identity.type.Password <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Password</em>'.
     * @see identity.type.Password
     * @generated
     */
    EClass getPassword();

    /**
     * Returns the meta object for class '{@link identity.type.AttributeVerificationMethod <em>Attribute Verification Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Verification Method</em>'.
     * @see identity.type.AttributeVerificationMethod
     * @generated
     */
    EClass getAttributeVerificationMethod();

    /**
     * Returns the meta object for the attribute '{@link identity.type.AttributeVerificationMethod#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see identity.type.AttributeVerificationMethod#getName()
     * @see #getAttributeVerificationMethod()
     * @generated
     */
    EAttribute getAttributeVerificationMethod_Name();

    /**
     * Returns the meta object for class '{@link identity.type.IdentityAttributeInstantiation <em>Identity Attribute Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Attribute Instantiation</em>'.
     * @see identity.type.IdentityAttributeInstantiation
     * @generated
     */
    EClass getIdentityAttributeInstantiation();

    /**
     * Returns the meta object for the container reference '{@link identity.type.IdentityAttributeInstantiation#getIdentityType <em>Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Identity Type</em>'.
     * @see identity.type.IdentityAttributeInstantiation#getIdentityType()
     * @see #getIdentityAttributeInstantiation()
     * @generated
     */
    EReference getIdentityAttributeInstantiation_IdentityType();

    /**
     * Returns the meta object for the containment reference '{@link identity.type.IdentityAttributeInstantiation#getVerificationMethod <em>Verification Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Verification Method</em>'.
     * @see identity.type.IdentityAttributeInstantiation#getVerificationMethod()
     * @see #getIdentityAttributeInstantiation()
     * @generated
     */
    EReference getIdentityAttributeInstantiation_VerificationMethod();

    /**
     * Returns the meta object for class '{@link identity.type.PhysicalIdentityType <em>Physical Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Identity Type</em>'.
     * @see identity.type.PhysicalIdentityType
     * @generated
     */
    EClass getPhysicalIdentityType();

    /**
     * Returns the meta object for class '{@link identity.type.IdentityType <em>Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Type</em>'.
     * @see identity.type.IdentityType
     * @generated
     */
    EClass getIdentityType();

    /**
     * Returns the meta object for the container reference '{@link identity.type.IdentityType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see identity.type.IdentityType#getPackage()
     * @see #getIdentityType()
     * @generated
     */
    EReference getIdentityType_Package();

    /**
     * Returns the meta object for the attribute '{@link identity.type.IdentityType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see identity.type.IdentityType#getName()
     * @see #getIdentityType()
     * @generated
     */
    EAttribute getIdentityType_Name();

    /**
     * Returns the meta object for the reference list '{@link identity.type.IdentityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see identity.type.IdentityType#getInstantiations()
     * @see #getIdentityType()
     * @generated
     */
    EReference getIdentityType_Instantiations();

    /**
     * Returns the meta object for the attribute '{@link identity.type.IdentityType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see identity.type.IdentityType#getDescription()
     * @see #getIdentityType()
     * @generated
     */
    EAttribute getIdentityType_Description();

    /**
     * Returns the meta object for class '{@link identity.type.NotVerified <em>Not Verified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Not Verified</em>'.
     * @see identity.type.NotVerified
     * @generated
     */
    EClass getNotVerified();

    /**
     * Returns the meta object for class '{@link identity.type.IdentityRegistration <em>Identity Registration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Registration</em>'.
     * @see identity.type.IdentityRegistration
     * @generated
     */
    EClass getIdentityRegistration();

    /**
     * Returns the meta object for the containment reference list '{@link identity.type.IdentityRegistration#getRequiredAttributes <em>Required Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Required Attributes</em>'.
     * @see identity.type.IdentityRegistration#getRequiredAttributes()
     * @see #getIdentityRegistration()
     * @generated
     */
    EReference getIdentityRegistration_RequiredAttributes();

    /**
     * Returns the meta object for class '{@link identity.type.OpenSignUp <em>Open Sign Up</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Open Sign Up</em>'.
     * @see identity.type.OpenSignUp
     * @generated
     */
    EClass getOpenSignUp();

    /**
     * Returns the meta object for class '{@link identity.type.DirectVerification <em>Direct Verification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Direct Verification</em>'.
     * @see identity.type.DirectVerification
     * @generated
     */
    EClass getDirectVerification();

    /**
     * Returns the meta object for class '{@link identity.type.ElectronicDocument <em>Electronic Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Electronic Document</em>'.
     * @see identity.type.ElectronicDocument
     * @generated
     */
    EClass getElectronicDocument();

    /**
     * Returns the meta object for the containment reference list '{@link identity.type.ElectronicDocument#getContains <em>Contains</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contains</em>'.
     * @see identity.type.ElectronicDocument#getContains()
     * @see #getElectronicDocument()
     * @generated
     */
    EReference getElectronicDocument_Contains();

    /**
     * Returns the meta object for the containment reference '{@link identity.type.ElectronicDocument#getMediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Media Type</em>'.
     * @see identity.type.ElectronicDocument#getMediaType()
     * @see #getElectronicDocument()
     * @generated
     */
    EReference getElectronicDocument_MediaType();

    /**
     * Returns the meta object for class '{@link identity.type.MediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Media Type</em>'.
     * @see identity.type.MediaType
     * @generated
     */
    EClass getMediaType();

    /**
     * Returns the meta object for class '{@link identity.type.ContactlessSmartCard <em>Contactless Smart Card</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contactless Smart Card</em>'.
     * @see identity.type.ContactlessSmartCard
     * @generated
     */
    EClass getContactlessSmartCard();

    /**
     * Returns the meta object for class '{@link identity.type.AuthenticationAssertion <em>Authentication Assertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication Assertion</em>'.
     * @see identity.type.AuthenticationAssertion
     * @generated
     */
    EClass getAuthenticationAssertion();

    /**
     * Returns the meta object for class '{@link identity.type.Government <em>Government</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Government</em>'.
     * @see identity.type.Government
     * @generated
     */
    EClass getGovernment();

    /**
     * Returns the meta object for class '{@link identity.type.Employment <em>Employment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Employment</em>'.
     * @see identity.type.Employment
     * @generated
     */
    EClass getEmployment();

    /**
     * Returns the meta object for class '{@link identity.type.Private <em>Private</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Private</em>'.
     * @see identity.type.Private
     * @generated
     */
    EClass getPrivate();

    /**
     * Returns the meta object for class '{@link identity.type.Professional <em>Professional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Professional</em>'.
     * @see identity.type.Professional
     * @generated
     */
    EClass getProfessional();

    /**
     * Returns the meta object for class '{@link identity.type.MobilePhone <em>Mobile Phone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mobile Phone</em>'.
     * @see identity.type.MobilePhone
     * @generated
     */
    EClass getMobilePhone();

    /**
     * Returns the meta object for class '{@link identity.type.Banks <em>Banks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Banks</em>'.
     * @see identity.type.Banks
     * @generated
     */
    EClass getBanks();

    /**
     * Returns the meta object for class '{@link identity.type.ElectronicMailAddress <em>Electronic Mail Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Electronic Mail Address</em>'.
     * @see identity.type.ElectronicMailAddress
     * @generated
     */
    EClass getElectronicMailAddress();

    /**
     * Returns the meta object for class '{@link identity.type.SocialNetwork <em>Social Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Social Network</em>'.
     * @see identity.type.SocialNetwork
     * @generated
     */
    EClass getSocialNetwork();

    /**
     * Returns the meta object for class '{@link identity.type.SharedSecret <em>Shared Secret</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shared Secret</em>'.
     * @see identity.type.SharedSecret
     * @generated
     */
    EClass getSharedSecret();

    /**
     * Returns the meta object for class '{@link identity.type.PublicKeyAuthentication <em>Public Key Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Public Key Authentication</em>'.
     * @see identity.type.PublicKeyAuthentication
     * @generated
     */
    EClass getPublicKeyAuthentication();

    /**
     * Returns the meta object for class '{@link identity.type.ChallengeResponse <em>Challenge Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Challenge Response</em>'.
     * @see identity.type.ChallengeResponse
     * @generated
     */
    EClass getChallengeResponse();

    /**
     * Returns the meta object for class '{@link identity.type.IdentityAttributeType <em>Identity Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Attribute Type</em>'.
     * @see identity.type.IdentityAttributeType
     * @generated
     */
    EClass getIdentityAttributeType();

    /**
     * Returns the meta object for the container reference '{@link identity.type.IdentityAttributeType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see identity.type.IdentityAttributeType#getPackage()
     * @see #getIdentityAttributeType()
     * @generated
     */
    EReference getIdentityAttributeType_Package();

    /**
     * Returns the meta object for class '{@link identity.type.LevelOfAssurance <em>Level Of Assurance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Level Of Assurance</em>'.
     * @see identity.type.LevelOfAssurance
     * @generated
     */
    EClass getLevelOfAssurance();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

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
         * The meta object literal for the '{@link identity.type.impl.DigitalIdentityTypeImpl <em>Digital Identity Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.DigitalIdentityTypeImpl
         * @see identity.type.impl.TypePackageImpl#getDigitalIdentityType()
         * @generated
         */
        EClass DIGITAL_IDENTITY_TYPE = eINSTANCE.getDigitalIdentityType();

        /**
         * The meta object literal for the '<em><b>Attribute Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS = eINSTANCE.getDigitalIdentityType_AttributeInstantiations();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentityTypePackageImpl <em>Identity Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentityTypePackageImpl
         * @see identity.type.impl.TypePackageImpl#getIdentityTypePackage()
         * @generated
         */
        EClass IDENTITY_TYPE_PACKAGE = eINSTANCE.getIdentityTypePackage();

        /**
         * The meta object literal for the '<em><b>Identity Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES = eINSTANCE.getIdentityTypePackage_IdentityTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_TYPE_PACKAGE__NAME = eINSTANCE.getIdentityTypePackage_Name();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_TYPE_PACKAGE__MODEL = eINSTANCE.getIdentityTypePackage_Model();

        /**
         * The meta object literal for the '<em><b>Attribute Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES = eINSTANCE.getIdentityTypePackage_AttributeTypes();

        /**
         * The meta object literal for the '{@link identity.type.impl.AuthenticationMethodImpl <em>Authentication Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.AuthenticationMethodImpl
         * @see identity.type.impl.TypePackageImpl#getAuthenticationMethod()
         * @generated
         */
        EClass AUTHENTICATION_METHOD = eINSTANCE.getAuthenticationMethod();

        /**
         * The meta object literal for the '{@link identity.type.impl.PasswordAuthenticationImpl <em>Password Authentication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PasswordAuthenticationImpl
         * @see identity.type.impl.TypePackageImpl#getPasswordAuthentication()
         * @generated
         */
        EClass PASSWORD_AUTHENTICATION = eINSTANCE.getPasswordAuthentication();

        /**
         * The meta object literal for the '{@link identity.type.impl.TokenAuthenticationImpl <em>Token Authentication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.TokenAuthenticationImpl
         * @see identity.type.impl.TypePackageImpl#getTokenAuthentication()
         * @generated
         */
        EClass TOKEN_AUTHENTICATION = eINSTANCE.getTokenAuthentication();

        /**
         * The meta object literal for the '{@link identity.type.impl.ExternalAuthenticationImpl <em>External Authentication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ExternalAuthenticationImpl
         * @see identity.type.impl.TypePackageImpl#getExternalAuthentication()
         * @generated
         */
        EClass EXTERNAL_AUTHENTICATION = eINSTANCE.getExternalAuthentication();

        /**
         * The meta object literal for the '{@link identity.type.impl.RemoteImpl <em>Remote</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.RemoteImpl
         * @see identity.type.impl.TypePackageImpl#getRemote()
         * @generated
         */
        EClass REMOTE = eINSTANCE.getRemote();

        /**
         * The meta object literal for the '{@link identity.type.impl.BiometricCredentialImpl <em>Biometric Credential</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.BiometricCredentialImpl
         * @see identity.type.impl.TypePackageImpl#getBiometricCredential()
         * @generated
         */
        EClass BIOMETRIC_CREDENTIAL = eINSTANCE.getBiometricCredential();

        /**
         * The meta object literal for the '{@link identity.type.impl.PhysicalTokenImpl <em>Physical Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PhysicalTokenImpl
         * @see identity.type.impl.TypePackageImpl#getPhysicalToken()
         * @generated
         */
        EClass PHYSICAL_TOKEN = eINSTANCE.getPhysicalToken();

        /**
         * The meta object literal for the '<em><b>Media Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PHYSICAL_TOKEN__MEDIA_TYPE = eINSTANCE.getPhysicalToken_MediaType();

        /**
         * The meta object literal for the '{@link identity.type.impl.PhysicalPresenceFace2FaceImpl <em>Physical Presence Face2 Face</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PhysicalPresenceFace2FaceImpl
         * @see identity.type.impl.TypePackageImpl#getPhysicalPresenceFace2Face()
         * @generated
         */
        EClass PHYSICAL_PRESENCE_FACE2_FACE = eINSTANCE.getPhysicalPresenceFace2Face();

        /**
         * The meta object literal for the '{@link identity.type.impl.AuthenticationCredentialImpl <em>Authentication Credential</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.AuthenticationCredentialImpl
         * @see identity.type.impl.TypePackageImpl#getAuthenticationCredential()
         * @generated
         */
        EClass AUTHENTICATION_CREDENTIAL = eINSTANCE.getAuthenticationCredential();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUTHENTICATION_CREDENTIAL__VALUE = eINSTANCE.getAuthenticationCredential_Value();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentifierImpl <em>Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentifierImpl
         * @see identity.type.impl.TypePackageImpl#getIdentifier()
         * @generated
         */
        EClass IDENTIFIER = eINSTANCE.getIdentifier();

        /**
         * The meta object literal for the '{@link identity.type.impl.PasswordImpl <em>Password</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PasswordImpl
         * @see identity.type.impl.TypePackageImpl#getPassword()
         * @generated
         */
        EClass PASSWORD = eINSTANCE.getPassword();

        /**
         * The meta object literal for the '{@link identity.type.impl.AttributeVerificationMethodImpl <em>Attribute Verification Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.AttributeVerificationMethodImpl
         * @see identity.type.impl.TypePackageImpl#getAttributeVerificationMethod()
         * @generated
         */
        EClass ATTRIBUTE_VERIFICATION_METHOD = eINSTANCE.getAttributeVerificationMethod();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_VERIFICATION_METHOD__NAME = eINSTANCE.getAttributeVerificationMethod_Name();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentityAttributeInstantiationImpl <em>Identity Attribute Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentityAttributeInstantiationImpl
         * @see identity.type.impl.TypePackageImpl#getIdentityAttributeInstantiation()
         * @generated
         */
        EClass IDENTITY_ATTRIBUTE_INSTANTIATION = eINSTANCE.getIdentityAttributeInstantiation();

        /**
         * The meta object literal for the '<em><b>Identity Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE = eINSTANCE.getIdentityAttributeInstantiation_IdentityType();

        /**
         * The meta object literal for the '<em><b>Verification Method</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD = eINSTANCE.getIdentityAttributeInstantiation_VerificationMethod();

        /**
         * The meta object literal for the '{@link identity.type.impl.PhysicalIdentityTypeImpl <em>Physical Identity Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PhysicalIdentityTypeImpl
         * @see identity.type.impl.TypePackageImpl#getPhysicalIdentityType()
         * @generated
         */
        EClass PHYSICAL_IDENTITY_TYPE = eINSTANCE.getPhysicalIdentityType();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentityTypeImpl <em>Identity Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentityTypeImpl
         * @see identity.type.impl.TypePackageImpl#getIdentityType()
         * @generated
         */
        EClass IDENTITY_TYPE = eINSTANCE.getIdentityType();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_TYPE__PACKAGE = eINSTANCE.getIdentityType_Package();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_TYPE__NAME = eINSTANCE.getIdentityType_Name();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_TYPE__INSTANTIATIONS = eINSTANCE.getIdentityType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_TYPE__DESCRIPTION = eINSTANCE.getIdentityType_Description();

        /**
         * The meta object literal for the '{@link identity.type.impl.NotVerifiedImpl <em>Not Verified</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.NotVerifiedImpl
         * @see identity.type.impl.TypePackageImpl#getNotVerified()
         * @generated
         */
        EClass NOT_VERIFIED = eINSTANCE.getNotVerified();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentityRegistrationImpl <em>Identity Registration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentityRegistrationImpl
         * @see identity.type.impl.TypePackageImpl#getIdentityRegistration()
         * @generated
         */
        EClass IDENTITY_REGISTRATION = eINSTANCE.getIdentityRegistration();

        /**
         * The meta object literal for the '<em><b>Required Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES = eINSTANCE.getIdentityRegistration_RequiredAttributes();

        /**
         * The meta object literal for the '{@link identity.type.impl.OpenSignUpImpl <em>Open Sign Up</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.OpenSignUpImpl
         * @see identity.type.impl.TypePackageImpl#getOpenSignUp()
         * @generated
         */
        EClass OPEN_SIGN_UP = eINSTANCE.getOpenSignUp();

        /**
         * The meta object literal for the '{@link identity.type.impl.DirectVerificationImpl <em>Direct Verification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.DirectVerificationImpl
         * @see identity.type.impl.TypePackageImpl#getDirectVerification()
         * @generated
         */
        EClass DIRECT_VERIFICATION = eINSTANCE.getDirectVerification();

        /**
         * The meta object literal for the '{@link identity.type.impl.ElectronicDocumentImpl <em>Electronic Document</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ElectronicDocumentImpl
         * @see identity.type.impl.TypePackageImpl#getElectronicDocument()
         * @generated
         */
        EClass ELECTRONIC_DOCUMENT = eINSTANCE.getElectronicDocument();

        /**
         * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELECTRONIC_DOCUMENT__CONTAINS = eINSTANCE.getElectronicDocument_Contains();

        /**
         * The meta object literal for the '<em><b>Media Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELECTRONIC_DOCUMENT__MEDIA_TYPE = eINSTANCE.getElectronicDocument_MediaType();

        /**
         * The meta object literal for the '{@link identity.type.impl.MediaTypeImpl <em>Media Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.MediaTypeImpl
         * @see identity.type.impl.TypePackageImpl#getMediaType()
         * @generated
         */
        EClass MEDIA_TYPE = eINSTANCE.getMediaType();

        /**
         * The meta object literal for the '{@link identity.type.impl.ContactlessSmartCardImpl <em>Contactless Smart Card</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ContactlessSmartCardImpl
         * @see identity.type.impl.TypePackageImpl#getContactlessSmartCard()
         * @generated
         */
        EClass CONTACTLESS_SMART_CARD = eINSTANCE.getContactlessSmartCard();

        /**
         * The meta object literal for the '{@link identity.type.impl.AuthenticationAssertionImpl <em>Authentication Assertion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.AuthenticationAssertionImpl
         * @see identity.type.impl.TypePackageImpl#getAuthenticationAssertion()
         * @generated
         */
        EClass AUTHENTICATION_ASSERTION = eINSTANCE.getAuthenticationAssertion();

        /**
         * The meta object literal for the '{@link identity.type.impl.GovernmentImpl <em>Government</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.GovernmentImpl
         * @see identity.type.impl.TypePackageImpl#getGovernment()
         * @generated
         */
        EClass GOVERNMENT = eINSTANCE.getGovernment();

        /**
         * The meta object literal for the '{@link identity.type.impl.EmploymentImpl <em>Employment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.EmploymentImpl
         * @see identity.type.impl.TypePackageImpl#getEmployment()
         * @generated
         */
        EClass EMPLOYMENT = eINSTANCE.getEmployment();

        /**
         * The meta object literal for the '{@link identity.type.impl.PrivateImpl <em>Private</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PrivateImpl
         * @see identity.type.impl.TypePackageImpl#getPrivate()
         * @generated
         */
        EClass PRIVATE = eINSTANCE.getPrivate();

        /**
         * The meta object literal for the '{@link identity.type.impl.ProfessionalImpl <em>Professional</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ProfessionalImpl
         * @see identity.type.impl.TypePackageImpl#getProfessional()
         * @generated
         */
        EClass PROFESSIONAL = eINSTANCE.getProfessional();

        /**
         * The meta object literal for the '{@link identity.type.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.MobilePhoneImpl
         * @see identity.type.impl.TypePackageImpl#getMobilePhone()
         * @generated
         */
        EClass MOBILE_PHONE = eINSTANCE.getMobilePhone();

        /**
         * The meta object literal for the '{@link identity.type.impl.BanksImpl <em>Banks</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.BanksImpl
         * @see identity.type.impl.TypePackageImpl#getBanks()
         * @generated
         */
        EClass BANKS = eINSTANCE.getBanks();

        /**
         * The meta object literal for the '{@link identity.type.impl.ElectronicMailAddressImpl <em>Electronic Mail Address</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ElectronicMailAddressImpl
         * @see identity.type.impl.TypePackageImpl#getElectronicMailAddress()
         * @generated
         */
        EClass ELECTRONIC_MAIL_ADDRESS = eINSTANCE.getElectronicMailAddress();

        /**
         * The meta object literal for the '{@link identity.type.impl.SocialNetworkImpl <em>Social Network</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.SocialNetworkImpl
         * @see identity.type.impl.TypePackageImpl#getSocialNetwork()
         * @generated
         */
        EClass SOCIAL_NETWORK = eINSTANCE.getSocialNetwork();

        /**
         * The meta object literal for the '{@link identity.type.impl.SharedSecretImpl <em>Shared Secret</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.SharedSecretImpl
         * @see identity.type.impl.TypePackageImpl#getSharedSecret()
         * @generated
         */
        EClass SHARED_SECRET = eINSTANCE.getSharedSecret();

        /**
         * The meta object literal for the '{@link identity.type.impl.PublicKeyAuthenticationImpl <em>Public Key Authentication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.PublicKeyAuthenticationImpl
         * @see identity.type.impl.TypePackageImpl#getPublicKeyAuthentication()
         * @generated
         */
        EClass PUBLIC_KEY_AUTHENTICATION = eINSTANCE.getPublicKeyAuthentication();

        /**
         * The meta object literal for the '{@link identity.type.impl.ChallengeResponseImpl <em>Challenge Response</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.ChallengeResponseImpl
         * @see identity.type.impl.TypePackageImpl#getChallengeResponse()
         * @generated
         */
        EClass CHALLENGE_RESPONSE = eINSTANCE.getChallengeResponse();

        /**
         * The meta object literal for the '{@link identity.type.impl.IdentityAttributeTypeImpl <em>Identity Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.IdentityAttributeTypeImpl
         * @see identity.type.impl.TypePackageImpl#getIdentityAttributeType()
         * @generated
         */
        EClass IDENTITY_ATTRIBUTE_TYPE = eINSTANCE.getIdentityAttributeType();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ATTRIBUTE_TYPE__PACKAGE = eINSTANCE.getIdentityAttributeType_Package();

        /**
         * The meta object literal for the '{@link identity.type.impl.LevelOfAssuranceImpl <em>Level Of Assurance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.type.impl.LevelOfAssuranceImpl
         * @see identity.type.impl.TypePackageImpl#getLevelOfAssurance()
         * @generated
         */
        EClass LEVEL_OF_ASSURANCE = eINSTANCE.getLevelOfAssurance();

    }

} //TypePackage
