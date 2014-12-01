/**
 */
package rule.test;

import org.eclipse.emf.ecore.EObject;

import rule.event.EventTrace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.test.TestCase#getEventTrace <em>Event Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.test.TestPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
    /**
     * Returns the value of the '<em><b>Event Trace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Trace</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Trace</em>' containment reference.
     * @see #setEventTrace(EventTrace)
     * @see rule.test.TestPackage#getTestCase_EventTrace()
     * @model containment="true"
     * @generated
     */
    EventTrace getEventTrace();

    /**
     * Sets the value of the '{@link rule.test.TestCase#getEventTrace <em>Event Trace</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Trace</em>' containment reference.
     * @see #getEventTrace()
     * @generated
     */
    void setEventTrace(EventTrace value);

} // TestCase
