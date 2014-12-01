/**
 */
package rule.propositional;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.propositional.PropositionalPackage
 * @generated
 */
public interface PropositionalFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PropositionalFactory eINSTANCE = rule.propositional.impl.PropositionalFactoryImpl.init();

    /**
     * Returns a new object of class '<em>And</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>And</em>'.
     * @generated
     */
    And createAnd();

    /**
     * Returns a new object of class '<em>Or</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Or</em>'.
     * @generated
     */
    Or createOr();

    /**
     * Returns a new object of class '<em>Not</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Not</em>'.
     * @generated
     */
    Not createNot();

    /**
     * Returns a new object of class '<em>Implies</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implies</em>'.
     * @generated
     */
    Implies createImplies();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PropositionalPackage getPropositionalPackage();

} //PropositionalFactory
