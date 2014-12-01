/**
 */
package seckit.refinement;

import behavior.causality.CausalityRelation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causality Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.CausalityRefinement#getAbstractRelation <em>Abstract Relation</em>}</li>
 *   <li>{@link seckit.refinement.CausalityRefinement#getConcreteRelations <em>Concrete Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getCausalityRefinement()
 * @model abstract="true"
 * @generated
 */
public interface CausalityRefinement extends RefinementRelationType {
    /**
     * Returns the value of the '<em><b>Abstract Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Relation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Relation</em>' reference.
     * @see #setAbstractRelation(CausalityRelation)
     * @see seckit.refinement.RefinementPackage#getCausalityRefinement_AbstractRelation()
     * @model required="true"
     * @generated
     */
    CausalityRelation getAbstractRelation();

    /**
     * Sets the value of the '{@link seckit.refinement.CausalityRefinement#getAbstractRelation <em>Abstract Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Relation</em>' reference.
     * @see #getAbstractRelation()
     * @generated
     */
    void setAbstractRelation(CausalityRelation value);

    /**
     * Returns the value of the '<em><b>Concrete Relations</b></em>' containment reference list.
     * The list contents are of type {@link behavior.causality.CausalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concrete Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concrete Relations</em>' containment reference list.
     * @see seckit.refinement.RefinementPackage#getCausalityRefinement_ConcreteRelations()
     * @model containment="true"
     * @generated
     */
    EList<CausalityRelation> getConcreteRelations();

} // CausalityRefinement
