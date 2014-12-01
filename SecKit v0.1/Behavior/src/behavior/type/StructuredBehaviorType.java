/**
 */
package behavior.type;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.InteractionInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.StructuredBehaviorType#getContainedInstantiations <em>Contained Instantiations</em>}</li>
 *   <li>{@link behavior.type.StructuredBehaviorType#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getStructuredBehaviorType()
 * @model
 * @generated
 */
public interface StructuredBehaviorType extends AbstractBehaviorType {
    /**
     * Returns the value of the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.BehaviorInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.BehaviorInstantiation#getContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Instantiations</em>' containment reference list.
     * @see behavior.type.TypePackage#getStructuredBehaviorType_ContainedInstantiations()
     * @see behavior.instantiation.BehaviorInstantiation#getContainerType
     * @model opposite="containerType" containment="true"
     * @generated
     */
    EList<BehaviorInstantiation> getContainedInstantiations();

    /**
     * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionInstantiation#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interactions</em>' containment reference list.
     * @see behavior.type.TypePackage#getStructuredBehaviorType_Interactions()
     * @see behavior.instantiation.InteractionInstantiation#getBehaviorType
     * @model opposite="behaviorType" containment="true"
     * @generated
     */
    EList<InteractionInstantiation> getInteractions();

} // StructuredBehaviorType
