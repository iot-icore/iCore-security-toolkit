/**
 */
package models.variable.impl;

import models.variable.StaticAssignment;
import models.variable.VariablePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StaticAssignmentImpl extends VariableAssignmentImpl implements StaticAssignment {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StaticAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.STATIC_ASSIGNMENT;
    }

} //StaticAssignmentImpl
