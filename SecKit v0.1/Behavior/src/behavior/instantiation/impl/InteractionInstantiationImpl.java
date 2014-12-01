/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfInstantiation;
import behavior.instantiation.InteractionInstantiation;

import behavior.type.StructuredBehaviorType;
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
 * An implementation of the model object '<em><b>Interaction Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.InteractionInstantiationImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instantiation.impl.InteractionInstantiationImpl#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionInstantiationImpl extends ActivityInstantiationImpl implements InteractionInstantiation {
    /**
     * The cached value of the '{@link #getContributions() <em>Contributions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributions()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionOfInstantiation> contributions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionOfInstantiation> getContributions() {
        if (contributions == null) {
            contributions = new EObjectWithInverseResolvingEList<InteractionContributionOfInstantiation>(InteractionContributionOfInstantiation.class, this, InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION);
        }
        return contributions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredBehaviorType getBehaviorType() {
        if (eContainerFeatureID() != InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE) return null;
        return (StructuredBehaviorType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorType(StructuredBehaviorType newBehaviorType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehaviorType, InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorType(StructuredBehaviorType newBehaviorType) {
        if (newBehaviorType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE && newBehaviorType != null)) {
            if (EcoreUtil.isAncestor(this, newBehaviorType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehaviorType != null)
                msgs = ((InternalEObject)newBehaviorType).eInverseAdd(this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS, StructuredBehaviorType.class, msgs);
            msgs = basicSetBehaviorType(newBehaviorType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE, newBehaviorType, newBehaviorType));
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehaviorType((StructuredBehaviorType)otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                return basicSetBehaviorType(null, msgs);
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS, StructuredBehaviorType.class, msgs);
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                return getContributions();
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                return getBehaviorType();
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                getContributions().clear();
                getContributions().addAll((Collection<? extends InteractionContributionOfInstantiation>)newValue);
                return;
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                setBehaviorType((StructuredBehaviorType)newValue);
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                getContributions().clear();
                return;
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                setBehaviorType((StructuredBehaviorType)null);
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
            case InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS:
                return contributions != null && !contributions.isEmpty();
            case InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE:
                return getBehaviorType() != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionInstantiationImpl
