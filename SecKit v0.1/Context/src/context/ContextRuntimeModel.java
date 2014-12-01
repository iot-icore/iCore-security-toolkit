/**
 */
package context;

import context.instance.Context;
import context.instance.ContextSituation;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.ContextRuntimeModel#getSituations <em>Situations</em>}</li>
 *   <li>{@link context.ContextRuntimeModel#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.ContextPackage#getContextRuntimeModel()
 * @model
 * @generated
 */
public interface ContextRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Situations</b></em>' containment reference list.
     * The list contents are of type {@link context.instance.ContextSituation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situations</em>' containment reference list.
     * @see context.ContextPackage#getContextRuntimeModel_Situations()
     * @model containment="true"
     * @generated
     */
    EList<ContextSituation> getSituations();

    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference list.
     * The list contents are of type {@link context.instance.Context}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference list.
     * @see context.ContextPackage#getContextRuntimeModel_Context()
     * @model containment="true"
     * @generated
     */
    EList<Context> getContext();

} // ContextRuntimeModel
