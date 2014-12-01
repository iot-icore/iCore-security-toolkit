/**
 */
package identity.pattern;

import data.pattern.DataPattern;

import identity.IdentityVariable;

import identity.instantiation.IdentityInstantiation;

import identity.type.IdentityType;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.pattern.IdentityPattern#getAttributePatterns <em>Attribute Patterns</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getIssuerPattern <em>Issuer Pattern</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getSubject <em>Subject</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getType <em>Type</em>}</li>
 *   <li>{@link identity.pattern.IdentityPattern#getSubjectPattern <em>Subject Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.pattern.PatternPackage#getIdentityPattern()
 * @model
 * @generated
 */
public interface IdentityPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Attribute Patterns</b></em>' containment reference list.
     * The list contents are of type {@link identity.pattern.IdentityAttributePattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Patterns</em>' containment reference list.
     * @see identity.pattern.PatternPackage#getIdentityPattern_AttributePatterns()
     * @model containment="true"
     * @generated
     */
    EList<IdentityAttributePattern> getAttributePatterns();

    /**
     * Returns the value of the '<em><b>Issuer Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuer Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuer Pattern</em>' containment reference.
     * @see #setIssuerPattern(IdentityPattern)
     * @see identity.pattern.PatternPackage#getIdentityPattern_IssuerPattern()
     * @model containment="true"
     * @generated
     */
    IdentityPattern getIssuerPattern();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityPattern#getIssuerPattern <em>Issuer Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issuer Pattern</em>' containment reference.
     * @see #getIssuerPattern()
     * @generated
     */
    void setIssuerPattern(IdentityPattern value);

    /**
     * Returns the value of the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' attribute.
     * @see #setSubject(String)
     * @see identity.pattern.PatternPackage#getIdentityPattern_Subject()
     * @model
     * @generated
     */
    String getSubject();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityPattern#getSubject <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' attribute.
     * @see #getSubject()
     * @generated
     */
    void setSubject(String value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' reference list.
     * The list contents are of type {@link identity.IdentityVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' reference list.
     * @see identity.pattern.PatternPackage#getIdentityPattern_Variables()
     * @model
     * @generated
     */
    EList<IdentityVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(IdentityInstantiation)
     * @see identity.pattern.PatternPackage#getIdentityPattern_Instantiation()
     * @model
     * @generated
     */
    IdentityInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityPattern#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(IdentityInstantiation value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(IdentityType)
     * @see identity.pattern.PatternPackage#getIdentityPattern_Type()
     * @model
     * @generated
     */
    IdentityType getType();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(IdentityType value);

    /**
     * Returns the value of the '<em><b>Subject Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject Pattern</em>' containment reference.
     * @see #setSubjectPattern(DataPattern)
     * @see identity.pattern.PatternPackage#getIdentityPattern_SubjectPattern()
     * @model containment="true"
     * @generated
     */
    DataPattern getSubjectPattern();

    /**
     * Sets the value of the '{@link identity.pattern.IdentityPattern#getSubjectPattern <em>Subject Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject Pattern</em>' containment reference.
     * @see #getSubjectPattern()
     * @generated
     */
    void setSubjectPattern(DataPattern value);

} // IdentityPattern
