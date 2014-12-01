/**
 */
package structure.instantiation.impl;

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

import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.ActionPointInstantiation;
import structure.instantiation.ActivityPointInstantiation;
import structure.instantiation.DelegatedInteractionPointParticipation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.EntityInstantiationHierarchy;
import structure.instantiation.EntityInstantiationReference;
import structure.instantiation.InstantiationFactory;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointInstantiation;
import structure.instantiation.InteractionPointParticipationInstantiation;
import structure.instantiation.InteractionPointParticipationOfInstantiation;
import structure.instantiation.InteractionPointParticipationOfType;
import structure.instantiation.LocalizableInstantiation;
import structure.instantiation.LocationInstantiation;

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
public class InstantiationPackageImpl extends EPackageImpl implements InstantiationPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionPointInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityPointInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointParticipationInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstantiationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstantiationReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass locationInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointParticipationOfInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionPointParticipationOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delegatedInteractionPointParticipationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractInteractionPointParticipationOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localizableInstantiationEClass = null;

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
     * @see structure.instantiation.InstantiationPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private InstantiationPackageImpl() {
        super(eNS_URI, InstantiationFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link InstantiationPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static InstantiationPackage init() {
        if (isInited) return (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);

        // Obtain or create and register package
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstantiationPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) : WorldPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theInstantiationPackage.createPackageContents();
        theStructurePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theWorldPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theInstantiationPackage.initializePackageContents();
        theStructurePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theWorldPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theInstantiationPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(InstantiationPackage.eNS_URI, theInstantiationPackage);
        return theInstantiationPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstantiation() {
        return entityInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityInstantiation_Name() {
        return (EAttribute)entityInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiation_Type() {
        return (EReference)entityInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiation_InteractionPointParticipations() {
        return (EReference)entityInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiation_Instances() {
        return (EReference)entityInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiation_Multiplicity() {
        return (EReference)entityInstantiationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiation_ContainerType() {
        return (EReference)entityInstantiationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionPointInstantiation() {
        return actionPointInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointInstantiation() {
        return interactionPointInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointInstantiation_Participations() {
        return (EReference)interactionPointInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityPointInstantiation() {
        return activityPointInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointInstantiation_Type() {
        return (EReference)activityPointInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityPointInstantiation_Name() {
        return (EAttribute)activityPointInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointInstantiation_Instances() {
        return (EReference)activityPointInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityPointInstantiation_EntityType() {
        return (EReference)activityPointInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointParticipationInstantiation() {
        return interactionPointParticipationInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationInstantiation_Instances() {
        return (EReference)interactionPointParticipationInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationInstantiation_Multiplicity() {
        return (EReference)interactionPointParticipationInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationInstantiation_ParticipationType() {
        return (EReference)interactionPointParticipationInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstantiationHierarchy() {
        return entityInstantiationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiationHierarchy_Root() {
        return (EReference)entityInstantiationHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstantiationReference() {
        return entityInstantiationReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiationReference_Instantiation() {
        return (EReference)entityInstantiationReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityInstantiationReference_Child() {
        return (EReference)entityInstantiationReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocationInstantiation() {
        return locationInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocationInstantiation_Name() {
        return (EAttribute)locationInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationInstantiation_Type() {
        return (EReference)locationInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocationInstantiation_Instances() {
        return (EReference)locationInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointParticipationOfInstantiation() {
        return interactionPointParticipationOfInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationOfInstantiation_InteractionPointType() {
        return (EReference)interactionPointParticipationOfInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationOfInstantiation_ParticipationOfType() {
        return (EReference)interactionPointParticipationOfInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationOfInstantiation_DelegatedFrom() {
        return (EReference)interactionPointParticipationOfInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationOfInstantiation_EntityInstantiation() {
        return (EReference)interactionPointParticipationOfInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionPointParticipationOfInstantiation_InteractionPoint() {
        return (EReference)interactionPointParticipationOfInstantiationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionPointParticipationOfType() {
        return interactionPointParticipationOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelegatedInteractionPointParticipation() {
        return delegatedInteractionPointParticipationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDelegatedInteractionPointParticipation_DelegatedTo() {
        return (EReference)delegatedInteractionPointParticipationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractInteractionPointParticipationOfType() {
        return abstractInteractionPointParticipationOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation() {
        return (EReference)abstractInteractionPointParticipationOfTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractInteractionPointParticipationOfType_EntityType() {
        return (EReference)abstractInteractionPointParticipationOfTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInteractionPointParticipationOfType_Name() {
        return (EAttribute)abstractInteractionPointParticipationOfTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalizableInstantiation() {
        return localizableInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocalizableInstantiation_LocationInstantiation() {
        return (EReference)localizableInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationFactory getInstantiationFactory() {
        return (InstantiationFactory)getEFactoryInstance();
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
        entityInstantiationEClass = createEClass(ENTITY_INSTANTIATION);
        createEAttribute(entityInstantiationEClass, ENTITY_INSTANTIATION__NAME);
        createEReference(entityInstantiationEClass, ENTITY_INSTANTIATION__TYPE);
        createEReference(entityInstantiationEClass, ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS);
        createEReference(entityInstantiationEClass, ENTITY_INSTANTIATION__INSTANCES);
        createEReference(entityInstantiationEClass, ENTITY_INSTANTIATION__MULTIPLICITY);
        createEReference(entityInstantiationEClass, ENTITY_INSTANTIATION__CONTAINER_TYPE);

        actionPointInstantiationEClass = createEClass(ACTION_POINT_INSTANTIATION);

        interactionPointInstantiationEClass = createEClass(INTERACTION_POINT_INSTANTIATION);
        createEReference(interactionPointInstantiationEClass, INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS);

        activityPointInstantiationEClass = createEClass(ACTIVITY_POINT_INSTANTIATION);
        createEReference(activityPointInstantiationEClass, ACTIVITY_POINT_INSTANTIATION__TYPE);
        createEAttribute(activityPointInstantiationEClass, ACTIVITY_POINT_INSTANTIATION__NAME);
        createEReference(activityPointInstantiationEClass, ACTIVITY_POINT_INSTANTIATION__INSTANCES);
        createEReference(activityPointInstantiationEClass, ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE);

        interactionPointParticipationInstantiationEClass = createEClass(INTERACTION_POINT_PARTICIPATION_INSTANTIATION);
        createEReference(interactionPointParticipationInstantiationEClass, INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES);
        createEReference(interactionPointParticipationInstantiationEClass, INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY);
        createEReference(interactionPointParticipationInstantiationEClass, INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE);

        entityInstantiationHierarchyEClass = createEClass(ENTITY_INSTANTIATION_HIERARCHY);
        createEReference(entityInstantiationHierarchyEClass, ENTITY_INSTANTIATION_HIERARCHY__ROOT);

        entityInstantiationReferenceEClass = createEClass(ENTITY_INSTANTIATION_REFERENCE);
        createEReference(entityInstantiationReferenceEClass, ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION);
        createEReference(entityInstantiationReferenceEClass, ENTITY_INSTANTIATION_REFERENCE__CHILD);

        locationInstantiationEClass = createEClass(LOCATION_INSTANTIATION);
        createEAttribute(locationInstantiationEClass, LOCATION_INSTANTIATION__NAME);
        createEReference(locationInstantiationEClass, LOCATION_INSTANTIATION__TYPE);
        createEReference(locationInstantiationEClass, LOCATION_INSTANTIATION__INSTANCES);

        interactionPointParticipationOfInstantiationEClass = createEClass(INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION);
        createEReference(interactionPointParticipationOfInstantiationEClass, INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE);
        createEReference(interactionPointParticipationOfInstantiationEClass, INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE);
        createEReference(interactionPointParticipationOfInstantiationEClass, INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM);
        createEReference(interactionPointParticipationOfInstantiationEClass, INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION);
        createEReference(interactionPointParticipationOfInstantiationEClass, INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT);

        interactionPointParticipationOfTypeEClass = createEClass(INTERACTION_POINT_PARTICIPATION_OF_TYPE);

        delegatedInteractionPointParticipationEClass = createEClass(DELEGATED_INTERACTION_POINT_PARTICIPATION);
        createEReference(delegatedInteractionPointParticipationEClass, DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO);

        abstractInteractionPointParticipationOfTypeEClass = createEClass(ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE);
        createEReference(abstractInteractionPointParticipationOfTypeEClass, ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION);
        createEReference(abstractInteractionPointParticipationOfTypeEClass, ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE);
        createEAttribute(abstractInteractionPointParticipationOfTypeEClass, ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME);

        localizableInstantiationEClass = createEClass(LOCALIZABLE_INSTANTIATION);
        createEReference(localizableInstantiationEClass, LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION);
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
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        entityInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        actionPointInstantiationEClass.getESuperTypes().add(this.getActivityPointInstantiation());
        actionPointInstantiationEClass.getESuperTypes().add(this.getLocalizableInstantiation());
        interactionPointInstantiationEClass.getESuperTypes().add(this.getActivityPointInstantiation());
        activityPointInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        entityInstantiationHierarchyEClass.getESuperTypes().add(theModelsPackage.getInstantiationHierarchy());
        entityInstantiationReferenceEClass.getESuperTypes().add(theModelsPackage.getInstantiationReference());
        locationInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        interactionPointParticipationOfInstantiationEClass.getESuperTypes().add(this.getInteractionPointParticipationInstantiation());
        interactionPointParticipationOfInstantiationEClass.getESuperTypes().add(this.getLocalizableInstantiation());
        interactionPointParticipationOfTypeEClass.getESuperTypes().add(this.getAbstractInteractionPointParticipationOfType());
        delegatedInteractionPointParticipationEClass.getESuperTypes().add(this.getAbstractInteractionPointParticipationOfType());
        abstractInteractionPointParticipationOfTypeEClass.getESuperTypes().add(this.getInteractionPointParticipationInstantiation());

        // Initialize classes, features, and operations; add parameters
        initEClass(entityInstantiationEClass, EntityInstantiation.class, "EntityInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntityInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiation_Type(), theTypePackage.getEntityType(), theTypePackage.getEntityType_Instantiations(), "type", null, 0, 1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiation_InteractionPointParticipations(), this.getInteractionPointParticipationOfInstantiation(), this.getInteractionPointParticipationOfInstantiation_EntityInstantiation(), "interactionPointParticipations", null, 0, -1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiation_Instances(), theInstancePackage.getEntity(), theInstancePackage.getEntity_Instantiation(), "instances", null, 0, -1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiation_Multiplicity(), theModelsPackage.getMultiplicity(), null, "multiplicity", null, 0, 1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiation_ContainerType(), theTypePackage.getEntityType(), theTypePackage.getEntityType_ContainedInstantiations(), "containerType", null, 0, 1, EntityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionPointInstantiationEClass, ActionPointInstantiation.class, "ActionPointInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionPointInstantiationEClass, InteractionPointInstantiation.class, "InteractionPointInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPointInstantiation_Participations(), this.getInteractionPointParticipationOfInstantiation(), this.getInteractionPointParticipationOfInstantiation_InteractionPoint(), "participations", null, 2, -1, InteractionPointInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityPointInstantiationEClass, ActivityPointInstantiation.class, "ActivityPointInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActivityPointInstantiation_Type(), theTypePackage.getActivityPointType(), theTypePackage.getActivityPointType_Instantiations(), "type", null, 1, 1, ActivityPointInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityPointInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityPointInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointInstantiation_Instances(), theInstancePackage.getActivityPoint(), theInstancePackage.getActivityPoint_Instantiation(), "instances", null, 0, -1, ActivityPointInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityPointInstantiation_EntityType(), theTypePackage.getEntityType(), theTypePackage.getEntityType_ActivityPoints(), "entityType", null, 1, 1, ActivityPointInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionPointParticipationInstantiationEClass, InteractionPointParticipationInstantiation.class, "InteractionPointParticipationInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPointParticipationInstantiation_Instances(), theInstancePackage.getInteractionPointParticipation(), theInstancePackage.getInteractionPointParticipation_Instantiation(), "instances", null, 0, -1, InteractionPointParticipationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationInstantiation_Multiplicity(), theModelsPackage.getMultiplicity(), null, "multiplicity", null, 0, 1, InteractionPointParticipationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationInstantiation_ParticipationType(), theTypePackage.getInteractionPointParticipationType(), theTypePackage.getInteractionPointParticipationType_Instantiations(), "participationType", null, 1, 1, InteractionPointParticipationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityInstantiationHierarchyEClass, EntityInstantiationHierarchy.class, "EntityInstantiationHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityInstantiationHierarchy_Root(), this.getEntityInstantiationReference(), null, "root", null, 1, 1, EntityInstantiationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityInstantiationReferenceEClass, EntityInstantiationReference.class, "EntityInstantiationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityInstantiationReference_Instantiation(), this.getEntityInstantiation(), null, "instantiation", null, 1, 1, EntityInstantiationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityInstantiationReference_Child(), this.getEntityInstantiationReference(), null, "child", null, 0, 1, EntityInstantiationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(locationInstantiationEClass, LocationInstantiation.class, "LocationInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocationInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, LocationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocationInstantiation_Type(), theTypePackage.getLocationType(), theTypePackage.getLocationType_Instantiations(), "type", null, 1, 1, LocationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocationInstantiation_Instances(), theInstancePackage.getLocation(), theInstancePackage.getLocation_Instantiation(), "instances", null, 0, -1, LocationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionPointParticipationOfInstantiationEClass, InteractionPointParticipationOfInstantiation.class, "InteractionPointParticipationOfInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionPointParticipationOfInstantiation_InteractionPointType(), theTypePackage.getInteractionPointType(), theTypePackage.getInteractionPointType_Participations(), "interactionPointType", null, 0, 1, InteractionPointParticipationOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationOfInstantiation_ParticipationOfType(), this.getAbstractInteractionPointParticipationOfType(), this.getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation(), "participationOfType", null, 0, 1, InteractionPointParticipationOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationOfInstantiation_DelegatedFrom(), this.getDelegatedInteractionPointParticipation(), this.getDelegatedInteractionPointParticipation_DelegatedTo(), "delegatedFrom", null, 0, 1, InteractionPointParticipationOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationOfInstantiation_EntityInstantiation(), this.getEntityInstantiation(), this.getEntityInstantiation_InteractionPointParticipations(), "entityInstantiation", null, 1, 1, InteractionPointParticipationOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionPointParticipationOfInstantiation_InteractionPoint(), this.getInteractionPointInstantiation(), this.getInteractionPointInstantiation_Participations(), "interactionPoint", null, 0, 1, InteractionPointParticipationOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionPointParticipationOfTypeEClass, InteractionPointParticipationOfType.class, "InteractionPointParticipationOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(delegatedInteractionPointParticipationEClass, DelegatedInteractionPointParticipation.class, "DelegatedInteractionPointParticipation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDelegatedInteractionPointParticipation_DelegatedTo(), this.getInteractionPointParticipationOfInstantiation(), this.getInteractionPointParticipationOfInstantiation_DelegatedFrom(), "delegatedTo", null, 0, -1, DelegatedInteractionPointParticipation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractInteractionPointParticipationOfTypeEClass, AbstractInteractionPointParticipationOfType.class, "AbstractInteractionPointParticipationOfType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation(), this.getInteractionPointParticipationOfInstantiation(), this.getInteractionPointParticipationOfInstantiation_ParticipationOfType(), "participationOfInstantiation", null, 0, -1, AbstractInteractionPointParticipationOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractInteractionPointParticipationOfType_EntityType(), theTypePackage.getEntityType(), theTypePackage.getEntityType_InteractionPointParticipations(), "entityType", null, 0, 1, AbstractInteractionPointParticipationOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInteractionPointParticipationOfType_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractInteractionPointParticipationOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localizableInstantiationEClass, LocalizableInstantiation.class, "LocalizableInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalizableInstantiation_LocationInstantiation(), this.getLocationInstantiation(), null, "locationInstantiation", null, 0, 1, LocalizableInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //InstantiationPackageImpl
