/**
 */
package seckit.refinement.impl;

import behavior.instantiation.ActionInstantiation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import seckit.refinement.ActionRefinement;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.ActionRefinementImpl#getAbstractAction <em>Abstract Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionRefinementImpl extends ActivityRefinementImpl implements ActionRefinement {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionRefinementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.ACTION_REFINEMENT;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION, oldAbstractAction, abstractAction));
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
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION, oldAbstractAction, abstractAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION:
                if (resolve) return getAbstractAction();
                return basicGetAbstractAction();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION:
                setAbstractAction((ActionInstantiation)newValue);
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
            case RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION:
                setAbstractAction((ActionInstantiation)null);
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
            case RefinementPackage.ACTION_REFINEMENT__ABSTRACT_ACTION:
                return abstractAction != null;
        }
        return super.eIsSet(featureID);
    }

} //ActionRefinementImpl
