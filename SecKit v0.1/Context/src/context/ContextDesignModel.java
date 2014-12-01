/**
 */
package context;

import context.type.ContextTypePackage;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.ContextDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.ContextPackage#getContextDesignModel()
 * @model
 * @generated
 */
public interface ContextDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link context.type.ContextTypePackage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see context.ContextPackage#getContextDesignModel_Packages()
     * @model containment="true"
     * @generated
     */
    EList<ContextTypePackage> getPackages();

} // ContextDesignModel
