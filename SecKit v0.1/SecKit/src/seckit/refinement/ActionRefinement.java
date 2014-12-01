/**
 */
package seckit.refinement;

import behavior.instantiation.ActionInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.ActionRefinement#getAbstractAction <em>Abstract Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getActionRefinement()
 * @model abstract="true"
 * @generated
 */
public interface ActionRefinement extends ActivityRefinement {
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
     * @see seckit.refinement.RefinementPackage#getActionRefinement_AbstractAction()
     * @model required="true"
     * @generated
     */
    ActionInstantiation getAbstractAction();

    /**
     * Sets the value of the '{@link seckit.refinement.ActionRefinement#getAbstractAction <em>Abstract Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Action</em>' reference.
     * @see #getAbstractAction()
     * @generated
     */
    void setAbstractAction(ActionInstantiation value);

} // ActionRefinement
