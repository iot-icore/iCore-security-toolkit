/**
 */
package context.type.impl;

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

import context.pattern.PatternPackage;

import context.pattern.impl.PatternPackageImpl;

import context.type.CompositeContextSituationType;
import context.type.ContextInformationType;
import context.type.ContextSituationType;
import context.type.ContextTypePackage;
import context.type.EntityRoleType;
import context.type.OriginType;
import context.type.SituationRoleType;
import context.type.TypeFactory;
import context.type.TypePackage;

import identity.IdentityPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
    private EClass contextSituationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextInformationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityRoleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compositeContextSituationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass situationRoleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum originTypeEEnum = null;

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
     * @see context.type.TypePackage#eNS_URI
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
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) : ManagementPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) : TmpPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theContextPackage.createPackageContents();
        theManagementPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTmpPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theManagementPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTmpPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

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
    public EClass getContextSituationType() {
        return contextSituationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationType_EntityRoleTypes() {
        return (EReference)contextSituationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextSituationType_Name() {
        return (EAttribute)contextSituationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationType_SituationRule() {
        return (EReference)contextSituationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationType_Attributes() {
        return (EReference)contextSituationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituationType_Package() {
        return (EReference)contextSituationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextInformationType() {
        return contextInformationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextInformationType_OriginType() {
        return (EAttribute)contextInformationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationType_SituationRoleTypes() {
        return (EReference)contextInformationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextInformationType_Package() {
        return (EReference)contextInformationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextTypePackage() {
        return contextTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextTypePackage_SituationTypes() {
        return (EReference)contextTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextTypePackage_ContextInformationTypes() {
        return (EReference)contextTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContextTypePackage_Name() {
        return (EAttribute)contextTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityRoleType() {
        return entityRoleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRoleType_Multiplicity() {
        return (EReference)entityRoleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRoleType_ContextInformationTypes() {
        return (EReference)entityRoleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRoleType_ContextSituationType() {
        return (EReference)entityRoleTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityRoleType_Name() {
        return (EAttribute)entityRoleTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompositeContextSituationType() {
        return compositeContextSituationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompositeContextSituationType_SituationRoleTypes() {
        return (EReference)compositeContextSituationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSituationRoleType() {
        return situationRoleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSituationRoleType_ContextSituationType() {
        return (EReference)situationRoleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSituationRoleType_Name() {
        return (EAttribute)situationRoleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSituationRoleType_Multiplicity() {
        return (EReference)situationRoleTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOriginType() {
        return originTypeEEnum;
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
        contextSituationTypeEClass = createEClass(CONTEXT_SITUATION_TYPE);
        createEReference(contextSituationTypeEClass, CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES);
        createEAttribute(contextSituationTypeEClass, CONTEXT_SITUATION_TYPE__NAME);
        createEReference(contextSituationTypeEClass, CONTEXT_SITUATION_TYPE__SITUATION_RULE);
        createEReference(contextSituationTypeEClass, CONTEXT_SITUATION_TYPE__ATTRIBUTES);
        createEReference(contextSituationTypeEClass, CONTEXT_SITUATION_TYPE__PACKAGE);

        contextInformationTypeEClass = createEClass(CONTEXT_INFORMATION_TYPE);
        createEAttribute(contextInformationTypeEClass, CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE);
        createEReference(contextInformationTypeEClass, CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES);
        createEReference(contextInformationTypeEClass, CONTEXT_INFORMATION_TYPE__PACKAGE);

        contextTypePackageEClass = createEClass(CONTEXT_TYPE_PACKAGE);
        createEReference(contextTypePackageEClass, CONTEXT_TYPE_PACKAGE__SITUATION_TYPES);
        createEReference(contextTypePackageEClass, CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES);
        createEAttribute(contextTypePackageEClass, CONTEXT_TYPE_PACKAGE__NAME);

        entityRoleTypeEClass = createEClass(ENTITY_ROLE_TYPE);
        createEReference(entityRoleTypeEClass, ENTITY_ROLE_TYPE__MULTIPLICITY);
        createEReference(entityRoleTypeEClass, ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES);
        createEReference(entityRoleTypeEClass, ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE);
        createEAttribute(entityRoleTypeEClass, ENTITY_ROLE_TYPE__NAME);

        compositeContextSituationTypeEClass = createEClass(COMPOSITE_CONTEXT_SITUATION_TYPE);
        createEReference(compositeContextSituationTypeEClass, COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES);

        situationRoleTypeEClass = createEClass(SITUATION_ROLE_TYPE);
        createEReference(situationRoleTypeEClass, SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE);
        createEAttribute(situationRoleTypeEClass, SITUATION_ROLE_TYPE__NAME);
        createEReference(situationRoleTypeEClass, SITUATION_ROLE_TYPE__MULTIPLICITY);

        // Create enums
        originTypeEEnum = createEEnum(ORIGIN_TYPE);
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
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        data.instantiation.InstantiationPackage theInstantiationPackage_1 = (data.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(data.instantiation.InstantiationPackage.eNS_URI);
        data.type.TypePackage theTypePackage_1 = (data.type.TypePackage)EPackage.Registry.INSTANCE.getEPackage(data.type.TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextSituationTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        contextInformationTypeEClass.getESuperTypes().add(theTypePackage_1.getDataType());
        contextTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        entityRoleTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        compositeContextSituationTypeEClass.getESuperTypes().add(this.getContextSituationType());
        situationRoleTypeEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(contextSituationTypeEClass, ContextSituationType.class, "ContextSituationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextSituationType_EntityRoleTypes(), this.getEntityRoleType(), this.getEntityRoleType_ContextSituationType(), "entityRoleTypes", null, 0, -1, ContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextSituationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituationType_SituationRule(), theInstantiationPackage.getContextSituationRule(), null, "situationRule", null, 0, 1, ContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituationType_Attributes(), theInstantiationPackage_1.getDataInstantiation(), null, "attributes", null, 0, -1, ContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituationType_Package(), this.getContextTypePackage(), this.getContextTypePackage_SituationTypes(), "package", null, 0, 1, ContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextInformationTypeEClass, ContextInformationType.class, "ContextInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getContextInformationType_OriginType(), this.getOriginType(), "originType", null, 0, 1, ContextInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextInformationType_SituationRoleTypes(), this.getEntityRoleType(), this.getEntityRoleType_ContextInformationTypes(), "situationRoleTypes", null, 0, -1, ContextInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextInformationType_Package(), this.getContextTypePackage(), this.getContextTypePackage_ContextInformationTypes(), "package", null, 0, 1, ContextInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextTypePackageEClass, ContextTypePackage.class, "ContextTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextTypePackage_SituationTypes(), this.getContextSituationType(), this.getContextSituationType_Package(), "situationTypes", null, 0, -1, ContextTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextTypePackage_ContextInformationTypes(), this.getContextInformationType(), this.getContextInformationType_Package(), "contextInformationTypes", null, 0, -1, ContextTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContextTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityRoleTypeEClass, EntityRoleType.class, "EntityRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityRoleType_Multiplicity(), theModelsPackage.getMultiplicity(), null, "multiplicity", null, 0, 1, EntityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityRoleType_ContextInformationTypes(), this.getContextInformationType(), this.getContextInformationType_SituationRoleTypes(), "contextInformationTypes", null, 0, -1, EntityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityRoleType_ContextSituationType(), this.getContextSituationType(), this.getContextSituationType_EntityRoleTypes(), "contextSituationType", null, 0, 1, EntityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEntityRoleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compositeContextSituationTypeEClass, CompositeContextSituationType.class, "CompositeContextSituationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompositeContextSituationType_SituationRoleTypes(), this.getSituationRoleType(), null, "situationRoleTypes", null, 0, -1, CompositeContextSituationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(situationRoleTypeEClass, SituationRoleType.class, "SituationRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSituationRoleType_ContextSituationType(), this.getContextSituationType(), null, "contextSituationType", null, 1, 1, SituationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSituationRoleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, SituationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSituationRoleType_Multiplicity(), theModelsPackage.getMultiplicity(), null, "multiplicity", null, 0, 1, SituationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(originTypeEEnum, OriginType.class, "OriginType");
        addEEnumLiteral(originTypeEEnum, OriginType.SENSED);
        addEEnumLiteral(originTypeEEnum, OriginType.DERIVED);
        addEEnumLiteral(originTypeEEnum, OriginType.PROFILED);
    }

} //TypePackageImpl
