/**
 */
package identity.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see identity.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = identity.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Digital Identity Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Digital Identity Type</em>'.
     * @generated
     */
    DigitalIdentityType createDigitalIdentityType();

    /**
     * Returns a new object of class '<em>Identity Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Type Package</em>'.
     * @generated
     */
    IdentityTypePackage createIdentityTypePackage();

    /**
     * Returns a new object of class '<em>Password Authentication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Password Authentication</em>'.
     * @generated
     */
    PasswordAuthentication createPasswordAuthentication();

    /**
     * Returns a new object of class '<em>Token Authentication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Token Authentication</em>'.
     * @generated
     */
    TokenAuthentication createTokenAuthentication();

    /**
     * Returns a new object of class '<em>External Authentication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Authentication</em>'.
     * @generated
     */
    ExternalAuthentication createExternalAuthentication();

    /**
     * Returns a new object of class '<em>Remote</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote</em>'.
     * @generated
     */
    Remote createRemote();

    /**
     * Returns a new object of class '<em>Biometric Credential</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Biometric Credential</em>'.
     * @generated
     */
    BiometricCredential createBiometricCredential();

    /**
     * Returns a new object of class '<em>Physical Token</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Physical Token</em>'.
     * @generated
     */
    PhysicalToken createPhysicalToken();

    /**
     * Returns a new object of class '<em>Physical Presence Face2 Face</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Physical Presence Face2 Face</em>'.
     * @generated
     */
    PhysicalPresenceFace2Face createPhysicalPresenceFace2Face();

    /**
     * Returns a new object of class '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identifier</em>'.
     * @generated
     */
    Identifier createIdentifier();

    /**
     * Returns a new object of class '<em>Password</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Password</em>'.
     * @generated
     */
    Password createPassword();

    /**
     * Returns a new object of class '<em>Identity Attribute Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Attribute Instantiation</em>'.
     * @generated
     */
    IdentityAttributeInstantiation createIdentityAttributeInstantiation();

    /**
     * Returns a new object of class '<em>Physical Identity Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Physical Identity Type</em>'.
     * @generated
     */
    PhysicalIdentityType createPhysicalIdentityType();

    /**
     * Returns a new object of class '<em>Not Verified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Not Verified</em>'.
     * @generated
     */
    NotVerified createNotVerified();

    /**
     * Returns a new object of class '<em>Identity Registration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Registration</em>'.
     * @generated
     */
    IdentityRegistration createIdentityRegistration();

    /**
     * Returns a new object of class '<em>Open Sign Up</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Open Sign Up</em>'.
     * @generated
     */
    OpenSignUp createOpenSignUp();

    /**
     * Returns a new object of class '<em>Direct Verification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Direct Verification</em>'.
     * @generated
     */
    DirectVerification createDirectVerification();

    /**
     * Returns a new object of class '<em>Electronic Document</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Electronic Document</em>'.
     * @generated
     */
    ElectronicDocument createElectronicDocument();

    /**
     * Returns a new object of class '<em>Contactless Smart Card</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contactless Smart Card</em>'.
     * @generated
     */
    ContactlessSmartCard createContactlessSmartCard();

    /**
     * Returns a new object of class '<em>Authentication Assertion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Authentication Assertion</em>'.
     * @generated
     */
    AuthenticationAssertion createAuthenticationAssertion();

    /**
     * Returns a new object of class '<em>Government</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Government</em>'.
     * @generated
     */
    Government createGovernment();

    /**
     * Returns a new object of class '<em>Employment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Employment</em>'.
     * @generated
     */
    Employment createEmployment();

    /**
     * Returns a new object of class '<em>Private</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Private</em>'.
     * @generated
     */
    Private createPrivate();

    /**
     * Returns a new object of class '<em>Professional</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Professional</em>'.
     * @generated
     */
    Professional createProfessional();

    /**
     * Returns a new object of class '<em>Mobile Phone</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mobile Phone</em>'.
     * @generated
     */
    MobilePhone createMobilePhone();

    /**
     * Returns a new object of class '<em>Banks</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Banks</em>'.
     * @generated
     */
    Banks createBanks();

    /**
     * Returns a new object of class '<em>Electronic Mail Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Electronic Mail Address</em>'.
     * @generated
     */
    ElectronicMailAddress createElectronicMailAddress();

    /**
     * Returns a new object of class '<em>Social Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Social Network</em>'.
     * @generated
     */
    SocialNetwork createSocialNetwork();

    /**
     * Returns a new object of class '<em>Shared Secret</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shared Secret</em>'.
     * @generated
     */
    SharedSecret createSharedSecret();

    /**
     * Returns a new object of class '<em>Public Key Authentication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Public Key Authentication</em>'.
     * @generated
     */
    PublicKeyAuthentication createPublicKeyAuthentication();

    /**
     * Returns a new object of class '<em>Challenge Response</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Challenge Response</em>'.
     * @generated
     */
    ChallengeResponse createChallengeResponse();

    /**
     * Returns a new object of class '<em>Identity Attribute Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Attribute Type</em>'.
     * @generated
     */
    IdentityAttributeType createIdentityAttributeType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
