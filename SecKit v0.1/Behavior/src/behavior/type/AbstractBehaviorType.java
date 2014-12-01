/**
 */
package behavior.type;

import behavior.causality.CausalityRelation;

import behavior.instance.Behavior;

import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.FlowPointOfType;

import models.variable.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import structure.type.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.AbstractBehaviorType#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getCausalityRelations <em>Causality Relations</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getPackage <em>Package</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link behavior.type.AbstractBehaviorType#getContributions <em>Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getAbstractBehaviorType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBehaviorType extends AbstractDataProducerType {
    /**
     * Returns the value of the '<em><b>Flow Points</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.FlowPointOfType}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.FlowPointOfType#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Points</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_FlowPoints()
     * @see behavior.instantiation.FlowPointOfType#getBehaviorType
     * @model opposite="behaviorType" containment="true"
     * @generated
     */
    EList<FlowPointOfType> getFlowPoints();

    /**
     * Returns the value of the '<em><b>Causality Relations</b></em>' containment reference list.
     * The list contents are of type {@link behavior.causality.CausalityRelation}.
     * It is bidirectional and its opposite is '{@link behavior.causality.CausalityRelation#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Causality Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Causality Relations</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_CausalityRelations()
     * @see behavior.causality.CausalityRelation#getContext
     * @model opposite="context" containment="true"
     * @generated
     */
    EList<CausalityRelation> getCausalityRelations();

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.BehaviorInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.BehaviorInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_Instantiations()
     * @see behavior.instantiation.BehaviorInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<BehaviorInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableDeclaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Declarations</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_VariableDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<VariableDeclaration> getVariableDeclarations();

    /**
     * Returns the value of the '<em><b>Super Types</b></em>' reference list.
     * The list contents are of type {@link behavior.type.AbstractBehaviorType}.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Types</em>' reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_SuperTypes()
     * @see behavior.type.AbstractBehaviorType#getSubTypes
     * @model opposite="subTypes"
     * @generated
     */
    EList<AbstractBehaviorType> getSuperTypes();

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.Behavior}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Behavior#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_Instances()
     * @see behavior.instance.Behavior#getType
     * @model opposite="type"
     * @generated
     */
    EList<Behavior> getInstances();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.BehaviorTypePackage#getBehaviorTypes <em>Behavior Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(BehaviorTypePackage)
     * @see behavior.type.TypePackage#getAbstractBehaviorType_Package()
     * @see behavior.type.BehaviorTypePackage#getBehaviorTypes
     * @model opposite="behaviorTypes" required="true" transient="false"
     * @generated
     */
    BehaviorTypePackage getPackage();

    /**
     * Sets the value of the '{@link behavior.type.AbstractBehaviorType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(BehaviorTypePackage value);

    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' reference.
     * @see #setEntityType(EntityType)
     * @see behavior.type.TypePackage#getAbstractBehaviorType_EntityType()
     * @model
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link behavior.type.AbstractBehaviorType#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

    /**
     * Returns the value of the '<em><b>Sub Types</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Types</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Types</em>' reference.
     * @see #setSubTypes(AbstractBehaviorType)
     * @see behavior.type.TypePackage#getAbstractBehaviorType_SubTypes()
     * @see behavior.type.AbstractBehaviorType#getSuperTypes
     * @model opposite="superTypes"
     * @generated
     */
    AbstractBehaviorType getSubTypes();

    /**
     * Sets the value of the '{@link behavior.type.AbstractBehaviorType#getSubTypes <em>Sub Types</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Types</em>' reference.
     * @see #getSubTypes()
     * @generated
     */
    void setSubTypes(AbstractBehaviorType value);

    /**
     * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instantiation.AbstractInteractionContributionOfType}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contributions</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractBehaviorType_Contributions()
     * @see behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType
     * @model opposite="behaviorType" containment="true"
     * @generated
     */
    EList<AbstractInteractionContributionOfType> getContributions();

} // AbstractBehaviorType
