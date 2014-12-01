/**
 */
package structure.instantiation;

import models.Element;
import models.Multiplicity;

import org.eclipse.emf.common.util.EList;

import structure.instance.InteractionPointParticipation;

import structure.type.InteractionPointParticipationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Participation Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.InteractionPointParticipationInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationInstantiation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType <em>Participation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface InteractionPointParticipationInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link structure.instance.InteractionPointParticipation}.
     * It is bidirectional and its opposite is '{@link structure.instance.InteractionPointParticipation#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationInstantiation_Instances()
     * @see structure.instance.InteractionPointParticipation#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<InteractionPointParticipation> getInstances();

    /**
     * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplicity</em>' containment reference.
     * @see #setMultiplicity(Multiplicity)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationInstantiation_Multiplicity()
     * @model containment="true"
     * @generated
     */
    Multiplicity getMultiplicity();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationInstantiation#getMultiplicity <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplicity</em>' containment reference.
     * @see #getMultiplicity()
     * @generated
     */
    void setMultiplicity(Multiplicity value);

    /**
     * Returns the value of the '<em><b>Participation Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.InteractionPointParticipationType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participation Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participation Type</em>' reference.
     * @see #setParticipationType(InteractionPointParticipationType)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationInstantiation_ParticipationType()
     * @see structure.type.InteractionPointParticipationType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    InteractionPointParticipationType getParticipationType();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType <em>Participation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participation Type</em>' reference.
     * @see #getParticipationType()
     * @generated
     */
    void setParticipationType(InteractionPointParticipationType value);

} // InteractionPointParticipationInstantiation
