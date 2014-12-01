/**
 */
package seckit.refinement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import seckit.refinement.RefinementPackage;
import seckit.refinement.RefinementRelationHierarchy;
import seckit.refinement.RefinementRelationInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.RefinementRelationHierarchyImpl#getRefinementInstantiationRef <em>Refinement Instantiation Ref</em>}</li>
 *   <li>{@link seckit.refinement.impl.RefinementRelationHierarchyImpl#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementRelationHierarchyImpl extends MinimalEObjectImpl.Container implements RefinementRelationHierarchy {
    /**
     * The cached value of the '{@link #getRefinementInstantiationRef() <em>Refinement Instantiation Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefinementInstantiationRef()
     * @generated
     * @ordered
     */
    protected RefinementRelationInstantiation refinementInstantiationRef;

    /**
     * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEReference0()
     * @generated
     * @ordered
     */
    protected RefinementRelationHierarchy eReference0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RefinementRelationHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.REFINEMENT_RELATION_HIERARCHY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementRelationInstantiation getRefinementInstantiationRef() {
        return refinementInstantiationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefinementInstantiationRef(RefinementRelationInstantiation newRefinementInstantiationRef, NotificationChain msgs) {
        RefinementRelationInstantiation oldRefinementInstantiationRef = refinementInstantiationRef;
        refinementInstantiationRef = newRefinementInstantiationRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF, oldRefinementInstantiationRef, newRefinementInstantiationRef);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefinementInstantiationRef(RefinementRelationInstantiation newRefinementInstantiationRef) {
        if (newRefinementInstantiationRef != refinementInstantiationRef) {
            NotificationChain msgs = null;
            if (refinementInstantiationRef != null)
                msgs = ((InternalEObject)refinementInstantiationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF, null, msgs);
            if (newRefinementInstantiationRef != null)
                msgs = ((InternalEObject)newRefinementInstantiationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF, null, msgs);
            msgs = basicSetRefinementInstantiationRef(newRefinementInstantiationRef, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF, newRefinementInstantiationRef, newRefinementInstantiationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementRelationHierarchy getEReference0() {
        if (eReference0 != null && eReference0.eIsProxy()) {
            InternalEObject oldEReference0 = (InternalEObject)eReference0;
            eReference0 = (RefinementRelationHierarchy)eResolveProxy(oldEReference0);
            if (eReference0 != oldEReference0) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0, oldEReference0, eReference0));
            }
        }
        return eReference0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementRelationHierarchy basicGetEReference0() {
        return eReference0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEReference0(RefinementRelationHierarchy newEReference0) {
        RefinementRelationHierarchy oldEReference0 = eReference0;
        eReference0 = newEReference0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0, oldEReference0, eReference0));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF:
                return basicSetRefinementInstantiationRef(null, msgs);
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
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF:
                return getRefinementInstantiationRef();
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0:
                if (resolve) return getEReference0();
                return basicGetEReference0();
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
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF:
                setRefinementInstantiationRef((RefinementRelationInstantiation)newValue);
                return;
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0:
                setEReference0((RefinementRelationHierarchy)newValue);
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
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF:
                setRefinementInstantiationRef((RefinementRelationInstantiation)null);
                return;
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0:
                setEReference0((RefinementRelationHierarchy)null);
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
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF:
                return refinementInstantiationRef != null;
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY__EREFERENCE0:
                return eReference0 != null;
        }
        return super.eIsSet(featureID);
    }

} //RefinementRelationHierarchyImpl
