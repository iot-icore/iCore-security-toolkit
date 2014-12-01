/**
 */
package structure.instantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instance.ActivityPoint;

import structure.type.ActivityPointType;
import structure.type.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Point Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.ActivityPointInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.ActivityPointInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.ActivityPointInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.ActivityPointInstantiation#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getActivityPointInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface ActivityPointInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.ActivityPointType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ActivityPointType)
     * @see structure.instantiation.InstantiationPackage#getActivityPointInstantiation_Type()
     * @see structure.type.ActivityPointType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    ActivityPointType getType();

    /**
     * Sets the value of the '{@link structure.instantiation.ActivityPointInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ActivityPointType value);

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
     * @see structure.instantiation.InstantiationPackage#getActivityPointInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instantiation.ActivityPointInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link structure.instance.ActivityPoint}.
     * It is bidirectional and its opposite is '{@link structure.instance.ActivityPoint#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see structure.instantiation.InstantiationPackage#getActivityPointInstantiation_Instances()
     * @see structure.instance.ActivityPoint#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<ActivityPoint> getInstances();

    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getActivityPoints <em>Activity Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' container reference.
     * @see #setEntityType(EntityType)
     * @see structure.instantiation.InstantiationPackage#getActivityPointInstantiation_EntityType()
     * @see structure.type.EntityType#getActivityPoints
     * @model opposite="activityPoints" required="true" transient="false"
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link structure.instantiation.ActivityPointInstantiation#getEntityType <em>Entity Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' container reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

} // ActivityPointInstantiation
