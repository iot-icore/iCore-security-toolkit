/**
 */
package rule.event;

import models.Element;

import org.eclipse.emf.common.util.EList;

import rule.template.TimeStepSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.event.EventTrace#getTimeWindows <em>Time Windows</em>}</li>
 *   <li>{@link rule.event.EventTrace#getTimeStepSize <em>Time Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.event.EventPackage#getEventTrace()
 * @model
 * @generated
 */
public interface EventTrace extends Element {
    /**
     * Returns the value of the '<em><b>Time Windows</b></em>' containment reference list.
     * The list contents are of type {@link rule.event.TimeWindow}.
     * It is bidirectional and its opposite is '{@link rule.event.TimeWindow#getTrace <em>Trace</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Windows</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Windows</em>' containment reference list.
     * @see rule.event.EventPackage#getEventTrace_TimeWindows()
     * @see rule.event.TimeWindow#getTrace
     * @model opposite="trace" containment="true"
     * @generated
     */
    EList<TimeWindow> getTimeWindows();

    /**
     * Returns the value of the '<em><b>Time Step Size</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step Size</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step Size</em>' reference.
     * @see #setTimeStepSize(TimeStepSize)
     * @see rule.event.EventPackage#getEventTrace_TimeStepSize()
     * @model required="true"
     * @generated
     */
    TimeStepSize getTimeStepSize();

    /**
     * Sets the value of the '{@link rule.event.EventTrace#getTimeStepSize <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step Size</em>' reference.
     * @see #getTimeStepSize()
     * @generated
     */
    void setTimeStepSize(TimeStepSize value);

} // EventTrace
