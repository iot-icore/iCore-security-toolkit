/**
 */
package behavior.causality;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.CausalityCondition#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getCausalityCondition()
 * @model
 * @generated
 */
public interface CausalityCondition extends Element {
    /**
     * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
     * The literals are from the enumeration {@link behavior.causality.Uncertainty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uncertainty</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uncertainty</em>' attribute.
     * @see behavior.causality.Uncertainty
     * @see #setUncertainty(Uncertainty)
     * @see behavior.causality.CausalityPackage#getCausalityCondition_Uncertainty()
     * @model
     * @generated
     */
    Uncertainty getUncertainty();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityCondition#getUncertainty <em>Uncertainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uncertainty</em>' attribute.
     * @see behavior.causality.Uncertainty
     * @see #getUncertainty()
     * @generated
     */
    void setUncertainty(Uncertainty value);

} // CausalityCondition
