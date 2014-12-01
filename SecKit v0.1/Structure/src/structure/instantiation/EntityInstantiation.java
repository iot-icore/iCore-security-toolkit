/**
 */
package structure.instantiation;

import models.Element;
import models.Multiplicity;

import org.eclipse.emf.common.util.EList;

import structure.instance.Entity;

import structure.type.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.EntityInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiation#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiation#getContainerType <em>Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getEntityInstantiation()
 * @model
 * @generated
 */
public interface EntityInstantiation extends Element {
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
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(EntityType)
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_Type()
     * @see structure.type.EntityType#getInstantiations
     * @model opposite="instantiations"
     * @generated
     */
    EntityType getType();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(EntityType value);

    /**
     * Returns the value of the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationOfInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Point Participations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Point Participations</em>' containment reference list.
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_InteractionPointParticipations()
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation
     * @model opposite="entityInstantiation" containment="true"
     * @generated
     */
    EList<InteractionPointParticipationOfInstantiation> getInteractionPointParticipations();

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link structure.instance.Entity}.
     * It is bidirectional and its opposite is '{@link structure.instance.Entity#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_Instances()
     * @see structure.instance.Entity#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<Entity> getInstances();

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
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_Multiplicity()
     * @model containment="true"
     * @generated
     */
    Multiplicity getMultiplicity();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiation#getMultiplicity <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplicity</em>' containment reference.
     * @see #getMultiplicity()
     * @generated
     */
    void setMultiplicity(Multiplicity value);

    /**
     * Returns the value of the '<em><b>Container Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getContainedInstantiations <em>Contained Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Type</em>' container reference.
     * @see #setContainerType(EntityType)
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiation_ContainerType()
     * @see structure.type.EntityType#getContainedInstantiations
     * @model opposite="containedInstantiations" transient="false"
     * @generated
     */
    EntityType getContainerType();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiation#getContainerType <em>Container Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Type</em>' container reference.
     * @see #getContainerType()
     * @generated
     */
    void setContainerType(EntityType value);

} // EntityInstantiation
