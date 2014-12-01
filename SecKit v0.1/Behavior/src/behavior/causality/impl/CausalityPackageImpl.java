/**
 */
package behavior.causality.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.AndCondition;
import behavior.causality.BasicCausalityCondition;
import behavior.causality.BinaryCausalityCondition;
import behavior.causality.CausalityCondition;
import behavior.causality.CausalityConstraint;
import behavior.causality.CausalityFactory;
import behavior.causality.CausalityPackage;
import behavior.causality.CausalityParameter;
import behavior.causality.CausalityRelation;
import behavior.causality.DisablingCondition;
import behavior.causality.EnablingCondition;
import behavior.causality.EntryPointCondition;
import behavior.causality.ExitPointCondition;
import behavior.causality.OrCondition;
import behavior.causality.PointCondition;
import behavior.causality.StartCondition;
import behavior.causality.SynchronizationCondition;
import behavior.causality.Uncertainty;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.ConstraintPackage;

import behavior.constraint.impl.ConstraintPackageImpl;

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
public class CausalityPackageImpl extends EPackageImpl implements CausalityPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pointConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exitPointConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entryPointConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryCausalityConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass orConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass andConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityRelationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicCausalityConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass startConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass disablingConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enablingConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass synchronizationConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum uncertaintyEEnum = null;

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
     * @see behavior.causality.CausalityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CausalityPackageImpl() {
        super(eNS_URI, CausalityFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CausalityPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CausalityPackage init() {
        if (isInited) return (CausalityPackage)EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI);

        // Obtain or create and register package
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CausalityPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theCausalityPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theCausalityPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCausalityPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CausalityPackage.eNS_URI, theCausalityPackage);
        return theCausalityPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPointCondition() {
        return pointConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExitPointCondition() {
        return exitPointConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExitPointCondition_Exit() {
        return (EReference)exitPointConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExitPointCondition_Context() {
        return (EReference)exitPointConditionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryPointCondition() {
        return entryPointConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntryPointCondition_Entry() {
        return (EReference)entryPointConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinaryCausalityCondition() {
        return binaryCausalityConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinaryCausalityCondition_Source() {
        return (EReference)binaryCausalityConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOrCondition() {
        return orConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOrCondition_Conditions() {
        return (EReference)orConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAndCondition() {
        return andConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAndCondition_Conditions() {
        return (EReference)andConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAndCondition_Constraints() {
        return (EReference)andConditionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityParameter() {
        return causalityParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityParameter_Constraints() {
        return (EReference)causalityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityParameter_VariableAssignments() {
        return (EReference)causalityParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityCondition() {
        return causalityConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCausalityCondition_Uncertainty() {
        return (EAttribute)causalityConditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityRelation() {
        return causalityRelationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityRelation_Condition() {
        return (EReference)causalityRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityRelation_Target() {
        return (EReference)causalityRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityRelation_Context() {
        return (EReference)causalityRelationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCausalityRelation_Id() {
        return (EAttribute)causalityRelationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityConstraint() {
        return causalityConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCausalityConstraint_Expression() {
        return (EAttribute)causalityConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBasicCausalityCondition() {
        return basicCausalityConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStartCondition() {
        return startConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDisablingCondition() {
        return disablingConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnablingCondition() {
        return enablingConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSynchronizationCondition() {
        return synchronizationConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUncertainty() {
        return uncertaintyEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityFactory getCausalityFactory() {
        return (CausalityFactory)getEFactoryInstance();
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
        pointConditionEClass = createEClass(POINT_CONDITION);

        exitPointConditionEClass = createEClass(EXIT_POINT_CONDITION);
        createEReference(exitPointConditionEClass, EXIT_POINT_CONDITION__EXIT);
        createEReference(exitPointConditionEClass, EXIT_POINT_CONDITION__CONTEXT);

        entryPointConditionEClass = createEClass(ENTRY_POINT_CONDITION);
        createEReference(entryPointConditionEClass, ENTRY_POINT_CONDITION__ENTRY);

        binaryCausalityConditionEClass = createEClass(BINARY_CAUSALITY_CONDITION);
        createEReference(binaryCausalityConditionEClass, BINARY_CAUSALITY_CONDITION__SOURCE);

        orConditionEClass = createEClass(OR_CONDITION);
        createEReference(orConditionEClass, OR_CONDITION__CONDITIONS);

        andConditionEClass = createEClass(AND_CONDITION);
        createEReference(andConditionEClass, AND_CONDITION__CONDITIONS);
        createEReference(andConditionEClass, AND_CONDITION__CONSTRAINTS);

        causalityParameterEClass = createEClass(CAUSALITY_PARAMETER);
        createEReference(causalityParameterEClass, CAUSALITY_PARAMETER__CONSTRAINTS);
        createEReference(causalityParameterEClass, CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS);

        causalityConditionEClass = createEClass(CAUSALITY_CONDITION);
        createEAttribute(causalityConditionEClass, CAUSALITY_CONDITION__UNCERTAINTY);

        causalityRelationEClass = createEClass(CAUSALITY_RELATION);
        createEReference(causalityRelationEClass, CAUSALITY_RELATION__CONDITION);
        createEReference(causalityRelationEClass, CAUSALITY_RELATION__TARGET);
        createEReference(causalityRelationEClass, CAUSALITY_RELATION__CONTEXT);
        createEAttribute(causalityRelationEClass, CAUSALITY_RELATION__ID);

        causalityConstraintEClass = createEClass(CAUSALITY_CONSTRAINT);
        createEAttribute(causalityConstraintEClass, CAUSALITY_CONSTRAINT__EXPRESSION);

        basicCausalityConditionEClass = createEClass(BASIC_CAUSALITY_CONDITION);

        startConditionEClass = createEClass(START_CONDITION);

        disablingConditionEClass = createEClass(DISABLING_CONDITION);

        enablingConditionEClass = createEClass(ENABLING_CONDITION);

        synchronizationConditionEClass = createEClass(SYNCHRONIZATION_CONDITION);

        // Create enums
        uncertaintyEEnum = createEEnum(UNCERTAINTY);
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
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        pointConditionEClass.getESuperTypes().add(this.getBasicCausalityCondition());
        exitPointConditionEClass.getESuperTypes().add(this.getPointCondition());
        entryPointConditionEClass.getESuperTypes().add(this.getPointCondition());
        binaryCausalityConditionEClass.getESuperTypes().add(this.getBasicCausalityCondition());
        orConditionEClass.getESuperTypes().add(this.getCausalityCondition());
        andConditionEClass.getESuperTypes().add(this.getCausalityCondition());
        causalityConditionEClass.getESuperTypes().add(theModelsPackage.getElement());
        basicCausalityConditionEClass.getESuperTypes().add(this.getCausalityCondition());
        startConditionEClass.getESuperTypes().add(this.getBasicCausalityCondition());
        disablingConditionEClass.getESuperTypes().add(this.getBinaryCausalityCondition());
        enablingConditionEClass.getESuperTypes().add(this.getBinaryCausalityCondition());
        synchronizationConditionEClass.getESuperTypes().add(this.getBinaryCausalityCondition());

        // Initialize classes, features, and operations; add parameters
        initEClass(pointConditionEClass, PointCondition.class, "PointCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exitPointConditionEClass, ExitPointCondition.class, "ExitPointCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExitPointCondition_Exit(), theInstantiationPackage.getExitPointOfInstantiation(), null, "exit", null, 1, 1, ExitPointCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExitPointCondition_Context(), theInstantiationPackage.getBehaviorInstantiation(), null, "context", null, 0, 1, ExitPointCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entryPointConditionEClass, EntryPointCondition.class, "EntryPointCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntryPointCondition_Entry(), theInstantiationPackage.getEntryPointOfInstantiation(), null, "entry", null, 1, 1, EntryPointCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(binaryCausalityConditionEClass, BinaryCausalityCondition.class, "BinaryCausalityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBinaryCausalityCondition_Source(), this.getCausalityParameter(), null, "source", null, 1, 1, BinaryCausalityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(orConditionEClass, OrCondition.class, "OrCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOrCondition_Conditions(), this.getAndCondition(), null, "conditions", null, 0, -1, OrCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(andConditionEClass, AndCondition.class, "AndCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAndCondition_Conditions(), this.getBasicCausalityCondition(), null, "conditions", null, 0, -1, AndCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAndCondition_Constraints(), this.getCausalityConstraint(), null, "constraints", null, 0, -1, AndCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(causalityParameterEClass, CausalityParameter.class, "CausalityParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCausalityParameter_Constraints(), theConstraintPackage.getDataConstraint(), null, "constraints", null, 0, -1, CausalityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCausalityParameter_VariableAssignments(), theVariablePackage_1.getVariableAssignment(), null, "variableAssignments", null, 0, -1, CausalityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(causalityConditionEClass, CausalityCondition.class, "CausalityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCausalityCondition_Uncertainty(), this.getUncertainty(), "uncertainty", null, 0, 1, CausalityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(causalityRelationEClass, CausalityRelation.class, "CausalityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCausalityRelation_Condition(), this.getCausalityCondition(), null, "condition", null, 1, 1, CausalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCausalityRelation_Target(), this.getCausalityParameter(), null, "target", null, 1, 1, CausalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCausalityRelation_Context(), theTypePackage.getAbstractBehaviorType(), theTypePackage.getAbstractBehaviorType_CausalityRelations(), "context", null, 0, 1, CausalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCausalityRelation_Id(), ecorePackage.getEString(), "id", null, 0, 1, CausalityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(causalityConstraintEClass, CausalityConstraint.class, "CausalityConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCausalityConstraint_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, CausalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(basicCausalityConditionEClass, BasicCausalityCondition.class, "BasicCausalityCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(startConditionEClass, StartCondition.class, "StartCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(disablingConditionEClass, DisablingCondition.class, "DisablingCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(enablingConditionEClass, EnablingCondition.class, "EnablingCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(synchronizationConditionEClass, SynchronizationCondition.class, "SynchronizationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(uncertaintyEEnum, Uncertainty.class, "Uncertainty");
        addEEnumLiteral(uncertaintyEEnum, Uncertainty.MAY);
        addEEnumLiteral(uncertaintyEEnum, Uncertainty.MUST);
    }

} //CausalityPackageImpl
