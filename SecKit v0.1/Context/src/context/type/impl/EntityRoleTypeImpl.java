/**
 */
package context.type.impl;

import context.type.ContextInformationType;
import context.type.ContextSituationType;
import context.type.EntityRoleType;
import context.type.TypePackage;

import java.util.Collection;

import models.Multiplicity;

import models.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Entity Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.EntityRoleTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link context.type.impl.EntityRoleTypeImpl#getContextInformationTypes <em>Context Information Types</em>}</li>
 *   <li>{@link context.type.impl.EntityRoleTypeImpl#getContextSituationType <em>Context Situation Type</em>}</li>
 *   <li>{@link context.type.impl.EntityRoleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRoleTypeImpl extends ElementImpl implements EntityRoleType {
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
     * The cached value of the '{@link #getContextInformationTypes() <em>Context Information Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextInformationTypes()
     * @generated
     * @ordered
     */
    protected EList<ContextInformationType> contextInformationTypes;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityRoleTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ENTITY_ROLE_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
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
                msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY, null, msgs);
            if (newMultiplicity != null)
                msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY, null, msgs);
            msgs = basicSetMultiplicity(newMultiplicity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY, newMultiplicity, newMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextInformationType> getContextInformationTypes() {
        if (contextInformationTypes == null) {
            contextInformationTypes = new EObjectWithInverseResolvingEList.ManyInverse<ContextInformationType>(ContextInformationType.class, this, TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES, TypePackage.CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES);
        }
        return contextInformationTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType getContextSituationType() {
        if (eContainerFeatureID() != TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE) return null;
        return (ContextSituationType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextSituationType(ContextSituationType newContextSituationType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContextSituationType, TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextSituationType(ContextSituationType newContextSituationType) {
        if (newContextSituationType != eInternalContainer() || (eContainerFeatureID() != TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE && newContextSituationType != null)) {
            if (EcoreUtil.isAncestor(this, newContextSituationType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContextSituationType != null)
                msgs = ((InternalEObject)newContextSituationType).eInverseAdd(this, TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES, ContextSituationType.class, msgs);
            msgs = basicSetContextSituationType(newContextSituationType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE, newContextSituationType, newContextSituationType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_ROLE_TYPE__NAME, oldName, name));
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
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextInformationTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContextSituationType((ContextSituationType)otherEnd, msgs);
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
            case TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY:
                return basicSetMultiplicity(null, msgs);
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                return ((InternalEList<?>)getContextInformationTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                return basicSetContextSituationType(null, msgs);
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
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES, ContextSituationType.class, msgs);
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
            case TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY:
                return getMultiplicity();
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                return getContextInformationTypes();
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                return getContextSituationType();
            case TypePackage.ENTITY_ROLE_TYPE__NAME:
                return getName();
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
            case TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
                return;
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                getContextInformationTypes().clear();
                getContextInformationTypes().addAll((Collection<? extends ContextInformationType>)newValue);
                return;
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                setContextSituationType((ContextSituationType)newValue);
                return;
            case TypePackage.ENTITY_ROLE_TYPE__NAME:
                setName((String)newValue);
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
            case TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY:
                setMultiplicity((Multiplicity)null);
                return;
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                getContextInformationTypes().clear();
                return;
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                setContextSituationType((ContextSituationType)null);
                return;
            case TypePackage.ENTITY_ROLE_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case TypePackage.ENTITY_ROLE_TYPE__MULTIPLICITY:
                return multiplicity != null;
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES:
                return contextInformationTypes != null && !contextInformationTypes.isEmpty();
            case TypePackage.ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE:
                return getContextSituationType() != null;
            case TypePackage.ENTITY_ROLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //EntityRoleTypeImpl
