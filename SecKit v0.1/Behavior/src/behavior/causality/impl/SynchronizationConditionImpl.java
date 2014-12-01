/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.SynchronizationCondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SynchronizationConditionImpl extends BinaryCausalityConditionImpl implements SynchronizationCondition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronizationConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.SYNCHRONIZATION_CONDITION;
    }

} //SynchronizationConditionImpl
