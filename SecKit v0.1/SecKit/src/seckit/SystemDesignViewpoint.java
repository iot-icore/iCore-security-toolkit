/**
 */
package seckit;

import behavior.BehaviorDesignModel;

import context.ContextDesignModel;

import data.DataDesignModel;

import identity.IdentityDesignModel;

import org.eclipse.emf.common.util.EList;

import risk.RiskDesignModel;

import role.RoleDesignModel;

import rule.RuleDesignModel;

import structure.StructuralDesignModel;

import trust.TrustDesignModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Design Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.SystemDesignViewpoint#getStructuralDesignModels <em>Structural Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getContextDesignModels <em>Context Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getIdentityDesignModels <em>Identity Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getDataDesignModels <em>Data Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getBehaviorDesignModels <em>Behavior Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getTrustDesignModels <em>Trust Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getRuleDesignModels <em>Rule Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getRoleDesignModels <em>Role Design Models</em>}</li>
 *   <li>{@link seckit.SystemDesignViewpoint#getRiskDesignModels <em>Risk Design Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.SeckitPackage#getSystemDesignViewpoint()
 * @model
 * @generated
 */
public interface SystemDesignViewpoint extends SystemViewpoint {
    /**
     * Returns the value of the '<em><b>Structural Design Models</b></em>' containment reference list.
     * The list contents are of type {@link structure.StructuralDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structural Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structural Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_StructuralDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<StructuralDesignModel> getStructuralDesignModels();

    /**
     * Returns the value of the '<em><b>Context Design Models</b></em>' containment reference list.
     * The list contents are of type {@link context.ContextDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_ContextDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<ContextDesignModel> getContextDesignModels();

    /**
     * Returns the value of the '<em><b>Identity Design Models</b></em>' containment reference list.
     * The list contents are of type {@link identity.IdentityDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_IdentityDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<IdentityDesignModel> getIdentityDesignModels();

    /**
     * Returns the value of the '<em><b>Data Design Models</b></em>' containment reference list.
     * The list contents are of type {@link data.DataDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_DataDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<DataDesignModel> getDataDesignModels();

    /**
     * Returns the value of the '<em><b>Behavior Design Models</b></em>' containment reference list.
     * The list contents are of type {@link behavior.BehaviorDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_BehaviorDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<BehaviorDesignModel> getBehaviorDesignModels();

    /**
     * Returns the value of the '<em><b>Trust Design Models</b></em>' containment reference list.
     * The list contents are of type {@link trust.TrustDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trust Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trust Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_TrustDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<TrustDesignModel> getTrustDesignModels();

    /**
     * Returns the value of the '<em><b>Rule Design Models</b></em>' containment reference list.
     * The list contents are of type {@link rule.RuleDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_RuleDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<RuleDesignModel> getRuleDesignModels();

    /**
     * Returns the value of the '<em><b>Role Design Models</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_RoleDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<RoleDesignModel> getRoleDesignModels();

    /**
     * Returns the value of the '<em><b>Risk Design Models</b></em>' containment reference list.
     * The list contents are of type {@link risk.RiskDesignModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Risk Design Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Risk Design Models</em>' containment reference list.
     * @see seckit.SeckitPackage#getSystemDesignViewpoint_RiskDesignModels()
     * @model containment="true"
     * @generated
     */
    EList<RiskDesignModel> getRiskDesignModels();

} // SystemDesignViewpoint
