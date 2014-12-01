/**
 */
package rule.event;

import models.Element;

import org.eclipse.emf.common.util.EList;

import rule.template.TimeStepRuleSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.event.TimeWindow#getEvents <em>Events</em>}</li>
 *   <li>{@link rule.event.TimeWindow#getReferenceClock <em>Reference Clock</em>}</li>
 *   <li>{@link rule.event.TimeWindow#getIndex <em>Index</em>}</li>
 *   <li>{@link rule.event.TimeWindow#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.event.EventPackage#getTimeWindow()
 * @model
 * @generated
 */
public interface TimeWindow extends Element {
    /**
     * Returns the value of the '<em><b>Events</b></em>' reference list.
     * The list contents are of type {@link rule.event.Event}.
     * It is bidirectional and its opposite is '{@link rule.event.Event#getWindows <em>Windows</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Events</em>' reference list.
     * @see rule.event.EventPackage#getTimeWindow_Events()
     * @see rule.event.Event#getWindows
     * @model opposite="windows"
     * @generated
     */
    EList<Event> getEvents();

    /**
     * Returns the value of the '<em><b>Reference Clock</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Clock</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Clock</em>' reference.
     * @see #setReferenceClock(TimeStepRuleSet)
     * @see rule.event.EventPackage#getTimeWindow_ReferenceClock()
     * @model
     * @generated
     */
    TimeStepRuleSet getReferenceClock();

    /**
     * Sets the value of the '{@link rule.event.TimeWindow#getReferenceClock <em>Reference Clock</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Clock</em>' reference.
     * @see #getReferenceClock()
     * @generated
     */
    void setReferenceClock(TimeStepRuleSet value);

    /**
     * Returns the value of the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Index</em>' attribute.
     * @see #setIndex(long)
     * @see rule.event.EventPackage#getTimeWindow_Index()
     * @model
     * @generated
     */
    long getIndex();

    /**
     * Sets the value of the '{@link rule.event.TimeWindow#getIndex <em>Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' attribute.
     * @see #getIndex()
     * @generated
     */
    void setIndex(long value);

    /**
     * Returns the value of the '<em><b>Trace</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.event.EventTrace#getTimeWindows <em>Time Windows</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trace</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trace</em>' container reference.
     * @see #setTrace(EventTrace)
     * @see rule.event.EventPackage#getTimeWindow_Trace()
     * @see rule.event.EventTrace#getTimeWindows
     * @model opposite="timeWindows" transient="false"
     * @generated
     */
    EventTrace getTrace();

    /**
     * Sets the value of the '{@link rule.event.TimeWindow#getTrace <em>Trace</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trace</em>' container reference.
     * @see #getTrace()
     * @generated
     */
    void setTrace(EventTrace value);

} // TimeWindow
