/**
 */
package behavior.instantiation;

import behavior.type.StructuredBehaviorType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegated Interaction Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.DelegatedInteractionContribution#getContext <em>Context</em>}</li>
 *   <li>{@link behavior.instantiation.DelegatedInteractionContribution#getDelegatedTo <em>Delegated To</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getDelegatedInteractionContribution()
 * @model
 * @generated
 */
public interface DelegatedInteractionContribution extends AbstractInteractionContributionOfType {
    /**
     * Returns the value of the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference.
     * @see #setContext(StructuredBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getDelegatedInteractionContribution_Context()
     * @model
     * @generated
     */
    StructuredBehaviorType getContext();

    /**
     * Sets the value of the '{@link behavior.instantiation.DelegatedInteractionContribution#getContext <em>Context</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' reference.
     * @see #getContext()
     * @generated
     */
    void setContext(StructuredBehaviorType value);

    /**
     * Returns the value of the '<em><b>Delegated To</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom <em>Delegated From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated To</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getDelegatedInteractionContribution_DelegatedTo()
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom
     * @model opposite="delegatedFrom"
     * @generated
     */
    EList<InteractionContributionOfInstantiation> getDelegatedTo();

} // DelegatedInteractionContribution
