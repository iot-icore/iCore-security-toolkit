/**
 */
package behavior.type;

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
 * @see behavior.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = behavior.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.type.impl.AbstractDataProducerTypeImpl <em>Abstract Data Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.AbstractDataProducerTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getAbstractDataProducerType()
     * @generated
     */
    int ABSTRACT_DATA_PRODUCER_TYPE = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abstract Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Abstract Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_PRODUCER_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.AbstractBehaviorTypeImpl <em>Abstract Behavior Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.AbstractBehaviorTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getAbstractBehaviorType()
     * @generated
     */
    int ABSTRACT_BEHAVIOR_TYPE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__VISUAL_ELEMENTS = ABSTRACT_DATA_PRODUCER_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__ID = ABSTRACT_DATA_PRODUCER_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__DATA_INSTANTIATIONS = ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS = ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__CONSTRAINTS = ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__NAME = ABSTRACT_DATA_PRODUCER_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Causality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__INSTANCES = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__PACKAGE = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Abstract Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Abstract Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_TYPE_OPERATION_COUNT = ABSTRACT_DATA_PRODUCER_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.MonolithicBehaviorTypeImpl <em>Monolithic Behavior Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.MonolithicBehaviorTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getMonolithicBehaviorType()
     * @generated
     */
    int MONOLITHIC_BEHAVIOR_TYPE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__VISUAL_ELEMENTS = ABSTRACT_BEHAVIOR_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__ID = ABSTRACT_BEHAVIOR_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__DATA_INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__CONSTRAINTS = ABSTRACT_BEHAVIOR_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__NAME = ABSTRACT_BEHAVIOR_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__FLOW_POINTS = ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS;

    /**
     * The feature id for the '<em><b>Causality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__CAUSALITY_RELATIONS = ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS = ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__SUPER_TYPES = ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__INSTANCES = ABSTRACT_BEHAVIOR_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__PACKAGE = ABSTRACT_BEHAVIOR_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__ENTITY_TYPE = ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__SUB_TYPES = ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__CONTRIBUTIONS = ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE__ACTIONS = ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Monolithic Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE_FEATURE_COUNT = ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Monolithic Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONOLITHIC_BEHAVIOR_TYPE_OPERATION_COUNT = ABSTRACT_BEHAVIOR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.DataProducerTypeImpl <em>Data Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.DataProducerTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getDataProducerType()
     * @generated
     */
    int DATA_PRODUCER_TYPE = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__VISUAL_ELEMENTS = ABSTRACT_DATA_PRODUCER_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__ID = ABSTRACT_DATA_PRODUCER_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS = ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS = ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__CONSTRAINTS = ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__NAME = ABSTRACT_DATA_PRODUCER_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE__PACKAGE = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE_FEATURE_COUNT = ABSTRACT_DATA_PRODUCER_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_TYPE_OPERATION_COUNT = ABSTRACT_DATA_PRODUCER_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.ActivityTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getActivityType()
     * @generated
     */
    int ACTIVITY_TYPE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__VISUAL_ELEMENTS = DATA_PRODUCER_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__ID = DATA_PRODUCER_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__DATA_INSTANTIATIONS = DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__IDENTITY_INSTANTIATIONS = DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__CONSTRAINTS = DATA_PRODUCER_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__NAME = DATA_PRODUCER_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__PACKAGE = DATA_PRODUCER_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__INSTANTIATIONS = DATA_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__SUB_TYPES = DATA_PRODUCER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE__SUPER_TYPES = DATA_PRODUCER_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Activity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_FEATURE_COUNT = DATA_PRODUCER_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Activity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_TYPE_OPERATION_COUNT = DATA_PRODUCER_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.ActionTypeImpl <em>Action Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.ActionTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getActionType()
     * @generated
     */
    int ACTION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__VISUAL_ELEMENTS = ACTIVITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__ID = ACTIVITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__DATA_INSTANTIATIONS = ACTIVITY_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__IDENTITY_INSTANTIATIONS = ACTIVITY_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__CONSTRAINTS = ACTIVITY_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__NAME = ACTIVITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__PACKAGE = ACTIVITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__INSTANTIATIONS = ACTIVITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__SUB_TYPES = ACTIVITY_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__SUPER_TYPES = ACTIVITY_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE__INSTANCES = ACTIVITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.InteractionContributionTypeImpl <em>Interaction Contribution Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.InteractionContributionTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getInteractionContributionType()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_TYPE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__ROLE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Interaction Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Interaction Contribution Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Interaction Contribution Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.InteractionTypeImpl <em>Interaction Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.InteractionTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getInteractionType()
     * @generated
     */
    int INTERACTION_TYPE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__VISUAL_ELEMENTS = ACTIVITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__ID = ACTIVITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__DATA_INSTANTIATIONS = ACTIVITY_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__IDENTITY_INSTANTIATIONS = ACTIVITY_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__CONSTRAINTS = ACTIVITY_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__NAME = ACTIVITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__PACKAGE = ACTIVITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__INSTANTIATIONS = ACTIVITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__SUB_TYPES = ACTIVITY_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__SUPER_TYPES = ACTIVITY_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__INSTANCES = ACTIVITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interaction Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__INTERACTION_PATTERN = ACTIVITY_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contribution Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE__CONTRIBUTION_TYPES = ACTIVITY_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Interaction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Interaction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.BehaviorTypePackageImpl <em>Behavior Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.BehaviorTypePackageImpl
     * @see behavior.type.impl.TypePackageImpl#getBehaviorTypePackage()
     * @generated
     */
    int BEHAVIOR_TYPE_PACKAGE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Behavior Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Producer Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Super Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Behavior Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Behavior Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.FlowPointTypeImpl <em>Flow Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.FlowPointTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getFlowPointType()
     * @generated
     */
    int FLOW_POINT_TYPE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__VISUAL_ELEMENTS = DATA_PRODUCER_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__ID = DATA_PRODUCER_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__DATA_INSTANTIATIONS = DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__IDENTITY_INSTANTIATIONS = DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__CONSTRAINTS = DATA_PRODUCER_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__NAME = DATA_PRODUCER_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__PACKAGE = DATA_PRODUCER_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE__INSTANTIATIONS = DATA_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Flow Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_FEATURE_COUNT = DATA_PRODUCER_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Flow Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_TYPE_OPERATION_COUNT = DATA_PRODUCER_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.EntryPointTypeImpl <em>Entry Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.EntryPointTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getEntryPointType()
     * @generated
     */
    int ENTRY_POINT_TYPE = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__VISUAL_ELEMENTS = FLOW_POINT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__ID = FLOW_POINT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__DATA_INSTANTIATIONS = FLOW_POINT_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__IDENTITY_INSTANTIATIONS = FLOW_POINT_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__CONSTRAINTS = FLOW_POINT_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__NAME = FLOW_POINT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__PACKAGE = FLOW_POINT_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE__INSTANTIATIONS = FLOW_POINT_TYPE__INSTANTIATIONS;

    /**
     * The number of structural features of the '<em>Entry Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE_FEATURE_COUNT = FLOW_POINT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entry Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_POINT_TYPE_OPERATION_COUNT = FLOW_POINT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.ExitPointTypeImpl <em>Exit Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.ExitPointTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getExitPointType()
     * @generated
     */
    int EXIT_POINT_TYPE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__VISUAL_ELEMENTS = FLOW_POINT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__ID = FLOW_POINT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__DATA_INSTANTIATIONS = FLOW_POINT_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__IDENTITY_INSTANTIATIONS = FLOW_POINT_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__CONSTRAINTS = FLOW_POINT_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__NAME = FLOW_POINT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__PACKAGE = FLOW_POINT_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE__INSTANTIATIONS = FLOW_POINT_TYPE__INSTANTIATIONS;

    /**
     * The number of structural features of the '<em>Exit Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE_FEATURE_COUNT = FLOW_POINT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Exit Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_POINT_TYPE_OPERATION_COUNT = FLOW_POINT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.StructuredBehaviorTypeImpl <em>Structured Behavior Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.StructuredBehaviorTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getStructuredBehaviorType()
     * @generated
     */
    int STRUCTURED_BEHAVIOR_TYPE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__VISUAL_ELEMENTS = ABSTRACT_BEHAVIOR_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__ID = ABSTRACT_BEHAVIOR_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__DATA_INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__CONSTRAINTS = ABSTRACT_BEHAVIOR_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__NAME = ABSTRACT_BEHAVIOR_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__FLOW_POINTS = ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS;

    /**
     * The feature id for the '<em><b>Causality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__CAUSALITY_RELATIONS = ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS = ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__SUPER_TYPES = ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__INSTANCES = ABSTRACT_BEHAVIOR_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__PACKAGE = ABSTRACT_BEHAVIOR_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__ENTITY_TYPE = ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__SUB_TYPES = ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__CONTRIBUTIONS = ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS = ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS = ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Structured Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE_FEATURE_COUNT = ABSTRACT_BEHAVIOR_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Structured Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURED_BEHAVIOR_TYPE_OPERATION_COUNT = ABSTRACT_BEHAVIOR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.BehaviorTypeImpl
     * @see behavior.type.impl.TypePackageImpl#getBehaviorType()
     * @generated
     */
    int BEHAVIOR_TYPE = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__VISUAL_ELEMENTS = STRUCTURED_BEHAVIOR_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__ID = STRUCTURED_BEHAVIOR_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__DATA_INSTANTIATIONS = STRUCTURED_BEHAVIOR_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS = STRUCTURED_BEHAVIOR_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__CONSTRAINTS = STRUCTURED_BEHAVIOR_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__NAME = STRUCTURED_BEHAVIOR_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__FLOW_POINTS = STRUCTURED_BEHAVIOR_TYPE__FLOW_POINTS;

    /**
     * The feature id for the '<em><b>Causality Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__CAUSALITY_RELATIONS = STRUCTURED_BEHAVIOR_TYPE__CAUSALITY_RELATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__INSTANTIATIONS = STRUCTURED_BEHAVIOR_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__VARIABLE_DECLARATIONS = STRUCTURED_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__SUPER_TYPES = STRUCTURED_BEHAVIOR_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__INSTANCES = STRUCTURED_BEHAVIOR_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__PACKAGE = STRUCTURED_BEHAVIOR_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__ENTITY_TYPE = STRUCTURED_BEHAVIOR_TYPE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__SUB_TYPES = STRUCTURED_BEHAVIOR_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__CONTRIBUTIONS = STRUCTURED_BEHAVIOR_TYPE__CONTRIBUTIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS = STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__INTERACTIONS = STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE__ACTIONS = STRUCTURED_BEHAVIOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_FEATURE_COUNT = STRUCTURED_BEHAVIOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Behavior Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_TYPE_OPERATION_COUNT = STRUCTURED_BEHAVIOR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.impl.DataProducerCharacterizationImpl <em>Data Producer Characterization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.impl.DataProducerCharacterizationImpl
     * @see behavior.type.impl.TypePackageImpl#getDataProducerCharacterization()
     * @generated
     */
    int DATA_PRODUCER_CHARACTERIZATION = 13;

    /**
     * The number of structural features of the '<em>Data Producer Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_CHARACTERIZATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Data Producer Characterization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_CHARACTERIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.type.InteractionPatternType <em>Interaction Pattern Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.InteractionPatternType
     * @see behavior.type.impl.TypePackageImpl#getInteractionPatternType()
     * @generated
     */
    int INTERACTION_PATTERN_TYPE = 15;


    /**
     * Returns the meta object for class '{@link behavior.type.MonolithicBehaviorType <em>Monolithic Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monolithic Behavior Type</em>'.
     * @see behavior.type.MonolithicBehaviorType
     * @generated
     */
    EClass getMonolithicBehaviorType();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.MonolithicBehaviorType#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Actions</em>'.
     * @see behavior.type.MonolithicBehaviorType#getActions()
     * @see #getMonolithicBehaviorType()
     * @generated
     */
    EReference getMonolithicBehaviorType_Actions();

    /**
     * Returns the meta object for class '{@link behavior.type.ActionType <em>Action Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Type</em>'.
     * @see behavior.type.ActionType
     * @generated
     */
    EClass getActionType();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.ActionType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see behavior.type.ActionType#getInstances()
     * @see #getActionType()
     * @generated
     */
    EReference getActionType_Instances();

    /**
     * Returns the meta object for class '{@link behavior.type.InteractionContributionType <em>Interaction Contribution Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Type</em>'.
     * @see behavior.type.InteractionContributionType
     * @generated
     */
    EClass getInteractionContributionType();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.InteractionContributionType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see behavior.type.InteractionContributionType#getInstantiations()
     * @see #getInteractionContributionType()
     * @generated
     */
    EReference getInteractionContributionType_Instantiations();

    /**
     * Returns the meta object for the attribute '{@link behavior.type.InteractionContributionType#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role</em>'.
     * @see behavior.type.InteractionContributionType#getRole()
     * @see #getInteractionContributionType()
     * @generated
     */
    EAttribute getInteractionContributionType_Role();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.InteractionContributionType#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see behavior.type.InteractionContributionType#getConstraints()
     * @see #getInteractionContributionType()
     * @generated
     */
    EReference getInteractionContributionType_Constraints();

    /**
     * Returns the meta object for the container reference '{@link behavior.type.InteractionContributionType#getInteractionType <em>Interaction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Interaction Type</em>'.
     * @see behavior.type.InteractionContributionType#getInteractionType()
     * @see #getInteractionContributionType()
     * @generated
     */
    EReference getInteractionContributionType_InteractionType();

    /**
     * Returns the meta object for class '{@link behavior.type.ActivityType <em>Activity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Type</em>'.
     * @see behavior.type.ActivityType
     * @generated
     */
    EClass getActivityType();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.ActivityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see behavior.type.ActivityType#getInstantiations()
     * @see #getActivityType()
     * @generated
     */
    EReference getActivityType_Instantiations();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.ActivityType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Types</em>'.
     * @see behavior.type.ActivityType#getSubTypes()
     * @see #getActivityType()
     * @generated
     */
    EReference getActivityType_SubTypes();

    /**
     * Returns the meta object for the reference '{@link behavior.type.ActivityType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Types</em>'.
     * @see behavior.type.ActivityType#getSuperTypes()
     * @see #getActivityType()
     * @generated
     */
    EReference getActivityType_SuperTypes();

    /**
     * Returns the meta object for class '{@link behavior.type.AbstractBehaviorType <em>Abstract Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Behavior Type</em>'.
     * @see behavior.type.AbstractBehaviorType
     * @generated
     */
    EClass getAbstractBehaviorType();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractBehaviorType#getFlowPoints <em>Flow Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Points</em>'.
     * @see behavior.type.AbstractBehaviorType#getFlowPoints()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_FlowPoints();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractBehaviorType#getCausalityRelations <em>Causality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Causality Relations</em>'.
     * @see behavior.type.AbstractBehaviorType#getCausalityRelations()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_CausalityRelations();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.AbstractBehaviorType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see behavior.type.AbstractBehaviorType#getInstantiations()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_Instantiations();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractBehaviorType#getVariableDeclarations <em>Variable Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
     * @see behavior.type.AbstractBehaviorType#getVariableDeclarations()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_VariableDeclarations();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.AbstractBehaviorType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Super Types</em>'.
     * @see behavior.type.AbstractBehaviorType#getSuperTypes()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_SuperTypes();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.AbstractBehaviorType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see behavior.type.AbstractBehaviorType#getInstances()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_Instances();

    /**
     * Returns the meta object for the container reference '{@link behavior.type.AbstractBehaviorType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see behavior.type.AbstractBehaviorType#getPackage()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_Package();

    /**
     * Returns the meta object for the reference '{@link behavior.type.AbstractBehaviorType#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Type</em>'.
     * @see behavior.type.AbstractBehaviorType#getEntityType()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_EntityType();

    /**
     * Returns the meta object for the reference '{@link behavior.type.AbstractBehaviorType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sub Types</em>'.
     * @see behavior.type.AbstractBehaviorType#getSubTypes()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_SubTypes();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractBehaviorType#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contributions</em>'.
     * @see behavior.type.AbstractBehaviorType#getContributions()
     * @see #getAbstractBehaviorType()
     * @generated
     */
    EReference getAbstractBehaviorType_Contributions();

    /**
     * Returns the meta object for class '{@link behavior.type.InteractionType <em>Interaction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Type</em>'.
     * @see behavior.type.InteractionType
     * @generated
     */
    EClass getInteractionType();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.InteractionType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see behavior.type.InteractionType#getInstances()
     * @see #getInteractionType()
     * @generated
     */
    EReference getInteractionType_Instances();

    /**
     * Returns the meta object for the attribute '{@link behavior.type.InteractionType#getInteractionPattern <em>Interaction Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interaction Pattern</em>'.
     * @see behavior.type.InteractionType#getInteractionPattern()
     * @see #getInteractionType()
     * @generated
     */
    EAttribute getInteractionType_InteractionPattern();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.InteractionType#getContributionTypes <em>Contribution Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contribution Types</em>'.
     * @see behavior.type.InteractionType#getContributionTypes()
     * @see #getInteractionType()
     * @generated
     */
    EReference getInteractionType_ContributionTypes();

    /**
     * Returns the meta object for class '{@link behavior.type.BehaviorTypePackage <em>Behavior Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Type Package</em>'.
     * @see behavior.type.BehaviorTypePackage
     * @generated
     */
    EClass getBehaviorTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.BehaviorTypePackage#getBehaviorTypes <em>Behavior Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Types</em>'.
     * @see behavior.type.BehaviorTypePackage#getBehaviorTypes()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EReference getBehaviorTypePackage_BehaviorTypes();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.BehaviorTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
     * @see behavior.type.BehaviorTypePackage#getSubPackages()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EReference getBehaviorTypePackage_SubPackages();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.BehaviorTypePackage#getDataProducerTypes <em>Data Producer Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Producer Types</em>'.
     * @see behavior.type.BehaviorTypePackage#getDataProducerTypes()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EReference getBehaviorTypePackage_DataProducerTypes();

    /**
     * Returns the meta object for the attribute '{@link behavior.type.BehaviorTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.type.BehaviorTypePackage#getName()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EAttribute getBehaviorTypePackage_Name();

    /**
     * Returns the meta object for the container reference '{@link behavior.type.BehaviorTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Super Package</em>'.
     * @see behavior.type.BehaviorTypePackage#getSuperPackage()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EReference getBehaviorTypePackage_SuperPackage();

    /**
     * Returns the meta object for the container reference '{@link behavior.type.BehaviorTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see behavior.type.BehaviorTypePackage#getModel()
     * @see #getBehaviorTypePackage()
     * @generated
     */
    EReference getBehaviorTypePackage_Model();

    /**
     * Returns the meta object for class '{@link behavior.type.FlowPointType <em>Flow Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Type</em>'.
     * @see behavior.type.FlowPointType
     * @generated
     */
    EClass getFlowPointType();

    /**
     * Returns the meta object for the reference list '{@link behavior.type.FlowPointType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see behavior.type.FlowPointType#getInstantiations()
     * @see #getFlowPointType()
     * @generated
     */
    EReference getFlowPointType_Instantiations();

    /**
     * Returns the meta object for class '{@link behavior.type.EntryPointType <em>Entry Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Point Type</em>'.
     * @see behavior.type.EntryPointType
     * @generated
     */
    EClass getEntryPointType();

    /**
     * Returns the meta object for class '{@link behavior.type.ExitPointType <em>Exit Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit Point Type</em>'.
     * @see behavior.type.ExitPointType
     * @generated
     */
    EClass getExitPointType();

    /**
     * Returns the meta object for class '{@link behavior.type.BehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Type</em>'.
     * @see behavior.type.BehaviorType
     * @generated
     */
    EClass getBehaviorType();

    /**
     * Returns the meta object for class '{@link behavior.type.StructuredBehaviorType <em>Structured Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structured Behavior Type</em>'.
     * @see behavior.type.StructuredBehaviorType
     * @generated
     */
    EClass getStructuredBehaviorType();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.StructuredBehaviorType#getContainedInstantiations <em>Contained Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Instantiations</em>'.
     * @see behavior.type.StructuredBehaviorType#getContainedInstantiations()
     * @see #getStructuredBehaviorType()
     * @generated
     */
    EReference getStructuredBehaviorType_ContainedInstantiations();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.StructuredBehaviorType#getInteractions <em>Interactions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interactions</em>'.
     * @see behavior.type.StructuredBehaviorType#getInteractions()
     * @see #getStructuredBehaviorType()
     * @generated
     */
    EReference getStructuredBehaviorType_Interactions();

    /**
     * Returns the meta object for class '{@link behavior.type.DataProducerType <em>Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Producer Type</em>'.
     * @see behavior.type.DataProducerType
     * @generated
     */
    EClass getDataProducerType();

    /**
     * Returns the meta object for the container reference '{@link behavior.type.DataProducerType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see behavior.type.DataProducerType#getPackage()
     * @see #getDataProducerType()
     * @generated
     */
    EReference getDataProducerType_Package();

    /**
     * Returns the meta object for class '{@link behavior.type.DataProducerCharacterization <em>Data Producer Characterization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Producer Characterization</em>'.
     * @see behavior.type.DataProducerCharacterization
     * @generated
     */
    EClass getDataProducerCharacterization();

    /**
     * Returns the meta object for class '{@link behavior.type.AbstractDataProducerType <em>Abstract Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Producer Type</em>'.
     * @see behavior.type.AbstractDataProducerType
     * @generated
     */
    EClass getAbstractDataProducerType();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractDataProducerType#getDataInstantiations <em>Data Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Instantiations</em>'.
     * @see behavior.type.AbstractDataProducerType#getDataInstantiations()
     * @see #getAbstractDataProducerType()
     * @generated
     */
    EReference getAbstractDataProducerType_DataInstantiations();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractDataProducerType#getIdentityInstantiations <em>Identity Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Instantiations</em>'.
     * @see behavior.type.AbstractDataProducerType#getIdentityInstantiations()
     * @see #getAbstractDataProducerType()
     * @generated
     */
    EReference getAbstractDataProducerType_IdentityInstantiations();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.type.AbstractDataProducerType#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see behavior.type.AbstractDataProducerType#getConstraints()
     * @see #getAbstractDataProducerType()
     * @generated
     */
    EReference getAbstractDataProducerType_Constraints();

    /**
     * Returns the meta object for the attribute '{@link behavior.type.AbstractDataProducerType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.type.AbstractDataProducerType#getName()
     * @see #getAbstractDataProducerType()
     * @generated
     */
    EAttribute getAbstractDataProducerType_Name();

    /**
     * Returns the meta object for enum '{@link behavior.type.InteractionPatternType <em>Interaction Pattern Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Interaction Pattern Type</em>'.
     * @see behavior.type.InteractionPatternType
     * @generated
     */
    EEnum getInteractionPatternType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

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
         * The meta object literal for the '{@link behavior.type.impl.MonolithicBehaviorTypeImpl <em>Monolithic Behavior Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.MonolithicBehaviorTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getMonolithicBehaviorType()
         * @generated
         */
        EClass MONOLITHIC_BEHAVIOR_TYPE = eINSTANCE.getMonolithicBehaviorType();

        /**
         * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MONOLITHIC_BEHAVIOR_TYPE__ACTIONS = eINSTANCE.getMonolithicBehaviorType_Actions();

        /**
         * The meta object literal for the '{@link behavior.type.impl.ActionTypeImpl <em>Action Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.ActionTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getActionType()
         * @generated
         */
        EClass ACTION_TYPE = eINSTANCE.getActionType();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_TYPE__INSTANCES = eINSTANCE.getActionType_Instances();

        /**
         * The meta object literal for the '{@link behavior.type.impl.InteractionContributionTypeImpl <em>Interaction Contribution Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.InteractionContributionTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getInteractionContributionType()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_TYPE = eINSTANCE.getInteractionContributionType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS = eINSTANCE.getInteractionContributionType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_CONTRIBUTION_TYPE__ROLE = eINSTANCE.getInteractionContributionType_Role();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS = eINSTANCE.getInteractionContributionType_Constraints();

        /**
         * The meta object literal for the '<em><b>Interaction Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE = eINSTANCE.getInteractionContributionType_InteractionType();

        /**
         * The meta object literal for the '{@link behavior.type.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.ActivityTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getActivityType()
         * @generated
         */
        EClass ACTIVITY_TYPE = eINSTANCE.getActivityType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_TYPE__INSTANTIATIONS = eINSTANCE.getActivityType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_TYPE__SUB_TYPES = eINSTANCE.getActivityType_SubTypes();

        /**
         * The meta object literal for the '<em><b>Super Types</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_TYPE__SUPER_TYPES = eINSTANCE.getActivityType_SuperTypes();

        /**
         * The meta object literal for the '{@link behavior.type.impl.AbstractBehaviorTypeImpl <em>Abstract Behavior Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.AbstractBehaviorTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getAbstractBehaviorType()
         * @generated
         */
        EClass ABSTRACT_BEHAVIOR_TYPE = eINSTANCE.getAbstractBehaviorType();

        /**
         * The meta object literal for the '<em><b>Flow Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS = eINSTANCE.getAbstractBehaviorType_FlowPoints();

        /**
         * The meta object literal for the '<em><b>Causality Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS = eINSTANCE.getAbstractBehaviorType_CausalityRelations();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS = eINSTANCE.getAbstractBehaviorType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS = eINSTANCE.getAbstractBehaviorType_VariableDeclarations();

        /**
         * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES = eINSTANCE.getAbstractBehaviorType_SuperTypes();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__INSTANCES = eINSTANCE.getAbstractBehaviorType_Instances();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__PACKAGE = eINSTANCE.getAbstractBehaviorType_Package();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE = eINSTANCE.getAbstractBehaviorType_EntityType();

        /**
         * The meta object literal for the '<em><b>Sub Types</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES = eINSTANCE.getAbstractBehaviorType_SubTypes();

        /**
         * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS = eINSTANCE.getAbstractBehaviorType_Contributions();

        /**
         * The meta object literal for the '{@link behavior.type.impl.InteractionTypeImpl <em>Interaction Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.InteractionTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getInteractionType()
         * @generated
         */
        EClass INTERACTION_TYPE = eINSTANCE.getInteractionType();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_TYPE__INSTANCES = eINSTANCE.getInteractionType_Instances();

        /**
         * The meta object literal for the '<em><b>Interaction Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_TYPE__INTERACTION_PATTERN = eINSTANCE.getInteractionType_InteractionPattern();

        /**
         * The meta object literal for the '<em><b>Contribution Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_TYPE__CONTRIBUTION_TYPES = eINSTANCE.getInteractionType_ContributionTypes();

        /**
         * The meta object literal for the '{@link behavior.type.impl.BehaviorTypePackageImpl <em>Behavior Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.BehaviorTypePackageImpl
         * @see behavior.type.impl.TypePackageImpl#getBehaviorTypePackage()
         * @generated
         */
        EClass BEHAVIOR_TYPE_PACKAGE = eINSTANCE.getBehaviorTypePackage();

        /**
         * The meta object literal for the '<em><b>Behavior Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES = eINSTANCE.getBehaviorTypePackage_BehaviorTypes();

        /**
         * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES = eINSTANCE.getBehaviorTypePackage_SubPackages();

        /**
         * The meta object literal for the '<em><b>Data Producer Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES = eINSTANCE.getBehaviorTypePackage_DataProducerTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_TYPE_PACKAGE__NAME = eINSTANCE.getBehaviorTypePackage_Name();

        /**
         * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE = eINSTANCE.getBehaviorTypePackage_SuperPackage();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_TYPE_PACKAGE__MODEL = eINSTANCE.getBehaviorTypePackage_Model();

        /**
         * The meta object literal for the '{@link behavior.type.impl.FlowPointTypeImpl <em>Flow Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.FlowPointTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getFlowPointType()
         * @generated
         */
        EClass FLOW_POINT_TYPE = eINSTANCE.getFlowPointType();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT_TYPE__INSTANTIATIONS = eINSTANCE.getFlowPointType_Instantiations();

        /**
         * The meta object literal for the '{@link behavior.type.impl.EntryPointTypeImpl <em>Entry Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.EntryPointTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getEntryPointType()
         * @generated
         */
        EClass ENTRY_POINT_TYPE = eINSTANCE.getEntryPointType();

        /**
         * The meta object literal for the '{@link behavior.type.impl.ExitPointTypeImpl <em>Exit Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.ExitPointTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getExitPointType()
         * @generated
         */
        EClass EXIT_POINT_TYPE = eINSTANCE.getExitPointType();

        /**
         * The meta object literal for the '{@link behavior.type.impl.BehaviorTypeImpl <em>Behavior Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.BehaviorTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getBehaviorType()
         * @generated
         */
        EClass BEHAVIOR_TYPE = eINSTANCE.getBehaviorType();

        /**
         * The meta object literal for the '{@link behavior.type.impl.StructuredBehaviorTypeImpl <em>Structured Behavior Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.StructuredBehaviorTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getStructuredBehaviorType()
         * @generated
         */
        EClass STRUCTURED_BEHAVIOR_TYPE = eINSTANCE.getStructuredBehaviorType();

        /**
         * The meta object literal for the '<em><b>Contained Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS = eINSTANCE.getStructuredBehaviorType_ContainedInstantiations();

        /**
         * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS = eINSTANCE.getStructuredBehaviorType_Interactions();

        /**
         * The meta object literal for the '{@link behavior.type.impl.DataProducerTypeImpl <em>Data Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.DataProducerTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getDataProducerType()
         * @generated
         */
        EClass DATA_PRODUCER_TYPE = eINSTANCE.getDataProducerType();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PRODUCER_TYPE__PACKAGE = eINSTANCE.getDataProducerType_Package();

        /**
         * The meta object literal for the '{@link behavior.type.impl.DataProducerCharacterizationImpl <em>Data Producer Characterization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.DataProducerCharacterizationImpl
         * @see behavior.type.impl.TypePackageImpl#getDataProducerCharacterization()
         * @generated
         */
        EClass DATA_PRODUCER_CHARACTERIZATION = eINSTANCE.getDataProducerCharacterization();

        /**
         * The meta object literal for the '{@link behavior.type.impl.AbstractDataProducerTypeImpl <em>Abstract Data Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.impl.AbstractDataProducerTypeImpl
         * @see behavior.type.impl.TypePackageImpl#getAbstractDataProducerType()
         * @generated
         */
        EClass ABSTRACT_DATA_PRODUCER_TYPE = eINSTANCE.getAbstractDataProducerType();

        /**
         * The meta object literal for the '<em><b>Data Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS = eINSTANCE.getAbstractDataProducerType_DataInstantiations();

        /**
         * The meta object literal for the '<em><b>Identity Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS = eINSTANCE.getAbstractDataProducerType_IdentityInstantiations();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS = eINSTANCE.getAbstractDataProducerType_Constraints();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DATA_PRODUCER_TYPE__NAME = eINSTANCE.getAbstractDataProducerType_Name();

        /**
         * The meta object literal for the '{@link behavior.type.InteractionPatternType <em>Interaction Pattern Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.InteractionPatternType
         * @see behavior.type.impl.TypePackageImpl#getInteractionPatternType()
         * @generated
         */
        EEnum INTERACTION_PATTERN_TYPE = eINSTANCE.getInteractionPatternType();

    }

} //TypePackage
