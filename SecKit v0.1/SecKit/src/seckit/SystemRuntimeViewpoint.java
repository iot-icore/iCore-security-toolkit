/**
 */
package seckit;

import behavior.BehaviorRuntimeModel;

import context.ContextRuntimeModel;

import data.DataRuntimeModel;

import identity.IdentityRuntimeModel;

import org.eclipse.emf.common.util.EList;

import risk.RiskRuntimeModel;

import role.RoleRuntimeModel;

import rule.RuleRuntimeModel;

import structure.StructuralRuntimeModel;

import trust.TrustRuntimeModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Runtime Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getStructuralRuntimeModels <em>Structural Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getTrustRuntimeModels <em>Trust Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getBehaviorRuntimeModels <em>Behavior Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getRuleRuntimeModels <em>Rule Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getDataRuntimeModels <em>Data Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getIdentityRuntimeModels <em>Identity Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getRoleRuntimeModels <em>Role Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getContextRuntimeModels <em>Context Runtime Models</em>}</li>
 *   <li>{@link seckit.SystemRuntimeViewpoint#getRiskRuntimeModels <em>Risk Runtime Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.SeckitPackage#getSystemRuntimeViewpoint()
 * @model
 * @generated
 */
public interface SystemRuntimeViewpoint extends SystemViewpoint {
    /**
     * Returns the value of the '<em><b>Structural Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link structure.StructuralRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structural Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structural Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_StructuralRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<StructuralRuntimeModel> getStructuralRuntimeModels();

    /**
     * Returns the value of the '<em><b>Trust Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link trust.TrustRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trust Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trust Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_TrustRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<TrustRuntimeModel> getTrustRuntimeModels();

    /**
     * Returns the value of the '<em><b>Behavior Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link behavior.BehaviorRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_BehaviorRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<BehaviorRuntimeModel> getBehaviorRuntimeModels();

    /**
     * Returns the value of the '<em><b>Rule Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link rule.RuleRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_RuleRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<RuleRuntimeModel> getRuleRuntimeModels();

    /**
     * Returns the value of the '<em><b>Data Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link data.DataRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_DataRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<DataRuntimeModel> getDataRuntimeModels();

    /**
     * Returns the value of the '<em><b>Identity Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link identity.IdentityRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_IdentityRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<IdentityRuntimeModel> getIdentityRuntimeModels();

    /**
     * Returns the value of the '<em><b>Role Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_RoleRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<RoleRuntimeModel> getRoleRuntimeModels();

    /**
     * Returns the value of the '<em><b>Context Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link context.ContextRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_ContextRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<ContextRuntimeModel> getContextRuntimeModels();

    /**
     * Returns the value of the '<em><b>Risk Runtime Models</b></em>' containment reference list.
     * The list contents are of type {@link risk.RiskRuntimeModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Risk Runtime Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Risk Runtime Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemRuntimeViewpoint_RiskRuntimeModels()
     * @model containment="true"
     * @generated
     */
    EList<RiskRuntimeModel> getRiskRuntimeModels();

} // SystemRuntimeViewpoint
