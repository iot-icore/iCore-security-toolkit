/**
 */
package rule.propositional.impl;

import org.eclipse.emf.ecore.EClass;

import rule.condition.impl.OperatorImpl;

import rule.propositional.PropositionalOperator;
import rule.propositional.PropositionalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PropositionalOperatorImpl extends OperatorImpl implements PropositionalOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropositionalOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropositionalPackage.Literals.PROPOSITIONAL_OPERATOR;
    }

} //PropositionalOperatorImpl
