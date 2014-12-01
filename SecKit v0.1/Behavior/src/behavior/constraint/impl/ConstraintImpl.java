/**
 */
package behavior.constraint.impl;

import behavior.constraint.Constraint;
import behavior.constraint.ConstraintPackage;

import models.impl.ElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends ElementImpl implements Constraint {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstraintPackage.Literals.CONSTRAINT;
    }

} //ConstraintImpl
