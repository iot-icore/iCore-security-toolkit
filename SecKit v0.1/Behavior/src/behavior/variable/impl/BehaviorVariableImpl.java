/**
 */
package behavior.variable.impl;

import behavior.variable.BehaviorVariable;
import behavior.variable.VariablePackage;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorVariableImpl extends VariableDeclarationImpl implements BehaviorVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.BEHAVIOR_VARIABLE;
    }

} //BehaviorVariableImpl
