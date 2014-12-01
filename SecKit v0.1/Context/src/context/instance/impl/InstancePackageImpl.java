/**
 */
package context.instance.impl;

import context.ContextPackage;

import context.event.EventPackage;

import context.event.impl.EventPackageImpl;

import context.impl.ContextPackageImpl;

import context.instance.Context;
import context.instance.ContextSituation;
import context.instance.EntityRole;
import context.instance.InstanceFactory;
import context.instance.InstancePackage;
import context.instance.NumericPrecision;
import context.instance.Precision;
import context.instance.QualityOfContext;

import context.instance.tmp.TmpPackage;

import context.instance.tmp.impl.TmpPackageImpl;

import context.instantiation.InstantiationPackage;

import context.instantiation.impl.InstantiationPackageImpl;

import context.management.ManagementPackage;

import context.management.impl.ManagementPackageImpl;

import context.pattern.PatternPackage;

import context.pattern.impl.PatternPackageImpl;

import context.type.TypePackage;

import context.type.impl.TypePackageImpl;

import identity.IdentityPackage;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextSituationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericPrecisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass precisionEClass = null;

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
     * @see context.instance.InstancePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private InstancePackageImpl() {
        super(eNS_URI, InstanceFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static InstancePackage init() {
        if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

        // Obtain or create and register package
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) : ManagementPackage.eINSTANCE);
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI) : TmpPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theInstancePackage.createPackageContents();
        theContextPackage.createPackageContents();
        theManagementPackage.createPackageContents();
        theTmpPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theInstancePackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theManagementPackage.initializePackageContents();
        theTmpPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theInstancePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
        return theInstancePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContext() {
        return contextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContext_QualityOfContext() {
        return (EReference)contextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContext_Timestamp() {
        return (EReference)contextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContext_Owner() {
        return (EReference)contextEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContextSituation() {
        return contextSituationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituation_Type() {
        return (EReference)contextSituationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituation_Roles() {
        return (EReference)contextSituationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituation_TimeInterval() {
        return (EReference)contextSituationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContextSituation_Context() {
        return (EReference)contextSituationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityRole() {
        return entityRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRole_RoleType() {
        return (EReference)entityRoleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityRole_Identities() {
        return (EReference)entityRoleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericPrecision() {
        return numericPrecisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericPrecision_Unit() {
        return (EAttribute)numericPrecisionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericPrecision_SignificantDigits() {
        return (EAttribute)numericPrecisionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericPrecision_PlusMinusDelta() {
        return (EAttribute)numericPrecisionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfContext() {
        return qualityOfContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQualityOfContext_DeclaredPrecision() {
        return (EReference)qualityOfContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQualityOfContext_ImplicitPrecision() {
        return (EReference)qualityOfContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQualityOfContext_TimestampPrecision() {
        return (EReference)qualityOfContextEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQualityOfContext_RefreshRate() {
        return (EReference)qualityOfContextEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrecision() {
        return precisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactory getInstanceFactory() {
        return (InstanceFactory)getEFactoryInstance();
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
        contextEClass = createEClass(CONTEXT);
        createEReference(contextEClass, CONTEXT__QUALITY_OF_CONTEXT);
        createEReference(contextEClass, CONTEXT__TIMESTAMP);
        createEReference(contextEClass, CONTEXT__OWNER);

        contextSituationEClass = createEClass(CONTEXT_SITUATION);
        createEReference(contextSituationEClass, CONTEXT_SITUATION__TYPE);
        createEReference(contextSituationEClass, CONTEXT_SITUATION__ROLES);
        createEReference(contextSituationEClass, CONTEXT_SITUATION__TIME_INTERVAL);
        createEReference(contextSituationEClass, CONTEXT_SITUATION__CONTEXT);

        entityRoleEClass = createEClass(ENTITY_ROLE);
        createEReference(entityRoleEClass, ENTITY_ROLE__ROLE_TYPE);
        createEReference(entityRoleEClass, ENTITY_ROLE__IDENTITIES);

        numericPrecisionEClass = createEClass(NUMERIC_PRECISION);
        createEAttribute(numericPrecisionEClass, NUMERIC_PRECISION__UNIT);
        createEAttribute(numericPrecisionEClass, NUMERIC_PRECISION__SIGNIFICANT_DIGITS);
        createEAttribute(numericPrecisionEClass, NUMERIC_PRECISION__PLUS_MINUS_DELTA);

        qualityOfContextEClass = createEClass(QUALITY_OF_CONTEXT);
        createEReference(qualityOfContextEClass, QUALITY_OF_CONTEXT__DECLARED_PRECISION);
        createEReference(qualityOfContextEClass, QUALITY_OF_CONTEXT__IMPLICIT_PRECISION);
        createEReference(qualityOfContextEClass, QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION);
        createEReference(qualityOfContextEClass, QUALITY_OF_CONTEXT__REFRESH_RATE);

        precisionEClass = createEClass(PRECISION);
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
        TmpPackage theTmpPackage = (TmpPackage)EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI);
        data.instance.InstancePackage theInstancePackage_1 = (data.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(data.instance.InstancePackage.eNS_URI);
        TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
        identity.instance.InstancePackage theInstancePackage_2 = (identity.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(identity.instance.InstancePackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theTmpPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        contextEClass.getESuperTypes().add(theInstancePackage_1.getData());
        contextSituationEClass.getESuperTypes().add(theModelsPackage.getElement());
        numericPrecisionEClass.getESuperTypes().add(this.getPrecision());
        qualityOfContextEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContext_QualityOfContext(), this.getQualityOfContext(), null, "qualityOfContext", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContext_Timestamp(), theTimePackage.getTimestamp(), null, "timestamp", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContext_Owner(), theInstancePackage_2.getAbstractIdentity(), null, "owner", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contextSituationEClass, ContextSituation.class, "ContextSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContextSituation_Type(), theTypePackage.getContextSituationType(), null, "type", null, 1, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituation_Roles(), this.getEntityRole(), null, "roles", null, 0, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituation_TimeInterval(), theTimePackage.getTimeInterval(), null, "timeInterval", null, 1, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContextSituation_Context(), this.getContext(), null, "context", null, 0, -1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityRoleEClass, EntityRole.class, "EntityRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityRole_RoleType(), theTypePackage.getEntityRoleType(), null, "roleType", null, 1, 1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityRole_Identities(), theInstancePackage_2.getAbstractIdentity(), null, "identities", null, 0, -1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericPrecisionEClass, NumericPrecision.class, "NumericPrecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNumericPrecision_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, NumericPrecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericPrecision_SignificantDigits(), ecorePackage.getEInt(), "significantDigits", null, 0, 1, NumericPrecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericPrecision_PlusMinusDelta(), ecorePackage.getELong(), "plusMinusDelta", null, 0, 1, NumericPrecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(qualityOfContextEClass, QualityOfContext.class, "QualityOfContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQualityOfContext_DeclaredPrecision(), this.getPrecision(), null, "declaredPrecision", null, 0, 1, QualityOfContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQualityOfContext_ImplicitPrecision(), this.getPrecision(), null, "implicitPrecision", null, 0, 1, QualityOfContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQualityOfContext_TimestampPrecision(), theTimePackage.getTimestampPrecision(), null, "timestampPrecision", null, 0, 1, QualityOfContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQualityOfContext_RefreshRate(), theTimePackage.getTimeDuration(), null, "refreshRate", null, 0, 1, QualityOfContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(precisionEClass, Precision.class, "Precision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //InstancePackageImpl
