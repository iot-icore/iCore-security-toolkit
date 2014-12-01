/**
 */
package context.instance.impl;

import context.instance.Context;
import context.instance.InstancePackage;
import context.instance.QualityOfContext;

import data.instance.impl.DataImpl;

import identity.instance.AbstractIdentity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.impl.ContextImpl#getQualityOfContext <em>Quality Of Context</em>}</li>
 *   <li>{@link context.instance.impl.ContextImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link context.instance.impl.ContextImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContextImpl extends DataImpl implements Context {
    /**
     * The cached value of the '{@link #getQualityOfContext() <em>Quality Of Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQualityOfContext()
     * @generated
     * @ordered
     */
    protected QualityOfContext qualityOfContext;

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
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected AbstractIdentity owner;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfContext getQualityOfContext() {
        return qualityOfContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQualityOfContext(QualityOfContext newQualityOfContext, NotificationChain msgs) {
        QualityOfContext oldQualityOfContext = qualityOfContext;
        qualityOfContext = newQualityOfContext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT__QUALITY_OF_CONTEXT, oldQualityOfContext, newQualityOfContext);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQualityOfContext(QualityOfContext newQualityOfContext) {
        if (newQualityOfContext != qualityOfContext) {
            NotificationChain msgs = null;
            if (qualityOfContext != null)
                msgs = ((InternalEObject)qualityOfContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT__QUALITY_OF_CONTEXT, null, msgs);
            if (newQualityOfContext != null)
                msgs = ((InternalEObject)newQualityOfContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT__QUALITY_OF_CONTEXT, null, msgs);
            msgs = basicSetQualityOfContext(newQualityOfContext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT__QUALITY_OF_CONTEXT, newQualityOfContext, newQualityOfContext));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT__TIMESTAMP, oldTimestamp, newTimestamp);
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
                msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT__TIMESTAMP, null, msgs);
            if (newTimestamp != null)
                msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT__TIMESTAMP, null, msgs);
            msgs = basicSetTimestamp(newTimestamp, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT__TIMESTAMP, newTimestamp, newTimestamp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity getOwner() {
        if (owner != null && owner.eIsProxy()) {
            InternalEObject oldOwner = (InternalEObject)owner;
            owner = (AbstractIdentity)eResolveProxy(oldOwner);
            if (owner != oldOwner) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONTEXT__OWNER, oldOwner, owner));
            }
        }
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity basicGetOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(AbstractIdentity newOwner) {
        AbstractIdentity oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.CONTEXT__QUALITY_OF_CONTEXT:
                return basicSetQualityOfContext(null, msgs);
            case InstancePackage.CONTEXT__TIMESTAMP:
                return basicSetTimestamp(null, msgs);
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
            case InstancePackage.CONTEXT__QUALITY_OF_CONTEXT:
                return getQualityOfContext();
            case InstancePackage.CONTEXT__TIMESTAMP:
                return getTimestamp();
            case InstancePackage.CONTEXT__OWNER:
                if (resolve) return getOwner();
                return basicGetOwner();
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
            case InstancePackage.CONTEXT__QUALITY_OF_CONTEXT:
                setQualityOfContext((QualityOfContext)newValue);
                return;
            case InstancePackage.CONTEXT__TIMESTAMP:
                setTimestamp((Timestamp)newValue);
                return;
            case InstancePackage.CONTEXT__OWNER:
                setOwner((AbstractIdentity)newValue);
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
            case InstancePackage.CONTEXT__QUALITY_OF_CONTEXT:
                setQualityOfContext((QualityOfContext)null);
                return;
            case InstancePackage.CONTEXT__TIMESTAMP:
                setTimestamp((Timestamp)null);
                return;
            case InstancePackage.CONTEXT__OWNER:
                setOwner((AbstractIdentity)null);
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
            case InstancePackage.CONTEXT__QUALITY_OF_CONTEXT:
                return qualityOfContext != null;
            case InstancePackage.CONTEXT__TIMESTAMP:
                return timestamp != null;
            case InstancePackage.CONTEXT__OWNER:
                return owner != null;
        }
        return super.eIsSet(featureID);
    }

} //ContextImpl
