/**
 */
package seckit.refinement.impl;

import behavior.causality.CausalityRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import seckit.refinement.CausalityRefinement;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causality Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.CausalityRefinementImpl#getAbstractRelation <em>Abstract Relation</em>}</li>
 *   <li>{@link seckit.refinement.impl.CausalityRefinementImpl#getConcreteRelations <em>Concrete Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CausalityRefinementImpl extends RefinementRelationTypeImpl implements CausalityRefinement {
    /**
     * The cached value of the '{@link #getAbstractRelation() <em>Abstract Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbstractRelation()
     * @generated
     * @ordered
     */
    protected CausalityRelation abstractRelation;

    /**
     * The cached value of the '{@link #getConcreteRelations() <em>Concrete Relations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteRelations()
     * @generated
     * @ordered
     */
    protected EList<CausalityRelation> concreteRelations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CausalityRefinementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.CAUSALITY_REFINEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityRelation getAbstractRelation() {
        if (abstractRelation != null && abstractRelation.eIsProxy()) {
            InternalEObject oldAbstractRelation = (InternalEObject)abstractRelation;
            abstractRelation = (CausalityRelation)eResolveProxy(oldAbstractRelation);
            if (abstractRelation != oldAbstractRelation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION, oldAbstractRelation, abstractRelation));
            }
        }
        return abstractRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityRelation basicGetAbstractRelation() {
        return abstractRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstractRelation(CausalityRelation newAbstractRelation) {
        CausalityRelation oldAbstractRelation = abstractRelation;
        abstractRelation = newAbstractRelation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION, oldAbstractRelation, abstractRelation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CausalityRelation> getConcreteRelations() {
        if (concreteRelations == null) {
            concreteRelations = new EObjectContainmentEList<CausalityRelation>(CausalityRelation.class, this, RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS);
        }
        return concreteRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS:
                return ((InternalEList<?>)getConcreteRelations()).basicRemove(otherEnd, msgs);
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
            case RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION:
                if (resolve) return getAbstractRelation();
                return basicGetAbstractRelation();
            case RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS:
                return getConcreteRelations();
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
            case RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION:
                setAbstractRelation((CausalityRelation)newValue);
                return;
            case RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS:
                getConcreteRelations().clear();
                getConcreteRelations().addAll((Collection<? extends CausalityRelation>)newValue);
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
            case RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION:
                setAbstractRelation((CausalityRelation)null);
                return;
            case RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS:
                getConcreteRelations().clear();
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
            case RefinementPackage.CAUSALITY_REFINEMENT__ABSTRACT_RELATION:
                return abstractRelation != null;
            case RefinementPackage.CAUSALITY_REFINEMENT__CONCRETE_RELATIONS:
                return concreteRelations != null && !concreteRelations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CausalityRefinementImpl
