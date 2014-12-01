/**
 */
package structure.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.ActivityPointInstantiation;
import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.EntityType#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.EntityType#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 *   <li>{@link structure.type.EntityType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.EntityType#getContainedInstantiations <em>Contained Instantiations</em>}</li>
 *   <li>{@link structure.type.EntityType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link structure.type.EntityType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link structure.type.EntityType#getPackage <em>Package</em>}</li>
 *   <li>{@link structure.type.EntityType#getActivityPoints <em>Activity Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends Element {
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
     * @see structure.type.TypePackage#getEntityType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.type.EntityType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.AbstractInteractionPointParticipationOfType}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Point Participations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Point Participations</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityType_InteractionPointParticipations()
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType
     * @model opposite="entityType" containment="true"
     * @generated
     */
    EList<AbstractInteractionPointParticipationOfType> getInteractionPointParticipations();

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.EntityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see structure.type.TypePackage#getEntityType_Instantiations()
     * @see structure.instantiation.EntityInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<EntityInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.EntityInstantiation#getContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Instantiations</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityType_ContainedInstantiations()
     * @see structure.instantiation.EntityInstantiation#getContainerType
     * @model opposite="containerType" containment="true"
     * @generated
     */
    EList<EntityInstantiation> getContainedInstantiations();

    /**
     * Returns the value of the '<em><b>Super Types</b></em>' reference list.
     * The list contents are of type {@link structure.type.EntityType}.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Types</em>' reference list.
     * @see structure.type.TypePackage#getEntityType_SuperTypes()
     * @see structure.type.EntityType#getSubTypes
     * @model opposite="subTypes"
     * @generated
     */
    EList<EntityType> getSuperTypes();

    /**
     * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
     * The list contents are of type {@link structure.type.EntityType}.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Types</em>' reference list.
     * @see structure.type.TypePackage#getEntityType_SubTypes()
     * @see structure.type.EntityType#getSuperTypes
     * @model opposite="superTypes"
     * @generated
     */
    EList<EntityType> getSubTypes();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getEntityTypes <em>Entity Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(EntityTypePackage)
     * @see structure.type.TypePackage#getEntityType_Package()
     * @see structure.type.EntityTypePackage#getEntityTypes
     * @model opposite="entityTypes" required="true" transient="false"
     * @generated
     */
    EntityTypePackage getPackage();

    /**
     * Sets the value of the '{@link structure.type.EntityType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(EntityTypePackage value);

    /**
     * Returns the value of the '<em><b>Activity Points</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.ActivityPointInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.ActivityPointInstantiation#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Points</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityType_ActivityPoints()
     * @see structure.instantiation.ActivityPointInstantiation#getEntityType
     * @model opposite="entityType" containment="true"
     * @generated
     */
    EList<ActivityPointInstantiation> getActivityPoints();

} // EntityType
