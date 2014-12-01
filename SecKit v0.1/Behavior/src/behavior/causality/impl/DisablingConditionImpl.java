/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.DisablingCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disabling Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DisablingConditionImpl extends BinaryCausalityConditionImpl implements DisablingCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DisablingConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.DISABLING_CONDITION;
    }

} //DisablingConditionImpl
