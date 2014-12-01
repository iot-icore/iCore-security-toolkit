/**
 */
package behavior.instantiation.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.CausalityParameter;

import behavior.constraint.DataConstraint;

import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfType;

import java.util.Collection;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Contribution Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfTypeImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionContributionOfTypeImpl extends AbstractInteractionContributionOfTypeImpl implements InteractionContributionOfType {
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
    protected InteractionContributionOfTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_CONTRIBUTION_OF_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<DataConstraint>(DataConstraint.class, this, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS);
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
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS:
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS:
                return getConstraints();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS:
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends DataConstraint>)newValue);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS:
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS:
                getConstraints().clear();
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS:
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == CausalityParameter.class) {
            switch (derivedFeatureID) {
                case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS: return CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS;
                case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS: return CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == CausalityParameter.class) {
            switch (baseFeatureID) {
                case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS: return InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__CONSTRAINTS;
                case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS: return InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE__VARIABLE_ASSIGNMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InteractionContributionOfTypeImpl
