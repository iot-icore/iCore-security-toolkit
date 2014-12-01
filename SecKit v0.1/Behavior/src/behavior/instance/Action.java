/**
 */
package behavior.instance;

import behavior.instantiation.ActionInstantiation;

import behavior.type.ActionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.Action#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link behavior.instance.Action#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Activity {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.ActionInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(ActionInstantiation)
     * @see behavior.instance.InstancePackage#getAction_Instantiation()
     * @see behavior.instantiation.ActionInstantiation#getInstances
     * @model opposite="instances"
     * @generated
     */
    ActionInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link behavior.instance.Action#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(ActionInstantiation value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.ActionType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ActionType)
     * @see behavior.instance.InstancePackage#getAction_Type()
     * @see behavior.type.ActionType#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    ActionType getType();

    /**
     * Sets the value of the '{@link behavior.instance.Action#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ActionType value);

} // Action
