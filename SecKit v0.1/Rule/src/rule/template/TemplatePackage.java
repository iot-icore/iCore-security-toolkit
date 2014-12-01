/**
 */
package rule.template;

import models.ModelsPackage;

import models.variable.VariablePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rule.template.TemplateFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "template";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/template/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-template";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TemplatePackage eINSTANCE = rule.template.impl.TemplatePackageImpl.init();

    /**
     * The meta object id for the '{@link rule.template.impl.RuleTemplateImpl <em>Rule Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleTemplateImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleTemplate()
     * @generated
     */
    int RULE_TEMPLATE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__VARIABLE_DECLARATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__EVENT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__CONDITION = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Evaluation Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__EVALUATION_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Configurations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__CONFIGURATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Contained Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__CONTAINED_CONFIGURATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Authorize</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__AUTHORIZE = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Combining Algorithm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__COMBINING_ALGORITHM = ModelsPackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Execute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE__EXECUTE = ModelsPackage.ELEMENT_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Rule Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 12;

    /**
     * The number of operations of the '<em>Rule Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleTemplateConfigurationImpl <em>Rule Template Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleTemplateConfigurationImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleTemplateConfiguration()
     * @generated
     */
    int RULE_TEMPLATE_CONFIGURATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiation Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Disposal Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Evaluation Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Configuration Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__TEMPLATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Container Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Disposal Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Time Step Size</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE = ModelsPackage.ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Rule Template Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Rule Template Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_CONFIGURATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleInstanceImpl <em>Rule Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleInstanceImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleInstance()
     * @generated
     */
    int RULE_INSTANCE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Instantiation Rule</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__INSTANTIATION_RULE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Instances</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__VARIABLE_INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__STATES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Condition State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__CONDITION_STATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Trigger Event State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__TRIGGER_EVENT_STATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__TEMPLATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Rule Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__RULE_SET = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__CONFIGURATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__TIME_STEP = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__VALUE = ModelsPackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Disposal Rule Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__DISPOSAL_RULE_INSTANCE = ModelsPackage.ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Instances To Dispose</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__INSTANCES_TO_DISPOSE = ModelsPackage.ELEMENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Created Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__CREATED_INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Contained Instances</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE__CONTAINED_INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Rule Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 14;

    /**
     * The number of operations of the '<em>Rule Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleVariableImpl <em>Rule Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleVariableImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleVariable()
     * @generated
     */
    int RULE_VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_VARIABLE__VISUAL_ELEMENTS = VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_VARIABLE__ID = VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_VARIABLE__NAME = VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Rule Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_VARIABLE_FEATURE_COUNT = VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Rule Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_VARIABLE_OPERATION_COUNT = VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleTemplateVariableImpl <em>Rule Template Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleTemplateVariableImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleTemplateVariable()
     * @generated
     */
    int RULE_TEMPLATE_VARIABLE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE__VISUAL_ELEMENTS = RULE_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE__ID = RULE_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE__NAME = RULE_VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE__TEMPLATE = RULE_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rule Template Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE_FEATURE_COUNT = RULE_VARIABLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Rule Template Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_VARIABLE_OPERATION_COUNT = RULE_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleInstanceVariableImpl <em>Rule Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleInstanceVariableImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleInstanceVariable()
     * @generated
     */
    int RULE_INSTANCE_VARIABLE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE__VISUAL_ELEMENTS = RULE_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE__ID = RULE_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE__NAME = RULE_VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Mechanism Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE = RULE_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rule Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE_FEATURE_COUNT = RULE_VARIABLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Rule Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_INSTANCE_VARIABLE_OPERATION_COUNT = RULE_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleXPathVariableAssignmentImpl <em>Rule XPath Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleXPathVariableAssignmentImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleXPathVariableAssignment()
     * @generated
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS = VariablePackage.XPATH_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT__ID = VariablePackage.XPATH_VARIABLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT__TARGET = VariablePackage.XPATH_VARIABLE_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT__EXPRESSION = VariablePackage.XPATH_VARIABLE_ASSIGNMENT__EXPRESSION;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT = VariablePackage.XPATH_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rule XPath Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT_FEATURE_COUNT = VariablePackage.XPATH_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Rule XPath Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_XPATH_VARIABLE_ASSIGNMENT_OPERATION_COUNT = VariablePackage.XPATH_VARIABLE_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.RuleTemplatePackageImpl <em>Rule Template Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.RuleTemplatePackageImpl
     * @see rule.template.impl.TemplatePackageImpl#getRuleTemplatePackage()
     * @generated
     */
    int RULE_TEMPLATE_PACKAGE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Templates</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__TEMPLATES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__SUB_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Formula Templates</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE__CONFIGURATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Rule Template Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Rule Template Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_TEMPLATE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.CombiningAlgorithmImpl <em>Combining Algorithm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.CombiningAlgorithmImpl
     * @see rule.template.impl.TemplatePackageImpl#getCombiningAlgorithm()
     * @generated
     */
    int COMBINING_ALGORITHM = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINING_ALGORITHM__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINING_ALGORITHM__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINING_ALGORITHM__TEMPLATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Combining Algorithm</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINING_ALGORITHM_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Combining Algorithm</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINING_ALGORITHM_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.FirstApplicableImpl <em>First Applicable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.FirstApplicableImpl
     * @see rule.template.impl.TemplatePackageImpl#getFirstApplicable()
     * @generated
     */
    int FIRST_APPLICABLE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRST_APPLICABLE__VISUAL_ELEMENTS = COMBINING_ALGORITHM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRST_APPLICABLE__ID = COMBINING_ALGORITHM__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRST_APPLICABLE__TEMPLATE = COMBINING_ALGORITHM__TEMPLATE;

    /**
     * The number of structural features of the '<em>First Applicable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRST_APPLICABLE_FEATURE_COUNT = COMBINING_ALGORITHM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>First Applicable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIRST_APPLICABLE_OPERATION_COUNT = COMBINING_ALGORITHM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.AllowOverridesImpl <em>Allow Overrides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.AllowOverridesImpl
     * @see rule.template.impl.TemplatePackageImpl#getAllowOverrides()
     * @generated
     */
    int ALLOW_OVERRIDES = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OVERRIDES__VISUAL_ELEMENTS = COMBINING_ALGORITHM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OVERRIDES__ID = COMBINING_ALGORITHM__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OVERRIDES__TEMPLATE = COMBINING_ALGORITHM__TEMPLATE;

    /**
     * The number of structural features of the '<em>Allow Overrides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OVERRIDES_FEATURE_COUNT = COMBINING_ALGORITHM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Allow Overrides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OVERRIDES_OPERATION_COUNT = COMBINING_ALGORITHM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.DenyOverridesImpl <em>Deny Overrides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.DenyOverridesImpl
     * @see rule.template.impl.TemplatePackageImpl#getDenyOverrides()
     * @generated
     */
    int DENY_OVERRIDES = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OVERRIDES__VISUAL_ELEMENTS = COMBINING_ALGORITHM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OVERRIDES__ID = COMBINING_ALGORITHM__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OVERRIDES__TEMPLATE = COMBINING_ALGORITHM__TEMPLATE;

    /**
     * The number of structural features of the '<em>Deny Overrides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OVERRIDES_FEATURE_COUNT = COMBINING_ALGORITHM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Deny Overrides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OVERRIDES_OPERATION_COUNT = COMBINING_ALGORITHM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.TimeStepSizeImpl <em>Time Step Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.TimeStepSizeImpl
     * @see rule.template.impl.TemplatePackageImpl#getTimeStepSize()
     * @generated
     */
    int TIME_STEP_SIZE = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Time Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE__TIME_DURATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rule Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE__RULE_SET = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Time Step Size</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Time Step Size</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_SIZE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.TimeStepRuleSetImpl <em>Time Step Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.TimeStepRuleSetImpl
     * @see rule.template.impl.TemplatePackageImpl#getTimeStepRuleSet()
     * @generated
     */
    int TIME_STEP_RULE_SET = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Rules</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__RULES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Clock</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__CLOCK = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Last Update</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__LAST_UPDATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Rules To Remove</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__RULES_TO_REMOVE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Time Step Size</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__TIME_STEP_SIZE = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Configurations To Instantiate</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Time Step Rule Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Time Step Rule Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_RULE_SET_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.TemplateImpl
     * @see rule.template.impl.TemplatePackageImpl#getTemplate()
     * @generated
     */
    int TEMPLATE = 14;

    /**
     * The number of structural features of the '<em>Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.template.impl.TimeStepVariableImpl <em>Time Step Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.impl.TimeStepVariableImpl
     * @see rule.template.impl.TemplatePackageImpl#getTimeStepVariable()
     * @generated
     */
    int TIME_STEP_VARIABLE = 15;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_VARIABLE__VISUAL_ELEMENTS = VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_VARIABLE__ID = VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_VARIABLE__NAME = VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Time Step Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_VARIABLE_FEATURE_COUNT = VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Time Step Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_VARIABLE_OPERATION_COUNT = VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.template.DisposalStrategy <em>Disposal Strategy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.DisposalStrategy
     * @see rule.template.impl.TemplatePackageImpl#getDisposalStrategy()
     * @generated
     */
    int DISPOSAL_STRATEGY = 16;

    /**
     * The meta object id for the '{@link rule.template.XPathContext <em>XPath Context</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.XPathContext
     * @see rule.template.impl.TemplatePackageImpl#getXPathContext()
     * @generated
     */
    int XPATH_CONTEXT = 17;

    /**
     * The meta object id for the '{@link rule.template.InstantiationStrategy <em>Instantiation Strategy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.template.InstantiationStrategy
     * @see rule.template.impl.TemplatePackageImpl#getInstantiationStrategy()
     * @generated
     */
    int INSTANTIATION_STRATEGY = 18;


    /**
     * Returns the meta object for class '{@link rule.template.RuleTemplate <em>Rule Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Template</em>'.
     * @see rule.template.RuleTemplate
     * @generated
     */
    EClass getRuleTemplate();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplate#getVariableDeclarations <em>Variable Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
     * @see rule.template.RuleTemplate#getVariableDeclarations()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_VariableDeclarations();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplate#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see rule.template.RuleTemplate#getName()
     * @see #getRuleTemplate()
     * @generated
     */
    EAttribute getRuleTemplate_Name();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplate#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see rule.template.RuleTemplate#getDescription()
     * @see #getRuleTemplate()
     * @generated
     */
    EAttribute getRuleTemplate_Description();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.RuleTemplate#getEvent <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event</em>'.
     * @see rule.template.RuleTemplate#getEvent()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Event();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.RuleTemplate#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see rule.template.RuleTemplate#getCondition()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Condition();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplate#getEvaluationAssignments <em>Evaluation Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Evaluation Assignments</em>'.
     * @see rule.template.RuleTemplate#getEvaluationAssignments()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_EvaluationAssignments();

    /**
     * Returns the meta object for the reference list '{@link rule.template.RuleTemplate#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Configurations</em>'.
     * @see rule.template.RuleTemplate#getConfigurations()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Configurations();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplate#getContainedConfigurations <em>Contained Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Configurations</em>'.
     * @see rule.template.RuleTemplate#getContainedConfigurations()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_ContainedConfigurations();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.RuleTemplate#getAuthorize <em>Authorize</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Authorize</em>'.
     * @see rule.template.RuleTemplate#getAuthorize()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Authorize();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.RuleTemplate#getCombiningAlgorithm <em>Combining Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Combining Algorithm</em>'.
     * @see rule.template.RuleTemplate#getCombiningAlgorithm()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_CombiningAlgorithm();

    /**
     * Returns the meta object for the container reference '{@link rule.template.RuleTemplate#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see rule.template.RuleTemplate#getPackage()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Package();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplate#getExecute <em>Execute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Execute</em>'.
     * @see rule.template.RuleTemplate#getExecute()
     * @see #getRuleTemplate()
     * @generated
     */
    EReference getRuleTemplate_Execute();

    /**
     * Returns the meta object for class '{@link rule.template.RuleTemplateConfiguration <em>Rule Template Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Template Configuration</em>'.
     * @see rule.template.RuleTemplateConfiguration
     * @generated
     */
    EClass getRuleTemplateConfiguration();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplateConfiguration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see rule.template.RuleTemplateConfiguration#getName()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EAttribute getRuleTemplateConfiguration_Name();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplateConfiguration#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see rule.template.RuleTemplateConfiguration#getDescription()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EAttribute getRuleTemplateConfiguration_Description();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplateConfiguration#getInstantiationStrategy <em>Instantiation Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instantiation Strategy</em>'.
     * @see rule.template.RuleTemplateConfiguration#getInstantiationStrategy()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EAttribute getRuleTemplateConfiguration_InstantiationStrategy();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplateConfiguration#getDisposalStrategy <em>Disposal Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disposal Strategy</em>'.
     * @see rule.template.RuleTemplateConfiguration#getDisposalStrategy()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EAttribute getRuleTemplateConfiguration_DisposalStrategy();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplateConfiguration#getEvaluationAssignments <em>Evaluation Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Evaluation Assignments</em>'.
     * @see rule.template.RuleTemplateConfiguration#getEvaluationAssignments()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_EvaluationAssignments();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplateConfiguration#getConfigurationAssignments <em>Configuration Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Configuration Assignments</em>'.
     * @see rule.template.RuleTemplateConfiguration#getConfigurationAssignments()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_ConfigurationAssignments();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleTemplateConfiguration#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Template</em>'.
     * @see rule.template.RuleTemplateConfiguration#getTemplate()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_Template();

    /**
     * Returns the meta object for the container reference '{@link rule.template.RuleTemplateConfiguration#getContainerTemplate <em>Container Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container Template</em>'.
     * @see rule.template.RuleTemplateConfiguration#getContainerTemplate()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_ContainerTemplate();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.RuleTemplateConfiguration#getDisposalConfiguration <em>Disposal Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Disposal Configuration</em>'.
     * @see rule.template.RuleTemplateConfiguration#getDisposalConfiguration()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_DisposalConfiguration();

    /**
     * Returns the meta object for the container reference '{@link rule.template.RuleTemplateConfiguration#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see rule.template.RuleTemplateConfiguration#getPackage()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_Package();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleTemplateConfiguration#getTimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Time Step Size</em>'.
     * @see rule.template.RuleTemplateConfiguration#getTimeStepSize()
     * @see #getRuleTemplateConfiguration()
     * @generated
     */
    EReference getRuleTemplateConfiguration_TimeStepSize();

    /**
     * Returns the meta object for class '{@link rule.template.RuleInstance <em>Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Instance</em>'.
     * @see rule.template.RuleInstance
     * @generated
     */
    EClass getRuleInstance();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getInstantiationRule <em>Instantiation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation Rule</em>'.
     * @see rule.template.RuleInstance#getInstantiationRule()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_InstantiationRule();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleInstance#getVariableInstances <em>Variable Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Instances</em>'.
     * @see rule.template.RuleInstance#getVariableInstances()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_VariableInstances();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleInstance#getStates <em>States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>States</em>'.
     * @see rule.template.RuleInstance#getStates()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_States();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getConditionState <em>Condition State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Condition State</em>'.
     * @see rule.template.RuleInstance#getConditionState()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_ConditionState();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getTriggerEventState <em>Trigger Event State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Trigger Event State</em>'.
     * @see rule.template.RuleInstance#getTriggerEventState()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_TriggerEventState();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Template</em>'.
     * @see rule.template.RuleInstance#getTemplate()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_Template();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getRuleSet <em>Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Rule Set</em>'.
     * @see rule.template.RuleInstance#getRuleSet()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_RuleSet();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Configuration</em>'.
     * @see rule.template.RuleInstance#getConfiguration()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_Configuration();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleInstance#getTimeStep <em>Time Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Step</em>'.
     * @see rule.template.RuleInstance#getTimeStep()
     * @see #getRuleInstance()
     * @generated
     */
    EAttribute getRuleInstance_TimeStep();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleInstance#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see rule.template.RuleInstance#getValue()
     * @see #getRuleInstance()
     * @generated
     */
    EAttribute getRuleInstance_Value();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstance#getDisposalRuleInstance <em>Disposal Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Disposal Rule Instance</em>'.
     * @see rule.template.RuleInstance#getDisposalRuleInstance()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_DisposalRuleInstance();

    /**
     * Returns the meta object for the reference list '{@link rule.template.RuleInstance#getInstancesToDispose <em>Instances To Dispose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances To Dispose</em>'.
     * @see rule.template.RuleInstance#getInstancesToDispose()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_InstancesToDispose();

    /**
     * Returns the meta object for the reference list '{@link rule.template.RuleInstance#getCreatedInstances <em>Created Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Created Instances</em>'.
     * @see rule.template.RuleInstance#getCreatedInstances()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_CreatedInstances();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleInstance#getContainedInstances <em>Contained Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Instances</em>'.
     * @see rule.template.RuleInstance#getContainedInstances()
     * @see #getRuleInstance()
     * @generated
     */
    EReference getRuleInstance_ContainedInstances();

    /**
     * Returns the meta object for class '{@link rule.template.RuleVariable <em>Rule Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Variable</em>'.
     * @see rule.template.RuleVariable
     * @generated
     */
    EClass getRuleVariable();

    /**
     * Returns the meta object for class '{@link rule.template.RuleTemplateVariable <em>Rule Template Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Template Variable</em>'.
     * @see rule.template.RuleTemplateVariable
     * @generated
     */
    EClass getRuleTemplateVariable();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleTemplateVariable#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Template</em>'.
     * @see rule.template.RuleTemplateVariable#getTemplate()
     * @see #getRuleTemplateVariable()
     * @generated
     */
    EReference getRuleTemplateVariable_Template();

    /**
     * Returns the meta object for class '{@link rule.template.RuleInstanceVariable <em>Rule Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Instance Variable</em>'.
     * @see rule.template.RuleInstanceVariable
     * @generated
     */
    EClass getRuleInstanceVariable();

    /**
     * Returns the meta object for the reference '{@link rule.template.RuleInstanceVariable#getMechanismInstance <em>Mechanism Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mechanism Instance</em>'.
     * @see rule.template.RuleInstanceVariable#getMechanismInstance()
     * @see #getRuleInstanceVariable()
     * @generated
     */
    EReference getRuleInstanceVariable_MechanismInstance();

    /**
     * Returns the meta object for class '{@link rule.template.RuleXPathVariableAssignment <em>Rule XPath Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule XPath Variable Assignment</em>'.
     * @see rule.template.RuleXPathVariableAssignment
     * @generated
     */
    EClass getRuleXPathVariableAssignment();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleXPathVariableAssignment#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context</em>'.
     * @see rule.template.RuleXPathVariableAssignment#getContext()
     * @see #getRuleXPathVariableAssignment()
     * @generated
     */
    EAttribute getRuleXPathVariableAssignment_Context();

    /**
     * Returns the meta object for class '{@link rule.template.RuleTemplatePackage <em>Rule Template Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule Template Package</em>'.
     * @see rule.template.RuleTemplatePackage
     * @generated
     */
    EClass getRuleTemplatePackage();

    /**
     * Returns the meta object for the attribute '{@link rule.template.RuleTemplatePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see rule.template.RuleTemplatePackage#getName()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EAttribute getRuleTemplatePackage_Name();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplatePackage#getTemplates <em>Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Templates</em>'.
     * @see rule.template.RuleTemplatePackage#getTemplates()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EReference getRuleTemplatePackage_Templates();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplatePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
     * @see rule.template.RuleTemplatePackage#getSubPackages()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EReference getRuleTemplatePackage_SubPackages();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplatePackage#getFormulaTemplates <em>Formula Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Formula Templates</em>'.
     * @see rule.template.RuleTemplatePackage#getFormulaTemplates()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EReference getRuleTemplatePackage_FormulaTemplates();

    /**
     * Returns the meta object for the container reference '{@link rule.template.RuleTemplatePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see rule.template.RuleTemplatePackage#getModel()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EReference getRuleTemplatePackage_Model();

    /**
     * Returns the meta object for the containment reference list '{@link rule.template.RuleTemplatePackage#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Configurations</em>'.
     * @see rule.template.RuleTemplatePackage#getConfigurations()
     * @see #getRuleTemplatePackage()
     * @generated
     */
    EReference getRuleTemplatePackage_Configurations();

    /**
     * Returns the meta object for class '{@link rule.template.CombiningAlgorithm <em>Combining Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Combining Algorithm</em>'.
     * @see rule.template.CombiningAlgorithm
     * @generated
     */
    EClass getCombiningAlgorithm();

    /**
     * Returns the meta object for the container reference '{@link rule.template.CombiningAlgorithm#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Template</em>'.
     * @see rule.template.CombiningAlgorithm#getTemplate()
     * @see #getCombiningAlgorithm()
     * @generated
     */
    EReference getCombiningAlgorithm_Template();

    /**
     * Returns the meta object for class '{@link rule.template.FirstApplicable <em>First Applicable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>First Applicable</em>'.
     * @see rule.template.FirstApplicable
     * @generated
     */
    EClass getFirstApplicable();

    /**
     * Returns the meta object for class '{@link rule.template.AllowOverrides <em>Allow Overrides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Allow Overrides</em>'.
     * @see rule.template.AllowOverrides
     * @generated
     */
    EClass getAllowOverrides();

    /**
     * Returns the meta object for class '{@link rule.template.DenyOverrides <em>Deny Overrides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deny Overrides</em>'.
     * @see rule.template.DenyOverrides
     * @generated
     */
    EClass getDenyOverrides();

    /**
     * Returns the meta object for class '{@link rule.template.TimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Step Size</em>'.
     * @see rule.template.TimeStepSize
     * @generated
     */
    EClass getTimeStepSize();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.TimeStepSize#getTimeDuration <em>Time Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Duration</em>'.
     * @see rule.template.TimeStepSize#getTimeDuration()
     * @see #getTimeStepSize()
     * @generated
     */
    EReference getTimeStepSize_TimeDuration();

    /**
     * Returns the meta object for the reference '{@link rule.template.TimeStepSize#getRuleSet <em>Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Rule Set</em>'.
     * @see rule.template.TimeStepSize#getRuleSet()
     * @see #getTimeStepSize()
     * @generated
     */
    EReference getTimeStepSize_RuleSet();

    /**
     * Returns the meta object for class '{@link rule.template.TimeStepRuleSet <em>Time Step Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Step Rule Set</em>'.
     * @see rule.template.TimeStepRuleSet
     * @generated
     */
    EClass getTimeStepRuleSet();

    /**
     * Returns the meta object for the reference list '{@link rule.template.TimeStepRuleSet#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rules</em>'.
     * @see rule.template.TimeStepRuleSet#getRules()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_Rules();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.TimeStepRuleSet#getClock <em>Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Clock</em>'.
     * @see rule.template.TimeStepRuleSet#getClock()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_Clock();

    /**
     * Returns the meta object for the containment reference '{@link rule.template.TimeStepRuleSet#getLastUpdate <em>Last Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Last Update</em>'.
     * @see rule.template.TimeStepRuleSet#getLastUpdate()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_LastUpdate();

    /**
     * Returns the meta object for the reference list '{@link rule.template.TimeStepRuleSet#getRulesToRemove <em>Rules To Remove</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rules To Remove</em>'.
     * @see rule.template.TimeStepRuleSet#getRulesToRemove()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_RulesToRemove();

    /**
     * Returns the meta object for the reference '{@link rule.template.TimeStepRuleSet#getTimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Time Step Size</em>'.
     * @see rule.template.TimeStepRuleSet#getTimeStepSize()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_TimeStepSize();

    /**
     * Returns the meta object for the reference list '{@link rule.template.TimeStepRuleSet#getConfigurationsToInstantiate <em>Configurations To Instantiate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Configurations To Instantiate</em>'.
     * @see rule.template.TimeStepRuleSet#getConfigurationsToInstantiate()
     * @see #getTimeStepRuleSet()
     * @generated
     */
    EReference getTimeStepRuleSet_ConfigurationsToInstantiate();

    /**
     * Returns the meta object for class '{@link rule.template.Template <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Template</em>'.
     * @see rule.template.Template
     * @generated
     */
    EClass getTemplate();

    /**
     * Returns the meta object for class '{@link rule.template.TimeStepVariable <em>Time Step Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Step Variable</em>'.
     * @see rule.template.TimeStepVariable
     * @generated
     */
    EClass getTimeStepVariable();

    /**
     * Returns the meta object for enum '{@link rule.template.DisposalStrategy <em>Disposal Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Disposal Strategy</em>'.
     * @see rule.template.DisposalStrategy
     * @generated
     */
    EEnum getDisposalStrategy();

    /**
     * Returns the meta object for enum '{@link rule.template.XPathContext <em>XPath Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>XPath Context</em>'.
     * @see rule.template.XPathContext
     * @generated
     */
    EEnum getXPathContext();

    /**
     * Returns the meta object for enum '{@link rule.template.InstantiationStrategy <em>Instantiation Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Instantiation Strategy</em>'.
     * @see rule.template.InstantiationStrategy
     * @generated
     */
    EEnum getInstantiationStrategy();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TemplateFactory getTemplateFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link rule.template.impl.RuleTemplateImpl <em>Rule Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleTemplateImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleTemplate()
         * @generated
         */
        EClass RULE_TEMPLATE = eINSTANCE.getRuleTemplate();

        /**
         * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__VARIABLE_DECLARATIONS = eINSTANCE.getRuleTemplate_VariableDeclarations();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE__NAME = eINSTANCE.getRuleTemplate_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE__DESCRIPTION = eINSTANCE.getRuleTemplate_Description();

        /**
         * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__EVENT = eINSTANCE.getRuleTemplate_Event();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__CONDITION = eINSTANCE.getRuleTemplate_Condition();

        /**
         * The meta object literal for the '<em><b>Evaluation Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__EVALUATION_ASSIGNMENTS = eINSTANCE.getRuleTemplate_EvaluationAssignments();

        /**
         * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__CONFIGURATIONS = eINSTANCE.getRuleTemplate_Configurations();

        /**
         * The meta object literal for the '<em><b>Contained Configurations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__CONTAINED_CONFIGURATIONS = eINSTANCE.getRuleTemplate_ContainedConfigurations();

        /**
         * The meta object literal for the '<em><b>Authorize</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__AUTHORIZE = eINSTANCE.getRuleTemplate_Authorize();

        /**
         * The meta object literal for the '<em><b>Combining Algorithm</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__COMBINING_ALGORITHM = eINSTANCE.getRuleTemplate_CombiningAlgorithm();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__PACKAGE = eINSTANCE.getRuleTemplate_Package();

        /**
         * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE__EXECUTE = eINSTANCE.getRuleTemplate_Execute();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleTemplateConfigurationImpl <em>Rule Template Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleTemplateConfigurationImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleTemplateConfiguration()
         * @generated
         */
        EClass RULE_TEMPLATE_CONFIGURATION = eINSTANCE.getRuleTemplateConfiguration();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE_CONFIGURATION__NAME = eINSTANCE.getRuleTemplateConfiguration_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE_CONFIGURATION__DESCRIPTION = eINSTANCE.getRuleTemplateConfiguration_Description();

        /**
         * The meta object literal for the '<em><b>Instantiation Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY = eINSTANCE.getRuleTemplateConfiguration_InstantiationStrategy();

        /**
         * The meta object literal for the '<em><b>Disposal Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY = eINSTANCE.getRuleTemplateConfiguration_DisposalStrategy();

        /**
         * The meta object literal for the '<em><b>Evaluation Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS = eINSTANCE.getRuleTemplateConfiguration_EvaluationAssignments();

        /**
         * The meta object literal for the '<em><b>Configuration Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS = eINSTANCE.getRuleTemplateConfiguration_ConfigurationAssignments();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__TEMPLATE = eINSTANCE.getRuleTemplateConfiguration_Template();

        /**
         * The meta object literal for the '<em><b>Container Template</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE = eINSTANCE.getRuleTemplateConfiguration_ContainerTemplate();

        /**
         * The meta object literal for the '<em><b>Disposal Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION = eINSTANCE.getRuleTemplateConfiguration_DisposalConfiguration();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__PACKAGE = eINSTANCE.getRuleTemplateConfiguration_Package();

        /**
         * The meta object literal for the '<em><b>Time Step Size</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE = eINSTANCE.getRuleTemplateConfiguration_TimeStepSize();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleInstanceImpl <em>Rule Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleInstanceImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleInstance()
         * @generated
         */
        EClass RULE_INSTANCE = eINSTANCE.getRuleInstance();

        /**
         * The meta object literal for the '<em><b>Instantiation Rule</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__INSTANTIATION_RULE = eINSTANCE.getRuleInstance_InstantiationRule();

        /**
         * The meta object literal for the '<em><b>Variable Instances</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__VARIABLE_INSTANCES = eINSTANCE.getRuleInstance_VariableInstances();

        /**
         * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__STATES = eINSTANCE.getRuleInstance_States();

        /**
         * The meta object literal for the '<em><b>Condition State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__CONDITION_STATE = eINSTANCE.getRuleInstance_ConditionState();

        /**
         * The meta object literal for the '<em><b>Trigger Event State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__TRIGGER_EVENT_STATE = eINSTANCE.getRuleInstance_TriggerEventState();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__TEMPLATE = eINSTANCE.getRuleInstance_Template();

        /**
         * The meta object literal for the '<em><b>Rule Set</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__RULE_SET = eINSTANCE.getRuleInstance_RuleSet();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__CONFIGURATION = eINSTANCE.getRuleInstance_Configuration();

        /**
         * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_INSTANCE__TIME_STEP = eINSTANCE.getRuleInstance_TimeStep();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_INSTANCE__VALUE = eINSTANCE.getRuleInstance_Value();

        /**
         * The meta object literal for the '<em><b>Disposal Rule Instance</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__DISPOSAL_RULE_INSTANCE = eINSTANCE.getRuleInstance_DisposalRuleInstance();

        /**
         * The meta object literal for the '<em><b>Instances To Dispose</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__INSTANCES_TO_DISPOSE = eINSTANCE.getRuleInstance_InstancesToDispose();

        /**
         * The meta object literal for the '<em><b>Created Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__CREATED_INSTANCES = eINSTANCE.getRuleInstance_CreatedInstances();

        /**
         * The meta object literal for the '<em><b>Contained Instances</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE__CONTAINED_INSTANCES = eINSTANCE.getRuleInstance_ContainedInstances();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleVariableImpl <em>Rule Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleVariableImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleVariable()
         * @generated
         */
        EClass RULE_VARIABLE = eINSTANCE.getRuleVariable();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleTemplateVariableImpl <em>Rule Template Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleTemplateVariableImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleTemplateVariable()
         * @generated
         */
        EClass RULE_TEMPLATE_VARIABLE = eINSTANCE.getRuleTemplateVariable();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_VARIABLE__TEMPLATE = eINSTANCE.getRuleTemplateVariable_Template();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleInstanceVariableImpl <em>Rule Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleInstanceVariableImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleInstanceVariable()
         * @generated
         */
        EClass RULE_INSTANCE_VARIABLE = eINSTANCE.getRuleInstanceVariable();

        /**
         * The meta object literal for the '<em><b>Mechanism Instance</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE = eINSTANCE.getRuleInstanceVariable_MechanismInstance();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleXPathVariableAssignmentImpl <em>Rule XPath Variable Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleXPathVariableAssignmentImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleXPathVariableAssignment()
         * @generated
         */
        EClass RULE_XPATH_VARIABLE_ASSIGNMENT = eINSTANCE.getRuleXPathVariableAssignment();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT = eINSTANCE.getRuleXPathVariableAssignment_Context();

        /**
         * The meta object literal for the '{@link rule.template.impl.RuleTemplatePackageImpl <em>Rule Template Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.RuleTemplatePackageImpl
         * @see rule.template.impl.TemplatePackageImpl#getRuleTemplatePackage()
         * @generated
         */
        EClass RULE_TEMPLATE_PACKAGE = eINSTANCE.getRuleTemplatePackage();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_TEMPLATE_PACKAGE__NAME = eINSTANCE.getRuleTemplatePackage_Name();

        /**
         * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_PACKAGE__TEMPLATES = eINSTANCE.getRuleTemplatePackage_Templates();

        /**
         * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_PACKAGE__SUB_PACKAGES = eINSTANCE.getRuleTemplatePackage_SubPackages();

        /**
         * The meta object literal for the '<em><b>Formula Templates</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES = eINSTANCE.getRuleTemplatePackage_FormulaTemplates();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_PACKAGE__MODEL = eINSTANCE.getRuleTemplatePackage_Model();

        /**
         * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_TEMPLATE_PACKAGE__CONFIGURATIONS = eINSTANCE.getRuleTemplatePackage_Configurations();

        /**
         * The meta object literal for the '{@link rule.template.impl.CombiningAlgorithmImpl <em>Combining Algorithm</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.CombiningAlgorithmImpl
         * @see rule.template.impl.TemplatePackageImpl#getCombiningAlgorithm()
         * @generated
         */
        EClass COMBINING_ALGORITHM = eINSTANCE.getCombiningAlgorithm();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMBINING_ALGORITHM__TEMPLATE = eINSTANCE.getCombiningAlgorithm_Template();

        /**
         * The meta object literal for the '{@link rule.template.impl.FirstApplicableImpl <em>First Applicable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.FirstApplicableImpl
         * @see rule.template.impl.TemplatePackageImpl#getFirstApplicable()
         * @generated
         */
        EClass FIRST_APPLICABLE = eINSTANCE.getFirstApplicable();

        /**
         * The meta object literal for the '{@link rule.template.impl.AllowOverridesImpl <em>Allow Overrides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.AllowOverridesImpl
         * @see rule.template.impl.TemplatePackageImpl#getAllowOverrides()
         * @generated
         */
        EClass ALLOW_OVERRIDES = eINSTANCE.getAllowOverrides();

        /**
         * The meta object literal for the '{@link rule.template.impl.DenyOverridesImpl <em>Deny Overrides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.DenyOverridesImpl
         * @see rule.template.impl.TemplatePackageImpl#getDenyOverrides()
         * @generated
         */
        EClass DENY_OVERRIDES = eINSTANCE.getDenyOverrides();

        /**
         * The meta object literal for the '{@link rule.template.impl.TimeStepSizeImpl <em>Time Step Size</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.TimeStepSizeImpl
         * @see rule.template.impl.TemplatePackageImpl#getTimeStepSize()
         * @generated
         */
        EClass TIME_STEP_SIZE = eINSTANCE.getTimeStepSize();

        /**
         * The meta object literal for the '<em><b>Time Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_SIZE__TIME_DURATION = eINSTANCE.getTimeStepSize_TimeDuration();

        /**
         * The meta object literal for the '<em><b>Rule Set</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_SIZE__RULE_SET = eINSTANCE.getTimeStepSize_RuleSet();

        /**
         * The meta object literal for the '{@link rule.template.impl.TimeStepRuleSetImpl <em>Time Step Rule Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.TimeStepRuleSetImpl
         * @see rule.template.impl.TemplatePackageImpl#getTimeStepRuleSet()
         * @generated
         */
        EClass TIME_STEP_RULE_SET = eINSTANCE.getTimeStepRuleSet();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__RULES = eINSTANCE.getTimeStepRuleSet_Rules();

        /**
         * The meta object literal for the '<em><b>Clock</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__CLOCK = eINSTANCE.getTimeStepRuleSet_Clock();

        /**
         * The meta object literal for the '<em><b>Last Update</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__LAST_UPDATE = eINSTANCE.getTimeStepRuleSet_LastUpdate();

        /**
         * The meta object literal for the '<em><b>Rules To Remove</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__RULES_TO_REMOVE = eINSTANCE.getTimeStepRuleSet_RulesToRemove();

        /**
         * The meta object literal for the '<em><b>Time Step Size</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__TIME_STEP_SIZE = eINSTANCE.getTimeStepRuleSet_TimeStepSize();

        /**
         * The meta object literal for the '<em><b>Configurations To Instantiate</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_RULE_SET__CONFIGURATIONS_TO_INSTANTIATE = eINSTANCE.getTimeStepRuleSet_ConfigurationsToInstantiate();

        /**
         * The meta object literal for the '{@link rule.template.impl.TemplateImpl <em>Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.TemplateImpl
         * @see rule.template.impl.TemplatePackageImpl#getTemplate()
         * @generated
         */
        EClass TEMPLATE = eINSTANCE.getTemplate();

        /**
         * The meta object literal for the '{@link rule.template.impl.TimeStepVariableImpl <em>Time Step Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.impl.TimeStepVariableImpl
         * @see rule.template.impl.TemplatePackageImpl#getTimeStepVariable()
         * @generated
         */
        EClass TIME_STEP_VARIABLE = eINSTANCE.getTimeStepVariable();

        /**
         * The meta object literal for the '{@link rule.template.DisposalStrategy <em>Disposal Strategy</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.DisposalStrategy
         * @see rule.template.impl.TemplatePackageImpl#getDisposalStrategy()
         * @generated
         */
        EEnum DISPOSAL_STRATEGY = eINSTANCE.getDisposalStrategy();

        /**
         * The meta object literal for the '{@link rule.template.XPathContext <em>XPath Context</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.XPathContext
         * @see rule.template.impl.TemplatePackageImpl#getXPathContext()
         * @generated
         */
        EEnum XPATH_CONTEXT = eINSTANCE.getXPathContext();

        /**
         * The meta object literal for the '{@link rule.template.InstantiationStrategy <em>Instantiation Strategy</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.template.InstantiationStrategy
         * @see rule.template.impl.TemplatePackageImpl#getInstantiationStrategy()
         * @generated
         */
        EEnum INSTANTIATION_STRATEGY = eINSTANCE.getInstantiationStrategy();

    }

} //TemplatePackage
