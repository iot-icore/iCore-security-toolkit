/**
 */
package rule.template.util;

import models.Element;

import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.XPathVariableAssignment;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.template.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage
 * @generated
 */
public class TemplateSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TemplatePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSwitch() {
        if (modelPackage == null) {
            modelPackage = TemplatePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TemplatePackage.RULE_TEMPLATE: {
                RuleTemplate ruleTemplate = (RuleTemplate)theEObject;
                T result = caseRuleTemplate(ruleTemplate);
                if (result == null) result = caseElement(ruleTemplate);
                if (result == null) result = caseTemplate(ruleTemplate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION: {
                RuleTemplateConfiguration ruleTemplateConfiguration = (RuleTemplateConfiguration)theEObject;
                T result = caseRuleTemplateConfiguration(ruleTemplateConfiguration);
                if (result == null) result = caseElement(ruleTemplateConfiguration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_INSTANCE: {
                RuleInstance ruleInstance = (RuleInstance)theEObject;
                T result = caseRuleInstance(ruleInstance);
                if (result == null) result = caseElement(ruleInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_VARIABLE: {
                RuleVariable ruleVariable = (RuleVariable)theEObject;
                T result = caseRuleVariable(ruleVariable);
                if (result == null) result = caseVariableDeclaration(ruleVariable);
                if (result == null) result = caseElement(ruleVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_TEMPLATE_VARIABLE: {
                RuleTemplateVariable ruleTemplateVariable = (RuleTemplateVariable)theEObject;
                T result = caseRuleTemplateVariable(ruleTemplateVariable);
                if (result == null) result = caseRuleVariable(ruleTemplateVariable);
                if (result == null) result = caseVariableDeclaration(ruleTemplateVariable);
                if (result == null) result = caseElement(ruleTemplateVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_INSTANCE_VARIABLE: {
                RuleInstanceVariable ruleInstanceVariable = (RuleInstanceVariable)theEObject;
                T result = caseRuleInstanceVariable(ruleInstanceVariable);
                if (result == null) result = caseRuleVariable(ruleInstanceVariable);
                if (result == null) result = caseVariableDeclaration(ruleInstanceVariable);
                if (result == null) result = caseElement(ruleInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT: {
                RuleXPathVariableAssignment ruleXPathVariableAssignment = (RuleXPathVariableAssignment)theEObject;
                T result = caseRuleXPathVariableAssignment(ruleXPathVariableAssignment);
                if (result == null) result = caseXPathVariableAssignment(ruleXPathVariableAssignment);
                if (result == null) result = caseVariableAssignment(ruleXPathVariableAssignment);
                if (result == null) result = caseElement(ruleXPathVariableAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.RULE_TEMPLATE_PACKAGE: {
                RuleTemplatePackage ruleTemplatePackage = (RuleTemplatePackage)theEObject;
                T result = caseRuleTemplatePackage(ruleTemplatePackage);
                if (result == null) result = caseElement(ruleTemplatePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.COMBINING_ALGORITHM: {
                CombiningAlgorithm combiningAlgorithm = (CombiningAlgorithm)theEObject;
                T result = caseCombiningAlgorithm(combiningAlgorithm);
                if (result == null) result = caseElement(combiningAlgorithm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.FIRST_APPLICABLE: {
                FirstApplicable firstApplicable = (FirstApplicable)theEObject;
                T result = caseFirstApplicable(firstApplicable);
                if (result == null) result = caseCombiningAlgorithm(firstApplicable);
                if (result == null) result = caseElement(firstApplicable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.ALLOW_OVERRIDES: {
                AllowOverrides allowOverrides = (AllowOverrides)theEObject;
                T result = caseAllowOverrides(allowOverrides);
                if (result == null) result = caseCombiningAlgorithm(allowOverrides);
                if (result == null) result = caseElement(allowOverrides);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.DENY_OVERRIDES: {
                DenyOverrides denyOverrides = (DenyOverrides)theEObject;
                T result = caseDenyOverrides(denyOverrides);
                if (result == null) result = caseCombiningAlgorithm(denyOverrides);
                if (result == null) result = caseElement(denyOverrides);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.TIME_STEP_SIZE: {
                TimeStepSize timeStepSize = (TimeStepSize)theEObject;
                T result = caseTimeStepSize(timeStepSize);
                if (result == null) result = caseElement(timeStepSize);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.TIME_STEP_RULE_SET: {
                TimeStepRuleSet timeStepRuleSet = (TimeStepRuleSet)theEObject;
                T result = caseTimeStepRuleSet(timeStepRuleSet);
                if (result == null) result = caseElement(timeStepRuleSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.TEMPLATE: {
                Template template = (Template)theEObject;
                T result = caseTemplate(template);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TemplatePackage.TIME_STEP_VARIABLE: {
                TimeStepVariable timeStepVariable = (TimeStepVariable)theEObject;
                T result = caseTimeStepVariable(timeStepVariable);
                if (result == null) result = caseVariableDeclaration(timeStepVariable);
                if (result == null) result = caseElement(timeStepVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleTemplate(RuleTemplate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Template Configuration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Template Configuration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleTemplateConfiguration(RuleTemplateConfiguration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleInstance(RuleInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleVariable(RuleVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Template Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Template Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleTemplateVariable(RuleTemplateVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleInstanceVariable(RuleInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule XPath Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule XPath Variable Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleXPathVariableAssignment(RuleXPathVariableAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule Template Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule Template Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuleTemplatePackage(RuleTemplatePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combining Algorithm</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combining Algorithm</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombiningAlgorithm(CombiningAlgorithm object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>First Applicable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>First Applicable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFirstApplicable(FirstApplicable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allow Overrides</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allow Overrides</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllowOverrides(AllowOverrides object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deny Overrides</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deny Overrides</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDenyOverrides(DenyOverrides object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Step Size</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Step Size</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeStepSize(TimeStepSize object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Step Rule Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Step Rule Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeStepRuleSet(TimeStepRuleSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemplate(Template object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Step Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Step Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeStepVariable(TimeStepVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDeclaration(VariableDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableAssignment(VariableAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>XPath Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XPath Variable Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXPathVariableAssignment(XPathVariableAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //TemplateSwitch
