/**
 */
package context.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternFactory eINSTANCE = context.pattern.impl.PatternFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Situation Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Situation Pattern</em>'.
     * @generated
     */
    ContextSituationPattern createContextSituationPattern();

    /**
     * Returns a new object of class '<em>Context Information Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Information Pattern</em>'.
     * @generated
     */
    ContextInformationPattern createContextInformationPattern();

    /**
     * Returns a new object of class '<em>Entity Role Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Role Pattern</em>'.
     * @generated
     */
    EntityRolePattern createEntityRolePattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PatternPackage getPatternPackage();

} //PatternFactory
