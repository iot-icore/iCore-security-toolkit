/**
 */
package trust.action;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trust.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "action";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://trust/action/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trust-action";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ActionPackage eINSTANCE = trust.action.impl.ActionPackageImpl.init();

  /**
   * The meta object id for the '{@link trust.action.impl.TrustManagementActionImpl <em>Trust Management Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.TrustManagementActionImpl
   * @see trust.action.impl.ActionPackageImpl#getTrustManagementAction()
   * @generated
   */
  int TRUST_MANAGEMENT_ACTION = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION__ID = rule.action.ActionPackage.EXECUTE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION__VISUAL_ELEMENTS = rule.action.ActionPackage.EXECUTE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION__TEMPLATE = rule.action.ActionPackage.EXECUTE__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION__TRUST_PATTERN = rule.action.ActionPackage.EXECUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Management Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION_FEATURE_COUNT = rule.action.ActionPackage.EXECUTE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Management Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_MANAGEMENT_ACTION_OPERATION_COUNT = rule.action.ActionPackage.EXECUTE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.AddEvidenceImpl <em>Add Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.AddEvidenceImpl
   * @see trust.action.impl.ActionPackageImpl#getAddEvidence()
   * @generated
   */
  int ADD_EVIDENCE = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE__ID = TRUST_MANAGEMENT_ACTION__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE__VISUAL_ELEMENTS = TRUST_MANAGEMENT_ACTION__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE__TEMPLATE = TRUST_MANAGEMENT_ACTION__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE__TRUST_PATTERN = TRUST_MANAGEMENT_ACTION__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE__AMOUNT = TRUST_MANAGEMENT_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Add Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE_FEATURE_COUNT = TRUST_MANAGEMENT_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Add Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EVIDENCE_OPERATION_COUNT = TRUST_MANAGEMENT_ACTION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.AddBeliefEvidenceImpl <em>Add Belief Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.AddBeliefEvidenceImpl
   * @see trust.action.impl.ActionPackageImpl#getAddBeliefEvidence()
   * @generated
   */
  int ADD_BELIEF_EVIDENCE = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE__ID = ADD_EVIDENCE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE__VISUAL_ELEMENTS = ADD_EVIDENCE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE__TEMPLATE = ADD_EVIDENCE__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE__TRUST_PATTERN = ADD_EVIDENCE__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE__AMOUNT = ADD_EVIDENCE__AMOUNT;

  /**
   * The number of structural features of the '<em>Add Belief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE_FEATURE_COUNT = ADD_EVIDENCE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Add Belief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_BELIEF_EVIDENCE_OPERATION_COUNT = ADD_EVIDENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.AddDisbeliefEvidenceImpl <em>Add Disbelief Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.AddDisbeliefEvidenceImpl
   * @see trust.action.impl.ActionPackageImpl#getAddDisbeliefEvidence()
   * @generated
   */
  int ADD_DISBELIEF_EVIDENCE = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE__ID = ADD_EVIDENCE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE__VISUAL_ELEMENTS = ADD_EVIDENCE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE__TEMPLATE = ADD_EVIDENCE__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE__TRUST_PATTERN = ADD_EVIDENCE__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE__AMOUNT = ADD_EVIDENCE__AMOUNT;

  /**
   * The number of structural features of the '<em>Add Disbelief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE_FEATURE_COUNT = ADD_EVIDENCE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Add Disbelief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_DISBELIEF_EVIDENCE_OPERATION_COUNT = ADD_EVIDENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.ManageOpinionImpl <em>Manage Opinion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.ManageOpinionImpl
   * @see trust.action.impl.ActionPackageImpl#getManageOpinion()
   * @generated
   */
  int MANAGE_OPINION = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION__ID = TRUST_MANAGEMENT_ACTION__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION__VISUAL_ELEMENTS = TRUST_MANAGEMENT_ACTION__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION__TEMPLATE = TRUST_MANAGEMENT_ACTION__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION__TRUST_PATTERN = TRUST_MANAGEMENT_ACTION__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Opinion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION__OPINION = TRUST_MANAGEMENT_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manage Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION_FEATURE_COUNT = TRUST_MANAGEMENT_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Manage Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGE_OPINION_OPERATION_COUNT = TRUST_MANAGEMENT_ACTION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.FuseOpinionImpl <em>Fuse Opinion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.FuseOpinionImpl
   * @see trust.action.impl.ActionPackageImpl#getFuseOpinion()
   * @generated
   */
  int FUSE_OPINION = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION__ID = MANAGE_OPINION__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION__VISUAL_ELEMENTS = MANAGE_OPINION__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION__TEMPLATE = MANAGE_OPINION__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION__TRUST_PATTERN = MANAGE_OPINION__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Opinion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION__OPINION = MANAGE_OPINION__OPINION;

  /**
   * The number of structural features of the '<em>Fuse Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION_FEATURE_COUNT = MANAGE_OPINION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Fuse Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUSE_OPINION_OPERATION_COUNT = MANAGE_OPINION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.action.impl.SetOpinionImpl <em>Set Opinion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.action.impl.SetOpinionImpl
   * @see trust.action.impl.ActionPackageImpl#getSetOpinion()
   * @generated
   */
  int SET_OPINION = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION__ID = MANAGE_OPINION__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION__VISUAL_ELEMENTS = MANAGE_OPINION__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION__TEMPLATE = MANAGE_OPINION__TEMPLATE;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION__TRUST_PATTERN = MANAGE_OPINION__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Opinion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION__OPINION = MANAGE_OPINION__OPINION;

  /**
   * The number of structural features of the '<em>Set Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION_FEATURE_COUNT = MANAGE_OPINION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Set Opinion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_OPINION_OPERATION_COUNT = MANAGE_OPINION_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link trust.action.TrustManagementAction <em>Trust Management Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Management Action</em>'.
   * @see trust.action.TrustManagementAction
   * @generated
   */
  EClass getTrustManagementAction();

  /**
   * Returns the meta object for the containment reference '{@link trust.action.TrustManagementAction#getTrustPattern <em>Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Pattern</em>'.
   * @see trust.action.TrustManagementAction#getTrustPattern()
   * @see #getTrustManagementAction()
   * @generated
   */
  EReference getTrustManagementAction_TrustPattern();

  /**
   * Returns the meta object for class '{@link trust.action.AddBeliefEvidence <em>Add Belief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Belief Evidence</em>'.
   * @see trust.action.AddBeliefEvidence
   * @generated
   */
  EClass getAddBeliefEvidence();

  /**
   * Returns the meta object for class '{@link trust.action.AddDisbeliefEvidence <em>Add Disbelief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Disbelief Evidence</em>'.
   * @see trust.action.AddDisbeliefEvidence
   * @generated
   */
  EClass getAddDisbeliefEvidence();

  /**
   * Returns the meta object for class '{@link trust.action.AddEvidence <em>Add Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Evidence</em>'.
   * @see trust.action.AddEvidence
   * @generated
   */
  EClass getAddEvidence();

  /**
   * Returns the meta object for the attribute '{@link trust.action.AddEvidence#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see trust.action.AddEvidence#getAmount()
   * @see #getAddEvidence()
   * @generated
   */
  EAttribute getAddEvidence_Amount();

  /**
   * Returns the meta object for class '{@link trust.action.FuseOpinion <em>Fuse Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuse Opinion</em>'.
   * @see trust.action.FuseOpinion
   * @generated
   */
  EClass getFuseOpinion();

  /**
   * Returns the meta object for class '{@link trust.action.SetOpinion <em>Set Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Opinion</em>'.
   * @see trust.action.SetOpinion
   * @generated
   */
  EClass getSetOpinion();

  /**
   * Returns the meta object for class '{@link trust.action.ManageOpinion <em>Manage Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manage Opinion</em>'.
   * @see trust.action.ManageOpinion
   * @generated
   */
  EClass getManageOpinion();

  /**
   * Returns the meta object for the attribute '{@link trust.action.ManageOpinion#getOpinion <em>Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opinion</em>'.
   * @see trust.action.ManageOpinion#getOpinion()
   * @see #getManageOpinion()
   * @generated
   */
  EAttribute getManageOpinion_Opinion();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ActionFactory getActionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link trust.action.impl.TrustManagementActionImpl <em>Trust Management Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.TrustManagementActionImpl
     * @see trust.action.impl.ActionPackageImpl#getTrustManagementAction()
     * @generated
     */
    EClass TRUST_MANAGEMENT_ACTION = eINSTANCE.getTrustManagementAction();

    /**
     * The meta object literal for the '<em><b>Trust Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_MANAGEMENT_ACTION__TRUST_PATTERN = eINSTANCE.getTrustManagementAction_TrustPattern();

    /**
     * The meta object literal for the '{@link trust.action.impl.AddBeliefEvidenceImpl <em>Add Belief Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.AddBeliefEvidenceImpl
     * @see trust.action.impl.ActionPackageImpl#getAddBeliefEvidence()
     * @generated
     */
    EClass ADD_BELIEF_EVIDENCE = eINSTANCE.getAddBeliefEvidence();

    /**
     * The meta object literal for the '{@link trust.action.impl.AddDisbeliefEvidenceImpl <em>Add Disbelief Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.AddDisbeliefEvidenceImpl
     * @see trust.action.impl.ActionPackageImpl#getAddDisbeliefEvidence()
     * @generated
     */
    EClass ADD_DISBELIEF_EVIDENCE = eINSTANCE.getAddDisbeliefEvidence();

    /**
     * The meta object literal for the '{@link trust.action.impl.AddEvidenceImpl <em>Add Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.AddEvidenceImpl
     * @see trust.action.impl.ActionPackageImpl#getAddEvidence()
     * @generated
     */
    EClass ADD_EVIDENCE = eINSTANCE.getAddEvidence();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_EVIDENCE__AMOUNT = eINSTANCE.getAddEvidence_Amount();

    /**
     * The meta object literal for the '{@link trust.action.impl.FuseOpinionImpl <em>Fuse Opinion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.FuseOpinionImpl
     * @see trust.action.impl.ActionPackageImpl#getFuseOpinion()
     * @generated
     */
    EClass FUSE_OPINION = eINSTANCE.getFuseOpinion();

    /**
     * The meta object literal for the '{@link trust.action.impl.SetOpinionImpl <em>Set Opinion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.SetOpinionImpl
     * @see trust.action.impl.ActionPackageImpl#getSetOpinion()
     * @generated
     */
    EClass SET_OPINION = eINSTANCE.getSetOpinion();

    /**
     * The meta object literal for the '{@link trust.action.impl.ManageOpinionImpl <em>Manage Opinion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.action.impl.ManageOpinionImpl
     * @see trust.action.impl.ActionPackageImpl#getManageOpinion()
     * @generated
     */
    EClass MANAGE_OPINION = eINSTANCE.getManageOpinion();

    /**
     * The meta object literal for the '<em><b>Opinion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGE_OPINION__OPINION = eINSTANCE.getManageOpinion_Opinion();

  }

} //ActionPackage
