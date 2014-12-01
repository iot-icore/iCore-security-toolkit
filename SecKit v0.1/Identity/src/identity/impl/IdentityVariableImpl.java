/**
 */
package identity.impl;

import identity.IdentityPackage;
import identity.IdentityVariable;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class IdentityVariableImpl extends VariableDeclarationImpl implements IdentityVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IdentityPackage.Literals.IDENTITY_VARIABLE;
    }

} //IdentityVariableImpl
