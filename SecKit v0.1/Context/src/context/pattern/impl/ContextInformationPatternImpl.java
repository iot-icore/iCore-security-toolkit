/**
 */
package context.pattern.impl;

import context.instance.QualityOfContext;

import context.pattern.ContextInformationPattern;
import context.pattern.PatternPackage;

import context.type.ContextInformationType;

import identity.pattern.IdentityPattern;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Information Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.pattern.impl.ContextInformationPatternImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link context.pattern.impl.ContextInformationPatternImpl#getQualityOfContext <em>Quality Of Context</em>}</li>
 *   <li>{@link context.pattern.impl.ContextInformationPatternImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextInformationPatternImpl extends PatternImpl implements ContextInformationPattern {
    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected IdentityPattern owner;

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
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ContextInformationType type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextInformationPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.CONTEXT_INFORMATION_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityPattern getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(IdentityPattern newOwner, NotificationChain msgs) {
        IdentityPattern oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER, oldOwner, newOwner);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(IdentityPattern newOwner) {
        if (newOwner != owner) {
            NotificationChain msgs = null;
            if (owner != null)
                msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER, null, msgs);
            if (newOwner != null)
                msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER, null, msgs);
            msgs = basicSetOwner(newOwner, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER, newOwner, newOwner));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT, oldQualityOfContext, newQualityOfContext);
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
                msgs = ((InternalEObject)qualityOfContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT, null, msgs);
            if (newQualityOfContext != null)
                msgs = ((InternalEObject)newQualityOfContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT, null, msgs);
            msgs = basicSetQualityOfContext(newQualityOfContext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT, newQualityOfContext, newQualityOfContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ContextInformationType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ContextInformationType newType) {
        ContextInformationType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER:
                return basicSetOwner(null, msgs);
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT:
                return basicSetQualityOfContext(null, msgs);
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
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER:
                return getOwner();
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT:
                return getQualityOfContext();
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER:
                setOwner((IdentityPattern)newValue);
                return;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT:
                setQualityOfContext((QualityOfContext)newValue);
                return;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE:
                setType((ContextInformationType)newValue);
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
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER:
                setOwner((IdentityPattern)null);
                return;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT:
                setQualityOfContext((QualityOfContext)null);
                return;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE:
                setType((ContextInformationType)null);
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
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__OWNER:
                return owner != null;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT:
                return qualityOfContext != null;
            case PatternPackage.CONTEXT_INFORMATION_PATTERN__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //ContextInformationPatternImpl
