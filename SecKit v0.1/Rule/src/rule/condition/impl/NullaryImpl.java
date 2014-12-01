/**
 */
package rule.condition.impl;

import org.eclipse.emf.ecore.EClass;

import rule.condition.ConditionPackage;
import rule.condition.Nullary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nullary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class NullaryImpl extends ArityImpl implements Nullary {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NullaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.NULLARY;
    }

} //NullaryImpl
