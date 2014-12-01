/**
 */
package context.pattern.impl;

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

import context.management.ManagementPackage;

import context.management.impl.ManagementPackageImpl;

import context.pattern.ContextInformationPattern;
import context.pattern.ContextSituationPattern;
import context.pattern.EntityRolePattern;
import context.pattern.PatternFactory;
import context.pattern.PatternPackage;

import context.type.TypePackage;

import context.type.impl.TypePackageImpl;

import identity.IdentityPackage;

import models.ModelsPackage;

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
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextSituationPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextInformationPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityRolePatternEClass = null;

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
     * @see context.pattern.PatternPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PatternPackageImpl() {
        super(eNS_URI, PatternFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PatternPackage init() {
        if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Obtain or create and register package
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) : ManagementPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) : TmpPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        thePatternPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theManagementPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTmpPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        thePatternPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theManagementPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTmpPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePatternPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
        return thePatternPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextSituationPattern() {
        return contextSituationPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationPattern_EntityRolePatterns() {
        return (EReference)contextSituationPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationPattern_Type() {
        return (EReference)contextSituationPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextInformationPattern() {
        return contextInformationPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationPattern_Owner() {
        return (EReference)contextInformationPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationPattern_QualityOfContext() {
        return (EReference)contextInformationPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationPattern_Type() {
        return (EReference)contextInformationPatternEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityRolePattern() {
        return entityRolePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRolePattern_IdentityPattern() {
        return (EReference)entityRolePatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRolePattern_EntityRoleType() {
        return (EReference)entityRolePatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternFactory getPatternFactory() {
        return (PatternFactory)getEFactoryInstance();
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
        contextSituationPatternEClass = createEClass(CONTEXT_SITUATION_PATTERN);
        createEReference(contextSituationPatternEClass, CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS);
        createEReference(contextSituationPatternEClass, CONTEXT_SITUATION_PATTERN__TYPE);

        contextInformationPatternEClass = createEClass(CONTEXT_INFORMATION_PATTERN);
        createEReference(contextInformationPatternEClass, CONTEXT_INFORMATION_PATTERN__OWNER);
        createEReference(contextInformationPatternEClass, CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT);
        createEReference(contextInformationPatternEClass, CONTEXT_INFORMATION_PATTERN__TYPE);

        entityRolePatternEClass = createEClass(ENTITY_ROLE_PATTERN);
        createEReference(entityRolePatternEClass, ENTITY_ROLE_PATTERN__IDENTITY_PATTERN);
        createEReference(entityRolePatternEClass, ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE);
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
        identity.pattern.PatternPackage thePatternPackage_1 = (identity.pattern.PatternPackage)EPackage.Registry.INSTANCE.getEPackage(identity.pattern.PatternPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextSituationPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
        contextInformationPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
        entityRolePatternEClass.getESuperTypes().add(theModelsPackage.getPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(contextSituationPatternEClass, ContextSituationPattern.class, "ContextSituationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextSituationPattern_EntityRolePatterns(), this.getEntityRolePattern(), null, "entityRolePatterns", null, 0, -1, ContextSituationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituationPattern_Type(), theTypePackage.getContextSituationType(), null, "type", null, 0, 1, ContextSituationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextInformationPatternEClass, ContextInformationPattern.class, "ContextInformationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextInformationPattern_Owner(), thePatternPackage_1.getIdentityPattern(), null, "owner", null, 0, 1, ContextInformationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextInformationPattern_QualityOfContext(), theInstancePackage.getQualityOfContext(), null, "qualityOfContext", null, 0, 1, ContextInformationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextInformationPattern_Type(), theTypePackage.getContextInformationType(), null, "type", null, 0, 1, ContextInformationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityRolePatternEClass, EntityRolePattern.class, "EntityRolePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityRolePattern_IdentityPattern(), thePatternPackage_1.getIdentityPattern(), null, "identityPattern", null, 0, -1, EntityRolePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityRolePattern_EntityRoleType(), theTypePackage.getEntityRoleType(), null, "entityRoleType", null, 0, 1, EntityRolePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //PatternPackageImpl
