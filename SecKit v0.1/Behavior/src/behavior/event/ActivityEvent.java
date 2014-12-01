/**
 */
package behavior.event;

import identity.instance.AbstractIdentity;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.event.ActivityEvent#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link behavior.event.ActivityEvent#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.event.EventPackage#getActivityEvent()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEvent extends AbstractBehaviorEvent {
    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.event.ActivityLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.ActivityLifecycle
     * @see #setLifecycle(ActivityLifecycle)
     * @see behavior.event.EventPackage#getActivityEvent_Lifecycle()
     * @model
     * @generated
     */
    ActivityLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link behavior.event.ActivityEvent#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see behavior.event.ActivityLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(ActivityLifecycle value);

    /**
     * Returns the value of the '<em><b>Identities</b></em>' containment reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' containment reference list.
     * @see behavior.event.EventPackage#getActivityEvent_Identities()
     * @model containment="true"
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // ActivityEvent
