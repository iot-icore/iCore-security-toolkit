/**
 */
package behavior.instantiation;

import behavior.type.StructuredBehaviorType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.InteractionInstantiation#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instantiation.InteractionInstantiation#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getInteractionInstantiation()
 * @model
 * @generated
 */
public interface InteractionInstantiation extends ActivityInstantiation {
    /**
     * Returns the value of the '<em><b>Contributions</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionContributionOfInstantiation#getInteraction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contributions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contributions</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getInteractionInstantiation_Contributions()
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getInteraction
     * @model opposite="interaction" lower="2"
     * @generated
     */
    EList<InteractionContributionOfInstantiation> getContributions();

    /**
     * Returns the value of the '<em><b>Behavior Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.StructuredBehaviorType#getInteractions <em>Interactions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Type</em>' container reference.
     * @see #setBehaviorType(StructuredBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getInteractionInstantiation_BehaviorType()
     * @see behavior.type.StructuredBehaviorType#getInteractions
     * @model opposite="interactions" required="true" transient="false"
     * @generated
     */
    StructuredBehaviorType getBehaviorType();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionInstantiation#getBehaviorType <em>Behavior Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Type</em>' container reference.
     * @see #getBehaviorType()
     * @generated
     */
    void setBehaviorType(StructuredBehaviorType value);

} // InteractionInstantiation
