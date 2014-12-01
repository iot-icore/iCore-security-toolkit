/**
 */
package models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.Currency#getName <em>Name</em>}</li>
 *   <li>{@link models.Currency#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link models.Currency#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getCurrency()
 * @model
 * @generated
 */
public interface Currency extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see models.ModelsPackage#getCurrency_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link models.Currency#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Acronym</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acronym</em>' attribute.
     * @see #setAcronym(String)
     * @see models.ModelsPackage#getCurrency_Acronym()
     * @model
     * @generated
     */
    String getAcronym();

    /**
     * Sets the value of the '{@link models.Currency#getAcronym <em>Acronym</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Acronym</em>' attribute.
     * @see #getAcronym()
     * @generated
     */
    void setAcronym(String value);

    /**
     * Returns the value of the '<em><b>Symbol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Symbol</em>' attribute.
     * @see #setSymbol(String)
     * @see models.ModelsPackage#getCurrency_Symbol()
     * @model
     * @generated
     */
    String getSymbol();

    /**
     * Sets the value of the '{@link models.Currency#getSymbol <em>Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Symbol</em>' attribute.
     * @see #getSymbol()
     * @generated
     */
    void setSymbol(String value);

} // Currency
