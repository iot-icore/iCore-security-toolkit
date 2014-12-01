/**
 */
package structure.instantiation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.DelegatedInteractionPointParticipation;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationOfInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegated Interaction Point Participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.DelegatedInteractionPointParticipationImpl#getDelegatedTo <em>Delegated To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegatedInteractionPointParticipationImpl extends AbstractInteractionPointParticipationOfTypeImpl implements DelegatedInteractionPointParticipation {
    /**
     * The cached value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedTo()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationOfInstantiation> delegatedTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelegatedInteractionPointParticipationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.DELEGATED_INTERACTION_POINT_PARTICIPATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationOfInstantiation> getDelegatedTo() {
        if (delegatedTo == null) {
            delegatedTo = new EObjectWithInverseResolvingEList<InteractionPointParticipationOfInstantiation>(InteractionPointParticipationOfInstantiation.class, this, InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM);
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
                getDelegatedTo().clear();
                getDelegatedTo().addAll((Collection<? extends InteractionPointParticipationOfInstantiation>)newValue);
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
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
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO:
                return delegatedTo != null && !delegatedTo.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DelegatedInteractionPointParticipationImpl
