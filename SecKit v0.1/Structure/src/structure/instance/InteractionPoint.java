/**
 */
package structure.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.InteractionPoint#getParticipations <em>Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getInteractionPoint()
 * @model
 * @generated
 */
public interface InteractionPoint extends ActivityPoint {
    /**
     * Returns the value of the '<em><b>Participations</b></em>' reference list.
     * The list contents are of type {@link structure.instance.InteractionPointParticipation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participations</em>' reference list.
     * @see structure.instance.InstancePackage#getInteractionPoint_Participations()
     * @model lower="2"
     * @generated
     */
    EList<InteractionPointParticipation> getParticipations();

} // InteractionPoint
