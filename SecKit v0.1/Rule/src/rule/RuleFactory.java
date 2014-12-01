/**
 */
package rule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.RulePackage
 * @generated
 */
public interface RuleFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RuleFactory eINSTANCE = rule.impl.RuleFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Design Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Design Model</em>'.
     * @generated
     */
    RuleDesignModel createRuleDesignModel();

    /**
     * Returns a new object of class '<em>Runtime Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Runtime Model</em>'.
     * @generated
     */
    RuleRuntimeModel createRuleRuntimeModel();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RulePackage getRulePackage();

} //RuleFactory
