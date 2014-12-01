/**
 */
package behavior.variable.impl;

import behavior.variable.FlowPointVariable;
import behavior.variable.VariablePackage;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Point Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FlowPointVariableImpl extends VariableDeclarationImpl implements FlowPointVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowPointVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.FLOW_POINT_VARIABLE;
    }

} //FlowPointVariableImpl
