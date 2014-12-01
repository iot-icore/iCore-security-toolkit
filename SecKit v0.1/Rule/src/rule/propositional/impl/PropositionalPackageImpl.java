/**
 */
package rule.propositional.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

import rule.action.ActionPackage;

import rule.action.impl.ActionPackageImpl;

import rule.condition.ConditionPackage;

import rule.condition.impl.ConditionPackageImpl;

import rule.event.EventPackage;

import rule.event.impl.EventPackageImpl;

import rule.impl.RulePackageImpl;

import rule.propositional.And;
import rule.propositional.Implies;
import rule.propositional.Not;
import rule.propositional.Or;
import rule.propositional.PropositionalFactory;
import rule.propositional.PropositionalOperator;
import rule.propositional.PropositionalPackage;

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
public class PropositionalPackageImpl extends EPackageImpl implements PropositionalPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass andEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass orEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass notEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass impliesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propositionalOperatorEClass = null;

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
     * @see rule.propositional.PropositionalPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PropositionalPackageImpl() {
        super(eNS_URI, PropositionalFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PropositionalPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PropositionalPackage init() {
        if (isInited) return (PropositionalPackage)EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI);

        // Obtain or create and register package
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropositionalPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        thePropositionalPackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        thePropositionalPackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePropositionalPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PropositionalPackage.eNS_URI, thePropositionalPackage);
        return thePropositionalPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnd() {
        return andEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOr() {
        return orEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNot() {
        return notEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImplies() {
        return impliesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropositionalOperator() {
        return propositionalOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropositionalFactory getPropositionalFactory() {
        return (PropositionalFactory)getEFactoryInstance();
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
        andEClass = createEClass(AND);

        orEClass = createEClass(OR);

        notEClass = createEClass(NOT);

        impliesEClass = createEClass(IMPLIES);

        propositionalOperatorEClass = createEClass(PROPOSITIONAL_OPERATOR);
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
        ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        andEClass.getESuperTypes().add(this.getPropositionalOperator());
        andEClass.getESuperTypes().add(theConditionPackage.getMultiary());
        orEClass.getESuperTypes().add(this.getPropositionalOperator());
        orEClass.getESuperTypes().add(theConditionPackage.getMultiary());
        notEClass.getESuperTypes().add(this.getPropositionalOperator());
        notEClass.getESuperTypes().add(theConditionPackage.getUnary());
        impliesEClass.getESuperTypes().add(this.getPropositionalOperator());
        impliesEClass.getESuperTypes().add(theConditionPackage.getBinary());
        propositionalOperatorEClass.getESuperTypes().add(theConditionPackage.getOperator());

        // Initialize classes, features, and operations; add parameters
        initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(impliesEClass, Implies.class, "Implies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propositionalOperatorEClass, PropositionalOperator.class, "PropositionalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //PropositionalPackageImpl
