/**
 */
package context.management.impl;

import context.ContextPackage;

import context.event.EventPackage;

import context.event.impl.EventPackageImpl;

import context.impl.ContextPackageImpl;

import context.instance.InstancePackage;

import context.instance.impl.InstancePackageImpl;

import context.instance.tmp.TmpPackage;

import context.instance.tmp.impl.TmpPackageImpl;

import context.instantiation.InstantiationPackage;

import context.instantiation.impl.InstantiationPackageImpl;

import context.management.ContextAwareServiceProviderCharacterization;
import context.management.ContextAwareServiceProvisioningDescription;
import context.management.ContextProviderCharacterization;
import context.management.ContextProvisioningServiceDescription;
import context.management.ManagementFactory;
import context.management.ManagementPackage;
import context.management.QualityOfContextProvisioning;
import context.management.QualityOfSituationProvisioning;
import context.management.SituationProviderCharacterization;
import context.management.SituationProvisioningServiceDescription;

import context.pattern.PatternPackage;

import context.pattern.impl.PatternPackageImpl;

import context.type.TypePackage;

import context.type.impl.TypePackageImpl;

import identity.IdentityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagementPackageImpl extends EPackageImpl implements ManagementPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextProviderCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass situationProviderCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextAwareServiceProvisioningDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextProvisioningServiceDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextAwareServiceProviderCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass situationProvisioningServiceDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfContextProvisioningEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfSituationProvisioningEClass = null;

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
     * @see context.management.ManagementPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ManagementPackageImpl() {
        super(eNS_URI, ManagementFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ManagementPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ManagementPackage init() {
        if (isInited) return (ManagementPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI);

        // Obtain or create and register package
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ManagementPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) : TmpPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theManagementPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTmpPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theManagementPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTmpPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theManagementPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ManagementPackage.eNS_URI, theManagementPackage);
        return theManagementPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextProviderCharacterization() {
        return contextProviderCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextProviderCharacterization_ContextOwners() {
        return (EReference)contextProviderCharacterizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextProviderCharacterization_OwnerContextAttributeRef() {
        return (EAttribute)contextProviderCharacterizationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSituationProviderCharacterization() {
        return situationProviderCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSituationProviderCharacterization_ContextOwners() {
        return (EReference)situationProviderCharacterizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSituationProviderCharacterization_OwnerSituationAttributeRef() {
        return (EAttribute)situationProviderCharacterizationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextAwareServiceProvisioningDescription() {
        return contextAwareServiceProvisioningDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextProvisioningServiceDescription() {
        return contextProvisioningServiceDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextProvisioningServiceDescription_ContextType() {
        return (EReference)contextProvisioningServiceDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextAwareServiceProviderCharacterization() {
        return contextAwareServiceProviderCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSituationProvisioningServiceDescription() {
        return situationProvisioningServiceDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSituationProvisioningServiceDescription_SituationType() {
        return (EReference)situationProvisioningServiceDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfContextProvisioning() {
        return qualityOfContextProvisioningEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfSituationProvisioning() {
        return qualityOfSituationProvisioningEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfSituationProvisioning_DetectSituations() {
        return (EAttribute)qualityOfSituationProvisioningEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfSituationProvisioning_ReportSituations() {
        return (EAttribute)qualityOfSituationProvisioningEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfSituationProvisioning_ReportSituationOnTime() {
        return (EAttribute)qualityOfSituationProvisioningEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQualityOfSituationProvisioning_MaxDelay() {
        return (EReference)qualityOfSituationProvisioningEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagementFactory getManagementFactory() {
        return (ManagementFactory)getEFactoryInstance();
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
        contextProviderCharacterizationEClass = createEClass(CONTEXT_PROVIDER_CHARACTERIZATION);
        createEReference(contextProviderCharacterizationEClass, CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS);
        createEAttribute(contextProviderCharacterizationEClass, CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF);

        situationProviderCharacterizationEClass = createEClass(SITUATION_PROVIDER_CHARACTERIZATION);
        createEReference(situationProviderCharacterizationEClass, SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS);
        createEAttribute(situationProviderCharacterizationEClass, SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF);

        contextAwareServiceProvisioningDescriptionEClass = createEClass(CONTEXT_AWARE_SERVICE_PROVISIONING_DESCRIPTION);

        contextProvisioningServiceDescriptionEClass = createEClass(CONTEXT_PROVISIONING_SERVICE_DESCRIPTION);
        createEReference(contextProvisioningServiceDescriptionEClass, CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE);

        contextAwareServiceProviderCharacterizationEClass = createEClass(CONTEXT_AWARE_SERVICE_PROVIDER_CHARACTERIZATION);

        situationProvisioningServiceDescriptionEClass = createEClass(SITUATION_PROVISIONING_SERVICE_DESCRIPTION);
        createEReference(situationProvisioningServiceDescriptionEClass, SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE);

        qualityOfContextProvisioningEClass = createEClass(QUALITY_OF_CONTEXT_PROVISIONING);

        qualityOfSituationProvisioningEClass = createEClass(QUALITY_OF_SITUATION_PROVISIONING);
        createEAttribute(qualityOfSituationProvisioningEClass, QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS);
        createEAttribute(qualityOfSituationProvisioningEClass, QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS);
        createEAttribute(qualityOfSituationProvisioningEClass, QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME);
        createEReference(qualityOfSituationProvisioningEClass, QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY);
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
        identity.instance.InstancePackage theInstancePackage_1 = (identity.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(identity.instance.InstancePackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(contextProviderCharacterizationEClass, ContextProviderCharacterization.class, "ContextProviderCharacterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextProviderCharacterization_ContextOwners(), theInstancePackage_1.getAbstractIdentity(), null, "contextOwners", null, 0, -1, ContextProviderCharacterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextProviderCharacterization_OwnerContextAttributeRef(), ecorePackage.getEString(), "ownerContextAttributeRef", null, 0, 1, ContextProviderCharacterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(situationProviderCharacterizationEClass, SituationProviderCharacterization.class, "SituationProviderCharacterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSituationProviderCharacterization_ContextOwners(), theInstancePackage_1.getAbstractIdentity(), null, "contextOwners", null, 0, -1, SituationProviderCharacterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSituationProviderCharacterization_OwnerSituationAttributeRef(), ecorePackage.getEString(), "ownerSituationAttributeRef", null, 0, 1, SituationProviderCharacterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextAwareServiceProvisioningDescriptionEClass, ContextAwareServiceProvisioningDescription.class, "ContextAwareServiceProvisioningDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contextProvisioningServiceDescriptionEClass, ContextProvisioningServiceDescription.class, "ContextProvisioningServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextProvisioningServiceDescription_ContextType(), theTypePackage.getContextInformationType(), null, "contextType", null, 1, 1, ContextProvisioningServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextAwareServiceProviderCharacterizationEClass, ContextAwareServiceProviderCharacterization.class, "ContextAwareServiceProviderCharacterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(situationProvisioningServiceDescriptionEClass, SituationProvisioningServiceDescription.class, "SituationProvisioningServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSituationProvisioningServiceDescription_SituationType(), theTypePackage.getContextSituationType(), null, "situationType", null, 1, 1, SituationProvisioningServiceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(qualityOfContextProvisioningEClass, QualityOfContextProvisioning.class, "QualityOfContextProvisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualityOfSituationProvisioningEClass, QualityOfSituationProvisioning.class, "QualityOfSituationProvisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getQualityOfSituationProvisioning_DetectSituations(), ecorePackage.getEBoolean(), "detectSituations", null, 0, 1, QualityOfSituationProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQualityOfSituationProvisioning_ReportSituations(), ecorePackage.getEBoolean(), "reportSituations", null, 0, 1, QualityOfSituationProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQualityOfSituationProvisioning_ReportSituationOnTime(), ecorePackage.getEBoolean(), "reportSituationOnTime", null, 0, 1, QualityOfSituationProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQualityOfSituationProvisioning_MaxDelay(), theTimePackage.getTimeDuration(), null, "maxDelay", null, 0, 1, QualityOfSituationProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //ManagementPackageImpl
