/**
 */
package trust.pattern.util;

import models.Element;
import models.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trust.pattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trust.pattern.PatternPackage
 * @generated
 */
public class PatternAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PatternPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = PatternPackage.eINSTANCE;
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
  protected PatternSwitch<Adapter> modelSwitch =
    new PatternSwitch<Adapter>() {
      @Override
      public Adapter caseTrustRelationshipPattern(TrustRelationshipPattern object) {
        return createTrustRelationshipPatternAdapter();
      }
      @Override
      public Adapter caseTrustDegreePattern(TrustDegreePattern object) {
        return createTrustDegreePatternAdapter();
      }
      @Override
      public Adapter caseTrustRecommendationPattern(TrustRecommendationPattern object) {
        return createTrustRecommendationPatternAdapter();
      }
      @Override
      public Adapter caseTrustPattern(TrustPattern object) {
        return createTrustPatternAdapter();
      }
      @Override
      public Adapter caseTrusteeScopePattern(TrusteeScopePattern object) {
        return createTrusteeScopePatternAdapter();
      }
      @Override
      public Adapter caseDispositionalScopePattern(DispositionalScopePattern object) {
        return createDispositionalScopePatternAdapter();
      }
      @Override
      public Adapter caseSystemScopePattern(SystemScopePattern object) {
        return createSystemScopePatternAdapter();
      }
      @Override
      public Adapter caseSituationalScopePattern(SituationalScopePattern object) {
        return createSituationalScopePatternAdapter();
      }
      @Override
      public Adapter casePersonalScopePattern(PersonalScopePattern object) {
        return createPersonalScopePatternAdapter();
      }
      @Override
      public Adapter caseTrustLevelPattern(TrustLevelPattern object) {
        return createTrustLevelPatternAdapter();
      }
      @Override
      public Adapter caseDirectTrustPattern(DirectTrustPattern object) {
        return createDirectTrustPatternAdapter();
      }
      @Override
      public Adapter caseArbitraryTrustPattern(ArbitraryTrustPattern object) {
        return createArbitraryTrustPatternAdapter();
      }
      @Override
      public Adapter caseExperienceTrustPattern(ExperienceTrustPattern object) {
        return createExperienceTrustPatternAdapter();
      }
      @Override
      public Adapter caseElement(Element object) {
        return createElementAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object) {
        return createPatternAdapter();
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
   * Creates a new adapter for an object of class '{@link trust.pattern.TrustRelationshipPattern <em>Trust Relationship Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrustRelationshipPattern
   * @generated
   */
  public Adapter createTrustRelationshipPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.TrustDegreePattern <em>Trust Degree Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrustDegreePattern
   * @generated
   */
  public Adapter createTrustDegreePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.TrustRecommendationPattern <em>Trust Recommendation Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrustRecommendationPattern
   * @generated
   */
  public Adapter createTrustRecommendationPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.TrustPattern <em>Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrustPattern
   * @generated
   */
  public Adapter createTrustPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.TrusteeScopePattern <em>Trustee Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrusteeScopePattern
   * @generated
   */
  public Adapter createTrusteeScopePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.DispositionalScopePattern <em>Dispositional Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.DispositionalScopePattern
   * @generated
   */
  public Adapter createDispositionalScopePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.SystemScopePattern <em>System Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.SystemScopePattern
   * @generated
   */
  public Adapter createSystemScopePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.SituationalScopePattern <em>Situational Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.SituationalScopePattern
   * @generated
   */
  public Adapter createSituationalScopePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.PersonalScopePattern <em>Personal Scope Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.PersonalScopePattern
   * @generated
   */
  public Adapter createPersonalScopePatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.TrustLevelPattern <em>Trust Level Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.TrustLevelPattern
   * @generated
   */
  public Adapter createTrustLevelPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.DirectTrustPattern <em>Direct Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.DirectTrustPattern
   * @generated
   */
  public Adapter createDirectTrustPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.ArbitraryTrustPattern <em>Arbitrary Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.ArbitraryTrustPattern
   * @generated
   */
  public Adapter createArbitraryTrustPatternAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trust.pattern.ExperienceTrustPattern <em>Experience Trust Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trust.pattern.ExperienceTrustPattern
   * @generated
   */
  public Adapter createExperienceTrustPatternAdapter() {
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
   * Creates a new adapter for an object of class '{@link models.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see models.Pattern
   * @generated
   */
  public Adapter createPatternAdapter() {
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

} //PatternAdapterFactory
