/**
 */
package behavior.constraint;

import models.variable.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.VariableEstablishment#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getVariableEstablishment()
 * @model abstract="true"
 * @generated
 */
public interface VariableEstablishment extends EObject {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(VariableDeclaration)
     * @see behavior.constraint.ConstraintPackage#getVariableEstablishment_Source()
     * @model required="true"
     * @generated
     */
    VariableDeclaration getSource();

    /**
     * Sets the value of the '{@link behavior.constraint.VariableEstablishment#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(VariableDeclaration value);

} // VariableEstablishment
