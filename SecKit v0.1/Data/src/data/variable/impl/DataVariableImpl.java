/**
 */
package data.variable.impl;

import data.variable.DataVariable;
import data.variable.VariablePackage;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DataVariableImpl extends VariableDeclarationImpl implements DataVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.DATA_VARIABLE;
    }

} //DataVariableImpl
