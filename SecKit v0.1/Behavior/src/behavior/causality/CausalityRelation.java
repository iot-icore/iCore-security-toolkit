/**
 */
package behavior.causality;

import behavior.type.AbstractBehaviorType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.CausalityRelation#getCondition <em>Condition</em>}</li>
 *   <li>{@link behavior.causality.CausalityRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link behavior.causality.CausalityRelation#getContext <em>Context</em>}</li>
 *   <li>{@link behavior.causality.CausalityRelation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getCausalityRelation()
 * @model
 * @generated
 */
public interface CausalityRelation extends EObject {
    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(CausalityCondition)
     * @see behavior.causality.CausalityPackage#getCausalityRelation_Condition()
     * @model containment="true" required="true"
     * @generated
     */
    CausalityCondition getCondition();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityRelation#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(CausalityCondition value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(CausalityParameter)
     * @see behavior.causality.CausalityPackage#getCausalityRelation_Target()
     * @model required="true"
     * @generated
     */
    CausalityParameter getTarget();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityRelation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(CausalityParameter value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getCausalityRelations <em>Causality Relations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' container reference.
     * @see #setContext(AbstractBehaviorType)
     * @see behavior.causality.CausalityPackage#getCausalityRelation_Context()
     * @see behavior.type.AbstractBehaviorType#getCausalityRelations
     * @model opposite="causalityRelations" transient="false"
     * @generated
     */
    AbstractBehaviorType getContext();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityRelation#getContext <em>Context</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' container reference.
     * @see #getContext()
     * @generated
     */
    void setContext(AbstractBehaviorType value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see behavior.causality.CausalityPackage#getCausalityRelation_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityRelation#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // CausalityRelation
