/**
 */
package rule.event;

import org.eclipse.emf.ecore.EObject;

import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rule.event.EventPackage#getEventProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EventProvider extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void subscribeToEvent(String subscriber, EventPattern eventPattern);

} // EventProvider
