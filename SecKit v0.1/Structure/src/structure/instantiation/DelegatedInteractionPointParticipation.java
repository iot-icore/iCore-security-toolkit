/**
 */
package structure.instantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegated Interaction Point Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.DelegatedInteractionPointParticipation#getDelegatedTo <em>Delegated To</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getDelegatedInteractionPointParticipation()
 * @model
 * @generated
 */
public interface DelegatedInteractionPointParticipation extends AbstractInteractionPointParticipationOfType {
    /**
     * Returns the value of the '<em><b>Delegated To</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationOfInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom <em>Delegated From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated To</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getDelegatedInteractionPointParticipation_DelegatedTo()
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom
     * @model opposite="delegatedFrom"
     * @generated
     */
    EList<InteractionPointParticipationOfInstantiation> getDelegatedTo();

} // DelegatedInteractionPointParticipation
