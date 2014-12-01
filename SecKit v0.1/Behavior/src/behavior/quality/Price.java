/**
 */
package behavior.quality;

import models.MonetaryAmount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.quality.Price#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.quality.QualityPackage#getPrice()
 * @model
 * @generated
 */
public interface Price extends Quantitative {
    /**
     * Returns the value of the '<em><b>Amount</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amount</em>' containment reference.
     * @see #setAmount(MonetaryAmount)
     * @see behavior.quality.QualityPackage#getPrice_Amount()
     * @model containment="true" required="true"
     * @generated
     */
    MonetaryAmount getAmount();

    /**
     * Sets the value of the '{@link behavior.quality.Price#getAmount <em>Amount</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amount</em>' containment reference.
     * @see #getAmount()
     * @generated
     */
    void setAmount(MonetaryAmount value);

} // Price
