/**
 */
package rule.template;

import models.variable.XPathVariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule XPath Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleXPathVariableAssignment#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleXPathVariableAssignment()
 * @model
 * @generated
 */
public interface RuleXPathVariableAssignment extends XPathVariableAssignment {
    /**
     * Returns the value of the '<em><b>Context</b></em>' attribute.
     * The literals are from the enumeration {@link rule.template.XPathContext}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' attribute.
     * @see rule.template.XPathContext
     * @see #setContext(XPathContext)
     * @see rule.template.TemplatePackage#getRuleXPathVariableAssignment_Context()
     * @model
     * @generated
     */
    XPathContext getContext();

    /**
     * Sets the value of the '{@link rule.template.RuleXPathVariableAssignment#getContext <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' attribute.
     * @see rule.template.XPathContext
     * @see #getContext()
     * @generated
     */
    void setContext(XPathContext value);

} // RuleXPathVariableAssignment
