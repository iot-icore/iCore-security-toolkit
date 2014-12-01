/**
 */
package seckit.refinement;

import behavior.causality.CausalityRelation;

import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.InteractionContributionInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Refined Into Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.ActionRefinedIntoActions#getConcreteInteractions <em>Concrete Interactions</em>}</li>
 *   <li>{@link seckit.refinement.ActionRefinedIntoActions#getConcreteActions <em>Concrete Actions</em>}</li>
 *   <li>{@link seckit.refinement.ActionRefinedIntoActions#getConcreteRelations <em>Concrete Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getActionRefinedIntoActions()
 * @model
 * @generated
 */
public interface ActionRefinedIntoActions extends ActionRefinement {
    /**
     * Returns the value of the '<em><b>Concrete Interactions</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concrete Interactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concrete Interactions</em>' reference list.
     * @see seckit.refinement.RefinementPackage#getActionRefinedIntoActions_ConcreteInteractions()
     * @model lower="2"
     * @generated
     */
    EList<InteractionContributionInstantiation> getConcreteInteractions();

    /**
     * Returns the value of the '<em><b>Concrete Actions</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.ActionInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concrete Actions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concrete Actions</em>' reference list.
     * @see seckit.refinement.RefinementPackage#getActionRefinedIntoActions_ConcreteActions()
     * @model lower="2"
     * @generated
     */
    EList<ActionInstantiation> getConcreteActions();

    /**
     * Returns the value of the '<em><b>Concrete Relations</b></em>' reference list.
     * The list contents are of type {@link behavior.causality.CausalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concrete Relations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concrete Relations</em>' reference list.
     * @see seckit.refinement.RefinementPackage#getActionRefinedIntoActions_ConcreteRelations()
     * @model
     * @generated
     */
    EList<CausalityRelation> getConcreteRelations();

} // ActionRefinedIntoActions
