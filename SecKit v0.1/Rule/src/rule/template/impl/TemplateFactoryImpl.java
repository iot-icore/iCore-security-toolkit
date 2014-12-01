/**
 */
package rule.template.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.template.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateFactoryImpl extends EFactoryImpl implements TemplateFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TemplateFactory init() {
        try {
            TemplateFactory theTemplateFactory = (TemplateFactory)EPackage.Registry.INSTANCE.getEFactory(TemplatePackage.eNS_URI);
            if (theTemplateFactory != null) {
                return theTemplateFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TemplateFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TemplatePackage.RULE_TEMPLATE: return createRuleTemplate();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION: return createRuleTemplateConfiguration();
            case TemplatePackage.RULE_INSTANCE: return createRuleInstance();
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT: return createRuleXPathVariableAssignment();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE: return createRuleTemplatePackage();
            case TemplatePackage.FIRST_APPLICABLE: return createFirstApplicable();
            case TemplatePackage.ALLOW_OVERRIDES: return createAllowOverrides();
            case TemplatePackage.DENY_OVERRIDES: return createDenyOverrides();
            case TemplatePackage.TIME_STEP_SIZE: return createTimeStepSize();
            case TemplatePackage.TIME_STEP_RULE_SET: return createTimeStepRuleSet();
            case TemplatePackage.TIME_STEP_VARIABLE: return createTimeStepVariable();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case TemplatePackage.DISPOSAL_STRATEGY:
                return createDisposalStrategyFromString(eDataType, initialValue);
            case TemplatePackage.XPATH_CONTEXT:
                return createXPathContextFromString(eDataType, initialValue);
            case TemplatePackage.INSTANTIATION_STRATEGY:
                return createInstantiationStrategyFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case TemplatePackage.DISPOSAL_STRATEGY:
                return convertDisposalStrategyToString(eDataType, instanceValue);
            case TemplatePackage.XPATH_CONTEXT:
                return convertXPathContextToString(eDataType, instanceValue);
            case TemplatePackage.INSTANTIATION_STRATEGY:
                return convertInstantiationStrategyToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate createRuleTemplate() {
        RuleTemplateImpl ruleTemplate = new RuleTemplateImpl();
        return ruleTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplateConfiguration createRuleTemplateConfiguration() {
        RuleTemplateConfigurationImpl ruleTemplateConfiguration = new RuleTemplateConfigurationImpl();
        return ruleTemplateConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance createRuleInstance() {
        RuleInstanceImpl ruleInstance = new RuleInstanceImpl();
        return ruleInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleXPathVariableAssignment createRuleXPathVariableAssignment() {
        RuleXPathVariableAssignmentImpl ruleXPathVariableAssignment = new RuleXPathVariableAssignmentImpl();
        return ruleXPathVariableAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplatePackage createRuleTemplatePackage() {
        RuleTemplatePackageImpl ruleTemplatePackage = new RuleTemplatePackageImpl();
        return ruleTemplatePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FirstApplicable createFirstApplicable() {
        FirstApplicableImpl firstApplicable = new FirstApplicableImpl();
        return firstApplicable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AllowOverrides createAllowOverrides() {
        AllowOverridesImpl allowOverrides = new AllowOverridesImpl();
        return allowOverrides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DenyOverrides createDenyOverrides() {
        DenyOverridesImpl denyOverrides = new DenyOverridesImpl();
        return denyOverrides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize createTimeStepSize() {
        TimeStepSizeImpl timeStepSize = new TimeStepSizeImpl();
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepRuleSet createTimeStepRuleSet() {
        TimeStepRuleSetImpl timeStepRuleSet = new TimeStepRuleSetImpl();
        return timeStepRuleSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepVariable createTimeStepVariable() {
        TimeStepVariableImpl timeStepVariable = new TimeStepVariableImpl();
        return timeStepVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisposalStrategy createDisposalStrategyFromString(EDataType eDataType, String initialValue) {
        DisposalStrategy result = DisposalStrategy.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisposalStrategyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPathContext createXPathContextFromString(EDataType eDataType, String initialValue) {
        XPathContext result = XPathContext.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXPathContextToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationStrategy createInstantiationStrategyFromString(EDataType eDataType, String initialValue) {
        InstantiationStrategy result = InstantiationStrategy.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInstantiationStrategyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplatePackage getTemplatePackage() {
        return (TemplatePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TemplatePackage getPackage() {
        return TemplatePackage.eINSTANCE;
    }

} //TemplateFactoryImpl
