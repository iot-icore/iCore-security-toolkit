/**
 */
package structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.StructurePackage
 * @generated
 */
public interface StructureFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StructureFactory eINSTANCE = structure.impl.StructureFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Structural Design Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural Design Model</em>'.
     * @generated
     */
    StructuralDesignModel createStructuralDesignModel();

    /**
     * Returns a new object of class '<em>Structural Runtime Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural Runtime Model</em>'.
     * @generated
     */
    StructuralRuntimeModel createStructuralRuntimeModel();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    StructurePackage getStructurePackage();

} //StructureFactory
