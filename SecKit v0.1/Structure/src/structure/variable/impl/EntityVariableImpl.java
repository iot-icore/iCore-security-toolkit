/**
 */
package structure.variable.impl;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

import structure.variable.EntityVariable;
import structure.variable.VariablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class EntityVariableImpl extends VariableDeclarationImpl implements EntityVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.ENTITY_VARIABLE;
    }

} //EntityVariableImpl
