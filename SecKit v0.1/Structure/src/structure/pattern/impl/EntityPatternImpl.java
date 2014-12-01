/**
 */
package structure.pattern.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import role.RolePattern;

import structure.instantiation.EntityInstantiationHierarchy;

import structure.pattern.EntityPattern;
import structure.pattern.PatternPackage;

import structure.type.EntityType;

import structure.variable.EntityVariable;
import trust.pattern.TrustPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getIdentityPattern <em>Identity Pattern</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getRolePattern <em>Role Pattern</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getContainerEntityPattern <em>Container Entity Pattern</em>}</li>
 *   <li>{@link structure.pattern.impl.EntityPatternImpl#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityPatternImpl extends PatternImpl implements EntityPattern {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EntityType type;

    /**
     * The cached value of the '{@link #getInstantiationHierarchy() <em>Instantiation Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiationHierarchy()
     * @generated
     * @ordered
     */
    protected EntityInstantiationHierarchy instantiationHierarchy;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<EntityVariable> variables;

    /**
     * The cached value of the '{@link #getIdentityPattern() <em>Identity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityPattern()
     * @generated
     * @ordered
     */
    protected IdentityPattern identityPattern;

    /**
     * The cached value of the '{@link #getRolePattern() <em>Role Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolePattern()
     * @generated
     * @ordered
     */
    protected RolePattern rolePattern;

    /**
     * The cached value of the '{@link #getContainerEntityPattern() <em>Container Entity Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerEntityPattern()
     * @generated
     * @ordered
     */
    protected EntityPattern containerEntityPattern;

    /**
     * The cached value of the '{@link #getTrustPattern() <em>Trust Pattern</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustPattern()
     * @generated
     * @ordered
     */
    protected EList<TrustPattern> trustPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.ENTITY_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (EntityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ENTITY_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(EntityType newType) {
        EntityType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationHierarchy getInstantiationHierarchy() {
        if (instantiationHierarchy != null && instantiationHierarchy.eIsProxy()) {
            InternalEObject oldInstantiationHierarchy = (InternalEObject)instantiationHierarchy;
            instantiationHierarchy = (EntityInstantiationHierarchy)eResolveProxy(oldInstantiationHierarchy);
            if (instantiationHierarchy != oldInstantiationHierarchy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY, oldInstantiationHierarchy, instantiationHierarchy));
            }
        }
        return instantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationHierarchy basicGetInstantiationHierarchy() {
        return instantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiationHierarchy(EntityInstantiationHierarchy newInstantiationHierarchy) {
        EntityInstantiationHierarchy oldInstantiationHierarchy = instantiationHierarchy;
        instantiationHierarchy = newInstantiationHierarchy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY, oldInstantiationHierarchy, instantiationHierarchy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectResolvingEList<EntityVariable>(EntityVariable.class, this, PatternPackage.ENTITY_PATTERN__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityPattern getIdentityPattern() {
        return identityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdentityPattern(IdentityPattern newIdentityPattern, NotificationChain msgs) {
        IdentityPattern oldIdentityPattern = identityPattern;
        identityPattern = newIdentityPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN, oldIdentityPattern, newIdentityPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentityPattern(IdentityPattern newIdentityPattern) {
        if (newIdentityPattern != identityPattern) {
            NotificationChain msgs = null;
            if (identityPattern != null)
                msgs = ((InternalEObject)identityPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN, null, msgs);
            if (newIdentityPattern != null)
                msgs = ((InternalEObject)newIdentityPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN, null, msgs);
            msgs = basicSetIdentityPattern(newIdentityPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN, newIdentityPattern, newIdentityPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RolePattern getRolePattern() {
        return rolePattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRolePattern(RolePattern newRolePattern, NotificationChain msgs) {
        RolePattern oldRolePattern = rolePattern;
        rolePattern = newRolePattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__ROLE_PATTERN, oldRolePattern, newRolePattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRolePattern(RolePattern newRolePattern) {
        if (newRolePattern != rolePattern) {
            NotificationChain msgs = null;
            if (rolePattern != null)
                msgs = ((InternalEObject)rolePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ENTITY_PATTERN__ROLE_PATTERN, null, msgs);
            if (newRolePattern != null)
                msgs = ((InternalEObject)newRolePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ENTITY_PATTERN__ROLE_PATTERN, null, msgs);
            msgs = basicSetRolePattern(newRolePattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__ROLE_PATTERN, newRolePattern, newRolePattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityPattern getContainerEntityPattern() {
        if (containerEntityPattern != null && containerEntityPattern.eIsProxy()) {
            InternalEObject oldContainerEntityPattern = (InternalEObject)containerEntityPattern;
            containerEntityPattern = (EntityPattern)eResolveProxy(oldContainerEntityPattern);
            if (containerEntityPattern != oldContainerEntityPattern) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN, oldContainerEntityPattern, containerEntityPattern));
            }
        }
        return containerEntityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityPattern basicGetContainerEntityPattern() {
        return containerEntityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerEntityPattern(EntityPattern newContainerEntityPattern) {
        EntityPattern oldContainerEntityPattern = containerEntityPattern;
        containerEntityPattern = newContainerEntityPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN, oldContainerEntityPattern, containerEntityPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TrustPattern> getTrustPattern() {
        if (trustPattern == null) {
            trustPattern = new EObjectContainmentEList<TrustPattern>(TrustPattern.class, this, PatternPackage.ENTITY_PATTERN__TRUST_PATTERN);
        }
        return trustPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN:
                return basicSetIdentityPattern(null, msgs);
            case PatternPackage.ENTITY_PATTERN__ROLE_PATTERN:
                return basicSetRolePattern(null, msgs);
            case PatternPackage.ENTITY_PATTERN__TRUST_PATTERN:
                return ((InternalEList<?>)getTrustPattern()).basicRemove(otherEnd, msgs);
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
            case PatternPackage.ENTITY_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY:
                if (resolve) return getInstantiationHierarchy();
                return basicGetInstantiationHierarchy();
            case PatternPackage.ENTITY_PATTERN__VARIABLES:
                return getVariables();
            case PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN:
                return getIdentityPattern();
            case PatternPackage.ENTITY_PATTERN__ROLE_PATTERN:
                return getRolePattern();
            case PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN:
                if (resolve) return getContainerEntityPattern();
                return basicGetContainerEntityPattern();
            case PatternPackage.ENTITY_PATTERN__TRUST_PATTERN:
                return getTrustPattern();
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
            case PatternPackage.ENTITY_PATTERN__TYPE:
                setType((EntityType)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY:
                setInstantiationHierarchy((EntityInstantiationHierarchy)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends EntityVariable>)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN:
                setIdentityPattern((IdentityPattern)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__ROLE_PATTERN:
                setRolePattern((RolePattern)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN:
                setContainerEntityPattern((EntityPattern)newValue);
                return;
            case PatternPackage.ENTITY_PATTERN__TRUST_PATTERN:
                getTrustPattern().clear();
                getTrustPattern().addAll((Collection<? extends TrustPattern>)newValue);
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
            case PatternPackage.ENTITY_PATTERN__TYPE:
                setType((EntityType)null);
                return;
            case PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY:
                setInstantiationHierarchy((EntityInstantiationHierarchy)null);
                return;
            case PatternPackage.ENTITY_PATTERN__VARIABLES:
                getVariables().clear();
                return;
            case PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN:
                setIdentityPattern((IdentityPattern)null);
                return;
            case PatternPackage.ENTITY_PATTERN__ROLE_PATTERN:
                setRolePattern((RolePattern)null);
                return;
            case PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN:
                setContainerEntityPattern((EntityPattern)null);
                return;
            case PatternPackage.ENTITY_PATTERN__TRUST_PATTERN:
                getTrustPattern().clear();
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
            case PatternPackage.ENTITY_PATTERN__TYPE:
                return type != null;
            case PatternPackage.ENTITY_PATTERN__INSTANTIATION_HIERARCHY:
                return instantiationHierarchy != null;
            case PatternPackage.ENTITY_PATTERN__VARIABLES:
                return variables != null && !variables.isEmpty();
            case PatternPackage.ENTITY_PATTERN__IDENTITY_PATTERN:
                return identityPattern != null;
            case PatternPackage.ENTITY_PATTERN__ROLE_PATTERN:
                return rolePattern != null;
            case PatternPackage.ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN:
                return containerEntityPattern != null;
            case PatternPackage.ENTITY_PATTERN__TRUST_PATTERN:
                return trustPattern != null && !trustPattern.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EntityPatternImpl
