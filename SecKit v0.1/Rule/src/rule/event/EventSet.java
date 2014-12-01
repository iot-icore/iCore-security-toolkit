/**
 */
package rule.event;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.event.EventSet#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.event.EventPackage#getEventSet()
 * @model
 * @generated
 */
public interface EventSet extends Element {
    /**
     * Returns the value of the '<em><b>Events</b></em>' containment reference list.
     * The list contents are of type {@link rule.event.Event}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Events</em>' containment reference list.
     * @see rule.event.EventPackage#getEventSet_Events()
     * @model containment="true"
     * @generated
     */
    EList<Event> getEvents();

} // EventSet
