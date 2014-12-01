/**
 */
package models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monetary Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.MonetaryAmount#getAmount <em>Amount</em>}</li>
 *   <li>{@link models.MonetaryAmount#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getMonetaryAmount()
 * @model
 * @generated
 */
public interface MonetaryAmount extends EObject {
    /**
     * Returns the value of the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amount</em>' attribute.
     * @see #setAmount(double)
     * @see models.ModelsPackage#getMonetaryAmount_Amount()
     * @model
     * @generated
     */
    double getAmount();

    /**
     * Sets the value of the '{@link models.MonetaryAmount#getAmount <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amount</em>' attribute.
     * @see #getAmount()
     * @generated
     */
    void setAmount(double value);

    /**
     * Returns the value of the '<em><b>Currency</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Currency</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Currency</em>' containment reference.
     * @see #setCurrency(Currency)
     * @see models.ModelsPackage#getMonetaryAmount_Currency()
     * @model containment="true" required="true"
     * @generated
     */
    Currency getCurrency();

    /**
     * Sets the value of the '{@link models.MonetaryAmount#getCurrency <em>Currency</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Currency</em>' containment reference.
     * @see #getCurrency()
     * @generated
     */
    void setCurrency(Currency value);

} // MonetaryAmount
