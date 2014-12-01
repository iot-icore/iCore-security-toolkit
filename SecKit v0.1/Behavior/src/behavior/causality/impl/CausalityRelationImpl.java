/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityCondition;
import behavior.causality.CausalityPackage;
import behavior.causality.CausalityParameter;
import behavior.causality.CausalityRelation;

import behavior.type.AbstractBehaviorType;
import behavior.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.CausalityRelationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link behavior.causality.impl.CausalityRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link behavior.causality.impl.CausalityRelationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link behavior.causality.impl.CausalityRelationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausalityRelationImpl extends MinimalEObjectImpl.Container implements CausalityRelation {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected CausalityCondition condition;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected CausalityParameter target;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CausalityRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.CAUSALITY_RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityCondition getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(CausalityCondition newCondition, NotificationChain msgs) {
        CausalityCondition oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_RELATION__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(CausalityCondition newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CausalityPackage.CAUSALITY_RELATION__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CausalityPackage.CAUSALITY_RELATION__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_RELATION__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityParameter getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (CausalityParameter)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CausalityPackage.CAUSALITY_RELATION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityParameter basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(CausalityParameter newTarget) {
        CausalityParameter oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_RELATION__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType getContext() {
        if (eContainerFeatureID() != CausalityPackage.CAUSALITY_RELATION__CONTEXT) return null;
        return (AbstractBehaviorType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContext(AbstractBehaviorType newContext, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContext, CausalityPackage.CAUSALITY_RELATION__CONTEXT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(AbstractBehaviorType newContext) {
        if (newContext != eInternalContainer() || (eContainerFeatureID() != CausalityPackage.CAUSALITY_RELATION__CONTEXT && newContext != null)) {
            if (EcoreUtil.isAncestor(this, newContext))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContext != null)
                msgs = ((InternalEObject)newContext).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS, AbstractBehaviorType.class, msgs);
            msgs = basicSetContext(newContext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_RELATION__CONTEXT, newContext, newContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_RELATION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContext((AbstractBehaviorType)otherEnd, msgs);
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
            case CausalityPackage.CAUSALITY_RELATION__CONDITION:
                return basicSetCondition(null, msgs);
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                return basicSetContext(null, msgs);
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
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                return eInternalContainer().eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS, AbstractBehaviorType.class, msgs);
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
            case CausalityPackage.CAUSALITY_RELATION__CONDITION:
                return getCondition();
            case CausalityPackage.CAUSALITY_RELATION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                return getContext();
            case CausalityPackage.CAUSALITY_RELATION__ID:
                return getId();
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
            case CausalityPackage.CAUSALITY_RELATION__CONDITION:
                setCondition((CausalityCondition)newValue);
                return;
            case CausalityPackage.CAUSALITY_RELATION__TARGET:
                setTarget((CausalityParameter)newValue);
                return;
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                setContext((AbstractBehaviorType)newValue);
                return;
            case CausalityPackage.CAUSALITY_RELATION__ID:
                setId((String)newValue);
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
            case CausalityPackage.CAUSALITY_RELATION__CONDITION:
                setCondition((CausalityCondition)null);
                return;
            case CausalityPackage.CAUSALITY_RELATION__TARGET:
                setTarget((CausalityParameter)null);
                return;
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                setContext((AbstractBehaviorType)null);
                return;
            case CausalityPackage.CAUSALITY_RELATION__ID:
                setId(ID_EDEFAULT);
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
            case CausalityPackage.CAUSALITY_RELATION__CONDITION:
                return condition != null;
            case CausalityPackage.CAUSALITY_RELATION__TARGET:
                return target != null;
            case CausalityPackage.CAUSALITY_RELATION__CONTEXT:
                return getContext() != null;
            case CausalityPackage.CAUSALITY_RELATION__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //CausalityRelationImpl
