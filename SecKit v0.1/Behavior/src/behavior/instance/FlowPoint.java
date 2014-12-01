/**
 */
package behavior.instance;

import behavior.instantiation.FlowPointOfInstantiation;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.FlowPoint#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getFlowPoint()
 * @model
 * @generated
 */
public interface FlowPoint extends Element, DataProducerInstance {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(FlowPointOfInstantiation)
     * @see behavior.instance.InstancePackage#getFlowPoint_Instantiation()
     * @model required="true"
     * @generated
     */
    FlowPointOfInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link behavior.instance.FlowPoint#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(FlowPointOfInstantiation value);

} // FlowPoint
