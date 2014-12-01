/**
 */
package structure.type;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.InteractionPointParticipationOfInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.InteractionPointType#getParticipations <em>Participations</em>}</li>
 *   <li>{@link structure.type.InteractionPointType#getParticipationType <em>Participation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getInteractionPointType()
 * @model
 * @generated
 */
public interface InteractionPointType extends ActivityPointType {
    /**
     * Returns the value of the '<em><b>Participations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationOfInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType <em>Interaction Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participations</em>' reference list.
     * @see structure.type.TypePackage#getInteractionPointType_Participations()
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType
     * @model opposite="interactionPointType" lower="2"
     * @generated
     */
    EList<InteractionPointParticipationOfInstantiation> getParticipations();

    /**
     * Returns the value of the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participation Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participation Type</em>' reference.
     * @see #setParticipationType(InteractionPointParticipationType)
     * @see structure.type.TypePackage#getInteractionPointType_ParticipationType()
     * @model required="true"
     * @generated
     */
    InteractionPointParticipationType getParticipationType();

    /**
     * Sets the value of the '{@link structure.type.InteractionPointType#getParticipationType <em>Participation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participation Type</em>' reference.
     * @see #getParticipationType()
     * @generated
     */
    void setParticipationType(InteractionPointParticipationType value);

} // InteractionPointType
