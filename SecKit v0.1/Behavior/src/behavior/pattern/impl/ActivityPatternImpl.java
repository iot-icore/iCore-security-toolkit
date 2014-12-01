/**
 */
package behavior.pattern.impl;

import behavior.instantiation.ActivityInstantiation;

import behavior.pattern.ActivityPattern;
import behavior.pattern.BehaviorPattern;
import behavior.pattern.PatternPackage;

import behavior.type.ActivityType;

import behavior.variable.ActivityVariable;

import data.pattern.DataPattern;

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

import role.IdentityRolePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getContainerBehaviorPattern <em>Container Behavior Pattern</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getDataPatterns <em>Data Patterns</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getIdentityRolePatterns <em>Identity Role Patterns</em>}</li>
 *   <li>{@link behavior.pattern.impl.ActivityPatternImpl#getIdentityPatterns <em>Identity Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPatternImpl extends PatternImpl implements ActivityPattern {
    /**
     * The cached value of the '{@link #getContainerBehaviorPattern() <em>Container Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerBehaviorPattern()
     * @generated
     * @ordered
     */
    protected BehaviorPattern containerBehaviorPattern;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected ActivityInstantiation instantiation;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ActivityType type;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<ActivityVariable> variables;

    /**
     * The cached value of the '{@link #getDataPatterns() <em>Data Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataPatterns()
     * @generated
     * @ordered
     */
    protected EList<DataPattern> dataPatterns;

    /**
     * The cached value of the '{@link #getIdentityRolePatterns() <em>Identity Role Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityRolePatterns()
     * @generated
     * @ordered
     */
    protected EList<IdentityRolePattern> identityRolePatterns;

    /**
     * The cached value of the '{@link #getIdentityPatterns() <em>Identity Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityPatterns()
     * @generated
     * @ordered
     */
    protected EList<IdentityPattern> identityPatterns;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.ACTIVITY_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorPattern getContainerBehaviorPattern() {
        return containerBehaviorPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerBehaviorPattern(BehaviorPattern newContainerBehaviorPattern, NotificationChain msgs) {
        BehaviorPattern oldContainerBehaviorPattern = containerBehaviorPattern;
        containerBehaviorPattern = newContainerBehaviorPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN, oldContainerBehaviorPattern, newContainerBehaviorPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerBehaviorPattern(BehaviorPattern newContainerBehaviorPattern) {
        if (newContainerBehaviorPattern != containerBehaviorPattern) {
            NotificationChain msgs = null;
            if (containerBehaviorPattern != null)
                msgs = ((InternalEObject)containerBehaviorPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN, null, msgs);
            if (newContainerBehaviorPattern != null)
                msgs = ((InternalEObject)newContainerBehaviorPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN, null, msgs);
            msgs = basicSetContainerBehaviorPattern(newContainerBehaviorPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN, newContainerBehaviorPattern, newContainerBehaviorPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (ActivityInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ACTIVITY_PATTERN__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(ActivityInstantiation newInstantiation) {
        ActivityInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ACTIVITY_PATTERN__INSTANTIATION, oldInstantiation, instantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ActivityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ACTIVITY_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ActivityType newType) {
        ActivityType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ACTIVITY_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectResolvingEList<ActivityVariable>(ActivityVariable.class, this, PatternPackage.ACTIVITY_PATTERN__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataPattern> getDataPatterns() {
        if (dataPatterns == null) {
            dataPatterns = new EObjectContainmentEList<DataPattern>(DataPattern.class, this, PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS);
        }
        return dataPatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityRolePattern> getIdentityRolePatterns() {
        if (identityRolePatterns == null) {
            identityRolePatterns = new EObjectContainmentEList<IdentityRolePattern>(IdentityRolePattern.class, this, PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS);
        }
        return identityRolePatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityPattern> getIdentityPatterns() {
        if (identityPatterns == null) {
            identityPatterns = new EObjectContainmentEList<IdentityPattern>(IdentityPattern.class, this, PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS);
        }
        return identityPatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN:
                return basicSetContainerBehaviorPattern(null, msgs);
            case PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS:
                return ((InternalEList<?>)getDataPatterns()).basicRemove(otherEnd, msgs);
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS:
                return ((InternalEList<?>)getIdentityRolePatterns()).basicRemove(otherEnd, msgs);
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS:
                return ((InternalEList<?>)getIdentityPatterns()).basicRemove(otherEnd, msgs);
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
            case PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN:
                return getContainerBehaviorPattern();
            case PatternPackage.ACTIVITY_PATTERN__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case PatternPackage.ACTIVITY_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.ACTIVITY_PATTERN__VARIABLES:
                return getVariables();
            case PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS:
                return getDataPatterns();
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS:
                return getIdentityRolePatterns();
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS:
                return getIdentityPatterns();
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
            case PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN:
                setContainerBehaviorPattern((BehaviorPattern)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__INSTANTIATION:
                setInstantiation((ActivityInstantiation)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__TYPE:
                setType((ActivityType)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends ActivityVariable>)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS:
                getDataPatterns().clear();
                getDataPatterns().addAll((Collection<? extends DataPattern>)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS:
                getIdentityRolePatterns().clear();
                getIdentityRolePatterns().addAll((Collection<? extends IdentityRolePattern>)newValue);
                return;
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS:
                getIdentityPatterns().clear();
                getIdentityPatterns().addAll((Collection<? extends IdentityPattern>)newValue);
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
            case PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN:
                setContainerBehaviorPattern((BehaviorPattern)null);
                return;
            case PatternPackage.ACTIVITY_PATTERN__INSTANTIATION:
                setInstantiation((ActivityInstantiation)null);
                return;
            case PatternPackage.ACTIVITY_PATTERN__TYPE:
                setType((ActivityType)null);
                return;
            case PatternPackage.ACTIVITY_PATTERN__VARIABLES:
                getVariables().clear();
                return;
            case PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS:
                getDataPatterns().clear();
                return;
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS:
                getIdentityRolePatterns().clear();
                return;
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS:
                getIdentityPatterns().clear();
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
            case PatternPackage.ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN:
                return containerBehaviorPattern != null;
            case PatternPackage.ACTIVITY_PATTERN__INSTANTIATION:
                return instantiation != null;
            case PatternPackage.ACTIVITY_PATTERN__TYPE:
                return type != null;
            case PatternPackage.ACTIVITY_PATTERN__VARIABLES:
                return variables != null && !variables.isEmpty();
            case PatternPackage.ACTIVITY_PATTERN__DATA_PATTERNS:
                return dataPatterns != null && !dataPatterns.isEmpty();
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS:
                return identityRolePatterns != null && !identityRolePatterns.isEmpty();
            case PatternPackage.ACTIVITY_PATTERN__IDENTITY_PATTERNS:
                return identityPatterns != null && !identityPatterns.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActivityPatternImpl
