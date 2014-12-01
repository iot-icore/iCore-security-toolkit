/**
 */
package behavior.instantiation;

import behavior.type.AbstractBehaviorType;
import behavior.type.FlowPointType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Point Of Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.FlowPointOfType#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.FlowPointOfType#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.FlowPointOfType#getFlowPointsOfInstantiation <em>Flow Points Of Instantiation</em>}</li>
 *   <li>{@link behavior.instantiation.FlowPointOfType#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getFlowPointOfType()
 * @model abstract="true"
 * @generated
 */
public interface FlowPointOfType extends FlowPointInstantiation {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.FlowPointType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(FlowPointType)
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfType_Type()
     * @see behavior.type.FlowPointType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    FlowPointType getType();

    /**
     * Sets the value of the '{@link behavior.instantiation.FlowPointOfType#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(FlowPointType value);

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
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.instantiation.FlowPointOfType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Flow Points Of Instantiation</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.FlowPointOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType <em>Flow Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Points Of Instantiation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Points Of Instantiation</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfType_FlowPointsOfInstantiation()
     * @see behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType
     * @model opposite="flowPointOfType"
     * @generated
     */
    EList<FlowPointOfInstantiation> getFlowPointsOfInstantiation();

    /**
     * Returns the value of the '<em><b>Behavior Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getFlowPoints <em>Flow Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Type</em>' container reference.
     * @see #setBehaviorType(AbstractBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfType_BehaviorType()
     * @see behavior.type.AbstractBehaviorType#getFlowPoints
     * @model opposite="flowPoints" required="true" transient="false"
     * @generated
     */
    AbstractBehaviorType getBehaviorType();

    /**
     * Sets the value of the '{@link behavior.instantiation.FlowPointOfType#getBehaviorType <em>Behavior Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Type</em>' container reference.
     * @see #getBehaviorType()
     * @generated
     */
    void setBehaviorType(AbstractBehaviorType value);

} // FlowPointOfType
