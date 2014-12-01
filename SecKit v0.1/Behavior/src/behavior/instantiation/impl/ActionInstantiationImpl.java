/**
 */
package behavior.instantiation.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.CausalityParameter;

import behavior.constraint.DataConstraint;

import behavior.instance.Action;
import behavior.instance.InstancePackage;

import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.InstantiationPackage;

import behavior.type.MonolithicBehaviorType;

import java.util.Collection;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.instantiation.impl.ActionInstantiationImpl#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInstantiationImpl extends ActivityInstantiationImpl implements ActionInstantiation {
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
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Action> instances;

    /**
     * The cached value of the '{@link #getBehaviorType() <em>Behavior Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorType()
     * @generated
     * @ordered
     */
    protected MonolithicBehaviorType behaviorType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ACTION_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataConstraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<DataConstraint>(DataConstraint.class, this, InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS);
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
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Action> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Action>(Action.class, this, InstantiationPackage.ACTION_INSTANTIATION__INSTANCES, InstancePackage.ACTION__INSTANTIATION);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonolithicBehaviorType getBehaviorType() {
        if (behaviorType != null && behaviorType.eIsProxy()) {
            InternalEObject oldBehaviorType = (InternalEObject)behaviorType;
            behaviorType = (MonolithicBehaviorType)eResolveProxy(oldBehaviorType);
            if (behaviorType != oldBehaviorType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE, oldBehaviorType, behaviorType));
            }
        }
        return behaviorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonolithicBehaviorType basicGetBehaviorType() {
        return behaviorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorType(MonolithicBehaviorType newBehaviorType) {
        MonolithicBehaviorType oldBehaviorType = behaviorType;
        behaviorType = newBehaviorType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE, oldBehaviorType, behaviorType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS:
                return getConstraints();
            case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE:
                if (resolve) return getBehaviorType();
                return basicGetBehaviorType();
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
            case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends DataConstraint>)newValue);
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Action>)newValue);
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE:
                setBehaviorType((MonolithicBehaviorType)newValue);
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
            case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS:
                getConstraints().clear();
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE:
                setBehaviorType((MonolithicBehaviorType)null);
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
            case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
            case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case InstantiationPackage.ACTION_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.ACTION_INSTANTIATION__BEHAVIOR_TYPE:
                return behaviorType != null;
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
                case InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS: return CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS;
                case InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS: return CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS;
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
                case CausalityPackage.CAUSALITY_PARAMETER__CONSTRAINTS: return InstantiationPackage.ACTION_INSTANTIATION__CONSTRAINTS;
                case CausalityPackage.CAUSALITY_PARAMETER__VARIABLE_ASSIGNMENTS: return InstantiationPackage.ACTION_INSTANTIATION__VARIABLE_ASSIGNMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActionInstantiationImpl
