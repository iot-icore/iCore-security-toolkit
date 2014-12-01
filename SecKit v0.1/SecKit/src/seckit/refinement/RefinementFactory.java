/**
 */
package seckit.refinement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see seckit.refinement.RefinementPackage
 * @generated
 */
public interface RefinementFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RefinementFactory eINSTANCE = seckit.refinement.impl.RefinementFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Action Refined Into Actions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Refined Into Actions</em>'.
     * @generated
     */
    ActionRefinedIntoActions createActionRefinedIntoActions();

    /**
     * Returns a new object of class '<em>Interface Decomposition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Decomposition</em>'.
     * @generated
     */
    InterfaceDecomposition createInterfaceDecomposition();

    /**
     * Returns a new object of class '<em>Action Insertion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Insertion</em>'.
     * @generated
     */
    ActionInsertion createActionInsertion();

    /**
     * Returns a new object of class '<em>Action Refined Into Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Refined Into Interaction</em>'.
     * @generated
     */
    ActionRefinedIntoInteraction createActionRefinedIntoInteraction();

    /**
     * Returns a new object of class '<em>Activity Refinement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Refinement</em>'.
     * @generated
     */
    ActivityRefinement createActivityRefinement();

    /**
     * Returns a new object of class '<em>Relation Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Instantiation</em>'.
     * @generated
     */
    RefinementRelationInstantiation createRefinementRelationInstantiation();

    /**
     * Returns a new object of class '<em>Relation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Hierarchy</em>'.
     * @generated
     */
    RefinementRelationHierarchy createRefinementRelationHierarchy();

    /**
     * Returns a new object of class '<em>Behavior Refinement Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Refinement Type</em>'.
     * @generated
     */
    BehaviorRefinementType createBehaviorRefinementType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RefinementPackage getRefinementPackage();

} //RefinementFactory
