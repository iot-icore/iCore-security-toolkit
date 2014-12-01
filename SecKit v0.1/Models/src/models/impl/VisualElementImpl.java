/**
 */
package models.impl;

import models.Element;
import models.ModelsPackage;
import models.VisualElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.VisualElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VisualElementImpl extends MinimalEObjectImpl.Container implements VisualElement {
    /**
     * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected Element element;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VisualElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.VISUAL_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getElement() {
        if (element != null && element.eIsProxy()) {
            InternalEObject oldElement = (InternalEObject)element;
            element = (Element)eResolveProxy(oldElement);
            if (element != oldElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelsPackage.VISUAL_ELEMENT__ELEMENT, oldElement, element));
            }
        }
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetElement() {
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
        Element oldElement = element;
        element = newElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelsPackage.VISUAL_ELEMENT__ELEMENT, oldElement, newElement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElement(Element newElement) {
        if (newElement != element) {
            NotificationChain msgs = null;
            if (element != null)
                msgs = ((InternalEObject)element).eInverseRemove(this, ModelsPackage.ELEMENT__VISUAL_ELEMENTS, Element.class, msgs);
            if (newElement != null)
                msgs = ((InternalEObject)newElement).eInverseAdd(this, ModelsPackage.ELEMENT__VISUAL_ELEMENTS, Element.class, msgs);
            msgs = basicSetElement(newElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.VISUAL_ELEMENT__ELEMENT, newElement, newElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                if (element != null)
                    msgs = ((InternalEObject)element).eInverseRemove(this, ModelsPackage.ELEMENT__VISUAL_ELEMENTS, Element.class, msgs);
                return basicSetElement((Element)otherEnd, msgs);
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
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                return basicSetElement(null, msgs);
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
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                if (resolve) return getElement();
                return basicGetElement();
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
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                setElement((Element)newValue);
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
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                setElement((Element)null);
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
            case ModelsPackage.VISUAL_ELEMENT__ELEMENT:
                return element != null;
        }
        return super.eIsSet(featureID);
    }

} //VisualElementImpl
