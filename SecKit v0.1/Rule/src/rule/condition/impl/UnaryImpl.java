/**
 */
package rule.condition.impl;

import org.eclipse.emf.ecore.EClass;

import rule.condition.ConditionPackage;
import rule.condition.Unary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class UnaryImpl extends ArityImpl implements Unary {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.UNARY;
    }

} //UnaryImpl
