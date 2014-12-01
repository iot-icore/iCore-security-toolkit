/**
 */
package behavior.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = behavior.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Monolithic Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Monolithic Behavior Type</em>'.
     * @generated
     */
    MonolithicBehaviorType createMonolithicBehaviorType();

    /**
     * Returns a new object of class '<em>Action Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Type</em>'.
     * @generated
     */
    ActionType createActionType();

    /**
     * Returns a new object of class '<em>Interaction Contribution Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution Type</em>'.
     * @generated
     */
    InteractionContributionType createInteractionContributionType();

    /**
     * Returns a new object of class '<em>Interaction Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Type</em>'.
     * @generated
     */
    InteractionType createInteractionType();

    /**
     * Returns a new object of class '<em>Behavior Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Type Package</em>'.
     * @generated
     */
    BehaviorTypePackage createBehaviorTypePackage();

    /**
     * Returns a new object of class '<em>Entry Point Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry Point Type</em>'.
     * @generated
     */
    EntryPointType createEntryPointType();

    /**
     * Returns a new object of class '<em>Exit Point Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit Point Type</em>'.
     * @generated
     */
    ExitPointType createExitPointType();

    /**
     * Returns a new object of class '<em>Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Type</em>'.
     * @generated
     */
    BehaviorType createBehaviorType();

    /**
     * Returns a new object of class '<em>Structured Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structured Behavior Type</em>'.
     * @generated
     */
    StructuredBehaviorType createStructuredBehaviorType();

    /**
     * Returns a new object of class '<em>Data Producer Characterization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Producer Characterization</em>'.
     * @generated
     */
    DataProducerCharacterization createDataProducerCharacterization();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
