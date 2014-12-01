/**
 */
package rule;

import models.Model;

import org.eclipse.emf.common.util.EList;

import rule.event.EventSet;
import rule.event.EventTrace;

import rule.template.RuleInstance;
import rule.template.TimeStepRuleSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.RuleRuntimeModel#getRules <em>Rules</em>}</li>
 *   <li>{@link rule.RuleRuntimeModel#getEventTraces <em>Event Traces</em>}</li>
 *   <li>{@link rule.RuleRuntimeModel#getRuleSets <em>Rule Sets</em>}</li>
 *   <li>{@link rule.RuleRuntimeModel#isRunning <em>Running</em>}</li>
 *   <li>{@link rule.RuleRuntimeModel#getEventSet <em>Event Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.RulePackage#getRuleRuntimeModel()
 * @model
 * @generated
 */
public interface RuleRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleInstance}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' containment reference list.
     * @see rule.RulePackage#getRuleRuntimeModel_Rules()
     * @model containment="true"
     * @generated
     */
    EList<RuleInstance> getRules();

    /**
     * Returns the value of the '<em><b>Event Traces</b></em>' containment reference list.
     * The list contents are of type {@link rule.event.EventTrace}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Traces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Traces</em>' containment reference list.
     * @see rule.RulePackage#getRuleRuntimeModel_EventTraces()
     * @model containment="true"
     * @generated
     */
    EList<EventTrace> getEventTraces();

    /**
     * Returns the value of the '<em><b>Rule Sets</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.TimeStepRuleSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Sets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Sets</em>' containment reference list.
     * @see rule.RulePackage#getRuleRuntimeModel_RuleSets()
     * @model containment="true"
     * @generated
     */
    EList<TimeStepRuleSet> getRuleSets();

    /**
     * Returns the value of the '<em><b>Running</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Running</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Running</em>' attribute.
     * @see #setRunning(boolean)
     * @see rule.RulePackage#getRuleRuntimeModel_Running()
     * @model
     * @generated
     */
    boolean isRunning();

    /**
     * Sets the value of the '{@link rule.RuleRuntimeModel#isRunning <em>Running</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Running</em>' attribute.
     * @see #isRunning()
     * @generated
     */
    void setRunning(boolean value);

    /**
     * Returns the value of the '<em><b>Event Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Set</em>' containment reference.
     * @see #setEventSet(EventSet)
     * @see rule.RulePackage#getRuleRuntimeModel_EventSet()
     * @model containment="true"
     * @generated
     */
    EventSet getEventSet();

    /**
     * Sets the value of the '{@link rule.RuleRuntimeModel#getEventSet <em>Event Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Set</em>' containment reference.
     * @see #getEventSet()
     * @generated
     */
    void setEventSet(EventSet value);

} // RuleRuntimeModel
