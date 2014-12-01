/**
 */
package context.management.impl;

import context.management.ContextProvisioningServiceDescription;
import context.management.ManagementPackage;

import context.type.ContextInformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Provisioning Service Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.management.impl.ContextProvisioningServiceDescriptionImpl#getContextType <em>Context Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextProvisioningServiceDescriptionImpl extends MinimalEObjectImpl.Container implements ContextProvisioningServiceDescription {
    /**
     * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextType()
     * @generated
     * @ordered
     */
    protected ContextInformationType contextType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextProvisioningServiceDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ManagementPackage.Literals.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationType getContextType() {
        return contextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextType(ContextInformationType newContextType, NotificationChain msgs) {
        ContextInformationType oldContextType = contextType;
        contextType = newContextType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE, oldContextType, newContextType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextType(ContextInformationType newContextType) {
        if (newContextType != contextType) {
            NotificationChain msgs = null;
            if (contextType != null)
                msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE, null, msgs);
            if (newContextType != null)
                msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE, null, msgs);
            msgs = basicSetContextType(newContextType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE, newContextType, newContextType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE:
                return basicSetContextType(null, msgs);
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
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE:
                return getContextType();
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
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE:
                setContextType((ContextInformationType)newValue);
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
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE:
                setContextType((ContextInformationType)null);
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
            case ManagementPackage.CONTEXT_PROVISIONING_SERVICE_DESCRIPTION__CONTEXT_TYPE:
                return contextType != null;
        }
        return super.eIsSet(featureID);
    }

} //ContextProvisioningServiceDescriptionImpl
