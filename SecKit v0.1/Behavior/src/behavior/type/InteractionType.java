/**
 */
package behavior.type;

import behavior.instance.Interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.InteractionType#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.type.InteractionType#getInteractionPattern <em>Interaction Pattern</em>}</li>
 *   <li>{@link behavior.type.InteractionType#getContributionTypes <em>Contribution Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getInteractionType()
 * @model
 * @generated
 */
public interface InteractionType extends ActivityType {
    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.Interaction}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Interaction#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see behavior.type.TypePackage#getInteractionType_Instances()
     * @see behavior.instance.Interaction#getType
     * @model opposite="type"
     * @generated
     */
    EList<Interaction> getInstances();

    /**
     * Returns the value of the '<em><b>Interaction Pattern</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.type.InteractionPatternType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Pattern</em>' attribute.
     * @see behavior.type.InteractionPatternType
     * @see #setInteractionPattern(InteractionPatternType)
     * @see behavior.type.TypePackage#getInteractionType_InteractionPattern()
     * @model
     * @generated
     */
    InteractionPatternType getInteractionPattern();

    /**
     * Sets the value of the '{@link behavior.type.InteractionType#getInteractionPattern <em>Interaction Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Pattern</em>' attribute.
     * @see behavior.type.InteractionPatternType
     * @see #getInteractionPattern()
     * @generated
     */
    void setInteractionPattern(InteractionPatternType value);

    /**
     * Returns the value of the '<em><b>Contribution Types</b></em>' containment reference list.
     * The list contents are of type {@link behavior.type.InteractionContributionType}.
     * It is bidirectional and its opposite is '{@link behavior.type.InteractionContributionType#getInteractionType <em>Interaction Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Types</em>' containment reference list.
     * @see behavior.type.TypePackage#getInteractionType_ContributionTypes()
     * @see behavior.type.InteractionContributionType#getInteractionType
     * @model opposite="interactionType" containment="true" lower="2"
     * @generated
     */
    EList<InteractionContributionType> getContributionTypes();

} // InteractionType
