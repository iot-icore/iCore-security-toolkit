/**
 */
package trust.pattern.impl;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.LikelihoodMeasurement;

import trust.pattern.PatternPackage;
import trust.pattern.TrustDegreePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Degree Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.pattern.impl.TrustDegreePatternImpl#getDegree <em>Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustDegreePatternImpl extends PatternImpl implements TrustDegreePattern {
  /**
   * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected LikelihoodMeasurement degree;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustDegreePatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.TRUST_DEGREE_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikelihoodMeasurement getDegree() {
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegree(LikelihoodMeasurement newDegree, NotificationChain msgs) {
    LikelihoodMeasurement oldDegree = degree;
    degree = newDegree;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_DEGREE_PATTERN__DEGREE, oldDegree, newDegree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegree(LikelihoodMeasurement newDegree) {
    if (newDegree != degree) {
      NotificationChain msgs = null;
      if (degree != null)
        msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_DEGREE_PATTERN__DEGREE, null, msgs);
      if (newDegree != null)
        msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_DEGREE_PATTERN__DEGREE, null, msgs);
      msgs = basicSetDegree(newDegree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_DEGREE_PATTERN__DEGREE, newDegree, newDegree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case PatternPackage.TRUST_DEGREE_PATTERN__DEGREE:
        return basicSetDegree(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case PatternPackage.TRUST_DEGREE_PATTERN__DEGREE:
        return getDegree();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case PatternPackage.TRUST_DEGREE_PATTERN__DEGREE:
        setDegree((LikelihoodMeasurement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case PatternPackage.TRUST_DEGREE_PATTERN__DEGREE:
        setDegree((LikelihoodMeasurement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case PatternPackage.TRUST_DEGREE_PATTERN__DEGREE:
        return degree != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustDegreePatternImpl
