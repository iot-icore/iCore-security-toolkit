/**
 */
package behavior.constraint;

import data.instantiation.DataInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.DataEstablishment#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getDataEstablishment()
 * @model
 * @generated
 */
public interface DataEstablishment extends DataConstraint {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(DataInstantiation)
     * @see behavior.constraint.ConstraintPackage#getDataEstablishment_Target()
     * @model required="true"
     * @generated
     */
    DataInstantiation getTarget();

    /**
     * Sets the value of the '{@link behavior.constraint.DataEstablishment#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(DataInstantiation value);

} // DataEstablishment
