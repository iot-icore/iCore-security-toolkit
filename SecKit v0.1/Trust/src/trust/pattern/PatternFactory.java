/**
 */
package trust.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trust.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PatternFactory eINSTANCE = trust.pattern.impl.PatternFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Trust Recommendation Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Recommendation Pattern</em>'.
   * @generated
   */
  TrustRecommendationPattern createTrustRecommendationPattern();

  /**
   * Returns a new object of class '<em>Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Pattern</em>'.
   * @generated
   */
  TrustPattern createTrustPattern();

  /**
   * Returns a new object of class '<em>Dispositional Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dispositional Scope Pattern</em>'.
   * @generated
   */
  DispositionalScopePattern createDispositionalScopePattern();

  /**
   * Returns a new object of class '<em>System Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Scope Pattern</em>'.
   * @generated
   */
  SystemScopePattern createSystemScopePattern();

  /**
   * Returns a new object of class '<em>Situational Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Situational Scope Pattern</em>'.
   * @generated
   */
  SituationalScopePattern createSituationalScopePattern();

  /**
   * Returns a new object of class '<em>Personal Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal Scope Pattern</em>'.
   * @generated
   */
  PersonalScopePattern createPersonalScopePattern();

  /**
   * Returns a new object of class '<em>Trust Level Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trust Level Pattern</em>'.
   * @generated
   */
  TrustLevelPattern createTrustLevelPattern();

  /**
   * Returns a new object of class '<em>Arbitrary Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arbitrary Trust Pattern</em>'.
   * @generated
   */
  ArbitraryTrustPattern createArbitraryTrustPattern();

  /**
   * Returns a new object of class '<em>Experience Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experience Trust Pattern</em>'.
   * @generated
   */
  ExperienceTrustPattern createExperienceTrustPattern();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PatternPackage getPatternPackage();

} //PatternFactory
