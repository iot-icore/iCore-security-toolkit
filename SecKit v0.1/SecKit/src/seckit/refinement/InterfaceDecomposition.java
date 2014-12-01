/**
 */
package seckit.refinement;

import behavior.type.InteractionType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.refinement.InterfaceDecomposition#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}</li>
 *   <li>{@link seckit.refinement.InterfaceDecomposition#getAbstractInteractionType <em>Abstract Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.refinement.RefinementPackage#getInterfaceDecomposition()
 * @model
 * @generated
 */
public interface InterfaceDecomposition extends InteractionRefinement {
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
     * @see seckit.refinement.RefinementPackage#getInterfaceDecomposition_ConcreteInteractionTypes()
     * @model lower="2"
     * @generated
     */
    EList<InteractionType> getConcreteInteractionTypes();

    /**
     * Returns the value of the '<em><b>Abstract Interaction Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Interaction Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Interaction Type</em>' reference.
     * @see #setAbstractInteractionType(InteractionType)
     * @see seckit.refinement.RefinementPackage#getInterfaceDecomposition_AbstractInteractionType()
     * @model required="true"
     * @generated
     */
    InteractionType getAbstractInteractionType();

    /**
     * Sets the value of the '{@link seckit.refinement.InterfaceDecomposition#getAbstractInteractionType <em>Abstract Interaction Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Interaction Type</em>' reference.
     * @see #getAbstractInteractionType()
     * @generated
     */
    void setAbstractInteractionType(InteractionType value);

} // InterfaceDecomposition
