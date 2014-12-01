/**
 */
package behavior.type;

import behavior.instantiation.FlowPointOfType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.FlowPointType#getInstantiations <em>Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getFlowPointType()
 * @model abstract="true"
 * @generated
 */
public interface FlowPointType extends DataProducerType {
    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.FlowPointOfType}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.FlowPointOfType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see behavior.type.TypePackage#getFlowPointType_Instantiations()
     * @see behavior.instantiation.FlowPointOfType#getType
     * @model opposite="type"
     * @generated
     */
    EList<FlowPointOfType> getInstantiations();

} // FlowPointType
