/**
 */
package data.instantiation.impl;

import data.DataPackage;

import data.action.ActionPackage;

import data.action.impl.ActionPackageImpl;

import data.event.EventPackage;

import data.event.impl.EventPackageImpl;

import data.impl.DataPackageImpl;

import data.instance.InstancePackage;

import data.instance.impl.InstancePackageImpl;

import data.instantiation.AbstractDataInstantiation;
import data.instantiation.AddressInstantiation;
import data.instantiation.AddressSpaceInstantiation;
import data.instantiation.DataInstantiation;
import data.instantiation.DataInstantiationHierarchy;
import data.instantiation.DataInstantiationReference;
import data.instantiation.InstantiationFactory;
import data.instantiation.InstantiationPackage;

import data.pattern.PatternPackage;

import data.pattern.impl.PatternPackageImpl;

import data.type.TypePackage;

import data.type.impl.TypePackageImpl;

import data.variable.VariablePackage;

import data.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class InstantiationPackageImpl extends EPackageImpl implements InstantiationPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDataInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInstantiationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInstantiationReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressSpaceInstantiationEClass = null;

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
     * @see data.instantiation.InstantiationPackage#eNS_URI
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
        RulePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theInstantiationPackage.createPackageContents();
        theDataPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theInstantiationPackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

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
    public EClass getAddressInstantiation() {
        return addressInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressInstantiation_Type() {
        return (EReference)addressInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInstantiation() {
        return dataInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInstantiation_Name() {
        return (EAttribute)dataInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInstantiation_Instances() {
        return (EReference)dataInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInstantiation_Array() {
        return (EAttribute)dataInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInstantiation_Description() {
        return (EAttribute)dataInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInstantiation_Patterns() {
        return (EReference)dataInstantiationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDataInstantiation() {
        return abstractDataInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataInstantiation_ContainedDataSet() {
        return (EReference)abstractDataInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataInstantiation_Type() {
        return (EReference)abstractDataInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInstantiationHierarchy() {
        return dataInstantiationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInstantiationHierarchy_Root() {
        return (EReference)dataInstantiationHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInstantiationReference() {
        return dataInstantiationReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInstantiationReference_Instantiation() {
        return (EReference)dataInstantiationReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInstantiationReference_Child() {
        return (EReference)dataInstantiationReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAddressSpaceInstantiation() {
        return addressSpaceInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressSpaceInstantiation_Type() {
        return (EReference)addressSpaceInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAddressSpaceInstantiation_Instances() {
        return (EReference)addressSpaceInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAddressSpaceInstantiation_Name() {
        return (EAttribute)addressSpaceInstantiationEClass.getEStructuralFeatures().get(2);
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
        addressInstantiationEClass = createEClass(ADDRESS_INSTANTIATION);
        createEReference(addressInstantiationEClass, ADDRESS_INSTANTIATION__TYPE);

        dataInstantiationEClass = createEClass(DATA_INSTANTIATION);
        createEAttribute(dataInstantiationEClass, DATA_INSTANTIATION__NAME);
        createEReference(dataInstantiationEClass, DATA_INSTANTIATION__INSTANCES);
        createEAttribute(dataInstantiationEClass, DATA_INSTANTIATION__ARRAY);
        createEAttribute(dataInstantiationEClass, DATA_INSTANTIATION__DESCRIPTION);
        createEReference(dataInstantiationEClass, DATA_INSTANTIATION__PATTERNS);

        abstractDataInstantiationEClass = createEClass(ABSTRACT_DATA_INSTANTIATION);
        createEReference(abstractDataInstantiationEClass, ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET);
        createEReference(abstractDataInstantiationEClass, ABSTRACT_DATA_INSTANTIATION__TYPE);

        dataInstantiationHierarchyEClass = createEClass(DATA_INSTANTIATION_HIERARCHY);
        createEReference(dataInstantiationHierarchyEClass, DATA_INSTANTIATION_HIERARCHY__ROOT);

        dataInstantiationReferenceEClass = createEClass(DATA_INSTANTIATION_REFERENCE);
        createEReference(dataInstantiationReferenceEClass, DATA_INSTANTIATION_REFERENCE__INSTANTIATION);
        createEReference(dataInstantiationReferenceEClass, DATA_INSTANTIATION_REFERENCE__CHILD);

        addressSpaceInstantiationEClass = createEClass(ADDRESS_SPACE_INSTANTIATION);
        createEReference(addressSpaceInstantiationEClass, ADDRESS_SPACE_INSTANTIATION__TYPE);
        createEReference(addressSpaceInstantiationEClass, ADDRESS_SPACE_INSTANTIATION__INSTANCES);
        createEAttribute(addressSpaceInstantiationEClass, ADDRESS_SPACE_INSTANTIATION__NAME);
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
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataInstantiationEClass.getESuperTypes().add(this.getAbstractDataInstantiation());
        abstractDataInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        dataInstantiationHierarchyEClass.getESuperTypes().add(theModelsPackage.getInstantiationHierarchy());
        dataInstantiationReferenceEClass.getESuperTypes().add(theModelsPackage.getInstantiationReference());
        addressSpaceInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(addressInstantiationEClass, AddressInstantiation.class, "AddressInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddressInstantiation_Type(), theTypePackage.getAddressType(), theTypePackage.getAddressType_Instantiations(), "type", null, 1, 1, AddressInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataInstantiationEClass, DataInstantiation.class, "DataInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataInstantiation_Instances(), theInstancePackage.getData(), theInstancePackage.getData_Instantiation(), "instances", null, 0, -1, DataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataInstantiation_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, DataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataInstantiation_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataInstantiation_Patterns(), thePatternPackage.getDataPattern(), thePatternPackage.getDataPattern_Instantiation(), "patterns", null, 0, -1, DataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractDataInstantiationEClass, AbstractDataInstantiation.class, "AbstractDataInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractDataInstantiation_ContainedDataSet(), theInstancePackage.getDataSet(), null, "containedDataSet", null, 0, 1, AbstractDataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDataInstantiation_Type(), theTypePackage.getDataType(), theTypePackage.getDataType_Instantiations(), "type", null, 0, 1, AbstractDataInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataInstantiationHierarchyEClass, DataInstantiationHierarchy.class, "DataInstantiationHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataInstantiationHierarchy_Root(), this.getDataInstantiationReference(), null, "root", null, 1, 1, DataInstantiationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataInstantiationReferenceEClass, DataInstantiationReference.class, "DataInstantiationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataInstantiationReference_Instantiation(), this.getDataInstantiation(), null, "instantiation", null, 0, 1, DataInstantiationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataInstantiationReference_Child(), this.getDataInstantiationReference(), null, "child", null, 0, 1, DataInstantiationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(addressSpaceInstantiationEClass, AddressSpaceInstantiation.class, "AddressSpaceInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddressSpaceInstantiation_Type(), theTypePackage.getAddressSpaceType(), theTypePackage.getAddressSpaceType_Instantiations(), "type", null, 1, 1, AddressSpaceInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAddressSpaceInstantiation_Instances(), theInstancePackage.getAdressSpace(), theInstancePackage.getAdressSpace_Instantiation(), "instances", null, 0, -1, AddressSpaceInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAddressSpaceInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, AddressSpaceInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //InstantiationPackageImpl
