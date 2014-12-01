/**
 */
package structure.instantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.InteractionPointInstantiation#getParticipations <em>Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getInteractionPointInstantiation()
 * @model
 * @generated
 */
public interface InteractionPointInstantiation extends ActivityPointInstantiation {
    /**
     * Returns the value of the '<em><b>Participations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationOfInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint <em>Interaction Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participations</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getInteractionPointInstantiation_Participations()
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint
     * @model opposite="interactionPoint" lower="2"
     * @generated
     */
    EList<InteractionPointParticipationOfInstantiation> getParticipations();

} // InteractionPointInstantiation
