/**
 */
package identity.type.impl;

import identity.type.*;

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
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
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
            case TypePackage.DIGITAL_IDENTITY_TYPE: return createDigitalIdentityType();
            case TypePackage.IDENTITY_TYPE_PACKAGE: return createIdentityTypePackage();
            case TypePackage.PASSWORD_AUTHENTICATION: return createPasswordAuthentication();
            case TypePackage.TOKEN_AUTHENTICATION: return createTokenAuthentication();
            case TypePackage.EXTERNAL_AUTHENTICATION: return createExternalAuthentication();
            case TypePackage.REMOTE: return createRemote();
            case TypePackage.BIOMETRIC_CREDENTIAL: return createBiometricCredential();
            case TypePackage.PHYSICAL_TOKEN: return createPhysicalToken();
            case TypePackage.PHYSICAL_PRESENCE_FACE2_FACE: return createPhysicalPresenceFace2Face();
            case TypePackage.IDENTIFIER: return createIdentifier();
            case TypePackage.PASSWORD: return createPassword();
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION: return createIdentityAttributeInstantiation();
            case TypePackage.PHYSICAL_IDENTITY_TYPE: return createPhysicalIdentityType();
            case TypePackage.NOT_VERIFIED: return createNotVerified();
            case TypePackage.IDENTITY_REGISTRATION: return createIdentityRegistration();
            case TypePackage.OPEN_SIGN_UP: return createOpenSignUp();
            case TypePackage.DIRECT_VERIFICATION: return createDirectVerification();
            case TypePackage.ELECTRONIC_DOCUMENT: return createElectronicDocument();
            case TypePackage.CONTACTLESS_SMART_CARD: return createContactlessSmartCard();
            case TypePackage.AUTHENTICATION_ASSERTION: return createAuthenticationAssertion();
            case TypePackage.GOVERNMENT: return createGovernment();
            case TypePackage.EMPLOYMENT: return createEmployment();
            case TypePackage.PRIVATE: return createPrivate();
            case TypePackage.PROFESSIONAL: return createProfessional();
            case TypePackage.MOBILE_PHONE: return createMobilePhone();
            case TypePackage.BANKS: return createBanks();
            case TypePackage.ELECTRONIC_MAIL_ADDRESS: return createElectronicMailAddress();
            case TypePackage.SOCIAL_NETWORK: return createSocialNetwork();
            case TypePackage.SHARED_SECRET: return createSharedSecret();
            case TypePackage.PUBLIC_KEY_AUTHENTICATION: return createPublicKeyAuthentication();
            case TypePackage.CHALLENGE_RESPONSE: return createChallengeResponse();
            case TypePackage.IDENTITY_ATTRIBUTE_TYPE: return createIdentityAttributeType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DigitalIdentityType createDigitalIdentityType() {
        DigitalIdentityTypeImpl digitalIdentityType = new DigitalIdentityTypeImpl();
        return digitalIdentityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityTypePackage createIdentityTypePackage() {
        IdentityTypePackageImpl identityTypePackage = new IdentityTypePackageImpl();
        return identityTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PasswordAuthentication createPasswordAuthentication() {
        PasswordAuthenticationImpl passwordAuthentication = new PasswordAuthenticationImpl();
        return passwordAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TokenAuthentication createTokenAuthentication() {
        TokenAuthenticationImpl tokenAuthentication = new TokenAuthenticationImpl();
        return tokenAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalAuthentication createExternalAuthentication() {
        ExternalAuthenticationImpl externalAuthentication = new ExternalAuthenticationImpl();
        return externalAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Remote createRemote() {
        RemoteImpl remote = new RemoteImpl();
        return remote;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BiometricCredential createBiometricCredential() {
        BiometricCredentialImpl biometricCredential = new BiometricCredentialImpl();
        return biometricCredential;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalToken createPhysicalToken() {
        PhysicalTokenImpl physicalToken = new PhysicalTokenImpl();
        return physicalToken;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalPresenceFace2Face createPhysicalPresenceFace2Face() {
        PhysicalPresenceFace2FaceImpl physicalPresenceFace2Face = new PhysicalPresenceFace2FaceImpl();
        return physicalPresenceFace2Face;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier createIdentifier() {
        IdentifierImpl identifier = new IdentifierImpl();
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Password createPassword() {
        PasswordImpl password = new PasswordImpl();
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttributeInstantiation createIdentityAttributeInstantiation() {
        IdentityAttributeInstantiationImpl identityAttributeInstantiation = new IdentityAttributeInstantiationImpl();
        return identityAttributeInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhysicalIdentityType createPhysicalIdentityType() {
        PhysicalIdentityTypeImpl physicalIdentityType = new PhysicalIdentityTypeImpl();
        return physicalIdentityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotVerified createNotVerified() {
        NotVerifiedImpl notVerified = new NotVerifiedImpl();
        return notVerified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityRegistration createIdentityRegistration() {
        IdentityRegistrationImpl identityRegistration = new IdentityRegistrationImpl();
        return identityRegistration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenSignUp createOpenSignUp() {
        OpenSignUpImpl openSignUp = new OpenSignUpImpl();
        return openSignUp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectVerification createDirectVerification() {
        DirectVerificationImpl directVerification = new DirectVerificationImpl();
        return directVerification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElectronicDocument createElectronicDocument() {
        ElectronicDocumentImpl electronicDocument = new ElectronicDocumentImpl();
        return electronicDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContactlessSmartCard createContactlessSmartCard() {
        ContactlessSmartCardImpl contactlessSmartCard = new ContactlessSmartCardImpl();
        return contactlessSmartCard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuthenticationAssertion createAuthenticationAssertion() {
        AuthenticationAssertionImpl authenticationAssertion = new AuthenticationAssertionImpl();
        return authenticationAssertion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Government createGovernment() {
        GovernmentImpl government = new GovernmentImpl();
        return government;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Employment createEmployment() {
        EmploymentImpl employment = new EmploymentImpl();
        return employment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Private createPrivate() {
        PrivateImpl private_ = new PrivateImpl();
        return private_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Professional createProfessional() {
        ProfessionalImpl professional = new ProfessionalImpl();
        return professional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MobilePhone createMobilePhone() {
        MobilePhoneImpl mobilePhone = new MobilePhoneImpl();
        return mobilePhone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Banks createBanks() {
        BanksImpl banks = new BanksImpl();
        return banks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElectronicMailAddress createElectronicMailAddress() {
        ElectronicMailAddressImpl electronicMailAddress = new ElectronicMailAddressImpl();
        return electronicMailAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SocialNetwork createSocialNetwork() {
        SocialNetworkImpl socialNetwork = new SocialNetworkImpl();
        return socialNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SharedSecret createSharedSecret() {
        SharedSecretImpl sharedSecret = new SharedSecretImpl();
        return sharedSecret;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PublicKeyAuthentication createPublicKeyAuthentication() {
        PublicKeyAuthenticationImpl publicKeyAuthentication = new PublicKeyAuthenticationImpl();
        return publicKeyAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChallengeResponse createChallengeResponse() {
        ChallengeResponseImpl challengeResponse = new ChallengeResponseImpl();
        return challengeResponse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttributeType createIdentityAttributeType() {
        IdentityAttributeTypeImpl identityAttributeType = new IdentityAttributeTypeImpl();
        return identityAttributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
