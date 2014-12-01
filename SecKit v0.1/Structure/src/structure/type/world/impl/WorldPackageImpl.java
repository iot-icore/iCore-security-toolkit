/**
 */
package structure.type.world.impl;

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

import structure.type.TypePackage;

import structure.type.impl.TypePackageImpl;

import structure.type.world.Administrator;
import structure.type.world.Building;
import structure.type.world.ContainedTypeRole;
import structure.type.world.DeviceType;
import structure.type.world.InformationSystem;
import structure.type.world.IntangibleEntity;
import structure.type.world.Level;
import structure.type.world.Owner;
import structure.type.world.Person;
import structure.type.world.PhysicalContainerEntity;
import structure.type.world.PointEntity;
import structure.type.world.Room;
import structure.type.world.ServiceAssembly;
import structure.type.world.SoftwareEntity;
import structure.type.world.Stakeholder;
import structure.type.world.TangibleEntity;
import structure.type.world.WorldFactory;
import structure.type.world.WorldPackage;

import structure.variable.VariablePackage;

import structure.variable.impl.VariablePackageImpl;

import trust.TrustPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldPackageImpl extends EPackageImpl implements WorldPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceAssemblyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass buildingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roomEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intangibleEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tangibleEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pointEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalContainerEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass levelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deviceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass informationSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass administratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stakeholderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containedTypeRoleEClass = null;

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
     * @see structure.type.world.WorldPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private WorldPackageImpl() {
        super(eNS_URI, WorldFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link WorldPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static WorldPackage init() {
        if (isInited) return (WorldPackage)EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI);

        // Obtain or create and register package
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorldPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theWorldPackage.createPackageContents();
        theStructurePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theWorldPackage.initializePackageContents();
        theStructurePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theWorldPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(WorldPackage.eNS_URI, theWorldPackage);
        return theWorldPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceAssembly() {
        return serviceAssemblyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerson() {
        return personEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBuilding() {
        return buildingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoom() {
        return roomEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftwareEntity() {
        return softwareEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntangibleEntity() {
        return intangibleEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTangibleEntity() {
        return tangibleEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPointEntity() {
        return pointEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysicalContainerEntity() {
        return physicalContainerEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLevel() {
        return levelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeviceType() {
        return deviceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInformationSystem() {
        return informationSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdministrator() {
        return administratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStakeholder() {
        return stakeholderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwner() {
        return ownerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainedTypeRole() {
        return containedTypeRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainedTypeRole_Levels() {
        return (EReference)containedTypeRoleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainedTypeRole_Rooms() {
        return (EReference)containedTypeRoleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainedTypeRole_Role() {
        return (EAttribute)containedTypeRoleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorldFactory getWorldFactory() {
        return (WorldFactory)getEFactoryInstance();
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
        serviceAssemblyEClass = createEClass(SERVICE_ASSEMBLY);

        personEClass = createEClass(PERSON);

        buildingEClass = createEClass(BUILDING);

        roomEClass = createEClass(ROOM);

        softwareEntityEClass = createEClass(SOFTWARE_ENTITY);

        intangibleEntityEClass = createEClass(INTANGIBLE_ENTITY);

        tangibleEntityEClass = createEClass(TANGIBLE_ENTITY);

        pointEntityEClass = createEClass(POINT_ENTITY);

        physicalContainerEntityEClass = createEClass(PHYSICAL_CONTAINER_ENTITY);

        levelEClass = createEClass(LEVEL);

        deviceTypeEClass = createEClass(DEVICE_TYPE);

        informationSystemEClass = createEClass(INFORMATION_SYSTEM);

        administratorEClass = createEClass(ADMINISTRATOR);

        stakeholderEClass = createEClass(STAKEHOLDER);

        ownerEClass = createEClass(OWNER);

        containedTypeRoleEClass = createEClass(CONTAINED_TYPE_ROLE);
        createEReference(containedTypeRoleEClass, CONTAINED_TYPE_ROLE__LEVELS);
        createEReference(containedTypeRoleEClass, CONTAINED_TYPE_ROLE__ROOMS);
        createEAttribute(containedTypeRoleEClass, CONTAINED_TYPE_ROLE__ROLE);
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
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        serviceAssemblyEClass.getESuperTypes().add(this.getSoftwareEntity());
        personEClass.getESuperTypes().add(this.getPointEntity());
        buildingEClass.getESuperTypes().add(this.getPhysicalContainerEntity());
        roomEClass.getESuperTypes().add(this.getPhysicalContainerEntity());
        softwareEntityEClass.getESuperTypes().add(this.getIntangibleEntity());
        intangibleEntityEClass.getESuperTypes().add(theTypePackage.getEntityType());
        tangibleEntityEClass.getESuperTypes().add(theTypePackage.getEntityType());
        pointEntityEClass.getESuperTypes().add(this.getTangibleEntity());
        physicalContainerEntityEClass.getESuperTypes().add(this.getTangibleEntity());
        levelEClass.getESuperTypes().add(this.getPhysicalContainerEntity());
        deviceTypeEClass.getESuperTypes().add(this.getPointEntity());
        informationSystemEClass.getESuperTypes().add(this.getIntangibleEntity());

        // Initialize classes, features, and operations; add parameters
        initEClass(serviceAssemblyEClass, ServiceAssembly.class, "ServiceAssembly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(buildingEClass, Building.class, "Building", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(softwareEntityEClass, SoftwareEntity.class, "SoftwareEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intangibleEntityEClass, IntangibleEntity.class, "IntangibleEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tangibleEntityEClass, TangibleEntity.class, "TangibleEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(pointEntityEClass, PointEntity.class, "PointEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(physicalContainerEntityEClass, PhysicalContainerEntity.class, "PhysicalContainerEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(levelEClass, Level.class, "Level", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(informationSystemEClass, InformationSystem.class, "InformationSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(administratorEClass, Administrator.class, "Administrator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ownerEClass, Owner.class, "Owner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(containedTypeRoleEClass, ContainedTypeRole.class, "ContainedTypeRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContainedTypeRole_Levels(), theInstantiationPackage.getEntityInstantiation(), null, "levels", null, 0, -1, ContainedTypeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContainedTypeRole_Rooms(), theInstantiationPackage.getEntityInstantiation(), null, "rooms", null, 0, -1, ContainedTypeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainedTypeRole_Role(), ecorePackage.getEString(), "role", null, 0, 1, ContainedTypeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //WorldPackageImpl
