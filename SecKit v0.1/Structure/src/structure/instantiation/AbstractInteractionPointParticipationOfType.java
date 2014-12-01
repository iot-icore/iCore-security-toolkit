/**
 */
package structure.instantiation;

import org.eclipse.emf.common.util.EList;

import structure.type.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Interaction Point Participation Of Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getParticipationOfInstantiation <em>Participation Of Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getAbstractInteractionPointParticipationOfType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInteractionPointParticipationOfType extends InteractionPointParticipationInstantiation {
    /**
     * Returns the value of the '<em><b>Participation Of Instantiation</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationOfInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType <em>Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participation Of Instantiation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participation Of Instantiation</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation()
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType
     * @model opposite="participationOfType"
     * @generated
     */
    EList<InteractionPointParticipationOfInstantiation> getParticipationOfInstantiation();

    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getInteractionPointParticipations <em>Interaction Point Participations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' container reference.
     * @see #setEntityType(EntityType)
     * @see structure.instantiation.InstantiationPackage#getAbstractInteractionPointParticipationOfType_EntityType()
     * @see structure.type.EntityType#getInteractionPointParticipations
     * @model opposite="interactionPointParticipations" transient="false"
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType <em>Entity Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' container reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see structure.instantiation.InstantiationPackage#getAbstractInteractionPointParticipationOfType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // AbstractInteractionPointParticipationOfType
