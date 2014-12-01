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

import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointInstantiation;
import structure.instantiation.InteractionPointParticipationOfInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.InteractionPointInstantiationImpl#getParticipations <em>Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointInstantiationImpl extends ActivityPointInstantiationImpl implements InteractionPointInstantiation {
    /**
     * The cached value of the '{@link #getParticipations() <em>Participations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationOfInstantiation> participations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_POINT_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationOfInstantiation> getParticipations() {
        if (participations == null) {
            participations = new EObjectWithInverseResolvingEList<InteractionPointParticipationOfInstantiation>(InteractionPointParticipationOfInstantiation.class, this, InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT);
        }
        return participations;
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipations()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                return ((InternalEList<?>)getParticipations()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                return getParticipations();
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                getParticipations().clear();
                getParticipations().addAll((Collection<? extends InteractionPointParticipationOfInstantiation>)newValue);
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                getParticipations().clear();
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
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS:
                return participations != null && !participations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InteractionPointInstantiationImpl
