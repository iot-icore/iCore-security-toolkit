/**
 */
package behavior.instance;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.Activity#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends Element, DataProducerInstance {
    /**
     * Returns the value of the '<em><b>Behavior</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.instance.Behavior#getActivities <em>Activities</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior</em>' container reference.
     * @see #setBehavior(Behavior)
     * @see behavior.instance.InstancePackage#getActivity_Behavior()
     * @see behavior.instance.Behavior#getActivities
     * @model opposite="activities" transient="false"
     * @generated
     */
    Behavior getBehavior();

    /**
     * Sets the value of the '{@link behavior.instance.Activity#getBehavior <em>Behavior</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior</em>' container reference.
     * @see #getBehavior()
     * @generated
     */
    void setBehavior(Behavior value);

} // Activity
