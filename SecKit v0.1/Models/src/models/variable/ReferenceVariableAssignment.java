/**
 */
package models.variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.ReferenceVariableAssignment#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getReferenceVariableAssignment()
 * @model
 * @generated
 */
public interface ReferenceVariableAssignment extends VariableAssignment {
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
     * @see models.variable.VariablePackage#getReferenceVariableAssignment_Source()
     * @model required="true"
     * @generated
     */
    VariableDeclaration getSource();

    /**
     * Sets the value of the '{@link models.variable.ReferenceVariableAssignment#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(VariableDeclaration value);

} // ReferenceVariableAssignment
