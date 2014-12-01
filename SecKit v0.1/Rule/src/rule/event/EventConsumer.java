/**
 */
package rule.event;

import org.eclipse.emf.ecore.EObject;

import rule.action.Authorization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rule.event.EventPackage#getEventConsumer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EventConsumer extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void notifyActualEvent(String provider, Event event);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Authorization notifyTentativeEvent(String provider, Event event);

} // EventConsumer
