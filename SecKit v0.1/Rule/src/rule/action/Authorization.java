/**
 */
package rule.action;

import org.eclipse.emf.common.util.EList;

import rule.template.RuleTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.action.Authorization#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link rule.action.Authorization#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.action.ActionPackage#getAuthorization()
 * @model abstract="true"
 * @generated
 */
public interface Authorization extends ActionBehavior {
    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link rule.action.Constraint}.
     * It is bidirectional and its opposite is '{@link rule.action.Constraint#getAuthorization <em>Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see rule.action.ActionPackage#getAuthorization_Constraints()
     * @see rule.action.Constraint#getAuthorization
     * @model opposite="authorization" containment="true"
     * @generated
     */
    EList<Constraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getAuthorize <em>Authorize</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' container reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.action.ActionPackage#getAuthorization_Template()
     * @see rule.template.RuleTemplate#getAuthorize
     * @model opposite="authorize" required="true" transient="false"
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.action.Authorization#getTemplate <em>Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' container reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

} // Authorization
