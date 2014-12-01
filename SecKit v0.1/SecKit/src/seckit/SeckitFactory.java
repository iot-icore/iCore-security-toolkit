/**
 */
package seckit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see seckit.SeckitPackage
 * @generated
 */
public interface SeckitFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SeckitFactory eINSTANCE = seckit.impl.SeckitFactoryImpl.init();

    /**
     * Returns a new object of class '<em>System Design Viewpoint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Design Viewpoint</em>'.
     * @generated
     */
    SystemDesignViewpoint createSystemDesignViewpoint();

    /**
     * Returns a new object of class '<em>System Runtime Viewpoint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Runtime Viewpoint</em>'.
     * @generated
     */
    SystemRuntimeViewpoint createSystemRuntimeViewpoint();

    /**
     * Returns a new object of class '<em>System Viewpoints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Viewpoints</em>'.
     * @generated
     */
    SystemViewpoints createSystemViewpoints();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SeckitPackage getSeckitPackage();

} //SeckitFactory
