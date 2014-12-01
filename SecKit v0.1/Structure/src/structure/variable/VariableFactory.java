/**
 */
package structure.variable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.variable.VariablePackage
 * @generated
 */
public interface VariableFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariableFactory eINSTANCE = structure.variable.impl.VariableFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Entity Type Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Type Variable</em>'.
     * @generated
     */
    EntityTypeVariable createEntityTypeVariable();

    /**
     * Returns a new object of class '<em>Entity Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instance Variable</em>'.
     * @generated
     */
    EntityInstanceVariable createEntityInstanceVariable();

    /**
     * Returns a new object of class '<em>Entity Instantiation Hierarchy Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instantiation Hierarchy Variable</em>'.
     * @generated
     */
    EntityInstantiationHierarchyVariable createEntityInstantiationHierarchyVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VariablePackage getVariablePackage();

} //VariableFactory
