/**
 */
package behavior.causality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.OrCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getOrCondition()
 * @model
 * @generated
 */
public interface OrCondition extends CausalityCondition {
    /**
     * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.causality.AndCondition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conditions</em>' containment reference list.
     * @see behavior.causality.CausalityPackage#getOrCondition_Conditions()
     * @model containment="true"
     * @generated
     */
    EList<AndCondition> getConditions();

} // OrCondition
