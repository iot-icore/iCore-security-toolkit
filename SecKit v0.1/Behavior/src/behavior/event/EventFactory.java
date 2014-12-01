/**
 */
package behavior.event;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.event.EventPackage
 * @generated
 */
public interface EventFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventFactory eINSTANCE = behavior.event.impl.EventFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Activity Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Event Pattern</em>'.
     * @generated
     */
    ActivityEventPattern createActivityEventPattern();

    /**
     * Returns a new object of class '<em>Behavior Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Event</em>'.
     * @generated
     */
    BehaviorEvent createBehaviorEvent();

    /**
     * Returns a new object of class '<em>Action Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Event</em>'.
     * @generated
     */
    ActionEvent createActionEvent();

    /**
     * Returns a new object of class '<em>Interaction Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Event</em>'.
     * @generated
     */
    InteractionEvent createInteractionEvent();

    /**
     * Returns a new object of class '<em>Flow Point Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Point Event</em>'.
     * @generated
     */
    FlowPointEvent createFlowPointEvent();

    /**
     * Returns a new object of class '<em>Behavior Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Event Pattern</em>'.
     * @generated
     */
    BehaviorEventPattern createBehaviorEventPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EventPackage getEventPackage();

} //EventFactory
