/**
 */
package rule.test;

import org.eclipse.emf.common.util.EList;

import rule.event.TimeWindow;

import rule.template.RuleTemplateConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Time Step Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.test.SimulatedTimeStepWindow#getExpectedToBeTriggeredRules <em>Expected To Be Triggered Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.test.TestPackage#getSimulatedTimeStepWindow()
 * @model
 * @generated
 */
public interface SimulatedTimeStepWindow extends TimeWindow {
    /**
     * Returns the value of the '<em><b>Expected To Be Triggered Rules</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplateConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expected To Be Triggered Rules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expected To Be Triggered Rules</em>' containment reference list.
     * @see rule.test.TestPackage#getSimulatedTimeStepWindow_ExpectedToBeTriggeredRules()
     * @model containment="true"
     * @generated
     */
    EList<RuleTemplateConfiguration> getExpectedToBeTriggeredRules();

} // SimulatedTimeStepWindow
