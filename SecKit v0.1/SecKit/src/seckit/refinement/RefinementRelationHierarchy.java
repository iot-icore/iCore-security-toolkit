/**
 */
package seckit.refinement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.RefinementRelationHierarchy#getRefinementInstantiationRef <em>Refinement Instantiation Ref</em>}</li>
 *   <li>{@link seckit.refinement.RefinementRelationHierarchy#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getRefinementRelationHierarchy()
 * @model
 * @generated
 */
public interface RefinementRelationHierarchy extends EObject {
    /**
     * Returns the value of the '<em><b>Refinement Instantiation Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refinement Instantiation Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refinement Instantiation Ref</em>' containment reference.
     * @see #setRefinementInstantiationRef(RefinementRelationInstantiation)
     * @see seckit.refinement.RefinementPackage#getRefinementRelationHierarchy_RefinementInstantiationRef()
     * @model containment="true"
     * @generated
     */
    RefinementRelationInstantiation getRefinementInstantiationRef();

    /**
     * Sets the value of the '{@link seckit.refinement.RefinementRelationHierarchy#getRefinementInstantiationRef <em>Refinement Instantiation Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refinement Instantiation Ref</em>' containment reference.
     * @see #getRefinementInstantiationRef()
     * @generated
     */
    void setRefinementInstantiationRef(RefinementRelationInstantiation value);

    /**
     * Returns the value of the '<em><b>EReference0</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EReference0</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EReference0</em>' reference.
     * @see #setEReference0(RefinementRelationHierarchy)
     * @see seckit.refinement.RefinementPackage#getRefinementRelationHierarchy_EReference0()
     * @model
     * @generated
     */
    RefinementRelationHierarchy getEReference0();

    /**
     * Sets the value of the '{@link seckit.refinement.RefinementRelationHierarchy#getEReference0 <em>EReference0</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EReference0</em>' reference.
     * @see #getEReference0()
     * @generated
     */
    void setEReference0(RefinementRelationHierarchy value);

} // RefinementRelationHierarchy
