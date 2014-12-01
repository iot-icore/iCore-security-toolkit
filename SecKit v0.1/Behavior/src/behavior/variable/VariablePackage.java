/**
 */
package behavior.variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see behavior.variable.VariableFactory
 * @model kind="package"
 * @generated
 */
public interface VariablePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "variable";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/variable/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-variable";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablePackage eINSTANCE = behavior.variable.impl.VariablePackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.variable.impl.ActivityVariableImpl <em>Activity Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.ActivityVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getActivityVariable()
     * @generated
     */
    int ACTIVITY_VARIABLE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_VARIABLE__VISUAL_ELEMENTS = models.variable.VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_VARIABLE__ID = models.variable.VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_VARIABLE__NAME = models.variable.VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Activity Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_VARIABLE_FEATURE_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Activity Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_VARIABLE_OPERATION_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.ActivityTypeVariableImpl <em>Activity Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.ActivityTypeVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getActivityTypeVariable()
     * @generated
     */
    int ACTIVITY_TYPE_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_VARIABLE__VISUAL_ELEMENTS = ACTIVITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_VARIABLE__ID = ACTIVITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_VARIABLE__NAME = ACTIVITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Activity Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_VARIABLE_FEATURE_COUNT = ACTIVITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Activity Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_VARIABLE_OPERATION_COUNT = ACTIVITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.ActivityInstantiationVariableImpl <em>Activity Instantiation Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.ActivityInstantiationVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getActivityInstantiationVariable()
     * @generated
     */
    int ACTIVITY_INSTANTIATION_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_VARIABLE__VISUAL_ELEMENTS = ACTIVITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_VARIABLE__ID = ACTIVITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_VARIABLE__NAME = ACTIVITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Activity Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_VARIABLE_FEATURE_COUNT = ACTIVITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Activity Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_VARIABLE_OPERATION_COUNT = ACTIVITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.ActivityInstanceVariableImpl <em>Activity Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.ActivityInstanceVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getActivityInstanceVariable()
     * @generated
     */
    int ACTIVITY_INSTANCE_VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANCE_VARIABLE__VISUAL_ELEMENTS = ACTIVITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANCE_VARIABLE__ID = ACTIVITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANCE_VARIABLE__NAME = ACTIVITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Activity Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANCE_VARIABLE_FEATURE_COUNT = ACTIVITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Activity Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANCE_VARIABLE_OPERATION_COUNT = ACTIVITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.FlowPointVariableImpl <em>Flow Point Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.FlowPointVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getFlowPointVariable()
     * @generated
     */
    int FLOW_POINT_VARIABLE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_VARIABLE__VISUAL_ELEMENTS = models.variable.VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_VARIABLE__ID = models.variable.VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_VARIABLE__NAME = models.variable.VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Flow Point Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_VARIABLE_FEATURE_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_VARIABLE_OPERATION_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.BehaviorVariableImpl <em>Behavior Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.BehaviorVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getBehaviorVariable()
     * @generated
     */
    int BEHAVIOR_VARIABLE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_VARIABLE__VISUAL_ELEMENTS = models.variable.VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_VARIABLE__ID = models.variable.VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_VARIABLE__NAME = models.variable.VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Behavior Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_VARIABLE_FEATURE_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_VARIABLE_OPERATION_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.BehaviorTypeVariableImpl <em>Behavior Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.BehaviorTypeVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getBehaviorTypeVariable()
     * @generated
     */
    int BEHAVIOR_TYPE_VARIABLE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_VARIABLE__VISUAL_ELEMENTS = BEHAVIOR_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_VARIABLE__ID = BEHAVIOR_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_VARIABLE__NAME = BEHAVIOR_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Behavior Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_VARIABLE_FEATURE_COUNT = BEHAVIOR_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_VARIABLE_OPERATION_COUNT = BEHAVIOR_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.BehaviorInstantiationVariableImpl <em>Behavior Instantiation Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.BehaviorInstantiationVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getBehaviorInstantiationVariable()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE__VISUAL_ELEMENTS = BEHAVIOR_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE__ID = BEHAVIOR_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE__NAME = BEHAVIOR_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Behavior Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_FEATURE_COUNT = BEHAVIOR_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_OPERATION_COUNT = BEHAVIOR_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.BehaviorInstanceVariableImpl <em>Behavior Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.BehaviorInstanceVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getBehaviorInstanceVariable()
     * @generated
     */
    int BEHAVIOR_INSTANCE_VARIABLE = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANCE_VARIABLE__VISUAL_ELEMENTS = BEHAVIOR_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANCE_VARIABLE__ID = BEHAVIOR_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANCE_VARIABLE__NAME = BEHAVIOR_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Behavior Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANCE_VARIABLE_FEATURE_COUNT = BEHAVIOR_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANCE_VARIABLE_OPERATION_COUNT = BEHAVIOR_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.FlowPointTypeVariableImpl <em>Flow Point Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.FlowPointTypeVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getFlowPointTypeVariable()
     * @generated
     */
    int FLOW_POINT_TYPE_VARIABLE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_VARIABLE__VISUAL_ELEMENTS = FLOW_POINT_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_VARIABLE__ID = FLOW_POINT_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_VARIABLE__NAME = FLOW_POINT_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Flow Point Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_VARIABLE_FEATURE_COUNT = FLOW_POINT_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_VARIABLE_OPERATION_COUNT = FLOW_POINT_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.FlowPointInstanceVariableImpl <em>Flow Point Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.FlowPointInstanceVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getFlowPointInstanceVariable()
     * @generated
     */
    int FLOW_POINT_INSTANCE_VARIABLE = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANCE_VARIABLE__VISUAL_ELEMENTS = FLOW_POINT_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANCE_VARIABLE__ID = FLOW_POINT_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANCE_VARIABLE__NAME = FLOW_POINT_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Flow Point Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANCE_VARIABLE_FEATURE_COUNT = FLOW_POINT_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANCE_VARIABLE_OPERATION_COUNT = FLOW_POINT_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.variable.impl.FlowPointInstantiationVariableImpl <em>Flow Point Instantiation Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.variable.impl.FlowPointInstantiationVariableImpl
     * @see behavior.variable.impl.VariablePackageImpl#getFlowPointInstantiationVariable()
     * @generated
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE__VISUAL_ELEMENTS = FLOW_POINT_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE__ID = FLOW_POINT_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE__NAME = FLOW_POINT_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Flow Point Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE_FEATURE_COUNT = FLOW_POINT_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_VARIABLE_OPERATION_COUNT = FLOW_POINT_VARIABLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.variable.ActivityVariable <em>Activity Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Variable</em>'.
     * @see behavior.variable.ActivityVariable
     * @generated
     */
    EClass getActivityVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.ActivityTypeVariable <em>Activity Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Type Variable</em>'.
     * @see behavior.variable.ActivityTypeVariable
     * @generated
     */
    EClass getActivityTypeVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.ActivityInstantiationVariable <em>Activity Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Instantiation Variable</em>'.
     * @see behavior.variable.ActivityInstantiationVariable
     * @generated
     */
    EClass getActivityInstantiationVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.ActivityInstanceVariable <em>Activity Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Instance Variable</em>'.
     * @see behavior.variable.ActivityInstanceVariable
     * @generated
     */
    EClass getActivityInstanceVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.FlowPointVariable <em>Flow Point Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Variable</em>'.
     * @see behavior.variable.FlowPointVariable
     * @generated
     */
    EClass getFlowPointVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.BehaviorVariable <em>Behavior Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Variable</em>'.
     * @see behavior.variable.BehaviorVariable
     * @generated
     */
    EClass getBehaviorVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.BehaviorTypeVariable <em>Behavior Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Type Variable</em>'.
     * @see behavior.variable.BehaviorTypeVariable
     * @generated
     */
    EClass getBehaviorTypeVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.BehaviorInstantiationVariable <em>Behavior Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation Variable</em>'.
     * @see behavior.variable.BehaviorInstantiationVariable
     * @generated
     */
    EClass getBehaviorInstantiationVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.BehaviorInstanceVariable <em>Behavior Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instance Variable</em>'.
     * @see behavior.variable.BehaviorInstanceVariable
     * @generated
     */
    EClass getBehaviorInstanceVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.FlowPointTypeVariable <em>Flow Point Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Type Variable</em>'.
     * @see behavior.variable.FlowPointTypeVariable
     * @generated
     */
    EClass getFlowPointTypeVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.FlowPointInstanceVariable <em>Flow Point Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Instance Variable</em>'.
     * @see behavior.variable.FlowPointInstanceVariable
     * @generated
     */
    EClass getFlowPointInstanceVariable();

    /**
     * Returns the meta object for class '{@link behavior.variable.FlowPointInstantiationVariable <em>Flow Point Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Instantiation Variable</em>'.
     * @see behavior.variable.FlowPointInstantiationVariable
     * @generated
     */
    EClass getFlowPointInstantiationVariable();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VariableFactory getVariableFactory();

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
         * The meta object literal for the '{@link behavior.variable.impl.ActivityVariableImpl <em>Activity Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.ActivityVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getActivityVariable()
         * @generated
         */
        EClass ACTIVITY_VARIABLE = eINSTANCE.getActivityVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.ActivityTypeVariableImpl <em>Activity Type Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.ActivityTypeVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getActivityTypeVariable()
         * @generated
         */
        EClass ACTIVITY_TYPE_VARIABLE = eINSTANCE.getActivityTypeVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.ActivityInstantiationVariableImpl <em>Activity Instantiation Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.ActivityInstantiationVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getActivityInstantiationVariable()
         * @generated
         */
        EClass ACTIVITY_INSTANTIATION_VARIABLE = eINSTANCE.getActivityInstantiationVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.ActivityInstanceVariableImpl <em>Activity Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.ActivityInstanceVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getActivityInstanceVariable()
         * @generated
         */
        EClass ACTIVITY_INSTANCE_VARIABLE = eINSTANCE.getActivityInstanceVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.FlowPointVariableImpl <em>Flow Point Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.FlowPointVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getFlowPointVariable()
         * @generated
         */
        EClass FLOW_POINT_VARIABLE = eINSTANCE.getFlowPointVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.BehaviorVariableImpl <em>Behavior Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.BehaviorVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getBehaviorVariable()
         * @generated
         */
        EClass BEHAVIOR_VARIABLE = eINSTANCE.getBehaviorVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.BehaviorTypeVariableImpl <em>Behavior Type Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.BehaviorTypeVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getBehaviorTypeVariable()
         * @generated
         */
        EClass BEHAVIOR_TYPE_VARIABLE = eINSTANCE.getBehaviorTypeVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.BehaviorInstantiationVariableImpl <em>Behavior Instantiation Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.BehaviorInstantiationVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getBehaviorInstantiationVariable()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION_VARIABLE = eINSTANCE.getBehaviorInstantiationVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.BehaviorInstanceVariableImpl <em>Behavior Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.BehaviorInstanceVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getBehaviorInstanceVariable()
         * @generated
         */
        EClass BEHAVIOR_INSTANCE_VARIABLE = eINSTANCE.getBehaviorInstanceVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.FlowPointTypeVariableImpl <em>Flow Point Type Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.FlowPointTypeVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getFlowPointTypeVariable()
         * @generated
         */
        EClass FLOW_POINT_TYPE_VARIABLE = eINSTANCE.getFlowPointTypeVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.FlowPointInstanceVariableImpl <em>Flow Point Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.FlowPointInstanceVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getFlowPointInstanceVariable()
         * @generated
         */
        EClass FLOW_POINT_INSTANCE_VARIABLE = eINSTANCE.getFlowPointInstanceVariable();

        /**
         * The meta object literal for the '{@link behavior.variable.impl.FlowPointInstantiationVariableImpl <em>Flow Point Instantiation Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.variable.impl.FlowPointInstantiationVariableImpl
         * @see behavior.variable.impl.VariablePackageImpl#getFlowPointInstantiationVariable()
         * @generated
         */
        EClass FLOW_POINT_INSTANTIATION_VARIABLE = eINSTANCE.getFlowPointInstantiationVariable();

    }

} //VariablePackage
