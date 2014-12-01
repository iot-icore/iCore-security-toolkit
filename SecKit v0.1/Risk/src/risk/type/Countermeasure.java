/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import rule.template.RuleTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countermeasure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.Countermeasure#getCost <em>Cost</em>}</li>
 *   <li>{@link risk.type.Countermeasure#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.Countermeasure#getRuleTemplates <em>Rule Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getCountermeasure()
 * @model
 * @generated
 */
public interface Countermeasure extends Element {
    /**
     * Returns the value of the '<em><b>Cost</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cost</em>' containment reference.
     * @see #setCost(MonetaryAmount)
     * @see risk.type.TypePackage#getCountermeasure_Cost()
     * @model containment="true"
     * @generated
     */
    MonetaryAmount getCost();

    /**
     * Sets the value of the '{@link risk.type.Countermeasure#getCost <em>Cost</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cost</em>' containment reference.
     * @see #getCost()
     * @generated
     */
    void setCost(MonetaryAmount value);

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
     * @see risk.type.TypePackage#getCountermeasure_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.Countermeasure#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Rule Templates</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleTemplate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Templates</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Templates</em>' reference list.
     * @see risk.type.TypePackage#getCountermeasure_RuleTemplates()
     * @model
     * @generated
     */
    EList<RuleTemplate> getRuleTemplates();

} // Countermeasure
