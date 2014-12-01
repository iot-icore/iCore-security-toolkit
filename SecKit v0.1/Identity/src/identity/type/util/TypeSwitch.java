/**
 */
package identity.type.util;

import data.instantiation.AbstractDataInstantiation;
import data.instantiation.DataInstantiation;

import identity.type.*;

import models.Element;

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
 * @see identity.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
            case TypePackage.DIGITAL_IDENTITY_TYPE: {
                DigitalIdentityType digitalIdentityType = (DigitalIdentityType)theEObject;
                T result = caseDigitalIdentityType(digitalIdentityType);
                if (result == null) result = caseIdentityType(digitalIdentityType);
                if (result == null) result = caseElement(digitalIdentityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_TYPE_PACKAGE: {
                IdentityTypePackage identityTypePackage = (IdentityTypePackage)theEObject;
                T result = caseIdentityTypePackage(identityTypePackage);
                if (result == null) result = caseElement(identityTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.AUTHENTICATION_METHOD: {
                AuthenticationMethod authenticationMethod = (AuthenticationMethod)theEObject;
                T result = caseAuthenticationMethod(authenticationMethod);
                if (result == null) result = caseElement(authenticationMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PASSWORD_AUTHENTICATION: {
                PasswordAuthentication passwordAuthentication = (PasswordAuthentication)theEObject;
                T result = casePasswordAuthentication(passwordAuthentication);
                if (result == null) result = caseAuthenticationMethod(passwordAuthentication);
                if (result == null) result = caseElement(passwordAuthentication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TOKEN_AUTHENTICATION: {
                TokenAuthentication tokenAuthentication = (TokenAuthentication)theEObject;
                T result = caseTokenAuthentication(tokenAuthentication);
                if (result == null) result = caseAuthenticationMethod(tokenAuthentication);
                if (result == null) result = caseElement(tokenAuthentication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.EXTERNAL_AUTHENTICATION: {
                ExternalAuthentication externalAuthentication = (ExternalAuthentication)theEObject;
                T result = caseExternalAuthentication(externalAuthentication);
                if (result == null) result = caseAuthenticationMethod(externalAuthentication);
                if (result == null) result = caseElement(externalAuthentication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.REMOTE: {
                Remote remote = (Remote)theEObject;
                T result = caseRemote(remote);
                if (result == null) result = caseDirectVerification(remote);
                if (result == null) result = caseAttributeVerificationMethod(remote);
                if (result == null) result = caseElement(remote);
                if (result == null) result = caseLevelOfAssurance(remote);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BIOMETRIC_CREDENTIAL: {
                BiometricCredential biometricCredential = (BiometricCredential)theEObject;
                T result = caseBiometricCredential(biometricCredential);
                if (result == null) result = caseAuthenticationCredential(biometricCredential);
                if (result == null) result = caseElement(biometricCredential);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PHYSICAL_TOKEN: {
                PhysicalToken physicalToken = (PhysicalToken)theEObject;
                T result = casePhysicalToken(physicalToken);
                if (result == null) result = caseAuthenticationCredential(physicalToken);
                if (result == null) result = caseElement(physicalToken);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PHYSICAL_PRESENCE_FACE2_FACE: {
                PhysicalPresenceFace2Face physicalPresenceFace2Face = (PhysicalPresenceFace2Face)theEObject;
                T result = casePhysicalPresenceFace2Face(physicalPresenceFace2Face);
                if (result == null) result = caseDirectVerification(physicalPresenceFace2Face);
                if (result == null) result = caseAttributeVerificationMethod(physicalPresenceFace2Face);
                if (result == null) result = caseElement(physicalPresenceFace2Face);
                if (result == null) result = caseLevelOfAssurance(physicalPresenceFace2Face);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.AUTHENTICATION_CREDENTIAL: {
                AuthenticationCredential authenticationCredential = (AuthenticationCredential)theEObject;
                T result = caseAuthenticationCredential(authenticationCredential);
                if (result == null) result = caseElement(authenticationCredential);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTIFIER: {
                Identifier identifier = (Identifier)theEObject;
                T result = caseIdentifier(identifier);
                if (result == null) result = caseAuthenticationCredential(identifier);
                if (result == null) result = caseElement(identifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PASSWORD: {
                Password password = (Password)theEObject;
                T result = casePassword(password);
                if (result == null) result = caseSharedSecret(password);
                if (result == null) result = caseAuthenticationCredential(password);
                if (result == null) result = caseElement(password);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ATTRIBUTE_VERIFICATION_METHOD: {
                AttributeVerificationMethod attributeVerificationMethod = (AttributeVerificationMethod)theEObject;
                T result = caseAttributeVerificationMethod(attributeVerificationMethod);
                if (result == null) result = caseElement(attributeVerificationMethod);
                if (result == null) result = caseLevelOfAssurance(attributeVerificationMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION: {
                IdentityAttributeInstantiation identityAttributeInstantiation = (IdentityAttributeInstantiation)theEObject;
                T result = caseIdentityAttributeInstantiation(identityAttributeInstantiation);
                if (result == null) result = caseDataInstantiation(identityAttributeInstantiation);
                if (result == null) result = caseAbstractDataInstantiation(identityAttributeInstantiation);
                if (result == null) result = caseElement(identityAttributeInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PHYSICAL_IDENTITY_TYPE: {
                PhysicalIdentityType physicalIdentityType = (PhysicalIdentityType)theEObject;
                T result = casePhysicalIdentityType(physicalIdentityType);
                if (result == null) result = caseIdentityType(physicalIdentityType);
                if (result == null) result = caseElement(physicalIdentityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_TYPE: {
                IdentityType identityType = (IdentityType)theEObject;
                T result = caseIdentityType(identityType);
                if (result == null) result = caseElement(identityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NOT_VERIFIED: {
                NotVerified notVerified = (NotVerified)theEObject;
                T result = caseNotVerified(notVerified);
                if (result == null) result = caseAttributeVerificationMethod(notVerified);
                if (result == null) result = caseElement(notVerified);
                if (result == null) result = caseLevelOfAssurance(notVerified);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_REGISTRATION: {
                IdentityRegistration identityRegistration = (IdentityRegistration)theEObject;
                T result = caseIdentityRegistration(identityRegistration);
                if (result == null) result = caseElement(identityRegistration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.OPEN_SIGN_UP: {
                OpenSignUp openSignUp = (OpenSignUp)theEObject;
                T result = caseOpenSignUp(openSignUp);
                if (result == null) result = caseIdentityRegistration(openSignUp);
                if (result == null) result = caseElement(openSignUp);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DIRECT_VERIFICATION: {
                DirectVerification directVerification = (DirectVerification)theEObject;
                T result = caseDirectVerification(directVerification);
                if (result == null) result = caseAttributeVerificationMethod(directVerification);
                if (result == null) result = caseElement(directVerification);
                if (result == null) result = caseLevelOfAssurance(directVerification);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ELECTRONIC_DOCUMENT: {
                ElectronicDocument electronicDocument = (ElectronicDocument)theEObject;
                T result = caseElectronicDocument(electronicDocument);
                if (result == null) result = casePhysicalIdentityType(electronicDocument);
                if (result == null) result = caseIdentityType(electronicDocument);
                if (result == null) result = caseElement(electronicDocument);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MEDIA_TYPE: {
                MediaType mediaType = (MediaType)theEObject;
                T result = caseMediaType(mediaType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CONTACTLESS_SMART_CARD: {
                ContactlessSmartCard contactlessSmartCard = (ContactlessSmartCard)theEObject;
                T result = caseContactlessSmartCard(contactlessSmartCard);
                if (result == null) result = caseMediaType(contactlessSmartCard);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.AUTHENTICATION_ASSERTION: {
                AuthenticationAssertion authenticationAssertion = (AuthenticationAssertion)theEObject;
                T result = caseAuthenticationAssertion(authenticationAssertion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.GOVERNMENT: {
                Government government = (Government)theEObject;
                T result = caseGovernment(government);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.EMPLOYMENT: {
                Employment employment = (Employment)theEObject;
                T result = caseEmployment(employment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PRIVATE: {
                Private private_ = (Private)theEObject;
                T result = casePrivate(private_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PROFESSIONAL: {
                Professional professional = (Professional)theEObject;
                T result = caseProfessional(professional);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MOBILE_PHONE: {
                MobilePhone mobilePhone = (MobilePhone)theEObject;
                T result = caseMobilePhone(mobilePhone);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BANKS: {
                Banks banks = (Banks)theEObject;
                T result = caseBanks(banks);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ELECTRONIC_MAIL_ADDRESS: {
                ElectronicMailAddress electronicMailAddress = (ElectronicMailAddress)theEObject;
                T result = caseElectronicMailAddress(electronicMailAddress);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.SOCIAL_NETWORK: {
                SocialNetwork socialNetwork = (SocialNetwork)theEObject;
                T result = caseSocialNetwork(socialNetwork);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.SHARED_SECRET: {
                SharedSecret sharedSecret = (SharedSecret)theEObject;
                T result = caseSharedSecret(sharedSecret);
                if (result == null) result = caseAuthenticationCredential(sharedSecret);
                if (result == null) result = caseElement(sharedSecret);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PUBLIC_KEY_AUTHENTICATION: {
                PublicKeyAuthentication publicKeyAuthentication = (PublicKeyAuthentication)theEObject;
                T result = casePublicKeyAuthentication(publicKeyAuthentication);
                if (result == null) result = caseAuthenticationMethod(publicKeyAuthentication);
                if (result == null) result = caseElement(publicKeyAuthentication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CHALLENGE_RESPONSE: {
                ChallengeResponse challengeResponse = (ChallengeResponse)theEObject;
                T result = caseChallengeResponse(challengeResponse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.IDENTITY_ATTRIBUTE_TYPE: {
                IdentityAttributeType identityAttributeType = (IdentityAttributeType)theEObject;
                T result = caseIdentityAttributeType(identityAttributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.LEVEL_OF_ASSURANCE: {
                LevelOfAssurance levelOfAssurance = (LevelOfAssurance)theEObject;
                T result = caseLevelOfAssurance(levelOfAssurance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Digital Identity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Digital Identity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDigitalIdentityType(DigitalIdentityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityTypePackage(IdentityTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Authentication Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authentication Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthenticationMethod(AuthenticationMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Password Authentication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Password Authentication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePasswordAuthentication(PasswordAuthentication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Token Authentication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Token Authentication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTokenAuthentication(TokenAuthentication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Authentication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Authentication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalAuthentication(ExternalAuthentication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemote(Remote object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Biometric Credential</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Biometric Credential</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBiometricCredential(BiometricCredential object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Token</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Token</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalToken(PhysicalToken object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Presence Face2 Face</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Presence Face2 Face</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalPresenceFace2Face(PhysicalPresenceFace2Face object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Authentication Credential</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authentication Credential</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthenticationCredential(AuthenticationCredential object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Password</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Password</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePassword(Password object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Verification Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Verification Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeVerificationMethod(AttributeVerificationMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Attribute Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Attribute Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityAttributeInstantiation(IdentityAttributeInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Identity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Identity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalIdentityType(PhysicalIdentityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityType(IdentityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Not Verified</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Not Verified</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNotVerified(NotVerified object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Registration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Registration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityRegistration(IdentityRegistration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Open Sign Up</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Open Sign Up</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpenSignUp(OpenSignUp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Direct Verification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Direct Verification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDirectVerification(DirectVerification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Electronic Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Electronic Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElectronicDocument(ElectronicDocument object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMediaType(MediaType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contactless Smart Card</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contactless Smart Card</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContactlessSmartCard(ContactlessSmartCard object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Authentication Assertion</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authentication Assertion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthenticationAssertion(AuthenticationAssertion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Government</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Government</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovernment(Government object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Employment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Employment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmployment(Employment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Private</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivate(Private object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Professional</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Professional</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfessional(Professional object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMobilePhone(MobilePhone object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Banks</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Banks</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBanks(Banks object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Electronic Mail Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Electronic Mail Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElectronicMailAddress(ElectronicMailAddress object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Social Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Social Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSocialNetwork(SocialNetwork object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shared Secret</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shared Secret</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSharedSecret(SharedSecret object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Public Key Authentication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Public Key Authentication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePublicKeyAuthentication(PublicKeyAuthentication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Challenge Response</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Challenge Response</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChallengeResponse(ChallengeResponse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Attribute Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Attribute Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityAttributeType(IdentityAttributeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Level Of Assurance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Level Of Assurance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLevelOfAssurance(LevelOfAssurance object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataInstantiation(AbstractDataInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiation(DataInstantiation object) {
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

} //TypeSwitch
