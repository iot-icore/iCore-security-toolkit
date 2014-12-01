/**
 */
package context.management.impl;

import context.management.ManagementPackage;
import context.management.SituationProvisioningServiceDescription;

import context.type.ContextSituationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Provisioning Service Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.management.impl.SituationProvisioningServiceDescriptionImpl#getSituationType <em>Situation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationProvisioningServiceDescriptionImpl extends MinimalEObjectImpl.Container implements SituationProvisioningServiceDescription {
    /**
     * The cached value of the '{@link #getSituationType() <em>Situation Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationType()
     * @generated
     * @ordered
     */
    protected ContextSituationType situationType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SituationProvisioningServiceDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ManagementPackage.Literals.SITUATION_PROVISIONING_SERVICE_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType getSituationType() {
        return situationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSituationType(ContextSituationType newSituationType, NotificationChain msgs) {
        ContextSituationType oldSituationType = situationType;
        situationType = newSituationType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE, oldSituationType, newSituationType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSituationType(ContextSituationType newSituationType) {
        if (newSituationType != situationType) {
            NotificationChain msgs = null;
            if (situationType != null)
                msgs = ((InternalEObject)situationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE, null, msgs);
            if (newSituationType != null)
                msgs = ((InternalEObject)newSituationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE, null, msgs);
            msgs = basicSetSituationType(newSituationType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE, newSituationType, newSituationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE:
                return basicSetSituationType(null, msgs);
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
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE:
                return getSituationType();
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
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE:
                setSituationType((ContextSituationType)newValue);
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
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE:
                setSituationType((ContextSituationType)null);
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
            case ManagementPackage.SITUATION_PROVISIONING_SERVICE_DESCRIPTION__SITUATION_TYPE:
                return situationType != null;
        }
        return super.eIsSet(featureID);
    }

} //SituationProvisioningServiceDescriptionImpl
