/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;

import rule.condition.impl.OperatorImpl;

import rule.temporal.PastTemporalOperator;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Past Temporal Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PastTemporalOperatorImpl extends OperatorImpl implements PastTemporalOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PastTemporalOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.PAST_TEMPORAL_OPERATOR;
    }

} //PastTemporalOperatorImpl
