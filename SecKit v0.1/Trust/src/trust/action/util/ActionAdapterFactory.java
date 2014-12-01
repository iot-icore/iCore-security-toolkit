/**
 */
package trust.action.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.action.ActionBehavior;
import rule.action.Execute;

import trust.action.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trust.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ActionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = ActionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionSwitch<Adapter> modelSwitch =
    new ActionSwitch<Adapter>() {
      @Override
      public Adapter caseTrustManagementAction(TrustManagementAction object) {
        return createTrustManagementActionAdapter();
      }
      @Override
      public Adapter caseAddBeliefEvidence(AddBeliefEvidence object) {
        return createAddBeliefEvidenceAdapter();
      }
      @Override
      public Adapter caseAddDisbeliefEvidence(AddDisbeliefEvidence object) {
        return createAddDisbeliefEvidenceAdapter();
      }
      @Override
      public Adapter caseAddEvidence(AddEvidence object) {
        return createAddEvidenceAdapter();
      }
      @Override
      public Adapter caseFuseOpinion(FuseOpinion object) {
        return createFuseOpinionAdapter();
      }
      @Override
      public Adapter caseSetOpinion(SetOpinion object) {
        return createSetOpinionAdapter();
      }
      @Override
      public Adapter caseManageOpinion(ManageOpinion object) {
        return createManageOpinionAdapter();
      }
      @Override
      public Adapter caseElement(Element object) {
        return createElementAdapter();
      }
      @Override
      public Adapter caseActionBehavior(ActionBehavior object) {
        return createActionBehaviorAdapter();
      }
      @Override
      public Adapter caseExecute(Execute object) {
        return createExecuteAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link trust.action.TrustManagementAction <em>Trust Management Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.TrustManagementAction
   * @generated
   */
  public Adapter createTrustManagementActionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.AddBeliefEvidence <em>Add Belief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.AddBeliefEvidence
   * @generated
   */
  public Adapter createAddBeliefEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.AddDisbeliefEvidence <em>Add Disbelief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.AddDisbeliefEvidence
   * @generated
   */
  public Adapter createAddDisbeliefEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.AddEvidence <em>Add Evidence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.AddEvidence
   * @generated
   */
  public Adapter createAddEvidenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.FuseOpinion <em>Fuse Opinion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.FuseOpinion
   * @generated
   */
  public Adapter createFuseOpinionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.SetOpinion <em>Set Opinion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.SetOpinion
   * @generated
   */
  public Adapter createSetOpinionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.action.ManageOpinion <em>Manage Opinion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.action.ManageOpinion
   * @generated
   */
  public Adapter createManageOpinionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see models.Element
   * @generated
   */
  public Adapter createElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rule.action.ActionBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rule.action.ActionBehavior
   * @generated
   */
  public Adapter createActionBehaviorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rule.action.Execute <em>Execute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rule.action.Execute
   * @generated
   */
  public Adapter createExecuteAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //ActionAdapterFactory
