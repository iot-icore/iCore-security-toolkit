/**
 */
package trust.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trust.instance.Goal;
import trust.instance.InstancePackage;
import trust.instance.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.GoalImpl#getRequirementsToSatisfyGoal <em>Requirements To Satisfy Goal</em>}</li>
 *   <li>{@link trust.instance.impl.GoalImpl#getSubGoal <em>Sub Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GoalImpl extends MinimalEObjectImpl.Container implements Goal {
  /**
   * The cached value of the '{@link #getRequirementsToSatisfyGoal() <em>Requirements To Satisfy Goal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirementsToSatisfyGoal()
   * @generated
   * @ordered
   */
  protected EList<Requirement> requirementsToSatisfyGoal;

  /**
   * The cached value of the '{@link #getSubGoal() <em>Sub Goal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubGoal()
   * @generated
   * @ordered
   */
  protected EList<Goal> subGoal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRequirementsToSatisfyGoal() {
    if (requirementsToSatisfyGoal == null) {
      requirementsToSatisfyGoal = new EObjectContainmentEList<Requirement>(Requirement.class, this, InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL);
    }
    return requirementsToSatisfyGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getSubGoal() {
    if (subGoal == null) {
      subGoal = new EObjectContainmentEList<Goal>(Goal.class, this, InstancePackage.GOAL__SUB_GOAL);
    }
    return subGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL:
        return ((InternalEList<?>)getRequirementsToSatisfyGoal()).basicRemove(otherEnd, msgs);
      case InstancePackage.GOAL__SUB_GOAL:
        return ((InternalEList<?>)getSubGoal()).basicRemove(otherEnd, msgs);
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
      case InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL:
        return getRequirementsToSatisfyGoal();
      case InstancePackage.GOAL__SUB_GOAL:
        return getSubGoal();
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
      case InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL:
        getRequirementsToSatisfyGoal().clear();
        getRequirementsToSatisfyGoal().addAll((Collection<? extends Requirement>)newValue);
        return;
      case InstancePackage.GOAL__SUB_GOAL:
        getSubGoal().clear();
        getSubGoal().addAll((Collection<? extends Goal>)newValue);
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
      case InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL:
        getRequirementsToSatisfyGoal().clear();
        return;
      case InstancePackage.GOAL__SUB_GOAL:
        getSubGoal().clear();
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
      case InstancePackage.GOAL__REQUIREMENTS_TO_SATISFY_GOAL:
        return requirementsToSatisfyGoal != null && !requirementsToSatisfyGoal.isEmpty();
      case InstancePackage.GOAL__SUB_GOAL:
        return subGoal != null && !subGoal.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GoalImpl
