/**
 */
package rule.template;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Template Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleTemplateVariable#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleTemplateVariable()
 * @model abstract="true"
 * @generated
 */
public interface RuleTemplateVariable extends RuleVariable {
    /**
     * Returns the value of the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.template.TemplatePackage#getRuleTemplateVariable_Template()
     * @model required="true"
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateVariable#getTemplate <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

} // RuleTemplateVariable
