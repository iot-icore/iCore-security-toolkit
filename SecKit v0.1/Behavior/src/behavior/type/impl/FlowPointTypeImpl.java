/**
 */
package behavior.type.impl;

import behavior.instantiation.FlowPointOfType;
import behavior.instantiation.InstantiationPackage;
import behavior.type.FlowPointType;
import behavior.type.TypePackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.FlowPointTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowPointTypeImpl extends DataProducerTypeImpl implements FlowPointType {
    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<FlowPointOfType> instantiations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowPointTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.FLOW_POINT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowPointOfType> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<FlowPointOfType>(FlowPointOfType.class, this, TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS, InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE);
        }
        return instantiations;
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                return getInstantiations();
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends FlowPointOfType>)newValue);
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
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
            case TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FlowPointTypeImpl
