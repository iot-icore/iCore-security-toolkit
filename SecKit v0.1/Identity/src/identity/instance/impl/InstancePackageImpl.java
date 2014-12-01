/**
 */
package identity.instance.impl;

import data.DataPackage;

import identity.IdentityPackage;

import identity.action.ActionPackage;

import identity.action.impl.ActionPackageImpl;

import identity.component.ComponentPackage;

import identity.component.impl.ComponentPackageImpl;

import identity.impl.IdentityPackageImpl;

import identity.instance.AbstractIdentity;
import identity.instance.DigitalIdentity;
import identity.instance.IdentityAttribute;
import identity.instance.IdentityFederation;
import identity.instance.IdentityOwner;
import identity.instance.IdentityRealm;
import identity.instance.InstanceFactory;
import identity.instance.InstancePackage;
import identity.instance.SelfSignedIdentity;

import identity.instantiation.InstantiationPackage;

import identity.instantiation.impl.InstantiationPackageImpl;

import identity.pattern.PatternPackage;

import identity.pattern.impl.PatternPackageImpl;

import identity.type.TypePackage;

import identity.type.impl.TypePackageImpl;

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
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractIdentityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalIdentityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityRealmEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass selfSignedIdentityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityFederationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityOwnerEClass = null;

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
     * @see identity.instance.InstancePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private InstancePackageImpl() {
        super(eNS_URI, InstanceFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static InstancePackage init() {
        if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Obtain or create and register package
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) : IdentityPackage.eINSTANCE);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theInstancePackage.createPackageContents();
        theIdentityPackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theInstancePackage.initializePackageContents();
        theIdentityPackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theInstancePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
        return theInstancePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractIdentity() {
        return abstractIdentityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractIdentity_Attributes() {
        return (EReference)abstractIdentityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractIdentity_Type() {
        return (EReference)abstractIdentityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractIdentity_Instantiation() {
        return (EReference)abstractIdentityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractIdentity_Subject() {
        return (EAttribute)abstractIdentityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractIdentity_Owner() {
        return (EReference)abstractIdentityEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalIdentity() {
        return digitalIdentityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDigitalIdentity_Issuer() {
        return (EReference)digitalIdentityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDigitalIdentity_AuthenticationCredentials() {
        return (EReference)digitalIdentityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAttribute() {
        return identityAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAttribute_VerificationMethod() {
        return (EReference)identityAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityRealm() {
        return identityRealmEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityRealm_Name() {
        return (EAttribute)identityRealmEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRealm_Identities() {
        return (EReference)identityRealmEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSelfSignedIdentity() {
        return selfSignedIdentityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityFederation() {
        return identityFederationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityOwner() {
        return identityOwnerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityOwner_Identities() {
        return (EReference)identityOwnerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactory getInstanceFactory() {
        return (InstanceFactory)getEFactoryInstance();
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
        abstractIdentityEClass = createEClass(ABSTRACT_IDENTITY);
        createEReference(abstractIdentityEClass, ABSTRACT_IDENTITY__ATTRIBUTES);
        createEReference(abstractIdentityEClass, ABSTRACT_IDENTITY__TYPE);
        createEReference(abstractIdentityEClass, ABSTRACT_IDENTITY__INSTANTIATION);
        createEAttribute(abstractIdentityEClass, ABSTRACT_IDENTITY__SUBJECT);
        createEReference(abstractIdentityEClass, ABSTRACT_IDENTITY__OWNER);

        digitalIdentityEClass = createEClass(DIGITAL_IDENTITY);
        createEReference(digitalIdentityEClass, DIGITAL_IDENTITY__ISSUER);
        createEReference(digitalIdentityEClass, DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS);

        identityAttributeEClass = createEClass(IDENTITY_ATTRIBUTE);
        createEReference(identityAttributeEClass, IDENTITY_ATTRIBUTE__VERIFICATION_METHOD);

        identityRealmEClass = createEClass(IDENTITY_REALM);
        createEAttribute(identityRealmEClass, IDENTITY_REALM__NAME);
        createEReference(identityRealmEClass, IDENTITY_REALM__IDENTITIES);

        selfSignedIdentityEClass = createEClass(SELF_SIGNED_IDENTITY);

        identityFederationEClass = createEClass(IDENTITY_FEDERATION);

        identityOwnerEClass = createEClass(IDENTITY_OWNER);
        createEReference(identityOwnerEClass, IDENTITY_OWNER__IDENTITIES);
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
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        data.instance.InstancePackage theInstancePackage_1 = (data.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(data.instance.InstancePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        abstractIdentityEClass.getESuperTypes().add(theModelsPackage.getElement());
        digitalIdentityEClass.getESuperTypes().add(this.getSelfSignedIdentity());
        identityAttributeEClass.getESuperTypes().add(theInstancePackage_1.getData());
        identityRealmEClass.getESuperTypes().add(theModelsPackage.getElement());
        selfSignedIdentityEClass.getESuperTypes().add(this.getAbstractIdentity());

        // Initialize classes, features, and operations; add parameters
        initEClass(abstractIdentityEClass, AbstractIdentity.class, "AbstractIdentity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractIdentity_Attributes(), this.getIdentityAttribute(), null, "attributes", null, 0, -1, AbstractIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractIdentity_Type(), theTypePackage.getIdentityType(), null, "type", null, 1, 1, AbstractIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractIdentity_Instantiation(), theInstantiationPackage.getIdentityInstantiation(), theInstantiationPackage.getIdentityInstantiation_Instances(), "instantiation", null, 0, 1, AbstractIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractIdentity_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, AbstractIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractIdentity_Owner(), this.getIdentityOwner(), this.getIdentityOwner_Identities(), "owner", null, 1, 1, AbstractIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(digitalIdentityEClass, DigitalIdentity.class, "DigitalIdentity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDigitalIdentity_Issuer(), this.getAbstractIdentity(), null, "issuer", null, 1, 1, DigitalIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDigitalIdentity_AuthenticationCredentials(), theTypePackage.getAuthenticationCredential(), null, "authenticationCredentials", null, 0, -1, DigitalIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityAttributeEClass, IdentityAttribute.class, "IdentityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityAttribute_VerificationMethod(), theTypePackage.getAttributeVerificationMethod(), null, "verificationMethod", null, 0, -1, IdentityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityRealmEClass, IdentityRealm.class, "IdentityRealm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentityRealm_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentityRealm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityRealm_Identities(), this.getAbstractIdentity(), null, "identities", null, 0, -1, IdentityRealm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(selfSignedIdentityEClass, SelfSignedIdentity.class, "SelfSignedIdentity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityFederationEClass, IdentityFederation.class, "IdentityFederation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityOwnerEClass, IdentityOwner.class, "IdentityOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityOwner_Identities(), this.getAbstractIdentity(), this.getAbstractIdentity_Owner(), "identities", null, 0, -1, IdentityOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //InstancePackageImpl
