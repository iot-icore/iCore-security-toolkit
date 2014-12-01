/**
 */
package behavior.pattern.impl;

import behavior.instantiation.BehaviorInstantiationHierarchy;

import behavior.pattern.BehaviorPattern;
import behavior.pattern.PatternPackage;

import behavior.type.BehaviorType;

import behavior.variable.BehaviorVariable;

import java.util.Collection;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import structure.pattern.EntityPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.pattern.impl.BehaviorPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.impl.BehaviorPatternImpl#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}</li>
 *   <li>{@link behavior.pattern.impl.BehaviorPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link behavior.pattern.impl.BehaviorPatternImpl#getEntityPattern <em>Entity Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorPatternImpl extends PatternImpl implements BehaviorPattern {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected BehaviorType type;

    /**
     * The cached value of the '{@link #getInstantiationHierarchy() <em>Instantiation Hierarchy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiationHierarchy()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiationHierarchy instantiationHierarchy;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<BehaviorVariable> variables;

    /**
     * The cached value of the '{@link #getEntityPattern() <em>Entity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityPattern()
     * @generated
     * @ordered
     */
    protected EntityPattern entityPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.BEHAVIOR_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (BehaviorType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.BEHAVIOR_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(BehaviorType newType) {
        BehaviorType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.BEHAVIOR_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationHierarchy getInstantiationHierarchy() {
        return instantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiationHierarchy(BehaviorInstantiationHierarchy newInstantiationHierarchy, NotificationChain msgs) {
        BehaviorInstantiationHierarchy oldInstantiationHierarchy = instantiationHierarchy;
        instantiationHierarchy = newInstantiationHierarchy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY, oldInstantiationHierarchy, newInstantiationHierarchy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiationHierarchy(BehaviorInstantiationHierarchy newInstantiationHierarchy) {
        if (newInstantiationHierarchy != instantiationHierarchy) {
            NotificationChain msgs = null;
            if (instantiationHierarchy != null)
                msgs = ((InternalEObject)instantiationHierarchy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY, null, msgs);
            if (newInstantiationHierarchy != null)
                msgs = ((InternalEObject)newInstantiationHierarchy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY, null, msgs);
            msgs = basicSetInstantiationHierarchy(newInstantiationHierarchy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY, newInstantiationHierarchy, newInstantiationHierarchy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectResolvingEList<BehaviorVariable>(BehaviorVariable.class, this, PatternPackage.BEHAVIOR_PATTERN__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityPattern getEntityPattern() {
        return entityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityPattern(EntityPattern newEntityPattern, NotificationChain msgs) {
        EntityPattern oldEntityPattern = entityPattern;
        entityPattern = newEntityPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN, oldEntityPattern, newEntityPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityPattern(EntityPattern newEntityPattern) {
        if (newEntityPattern != entityPattern) {
            NotificationChain msgs = null;
            if (entityPattern != null)
                msgs = ((InternalEObject)entityPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN, null, msgs);
            if (newEntityPattern != null)
                msgs = ((InternalEObject)newEntityPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN, null, msgs);
            msgs = basicSetEntityPattern(newEntityPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN, newEntityPattern, newEntityPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY:
                return basicSetInstantiationHierarchy(null, msgs);
            case PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN:
                return basicSetEntityPattern(null, msgs);
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
            case PatternPackage.BEHAVIOR_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY:
                return getInstantiationHierarchy();
            case PatternPackage.BEHAVIOR_PATTERN__VARIABLES:
                return getVariables();
            case PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN:
                return getEntityPattern();
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
            case PatternPackage.BEHAVIOR_PATTERN__TYPE:
                setType((BehaviorType)newValue);
                return;
            case PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY:
                setInstantiationHierarchy((BehaviorInstantiationHierarchy)newValue);
                return;
            case PatternPackage.BEHAVIOR_PATTERN__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends BehaviorVariable>)newValue);
                return;
            case PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN:
                setEntityPattern((EntityPattern)newValue);
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
            case PatternPackage.BEHAVIOR_PATTERN__TYPE:
                setType((BehaviorType)null);
                return;
            case PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY:
                setInstantiationHierarchy((BehaviorInstantiationHierarchy)null);
                return;
            case PatternPackage.BEHAVIOR_PATTERN__VARIABLES:
                getVariables().clear();
                return;
            case PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN:
                setEntityPattern((EntityPattern)null);
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
            case PatternPackage.BEHAVIOR_PATTERN__TYPE:
                return type != null;
            case PatternPackage.BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY:
                return instantiationHierarchy != null;
            case PatternPackage.BEHAVIOR_PATTERN__VARIABLES:
                return variables != null && !variables.isEmpty();
            case PatternPackage.BEHAVIOR_PATTERN__ENTITY_PATTERN:
                return entityPattern != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorPatternImpl
