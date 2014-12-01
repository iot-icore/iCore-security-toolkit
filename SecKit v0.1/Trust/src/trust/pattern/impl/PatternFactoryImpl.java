/**
 */
package trust.pattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trust.pattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PatternFactory init() {
    try {
      PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
      if (thePatternFactory != null) {
        return thePatternFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PatternFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternFactoryImpl() {
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
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN: return createTrustRecommendationPattern();
      case PatternPackage.TRUST_PATTERN: return createTrustPattern();
      case PatternPackage.DISPOSITIONAL_SCOPE_PATTERN: return createDispositionalScopePattern();
      case PatternPackage.SYSTEM_SCOPE_PATTERN: return createSystemScopePattern();
      case PatternPackage.SITUATIONAL_SCOPE_PATTERN: return createSituationalScopePattern();
      case PatternPackage.PERSONAL_SCOPE_PATTERN: return createPersonalScopePattern();
      case PatternPackage.TRUST_LEVEL_PATTERN: return createTrustLevelPattern();
      case PatternPackage.ARBITRARY_TRUST_PATTERN: return createArbitraryTrustPattern();
      case PatternPackage.EXPERIENCE_TRUST_PATTERN: return createExperienceTrustPattern();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRecommendationPattern createTrustRecommendationPattern() {
    TrustRecommendationPatternImpl trustRecommendationPattern = new TrustRecommendationPatternImpl();
    return trustRecommendationPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustPattern createTrustPattern() {
    TrustPatternImpl trustPattern = new TrustPatternImpl();
    return trustPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispositionalScopePattern createDispositionalScopePattern() {
    DispositionalScopePatternImpl dispositionalScopePattern = new DispositionalScopePatternImpl();
    return dispositionalScopePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemScopePattern createSystemScopePattern() {
    SystemScopePatternImpl systemScopePattern = new SystemScopePatternImpl();
    return systemScopePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SituationalScopePattern createSituationalScopePattern() {
    SituationalScopePatternImpl situationalScopePattern = new SituationalScopePatternImpl();
    return situationalScopePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalScopePattern createPersonalScopePattern() {
    PersonalScopePatternImpl personalScopePattern = new PersonalScopePatternImpl();
    return personalScopePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustLevelPattern createTrustLevelPattern() {
    TrustLevelPatternImpl trustLevelPattern = new TrustLevelPatternImpl();
    return trustLevelPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArbitraryTrustPattern createArbitraryTrustPattern() {
    ArbitraryTrustPatternImpl arbitraryTrustPattern = new ArbitraryTrustPatternImpl();
    return arbitraryTrustPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperienceTrustPattern createExperienceTrustPattern() {
    ExperienceTrustPatternImpl experienceTrustPattern = new ExperienceTrustPatternImpl();
    return experienceTrustPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternPackage getPatternPackage() {
    return (PatternPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PatternPackage getPackage() {
    return PatternPackage.eINSTANCE;
  }

} //PatternFactoryImpl
