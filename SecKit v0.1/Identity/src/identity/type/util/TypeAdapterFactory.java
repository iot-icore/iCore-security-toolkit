/**
 */
package identity.type.util;

import data.instantiation.AbstractDataInstantiation;
import data.instantiation.DataInstantiation;

import identity.type.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see identity.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseDigitalIdentityType(DigitalIdentityType object) {
                return createDigitalIdentityTypeAdapter();
            }
            @Override
            public Adapter caseIdentityTypePackage(IdentityTypePackage object) {
                return createIdentityTypePackageAdapter();
            }
            @Override
            public Adapter caseAuthenticationMethod(AuthenticationMethod object) {
                return createAuthenticationMethodAdapter();
            }
            @Override
            public Adapter casePasswordAuthentication(PasswordAuthentication object) {
                return createPasswordAuthenticationAdapter();
            }
            @Override
            public Adapter caseTokenAuthentication(TokenAuthentication object) {
                return createTokenAuthenticationAdapter();
            }
            @Override
            public Adapter caseExternalAuthentication(ExternalAuthentication object) {
                return createExternalAuthenticationAdapter();
            }
            @Override
            public Adapter caseRemote(Remote object) {
                return createRemoteAdapter();
            }
            @Override
            public Adapter caseBiometricCredential(BiometricCredential object) {
                return createBiometricCredentialAdapter();
            }
            @Override
            public Adapter casePhysicalToken(PhysicalToken object) {
                return createPhysicalTokenAdapter();
            }
            @Override
            public Adapter casePhysicalPresenceFace2Face(PhysicalPresenceFace2Face object) {
                return createPhysicalPresenceFace2FaceAdapter();
            }
            @Override
            public Adapter caseAuthenticationCredential(AuthenticationCredential object) {
                return createAuthenticationCredentialAdapter();
            }
            @Override
            public Adapter caseIdentifier(Identifier object) {
                return createIdentifierAdapter();
            }
            @Override
            public Adapter casePassword(Password object) {
                return createPasswordAdapter();
            }
            @Override
            public Adapter caseAttributeVerificationMethod(AttributeVerificationMethod object) {
                return createAttributeVerificationMethodAdapter();
            }
            @Override
            public Adapter caseIdentityAttributeInstantiation(IdentityAttributeInstantiation object) {
                return createIdentityAttributeInstantiationAdapter();
            }
            @Override
            public Adapter casePhysicalIdentityType(PhysicalIdentityType object) {
                return createPhysicalIdentityTypeAdapter();
            }
            @Override
            public Adapter caseIdentityType(IdentityType object) {
                return createIdentityTypeAdapter();
            }
            @Override
            public Adapter caseNotVerified(NotVerified object) {
                return createNotVerifiedAdapter();
            }
            @Override
            public Adapter caseIdentityRegistration(IdentityRegistration object) {
                return createIdentityRegistrationAdapter();
            }
            @Override
            public Adapter caseOpenSignUp(OpenSignUp object) {
                return createOpenSignUpAdapter();
            }
            @Override
            public Adapter caseDirectVerification(DirectVerification object) {
                return createDirectVerificationAdapter();
            }
            @Override
            public Adapter caseElectronicDocument(ElectronicDocument object) {
                return createElectronicDocumentAdapter();
            }
            @Override
            public Adapter caseMediaType(MediaType object) {
                return createMediaTypeAdapter();
            }
            @Override
            public Adapter caseContactlessSmartCard(ContactlessSmartCard object) {
                return createContactlessSmartCardAdapter();
            }
            @Override
            public Adapter caseAuthenticationAssertion(AuthenticationAssertion object) {
                return createAuthenticationAssertionAdapter();
            }
            @Override
            public Adapter caseGovernment(Government object) {
                return createGovernmentAdapter();
            }
            @Override
            public Adapter caseEmployment(Employment object) {
                return createEmploymentAdapter();
            }
            @Override
            public Adapter casePrivate(Private object) {
                return createPrivateAdapter();
            }
            @Override
            public Adapter caseProfessional(Professional object) {
                return createProfessionalAdapter();
            }
            @Override
            public Adapter caseMobilePhone(MobilePhone object) {
                return createMobilePhoneAdapter();
            }
            @Override
            public Adapter caseBanks(Banks object) {
                return createBanksAdapter();
            }
            @Override
            public Adapter caseElectronicMailAddress(ElectronicMailAddress object) {
                return createElectronicMailAddressAdapter();
            }
            @Override
            public Adapter caseSocialNetwork(SocialNetwork object) {
                return createSocialNetworkAdapter();
            }
            @Override
            public Adapter caseSharedSecret(SharedSecret object) {
                return createSharedSecretAdapter();
            }
            @Override
            public Adapter casePublicKeyAuthentication(PublicKeyAuthentication object) {
                return createPublicKeyAuthenticationAdapter();
            }
            @Override
            public Adapter caseChallengeResponse(ChallengeResponse object) {
                return createChallengeResponseAdapter();
            }
            @Override
            public Adapter caseIdentityAttributeType(IdentityAttributeType object) {
                return createIdentityAttributeTypeAdapter();
            }
            @Override
            public Adapter caseLevelOfAssurance(LevelOfAssurance object) {
                return createLevelOfAssuranceAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstantiation(AbstractDataInstantiation object) {
                return createAbstractDataInstantiationAdapter();
            }
            @Override
            public Adapter caseDataInstantiation(DataInstantiation object) {
                return createDataInstantiationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link identity.type.DigitalIdentityType <em>Digital Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.DigitalIdentityType
     * @generated
     */
    public Adapter createDigitalIdentityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.IdentityTypePackage <em>Identity Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.IdentityTypePackage
     * @generated
     */
    public Adapter createIdentityTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.AuthenticationMethod <em>Authentication Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.AuthenticationMethod
     * @generated
     */
    public Adapter createAuthenticationMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.PasswordAuthentication <em>Password Authentication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.PasswordAuthentication
     * @generated
     */
    public Adapter createPasswordAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.TokenAuthentication <em>Token Authentication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.TokenAuthentication
     * @generated
     */
    public Adapter createTokenAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.ExternalAuthentication <em>External Authentication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.ExternalAuthentication
     * @generated
     */
    public Adapter createExternalAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Remote <em>Remote</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Remote
     * @generated
     */
    public Adapter createRemoteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.BiometricCredential <em>Biometric Credential</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.BiometricCredential
     * @generated
     */
    public Adapter createBiometricCredentialAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.PhysicalToken <em>Physical Token</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.PhysicalToken
     * @generated
     */
    public Adapter createPhysicalTokenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.PhysicalPresenceFace2Face <em>Physical Presence Face2 Face</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.PhysicalPresenceFace2Face
     * @generated
     */
    public Adapter createPhysicalPresenceFace2FaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.AuthenticationCredential <em>Authentication Credential</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.AuthenticationCredential
     * @generated
     */
    public Adapter createAuthenticationCredentialAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Password <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Password
     * @generated
     */
    public Adapter createPasswordAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.AttributeVerificationMethod <em>Attribute Verification Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.AttributeVerificationMethod
     * @generated
     */
    public Adapter createAttributeVerificationMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.IdentityAttributeInstantiation <em>Identity Attribute Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.IdentityAttributeInstantiation
     * @generated
     */
    public Adapter createIdentityAttributeInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.PhysicalIdentityType <em>Physical Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.PhysicalIdentityType
     * @generated
     */
    public Adapter createPhysicalIdentityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.IdentityType <em>Identity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.IdentityType
     * @generated
     */
    public Adapter createIdentityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.NotVerified <em>Not Verified</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.NotVerified
     * @generated
     */
    public Adapter createNotVerifiedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.IdentityRegistration <em>Identity Registration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.IdentityRegistration
     * @generated
     */
    public Adapter createIdentityRegistrationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.OpenSignUp <em>Open Sign Up</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.OpenSignUp
     * @generated
     */
    public Adapter createOpenSignUpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.DirectVerification <em>Direct Verification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.DirectVerification
     * @generated
     */
    public Adapter createDirectVerificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.ElectronicDocument <em>Electronic Document</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.ElectronicDocument
     * @generated
     */
    public Adapter createElectronicDocumentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.MediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.MediaType
     * @generated
     */
    public Adapter createMediaTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.ContactlessSmartCard <em>Contactless Smart Card</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.ContactlessSmartCard
     * @generated
     */
    public Adapter createContactlessSmartCardAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.AuthenticationAssertion <em>Authentication Assertion</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.AuthenticationAssertion
     * @generated
     */
    public Adapter createAuthenticationAssertionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Government <em>Government</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Government
     * @generated
     */
    public Adapter createGovernmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Employment <em>Employment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Employment
     * @generated
     */
    public Adapter createEmploymentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Private <em>Private</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Private
     * @generated
     */
    public Adapter createPrivateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Professional <em>Professional</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Professional
     * @generated
     */
    public Adapter createProfessionalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.MobilePhone <em>Mobile Phone</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.MobilePhone
     * @generated
     */
    public Adapter createMobilePhoneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.Banks <em>Banks</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.Banks
     * @generated
     */
    public Adapter createBanksAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.ElectronicMailAddress <em>Electronic Mail Address</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.ElectronicMailAddress
     * @generated
     */
    public Adapter createElectronicMailAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.SocialNetwork <em>Social Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.SocialNetwork
     * @generated
     */
    public Adapter createSocialNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.SharedSecret <em>Shared Secret</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.SharedSecret
     * @generated
     */
    public Adapter createSharedSecretAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.PublicKeyAuthentication <em>Public Key Authentication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.PublicKeyAuthentication
     * @generated
     */
    public Adapter createPublicKeyAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.ChallengeResponse <em>Challenge Response</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.ChallengeResponse
     * @generated
     */
    public Adapter createChallengeResponseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.IdentityAttributeType <em>Identity Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.IdentityAttributeType
     * @generated
     */
    public Adapter createIdentityAttributeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.type.LevelOfAssurance <em>Level Of Assurance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.type.LevelOfAssurance
     * @generated
     */
    public Adapter createLevelOfAssuranceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.AbstractDataInstantiation <em>Abstract Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.AbstractDataInstantiation
     * @generated
     */
    public Adapter createAbstractDataInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.DataInstantiation <em>Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.DataInstantiation
     * @generated
     */
    public Adapter createDataInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeAdapterFactory
