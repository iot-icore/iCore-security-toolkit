/**
 */
package trust.pattern.util;

import models.Element;
import models.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import trust.pattern.*;

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
 * @see trust.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PatternPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternSwitch() {
    if (modelPackage == null) {
      modelPackage = PatternPackage.eINSTANCE;
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
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN: {
        TrustRelationshipPattern trustRelationshipPattern = (TrustRelationshipPattern)theEObject;
        T result = caseTrustRelationshipPattern(trustRelationshipPattern);
        if (result == null) result = caseTrustPattern(trustRelationshipPattern);
        if (result == null) result = casePattern(trustRelationshipPattern);
        if (result == null) result = caseElement(trustRelationshipPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.TRUST_DEGREE_PATTERN: {
        TrustDegreePattern trustDegreePattern = (TrustDegreePattern)theEObject;
        T result = caseTrustDegreePattern(trustDegreePattern);
        if (result == null) result = casePattern(trustDegreePattern);
        if (result == null) result = caseElement(trustDegreePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN: {
        TrustRecommendationPattern trustRecommendationPattern = (TrustRecommendationPattern)theEObject;
        T result = caseTrustRecommendationPattern(trustRecommendationPattern);
        if (result == null) result = caseTrustPattern(trustRecommendationPattern);
        if (result == null) result = casePattern(trustRecommendationPattern);
        if (result == null) result = caseElement(trustRecommendationPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.TRUST_PATTERN: {
        TrustPattern trustPattern = (TrustPattern)theEObject;
        T result = caseTrustPattern(trustPattern);
        if (result == null) result = casePattern(trustPattern);
        if (result == null) result = caseElement(trustPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.TRUSTEE_SCOPE_PATTERN: {
        TrusteeScopePattern trusteeScopePattern = (TrusteeScopePattern)theEObject;
        T result = caseTrusteeScopePattern(trusteeScopePattern);
        if (result == null) result = casePattern(trusteeScopePattern);
        if (result == null) result = caseElement(trusteeScopePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.DISPOSITIONAL_SCOPE_PATTERN: {
        DispositionalScopePattern dispositionalScopePattern = (DispositionalScopePattern)theEObject;
        T result = caseDispositionalScopePattern(dispositionalScopePattern);
        if (result == null) result = caseTrusteeScopePattern(dispositionalScopePattern);
        if (result == null) result = casePattern(dispositionalScopePattern);
        if (result == null) result = caseElement(dispositionalScopePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.SYSTEM_SCOPE_PATTERN: {
        SystemScopePattern systemScopePattern = (SystemScopePattern)theEObject;
        T result = caseSystemScopePattern(systemScopePattern);
        if (result == null) result = caseTrusteeScopePattern(systemScopePattern);
        if (result == null) result = casePattern(systemScopePattern);
        if (result == null) result = caseElement(systemScopePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.SITUATIONAL_SCOPE_PATTERN: {
        SituationalScopePattern situationalScopePattern = (SituationalScopePattern)theEObject;
        T result = caseSituationalScopePattern(situationalScopePattern);
        if (result == null) result = caseTrusteeScopePattern(situationalScopePattern);
        if (result == null) result = casePattern(situationalScopePattern);
        if (result == null) result = caseElement(situationalScopePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.PERSONAL_SCOPE_PATTERN: {
        PersonalScopePattern personalScopePattern = (PersonalScopePattern)theEObject;
        T result = casePersonalScopePattern(personalScopePattern);
        if (result == null) result = caseSituationalScopePattern(personalScopePattern);
        if (result == null) result = caseTrusteeScopePattern(personalScopePattern);
        if (result == null) result = casePattern(personalScopePattern);
        if (result == null) result = caseElement(personalScopePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.TRUST_LEVEL_PATTERN: {
        TrustLevelPattern trustLevelPattern = (TrustLevelPattern)theEObject;
        T result = caseTrustLevelPattern(trustLevelPattern);
        if (result == null) result = caseTrustDegreePattern(trustLevelPattern);
        if (result == null) result = casePattern(trustLevelPattern);
        if (result == null) result = caseElement(trustLevelPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.DIRECT_TRUST_PATTERN: {
        DirectTrustPattern directTrustPattern = (DirectTrustPattern)theEObject;
        T result = caseDirectTrustPattern(directTrustPattern);
        if (result == null) result = caseTrustRelationshipPattern(directTrustPattern);
        if (result == null) result = caseTrustPattern(directTrustPattern);
        if (result == null) result = casePattern(directTrustPattern);
        if (result == null) result = caseElement(directTrustPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.ARBITRARY_TRUST_PATTERN: {
        ArbitraryTrustPattern arbitraryTrustPattern = (ArbitraryTrustPattern)theEObject;
        T result = caseArbitraryTrustPattern(arbitraryTrustPattern);
        if (result == null) result = caseDirectTrustPattern(arbitraryTrustPattern);
        if (result == null) result = caseTrustRelationshipPattern(arbitraryTrustPattern);
        if (result == null) result = caseTrustPattern(arbitraryTrustPattern);
        if (result == null) result = casePattern(arbitraryTrustPattern);
        if (result == null) result = caseElement(arbitraryTrustPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternPackage.EXPERIENCE_TRUST_PATTERN: {
        ExperienceTrustPattern experienceTrustPattern = (ExperienceTrustPattern)theEObject;
        T result = caseExperienceTrustPattern(experienceTrustPattern);
        if (result == null) result = caseDirectTrustPattern(experienceTrustPattern);
        if (result == null) result = caseTrustRelationshipPattern(experienceTrustPattern);
        if (result == null) result = caseTrustPattern(experienceTrustPattern);
        if (result == null) result = casePattern(experienceTrustPattern);
        if (result == null) result = caseElement(experienceTrustPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Relationship Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Relationship Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustRelationshipPattern(TrustRelationshipPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Degree Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Degree Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustDegreePattern(TrustDegreePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Recommendation Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Recommendation Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustRecommendationPattern(TrustRecommendationPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustPattern(TrustPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trustee Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trustee Scope Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrusteeScopePattern(TrusteeScopePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dispositional Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dispositional Scope Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDispositionalScopePattern(DispositionalScopePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Scope Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemScopePattern(SystemScopePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Situational Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Situational Scope Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSituationalScopePattern(SituationalScopePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Personal Scope Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal Scope Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonalScopePattern(PersonalScopePattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trust Level Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trust Level Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrustLevelPattern(TrustLevelPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Trust Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectTrustPattern(DirectTrustPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arbitrary Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arbitrary Trust Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArbitraryTrustPattern(ArbitraryTrustPattern object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experience Trust Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experience Trust Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperienceTrustPattern(ExperienceTrustPattern object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object) {
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

} //PatternSwitch
