/**
 */
package behavior.pattern;

import behavior.instantiation.ActivityInstantiation;

import behavior.type.ActivityType;

import behavior.variable.ActivityVariable;

import data.pattern.DataPattern;

import identity.pattern.IdentityPattern;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

import role.IdentityRolePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.pattern.ActivityPattern#getContainerBehaviorPattern <em>Container Behavior Pattern</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getDataPatterns <em>Data Patterns</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getIdentityRolePatterns <em>Identity Role Patterns</em>}</li>
 *   <li>{@link behavior.pattern.ActivityPattern#getIdentityPatterns <em>Identity Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.pattern.PatternPackage#getActivityPattern()
 * @model
 * @generated
 */
public interface ActivityPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Container Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Behavior Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Behavior Pattern</em>' containment reference.
     * @see #setContainerBehaviorPattern(BehaviorPattern)
     * @see behavior.pattern.PatternPackage#getActivityPattern_ContainerBehaviorPattern()
     * @model containment="true"
     * @generated
     */
    BehaviorPattern getContainerBehaviorPattern();

    /**
     * Sets the value of the '{@link behavior.pattern.ActivityPattern#getContainerBehaviorPattern <em>Container Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Behavior Pattern</em>' containment reference.
     * @see #getContainerBehaviorPattern()
     * @generated
     */
    void setContainerBehaviorPattern(BehaviorPattern value);

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(ActivityInstantiation)
     * @see behavior.pattern.PatternPackage#getActivityPattern_Instantiation()
     * @model
     * @generated
     */
    ActivityInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link behavior.pattern.ActivityPattern#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(ActivityInstantiation value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ActivityType)
     * @see behavior.pattern.PatternPackage#getActivityPattern_Type()
     * @model
     * @generated
     */
    ActivityType getType();

    /**
     * Sets the value of the '{@link behavior.pattern.ActivityPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ActivityType value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' reference list.
     * The list contents are of type {@link behavior.variable.ActivityVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' reference list.
     * @see behavior.pattern.PatternPackage#getActivityPattern_Variables()
     * @model
     * @generated
     */
    EList<ActivityVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Data Patterns</b></em>' containment reference list.
     * The list contents are of type {@link data.pattern.DataPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Patterns</em>' containment reference list.
     * @see behavior.pattern.PatternPackage#getActivityPattern_DataPatterns()
     * @model containment="true"
     * @generated
     */
    EList<DataPattern> getDataPatterns();

    /**
     * Returns the value of the '<em><b>Identity Role Patterns</b></em>' containment reference list.
     * The list contents are of type {@link role.IdentityRolePattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Role Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Role Patterns</em>' containment reference list.
     * @see behavior.pattern.PatternPackage#getActivityPattern_IdentityRolePatterns()
     * @model containment="true"
     * @generated
     */
    EList<IdentityRolePattern> getIdentityRolePatterns();

    /**
     * Returns the value of the '<em><b>Identity Patterns</b></em>' containment reference list.
     * The list contents are of type {@link identity.pattern.IdentityPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Patterns</em>' containment reference list.
     * @see behavior.pattern.PatternPackage#getActivityPattern_IdentityPatterns()
     * @model containment="true"
     * @generated
     */
    EList<IdentityPattern> getIdentityPatterns();

} // ActivityPattern
