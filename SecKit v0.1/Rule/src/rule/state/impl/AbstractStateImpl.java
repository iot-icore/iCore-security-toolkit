/**
 */
package rule.state.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.ecore.EClass;

import rule.state.AbstractState;
import rule.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends ElementImpl implements AbstractState {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.ABSTRACT_STATE;
    }

} //AbstractStateImpl
