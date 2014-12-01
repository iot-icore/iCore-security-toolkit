/**
 */
package models.variable.impl;

import models.impl.ElementImpl;

import models.variable.VariablePackage;
import models.variable.VariableReference;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class VariableReferenceImpl extends ElementImpl implements VariableReference {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.VARIABLE_REFERENCE;
    }

} //VariableReferenceImpl
