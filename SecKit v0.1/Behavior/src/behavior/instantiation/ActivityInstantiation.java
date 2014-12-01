/**
 */
package behavior.instantiation;

import behavior.type.ActivityType;

import models.Element;

import structure.instantiation.ActivityPointInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.ActivityInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.ActivityInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.ActivityInstantiation#getActivityPointInstantiation <em>Activity Point Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getActivityInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface ActivityInstantiation extends Element {
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
     * @see behavior.instantiation.InstantiationPackage#getActivityInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActivityInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.ActivityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ActivityType)
     * @see behavior.instantiation.InstantiationPackage#getActivityInstantiation_Type()
     * @see behavior.type.ActivityType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    ActivityType getType();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActivityInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ActivityType value);

    /**
     * Returns the value of the '<em><b>Activity Point Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Point Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Point Instantiation</em>' reference.
     * @see #setActivityPointInstantiation(ActivityPointInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getActivityInstantiation_ActivityPointInstantiation()
     * @model
     * @generated
     */
    ActivityPointInstantiation getActivityPointInstantiation();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActivityInstantiation#getActivityPointInstantiation <em>Activity Point Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Point Instantiation</em>' reference.
     * @see #getActivityPointInstantiation()
     * @generated
     */
    void setActivityPointInstantiation(ActivityPointInstantiation value);

} // ActivityInstantiation
