/**
 */
package trust;

import models.Model;

import org.eclipse.emf.common.util.EList;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.TrustDesignModel#getTrustAspects <em>Trust Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.TrustPackage#getTrustDesignModel()
 * @model
 * @generated
 */
public interface TrustDesignModel extends Model {
  /**
   * Returns the value of the '<em><b>Trust Aspects</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.TrustAspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Aspects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Aspects</em>' containment reference list.
   * @see trust.TrustPackage#getTrustDesignModel_TrustAspects()
   * @model containment="true"
   * @generated
   */
  EList<TrustAspect> getTrustAspects();

} // TrustDesignModel
