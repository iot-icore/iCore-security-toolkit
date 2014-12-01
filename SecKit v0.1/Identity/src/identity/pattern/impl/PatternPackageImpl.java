/**
 */
package identity.pattern.impl;

import data.DataPackage;

import identity.IdentityPackage;

import identity.action.ActionPackage;

import identity.action.impl.ActionPackageImpl;

import identity.component.ComponentPackage;

import identity.component.impl.ComponentPackageImpl;

import identity.impl.IdentityPackageImpl;

import identity.instance.InstancePackage;

import identity.instance.impl.InstancePackageImpl;

import identity.instantiation.InstantiationPackage;

import identity.instantiation.impl.InstantiationPackageImpl;

import identity.pattern.IdentityAttributePattern;
import identity.pattern.IdentityPattern;
import identity.pattern.PatternFactory;
import identity.pattern.PatternPackage;

import identity.type.TypePackage;

import identity.type.impl.TypePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityAttributePatternEClass = null;

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
     * @see identity.pattern.PatternPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PatternPackageImpl() {
        super(eNS_URI, PatternFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PatternPackage init() {
        if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Obtain or create and register package
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) : IdentityPackage.eINSTANCE);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        thePatternPackage.createPackageContents();
        theIdentityPackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        thePatternPackage.initializePackageContents();
        theIdentityPackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePatternPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
        return thePatternPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityPattern() {
        return identityPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_AttributePatterns() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_IssuerPattern() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentityPattern_Subject() {
        return (EAttribute)identityPatternEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_Variables() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_Instantiation() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_Type() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityPattern_SubjectPattern() {
        return (EReference)identityPatternEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityAttributePattern() {
        return identityAttributePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityAttributePattern_Variable() {
        return (EReference)identityAttributePatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternFactory getPatternFactory() {
        return (PatternFactory)getEFactoryInstance();
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
        identityPatternEClass = createEClass(IDENTITY_PATTERN);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__ATTRIBUTE_PATTERNS);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__ISSUER_PATTERN);
        createEAttribute(identityPatternEClass, IDENTITY_PATTERN__SUBJECT);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__VARIABLES);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__INSTANTIATION);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__TYPE);
        createEReference(identityPatternEClass, IDENTITY_PATTERN__SUBJECT_PATTERN);

        identityAttributePatternEClass = createEClass(IDENTITY_ATTRIBUTE_PATTERN);
        createEReference(identityAttributePatternEClass, IDENTITY_ATTRIBUTE_PATTERN__VARIABLE);
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
        IdentityPackage theIdentityPackage = (IdentityPackage)EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        data.pattern.PatternPackage thePatternPackage_1 = (data.pattern.PatternPackage)EPackage.Registry.INSTANCE.getEPackage(data.pattern.PatternPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        identityPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
        identityAttributePatternEClass.getESuperTypes().add(thePatternPackage_1.getDataPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(identityPatternEClass, IdentityPattern.class, "IdentityPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityPattern_AttributePatterns(), this.getIdentityAttributePattern(), null, "attributePatterns", null, 0, -1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityPattern_IssuerPattern(), this.getIdentityPattern(), null, "issuerPattern", null, 0, 1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentityPattern_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityPattern_Variables(), theIdentityPackage.getIdentityVariable(), null, "variables", null, 0, -1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityPattern_Instantiation(), theInstantiationPackage.getIdentityInstantiation(), null, "instantiation", null, 0, 1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityPattern_Type(), theTypePackage.getIdentityType(), null, "type", null, 0, 1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIdentityPattern_SubjectPattern(), thePatternPackage_1.getDataPattern(), null, "subjectPattern", null, 0, 1, IdentityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identityAttributePatternEClass, IdentityAttributePattern.class, "IdentityAttributePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityAttributePattern_Variable(), theIdentityPackage.getIdentityAttributeVariable(), null, "variable", null, 0, 1, IdentityAttributePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //PatternPackageImpl
