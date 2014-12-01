/**
 */
package behavior.type;

import behavior.instantiation.ActionInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monolithic Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.MonolithicBehaviorType#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getMonolithicBehaviorType()
 * @model
 * @generated
 */
public interface MonolithicBehaviorType extends AbstractBehaviorType {
    /**
     * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.ActionInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actions</em>' containment reference list.
     * @see behavior.type.TypePackage#getMonolithicBehaviorType_Actions()
     * @model containment="true"
     * @generated
     */
    EList<ActionInstantiation> getActions();

} // MonolithicBehaviorType
