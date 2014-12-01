/**
 */
package trust.instance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.Goal#getRequirementsToSatisfyGoal <em>Requirements To Satisfy Goal</em>}</li>
 *   <li>{@link trust.instance.Goal#getSubGoal <em>Sub Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getGoal()
 * @model abstract="true"
 * @generated
 */
public interface Goal extends EObject {
  /**
   * Returns the value of the '<em><b>Requirements To Satisfy Goal</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements To Satisfy Goal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements To Satisfy Goal</em>' containment reference list.
   * @see trust.instance.InstancePackage#getGoal_RequirementsToSatisfyGoal()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Requirement> getRequirementsToSatisfyGoal();

  /**
   * Returns the value of the '<em><b>Sub Goal</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Goal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Goal</em>' containment reference list.
   * @see trust.instance.InstancePackage#getGoal_SubGoal()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getSubGoal();

} // Goal
