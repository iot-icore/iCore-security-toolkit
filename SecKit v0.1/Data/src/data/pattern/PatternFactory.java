/**
 */
package data.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternFactory eINSTANCE = data.pattern.impl.PatternFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Data Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Pattern</em>'.
     * @generated
     */
    DataPattern createDataPattern();

    /**
     * Returns a new object of class '<em>Reg Exp Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reg Exp Pattern</em>'.
     * @generated
     */
    RegExpPattern createRegExpPattern();

    /**
     * Returns a new object of class '<em>XPath Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XPath Pattern</em>'.
     * @generated
     */
    XPathPattern createXPathPattern();

    /**
     * Returns a new object of class '<em>Literal Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Pattern</em>'.
     * @generated
     */
    LiteralPattern createLiteralPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PatternPackage getPatternPackage();

} //PatternFactory
