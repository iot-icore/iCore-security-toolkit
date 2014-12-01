/**
 */
package context.instance;

import context.type.ContextSituationType;

import models.Element;

import org.eclipse.emf.common.util.EList;

import time.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.ContextSituation#getType <em>Type</em>}</li>
 *   <li>{@link context.instance.ContextSituation#getRoles <em>Roles</em>}</li>
 *   <li>{@link context.instance.ContextSituation#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link context.instance.ContextSituation#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.InstancePackage#getContextSituation()
 * @model
 * @generated
 */
public interface ContextSituation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ContextSituationType)
     * @see context.instance.InstancePackage#getContextSituation_Type()
     * @model required="true"
     * @generated
     */
    ContextSituationType getType();

    /**
     * Sets the value of the '{@link context.instance.ContextSituation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ContextSituationType value);

    /**
     * Returns the value of the '<em><b>Roles</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roles</em>' containment reference.
     * @see #setRoles(EntityRole)
     * @see context.instance.InstancePackage#getContextSituation_Roles()
     * @model containment="true"
     * @generated
     */
    EntityRole getRoles();

    /**
     * Sets the value of the '{@link context.instance.ContextSituation#getRoles <em>Roles</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Roles</em>' containment reference.
     * @see #getRoles()
     * @generated
     */
    void setRoles(EntityRole value);

    /**
     * Returns the value of the '<em><b>Time Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Interval</em>' containment reference.
     * @see #setTimeInterval(TimeInterval)
     * @see context.instance.InstancePackage#getContextSituation_TimeInterval()
     * @model containment="true" required="true"
     * @generated
     */
    TimeInterval getTimeInterval();

    /**
     * Sets the value of the '{@link context.instance.ContextSituation#getTimeInterval <em>Time Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Interval</em>' containment reference.
     * @see #getTimeInterval()
     * @generated
     */
    void setTimeInterval(TimeInterval value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' reference list.
     * The list contents are of type {@link context.instance.Context}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference list.
     * @see context.instance.InstancePackage#getContextSituation_Context()
     * @model
     * @generated
     */
    EList<Context> getContext();

} // ContextSituation
