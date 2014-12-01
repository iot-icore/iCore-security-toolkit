/**
 */
package rule.action.impl;

import org.eclipse.emf.ecore.EClass;

import rule.action.ActionPackage;
import rule.action.Deny;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deny</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DenyImpl extends AuthorizationImpl implements Deny {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DenyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.DENY;
    }

} //DenyImpl
