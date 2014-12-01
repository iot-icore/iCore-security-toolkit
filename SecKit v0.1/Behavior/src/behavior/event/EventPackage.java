/**
 */
package behavior.event;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see behavior.event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "event";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/event/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-event";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventPackage eINSTANCE = behavior.event.impl.EventPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.event.impl.ActivityEventPatternImpl <em>Activity Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.ActivityEventPatternImpl
     * @see behavior.event.impl.EventPackageImpl#getActivityEventPattern()
     * @generated
     */
    int ACTIVITY_EVENT_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Activity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN__LIFECYCLE = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Activity Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Activity Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.AbstractBehaviorEventImpl <em>Abstract Behavior Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.AbstractBehaviorEventImpl
     * @see behavior.event.impl.EventPackageImpl#getAbstractBehaviorEvent()
     * @generated
     */
    int ABSTRACT_BEHAVIOR_EVENT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__VISUAL_ELEMENTS = rule.event.EventPackage.EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__ID = rule.event.EventPackage.EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__SUBSCRIBED_EVENT_PATTERNS = rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__TIMESTAMP = rule.event.EventPackage.EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__WINDOWS = rule.event.EventPackage.EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__AUTHORIZATION = rule.event.EventPackage.EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__MODALITY = rule.event.EventPackage.EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR = rule.event.EventPackage.EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT__ENTITY = rule.event.EventPackage.EVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Behavior Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT = rule.event.EventPackage.EVENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Abstract Behavior Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_BEHAVIOR_EVENT_OPERATION_COUNT = rule.event.EventPackage.EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.BehaviorEventImpl <em>Behavior Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.BehaviorEventImpl
     * @see behavior.event.impl.EventPackageImpl#getBehaviorEvent()
     * @generated
     */
    int BEHAVIOR_EVENT = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__VISUAL_ELEMENTS = ABSTRACT_BEHAVIOR_EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__ID = ABSTRACT_BEHAVIOR_EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__SUBSCRIBED_EVENT_PATTERNS = ABSTRACT_BEHAVIOR_EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__TIMESTAMP = ABSTRACT_BEHAVIOR_EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__WINDOWS = ABSTRACT_BEHAVIOR_EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__AUTHORIZATION = ABSTRACT_BEHAVIOR_EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__MODALITY = ABSTRACT_BEHAVIOR_EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__BEHAVIOR = ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__ENTITY = ABSTRACT_BEHAVIOR_EVENT__ENTITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT__LIFECYCLE = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Behavior Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_FEATURE_COUNT = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Behavior Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_OPERATION_COUNT = ABSTRACT_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.ActivityEventImpl <em>Activity Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.ActivityEventImpl
     * @see behavior.event.impl.EventPackageImpl#getActivityEvent()
     * @generated
     */
    int ACTIVITY_EVENT = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__VISUAL_ELEMENTS = ABSTRACT_BEHAVIOR_EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__ID = ABSTRACT_BEHAVIOR_EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__SUBSCRIBED_EVENT_PATTERNS = ABSTRACT_BEHAVIOR_EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__TIMESTAMP = ABSTRACT_BEHAVIOR_EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__WINDOWS = ABSTRACT_BEHAVIOR_EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__AUTHORIZATION = ABSTRACT_BEHAVIOR_EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__MODALITY = ABSTRACT_BEHAVIOR_EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__BEHAVIOR = ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__ENTITY = ABSTRACT_BEHAVIOR_EVENT__ENTITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__LIFECYCLE = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT__IDENTITIES = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Activity Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_FEATURE_COUNT = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Activity Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_EVENT_OPERATION_COUNT = ABSTRACT_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.ActionEventImpl <em>Action Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.ActionEventImpl
     * @see behavior.event.impl.EventPackageImpl#getActionEvent()
     * @generated
     */
    int ACTION_EVENT = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__VISUAL_ELEMENTS = ACTIVITY_EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__ID = ACTIVITY_EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__SUBSCRIBED_EVENT_PATTERNS = ACTIVITY_EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__TIMESTAMP = ACTIVITY_EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__WINDOWS = ACTIVITY_EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__AUTHORIZATION = ACTIVITY_EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__MODALITY = ACTIVITY_EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__BEHAVIOR = ACTIVITY_EVENT__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__ENTITY = ACTIVITY_EVENT__ENTITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__LIFECYCLE = ACTIVITY_EVENT__LIFECYCLE;

    /**
     * The feature id for the '<em><b>Identities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__IDENTITIES = ACTIVITY_EVENT__IDENTITIES;

    /**
     * The feature id for the '<em><b>Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT__ACTION = ACTIVITY_EVENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT_FEATURE_COUNT = ACTIVITY_EVENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_EVENT_OPERATION_COUNT = ACTIVITY_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.InteractionEventImpl <em>Interaction Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.InteractionEventImpl
     * @see behavior.event.impl.EventPackageImpl#getInteractionEvent()
     * @generated
     */
    int INTERACTION_EVENT = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__VISUAL_ELEMENTS = ACTIVITY_EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__ID = ACTIVITY_EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__SUBSCRIBED_EVENT_PATTERNS = ACTIVITY_EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__TIMESTAMP = ACTIVITY_EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__WINDOWS = ACTIVITY_EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__AUTHORIZATION = ACTIVITY_EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__MODALITY = ACTIVITY_EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__BEHAVIOR = ACTIVITY_EVENT__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__ENTITY = ACTIVITY_EVENT__ENTITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__LIFECYCLE = ACTIVITY_EVENT__LIFECYCLE;

    /**
     * The feature id for the '<em><b>Identities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__IDENTITIES = ACTIVITY_EVENT__IDENTITIES;

    /**
     * The feature id for the '<em><b>Interaction</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT__INTERACTION = ACTIVITY_EVENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interaction Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT_FEATURE_COUNT = ACTIVITY_EVENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interaction Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_EVENT_OPERATION_COUNT = ACTIVITY_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.FlowPointEventImpl <em>Flow Point Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.FlowPointEventImpl
     * @see behavior.event.impl.EventPackageImpl#getFlowPointEvent()
     * @generated
     */
    int FLOW_POINT_EVENT = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__VISUAL_ELEMENTS = ABSTRACT_BEHAVIOR_EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__ID = ABSTRACT_BEHAVIOR_EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__SUBSCRIBED_EVENT_PATTERNS = ABSTRACT_BEHAVIOR_EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__TIMESTAMP = ABSTRACT_BEHAVIOR_EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__WINDOWS = ABSTRACT_BEHAVIOR_EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__AUTHORIZATION = ABSTRACT_BEHAVIOR_EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__MODALITY = ABSTRACT_BEHAVIOR_EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__BEHAVIOR = ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT__ENTITY = ABSTRACT_BEHAVIOR_EVENT__ENTITY;

    /**
     * The number of structural features of the '<em>Flow Point Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_FEATURE_COUNT = ABSTRACT_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_OPERATION_COUNT = ABSTRACT_BEHAVIOR_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.BehaviorEventPatternImpl <em>Behavior Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.BehaviorEventPatternImpl
     * @see behavior.event.impl.EventPackageImpl#getBehaviorEventPattern()
     * @generated
     */
    int BEHAVIOR_EVENT_PATTERN = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN__LIFECYCLE = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Behavior Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Behavior Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.impl.FlowPointEventPatternImpl <em>Flow Point Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.impl.FlowPointEventPatternImpl
     * @see behavior.event.impl.EventPackageImpl#getFlowPointEventPattern()
     * @generated
     */
    int FLOW_POINT_EVENT_PATTERN = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The number of structural features of the '<em>Flow Point Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Flow Point Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.event.BehaviorLifecycle <em>Behavior Lifecycle</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.BehaviorLifecycle
     * @see behavior.event.impl.EventPackageImpl#getBehaviorLifecycle()
     * @generated
     */
    int BEHAVIOR_LIFECYCLE = 9;

    /**
     * The meta object id for the '{@link behavior.event.ActivityLifecycle <em>Activity Lifecycle</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.event.ActivityLifecycle
     * @see behavior.event.impl.EventPackageImpl#getActivityLifecycle()
     * @generated
     */
    int ACTIVITY_LIFECYCLE = 10;


    /**
     * Returns the meta object for class '{@link behavior.event.ActivityEventPattern <em>Activity Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Event Pattern</em>'.
     * @see behavior.event.ActivityEventPattern
     * @generated
     */
    EClass getActivityEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link behavior.event.ActivityEventPattern#getActivityPattern <em>Activity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity Pattern</em>'.
     * @see behavior.event.ActivityEventPattern#getActivityPattern()
     * @see #getActivityEventPattern()
     * @generated
     */
    EReference getActivityEventPattern_ActivityPattern();

    /**
     * Returns the meta object for the attribute '{@link behavior.event.ActivityEventPattern#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see behavior.event.ActivityEventPattern#getLifecycle()
     * @see #getActivityEventPattern()
     * @generated
     */
    EAttribute getActivityEventPattern_Lifecycle();

    /**
     * Returns the meta object for class '{@link behavior.event.BehaviorEvent <em>Behavior Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Event</em>'.
     * @see behavior.event.BehaviorEvent
     * @generated
     */
    EClass getBehaviorEvent();

    /**
     * Returns the meta object for the attribute '{@link behavior.event.BehaviorEvent#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see behavior.event.BehaviorEvent#getLifecycle()
     * @see #getBehaviorEvent()
     * @generated
     */
    EAttribute getBehaviorEvent_Lifecycle();

    /**
     * Returns the meta object for class '{@link behavior.event.AbstractBehaviorEvent <em>Abstract Behavior Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Behavior Event</em>'.
     * @see behavior.event.AbstractBehaviorEvent
     * @generated
     */
    EClass getAbstractBehaviorEvent();

    /**
     * Returns the meta object for the reference '{@link behavior.event.AbstractBehaviorEvent#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Behavior</em>'.
     * @see behavior.event.AbstractBehaviorEvent#getBehavior()
     * @see #getAbstractBehaviorEvent()
     * @generated
     */
    EReference getAbstractBehaviorEvent_Behavior();

    /**
     * Returns the meta object for the containment reference '{@link behavior.event.AbstractBehaviorEvent#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity</em>'.
     * @see behavior.event.AbstractBehaviorEvent#getEntity()
     * @see #getAbstractBehaviorEvent()
     * @generated
     */
    EReference getAbstractBehaviorEvent_Entity();

    /**
     * Returns the meta object for class '{@link behavior.event.ActionEvent <em>Action Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Event</em>'.
     * @see behavior.event.ActionEvent
     * @generated
     */
    EClass getActionEvent();

    /**
     * Returns the meta object for the reference '{@link behavior.event.ActionEvent#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Action</em>'.
     * @see behavior.event.ActionEvent#getAction()
     * @see #getActionEvent()
     * @generated
     */
    EReference getActionEvent_Action();

    /**
     * Returns the meta object for class '{@link behavior.event.InteractionEvent <em>Interaction Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Event</em>'.
     * @see behavior.event.InteractionEvent
     * @generated
     */
    EClass getInteractionEvent();

    /**
     * Returns the meta object for the reference '{@link behavior.event.InteractionEvent#getInteraction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interaction</em>'.
     * @see behavior.event.InteractionEvent#getInteraction()
     * @see #getInteractionEvent()
     * @generated
     */
    EReference getInteractionEvent_Interaction();

    /**
     * Returns the meta object for class '{@link behavior.event.FlowPointEvent <em>Flow Point Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Event</em>'.
     * @see behavior.event.FlowPointEvent
     * @generated
     */
    EClass getFlowPointEvent();

    /**
     * Returns the meta object for class '{@link behavior.event.ActivityEvent <em>Activity Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Event</em>'.
     * @see behavior.event.ActivityEvent
     * @generated
     */
    EClass getActivityEvent();

    /**
     * Returns the meta object for the attribute '{@link behavior.event.ActivityEvent#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see behavior.event.ActivityEvent#getLifecycle()
     * @see #getActivityEvent()
     * @generated
     */
    EAttribute getActivityEvent_Lifecycle();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.event.ActivityEvent#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identities</em>'.
     * @see behavior.event.ActivityEvent#getIdentities()
     * @see #getActivityEvent()
     * @generated
     */
    EReference getActivityEvent_Identities();

    /**
     * Returns the meta object for class '{@link behavior.event.BehaviorEventPattern <em>Behavior Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Event Pattern</em>'.
     * @see behavior.event.BehaviorEventPattern
     * @generated
     */
    EClass getBehaviorEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link behavior.event.BehaviorEventPattern#getBehaviorPattern <em>Behavior Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Behavior Pattern</em>'.
     * @see behavior.event.BehaviorEventPattern#getBehaviorPattern()
     * @see #getBehaviorEventPattern()
     * @generated
     */
    EReference getBehaviorEventPattern_BehaviorPattern();

    /**
     * Returns the meta object for the attribute '{@link behavior.event.BehaviorEventPattern#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see behavior.event.BehaviorEventPattern#getLifecycle()
     * @see #getBehaviorEventPattern()
     * @generated
     */
    EAttribute getBehaviorEventPattern_Lifecycle();

    /**
     * Returns the meta object for class '{@link behavior.event.FlowPointEventPattern <em>Flow Point Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point Event Pattern</em>'.
     * @see behavior.event.FlowPointEventPattern
     * @generated
     */
    EClass getFlowPointEventPattern();

    /**
     * Returns the meta object for enum '{@link behavior.event.BehaviorLifecycle <em>Behavior Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Behavior Lifecycle</em>'.
     * @see behavior.event.BehaviorLifecycle
     * @generated
     */
    EEnum getBehaviorLifecycle();

    /**
     * Returns the meta object for enum '{@link behavior.event.ActivityLifecycle <em>Activity Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Activity Lifecycle</em>'.
     * @see behavior.event.ActivityLifecycle
     * @generated
     */
    EEnum getActivityLifecycle();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EventFactory getEventFactory();

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
         * The meta object literal for the '{@link behavior.event.impl.ActivityEventPatternImpl <em>Activity Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.ActivityEventPatternImpl
         * @see behavior.event.impl.EventPackageImpl#getActivityEventPattern()
         * @generated
         */
        EClass ACTIVITY_EVENT_PATTERN = eINSTANCE.getActivityEventPattern();

        /**
         * The meta object literal for the '<em><b>Activity Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_EVENT_PATTERN__ACTIVITY_PATTERN = eINSTANCE.getActivityEventPattern_ActivityPattern();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_EVENT_PATTERN__LIFECYCLE = eINSTANCE.getActivityEventPattern_Lifecycle();

        /**
         * The meta object literal for the '{@link behavior.event.impl.BehaviorEventImpl <em>Behavior Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.BehaviorEventImpl
         * @see behavior.event.impl.EventPackageImpl#getBehaviorEvent()
         * @generated
         */
        EClass BEHAVIOR_EVENT = eINSTANCE.getBehaviorEvent();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_EVENT__LIFECYCLE = eINSTANCE.getBehaviorEvent_Lifecycle();

        /**
         * The meta object literal for the '{@link behavior.event.impl.AbstractBehaviorEventImpl <em>Abstract Behavior Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.AbstractBehaviorEventImpl
         * @see behavior.event.impl.EventPackageImpl#getAbstractBehaviorEvent()
         * @generated
         */
        EClass ABSTRACT_BEHAVIOR_EVENT = eINSTANCE.getAbstractBehaviorEvent();

        /**
         * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_EVENT__BEHAVIOR = eINSTANCE.getAbstractBehaviorEvent_Behavior();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_BEHAVIOR_EVENT__ENTITY = eINSTANCE.getAbstractBehaviorEvent_Entity();

        /**
         * The meta object literal for the '{@link behavior.event.impl.ActionEventImpl <em>Action Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.ActionEventImpl
         * @see behavior.event.impl.EventPackageImpl#getActionEvent()
         * @generated
         */
        EClass ACTION_EVENT = eINSTANCE.getActionEvent();

        /**
         * The meta object literal for the '<em><b>Action</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_EVENT__ACTION = eINSTANCE.getActionEvent_Action();

        /**
         * The meta object literal for the '{@link behavior.event.impl.InteractionEventImpl <em>Interaction Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.InteractionEventImpl
         * @see behavior.event.impl.EventPackageImpl#getInteractionEvent()
         * @generated
         */
        EClass INTERACTION_EVENT = eINSTANCE.getInteractionEvent();

        /**
         * The meta object literal for the '<em><b>Interaction</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_EVENT__INTERACTION = eINSTANCE.getInteractionEvent_Interaction();

        /**
         * The meta object literal for the '{@link behavior.event.impl.FlowPointEventImpl <em>Flow Point Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.FlowPointEventImpl
         * @see behavior.event.impl.EventPackageImpl#getFlowPointEvent()
         * @generated
         */
        EClass FLOW_POINT_EVENT = eINSTANCE.getFlowPointEvent();

        /**
         * The meta object literal for the '{@link behavior.event.impl.ActivityEventImpl <em>Activity Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.ActivityEventImpl
         * @see behavior.event.impl.EventPackageImpl#getActivityEvent()
         * @generated
         */
        EClass ACTIVITY_EVENT = eINSTANCE.getActivityEvent();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_EVENT__LIFECYCLE = eINSTANCE.getActivityEvent_Lifecycle();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_EVENT__IDENTITIES = eINSTANCE.getActivityEvent_Identities();

        /**
         * The meta object literal for the '{@link behavior.event.impl.BehaviorEventPatternImpl <em>Behavior Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.BehaviorEventPatternImpl
         * @see behavior.event.impl.EventPackageImpl#getBehaviorEventPattern()
         * @generated
         */
        EClass BEHAVIOR_EVENT_PATTERN = eINSTANCE.getBehaviorEventPattern();

        /**
         * The meta object literal for the '<em><b>Behavior Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_EVENT_PATTERN__BEHAVIOR_PATTERN = eINSTANCE.getBehaviorEventPattern_BehaviorPattern();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_EVENT_PATTERN__LIFECYCLE = eINSTANCE.getBehaviorEventPattern_Lifecycle();

        /**
         * The meta object literal for the '{@link behavior.event.impl.FlowPointEventPatternImpl <em>Flow Point Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.impl.FlowPointEventPatternImpl
         * @see behavior.event.impl.EventPackageImpl#getFlowPointEventPattern()
         * @generated
         */
        EClass FLOW_POINT_EVENT_PATTERN = eINSTANCE.getFlowPointEventPattern();

        /**
         * The meta object literal for the '{@link behavior.event.BehaviorLifecycle <em>Behavior Lifecycle</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.BehaviorLifecycle
         * @see behavior.event.impl.EventPackageImpl#getBehaviorLifecycle()
         * @generated
         */
        EEnum BEHAVIOR_LIFECYCLE = eINSTANCE.getBehaviorLifecycle();

        /**
         * The meta object literal for the '{@link behavior.event.ActivityLifecycle <em>Activity Lifecycle</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.event.ActivityLifecycle
         * @see behavior.event.impl.EventPackageImpl#getActivityLifecycle()
         * @generated
         */
        EEnum ACTIVITY_LIFECYCLE = eINSTANCE.getActivityLifecycle();

    }

} //EventPackage
