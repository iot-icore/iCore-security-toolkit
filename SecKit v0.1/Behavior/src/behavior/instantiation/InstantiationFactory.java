/**
 */
package behavior.instantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.instantiation.InstantiationPackage
 * @generated
 */
public interface InstantiationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationFactory eINSTANCE = behavior.instantiation.impl.InstantiationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Behavior Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instantiation</em>'.
     * @generated
     */
    BehaviorInstantiation createBehaviorInstantiation();

    /**
     * Returns a new object of class '<em>Behavior Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instantiation Hierarchy</em>'.
     * @generated
     */
    BehaviorInstantiationHierarchy createBehaviorInstantiationHierarchy();

    /**
     * Returns a new object of class '<em>Behavior Instantiation Static Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instantiation Static Reference</em>'.
     * @generated
     */
    BehaviorInstantiationStaticReference createBehaviorInstantiationStaticReference();

    /**
     * Returns a new object of class '<em>Entry Point Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry Point Of Instantiation</em>'.
     * @generated
     */
    EntryPointOfInstantiation createEntryPointOfInstantiation();

    /**
     * Returns a new object of class '<em>Exit Point Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit Point Of Instantiation</em>'.
     * @generated
     */
    ExitPointOfInstantiation createExitPointOfInstantiation();

    /**
     * Returns a new object of class '<em>Interaction Contribution Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution Of Instantiation</em>'.
     * @generated
     */
    InteractionContributionOfInstantiation createInteractionContributionOfInstantiation();

    /**
     * Returns a new object of class '<em>Delegated Interaction Contribution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delegated Interaction Contribution</em>'.
     * @generated
     */
    DelegatedInteractionContribution createDelegatedInteractionContribution();

    /**
     * Returns a new object of class '<em>Action Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Instantiation</em>'.
     * @generated
     */
    ActionInstantiation createActionInstantiation();

    /**
     * Returns a new object of class '<em>Interaction Contribution Of Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution Of Type</em>'.
     * @generated
     */
    InteractionContributionOfType createInteractionContributionOfType();

    /**
     * Returns a new object of class '<em>Behavior Instantiation Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Instantiation Variable Reference</em>'.
     * @generated
     */
    BehaviorInstantiationVariableReference createBehaviorInstantiationVariableReference();

    /**
     * Returns a new object of class '<em>Entry Point Of Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry Point Of Type</em>'.
     * @generated
     */
    EntryPointOfType createEntryPointOfType();

    /**
     * Returns a new object of class '<em>Exit Point Of Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit Point Of Type</em>'.
     * @generated
     */
    ExitPointOfType createExitPointOfType();

    /**
     * Returns a new object of class '<em>Action Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Instantiation Hierarchy</em>'.
     * @generated
     */
    ActionInstantiationHierarchy createActionInstantiationHierarchy();

    /**
     * Returns a new object of class '<em>Interaction Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Instantiation</em>'.
     * @generated
     */
    InteractionInstantiation createInteractionInstantiation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstantiationPackage getInstantiationPackage();

} //InstantiationFactory
