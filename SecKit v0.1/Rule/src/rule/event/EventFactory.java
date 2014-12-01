/**
 */
package rule.event;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.event.EventPackage
 * @generated
 */
public interface EventFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventFactory eINSTANCE = rule.event.impl.EventFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Time Window</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Window</em>'.
     * @generated
     */
    TimeWindow createTimeWindow();

    /**
     * Returns a new object of class '<em>Trace</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trace</em>'.
     * @generated
     */
    EventTrace createEventTrace();

    /**
     * Returns a new object of class '<em>Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event</em>'.
     * @generated
     */
    Event createEvent();

    /**
     * Returns a new object of class '<em>Subscription</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subscription</em>'.
     * @generated
     */
    EventSubscription createEventSubscription();

    /**
     * Returns a new object of class '<em>Provider Registration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provider Registration</em>'.
     * @generated
     */
    EventProviderRegistration createEventProviderRegistration();

    /**
     * Returns a new object of class '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set</em>'.
     * @generated
     */
    EventSet createEventSet();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EventPackage getEventPackage();

} //EventFactory
