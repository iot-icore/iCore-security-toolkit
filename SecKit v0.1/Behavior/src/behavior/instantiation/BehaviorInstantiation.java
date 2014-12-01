/**
 */
package behavior.instantiation;

import behavior.instance.Behavior;

import behavior.type.AbstractBehaviorType;
import behavior.type.StructuredBehaviorType;

import models.Element;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.BehaviorInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation()
 * @model
 * @generated
 */
public interface BehaviorInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(AbstractBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_Type()
     * @see behavior.type.AbstractBehaviorType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    AbstractBehaviorType getType();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(AbstractBehaviorType value);

    /**
     * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contributions</em>' containment reference list.
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_Contributions()
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation
     * @model opposite="behaviorInstantiation" containment="true"
     * @generated
     */
    EList<InteractionContributionOfInstantiation> getContributions();

    /**
     * Returns the value of the '<em><b>Container Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.StructuredBehaviorType#getContainedInstantiations <em>Contained Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Type</em>' container reference.
     * @see #setContainerType(StructuredBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_ContainerType()
     * @see behavior.type.StructuredBehaviorType#getContainedInstantiations
     * @model opposite="containedInstantiations" transient="false"
     * @generated
     */
    StructuredBehaviorType getContainerType();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiation#getContainerType <em>Container Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Type</em>' container reference.
     * @see #getContainerType()
     * @generated
     */
    void setContainerType(StructuredBehaviorType value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.Behavior}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Behavior#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_Instances()
     * @see behavior.instance.Behavior#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<Behavior> getInstances();

    /**
     * Returns the value of the '<em><b>Flow Points</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.FlowPointOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Points</em>' containment reference list.
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_FlowPoints()
     * @see behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation
     * @model opposite="behaviorInstantiation" containment="true"
     * @generated
     */
    EList<FlowPointOfInstantiation> getFlowPoints();

    /**
     * Returns the value of the '<em><b>Variable Assignments</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Assignments</em>' containment reference list.
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_VariableAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getVariableAssignments();

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
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Instantiation</em>' reference.
     * @see #setEntityInstantiation(EntityInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiation_EntityInstantiation()
     * @model
     * @generated
     */
    EntityInstantiation getEntityInstantiation();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Instantiation</em>' reference.
     * @see #getEntityInstantiation()
     * @generated
     */
    void setEntityInstantiation(EntityInstantiation value);

} // BehaviorInstantiation
