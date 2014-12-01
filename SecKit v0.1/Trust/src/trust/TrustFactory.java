/**
 */
package trust;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trust.TrustPackage
 * @generated
 */
public interface TrustFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrustFactory eINSTANCE = trust.impl.TrustFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Runtime Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Runtime Model</em>'.
   * @generated
   */
  TrustRuntimeModel createTrustRuntimeModel();

  /**
   * Returns a new object of class '<em>Design Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design Model</em>'.
   * @generated
   */
  TrustDesignModel createTrustDesignModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TrustPackage getTrustPackage();

} //TrustFactory
