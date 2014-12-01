/**
 */
package trust.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trust.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ActionFactory eINSTANCE = trust.action.impl.ActionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Add Belief Evidence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Belief Evidence</em>'.
   * @generated
   */
  AddBeliefEvidence createAddBeliefEvidence();

  /**
   * Returns a new object of class '<em>Add Disbelief Evidence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Disbelief Evidence</em>'.
   * @generated
   */
  AddDisbeliefEvidence createAddDisbeliefEvidence();

  /**
   * Returns a new object of class '<em>Fuse Opinion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuse Opinion</em>'.
   * @generated
   */
  FuseOpinion createFuseOpinion();

  /**
   * Returns a new object of class '<em>Set Opinion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Opinion</em>'.
   * @generated
   */
  SetOpinion createSetOpinion();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ActionPackage getActionPackage();

} //ActionFactory
