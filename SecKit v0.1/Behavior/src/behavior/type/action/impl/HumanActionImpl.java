/**
 */
package behavior.type.action.impl;

import behavior.type.action.ActionPackage;
import behavior.type.action.HumanAction;

import behavior.type.impl.ActionTypeImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HumanActionImpl extends ActionTypeImpl implements HumanAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HumanActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.HUMAN_ACTION;
    }

} //HumanActionImpl
