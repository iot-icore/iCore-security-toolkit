/**
 */
package seckit.impl;

import behavior.BehaviorDesignModel;

import context.ContextDesignModel;

import data.DataDesignModel;

import identity.IdentityDesignModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.RiskDesignModel;

import role.RoleDesignModel;

import rule.RuleDesignModel;

import seckit.SeckitPackage;
import seckit.SystemDesignViewpoint;

import structure.StructuralDesignModel;

import trust.TrustDesignModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Design Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getStructuralDesignModels <em>Structural Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getContextDesignModels <em>Context Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getIdentityDesignModels <em>Identity Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getDataDesignModels <em>Data Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getBehaviorDesignModels <em>Behavior Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getTrustDesignModels <em>Trust Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getRuleDesignModels <em>Rule Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getRoleDesignModels <em>Role Design Models</em>}</li>
 *   <li>{@link seckit.impl.SystemDesignViewpointImpl#getRiskDesignModels <em>Risk Design Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemDesignViewpointImpl extends SystemViewpointImpl implements SystemDesignViewpoint {
    /**
     * The cached value of the '{@link #getStructuralDesignModels() <em>Structural Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructuralDesignModels()
     * @generated
     * @ordered
     */
    protected EList<StructuralDesignModel> structuralDesignModels;

    /**
     * The cached value of the '{@link #getContextDesignModels() <em>Context Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextDesignModels()
     * @generated
     * @ordered
     */
    protected EList<ContextDesignModel> contextDesignModels;

    /**
     * The cached value of the '{@link #getIdentityDesignModels() <em>Identity Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityDesignModels()
     * @generated
     * @ordered
     */
    protected EList<IdentityDesignModel> identityDesignModels;

    /**
     * The cached value of the '{@link #getDataDesignModels() <em>Data Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataDesignModels()
     * @generated
     * @ordered
     */
    protected EList<DataDesignModel> dataDesignModels;

    /**
     * The cached value of the '{@link #getBehaviorDesignModels() <em>Behavior Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorDesignModels()
     * @generated
     * @ordered
     */
    protected EList<BehaviorDesignModel> behaviorDesignModels;

    /**
     * The cached value of the '{@link #getTrustDesignModels() <em>Trust Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustDesignModels()
     * @generated
     * @ordered
     */
    protected EList<TrustDesignModel> trustDesignModels;

    /**
     * The cached value of the '{@link #getRuleDesignModels() <em>Rule Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleDesignModels()
     * @generated
     * @ordered
     */
    protected EList<RuleDesignModel> ruleDesignModels;

    /**
     * The cached value of the '{@link #getRoleDesignModels() <em>Role Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleDesignModels()
     * @generated
     * @ordered
     */
    protected EList<RoleDesignModel> roleDesignModels;

    /**
     * The cached value of the '{@link #getRiskDesignModels() <em>Risk Design Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiskDesignModels()
     * @generated
     * @ordered
     */
    protected EList<RiskDesignModel> riskDesignModels;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemDesignViewpointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SeckitPackage.Literals.SYSTEM_DESIGN_VIEWPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StructuralDesignModel> getStructuralDesignModels() {
        if (structuralDesignModels == null) {
            structuralDesignModels = new EObjectContainmentEList<StructuralDesignModel>(StructuralDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS);
        }
        return structuralDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextDesignModel> getContextDesignModels() {
        if (contextDesignModels == null) {
            contextDesignModels = new EObjectContainmentEList<ContextDesignModel>(ContextDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS);
        }
        return contextDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityDesignModel> getIdentityDesignModels() {
        if (identityDesignModels == null) {
            identityDesignModels = new EObjectContainmentEList<IdentityDesignModel>(IdentityDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS);
        }
        return identityDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataDesignModel> getDataDesignModels() {
        if (dataDesignModels == null) {
            dataDesignModels = new EObjectContainmentEList<DataDesignModel>(DataDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS);
        }
        return dataDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorDesignModel> getBehaviorDesignModels() {
        if (behaviorDesignModels == null) {
            behaviorDesignModels = new EObjectContainmentEList<BehaviorDesignModel>(BehaviorDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS);
        }
        return behaviorDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TrustDesignModel> getTrustDesignModels() {
        if (trustDesignModels == null) {
            trustDesignModels = new EObjectContainmentEList<TrustDesignModel>(TrustDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS);
        }
        return trustDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleDesignModel> getRuleDesignModels() {
        if (ruleDesignModels == null) {
            ruleDesignModels = new EObjectContainmentEList<RuleDesignModel>(RuleDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS);
        }
        return ruleDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleDesignModel> getRoleDesignModels() {
        if (roleDesignModels == null) {
            roleDesignModels = new EObjectContainmentEList<RoleDesignModel>(RoleDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS);
        }
        return roleDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiskDesignModel> getRiskDesignModels() {
        if (riskDesignModels == null) {
            riskDesignModels = new EObjectContainmentEList<RiskDesignModel>(RiskDesignModel.class, this, SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS);
        }
        return riskDesignModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS:
                return ((InternalEList<?>)getStructuralDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS:
                return ((InternalEList<?>)getContextDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS:
                return ((InternalEList<?>)getIdentityDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS:
                return ((InternalEList<?>)getDataDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS:
                return ((InternalEList<?>)getBehaviorDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS:
                return ((InternalEList<?>)getTrustDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS:
                return ((InternalEList<?>)getRuleDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS:
                return ((InternalEList<?>)getRoleDesignModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS:
                return ((InternalEList<?>)getRiskDesignModels()).basicRemove(otherEnd, msgs);
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
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS:
                return getStructuralDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS:
                return getContextDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS:
                return getIdentityDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS:
                return getDataDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS:
                return getBehaviorDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS:
                return getTrustDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS:
                return getRuleDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS:
                return getRoleDesignModels();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS:
                return getRiskDesignModels();
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
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS:
                getStructuralDesignModels().clear();
                getStructuralDesignModels().addAll((Collection<? extends StructuralDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS:
                getContextDesignModels().clear();
                getContextDesignModels().addAll((Collection<? extends ContextDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS:
                getIdentityDesignModels().clear();
                getIdentityDesignModels().addAll((Collection<? extends IdentityDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS:
                getDataDesignModels().clear();
                getDataDesignModels().addAll((Collection<? extends DataDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS:
                getBehaviorDesignModels().clear();
                getBehaviorDesignModels().addAll((Collection<? extends BehaviorDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS:
                getTrustDesignModels().clear();
                getTrustDesignModels().addAll((Collection<? extends TrustDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS:
                getRuleDesignModels().clear();
                getRuleDesignModels().addAll((Collection<? extends RuleDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS:
                getRoleDesignModels().clear();
                getRoleDesignModels().addAll((Collection<? extends RoleDesignModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS:
                getRiskDesignModels().clear();
                getRiskDesignModels().addAll((Collection<? extends RiskDesignModel>)newValue);
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
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS:
                getStructuralDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS:
                getContextDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS:
                getIdentityDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS:
                getDataDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS:
                getBehaviorDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS:
                getTrustDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS:
                getRuleDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS:
                getRoleDesignModels().clear();
                return;
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS:
                getRiskDesignModels().clear();
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
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS:
                return structuralDesignModels != null && !structuralDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS:
                return contextDesignModels != null && !contextDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS:
                return identityDesignModels != null && !identityDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS:
                return dataDesignModels != null && !dataDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS:
                return behaviorDesignModels != null && !behaviorDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS:
                return trustDesignModels != null && !trustDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS:
                return ruleDesignModels != null && !ruleDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS:
                return roleDesignModels != null && !roleDesignModels.isEmpty();
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS:
                return riskDesignModels != null && !riskDesignModels.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SystemDesignViewpointImpl
