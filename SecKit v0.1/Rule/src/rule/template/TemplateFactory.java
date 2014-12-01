/**
 */
package rule.template;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage
 * @generated
 */
public interface TemplateFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TemplateFactory eINSTANCE = rule.template.impl.TemplateFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Rule Template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule Template</em>'.
     * @generated
     */
    RuleTemplate createRuleTemplate();

    /**
     * Returns a new object of class '<em>Rule Template Configuration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule Template Configuration</em>'.
     * @generated
     */
    RuleTemplateConfiguration createRuleTemplateConfiguration();

    /**
     * Returns a new object of class '<em>Rule Instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule Instance</em>'.
     * @generated
     */
    RuleInstance createRuleInstance();

    /**
     * Returns a new object of class '<em>Rule XPath Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule XPath Variable Assignment</em>'.
     * @generated
     */
    RuleXPathVariableAssignment createRuleXPathVariableAssignment();

    /**
     * Returns a new object of class '<em>Rule Template Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule Template Package</em>'.
     * @generated
     */
    RuleTemplatePackage createRuleTemplatePackage();

    /**
     * Returns a new object of class '<em>First Applicable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>First Applicable</em>'.
     * @generated
     */
    FirstApplicable createFirstApplicable();

    /**
     * Returns a new object of class '<em>Allow Overrides</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Allow Overrides</em>'.
     * @generated
     */
    AllowOverrides createAllowOverrides();

    /**
     * Returns a new object of class '<em>Deny Overrides</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deny Overrides</em>'.
     * @generated
     */
    DenyOverrides createDenyOverrides();

    /**
     * Returns a new object of class '<em>Time Step Size</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Step Size</em>'.
     * @generated
     */
    TimeStepSize createTimeStepSize();

    /**
     * Returns a new object of class '<em>Time Step Rule Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Step Rule Set</em>'.
     * @generated
     */
    TimeStepRuleSet createTimeStepRuleSet();

    /**
     * Returns a new object of class '<em>Time Step Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Step Variable</em>'.
     * @generated
     */
    TimeStepVariable createTimeStepVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TemplatePackage getTemplatePackage();

} //TemplateFactory
