/**
 */
package risk.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Scenario Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.ThreatScenarioAttribute#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getThreatScenarioAttribute()
 * @model
 * @generated
 */
public interface ThreatScenarioAttribute extends EObject {
    /**
     * Returns the value of the '<em><b>Modality</b></em>' attribute.
     * The literals are from the enumeration {@link risk.type.AttributeModality}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modality</em>' attribute.
     * @see risk.type.AttributeModality
     * @see #setModality(AttributeModality)
     * @see risk.type.TypePackage#getThreatScenarioAttribute_Modality()
     * @model
     * @generated
     */
    AttributeModality getModality();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenarioAttribute#getModality <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modality</em>' attribute.
     * @see risk.type.AttributeModality
     * @see #getModality()
     * @generated
     */
    void setModality(AttributeModality value);

} // ThreatScenarioAttribute
