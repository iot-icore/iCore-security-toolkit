/**
 */
package behavior.instantiation;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see behavior.instantiation.InstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instantiation";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/instantiation/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-instantiation";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationPackage eINSTANCE = behavior.instantiation.impl.InstantiationPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.ActivityInstantiationImpl <em>Activity Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.ActivityInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getActivityInstantiation()
     * @generated
     */
    int ACTIVITY_INSTANTIATION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Activity Point Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Activity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Activity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorInstantiationImpl <em>Behavior Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiation()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__CONTRIBUTIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Container Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__CONTAINER_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__FLOW_POINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Behavior Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Behavior Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.RecursiveBehaviorInstantiationImpl <em>Recursive Behavior Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.RecursiveBehaviorInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getRecursiveBehaviorInstantiation()
     * @generated
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__VISUAL_ELEMENTS = BEHAVIOR_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__ID = BEHAVIOR_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__TYPE = BEHAVIOR_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__CONTRIBUTIONS = BEHAVIOR_INSTANTIATION__CONTRIBUTIONS;

    /**
     * The feature id for the '<em><b>Container Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__CONTAINER_TYPE = BEHAVIOR_INSTANTIATION__CONTAINER_TYPE;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__INSTANCES = BEHAVIOR_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__FLOW_POINTS = BEHAVIOR_INSTANTIATION__FLOW_POINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS = BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__NAME = BEHAVIOR_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION = BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Recursive Behavior Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION_FEATURE_COUNT = BEHAVIOR_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Recursive Behavior Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURSIVE_BEHAVIOR_INSTANTIATION_OPERATION_COUNT = BEHAVIOR_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorInstantiationHierarchyImpl <em>Behavior Instantiation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorInstantiationHierarchyImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationHierarchy()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY__ID = ModelsPackage.INSTANTIATION_HIERARCHY__ID;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behavior Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY_FEATURE_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Behavior Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_HIERARCHY_OPERATION_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorInstantiationReferenceImpl <em>Behavior Instantiation Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorInstantiationReferenceImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationReference()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_REFERENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE__ID = ModelsPackage.INSTANTIATION_REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE__CHILD = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behavior Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE_FEATURE_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Behavior Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_REFERENCE_OPERATION_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorInstantiationStaticReferenceImpl <em>Behavior Instantiation Static Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorInstantiationStaticReferenceImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationStaticReference()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__VISUAL_ELEMENTS = BEHAVIOR_INSTANTIATION_REFERENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__ID = BEHAVIOR_INSTANTIATION_REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__CHILD = BEHAVIOR_INSTANTIATION_REFERENCE__CHILD;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__INSTANTIATION = BEHAVIOR_INSTANTIATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behavior Instantiation Static Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE_FEATURE_COUNT = BEHAVIOR_INSTANTIATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Behavior Instantiation Static Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_STATIC_REFERENCE_OPERATION_COUNT = BEHAVIOR_INSTANTIATION_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.FlowPointInstantiationImpl <em>Flow Point Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.FlowPointInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointInstantiation()
     * @generated
     */
    int FLOW_POINT_INSTANTIATION = 17;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION__CONSTRAINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION__VARIABLE_ASSIGNMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Flow Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.FlowPointOfTypeImpl <em>Flow Point Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.FlowPointOfTypeImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointOfType()
     * @generated
     */
    int FLOW_POINT_OF_TYPE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__VISUAL_ELEMENTS = FLOW_POINT_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__ID = FLOW_POINT_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__CONSTRAINTS = FLOW_POINT_INSTANTIATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__VARIABLE_ASSIGNMENTS = FLOW_POINT_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__TYPE = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__NAME = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Flow Points Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Flow Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE_FEATURE_COUNT = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Flow Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_TYPE_OPERATION_COUNT = FLOW_POINT_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.FlowPointOfInstantiationImpl <em>Flow Point Of Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.FlowPointOfInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointOfInstantiation()
     * @generated
     */
    int FLOW_POINT_OF_INSTANTIATION = 16;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__VISUAL_ELEMENTS = FLOW_POINT_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__ID = FLOW_POINT_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__CONSTRAINTS = FLOW_POINT_INSTANTIATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__VARIABLE_ASSIGNMENTS = FLOW_POINT_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Flow Point Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Behavior Instantiation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION_FEATURE_COUNT = FLOW_POINT_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Flow Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OF_INSTANTIATION_OPERATION_COUNT = FLOW_POINT_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.EntryPointOfInstantiationImpl <em>Entry Point Of Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.EntryPointOfInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getEntryPointOfInstantiation()
     * @generated
     */
    int ENTRY_POINT_OF_INSTANTIATION = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__VISUAL_ELEMENTS = FLOW_POINT_OF_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__ID = FLOW_POINT_OF_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__CONSTRAINTS = FLOW_POINT_OF_INSTANTIATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__VARIABLE_ASSIGNMENTS = FLOW_POINT_OF_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Flow Point Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE = FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE;

    /**
     * The feature id for the '<em><b>Behavior Instantiation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Entry Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION_FEATURE_COUNT = FLOW_POINT_OF_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entry Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_INSTANTIATION_OPERATION_COUNT = FLOW_POINT_OF_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.ExitPointOfInstantiationImpl <em>Exit Point Of Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.ExitPointOfInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getExitPointOfInstantiation()
     * @generated
     */
    int EXIT_POINT_OF_INSTANTIATION = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__VISUAL_ELEMENTS = FLOW_POINT_OF_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__ID = FLOW_POINT_OF_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__CONSTRAINTS = FLOW_POINT_OF_INSTANTIATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__VARIABLE_ASSIGNMENTS = FLOW_POINT_OF_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Flow Point Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE = FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE;

    /**
     * The feature id for the '<em><b>Behavior Instantiation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Exit Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION_FEATURE_COUNT = FLOW_POINT_OF_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Exit Point Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_INSTANTIATION_OPERATION_COUNT = FLOW_POINT_OF_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.InteractionContributionInstantiationImpl <em>Interaction Contribution Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.InteractionContributionInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionInstantiation()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interaction Contribution Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interaction Contribution Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl <em>Interaction Contribution Of Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.InteractionContributionOfInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionOfInstantiation()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__VISUAL_ELEMENTS = INTERACTION_CONTRIBUTION_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__ID = INTERACTION_CONTRIBUTION_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__TYPE = INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Behavior Instantiation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delegated From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Interaction</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Contribution Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Interaction Contribution Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION_FEATURE_COUNT = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Interaction Contribution Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_INSTANTIATION_OPERATION_COUNT = INTERACTION_CONTRIBUTION_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl <em>Abstract Interaction Contribution Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getAbstractInteractionContributionOfType()
     * @generated
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE = 15;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__VISUAL_ELEMENTS = INTERACTION_CONTRIBUTION_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ID = INTERACTION_CONTRIBUTION_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__TYPE = INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contribution Of Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Abstract Interaction Contribution Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT = INTERACTION_CONTRIBUTION_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Abstract Interaction Contribution Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_OPERATION_COUNT = INTERACTION_CONTRIBUTION_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.DelegatedInteractionContributionImpl <em>Delegated Interaction Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.DelegatedInteractionContributionImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getDelegatedInteractionContribution()
     * @generated
     */
    int DELEGATED_INTERACTION_CONTRIBUTION = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__VISUAL_ELEMENTS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__ID = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__TYPE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__BEHAVIOR_TYPE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Of Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__CONTRIBUTION_OF_INSTANTIATIONS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__ROLE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delegated To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Delegated Interaction Contribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION_FEATURE_COUNT = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Delegated Interaction Contribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_CONTRIBUTION_OPERATION_COUNT = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.ActionInstantiationImpl <em>Action Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.ActionInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getActionInstantiation()
     * @generated
     */
    int ACTION_INSTANTIATION = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__VISUAL_ELEMENTS = ACTIVITY_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__ID = ACTIVITY_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__NAME = ACTIVITY_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__TYPE = ACTIVITY_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Activity Point Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION = ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__CONSTRAINTS = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__INSTANCES = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION__BEHAVIOR_TYPE = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Action Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_FEATURE_COUNT = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Action Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_OPERATION_COUNT = ACTIVITY_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.InteractionContributionOfTypeImpl <em>Interaction Contribution Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.InteractionContributionOfTypeImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionOfType()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__VISUAL_ELEMENTS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__ID = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__TYPE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE;

    /**
     * The feature id for the '<em><b>Contribution Of Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__ROLE = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interaction Contribution Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interaction Contribution Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OF_TYPE_OPERATION_COUNT = ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorInstantiationVariableReferenceImpl <em>Behavior Instantiation Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorInstantiationVariableReferenceImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationVariableReference()
     * @generated
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE__VISUAL_ELEMENTS = BEHAVIOR_INSTANTIATION_REFERENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE__ID = BEHAVIOR_INSTANTIATION_REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE__CHILD = BEHAVIOR_INSTANTIATION_REFERENCE__CHILD;

    /**
     * The number of structural features of the '<em>Behavior Instantiation Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE_FEATURE_COUNT = BEHAVIOR_INSTANTIATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Instantiation Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE_OPERATION_COUNT = BEHAVIOR_INSTANTIATION_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.EntryPointOfTypeImpl <em>Entry Point Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.EntryPointOfTypeImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getEntryPointOfType()
     * @generated
     */
    int ENTRY_POINT_OF_TYPE = 18;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__VISUAL_ELEMENTS = FLOW_POINT_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__ID = FLOW_POINT_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__CONSTRAINTS = FLOW_POINT_OF_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__VARIABLE_ASSIGNMENTS = FLOW_POINT_OF_TYPE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__TYPE = FLOW_POINT_OF_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__NAME = FLOW_POINT_OF_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION = FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE__BEHAVIOR_TYPE = FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE;

    /**
     * The number of structural features of the '<em>Entry Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE_FEATURE_COUNT = FLOW_POINT_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entry Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_OF_TYPE_OPERATION_COUNT = FLOW_POINT_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.ExitPointOfTypeImpl <em>Exit Point Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.ExitPointOfTypeImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getExitPointOfType()
     * @generated
     */
    int EXIT_POINT_OF_TYPE = 19;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__VISUAL_ELEMENTS = FLOW_POINT_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__ID = FLOW_POINT_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__CONSTRAINTS = FLOW_POINT_OF_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__VARIABLE_ASSIGNMENTS = FLOW_POINT_OF_TYPE__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__TYPE = FLOW_POINT_OF_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__NAME = FLOW_POINT_OF_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION = FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE__BEHAVIOR_TYPE = FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE;

    /**
     * The number of structural features of the '<em>Exit Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE_FEATURE_COUNT = FLOW_POINT_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Exit Point Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_OF_TYPE_OPERATION_COUNT = FLOW_POINT_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.ActionInstantiationHierarchyImpl <em>Action Instantiation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.ActionInstantiationHierarchyImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getActionInstantiationHierarchy()
     * @generated
     */
    int ACTION_INSTANTIATION_HIERARCHY = 20;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY__ID = ModelsPackage.INSTANTIATION_HIERARCHY__ID;

    /**
     * The feature id for the '<em><b>Behavior Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Activity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY__ACTIVITY = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Action Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY_FEATURE_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Action Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSTANTIATION_HIERARCHY_OPERATION_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.InteractionInstantiationImpl <em>Interaction Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.InteractionInstantiationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionInstantiation()
     * @generated
     */
    int INTERACTION_INSTANTIATION = 21;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__VISUAL_ELEMENTS = ACTIVITY_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__ID = ACTIVITY_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__NAME = ACTIVITY_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__TYPE = ACTIVITY_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Activity Point Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION = ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__CONTRIBUTIONS = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Behavior Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION__BEHAVIOR_TYPE = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interaction Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION_FEATURE_COUNT = ACTIVITY_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interaction Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_INSTANTIATION_OPERATION_COUNT = ACTIVITY_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instantiation.impl.BehaviorDeclarationImpl <em>Behavior Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instantiation.impl.BehaviorDeclarationImpl
     * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorDeclaration()
     * @generated
     */
    int BEHAVIOR_DECLARATION = 22;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__VISUAL_ELEMENTS = BEHAVIOR_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__ID = BEHAVIOR_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__TYPE = BEHAVIOR_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__CONTRIBUTIONS = BEHAVIOR_INSTANTIATION__CONTRIBUTIONS;

    /**
     * The feature id for the '<em><b>Container Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__CONTAINER_TYPE = BEHAVIOR_INSTANTIATION__CONTAINER_TYPE;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__INSTANCES = BEHAVIOR_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__FLOW_POINTS = BEHAVIOR_INSTANTIATION__FLOW_POINTS;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__VARIABLE_ASSIGNMENTS = BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__NAME = BEHAVIOR_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION__ENTITY_INSTANTIATION = BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Behavior Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION_FEATURE_COUNT = BEHAVIOR_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DECLARATION_OPERATION_COUNT = BEHAVIOR_INSTANTIATION_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.instantiation.ActivityInstantiation <em>Activity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Instantiation</em>'.
     * @see behavior.instantiation.ActivityInstantiation
     * @generated
     */
    EClass getActivityInstantiation();

    /**
     * Returns the meta object for the attribute '{@link behavior.instantiation.ActivityInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.instantiation.ActivityInstantiation#getName()
     * @see #getActivityInstantiation()
     * @generated
     */
    EAttribute getActivityInstantiation_Name();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.ActivityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instantiation.ActivityInstantiation#getType()
     * @see #getActivityInstantiation()
     * @generated
     */
    EReference getActivityInstantiation_Type();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.ActivityInstantiation#getActivityPointInstantiation <em>Activity Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Activity Point Instantiation</em>'.
     * @see behavior.instantiation.ActivityInstantiation#getActivityPointInstantiation()
     * @see #getActivityInstantiation()
     * @generated
     */
    EReference getActivityInstantiation_ActivityPointInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation</em>'.
     * @see behavior.instantiation.BehaviorInstantiation
     * @generated
     */
    EClass getBehaviorInstantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.BehaviorInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getType()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_Type();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instantiation.BehaviorInstantiation#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contributions</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getContributions()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_Contributions();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.BehaviorInstantiation#getContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container Type</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getContainerType()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_ContainerType();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.BehaviorInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getInstances()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_Instances();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instantiation.BehaviorInstantiation#getFlowPoints <em>Flow Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Points</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getFlowPoints()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_FlowPoints();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instantiation.BehaviorInstantiation#getVariableAssignments <em>Variable Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getVariableAssignments()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_VariableAssignments();

    /**
     * Returns the meta object for the attribute '{@link behavior.instantiation.BehaviorInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getName()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EAttribute getBehaviorInstantiation_Name();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.BehaviorInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Instantiation</em>'.
     * @see behavior.instantiation.BehaviorInstantiation#getEntityInstantiation()
     * @see #getBehaviorInstantiation()
     * @generated
     */
    EReference getBehaviorInstantiation_EntityInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.RecursiveBehaviorInstantiation <em>Recursive Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Recursive Behavior Instantiation</em>'.
     * @see behavior.instantiation.RecursiveBehaviorInstantiation
     * @generated
     */
    EClass getRecursiveBehaviorInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorInstantiationHierarchy <em>Behavior Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation Hierarchy</em>'.
     * @see behavior.instantiation.BehaviorInstantiationHierarchy
     * @generated
     */
    EClass getBehaviorInstantiationHierarchy();

    /**
     * Returns the meta object for the containment reference '{@link behavior.instantiation.BehaviorInstantiationHierarchy#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root</em>'.
     * @see behavior.instantiation.BehaviorInstantiationHierarchy#getRoot()
     * @see #getBehaviorInstantiationHierarchy()
     * @generated
     */
    EReference getBehaviorInstantiationHierarchy_Root();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorInstantiationStaticReference <em>Behavior Instantiation Static Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation Static Reference</em>'.
     * @see behavior.instantiation.BehaviorInstantiationStaticReference
     * @generated
     */
    EClass getBehaviorInstantiationStaticReference();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.BehaviorInstantiationStaticReference#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see behavior.instantiation.BehaviorInstantiationStaticReference#getInstantiation()
     * @see #getBehaviorInstantiationStaticReference()
     * @generated
     */
    EReference getBehaviorInstantiationStaticReference_Instantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.FlowPointOfType <em>Flow Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Of Type</em>'.
     * @see behavior.instantiation.FlowPointOfType
     * @generated
     */
    EClass getFlowPointOfType();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.FlowPointOfType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instantiation.FlowPointOfType#getType()
     * @see #getFlowPointOfType()
     * @generated
     */
    EReference getFlowPointOfType_Type();

    /**
     * Returns the meta object for the attribute '{@link behavior.instantiation.FlowPointOfType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.instantiation.FlowPointOfType#getName()
     * @see #getFlowPointOfType()
     * @generated
     */
    EAttribute getFlowPointOfType_Name();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.FlowPointOfType#getFlowPointsOfInstantiation <em>Flow Points Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Flow Points Of Instantiation</em>'.
     * @see behavior.instantiation.FlowPointOfType#getFlowPointsOfInstantiation()
     * @see #getFlowPointOfType()
     * @generated
     */
    EReference getFlowPointOfType_FlowPointsOfInstantiation();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.FlowPointOfType#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior Type</em>'.
     * @see behavior.instantiation.FlowPointOfType#getBehaviorType()
     * @see #getFlowPointOfType()
     * @generated
     */
    EReference getFlowPointOfType_BehaviorType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.EntryPointOfInstantiation <em>Entry Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Point Of Instantiation</em>'.
     * @see behavior.instantiation.EntryPointOfInstantiation
     * @generated
     */
    EClass getEntryPointOfInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.ExitPointOfInstantiation <em>Exit Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit Point Of Instantiation</em>'.
     * @see behavior.instantiation.ExitPointOfInstantiation
     * @generated
     */
    EClass getExitPointOfInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.InteractionContributionOfInstantiation <em>Interaction Contribution Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Of Instantiation</em>'.
     * @see behavior.instantiation.InteractionContributionOfInstantiation
     * @generated
     */
    EClass getInteractionContributionOfInstantiation();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior Instantiation</em>'.
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation()
     * @see #getInteractionContributionOfInstantiation()
     * @generated
     */
    EReference getInteractionContributionOfInstantiation_BehaviorInstantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom <em>Delegated From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Delegated From</em>'.
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom()
     * @see #getInteractionContributionOfInstantiation()
     * @generated
     */
    EReference getInteractionContributionOfInstantiation_DelegatedFrom();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.InteractionContributionOfInstantiation#getInteraction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interaction</em>'.
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getInteraction()
     * @see #getInteractionContributionOfInstantiation()
     * @generated
     */
    EReference getInteractionContributionOfInstantiation_Interaction();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType <em>Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contribution Of Type</em>'.
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType()
     * @see #getInteractionContributionOfInstantiation()
     * @generated
     */
    EReference getInteractionContributionOfInstantiation_ContributionOfType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.DelegatedInteractionContribution <em>Delegated Interaction Contribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delegated Interaction Contribution</em>'.
     * @see behavior.instantiation.DelegatedInteractionContribution
     * @generated
     */
    EClass getDelegatedInteractionContribution();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.DelegatedInteractionContribution#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context</em>'.
     * @see behavior.instantiation.DelegatedInteractionContribution#getContext()
     * @see #getDelegatedInteractionContribution()
     * @generated
     */
    EReference getDelegatedInteractionContribution_Context();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.DelegatedInteractionContribution#getDelegatedTo <em>Delegated To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegated To</em>'.
     * @see behavior.instantiation.DelegatedInteractionContribution#getDelegatedTo()
     * @see #getDelegatedInteractionContribution()
     * @generated
     */
    EReference getDelegatedInteractionContribution_DelegatedTo();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.InteractionContributionInstantiation <em>Interaction Contribution Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Instantiation</em>'.
     * @see behavior.instantiation.InteractionContributionInstantiation
     * @generated
     */
    EClass getInteractionContributionInstantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.InteractionContributionInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instantiation.InteractionContributionInstantiation#getType()
     * @see #getInteractionContributionInstantiation()
     * @generated
     */
    EReference getInteractionContributionInstantiation_Type();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.ActionInstantiation <em>Action Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Instantiation</em>'.
     * @see behavior.instantiation.ActionInstantiation
     * @generated
     */
    EClass getActionInstantiation();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.ActionInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see behavior.instantiation.ActionInstantiation#getInstances()
     * @see #getActionInstantiation()
     * @generated
     */
    EReference getActionInstantiation_Instances();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.ActionInstantiation#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Behavior Type</em>'.
     * @see behavior.instantiation.ActionInstantiation#getBehaviorType()
     * @see #getActionInstantiation()
     * @generated
     */
    EReference getActionInstantiation_BehaviorType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.InteractionContributionOfType <em>Interaction Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Of Type</em>'.
     * @see behavior.instantiation.InteractionContributionOfType
     * @generated
     */
    EClass getInteractionContributionOfType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorInstantiationVariableReference <em>Behavior Instantiation Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation Variable Reference</em>'.
     * @see behavior.instantiation.BehaviorInstantiationVariableReference
     * @generated
     */
    EClass getBehaviorInstantiationVariableReference();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorInstantiationReference <em>Behavior Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Instantiation Reference</em>'.
     * @see behavior.instantiation.BehaviorInstantiationReference
     * @generated
     */
    EClass getBehaviorInstantiationReference();

    /**
     * Returns the meta object for the containment reference '{@link behavior.instantiation.BehaviorInstantiationReference#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see behavior.instantiation.BehaviorInstantiationReference#getChild()
     * @see #getBehaviorInstantiationReference()
     * @generated
     */
    EReference getBehaviorInstantiationReference_Child();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.AbstractInteractionContributionOfType <em>Abstract Interaction Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Interaction Contribution Of Type</em>'.
     * @see behavior.instantiation.AbstractInteractionContributionOfType
     * @generated
     */
    EClass getAbstractInteractionContributionOfType();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior Type</em>'.
     * @see behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType()
     * @see #getAbstractInteractionContributionOfType()
     * @generated
     */
    EReference getAbstractInteractionContributionOfType_BehaviorType();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.AbstractInteractionContributionOfType#getContributionOfInstantiations <em>Contribution Of Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Contribution Of Instantiations</em>'.
     * @see behavior.instantiation.AbstractInteractionContributionOfType#getContributionOfInstantiations()
     * @see #getAbstractInteractionContributionOfType()
     * @generated
     */
    EReference getAbstractInteractionContributionOfType_ContributionOfInstantiations();

    /**
     * Returns the meta object for the attribute '{@link behavior.instantiation.AbstractInteractionContributionOfType#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role</em>'.
     * @see behavior.instantiation.AbstractInteractionContributionOfType#getRole()
     * @see #getAbstractInteractionContributionOfType()
     * @generated
     */
    EAttribute getAbstractInteractionContributionOfType_Role();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.FlowPointOfInstantiation <em>Flow Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Of Instantiation</em>'.
     * @see behavior.instantiation.FlowPointOfInstantiation
     * @generated
     */
    EClass getFlowPointOfInstantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType <em>Flow Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Flow Point Of Type</em>'.
     * @see behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType()
     * @see #getFlowPointOfInstantiation()
     * @generated
     */
    EReference getFlowPointOfInstantiation_FlowPointOfType();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior Instantiation</em>'.
     * @see behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation()
     * @see #getFlowPointOfInstantiation()
     * @generated
     */
    EReference getFlowPointOfInstantiation_BehaviorInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.FlowPointInstantiation <em>Flow Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Instantiation</em>'.
     * @see behavior.instantiation.FlowPointInstantiation
     * @generated
     */
    EClass getFlowPointInstantiation();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.EntryPointOfType <em>Entry Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Point Of Type</em>'.
     * @see behavior.instantiation.EntryPointOfType
     * @generated
     */
    EClass getEntryPointOfType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.ExitPointOfType <em>Exit Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit Point Of Type</em>'.
     * @see behavior.instantiation.ExitPointOfType
     * @generated
     */
    EClass getExitPointOfType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.ActionInstantiationHierarchy <em>Action Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Instantiation Hierarchy</em>'.
     * @see behavior.instantiation.ActionInstantiationHierarchy
     * @generated
     */
    EClass getActionInstantiationHierarchy();

    /**
     * Returns the meta object for the containment reference '{@link behavior.instantiation.ActionInstantiationHierarchy#getBehaviorTarget <em>Behavior Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Behavior Target</em>'.
     * @see behavior.instantiation.ActionInstantiationHierarchy#getBehaviorTarget()
     * @see #getActionInstantiationHierarchy()
     * @generated
     */
    EReference getActionInstantiationHierarchy_BehaviorTarget();

    /**
     * Returns the meta object for the reference '{@link behavior.instantiation.ActionInstantiationHierarchy#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Activity</em>'.
     * @see behavior.instantiation.ActionInstantiationHierarchy#getActivity()
     * @see #getActionInstantiationHierarchy()
     * @generated
     */
    EReference getActionInstantiationHierarchy_Activity();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.InteractionInstantiation <em>Interaction Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Instantiation</em>'.
     * @see behavior.instantiation.InteractionInstantiation
     * @generated
     */
    EClass getInteractionInstantiation();

    /**
     * Returns the meta object for the reference list '{@link behavior.instantiation.InteractionInstantiation#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Contributions</em>'.
     * @see behavior.instantiation.InteractionInstantiation#getContributions()
     * @see #getInteractionInstantiation()
     * @generated
     */
    EReference getInteractionInstantiation_Contributions();

    /**
     * Returns the meta object for the container reference '{@link behavior.instantiation.InteractionInstantiation#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior Type</em>'.
     * @see behavior.instantiation.InteractionInstantiation#getBehaviorType()
     * @see #getInteractionInstantiation()
     * @generated
     */
    EReference getInteractionInstantiation_BehaviorType();

    /**
     * Returns the meta object for class '{@link behavior.instantiation.BehaviorDeclaration <em>Behavior Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Declaration</em>'.
     * @see behavior.instantiation.BehaviorDeclaration
     * @generated
     */
    EClass getBehaviorDeclaration();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstantiationFactory getInstantiationFactory();

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
         * The meta object literal for the '{@link behavior.instantiation.impl.ActivityInstantiationImpl <em>Activity Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.ActivityInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getActivityInstantiation()
         * @generated
         */
        EClass ACTIVITY_INSTANTIATION = eINSTANCE.getActivityInstantiation();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_INSTANTIATION__NAME = eINSTANCE.getActivityInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_INSTANTIATION__TYPE = eINSTANCE.getActivityInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Activity Point Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION = eINSTANCE.getActivityInstantiation_ActivityPointInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorInstantiationImpl <em>Behavior Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiation()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION = eINSTANCE.getBehaviorInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__TYPE = eINSTANCE.getBehaviorInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__CONTRIBUTIONS = eINSTANCE.getBehaviorInstantiation_Contributions();

        /**
         * The meta object literal for the '<em><b>Container Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__CONTAINER_TYPE = eINSTANCE.getBehaviorInstantiation_ContainerType();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__INSTANCES = eINSTANCE.getBehaviorInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Flow Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__FLOW_POINTS = eINSTANCE.getBehaviorInstantiation_FlowPoints();

        /**
         * The meta object literal for the '<em><b>Variable Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS = eINSTANCE.getBehaviorInstantiation_VariableAssignments();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_INSTANTIATION__NAME = eINSTANCE.getBehaviorInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Entity Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION = eINSTANCE.getBehaviorInstantiation_EntityInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.RecursiveBehaviorInstantiationImpl <em>Recursive Behavior Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.RecursiveBehaviorInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getRecursiveBehaviorInstantiation()
         * @generated
         */
        EClass RECURSIVE_BEHAVIOR_INSTANTIATION = eINSTANCE.getRecursiveBehaviorInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorInstantiationHierarchyImpl <em>Behavior Instantiation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorInstantiationHierarchyImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationHierarchy()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION_HIERARCHY = eINSTANCE.getBehaviorInstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT = eINSTANCE.getBehaviorInstantiationHierarchy_Root();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorInstantiationStaticReferenceImpl <em>Behavior Instantiation Static Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorInstantiationStaticReferenceImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationStaticReference()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION_STATIC_REFERENCE = eINSTANCE.getBehaviorInstantiationStaticReference();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__INSTANTIATION = eINSTANCE.getBehaviorInstantiationStaticReference_Instantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.FlowPointOfTypeImpl <em>Flow Point Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.FlowPointOfTypeImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointOfType()
         * @generated
         */
        EClass FLOW_POINT_OF_TYPE = eINSTANCE.getFlowPointOfType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_OF_TYPE__TYPE = eINSTANCE.getFlowPointOfType_Type();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOW_POINT_OF_TYPE__NAME = eINSTANCE.getFlowPointOfType_Name();

        /**
         * The meta object literal for the '<em><b>Flow Points Of Instantiation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION = eINSTANCE.getFlowPointOfType_FlowPointsOfInstantiation();

        /**
         * The meta object literal for the '<em><b>Behavior Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE = eINSTANCE.getFlowPointOfType_BehaviorType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.EntryPointOfInstantiationImpl <em>Entry Point Of Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.EntryPointOfInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getEntryPointOfInstantiation()
         * @generated
         */
        EClass ENTRY_POINT_OF_INSTANTIATION = eINSTANCE.getEntryPointOfInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.ExitPointOfInstantiationImpl <em>Exit Point Of Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.ExitPointOfInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getExitPointOfInstantiation()
         * @generated
         */
        EClass EXIT_POINT_OF_INSTANTIATION = eINSTANCE.getExitPointOfInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl <em>Interaction Contribution Of Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.InteractionContributionOfInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionOfInstantiation()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_OF_INSTANTIATION = eINSTANCE.getInteractionContributionOfInstantiation();

        /**
         * The meta object literal for the '<em><b>Behavior Instantiation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = eINSTANCE.getInteractionContributionOfInstantiation_BehaviorInstantiation();

        /**
         * The meta object literal for the '<em><b>Delegated From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM = eINSTANCE.getInteractionContributionOfInstantiation_DelegatedFrom();

        /**
         * The meta object literal for the '<em><b>Interaction</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION = eINSTANCE.getInteractionContributionOfInstantiation_Interaction();

        /**
         * The meta object literal for the '<em><b>Contribution Of Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE = eINSTANCE.getInteractionContributionOfInstantiation_ContributionOfType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.DelegatedInteractionContributionImpl <em>Delegated Interaction Contribution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.DelegatedInteractionContributionImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getDelegatedInteractionContribution()
         * @generated
         */
        EClass DELEGATED_INTERACTION_CONTRIBUTION = eINSTANCE.getDelegatedInteractionContribution();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT = eINSTANCE.getDelegatedInteractionContribution_Context();

        /**
         * The meta object literal for the '<em><b>Delegated To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO = eINSTANCE.getDelegatedInteractionContribution_DelegatedTo();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.InteractionContributionInstantiationImpl <em>Interaction Contribution Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.InteractionContributionInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionInstantiation()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_INSTANTIATION = eINSTANCE.getInteractionContributionInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE = eINSTANCE.getInteractionContributionInstantiation_Type();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.ActionInstantiationImpl <em>Action Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.ActionInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getActionInstantiation()
         * @generated
         */
        EClass ACTION_INSTANTIATION = eINSTANCE.getActionInstantiation();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_INSTANTIATION__INSTANCES = eINSTANCE.getActionInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Behavior Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_INSTANTIATION__BEHAVIOR_TYPE = eINSTANCE.getActionInstantiation_BehaviorType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.InteractionContributionOfTypeImpl <em>Interaction Contribution Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.InteractionContributionOfTypeImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionContributionOfType()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_OF_TYPE = eINSTANCE.getInteractionContributionOfType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorInstantiationVariableReferenceImpl <em>Behavior Instantiation Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorInstantiationVariableReferenceImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationVariableReference()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE = eINSTANCE.getBehaviorInstantiationVariableReference();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorInstantiationReferenceImpl <em>Behavior Instantiation Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorInstantiationReferenceImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorInstantiationReference()
         * @generated
         */
        EClass BEHAVIOR_INSTANTIATION_REFERENCE = eINSTANCE.getBehaviorInstantiationReference();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_INSTANTIATION_REFERENCE__CHILD = eINSTANCE.getBehaviorInstantiationReference_Child();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl <em>Abstract Interaction Contribution Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getAbstractInteractionContributionOfType()
         * @generated
         */
        EClass ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE = eINSTANCE.getAbstractInteractionContributionOfType();

        /**
         * The meta object literal for the '<em><b>Behavior Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE = eINSTANCE.getAbstractInteractionContributionOfType_BehaviorType();

        /**
         * The meta object literal for the '<em><b>Contribution Of Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS = eINSTANCE.getAbstractInteractionContributionOfType_ContributionOfInstantiations();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE = eINSTANCE.getAbstractInteractionContributionOfType_Role();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.FlowPointOfInstantiationImpl <em>Flow Point Of Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.FlowPointOfInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointOfInstantiation()
         * @generated
         */
        EClass FLOW_POINT_OF_INSTANTIATION = eINSTANCE.getFlowPointOfInstantiation();

        /**
         * The meta object literal for the '<em><b>Flow Point Of Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE = eINSTANCE.getFlowPointOfInstantiation_FlowPointOfType();

        /**
         * The meta object literal for the '<em><b>Behavior Instantiation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION = eINSTANCE.getFlowPointOfInstantiation_BehaviorInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.FlowPointInstantiationImpl <em>Flow Point Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.FlowPointInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getFlowPointInstantiation()
         * @generated
         */
        EClass FLOW_POINT_INSTANTIATION = eINSTANCE.getFlowPointInstantiation();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.EntryPointOfTypeImpl <em>Entry Point Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.EntryPointOfTypeImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getEntryPointOfType()
         * @generated
         */
        EClass ENTRY_POINT_OF_TYPE = eINSTANCE.getEntryPointOfType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.ExitPointOfTypeImpl <em>Exit Point Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.ExitPointOfTypeImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getExitPointOfType()
         * @generated
         */
        EClass EXIT_POINT_OF_TYPE = eINSTANCE.getExitPointOfType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.ActionInstantiationHierarchyImpl <em>Action Instantiation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.ActionInstantiationHierarchyImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getActionInstantiationHierarchy()
         * @generated
         */
        EClass ACTION_INSTANTIATION_HIERARCHY = eINSTANCE.getActionInstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Behavior Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET = eINSTANCE.getActionInstantiationHierarchy_BehaviorTarget();

        /**
         * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_INSTANTIATION_HIERARCHY__ACTIVITY = eINSTANCE.getActionInstantiationHierarchy_Activity();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.InteractionInstantiationImpl <em>Interaction Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.InteractionInstantiationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getInteractionInstantiation()
         * @generated
         */
        EClass INTERACTION_INSTANTIATION = eINSTANCE.getInteractionInstantiation();

        /**
         * The meta object literal for the '<em><b>Contributions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_INSTANTIATION__CONTRIBUTIONS = eINSTANCE.getInteractionInstantiation_Contributions();

        /**
         * The meta object literal for the '<em><b>Behavior Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_INSTANTIATION__BEHAVIOR_TYPE = eINSTANCE.getInteractionInstantiation_BehaviorType();

        /**
         * The meta object literal for the '{@link behavior.instantiation.impl.BehaviorDeclarationImpl <em>Behavior Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instantiation.impl.BehaviorDeclarationImpl
         * @see behavior.instantiation.impl.InstantiationPackageImpl#getBehaviorDeclaration()
         * @generated
         */
        EClass BEHAVIOR_DECLARATION = eINSTANCE.getBehaviorDeclaration();

    }

} //InstantiationPackage
