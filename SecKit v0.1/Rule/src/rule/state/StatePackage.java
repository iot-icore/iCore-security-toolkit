/**
 */
package rule.state;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see rule.state.StateFactory
 * @model kind="package"
 * @generated
 */
public interface StatePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "state";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/state/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-state";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StatePackage eINSTANCE = rule.state.impl.StatePackageImpl.init();

    /**
     * The meta object id for the '{@link rule.state.impl.AbstractStateImpl <em>Abstract State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.AbstractStateImpl
     * @see rule.state.impl.StatePackageImpl#getAbstractState()
     * @generated
     */
    int ABSTRACT_STATE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_STATE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_STATE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The number of structural features of the '<em>Abstract State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_STATE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Abstract State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_STATE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.StateImpl
     * @see rule.state.impl.StatePackageImpl#getState()
     * @generated
     */
    int STATE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__VISUAL_ELEMENTS = ABSTRACT_STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ID = ABSTRACT_STATE__ID;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__PARENT = ABSTRACT_STATE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__CHILDREN = ABSTRACT_STATE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ATOM = ABSTRACT_STATE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__VALUE = ABSTRACT_STATE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Previous Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__PREVIOUS_VALUE = ABSTRACT_STATE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Rule Instance</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__RULE_INSTANCE = ABSTRACT_STATE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__HANDLER = ABSTRACT_STATE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Immutable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__IMMUTABLE = ABSTRACT_STATE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.EventPatternStateImpl <em>Event Pattern State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.EventPatternStateImpl
     * @see rule.state.impl.StatePackageImpl#getEventPatternState()
     * @generated
     */
    int EVENT_PATTERN_STATE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__VISUAL_ELEMENTS = STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__ID = STATE__ID;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__PARENT = STATE__PARENT;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__CHILDREN = STATE__CHILDREN;

    /**
     * The feature id for the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__ATOM = STATE__ATOM;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__VALUE = STATE__VALUE;

    /**
     * The feature id for the '<em><b>Previous Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__PREVIOUS_VALUE = STATE__PREVIOUS_VALUE;

    /**
     * The feature id for the '<em><b>Rule Instance</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__RULE_INSTANCE = STATE__RULE_INSTANCE;

    /**
     * The feature id for the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__HANDLER = STATE__HANDLER;

    /**
     * The feature id for the '<em><b>Immutable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__IMMUTABLE = STATE__IMMUTABLE;

    /**
     * The feature id for the '<em><b>Event Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE__EVENT_PATTERN = STATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Pattern State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Event Pattern State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_PATTERN_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.RepStateImpl <em>Rep State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.RepStateImpl
     * @see rule.state.impl.StatePackageImpl#getRepState()
     * @generated
     */
    int REP_STATE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__VISUAL_ELEMENTS = STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__ID = STATE__ID;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__PARENT = STATE__PARENT;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__CHILDREN = STATE__CHILDREN;

    /**
     * The feature id for the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__ATOM = STATE__ATOM;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__VALUE = STATE__VALUE;

    /**
     * The feature id for the '<em><b>Previous Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__PREVIOUS_VALUE = STATE__PREVIOUS_VALUE;

    /**
     * The feature id for the '<em><b>Rule Instance</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__RULE_INSTANCE = STATE__RULE_INSTANCE;

    /**
     * The feature id for the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__HANDLER = STATE__HANDLER;

    /**
     * The feature id for the '<em><b>Immutable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__IMMUTABLE = STATE__IMMUTABLE;

    /**
     * The feature id for the '<em><b>Counter State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE__COUNTER_STATE = STATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rep State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Rep State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.TimeBoundedStateImpl <em>Time Bounded State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.TimeBoundedStateImpl
     * @see rule.state.impl.StatePackageImpl#getTimeBoundedState()
     * @generated
     */
    int TIME_BOUNDED_STATE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__VISUAL_ELEMENTS = STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__ID = STATE__ID;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__PARENT = STATE__PARENT;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__CHILDREN = STATE__CHILDREN;

    /**
     * The feature id for the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__ATOM = STATE__ATOM;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__VALUE = STATE__VALUE;

    /**
     * The feature id for the '<em><b>Previous Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__PREVIOUS_VALUE = STATE__PREVIOUS_VALUE;

    /**
     * The feature id for the '<em><b>Rule Instance</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__RULE_INSTANCE = STATE__RULE_INSTANCE;

    /**
     * The feature id for the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__HANDLER = STATE__HANDLER;

    /**
     * The feature id for the '<em><b>Immutable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__IMMUTABLE = STATE__IMMUTABLE;

    /**
     * The feature id for the '<em><b>Previous Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__PREVIOUS_VALUES = STATE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE__POSITION = STATE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Time Bounded State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Time Bounded State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BOUNDED_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.CounterStateImpl <em>Counter State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.CounterStateImpl
     * @see rule.state.impl.StatePackageImpl#getCounterState()
     * @generated
     */
    int COUNTER_STATE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE__VISUAL_ELEMENTS = ABSTRACT_STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE__ID = ABSTRACT_STATE__ID;

    /**
     * The feature id for the '<em><b>True</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE__TRUE = ABSTRACT_STATE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Undetermined</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE__UNDETERMINED = ABSTRACT_STATE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Counter State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Counter State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTER_STATE_OPERATION_COUNT = ABSTRACT_STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.state.impl.RepSinceStateImpl <em>Rep Since State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.state.impl.RepSinceStateImpl
     * @see rule.state.impl.StatePackageImpl#getRepSinceState()
     * @generated
     */
    int REP_SINCE_STATE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__VISUAL_ELEMENTS = REP_STATE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__ID = REP_STATE__ID;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__PARENT = REP_STATE__PARENT;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__CHILDREN = REP_STATE__CHILDREN;

    /**
     * The feature id for the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__ATOM = REP_STATE__ATOM;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__VALUE = REP_STATE__VALUE;

    /**
     * The feature id for the '<em><b>Previous Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__PREVIOUS_VALUE = REP_STATE__PREVIOUS_VALUE;

    /**
     * The feature id for the '<em><b>Rule Instance</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__RULE_INSTANCE = REP_STATE__RULE_INSTANCE;

    /**
     * The feature id for the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__HANDLER = REP_STATE__HANDLER;

    /**
     * The feature id for the '<em><b>Immutable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__IMMUTABLE = REP_STATE__IMMUTABLE;

    /**
     * The feature id for the '<em><b>Counter State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__COUNTER_STATE = REP_STATE__COUNTER_STATE;

    /**
     * The feature id for the '<em><b>Unds</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE__UNDS = REP_STATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Rep Since State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE_FEATURE_COUNT = REP_STATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Rep Since State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REP_SINCE_STATE_OPERATION_COUNT = REP_STATE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Circular Buffer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see utils.CircularBuffer
     * @see rule.state.impl.StatePackageImpl#getCircularBuffer()
     * @generated
     */
    int CIRCULAR_BUFFER = 7;

    /**
     * The meta object id for the '<em>Bit Set</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.BitSet
     * @see rule.state.impl.StatePackageImpl#getBitSet()
     * @generated
     */
    int BIT_SET = 8;

    /**
     * The meta object id for the '<em>Handler</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see utils.StateHandler
     * @see rule.state.impl.StatePackageImpl#getStateHandler()
     * @generated
     */
    int STATE_HANDLER = 9;


    /**
     * Returns the meta object for class '{@link rule.state.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>State</em>'.
     * @see rule.state.State
     * @generated
     */
    EClass getState();

    /**
     * Returns the meta object for the reference '{@link rule.state.State#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see rule.state.State#getParent()
     * @see #getState()
     * @generated
     */
    EReference getState_Parent();

    /**
     * Returns the meta object for the reference list '{@link rule.state.State#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Children</em>'.
     * @see rule.state.State#getChildren()
     * @see #getState()
     * @generated
     */
    EReference getState_Children();

    /**
     * Returns the meta object for the reference '{@link rule.state.State#getAtom <em>Atom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Atom</em>'.
     * @see rule.state.State#getAtom()
     * @see #getState()
     * @generated
     */
    EReference getState_Atom();

    /**
     * Returns the meta object for the attribute '{@link rule.state.State#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see rule.state.State#getValue()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Value();

    /**
     * Returns the meta object for the attribute '{@link rule.state.State#getPreviousValue <em>Previous Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Previous Value</em>'.
     * @see rule.state.State#getPreviousValue()
     * @see #getState()
     * @generated
     */
    EAttribute getState_PreviousValue();

    /**
     * Returns the meta object for the container reference '{@link rule.state.State#getRuleInstance <em>Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Rule Instance</em>'.
     * @see rule.state.State#getRuleInstance()
     * @see #getState()
     * @generated
     */
    EReference getState_RuleInstance();

    /**
     * Returns the meta object for the attribute '{@link rule.state.State#getHandler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Handler</em>'.
     * @see rule.state.State#getHandler()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Handler();

    /**
     * Returns the meta object for the attribute '{@link rule.state.State#isImmutable <em>Immutable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Immutable</em>'.
     * @see rule.state.State#isImmutable()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Immutable();

    /**
     * Returns the meta object for class '{@link rule.state.EventPatternState <em>Event Pattern State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Pattern State</em>'.
     * @see rule.state.EventPatternState
     * @generated
     */
    EClass getEventPatternState();

    /**
     * Returns the meta object for the reference '{@link rule.state.EventPatternState#getEventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Event Pattern</em>'.
     * @see rule.state.EventPatternState#getEventPattern()
     * @see #getEventPatternState()
     * @generated
     */
    EReference getEventPatternState_EventPattern();

    /**
     * Returns the meta object for class '{@link rule.state.RepState <em>Rep State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rep State</em>'.
     * @see rule.state.RepState
     * @generated
     */
    EClass getRepState();

    /**
     * Returns the meta object for the containment reference '{@link rule.state.RepState#getCounterState <em>Counter State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Counter State</em>'.
     * @see rule.state.RepState#getCounterState()
     * @see #getRepState()
     * @generated
     */
    EReference getRepState_CounterState();

    /**
     * Returns the meta object for class '{@link rule.state.TimeBoundedState <em>Time Bounded State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Bounded State</em>'.
     * @see rule.state.TimeBoundedState
     * @generated
     */
    EClass getTimeBoundedState();

    /**
     * Returns the meta object for the attribute '{@link rule.state.TimeBoundedState#getPreviousValues <em>Previous Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Previous Values</em>'.
     * @see rule.state.TimeBoundedState#getPreviousValues()
     * @see #getTimeBoundedState()
     * @generated
     */
    EAttribute getTimeBoundedState_PreviousValues();

    /**
     * Returns the meta object for the attribute '{@link rule.state.TimeBoundedState#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Position</em>'.
     * @see rule.state.TimeBoundedState#getPosition()
     * @see #getTimeBoundedState()
     * @generated
     */
    EAttribute getTimeBoundedState_Position();

    /**
     * Returns the meta object for class '{@link rule.state.CounterState <em>Counter State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Counter State</em>'.
     * @see rule.state.CounterState
     * @generated
     */
    EClass getCounterState();

    /**
     * Returns the meta object for the attribute '{@link rule.state.CounterState#getTrue <em>True</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>True</em>'.
     * @see rule.state.CounterState#getTrue()
     * @see #getCounterState()
     * @generated
     */
    EAttribute getCounterState_True();

    /**
     * Returns the meta object for the attribute '{@link rule.state.CounterState#getUndetermined <em>Undetermined</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Undetermined</em>'.
     * @see rule.state.CounterState#getUndetermined()
     * @see #getCounterState()
     * @generated
     */
    EAttribute getCounterState_Undetermined();

    /**
     * Returns the meta object for class '{@link rule.state.RepSinceState <em>Rep Since State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rep Since State</em>'.
     * @see rule.state.RepSinceState
     * @generated
     */
    EClass getRepSinceState();

    /**
     * Returns the meta object for the containment reference list '{@link rule.state.RepSinceState#getUnds <em>Unds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Unds</em>'.
     * @see rule.state.RepSinceState#getUnds()
     * @see #getRepSinceState()
     * @generated
     */
    EReference getRepSinceState_Unds();

    /**
     * Returns the meta object for class '{@link rule.state.AbstractState <em>Abstract State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract State</em>'.
     * @see rule.state.AbstractState
     * @generated
     */
    EClass getAbstractState();

    /**
     * Returns the meta object for data type '{@link utils.CircularBuffer <em>Circular Buffer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Circular Buffer</em>'.
     * @see utils.CircularBuffer
     * @model instanceClass="utils.CircularBuffer"
     * @generated
     */
    EDataType getCircularBuffer();

    /**
     * Returns the meta object for data type '{@link java.util.BitSet <em>Bit Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Bit Set</em>'.
     * @see java.util.BitSet
     * @model instanceClass="java.util.BitSet"
     * @generated
     */
    EDataType getBitSet();

    /**
     * Returns the meta object for data type '{@link utils.StateHandler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Handler</em>'.
     * @see utils.StateHandler
     * @model instanceClass="utils.StateHandler"
     * @generated
     */
    EDataType getStateHandler();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    StateFactory getStateFactory();

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
         * The meta object literal for the '{@link rule.state.impl.StateImpl <em>State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.StateImpl
         * @see rule.state.impl.StatePackageImpl#getState()
         * @generated
         */
        EClass STATE = eINSTANCE.getState();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__PARENT = eINSTANCE.getState_Parent();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__CHILDREN = eINSTANCE.getState_Children();

        /**
         * The meta object literal for the '<em><b>Atom</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__ATOM = eINSTANCE.getState_Atom();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__VALUE = eINSTANCE.getState_Value();

        /**
         * The meta object literal for the '<em><b>Previous Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__PREVIOUS_VALUE = eINSTANCE.getState_PreviousValue();

        /**
         * The meta object literal for the '<em><b>Rule Instance</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__RULE_INSTANCE = eINSTANCE.getState_RuleInstance();

        /**
         * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__HANDLER = eINSTANCE.getState_Handler();

        /**
         * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__IMMUTABLE = eINSTANCE.getState_Immutable();

        /**
         * The meta object literal for the '{@link rule.state.impl.EventPatternStateImpl <em>Event Pattern State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.EventPatternStateImpl
         * @see rule.state.impl.StatePackageImpl#getEventPatternState()
         * @generated
         */
        EClass EVENT_PATTERN_STATE = eINSTANCE.getEventPatternState();

        /**
         * The meta object literal for the '<em><b>Event Pattern</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT_PATTERN_STATE__EVENT_PATTERN = eINSTANCE.getEventPatternState_EventPattern();

        /**
         * The meta object literal for the '{@link rule.state.impl.RepStateImpl <em>Rep State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.RepStateImpl
         * @see rule.state.impl.StatePackageImpl#getRepState()
         * @generated
         */
        EClass REP_STATE = eINSTANCE.getRepState();

        /**
         * The meta object literal for the '<em><b>Counter State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REP_STATE__COUNTER_STATE = eINSTANCE.getRepState_CounterState();

        /**
         * The meta object literal for the '{@link rule.state.impl.TimeBoundedStateImpl <em>Time Bounded State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.TimeBoundedStateImpl
         * @see rule.state.impl.StatePackageImpl#getTimeBoundedState()
         * @generated
         */
        EClass TIME_BOUNDED_STATE = eINSTANCE.getTimeBoundedState();

        /**
         * The meta object literal for the '<em><b>Previous Values</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_BOUNDED_STATE__PREVIOUS_VALUES = eINSTANCE.getTimeBoundedState_PreviousValues();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_BOUNDED_STATE__POSITION = eINSTANCE.getTimeBoundedState_Position();

        /**
         * The meta object literal for the '{@link rule.state.impl.CounterStateImpl <em>Counter State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.CounterStateImpl
         * @see rule.state.impl.StatePackageImpl#getCounterState()
         * @generated
         */
        EClass COUNTER_STATE = eINSTANCE.getCounterState();

        /**
         * The meta object literal for the '<em><b>True</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COUNTER_STATE__TRUE = eINSTANCE.getCounterState_True();

        /**
         * The meta object literal for the '<em><b>Undetermined</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COUNTER_STATE__UNDETERMINED = eINSTANCE.getCounterState_Undetermined();

        /**
         * The meta object literal for the '{@link rule.state.impl.RepSinceStateImpl <em>Rep Since State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.RepSinceStateImpl
         * @see rule.state.impl.StatePackageImpl#getRepSinceState()
         * @generated
         */
        EClass REP_SINCE_STATE = eINSTANCE.getRepSinceState();

        /**
         * The meta object literal for the '<em><b>Unds</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REP_SINCE_STATE__UNDS = eINSTANCE.getRepSinceState_Unds();

        /**
         * The meta object literal for the '{@link rule.state.impl.AbstractStateImpl <em>Abstract State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.state.impl.AbstractStateImpl
         * @see rule.state.impl.StatePackageImpl#getAbstractState()
         * @generated
         */
        EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

        /**
         * The meta object literal for the '<em>Circular Buffer</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see utils.CircularBuffer
         * @see rule.state.impl.StatePackageImpl#getCircularBuffer()
         * @generated
         */
        EDataType CIRCULAR_BUFFER = eINSTANCE.getCircularBuffer();

        /**
         * The meta object literal for the '<em>Bit Set</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.BitSet
         * @see rule.state.impl.StatePackageImpl#getBitSet()
         * @generated
         */
        EDataType BIT_SET = eINSTANCE.getBitSet();

        /**
         * The meta object literal for the '<em>Handler</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see utils.StateHandler
         * @see rule.state.impl.StatePackageImpl#getStateHandler()
         * @generated
         */
        EDataType STATE_HANDLER = eINSTANCE.getStateHandler();

    }

} //StatePackage
