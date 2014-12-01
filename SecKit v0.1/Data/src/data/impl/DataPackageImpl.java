/**
 */
package data.impl;

import data.DataDesignModel;
import data.DataFactory;
import data.DataModel;
import data.DataPackage;
import data.DataRuntimeModel;

import data.action.ActionPackage;

import data.action.impl.ActionPackageImpl;

import data.event.EventPackage;

import data.event.impl.EventPackageImpl;

import data.instance.InstancePackage;

import data.instance.impl.InstancePackageImpl;

import data.instantiation.InstantiationPackage;

import data.instantiation.impl.InstantiationPackageImpl;

import data.pattern.PatternPackage;

import data.pattern.impl.PatternPackageImpl;

import data.type.TypePackage;

import data.type.impl.TypePackageImpl;

import data.variable.VariablePackage;

import data.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataDesignModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataRuntimeModelEClass = null;

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
     * @see data.DataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DataPackageImpl() {
        super(eNS_URI, DataFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DataPackage init() {
        if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

        // Obtain or create and register package
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RulePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theDataPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theDataPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
        return theDataPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataModel() {
        return dataModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataDesignModel() {
        return dataDesignModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataDesignModel_Packages() {
        return (EReference)dataDesignModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataRuntimeModel() {
        return dataRuntimeModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataRuntimeModel_Data() {
        return (EReference)dataRuntimeModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataFactory getDataFactory() {
        return (DataFactory)getEFactoryInstance();
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
        dataModelEClass = createEClass(DATA_MODEL);

        dataDesignModelEClass = createEClass(DATA_DESIGN_MODEL);
        createEReference(dataDesignModelEClass, DATA_DESIGN_MODEL__PACKAGES);

        dataRuntimeModelEClass = createEClass(DATA_RUNTIME_MODEL);
        createEReference(dataRuntimeModelEClass, DATA_RUNTIME_MODEL__DATA);
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
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
        EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
        ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theTypePackage);
        getESubpackages().add(theInstantiationPackage);
        getESubpackages().add(theInstancePackage);
        getESubpackages().add(theVariablePackage);
        getESubpackages().add(thePatternPackage);
        getESubpackages().add(theEventPackage);
        getESubpackages().add(theActionPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        dataDesignModelEClass.getESuperTypes().add(this.getDataModel());
        dataRuntimeModelEClass.getESuperTypes().add(this.getDataModel());

        // Initialize classes, features, and operations; add parameters
        initEClass(dataModelEClass, DataModel.class, "DataModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataDesignModelEClass, DataDesignModel.class, "DataDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataDesignModel_Packages(), theTypePackage.getDataTypePackage(), null, "packages", null, 0, -1, DataDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataRuntimeModelEClass, DataRuntimeModel.class, "DataRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataRuntimeModel_Data(), theInstancePackage.getData(), null, "data", null, 0, -1, DataRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DataPackageImpl
