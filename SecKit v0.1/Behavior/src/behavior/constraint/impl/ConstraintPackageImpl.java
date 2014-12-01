/**
 */
package behavior.constraint.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.CausalityPackage;

import behavior.causality.impl.CausalityPackageImpl;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.AttributeValueEstablishmentTypes;
import behavior.constraint.Constraint;
import behavior.constraint.ConstraintFactory;
import behavior.constraint.ConstraintPackage;
import behavior.constraint.ConstraintType;
import behavior.constraint.DataConstraint;
import behavior.constraint.DataEstablishment;
import behavior.constraint.DataEstablishmentFromVariable;
import behavior.constraint.IdentityConstraint;
import behavior.constraint.IdentityEstablishment;
import behavior.constraint.IdentityEstablishmentFromVariable;
import behavior.constraint.RangeOfValues;
import behavior.constraint.ReferenceDataEstablishment;
import behavior.constraint.ReferenceIdentityEstablishment;
import behavior.constraint.SetOfValues;
import behavior.constraint.StaticDataEstablishment;
import behavior.constraint.ValueCheckingConstraint;
import behavior.constraint.VariableEstablishment;

import behavior.event.EventPackage;

import behavior.event.impl.EventPackageImpl;

import behavior.impl.BehaviorPackageImpl;

import behavior.instance.InstancePackage;

import behavior.instance.impl.InstancePackageImpl;

import behavior.instantiation.InstantiationPackage;

import behavior.instantiation.impl.InstantiationPackageImpl;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.QualityPackage;

import behavior.quality.impl.QualityPackageImpl;

import behavior.trust.TrustPackage;

import behavior.trust.impl.TrustPackageImpl;

import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintPackageImpl extends EPackageImpl implements ConstraintPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceDataEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueCheckingConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rangeOfValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setOfValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticDataEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataEstablishmentFromVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityEstablishmentFromVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceIdentityEstablishmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum constraintTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum attributeValueEstablishmentTypesEEnum = null;

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
     * @see behavior.constraint.ConstraintPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ConstraintPackageImpl() {
        super(eNS_URI, ConstraintFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ConstraintPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ConstraintPackage init() {
        if (isInited) return (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);

        // Obtain or create and register package
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theConstraintPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theConstraintPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theConstraintPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ConstraintPackage.eNS_URI, theConstraintPackage);
        return theConstraintPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataConstraint() {
        return dataConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceDataEstablishment() {
        return referenceDataEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceDataEstablishment_Source() {
        return (EReference)referenceDataEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataEstablishment() {
        return dataEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataEstablishment_Target() {
        return (EReference)dataEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValueCheckingConstraint() {
        return valueCheckingConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValueCheckingConstraint_Type() {
        return (EAttribute)valueCheckingConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRangeOfValues() {
        return rangeOfValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRangeOfValues_LowerBoundInclusive() {
        return (EReference)rangeOfValuesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRangeOfValues_UpperBoundInclusive() {
        return (EReference)rangeOfValuesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetOfValues() {
        return setOfValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSetOfValues_Values() {
        return (EReference)setOfValuesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStaticDataEstablishment() {
        return staticDataEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStaticDataEstablishment_Value() {
        return (EReference)staticDataEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataEstablishmentFromVariable() {
        return dataEstablishmentFromVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityConstraint() {
        return identityConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityEstablishment() {
        return identityEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIdentityEstablishment_Target() {
        return (EReference)identityEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstraint() {
        return constraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityEstablishmentFromVariable() {
        return identityEstablishmentFromVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableEstablishment() {
        return variableEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableEstablishment_Source() {
        return (EReference)variableEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceIdentityEstablishment() {
        return referenceIdentityEstablishmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceIdentityEstablishment_Source() {
        return (EReference)referenceIdentityEstablishmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConstraintType() {
        return constraintTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttributeValueEstablishmentTypes() {
        return attributeValueEstablishmentTypesEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintFactory getConstraintFactory() {
        return (ConstraintFactory)getEFactoryInstance();
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
        dataConstraintEClass = createEClass(DATA_CONSTRAINT);

        referenceDataEstablishmentEClass = createEClass(REFERENCE_DATA_ESTABLISHMENT);
        createEReference(referenceDataEstablishmentEClass, REFERENCE_DATA_ESTABLISHMENT__SOURCE);

        dataEstablishmentEClass = createEClass(DATA_ESTABLISHMENT);
        createEReference(dataEstablishmentEClass, DATA_ESTABLISHMENT__TARGET);

        valueCheckingConstraintEClass = createEClass(VALUE_CHECKING_CONSTRAINT);
        createEAttribute(valueCheckingConstraintEClass, VALUE_CHECKING_CONSTRAINT__TYPE);

        rangeOfValuesEClass = createEClass(RANGE_OF_VALUES);
        createEReference(rangeOfValuesEClass, RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE);
        createEReference(rangeOfValuesEClass, RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE);

        setOfValuesEClass = createEClass(SET_OF_VALUES);
        createEReference(setOfValuesEClass, SET_OF_VALUES__VALUES);

        staticDataEstablishmentEClass = createEClass(STATIC_DATA_ESTABLISHMENT);
        createEReference(staticDataEstablishmentEClass, STATIC_DATA_ESTABLISHMENT__VALUE);

        dataEstablishmentFromVariableEClass = createEClass(DATA_ESTABLISHMENT_FROM_VARIABLE);

        identityConstraintEClass = createEClass(IDENTITY_CONSTRAINT);

        identityEstablishmentEClass = createEClass(IDENTITY_ESTABLISHMENT);
        createEReference(identityEstablishmentEClass, IDENTITY_ESTABLISHMENT__TARGET);

        constraintEClass = createEClass(CONSTRAINT);

        identityEstablishmentFromVariableEClass = createEClass(IDENTITY_ESTABLISHMENT_FROM_VARIABLE);

        variableEstablishmentEClass = createEClass(VARIABLE_ESTABLISHMENT);
        createEReference(variableEstablishmentEClass, VARIABLE_ESTABLISHMENT__SOURCE);

        referenceIdentityEstablishmentEClass = createEClass(REFERENCE_IDENTITY_ESTABLISHMENT);
        createEReference(referenceIdentityEstablishmentEClass, REFERENCE_IDENTITY_ESTABLISHMENT__SOURCE);

        // Create enums
        constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
        attributeValueEstablishmentTypesEEnum = createEEnum(ATTRIBUTE_VALUE_ESTABLISHMENT_TYPES);
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
        data.instantiation.InstantiationPackage theInstantiationPackage_1 = (data.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(data.instantiation.InstantiationPackage.eNS_URI);
        data.instance.InstancePackage theInstancePackage_1 = (data.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(data.instance.InstancePackage.eNS_URI);
        identity.instantiation.InstantiationPackage theInstantiationPackage_2 = (identity.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(identity.instantiation.InstantiationPackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataConstraintEClass.getESuperTypes().add(this.getConstraint());
        referenceDataEstablishmentEClass.getESuperTypes().add(this.getDataEstablishment());
        dataEstablishmentEClass.getESuperTypes().add(this.getDataConstraint());
        valueCheckingConstraintEClass.getESuperTypes().add(this.getDataConstraint());
        rangeOfValuesEClass.getESuperTypes().add(this.getValueCheckingConstraint());
        setOfValuesEClass.getESuperTypes().add(this.getValueCheckingConstraint());
        staticDataEstablishmentEClass.getESuperTypes().add(this.getDataEstablishment());
        dataEstablishmentFromVariableEClass.getESuperTypes().add(this.getDataEstablishment());
        dataEstablishmentFromVariableEClass.getESuperTypes().add(this.getVariableEstablishment());
        identityConstraintEClass.getESuperTypes().add(this.getConstraint());
        identityEstablishmentEClass.getESuperTypes().add(this.getIdentityConstraint());
        constraintEClass.getESuperTypes().add(theModelsPackage.getElement());
        identityEstablishmentFromVariableEClass.getESuperTypes().add(this.getIdentityEstablishment());
        identityEstablishmentFromVariableEClass.getESuperTypes().add(this.getVariableEstablishment());
        referenceIdentityEstablishmentEClass.getESuperTypes().add(this.getIdentityEstablishment());

        // Initialize classes, features, and operations; add parameters
        initEClass(dataConstraintEClass, DataConstraint.class, "DataConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(referenceDataEstablishmentEClass, ReferenceDataEstablishment.class, "ReferenceDataEstablishment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceDataEstablishment_Source(), theInstantiationPackage_1.getDataInstantiation(), null, "source", null, 1, 1, ReferenceDataEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataEstablishmentEClass, DataEstablishment.class, "DataEstablishment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataEstablishment_Target(), theInstantiationPackage_1.getDataInstantiation(), null, "target", null, 1, 1, DataEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueCheckingConstraintEClass, ValueCheckingConstraint.class, "ValueCheckingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValueCheckingConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, ValueCheckingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rangeOfValuesEClass, RangeOfValues.class, "RangeOfValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRangeOfValues_LowerBoundInclusive(), theInstancePackage_1.getData(), null, "lowerBoundInclusive", null, 1, 1, RangeOfValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRangeOfValues_UpperBoundInclusive(), theInstancePackage_1.getData(), null, "upperBoundInclusive", null, 1, 1, RangeOfValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setOfValuesEClass, SetOfValues.class, "SetOfValues", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSetOfValues_Values(), theInstancePackage_1.getData(), null, "values", null, 1, -1, SetOfValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(staticDataEstablishmentEClass, StaticDataEstablishment.class, "StaticDataEstablishment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStaticDataEstablishment_Value(), theInstancePackage_1.getData(), null, "value", null, 1, 1, StaticDataEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataEstablishmentFromVariableEClass, DataEstablishmentFromVariable.class, "DataEstablishmentFromVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityConstraintEClass, IdentityConstraint.class, "IdentityConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityEstablishmentEClass, IdentityEstablishment.class, "IdentityEstablishment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIdentityEstablishment_Target(), theInstantiationPackage_2.getIdentityInstantiation(), null, "target", null, 1, 1, IdentityEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityEstablishmentFromVariableEClass, IdentityEstablishmentFromVariable.class, "IdentityEstablishmentFromVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(variableEstablishmentEClass, VariableEstablishment.class, "VariableEstablishment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableEstablishment_Source(), theVariablePackage_1.getVariableDeclaration(), null, "source", null, 1, 1, VariableEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceIdentityEstablishmentEClass, ReferenceIdentityEstablishment.class, "ReferenceIdentityEstablishment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceIdentityEstablishment_Source(), theInstantiationPackage_2.getIdentityInstantiation(), null, "source", null, 1, 1, ReferenceIdentityEstablishment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
        addEEnumLiteral(constraintTypeEEnum, ConstraintType.ALLOW);
        addEEnumLiteral(constraintTypeEEnum, ConstraintType.REQUIRE);

        initEEnum(attributeValueEstablishmentTypesEEnum, AttributeValueEstablishmentTypes.class, "AttributeValueEstablishmentTypes");
        addEEnumLiteral(attributeValueEstablishmentTypesEEnum, AttributeValueEstablishmentTypes.VALUE_CHECKING);
        addEEnumLiteral(attributeValueEstablishmentTypesEEnum, AttributeValueEstablishmentTypes.VALUE_PASSING);
        addEEnumLiteral(attributeValueEstablishmentTypesEEnum, AttributeValueEstablishmentTypes.VALUE_GENERATION);
    }

} //ConstraintPackageImpl
