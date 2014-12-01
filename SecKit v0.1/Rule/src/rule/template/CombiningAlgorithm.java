/**
 */
package rule.template;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combining Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.CombiningAlgorithm#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getCombiningAlgorithm()
 * @model abstract="true"
 * @generated
 */
public interface CombiningAlgorithm extends Element {
    /**
     * Returns the value of the '<em><b>Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getCombiningAlgorithm <em>Combining Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' container reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.template.TemplatePackage#getCombiningAlgorithm_Template()
     * @see rule.template.RuleTemplate#getCombiningAlgorithm
     * @model opposite="combiningAlgorithm" required="true" transient="false"
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.template.CombiningAlgorithm#getTemplate <em>Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' container reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

} // CombiningAlgorithm
