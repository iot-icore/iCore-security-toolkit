/**
 */
package seckit.impl;

import behavior.BehaviorPackage;

import context.ContextPackage;

import data.DataPackage;

import identity.IdentityPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import risk.RiskPackage;

import role.RolePackage;

import rule.RulePackage;

import seckit.SeckitFactory;
import seckit.SeckitPackage;
import seckit.SystemDesignViewpoint;
import seckit.SystemRuntimeViewpoint;
import seckit.SystemViewpoint;
import seckit.SystemViewpoints;

import seckit.refinement.RefinementPackage;

import seckit.refinement.impl.RefinementPackageImpl;

import structure.StructurePackage;

import trust.TrustPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeckitPackageImpl extends EPackageImpl implements SeckitPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemDesignViewpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemRuntimeViewpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemViewpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass systemViewpointsEClass = null;

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
     * @see seckit.SeckitPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SeckitPackageImpl() {
        super(eNS_URI, SeckitFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SeckitPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SeckitPackage init() {
        if (isInited) return (SeckitPackage)EPackage.Registry.INSTANCE.getEPackage(SeckitPackage.eNS_URI);

        // Obtain or create and register package
        SeckitPackageImpl theSeckitPackage = (SeckitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeckitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeckitPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        BehaviorPackage.eINSTANCE.eClass();
        RiskPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RefinementPackageImpl theRefinementPackage = (RefinementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RefinementPackage.eNS_URI) instanceof RefinementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RefinementPackage.eNS_URI) : RefinementPackage.eINSTANCE);

        // Create package meta-data objects
        theSeckitPackage.createPackageContents();
        theRefinementPackage.createPackageContents();

        // Initialize created meta-data
        theSeckitPackage.initializePackageContents();
        theRefinementPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSeckitPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SeckitPackage.eNS_URI, theSeckitPackage);
        return theSeckitPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemDesignViewpoint() {
        return systemDesignViewpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_StructuralDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_ContextDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_IdentityDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_DataDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_BehaviorDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_TrustDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_RuleDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_RoleDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemDesignViewpoint_RiskDesignModels() {
        return (EReference)systemDesignViewpointEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemRuntimeViewpoint() {
        return systemRuntimeViewpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_StructuralRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_TrustRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_BehaviorRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_RuleRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_DataRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_IdentityRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_RoleRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_ContextRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemRuntimeViewpoint_RiskRuntimeModels() {
        return (EReference)systemRuntimeViewpointEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemViewpoint() {
        return systemViewpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSystemViewpoints() {
        return systemViewpointsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemViewpoints_Design() {
        return (EReference)systemViewpointsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystemViewpoints_Runtime() {
        return (EReference)systemViewpointsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeckitFactory getSeckitFactory() {
        return (SeckitFactory)getEFactoryInstance();
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
        systemDesignViewpointEClass = createEClass(SYSTEM_DESIGN_VIEWPOINT);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS);
        createEReference(systemDesignViewpointEClass, SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS);

        systemRuntimeViewpointEClass = createEClass(SYSTEM_RUNTIME_VIEWPOINT);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS);
        createEReference(systemRuntimeViewpointEClass, SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS);

        systemViewpointEClass = createEClass(SYSTEM_VIEWPOINT);

        systemViewpointsEClass = createEClass(SYSTEM_VIEWPOINTS);
        createEReference(systemViewpointsEClass, SYSTEM_VIEWPOINTS__DESIGN);
        createEReference(systemViewpointsEClass, SYSTEM_VIEWPOINTS__RUNTIME);
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
        RefinementPackage theRefinementPackage = (RefinementPackage)EPackage.Registry.INSTANCE.getEPackage(RefinementPackage.eNS_URI);
        StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
        ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
        IdentityPackage theIdentityPackage = (IdentityPackage)EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI);
        DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
        BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
        TrustPackage theTrustPackage = (TrustPackage)EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI);
        RulePackage theRulePackage = (RulePackage)EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI);
        RolePackage theRolePackage = (RolePackage)EPackage.Registry.INSTANCE.getEPackage(RolePackage.eNS_URI);
        RiskPackage theRiskPackage = (RiskPackage)EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theRefinementPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        systemDesignViewpointEClass.getESuperTypes().add(this.getSystemViewpoint());
        systemRuntimeViewpointEClass.getESuperTypes().add(this.getSystemViewpoint());
        systemViewpointEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(systemDesignViewpointEClass, SystemDesignViewpoint.class, "SystemDesignViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSystemDesignViewpoint_StructuralDesignModels(), theStructurePackage.getStructuralDesignModel(), null, "structuralDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_ContextDesignModels(), theContextPackage.getContextDesignModel(), null, "contextDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_IdentityDesignModels(), theIdentityPackage.getIdentityDesignModel(), null, "identityDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_DataDesignModels(), theDataPackage.getDataDesignModel(), null, "dataDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_BehaviorDesignModels(), theBehaviorPackage.getBehaviorDesignModel(), null, "behaviorDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_TrustDesignModels(), theTrustPackage.getTrustDesignModel(), null, "trustDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_RuleDesignModels(), theRulePackage.getRuleDesignModel(), null, "ruleDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_RoleDesignModels(), theRolePackage.getRoleDesignModel(), null, "roleDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemDesignViewpoint_RiskDesignModels(), theRiskPackage.getRiskDesignModel(), null, "riskDesignModels", null, 0, -1, SystemDesignViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemRuntimeViewpointEClass, SystemRuntimeViewpoint.class, "SystemRuntimeViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSystemRuntimeViewpoint_StructuralRuntimeModels(), theStructurePackage.getStructuralRuntimeModel(), null, "structuralRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_TrustRuntimeModels(), theTrustPackage.getTrustRuntimeModel(), null, "trustRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_BehaviorRuntimeModels(), theBehaviorPackage.getBehaviorRuntimeModel(), null, "behaviorRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_RuleRuntimeModels(), theRulePackage.getRuleRuntimeModel(), null, "ruleRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_DataRuntimeModels(), theDataPackage.getDataRuntimeModel(), null, "dataRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_IdentityRuntimeModels(), theIdentityPackage.getIdentityRuntimeModel(), null, "identityRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_RoleRuntimeModels(), theRolePackage.getRoleRuntimeModel(), null, "roleRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_ContextRuntimeModels(), theContextPackage.getContextRuntimeModel(), null, "contextRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemRuntimeViewpoint_RiskRuntimeModels(), theRiskPackage.getRiskRuntimeModel(), null, "riskRuntimeModels", null, 0, -1, SystemRuntimeViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemViewpointEClass, SystemViewpoint.class, "SystemViewpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(systemViewpointsEClass, SystemViewpoints.class, "SystemViewpoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSystemViewpoints_Design(), this.getSystemDesignViewpoint(), null, "design", null, 0, 1, SystemViewpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystemViewpoints_Runtime(), this.getSystemRuntimeViewpoint(), null, "runtime", null, 0, 1, SystemViewpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //SeckitPackageImpl
