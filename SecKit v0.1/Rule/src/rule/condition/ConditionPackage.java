/**
 */
package rule.condition;

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
 * @see rule.condition.ConditionFactory
 * @model kind="package"
 * @generated
 */
public interface ConditionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "condition";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/condition/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-condition";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConditionPackage eINSTANCE = rule.condition.impl.ConditionPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.condition.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.AtomImpl
     * @see rule.condition.impl.ConditionPackageImpl#getAtom()
     * @generated
     */
    int ATOM = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM__VARIABLE_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM__OPERATOR = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM__TEMPLATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Atom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Atom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.OperatorImpl
     * @see rule.condition.impl.ConditionPackageImpl#getOperator()
     * @generated
     */
    int OPERATOR = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__VISUAL_ELEMENTS = ATOM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__ID = ATOM__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__VARIABLE_ASSIGNMENTS = ATOM__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__OPERATOR = ATOM__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__TEMPLATE = ATOM__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR__OPERANDS = ATOM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_OPERATION_COUNT = ATOM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.ConstantImpl
     * @see rule.condition.impl.ConditionPackageImpl#getConstant()
     * @generated
     */
    int CONSTANT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__VISUAL_ELEMENTS = ATOM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__ID = ATOM__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__VARIABLE_ASSIGNMENTS = ATOM__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__OPERATOR = ATOM__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__TEMPLATE = ATOM__TEMPLATE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__VALUE = ATOM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Constant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_OPERATION_COUNT = ATOM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.FormulaTemplateImpl <em>Formula Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.FormulaTemplateImpl
     * @see rule.condition.impl.ConditionPackageImpl#getFormulaTemplate()
     * @generated
     */
    int FORMULA_TEMPLATE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__VARIABLE_DECLARATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Root Atom</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE__ROOT_ATOM = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Formula Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Formula Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_TEMPLATE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.FormulaInstantiationImpl <em>Formula Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.FormulaInstantiationImpl
     * @see rule.condition.impl.ConditionPackageImpl#getFormulaInstantiation()
     * @generated
     */
    int FORMULA_INSTANTIATION = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__VISUAL_ELEMENTS = ATOM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__ID = ATOM__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__VARIABLE_ASSIGNMENTS = ATOM__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__OPERATOR = ATOM__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__TEMPLATE = ATOM__TEMPLATE;

    /**
     * The feature id for the '<em><b>Formula Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION__FORMULA_TEMPLATE = ATOM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Formula Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Formula Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_INSTANTIATION_OPERATION_COUNT = ATOM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.EventPatternImpl <em>Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.EventPatternImpl
     * @see rule.condition.impl.ConditionPackageImpl#getEventPattern()
     * @generated
     */
    int EVENT_PATTERN = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__OPERATOR = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__TEMPLATE = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN__MODALITY = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.TimeStepEventPatternImpl <em>Time Step Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.TimeStepEventPatternImpl
     * @see rule.condition.impl.ConditionPackageImpl#getTimeStepEventPattern()
     * @generated
     */
    int TIME_STEP_EVENT_PATTERN = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__VISUAL_ELEMENTS = EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__ID = EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__OPERATOR = EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__TEMPLATE = EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__MODALITY = EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Timestamp Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN = EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Time Step Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN_FEATURE_COUNT = EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Time Step Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_STEP_EVENT_PATTERN_OPERATION_COUNT = EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.FormulaVariableReferenceImpl <em>Formula Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.FormulaVariableReferenceImpl
     * @see rule.condition.impl.ConditionPackageImpl#getFormulaVariableReference()
     * @generated
     */
    int FORMULA_VARIABLE_REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__VISUAL_ELEMENTS = ATOM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__ID = ATOM__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__VARIABLE_ASSIGNMENTS = ATOM__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__OPERATOR = ATOM__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__TEMPLATE = ATOM__TEMPLATE;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE__VARIABLE = ATOM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Formula Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Formula Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_REFERENCE_OPERATION_COUNT = ATOM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.FormulaAssignmentImpl <em>Formula Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.FormulaAssignmentImpl
     * @see rule.condition.impl.ConditionPackageImpl#getFormulaAssignment()
     * @generated
     */
    int FORMULA_ASSIGNMENT = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT__VISUAL_ELEMENTS = VariablePackage.STATIC_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT__ID = VariablePackage.STATIC_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT__TARGET = VariablePackage.STATIC_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT__VALUE = VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Formula Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT_FEATURE_COUNT = VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Formula Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_ASSIGNMENT_OPERATION_COUNT = VariablePackage.STATIC_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.FormulaVariableImpl <em>Formula Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.FormulaVariableImpl
     * @see rule.condition.impl.ConditionPackageImpl#getFormulaVariable()
     * @generated
     */
    int FORMULA_VARIABLE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE__VISUAL_ELEMENTS = VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE__ID = VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE__NAME = VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Formula Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_FEATURE_COUNT = VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Formula Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA_VARIABLE_OPERATION_COUNT = VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.ArityImpl <em>Arity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.ArityImpl
     * @see rule.condition.impl.ConditionPackageImpl#getArity()
     * @generated
     */
    int ARITY = 14;

    /**
     * The number of structural features of the '<em>Arity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARITY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Arity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.UnaryImpl <em>Unary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.UnaryImpl
     * @see rule.condition.impl.ConditionPackageImpl#getUnary()
     * @generated
     */
    int UNARY = 10;

    /**
     * The number of structural features of the '<em>Unary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_FEATURE_COUNT = ARITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Unary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_OPERATION_COUNT = ARITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.BinaryImpl <em>Binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.BinaryImpl
     * @see rule.condition.impl.ConditionPackageImpl#getBinary()
     * @generated
     */
    int BINARY = 11;

    /**
     * The number of structural features of the '<em>Binary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_FEATURE_COUNT = ARITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Binary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_OPERATION_COUNT = ARITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.MultiaryImpl <em>Multiary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.MultiaryImpl
     * @see rule.condition.impl.ConditionPackageImpl#getMultiary()
     * @generated
     */
    int MULTIARY = 12;

    /**
     * The number of structural features of the '<em>Multiary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIARY_FEATURE_COUNT = ARITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Multiary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIARY_OPERATION_COUNT = ARITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.NullaryImpl <em>Nullary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.NullaryImpl
     * @see rule.condition.impl.ConditionPackageImpl#getNullary()
     * @generated
     */
    int NULLARY = 13;

    /**
     * The number of structural features of the '<em>Nullary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULLARY_FEATURE_COUNT = ARITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Nullary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULLARY_OPERATION_COUNT = ARITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.condition.impl.PatternOperatorImpl <em>Pattern Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.impl.PatternOperatorImpl
     * @see rule.condition.impl.ConditionPackageImpl#getPatternOperator()
     * @generated
     */
    int PATTERN_OPERATOR = 15;

    /**
     * The feature id for the '<em><b>Operands</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_OPERATOR__OPERANDS = 0;

    /**
     * The number of structural features of the '<em>Pattern Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_OPERATOR_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Pattern Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_OPERATOR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link rule.condition.TruthValue <em>Truth Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.condition.TruthValue
     * @see rule.condition.impl.ConditionPackageImpl#getTruthValue()
     * @generated
     */
    int TRUTH_VALUE = 16;


    /**
     * Returns the meta object for class '{@link rule.condition.Atom <em>Atom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Atom</em>'.
     * @see rule.condition.Atom
     * @generated
     */
    EClass getAtom();

    /**
     * Returns the meta object for the containment reference list '{@link rule.condition.Atom#getVariableAssignments <em>Variable Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
     * @see rule.condition.Atom#getVariableAssignments()
     * @see #getAtom()
     * @generated
     */
    EReference getAtom_VariableAssignments();

    /**
     * Returns the meta object for the container reference '{@link rule.condition.Atom#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Operator</em>'.
     * @see rule.condition.Atom#getOperator()
     * @see #getAtom()
     * @generated
     */
    EReference getAtom_Operator();

    /**
     * Returns the meta object for the reference '{@link rule.condition.Atom#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Template</em>'.
     * @see rule.condition.Atom#getTemplate()
     * @see #getAtom()
     * @generated
     */
    EReference getAtom_Template();

    /**
     * Returns the meta object for class '{@link rule.condition.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator</em>'.
     * @see rule.condition.Operator
     * @generated
     */
    EClass getOperator();

    /**
     * Returns the meta object for the containment reference list '{@link rule.condition.Operator#getOperands <em>Operands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operands</em>'.
     * @see rule.condition.Operator#getOperands()
     * @see #getOperator()
     * @generated
     */
    EReference getOperator_Operands();

    /**
     * Returns the meta object for class '{@link rule.condition.Constant <em>Constant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant</em>'.
     * @see rule.condition.Constant
     * @generated
     */
    EClass getConstant();

    /**
     * Returns the meta object for the attribute '{@link rule.condition.Constant#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see rule.condition.Constant#getValue()
     * @see #getConstant()
     * @generated
     */
    EAttribute getConstant_Value();

    /**
     * Returns the meta object for class '{@link rule.condition.FormulaTemplate <em>Formula Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Template</em>'.
     * @see rule.condition.FormulaTemplate
     * @generated
     */
    EClass getFormulaTemplate();

    /**
     * Returns the meta object for the containment reference list '{@link rule.condition.FormulaTemplate#getVariableDeclarations <em>Variable Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
     * @see rule.condition.FormulaTemplate#getVariableDeclarations()
     * @see #getFormulaTemplate()
     * @generated
     */
    EReference getFormulaTemplate_VariableDeclarations();

    /**
     * Returns the meta object for the containment reference list '{@link rule.condition.FormulaTemplate#getVariableAssignments <em>Variable Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
     * @see rule.condition.FormulaTemplate#getVariableAssignments()
     * @see #getFormulaTemplate()
     * @generated
     */
    EReference getFormulaTemplate_VariableAssignments();

    /**
     * Returns the meta object for the attribute '{@link rule.condition.FormulaTemplate#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see rule.condition.FormulaTemplate#getName()
     * @see #getFormulaTemplate()
     * @generated
     */
    EAttribute getFormulaTemplate_Name();

    /**
     * Returns the meta object for the attribute '{@link rule.condition.FormulaTemplate#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see rule.condition.FormulaTemplate#getDescription()
     * @see #getFormulaTemplate()
     * @generated
     */
    EAttribute getFormulaTemplate_Description();

    /**
     * Returns the meta object for the containment reference '{@link rule.condition.FormulaTemplate#getRootAtom <em>Root Atom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Atom</em>'.
     * @see rule.condition.FormulaTemplate#getRootAtom()
     * @see #getFormulaTemplate()
     * @generated
     */
    EReference getFormulaTemplate_RootAtom();

    /**
     * Returns the meta object for class '{@link rule.condition.FormulaInstantiation <em>Formula Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Instantiation</em>'.
     * @see rule.condition.FormulaInstantiation
     * @generated
     */
    EClass getFormulaInstantiation();

    /**
     * Returns the meta object for the reference '{@link rule.condition.FormulaInstantiation#getFormulaTemplate <em>Formula Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Formula Template</em>'.
     * @see rule.condition.FormulaInstantiation#getFormulaTemplate()
     * @see #getFormulaInstantiation()
     * @generated
     */
    EReference getFormulaInstantiation_FormulaTemplate();

    /**
     * Returns the meta object for class '{@link rule.condition.EventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Pattern</em>'.
     * @see rule.condition.EventPattern
     * @generated
     */
    EClass getEventPattern();

    /**
     * Returns the meta object for the attribute '{@link rule.condition.EventPattern#getModality <em>Modality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modality</em>'.
     * @see rule.condition.EventPattern#getModality()
     * @see #getEventPattern()
     * @generated
     */
    EAttribute getEventPattern_Modality();

    /**
     * Returns the meta object for class '{@link rule.condition.TimeStepEventPattern <em>Time Step Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Step Event Pattern</em>'.
     * @see rule.condition.TimeStepEventPattern
     * @generated
     */
    EClass getTimeStepEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link rule.condition.TimeStepEventPattern#getTimestampPattern <em>Timestamp Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timestamp Pattern</em>'.
     * @see rule.condition.TimeStepEventPattern#getTimestampPattern()
     * @see #getTimeStepEventPattern()
     * @generated
     */
    EReference getTimeStepEventPattern_TimestampPattern();

    /**
     * Returns the meta object for class '{@link rule.condition.FormulaVariableReference <em>Formula Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Variable Reference</em>'.
     * @see rule.condition.FormulaVariableReference
     * @generated
     */
    EClass getFormulaVariableReference();

    /**
     * Returns the meta object for the reference '{@link rule.condition.FormulaVariableReference#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see rule.condition.FormulaVariableReference#getVariable()
     * @see #getFormulaVariableReference()
     * @generated
     */
    EReference getFormulaVariableReference_Variable();

    /**
     * Returns the meta object for class '{@link rule.condition.FormulaAssignment <em>Formula Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Assignment</em>'.
     * @see rule.condition.FormulaAssignment
     * @generated
     */
    EClass getFormulaAssignment();

    /**
     * Returns the meta object for the containment reference '{@link rule.condition.FormulaAssignment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see rule.condition.FormulaAssignment#getValue()
     * @see #getFormulaAssignment()
     * @generated
     */
    EReference getFormulaAssignment_Value();

    /**
     * Returns the meta object for class '{@link rule.condition.FormulaVariable <em>Formula Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formula Variable</em>'.
     * @see rule.condition.FormulaVariable
     * @generated
     */
    EClass getFormulaVariable();

    /**
     * Returns the meta object for class '{@link rule.condition.Unary <em>Unary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary</em>'.
     * @see rule.condition.Unary
     * @generated
     */
    EClass getUnary();

    /**
     * Returns the meta object for class '{@link rule.condition.Binary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary</em>'.
     * @see rule.condition.Binary
     * @generated
     */
    EClass getBinary();

    /**
     * Returns the meta object for class '{@link rule.condition.Multiary <em>Multiary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiary</em>'.
     * @see rule.condition.Multiary
     * @generated
     */
    EClass getMultiary();

    /**
     * Returns the meta object for class '{@link rule.condition.Nullary <em>Nullary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nullary</em>'.
     * @see rule.condition.Nullary
     * @generated
     */
    EClass getNullary();

    /**
     * Returns the meta object for class '{@link rule.condition.Arity <em>Arity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Arity</em>'.
     * @see rule.condition.Arity
     * @generated
     */
    EClass getArity();

    /**
     * Returns the meta object for class '{@link rule.condition.PatternOperator <em>Pattern Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern Operator</em>'.
     * @see rule.condition.PatternOperator
     * @generated
     */
    EClass getPatternOperator();

    /**
     * Returns the meta object for the reference '{@link rule.condition.PatternOperator#getOperands <em>Operands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operands</em>'.
     * @see rule.condition.PatternOperator#getOperands()
     * @see #getPatternOperator()
     * @generated
     */
    EReference getPatternOperator_Operands();

    /**
     * Returns the meta object for enum '{@link rule.condition.TruthValue <em>Truth Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Truth Value</em>'.
     * @see rule.condition.TruthValue
     * @generated
     */
    EEnum getTruthValue();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConditionFactory getConditionFactory();

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
         * The meta object literal for the '{@link rule.condition.impl.AtomImpl <em>Atom</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.AtomImpl
         * @see rule.condition.impl.ConditionPackageImpl#getAtom()
         * @generated
         */
        EClass ATOM = eINSTANCE.getAtom();

        /**
         * The meta object literal for the '<em><b>Variable Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATOM__VARIABLE_ASSIGNMENTS = eINSTANCE.getAtom_VariableAssignments();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATOM__OPERATOR = eINSTANCE.getAtom_Operator();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATOM__TEMPLATE = eINSTANCE.getAtom_Template();

        /**
         * The meta object literal for the '{@link rule.condition.impl.OperatorImpl <em>Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.OperatorImpl
         * @see rule.condition.impl.ConditionPackageImpl#getOperator()
         * @generated
         */
        EClass OPERATOR = eINSTANCE.getOperator();

        /**
         * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATOR__OPERANDS = eINSTANCE.getOperator_Operands();

        /**
         * The meta object literal for the '{@link rule.condition.impl.ConstantImpl <em>Constant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.ConstantImpl
         * @see rule.condition.impl.ConditionPackageImpl#getConstant()
         * @generated
         */
        EClass CONSTANT = eINSTANCE.getConstant();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

        /**
         * The meta object literal for the '{@link rule.condition.impl.FormulaTemplateImpl <em>Formula Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.FormulaTemplateImpl
         * @see rule.condition.impl.ConditionPackageImpl#getFormulaTemplate()
         * @generated
         */
        EClass FORMULA_TEMPLATE = eINSTANCE.getFormulaTemplate();

        /**
         * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_TEMPLATE__VARIABLE_DECLARATIONS = eINSTANCE.getFormulaTemplate_VariableDeclarations();

        /**
         * The meta object literal for the '<em><b>Variable Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS = eINSTANCE.getFormulaTemplate_VariableAssignments();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_TEMPLATE__NAME = eINSTANCE.getFormulaTemplate_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA_TEMPLATE__DESCRIPTION = eINSTANCE.getFormulaTemplate_Description();

        /**
         * The meta object literal for the '<em><b>Root Atom</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_TEMPLATE__ROOT_ATOM = eINSTANCE.getFormulaTemplate_RootAtom();

        /**
         * The meta object literal for the '{@link rule.condition.impl.FormulaInstantiationImpl <em>Formula Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.FormulaInstantiationImpl
         * @see rule.condition.impl.ConditionPackageImpl#getFormulaInstantiation()
         * @generated
         */
        EClass FORMULA_INSTANTIATION = eINSTANCE.getFormulaInstantiation();

        /**
         * The meta object literal for the '<em><b>Formula Template</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_INSTANTIATION__FORMULA_TEMPLATE = eINSTANCE.getFormulaInstantiation_FormulaTemplate();

        /**
         * The meta object literal for the '{@link rule.condition.impl.EventPatternImpl <em>Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.EventPatternImpl
         * @see rule.condition.impl.ConditionPackageImpl#getEventPattern()
         * @generated
         */
        EClass EVENT_PATTERN = eINSTANCE.getEventPattern();

        /**
         * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_PATTERN__MODALITY = eINSTANCE.getEventPattern_Modality();

        /**
         * The meta object literal for the '{@link rule.condition.impl.TimeStepEventPatternImpl <em>Time Step Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.TimeStepEventPatternImpl
         * @see rule.condition.impl.ConditionPackageImpl#getTimeStepEventPattern()
         * @generated
         */
        EClass TIME_STEP_EVENT_PATTERN = eINSTANCE.getTimeStepEventPattern();

        /**
         * The meta object literal for the '<em><b>Timestamp Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_STEP_EVENT_PATTERN__TIMESTAMP_PATTERN = eINSTANCE.getTimeStepEventPattern_TimestampPattern();

        /**
         * The meta object literal for the '{@link rule.condition.impl.FormulaVariableReferenceImpl <em>Formula Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.FormulaVariableReferenceImpl
         * @see rule.condition.impl.ConditionPackageImpl#getFormulaVariableReference()
         * @generated
         */
        EClass FORMULA_VARIABLE_REFERENCE = eINSTANCE.getFormulaVariableReference();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getFormulaVariableReference_Variable();

        /**
         * The meta object literal for the '{@link rule.condition.impl.FormulaAssignmentImpl <em>Formula Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.FormulaAssignmentImpl
         * @see rule.condition.impl.ConditionPackageImpl#getFormulaAssignment()
         * @generated
         */
        EClass FORMULA_ASSIGNMENT = eINSTANCE.getFormulaAssignment();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FORMULA_ASSIGNMENT__VALUE = eINSTANCE.getFormulaAssignment_Value();

        /**
         * The meta object literal for the '{@link rule.condition.impl.FormulaVariableImpl <em>Formula Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.FormulaVariableImpl
         * @see rule.condition.impl.ConditionPackageImpl#getFormulaVariable()
         * @generated
         */
        EClass FORMULA_VARIABLE = eINSTANCE.getFormulaVariable();

        /**
         * The meta object literal for the '{@link rule.condition.impl.UnaryImpl <em>Unary</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.UnaryImpl
         * @see rule.condition.impl.ConditionPackageImpl#getUnary()
         * @generated
         */
        EClass UNARY = eINSTANCE.getUnary();

        /**
         * The meta object literal for the '{@link rule.condition.impl.BinaryImpl <em>Binary</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.BinaryImpl
         * @see rule.condition.impl.ConditionPackageImpl#getBinary()
         * @generated
         */
        EClass BINARY = eINSTANCE.getBinary();

        /**
         * The meta object literal for the '{@link rule.condition.impl.MultiaryImpl <em>Multiary</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.MultiaryImpl
         * @see rule.condition.impl.ConditionPackageImpl#getMultiary()
         * @generated
         */
        EClass MULTIARY = eINSTANCE.getMultiary();

        /**
         * The meta object literal for the '{@link rule.condition.impl.NullaryImpl <em>Nullary</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.NullaryImpl
         * @see rule.condition.impl.ConditionPackageImpl#getNullary()
         * @generated
         */
        EClass NULLARY = eINSTANCE.getNullary();

        /**
         * The meta object literal for the '{@link rule.condition.impl.ArityImpl <em>Arity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.ArityImpl
         * @see rule.condition.impl.ConditionPackageImpl#getArity()
         * @generated
         */
        EClass ARITY = eINSTANCE.getArity();

        /**
         * The meta object literal for the '{@link rule.condition.impl.PatternOperatorImpl <em>Pattern Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.impl.PatternOperatorImpl
         * @see rule.condition.impl.ConditionPackageImpl#getPatternOperator()
         * @generated
         */
        EClass PATTERN_OPERATOR = eINSTANCE.getPatternOperator();

        /**
         * The meta object literal for the '<em><b>Operands</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATTERN_OPERATOR__OPERANDS = eINSTANCE.getPatternOperator_Operands();

        /**
         * The meta object literal for the '{@link rule.condition.TruthValue <em>Truth Value</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.condition.TruthValue
         * @see rule.condition.impl.ConditionPackageImpl#getTruthValue()
         * @generated
         */
        EEnum TRUTH_VALUE = eINSTANCE.getTruthValue();

    }

} //ConditionPackage
