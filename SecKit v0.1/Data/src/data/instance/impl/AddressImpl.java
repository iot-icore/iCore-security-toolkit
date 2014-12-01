/**
 */
package data.instance.impl;

import data.instance.Address;
import data.instance.AdressSpace;
import data.instance.Content;
import data.instance.InstancePackage;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.AddressImpl#getContent <em>Content</em>}</li>
 *   <li>{@link data.instance.impl.AddressImpl#getAdressSpace <em>Adress Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AddressImpl extends ElementImpl implements Address {
    /**
     * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContent()
     * @generated
     * @ordered
     */
    protected Content content;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ADDRESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Content getContent() {
        if (content != null && content.eIsProxy()) {
            InternalEObject oldContent = (InternalEObject)content;
            content = (Content)eResolveProxy(oldContent);
            if (content != oldContent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ADDRESS__CONTENT, oldContent, content));
            }
        }
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Content basicGetContent() {
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContent(Content newContent) {
        Content oldContent = content;
        content = newContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ADDRESS__CONTENT, oldContent, content));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdressSpace getAdressSpace() {
        if (eContainerFeatureID() != InstancePackage.ADDRESS__ADRESS_SPACE) return null;
        return (AdressSpace)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAdressSpace(AdressSpace newAdressSpace, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAdressSpace, InstancePackage.ADDRESS__ADRESS_SPACE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdressSpace(AdressSpace newAdressSpace) {
        if (newAdressSpace != eInternalContainer() || (eContainerFeatureID() != InstancePackage.ADDRESS__ADRESS_SPACE && newAdressSpace != null)) {
            if (EcoreUtil.isAncestor(this, newAdressSpace))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAdressSpace != null)
                msgs = ((InternalEObject)newAdressSpace).eInverseAdd(this, InstancePackage.ADRESS_SPACE__ADDRESSES, AdressSpace.class, msgs);
            msgs = basicSetAdressSpace(newAdressSpace, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ADDRESS__ADRESS_SPACE, newAdressSpace, newAdressSpace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAdressSpace((AdressSpace)otherEnd, msgs);
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
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                return basicSetAdressSpace(null, msgs);
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
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                return eInternalContainer().eInverseRemove(this, InstancePackage.ADRESS_SPACE__ADDRESSES, AdressSpace.class, msgs);
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
            case InstancePackage.ADDRESS__CONTENT:
                if (resolve) return getContent();
                return basicGetContent();
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                return getAdressSpace();
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
            case InstancePackage.ADDRESS__CONTENT:
                setContent((Content)newValue);
                return;
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                setAdressSpace((AdressSpace)newValue);
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
            case InstancePackage.ADDRESS__CONTENT:
                setContent((Content)null);
                return;
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                setAdressSpace((AdressSpace)null);
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
            case InstancePackage.ADDRESS__CONTENT:
                return content != null;
            case InstancePackage.ADDRESS__ADRESS_SPACE:
                return getAdressSpace() != null;
        }
        return super.eIsSet(featureID);
    }

} //AddressImpl
