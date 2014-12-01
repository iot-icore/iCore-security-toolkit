/**
 */
package context.type.impl;

import context.type.ContextSituationType;
import context.type.SituationRoleType;
import context.type.TypePackage;

import models.Multiplicity;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.SituationRoleTypeImpl#getContextSituationType <em>Context Situation Type</em>}</li>
 *   <li>{@link context.type.impl.SituationRoleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link context.type.impl.SituationRoleTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationRoleTypeImpl extends ElementImpl implements SituationRoleType {
    /**
     * The cached value of the '{@link #getContextSituationType() <em>Context Situation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextSituationType()
     * @generated
     * @ordered
     */
    protected ContextSituationType contextSituationType;

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
     * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected Multiplicity multiplicity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SituationRoleTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.SITUATION_ROLE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType getContextSituationType() {
        if (contextSituationType != null && contextSituationType.eIsProxy()) {
            InternalEObject oldContextSituationType = (InternalEObject)contextSituationType;
            contextSituationType = (ContextSituationType)eResolveProxy(oldContextSituationType);
            if (contextSituationType != oldContextSituationType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE, oldContextSituationType, contextSituationType));
            }
        }
        return contextSituationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType basicGetContextSituationType() {
        return contextSituationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextSituationType(ContextSituationType newContextSituationType) {
        ContextSituationType oldContextSituationType = contextSituationType;
        contextSituationType = newContextSituationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE, oldContextSituationType, contextSituationType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.SITUATION_ROLE_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity getMultiplicity() {
        return multiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
        Multiplicity oldMultiplicity = multiplicity;
        multiplicity = newMultiplicity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplicity(Multiplicity newMultiplicity) {
        if (newMultiplicity != multiplicity) {
            NotificationChain msgs = null;
            if (multiplicity != null)
                msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY, null, msgs);
            if (newMultiplicity != null)
                msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY, null, msgs);
            msgs = basicSetMultiplicity(newMultiplicity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY, newMultiplicity, newMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY:
                return basicSetMultiplicity(null, msgs);
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
            case TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                if (resolve) return getContextSituationType();
                return basicGetContextSituationType();
            case TypePackage.SITUATION_ROLE_TYPE__NAME:
                return getName();
            case TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY:
                return getMultiplicity();
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
            case TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                setContextSituationType((ContextSituationType)newValue);
                return;
            case TypePackage.SITUATION_ROLE_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
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
            case TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                setContextSituationType((ContextSituationType)null);
                return;
            case TypePackage.SITUATION_ROLE_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY:
                setMultiplicity((Multiplicity)null);
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
            case TypePackage.SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                return contextSituationType != null;
            case TypePackage.SITUATION_ROLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.SITUATION_ROLE_TYPE__MULTIPLICITY:
                return multiplicity != null;
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

} //SituationRoleTypeImpl
