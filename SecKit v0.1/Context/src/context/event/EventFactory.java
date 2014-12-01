/**
 */
package context.event;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.event.EventPackage
 * @generated
 */
public interface EventFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EventFactory eINSTANCE = context.event.impl.EventFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Situation Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Situation Event</em>'.
     * @generated
     */
    ContextSituationEvent createContextSituationEvent();

    /**
     * Returns a new object of class '<em>Context Information Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Information Event</em>'.
     * @generated
     */
    ContextInformationEvent createContextInformationEvent();

    /**
     * Returns a new object of class '<em>Context Situation Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Situation Event Pattern</em>'.
     * @generated
     */
    ContextSituationEventPattern createContextSituationEventPattern();

    /**
     * Returns a new object of class '<em>Context Information Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Information Event Pattern</em>'.
     * @generated
     */
    ContextInformationEventPattern createContextInformationEventPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EventPackage getEventPackage();

} //EventFactory
