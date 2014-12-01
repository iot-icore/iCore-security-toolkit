/**
 */
package context.instantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.instantiation.InstantiationPackage
 * @generated
 */
public interface InstantiationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationFactory eINSTANCE = context.instantiation.impl.InstantiationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Information Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Information Instantiation</em>'.
     * @generated
     */
    ContextInformationInstantiation createContextInformationInstantiation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstantiationPackage getInstantiationPackage();

} //InstantiationFactory
