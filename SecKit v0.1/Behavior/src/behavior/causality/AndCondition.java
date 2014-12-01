/**
 */
package behavior.causality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.AndCondition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link behavior.causality.AndCondition#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getAndCondition()
 * @model
 * @generated
 */
public interface AndCondition extends CausalityCondition {
    /**
     * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.causality.BasicCausalityCondition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conditions</em>' containment reference list.
     * @see behavior.causality.CausalityPackage#getAndCondition_Conditions()
     * @model containment="true"
     * @generated
     */
    EList<BasicCausalityCondition> getConditions();

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link behavior.causality.CausalityConstraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see behavior.causality.CausalityPackage#getAndCondition_Constraints()
     * @model containment="true"
     * @generated
     */
    EList<CausalityConstraint> getConstraints();

} // AndCondition
