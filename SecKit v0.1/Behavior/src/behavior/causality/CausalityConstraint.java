/**
 */
package behavior.causality;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.CausalityConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getCausalityConstraint()
 * @model abstract="true"
 * @generated
 */
public interface CausalityConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see behavior.causality.CausalityPackage#getCausalityConstraint_Expression()
     * @model
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link behavior.causality.CausalityConstraint#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // CausalityConstraint
