/**
 */
package rule.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rule.event.EventSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.test.TestSet#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link rule.test.TestSet#getEventSet <em>Event Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.test.TestPackage#getTestSet()
 * @model
 * @generated
 */
public interface TestSet extends EObject {
    /**
     * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
     * The list contents are of type {@link rule.test.TestCase}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Cases</em>' containment reference list.
     * @see rule.test.TestPackage#getTestSet_TestCases()
     * @model containment="true"
     * @generated
     */
    EList<TestCase> getTestCases();

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
     * @see rule.test.TestPackage#getTestSet_EventSet()
     * @model containment="true"
     * @generated
     */
    EventSet getEventSet();

    /**
     * Sets the value of the '{@link rule.test.TestSet#getEventSet <em>Event Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Set</em>' containment reference.
     * @see #getEventSet()
     * @generated
     */
    void setEventSet(EventSet value);

} // TestSet
