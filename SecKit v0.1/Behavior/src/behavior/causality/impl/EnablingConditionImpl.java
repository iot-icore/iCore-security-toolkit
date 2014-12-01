/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.EnablingCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabling Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnablingConditionImpl extends BinaryCausalityConditionImpl implements EnablingCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnablingConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.ENABLING_CONDITION;
    }

} //EnablingConditionImpl
