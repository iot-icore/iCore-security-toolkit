/**
 */
package seckit.refinement.impl;

import behavior.type.InteractionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import seckit.refinement.InterfaceDecomposition;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.InterfaceDecompositionImpl#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}</li>
 *   <li>{@link seckit.refinement.impl.InterfaceDecompositionImpl#getAbstractInteractionType <em>Abstract Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDecompositionImpl extends InteractionRefinementImpl implements InterfaceDecomposition {
    /**
     * The cached value of the '{@link #getConcreteInteractionTypes() <em>Concrete Interaction Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteInteractionTypes()
     * @generated
     * @ordered
     */
    protected EList<InteractionType> concreteInteractionTypes;

    /**
     * The cached value of the '{@link #getAbstractInteractionType() <em>Abstract Interaction Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbstractInteractionType()
     * @generated
     * @ordered
     */
    protected InteractionType abstractInteractionType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceDecompositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.INTERFACE_DECOMPOSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionType> getConcreteInteractionTypes() {
        if (concreteInteractionTypes == null) {
            concreteInteractionTypes = new EObjectResolvingEList<InteractionType>(InteractionType.class, this, RefinementPackage.INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES);
        }
        return concreteInteractionTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionType getAbstractInteractionType() {
        if (abstractInteractionType != null && abstractInteractionType.eIsProxy()) {
            InternalEObject oldAbstractInteractionType = (InternalEObject)abstractInteractionType;
            abstractInteractionType = (InteractionType)eResolveProxy(oldAbstractInteractionType);
            if (abstractInteractionType != oldAbstractInteractionType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE, oldAbstractInteractionType, abstractInteractionType));
            }
        }
        return abstractInteractionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionType basicGetAbstractInteractionType() {
        return abstractInteractionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstractInteractionType(InteractionType newAbstractInteractionType) {
        InteractionType oldAbstractInteractionType = abstractInteractionType;
        abstractInteractionType = newAbstractInteractionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE, oldAbstractInteractionType, abstractInteractionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RefinementPackage.INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES:
                return getConcreteInteractionTypes();
            case RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE:
                if (resolve) return getAbstractInteractionType();
                return basicGetAbstractInteractionType();
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
            case RefinementPackage.INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES:
                getConcreteInteractionTypes().clear();
                getConcreteInteractionTypes().addAll((Collection<? extends InteractionType>)newValue);
                return;
            case RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE:
                setAbstractInteractionType((InteractionType)newValue);
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
            case RefinementPackage.INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES:
                getConcreteInteractionTypes().clear();
                return;
            case RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE:
                setAbstractInteractionType((InteractionType)null);
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
            case RefinementPackage.INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES:
                return concreteInteractionTypes != null && !concreteInteractionTypes.isEmpty();
            case RefinementPackage.INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE:
                return abstractInteractionType != null;
        }
        return super.eIsSet(featureID);
    }

} //InterfaceDecompositionImpl
