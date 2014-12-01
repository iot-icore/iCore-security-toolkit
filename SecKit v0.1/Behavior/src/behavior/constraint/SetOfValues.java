/**
 */
package behavior.constraint;

import data.instance.Data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Of Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.SetOfValues#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getSetOfValues()
 * @model abstract="true"
 * @generated
 */
public interface SetOfValues extends ValueCheckingConstraint {
    /**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link data.instance.Data}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see behavior.constraint.ConstraintPackage#getSetOfValues_Values()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Data> getValues();

} // SetOfValues
