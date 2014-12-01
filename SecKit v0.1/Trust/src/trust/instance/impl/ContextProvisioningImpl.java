/**
 */
package trust.instance.impl;

import context.pattern.ContextInformationPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.ContextProvisioning;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Provisioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.ContextProvisioningImpl#getContextInformationPattern <em>Context Information Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextProvisioningImpl extends DataQualityImpl implements ContextProvisioning {
  /**
   * The cached value of the '{@link #getContextInformationPattern() <em>Context Information Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextInformationPattern()
   * @generated
   * @ordered
   */
  protected ContextInformationPattern contextInformationPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextProvisioningImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.CONTEXT_PROVISIONING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextInformationPattern getContextInformationPattern() {
    return contextInformationPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextInformationPattern(ContextInformationPattern newContextInformationPattern, NotificationChain msgs) {
    ContextInformationPattern oldContextInformationPattern = contextInformationPattern;
    contextInformationPattern = newContextInformationPattern;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN, oldContextInformationPattern, newContextInformationPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextInformationPattern(ContextInformationPattern newContextInformationPattern) {
    if (newContextInformationPattern != contextInformationPattern) {
      NotificationChain msgs = null;
      if (contextInformationPattern != null)
        msgs = ((InternalEObject)contextInformationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN, null, msgs);
      if (newContextInformationPattern != null)
        msgs = ((InternalEObject)newContextInformationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN, null, msgs);
      msgs = basicSetContextInformationPattern(newContextInformationPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN, newContextInformationPattern, newContextInformationPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN:
        return basicSetContextInformationPattern(null, msgs);
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
      case InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN:
        return getContextInformationPattern();
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
      case InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN:
        setContextInformationPattern((ContextInformationPattern)newValue);
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
      case InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN:
        setContextInformationPattern((ContextInformationPattern)null);
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
      case InstancePackage.CONTEXT_PROVISIONING__CONTEXT_INFORMATION_PATTERN:
        return contextInformationPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextProvisioningImpl
