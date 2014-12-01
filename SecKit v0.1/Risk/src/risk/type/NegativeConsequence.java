/**
 */
package risk.type;

import trust.instance.LikelihoodLevel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.NegativeConsequence#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.NegativeConsequence#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getNegativeConsequence()
 * @model
 * @generated
 */
public interface NegativeConsequence extends Consequence {
    /**
     * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
     * The literals are from the enumeration {@link trust.instance.LikelihoodLevel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Likelihood</em>' attribute.
     * @see trust.instance.LikelihoodLevel
     * @see #setLikelihood(LikelihoodLevel)
     * @see risk.type.TypePackage#getNegativeConsequence_Likelihood()
     * @model
     * @generated
     */
    LikelihoodLevel getLikelihood();

    /**
     * Sets the value of the '{@link risk.type.NegativeConsequence#getLikelihood <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Likelihood</em>' attribute.
     * @see trust.instance.LikelihoodLevel
     * @see #getLikelihood()
     * @generated
     */
    void setLikelihood(LikelihoodLevel value);

    /**
     * Returns the value of the '<em><b>Severity</b></em>' attribute.
     * The literals are from the enumeration {@link risk.type.SeverityLevel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Severity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Severity</em>' attribute.
     * @see risk.type.SeverityLevel
     * @see #setSeverity(SeverityLevel)
     * @see risk.type.TypePackage#getNegativeConsequence_Severity()
     * @model
     * @generated
     */
    SeverityLevel getSeverity();

    /**
     * Sets the value of the '{@link risk.type.NegativeConsequence#getSeverity <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Severity</em>' attribute.
     * @see risk.type.SeverityLevel
     * @see #getSeverity()
     * @generated
     */
    void setSeverity(SeverityLevel value);

} // NegativeConsequence
