/**
 */
package identity.impl;

import data.DataPackage;

import identity.IdentityAttributeVariable;
import identity.IdentityDesignModel;
import identity.IdentityFactory;
import identity.IdentityInstanceVariable;
import identity.IdentityPackage;
import identity.IdentityRuntimeModel;
import identity.IdentityVariable;

import identity.action.ActionPackage;

import identity.action.impl.ActionPackageImpl;

import identity.component.ComponentPackage;

import identity.component.impl.ComponentPackageImpl;

import identity.instance.InstancePackage;

import identity.instance.impl.InstancePackageImpl;

import identity.instantiation.InstantiationPackage;

import identity.instantiation.impl.InstantiationPackageImpl;

import identity.pattern.PatternPackage;

import identity.pattern.impl.PatternPackageImpl;

import identity.type.TypePackage;

import identity.type.impl.TypePackageImpl;

import models.ModelsPackage;

import models.variable.VariablePackage;

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
public class IdentityPackageImpl extends EPackageImpl implements IdentityPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityDesignModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityRuntimeModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAttributeVariableEClass = null;

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
     * @see identity.IdentityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private IdentityPackageImpl() {
        super(eNS_URI, IdentityFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link IdentityPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static IdentityPackage init() {
        if (isInited) return (IdentityPackage)EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI);

        // Obtain or create and register package
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdentityPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theIdentityPackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theIdentityPackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theIdentityPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(IdentityPackage.eNS_URI, theIdentityPackage);
        return theIdentityPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityDesignModel() {
        return identityDesignModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityDesignModel_Packages() {
        return (EReference)identityDesignModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityRuntimeModel() {
        return identityRuntimeModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRuntimeModel_IdentityRealms() {
        return (EReference)identityRuntimeModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRuntimeModel_VerificationMethods() {
        return (EReference)identityRuntimeModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRuntimeModel_Identities() {
        return (EReference)identityRuntimeModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityVariable() {
        return identityVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityInstanceVariable() {
        return identityInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAttributeVariable() {
        return identityAttributeVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityFactory getIdentityFactory() {
        return (IdentityFactory)getEFactoryInstance();
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
        identityDesignModelEClass = createEClass(IDENTITY_DESIGN_MODEL);
        createEReference(identityDesignModelEClass, IDENTITY_DESIGN_MODEL__PACKAGES);

        identityRuntimeModelEClass = createEClass(IDENTITY_RUNTIME_MODEL);
        createEReference(identityRuntimeModelEClass, IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS);
        createEReference(identityRuntimeModelEClass, IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS);
        createEReference(identityRuntimeModelEClass, IDENTITY_RUNTIME_MODEL__IDENTITIES);

        identityVariableEClass = createEClass(IDENTITY_VARIABLE);

        identityInstanceVariableEClass = createEClass(IDENTITY_INSTANCE_VARIABLE);

        identityAttributeVariableEClass = createEClass(IDENTITY_ATTRIBUTE_VARIABLE);
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
        ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
        ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theComponentPackage);
        getESubpackages().add(theTypePackage);
        getESubpackages().add(theInstancePackage);
        getESubpackages().add(theInstantiationPackage);
        getESubpackages().add(thePatternPackage);
        getESubpackages().add(theActionPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        identityDesignModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        identityRuntimeModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        identityVariableEClass.getESuperTypes().add(theVariablePackage.getVariableDeclaration());
        identityInstanceVariableEClass.getESuperTypes().add(this.getIdentityVariable());
        identityAttributeVariableEClass.getESuperTypes().add(this.getIdentityVariable());

        // Initialize classes, features, and operations; add parameters
        initEClass(identityDesignModelEClass, IdentityDesignModel.class, "IdentityDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityDesignModel_Packages(), theTypePackage.getIdentityTypePackage(), theTypePackage.getIdentityTypePackage_Model(), "packages", null, 0, -1, IdentityDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityRuntimeModelEClass, IdentityRuntimeModel.class, "IdentityRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityRuntimeModel_IdentityRealms(), theInstancePackage.getIdentityRealm(), null, "identityRealms", null, 0, -1, IdentityRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityRuntimeModel_VerificationMethods(), theTypePackage.getAttributeVerificationMethod(), null, "verificationMethods", null, 0, -1, IdentityRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityRuntimeModel_Identities(), theInstancePackage.getAbstractIdentity(), null, "identities", null, 0, -1, IdentityRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityVariableEClass, IdentityVariable.class, "IdentityVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityInstanceVariableEClass, IdentityInstanceVariable.class, "IdentityInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityAttributeVariableEClass, IdentityAttributeVariable.class, "IdentityAttributeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //IdentityPackageImpl
