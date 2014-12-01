/**
 */
package behavior;

import behavior.instance.Behavior;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.BehaviorRuntimeModel#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.BehaviorPackage#getBehaviorRuntimeModel()
 * @model
 * @generated
 */
public interface BehaviorRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instance.Behavior}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' containment reference list.
     * @see behavior.BehaviorPackage#getBehaviorRuntimeModel_Instances()
     * @model containment="true"
     * @generated
     */
    EList<Behavior> getInstances();

} // BehaviorRuntimeModel
