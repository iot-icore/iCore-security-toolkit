/**
 */
package trust.pattern;

import models.ModelsPackage;

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
 * @see trust.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pattern";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://trust/pattern/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trust-pattern";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PatternPackage eINSTANCE = trust.pattern.impl.PatternPackageImpl.init();

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrustPatternImpl <em>Trust Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrustPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrustPattern()
   * @generated
   */
  int TRUST_PATTERN = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_PATTERN__ID = ModelsPackage.PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrustRelationshipPatternImpl <em>Trust Relationship Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrustRelationshipPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrustRelationshipPattern()
   * @generated
   */
  int TRUST_RELATIONSHIP_PATTERN = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__ID = TRUST_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__VISUAL_ELEMENTS = TRUST_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__ASPECT = TRUST_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__DEGREE = TRUST_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__TRUSTOR = TRUST_PATTERN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL = TRUST_PATTERN_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE = TRUST_PATTERN_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Trust Relationship Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN_FEATURE_COUNT = TRUST_PATTERN_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Trust Relationship Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RELATIONSHIP_PATTERN_OPERATION_COUNT = TRUST_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrustDegreePatternImpl <em>Trust Degree Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrustDegreePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrustDegreePattern()
   * @generated
   */
  int TRUST_DEGREE_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DEGREE_PATTERN__ID = ModelsPackage.PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DEGREE_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DEGREE_PATTERN__DEGREE = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Degree Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DEGREE_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Degree Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DEGREE_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrustRecommendationPatternImpl <em>Trust Recommendation Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrustRecommendationPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrustRecommendationPattern()
   * @generated
   */
  int TRUST_RECOMMENDATION_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN__ID = TRUST_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN__VISUAL_ELEMENTS = TRUST_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Recommender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN__RECOMMENDER = TRUST_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trust Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP = TRUST_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trust Recommendation Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN_FEATURE_COUNT = TRUST_PATTERN_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Trust Recommendation Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RECOMMENDATION_PATTERN_OPERATION_COUNT = TRUST_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrusteeScopePatternImpl <em>Trustee Scope Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrusteeScopePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrusteeScopePattern()
   * @generated
   */
  int TRUSTEE_SCOPE_PATTERN = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_PATTERN__ID = ModelsPackage.PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Trustee Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Trustee Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTEE_SCOPE_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.DispositionalScopePatternImpl <em>Dispositional Scope Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.DispositionalScopePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getDispositionalScopePattern()
   * @generated
   */
  int DISPOSITIONAL_SCOPE_PATTERN = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_SCOPE_PATTERN__ID = TRUSTEE_SCOPE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_SCOPE_PATTERN__VISUAL_ELEMENTS = TRUSTEE_SCOPE_PATTERN__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Dispositional Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_SCOPE_PATTERN_FEATURE_COUNT = TRUSTEE_SCOPE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Dispositional Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPOSITIONAL_SCOPE_PATTERN_OPERATION_COUNT = TRUSTEE_SCOPE_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.SystemScopePatternImpl <em>System Scope Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.SystemScopePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getSystemScopePattern()
   * @generated
   */
  int SYSTEM_SCOPE_PATTERN = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_SCOPE_PATTERN__ID = TRUSTEE_SCOPE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_SCOPE_PATTERN__VISUAL_ELEMENTS = TRUSTEE_SCOPE_PATTERN__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>System Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_SCOPE_PATTERN_FEATURE_COUNT = TRUSTEE_SCOPE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>System Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_SCOPE_PATTERN_OPERATION_COUNT = TRUSTEE_SCOPE_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.SituationalScopePatternImpl <em>Situational Scope Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.SituationalScopePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getSituationalScopePattern()
   * @generated
   */
  int SITUATIONAL_SCOPE_PATTERN = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_SCOPE_PATTERN__ID = TRUSTEE_SCOPE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_SCOPE_PATTERN__VISUAL_ELEMENTS = TRUSTEE_SCOPE_PATTERN__VISUAL_ELEMENTS;

  /**
   * The number of structural features of the '<em>Situational Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_SCOPE_PATTERN_FEATURE_COUNT = TRUSTEE_SCOPE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Situational Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATIONAL_SCOPE_PATTERN_OPERATION_COUNT = TRUSTEE_SCOPE_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.PersonalScopePatternImpl <em>Personal Scope Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.PersonalScopePatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getPersonalScopePattern()
   * @generated
   */
  int PERSONAL_SCOPE_PATTERN = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_SCOPE_PATTERN__ID = SITUATIONAL_SCOPE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_SCOPE_PATTERN__VISUAL_ELEMENTS = SITUATIONAL_SCOPE_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Trustee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_SCOPE_PATTERN__TRUSTEE = SITUATIONAL_SCOPE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Personal Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_SCOPE_PATTERN_FEATURE_COUNT = SITUATIONAL_SCOPE_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Personal Scope Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_SCOPE_PATTERN_OPERATION_COUNT = SITUATIONAL_SCOPE_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.TrustLevelPatternImpl <em>Trust Level Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.TrustLevelPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getTrustLevelPattern()
   * @generated
   */
  int TRUST_LEVEL_PATTERN = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN__ID = TRUST_DEGREE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN__VISUAL_ELEMENTS = TRUST_DEGREE_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN__DEGREE = TRUST_DEGREE_PATTERN__DEGREE;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN__LEVEL = TRUST_DEGREE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trust Level Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN_FEATURE_COUNT = TRUST_DEGREE_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Trust Level Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_LEVEL_PATTERN_OPERATION_COUNT = TRUST_DEGREE_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.DirectTrustPatternImpl <em>Direct Trust Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.DirectTrustPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getDirectTrustPattern()
   * @generated
   */
  int DIRECT_TRUST_PATTERN = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__ID = TRUST_RELATIONSHIP_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__VISUAL_ELEMENTS = TRUST_RELATIONSHIP_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__ASPECT = TRUST_RELATIONSHIP_PATTERN__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__DEGREE = TRUST_RELATIONSHIP_PATTERN__DEGREE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__TRUSTOR = TRUST_RELATIONSHIP_PATTERN__TRUSTOR;

  /**
   * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__TIME_INTERVAL = TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN__TRUSTEE_SCOPE = TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE;

  /**
   * The number of structural features of the '<em>Direct Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN_FEATURE_COUNT = TRUST_RELATIONSHIP_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Direct Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_TRUST_PATTERN_OPERATION_COUNT = TRUST_RELATIONSHIP_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.ArbitraryTrustPatternImpl <em>Arbitrary Trust Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.ArbitraryTrustPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getArbitraryTrustPattern()
   * @generated
   */
  int ARBITRARY_TRUST_PATTERN = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__ID = DIRECT_TRUST_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__VISUAL_ELEMENTS = DIRECT_TRUST_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__ASPECT = DIRECT_TRUST_PATTERN__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__DEGREE = DIRECT_TRUST_PATTERN__DEGREE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__TRUSTOR = DIRECT_TRUST_PATTERN__TRUSTOR;

  /**
   * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__TIME_INTERVAL = DIRECT_TRUST_PATTERN__TIME_INTERVAL;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN__TRUSTEE_SCOPE = DIRECT_TRUST_PATTERN__TRUSTEE_SCOPE;

  /**
   * The number of structural features of the '<em>Arbitrary Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN_FEATURE_COUNT = DIRECT_TRUST_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Arbitrary Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_TRUST_PATTERN_OPERATION_COUNT = DIRECT_TRUST_PATTERN_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.pattern.impl.ExperienceTrustPatternImpl <em>Experience Trust Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.pattern.impl.ExperienceTrustPatternImpl
   * @see trust.pattern.impl.PatternPackageImpl#getExperienceTrustPattern()
   * @generated
   */
  int EXPERIENCE_TRUST_PATTERN = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__ID = DIRECT_TRUST_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__VISUAL_ELEMENTS = DIRECT_TRUST_PATTERN__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Aspect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__ASPECT = DIRECT_TRUST_PATTERN__ASPECT;

  /**
   * The feature id for the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__DEGREE = DIRECT_TRUST_PATTERN__DEGREE;

  /**
   * The feature id for the '<em><b>Trustor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__TRUSTOR = DIRECT_TRUST_PATTERN__TRUSTOR;

  /**
   * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__TIME_INTERVAL = DIRECT_TRUST_PATTERN__TIME_INTERVAL;

  /**
   * The feature id for the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN__TRUSTEE_SCOPE = DIRECT_TRUST_PATTERN__TRUSTEE_SCOPE;

  /**
   * The number of structural features of the '<em>Experience Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN_FEATURE_COUNT = DIRECT_TRUST_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Experience Trust Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIENCE_TRUST_PATTERN_OPERATION_COUNT = DIRECT_TRUST_PATTERN_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link trust.pattern.TrustRelationshipPattern <em>Trust Relationship Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Relationship Pattern</em>'.
   * @see trust.pattern.TrustRelationshipPattern
   * @generated
   */
  EClass getTrustRelationshipPattern();

  /**
   * Returns the meta object for the reference '{@link trust.pattern.TrustRelationshipPattern#getAspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aspect</em>'.
   * @see trust.pattern.TrustRelationshipPattern#getAspect()
   * @see #getTrustRelationshipPattern()
   * @generated
   */
  EReference getTrustRelationshipPattern_Aspect();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRelationshipPattern#getDegree <em>Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Degree</em>'.
   * @see trust.pattern.TrustRelationshipPattern#getDegree()
   * @see #getTrustRelationshipPattern()
   * @generated
   */
  EReference getTrustRelationshipPattern_Degree();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRelationshipPattern#getTrustor <em>Trustor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trustor</em>'.
   * @see trust.pattern.TrustRelationshipPattern#getTrustor()
   * @see #getTrustRelationshipPattern()
   * @generated
   */
  EReference getTrustRelationshipPattern_Trustor();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRelationshipPattern#getTimeInterval <em>Time Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Interval</em>'.
   * @see trust.pattern.TrustRelationshipPattern#getTimeInterval()
   * @see #getTrustRelationshipPattern()
   * @generated
   */
  EReference getTrustRelationshipPattern_TimeInterval();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRelationshipPattern#getTrusteeScope <em>Trustee Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trustee Scope</em>'.
   * @see trust.pattern.TrustRelationshipPattern#getTrusteeScope()
   * @see #getTrustRelationshipPattern()
   * @generated
   */
  EReference getTrustRelationshipPattern_TrusteeScope();

  /**
   * Returns the meta object for class '{@link trust.pattern.TrustDegreePattern <em>Trust Degree Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Degree Pattern</em>'.
   * @see trust.pattern.TrustDegreePattern
   * @generated
   */
  EClass getTrustDegreePattern();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustDegreePattern#getDegree <em>Degree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Degree</em>'.
   * @see trust.pattern.TrustDegreePattern#getDegree()
   * @see #getTrustDegreePattern()
   * @generated
   */
  EReference getTrustDegreePattern_Degree();

  /**
   * Returns the meta object for class '{@link trust.pattern.TrustRecommendationPattern <em>Trust Recommendation Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Recommendation Pattern</em>'.
   * @see trust.pattern.TrustRecommendationPattern
   * @generated
   */
  EClass getTrustRecommendationPattern();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRecommendationPattern#getRecommender <em>Recommender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Recommender</em>'.
   * @see trust.pattern.TrustRecommendationPattern#getRecommender()
   * @see #getTrustRecommendationPattern()
   * @generated
   */
  EReference getTrustRecommendationPattern_Recommender();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.TrustRecommendationPattern#getTrustRelationship <em>Trust Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trust Relationship</em>'.
   * @see trust.pattern.TrustRecommendationPattern#getTrustRelationship()
   * @see #getTrustRecommendationPattern()
   * @generated
   */
  EReference getTrustRecommendationPattern_TrustRelationship();

  /**
   * Returns the meta object for class '{@link trust.pattern.TrustPattern <em>Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Pattern</em>'.
   * @see trust.pattern.TrustPattern
   * @generated
   */
  EClass getTrustPattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.TrusteeScopePattern <em>Trustee Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trustee Scope Pattern</em>'.
   * @see trust.pattern.TrusteeScopePattern
   * @generated
   */
  EClass getTrusteeScopePattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.DispositionalScopePattern <em>Dispositional Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dispositional Scope Pattern</em>'.
   * @see trust.pattern.DispositionalScopePattern
   * @generated
   */
  EClass getDispositionalScopePattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.SystemScopePattern <em>System Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Scope Pattern</em>'.
   * @see trust.pattern.SystemScopePattern
   * @generated
   */
  EClass getSystemScopePattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.SituationalScopePattern <em>Situational Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situational Scope Pattern</em>'.
   * @see trust.pattern.SituationalScopePattern
   * @generated
   */
  EClass getSituationalScopePattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.PersonalScopePattern <em>Personal Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal Scope Pattern</em>'.
   * @see trust.pattern.PersonalScopePattern
   * @generated
   */
  EClass getPersonalScopePattern();

  /**
   * Returns the meta object for the containment reference '{@link trust.pattern.PersonalScopePattern#getTrustee <em>Trustee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trustee</em>'.
   * @see trust.pattern.PersonalScopePattern#getTrustee()
   * @see #getPersonalScopePattern()
   * @generated
   */
  EReference getPersonalScopePattern_Trustee();

  /**
   * Returns the meta object for class '{@link trust.pattern.TrustLevelPattern <em>Trust Level Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trust Level Pattern</em>'.
   * @see trust.pattern.TrustLevelPattern
   * @generated
   */
  EClass getTrustLevelPattern();

  /**
   * Returns the meta object for the attribute '{@link trust.pattern.TrustLevelPattern#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see trust.pattern.TrustLevelPattern#getLevel()
   * @see #getTrustLevelPattern()
   * @generated
   */
  EAttribute getTrustLevelPattern_Level();

  /**
   * Returns the meta object for class '{@link trust.pattern.DirectTrustPattern <em>Direct Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Trust Pattern</em>'.
   * @see trust.pattern.DirectTrustPattern
   * @generated
   */
  EClass getDirectTrustPattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.ArbitraryTrustPattern <em>Arbitrary Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbitrary Trust Pattern</em>'.
   * @see trust.pattern.ArbitraryTrustPattern
   * @generated
   */
  EClass getArbitraryTrustPattern();

  /**
   * Returns the meta object for class '{@link trust.pattern.ExperienceTrustPattern <em>Experience Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experience Trust Pattern</em>'.
   * @see trust.pattern.ExperienceTrustPattern
   * @generated
   */
  EClass getExperienceTrustPattern();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PatternFactory getPatternFactory();

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
     * The meta object literal for the '{@link trust.pattern.impl.TrustRelationshipPatternImpl <em>Trust Relationship Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrustRelationshipPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrustRelationshipPattern()
     * @generated
     */
    EClass TRUST_RELATIONSHIP_PATTERN = eINSTANCE.getTrustRelationshipPattern();

    /**
     * The meta object literal for the '<em><b>Aspect</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP_PATTERN__ASPECT = eINSTANCE.getTrustRelationshipPattern_Aspect();

    /**
     * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP_PATTERN__DEGREE = eINSTANCE.getTrustRelationshipPattern_Degree();

    /**
     * The meta object literal for the '<em><b>Trustor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP_PATTERN__TRUSTOR = eINSTANCE.getTrustRelationshipPattern_Trustor();

    /**
     * The meta object literal for the '<em><b>Time Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL = eINSTANCE.getTrustRelationshipPattern_TimeInterval();

    /**
     * The meta object literal for the '<em><b>Trustee Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE = eINSTANCE.getTrustRelationshipPattern_TrusteeScope();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.TrustDegreePatternImpl <em>Trust Degree Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrustDegreePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrustDegreePattern()
     * @generated
     */
    EClass TRUST_DEGREE_PATTERN = eINSTANCE.getTrustDegreePattern();

    /**
     * The meta object literal for the '<em><b>Degree</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_DEGREE_PATTERN__DEGREE = eINSTANCE.getTrustDegreePattern_Degree();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.TrustRecommendationPatternImpl <em>Trust Recommendation Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrustRecommendationPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrustRecommendationPattern()
     * @generated
     */
    EClass TRUST_RECOMMENDATION_PATTERN = eINSTANCE.getTrustRecommendationPattern();

    /**
     * The meta object literal for the '<em><b>Recommender</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RECOMMENDATION_PATTERN__RECOMMENDER = eINSTANCE.getTrustRecommendationPattern_Recommender();

    /**
     * The meta object literal for the '<em><b>Trust Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP = eINSTANCE.getTrustRecommendationPattern_TrustRelationship();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.TrustPatternImpl <em>Trust Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrustPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrustPattern()
     * @generated
     */
    EClass TRUST_PATTERN = eINSTANCE.getTrustPattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.TrusteeScopePatternImpl <em>Trustee Scope Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrusteeScopePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrusteeScopePattern()
     * @generated
     */
    EClass TRUSTEE_SCOPE_PATTERN = eINSTANCE.getTrusteeScopePattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.DispositionalScopePatternImpl <em>Dispositional Scope Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.DispositionalScopePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getDispositionalScopePattern()
     * @generated
     */
    EClass DISPOSITIONAL_SCOPE_PATTERN = eINSTANCE.getDispositionalScopePattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.SystemScopePatternImpl <em>System Scope Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.SystemScopePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getSystemScopePattern()
     * @generated
     */
    EClass SYSTEM_SCOPE_PATTERN = eINSTANCE.getSystemScopePattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.SituationalScopePatternImpl <em>Situational Scope Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.SituationalScopePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getSituationalScopePattern()
     * @generated
     */
    EClass SITUATIONAL_SCOPE_PATTERN = eINSTANCE.getSituationalScopePattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.PersonalScopePatternImpl <em>Personal Scope Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.PersonalScopePatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getPersonalScopePattern()
     * @generated
     */
    EClass PERSONAL_SCOPE_PATTERN = eINSTANCE.getPersonalScopePattern();

    /**
     * The meta object literal for the '<em><b>Trustee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONAL_SCOPE_PATTERN__TRUSTEE = eINSTANCE.getPersonalScopePattern_Trustee();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.TrustLevelPatternImpl <em>Trust Level Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.TrustLevelPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getTrustLevelPattern()
     * @generated
     */
    EClass TRUST_LEVEL_PATTERN = eINSTANCE.getTrustLevelPattern();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUST_LEVEL_PATTERN__LEVEL = eINSTANCE.getTrustLevelPattern_Level();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.DirectTrustPatternImpl <em>Direct Trust Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.DirectTrustPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getDirectTrustPattern()
     * @generated
     */
    EClass DIRECT_TRUST_PATTERN = eINSTANCE.getDirectTrustPattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.ArbitraryTrustPatternImpl <em>Arbitrary Trust Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.ArbitraryTrustPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getArbitraryTrustPattern()
     * @generated
     */
    EClass ARBITRARY_TRUST_PATTERN = eINSTANCE.getArbitraryTrustPattern();

    /**
     * The meta object literal for the '{@link trust.pattern.impl.ExperienceTrustPatternImpl <em>Experience Trust Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.pattern.impl.ExperienceTrustPatternImpl
     * @see trust.pattern.impl.PatternPackageImpl#getExperienceTrustPattern()
     * @generated
     */
    EClass EXPERIENCE_TRUST_PATTERN = eINSTANCE.getExperienceTrustPattern();

  }

} //PatternPackage
