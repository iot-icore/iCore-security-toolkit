/**
 */
package identity.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see identity.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternFactory eINSTANCE = identity.pattern.impl.PatternFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Identity Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Pattern</em>'.
     * @generated
     */
    IdentityPattern createIdentityPattern();

    /**
     * Returns a new object of class '<em>Identity Attribute Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Attribute Pattern</em>'.
     * @generated
     */
    IdentityAttributePattern createIdentityAttributePattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PatternPackage getPatternPackage();

} //PatternFactory
