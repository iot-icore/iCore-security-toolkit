/**
 */
package context.pattern.impl;

import context.pattern.ContextSituationPattern;
import context.pattern.EntityRolePattern;
import context.pattern.PatternPackage;

import context.type.ContextSituationType;

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
 * An implementation of the model object '<em><b>Context Situation Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.pattern.impl.ContextSituationPatternImpl#getEntityRolePatterns <em>Entity Role Patterns</em>}</li>
 *   <li>{@link context.pattern.impl.ContextSituationPatternImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationPatternImpl extends PatternImpl implements ContextSituationPattern {
    /**
     * The cached value of the '{@link #getEntityRolePatterns() <em>Entity Role Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityRolePatterns()
     * @generated
     * @ordered
     */
    protected EList<EntityRolePattern> entityRolePatterns;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ContextSituationType type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSituationPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.CONTEXT_SITUATION_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityRolePattern> getEntityRolePatterns() {
        if (entityRolePatterns == null) {
            entityRolePatterns = new EObjectContainmentEList<EntityRolePattern>(EntityRolePattern.class, this, PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS);
        }
        return entityRolePatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ContextSituationType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ContextSituationType newType) {
        ContextSituationType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS:
                return ((InternalEList<?>)getEntityRolePatterns()).basicRemove(otherEnd, msgs);
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
            case PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS:
                return getEntityRolePatterns();
            case PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS:
                getEntityRolePatterns().clear();
                getEntityRolePatterns().addAll((Collection<? extends EntityRolePattern>)newValue);
                return;
            case PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE:
                setType((ContextSituationType)newValue);
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
            case PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS:
                getEntityRolePatterns().clear();
                return;
            case PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE:
                setType((ContextSituationType)null);
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
            case PatternPackage.CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS:
                return entityRolePatterns != null && !entityRolePatterns.isEmpty();
            case PatternPackage.CONTEXT_SITUATION_PATTERN__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //ContextSituationPatternImpl
