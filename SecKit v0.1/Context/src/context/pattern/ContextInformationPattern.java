/**
 */
package context.pattern;

import context.instance.QualityOfContext;

import context.type.ContextInformationType;

import identity.pattern.IdentityPattern;

import models.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Information Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.pattern.ContextInformationPattern#getOwner <em>Owner</em>}</li>
 *   <li>{@link context.pattern.ContextInformationPattern#getQualityOfContext <em>Quality Of Context</em>}</li>
 *   <li>{@link context.pattern.ContextInformationPattern#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.pattern.PatternPackage#getContextInformationPattern()
 * @model
 * @generated
 */
public interface ContextInformationPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' containment reference.
     * @see #setOwner(IdentityPattern)
     * @see context.pattern.PatternPackage#getContextInformationPattern_Owner()
     * @model containment="true"
     * @generated
     */
    IdentityPattern getOwner();

    /**
     * Sets the value of the '{@link context.pattern.ContextInformationPattern#getOwner <em>Owner</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' containment reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(IdentityPattern value);

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
     * @see context.pattern.PatternPackage#getContextInformationPattern_QualityOfContext()
     * @model containment="true"
     * @generated
     */
    QualityOfContext getQualityOfContext();

    /**
     * Sets the value of the '{@link context.pattern.ContextInformationPattern#getQualityOfContext <em>Quality Of Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quality Of Context</em>' containment reference.
     * @see #getQualityOfContext()
     * @generated
     */
    void setQualityOfContext(QualityOfContext value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ContextInformationType)
     * @see context.pattern.PatternPackage#getContextInformationPattern_Type()
     * @model
     * @generated
     */
    ContextInformationType getType();

    /**
     * Sets the value of the '{@link context.pattern.ContextInformationPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ContextInformationType value);

} // ContextInformationPattern
