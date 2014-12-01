/**
 */
package behavior.type.impl;

import behavior.constraint.Constraint;

import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionInstantiation;

import behavior.type.InteractionContributionType;
import behavior.type.InteractionType;
import behavior.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.InteractionContributionTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.InteractionContributionTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link behavior.type.impl.InteractionContributionTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.type.impl.InteractionContributionTypeImpl#getInteractionType <em>Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionContributionTypeImpl extends ElementImpl implements InteractionContributionType {
    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionInstantiation> instantiations;

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
     * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraints()
     * @generated
     * @ordered
     */
    protected EList<Constraint> constraints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionContributionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.INTERACTION_CONTRIBUTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<InteractionContributionInstantiation>(InteractionContributionInstantiation.class, this, TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS, InstantiationPackage.INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE);
        }
        return instantiations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_CONTRIBUTION_TYPE__ROLE, oldRole, role));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS);
        }
        return constraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionType getInteractionType() {
        if (eContainerFeatureID() != TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE) return null;
        return (InteractionType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteractionType(InteractionType newInteractionType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInteractionType, TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionType(InteractionType newInteractionType) {
        if (newInteractionType != eInternalContainer() || (eContainerFeatureID() != TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE && newInteractionType != null)) {
            if (EcoreUtil.isAncestor(this, newInteractionType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInteractionType != null)
                msgs = ((InternalEObject)newInteractionType).eInverseAdd(this, TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES, InteractionType.class, msgs);
            msgs = basicSetInteractionType(newInteractionType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE, newInteractionType, newInteractionType));
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInteractionType((InteractionType)otherEnd, msgs);
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                return basicSetInteractionType(null, msgs);
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES, InteractionType.class, msgs);
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__ROLE:
                return getRole();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS:
                return getConstraints();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                return getInteractionType();
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends InteractionContributionInstantiation>)newValue);
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__ROLE:
                setRole((String)newValue);
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends Constraint>)newValue);
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                setInteractionType((InteractionType)newValue);
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__ROLE:
                setRole(ROLE_EDEFAULT);
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS:
                getConstraints().clear();
                return;
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                setInteractionType((InteractionType)null);
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
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__ROLE:
                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE:
                return getInteractionType() != null;
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

} //InteractionContributionTypeImpl
