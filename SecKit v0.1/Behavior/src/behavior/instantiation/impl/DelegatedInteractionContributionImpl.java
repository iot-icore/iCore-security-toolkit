/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfInstantiation;

import behavior.type.StructuredBehaviorType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegated Interaction Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.DelegatedInteractionContributionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link behavior.instantiation.impl.DelegatedInteractionContributionImpl#getDelegatedTo <em>Delegated To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegatedInteractionContributionImpl extends AbstractInteractionContributionOfTypeImpl implements DelegatedInteractionContribution {
    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected StructuredBehaviorType context;

    /**
     * The cached value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedTo()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionOfInstantiation> delegatedTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelegatedInteractionContributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.DELEGATED_INTERACTION_CONTRIBUTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredBehaviorType getContext() {
        if (context != null && context.eIsProxy()) {
            InternalEObject oldContext = (InternalEObject)context;
            context = (StructuredBehaviorType)eResolveProxy(oldContext);
            if (context != oldContext) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT, oldContext, context));
            }
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredBehaviorType basicGetContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(StructuredBehaviorType newContext) {
        StructuredBehaviorType oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionOfInstantiation> getDelegatedTo() {
        if (delegatedTo == null) {
            delegatedTo = new EObjectWithInverseResolvingEList<InteractionContributionOfInstantiation>(InteractionContributionOfInstantiation.class, this, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM);
        }
        return delegatedTo;
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedTo()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                return ((InternalEList<?>)getDelegatedTo()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT:
                if (resolve) return getContext();
                return basicGetContext();
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                return getDelegatedTo();
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT:
                setContext((StructuredBehaviorType)newValue);
                return;
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                getDelegatedTo().clear();
                getDelegatedTo().addAll((Collection<? extends InteractionContributionOfInstantiation>)newValue);
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT:
                setContext((StructuredBehaviorType)null);
                return;
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                getDelegatedTo().clear();
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
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT:
                return context != null;
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO:
                return delegatedTo != null && !delegatedTo.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DelegatedInteractionContributionImpl
