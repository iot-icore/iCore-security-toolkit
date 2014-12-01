/**
 */
package context.instance.tmp;

import context.instance.InstancePackage;

import context.type.TypePackage;

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
 * @see context.instance.tmp.TmpFactory
 * @model kind="package"
 * @generated
 */
public interface TmpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "tmp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/tmp/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-tmp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TmpPackage eINSTANCE = context.instance.tmp.impl.TmpPackageImpl.init();

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.TemperatureMeasurementImpl <em>Temperature Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.TemperatureMeasurementImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getTemperatureMeasurement()
     * @generated
     */
    int TEMPERATURE_MEASUREMENT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__VISUAL_ELEMENTS = InstancePackage.CONTEXT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__ID = InstancePackage.CONTEXT__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__STRING_VALUE = InstancePackage.CONTEXT__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__ADDRESSES = InstancePackage.CONTEXT__ADDRESSES;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__EOBJECT = InstancePackage.CONTEXT__EOBJECT;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__DATA_SET = InstancePackage.CONTEXT__DATA_SET;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__LOCATION = InstancePackage.CONTEXT__LOCATION;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__INSTANTIATION = InstancePackage.CONTEXT__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__TYPE = InstancePackage.CONTEXT__TYPE;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__INITIAL_REPRESENTATION = InstancePackage.CONTEXT__INITIAL_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__DATA_ID = InstancePackage.CONTEXT__DATA_ID;

    /**
     * The feature id for the '<em><b>Quality Of Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__QUALITY_OF_CONTEXT = InstancePackage.CONTEXT__QUALITY_OF_CONTEXT;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__TIMESTAMP = InstancePackage.CONTEXT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__OWNER = InstancePackage.CONTEXT__OWNER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__VALUE = InstancePackage.CONTEXT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT__SCALE = InstancePackage.CONTEXT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Temperature Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT_FEATURE_COUNT = InstancePackage.CONTEXT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Temperature Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPERATURE_MEASUREMENT_OPERATION_COUNT = InstancePackage.CONTEXT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.NearbyMeasurementImpl <em>Nearby Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.NearbyMeasurementImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getNearbyMeasurement()
     * @generated
     */
    int NEARBY_MEASUREMENT = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__VISUAL_ELEMENTS = InstancePackage.CONTEXT_SITUATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__ID = InstancePackage.CONTEXT_SITUATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__TYPE = InstancePackage.CONTEXT_SITUATION__TYPE;

    /**
     * The feature id for the '<em><b>Roles</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__ROLES = InstancePackage.CONTEXT_SITUATION__ROLES;

    /**
     * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__TIME_INTERVAL = InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__CONTEXT = InstancePackage.CONTEXT_SITUATION__CONTEXT;

    /**
     * The feature id for the '<em><b>Entity A</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__ENTITY_A = InstancePackage.CONTEXT_SITUATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity B</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT__ENTITY_B = InstancePackage.CONTEXT_SITUATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Nearby Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT_FEATURE_COUNT = InstancePackage.CONTEXT_SITUATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Nearby Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEARBY_MEASUREMENT_OPERATION_COUNT = InstancePackage.CONTEXT_SITUATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.EventPrecisionImpl <em>Event Precision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.EventPrecisionImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getEventPrecision()
     * @generated
     */
    int EVENT_PRECISION = 2;

    /**
     * The number of structural features of the '<em>Event Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRECISION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Event Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PRECISION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.MaterialRelationContextImpl <em>Material Relation Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.MaterialRelationContextImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getMaterialRelationContext()
     * @generated
     */
    int MATERIAL_RELATION_CONTEXT = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__VISUAL_ELEMENTS = TypePackage.CONTEXT_INFORMATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__ID = TypePackage.CONTEXT_INFORMATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__ETYPE = TypePackage.CONTEXT_INFORMATION_TYPE__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__INSTANTIATIONS = TypePackage.CONTEXT_INFORMATION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__NAME = TypePackage.CONTEXT_INFORMATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__INSTANCES = TypePackage.CONTEXT_INFORMATION_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__ORIGIN_TYPE = TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__SITUATION_ROLE_TYPES = TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT__PACKAGE = TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE;

    /**
     * The number of structural features of the '<em>Material Relation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT_FEATURE_COUNT = TypePackage.CONTEXT_INFORMATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Material Relation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_RELATION_CONTEXT_OPERATION_COUNT = TypePackage.CONTEXT_INFORMATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.IntrinsicSituationsImpl <em>Intrinsic Situations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.IntrinsicSituationsImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getIntrinsicSituations()
     * @generated
     */
    int INTRINSIC_SITUATIONS = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__VISUAL_ELEMENTS = TypePackage.CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__ID = TypePackage.CONTEXT_SITUATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__ENTITY_ROLE_TYPES = TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__NAME = TypePackage.CONTEXT_SITUATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__SITUATION_RULE = TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__ATTRIBUTES = TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS__PACKAGE = TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE;

    /**
     * The number of structural features of the '<em>Intrinsic Situations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS_FEATURE_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Intrinsic Situations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_SITUATIONS_OPERATION_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.RelationalSituationImpl <em>Relational Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.RelationalSituationImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getRelationalSituation()
     * @generated
     */
    int RELATIONAL_SITUATION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__VISUAL_ELEMENTS = MATERIAL_RELATION_CONTEXT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__ID = MATERIAL_RELATION_CONTEXT__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__ETYPE = MATERIAL_RELATION_CONTEXT__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__INSTANTIATIONS = MATERIAL_RELATION_CONTEXT__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__NAME = MATERIAL_RELATION_CONTEXT__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__INSTANCES = MATERIAL_RELATION_CONTEXT__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__ORIGIN_TYPE = MATERIAL_RELATION_CONTEXT__ORIGIN_TYPE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__SITUATION_ROLE_TYPES = MATERIAL_RELATION_CONTEXT__SITUATION_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION__PACKAGE = MATERIAL_RELATION_CONTEXT__PACKAGE;

    /**
     * The number of structural features of the '<em>Relational Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION_FEATURE_COUNT = MATERIAL_RELATION_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Relational Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONAL_SITUATION_OPERATION_COUNT = MATERIAL_RELATION_CONTEXT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.FriendshipImpl <em>Friendship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.FriendshipImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getFriendship()
     * @generated
     */
    int FRIENDSHIP = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__VISUAL_ELEMENTS = RELATIONAL_SITUATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__ID = RELATIONAL_SITUATION__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__ETYPE = RELATIONAL_SITUATION__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__INSTANTIATIONS = RELATIONAL_SITUATION__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__NAME = RELATIONAL_SITUATION__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__INSTANCES = RELATIONAL_SITUATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__ORIGIN_TYPE = RELATIONAL_SITUATION__ORIGIN_TYPE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__SITUATION_ROLE_TYPES = RELATIONAL_SITUATION__SITUATION_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP__PACKAGE = RELATIONAL_SITUATION__PACKAGE;

    /**
     * The number of structural features of the '<em>Friendship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP_FEATURE_COUNT = RELATIONAL_SITUATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Friendship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FRIENDSHIP_OPERATION_COUNT = RELATIONAL_SITUATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.FormalRelationSituationImpl <em>Formal Relation Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.FormalRelationSituationImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getFormalRelationSituation()
     * @generated
     */
    int FORMAL_RELATION_SITUATION = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__VISUAL_ELEMENTS = TypePackage.CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__ID = TypePackage.CONTEXT_SITUATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__ENTITY_ROLE_TYPES = TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__NAME = TypePackage.CONTEXT_SITUATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__SITUATION_RULE = TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__ATTRIBUTES = TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION__PACKAGE = TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE;

    /**
     * The number of structural features of the '<em>Formal Relation Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION_FEATURE_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Formal Relation Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_SITUATION_OPERATION_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.SituationOfSituationsImpl <em>Situation Of Situations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.SituationOfSituationsImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getSituationOfSituations()
     * @generated
     */
    int SITUATION_OF_SITUATIONS = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__VISUAL_ELEMENTS = TypePackage.CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__ID = TypePackage.CONTEXT_SITUATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__ENTITY_ROLE_TYPES = TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__NAME = TypePackage.CONTEXT_SITUATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__SITUATION_RULE = TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__ATTRIBUTES = TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS__PACKAGE = TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE;

    /**
     * The number of structural features of the '<em>Situation Of Situations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS_FEATURE_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Situation Of Situations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_OF_SITUATIONS_OPERATION_COUNT = TypePackage.CONTEXT_SITUATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.RecurrentFeverImpl <em>Recurrent Fever</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.RecurrentFeverImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getRecurrentFever()
     * @generated
     */
    int RECURRENT_FEVER = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__VISUAL_ELEMENTS = SITUATION_OF_SITUATIONS__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__ID = SITUATION_OF_SITUATIONS__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__ENTITY_ROLE_TYPES = SITUATION_OF_SITUATIONS__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__NAME = SITUATION_OF_SITUATIONS__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__SITUATION_RULE = SITUATION_OF_SITUATIONS__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__ATTRIBUTES = SITUATION_OF_SITUATIONS__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER__PACKAGE = SITUATION_OF_SITUATIONS__PACKAGE;

    /**
     * The number of structural features of the '<em>Recurrent Fever</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER_FEATURE_COUNT = SITUATION_OF_SITUATIONS_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Recurrent Fever</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRENT_FEVER_OPERATION_COUNT = SITUATION_OF_SITUATIONS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.CombinedSituationImpl <em>Combined Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.CombinedSituationImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getCombinedSituation()
     * @generated
     */
    int COMBINED_SITUATION = 10;

    /**
     * The number of structural features of the '<em>Combined Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINED_SITUATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Combined Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBINED_SITUATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.IntrinsicContextImpl <em>Intrinsic Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.IntrinsicContextImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getIntrinsicContext()
     * @generated
     */
    int INTRINSIC_CONTEXT = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__VISUAL_ELEMENTS = TypePackage.CONTEXT_INFORMATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__ID = TypePackage.CONTEXT_INFORMATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__ETYPE = TypePackage.CONTEXT_INFORMATION_TYPE__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__INSTANTIATIONS = TypePackage.CONTEXT_INFORMATION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__NAME = TypePackage.CONTEXT_INFORMATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__INSTANCES = TypePackage.CONTEXT_INFORMATION_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__ORIGIN_TYPE = TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__SITUATION_ROLE_TYPES = TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT__PACKAGE = TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE;

    /**
     * The number of structural features of the '<em>Intrinsic Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT_FEATURE_COUNT = TypePackage.CONTEXT_INFORMATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Intrinsic Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTRINSIC_CONTEXT_OPERATION_COUNT = TypePackage.CONTEXT_INFORMATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.FeverImpl <em>Fever</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.FeverImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getFever()
     * @generated
     */
    int FEVER = 12;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__VISUAL_ELEMENTS = INTRINSIC_SITUATIONS__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__ID = INTRINSIC_SITUATIONS__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__ENTITY_ROLE_TYPES = INTRINSIC_SITUATIONS__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__NAME = INTRINSIC_SITUATIONS__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__SITUATION_RULE = INTRINSIC_SITUATIONS__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__ATTRIBUTES = INTRINSIC_SITUATIONS__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER__PACKAGE = INTRINSIC_SITUATIONS__PACKAGE;

    /**
     * The number of structural features of the '<em>Fever</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER_FEATURE_COUNT = INTRINSIC_SITUATIONS_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Fever</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEVER_OPERATION_COUNT = INTRINSIC_SITUATIONS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.AvailableDevicesImpl <em>Available Devices</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.AvailableDevicesImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getAvailableDevices()
     * @generated
     */
    int AVAILABLE_DEVICES = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__VISUAL_ELEMENTS = MATERIAL_RELATION_CONTEXT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__ID = MATERIAL_RELATION_CONTEXT__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__ETYPE = MATERIAL_RELATION_CONTEXT__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__INSTANTIATIONS = MATERIAL_RELATION_CONTEXT__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__NAME = MATERIAL_RELATION_CONTEXT__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__INSTANCES = MATERIAL_RELATION_CONTEXT__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__ORIGIN_TYPE = MATERIAL_RELATION_CONTEXT__ORIGIN_TYPE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__SITUATION_ROLE_TYPES = MATERIAL_RELATION_CONTEXT__SITUATION_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES__PACKAGE = MATERIAL_RELATION_CONTEXT__PACKAGE;

    /**
     * The number of structural features of the '<em>Available Devices</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES_FEATURE_COUNT = MATERIAL_RELATION_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Available Devices</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_DEVICES_OPERATION_COUNT = MATERIAL_RELATION_CONTEXT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.tmp.impl.FormalRelationContextImpl <em>Formal Relation Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.tmp.impl.FormalRelationContextImpl
     * @see context.instance.tmp.impl.TmpPackageImpl#getFormalRelationContext()
     * @generated
     */
    int FORMAL_RELATION_CONTEXT = 14;

    /**
     * The number of structural features of the '<em>Formal Relation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_CONTEXT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Formal Relation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_RELATION_CONTEXT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link context.instance.tmp.TemperatureMeasurement <em>Temperature Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Temperature Measurement</em>'.
     * @see context.instance.tmp.TemperatureMeasurement
     * @generated
     */
    EClass getTemperatureMeasurement();

    /**
     * Returns the meta object for the attribute '{@link context.instance.tmp.TemperatureMeasurement#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see context.instance.tmp.TemperatureMeasurement#getValue()
     * @see #getTemperatureMeasurement()
     * @generated
     */
    EAttribute getTemperatureMeasurement_Value();

    /**
     * Returns the meta object for the attribute '{@link context.instance.tmp.TemperatureMeasurement#getScale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @see context.instance.tmp.TemperatureMeasurement#getScale()
     * @see #getTemperatureMeasurement()
     * @generated
     */
    EAttribute getTemperatureMeasurement_Scale();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.NearbyMeasurement <em>Nearby Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nearby Measurement</em>'.
     * @see context.instance.tmp.NearbyMeasurement
     * @generated
     */
    EClass getNearbyMeasurement();

    /**
     * Returns the meta object for the reference '{@link context.instance.tmp.NearbyMeasurement#getEntityA <em>Entity A</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity A</em>'.
     * @see context.instance.tmp.NearbyMeasurement#getEntityA()
     * @see #getNearbyMeasurement()
     * @generated
     */
    EReference getNearbyMeasurement_EntityA();

    /**
     * Returns the meta object for the reference '{@link context.instance.tmp.NearbyMeasurement#getEntityB <em>Entity B</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity B</em>'.
     * @see context.instance.tmp.NearbyMeasurement#getEntityB()
     * @see #getNearbyMeasurement()
     * @generated
     */
    EReference getNearbyMeasurement_EntityB();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.EventPrecision <em>Event Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Precision</em>'.
     * @see context.instance.tmp.EventPrecision
     * @generated
     */
    EClass getEventPrecision();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.MaterialRelationContext <em>Material Relation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Material Relation Context</em>'.
     * @see context.instance.tmp.MaterialRelationContext
     * @generated
     */
    EClass getMaterialRelationContext();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.IntrinsicSituations <em>Intrinsic Situations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intrinsic Situations</em>'.
     * @see context.instance.tmp.IntrinsicSituations
     * @generated
     */
    EClass getIntrinsicSituations();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.RelationalSituation <em>Relational Situation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relational Situation</em>'.
     * @see context.instance.tmp.RelationalSituation
     * @generated
     */
    EClass getRelationalSituation();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.Friendship <em>Friendship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Friendship</em>'.
     * @see context.instance.tmp.Friendship
     * @generated
     */
    EClass getFriendship();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.FormalRelationSituation <em>Formal Relation Situation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formal Relation Situation</em>'.
     * @see context.instance.tmp.FormalRelationSituation
     * @generated
     */
    EClass getFormalRelationSituation();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.SituationOfSituations <em>Situation Of Situations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Situation Of Situations</em>'.
     * @see context.instance.tmp.SituationOfSituations
     * @generated
     */
    EClass getSituationOfSituations();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.RecurrentFever <em>Recurrent Fever</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Recurrent Fever</em>'.
     * @see context.instance.tmp.RecurrentFever
     * @generated
     */
    EClass getRecurrentFever();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.CombinedSituation <em>Combined Situation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Combined Situation</em>'.
     * @see context.instance.tmp.CombinedSituation
     * @generated
     */
    EClass getCombinedSituation();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.IntrinsicContext <em>Intrinsic Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intrinsic Context</em>'.
     * @see context.instance.tmp.IntrinsicContext
     * @generated
     */
    EClass getIntrinsicContext();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.Fever <em>Fever</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fever</em>'.
     * @see context.instance.tmp.Fever
     * @generated
     */
    EClass getFever();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.AvailableDevices <em>Available Devices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Available Devices</em>'.
     * @see context.instance.tmp.AvailableDevices
     * @generated
     */
    EClass getAvailableDevices();

    /**
     * Returns the meta object for class '{@link context.instance.tmp.FormalRelationContext <em>Formal Relation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formal Relation Context</em>'.
     * @see context.instance.tmp.FormalRelationContext
     * @generated
     */
    EClass getFormalRelationContext();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TmpFactory getTmpFactory();

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
         * The meta object literal for the '{@link context.instance.tmp.impl.TemperatureMeasurementImpl <em>Temperature Measurement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.TemperatureMeasurementImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getTemperatureMeasurement()
         * @generated
         */
        EClass TEMPERATURE_MEASUREMENT = eINSTANCE.getTemperatureMeasurement();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPERATURE_MEASUREMENT__VALUE = eINSTANCE.getTemperatureMeasurement_Value();

        /**
         * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPERATURE_MEASUREMENT__SCALE = eINSTANCE.getTemperatureMeasurement_Scale();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.NearbyMeasurementImpl <em>Nearby Measurement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.NearbyMeasurementImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getNearbyMeasurement()
         * @generated
         */
        EClass NEARBY_MEASUREMENT = eINSTANCE.getNearbyMeasurement();

        /**
         * The meta object literal for the '<em><b>Entity A</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NEARBY_MEASUREMENT__ENTITY_A = eINSTANCE.getNearbyMeasurement_EntityA();

        /**
         * The meta object literal for the '<em><b>Entity B</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NEARBY_MEASUREMENT__ENTITY_B = eINSTANCE.getNearbyMeasurement_EntityB();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.EventPrecisionImpl <em>Event Precision</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.EventPrecisionImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getEventPrecision()
         * @generated
         */
        EClass EVENT_PRECISION = eINSTANCE.getEventPrecision();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.MaterialRelationContextImpl <em>Material Relation Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.MaterialRelationContextImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getMaterialRelationContext()
         * @generated
         */
        EClass MATERIAL_RELATION_CONTEXT = eINSTANCE.getMaterialRelationContext();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.IntrinsicSituationsImpl <em>Intrinsic Situations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.IntrinsicSituationsImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getIntrinsicSituations()
         * @generated
         */
        EClass INTRINSIC_SITUATIONS = eINSTANCE.getIntrinsicSituations();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.RelationalSituationImpl <em>Relational Situation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.RelationalSituationImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getRelationalSituation()
         * @generated
         */
        EClass RELATIONAL_SITUATION = eINSTANCE.getRelationalSituation();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.FriendshipImpl <em>Friendship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.FriendshipImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getFriendship()
         * @generated
         */
        EClass FRIENDSHIP = eINSTANCE.getFriendship();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.FormalRelationSituationImpl <em>Formal Relation Situation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.FormalRelationSituationImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getFormalRelationSituation()
         * @generated
         */
        EClass FORMAL_RELATION_SITUATION = eINSTANCE.getFormalRelationSituation();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.SituationOfSituationsImpl <em>Situation Of Situations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.SituationOfSituationsImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getSituationOfSituations()
         * @generated
         */
        EClass SITUATION_OF_SITUATIONS = eINSTANCE.getSituationOfSituations();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.RecurrentFeverImpl <em>Recurrent Fever</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.RecurrentFeverImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getRecurrentFever()
         * @generated
         */
        EClass RECURRENT_FEVER = eINSTANCE.getRecurrentFever();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.CombinedSituationImpl <em>Combined Situation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.CombinedSituationImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getCombinedSituation()
         * @generated
         */
        EClass COMBINED_SITUATION = eINSTANCE.getCombinedSituation();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.IntrinsicContextImpl <em>Intrinsic Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.IntrinsicContextImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getIntrinsicContext()
         * @generated
         */
        EClass INTRINSIC_CONTEXT = eINSTANCE.getIntrinsicContext();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.FeverImpl <em>Fever</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.FeverImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getFever()
         * @generated
         */
        EClass FEVER = eINSTANCE.getFever();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.AvailableDevicesImpl <em>Available Devices</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.AvailableDevicesImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getAvailableDevices()
         * @generated
         */
        EClass AVAILABLE_DEVICES = eINSTANCE.getAvailableDevices();

        /**
         * The meta object literal for the '{@link context.instance.tmp.impl.FormalRelationContextImpl <em>Formal Relation Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.tmp.impl.FormalRelationContextImpl
         * @see context.instance.tmp.impl.TmpPackageImpl#getFormalRelationContext()
         * @generated
         */
        EClass FORMAL_RELATION_CONTEXT = eINSTANCE.getFormalRelationContext();

    }

} //TmpPackage
