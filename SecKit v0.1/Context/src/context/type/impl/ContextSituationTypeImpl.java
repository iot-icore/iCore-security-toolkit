/**
 */
package context.type.impl;

import context.instantiation.ContextSituationRule;

import context.type.ContextSituationType;
import context.type.ContextTypePackage;
import context.type.EntityRoleType;
import context.type.TypePackage;

import data.instantiation.DataInstantiation;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Situation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.ContextSituationTypeImpl#getEntityRoleTypes <em>Entity Role Types</em>}</li>
 *   <li>{@link context.type.impl.ContextSituationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.type.impl.ContextSituationTypeImpl#getSituationRule <em>Situation Rule</em>}</li>
 *   <li>{@link context.type.impl.ContextSituationTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link context.type.impl.ContextSituationTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationTypeImpl extends ElementImpl implements ContextSituationType {
    /**
     * The cached value of the '{@link #getEntityRoleTypes() <em>Entity Role Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityRoleTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityRoleType> entityRoleTypes;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getSituationRule() <em>Situation Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationRule()
     * @generated
     * @ordered
     */
    protected ContextSituationRule situationRule;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<DataInstantiation> attributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSituationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.CONTEXT_SITUATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityRoleType> getEntityRoleTypes() {
        if (entityRoleTypes == null) {
            entityRoleTypes = new EObjectContainmentWithInverseEList<EntityRoleType>(EntityRoleType.class, this, TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES, TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE);
        }
        return entityRoleTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_SITUATION_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationRule getSituationRule() {
        return situationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSituationRule(ContextSituationRule newSituationRule, NotificationChain msgs) {
        ContextSituationRule oldSituationRule = situationRule;
        situationRule = newSituationRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE, oldSituationRule, newSituationRule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSituationRule(ContextSituationRule newSituationRule) {
        if (newSituationRule != situationRule) {
            NotificationChain msgs = null;
            if (situationRule != null)
                msgs = ((InternalEObject)situationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE, null, msgs);
            if (newSituationRule != null)
                msgs = ((InternalEObject)newSituationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE, null, msgs);
            msgs = basicSetSituationRule(newSituationRule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE, newSituationRule, newSituationRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataInstantiation> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<DataInstantiation>(DataInstantiation.class, this, TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE) return null;
        return (ContextTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(ContextTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(ContextTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES, ContextTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE, newPackage, newPackage));
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityRoleTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                return ((InternalEList<?>)getEntityRoleTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE:
                return basicSetSituationRule(null, msgs);
            case TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES, ContextTypePackage.class, msgs);
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                return getEntityRoleTypes();
            case TypePackage.CONTEXT_SITUATION_TYPE__NAME:
                return getName();
            case TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE:
                return getSituationRule();
            case TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES:
                return getAttributes();
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                getEntityRoleTypes().clear();
                getEntityRoleTypes().addAll((Collection<? extends EntityRoleType>)newValue);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE:
                setSituationRule((ContextSituationRule)newValue);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends DataInstantiation>)newValue);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                getEntityRoleTypes().clear();
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE:
                setSituationRule((ContextSituationRule)null);
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES:
                getAttributes().clear();
                return;
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
            case TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES:
                return entityRoleTypes != null && !entityRoleTypes.isEmpty();
            case TypePackage.CONTEXT_SITUATION_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.CONTEXT_SITUATION_TYPE__SITUATION_RULE:
                return situationRule != null;
            case TypePackage.CONTEXT_SITUATION_TYPE__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE:
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ContextSituationTypeImpl
