/**
 */
package data.event;

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
 * @see data.event.EventFactory
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
    String eNS_URI = "http://data/event/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-event";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventPackage eINSTANCE = data.event.impl.EventPackageImpl.init();

    /**
     * The meta object id for the '{@link data.event.impl.DataEventImpl <em>Data Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.event.impl.DataEventImpl
     * @see data.event.impl.EventPackageImpl#getDataEvent()
     * @generated
     */
    int DATA_EVENT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__VISUAL_ELEMENTS = rule.event.EventPackage.EVENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__ID = rule.event.EventPackage.EVENT__ID;

    /**
     * The feature id for the '<em><b>Subscribed Event Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__SUBSCRIBED_EVENT_PATTERNS = rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__TIMESTAMP = rule.event.EventPackage.EVENT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Windows</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__WINDOWS = rule.event.EventPackage.EVENT__WINDOWS;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__AUTHORIZATION = rule.event.EventPackage.EVENT__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__MODALITY = rule.event.EventPackage.EVENT__MODALITY;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__ETYPE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__DATA_INSTANCE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT__LIFECYCLE = rule.event.EventPackage.EVENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_FEATURE_COUNT = rule.event.EventPackage.EVENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Data Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_OPERATION_COUNT = rule.event.EventPackage.EVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.event.impl.AbstractDataEventPatternImpl <em>Abstract Data Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.event.impl.AbstractDataEventPatternImpl
     * @see data.event.impl.EventPackageImpl#getAbstractDataEventPattern()
     * @generated
     */
    int ABSTRACT_DATA_EVENT_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__VISUAL_ELEMENTS = ConditionPackage.EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__ID = ConditionPackage.EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__OPERATOR = ConditionPackage.EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__TEMPLATE = ConditionPackage.EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__MODALITY = ConditionPackage.EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Data Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT = ConditionPackage.EVENT_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Abstract Data Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_EVENT_PATTERN_OPERATION_COUNT = ConditionPackage.EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.event.impl.DataEventPatternImpl <em>Data Event Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.event.impl.DataEventPatternImpl
     * @see data.event.impl.EventPackageImpl#getDataEventPattern()
     * @generated
     */
    int DATA_EVENT_PATTERN = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__VISUAL_ELEMENTS = ABSTRACT_DATA_EVENT_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__ID = ABSTRACT_DATA_EVENT_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__VARIABLE_ASSIGNMENTS = ABSTRACT_DATA_EVENT_PATTERN__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__OPERATOR = ABSTRACT_DATA_EVENT_PATTERN__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__TEMPLATE = ABSTRACT_DATA_EVENT_PATTERN__TEMPLATE;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__MODALITY = ABSTRACT_DATA_EVENT_PATTERN__MODALITY;

    /**
     * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__LIFECYCLE = ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE;

    /**
     * The feature id for the '<em><b>Data Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN__DATA_PATTERN = ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN;

    /**
     * The number of structural features of the '<em>Data Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN_FEATURE_COUNT = ABSTRACT_DATA_EVENT_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Event Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_EVENT_PATTERN_OPERATION_COUNT = ABSTRACT_DATA_EVENT_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.event.DataLifecycle <em>Data Lifecycle</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.event.DataLifecycle
     * @see data.event.impl.EventPackageImpl#getDataLifecycle()
     * @generated
     */
    int DATA_LIFECYCLE = 3;


    /**
     * Returns the meta object for class '{@link data.event.DataEvent <em>Data Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Event</em>'.
     * @see data.event.DataEvent
     * @generated
     */
    EClass getDataEvent();

    /**
     * Returns the meta object for the reference '{@link data.event.DataEvent#getEType <em>EType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EType</em>'.
     * @see data.event.DataEvent#getEType()
     * @see #getDataEvent()
     * @generated
     */
    EReference getDataEvent_EType();

    /**
     * Returns the meta object for the reference '{@link data.event.DataEvent#getDataInstance <em>Data Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Instance</em>'.
     * @see data.event.DataEvent#getDataInstance()
     * @see #getDataEvent()
     * @generated
     */
    EReference getDataEvent_DataInstance();

    /**
     * Returns the meta object for the attribute '{@link data.event.DataEvent#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see data.event.DataEvent#getLifecycle()
     * @see #getDataEvent()
     * @generated
     */
    EAttribute getDataEvent_Lifecycle();

    /**
     * Returns the meta object for class '{@link data.event.AbstractDataEventPattern <em>Abstract Data Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Event Pattern</em>'.
     * @see data.event.AbstractDataEventPattern
     * @generated
     */
    EClass getAbstractDataEventPattern();

    /**
     * Returns the meta object for the attribute '{@link data.event.AbstractDataEventPattern#getLifecycle <em>Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lifecycle</em>'.
     * @see data.event.AbstractDataEventPattern#getLifecycle()
     * @see #getAbstractDataEventPattern()
     * @generated
     */
    EAttribute getAbstractDataEventPattern_Lifecycle();

    /**
     * Returns the meta object for the containment reference '{@link data.event.AbstractDataEventPattern#getDataPattern <em>Data Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Pattern</em>'.
     * @see data.event.AbstractDataEventPattern#getDataPattern()
     * @see #getAbstractDataEventPattern()
     * @generated
     */
    EReference getAbstractDataEventPattern_DataPattern();

    /**
     * Returns the meta object for class '{@link data.event.DataEventPattern <em>Data Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Event Pattern</em>'.
     * @see data.event.DataEventPattern
     * @generated
     */
    EClass getDataEventPattern();

    /**
     * Returns the meta object for enum '{@link data.event.DataLifecycle <em>Data Lifecycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Data Lifecycle</em>'.
     * @see data.event.DataLifecycle
     * @generated
     */
    EEnum getDataLifecycle();

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
         * The meta object literal for the '{@link data.event.impl.DataEventImpl <em>Data Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.event.impl.DataEventImpl
         * @see data.event.impl.EventPackageImpl#getDataEvent()
         * @generated
         */
        EClass DATA_EVENT = eINSTANCE.getDataEvent();

        /**
         * The meta object literal for the '<em><b>EType</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_EVENT__ETYPE = eINSTANCE.getDataEvent_EType();

        /**
         * The meta object literal for the '<em><b>Data Instance</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_EVENT__DATA_INSTANCE = eINSTANCE.getDataEvent_DataInstance();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_EVENT__LIFECYCLE = eINSTANCE.getDataEvent_Lifecycle();

        /**
         * The meta object literal for the '{@link data.event.impl.AbstractDataEventPatternImpl <em>Abstract Data Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.event.impl.AbstractDataEventPatternImpl
         * @see data.event.impl.EventPackageImpl#getAbstractDataEventPattern()
         * @generated
         */
        EClass ABSTRACT_DATA_EVENT_PATTERN = eINSTANCE.getAbstractDataEventPattern();

        /**
         * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DATA_EVENT_PATTERN__LIFECYCLE = eINSTANCE.getAbstractDataEventPattern_Lifecycle();

        /**
         * The meta object literal for the '<em><b>Data Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_EVENT_PATTERN__DATA_PATTERN = eINSTANCE.getAbstractDataEventPattern_DataPattern();

        /**
         * The meta object literal for the '{@link data.event.impl.DataEventPatternImpl <em>Data Event Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.event.impl.DataEventPatternImpl
         * @see data.event.impl.EventPackageImpl#getDataEventPattern()
         * @generated
         */
        EClass DATA_EVENT_PATTERN = eINSTANCE.getDataEventPattern();

        /**
         * The meta object literal for the '{@link data.event.DataLifecycle <em>Data Lifecycle</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.event.DataLifecycle
         * @see data.event.impl.EventPackageImpl#getDataLifecycle()
         * @generated
         */
        EEnum DATA_LIFECYCLE = eINSTANCE.getDataLifecycle();

    }

} //EventPackage
