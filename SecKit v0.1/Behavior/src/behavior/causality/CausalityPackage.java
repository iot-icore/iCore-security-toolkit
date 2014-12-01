/**
 */
package behavior.causality;

import models.ModelsPackage;

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
 * @see behavior.causality.CausalityFactory
 * @model kind="package"
 * @generated
 */
public interface CausalityPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "causality";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/causality/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-causality";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CausalityPackage eINSTANCE = behavior.causality.impl.CausalityPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.causality.impl.CausalityConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.CausalityConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getCausalityCondition()
     * @generated
     */
    int CAUSALITY_CONDITION = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONDITION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONDITION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONDITION__UNCERTAINTY = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONDITION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONDITION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.BasicCausalityConditionImpl <em>Basic Causality Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.BasicCausalityConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getBasicCausalityCondition()
     * @generated
     */
    int BASIC_CAUSALITY_CONDITION = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_CAUSALITY_CONDITION__VISUAL_ELEMENTS = CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_CAUSALITY_CONDITION__ID = CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_CAUSALITY_CONDITION__UNCERTAINTY = CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The number of structural features of the '<em>Basic Causality Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_CAUSALITY_CONDITION_FEATURE_COUNT = CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Basic Causality Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_CAUSALITY_CONDITION_OPERATION_COUNT = CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.PointConditionImpl <em>Point Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.PointConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getPointCondition()
     * @generated
     */
    int POINT_CONDITION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_CONDITION__VISUAL_ELEMENTS = BASIC_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_CONDITION__ID = BASIC_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_CONDITION__UNCERTAINTY = BASIC_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The number of structural features of the '<em>Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_CONDITION_FEATURE_COUNT = BASIC_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_CONDITION_OPERATION_COUNT = BASIC_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.ExitPointConditionImpl <em>Exit Point Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.ExitPointConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getExitPointCondition()
     * @generated
     */
    int EXIT_POINT_CONDITION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION__VISUAL_ELEMENTS = POINT_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION__ID = POINT_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION__UNCERTAINTY = POINT_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Exit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION__EXIT = POINT_CONDITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION__CONTEXT = POINT_CONDITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Exit Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION_FEATURE_COUNT = POINT_CONDITION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Exit Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_CONDITION_OPERATION_COUNT = POINT_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.EntryPointConditionImpl <em>Entry Point Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.EntryPointConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getEntryPointCondition()
     * @generated
     */
    int ENTRY_POINT_CONDITION = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION__VISUAL_ELEMENTS = POINT_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION__ID = POINT_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION__UNCERTAINTY = POINT_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION__ENTRY = POINT_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entry Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION_FEATURE_COUNT = POINT_CONDITION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entry Point Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_CONDITION_OPERATION_COUNT = POINT_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.BinaryCausalityConditionImpl <em>Binary Causality Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.BinaryCausalityConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getBinaryCausalityCondition()
     * @generated
     */
    int BINARY_CAUSALITY_CONDITION = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION__VISUAL_ELEMENTS = BASIC_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION__ID = BASIC_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION__UNCERTAINTY = BASIC_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION__SOURCE = BASIC_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Binary Causality Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION_FEATURE_COUNT = BASIC_CAUSALITY_CONDITION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Binary Causality Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_CAUSALITY_CONDITION_OPERATION_COUNT = BASIC_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.OrConditionImpl <em>Or Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.OrConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getOrCondition()
     * @generated
     */
    int OR_CONDITION = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION__VISUAL_ELEMENTS = CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION__ID = CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION__UNCERTAINTY = CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION__CONDITIONS = CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Or Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION_FEATURE_COUNT = CAUSALITY_CONDITION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Or Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_CONDITION_OPERATION_COUNT = CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.AndConditionImpl <em>And Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.AndConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getAndCondition()
     * @generated
     */
    int AND_CONDITION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION__VISUAL_ELEMENTS = CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION__ID = CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION__UNCERTAINTY = CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION__CONDITIONS = CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION__CONSTRAINTS = CAUSALITY_CONDITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>And Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION_FEATURE_COUNT = CAUSALITY_CONDITION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>And Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_CONDITION_OPERATION_COUNT = CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.CausalityParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.CausalityParameterImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getCausalityParameter()
     * @generated
     */
    int CAUSALITY_PARAMETER = 6;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_PARAMETER__CONSTRAINTS = 0;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS = 1;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_PARAMETER_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.CausalityRelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.CausalityRelationImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getCausalityRelation()
     * @generated
     */
    int CAUSALITY_RELATION = 8;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION__CONDITION = 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION__TARGET = 1;

    /**
     * The feature id for the '<em><b>Context</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION__CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION__ID = 3;

    /**
     * The number of structural features of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_RELATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.CausalityConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.CausalityConstraintImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getCausalityConstraint()
     * @generated
     */
    int CAUSALITY_CONSTRAINT = 9;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONSTRAINT__EXPRESSION = 0;

    /**
     * The number of structural features of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONSTRAINT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_CONSTRAINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.StartConditionImpl <em>Start Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.StartConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getStartCondition()
     * @generated
     */
    int START_CONDITION = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_CONDITION__VISUAL_ELEMENTS = BASIC_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_CONDITION__ID = BASIC_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_CONDITION__UNCERTAINTY = BASIC_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The number of structural features of the '<em>Start Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_CONDITION_FEATURE_COUNT = BASIC_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Start Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_CONDITION_OPERATION_COUNT = BASIC_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.DisablingConditionImpl <em>Disabling Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.DisablingConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getDisablingCondition()
     * @generated
     */
    int DISABLING_CONDITION = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION__VISUAL_ELEMENTS = BINARY_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION__ID = BINARY_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION__UNCERTAINTY = BINARY_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION__SOURCE = BINARY_CAUSALITY_CONDITION__SOURCE;

    /**
     * The number of structural features of the '<em>Disabling Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION_FEATURE_COUNT = BINARY_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Disabling Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISABLING_CONDITION_OPERATION_COUNT = BINARY_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.EnablingConditionImpl <em>Enabling Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.EnablingConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getEnablingCondition()
     * @generated
     */
    int ENABLING_CONDITION = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION__VISUAL_ELEMENTS = BINARY_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION__ID = BINARY_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION__UNCERTAINTY = BINARY_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION__SOURCE = BINARY_CAUSALITY_CONDITION__SOURCE;

    /**
     * The number of structural features of the '<em>Enabling Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION_FEATURE_COUNT = BINARY_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Enabling Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLING_CONDITION_OPERATION_COUNT = BINARY_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.impl.SynchronizationConditionImpl <em>Synchronization Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.impl.SynchronizationConditionImpl
     * @see behavior.causality.impl.CausalityPackageImpl#getSynchronizationCondition()
     * @generated
     */
    int SYNCHRONIZATION_CONDITION = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION__VISUAL_ELEMENTS = BINARY_CAUSALITY_CONDITION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION__ID = BINARY_CAUSALITY_CONDITION__ID;

    /**
     * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION__UNCERTAINTY = BINARY_CAUSALITY_CONDITION__UNCERTAINTY;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION__SOURCE = BINARY_CAUSALITY_CONDITION__SOURCE;

    /**
     * The number of structural features of the '<em>Synchronization Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION_FEATURE_COUNT = BINARY_CAUSALITY_CONDITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Synchronization Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZATION_CONDITION_OPERATION_COUNT = BINARY_CAUSALITY_CONDITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.causality.Uncertainty <em>Uncertainty</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.causality.Uncertainty
     * @see behavior.causality.impl.CausalityPackageImpl#getUncertainty()
     * @generated
     */
    int UNCERTAINTY = 15;


    /**
     * Returns the meta object for class '{@link behavior.causality.PointCondition <em>Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point Condition</em>'.
     * @see behavior.causality.PointCondition
     * @generated
     */
    EClass getPointCondition();

    /**
     * Returns the meta object for class '{@link behavior.causality.ExitPointCondition <em>Exit Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit Point Condition</em>'.
     * @see behavior.causality.ExitPointCondition
     * @generated
     */
    EClass getExitPointCondition();

    /**
     * Returns the meta object for the reference '{@link behavior.causality.ExitPointCondition#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exit</em>'.
     * @see behavior.causality.ExitPointCondition#getExit()
     * @see #getExitPointCondition()
     * @generated
     */
    EReference getExitPointCondition_Exit();

    /**
     * Returns the meta object for the reference '{@link behavior.causality.ExitPointCondition#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context</em>'.
     * @see behavior.causality.ExitPointCondition#getContext()
     * @see #getExitPointCondition()
     * @generated
     */
    EReference getExitPointCondition_Context();

    /**
     * Returns the meta object for class '{@link behavior.causality.EntryPointCondition <em>Entry Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Point Condition</em>'.
     * @see behavior.causality.EntryPointCondition
     * @generated
     */
    EClass getEntryPointCondition();

    /**
     * Returns the meta object for the reference '{@link behavior.causality.EntryPointCondition#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entry</em>'.
     * @see behavior.causality.EntryPointCondition#getEntry()
     * @see #getEntryPointCondition()
     * @generated
     */
    EReference getEntryPointCondition_Entry();

    /**
     * Returns the meta object for class '{@link behavior.causality.BinaryCausalityCondition <em>Binary Causality Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary Causality Condition</em>'.
     * @see behavior.causality.BinaryCausalityCondition
     * @generated
     */
    EClass getBinaryCausalityCondition();

    /**
     * Returns the meta object for the reference '{@link behavior.causality.BinaryCausalityCondition#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see behavior.causality.BinaryCausalityCondition#getSource()
     * @see #getBinaryCausalityCondition()
     * @generated
     */
    EReference getBinaryCausalityCondition_Source();

    /**
     * Returns the meta object for class '{@link behavior.causality.OrCondition <em>Or Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Or Condition</em>'.
     * @see behavior.causality.OrCondition
     * @generated
     */
    EClass getOrCondition();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.causality.OrCondition#getConditions <em>Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conditions</em>'.
     * @see behavior.causality.OrCondition#getConditions()
     * @see #getOrCondition()
     * @generated
     */
    EReference getOrCondition_Conditions();

    /**
     * Returns the meta object for class '{@link behavior.causality.AndCondition <em>And Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And Condition</em>'.
     * @see behavior.causality.AndCondition
     * @generated
     */
    EClass getAndCondition();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.causality.AndCondition#getConditions <em>Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conditions</em>'.
     * @see behavior.causality.AndCondition#getConditions()
     * @see #getAndCondition()
     * @generated
     */
    EReference getAndCondition_Conditions();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.causality.AndCondition#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see behavior.causality.AndCondition#getConstraints()
     * @see #getAndCondition()
     * @generated
     */
    EReference getAndCondition_Constraints();

    /**
     * Returns the meta object for class '{@link behavior.causality.CausalityParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see behavior.causality.CausalityParameter
     * @generated
     */
    EClass getCausalityParameter();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.causality.CausalityParameter#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see behavior.causality.CausalityParameter#getConstraints()
     * @see #getCausalityParameter()
     * @generated
     */
    EReference getCausalityParameter_Constraints();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.causality.CausalityParameter#getVariableAssignments <em>Variable Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
     * @see behavior.causality.CausalityParameter#getVariableAssignments()
     * @see #getCausalityParameter()
     * @generated
     */
    EReference getCausalityParameter_VariableAssignments();

    /**
     * Returns the meta object for class '{@link behavior.causality.CausalityCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Condition</em>'.
     * @see behavior.causality.CausalityCondition
     * @generated
     */
    EClass getCausalityCondition();

    /**
     * Returns the meta object for the attribute '{@link behavior.causality.CausalityCondition#getUncertainty <em>Uncertainty</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uncertainty</em>'.
     * @see behavior.causality.CausalityCondition#getUncertainty()
     * @see #getCausalityCondition()
     * @generated
     */
    EAttribute getCausalityCondition_Uncertainty();

    /**
     * Returns the meta object for class '{@link behavior.causality.CausalityRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation</em>'.
     * @see behavior.causality.CausalityRelation
     * @generated
     */
    EClass getCausalityRelation();

    /**
     * Returns the meta object for the containment reference '{@link behavior.causality.CausalityRelation#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see behavior.causality.CausalityRelation#getCondition()
     * @see #getCausalityRelation()
     * @generated
     */
    EReference getCausalityRelation_Condition();

    /**
     * Returns the meta object for the reference '{@link behavior.causality.CausalityRelation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see behavior.causality.CausalityRelation#getTarget()
     * @see #getCausalityRelation()
     * @generated
     */
    EReference getCausalityRelation_Target();

    /**
     * Returns the meta object for the container reference '{@link behavior.causality.CausalityRelation#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Context</em>'.
     * @see behavior.causality.CausalityRelation#getContext()
     * @see #getCausalityRelation()
     * @generated
     */
    EReference getCausalityRelation_Context();

    /**
     * Returns the meta object for the attribute '{@link behavior.causality.CausalityRelation#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see behavior.causality.CausalityRelation#getId()
     * @see #getCausalityRelation()
     * @generated
     */
    EAttribute getCausalityRelation_Id();

    /**
     * Returns the meta object for class '{@link behavior.causality.CausalityConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraint</em>'.
     * @see behavior.causality.CausalityConstraint
     * @generated
     */
    EClass getCausalityConstraint();

    /**
     * Returns the meta object for the attribute '{@link behavior.causality.CausalityConstraint#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see behavior.causality.CausalityConstraint#getExpression()
     * @see #getCausalityConstraint()
     * @generated
     */
    EAttribute getCausalityConstraint_Expression();

    /**
     * Returns the meta object for class '{@link behavior.causality.BasicCausalityCondition <em>Basic Causality Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Causality Condition</em>'.
     * @see behavior.causality.BasicCausalityCondition
     * @generated
     */
    EClass getBasicCausalityCondition();

    /**
     * Returns the meta object for class '{@link behavior.causality.StartCondition <em>Start Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Condition</em>'.
     * @see behavior.causality.StartCondition
     * @generated
     */
    EClass getStartCondition();

    /**
     * Returns the meta object for class '{@link behavior.causality.DisablingCondition <em>Disabling Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Disabling Condition</em>'.
     * @see behavior.causality.DisablingCondition
     * @generated
     */
    EClass getDisablingCondition();

    /**
     * Returns the meta object for class '{@link behavior.causality.EnablingCondition <em>Enabling Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enabling Condition</em>'.
     * @see behavior.causality.EnablingCondition
     * @generated
     */
    EClass getEnablingCondition();

    /**
     * Returns the meta object for class '{@link behavior.causality.SynchronizationCondition <em>Synchronization Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Synchronization Condition</em>'.
     * @see behavior.causality.SynchronizationCondition
     * @generated
     */
    EClass getSynchronizationCondition();

    /**
     * Returns the meta object for enum '{@link behavior.causality.Uncertainty <em>Uncertainty</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Uncertainty</em>'.
     * @see behavior.causality.Uncertainty
     * @generated
     */
    EEnum getUncertainty();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CausalityFactory getCausalityFactory();

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
         * The meta object literal for the '{@link behavior.causality.impl.PointConditionImpl <em>Point Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.PointConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getPointCondition()
         * @generated
         */
        EClass POINT_CONDITION = eINSTANCE.getPointCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.ExitPointConditionImpl <em>Exit Point Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.ExitPointConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getExitPointCondition()
         * @generated
         */
        EClass EXIT_POINT_CONDITION = eINSTANCE.getExitPointCondition();

        /**
         * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT_POINT_CONDITION__EXIT = eINSTANCE.getExitPointCondition_Exit();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT_POINT_CONDITION__CONTEXT = eINSTANCE.getExitPointCondition_Context();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.EntryPointConditionImpl <em>Entry Point Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.EntryPointConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getEntryPointCondition()
         * @generated
         */
        EClass ENTRY_POINT_CONDITION = eINSTANCE.getEntryPointCondition();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTRY_POINT_CONDITION__ENTRY = eINSTANCE.getEntryPointCondition_Entry();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.BinaryCausalityConditionImpl <em>Binary Causality Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.BinaryCausalityConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getBinaryCausalityCondition()
         * @generated
         */
        EClass BINARY_CAUSALITY_CONDITION = eINSTANCE.getBinaryCausalityCondition();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BINARY_CAUSALITY_CONDITION__SOURCE = eINSTANCE.getBinaryCausalityCondition_Source();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.OrConditionImpl <em>Or Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.OrConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getOrCondition()
         * @generated
         */
        EClass OR_CONDITION = eINSTANCE.getOrCondition();

        /**
         * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OR_CONDITION__CONDITIONS = eINSTANCE.getOrCondition_Conditions();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.AndConditionImpl <em>And Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.AndConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getAndCondition()
         * @generated
         */
        EClass AND_CONDITION = eINSTANCE.getAndCondition();

        /**
         * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AND_CONDITION__CONDITIONS = eINSTANCE.getAndCondition_Conditions();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AND_CONDITION__CONSTRAINTS = eINSTANCE.getAndCondition_Constraints();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.CausalityParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.CausalityParameterImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getCausalityParameter()
         * @generated
         */
        EClass CAUSALITY_PARAMETER = eINSTANCE.getCausalityParameter();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_PARAMETER__CONSTRAINTS = eINSTANCE.getCausalityParameter_Constraints();

        /**
         * The meta object literal for the '<em><b>Variable Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS = eINSTANCE.getCausalityParameter_VariableAssignments();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.CausalityConditionImpl <em>Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.CausalityConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getCausalityCondition()
         * @generated
         */
        EClass CAUSALITY_CONDITION = eINSTANCE.getCausalityCondition();

        /**
         * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAUSALITY_CONDITION__UNCERTAINTY = eINSTANCE.getCausalityCondition_Uncertainty();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.CausalityRelationImpl <em>Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.CausalityRelationImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getCausalityRelation()
         * @generated
         */
        EClass CAUSALITY_RELATION = eINSTANCE.getCausalityRelation();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_RELATION__CONDITION = eINSTANCE.getCausalityRelation_Condition();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_RELATION__TARGET = eINSTANCE.getCausalityRelation_Target();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_RELATION__CONTEXT = eINSTANCE.getCausalityRelation_Context();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAUSALITY_RELATION__ID = eINSTANCE.getCausalityRelation_Id();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.CausalityConstraintImpl <em>Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.CausalityConstraintImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getCausalityConstraint()
         * @generated
         */
        EClass CAUSALITY_CONSTRAINT = eINSTANCE.getCausalityConstraint();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAUSALITY_CONSTRAINT__EXPRESSION = eINSTANCE.getCausalityConstraint_Expression();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.BasicCausalityConditionImpl <em>Basic Causality Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.BasicCausalityConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getBasicCausalityCondition()
         * @generated
         */
        EClass BASIC_CAUSALITY_CONDITION = eINSTANCE.getBasicCausalityCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.StartConditionImpl <em>Start Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.StartConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getStartCondition()
         * @generated
         */
        EClass START_CONDITION = eINSTANCE.getStartCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.DisablingConditionImpl <em>Disabling Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.DisablingConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getDisablingCondition()
         * @generated
         */
        EClass DISABLING_CONDITION = eINSTANCE.getDisablingCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.EnablingConditionImpl <em>Enabling Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.EnablingConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getEnablingCondition()
         * @generated
         */
        EClass ENABLING_CONDITION = eINSTANCE.getEnablingCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.impl.SynchronizationConditionImpl <em>Synchronization Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.impl.SynchronizationConditionImpl
         * @see behavior.causality.impl.CausalityPackageImpl#getSynchronizationCondition()
         * @generated
         */
        EClass SYNCHRONIZATION_CONDITION = eINSTANCE.getSynchronizationCondition();

        /**
         * The meta object literal for the '{@link behavior.causality.Uncertainty <em>Uncertainty</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.causality.Uncertainty
         * @see behavior.causality.impl.CausalityPackageImpl#getUncertainty()
         * @generated
         */
        EEnum UNCERTAINTY = eINSTANCE.getUncertainty();

    }

} //CausalityPackage
