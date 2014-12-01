/**
 */
package structure.type.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import role.RolePackage;

import structure.StructurePackage;

import structure.address.AddressPackage;

import structure.address.impl.AddressPackageImpl;

import structure.event.EventPackage;

import structure.event.impl.EventPackageImpl;

import structure.impl.StructurePackageImpl;

import structure.instance.InstancePackage;

import structure.instance.impl.InstancePackageImpl;

import structure.instantiation.InstantiationPackage;

import structure.instantiation.impl.InstantiationPackageImpl;

import structure.pattern.PatternPackage;

import structure.pattern.impl.PatternPackageImpl;

import structure.trust.impl.TrustPackageImpl;

import structure.type.ActionPointType;
import structure.type.ActivityPointType;
import structure.type.EntityType;
import structure.type.EntityTypePackage;
import structure.type.InteractionPointParticipationType;
import structure.type.InteractionPointType;
import structure.type.LocalizableType;
import structure.type.LocationType;
import structure.type.TypeFactory;
import structure.type.TypePackage;

import structure.type.world.WorldPackage;

import structure.type.world.impl.WorldPackageImpl;

import structure.variable.VariablePackage;

import structure.variable.impl.VariablePackageImpl;

import trust.TrustPackage;

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
    private EClass locationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointParticipationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localizableTypeEClass = null;

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
     * @see structure.type.TypePackage#eNS_URI
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
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) : WorldPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theStructurePackage.createPackageContents();
        theWorldPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theStructurePackage.initializePackageContents();
        theWorldPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

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
    public EClass getLocationType() {
        return locationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationType_Name() {
        return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationType_Instantiations() {
        return (EReference)locationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationType_Package() {
        return (EReference)locationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointParticipationType() {
        return interactionPointParticipationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionPointParticipationType_Name() {
        return (EAttribute)interactionPointParticipationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationType_Instantiations() {
        return (EReference)interactionPointParticipationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationType_Package() {
        return (EReference)interactionPointParticipationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionPointType() {
        return actionPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointType() {
        return interactionPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointType_Participations() {
        return (EReference)interactionPointTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointType_ParticipationType() {
        return (EReference)interactionPointTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityTypePackage() {
        return entityTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_SubPackages() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_EntityTypes() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityTypePackage_Name() {
        return (EAttribute)entityTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_LocationTypes() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_ParticipationTypes() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_ActivityPointTypes() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_SuperPackage() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityTypePackage_Model() {
        return (EReference)entityTypePackageEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityType() {
        return entityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityType_Name() {
        return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_InteractionPointParticipations() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_Instantiations() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_ContainedInstantiations() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_SuperTypes() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_SubTypes() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_Package() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_ActivityPoints() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityPointType() {
        return activityPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityPointType_Name() {
        return (EAttribute)activityPointTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointType_Instantiations() {
        return (EReference)activityPointTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointType_Instances() {
        return (EReference)activityPointTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointType_Package() {
        return (EReference)activityPointTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointType_SubTypes() {
        return (EReference)activityPointTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointType_SuperType() {
        return (EReference)activityPointTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalizableType() {
        return localizableTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocalizableType_LocationType() {
        return (EReference)localizableTypeEClass.getEStructuralFeatures().get(0);
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
        locationTypeEClass = createEClass(LOCATION_TYPE);
        createEAttribute(locationTypeEClass, LOCATION_TYPE__NAME);
        createEReference(locationTypeEClass, LOCATION_TYPE__INSTANTIATIONS);
        createEReference(locationTypeEClass, LOCATION_TYPE__PACKAGE);

        interactionPointParticipationTypeEClass = createEClass(INTERACTION_POINT_PARTICIPATION_TYPE);
        createEAttribute(interactionPointParticipationTypeEClass, INTERACTION_POINT_PARTICIPATION_TYPE__NAME);
        createEReference(interactionPointParticipationTypeEClass, INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS);
        createEReference(interactionPointParticipationTypeEClass, INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE);

        actionPointTypeEClass = createEClass(ACTION_POINT_TYPE);

        interactionPointTypeEClass = createEClass(INTERACTION_POINT_TYPE);
        createEReference(interactionPointTypeEClass, INTERACTION_POINT_TYPE__PARTICIPATIONS);
        createEReference(interactionPointTypeEClass, INTERACTION_POINT_TYPE__PARTICIPATION_TYPE);

        entityTypePackageEClass = createEClass(ENTITY_TYPE_PACKAGE);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__SUB_PACKAGES);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__ENTITY_TYPES);
        createEAttribute(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__NAME);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__LOCATION_TYPES);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__SUPER_PACKAGE);
        createEReference(entityTypePackageEClass, ENTITY_TYPE_PACKAGE__MODEL);

        entityTypeEClass = createEClass(ENTITY_TYPE);
        createEAttribute(entityTypeEClass, ENTITY_TYPE__NAME);
        createEReference(entityTypeEClass, ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS);
        createEReference(entityTypeEClass, ENTITY_TYPE__INSTANTIATIONS);
        createEReference(entityTypeEClass, ENTITY_TYPE__CONTAINED_INSTANTIATIONS);
        createEReference(entityTypeEClass, ENTITY_TYPE__SUPER_TYPES);
        createEReference(entityTypeEClass, ENTITY_TYPE__SUB_TYPES);
        createEReference(entityTypeEClass, ENTITY_TYPE__PACKAGE);
        createEReference(entityTypeEClass, ENTITY_TYPE__ACTIVITY_POINTS);

        activityPointTypeEClass = createEClass(ACTIVITY_POINT_TYPE);
        createEAttribute(activityPointTypeEClass, ACTIVITY_POINT_TYPE__NAME);
        createEReference(activityPointTypeEClass, ACTIVITY_POINT_TYPE__INSTANTIATIONS);
        createEReference(activityPointTypeEClass, ACTIVITY_POINT_TYPE__INSTANCES);
        createEReference(activityPointTypeEClass, ACTIVITY_POINT_TYPE__PACKAGE);
        createEReference(activityPointTypeEClass, ACTIVITY_POINT_TYPE__SUB_TYPES);
        createEReference(activityPointTypeEClass, ACTIVITY_POINT_TYPE__SUPER_TYPE);

        localizableTypeEClass = createEClass(LOCALIZABLE_TYPE);
        createEReference(localizableTypeEClass, LOCALIZABLE_TYPE__LOCATION_TYPE);
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
        WorldPackage theWorldPackage = (WorldPackage)EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theWorldPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        locationTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationTypeEClass.getESuperTypes().add(this.getLocalizableType());
        actionPointTypeEClass.getESuperTypes().add(this.getActivityPointType());
        actionPointTypeEClass.getESuperTypes().add(this.getLocalizableType());
        interactionPointTypeEClass.getESuperTypes().add(this.getActivityPointType());
        entityTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        entityTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        activityPointTypeEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocationType_Instantiations(), theInstantiationPackage.getLocationInstantiation(), theInstantiationPackage.getLocationInstantiation_Type(), "instantiations", null, 0, -1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocationType_Package(), this.getEntityTypePackage(), this.getEntityTypePackage_LocationTypes(), "package", null, 1, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionPointParticipationTypeEClass, InteractionPointParticipationType.class, "InteractionPointParticipationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInteractionPointParticipationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractionPointParticipationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationType_Instantiations(), theInstantiationPackage.getInteractionPointParticipationInstantiation(), theInstantiationPackage.getInteractionPointParticipationInstantiation_ParticipationType(), "instantiations", null, 0, -1, InteractionPointParticipationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationType_Package(), this.getEntityTypePackage(), this.getEntityTypePackage_ParticipationTypes(), "package", null, 1, 1, InteractionPointParticipationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionPointTypeEClass, ActionPointType.class, "ActionPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionPointTypeEClass, InteractionPointType.class, "InteractionPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPointType_Participations(), theInstantiationPackage.getInteractionPointParticipationOfInstantiation(), theInstantiationPackage.getInteractionPointParticipationOfInstantiation_InteractionPointType(), "participations", null, 2, -1, InteractionPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointType_ParticipationType(), this.getInteractionPointParticipationType(), null, "participationType", null, 1, 1, InteractionPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityTypePackageEClass, EntityTypePackage.class, "EntityTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityTypePackage_SubPackages(), this.getEntityTypePackage(), this.getEntityTypePackage_SuperPackage(), "subPackages", null, 0, -1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_EntityTypes(), this.getEntityType(), this.getEntityType_Package(), "entityTypes", null, 0, -1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEntityTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_LocationTypes(), this.getLocationType(), this.getLocationType_Package(), "locationTypes", null, 0, -1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_ParticipationTypes(), this.getInteractionPointParticipationType(), this.getInteractionPointParticipationType_Package(), "participationTypes", null, 0, -1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_ActivityPointTypes(), this.getActivityPointType(), this.getActivityPointType_Package(), "activityPointTypes", null, 0, -1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_SuperPackage(), this.getEntityTypePackage(), this.getEntityTypePackage_SubPackages(), "superPackage", null, 0, 1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityTypePackage_Model(), theStructurePackage.getStructuralDesignModel(), theStructurePackage.getStructuralDesignModel_EntityTypePackages(), "model", null, 0, 1, EntityTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntityType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_InteractionPointParticipations(), theInstantiationPackage.getAbstractInteractionPointParticipationOfType(), theInstantiationPackage.getAbstractInteractionPointParticipationOfType_EntityType(), "interactionPointParticipations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_Instantiations(), theInstantiationPackage.getEntityInstantiation(), theInstantiationPackage.getEntityInstantiation_Type(), "instantiations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_ContainedInstantiations(), theInstantiationPackage.getEntityInstantiation(), theInstantiationPackage.getEntityInstantiation_ContainerType(), "containedInstantiations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_SuperTypes(), this.getEntityType(), this.getEntityType_SubTypes(), "superTypes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_SubTypes(), this.getEntityType(), this.getEntityType_SuperTypes(), "subTypes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_Package(), this.getEntityTypePackage(), this.getEntityTypePackage_EntityTypes(), "package", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_ActivityPoints(), theInstantiationPackage.getActivityPointInstantiation(), theInstantiationPackage.getActivityPointInstantiation_EntityType(), "activityPoints", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityPointTypeEClass, ActivityPointType.class, "ActivityPointType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivityPointType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointType_Instantiations(), theInstantiationPackage.getActivityPointInstantiation(), theInstantiationPackage.getActivityPointInstantiation_Type(), "instantiations", null, 0, -1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointType_Instances(), theInstancePackage.getActivityPoint(), theInstancePackage.getActivityPoint_Type(), "instances", null, 0, -1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointType_Package(), this.getEntityTypePackage(), this.getEntityTypePackage_ActivityPointTypes(), "package", null, 1, 1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointType_SubTypes(), this.getActivityPointType(), this.getActivityPointType_SuperType(), "subTypes", null, 0, -1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointType_SuperType(), this.getActivityPointType(), this.getActivityPointType_SubTypes(), "superType", null, 0, 1, ActivityPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localizableTypeEClass, LocalizableType.class, "LocalizableType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalizableType_LocationType(), this.getLocationType(), null, "locationType", null, 1, 1, LocalizableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //TypePackageImpl
