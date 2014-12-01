/**
 */
package models.variable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg Exp Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.variable.RegExpVariableAssignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link models.variable.RegExpVariableAssignment#getMatch <em>Match</em>}</li>
 *   <li>{@link models.variable.RegExpVariableAssignment#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.variable.VariablePackage#getRegExpVariableAssignment()
 * @model
 * @generated
 */
public interface RegExpVariableAssignment extends ReferenceVariableAssignment {
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
     * @see models.variable.VariablePackage#getRegExpVariableAssignment_Expression()
     * @model
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link models.variable.RegExpVariableAssignment#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

    /**
     * Returns the value of the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match</em>' attribute.
     * @see #setMatch(int)
     * @see models.variable.VariablePackage#getRegExpVariableAssignment_Match()
     * @model
     * @generated
     */
    int getMatch();

    /**
     * Sets the value of the '{@link models.variable.RegExpVariableAssignment#getMatch <em>Match</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Match</em>' attribute.
     * @see #getMatch()
     * @generated
     */
    void setMatch(int value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute.
     * @see #setGroup(int)
     * @see models.variable.VariablePackage#getRegExpVariableAssignment_Group()
     * @model
     * @generated
     */
    int getGroup();

    /**
     * Sets the value of the '{@link models.variable.RegExpVariableAssignment#getGroup <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' attribute.
     * @see #getGroup()
     * @generated
     */
    void setGroup(int value);

} // RegExpVariableAssignment
