/**
 */
package rule.temporal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import rule.condition.ConditionPackage;

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
 * @see rule.temporal.TemporalFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "temporal";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/temporal/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-temporal";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TemporalPackage eINSTANCE = rule.temporal.impl.TemporalPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.temporal.impl.PastTemporalOperatorImpl <em>Past Temporal Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.PastTemporalOperatorImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getPastTemporalOperator()
     * @generated
     */
    int PAST_TEMPORAL_OPERATOR = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS = ConditionPackage.OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__ID = ConditionPackage.OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS = ConditionPackage.OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__OPERATOR = ConditionPackage.OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__TEMPLATE = ConditionPackage.OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR__OPERANDS = ConditionPackage.OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Past Temporal Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR_FEATURE_COUNT = ConditionPackage.OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Past Temporal Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAST_TEMPORAL_OPERATOR_OPERATION_COUNT = ConditionPackage.OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.AlwaysImpl <em>Always</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.AlwaysImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getAlways()
     * @generated
     */
    int ALWAYS = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__VISUAL_ELEMENTS = PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__ID = PAST_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__VARIABLE_ASSIGNMENTS = PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__OPERATOR = PAST_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__TEMPLATE = PAST_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS__OPERANDS = PAST_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Always</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS_FEATURE_COUNT = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Always</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALWAYS_OPERATION_COUNT = PAST_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.SinceImpl <em>Since</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.SinceImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getSince()
     * @generated
     */
    int SINCE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__VISUAL_ELEMENTS = PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__ID = PAST_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__VARIABLE_ASSIGNMENTS = PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__OPERATOR = PAST_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__TEMPLATE = PAST_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE__OPERANDS = PAST_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Since</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE_FEATURE_COUNT = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Since</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINCE_OPERATION_COUNT = PAST_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.TimeBoundedTemporalOperatorImpl <em>Time Bounded Temporal Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.TimeBoundedTemporalOperatorImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getTimeBoundedTemporalOperator()
     * @generated
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__VISUAL_ELEMENTS = PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__ID = PAST_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS = PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__OPERATOR = PAST_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__TEMPLATE = PAST_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__OPERANDS = PAST_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Time Bounded Temporal Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR_FEATURE_COUNT = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Time Bounded Temporal Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_TEMPORAL_OPERATOR_OPERATION_COUNT = PAST_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.TimeBoundedOccurrenceImpl <em>Time Bounded Occurrence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.TimeBoundedOccurrenceImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getTimeBoundedOccurrence()
     * @generated
     */
    int TIME_BOUNDED_OCCURRENCE = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__VISUAL_ELEMENTS = TIME_BOUNDED_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__ID = TIME_BOUNDED_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__VARIABLE_ASSIGNMENTS = TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__OPERATOR = TIME_BOUNDED_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__TEMPLATE = TIME_BOUNDED_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__OPERANDS = TIME_BOUNDED_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__TIME_BOUND_IN_TIME_STEPS = TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE__VARIABLE = TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE;

    /**
     * The number of structural features of the '<em>Time Bounded Occurrence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE_FEATURE_COUNT = TIME_BOUNDED_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Time Bounded Occurrence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_OCCURRENCE_OPERATION_COUNT = TIME_BOUNDED_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.BeforeImpl <em>Before</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.BeforeImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getBefore()
     * @generated
     */
    int BEFORE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__VISUAL_ELEMENTS = TIME_BOUNDED_OCCURRENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__ID = TIME_BOUNDED_OCCURRENCE__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__VARIABLE_ASSIGNMENTS = TIME_BOUNDED_OCCURRENCE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__OPERATOR = TIME_BOUNDED_OCCURRENCE__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__TEMPLATE = TIME_BOUNDED_OCCURRENCE__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__OPERANDS = TIME_BOUNDED_OCCURRENCE__OPERANDS;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__TIME_BOUND_IN_TIME_STEPS = TIME_BOUNDED_OCCURRENCE__TIME_BOUND_IN_TIME_STEPS;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE__VARIABLE = TIME_BOUNDED_OCCURRENCE__VARIABLE;

    /**
     * The number of structural features of the '<em>Before</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE_FEATURE_COUNT = TIME_BOUNDED_OCCURRENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Before</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEFORE_OPERATION_COUNT = TIME_BOUNDED_OCCURRENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.WithinImpl <em>Within</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.WithinImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getWithin()
     * @generated
     */
    int WITHIN = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__VISUAL_ELEMENTS = TIME_BOUNDED_OCCURRENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__ID = TIME_BOUNDED_OCCURRENCE__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__VARIABLE_ASSIGNMENTS = TIME_BOUNDED_OCCURRENCE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__OPERATOR = TIME_BOUNDED_OCCURRENCE__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__TEMPLATE = TIME_BOUNDED_OCCURRENCE__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__OPERANDS = TIME_BOUNDED_OCCURRENCE__OPERANDS;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__TIME_BOUND_IN_TIME_STEPS = TIME_BOUNDED_OCCURRENCE__TIME_BOUND_IN_TIME_STEPS;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN__VARIABLE = TIME_BOUNDED_OCCURRENCE__VARIABLE;

    /**
     * The number of structural features of the '<em>Within</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN_FEATURE_COUNT = TIME_BOUNDED_OCCURRENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Within</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITHIN_OPERATION_COUNT = TIME_BOUNDED_OCCURRENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.DuringImpl <em>During</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.DuringImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getDuring()
     * @generated
     */
    int DURING = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__VISUAL_ELEMENTS = TIME_BOUNDED_OCCURRENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__ID = TIME_BOUNDED_OCCURRENCE__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__VARIABLE_ASSIGNMENTS = TIME_BOUNDED_OCCURRENCE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__OPERATOR = TIME_BOUNDED_OCCURRENCE__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__TEMPLATE = TIME_BOUNDED_OCCURRENCE__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__OPERANDS = TIME_BOUNDED_OCCURRENCE__OPERANDS;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__TIME_BOUND_IN_TIME_STEPS = TIME_BOUNDED_OCCURRENCE__TIME_BOUND_IN_TIME_STEPS;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING__VARIABLE = TIME_BOUNDED_OCCURRENCE__VARIABLE;

    /**
     * The number of structural features of the '<em>During</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_FEATURE_COUNT = TIME_BOUNDED_OCCURRENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>During</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_OPERATION_COUNT = TIME_BOUNDED_OCCURRENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.CardinalityOperatorImpl <em>Cardinality Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.CardinalityOperatorImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getCardinalityOperator()
     * @generated
     */
    int CARDINALITY_OPERATOR = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__VISUAL_ELEMENTS = PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__ID = PAST_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__VARIABLE_ASSIGNMENTS = PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__OPERATOR = PAST_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__TEMPLATE = PAST_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__OPERANDS = PAST_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR__UPPER_BOUND = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Cardinality Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR_FEATURE_COUNT = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Cardinality Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATOR_OPERATION_COUNT = PAST_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.EventuallyImpl <em>Eventually</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.EventuallyImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getEventually()
     * @generated
     */
    int EVENTUALLY = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__VISUAL_ELEMENTS = PAST_TEMPORAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__ID = PAST_TEMPORAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__VARIABLE_ASSIGNMENTS = PAST_TEMPORAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__OPERATOR = PAST_TEMPORAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__TEMPLATE = PAST_TEMPORAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY__OPERANDS = PAST_TEMPORAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Eventually</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY_FEATURE_COUNT = PAST_TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Eventually</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENTUALLY_OPERATION_COUNT = PAST_TEMPORAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.RepeatLimitImpl <em>Repeat Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.RepeatLimitImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getRepeatLimit()
     * @generated
     */
    int REPEAT_LIMIT = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__VISUAL_ELEMENTS = CARDINALITY_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__ID = CARDINALITY_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__VARIABLE_ASSIGNMENTS = CARDINALITY_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__OPERATOR = CARDINALITY_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__TEMPLATE = CARDINALITY_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__OPERANDS = CARDINALITY_OPERATOR__OPERANDS;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__UPPER_BOUND = CARDINALITY_OPERATOR__UPPER_BOUND;

    /**
     * The feature id for the '<em><b>Time Bound In Time Steps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__TIME_BOUND_IN_TIME_STEPS = CARDINALITY_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__VARIABLE = CARDINALITY_OPERATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT__LOWER_BOUND = CARDINALITY_OPERATOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Repeat Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT_FEATURE_COUNT = CARDINALITY_OPERATOR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Repeat Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_LIMIT_OPERATION_COUNT = CARDINALITY_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.RepeatSinceImpl <em>Repeat Since</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.RepeatSinceImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getRepeatSince()
     * @generated
     */
    int REPEAT_SINCE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__VISUAL_ELEMENTS = CARDINALITY_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__ID = CARDINALITY_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__VARIABLE_ASSIGNMENTS = CARDINALITY_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__OPERATOR = CARDINALITY_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__TEMPLATE = CARDINALITY_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__OPERANDS = CARDINALITY_OPERATOR__OPERANDS;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE__UPPER_BOUND = CARDINALITY_OPERATOR__UPPER_BOUND;

    /**
     * The number of structural features of the '<em>Repeat Since</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE_FEATURE_COUNT = CARDINALITY_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Repeat Since</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_SINCE_OPERATION_COUNT = CARDINALITY_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.temporal.impl.RepeatMaximumImpl <em>Repeat Maximum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.temporal.impl.RepeatMaximumImpl
     * @see rule.temporal.impl.TemporalPackageImpl#getRepeatMaximum()
     * @generated
     */
    int REPEAT_MAXIMUM = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__VISUAL_ELEMENTS = REPEAT_SINCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__ID = REPEAT_SINCE__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__VARIABLE_ASSIGNMENTS = REPEAT_SINCE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__OPERATOR = REPEAT_SINCE__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__TEMPLATE = REPEAT_SINCE__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__OPERANDS = REPEAT_SINCE__OPERANDS;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM__UPPER_BOUND = REPEAT_SINCE__UPPER_BOUND;

    /**
     * The number of structural features of the '<em>Repeat Maximum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM_FEATURE_COUNT = REPEAT_SINCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Repeat Maximum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_MAXIMUM_OPERATION_COUNT = REPEAT_SINCE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link rule.temporal.Always <em>Always</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Always</em>'.
     * @see rule.temporal.Always
     * @generated
     */
    EClass getAlways();

    /**
     * Returns the meta object for class '{@link rule.temporal.Since <em>Since</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Since</em>'.
     * @see rule.temporal.Since
     * @generated
     */
    EClass getSince();

    /**
     * Returns the meta object for class '{@link rule.temporal.Before <em>Before</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Before</em>'.
     * @see rule.temporal.Before
     * @generated
     */
    EClass getBefore();

    /**
     * Returns the meta object for class '{@link rule.temporal.Within <em>Within</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Within</em>'.
     * @see rule.temporal.Within
     * @generated
     */
    EClass getWithin();

    /**
     * Returns the meta object for class '{@link rule.temporal.During <em>During</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>During</em>'.
     * @see rule.temporal.During
     * @generated
     */
    EClass getDuring();

    /**
     * Returns the meta object for class '{@link rule.temporal.CardinalityOperator <em>Cardinality Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cardinality Operator</em>'.
     * @see rule.temporal.CardinalityOperator
     * @generated
     */
    EClass getCardinalityOperator();

    /**
     * Returns the meta object for the attribute '{@link rule.temporal.CardinalityOperator#getUpperBound <em>Upper Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper Bound</em>'.
     * @see rule.temporal.CardinalityOperator#getUpperBound()
     * @see #getCardinalityOperator()
     * @generated
     */
    EAttribute getCardinalityOperator_UpperBound();

    /**
     * Returns the meta object for class '{@link rule.temporal.TimeBoundedTemporalOperator <em>Time Bounded Temporal Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Bounded Temporal Operator</em>'.
     * @see rule.temporal.TimeBoundedTemporalOperator
     * @generated
     */
    EClass getTimeBoundedTemporalOperator();

    /**
     * Returns the meta object for the attribute '{@link rule.temporal.TimeBoundedTemporalOperator#getTimeBoundInTimeSteps <em>Time Bound In Time Steps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Bound In Time Steps</em>'.
     * @see rule.temporal.TimeBoundedTemporalOperator#getTimeBoundInTimeSteps()
     * @see #getTimeBoundedTemporalOperator()
     * @generated
     */
    EAttribute getTimeBoundedTemporalOperator_TimeBoundInTimeSteps();

    /**
     * Returns the meta object for the reference '{@link rule.temporal.TimeBoundedTemporalOperator#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see rule.temporal.TimeBoundedTemporalOperator#getVariable()
     * @see #getTimeBoundedTemporalOperator()
     * @generated
     */
    EReference getTimeBoundedTemporalOperator_Variable();

    /**
     * Returns the meta object for class '{@link rule.temporal.PastTemporalOperator <em>Past Temporal Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Past Temporal Operator</em>'.
     * @see rule.temporal.PastTemporalOperator
     * @generated
     */
    EClass getPastTemporalOperator();

    /**
     * Returns the meta object for class '{@link rule.temporal.TimeBoundedOccurrence <em>Time Bounded Occurrence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Bounded Occurrence</em>'.
     * @see rule.temporal.TimeBoundedOccurrence
     * @generated
     */
    EClass getTimeBoundedOccurrence();

    /**
     * Returns the meta object for class '{@link rule.temporal.Eventually <em>Eventually</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Eventually</em>'.
     * @see rule.temporal.Eventually
     * @generated
     */
    EClass getEventually();

    /**
     * Returns the meta object for class '{@link rule.temporal.RepeatLimit <em>Repeat Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repeat Limit</em>'.
     * @see rule.temporal.RepeatLimit
     * @generated
     */
    EClass getRepeatLimit();

    /**
     * Returns the meta object for the attribute '{@link rule.temporal.RepeatLimit#getLowerBound <em>Lower Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower Bound</em>'.
     * @see rule.temporal.RepeatLimit#getLowerBound()
     * @see #getRepeatLimit()
     * @generated
     */
    EAttribute getRepeatLimit_LowerBound();

    /**
     * Returns the meta object for class '{@link rule.temporal.RepeatSince <em>Repeat Since</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repeat Since</em>'.
     * @see rule.temporal.RepeatSince
     * @generated
     */
    EClass getRepeatSince();

    /**
     * Returns the meta object for class '{@link rule.temporal.RepeatMaximum <em>Repeat Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repeat Maximum</em>'.
     * @see rule.temporal.RepeatMaximum
     * @generated
     */
    EClass getRepeatMaximum();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TemporalFactory getTemporalFactory();

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
         * The meta object literal for the '{@link rule.temporal.impl.AlwaysImpl <em>Always</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.AlwaysImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getAlways()
         * @generated
         */
        EClass ALWAYS = eINSTANCE.getAlways();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.SinceImpl <em>Since</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.SinceImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getSince()
         * @generated
         */
        EClass SINCE = eINSTANCE.getSince();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.BeforeImpl <em>Before</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.BeforeImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getBefore()
         * @generated
         */
        EClass BEFORE = eINSTANCE.getBefore();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.WithinImpl <em>Within</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.WithinImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getWithin()
         * @generated
         */
        EClass WITHIN = eINSTANCE.getWithin();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.DuringImpl <em>During</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.DuringImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getDuring()
         * @generated
         */
        EClass DURING = eINSTANCE.getDuring();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.CardinalityOperatorImpl <em>Cardinality Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.CardinalityOperatorImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getCardinalityOperator()
         * @generated
         */
        EClass CARDINALITY_OPERATOR = eINSTANCE.getCardinalityOperator();

        /**
         * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CARDINALITY_OPERATOR__UPPER_BOUND = eINSTANCE.getCardinalityOperator_UpperBound();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.TimeBoundedTemporalOperatorImpl <em>Time Bounded Temporal Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.TimeBoundedTemporalOperatorImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getTimeBoundedTemporalOperator()
         * @generated
         */
        EClass TIME_BOUNDED_TEMPORAL_OPERATOR = eINSTANCE.getTimeBoundedTemporalOperator();

        /**
         * The meta object literal for the '<em><b>Time Bound In Time Steps</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_BOUNDED_TEMPORAL_OPERATOR__TIME_BOUND_IN_TIME_STEPS = eINSTANCE.getTimeBoundedTemporalOperator_TimeBoundInTimeSteps();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIME_BOUNDED_TEMPORAL_OPERATOR__VARIABLE = eINSTANCE.getTimeBoundedTemporalOperator_Variable();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.PastTemporalOperatorImpl <em>Past Temporal Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.PastTemporalOperatorImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getPastTemporalOperator()
         * @generated
         */
        EClass PAST_TEMPORAL_OPERATOR = eINSTANCE.getPastTemporalOperator();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.TimeBoundedOccurrenceImpl <em>Time Bounded Occurrence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.TimeBoundedOccurrenceImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getTimeBoundedOccurrence()
         * @generated
         */
        EClass TIME_BOUNDED_OCCURRENCE = eINSTANCE.getTimeBoundedOccurrence();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.EventuallyImpl <em>Eventually</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.EventuallyImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getEventually()
         * @generated
         */
        EClass EVENTUALLY = eINSTANCE.getEventually();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.RepeatLimitImpl <em>Repeat Limit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.RepeatLimitImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getRepeatLimit()
         * @generated
         */
        EClass REPEAT_LIMIT = eINSTANCE.getRepeatLimit();

        /**
         * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPEAT_LIMIT__LOWER_BOUND = eINSTANCE.getRepeatLimit_LowerBound();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.RepeatSinceImpl <em>Repeat Since</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.RepeatSinceImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getRepeatSince()
         * @generated
         */
        EClass REPEAT_SINCE = eINSTANCE.getRepeatSince();

        /**
         * The meta object literal for the '{@link rule.temporal.impl.RepeatMaximumImpl <em>Repeat Maximum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.temporal.impl.RepeatMaximumImpl
         * @see rule.temporal.impl.TemporalPackageImpl#getRepeatMaximum()
         * @generated
         */
        EClass REPEAT_MAXIMUM = eINSTANCE.getRepeatMaximum();

    }

} //TemporalPackage
