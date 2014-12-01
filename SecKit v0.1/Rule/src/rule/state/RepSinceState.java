/**
 */
package rule.state;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rep Since State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.RepSinceState#getUnds <em>Unds</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getRepSinceState()
 * @model
 * @generated
 */
public interface RepSinceState extends RepState {
    /**
     * Returns the value of the '<em><b>Unds</b></em>' containment reference list.
     * The list contents are of type {@link rule.state.CounterState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unds</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unds</em>' containment reference list.
     * @see rule.state.StatePackage#getRepSinceState_Unds()
     * @model containment="true"
     * @generated
     */
    EList<CounterState> getUnds();

} // RepSinceState
