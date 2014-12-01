/**
 */
package seckit.refinement;

import behavior.instantiation.ActionInstantiation;

import behavior.type.InteractionType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Oriented Behavior Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.ConstraintOrientedBehaviorRefinement#getAbstractAction <em>Abstract Action</em>}</li>
 *   <li>{@link seckit.refinement.ConstraintOrientedBehaviorRefinement#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getConstraintOrientedBehaviorRefinement()
 * @model abstract="true"
 * @generated
 */
public interface ConstraintOrientedBehaviorRefinement extends BehaviorRefinementType {
    /**
     * Returns the value of the '<em><b>Abstract Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Action</em>' reference.
     * @see #setAbstractAction(ActionInstantiation)
     * @see seckit.refinement.RefinementPackage#getConstraintOrientedBehaviorRefinement_AbstractAction()
     * @model required="true"
     * @generated
     */
    ActionInstantiation getAbstractAction();

    /**
     * Sets the value of the '{@link seckit.refinement.ConstraintOrientedBehaviorRefinement#getAbstractAction <em>Abstract Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Action</em>' reference.
     * @see #getAbstractAction()
     * @generated
     */
    void setAbstractAction(ActionInstantiation value);

    /**
     * Returns the value of the '<em><b>Concrete Interaction Types</b></em>' reference list.
     * The list contents are of type {@link behavior.type.InteractionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concrete Interaction Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concrete Interaction Types</em>' reference list.
     * @see seckit.refinement.RefinementPackage#getConstraintOrientedBehaviorRefinement_ConcreteInteractionTypes()
     * @model required="true"
     * @generated
     */
    EList<InteractionType> getConcreteInteractionTypes();

} // ConstraintOrientedBehaviorRefinement
