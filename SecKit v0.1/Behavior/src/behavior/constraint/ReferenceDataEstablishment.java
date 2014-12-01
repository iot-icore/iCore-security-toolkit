/**
 */
package behavior.constraint;

import data.instantiation.DataInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Data Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.ReferenceDataEstablishment#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getReferenceDataEstablishment()
 * @model
 * @generated
 */
public interface ReferenceDataEstablishment extends DataEstablishment {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(DataInstantiation)
     * @see behavior.constraint.ConstraintPackage#getReferenceDataEstablishment_Source()
     * @model required="true"
     * @generated
     */
    DataInstantiation getSource();

    /**
     * Sets the value of the '{@link behavior.constraint.ReferenceDataEstablishment#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(DataInstantiation value);

} // ReferenceDataEstablishment
