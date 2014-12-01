/**
 */
package rule.template;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Instance Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleInstanceVariable#getMechanismInstance <em>Mechanism Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleInstanceVariable()
 * @model abstract="true"
 * @generated
 */
public interface RuleInstanceVariable extends RuleVariable {
    /**
     * Returns the value of the '<em><b>Mechanism Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mechanism Instance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mechanism Instance</em>' reference.
     * @see #setMechanismInstance(RuleInstance)
     * @see rule.template.TemplatePackage#getRuleInstanceVariable_MechanismInstance()
     * @model required="true"
     * @generated
     */
    RuleInstance getMechanismInstance();

    /**
     * Sets the value of the '{@link rule.template.RuleInstanceVariable#getMechanismInstance <em>Mechanism Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanism Instance</em>' reference.
     * @see #getMechanismInstance()
     * @generated
     */
    void setMechanismInstance(RuleInstance value);

} // RuleInstanceVariable
