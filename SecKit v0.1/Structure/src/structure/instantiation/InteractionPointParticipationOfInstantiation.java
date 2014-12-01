/**
 */
package structure.instantiation;

import structure.type.InteractionPointType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Participation Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType <em>Interaction Point Type</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType <em>Participation Of Type</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom <em>Delegated From</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint <em>Interaction Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation()
 * @model
 * @generated
 */
public interface InteractionPointParticipationOfInstantiation extends InteractionPointParticipationInstantiation, LocalizableInstantiation {
    /**
     * Returns the value of the '<em><b>Interaction Point Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.InteractionPointType#getParticipations <em>Participations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Point Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Point Type</em>' reference.
     * @see #setInteractionPointType(InteractionPointType)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation_InteractionPointType()
     * @see structure.type.InteractionPointType#getParticipations
     * @model opposite="participations"
     * @generated
     */
    InteractionPointType getInteractionPointType();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType <em>Interaction Point Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Point Type</em>' reference.
     * @see #getInteractionPointType()
     * @generated
     */
    void setInteractionPointType(InteractionPointType value);

    /**
     * Returns the value of the '<em><b>Participation Of Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getParticipationOfInstantiation <em>Participation Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participation Of Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participation Of Type</em>' reference.
     * @see #setParticipationOfType(AbstractInteractionPointParticipationOfType)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation_ParticipationOfType()
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType#getParticipationOfInstantiation
     * @model opposite="participationOfInstantiation"
     * @generated
     */
    AbstractInteractionPointParticipationOfType getParticipationOfType();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType <em>Participation Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participation Of Type</em>' reference.
     * @see #getParticipationOfType()
     * @generated
     */
    void setParticipationOfType(AbstractInteractionPointParticipationOfType value);

    /**
     * Returns the value of the '<em><b>Delegated From</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.DelegatedInteractionPointParticipation#getDelegatedTo <em>Delegated To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated From</em>' reference.
     * @see #setDelegatedFrom(DelegatedInteractionPointParticipation)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation_DelegatedFrom()
     * @see structure.instantiation.DelegatedInteractionPointParticipation#getDelegatedTo
     * @model opposite="delegatedTo"
     * @generated
     */
    DelegatedInteractionPointParticipation getDelegatedFrom();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom <em>Delegated From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delegated From</em>' reference.
     * @see #getDelegatedFrom()
     * @generated
     */
    void setDelegatedFrom(DelegatedInteractionPointParticipation value);

    /**
     * Returns the value of the '<em><b>Entity Instantiation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.EntityInstantiation#getInteractionPointParticipations <em>Interaction Point Participations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Instantiation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Instantiation</em>' container reference.
     * @see #setEntityInstantiation(EntityInstantiation)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation_EntityInstantiation()
     * @see structure.instantiation.EntityInstantiation#getInteractionPointParticipations
     * @model opposite="interactionPointParticipations" required="true" transient="false"
     * @generated
     */
    EntityInstantiation getEntityInstantiation();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Instantiation</em>' container reference.
     * @see #getEntityInstantiation()
     * @generated
     */
    void setEntityInstantiation(EntityInstantiation value);

    /**
     * Returns the value of the '<em><b>Interaction Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointInstantiation#getParticipations <em>Participations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Point</em>' reference.
     * @see #setInteractionPoint(InteractionPointInstantiation)
     * @see structure.instantiation.InstantiationPackage#getInteractionPointParticipationOfInstantiation_InteractionPoint()
     * @see structure.instantiation.InteractionPointInstantiation#getParticipations
     * @model opposite="participations"
     * @generated
     */
    InteractionPointInstantiation getInteractionPoint();

    /**
     * Sets the value of the '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint <em>Interaction Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Point</em>' reference.
     * @see #getInteractionPoint()
     * @generated
     */
    void setInteractionPoint(InteractionPointInstantiation value);

} // InteractionPointParticipationOfInstantiation
