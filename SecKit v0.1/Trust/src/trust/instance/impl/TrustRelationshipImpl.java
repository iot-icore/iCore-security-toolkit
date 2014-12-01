/**
 */
package trust.instance.impl;

import identity.instance.AbstractIdentity;

import java.util.Collection;
import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import time.Timestamp;

import trust.instance.InstancePackage;
import trust.instance.LikelihoodMeasurement;
import trust.instance.TrustAspect;
import trust.instance.TrustRelationship;
import trust.instance.TrusteeScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getTrusteeScope <em>Trustee Scope</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getTrustor <em>Trustor</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustRelationshipImpl extends ElementImpl implements TrustRelationship {
  /**
   * The cached value of the '{@link #getAspect() <em>Aspect</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspect()
   * @generated
   * @ordered
   */
  protected EList<TrustAspect> aspect;

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
   * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected Timestamp timestamp;

  /**
   * The cached value of the '{@link #getTrusteeScope() <em>Trustee Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrusteeScope()
   * @generated
   * @ordered
   */
  protected TrusteeScope trusteeScope;

  /**
   * The cached value of the '{@link #getTrustor() <em>Trustor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustor()
   * @generated
   * @ordered
   */
  protected AbstractIdentity trustor;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRelationshipImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustAspect> getAspect() {
    if (aspect == null) {
      aspect = new EObjectResolvingEList<TrustAspect>(TrustAspect.class, this, InstancePackage.TRUST_RELATIONSHIP__ASPECT);
    }
    return aspect;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__DEGREE, oldDegree, newDegree);
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
        msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__DEGREE, null, msgs);
      if (newDegree != null)
        msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__DEGREE, null, msgs);
      msgs = basicSetDegree(newDegree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__DEGREE, newDegree, newDegree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timestamp getTimestamp() {
    return timestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimestamp(Timestamp newTimestamp, NotificationChain msgs) {
    Timestamp oldTimestamp = timestamp;
    timestamp = newTimestamp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP, oldTimestamp, newTimestamp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimestamp(Timestamp newTimestamp) {
    if (newTimestamp != timestamp) {
      NotificationChain msgs = null;
      if (timestamp != null)
        msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP, null, msgs);
      if (newTimestamp != null)
        msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP, null, msgs);
      msgs = basicSetTimestamp(newTimestamp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP, newTimestamp, newTimestamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrusteeScope getTrusteeScope() {
    return trusteeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrusteeScope(TrusteeScope newTrusteeScope, NotificationChain msgs) {
    TrusteeScope oldTrusteeScope = trusteeScope;
    trusteeScope = newTrusteeScope;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE, oldTrusteeScope, newTrusteeScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrusteeScope(TrusteeScope newTrusteeScope) {
    if (newTrusteeScope != trusteeScope) {
      NotificationChain msgs = null;
      if (trusteeScope != null)
        msgs = ((InternalEObject)trusteeScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE, null, msgs);
      if (newTrusteeScope != null)
        msgs = ((InternalEObject)newTrusteeScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE, null, msgs);
      msgs = basicSetTrusteeScope(newTrusteeScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE, newTrusteeScope, newTrusteeScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractIdentity getTrustor() {
    if (trustor != null && trustor.eIsProxy()) {
      InternalEObject oldTrustor = (InternalEObject)trustor;
      trustor = (AbstractIdentity)eResolveProxy(oldTrustor);
      if (trustor != oldTrustor) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.TRUST_RELATIONSHIP__TRUSTOR, oldTrustor, trustor));
      }
    }
    return trustor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractIdentity basicGetTrustor() {
    return trustor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustor(AbstractIdentity newTrustor) {
    AbstractIdentity oldTrustor = trustor;
    trustor = newTrustor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__TRUSTOR, oldTrustor, trustor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RELATIONSHIP__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.TRUST_RELATIONSHIP__DEGREE:
        return basicSetDegree(null, msgs);
      case InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP:
        return basicSetTimestamp(null, msgs);
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE:
        return basicSetTrusteeScope(null, msgs);
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
      case InstancePackage.TRUST_RELATIONSHIP__ASPECT:
        return getAspect();
      case InstancePackage.TRUST_RELATIONSHIP__DEGREE:
        return getDegree();
      case InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP:
        return getTimestamp();
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE:
        return getTrusteeScope();
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTOR:
        if (resolve) return getTrustor();
        return basicGetTrustor();
      case InstancePackage.TRUST_RELATIONSHIP__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case InstancePackage.TRUST_RELATIONSHIP__ASPECT:
        getAspect().clear();
        getAspect().addAll((Collection<? extends TrustAspect>)newValue);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__DEGREE:
        setDegree((LikelihoodMeasurement)newValue);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP:
        setTimestamp((Timestamp)newValue);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE:
        setTrusteeScope((TrusteeScope)newValue);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTOR:
        setTrustor((AbstractIdentity)newValue);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__DESCRIPTION:
        setDescription((String)newValue);
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
      case InstancePackage.TRUST_RELATIONSHIP__ASPECT:
        getAspect().clear();
        return;
      case InstancePackage.TRUST_RELATIONSHIP__DEGREE:
        setDegree((LikelihoodMeasurement)null);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP:
        setTimestamp((Timestamp)null);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE:
        setTrusteeScope((TrusteeScope)null);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTOR:
        setTrustor((AbstractIdentity)null);
        return;
      case InstancePackage.TRUST_RELATIONSHIP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case InstancePackage.TRUST_RELATIONSHIP__ASPECT:
        return aspect != null && !aspect.isEmpty();
      case InstancePackage.TRUST_RELATIONSHIP__DEGREE:
        return degree != null;
      case InstancePackage.TRUST_RELATIONSHIP__TIMESTAMP:
        return timestamp != null;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTEE_SCOPE:
        return trusteeScope != null;
      case InstancePackage.TRUST_RELATIONSHIP__TRUSTOR:
        return trustor != null;
      case InstancePackage.TRUST_RELATIONSHIP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //TrustRelationshipImpl
