/**
 */
package structure.instance;

import models.Element;

import structure.instantiation.ActivityPointInstantiation;

import structure.type.ActivityPointType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.ActivityPoint#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instance.ActivityPoint#getType <em>Type</em>}</li>
 *   <li>{@link structure.instance.ActivityPoint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getActivityPoint()
 * @model abstract="true"
 * @generated
 */
public interface ActivityPoint extends Element {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.instantiation.ActivityPointInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(ActivityPointInstantiation)
     * @see structure.instance.InstancePackage#getActivityPoint_Instantiation()
     * @see structure.instantiation.ActivityPointInstantiation#getInstances
     * @model opposite="instances"
     * @generated
     */
    ActivityPointInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link structure.instance.ActivityPoint#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(ActivityPointInstantiation value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link structure.type.ActivityPointType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ActivityPointType)
     * @see structure.instance.InstancePackage#getActivityPoint_Type()
     * @see structure.type.ActivityPointType#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    ActivityPointType getType();

    /**
     * Sets the value of the '{@link structure.instance.ActivityPoint#getType <em>Type</em>}' reference.
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
     * @see structure.instance.InstancePackage#getActivityPoint_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.instance.ActivityPoint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ActivityPoint
