/**
 */
package identity.type.impl;

import identity.type.MediaType;
import identity.type.PhysicalToken;
import identity.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.PhysicalTokenImpl#getMediaType <em>Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalTokenImpl extends AuthenticationCredentialImpl implements PhysicalToken {
    /**
     * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMediaType()
     * @generated
     * @ordered
     */
    protected MediaType mediaType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhysicalTokenImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.PHYSICAL_TOKEN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMediaType(MediaType newMediaType, NotificationChain msgs) {
        MediaType oldMediaType = mediaType;
        mediaType = newMediaType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE, oldMediaType, newMediaType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMediaType(MediaType newMediaType) {
        if (newMediaType != mediaType) {
            NotificationChain msgs = null;
            if (mediaType != null)
                msgs = ((InternalEObject)mediaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE, null, msgs);
            if (newMediaType != null)
                msgs = ((InternalEObject)newMediaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE, null, msgs);
            msgs = basicSetMediaType(newMediaType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE, newMediaType, newMediaType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE:
                return basicSetMediaType(null, msgs);
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
            case TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE:
                return getMediaType();
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
            case TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE:
                setMediaType((MediaType)newValue);
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
            case TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE:
                setMediaType((MediaType)null);
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
            case TypePackage.PHYSICAL_TOKEN__MEDIA_TYPE:
                return mediaType != null;
        }
        return super.eIsSet(featureID);
    }

} //PhysicalTokenImpl
