/**
 */
package role.impl;

import identity.IdentityPackage;

import identity.instance.InstancePackage;

import identity.pattern.PatternPackage;

import java.util.Map;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import role.AbstractRolePattern;
import role.IdentityRolePattern;
import role.RoleAssignment;
import role.RoleDesignModel;
import role.RoleFactory;
import role.RolePackage;
import role.RolePattern;
import role.RoleRuntimeModel;
import role.RoleType;
import role.RoleTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolePackageImpl extends EPackageImpl implements RolePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleDesignModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleRuntimeModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleAssignmentMapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rolePatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityRolePatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractRolePatternEClass = null;

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
     * @see role.RolePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RolePackageImpl() {
        super(eNS_URI, RoleFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RolePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RolePackage init() {
        if (isInited) return (RolePackage)EPackage.Registry.INSTANCE.getEPackage(RolePackage.eNS_URI);

        // Obtain or create and register package
        RolePackageImpl theRolePackage = (RolePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RolePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RolePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentityPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theRolePackage.createPackageContents();

        // Initialize created meta-data
        theRolePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRolePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RolePackage.eNS_URI, theRolePackage);
        return theRolePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleType() {
        return roleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleType_SubRoles() {
        return (EReference)roleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleType_SuperRoles() {
        return (EReference)roleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRoleType_Name() {
        return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleDesignModel() {
        return roleDesignModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleDesignModel_Packages() {
        return (EReference)roleDesignModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleTypePackage() {
        return roleTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleTypePackage_RoleTypes() {
        return (EReference)roleTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRoleTypePackage_Name() {
        return (EAttribute)roleTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleTypePackage_SubPackages() {
        return (EReference)roleTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleTypePackage_SuperPackage() {
        return (EReference)roleTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleTypePackage_Model() {
        return (EReference)roleTypePackageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleRuntimeModel() {
        return roleRuntimeModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleRuntimeModel_RoleMap() {
        return (EReference)roleRuntimeModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleRuntimeModel_Assignments() {
        return (EReference)roleRuntimeModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleAssignmentMap() {
        return roleAssignmentMapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleAssignmentMap_Key() {
        return (EReference)roleAssignmentMapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleAssignmentMap_Value() {
        return (EReference)roleAssignmentMapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleAssignment() {
        return roleAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleAssignment_RoleType() {
        return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoleAssignment_Identities() {
        return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRolePattern() {
        return rolePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityRolePattern() {
        return identityRolePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityRolePattern_IdentityPattern() {
        return (EReference)identityRolePatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractRolePattern() {
        return abstractRolePatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractRolePattern_RoleType() {
        return (EReference)abstractRolePatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleFactory getRoleFactory() {
        return (RoleFactory)getEFactoryInstance();
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
        roleTypeEClass = createEClass(ROLE_TYPE);
        createEReference(roleTypeEClass, ROLE_TYPE__SUB_ROLES);
        createEReference(roleTypeEClass, ROLE_TYPE__SUPER_ROLES);
        createEAttribute(roleTypeEClass, ROLE_TYPE__NAME);

        roleDesignModelEClass = createEClass(ROLE_DESIGN_MODEL);
        createEReference(roleDesignModelEClass, ROLE_DESIGN_MODEL__PACKAGES);

        roleTypePackageEClass = createEClass(ROLE_TYPE_PACKAGE);
        createEReference(roleTypePackageEClass, ROLE_TYPE_PACKAGE__ROLE_TYPES);
        createEAttribute(roleTypePackageEClass, ROLE_TYPE_PACKAGE__NAME);
        createEReference(roleTypePackageEClass, ROLE_TYPE_PACKAGE__SUB_PACKAGES);
        createEReference(roleTypePackageEClass, ROLE_TYPE_PACKAGE__SUPER_PACKAGE);
        createEReference(roleTypePackageEClass, ROLE_TYPE_PACKAGE__MODEL);

        roleRuntimeModelEClass = createEClass(ROLE_RUNTIME_MODEL);
        createEReference(roleRuntimeModelEClass, ROLE_RUNTIME_MODEL__ROLE_MAP);
        createEReference(roleRuntimeModelEClass, ROLE_RUNTIME_MODEL__ASSIGNMENTS);

        roleAssignmentMapEClass = createEClass(ROLE_ASSIGNMENT_MAP);
        createEReference(roleAssignmentMapEClass, ROLE_ASSIGNMENT_MAP__KEY);
        createEReference(roleAssignmentMapEClass, ROLE_ASSIGNMENT_MAP__VALUE);

        roleAssignmentEClass = createEClass(ROLE_ASSIGNMENT);
        createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__ROLE_TYPE);
        createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__IDENTITIES);

        rolePatternEClass = createEClass(ROLE_PATTERN);

        identityRolePatternEClass = createEClass(IDENTITY_ROLE_PATTERN);
        createEReference(identityRolePatternEClass, IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN);

        abstractRolePatternEClass = createEClass(ABSTRACT_ROLE_PATTERN);
        createEReference(abstractRolePatternEClass, ABSTRACT_ROLE_PATTERN__ROLE_TYPE);
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
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        roleTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        roleDesignModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        roleTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        roleRuntimeModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        roleAssignmentEClass.getESuperTypes().add(theModelsPackage.getElement());
        rolePatternEClass.getESuperTypes().add(this.getAbstractRolePattern());
        identityRolePatternEClass.getESuperTypes().add(this.getAbstractRolePattern());
        abstractRolePatternEClass.getESuperTypes().add(theModelsPackage.getPattern());

        // Initialize classes, features, and operations; add parameters
        initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleType_SubRoles(), this.getRoleType(), this.getRoleType_SuperRoles(), "subRoles", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleType_SuperRoles(), this.getRoleType(), this.getRoleType_SubRoles(), "superRoles", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRoleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roleDesignModelEClass, RoleDesignModel.class, "RoleDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleDesignModel_Packages(), this.getRoleTypePackage(), this.getRoleTypePackage_Model(), "packages", null, 0, -1, RoleDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roleTypePackageEClass, RoleTypePackage.class, "RoleTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleTypePackage_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 0, -1, RoleTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRoleTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoleTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleTypePackage_SubPackages(), this.getRoleTypePackage(), this.getRoleTypePackage_SuperPackage(), "subPackages", null, 0, -1, RoleTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleTypePackage_SuperPackage(), this.getRoleTypePackage(), this.getRoleTypePackage_SubPackages(), "superPackage", null, 0, 1, RoleTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleTypePackage_Model(), this.getRoleDesignModel(), this.getRoleDesignModel_Packages(), "model", null, 0, 1, RoleTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roleRuntimeModelEClass, RoleRuntimeModel.class, "RoleRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleRuntimeModel_RoleMap(), this.getRoleAssignmentMap(), null, "roleMap", null, 0, -1, RoleRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleRuntimeModel_Assignments(), this.getRoleAssignment(), null, "assignments", null, 0, -1, RoleRuntimeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roleAssignmentMapEClass, Map.Entry.class, "RoleAssignmentMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleAssignmentMap_Key(), this.getRoleType(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleAssignmentMap_Value(), this.getRoleAssignment(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roleAssignmentEClass, RoleAssignment.class, "RoleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoleAssignment_RoleType(), this.getRoleType(), null, "roleType", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRoleAssignment_Identities(), theInstancePackage.getAbstractIdentity(), null, "identities", null, 0, -1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rolePatternEClass, RolePattern.class, "RolePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityRolePatternEClass, IdentityRolePattern.class, "IdentityRolePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityRolePattern_IdentityPattern(), thePatternPackage.getIdentityPattern(), null, "identityPattern", null, 1, 1, IdentityRolePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractRolePatternEClass, AbstractRolePattern.class, "AbstractRolePattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractRolePattern_RoleType(), this.getRoleType(), null, "roleType", null, 0, 1, AbstractRolePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //RolePackageImpl
