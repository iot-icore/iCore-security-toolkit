/**
 */
package seckit.impl;

import behavior.BehaviorRuntimeModel;

import context.ContextRuntimeModel;

import data.DataRuntimeModel;

import identity.IdentityRuntimeModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.RiskRuntimeModel;

import role.RoleRuntimeModel;

import rule.RuleRuntimeModel;

import seckit.SeckitPackage;
import seckit.SystemRuntimeViewpoint;

import structure.StructuralRuntimeModel;

import trust.TrustRuntimeModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Runtime Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getStructuralRuntimeModels <em>Structural Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getTrustRuntimeModels <em>Trust Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getBehaviorRuntimeModels <em>Behavior Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getRuleRuntimeModels <em>Rule Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getDataRuntimeModels <em>Data Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getIdentityRuntimeModels <em>Identity Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getRoleRuntimeModels <em>Role Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getContextRuntimeModels <em>Context Runtime Models</em>}</li>
 *   <li>{@link seckit.impl.SystemRuntimeViewpointImpl#getRiskRuntimeModels <em>Risk Runtime Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemRuntimeViewpointImpl extends SystemViewpointImpl implements SystemRuntimeViewpoint {
    /**
     * The cached value of the '{@link #getStructuralRuntimeModels() <em>Structural Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructuralRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<StructuralRuntimeModel> structuralRuntimeModels;

    /**
     * The cached value of the '{@link #getTrustRuntimeModels() <em>Trust Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrustRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<TrustRuntimeModel> trustRuntimeModels;

    /**
     * The cached value of the '{@link #getBehaviorRuntimeModels() <em>Behavior Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<BehaviorRuntimeModel> behaviorRuntimeModels;

    /**
     * The cached value of the '{@link #getRuleRuntimeModels() <em>Rule Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<RuleRuntimeModel> ruleRuntimeModels;

    /**
     * The cached value of the '{@link #getDataRuntimeModels() <em>Data Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<DataRuntimeModel> dataRuntimeModels;

    /**
     * The cached value of the '{@link #getIdentityRuntimeModels() <em>Identity Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<IdentityRuntimeModel> identityRuntimeModels;

    /**
     * The cached value of the '{@link #getRoleRuntimeModels() <em>Role Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<RoleRuntimeModel> roleRuntimeModels;

    /**
     * The cached value of the '{@link #getContextRuntimeModels() <em>Context Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<ContextRuntimeModel> contextRuntimeModels;

    /**
     * The cached value of the '{@link #getRiskRuntimeModels() <em>Risk Runtime Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiskRuntimeModels()
     * @generated
     * @ordered
     */
    protected EList<RiskRuntimeModel> riskRuntimeModels;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemRuntimeViewpointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SeckitPackage.Literals.SYSTEM_RUNTIME_VIEWPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StructuralRuntimeModel> getStructuralRuntimeModels() {
        if (structuralRuntimeModels == null) {
            structuralRuntimeModels = new EObjectContainmentEList<StructuralRuntimeModel>(StructuralRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS);
        }
        return structuralRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TrustRuntimeModel> getTrustRuntimeModels() {
        if (trustRuntimeModels == null) {
            trustRuntimeModels = new EObjectContainmentEList<TrustRuntimeModel>(TrustRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS);
        }
        return trustRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorRuntimeModel> getBehaviorRuntimeModels() {
        if (behaviorRuntimeModels == null) {
            behaviorRuntimeModels = new EObjectContainmentEList<BehaviorRuntimeModel>(BehaviorRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS);
        }
        return behaviorRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleRuntimeModel> getRuleRuntimeModels() {
        if (ruleRuntimeModels == null) {
            ruleRuntimeModels = new EObjectContainmentEList<RuleRuntimeModel>(RuleRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS);
        }
        return ruleRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataRuntimeModel> getDataRuntimeModels() {
        if (dataRuntimeModels == null) {
            dataRuntimeModels = new EObjectContainmentEList<DataRuntimeModel>(DataRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS);
        }
        return dataRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityRuntimeModel> getIdentityRuntimeModels() {
        if (identityRuntimeModels == null) {
            identityRuntimeModels = new EObjectContainmentEList<IdentityRuntimeModel>(IdentityRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS);
        }
        return identityRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleRuntimeModel> getRoleRuntimeModels() {
        if (roleRuntimeModels == null) {
            roleRuntimeModels = new EObjectContainmentEList<RoleRuntimeModel>(RoleRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS);
        }
        return roleRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextRuntimeModel> getContextRuntimeModels() {
        if (contextRuntimeModels == null) {
            contextRuntimeModels = new EObjectContainmentEList<ContextRuntimeModel>(ContextRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS);
        }
        return contextRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiskRuntimeModel> getRiskRuntimeModels() {
        if (riskRuntimeModels == null) {
            riskRuntimeModels = new EObjectContainmentEList<RiskRuntimeModel>(RiskRuntimeModel.class, this, SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS);
        }
        return riskRuntimeModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS:
                return ((InternalEList<?>)getStructuralRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS:
                return ((InternalEList<?>)getTrustRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS:
                return ((InternalEList<?>)getBehaviorRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS:
                return ((InternalEList<?>)getRuleRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS:
                return ((InternalEList<?>)getDataRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS:
                return ((InternalEList<?>)getIdentityRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS:
                return ((InternalEList<?>)getRoleRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS:
                return ((InternalEList<?>)getContextRuntimeModels()).basicRemove(otherEnd, msgs);
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS:
                return ((InternalEList<?>)getRiskRuntimeModels()).basicRemove(otherEnd, msgs);
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
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS:
                return getStructuralRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS:
                return getTrustRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS:
                return getBehaviorRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS:
                return getRuleRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS:
                return getDataRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS:
                return getIdentityRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS:
                return getRoleRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS:
                return getContextRuntimeModels();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS:
                return getRiskRuntimeModels();
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
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS:
                getStructuralRuntimeModels().clear();
                getStructuralRuntimeModels().addAll((Collection<? extends StructuralRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS:
                getTrustRuntimeModels().clear();
                getTrustRuntimeModels().addAll((Collection<? extends TrustRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS:
                getBehaviorRuntimeModels().clear();
                getBehaviorRuntimeModels().addAll((Collection<? extends BehaviorRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS:
                getRuleRuntimeModels().clear();
                getRuleRuntimeModels().addAll((Collection<? extends RuleRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS:
                getDataRuntimeModels().clear();
                getDataRuntimeModels().addAll((Collection<? extends DataRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS:
                getIdentityRuntimeModels().clear();
                getIdentityRuntimeModels().addAll((Collection<? extends IdentityRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS:
                getRoleRuntimeModels().clear();
                getRoleRuntimeModels().addAll((Collection<? extends RoleRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS:
                getContextRuntimeModels().clear();
                getContextRuntimeModels().addAll((Collection<? extends ContextRuntimeModel>)newValue);
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS:
                getRiskRuntimeModels().clear();
                getRiskRuntimeModels().addAll((Collection<? extends RiskRuntimeModel>)newValue);
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
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS:
                getStructuralRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS:
                getTrustRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS:
                getBehaviorRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS:
                getRuleRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS:
                getDataRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS:
                getIdentityRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS:
                getRoleRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS:
                getContextRuntimeModels().clear();
                return;
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS:
                getRiskRuntimeModels().clear();
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
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS:
                return structuralRuntimeModels != null && !structuralRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS:
                return trustRuntimeModels != null && !trustRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS:
                return behaviorRuntimeModels != null && !behaviorRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS:
                return ruleRuntimeModels != null && !ruleRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS:
                return dataRuntimeModels != null && !dataRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS:
                return identityRuntimeModels != null && !identityRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS:
                return roleRuntimeModels != null && !roleRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS:
                return contextRuntimeModels != null && !contextRuntimeModels.isEmpty();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS:
                return riskRuntimeModels != null && !riskRuntimeModels.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SystemRuntimeViewpointImpl
