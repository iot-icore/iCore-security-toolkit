/**
 */
package models.variable.impl;

import models.ModelsPackage;

import models.impl.ModelsPackageImpl;

import models.variable.ReferenceVariableAssignment;
import models.variable.RegExpVariableAssignment;
import models.variable.StaticAssignment;
import models.variable.StringAssignment;
import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.VariableFactory;
import models.variable.VariableInstance;
import models.variable.VariablePackage;
import models.variable.VariableReference;
import models.variable.XPathVariableAssignment;

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
public class VariablePackageImpl extends EPackageImpl implements VariablePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableInstanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceVariableAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xPathVariableAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass regExpVariableAssignmentEClass = null;

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
     * @see models.variable.VariablePackage#eNS_URI
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

        // Obtain or create and register interdependencies
        ModelsPackageImpl theModelsPackage = (ModelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI) instanceof ModelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI) : ModelsPackage.eINSTANCE);

        // Create package meta-data objects
        theVariablePackage.createPackageContents();
        theModelsPackage.createPackageContents();

        // Initialize created meta-data
        theVariablePackage.initializePackageContents();
        theModelsPackage.initializePackageContents();

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
    public EClass getVariableAssignment() {
        return variableAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableAssignment_Target() {
        return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableInstance() {
        return variableInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableInstance_Value() {
        return (EReference)variableInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceVariableAssignment() {
        return referenceVariableAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceVariableAssignment_Source() {
        return (EReference)referenceVariableAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticAssignment() {
        return staticAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableDeclaration() {
        return variableDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVariableDeclaration_Name() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableReference() {
        return variableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXPathVariableAssignment() {
        return xPathVariableAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXPathVariableAssignment_Expression() {
        return (EAttribute)xPathVariableAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStringAssignment() {
        return stringAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStringAssignment_Value() {
        return (EAttribute)stringAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRegExpVariableAssignment() {
        return regExpVariableAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRegExpVariableAssignment_Expression() {
        return (EAttribute)regExpVariableAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRegExpVariableAssignment_Match() {
        return (EAttribute)regExpVariableAssignmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRegExpVariableAssignment_Group() {
        return (EAttribute)regExpVariableAssignmentEClass.getEStructuralFeatures().get(2);
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
        variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
        createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__TARGET);

        variableInstanceEClass = createEClass(VARIABLE_INSTANCE);
        createEReference(variableInstanceEClass, VARIABLE_INSTANCE__VALUE);

        referenceVariableAssignmentEClass = createEClass(REFERENCE_VARIABLE_ASSIGNMENT);
        createEReference(referenceVariableAssignmentEClass, REFERENCE_VARIABLE_ASSIGNMENT__SOURCE);

        staticAssignmentEClass = createEClass(STATIC_ASSIGNMENT);

        variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

        variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

        xPathVariableAssignmentEClass = createEClass(XPATH_VARIABLE_ASSIGNMENT);
        createEAttribute(xPathVariableAssignmentEClass, XPATH_VARIABLE_ASSIGNMENT__EXPRESSION);

        stringAssignmentEClass = createEClass(STRING_ASSIGNMENT);
        createEAttribute(stringAssignmentEClass, STRING_ASSIGNMENT__VALUE);

        regExpVariableAssignmentEClass = createEClass(REG_EXP_VARIABLE_ASSIGNMENT);
        createEAttribute(regExpVariableAssignmentEClass, REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION);
        createEAttribute(regExpVariableAssignmentEClass, REG_EXP_VARIABLE_ASSIGNMENT__MATCH);
        createEAttribute(regExpVariableAssignmentEClass, REG_EXP_VARIABLE_ASSIGNMENT__GROUP);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        variableAssignmentEClass.getESuperTypes().add(theModelsPackage.getElement());
        variableInstanceEClass.getESuperTypes().add(theModelsPackage.getElement());
        referenceVariableAssignmentEClass.getESuperTypes().add(this.getVariableAssignment());
        staticAssignmentEClass.getESuperTypes().add(this.getVariableAssignment());
        variableDeclarationEClass.getESuperTypes().add(theModelsPackage.getElement());
        variableReferenceEClass.getESuperTypes().add(theModelsPackage.getElement());
        xPathVariableAssignmentEClass.getESuperTypes().add(this.getVariableAssignment());
        stringAssignmentEClass.getESuperTypes().add(this.getStaticAssignment());
        regExpVariableAssignmentEClass.getESuperTypes().add(this.getReferenceVariableAssignment());

        // Initialize classes, features, and operations; add parameters
        initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableAssignment_Target(), this.getVariableDeclaration(), null, "target", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableInstanceEClass, VariableInstance.class, "VariableInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableInstance_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, VariableInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceVariableAssignmentEClass, ReferenceVariableAssignment.class, "ReferenceVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceVariableAssignment_Source(), this.getVariableDeclaration(), null, "source", null, 1, 1, ReferenceVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticAssignmentEClass, StaticAssignment.class, "StaticAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(xPathVariableAssignmentEClass, XPathVariableAssignment.class, "XPathVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getXPathVariableAssignment_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, XPathVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringAssignmentEClass, StringAssignment.class, "StringAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringAssignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regExpVariableAssignmentEClass, RegExpVariableAssignment.class, "RegExpVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRegExpVariableAssignment_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, RegExpVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRegExpVariableAssignment_Match(), ecorePackage.getEInt(), "match", null, 0, 1, RegExpVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRegExpVariableAssignment_Group(), ecorePackage.getEInt(), "group", null, 0, 1, RegExpVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //VariablePackageImpl
