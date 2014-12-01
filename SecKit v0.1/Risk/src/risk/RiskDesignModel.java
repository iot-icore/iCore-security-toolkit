/**
 */
package risk;

import models.Model;

import org.eclipse.emf.common.util.EList;

import risk.type.RiskTypePackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.RiskDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.RiskPackage#getRiskDesignModel()
 * @model
 * @generated
 */
public interface RiskDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.RiskTypePackage}.
     * It is bidirectional and its opposite is '{@link risk.type.RiskTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see risk.RiskPackage#getRiskDesignModel_Packages()
     * @see risk.type.RiskTypePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<RiskTypePackage> getPackages();

} // RiskDesignModel
