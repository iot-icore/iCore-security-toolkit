/**
 */
package seckit.refinement.impl;

import behavior.instantiation.ActionInstantiation;

import behavior.type.InteractionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import seckit.refinement.ConstraintOrientedBehaviorRefinement;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Oriented Behavior Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl#getAbstractAction <em>Abstract Action</em>}</li>
 *   <li>{@link seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintOrientedBehaviorRefinementImpl extends BehaviorRefinementTypeImpl implements ConstraintOrientedBehaviorRefinement {
    /**
     * The cached value of the '{@link #getAbstractAction() <em>Abstract Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbstractAction()
     * @generated
     * @ordered
     */
    protected ActionInstantiation abstractAction;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstraintOrientedBehaviorRefinementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInstantiation getAbstractAction() {
        if (abstractAction != null && abstractAction.eIsProxy()) {
            InternalEObject oldAbstractAction = (InternalEObject)abstractAction;
            abstractAction = (ActionInstantiation)eResolveProxy(oldAbstractAction);
            if (abstractAction != oldAbstractAction) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION, oldAbstractAction, abstractAction));
            }
        }
        return abstractAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInstantiation basicGetAbstractAction() {
        return abstractAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstractAction(ActionInstantiation newAbstractAction) {
        ActionInstantiation oldAbstractAction = abstractAction;
        abstractAction = newAbstractAction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION, oldAbstractAction, abstractAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionType> getConcreteInteractionTypes() {
        if (concreteInteractionTypes == null) {
            concreteInteractionTypes = new EObjectResolvingEList<InteractionType>(InteractionType.class, this, RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES);
        }
        return concreteInteractionTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION:
                if (resolve) return getAbstractAction();
                return basicGetAbstractAction();
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES:
                return getConcreteInteractionTypes();
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
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION:
                setAbstractAction((ActionInstantiation)newValue);
                return;
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES:
                getConcreteInteractionTypes().clear();
                getConcreteInteractionTypes().addAll((Collection<? extends InteractionType>)newValue);
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
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION:
                setAbstractAction((ActionInstantiation)null);
                return;
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES:
                getConcreteInteractionTypes().clear();
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
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION:
                return abstractAction != null;
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES:
                return concreteInteractionTypes != null && !concreteInteractionTypes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ConstraintOrientedBehaviorRefinementImpl
