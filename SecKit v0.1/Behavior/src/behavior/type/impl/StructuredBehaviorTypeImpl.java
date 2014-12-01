/**
 */
package behavior.type.impl;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionInstantiation;

import behavior.type.StructuredBehaviorType;
import behavior.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.StructuredBehaviorTypeImpl#getContainedInstantiations <em>Contained Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.StructuredBehaviorTypeImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredBehaviorTypeImpl extends AbstractBehaviorTypeImpl implements StructuredBehaviorType {
    /**
     * The cached value of the '{@link #getContainedInstantiations() <em>Contained Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedInstantiations()
     * @generated
     * @ordered
     */
    protected EList<BehaviorInstantiation> containedInstantiations;

    /**
     * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractions()
     * @generated
     * @ordered
     */
    protected EList<InteractionInstantiation> interactions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuredBehaviorTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.STRUCTURED_BEHAVIOR_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorInstantiation> getContainedInstantiations() {
        if (containedInstantiations == null) {
            containedInstantiations = new EObjectContainmentWithInverseEList<BehaviorInstantiation>(BehaviorInstantiation.class, this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE);
        }
        return containedInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionInstantiation> getInteractions() {
        if (interactions == null) {
            interactions = new EObjectContainmentWithInverseEList<InteractionInstantiation>(InteractionInstantiation.class, this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS, InstantiationPackage.INTERACTION_INSTANTIATION__BEHAVIOR_TYPE);
        }
        return interactions;
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractions()).basicAdd(otherEnd, msgs);
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                return ((InternalEList<?>)getContainedInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                return getContainedInstantiations();
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                return getInteractions();
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                getContainedInstantiations().clear();
                getContainedInstantiations().addAll((Collection<? extends BehaviorInstantiation>)newValue);
                return;
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                getInteractions().clear();
                getInteractions().addAll((Collection<? extends InteractionInstantiation>)newValue);
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                getContainedInstantiations().clear();
                return;
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                getInteractions().clear();
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
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS:
                return containedInstantiations != null && !containedInstantiations.isEmpty();
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS:
                return interactions != null && !interactions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StructuredBehaviorTypeImpl
