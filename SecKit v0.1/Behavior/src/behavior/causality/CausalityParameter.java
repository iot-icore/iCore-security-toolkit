/**
 */
package behavior.causality;

import behavior.constraint.DataConstraint;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.CausalityParameter#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.causality.CausalityParameter#getVariableAssignments <em>Variable Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getCausalityParameter()
 * @model abstract="true"
 * @generated
 */
public interface CausalityParameter extends EObject {
    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link behavior.constraint.DataConstraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see behavior.causality.CausalityPackage#getCausalityParameter_Constraints()
     * @model containment="true"
     * @generated
     */
    EList<DataConstraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Variable Assignments</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Assignments</em>' containment reference list.
     * @see behavior.causality.CausalityPackage#getCausalityParameter_VariableAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getVariableAssignments();

} // CausalityParameter
