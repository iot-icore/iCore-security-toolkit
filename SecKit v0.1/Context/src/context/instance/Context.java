/**
 */
package context.instance;

import data.instance.Data;

import identity.instance.AbstractIdentity;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.Context#getQualityOfContext <em>Quality Of Context</em>}</li>
 *   <li>{@link context.instance.Context#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link context.instance.Context#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.InstancePackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends Data {
    /**
     * Returns the value of the '<em><b>Quality Of Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Of Context</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quality Of Context</em>' containment reference.
     * @see #setQualityOfContext(QualityOfContext)
     * @see context.instance.InstancePackage#getContext_QualityOfContext()
     * @model containment="true" required="true"
     * @generated
     */
    QualityOfContext getQualityOfContext();

    /**
     * Sets the value of the '{@link context.instance.Context#getQualityOfContext <em>Quality Of Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quality Of Context</em>' containment reference.
     * @see #getQualityOfContext()
     * @generated
     */
    void setQualityOfContext(QualityOfContext value);

    /**
     * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp</em>' containment reference.
     * @see #setTimestamp(Timestamp)
     * @see context.instance.InstancePackage#getContext_Timestamp()
     * @model containment="true" required="true"
     * @generated
     */
    Timestamp getTimestamp();

    /**
     * Sets the value of the '{@link context.instance.Context#getTimestamp <em>Timestamp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp</em>' containment reference.
     * @see #getTimestamp()
     * @generated
     */
    void setTimestamp(Timestamp value);

    /**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(AbstractIdentity)
     * @see context.instance.InstancePackage#getContext_Owner()
     * @model required="true"
     * @generated
     */
    AbstractIdentity getOwner();

    /**
     * Sets the value of the '{@link context.instance.Context#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(AbstractIdentity value);

} // Context
