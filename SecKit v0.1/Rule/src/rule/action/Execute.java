/**
 */
package rule.action;

import rule.template.RuleTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.action.Execute#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.action.ActionPackage#getExecute()
 * @model abstract="true"
 * @generated
 */
public interface Execute extends ActionBehavior {
    /**
     * Returns the value of the '<em><b>Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getExecute <em>Execute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' container reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.action.ActionPackage#getExecute_Template()
     * @see rule.template.RuleTemplate#getExecute
     * @model opposite="execute" required="true" transient="false"
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.action.Execute#getTemplate <em>Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' container reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

} // Execute
