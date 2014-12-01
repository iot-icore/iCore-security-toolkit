/**
 */
package trust.action.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.action.ActionBehavior;
import rule.action.Execute;

import trust.action.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see trust.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ActionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSwitch() {
    if (modelPackage == null) {
      modelPackage = ActionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case ActionPackage.TRUST_MANAGEMENT_ACTION: {
        TrustManagementAction trustManagementAction = (TrustManagementAction)theEObject;
        T result = caseTrustManagementAction(trustManagementAction);
        if (result == null) result = caseExecute(trustManagementAction);
        if (result == null) result = caseActionBehavior(trustManagementAction);
        if (result == null) result = caseElement(trustManagementAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.ADD_BELIEF_EVIDENCE: {
        AddBeliefEvidence addBeliefEvidence = (AddBeliefEvidence)theEObject;
        T result = caseAddBeliefEvidence(addBeliefEvidence);
        if (result == null) result = caseAddEvidence(addBeliefEvidence);
        if (result == null) result = caseTrustManagementAction(addBeliefEvidence);
        if (result == null) result = caseExecute(addBeliefEvidence);
        if (result == null) result = caseActionBehavior(addBeliefEvidence);
        if (result == null) result = caseElement(addBeliefEvidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.ADD_DISBELIEF_EVIDENCE: {
        AddDisbeliefEvidence addDisbeliefEvidence = (AddDisbeliefEvidence)theEObject;
        T result = caseAddDisbeliefEvidence(addDisbeliefEvidence);
        if (result == null) result = caseAddEvidence(addDisbeliefEvidence);
        if (result == null) result = caseTrustManagementAction(addDisbeliefEvidence);
        if (result == null) result = caseExecute(addDisbeliefEvidence);
        if (result == null) result = caseActionBehavior(addDisbeliefEvidence);
        if (result == null) result = caseElement(addDisbeliefEvidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.ADD_EVIDENCE: {
        AddEvidence addEvidence = (AddEvidence)theEObject;
        T result = caseAddEvidence(addEvidence);
        if (result == null) result = caseTrustManagementAction(addEvidence);
        if (result == null) result = caseExecute(addEvidence);
        if (result == null) result = caseActionBehavior(addEvidence);
        if (result == null) result = caseElement(addEvidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.FUSE_OPINION: {
        FuseOpinion fuseOpinion = (FuseOpinion)theEObject;
        T result = caseFuseOpinion(fuseOpinion);
        if (result == null) result = caseManageOpinion(fuseOpinion);
        if (result == null) result = caseTrustManagementAction(fuseOpinion);
        if (result == null) result = caseExecute(fuseOpinion);
        if (result == null) result = caseActionBehavior(fuseOpinion);
        if (result == null) result = caseElement(fuseOpinion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.SET_OPINION: {
        SetOpinion setOpinion = (SetOpinion)theEObject;
        T result = caseSetOpinion(setOpinion);
        if (result == null) result = caseManageOpinion(setOpinion);
        if (result == null) result = caseTrustManagementAction(setOpinion);
        if (result == null) result = caseExecute(setOpinion);
        if (result == null) result = caseActionBehavior(setOpinion);
        if (result == null) result = caseElement(setOpinion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ActionPackage.MANAGE_OPINION: {
        ManageOpinion manageOpinion = (ManageOpinion)theEObject;
        T result = caseManageOpinion(manageOpinion);
        if (result == null) result = caseTrustManagementAction(manageOpinion);
        if (result == null) result = caseExecute(manageOpinion);
        if (result == null) result = caseActionBehavior(manageOpinion);
        if (result == null) result = caseElement(manageOpinion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Management Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Management Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustManagementAction(TrustManagementAction object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Belief Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Belief Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddBeliefEvidence(AddBeliefEvidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Disbelief Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Disbelief Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddDisbeliefEvidence(AddDisbeliefEvidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddEvidence(AddEvidence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuse Opinion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuse Opinion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuseOpinion(FuseOpinion object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Opinion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Opinion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetOpinion(SetOpinion object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Manage Opinion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Manage Opinion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManageOpinion(ManageOpinion object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionBehavior(ActionBehavior object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecute(Execute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //ActionSwitch
