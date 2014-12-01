/**
 */
package identity.instance.impl;

import identity.instance.AbstractIdentity;
import identity.instance.IdentityAttribute;
import identity.instance.IdentityOwner;
import identity.instance.InstancePackage;

import identity.instantiation.IdentityInstantiation;
import identity.instantiation.InstantiationPackage;

import identity.type.IdentityType;

import java.util.Collection;

import models.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Abstract Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.instance.impl.AbstractIdentityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link identity.instance.impl.AbstractIdentityImpl#getType <em>Type</em>}</li>
 *   <li>{@link identity.instance.impl.AbstractIdentityImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link identity.instance.impl.AbstractIdentityImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link identity.instance.impl.AbstractIdentityImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractIdentityImpl extends ElementImpl implements AbstractIdentity {
    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<IdentityAttribute> attributes;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected IdentityType type;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected IdentityInstantiation instantiation;

    /**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected static final String SUBJECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected String subject = SUBJECT_EDEFAULT;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected IdentityOwner owner;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractIdentityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ABSTRACT_IDENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<IdentityAttribute>(IdentityAttribute.class, this, InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (IdentityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ABSTRACT_IDENTITY__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(IdentityType newType) {
        IdentityType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (IdentityInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(IdentityInstantiation newInstantiation, NotificationChain msgs) {
        IdentityInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(IdentityInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES, IdentityInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES, IdentityInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubject(String newSubject) {
        String oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__SUBJECT, oldSubject, subject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityOwner getOwner() {
        if (owner != null && owner.eIsProxy()) {
            InternalEObject oldOwner = (InternalEObject)owner;
            owner = (IdentityOwner)eResolveProxy(oldOwner);
            if (owner != oldOwner) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ABSTRACT_IDENTITY__OWNER, oldOwner, owner));
            }
        }
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityOwner basicGetOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(IdentityOwner newOwner, NotificationChain msgs) {
        IdentityOwner oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__OWNER, oldOwner, newOwner);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(IdentityOwner newOwner) {
        if (newOwner != owner) {
            NotificationChain msgs = null;
            if (owner != null)
                msgs = ((InternalEObject)owner).eInverseRemove(this, InstancePackage.IDENTITY_OWNER__IDENTITIES, IdentityOwner.class, msgs);
            if (newOwner != null)
                msgs = ((InternalEObject)newOwner).eInverseAdd(this, InstancePackage.IDENTITY_OWNER__IDENTITIES, IdentityOwner.class, msgs);
            msgs = basicSetOwner(newOwner, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_IDENTITY__OWNER, newOwner, newOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES, IdentityInstantiation.class, msgs);
                return basicSetInstantiation((IdentityInstantiation)otherEnd, msgs);
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
                if (owner != null)
                    msgs = ((InternalEObject)owner).eInverseRemove(this, InstancePackage.IDENTITY_OWNER__IDENTITIES, IdentityOwner.class, msgs);
                return basicSetOwner((IdentityOwner)otherEnd, msgs);
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
            case InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
                return basicSetOwner(null, msgs);
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
            case InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES:
                return getAttributes();
            case InstancePackage.ABSTRACT_IDENTITY__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstancePackage.ABSTRACT_IDENTITY__SUBJECT:
                return getSubject();
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends IdentityAttribute>)newValue);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__TYPE:
                setType((IdentityType)newValue);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                setInstantiation((IdentityInstantiation)newValue);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__SUBJECT:
                setSubject((String)newValue);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
                setOwner((IdentityOwner)newValue);
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
            case InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES:
                getAttributes().clear();
                return;
            case InstancePackage.ABSTRACT_IDENTITY__TYPE:
                setType((IdentityType)null);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                setInstantiation((IdentityInstantiation)null);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__SUBJECT:
                setSubject(SUBJECT_EDEFAULT);
                return;
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
                setOwner((IdentityOwner)null);
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
            case InstancePackage.ABSTRACT_IDENTITY__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case InstancePackage.ABSTRACT_IDENTITY__TYPE:
                return type != null;
            case InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION:
                return instantiation != null;
            case InstancePackage.ABSTRACT_IDENTITY__SUBJECT:
                return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
            case InstancePackage.ABSTRACT_IDENTITY__OWNER:
                return owner != null;
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
        result.append(" (subject: ");
        result.append(subject);
        result.append(')');
        return result.toString();
    }

} //AbstractIdentityImpl
