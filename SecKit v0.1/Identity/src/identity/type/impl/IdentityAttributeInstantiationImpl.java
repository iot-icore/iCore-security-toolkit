/**
 */
package identity.type.impl;

import data.instantiation.impl.DataInstantiationImpl;

import identity.type.AttributeVerificationMethod;
import identity.type.DigitalIdentityType;
import identity.type.IdentityAttributeInstantiation;
import identity.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Attribute Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.IdentityAttributeInstantiationImpl#getIdentityType <em>Identity Type</em>}</li>
 *   <li>{@link identity.type.impl.IdentityAttributeInstantiationImpl#getVerificationMethod <em>Verification Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityAttributeInstantiationImpl extends DataInstantiationImpl implements IdentityAttributeInstantiation {
    /**
     * The cached value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerificationMethod()
     * @generated
     * @ordered
     */
    protected AttributeVerificationMethod verificationMethod;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityAttributeInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.IDENTITY_ATTRIBUTE_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DigitalIdentityType getIdentityType() {
        if (eContainerFeatureID() != TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE) return null;
        return (DigitalIdentityType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdentityType(DigitalIdentityType newIdentityType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newIdentityType, TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentityType(DigitalIdentityType newIdentityType) {
        if (newIdentityType != eInternalContainer() || (eContainerFeatureID() != TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE && newIdentityType != null)) {
            if (EcoreUtil.isAncestor(this, newIdentityType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newIdentityType != null)
                msgs = ((InternalEObject)newIdentityType).eInverseAdd(this, TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS, DigitalIdentityType.class, msgs);
            msgs = basicSetIdentityType(newIdentityType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE, newIdentityType, newIdentityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeVerificationMethod getVerificationMethod() {
        return verificationMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVerificationMethod(AttributeVerificationMethod newVerificationMethod, NotificationChain msgs) {
        AttributeVerificationMethod oldVerificationMethod = verificationMethod;
        verificationMethod = newVerificationMethod;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD, oldVerificationMethod, newVerificationMethod);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerificationMethod(AttributeVerificationMethod newVerificationMethod) {
        if (newVerificationMethod != verificationMethod) {
            NotificationChain msgs = null;
            if (verificationMethod != null)
                msgs = ((InternalEObject)verificationMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD, null, msgs);
            if (newVerificationMethod != null)
                msgs = ((InternalEObject)newVerificationMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD, null, msgs);
            msgs = basicSetVerificationMethod(newVerificationMethod, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD, newVerificationMethod, newVerificationMethod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetIdentityType((DigitalIdentityType)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                return basicSetIdentityType(null, msgs);
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD:
                return basicSetVerificationMethod(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS, DigitalIdentityType.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                return getIdentityType();
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD:
                return getVerificationMethod();
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
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                setIdentityType((DigitalIdentityType)newValue);
                return;
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD:
                setVerificationMethod((AttributeVerificationMethod)newValue);
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
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                setIdentityType((DigitalIdentityType)null);
                return;
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD:
                setVerificationMethod((AttributeVerificationMethod)null);
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
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE:
                return getIdentityType() != null;
            case TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__VERIFICATION_METHOD:
                return verificationMethod != null;
        }
        return super.eIsSet(featureID);
    }

} //IdentityAttributeInstantiationImpl
