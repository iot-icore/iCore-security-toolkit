/**
 */
package behavior.pattern;

import behavior.instantiation.BehaviorInstantiationHierarchy;

import behavior.type.BehaviorType;

import behavior.variable.BehaviorVariable;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

import structure.pattern.EntityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.pattern.BehaviorPattern#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.BehaviorPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}</li>
 *   <li>{@link behavior.pattern.BehaviorPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link behavior.pattern.BehaviorPattern#getEntityPattern <em>Entity Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.pattern.PatternPackage#getBehaviorPattern()
 * @model
 * @generated
 */
public interface BehaviorPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(BehaviorType)
     * @see behavior.pattern.PatternPackage#getBehaviorPattern_Type()
     * @model
     * @generated
     */
    BehaviorType getType();

    /**
     * Sets the value of the '{@link behavior.pattern.BehaviorPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(BehaviorType value);

    /**
     * Returns the value of the '<em><b>Instantiation Hierarchy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation Hierarchy</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation Hierarchy</em>' containment reference.
     * @see #setInstantiationHierarchy(BehaviorInstantiationHierarchy)
     * @see behavior.pattern.PatternPackage#getBehaviorPattern_InstantiationHierarchy()
     * @model containment="true"
     * @generated
     */
    BehaviorInstantiationHierarchy getInstantiationHierarchy();

    /**
     * Sets the value of the '{@link behavior.pattern.BehaviorPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation Hierarchy</em>' containment reference.
     * @see #getInstantiationHierarchy()
     * @generated
     */
    void setInstantiationHierarchy(BehaviorInstantiationHierarchy value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' reference list.
     * The list contents are of type {@link behavior.variable.BehaviorVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' reference list.
     * @see behavior.pattern.PatternPackage#getBehaviorPattern_Variables()
     * @model
     * @generated
     */
    EList<BehaviorVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Entity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Pattern</em>' containment reference.
     * @see #setEntityPattern(EntityPattern)
     * @see behavior.pattern.PatternPackage#getBehaviorPattern_EntityPattern()
     * @model containment="true"
     * @generated
     */
    EntityPattern getEntityPattern();

    /**
     * Sets the value of the '{@link behavior.pattern.BehaviorPattern#getEntityPattern <em>Entity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Pattern</em>' containment reference.
     * @see #getEntityPattern()
     * @generated
     */
    void setEntityPattern(EntityPattern value);

} // BehaviorPattern
