/**
 */
package structure.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instance.ActivityPoint;

import structure.instantiation.ActivityPointInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.ActivityPointType#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.ActivityPointType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.ActivityPointType#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.type.ActivityPointType#getPackage <em>Package</em>}</li>
 *   <li>{@link structure.type.ActivityPointType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link structure.type.ActivityPointType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getActivityPointType()
 * @model abstract="true"
 * @generated
 */
public interface ActivityPointType extends Element {
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
     * @see structure.type.TypePackage#getActivityPointType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.type.ActivityPointType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.ActivityPointInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.ActivityPointInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see structure.type.TypePackage#getActivityPointType_Instantiations()
     * @see structure.instantiation.ActivityPointInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<ActivityPointInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link structure.instance.ActivityPoint}.
     * It is bidirectional and its opposite is '{@link structure.instance.ActivityPoint#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see structure.type.TypePackage#getActivityPointType_Instances()
     * @see structure.instance.ActivityPoint#getType
     * @model opposite="type"
     * @generated
     */
    EList<ActivityPoint> getInstances();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getActivityPointTypes <em>Activity Point Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(EntityTypePackage)
     * @see structure.type.TypePackage#getActivityPointType_Package()
     * @see structure.type.EntityTypePackage#getActivityPointTypes
     * @model opposite="activityPointTypes" required="true" transient="false"
     * @generated
     */
    EntityTypePackage getPackage();

    /**
     * Sets the value of the '{@link structure.type.ActivityPointType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(EntityTypePackage value);

    /**
     * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
     * The list contents are of type {@link structure.type.ActivityPointType}.
     * It is bidirectional and its opposite is '{@link structure.type.ActivityPointType#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Types</em>' reference list.
     * @see structure.type.TypePackage#getActivityPointType_SubTypes()
     * @see structure.type.ActivityPointType#getSuperType
     * @model opposite="superType"
     * @generated
     */
    EList<ActivityPointType> getSubTypes();

    /**
     * Returns the value of the '<em><b>Super Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.ActivityPointType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Type</em>' reference.
     * @see #setSuperType(ActivityPointType)
     * @see structure.type.TypePackage#getActivityPointType_SuperType()
     * @see structure.type.ActivityPointType#getSubTypes
     * @model opposite="subTypes"
     * @generated
     */
    ActivityPointType getSuperType();

    /**
     * Sets the value of the '{@link structure.type.ActivityPointType#getSuperType <em>Super Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Type</em>' reference.
     * @see #getSuperType()
     * @generated
     */
    void setSuperType(ActivityPointType value);

} // ActivityPointType
