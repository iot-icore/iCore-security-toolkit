/**
 */
package identity.type.impl;

import identity.type.DigitalIdentityType;
import identity.type.ElectronicDocument;
import identity.type.MediaType;
import identity.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.ElectronicDocumentImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link identity.type.impl.ElectronicDocumentImpl#getMediaType <em>Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectronicDocumentImpl extends PhysicalIdentityTypeImpl implements ElectronicDocument {
    /**
     * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContains()
     * @generated
     * @ordered
     */
    protected EList<DigitalIdentityType> contains;

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
    protected ElectronicDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ELECTRONIC_DOCUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DigitalIdentityType> getContains() {
        if (contains == null) {
            contains = new EObjectContainmentEList<DigitalIdentityType>(DigitalIdentityType.class, this, TypePackage.ELECTRONIC_DOCUMENT__CONTAINS);
        }
        return contains;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE, oldMediaType, newMediaType);
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
                msgs = ((InternalEObject)mediaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE, null, msgs);
            if (newMediaType != null)
                msgs = ((InternalEObject)newMediaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE, null, msgs);
            msgs = basicSetMediaType(newMediaType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE, newMediaType, newMediaType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.ELECTRONIC_DOCUMENT__CONTAINS:
                return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
            case TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE:
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
            case TypePackage.ELECTRONIC_DOCUMENT__CONTAINS:
                return getContains();
            case TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE:
                return getMediaType();
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
            case TypePackage.ELECTRONIC_DOCUMENT__CONTAINS:
                getContains().clear();
                getContains().addAll((Collection<? extends DigitalIdentityType>)newValue);
                return;
            case TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE:
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
            case TypePackage.ELECTRONIC_DOCUMENT__CONTAINS:
                getContains().clear();
                return;
            case TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE:
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
            case TypePackage.ELECTRONIC_DOCUMENT__CONTAINS:
                return contains != null && !contains.isEmpty();
            case TypePackage.ELECTRONIC_DOCUMENT__MEDIA_TYPE:
                return mediaType != null;
        }
        return super.eIsSet(featureID);
    }

} //ElectronicDocumentImpl
