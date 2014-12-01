/**
 */
package behavior.type;

import behavior.instance.Action;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.ActionType#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getActionType()
 * @model
 * @generated
 */
public interface ActionType extends ActivityType {
    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.Action}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Action#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see behavior.type.TypePackage#getActionType_Instances()
     * @see behavior.instance.Action#getType
     * @model opposite="type"
     * @generated
     */
    EList<Action> getInstances();

} // ActionType
