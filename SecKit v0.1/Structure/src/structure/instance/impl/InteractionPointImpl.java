/**
 */
package structure.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import structure.instance.InstancePackage;
import structure.instance.InteractionPoint;
import structure.instance.InteractionPointParticipation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.InteractionPointImpl#getParticipations <em>Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointImpl extends ActivityPointImpl implements InteractionPoint {
    /**
     * The cached value of the '{@link #getParticipations() <em>Participations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipation> participations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.INTERACTION_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipation> getParticipations() {
        if (participations == null) {
            participations = new EObjectResolvingEList<InteractionPointParticipation>(InteractionPointParticipation.class, this, InstancePackage.INTERACTION_POINT__PARTICIPATIONS);
        }
        return participations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.INTERACTION_POINT__PARTICIPATIONS:
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
            case InstancePackage.INTERACTION_POINT__PARTICIPATIONS:
                getParticipations().clear();
                getParticipations().addAll((Collection<? extends InteractionPointParticipation>)newValue);
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
            case InstancePackage.INTERACTION_POINT__PARTICIPATIONS:
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
            case InstancePackage.INTERACTION_POINT__PARTICIPATIONS:
                return participations != null && !participations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InteractionPointImpl
