/**
 */
package structure.trust;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.trust.TrustPackage
 * @generated
 */
public interface TrustFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TrustFactory eINSTANCE = structure.trust.impl.TrustFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Structural Quality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural Quality</em>'.
     * @generated
     */
    StructuralQuality createStructuralQuality();

    /**
     * Returns a new object of class '<em>Resistance To Tampering</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resistance To Tampering</em>'.
     * @generated
     */
    ResistanceToTampering createResistanceToTampering();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TrustPackage getTrustPackage();

} //TrustFactory
