/**
 */
package structure.instance;

import models.Element;

import structure.instantiation.InteractionPointParticipationInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.InteractionPointParticipation#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getInteractionPointParticipation()
 * @model
 * @generated
 */
public interface InteractionPointParticipation extends Element, LocalizableInstance {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(InteractionPointParticipationInstantiation)
     * @see structure.instance.InstancePackage#getInteractionPointParticipation_Instantiation()
     * @see structure.instantiation.InteractionPointParticipationInstantiation#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    InteractionPointParticipationInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link structure.instance.InteractionPointParticipation#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(InteractionPointParticipationInstantiation value);

} // InteractionPointParticipation
