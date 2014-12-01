/**
 */
package context.pattern.impl;

import context.pattern.EntityRolePattern;
import context.pattern.PatternPackage;

import context.type.EntityRoleType;

import identity.pattern.IdentityPattern;

import java.util.Collection;

import models.impl.PatternImpl;

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
 * An implementation of the model object '<em><b>Entity Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.pattern.impl.EntityRolePatternImpl#getIdentityPattern <em>Identity Pattern</em>}</li>
 *   <li>{@link context.pattern.impl.EntityRolePatternImpl#getEntityRoleType <em>Entity Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRolePatternImpl extends PatternImpl implements EntityRolePattern {
    /**
     * The cached value of the '{@link #getIdentityPattern() <em>Identity Pattern</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityPattern()
     * @generated
     * @ordered
     */
    protected EList<IdentityPattern> identityPattern;

    /**
     * The cached value of the '{@link #getEntityRoleType() <em>Entity Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityRoleType()
     * @generated
     * @ordered
     */
    protected EntityRoleType entityRoleType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityRolePatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.ENTITY_ROLE_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityPattern> getIdentityPattern() {
        if (identityPattern == null) {
            identityPattern = new EObjectContainmentEList<IdentityPattern>(IdentityPattern.class, this, PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN);
        }
        return identityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRoleType getEntityRoleType() {
        if (entityRoleType != null && entityRoleType.eIsProxy()) {
            InternalEObject oldEntityRoleType = (InternalEObject)entityRoleType;
            entityRoleType = (EntityRoleType)eResolveProxy(oldEntityRoleType);
            if (entityRoleType != oldEntityRoleType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE, oldEntityRoleType, entityRoleType));
            }
        }
        return entityRoleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRoleType basicGetEntityRoleType() {
        return entityRoleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityRoleType(EntityRoleType newEntityRoleType) {
        EntityRoleType oldEntityRoleType = entityRoleType;
        entityRoleType = newEntityRoleType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE, oldEntityRoleType, entityRoleType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return ((InternalEList<?>)getIdentityPattern()).basicRemove(otherEnd, msgs);
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
            case PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return getIdentityPattern();
            case PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE:
                if (resolve) return getEntityRoleType();
                return basicGetEntityRoleType();
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
            case PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                getIdentityPattern().clear();
                getIdentityPattern().addAll((Collection<? extends IdentityPattern>)newValue);
                return;
            case PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE:
                setEntityRoleType((EntityRoleType)newValue);
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
            case PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                getIdentityPattern().clear();
                return;
            case PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE:
                setEntityRoleType((EntityRoleType)null);
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
            case PatternPackage.ENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return identityPattern != null && !identityPattern.isEmpty();
            case PatternPackage.ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE:
                return entityRoleType != null;
        }
        return super.eIsSet(featureID);
    }

} //EntityRolePatternImpl
