/**
 */
package context.event;

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
 * @see context.event.EventFactory
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
    String eNS_URI = "http://context/event/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-event";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventPackage eINSTANCE = context.event.impl.EventPackageImpl.init();

    /**
     * The meta object id for the '{@link context.event.impl.ContextSituationEventImpl <em>Context Situation Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.event.impl.ContextSituationEventImpl
     * @see context.event.impl.EventPackageImpl#getContextSituationEvent()
     * @generated
     */
    int CONTEXT_SITUATION_EVENT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__VISUAL_ELEMENTS = rule.event.EventPackage.EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__ID = rule.event.EventPackage.EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__SUBSCRIBED_EVENT_PATTERNS = rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__TIMESTAMP = rule.event.EventPackage.EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__WINDOWS = rule.event.EventPackage.EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__AUTHORIZATION = rule.event.EventPackage.EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__MODALITY = rule.event.EventPackage.EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__LIFECYCLE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Situation Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT__SITUATION_VALUE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Context Situation Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_FEATURE_COUNT = rule.event.EventPackage.EVENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Context Situation Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_OPERATION_COUNT = rule.event.EventPackage.EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.event.impl.ContextInformationEventImpl <em>Context Information Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.event.impl.ContextInformationEventImpl
     * @see context.event.impl.EventPackageImpl#getContextInformationEvent()
     * @generated
     */
    int CONTEXT_INFORMATION_EVENT = 1;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__ETYPE = data.event.EventPackage.DATA_EVENT__ETYPE;

    /**
     * The feature id for the '<em><b>Data Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__DATA_INSTANCE = data.event.EventPackage.DATA_EVENT__DATA_INSTANCE;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__LIFECYCLE = data.event.EventPackage.DATA_EVENT__LIFECYCLE;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__ID = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__TIMESTAMP = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__WINDOWS = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__AUTHORIZATION = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT__MODALITY = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Context Information Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_FEATURE_COUNT = data.event.EventPackage.DATA_EVENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Context Information Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_OPERATION_COUNT = data.event.EventPackage.DATA_EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.event.impl.ContextSituationEventPatternImpl <em>Context Situation Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.event.impl.ContextSituationEventPatternImpl
     * @see context.event.impl.EventPackageImpl#getContextSituationEventPattern()
     * @generated
     */
    int CONTEXT_SITUATION_EVENT_PATTERN = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Context Situation Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Context Situation Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Context Situation Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.event.impl.ContextInformationEventPatternImpl <em>Context Information Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.event.impl.ContextInformationEventPatternImpl
     * @see context.event.impl.EventPackageImpl#getContextInformationEventPattern()
     * @generated
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN = 3;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__LIFECYCLE = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE;

    /**
     * The feature id for the '<em><b>Data Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__DATA_PATTERN = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__ID = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Context Information Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Context Information Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN_FEATURE_COUNT = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Context Information Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_EVENT_PATTERN_OPERATION_COUNT = data.event.EventPackage.ABSTRACT_DATA_EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.event.ContextSituationLifecycle <em>Context Situation Lifecycle</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.event.ContextSituationLifecycle
     * @see context.event.impl.EventPackageImpl#getContextSituationLifecycle()
     * @generated
     */
    int CONTEXT_SITUATION_LIFECYCLE = 4;


    /**
     * Returns the meta object for class '{@link context.event.ContextSituationEvent <em>Context Situation Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation Event</em>'.
     * @see context.event.ContextSituationEvent
     * @generated
     */
    EClass getContextSituationEvent();

    /**
     * Returns the meta object for the attribute '{@link context.event.ContextSituationEvent#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see context.event.ContextSituationEvent#getLifecycle()
     * @see #getContextSituationEvent()
     * @generated
     */
    EAttribute getContextSituationEvent_Lifecycle();

    /**
     * Returns the meta object for the containment reference '{@link context.event.ContextSituationEvent#getSituationValue <em>Situation Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Situation Value</em>'.
     * @see context.event.ContextSituationEvent#getSituationValue()
     * @see #getContextSituationEvent()
     * @generated
     */
    EReference getContextSituationEvent_SituationValue();

    /**
     * Returns the meta object for class '{@link context.event.ContextInformationEvent <em>Context Information Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Information Event</em>'.
     * @see context.event.ContextInformationEvent
     * @generated
     */
    EClass getContextInformationEvent();

    /**
     * Returns the meta object for class '{@link context.event.ContextSituationEventPattern <em>Context Situation Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation Event Pattern</em>'.
     * @see context.event.ContextSituationEventPattern
     * @generated
     */
    EClass getContextSituationEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link context.event.ContextSituationEventPattern#getContextSituationPattern <em>Context Situation Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Situation Pattern</em>'.
     * @see context.event.ContextSituationEventPattern#getContextSituationPattern()
     * @see #getContextSituationEventPattern()
     * @generated
     */
    EReference getContextSituationEventPattern_ContextSituationPattern();

    /**
     * Returns the meta object for the attribute '{@link context.event.ContextSituationEventPattern#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see context.event.ContextSituationEventPattern#getLifecycle()
     * @see #getContextSituationEventPattern()
     * @generated
     */
    EAttribute getContextSituationEventPattern_Lifecycle();

    /**
     * Returns the meta object for class '{@link context.event.ContextInformationEventPattern <em>Context Information Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Information Event Pattern</em>'.
     * @see context.event.ContextInformationEventPattern
     * @generated
     */
    EClass getContextInformationEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link context.event.ContextInformationEventPattern#getContextInformationPattern <em>Context Information Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Information Pattern</em>'.
     * @see context.event.ContextInformationEventPattern#getContextInformationPattern()
     * @see #getContextInformationEventPattern()
     * @generated
     */
    EReference getContextInformationEventPattern_ContextInformationPattern();

    /**
     * Returns the meta object for enum '{@link context.event.ContextSituationLifecycle <em>Context Situation Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Context Situation Lifecycle</em>'.
     * @see context.event.ContextSituationLifecycle
     * @generated
     */
    EEnum getContextSituationLifecycle();

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
         * The meta object literal for the '{@link context.event.impl.ContextSituationEventImpl <em>Context Situation Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.event.impl.ContextSituationEventImpl
         * @see context.event.impl.EventPackageImpl#getContextSituationEvent()
         * @generated
         */
        EClass CONTEXT_SITUATION_EVENT = eINSTANCE.getContextSituationEvent();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_SITUATION_EVENT__LIFECYCLE = eINSTANCE.getContextSituationEvent_Lifecycle();

        /**
         * The meta object literal for the '<em><b>Situation Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_EVENT__SITUATION_VALUE = eINSTANCE.getContextSituationEvent_SituationValue();

        /**
         * The meta object literal for the '{@link context.event.impl.ContextInformationEventImpl <em>Context Information Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.event.impl.ContextInformationEventImpl
         * @see context.event.impl.EventPackageImpl#getContextInformationEvent()
         * @generated
         */
        EClass CONTEXT_INFORMATION_EVENT = eINSTANCE.getContextInformationEvent();

        /**
         * The meta object literal for the '{@link context.event.impl.ContextSituationEventPatternImpl <em>Context Situation Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.event.impl.ContextSituationEventPatternImpl
         * @see context.event.impl.EventPackageImpl#getContextSituationEventPattern()
         * @generated
         */
        EClass CONTEXT_SITUATION_EVENT_PATTERN = eINSTANCE.getContextSituationEventPattern();

        /**
         * The meta object literal for the '<em><b>Context Situation Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_EVENT_PATTERN__CONTEXT_SITUATION_PATTERN = eINSTANCE.getContextSituationEventPattern_ContextSituationPattern();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_SITUATION_EVENT_PATTERN__LIFECYCLE = eINSTANCE.getContextSituationEventPattern_Lifecycle();

        /**
         * The meta object literal for the '{@link context.event.impl.ContextInformationEventPatternImpl <em>Context Information Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.event.impl.ContextInformationEventPatternImpl
         * @see context.event.impl.EventPackageImpl#getContextInformationEventPattern()
         * @generated
         */
        EClass CONTEXT_INFORMATION_EVENT_PATTERN = eINSTANCE.getContextInformationEventPattern();

        /**
         * The meta object literal for the '<em><b>Context Information Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN = eINSTANCE.getContextInformationEventPattern_ContextInformationPattern();

        /**
         * The meta object literal for the '{@link context.event.ContextSituationLifecycle <em>Context Situation Lifecycle</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.event.ContextSituationLifecycle
         * @see context.event.impl.EventPackageImpl#getContextSituationLifecycle()
         * @generated
         */
        EEnum CONTEXT_SITUATION_LIFECYCLE = eINSTANCE.getContextSituationLifecycle();

    }

} //EventPackage
