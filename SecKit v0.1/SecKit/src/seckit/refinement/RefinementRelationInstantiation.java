/**
 */
package seckit.refinement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.RefinementRelationInstantiation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getRefinementRelationInstantiation()
 * @model
 * @generated
 */
public interface RefinementRelationInstantiation extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(RefinementRelationType)
     * @see seckit.refinement.RefinementPackage#getRefinementRelationInstantiation_Type()
     * @model required="true"
     * @generated
     */
    RefinementRelationType getType();

    /**
     * Sets the value of the '{@link seckit.refinement.RefinementRelationInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(RefinementRelationType value);

} // RefinementRelationInstantiation
