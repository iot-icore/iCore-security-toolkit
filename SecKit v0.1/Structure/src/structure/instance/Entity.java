/**
 */
package structure.instance;

import identity.instance.IdentityOwner;
import models.Element;
import org.eclipse.emf.common.util.EList;
import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.Entity#getContainerEntity <em>Container Entity</em>}</li>
 *   <li>{@link structure.instance.Entity#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link structure.instance.Entity#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instance.Entity#getActivityPoints <em>Activity Points</em>}</li>
 *   <li>{@link structure.instance.Entity#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Element, IdentityOwner {
    /**
     * Returns the value of the '<em><b>Container Entity</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.instance.Entity#getContainedEntities <em>Contained Entities</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Entity</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Entity</em>' container reference.
     * @see #setContainerEntity(Entity)
     * @see structure.instance.InstancePackage#getEntity_ContainerEntity()
     * @see structure.instance.Entity#getContainedEntities
     * @model opposite="containedEntities" transient="false"
     * @generated
     */
    Entity getContainerEntity();

    /**
     * Sets the value of the '{@link structure.instance.Entity#getContainerEntity <em>Container Entity</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Entity</em>' container reference.
     * @see #getContainerEntity()
     * @generated
     */
    void setContainerEntity(Entity value);

    /**
     * Returns the value of the '<em><b>Contained Entities</b></em>' containment reference list.
     * The list contents are of type {@link structure.instance.Entity}.
     * It is bidirectional and its opposite is '{@link structure.instance.Entity#getContainerEntity <em>Container Entity</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Entities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Entities</em>' containment reference list.
     * @see structure.instance.InstancePackage#getEntity_ContainedEntities()
     * @see structure.instance.Entity#getContainerEntity
     * @model opposite="containerEntity" containment="true"
     * @generated
     */
    EList<Entity> getContainedEntities();

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.EntityInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(EntityInstantiation)
     * @see structure.instance.InstancePackage#getEntity_Instantiation()
     * @see structure.instantiation.EntityInstantiation#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    EntityInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link structure.instance.Entity#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(EntityInstantiation value);

    /**
     * Returns the value of the '<em><b>Activity Points</b></em>' containment reference list.
     * The list contents are of type {@link structure.instance.ActivityPoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Points</em>' containment reference list.
     * @see structure.instance.InstancePackage#getEntity_ActivityPoints()
     * @model containment="true"
     * @generated
     */
    EList<ActivityPoint> getActivityPoints();

    /**
     * Returns the value of the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * The list contents are of type {@link structure.instance.InteractionPointParticipation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Point Participations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Point Participations</em>' containment reference list.
     * @see structure.instance.InstancePackage#getEntity_InteractionPointParticipations()
     * @model containment="true"
     * @generated
     */
    EList<InteractionPointParticipation> getInteractionPointParticipations();

} // Entity
