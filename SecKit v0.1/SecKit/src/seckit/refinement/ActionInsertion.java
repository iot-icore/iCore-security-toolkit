/**
 */
package seckit.refinement;

import behavior.instantiation.ActionInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.ActionInsertion#getInsertedActions <em>Inserted Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getActionInsertion()
 * @model
 * @generated
 */
public interface ActionInsertion extends CausalityRefinement {
    /**
     * Returns the value of the '<em><b>Inserted Actions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.ActionInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inserted Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inserted Actions</em>' containment reference list.
     * @see seckit.refinement.RefinementPackage#getActionInsertion_InsertedActions()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ActionInstantiation> getInsertedActions();

} // ActionInsertion
