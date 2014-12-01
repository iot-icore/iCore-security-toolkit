/**
 */
package structure.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import role.RolePackage;

import structure.StructuralDesignModel;
import structure.StructuralRuntimeModel;
import structure.StructureFactory;
import structure.StructurePackage;

import structure.address.AddressPackage;

import structure.address.impl.AddressPackageImpl;

import structure.event.EventPackage;

import structure.event.impl.EventPackageImpl;

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

import structure.variable.VariablePackage;

import structure.variable.impl.VariablePackageImpl;

import trust.TrustPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralDesignModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralRuntimeModelEClass = null;

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
     * @see structure.StructurePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StructurePackageImpl() {
        super(eNS_URI, StructureFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StructurePackage init() {
        if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

        // Obtain or create and register package
        StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructurePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RolePackage.eINSTANCE.eClass();
        TrustPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        WorldPackageImpl theWorldPackage = (WorldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) instanceof WorldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorldPackage.eNS_URI) : WorldPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage_1 = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI) : structure.trust.TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theStructurePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theWorldPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theTrustPackage_1.createPackageContents();

        // Initialize created meta-data
        theStructurePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theWorldPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theTrustPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStructurePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
        return theStructurePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralDesignModel() {
        return structuralDesignModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralDesignModel_EntityTypePackages() {
        return (EReference)structuralDesignModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralDesignModel_AllowedEntityInstantiations() {
        return (EReference)structuralDesignModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralRuntimeModel() {
        return structuralRuntimeModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuralRuntimeModel_Entities() {
        return (EReference)structuralRuntimeModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructureFactory getStructureFactory() {
        return (StructureFactory)getEFactoryInstance();
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
        structuralDesignModelEClass = createEClass(STRUCTURAL_DESIGN_MODEL);
        createEReference(structuralDesignModelEClass, STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES);
        createEReference(structuralDesignModelEClass, STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS);

        structuralRuntimeModelEClass = createEClass(STRUCTURAL_RUNTIME_MODEL);
        createEReference(structuralRuntimeModelEClass, STRUCTURAL_RUNTIME_MODEL__ENTITIES);
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
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
        AddressPackage theAddressPackage = (AddressPackage)EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI);
        EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
        structure.trust.TrustPackage theTrustPackage_1 = (structure.trust.TrustPackage)EPackage.Registry.INSTANCE.getEPackage(structure.trust.TrustPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theTypePackage);
        getESubpackages().add(theInstancePackage);
        getESubpackages().add(theInstantiationPackage);
        getESubpackages().add(theVariablePackage);
        getESubpackages().add(thePatternPackage);
        getESubpackages().add(theAddressPackage);
        getESubpackages().add(theEventPackage);
        getESubpackages().add(theTrustPackage_1);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        structuralDesignModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        structuralRuntimeModelEClass.getESuperTypes().add(theModelsPackage.getModel());

        // Initialize classes, features, and operations; add parameters
        initEClass(structuralDesignModelEClass, StructuralDesignModel.class, "StructuralDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuralDesignModel_EntityTypePackages(), theTypePackage.getEntityTypePackage(), theTypePackage.getEntityTypePackage_Model(), "entityTypePackages", null, 0, -1, StructuralDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStructuralDesignModel_AllowedEntityInstantiations(), theInstantiationPackage.getEntityInstantiation(), null, "allowedEntityInstantiations", null, 0, -1, StructuralDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(structuralRuntimeModelEClass, StructuralRuntimeModel.class, "StructuralRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuralRuntimeModel_Entities(), theInstancePackage.getEntity(), null, "entities", null, 0, -1, StructuralRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //StructurePackageImpl
