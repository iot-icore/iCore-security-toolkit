/**
 */
package behavior.pattern;

import behavior.instantiation.AbstractInteractionContributionOfType;

import behavior.type.InteractionContributionType;

import models.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Contribution Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.pattern.InteractionContributionPattern#getParticipantBehaviorPattern <em>Participant Behavior Pattern</em>}</li>
 *   <li>{@link behavior.pattern.InteractionContributionPattern#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.InteractionContributionPattern#getContributionOfType <em>Contribution Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.pattern.PatternPackage#getInteractionContributionPattern()
 * @model
 * @generated
 */
public interface InteractionContributionPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Participant Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Behavior Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Behavior Pattern</em>' containment reference.
     * @see #setParticipantBehaviorPattern(BehaviorPattern)
     * @see behavior.pattern.PatternPackage#getInteractionContributionPattern_ParticipantBehaviorPattern()
     * @model containment="true"
     * @generated
     */
    BehaviorPattern getParticipantBehaviorPattern();

    /**
     * Sets the value of the '{@link behavior.pattern.InteractionContributionPattern#getParticipantBehaviorPattern <em>Participant Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant Behavior Pattern</em>' containment reference.
     * @see #getParticipantBehaviorPattern()
     * @generated
     */
    void setParticipantBehaviorPattern(BehaviorPattern value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(InteractionContributionType)
     * @see behavior.pattern.PatternPackage#getInteractionContributionPattern_Type()
     * @model
     * @generated
     */
    InteractionContributionType getType();

    /**
     * Sets the value of the '{@link behavior.pattern.InteractionContributionPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(InteractionContributionType value);

    /**
     * Returns the value of the '<em><b>Contribution Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Of Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Of Type</em>' reference.
     * @see #setContributionOfType(AbstractInteractionContributionOfType)
     * @see behavior.pattern.PatternPackage#getInteractionContributionPattern_ContributionOfType()
     * @model
     * @generated
     */
    AbstractInteractionContributionOfType getContributionOfType();

    /**
     * Sets the value of the '{@link behavior.pattern.InteractionContributionPattern#getContributionOfType <em>Contribution Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contribution Of Type</em>' reference.
     * @see #getContributionOfType()
     * @generated
     */
    void setContributionOfType(AbstractInteractionContributionOfType value);

} // InteractionContributionPattern
