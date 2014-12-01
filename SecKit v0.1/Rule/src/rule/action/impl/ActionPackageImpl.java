/**
 */
package rule.action.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

import rule.action.ActionBehavior;
import rule.action.ActionFactory;
import rule.action.ActionPackage;
import rule.action.Allow;
import rule.action.Authorization;
import rule.action.Constraint;
import rule.action.Delay;
import rule.action.Deny;
import rule.action.Execute;
import rule.action.Modify;

import rule.condition.ConditionPackage;

import rule.condition.impl.ConditionPackageImpl;

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
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionBehaviorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass denyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modifyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authorizationEClass = null;

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
    private EClass executeEClass = null;

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
     * @see rule.action.ActionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ActionPackageImpl() {
        super(eNS_URI, ActionFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ActionPackage init() {
        if (isInited) return (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

        // Obtain or create and register package
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI) : TemplatePackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theActionPackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theTemplatePackage.createPackageContents();
        theConditionPackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theActionPackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theTemplatePackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theActionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
        return theActionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionBehavior() {
        return actionBehaviorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAllow() {
        return allowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeny() {
        return denyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModify() {
        return modifyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelay() {
        return delayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthorization() {
        return authorizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorization_Constraints() {
        return (EReference)authorizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorization_Template() {
        return (EReference)authorizationEClass.getEStructuralFeatures().get(1);
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
    public EReference getConstraint_Authorization() {
        return (EReference)constraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecute() {
        return executeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecute_Template() {
        return (EReference)executeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionFactory getActionFactory() {
        return (ActionFactory)getEFactoryInstance();
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
        actionBehaviorEClass = createEClass(ACTION_BEHAVIOR);

        allowEClass = createEClass(ALLOW);

        denyEClass = createEClass(DENY);

        modifyEClass = createEClass(MODIFY);

        delayEClass = createEClass(DELAY);

        authorizationEClass = createEClass(AUTHORIZATION);
        createEReference(authorizationEClass, AUTHORIZATION__CONSTRAINTS);
        createEReference(authorizationEClass, AUTHORIZATION__TEMPLATE);

        constraintEClass = createEClass(CONSTRAINT);
        createEReference(constraintEClass, CONSTRAINT__AUTHORIZATION);

        executeEClass = createEClass(EXECUTE);
        createEReference(executeEClass, EXECUTE__TEMPLATE);
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
        TemplatePackage theTemplatePackage = (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        actionBehaviorEClass.getESuperTypes().add(theModelsPackage.getElement());
        allowEClass.getESuperTypes().add(this.getAuthorization());
        denyEClass.getESuperTypes().add(this.getAuthorization());
        modifyEClass.getESuperTypes().add(this.getConstraint());
        delayEClass.getESuperTypes().add(this.getConstraint());
        authorizationEClass.getESuperTypes().add(this.getActionBehavior());
        constraintEClass.getESuperTypes().add(this.getActionBehavior());
        executeEClass.getESuperTypes().add(this.getActionBehavior());

        // Initialize classes, features, and operations; add parameters
        initEClass(actionBehaviorEClass, ActionBehavior.class, "ActionBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(allowEClass, Allow.class, "Allow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(denyEClass, Deny.class, "Deny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(modifyEClass, Modify.class, "Modify", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(authorizationEClass, Authorization.class, "Authorization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAuthorization_Constraints(), this.getConstraint(), this.getConstraint_Authorization(), "constraints", null, 0, -1, Authorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAuthorization_Template(), theTemplatePackage.getRuleTemplate(), theTemplatePackage.getRuleTemplate_Authorize(), "template", null, 1, 1, Authorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstraint_Authorization(), this.getAuthorization(), this.getAuthorization_Constraints(), "authorization", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executeEClass, Execute.class, "Execute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecute_Template(), theTemplatePackage.getRuleTemplate(), theTemplatePackage.getRuleTemplate_Execute(), "template", null, 1, 1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //ActionPackageImpl
