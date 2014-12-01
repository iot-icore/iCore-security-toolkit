/**
 */
package data.action;

import data.instantiation.DataInstantiationHierarchy;

import rule.action.Modify;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.action.ModifyData#getTarget <em>Target</em>}</li>
 *   <li>{@link data.action.ModifyData#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.action.ActionPackage#getModifyData()
 * @model
 * @generated
 */
public interface ModifyData extends Modify {
    /**
     * Returns the value of the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' containment reference.
     * @see #setTarget(DataInstantiationHierarchy)
     * @see data.action.ActionPackage#getModifyData_Target()
     * @model containment="true"
     * @generated
     */
    DataInstantiationHierarchy getTarget();

    /**
     * Sets the value of the '{@link data.action.ModifyData#getTarget <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' containment reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(DataInstantiationHierarchy value);

    /**
     * Returns the value of the '<em><b>New Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Value</em>' attribute.
     * @see #setNewValue(String)
     * @see data.action.ActionPackage#getModifyData_NewValue()
     * @model
     * @generated
     */
    String getNewValue();

    /**
     * Sets the value of the '{@link data.action.ModifyData#getNewValue <em>New Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Value</em>' attribute.
     * @see #getNewValue()
     * @generated
     */
    void setNewValue(String value);

} // ModifyData
