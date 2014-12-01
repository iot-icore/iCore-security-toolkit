/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfInstantiation;

import behavior.type.AbstractBehaviorType;
import behavior.type.TypePackage;

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
 * An implementation of the model object '<em><b>Abstract Interaction Contribution Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl#getBehaviorType <em>Behavior Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl#getContributionOfInstantiations <em>Contribution Of Instantiations</em>}</li>
 *   <li>{@link behavior.instantiation.impl.AbstractInteractionContributionOfTypeImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractInteractionContributionOfTypeImpl extends InteractionContributionInstantiationImpl implements AbstractInteractionContributionOfType {
    /**
     * The cached value of the '{@link #getContributionOfInstantiations() <em>Contribution Of Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributionOfInstantiations()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionOfInstantiation> contributionOfInstantiations;

    /**
     * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected static final String ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected String role = ROLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractInteractionContributionOfTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType getBehaviorType() {
        if (eContainerFeatureID() != InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE) return null;
        return (AbstractBehaviorType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorType(AbstractBehaviorType newBehaviorType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehaviorType, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorType(AbstractBehaviorType newBehaviorType) {
        if (newBehaviorType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE && newBehaviorType != null)) {
            if (EcoreUtil.isAncestor(this, newBehaviorType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehaviorType != null)
                msgs = ((InternalEObject)newBehaviorType).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS, AbstractBehaviorType.class, msgs);
            msgs = basicSetBehaviorType(newBehaviorType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE, newBehaviorType, newBehaviorType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionOfInstantiation> getContributionOfInstantiations() {
        if (contributionOfInstantiations == null) {
            contributionOfInstantiations = new EObjectWithInverseResolvingEList<InteractionContributionOfInstantiation>(InteractionContributionOfInstantiation.class, this, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE);
        }
        return contributionOfInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRole() {
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(String newRole) {
        String oldRole = role;
        role = newRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE, oldRole, role));
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehaviorType((AbstractBehaviorType)otherEnd, msgs);
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributionOfInstantiations()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                return basicSetBehaviorType(null, msgs);
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                return ((InternalEList<?>)getContributionOfInstantiations()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS, AbstractBehaviorType.class, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                return getBehaviorType();
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                return getContributionOfInstantiations();
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE:
                return getRole();
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                setBehaviorType((AbstractBehaviorType)newValue);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                getContributionOfInstantiations().clear();
                getContributionOfInstantiations().addAll((Collection<? extends InteractionContributionOfInstantiation>)newValue);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE:
                setRole((String)newValue);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                setBehaviorType((AbstractBehaviorType)null);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                getContributionOfInstantiations().clear();
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE:
                setRole(ROLE_EDEFAULT);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE:
                return getBehaviorType() != null;
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS:
                return contributionOfInstantiations != null && !contributionOfInstantiations.isEmpty();
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE:
                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
        result.append(" (role: ");
        result.append(role);
        result.append(')');
        return result.toString();
    }

} //AbstractInteractionContributionOfTypeImpl
