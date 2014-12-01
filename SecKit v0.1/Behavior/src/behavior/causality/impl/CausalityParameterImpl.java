/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.CausalityParameter;

import behavior.constraint.DataConstraint;

import java.util.Collection;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.CausalityParameterImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.causality.impl.CausalityParameterImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CausalityParameterImpl extends MinimalEObjectImpl.Container implements CausalityParameter {
    /**
     * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraints()
     * @generated
     * @ordered
     */
    protected EList<DataConstraint> constraints;

    /**
     * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableAssignments()
     * @generated
     * @ordered
     */
    protected EList<VariableAssignment> variableAssignments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CausalityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.CAUSALITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<DataConstraint>(DataConstraint.class, this, CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS);
        }
        return constraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
            case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS:
                return getConstraints();
            case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends DataConstraint>)newValue);
                return;
            case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS:
                getConstraints().clear();
                return;
            case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
            case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CausalityParameterImpl
