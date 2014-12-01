/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.ExitPointCondition;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.ExitPointOfInstantiation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Point Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.ExitPointConditionImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link behavior.causality.impl.ExitPointConditionImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitPointConditionImpl extends PointConditionImpl implements ExitPointCondition {
    /**
     * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExit()
     * @generated
     * @ordered
     */
    protected ExitPointOfInstantiation exit;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiation context;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExitPointConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.EXIT_POINT_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointOfInstantiation getExit() {
        if (exit != null && exit.eIsProxy()) {
            InternalEObject oldExit = (InternalEObject)exit;
            exit = (ExitPointOfInstantiation)eResolveProxy(oldExit);
            if (exit != oldExit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CausalityPackage.EXIT_POINT_CONDITION__EXIT, oldExit, exit));
            }
        }
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointOfInstantiation basicGetExit() {
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExit(ExitPointOfInstantiation newExit) {
        ExitPointOfInstantiation oldExit = exit;
        exit = newExit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.EXIT_POINT_CONDITION__EXIT, oldExit, exit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation getContext() {
        if (context != null && context.eIsProxy()) {
            InternalEObject oldContext = (InternalEObject)context;
            context = (BehaviorInstantiation)eResolveProxy(oldContext);
            if (context != oldContext) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CausalityPackage.EXIT_POINT_CONDITION__CONTEXT, oldContext, context));
            }
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation basicGetContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(BehaviorInstantiation newContext) {
        BehaviorInstantiation oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.EXIT_POINT_CONDITION__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CausalityPackage.EXIT_POINT_CONDITION__EXIT:
                if (resolve) return getExit();
                return basicGetExit();
            case CausalityPackage.EXIT_POINT_CONDITION__CONTEXT:
                if (resolve) return getContext();
                return basicGetContext();
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
            case CausalityPackage.EXIT_POINT_CONDITION__EXIT:
                setExit((ExitPointOfInstantiation)newValue);
                return;
            case CausalityPackage.EXIT_POINT_CONDITION__CONTEXT:
                setContext((BehaviorInstantiation)newValue);
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
            case CausalityPackage.EXIT_POINT_CONDITION__EXIT:
                setExit((ExitPointOfInstantiation)null);
                return;
            case CausalityPackage.EXIT_POINT_CONDITION__CONTEXT:
                setContext((BehaviorInstantiation)null);
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
            case CausalityPackage.EXIT_POINT_CONDITION__EXIT:
                return exit != null;
            case CausalityPackage.EXIT_POINT_CONDITION__CONTEXT:
                return context != null;
        }
        return super.eIsSet(featureID);
    }

} //ExitPointConditionImpl
