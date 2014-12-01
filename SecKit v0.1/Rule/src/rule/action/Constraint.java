/**
 */
package rule.action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.action.Constraint#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.action.ActionPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends ActionBehavior {
    /**
     * Returns the value of the '<em><b>Authorization</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.action.Authorization#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authorization</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authorization</em>' container reference.
     * @see #setAuthorization(Authorization)
     * @see rule.action.ActionPackage#getConstraint_Authorization()
     * @see rule.action.Authorization#getConstraints
     * @model opposite="constraints" transient="false"
     * @generated
     */
    Authorization getAuthorization();

    /**
     * Sets the value of the '{@link rule.action.Constraint#getAuthorization <em>Authorization</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authorization</em>' container reference.
     * @see #getAuthorization()
     * @generated
     */
    void setAuthorization(Authorization value);

} // Constraint
