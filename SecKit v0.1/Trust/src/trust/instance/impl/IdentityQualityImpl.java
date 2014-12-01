/**
 */
package trust.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.IdentityQuality;
import trust.instance.InstancePackage;
import trust.instance.LevelOfAssurance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.IdentityQualityImpl#getLoa <em>Loa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityQualityImpl extends DataQualityImpl implements IdentityQuality {
  /**
   * The cached value of the '{@link #getLoa() <em>Loa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoa()
   * @generated
   * @ordered
   */
  protected LevelOfAssurance loa;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentityQualityImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.IDENTITY_QUALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelOfAssurance getLoa() {
    return loa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoa(LevelOfAssurance newLoa, NotificationChain msgs) {
    LevelOfAssurance oldLoa = loa;
    loa = newLoa;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.IDENTITY_QUALITY__LOA, oldLoa, newLoa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoa(LevelOfAssurance newLoa) {
    if (newLoa != loa) {
      NotificationChain msgs = null;
      if (loa != null)
        msgs = ((InternalEObject)loa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.IDENTITY_QUALITY__LOA, null, msgs);
      if (newLoa != null)
        msgs = ((InternalEObject)newLoa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.IDENTITY_QUALITY__LOA, null, msgs);
      msgs = basicSetLoa(newLoa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.IDENTITY_QUALITY__LOA, newLoa, newLoa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.IDENTITY_QUALITY__LOA:
        return basicSetLoa(null, msgs);
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
      case InstancePackage.IDENTITY_QUALITY__LOA:
        return getLoa();
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
      case InstancePackage.IDENTITY_QUALITY__LOA:
        setLoa((LevelOfAssurance)newValue);
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
      case InstancePackage.IDENTITY_QUALITY__LOA:
        setLoa((LevelOfAssurance)null);
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
      case InstancePackage.IDENTITY_QUALITY__LOA:
        return loa != null;
    }
    return super.eIsSet(featureID);
  }

} //IdentityQualityImpl
