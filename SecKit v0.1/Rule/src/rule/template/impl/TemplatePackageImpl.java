/**
 */
package rule.template.impl;

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

import rule.condition.ConditionPackage;

import rule.condition.impl.ConditionPackageImpl;

import rule.event.EventPackage;

import rule.event.impl.EventPackageImpl;

import rule.impl.RulePackageImpl;

import rule.propositional.PropositionalPackage;

import rule.propositional.impl.PropositionalPackageImpl;

import rule.state.StatePackage;

import rule.state.impl.StatePackageImpl;

import rule.template.AllowOverrides;
import rule.template.CombiningAlgorithm;
import rule.template.DenyOverrides;
import rule.template.DisposalStrategy;
import rule.template.FirstApplicable;
import rule.template.InstantiationStrategy;
import rule.template.RuleInstance;
import rule.template.RuleInstanceVariable;
import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.RuleTemplateVariable;
import rule.template.RuleVariable;
import rule.template.RuleXPathVariableAssignment;
import rule.template.Template;
import rule.template.TemplateFactory;
import rule.template.TemplatePackage;
import rule.template.TimeStepRuleSet;
import rule.template.TimeStepSize;
import rule.template.TimeStepVariable;
import rule.template.XPathContext;

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
public class TemplatePackageImpl extends EPackageImpl implements TemplatePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleTemplateConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleInstanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleTemplateVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleInstanceVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleXPathVariableAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleTemplatePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass combiningAlgorithmEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass firstApplicableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allowOverridesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass denyOverridesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeStepSizeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeStepRuleSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass templateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeStepVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum disposalStrategyEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum xPathContextEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum instantiationStrategyEEnum = null;

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
     * @see rule.template.TemplatePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TemplatePackageImpl() {
        super(eNS_URI, TemplateFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TemplatePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TemplatePackage init() {
        if (isInited) return (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);

        // Obtain or create and register package
        TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemplatePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TimePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        RulePackageImpl theRulePackage = (RulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) instanceof RulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI) : RulePackage.eINSTANCE);
        StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
        TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        PropositionalPackageImpl thePropositionalPackage = (PropositionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) instanceof PropositionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropositionalPackage.eNS_URI) : PropositionalPackage.eINSTANCE);
        TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theTemplatePackage.createPackageContents();
        theRulePackage.createPackageContents();
        theStatePackage.createPackageContents();
        theTestPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        thePropositionalPackage.createPackageContents();
        theTemporalPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theTemplatePackage.initializePackageContents();
        theRulePackage.initializePackageContents();
        theStatePackage.initializePackageContents();
        theTestPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        thePropositionalPackage.initializePackageContents();
        theTemporalPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTemplatePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TemplatePackage.eNS_URI, theTemplatePackage);
        return theTemplatePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleTemplate() {
        return ruleTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_VariableDeclarations() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplate_Name() {
        return (EAttribute)ruleTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplate_Description() {
        return (EAttribute)ruleTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Event() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Condition() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_EvaluationAssignments() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Configurations() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_ContainedConfigurations() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Authorize() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_CombiningAlgorithm() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Package() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplate_Execute() {
        return (EReference)ruleTemplateEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleTemplateConfiguration() {
        return ruleTemplateConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplateConfiguration_Name() {
        return (EAttribute)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplateConfiguration_Description() {
        return (EAttribute)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplateConfiguration_InstantiationStrategy() {
        return (EAttribute)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplateConfiguration_DisposalStrategy() {
        return (EAttribute)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_EvaluationAssignments() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_ConfigurationAssignments() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_Template() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_ContainerTemplate() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_DisposalConfiguration() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_Package() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateConfiguration_TimeStepSize() {
        return (EReference)ruleTemplateConfigurationEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleInstance() {
        return ruleInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_InstantiationRule() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_VariableInstances() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_States() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_ConditionState() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_TriggerEventState() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_Template() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_RuleSet() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_Configuration() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleInstance_TimeStep() {
        return (EAttribute)ruleInstanceEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleInstance_Value() {
        return (EAttribute)ruleInstanceEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_DisposalRuleInstance() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_InstancesToDispose() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_CreatedInstances() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstance_ContainedInstances() {
        return (EReference)ruleInstanceEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleVariable() {
        return ruleVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleTemplateVariable() {
        return ruleTemplateVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplateVariable_Template() {
        return (EReference)ruleTemplateVariableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleInstanceVariable() {
        return ruleInstanceVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleInstanceVariable_MechanismInstance() {
        return (EReference)ruleInstanceVariableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleXPathVariableAssignment() {
        return ruleXPathVariableAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleXPathVariableAssignment_Context() {
        return (EAttribute)ruleXPathVariableAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRuleTemplatePackage() {
        return ruleTemplatePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRuleTemplatePackage_Name() {
        return (EAttribute)ruleTemplatePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplatePackage_Templates() {
        return (EReference)ruleTemplatePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplatePackage_SubPackages() {
        return (EReference)ruleTemplatePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplatePackage_FormulaTemplates() {
        return (EReference)ruleTemplatePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplatePackage_Model() {
        return (EReference)ruleTemplatePackageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRuleTemplatePackage_Configurations() {
        return (EReference)ruleTemplatePackageEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCombiningAlgorithm() {
        return combiningAlgorithmEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCombiningAlgorithm_Template() {
        return (EReference)combiningAlgorithmEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFirstApplicable() {
        return firstApplicableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAllowOverrides() {
        return allowOverridesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDenyOverrides() {
        return denyOverridesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeStepSize() {
        return timeStepSizeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepSize_TimeDuration() {
        return (EReference)timeStepSizeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepSize_RuleSet() {
        return (EReference)timeStepSizeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeStepRuleSet() {
        return timeStepRuleSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_Rules() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_Clock() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_LastUpdate() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_RulesToRemove() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_TimeStepSize() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimeStepRuleSet_ConfigurationsToInstantiate() {
        return (EReference)timeStepRuleSetEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemplate() {
        return templateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeStepVariable() {
        return timeStepVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDisposalStrategy() {
        return disposalStrategyEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getXPathContext() {
        return xPathContextEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getInstantiationStrategy() {
        return instantiationStrategyEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateFactory getTemplateFactory() {
        return (TemplateFactory)getEFactoryInstance();
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
        ruleTemplateEClass = createEClass(RULE_TEMPLATE);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__VARIABLE_DECLARATIONS);
        createEAttribute(ruleTemplateEClass, RULE_TEMPLATE__NAME);
        createEAttribute(ruleTemplateEClass, RULE_TEMPLATE__DESCRIPTION);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__EVENT);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__CONDITION);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__EVALUATION_ASSIGNMENTS);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__CONFIGURATIONS);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__CONTAINED_CONFIGURATIONS);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__AUTHORIZE);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__COMBINING_ALGORITHM);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__PACKAGE);
        createEReference(ruleTemplateEClass, RULE_TEMPLATE__EXECUTE);

        ruleTemplateConfigurationEClass = createEClass(RULE_TEMPLATE_CONFIGURATION);
        createEAttribute(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__NAME);
        createEAttribute(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__DESCRIPTION);
        createEAttribute(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY);
        createEAttribute(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__TEMPLATE);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__PACKAGE);
        createEReference(ruleTemplateConfigurationEClass, RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE);

        ruleInstanceEClass = createEClass(RULE_INSTANCE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__INSTANTIATION_RULE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__VARIABLE_INSTANCES);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__STATES);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__CONDITION_STATE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__TRIGGER_EVENT_STATE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__TEMPLATE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__RULE_SET);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__CONFIGURATION);
        createEAttribute(ruleInstanceEClass, RULE_INSTANCE__TIME_STEP);
        createEAttribute(ruleInstanceEClass, RULE_INSTANCE__VALUE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__DISPOSAL_RULE_INSTANCE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__INSTANCES_TO_DISPOSE);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__CREATED_INSTANCES);
        createEReference(ruleInstanceEClass, RULE_INSTANCE__CONTAINED_INSTANCES);

        ruleVariableEClass = createEClass(RULE_VARIABLE);

        ruleTemplateVariableEClass = createEClass(RULE_TEMPLATE_VARIABLE);
        createEReference(ruleTemplateVariableEClass, RULE_TEMPLATE_VARIABLE__TEMPLATE);

        ruleInstanceVariableEClass = createEClass(RULE_INSTANCE_VARIABLE);
        createEReference(ruleInstanceVariableEClass, RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE);

        ruleXPathVariableAssignmentEClass = createEClass(RULE_XPATH_VARIABLE_ASSIGNMENT);
        createEAttribute(ruleXPathVariableAssignmentEClass, RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT);

        ruleTemplatePackageEClass = createEClass(RULE_TEMPLATE_PACKAGE);
        createEAttribute(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__NAME);
        createEReference(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__TEMPLATES);
        createEReference(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__SUB_PACKAGES);
        createEReference(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES);
        createEReference(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__MODEL);
        createEReference(ruleTemplatePackageEClass, RULE_TEMPLATE_PACKAGE__CONFIGURATIONS);

        combiningAlgorithmEClass = createEClass(COMBINING_ALGORITHM);
        createEReference(combiningAlgorithmEClass, COMBINING_ALGORITHM__TEMPLATE);

        firstApplicableEClass = createEClass(FIRST_APPLICABLE);

        allowOverridesEClass = createEClass(ALLOW_OVERRIDES);

        denyOverridesEClass = createEClass(DENY_OVERRIDES);

        timeStepSizeEClass = createEClass(TIME_STEP_SIZE);
        createEReference(timeStepSizeEClass, TIME_STEP_SIZE__TIME_DURATION);
        createEReference(timeStepSizeEClass, TIME_STEP_SIZE__RULE_SET);

        timeStepRuleSetEClass = createEClass(TIME_STEP_RULE_SET);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__RULES);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__CLOCK);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__LAST_UPDATE);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__RULES_TO_REMOVE);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__TIME_STEP_SIZE);
        createEReference(timeStepRuleSetEClass, TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE);

        templateEClass = createEClass(TEMPLATE);

        timeStepVariableEClass = createEClass(TIME_STEP_VARIABLE);

        // Create enums
        disposalStrategyEEnum = createEEnum(DISPOSAL_STRATEGY);
        xPathContextEEnum = createEEnum(XPATH_CONTEXT);
        instantiationStrategyEEnum = createEEnum(INSTANTIATION_STRATEGY);
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
        ConditionPackage theConditionPackage = (ConditionPackage)EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);
        ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
        StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
        RulePackage theRulePackage = (RulePackage)EPackage.Registry.INSTANCE.getEPackage(RulePackage.eNS_URI);
        TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        ruleTemplateEClass.getESuperTypes().add(theModelsPackage.getElement());
        ruleTemplateEClass.getESuperTypes().add(this.getTemplate());
        ruleTemplateConfigurationEClass.getESuperTypes().add(theModelsPackage.getElement());
        ruleInstanceEClass.getESuperTypes().add(theModelsPackage.getElement());
        ruleVariableEClass.getESuperTypes().add(theVariablePackage.getVariableDeclaration());
        ruleTemplateVariableEClass.getESuperTypes().add(this.getRuleVariable());
        ruleInstanceVariableEClass.getESuperTypes().add(this.getRuleVariable());
        ruleXPathVariableAssignmentEClass.getESuperTypes().add(theVariablePackage.getXPathVariableAssignment());
        ruleTemplatePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        combiningAlgorithmEClass.getESuperTypes().add(theModelsPackage.getElement());
        firstApplicableEClass.getESuperTypes().add(this.getCombiningAlgorithm());
        allowOverridesEClass.getESuperTypes().add(this.getCombiningAlgorithm());
        denyOverridesEClass.getESuperTypes().add(this.getCombiningAlgorithm());
        timeStepSizeEClass.getESuperTypes().add(theModelsPackage.getElement());
        timeStepRuleSetEClass.getESuperTypes().add(theModelsPackage.getElement());
        timeStepVariableEClass.getESuperTypes().add(theVariablePackage.getVariableDeclaration());

        // Initialize classes, features, and operations; add parameters
        initEClass(ruleTemplateEClass, RuleTemplate.class, "RuleTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRuleTemplate_VariableDeclarations(), theVariablePackage.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Event(), theConditionPackage.getEventPattern(), null, "event", null, 0, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Condition(), theConditionPackage.getAtom(), null, "condition", null, 1, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_EvaluationAssignments(), theVariablePackage.getVariableAssignment(), null, "evaluationAssignments", null, 0, -1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Configurations(), this.getRuleTemplateConfiguration(), this.getRuleTemplateConfiguration_Template(), "configurations", null, 0, -1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_ContainedConfigurations(), this.getRuleTemplateConfiguration(), this.getRuleTemplateConfiguration_ContainerTemplate(), "containedConfigurations", null, 0, -1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Authorize(), theActionPackage.getAuthorization(), theActionPackage.getAuthorization_Template(), "authorize", null, 0, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_CombiningAlgorithm(), this.getCombiningAlgorithm(), this.getCombiningAlgorithm_Template(), "combiningAlgorithm", null, 1, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Package(), this.getRuleTemplatePackage(), this.getRuleTemplatePackage_Templates(), "package", null, 1, 1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplate_Execute(), theActionPackage.getExecute(), theActionPackage.getExecute_Template(), "execute", null, 0, -1, RuleTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleTemplateConfigurationEClass, RuleTemplateConfiguration.class, "RuleTemplateConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRuleTemplateConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleTemplateConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleTemplateConfiguration_InstantiationStrategy(), this.getInstantiationStrategy(), "instantiationStrategy", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleTemplateConfiguration_DisposalStrategy(), this.getDisposalStrategy(), "disposalStrategy", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_EvaluationAssignments(), theVariablePackage.getVariableAssignment(), null, "evaluationAssignments", null, 0, -1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_ConfigurationAssignments(), theVariablePackage.getVariableAssignment(), null, "configurationAssignments", null, 0, -1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_Template(), this.getRuleTemplate(), this.getRuleTemplate_Configurations(), "template", null, 1, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_ContainerTemplate(), this.getRuleTemplate(), this.getRuleTemplate_ContainedConfigurations(), "containerTemplate", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_DisposalConfiguration(), this.getRuleTemplateConfiguration(), null, "disposalConfiguration", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_Package(), this.getRuleTemplatePackage(), this.getRuleTemplatePackage_Configurations(), "package", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplateConfiguration_TimeStepSize(), this.getTimeStepSize(), null, "timeStepSize", null, 0, 1, RuleTemplateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleInstanceEClass, RuleInstance.class, "RuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRuleInstance_InstantiationRule(), this.getRuleInstance(), this.getRuleInstance_CreatedInstances(), "instantiationRule", null, 0, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_VariableInstances(), theVariablePackage.getVariableInstance(), null, "variableInstances", null, 0, -1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_States(), theStatePackage.getState(), theStatePackage.getState_RuleInstance(), "states", null, 0, -1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_ConditionState(), theStatePackage.getState(), null, "conditionState", null, 1, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_TriggerEventState(), theStatePackage.getEventPatternState(), null, "triggerEventState", null, 1, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_Template(), this.getRuleTemplate(), null, "template", null, 0, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_RuleSet(), this.getTimeStepRuleSet(), this.getTimeStepRuleSet_Rules(), "ruleSet", null, 1, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_Configuration(), this.getRuleTemplateConfiguration(), null, "configuration", null, 1, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleInstance_TimeStep(), ecorePackage.getELong(), "timeStep", null, 0, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuleInstance_Value(), theConditionPackage.getTruthValue(), "value", null, 0, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_DisposalRuleInstance(), this.getRuleInstance(), this.getRuleInstance_InstancesToDispose(), "disposalRuleInstance", null, 0, 1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_InstancesToDispose(), this.getRuleInstance(), this.getRuleInstance_DisposalRuleInstance(), "instancesToDispose", null, 0, -1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_CreatedInstances(), this.getRuleInstance(), this.getRuleInstance_InstantiationRule(), "createdInstances", null, 0, -1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleInstance_ContainedInstances(), this.getRuleInstance(), null, "containedInstances", null, 0, -1, RuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleVariableEClass, RuleVariable.class, "RuleVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ruleTemplateVariableEClass, RuleTemplateVariable.class, "RuleTemplateVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRuleTemplateVariable_Template(), this.getRuleTemplate(), null, "template", null, 1, 1, RuleTemplateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleInstanceVariableEClass, RuleInstanceVariable.class, "RuleInstanceVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRuleInstanceVariable_MechanismInstance(), this.getRuleInstance(), null, "mechanismInstance", null, 1, 1, RuleInstanceVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleXPathVariableAssignmentEClass, RuleXPathVariableAssignment.class, "RuleXPathVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRuleXPathVariableAssignment_Context(), this.getXPathContext(), "context", null, 0, 1, RuleXPathVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleTemplatePackageEClass, RuleTemplatePackage.class, "RuleTemplatePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRuleTemplatePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplatePackage_Templates(), this.getRuleTemplate(), this.getRuleTemplate_Package(), "templates", null, 0, -1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplatePackage_SubPackages(), this.getRuleTemplatePackage(), null, "subPackages", null, 0, -1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplatePackage_FormulaTemplates(), theConditionPackage.getFormulaTemplate(), null, "formulaTemplates", null, 0, -1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplatePackage_Model(), theRulePackage.getRuleDesignModel(), theRulePackage.getRuleDesignModel_Packages(), "model", null, 0, 1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuleTemplatePackage_Configurations(), this.getRuleTemplateConfiguration(), this.getRuleTemplateConfiguration_Package(), "configurations", null, 0, -1, RuleTemplatePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(combiningAlgorithmEClass, CombiningAlgorithm.class, "CombiningAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCombiningAlgorithm_Template(), this.getRuleTemplate(), this.getRuleTemplate_CombiningAlgorithm(), "template", null, 1, 1, CombiningAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(firstApplicableEClass, FirstApplicable.class, "FirstApplicable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(allowOverridesEClass, AllowOverrides.class, "AllowOverrides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(denyOverridesEClass, DenyOverrides.class, "DenyOverrides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeStepSizeEClass, TimeStepSize.class, "TimeStepSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimeStepSize_TimeDuration(), theTimePackage.getTimeDuration(), null, "timeDuration", null, 0, 1, TimeStepSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepSize_RuleSet(), this.getTimeStepRuleSet(), this.getTimeStepRuleSet_TimeStepSize(), "ruleSet", null, 0, 1, TimeStepSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeStepRuleSetEClass, TimeStepRuleSet.class, "TimeStepRuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimeStepRuleSet_Rules(), this.getRuleInstance(), this.getRuleInstance_RuleSet(), "rules", null, 0, -1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepRuleSet_Clock(), theTimePackage.getDiscreteClock(), null, "clock", null, 0, 1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepRuleSet_LastUpdate(), theTimePackage.getTimestamp(), null, "lastUpdate", null, 0, 1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepRuleSet_RulesToRemove(), this.getRuleInstance(), null, "rulesToRemove", null, 0, -1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepRuleSet_TimeStepSize(), this.getTimeStepSize(), this.getTimeStepSize_RuleSet(), "timeStepSize", null, 0, 1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimeStepRuleSet_ConfigurationsToInstantiate(), this.getRuleTemplateConfiguration(), null, "configurationsToInstantiate", null, 0, -1, TimeStepRuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(templateEClass, Template.class, "Template", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeStepVariableEClass, TimeStepVariable.class, "TimeStepVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(disposalStrategyEEnum, DisposalStrategy.class, "DisposalStrategy");
        addEEnumLiteral(disposalStrategyEEnum, DisposalStrategy.NEVER);
        addEEnumLiteral(disposalStrategyEEnum, DisposalStrategy.AFTER_TRIGGERED);
        addEEnumLiteral(disposalStrategyEEnum, DisposalStrategy.WITH_PARENT);
        addEEnumLiteral(disposalStrategyEEnum, DisposalStrategy.CUSTOM_RULE);

        initEEnum(xPathContextEEnum, XPathContext.class, "XPathContext");
        addEEnumLiteral(xPathContextEEnum, XPathContext.TRIGGER_EVENT);
        addEEnumLiteral(xPathContextEEnum, XPathContext.TIME_STEP_EVENT_TRACE);

        initEEnum(instantiationStrategyEEnum, InstantiationStrategy.class, "InstantiationStrategy");
        addEEnumLiteral(instantiationStrategyEEnum, InstantiationStrategy.NOT_APPLICABLE);
        addEEnumLiteral(instantiationStrategyEEnum, InstantiationStrategy.WHEN_PARENT_INSTANTIATED);
        addEEnumLiteral(instantiationStrategyEEnum, InstantiationStrategy.WHEN_PARENT_TRIGGERED);
    }

} //TemplatePackageImpl
