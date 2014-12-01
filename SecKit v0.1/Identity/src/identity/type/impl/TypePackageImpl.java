/**
 */
package identity.type.impl;

import data.DataPackage;

import identity.IdentityPackage;

import identity.action.ActionPackage;

import identity.action.impl.ActionPackageImpl;

import identity.component.ComponentPackage;

import identity.component.impl.ComponentPackageImpl;

import identity.impl.IdentityPackageImpl;

import identity.instance.InstancePackage;

import identity.instance.impl.InstancePackageImpl;

import identity.instantiation.InstantiationPackage;

import identity.instantiation.impl.InstantiationPackageImpl;

import identity.pattern.PatternPackage;

import identity.pattern.impl.PatternPackageImpl;

import identity.type.AttributeVerificationMethod;
import identity.type.AuthenticationAssertion;
import identity.type.AuthenticationCredential;
import identity.type.AuthenticationMethod;
import identity.type.Banks;
import identity.type.BiometricCredential;
import identity.type.ChallengeResponse;
import identity.type.ContactlessSmartCard;
import identity.type.DigitalIdentityType;
import identity.type.DirectVerification;
import identity.type.ElectronicDocument;
import identity.type.ElectronicMailAddress;
import identity.type.Employment;
import identity.type.ExternalAuthentication;
import identity.type.Government;
import identity.type.Identifier;
import identity.type.IdentityAttributeInstantiation;
import identity.type.IdentityAttributeType;
import identity.type.IdentityRegistration;
import identity.type.IdentityType;
import identity.type.IdentityTypePackage;
import identity.type.LevelOfAssurance;
import identity.type.MediaType;
import identity.type.MobilePhone;
import identity.type.NotVerified;
import identity.type.OpenSignUp;
import identity.type.Password;
import identity.type.PasswordAuthentication;
import identity.type.PhysicalIdentityType;
import identity.type.PhysicalPresenceFace2Face;
import identity.type.PhysicalToken;
import identity.type.Private;
import identity.type.Professional;
import identity.type.PublicKeyAuthentication;
import identity.type.Remote;
import identity.type.SharedSecret;
import identity.type.SocialNetwork;
import identity.type.TokenAuthentication;
import identity.type.TypeFactory;
import identity.type.TypePackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalIdentityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authenticationMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passwordAuthenticationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tokenAuthenticationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externalAuthenticationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remoteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass biometricCredentialEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalTokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalPresenceFace2FaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authenticationCredentialEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passwordEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeVerificationMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAttributeInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalIdentityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass notVerifiedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityRegistrationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass openSignUpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass directVerificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass electronicDocumentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mediaTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contactlessSmartCardEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authenticationAssertionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass governmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass employmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass professionalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mobilePhoneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass banksEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass electronicMailAddressEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass socialNetworkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sharedSecretEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass publicKeyAuthenticationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass challengeResponseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAttributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass levelOfAssuranceEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see identity.type.TypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TypePackageImpl() {
        super(eNS_URI, TypeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TypePackage init() {
        if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Obtain or create and register package
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) : IdentityPackage.eINSTANCE);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theIdentityPackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theIdentityPackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTypePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
        return theTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalIdentityType() {
        return digitalIdentityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDigitalIdentityType_AttributeInstantiations() {
        return (EReference)digitalIdentityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityTypePackage() {
        return identityTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityTypePackage_IdentityTypes() {
        return (EReference)identityTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityTypePackage_Name() {
        return (EAttribute)identityTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityTypePackage_Model() {
        return (EReference)identityTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityTypePackage_AttributeTypes() {
        return (EReference)identityTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthenticationMethod() {
        return authenticationMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPasswordAuthentication() {
        return passwordAuthenticationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTokenAuthentication() {
        return tokenAuthenticationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExternalAuthentication() {
        return externalAuthenticationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemote() {
        return remoteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBiometricCredential() {
        return biometricCredentialEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalToken() {
        return physicalTokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhysicalToken_MediaType() {
        return (EReference)physicalTokenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalPresenceFace2Face() {
        return physicalPresenceFace2FaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthenticationCredential() {
        return authenticationCredentialEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAuthenticationCredential_Value() {
        return (EAttribute)authenticationCredentialEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifier() {
        return identifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPassword() {
        return passwordEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeVerificationMethod() {
        return attributeVerificationMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeVerificationMethod_Name() {
        return (EAttribute)attributeVerificationMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAttributeInstantiation() {
        return identityAttributeInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAttributeInstantiation_IdentityType() {
        return (EReference)identityAttributeInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAttributeInstantiation_VerificationMethod() {
        return (EReference)identityAttributeInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalIdentityType() {
        return physicalIdentityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityType() {
        return identityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_Package() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityType_Name() {
        return (EAttribute)identityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityType_Instantiations() {
        return (EReference)identityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityType_Description() {
        return (EAttribute)identityTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNotVerified() {
        return notVerifiedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityRegistration() {
        return identityRegistrationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRegistration_RequiredAttributes() {
        return (EReference)identityRegistrationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpenSignUp() {
        return openSignUpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDirectVerification() {
        return directVerificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElectronicDocument() {
        return electronicDocumentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElectronicDocument_Contains() {
        return (EReference)electronicDocumentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElectronicDocument_MediaType() {
        return (EReference)electronicDocumentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMediaType() {
        return mediaTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContactlessSmartCard() {
        return contactlessSmartCardEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthenticationAssertion() {
        return authenticationAssertionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGovernment() {
        return governmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmployment() {
        return employmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrivate() {
        return privateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProfessional() {
        return professionalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMobilePhone() {
        return mobilePhoneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBanks() {
        return banksEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElectronicMailAddress() {
        return electronicMailAddressEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSocialNetwork() {
        return socialNetworkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSharedSecret() {
        return sharedSecretEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPublicKeyAuthentication() {
        return publicKeyAuthenticationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChallengeResponse() {
        return challengeResponseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAttributeType() {
        return identityAttributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAttributeType_Package() {
        return (EReference)identityAttributeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLevelOfAssurance() {
        return levelOfAssuranceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactory getTypeFactory() {
        return (TypeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        digitalIdentityTypeEClass = createEClass(DIGITAL_IDENTITY_TYPE);
        createEReference(digitalIdentityTypeEClass, DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS);

        identityTypePackageEClass = createEClass(IDENTITY_TYPE_PACKAGE);
        createEReference(identityTypePackageEClass, IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES);
        createEAttribute(identityTypePackageEClass, IDENTITY_TYPE_PACKAGE__NAME);
        createEReference(identityTypePackageEClass, IDENTITY_TYPE_PACKAGE__MODEL);
        createEReference(identityTypePackageEClass, IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES);

        authenticationMethodEClass = createEClass(AUTHENTICATION_METHOD);

        passwordAuthenticationEClass = createEClass(PASSWORD_AUTHENTICATION);

        tokenAuthenticationEClass = createEClass(TOKEN_AUTHENTICATION);

        externalAuthenticationEClass = createEClass(EXTERNAL_AUTHENTICATION);

        remoteEClass = createEClass(REMOTE);

        biometricCredentialEClass = createEClass(BIOMETRIC_CREDENTIAL);

        physicalTokenEClass = createEClass(PHYSICAL_TOKEN);
        createEReference(physicalTokenEClass, PHYSICAL_TOKEN__MEDIA_TYPE);

        physicalPresenceFace2FaceEClass = createEClass(PHYSICAL_PRESENCE_FACE2_FACE);

        authenticationCredentialEClass = createEClass(AUTHENTICATION_CREDENTIAL);
        createEAttribute(authenticationCredentialEClass, AUTHENTICATION_CREDENTIAL__VALUE);

        identifierEClass = createEClass(IDENTIFIER);

        passwordEClass = createEClass(PASSWORD);

        attributeVerificationMethodEClass = createEClass(ATTRIBUTE_VERIFICATION_METHOD);
        createEAttribute(attributeVerificationMethodEClass, ATTRIBUTE_VERIFICATION_METHOD__NAME);

        identityAttributeInstantiationEClass = createEClass(IDENTITY_ATTRIBUTE_INSTANTIATION);
        createEReference(identityAttributeInstantiationEClass, IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE);
        createEReference(identityAttributeInstantiationEClass, IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD);

        physicalIdentityTypeEClass = createEClass(PHYSICAL_IDENTITY_TYPE);

        identityTypeEClass = createEClass(IDENTITY_TYPE);
        createEReference(identityTypeEClass, IDENTITY_TYPE__PACKAGE);
        createEAttribute(identityTypeEClass, IDENTITY_TYPE__NAME);
        createEReference(identityTypeEClass, IDENTITY_TYPE__INSTANTIATIONS);
        createEAttribute(identityTypeEClass, IDENTITY_TYPE__DESCRIPTION);

        notVerifiedEClass = createEClass(NOT_VERIFIED);

        identityRegistrationEClass = createEClass(IDENTITY_REGISTRATION);
        createEReference(identityRegistrationEClass, IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES);

        openSignUpEClass = createEClass(OPEN_SIGN_UP);

        directVerificationEClass = createEClass(DIRECT_VERIFICATION);

        electronicDocumentEClass = createEClass(ELECTRONIC_DOCUMENT);
        createEReference(electronicDocumentEClass, ELECTRONIC_DOCUMENT__CONTAINS);
        createEReference(electronicDocumentEClass, ELECTRONIC_DOCUMENT__MEDIA_TYPE);

        mediaTypeEClass = createEClass(MEDIA_TYPE);

        contactlessSmartCardEClass = createEClass(CONTACTLESS_SMART_CARD);

        authenticationAssertionEClass = createEClass(AUTHENTICATION_ASSERTION);

        governmentEClass = createEClass(GOVERNMENT);

        employmentEClass = createEClass(EMPLOYMENT);

        privateEClass = createEClass(PRIVATE);

        professionalEClass = createEClass(PROFESSIONAL);

        mobilePhoneEClass = createEClass(MOBILE_PHONE);

        banksEClass = createEClass(BANKS);

        electronicMailAddressEClass = createEClass(ELECTRONIC_MAIL_ADDRESS);

        socialNetworkEClass = createEClass(SOCIAL_NETWORK);

        sharedSecretEClass = createEClass(SHARED_SECRET);

        publicKeyAuthenticationEClass = createEClass(PUBLIC_KEY_AUTHENTICATION);

        challengeResponseEClass = createEClass(CHALLENGE_RESPONSE);

        identityAttributeTypeEClass = createEClass(IDENTITY_ATTRIBUTE_TYPE);
        createEReference(identityAttributeTypeEClass, IDENTITY_ATTRIBUTE_TYPE__PACKAGE);

        levelOfAssuranceEClass = createEClass(LEVEL_OF_ASSURANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        IdentityPackage theIdentityPackage = (IdentityPackage)EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI);
        data.instantiation.InstantiationPackage theInstantiationPackage_1 = (data.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(data.instantiation.InstantiationPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        digitalIdentityTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        digitalIdentityTypeEClass.getESuperTypes().add(this.getIdentityType());
        identityTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        authenticationMethodEClass.getESuperTypes().add(theModelsPackage.getElement());
        passwordAuthenticationEClass.getESuperTypes().add(this.getAuthenticationMethod());
        tokenAuthenticationEClass.getESuperTypes().add(this.getAuthenticationMethod());
        externalAuthenticationEClass.getESuperTypes().add(this.getAuthenticationMethod());
        remoteEClass.getESuperTypes().add(this.getDirectVerification());
        biometricCredentialEClass.getESuperTypes().add(this.getAuthenticationCredential());
        physicalTokenEClass.getESuperTypes().add(this.getAuthenticationCredential());
        physicalPresenceFace2FaceEClass.getESuperTypes().add(this.getDirectVerification());
        authenticationCredentialEClass.getESuperTypes().add(theModelsPackage.getElement());
        identifierEClass.getESuperTypes().add(this.getAuthenticationCredential());
        passwordEClass.getESuperTypes().add(this.getSharedSecret());
        attributeVerificationMethodEClass.getESuperTypes().add(theModelsPackage.getElement());
        attributeVerificationMethodEClass.getESuperTypes().add(this.getLevelOfAssurance());
        identityAttributeInstantiationEClass.getESuperTypes().add(theInstantiationPackage_1.getDataInstantiation());
        physicalIdentityTypeEClass.getESuperTypes().add(this.getIdentityType());
        identityTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        notVerifiedEClass.getESuperTypes().add(this.getAttributeVerificationMethod());
        identityRegistrationEClass.getESuperTypes().add(theModelsPackage.getElement());
        openSignUpEClass.getESuperTypes().add(this.getIdentityRegistration());
        directVerificationEClass.getESuperTypes().add(this.getAttributeVerificationMethod());
        electronicDocumentEClass.getESuperTypes().add(this.getPhysicalIdentityType());
        contactlessSmartCardEClass.getESuperTypes().add(this.getMediaType());
        sharedSecretEClass.getESuperTypes().add(this.getAuthenticationCredential());
        publicKeyAuthenticationEClass.getESuperTypes().add(this.getAuthenticationMethod());

        // Initialize classes, features, and operations; add parameters
        initEClass(digitalIdentityTypeEClass, DigitalIdentityType.class, "DigitalIdentityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDigitalIdentityType_AttributeInstantiations(), this.getIdentityAttributeInstantiation(), this.getIdentityAttributeInstantiation_IdentityType(), "attributeInstantiations", null, 0, -1, DigitalIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityTypePackageEClass, IdentityTypePackage.class, "IdentityTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityTypePackage_IdentityTypes(), this.getIdentityType(), this.getIdentityType_Package(), "identityTypes", null, 0, -1, IdentityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentityTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityTypePackage_Model(), theIdentityPackage.getIdentityDesignModel(), theIdentityPackage.getIdentityDesignModel_Packages(), "model", null, 0, 1, IdentityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityTypePackage_AttributeTypes(), this.getIdentityAttributeType(), this.getIdentityAttributeType_Package(), "attributeTypes", null, 0, -1, IdentityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(authenticationMethodEClass, AuthenticationMethod.class, "AuthenticationMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(passwordAuthenticationEClass, PasswordAuthentication.class, "PasswordAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tokenAuthenticationEClass, TokenAuthentication.class, "TokenAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(externalAuthenticationEClass, ExternalAuthentication.class, "ExternalAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(remoteEClass, Remote.class, "Remote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(biometricCredentialEClass, BiometricCredential.class, "BiometricCredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(physicalTokenEClass, PhysicalToken.class, "PhysicalToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPhysicalToken_MediaType(), this.getMediaType(), null, "mediaType", null, 0, 1, PhysicalToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(physicalPresenceFace2FaceEClass, PhysicalPresenceFace2Face.class, "PhysicalPresenceFace2Face", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(authenticationCredentialEClass, AuthenticationCredential.class, "AuthenticationCredential", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAuthenticationCredential_Value(), ecorePackage.getEString(), "value", null, 0, 1, AuthenticationCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attributeVerificationMethodEClass, AttributeVerificationMethod.class, "AttributeVerificationMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeVerificationMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeVerificationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityAttributeInstantiationEClass, IdentityAttributeInstantiation.class, "IdentityAttributeInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityAttributeInstantiation_IdentityType(), this.getDigitalIdentityType(), this.getDigitalIdentityType_AttributeInstantiations(), "identityType", null, 0, 1, IdentityAttributeInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityAttributeInstantiation_VerificationMethod(), this.getAttributeVerificationMethod(), null, "verificationMethod", null, 1, 1, IdentityAttributeInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(physicalIdentityTypeEClass, PhysicalIdentityType.class, "PhysicalIdentityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityTypeEClass, IdentityType.class, "IdentityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityType_Package(), this.getIdentityTypePackage(), this.getIdentityTypePackage_IdentityTypes(), "package", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentityType_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityType_Instantiations(), theInstantiationPackage.getIdentityInstantiation(), theInstantiationPackage.getIdentityInstantiation_Type(), "instantiations", null, 0, -1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentityType_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(notVerifiedEClass, NotVerified.class, "NotVerified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityRegistrationEClass, IdentityRegistration.class, "IdentityRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityRegistration_RequiredAttributes(), this.getIdentityAttributeInstantiation(), null, "requiredAttributes", null, 0, -1, IdentityRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(openSignUpEClass, OpenSignUp.class, "OpenSignUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(directVerificationEClass, DirectVerification.class, "DirectVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(electronicDocumentEClass, ElectronicDocument.class, "ElectronicDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElectronicDocument_Contains(), this.getDigitalIdentityType(), null, "contains", null, 0, -1, ElectronicDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElectronicDocument_MediaType(), this.getMediaType(), null, "mediaType", null, 1, 1, ElectronicDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mediaTypeEClass, MediaType.class, "MediaType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contactlessSmartCardEClass, ContactlessSmartCard.class, "ContactlessSmartCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(authenticationAssertionEClass, AuthenticationAssertion.class, "AuthenticationAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(governmentEClass, Government.class, "Government", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(employmentEClass, Employment.class, "Employment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(privateEClass, Private.class, "Private", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(professionalEClass, Professional.class, "Professional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mobilePhoneEClass, MobilePhone.class, "MobilePhone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(banksEClass, Banks.class, "Banks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(electronicMailAddressEClass, ElectronicMailAddress.class, "ElectronicMailAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(socialNetworkEClass, SocialNetwork.class, "SocialNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sharedSecretEClass, SharedSecret.class, "SharedSecret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(publicKeyAuthenticationEClass, PublicKeyAuthentication.class, "PublicKeyAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(challengeResponseEClass, ChallengeResponse.class, "ChallengeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityAttributeTypeEClass, IdentityAttributeType.class, "IdentityAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityAttributeType_Package(), this.getIdentityTypePackage(), this.getIdentityTypePackage_AttributeTypes(), "package", null, 0, 1, IdentityAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(levelOfAssuranceEClass, LevelOfAssurance.class, "LevelOfAssurance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //TypePackageImpl
