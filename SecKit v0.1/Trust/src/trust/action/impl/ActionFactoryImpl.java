/**
 */
package trust.action.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trust.action.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ActionFactory init() {
    try {
      ActionFactory theActionFactory = (ActionFactory)EPackage.Registry.INSTANCE.getEFactory(ActionPackage.eNS_URI);
      if (theActionFactory != null) {
        return theActionFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ActionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case ActionPackage.ADD_BELIEF_EVIDENCE: return createAddBeliefEvidence();
      case ActionPackage.ADD_DISBELIEF_EVIDENCE: return createAddDisbeliefEvidence();
      case ActionPackage.FUSE_OPINION: return createFuseOpinion();
      case ActionPackage.SET_OPINION: return createSetOpinion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddBeliefEvidence createAddBeliefEvidence() {
    AddBeliefEvidenceImpl addBeliefEvidence = new AddBeliefEvidenceImpl();
    return addBeliefEvidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddDisbeliefEvidence createAddDisbeliefEvidence() {
    AddDisbeliefEvidenceImpl addDisbeliefEvidence = new AddDisbeliefEvidenceImpl();
    return addDisbeliefEvidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuseOpinion createFuseOpinion() {
    FuseOpinionImpl fuseOpinion = new FuseOpinionImpl();
    return fuseOpinion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetOpinion createSetOpinion() {
    SetOpinionImpl setOpinion = new SetOpinionImpl();
    return setOpinion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionPackage getActionPackage() {
    return (ActionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ActionPackage getPackage() {
    return ActionPackage.eINSTANCE;
  }

} //ActionFactoryImpl
