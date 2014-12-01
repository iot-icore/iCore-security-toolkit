/**
 */
package structure.instance.impl;

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

import structure.instance.ActionPoint;
import structure.instance.ActivityPoint;
import structure.instance.Entity;
import structure.instance.EntityInstanceHiearchy;
import structure.instance.EntityInstanceReference;
import structure.instance.EntityInstanceStaticReference;
import structure.instance.EntityInstanceVariableReference;
import structure.instance.InstanceFactory;
import structure.instance.InstancePackage;
import structure.instance.InteractionPoint;
import structure.instance.InteractionPointParticipation;
import structure.instance.LocalizableInstance;
import structure.instance.Location;

import structure.instantiation.InstantiationPackage;

import structure.instantiation.impl.InstantiationPackageImpl;

import structure.pattern.PatternPackage;

import structure.pattern.impl.PatternPackageImpl;

import structure.trust.impl.TrustPackageImpl;

import structure.type.TypePackage;

import structure.type.impl.TypePackageImpl;

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
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointParticipationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstanceHiearchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstanceReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstanceStaticReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstanceVariableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localizableInstanceEClass = null;

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
     * @see structure.instance.InstancePackage#eNS_URI
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
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) : WorldPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theInstancePackage.createPackageContents();
        theStructurePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theWorldPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theInstancePackage.initializePackageContents();
        theStructurePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theWorldPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

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
    public EClass getEntity() {
        return entityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntity_ContainerEntity() {
        return (EReference)entityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntity_ContainedEntities() {
        return (EReference)entityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntity_Instantiation() {
        return (EReference)entityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntity_ActivityPoints() {
        return (EReference)entityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntity_InteractionPointParticipations() {
        return (EReference)entityEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocation() {
        return locationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocation_Instantiation() {
        return (EReference)locationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocation_Name() {
        return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointParticipation() {
        return interactionPointParticipationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipation_Instantiation() {
        return (EReference)interactionPointParticipationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityPoint() {
        return activityPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPoint_Instantiation() {
        return (EReference)activityPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPoint_Type() {
        return (EReference)activityPointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityPoint_Name() {
        return (EAttribute)activityPointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionPoint() {
        return actionPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPoint() {
        return interactionPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPoint_Participations() {
        return (EReference)interactionPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstanceHiearchy() {
        return entityInstanceHiearchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstanceHiearchy_Root() {
        return (EReference)entityInstanceHiearchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstanceReference() {
        return entityInstanceReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstanceReference_Child() {
        return (EReference)entityInstanceReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstanceStaticReference() {
        return entityInstanceStaticReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstanceVariableReference() {
        return entityInstanceVariableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalizableInstance() {
        return localizableInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocalizableInstance_LocationInstance() {
        return (EReference)localizableInstanceEClass.getEStructuralFeatures().get(0);
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
        entityEClass = createEClass(ENTITY);
        createEReference(entityEClass, ENTITY__CONTAINER_ENTITY);
        createEReference(entityEClass, ENTITY__CONTAINED_ENTITIES);
        createEReference(entityEClass, ENTITY__INSTANTIATION);
        createEReference(entityEClass, ENTITY__ACTIVITY_POINTS);
        createEReference(entityEClass, ENTITY__INTERACTION_POINT_PARTICIPATIONS);

        locationEClass = createEClass(LOCATION);
        createEReference(locationEClass, LOCATION__INSTANTIATION);
        createEAttribute(locationEClass, LOCATION__NAME);

        interactionPointParticipationEClass = createEClass(INTERACTION_POINT_PARTICIPATION);
        createEReference(interactionPointParticipationEClass, INTERACTION_POINT_PARTICIPATION__INSTANTIATION);

        activityPointEClass = createEClass(ACTIVITY_POINT);
        createEReference(activityPointEClass, ACTIVITY_POINT__INSTANTIATION);
        createEReference(activityPointEClass, ACTIVITY_POINT__TYPE);
        createEAttribute(activityPointEClass, ACTIVITY_POINT__NAME);

        actionPointEClass = createEClass(ACTION_POINT);

        interactionPointEClass = createEClass(INTERACTION_POINT);
        createEReference(interactionPointEClass, INTERACTION_POINT__PARTICIPATIONS);

        entityInstanceHiearchyEClass = createEClass(ENTITY_INSTANCE_HIEARCHY);
        createEReference(entityInstanceHiearchyEClass, ENTITY_INSTANCE_HIEARCHY__ROOT);

        entityInstanceReferenceEClass = createEClass(ENTITY_INSTANCE_REFERENCE);
        createEReference(entityInstanceReferenceEClass, ENTITY_INSTANCE_REFERENCE__CHILD);

        entityInstanceStaticReferenceEClass = createEClass(ENTITY_INSTANCE_STATIC_REFERENCE);

        entityInstanceVariableReferenceEClass = createEClass(ENTITY_INSTANCE_VARIABLE_REFERENCE);

        localizableInstanceEClass = createEClass(LOCALIZABLE_INSTANCE);
        createEReference(localizableInstanceEClass, LOCALIZABLE_INSTANCE__LOCATION_INSTANCE);
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
        identity.instance.InstancePackage theInstancePackage_1 = (identity.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(identity.instance.InstancePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        entityEClass.getESuperTypes().add(theModelsPackage.getElement());
        entityEClass.getESuperTypes().add(theInstancePackage_1.getIdentityOwner());
        locationEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationEClass.getESuperTypes().add(this.getLocalizableInstance());
        activityPointEClass.getESuperTypes().add(theModelsPackage.getElement());
        actionPointEClass.getESuperTypes().add(this.getActivityPoint());
        actionPointEClass.getESuperTypes().add(this.getLocalizableInstance());
        interactionPointEClass.getESuperTypes().add(this.getActivityPoint());
        entityInstanceHiearchyEClass.getESuperTypes().add(theModelsPackage.getInstanceHiearchy());
        entityInstanceStaticReferenceEClass.getESuperTypes().add(this.getEntityInstanceReference());
        entityInstanceVariableReferenceEClass.getESuperTypes().add(this.getEntityInstanceReference());

        // Initialize classes, features, and operations; add parameters
        initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntity_ContainerEntity(), this.getEntity(), this.getEntity_ContainedEntities(), "containerEntity", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_ContainedEntities(), this.getEntity(), this.getEntity_ContainerEntity(), "containedEntities", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_Instantiation(), theInstantiationPackage.getEntityInstantiation(), theInstantiationPackage.getEntityInstantiation_Instances(), "instantiation", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_ActivityPoints(), this.getActivityPoint(), null, "activityPoints", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_InteractionPointParticipations(), this.getInteractionPointParticipation(), null, "interactionPointParticipations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocation_Instantiation(), theInstantiationPackage.getLocationInstantiation(), theInstantiationPackage.getLocationInstantiation_Instances(), "instantiation", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionPointParticipationEClass, InteractionPointParticipation.class, "InteractionPointParticipation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPointParticipation_Instantiation(), theInstantiationPackage.getInteractionPointParticipationInstantiation(), theInstantiationPackage.getInteractionPointParticipationInstantiation_Instances(), "instantiation", null, 1, 1, InteractionPointParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityPointEClass, ActivityPoint.class, "ActivityPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActivityPoint_Instantiation(), theInstantiationPackage.getActivityPointInstantiation(), theInstantiationPackage.getActivityPointInstantiation_Instances(), "instantiation", null, 0, 1, ActivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPoint_Type(), theTypePackage.getActivityPointType(), theTypePackage.getActivityPointType_Instances(), "type", null, 1, 1, ActivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionPointEClass, ActionPoint.class, "ActionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionPointEClass, InteractionPoint.class, "InteractionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPoint_Participations(), this.getInteractionPointParticipation(), null, "participations", null, 2, -1, InteractionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityInstanceHiearchyEClass, EntityInstanceHiearchy.class, "EntityInstanceHiearchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityInstanceHiearchy_Root(), this.getEntityInstanceReference(), null, "root", null, 1, 1, EntityInstanceHiearchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityInstanceReferenceEClass, EntityInstanceReference.class, "EntityInstanceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityInstanceReference_Child(), this.getEntityInstanceReference(), null, "child", null, 0, 1, EntityInstanceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityInstanceStaticReferenceEClass, EntityInstanceStaticReference.class, "EntityInstanceStaticReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entityInstanceVariableReferenceEClass, EntityInstanceVariableReference.class, "EntityInstanceVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(localizableInstanceEClass, LocalizableInstance.class, "LocalizableInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalizableInstance_LocationInstance(), this.getLocation(), null, "locationInstance", null, 0, 1, LocalizableInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //InstancePackageImpl
