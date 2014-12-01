/**
 */
package structure.variable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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

import structure.type.world.WorldPackage;

import structure.type.world.impl.WorldPackageImpl;

import structure.variable.EntityInstanceVariable;
import structure.variable.EntityInstantiationHierarchyVariable;
import structure.variable.EntityInstantiationVariable;
import structure.variable.EntityTypeVariable;
import structure.variable.EntityVariable;
import structure.variable.VariableFactory;
import structure.variable.VariablePackage;

import trust.TrustPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariablePackageImpl extends EPackageImpl implements VariablePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityTypeVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstantiationVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityInstantiationHierarchyVariableEClass = null;

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
     * @see structure.variable.VariablePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VariablePackageImpl() {
        super(eNS_URI, VariableFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VariablePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VariablePackage init() {
        if (isInited) return (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

        // Obtain or create and register package
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariablePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) : WorldPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theVariablePackage.createPackageContents();
        theStructurePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theWorldPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theVariablePackage.initializePackageContents();
        theStructurePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theWorldPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theVariablePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VariablePackage.eNS_URI, theVariablePackage);
        return theVariablePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityTypeVariable() {
        return entityTypeVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstantiationVariable() {
        return entityInstantiationVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstanceVariable() {
        return entityInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityVariable() {
        return entityVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityInstantiationHierarchyVariable() {
        return entityInstantiationHierarchyVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableFactory getVariableFactory() {
        return (VariableFactory)getEFactoryInstance();
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
        entityTypeVariableEClass = createEClass(ENTITY_TYPE_VARIABLE);

        entityInstantiationVariableEClass = createEClass(ENTITY_INSTANTIATION_VARIABLE);

        entityInstanceVariableEClass = createEClass(ENTITY_INSTANCE_VARIABLE);

        entityVariableEClass = createEClass(ENTITY_VARIABLE);

        entityInstantiationHierarchyVariableEClass = createEClass(ENTITY_INSTANTIATION_HIERARCHY_VARIABLE);
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
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        entityTypeVariableEClass.getESuperTypes().add(this.getEntityVariable());
        entityInstantiationVariableEClass.getESuperTypes().add(this.getEntityVariable());
        entityInstanceVariableEClass.getESuperTypes().add(this.getEntityVariable());
        entityVariableEClass.getESuperTypes().add(theVariablePackage_1.getVariableDeclaration());
        entityInstantiationHierarchyVariableEClass.getESuperTypes().add(this.getEntityVariable());

        // Initialize classes, features, and operations; add parameters
        initEClass(entityTypeVariableEClass, EntityTypeVariable.class, "EntityTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entityInstantiationVariableEClass, EntityInstantiationVariable.class, "EntityInstantiationVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entityInstanceVariableEClass, EntityInstanceVariable.class, "EntityInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entityVariableEClass, EntityVariable.class, "EntityVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entityInstantiationHierarchyVariableEClass, EntityInstantiationHierarchyVariable.class, "EntityInstantiationHierarchyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //VariablePackageImpl
