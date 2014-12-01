/**
 */
package behavior.variable.impl;

import behavior.variable.ActivityVariable;
import behavior.variable.VariablePackage;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ActivityVariableImpl extends VariableDeclarationImpl implements ActivityVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.ACTIVITY_VARIABLE;
    }

} //ActivityVariableImpl
