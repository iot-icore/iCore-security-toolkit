/**
 */
package behavior.causality;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.ExitPointOfInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Point Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.causality.ExitPointCondition#getExit <em>Exit</em>}</li>
 *   <li>{@link behavior.causality.ExitPointCondition#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.causality.CausalityPackage#getExitPointCondition()
 * @model
 * @generated
 */
public interface ExitPointCondition extends PointCondition {
    /**
     * Returns the value of the '<em><b>Exit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit</em>' reference.
     * @see #setExit(ExitPointOfInstantiation)
     * @see behavior.causality.CausalityPackage#getExitPointCondition_Exit()
     * @model required="true"
     * @generated
     */
    ExitPointOfInstantiation getExit();

    /**
     * Sets the value of the '{@link behavior.causality.ExitPointCondition#getExit <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit</em>' reference.
     * @see #getExit()
     * @generated
     */
    void setExit(ExitPointOfInstantiation value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference.
     * @see #setContext(BehaviorInstantiation)
     * @see behavior.causality.CausalityPackage#getExitPointCondition_Context()
     * @model
     * @generated
     */
    BehaviorInstantiation getContext();

    /**
     * Sets the value of the '{@link behavior.causality.ExitPointCondition#getContext <em>Context</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' reference.
     * @see #getContext()
     * @generated
     */
    void setContext(BehaviorInstantiation value);

} // ExitPointCondition
