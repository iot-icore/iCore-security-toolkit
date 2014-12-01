/**
 */
package trust.instance;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see trust.instance.InstanceFactory
 * @model kind="package"
 * @generated
 */
public interface InstancePackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "instance";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://trust/instance/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "instance";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InstancePackage eINSTANCE = trust.instance.impl.InstancePackageImpl.init();

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustRelationshipImpl <em>Trust Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustRelationshipImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustRelationship()
   * @generated
   */
  int TRUST_RELATIONSHIP = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__ASPECT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__DEGREE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__TIMESTAMP = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__TRUSTEE_SCOPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__TRUSTOR = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Trust Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Trust Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.DirectTrustImpl <em>Direct Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.DirectTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getDirectTrust()
   * @generated
   */
  int DIRECT_TRUST = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__ID = TRUST_RELATIONSHIP__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__VISUAL_ELEMENTS = TRUST_RELATIONSHIP__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__ASPECT = TRUST_RELATIONSHIP__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__DEGREE = TRUST_RELATIONSHIP__DEGREE;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__TIMESTAMP = TRUST_RELATIONSHIP__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__TRUSTEE_SCOPE = TRUST_RELATIONSHIP__TRUSTEE_SCOPE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__TRUSTOR = TRUST_RELATIONSHIP__TRUSTOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST__DESCRIPTION = TRUST_RELATIONSHIP__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Direct Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_FEATURE_COUNT = TRUST_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Direct Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_OPERATION_COUNT = TRUST_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.IndirectTrustImpl <em>Indirect Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.IndirectTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getIndirectTrust()
   * @generated
   */
  int INDIRECT_TRUST = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__ID = TRUST_RELATIONSHIP__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__VISUAL_ELEMENTS = TRUST_RELATIONSHIP__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__ASPECT = TRUST_RELATIONSHIP__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__DEGREE = TRUST_RELATIONSHIP__DEGREE;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__TIMESTAMP = TRUST_RELATIONSHIP__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__TRUSTEE_SCOPE = TRUST_RELATIONSHIP__TRUSTEE_SCOPE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__TRUSTOR = TRUST_RELATIONSHIP__TRUSTOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST__DESCRIPTION = TRUST_RELATIONSHIP__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Indirect Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST_FEATURE_COUNT = TRUST_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Indirect Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_TRUST_OPERATION_COUNT = TRUST_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ArbitraryTrustImpl <em>Arbitrary Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ArbitraryTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getArbitraryTrust()
   * @generated
   */
  int ARBITRARY_TRUST = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__ID = DIRECT_TRUST__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__VISUAL_ELEMENTS = DIRECT_TRUST__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__ASPECT = DIRECT_TRUST__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__DEGREE = DIRECT_TRUST__DEGREE;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__TIMESTAMP = DIRECT_TRUST__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__TRUSTEE_SCOPE = DIRECT_TRUST__TRUSTEE_SCOPE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__TRUSTOR = DIRECT_TRUST__TRUSTOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST__DESCRIPTION = DIRECT_TRUST__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Arbitrary Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_FEATURE_COUNT = DIRECT_TRUST_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Arbitrary Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_OPERATION_COUNT = DIRECT_TRUST_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ExperienceTrustImpl <em>Experience Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ExperienceTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getExperienceTrust()
   * @generated
   */
  int EXPERIENCE_TRUST = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__ID = DIRECT_TRUST__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__VISUAL_ELEMENTS = DIRECT_TRUST__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__ASPECT = DIRECT_TRUST__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__DEGREE = DIRECT_TRUST__DEGREE;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__TIMESTAMP = DIRECT_TRUST__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__TRUSTEE_SCOPE = DIRECT_TRUST__TRUSTEE_SCOPE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__TRUSTOR = DIRECT_TRUST__TRUSTOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__DESCRIPTION = DIRECT_TRUST__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST__EVIDENCE = DIRECT_TRUST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Experience Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_FEATURE_COUNT = DIRECT_TRUST_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Experience Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_OPERATION_COUNT = DIRECT_TRUST_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.EvidenceImpl <em>Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.EvidenceImpl
   * @see trust.instance.impl.InstancePackageImpl#getEvidence()
   * @generated
   */
  int EVIDENCE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__TIMESTAMP = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.BeliefEvidenceImpl <em>Belief Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.BeliefEvidenceImpl
   * @see trust.instance.impl.InstancePackageImpl#getBeliefEvidence()
   * @generated
   */
  int BELIEF_EVIDENCE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_EVIDENCE__ID = EVIDENCE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_EVIDENCE__VISUAL_ELEMENTS = EVIDENCE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_EVIDENCE__TIMESTAMP = EVIDENCE__TIMESTAMP;

  /**
   * The number of structural features of the '<em>Belief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Belief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_EVIDENCE_OPERATION_COUNT = EVIDENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.DisbeliefEvidenceImpl <em>Disbelief Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.DisbeliefEvidenceImpl
   * @see trust.instance.impl.InstancePackageImpl#getDisbeliefEvidence()
   * @generated
   */
  int DISBELIEF_EVIDENCE = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISBELIEF_EVIDENCE__ID = EVIDENCE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISBELIEF_EVIDENCE__VISUAL_ELEMENTS = EVIDENCE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISBELIEF_EVIDENCE__TIMESTAMP = EVIDENCE__TIMESTAMP;

  /**
   * The number of structural features of the '<em>Disbelief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISBELIEF_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Disbelief Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISBELIEF_EVIDENCE_OPERATION_COUNT = EVIDENCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrusteeScopeImpl <em>Trustee Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrusteeScopeImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrusteeScope()
   * @generated
   */
  int TRUSTEE_SCOPE = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Trustee Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Trustee Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.DispositionalTrustImpl <em>Dispositional Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.DispositionalTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getDispositionalTrust()
   * @generated
   */
  int DISPOSITIONAL_TRUST = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_TRUST__ID = TRUSTEE_SCOPE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_TRUST__VISUAL_ELEMENTS = TRUSTEE_SCOPE__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Dispositional Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_TRUST_FEATURE_COUNT = TRUSTEE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Dispositional Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_TRUST_OPERATION_COUNT = TRUSTEE_SCOPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.SystemTrustImpl <em>System Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.SystemTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getSystemTrust()
   * @generated
   */
  int SYSTEM_TRUST = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_TRUST__ID = TRUSTEE_SCOPE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_TRUST__VISUAL_ELEMENTS = TRUSTEE_SCOPE__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>System Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_TRUST_FEATURE_COUNT = TRUSTEE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>System Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_TRUST_OPERATION_COUNT = TRUSTEE_SCOPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.SituationalTrustImpl <em>Situational Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.SituationalTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getSituationalTrust()
   * @generated
   */
  int SITUATIONAL_TRUST = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_TRUST__ID = TRUSTEE_SCOPE__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_TRUST__VISUAL_ELEMENTS = TRUSTEE_SCOPE__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Context Situation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_TRUST__CONTEXT_SITUATION = TRUSTEE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Situational Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_TRUST_FEATURE_COUNT = TRUSTEE_SCOPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Situational Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_TRUST_OPERATION_COUNT = TRUSTEE_SCOPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustAspectImpl <em>Trust Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustAspectImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustAspect()
   * @generated
   */
  int TRUST_ASPECT = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trust Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Trust Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASPECT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.EstablishValueImpl <em>Establish Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.EstablishValueImpl
   * @see trust.instance.impl.InstancePackageImpl#getEstablishValue()
   * @generated
   */
  int ESTABLISH_VALUE = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE__ID = TRUST_ASPECT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE__VISUAL_ELEMENTS = TRUST_ASPECT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE__NAME = TRUST_ASPECT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE__DESCRIPTION = TRUST_ASPECT__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Establish Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE_FEATURE_COUNT = TRUST_ASPECT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Establish Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTABLISH_VALUE_OPERATION_COUNT = TRUST_ASPECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.RecommendationQualityImpl <em>Recommendation Quality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.RecommendationQualityImpl
   * @see trust.instance.impl.InstancePackageImpl#getRecommendationQuality()
   * @generated
   */
  int RECOMMENDATION_QUALITY = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY__ID = TRUST_ASPECT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY__VISUAL_ELEMENTS = TRUST_ASPECT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY__NAME = TRUST_ASPECT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY__DESCRIPTION = TRUST_ASPECT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Aspects To Recommend</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND = TRUST_ASPECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Recommendation Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY_FEATURE_COUNT = TRUST_ASPECT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Recommendation Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOMMENDATION_QUALITY_OPERATION_COUNT = TRUST_ASPECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.PersonalTrustImpl <em>Personal Trust</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.PersonalTrustImpl
   * @see trust.instance.impl.InstancePackageImpl#getPersonalTrust()
   * @generated
   */
  int PERSONAL_TRUST = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST__ID = SITUATIONAL_TRUST__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST__VISUAL_ELEMENTS = SITUATIONAL_TRUST__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Context Situation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST__CONTEXT_SITUATION = SITUATIONAL_TRUST__CONTEXT_SITUATION;

  /**
   * The feature id for the '<em><b>Trustee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST__TRUSTEE = SITUATIONAL_TRUST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Personal Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST_FEATURE_COUNT = SITUATIONAL_TRUST_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Personal Trust</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_TRUST_OPERATION_COUNT = SITUATIONAL_TRUST_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustRecommendationImpl <em>Trust Recommendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustRecommendationImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustRecommendation()
   * @generated
   */
  int TRUST_RECOMMENDATION = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION__TRUST_RELATIONSHIP = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION__TIMESTAMP = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Recommender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION__RECOMMENDER = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trust Recommendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Trust Recommendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.LikelihoodMeasurementImpl <em>Likelihood Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.LikelihoodMeasurementImpl
   * @see trust.instance.impl.InstancePackageImpl#getLikelihoodMeasurement()
   * @generated
   */
  int LIKELIHOOD_MEASUREMENT = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKELIHOOD_MEASUREMENT__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKELIHOOD_MEASUREMENT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Likelihood Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKELIHOOD_MEASUREMENT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Likelihood Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKELIHOOD_MEASUREMENT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.SubjectiveLikelihoodImpl <em>Subjective Likelihood</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.SubjectiveLikelihoodImpl
   * @see trust.instance.impl.InstancePackageImpl#getSubjectiveLikelihood()
   * @generated
   */
  int SUBJECTIVE_LIKELIHOOD = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LIKELIHOOD__ID = LIKELIHOOD_MEASUREMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LIKELIHOOD__VISUAL_ELEMENTS = LIKELIHOOD_MEASUREMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Opinion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LIKELIHOOD__OPINION = LIKELIHOOD_MEASUREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subjective Likelihood</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LIKELIHOOD_FEATURE_COUNT = LIKELIHOOD_MEASUREMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Subjective Likelihood</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LIKELIHOOD_OPERATION_COUNT = LIKELIHOOD_MEASUREMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.GoalImpl
   * @see trust.instance.impl.InstancePackageImpl#getGoal()
   * @generated
   */
  int GOAL = 19;

  /**
   * The feature id for the '<em><b>Requirements To Satisfy Goal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REQUIREMENTS_TO_SATISFY_GOAL = 0;

  /**
   * The feature id for the '<em><b>Sub Goal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SUB_GOAL = 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.RequirementImpl
   * @see trust.instance.impl.InstancePackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 20;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustRequirementImpl <em>Trust Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustRequirementImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustRequirement()
   * @generated
   */
  int TRUST_REQUIREMENT = 21;

  /**
   * The feature id for the '<em><b>Trust Belief</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_REQUIREMENT__TRUST_BELIEF = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.DataQualityImpl <em>Data Quality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.DataQualityImpl
   * @see trust.instance.impl.InstancePackageImpl#getDataQuality()
   * @generated
   */
  int DATA_QUALITY = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY__ID = TRUST_ASPECT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY__VISUAL_ELEMENTS = TRUST_ASPECT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY__NAME = TRUST_ASPECT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY__DESCRIPTION = TRUST_ASPECT__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Data Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY_FEATURE_COUNT = TRUST_ASPECT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Data Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUALITY_OPERATION_COUNT = TRUST_ASPECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ContextProvisioningImpl <em>Context Provisioning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ContextProvisioningImpl
   * @see trust.instance.impl.InstancePackageImpl#getContextProvisioning()
   * @generated
   */
  int CONTEXT_PROVISIONING = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING__ID = DATA_QUALITY__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING__VISUAL_ELEMENTS = DATA_QUALITY__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING__NAME = DATA_QUALITY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING__DESCRIPTION = DATA_QUALITY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Context Information Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN = DATA_QUALITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context Provisioning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING_FEATURE_COUNT = DATA_QUALITY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Context Provisioning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_PROVISIONING_OPERATION_COUNT = DATA_QUALITY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ContextSituationEventsProvisioningImpl <em>Context Situation Events Provisioning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ContextSituationEventsProvisioningImpl
   * @see trust.instance.impl.InstancePackageImpl#getContextSituationEventsProvisioning()
   * @generated
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__ID = DATA_QUALITY__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__VISUAL_ELEMENTS = DATA_QUALITY__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__NAME = DATA_QUALITY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__DESCRIPTION = DATA_QUALITY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Detect Situations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS = DATA_QUALITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Report Situations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS = DATA_QUALITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Context Situation Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN = DATA_QUALITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Context Situation Events Provisioning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING_FEATURE_COUNT = DATA_QUALITY_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Context Situation Events Provisioning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SITUATION_EVENTS_PROVISIONING_OPERATION_COUNT = DATA_QUALITY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.IntrinsicBehaviorImpl <em>Intrinsic Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.IntrinsicBehaviorImpl
   * @see trust.instance.impl.InstancePackageImpl#getIntrinsicBehavior()
   * @generated
   */
  int INTRINSIC_BEHAVIOR = 24;

  /**
   * The number of structural features of the '<em>Intrinsic Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_BEHAVIOR_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Intrinsic Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_BEHAVIOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ObservableBehaviorImpl <em>Observable Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ObservableBehaviorImpl
   * @see trust.instance.impl.InstancePackageImpl#getObservableBehavior()
   * @generated
   */
  int OBSERVABLE_BEHAVIOR = 25;

  /**
   * The number of structural features of the '<em>Observable Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVABLE_BEHAVIOR_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Observable Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVABLE_BEHAVIOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.IdentityQualityImpl <em>Identity Quality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.IdentityQualityImpl
   * @see trust.instance.impl.InstancePackageImpl#getIdentityQuality()
   * @generated
   */
  int IDENTITY_QUALITY = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY__ID = DATA_QUALITY__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY__VISUAL_ELEMENTS = DATA_QUALITY__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY__NAME = DATA_QUALITY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY__DESCRIPTION = DATA_QUALITY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Loa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY__LOA = DATA_QUALITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identity Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY_FEATURE_COUNT = DATA_QUALITY_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Identity Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_QUALITY_OPERATION_COUNT = DATA_QUALITY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.EClass0Impl <em>EClass0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.EClass0Impl
   * @see trust.instance.impl.InstancePackageImpl#getEClass0()
   * @generated
   */
  int ECLASS0 = 28;

  /**
   * The number of structural features of the '<em>EClass0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS0_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>EClass0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS0_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustOperatorImpl <em>Trust Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustOperatorImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustOperator()
   * @generated
   */
  int TRUST_OPERATOR = 34;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_OPERATOR__ID = ModelsPackage.ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_OPERATOR__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_OPERATOR__TRUST_PATTERN = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_OPERATOR_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_OPERATOR_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustFusionOperatorImpl <em>Trust Fusion Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustFusionOperatorImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustFusionOperator()
   * @generated
   */
  int TRUST_FUSION_OPERATOR = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR__ID = TRUST_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR__VISUAL_ELEMENTS = TRUST_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR__TRUST_PATTERN = TRUST_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR__OPERANDS = TRUST_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Fusion Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR_FEATURE_COUNT = TRUST_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Fusion Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_FUSION_OPERATOR_OPERATION_COUNT = TRUST_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.SubjectiveLogicConsensusImpl <em>Subjective Logic Consensus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.SubjectiveLogicConsensusImpl
   * @see trust.instance.impl.InstancePackageImpl#getSubjectiveLogicConsensus()
   * @generated
   */
  int SUBJECTIVE_LOGIC_CONSENSUS = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS__ID = TRUST_FUSION_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS__VISUAL_ELEMENTS = TRUST_FUSION_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS__TRUST_PATTERN = TRUST_FUSION_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS__OPERANDS = TRUST_FUSION_OPERATOR__OPERANDS;

  /**
   * The number of structural features of the '<em>Subjective Logic Consensus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS_FEATURE_COUNT = TRUST_FUSION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Subjective Logic Consensus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECTIVE_LOGIC_CONSENSUS_OPERATION_COUNT = TRUST_FUSION_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.WeightedConsensusImpl <em>Weighted Consensus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.WeightedConsensusImpl
   * @see trust.instance.impl.InstancePackageImpl#getWeightedConsensus()
   * @generated
   */
  int WEIGHTED_CONSENSUS = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS__ID = TRUST_FUSION_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS__VISUAL_ELEMENTS = TRUST_FUSION_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS__TRUST_PATTERN = TRUST_FUSION_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS__OPERANDS = TRUST_FUSION_OPERATOR__OPERANDS;

  /**
   * The number of structural features of the '<em>Weighted Consensus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS_FEATURE_COUNT = TRUST_FUSION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Weighted Consensus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEIGHTED_CONSENSUS_OPERATION_COUNT = TRUST_FUSION_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.LevelOfAssuranceImpl <em>Level Of Assurance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.LevelOfAssuranceImpl
   * @see trust.instance.impl.InstancePackageImpl#getLevelOfAssurance()
   * @generated
   */
  int LEVEL_OF_ASSURANCE = 32;

  /**
   * The number of structural features of the '<em>Level Of Assurance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_OF_ASSURANCE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Level Of Assurance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_OF_ASSURANCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.EClass1Impl <em>EClass1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.EClass1Impl
   * @see trust.instance.impl.InstancePackageImpl#getEClass1()
   * @generated
   */
  int ECLASS1 = 33;

  /**
   * The number of structural features of the '<em>EClass1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS1_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>EClass1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.TrustAssessmentOperatorImpl <em>Trust Assessment Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.TrustAssessmentOperatorImpl
   * @see trust.instance.impl.InstancePackageImpl#getTrustAssessmentOperator()
   * @generated
   */
  int TRUST_ASSESSMENT_OPERATOR = 35;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__ID = TRUST_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__VISUAL_ELEMENTS = TRUST_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__TRUST_PATTERN = TRUST_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS = TRUST_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__OPERATOR = TRUST_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__TEMPLATE = TRUST_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__OPERANDS = TRUST_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Trust Fusion Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR = TRUST_OPERATOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR__DEGREE = TRUST_OPERATOR_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Trust Assessment Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR_FEATURE_COUNT = TRUST_OPERATOR_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Trust Assessment Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_ASSESSMENT_OPERATOR_OPERATION_COUNT = TRUST_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.AtLeastImpl <em>At Least</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.AtLeastImpl
   * @see trust.instance.impl.InstancePackageImpl#getAtLeast()
   * @generated
   */
  int AT_LEAST = 36;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__ID = TRUST_ASSESSMENT_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__VISUAL_ELEMENTS = TRUST_ASSESSMENT_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__TRUST_PATTERN = TRUST_ASSESSMENT_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__VARIABLE_ASSIGNMENTS = TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__OPERATOR = TRUST_ASSESSMENT_OPERATOR__OPERATOR;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__TEMPLATE = TRUST_ASSESSMENT_OPERATOR__TEMPLATE;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__OPERANDS = TRUST_ASSESSMENT_OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Trust Fusion Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__TRUST_FUSION_OPERATOR = TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST__DEGREE = TRUST_ASSESSMENT_OPERATOR__DEGREE;

  /**
   * The number of structural features of the '<em>At Least</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_FEATURE_COUNT = TRUST_ASSESSMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>At Least</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_OPERATION_COUNT = TRUST_ASSESSMENT_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.AtMostImpl <em>At Most</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.AtMostImpl
   * @see trust.instance.impl.InstancePackageImpl#getAtMost()
   * @generated
   */
  int AT_MOST = 37;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__ID = TRUST_ASSESSMENT_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__VISUAL_ELEMENTS = TRUST_ASSESSMENT_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__TRUST_PATTERN = TRUST_ASSESSMENT_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__VARIABLE_ASSIGNMENTS = TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__OPERATOR = TRUST_ASSESSMENT_OPERATOR__OPERATOR;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__TEMPLATE = TRUST_ASSESSMENT_OPERATOR__TEMPLATE;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__OPERANDS = TRUST_ASSESSMENT_OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Trust Fusion Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__TRUST_FUSION_OPERATOR = TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST__DEGREE = TRUST_ASSESSMENT_OPERATOR__DEGREE;

  /**
   * The number of structural features of the '<em>At Most</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST_FEATURE_COUNT = TRUST_ASSESSMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>At Most</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_MOST_OPERATION_COUNT = TRUST_ASSESSMENT_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.impl.ExactlyImpl <em>Exactly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.impl.ExactlyImpl
   * @see trust.instance.impl.InstancePackageImpl#getExactly()
   * @generated
   */
  int EXACTLY = 38;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__ID = TRUST_ASSESSMENT_OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__VISUAL_ELEMENTS = TRUST_ASSESSMENT_OPERATOR__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__TRUST_PATTERN = TRUST_ASSESSMENT_OPERATOR__TRUST_PATTERN;

  /**
   * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__VARIABLE_ASSIGNMENTS = TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__OPERATOR = TRUST_ASSESSMENT_OPERATOR__OPERATOR;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__TEMPLATE = TRUST_ASSESSMENT_OPERATOR__TEMPLATE;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__OPERANDS = TRUST_ASSESSMENT_OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Trust Fusion Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__TRUST_FUSION_OPERATOR = TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY__DEGREE = TRUST_ASSESSMENT_OPERATOR__DEGREE;

  /**
   * The number of structural features of the '<em>Exactly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY_FEATURE_COUNT = TRUST_ASSESSMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Exactly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY_OPERATION_COUNT = TRUST_ASSESSMENT_OPERATOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.instance.TrustLevel <em>Trust Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.TrustLevel
   * @see trust.instance.impl.InstancePackageImpl#getTrustLevel()
   * @generated
   */
  int TRUST_LEVEL = 39;

  /**
   * The meta object id for the '{@link trust.instance.LikelihoodLevel <em>Likelihood Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.LikelihoodLevel
   * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevel()
   * @generated
   */
  int LIKELIHOOD_LEVEL = 40;

  /**
   * The meta object id for the '{@link trust.instance.LikelihoodLevelCORAS <em>Likelihood Level CORAS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.LikelihoodLevelCORAS
   * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevelCORAS()
   * @generated
   */
  int LIKELIHOOD_LEVEL_CORAS = 41;

  /**
   * The meta object id for the '{@link trust.instance.UncertaintyLevel <em>Uncertainty Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.UncertaintyLevel
   * @see trust.instance.impl.InstancePackageImpl#getUncertaintyLevel()
   * @generated
   */
  int UNCERTAINTY_LEVEL = 42;

  /**
   * The meta object id for the '{@link trust.instance.LikelihoodLevelSL <em>Likelihood Level SL</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.instance.LikelihoodLevelSL
   * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevelSL()
   * @generated
   */
  int LIKELIHOOD_LEVEL_SL = 43;

  /**
   * The meta object id for the '<em>Subjective Opinion</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dstc.spectrum.opinion.SubjectiveOpinion
   * @see trust.instance.impl.InstancePackageImpl#getSubjectiveOpinion()
   * @generated
   */
  int SUBJECTIVE_OPINION = 44;


  /**
   * Returns the meta object for class '{@link trust.instance.DirectTrust <em>Direct Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Trust</em>'.
   * @see trust.instance.DirectTrust
   * @generated
   */
  EClass getDirectTrust();

  /**
   * Returns the meta object for class '{@link trust.instance.IndirectTrust <em>Indirect Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indirect Trust</em>'.
   * @see trust.instance.IndirectTrust
   * @generated
   */
  EClass getIndirectTrust();

  /**
   * Returns the meta object for class '{@link trust.instance.ArbitraryTrust <em>Arbitrary Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbitrary Trust</em>'.
   * @see trust.instance.ArbitraryTrust
   * @generated
   */
  EClass getArbitraryTrust();

  /**
   * Returns the meta object for class '{@link trust.instance.ExperienceTrust <em>Experience Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experience Trust</em>'.
   * @see trust.instance.ExperienceTrust
   * @generated
   */
  EClass getExperienceTrust();

  /**
   * Returns the meta object for the containment reference list '{@link trust.instance.ExperienceTrust#getEvidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evidence</em>'.
   * @see trust.instance.ExperienceTrust#getEvidence()
   * @see #getExperienceTrust()
   * @generated
   */
  EReference getExperienceTrust_Evidence();

  /**
   * Returns the meta object for class '{@link trust.instance.Evidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evidence</em>'.
   * @see trust.instance.Evidence
   * @generated
   */
  EClass getEvidence();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.Evidence#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timestamp</em>'.
   * @see trust.instance.Evidence#getTimestamp()
   * @see #getEvidence()
   * @generated
   */
  EReference getEvidence_Timestamp();

  /**
   * Returns the meta object for class '{@link trust.instance.BeliefEvidence <em>Belief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief Evidence</em>'.
   * @see trust.instance.BeliefEvidence
   * @generated
   */
  EClass getBeliefEvidence();

  /**
   * Returns the meta object for class '{@link trust.instance.DisbeliefEvidence <em>Disbelief Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disbelief Evidence</em>'.
   * @see trust.instance.DisbeliefEvidence
   * @generated
   */
  EClass getDisbeliefEvidence();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustRelationship <em>Trust Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Relationship</em>'.
   * @see trust.instance.TrustRelationship
   * @generated
   */
  EClass getTrustRelationship();

  /**
   * Returns the meta object for the reference list '{@link trust.instance.TrustRelationship#getAspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Aspect</em>'.
   * @see trust.instance.TrustRelationship#getAspect()
   * @see #getTrustRelationship()
   * @generated
   */
  EReference getTrustRelationship_Aspect();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRelationship#getDegree <em>Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Degree</em>'.
   * @see trust.instance.TrustRelationship#getDegree()
   * @see #getTrustRelationship()
   * @generated
   */
  EReference getTrustRelationship_Degree();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRelationship#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timestamp</em>'.
   * @see trust.instance.TrustRelationship#getTimestamp()
   * @see #getTrustRelationship()
   * @generated
   */
  EReference getTrustRelationship_Timestamp();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRelationship#getTrusteeScope <em>Trustee Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trustee Scope</em>'.
   * @see trust.instance.TrustRelationship#getTrusteeScope()
   * @see #getTrustRelationship()
   * @generated
   */
  EReference getTrustRelationship_TrusteeScope();

  /**
   * Returns the meta object for the reference '{@link trust.instance.TrustRelationship#getTrustor <em>Trustor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trustor</em>'.
   * @see trust.instance.TrustRelationship#getTrustor()
   * @see #getTrustRelationship()
   * @generated
   */
  EReference getTrustRelationship_Trustor();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.TrustRelationship#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see trust.instance.TrustRelationship#getDescription()
   * @see #getTrustRelationship()
   * @generated
   */
  EAttribute getTrustRelationship_Description();

  /**
   * Returns the meta object for class '{@link trust.instance.DispositionalTrust <em>Dispositional Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dispositional Trust</em>'.
   * @see trust.instance.DispositionalTrust
   * @generated
   */
  EClass getDispositionalTrust();

  /**
   * Returns the meta object for class '{@link trust.instance.SystemTrust <em>System Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Trust</em>'.
   * @see trust.instance.SystemTrust
   * @generated
   */
  EClass getSystemTrust();

  /**
   * Returns the meta object for class '{@link trust.instance.SituationalTrust <em>Situational Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situational Trust</em>'.
   * @see trust.instance.SituationalTrust
   * @generated
   */
  EClass getSituationalTrust();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.SituationalTrust#getContextSituation <em>Context Situation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Situation</em>'.
   * @see trust.instance.SituationalTrust#getContextSituation()
   * @see #getSituationalTrust()
   * @generated
   */
  EReference getSituationalTrust_ContextSituation();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustAspect <em>Trust Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Aspect</em>'.
   * @see trust.instance.TrustAspect
   * @generated
   */
  EClass getTrustAspect();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.TrustAspect#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trust.instance.TrustAspect#getName()
   * @see #getTrustAspect()
   * @generated
   */
  EAttribute getTrustAspect_Name();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.TrustAspect#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see trust.instance.TrustAspect#getDescription()
   * @see #getTrustAspect()
   * @generated
   */
  EAttribute getTrustAspect_Description();

  /**
   * Returns the meta object for class '{@link trust.instance.EstablishValue <em>Establish Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Establish Value</em>'.
   * @see trust.instance.EstablishValue
   * @generated
   */
  EClass getEstablishValue();

  /**
   * Returns the meta object for class '{@link trust.instance.RecommendationQuality <em>Recommendation Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recommendation Quality</em>'.
   * @see trust.instance.RecommendationQuality
   * @generated
   */
  EClass getRecommendationQuality();

  /**
   * Returns the meta object for the reference list '{@link trust.instance.RecommendationQuality#getAspectsToRecommend <em>Aspects To Recommend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Aspects To Recommend</em>'.
   * @see trust.instance.RecommendationQuality#getAspectsToRecommend()
   * @see #getRecommendationQuality()
   * @generated
   */
  EReference getRecommendationQuality_AspectsToRecommend();

  /**
   * Returns the meta object for class '{@link trust.instance.PersonalTrust <em>Personal Trust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal Trust</em>'.
   * @see trust.instance.PersonalTrust
   * @generated
   */
  EClass getPersonalTrust();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.PersonalTrust#getTrustee <em>Trustee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trustee</em>'.
   * @see trust.instance.PersonalTrust#getTrustee()
   * @see #getPersonalTrust()
   * @generated
   */
  EReference getPersonalTrust_Trustee();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustRecommendation <em>Trust Recommendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Recommendation</em>'.
   * @see trust.instance.TrustRecommendation
   * @generated
   */
  EClass getTrustRecommendation();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRecommendation#getTrustRelationship <em>Trust Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Relationship</em>'.
   * @see trust.instance.TrustRecommendation#getTrustRelationship()
   * @see #getTrustRecommendation()
   * @generated
   */
  EReference getTrustRecommendation_TrustRelationship();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRecommendation#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timestamp</em>'.
   * @see trust.instance.TrustRecommendation#getTimestamp()
   * @see #getTrustRecommendation()
   * @generated
   */
  EReference getTrustRecommendation_Timestamp();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRecommendation#getRecommender <em>Recommender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Recommender</em>'.
   * @see trust.instance.TrustRecommendation#getRecommender()
   * @see #getTrustRecommendation()
   * @generated
   */
  EReference getTrustRecommendation_Recommender();

  /**
   * Returns the meta object for class '{@link trust.instance.SubjectiveLikelihood <em>Subjective Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subjective Likelihood</em>'.
   * @see trust.instance.SubjectiveLikelihood
   * @generated
   */
  EClass getSubjectiveLikelihood();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.SubjectiveLikelihood#getOpinion <em>Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opinion</em>'.
   * @see trust.instance.SubjectiveLikelihood#getOpinion()
   * @see #getSubjectiveLikelihood()
   * @generated
   */
  EAttribute getSubjectiveLikelihood_Opinion();

  /**
   * Returns the meta object for class '{@link trust.instance.LikelihoodMeasurement <em>Likelihood Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Likelihood Measurement</em>'.
   * @see trust.instance.LikelihoodMeasurement
   * @generated
   */
  EClass getLikelihoodMeasurement();

  /**
   * Returns the meta object for class '{@link trust.instance.TrusteeScope <em>Trustee Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trustee Scope</em>'.
   * @see trust.instance.TrusteeScope
   * @generated
   */
  EClass getTrusteeScope();

  /**
   * Returns the meta object for class '{@link trust.instance.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see trust.instance.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the containment reference list '{@link trust.instance.Goal#getRequirementsToSatisfyGoal <em>Requirements To Satisfy Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements To Satisfy Goal</em>'.
   * @see trust.instance.Goal#getRequirementsToSatisfyGoal()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_RequirementsToSatisfyGoal();

  /**
   * Returns the meta object for the containment reference list '{@link trust.instance.Goal#getSubGoal <em>Sub Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Goal</em>'.
   * @see trust.instance.Goal#getSubGoal()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_SubGoal();

  /**
   * Returns the meta object for class '{@link trust.instance.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see trust.instance.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustRequirement <em>Trust Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Requirement</em>'.
   * @see trust.instance.TrustRequirement
   * @generated
   */
  EClass getTrustRequirement();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustRequirement#getTrustBelief <em>Trust Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Belief</em>'.
   * @see trust.instance.TrustRequirement#getTrustBelief()
   * @see #getTrustRequirement()
   * @generated
   */
  EReference getTrustRequirement_TrustBelief();

  /**
   * Returns the meta object for class '{@link trust.instance.ContextProvisioning <em>Context Provisioning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Provisioning</em>'.
   * @see trust.instance.ContextProvisioning
   * @generated
   */
  EClass getContextProvisioning();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.ContextProvisioning#getContextInformationPattern <em>Context Information Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Information Pattern</em>'.
   * @see trust.instance.ContextProvisioning#getContextInformationPattern()
   * @see #getContextProvisioning()
   * @generated
   */
  EReference getContextProvisioning_ContextInformationPattern();

  /**
   * Returns the meta object for class '{@link trust.instance.ContextSituationEventsProvisioning <em>Context Situation Events Provisioning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Situation Events Provisioning</em>'.
   * @see trust.instance.ContextSituationEventsProvisioning
   * @generated
   */
  EClass getContextSituationEventsProvisioning();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.ContextSituationEventsProvisioning#isDetectSituations <em>Detect Situations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Detect Situations</em>'.
   * @see trust.instance.ContextSituationEventsProvisioning#isDetectSituations()
   * @see #getContextSituationEventsProvisioning()
   * @generated
   */
  EAttribute getContextSituationEventsProvisioning_DetectSituations();

  /**
   * Returns the meta object for the attribute '{@link trust.instance.ContextSituationEventsProvisioning#isReportSituations <em>Report Situations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Report Situations</em>'.
   * @see trust.instance.ContextSituationEventsProvisioning#isReportSituations()
   * @see #getContextSituationEventsProvisioning()
   * @generated
   */
  EAttribute getContextSituationEventsProvisioning_ReportSituations();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.ContextSituationEventsProvisioning#getContextSituationPattern <em>Context Situation Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Situation Pattern</em>'.
   * @see trust.instance.ContextSituationEventsProvisioning#getContextSituationPattern()
   * @see #getContextSituationEventsProvisioning()
   * @generated
   */
  EReference getContextSituationEventsProvisioning_ContextSituationPattern();

  /**
   * Returns the meta object for class '{@link trust.instance.IntrinsicBehavior <em>Intrinsic Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intrinsic Behavior</em>'.
   * @see trust.instance.IntrinsicBehavior
   * @generated
   */
  EClass getIntrinsicBehavior();

  /**
   * Returns the meta object for class '{@link trust.instance.ObservableBehavior <em>Observable Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observable Behavior</em>'.
   * @see trust.instance.ObservableBehavior
   * @generated
   */
  EClass getObservableBehavior();

  /**
   * Returns the meta object for class '{@link trust.instance.DataQuality <em>Data Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Quality</em>'.
   * @see trust.instance.DataQuality
   * @generated
   */
  EClass getDataQuality();

  /**
   * Returns the meta object for class '{@link trust.instance.IdentityQuality <em>Identity Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Quality</em>'.
   * @see trust.instance.IdentityQuality
   * @generated
   */
  EClass getIdentityQuality();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.IdentityQuality#getLoa <em>Loa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loa</em>'.
   * @see trust.instance.IdentityQuality#getLoa()
   * @see #getIdentityQuality()
   * @generated
   */
  EReference getIdentityQuality_Loa();

  /**
   * Returns the meta object for class '{@link trust.instance.EClass0 <em>EClass0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass0</em>'.
   * @see trust.instance.EClass0
   * @generated
   */
  EClass getEClass0();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustFusionOperator <em>Trust Fusion Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Fusion Operator</em>'.
   * @see trust.instance.TrustFusionOperator
   * @generated
   */
  EClass getTrustFusionOperator();

  /**
   * Returns the meta object for the containment reference list '{@link trust.instance.TrustFusionOperator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see trust.instance.TrustFusionOperator#getOperands()
   * @see #getTrustFusionOperator()
   * @generated
   */
  EReference getTrustFusionOperator_Operands();

  /**
   * Returns the meta object for class '{@link trust.instance.SubjectiveLogicConsensus <em>Subjective Logic Consensus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subjective Logic Consensus</em>'.
   * @see trust.instance.SubjectiveLogicConsensus
   * @generated
   */
  EClass getSubjectiveLogicConsensus();

  /**
   * Returns the meta object for class '{@link trust.instance.WeightedConsensus <em>Weighted Consensus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weighted Consensus</em>'.
   * @see trust.instance.WeightedConsensus
   * @generated
   */
  EClass getWeightedConsensus();

  /**
   * Returns the meta object for class '{@link trust.instance.LevelOfAssurance <em>Level Of Assurance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Level Of Assurance</em>'.
   * @see trust.instance.LevelOfAssurance
   * @generated
   */
  EClass getLevelOfAssurance();

  /**
   * Returns the meta object for class '{@link trust.instance.EClass1 <em>EClass1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass1</em>'.
   * @see trust.instance.EClass1
   * @generated
   */
  EClass getEClass1();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustOperator <em>Trust Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Operator</em>'.
   * @see trust.instance.TrustOperator
   * @generated
   */
  EClass getTrustOperator();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustOperator#getTrustPattern <em>Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Pattern</em>'.
   * @see trust.instance.TrustOperator#getTrustPattern()
   * @see #getTrustOperator()
   * @generated
   */
  EReference getTrustOperator_TrustPattern();

  /**
   * Returns the meta object for class '{@link trust.instance.TrustAssessmentOperator <em>Trust Assessment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Assessment Operator</em>'.
   * @see trust.instance.TrustAssessmentOperator
   * @generated
   */
  EClass getTrustAssessmentOperator();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustAssessmentOperator#getTrustFusionOperator <em>Trust Fusion Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Fusion Operator</em>'.
   * @see trust.instance.TrustAssessmentOperator#getTrustFusionOperator()
   * @see #getTrustAssessmentOperator()
   * @generated
   */
  EReference getTrustAssessmentOperator_TrustFusionOperator();

  /**
   * Returns the meta object for the containment reference '{@link trust.instance.TrustAssessmentOperator#getDegree <em>Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Degree</em>'.
   * @see trust.instance.TrustAssessmentOperator#getDegree()
   * @see #getTrustAssessmentOperator()
   * @generated
   */
  EReference getTrustAssessmentOperator_Degree();

  /**
   * Returns the meta object for class '{@link trust.instance.AtLeast <em>At Least</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Least</em>'.
   * @see trust.instance.AtLeast
   * @generated
   */
  EClass getAtLeast();

  /**
   * Returns the meta object for class '{@link trust.instance.AtMost <em>At Most</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Most</em>'.
   * @see trust.instance.AtMost
   * @generated
   */
  EClass getAtMost();

  /**
   * Returns the meta object for class '{@link trust.instance.Exactly <em>Exactly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exactly</em>'.
   * @see trust.instance.Exactly
   * @generated
   */
  EClass getExactly();

  /**
   * Returns the meta object for enum '{@link trust.instance.TrustLevel <em>Trust Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Trust Level</em>'.
   * @see trust.instance.TrustLevel
   * @generated
   */
  EEnum getTrustLevel();

  /**
   * Returns the meta object for enum '{@link trust.instance.LikelihoodLevel <em>Likelihood Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Likelihood Level</em>'.
   * @see trust.instance.LikelihoodLevel
   * @generated
   */
  EEnum getLikelihoodLevel();

  /**
   * Returns the meta object for enum '{@link trust.instance.LikelihoodLevelCORAS <em>Likelihood Level CORAS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Likelihood Level CORAS</em>'.
   * @see trust.instance.LikelihoodLevelCORAS
   * @generated
   */
  EEnum getLikelihoodLevelCORAS();

  /**
   * Returns the meta object for enum '{@link trust.instance.UncertaintyLevel <em>Uncertainty Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Uncertainty Level</em>'.
   * @see trust.instance.UncertaintyLevel
   * @generated
   */
  EEnum getUncertaintyLevel();

  /**
   * Returns the meta object for enum '{@link trust.instance.LikelihoodLevelSL <em>Likelihood Level SL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Likelihood Level SL</em>'.
   * @see trust.instance.LikelihoodLevelSL
   * @generated
   */
  EEnum getLikelihoodLevelSL();

  /**
   * Returns the meta object for data type '{@link com.dstc.spectrum.opinion.SubjectiveOpinion <em>Subjective Opinion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Subjective Opinion</em>'.
   * @see com.dstc.spectrum.opinion.SubjectiveOpinion
   * @model instanceClass="com.dstc.spectrum.opinion.SubjectiveOpinion"
   * @generated
   */
  EDataType getSubjectiveOpinion();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InstanceFactory getInstanceFactory();

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
     * The meta object literal for the '{@link trust.instance.impl.DirectTrustImpl <em>Direct Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.DirectTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getDirectTrust()
     * @generated
     */
    EClass DIRECT_TRUST = eINSTANCE.getDirectTrust();

    /**
     * The meta object literal for the '{@link trust.instance.impl.IndirectTrustImpl <em>Indirect Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.IndirectTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getIndirectTrust()
     * @generated
     */
    EClass INDIRECT_TRUST = eINSTANCE.getIndirectTrust();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ArbitraryTrustImpl <em>Arbitrary Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ArbitraryTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getArbitraryTrust()
     * @generated
     */
    EClass ARBITRARY_TRUST = eINSTANCE.getArbitraryTrust();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ExperienceTrustImpl <em>Experience Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ExperienceTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getExperienceTrust()
     * @generated
     */
    EClass EXPERIENCE_TRUST = eINSTANCE.getExperienceTrust();

    /**
     * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIENCE_TRUST__EVIDENCE = eINSTANCE.getExperienceTrust_Evidence();

    /**
     * The meta object literal for the '{@link trust.instance.impl.EvidenceImpl <em>Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.EvidenceImpl
     * @see trust.instance.impl.InstancePackageImpl#getEvidence()
     * @generated
     */
    EClass EVIDENCE = eINSTANCE.getEvidence();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVIDENCE__TIMESTAMP = eINSTANCE.getEvidence_Timestamp();

    /**
     * The meta object literal for the '{@link trust.instance.impl.BeliefEvidenceImpl <em>Belief Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.BeliefEvidenceImpl
     * @see trust.instance.impl.InstancePackageImpl#getBeliefEvidence()
     * @generated
     */
    EClass BELIEF_EVIDENCE = eINSTANCE.getBeliefEvidence();

    /**
     * The meta object literal for the '{@link trust.instance.impl.DisbeliefEvidenceImpl <em>Disbelief Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.DisbeliefEvidenceImpl
     * @see trust.instance.impl.InstancePackageImpl#getDisbeliefEvidence()
     * @generated
     */
    EClass DISBELIEF_EVIDENCE = eINSTANCE.getDisbeliefEvidence();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustRelationshipImpl <em>Trust Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustRelationshipImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustRelationship()
     * @generated
     */
    EClass TRUST_RELATIONSHIP = eINSTANCE.getTrustRelationship();

    /**
     * The meta object literal for the '<em><b>Aspect</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP__ASPECT = eINSTANCE.getTrustRelationship_Aspect();

    /**
     * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP__DEGREE = eINSTANCE.getTrustRelationship_Degree();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP__TIMESTAMP = eINSTANCE.getTrustRelationship_Timestamp();

    /**
     * The meta object literal for the '<em><b>Trustee Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP__TRUSTEE_SCOPE = eINSTANCE.getTrustRelationship_TrusteeScope();

    /**
     * The meta object literal for the '<em><b>Trustor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP__TRUSTOR = eINSTANCE.getTrustRelationship_Trustor();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUST_RELATIONSHIP__DESCRIPTION = eINSTANCE.getTrustRelationship_Description();

    /**
     * The meta object literal for the '{@link trust.instance.impl.DispositionalTrustImpl <em>Dispositional Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.DispositionalTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getDispositionalTrust()
     * @generated
     */
    EClass DISPOSITIONAL_TRUST = eINSTANCE.getDispositionalTrust();

    /**
     * The meta object literal for the '{@link trust.instance.impl.SystemTrustImpl <em>System Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.SystemTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getSystemTrust()
     * @generated
     */
    EClass SYSTEM_TRUST = eINSTANCE.getSystemTrust();

    /**
     * The meta object literal for the '{@link trust.instance.impl.SituationalTrustImpl <em>Situational Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.SituationalTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getSituationalTrust()
     * @generated
     */
    EClass SITUATIONAL_TRUST = eINSTANCE.getSituationalTrust();

    /**
     * The meta object literal for the '<em><b>Context Situation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITUATIONAL_TRUST__CONTEXT_SITUATION = eINSTANCE.getSituationalTrust_ContextSituation();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustAspectImpl <em>Trust Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustAspectImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustAspect()
     * @generated
     */
    EClass TRUST_ASPECT = eINSTANCE.getTrustAspect();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUST_ASPECT__NAME = eINSTANCE.getTrustAspect_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUST_ASPECT__DESCRIPTION = eINSTANCE.getTrustAspect_Description();

    /**
     * The meta object literal for the '{@link trust.instance.impl.EstablishValueImpl <em>Establish Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.EstablishValueImpl
     * @see trust.instance.impl.InstancePackageImpl#getEstablishValue()
     * @generated
     */
    EClass ESTABLISH_VALUE = eINSTANCE.getEstablishValue();

    /**
     * The meta object literal for the '{@link trust.instance.impl.RecommendationQualityImpl <em>Recommendation Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.RecommendationQualityImpl
     * @see trust.instance.impl.InstancePackageImpl#getRecommendationQuality()
     * @generated
     */
    EClass RECOMMENDATION_QUALITY = eINSTANCE.getRecommendationQuality();

    /**
     * The meta object literal for the '<em><b>Aspects To Recommend</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND = eINSTANCE.getRecommendationQuality_AspectsToRecommend();

    /**
     * The meta object literal for the '{@link trust.instance.impl.PersonalTrustImpl <em>Personal Trust</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.PersonalTrustImpl
     * @see trust.instance.impl.InstancePackageImpl#getPersonalTrust()
     * @generated
     */
    EClass PERSONAL_TRUST = eINSTANCE.getPersonalTrust();

    /**
     * The meta object literal for the '<em><b>Trustee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONAL_TRUST__TRUSTEE = eINSTANCE.getPersonalTrust_Trustee();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustRecommendationImpl <em>Trust Recommendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustRecommendationImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustRecommendation()
     * @generated
     */
    EClass TRUST_RECOMMENDATION = eINSTANCE.getTrustRecommendation();

    /**
     * The meta object literal for the '<em><b>Trust Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RECOMMENDATION__TRUST_RELATIONSHIP = eINSTANCE.getTrustRecommendation_TrustRelationship();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RECOMMENDATION__TIMESTAMP = eINSTANCE.getTrustRecommendation_Timestamp();

    /**
     * The meta object literal for the '<em><b>Recommender</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RECOMMENDATION__RECOMMENDER = eINSTANCE.getTrustRecommendation_Recommender();

    /**
     * The meta object literal for the '{@link trust.instance.impl.SubjectiveLikelihoodImpl <em>Subjective Likelihood</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.SubjectiveLikelihoodImpl
     * @see trust.instance.impl.InstancePackageImpl#getSubjectiveLikelihood()
     * @generated
     */
    EClass SUBJECTIVE_LIKELIHOOD = eINSTANCE.getSubjectiveLikelihood();

    /**
     * The meta object literal for the '<em><b>Opinion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBJECTIVE_LIKELIHOOD__OPINION = eINSTANCE.getSubjectiveLikelihood_Opinion();

    /**
     * The meta object literal for the '{@link trust.instance.impl.LikelihoodMeasurementImpl <em>Likelihood Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.LikelihoodMeasurementImpl
     * @see trust.instance.impl.InstancePackageImpl#getLikelihoodMeasurement()
     * @generated
     */
    EClass LIKELIHOOD_MEASUREMENT = eINSTANCE.getLikelihoodMeasurement();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrusteeScopeImpl <em>Trustee Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrusteeScopeImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrusteeScope()
     * @generated
     */
    EClass TRUSTEE_SCOPE = eINSTANCE.getTrusteeScope();

    /**
     * The meta object literal for the '{@link trust.instance.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.GoalImpl
     * @see trust.instance.impl.InstancePackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Requirements To Satisfy Goal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__REQUIREMENTS_TO_SATISFY_GOAL = eINSTANCE.getGoal_RequirementsToSatisfyGoal();

    /**
     * The meta object literal for the '<em><b>Sub Goal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__SUB_GOAL = eINSTANCE.getGoal_SubGoal();

    /**
     * The meta object literal for the '{@link trust.instance.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.RequirementImpl
     * @see trust.instance.impl.InstancePackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustRequirementImpl <em>Trust Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustRequirementImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustRequirement()
     * @generated
     */
    EClass TRUST_REQUIREMENT = eINSTANCE.getTrustRequirement();

    /**
     * The meta object literal for the '<em><b>Trust Belief</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_REQUIREMENT__TRUST_BELIEF = eINSTANCE.getTrustRequirement_TrustBelief();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ContextProvisioningImpl <em>Context Provisioning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ContextProvisioningImpl
     * @see trust.instance.impl.InstancePackageImpl#getContextProvisioning()
     * @generated
     */
    EClass CONTEXT_PROVISIONING = eINSTANCE.getContextProvisioning();

    /**
     * The meta object literal for the '<em><b>Context Information Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN = eINSTANCE.getContextProvisioning_ContextInformationPattern();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ContextSituationEventsProvisioningImpl <em>Context Situation Events Provisioning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ContextSituationEventsProvisioningImpl
     * @see trust.instance.impl.InstancePackageImpl#getContextSituationEventsProvisioning()
     * @generated
     */
    EClass CONTEXT_SITUATION_EVENTS_PROVISIONING = eINSTANCE.getContextSituationEventsProvisioning();

    /**
     * The meta object literal for the '<em><b>Detect Situations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS = eINSTANCE.getContextSituationEventsProvisioning_DetectSituations();

    /**
     * The meta object literal for the '<em><b>Report Situations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS = eINSTANCE.getContextSituationEventsProvisioning_ReportSituations();

    /**
     * The meta object literal for the '<em><b>Context Situation Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN = eINSTANCE.getContextSituationEventsProvisioning_ContextSituationPattern();

    /**
     * The meta object literal for the '{@link trust.instance.impl.IntrinsicBehaviorImpl <em>Intrinsic Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.IntrinsicBehaviorImpl
     * @see trust.instance.impl.InstancePackageImpl#getIntrinsicBehavior()
     * @generated
     */
    EClass INTRINSIC_BEHAVIOR = eINSTANCE.getIntrinsicBehavior();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ObservableBehaviorImpl <em>Observable Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ObservableBehaviorImpl
     * @see trust.instance.impl.InstancePackageImpl#getObservableBehavior()
     * @generated
     */
    EClass OBSERVABLE_BEHAVIOR = eINSTANCE.getObservableBehavior();

    /**
     * The meta object literal for the '{@link trust.instance.impl.DataQualityImpl <em>Data Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.DataQualityImpl
     * @see trust.instance.impl.InstancePackageImpl#getDataQuality()
     * @generated
     */
    EClass DATA_QUALITY = eINSTANCE.getDataQuality();

    /**
     * The meta object literal for the '{@link trust.instance.impl.IdentityQualityImpl <em>Identity Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.IdentityQualityImpl
     * @see trust.instance.impl.InstancePackageImpl#getIdentityQuality()
     * @generated
     */
    EClass IDENTITY_QUALITY = eINSTANCE.getIdentityQuality();

    /**
     * The meta object literal for the '<em><b>Loa</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTITY_QUALITY__LOA = eINSTANCE.getIdentityQuality_Loa();

    /**
     * The meta object literal for the '{@link trust.instance.impl.EClass0Impl <em>EClass0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.EClass0Impl
     * @see trust.instance.impl.InstancePackageImpl#getEClass0()
     * @generated
     */
    EClass ECLASS0 = eINSTANCE.getEClass0();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustFusionOperatorImpl <em>Trust Fusion Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustFusionOperatorImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustFusionOperator()
     * @generated
     */
    EClass TRUST_FUSION_OPERATOR = eINSTANCE.getTrustFusionOperator();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_FUSION_OPERATOR__OPERANDS = eINSTANCE.getTrustFusionOperator_Operands();

    /**
     * The meta object literal for the '{@link trust.instance.impl.SubjectiveLogicConsensusImpl <em>Subjective Logic Consensus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.SubjectiveLogicConsensusImpl
     * @see trust.instance.impl.InstancePackageImpl#getSubjectiveLogicConsensus()
     * @generated
     */
    EClass SUBJECTIVE_LOGIC_CONSENSUS = eINSTANCE.getSubjectiveLogicConsensus();

    /**
     * The meta object literal for the '{@link trust.instance.impl.WeightedConsensusImpl <em>Weighted Consensus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.WeightedConsensusImpl
     * @see trust.instance.impl.InstancePackageImpl#getWeightedConsensus()
     * @generated
     */
    EClass WEIGHTED_CONSENSUS = eINSTANCE.getWeightedConsensus();

    /**
     * The meta object literal for the '{@link trust.instance.impl.LevelOfAssuranceImpl <em>Level Of Assurance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.LevelOfAssuranceImpl
     * @see trust.instance.impl.InstancePackageImpl#getLevelOfAssurance()
     * @generated
     */
    EClass LEVEL_OF_ASSURANCE = eINSTANCE.getLevelOfAssurance();

    /**
     * The meta object literal for the '{@link trust.instance.impl.EClass1Impl <em>EClass1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.EClass1Impl
     * @see trust.instance.impl.InstancePackageImpl#getEClass1()
     * @generated
     */
    EClass ECLASS1 = eINSTANCE.getEClass1();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustOperatorImpl <em>Trust Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustOperatorImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustOperator()
     * @generated
     */
    EClass TRUST_OPERATOR = eINSTANCE.getTrustOperator();

    /**
     * The meta object literal for the '<em><b>Trust Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_OPERATOR__TRUST_PATTERN = eINSTANCE.getTrustOperator_TrustPattern();

    /**
     * The meta object literal for the '{@link trust.instance.impl.TrustAssessmentOperatorImpl <em>Trust Assessment Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.TrustAssessmentOperatorImpl
     * @see trust.instance.impl.InstancePackageImpl#getTrustAssessmentOperator()
     * @generated
     */
    EClass TRUST_ASSESSMENT_OPERATOR = eINSTANCE.getTrustAssessmentOperator();

    /**
     * The meta object literal for the '<em><b>Trust Fusion Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR = eINSTANCE.getTrustAssessmentOperator_TrustFusionOperator();

    /**
     * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_ASSESSMENT_OPERATOR__DEGREE = eINSTANCE.getTrustAssessmentOperator_Degree();

    /**
     * The meta object literal for the '{@link trust.instance.impl.AtLeastImpl <em>At Least</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.AtLeastImpl
     * @see trust.instance.impl.InstancePackageImpl#getAtLeast()
     * @generated
     */
    EClass AT_LEAST = eINSTANCE.getAtLeast();

    /**
     * The meta object literal for the '{@link trust.instance.impl.AtMostImpl <em>At Most</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.AtMostImpl
     * @see trust.instance.impl.InstancePackageImpl#getAtMost()
     * @generated
     */
    EClass AT_MOST = eINSTANCE.getAtMost();

    /**
     * The meta object literal for the '{@link trust.instance.impl.ExactlyImpl <em>Exactly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.impl.ExactlyImpl
     * @see trust.instance.impl.InstancePackageImpl#getExactly()
     * @generated
     */
    EClass EXACTLY = eINSTANCE.getExactly();

    /**
     * The meta object literal for the '{@link trust.instance.TrustLevel <em>Trust Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.TrustLevel
     * @see trust.instance.impl.InstancePackageImpl#getTrustLevel()
     * @generated
     */
    EEnum TRUST_LEVEL = eINSTANCE.getTrustLevel();

    /**
     * The meta object literal for the '{@link trust.instance.LikelihoodLevel <em>Likelihood Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.LikelihoodLevel
     * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevel()
     * @generated
     */
    EEnum LIKELIHOOD_LEVEL = eINSTANCE.getLikelihoodLevel();

    /**
     * The meta object literal for the '{@link trust.instance.LikelihoodLevelCORAS <em>Likelihood Level CORAS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.LikelihoodLevelCORAS
     * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevelCORAS()
     * @generated
     */
    EEnum LIKELIHOOD_LEVEL_CORAS = eINSTANCE.getLikelihoodLevelCORAS();

    /**
     * The meta object literal for the '{@link trust.instance.UncertaintyLevel <em>Uncertainty Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.UncertaintyLevel
     * @see trust.instance.impl.InstancePackageImpl#getUncertaintyLevel()
     * @generated
     */
    EEnum UNCERTAINTY_LEVEL = eINSTANCE.getUncertaintyLevel();

    /**
     * The meta object literal for the '{@link trust.instance.LikelihoodLevelSL <em>Likelihood Level SL</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.instance.LikelihoodLevelSL
     * @see trust.instance.impl.InstancePackageImpl#getLikelihoodLevelSL()
     * @generated
     */
    EEnum LIKELIHOOD_LEVEL_SL = eINSTANCE.getLikelihoodLevelSL();

    /**
     * The meta object literal for the '<em>Subjective Opinion</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dstc.spectrum.opinion.SubjectiveOpinion
     * @see trust.instance.impl.InstancePackageImpl#getSubjectiveOpinion()
     * @generated
     */
    EDataType SUBJECTIVE_OPINION = eINSTANCE.getSubjectiveOpinion();

  }

} //InstancePackage
