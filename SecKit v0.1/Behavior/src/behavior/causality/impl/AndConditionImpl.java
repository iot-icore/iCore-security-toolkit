/**
 */
package behavior.causality.impl;

import behavior.causality.AndCondition;
import behavior.causality.BasicCausalityCondition;
import behavior.causality.CausalityConstraint;
import behavior.causality.CausalityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.AndConditionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link behavior.causality.impl.AndConditionImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndConditionImpl extends CausalityConditionImpl implements AndCondition {
    /**
     * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditions()
     * @generated
     * @ordered
     */
    protected EList<BasicCausalityCondition> conditions;

    /**
     * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraints()
     * @generated
     * @ordered
     */
    protected EList<CausalityConstraint> constraints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AndConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.AND_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BasicCausalityCondition> getConditions() {
        if (conditions == null) {
            conditions = new EObjectContainmentEList<BasicCausalityCondition>(BasicCausalityCondition.class, this, CausalityPackage.AND_CONDITION__CONDITIONS);
        }
        return conditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CausalityConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<CausalityConstraint>(CausalityConstraint.class, this, CausalityPackage.AND_CONDITION__CONSTRAINTS);
        }
        return constraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CausalityPackage.AND_CONDITION__CONDITIONS:
                return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
            case CausalityPackage.AND_CONDITION__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
            case CausalityPackage.AND_CONDITION__CONDITIONS:
                return getConditions();
            case CausalityPackage.AND_CONDITION__CONSTRAINTS:
                return getConstraints();
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
            case CausalityPackage.AND_CONDITION__CONDITIONS:
                getConditions().clear();
                getConditions().addAll((Collection<? extends BasicCausalityCondition>)newValue);
                return;
            case CausalityPackage.AND_CONDITION__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends CausalityConstraint>)newValue);
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
            case CausalityPackage.AND_CONDITION__CONDITIONS:
                getConditions().clear();
                return;
            case CausalityPackage.AND_CONDITION__CONSTRAINTS:
                getConstraints().clear();
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
            case CausalityPackage.AND_CONDITION__CONDITIONS:
                return conditions != null && !conditions.isEmpty();
            case CausalityPackage.AND_CONDITION__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AndConditionImpl
