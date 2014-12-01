/**
 */
package risk.type;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.RiskAssessment#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getRiskAssessment()
 * @model
 * @generated
 */
public interface RiskAssessment extends Element {
    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see risk.type.TypePackage#getRiskAssessment_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.RiskAssessment#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // RiskAssessment
