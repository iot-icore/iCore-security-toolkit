/**
 */
package structure.event;

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
 * @see structure.event.EventFactory
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
    String eNS_URI = "http://structure/event/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-event";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventPackage eINSTANCE = structure.event.impl.EventPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.event.impl.EntityEventImpl <em>Entity Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.event.impl.EntityEventImpl
     * @see structure.event.impl.EventPackageImpl#getEntityEvent()
     * @generated
     */
    int ENTITY_EVENT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__VISUAL_ELEMENTS = rule.event.EventPackage.EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__ID = rule.event.EventPackage.EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__SUBSCRIBED_EVENT_PATTERNS = rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__TIMESTAMP = rule.event.EventPackage.EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__WINDOWS = rule.event.EventPackage.EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__AUTHORIZATION = rule.event.EventPackage.EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__MODALITY = rule.event.EventPackage.EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__LIFECYCLE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT__ENTITY = rule.event.EventPackage.EVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Entity Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_FEATURE_COUNT = rule.event.EventPackage.EVENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Entity Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_OPERATION_COUNT = rule.event.EventPackage.EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.event.impl.EntityEventPatternImpl <em>Entity Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.event.impl.EntityEventPatternImpl
     * @see structure.event.impl.EventPackageImpl#getEntityEventPattern()
     * @generated
     */
    int ENTITY_EVENT_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Entity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__ENTITY_PATTERN = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN__LIFECYCLE = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Entity Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Entity Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.event.EntityLifecycle <em>Entity Lifecycle</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.event.EntityLifecycle
     * @see structure.event.impl.EventPackageImpl#getEntityLifecycle()
     * @generated
     */
    int ENTITY_LIFECYCLE = 2;


    /**
     * Returns the meta object for class '{@link structure.event.EntityEvent <em>Entity Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Event</em>'.
     * @see structure.event.EntityEvent
     * @generated
     */
    EClass getEntityEvent();

    /**
     * Returns the meta object for the attribute '{@link structure.event.EntityEvent#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see structure.event.EntityEvent#getLifecycle()
     * @see #getEntityEvent()
     * @generated
     */
    EAttribute getEntityEvent_Lifecycle();

    /**
     * Returns the meta object for the containment reference '{@link structure.event.EntityEvent#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity</em>'.
     * @see structure.event.EntityEvent#getEntity()
     * @see #getEntityEvent()
     * @generated
     */
    EReference getEntityEvent_Entity();

    /**
     * Returns the meta object for class '{@link structure.event.EntityEventPattern <em>Entity Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Event Pattern</em>'.
     * @see structure.event.EntityEventPattern
     * @generated
     */
    EClass getEntityEventPattern();

    /**
     * Returns the meta object for the containment reference '{@link structure.event.EntityEventPattern#getEntityPattern <em>Entity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity Pattern</em>'.
     * @see structure.event.EntityEventPattern#getEntityPattern()
     * @see #getEntityEventPattern()
     * @generated
     */
    EReference getEntityEventPattern_EntityPattern();

    /**
     * Returns the meta object for the attribute '{@link structure.event.EntityEventPattern#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see structure.event.EntityEventPattern#getLifecycle()
     * @see #getEntityEventPattern()
     * @generated
     */
    EAttribute getEntityEventPattern_Lifecycle();

    /**
     * Returns the meta object for enum '{@link structure.event.EntityLifecycle <em>Entity Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Entity Lifecycle</em>'.
     * @see structure.event.EntityLifecycle
     * @generated
     */
    EEnum getEntityLifecycle();

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
         * The meta object literal for the '{@link structure.event.impl.EntityEventImpl <em>Entity Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.event.impl.EntityEventImpl
         * @see structure.event.impl.EventPackageImpl#getEntityEvent()
         * @generated
         */
        EClass ENTITY_EVENT = eINSTANCE.getEntityEvent();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_EVENT__LIFECYCLE = eINSTANCE.getEntityEvent_Lifecycle();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_EVENT__ENTITY = eINSTANCE.getEntityEvent_Entity();

        /**
         * The meta object literal for the '{@link structure.event.impl.EntityEventPatternImpl <em>Entity Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.event.impl.EntityEventPatternImpl
         * @see structure.event.impl.EventPackageImpl#getEntityEventPattern()
         * @generated
         */
        EClass ENTITY_EVENT_PATTERN = eINSTANCE.getEntityEventPattern();

        /**
         * The meta object literal for the '<em><b>Entity Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_EVENT_PATTERN__ENTITY_PATTERN = eINSTANCE.getEntityEventPattern_EntityPattern();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_EVENT_PATTERN__LIFECYCLE = eINSTANCE.getEntityEventPattern_Lifecycle();

        /**
         * The meta object literal for the '{@link structure.event.EntityLifecycle <em>Entity Lifecycle</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.event.EntityLifecycle
         * @see structure.event.impl.EventPackageImpl#getEntityLifecycle()
         * @generated
         */
        EEnum ENTITY_LIFECYCLE = eINSTANCE.getEntityLifecycle();

    }

} //EventPackage
