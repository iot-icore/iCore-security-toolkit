/**
 */
package behavior;

import behavior.type.BehaviorTypePackage;

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
 *   <li>{@link behavior.BehaviorDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.BehaviorPackage#getBehaviorDesignModel()
 * @model
 * @generated
 */
public interface BehaviorDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link behavior.type.BehaviorTypePackage}.
     * It is bidirectional and its opposite is '{@link behavior.type.BehaviorTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see behavior.BehaviorPackage#getBehaviorDesignModel_Packages()
     * @see behavior.type.BehaviorTypePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<BehaviorTypePackage> getPackages();

} // BehaviorDesignModel
