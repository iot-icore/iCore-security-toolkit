/**
 */
package rule.condition.impl;

import models.ModelsPackage;

import models.variable.VariablePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

import rule.action.ActionPackage;

import rule.action.impl.ActionPackageImpl;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.Binary;
import rule.condition.ConditionFactory;
import rule.condition.ConditionPackage;
import rule.condition.Constant;
import rule.condition.EventPattern;
import rule.condition.FormulaAssignment;
import rule.condition.FormulaInstantiation;
import rule.condition.FormulaTemplate;
import rule.condition.FormulaVariable;
import rule.condition.FormulaVariableReference;
import rule.condition.Multiary;
import rule.condition.Nullary;
import rule.condition.Operator;
import rule.condition.PatternOperator;
import rule.condition.TimeStepEventPattern;
import rule.condition.TruthValue;
import rule.condition.Unary;

import rule.event.EventPackage;

import rule.event.impl.EventPackageImpl;

import rule.impl.RulePackageImpl;

import rule.propositional.PropositionalPackage;

import rule.propositional.impl.PropositionalPackageImpl;

import rule.state.StatePackage;

import rule.state.impl.StatePackageImpl;

import rule.template.TemplatePackage;

import rule.template.impl.TemplatePackageImpl;

import rule.temporal.TemporalPackage;

import rule.temporal.impl.TemporalPackageImpl;

import rule.test.TestPackage;

import rule.test.impl.TestPackageImpl;

import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionPackageImpl extends EPackageImpl implements ConditionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass atomEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeStepEventPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaVariableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nullaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass patternOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum truthValueEEnum = null;

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
     * @see rule.condition.ConditionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ConditionPackageImpl() {
        super(eNS_URI, ConditionFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ConditionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ConditionPackage init() {
        if (isInited) return (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);

        // Obtain or create and register package
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConditionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theConditionPackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theConditionPackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theConditionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ConditionPackage.eNS_URI, theConditionPackage);
        return theConditionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAtom() {
        return atomEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAtom_VariableAssignments() {
        return (EReference)atomEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAtom_Operator() {
        return (EReference)atomEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAtom_Template() {
        return (EReference)atomEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperator() {
        return operatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperator_Operands() {
        return (EReference)operatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstant() {
        return constantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConstant_Value() {
        return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormulaTemplate() {
        return formulaTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaTemplate_VariableDeclarations() {
        return (EReference)formulaTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaTemplate_VariableAssignments() {
        return (EReference)formulaTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormulaTemplate_Name() {
        return (EAttribute)formulaTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormulaTemplate_Description() {
        return (EAttribute)formulaTemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaTemplate_RootAtom() {
        return (EReference)formulaTemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormulaInstantiation() {
        return formulaInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaInstantiation_FormulaTemplate() {
        return (EReference)formulaInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventPattern() {
        return eventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventPattern_Modality() {
        return (EAttribute)eventPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeStepEventPattern() {
        return timeStepEventPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepEventPattern_TimestampPattern() {
        return (EReference)timeStepEventPatternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormulaVariableReference() {
        return formulaVariableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaVariableReference_Variable() {
        return (EReference)formulaVariableReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormulaAssignment() {
        return formulaAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormulaAssignment_Value() {
        return (EReference)formulaAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormulaVariable() {
        return formulaVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnary() {
        return unaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinary() {
        return binaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiary() {
        return multiaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNullary() {
        return nullaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArity() {
        return arityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPatternOperator() {
        return patternOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPatternOperator_Operands() {
        return (EReference)patternOperatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTruthValue() {
        return truthValueEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionFactory getConditionFactory() {
        return (ConditionFactory)getEFactoryInstance();
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
        atomEClass = createEClass(ATOM);
        createEReference(atomEClass, ATOM__VARIABLE_ASSIGNMENTS);
        createEReference(atomEClass, ATOM__OPERATOR);
        createEReference(atomEClass, ATOM__TEMPLATE);

        operatorEClass = createEClass(OPERATOR);
        createEReference(operatorEClass, OPERATOR__OPERANDS);

        constantEClass = createEClass(CONSTANT);
        createEAttribute(constantEClass, CONSTANT__VALUE);

        formulaTemplateEClass = createEClass(FORMULA_TEMPLATE);
        createEReference(formulaTemplateEClass, FORMULA_TEMPLATE__VARIABLE_DECLARATIONS);
        createEReference(formulaTemplateEClass, FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS);
        createEAttribute(formulaTemplateEClass, FORMULA_TEMPLATE__NAME);
        createEAttribute(formulaTemplateEClass, FORMULA_TEMPLATE__DESCRIPTION);
        createEReference(formulaTemplateEClass, FORMULA_TEMPLATE__ROOT_ATOM);

        formulaInstantiationEClass = createEClass(FORMULA_INSTANTIATION);
        createEReference(formulaInstantiationEClass, FORMULA_INSTANTIATION__FORMULA_TEMPLATE);

        eventPatternEClass = createEClass(EVENT_PATTERN);
        createEAttribute(eventPatternEClass, EVENT_PATTERN__MODALITY);

        timeStepEventPatternEClass = createEClass(TIME_STEP_EVENT_PATTERN);
        createEReference(timeStepEventPatternEClass, TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN);

        formulaVariableReferenceEClass = createEClass(FORMULA_VARIABLE_REFERENCE);
        createEReference(formulaVariableReferenceEClass, FORMULA_VARIABLE_REFERENCE__VARIABLE);

        formulaAssignmentEClass = createEClass(FORMULA_ASSIGNMENT);
        createEReference(formulaAssignmentEClass, FORMULA_ASSIGNMENT__VALUE);

        formulaVariableEClass = createEClass(FORMULA_VARIABLE);

        unaryEClass = createEClass(UNARY);

        binaryEClass = createEClass(BINARY);

        multiaryEClass = createEClass(MULTIARY);

        nullaryEClass = createEClass(NULLARY);

        arityEClass = createEClass(ARITY);

        patternOperatorEClass = createEClass(PATTERN_OPERATOR);
        createEReference(patternOperatorEClass, PATTERN_OPERATOR__OPERANDS);

        // Create enums
        truthValueEEnum = createEEnum(TRUTH_VALUE);
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
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
        TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);
        EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
        TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        atomEClass.getESuperTypes().add(theModelsPackage.getElement());
        operatorEClass.getESuperTypes().add(this.getAtom());
        constantEClass.getESuperTypes().add(this.getAtom());
        constantEClass.getESuperTypes().add(this.getNullary());
        formulaTemplateEClass.getESuperTypes().add(theModelsPackage.getElement());
        formulaTemplateEClass.getESuperTypes().add(theTemplatePackage.getTemplate());
        formulaInstantiationEClass.getESuperTypes().add(this.getAtom());
        formulaInstantiationEClass.getESuperTypes().add(this.getNullary());
        eventPatternEClass.getESuperTypes().add(theModelsPackage.getPattern());
        eventPatternEClass.getESuperTypes().add(this.getNullary());
        eventPatternEClass.getESuperTypes().add(this.getAtom());
        timeStepEventPatternEClass.getESuperTypes().add(this.getEventPattern());
        formulaVariableReferenceEClass.getESuperTypes().add(this.getAtom());
        formulaVariableReferenceEClass.getESuperTypes().add(theVariablePackage.getVariableReference());
        formulaAssignmentEClass.getESuperTypes().add(theVariablePackage.getStaticAssignment());
        formulaVariableEClass.getESuperTypes().add(theVariablePackage.getVariableDeclaration());
        unaryEClass.getESuperTypes().add(this.getArity());
        binaryEClass.getESuperTypes().add(this.getArity());
        multiaryEClass.getESuperTypes().add(this.getArity());
        nullaryEClass.getESuperTypes().add(this.getArity());

        // Initialize classes, features, and operations; add parameters
        initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAtom_VariableAssignments(), theVariablePackage.getVariableAssignment(), null, "variableAssignments", null, 0, -1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAtom_Operator(), this.getOperator(), this.getOperator_Operands(), "operator", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAtom_Template(), theTemplatePackage.getTemplate(), null, "template", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperator_Operands(), this.getAtom(), this.getAtom_Operator(), "operands", null, 1, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConstant_Value(), this.getTruthValue(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaTemplateEClass, FormulaTemplate.class, "FormulaTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormulaTemplate_VariableDeclarations(), theVariablePackage.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, FormulaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormulaTemplate_VariableAssignments(), theVariablePackage.getVariableAssignment(), null, "variableAssignments", null, 0, -1, FormulaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormulaTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormulaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormulaTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, FormulaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormulaTemplate_RootAtom(), this.getAtom(), null, "rootAtom", null, 1, 1, FormulaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaInstantiationEClass, FormulaInstantiation.class, "FormulaInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormulaInstantiation_FormulaTemplate(), this.getFormulaTemplate(), null, "formulaTemplate", null, 1, 1, FormulaInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventPatternEClass, EventPattern.class, "EventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventPattern_Modality(), theEventPackage.getEventModality(), "modality", null, 0, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeStepEventPatternEClass, TimeStepEventPattern.class, "TimeStepEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimeStepEventPattern_TimestampPattern(), theTimePackage.getTimestampPattern(), null, "timestampPattern", null, 0, 1, TimeStepEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaVariableReferenceEClass, FormulaVariableReference.class, "FormulaVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormulaVariableReference_Variable(), this.getFormulaVariable(), null, "variable", null, 1, 1, FormulaVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaAssignmentEClass, FormulaAssignment.class, "FormulaAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormulaAssignment_Value(), this.getAtom(), null, "value", null, 1, 1, FormulaAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaVariableEClass, FormulaVariable.class, "FormulaVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryEClass, Unary.class, "Unary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(binaryEClass, Binary.class, "Binary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(multiaryEClass, Multiary.class, "Multiary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nullaryEClass, Nullary.class, "Nullary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(arityEClass, Arity.class, "Arity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(patternOperatorEClass, PatternOperator.class, "PatternOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPatternOperator_Operands(), this.getPatternOperator(), null, "operands", null, 0, 1, PatternOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(truthValueEEnum, TruthValue.class, "TruthValue");
        addEEnumLiteral(truthValueEEnum, TruthValue.UNDETERMINED);
        addEEnumLiteral(truthValueEEnum, TruthValue.TRUE);
        addEEnumLiteral(truthValueEEnum, TruthValue.FALSE);
    }

} //ConditionPackageImpl
