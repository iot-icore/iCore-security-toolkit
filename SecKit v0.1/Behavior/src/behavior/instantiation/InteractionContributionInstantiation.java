/**
 */
package behavior.instantiation;

import behavior.type.InteractionContributionType;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Contribution Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.InteractionContributionInstantiation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getInteractionContributionInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface InteractionContributionInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.InteractionContributionType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(InteractionContributionType)
     * @see behavior.instantiation.InstantiationPackage#getInteractionContributionInstantiation_Type()
     * @see behavior.type.InteractionContributionType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    InteractionContributionType getType();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionContributionInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(InteractionContributionType value);

} // InteractionContributionInstantiation
