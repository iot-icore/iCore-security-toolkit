/**
 */
package behavior.trust.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.CausalityPackage;

import behavior.causality.impl.CausalityPackageImpl;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.ConstraintPackage;

import behavior.constraint.impl.ConstraintPackageImpl;

import behavior.event.EventPackage;

import behavior.event.impl.EventPackageImpl;

import behavior.impl.BehaviorPackageImpl;

import behavior.instance.InstancePackage;

import behavior.instance.impl.InstancePackageImpl;

import behavior.instantiation.InstantiationPackage;

import behavior.instantiation.impl.InstantiationPackageImpl;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.QualityPackage;

import behavior.quality.impl.QualityPackageImpl;

import behavior.trust.AdaptServiceToContext;
import behavior.trust.BehaviorQuality;
import behavior.trust.CompleteServiceAsAgreed;
import behavior.trust.EClass0;
import behavior.trust.EmployeeTheft;
import behavior.trust.InteractionContributionTrust;
import behavior.trust.PrivacyProtection;
import behavior.trust.ProvideSecureFirmware;
import behavior.trust.QualityOfExperience;
import behavior.trust.QualityOfProtection;
import behavior.trust.QualityOfService;
import behavior.trust.ResponseTime;
import behavior.trust.TrustFactory;
import behavior.trust.TrustPackage;

import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustPackageImpl extends EPackageImpl implements TrustPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privacyProtectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorQualityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass adaptServiceToContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass responseTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfServiceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfExperienceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionContributionTrustEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfProtectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass employeeTheftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass completeServiceAsAgreedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eClass0EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass provideSecureFirmwareEClass = null;

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
     * @see behavior.trust.TrustPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TrustPackageImpl() {
        super(eNS_URI, TrustFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TrustPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TrustPackage init() {
        if (isInited) return (TrustPackage)EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI);

        // Obtain or create and register package
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TrustPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTrustPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();

        // Initialize created meta-data
        theTrustPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTrustPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TrustPackage.eNS_URI, theTrustPackage);
        return theTrustPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrivacyProtection() {
        return privacyProtectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPrivacyProtection_IsAdministrator() {
        return (EAttribute)privacyProtectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPrivacyProtection_IsPepEnabled() {
        return (EAttribute)privacyProtectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorQuality() {
        return behaviorQualityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorQuality_ActivityType() {
        return (EReference)behaviorQualityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorQuality_ContributionType() {
        return (EReference)behaviorQualityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdaptServiceToContext() {
        return adaptServiceToContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResponseTime() {
        return responseTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfService() {
        return qualityOfServiceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfExperience() {
        return qualityOfExperienceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionContributionTrust() {
        return interactionContributionTrustEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfProtection() {
        return qualityOfProtectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmployeeTheft() {
        return employeeTheftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompleteServiceAsAgreed() {
        return completeServiceAsAgreedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEClass0() {
        return eClass0EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProvideSecureFirmware() {
        return provideSecureFirmwareEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrustFactory getTrustFactory() {
        return (TrustFactory)getEFactoryInstance();
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
        privacyProtectionEClass = createEClass(PRIVACY_PROTECTION);
        createEAttribute(privacyProtectionEClass, PRIVACY_PROTECTION__IS_ADMINISTRATOR);
        createEAttribute(privacyProtectionEClass, PRIVACY_PROTECTION__IS_PEP_ENABLED);

        behaviorQualityEClass = createEClass(BEHAVIOR_QUALITY);
        createEReference(behaviorQualityEClass, BEHAVIOR_QUALITY__ACTIVITY_TYPE);
        createEReference(behaviorQualityEClass, BEHAVIOR_QUALITY__CONTRIBUTION_TYPE);

        adaptServiceToContextEClass = createEClass(ADAPT_SERVICE_TO_CONTEXT);

        responseTimeEClass = createEClass(RESPONSE_TIME);

        qualityOfServiceEClass = createEClass(QUALITY_OF_SERVICE);

        qualityOfExperienceEClass = createEClass(QUALITY_OF_EXPERIENCE);

        interactionContributionTrustEClass = createEClass(INTERACTION_CONTRIBUTION_TRUST);

        qualityOfProtectionEClass = createEClass(QUALITY_OF_PROTECTION);

        employeeTheftEClass = createEClass(EMPLOYEE_THEFT);

        completeServiceAsAgreedEClass = createEClass(COMPLETE_SERVICE_AS_AGREED);

        eClass0EClass = createEClass(ECLASS0);

        provideSecureFirmwareEClass = createEClass(PROVIDE_SECURE_FIRMWARE);
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
        trust.instance.InstancePackage theInstancePackage_1 = (trust.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(trust.instance.InstancePackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        privacyProtectionEClass.getESuperTypes().add(this.getQualityOfProtection());
        behaviorQualityEClass.getESuperTypes().add(theInstancePackage_1.getTrustAspect());
        adaptServiceToContextEClass.getESuperTypes().add(this.getQualityOfExperience());
        responseTimeEClass.getESuperTypes().add(this.getQualityOfService());
        qualityOfServiceEClass.getESuperTypes().add(this.getBehaviorQuality());
        qualityOfExperienceEClass.getESuperTypes().add(this.getBehaviorQuality());
        qualityOfProtectionEClass.getESuperTypes().add(this.getBehaviorQuality());
        employeeTheftEClass.getESuperTypes().add(this.getQualityOfProtection());
        completeServiceAsAgreedEClass.getESuperTypes().add(this.getQualityOfService());
        provideSecureFirmwareEClass.getESuperTypes().add(this.getQualityOfProtection());

        // Initialize classes, features, and operations; add parameters
        initEClass(privacyProtectionEClass, PrivacyProtection.class, "PrivacyProtection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPrivacyProtection_IsAdministrator(), ecorePackage.getEBoolean(), "isAdministrator", null, 0, 1, PrivacyProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPrivacyProtection_IsPepEnabled(), ecorePackage.getEBoolean(), "isPepEnabled", null, 0, 1, PrivacyProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorQualityEClass, BehaviorQuality.class, "BehaviorQuality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorQuality_ActivityType(), theTypePackage.getActivityType(), null, "activityType", null, 0, 1, BehaviorQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorQuality_ContributionType(), theTypePackage.getInteractionContributionType(), null, "contributionType", null, 0, 1, BehaviorQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(adaptServiceToContextEClass, AdaptServiceToContext.class, "AdaptServiceToContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(responseTimeEClass, ResponseTime.class, "ResponseTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualityOfServiceEClass, QualityOfService.class, "QualityOfService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualityOfExperienceEClass, QualityOfExperience.class, "QualityOfExperience", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionContributionTrustEClass, InteractionContributionTrust.class, "InteractionContributionTrust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualityOfProtectionEClass, QualityOfProtection.class, "QualityOfProtection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(employeeTheftEClass, EmployeeTheft.class, "EmployeeTheft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(completeServiceAsAgreedEClass, CompleteServiceAsAgreed.class, "CompleteServiceAsAgreed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eClass0EClass, EClass0.class, "EClass0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(provideSecureFirmwareEClass, ProvideSecureFirmware.class, "ProvideSecureFirmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //TrustPackageImpl
