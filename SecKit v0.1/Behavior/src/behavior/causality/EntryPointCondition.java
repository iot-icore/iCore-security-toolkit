/**
 */
package behavior.causality;

import behavior.instantiation.EntryPointOfInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.EntryPointCondition#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getEntryPointCondition()
 * @model
 * @generated
 */
public interface EntryPointCondition extends PointCondition {
    /**
     * Returns the value of the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' reference.
     * @see #setEntry(EntryPointOfInstantiation)
     * @see behavior.causality.CausalityPackage#getEntryPointCondition_Entry()
     * @model required="true"
     * @generated
     */
    EntryPointOfInstantiation getEntry();

    /**
     * Sets the value of the '{@link behavior.causality.EntryPointCondition#getEntry <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' reference.
     * @see #getEntry()
     * @generated
     */
    void setEntry(EntryPointOfInstantiation value);

} // EntryPointCondition
