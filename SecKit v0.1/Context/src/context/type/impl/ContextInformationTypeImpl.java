/**
 */
package context.type.impl;

import context.type.ContextInformationType;
import context.type.ContextTypePackage;
import context.type.EntityRoleType;
import context.type.OriginType;
import context.type.TypePackage;

import data.type.impl.DataTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.ContextInformationTypeImpl#getOriginType <em>Origin Type</em>}</li>
 *   <li>{@link context.type.impl.ContextInformationTypeImpl#getSituationRoleTypes <em>Situation Role Types</em>}</li>
 *   <li>{@link context.type.impl.ContextInformationTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextInformationTypeImpl extends DataTypeImpl implements ContextInformationType {
    /**
     * The default value of the '{@link #getOriginType() <em>Origin Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginType()
     * @generated
     * @ordered
     */
    protected static final OriginType ORIGIN_TYPE_EDEFAULT = OriginType.SENSED;

    /**
     * The cached value of the '{@link #getOriginType() <em>Origin Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginType()
     * @generated
     * @ordered
     */
    protected OriginType originType = ORIGIN_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSituationRoleTypes() <em>Situation Role Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationRoleTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityRoleType> situationRoleTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextInformationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.CONTEXT_INFORMATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OriginType getOriginType() {
        return originType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOriginType(OriginType newOriginType) {
        OriginType oldOriginType = originType;
        originType = newOriginType == null ? ORIGIN_TYPE_EDEFAULT : newOriginType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE, oldOriginType, originType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityRoleType> getSituationRoleTypes() {
        if (situationRoleTypes == null) {
            situationRoleTypes = new EObjectWithInverseResolvingEList.ManyInverse<EntityRoleType>(EntityRoleType.class, this, TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES, TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES);
        }
        return situationRoleTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE) return null;
        return (ContextTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(ContextTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(ContextTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES, ContextTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSituationRoleTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((ContextTypePackage)otherEnd, msgs);
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                return ((InternalEList<?>)getSituationRoleTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES, ContextTypePackage.class, msgs);
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE:
                return getOriginType();
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                return getSituationRoleTypes();
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                return getPackage();
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE:
                setOriginType((OriginType)newValue);
                return;
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                getSituationRoleTypes().clear();
                getSituationRoleTypes().addAll((Collection<? extends EntityRoleType>)newValue);
                return;
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                setPackage((ContextTypePackage)newValue);
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE:
                setOriginType(ORIGIN_TYPE_EDEFAULT);
                return;
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                getSituationRoleTypes().clear();
                return;
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                setPackage((ContextTypePackage)null);
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
            case TypePackage.CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE:
                return originType != ORIGIN_TYPE_EDEFAULT;
            case TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES:
                return situationRoleTypes != null && !situationRoleTypes.isEmpty();
            case TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE:
                return getPackage() != null;
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
        result.append(" (originType: ");
        result.append(originType);
        result.append(')');
        return result.toString();
    }

} //ContextInformationTypeImpl
