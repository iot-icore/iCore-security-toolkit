/**
 */
package models;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see models.ModelsPackage
 * @generated
 */
public interface ModelsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelsFactory eINSTANCE = models.impl.ModelsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Multiplicity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multiplicity</em>'.
     * @generated
     */
    Multiplicity createMultiplicity();

    /**
     * Returns a new object of class '<em>Monetary Amount</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Monetary Amount</em>'.
     * @generated
     */
    MonetaryAmount createMonetaryAmount();

    /**
     * Returns a new object of class '<em>Currency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Currency</em>'.
     * @generated
     */
    Currency createCurrency();

    /**
     * Returns a new object of class '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape</em>'.
     * @generated
     */
    Shape createShape();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    Diagram createDiagram();

    /**
     * Returns a new object of class '<em>Tree Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tree Node</em>'.
     * @generated
     */
    TreeNode createTreeNode();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModelsPackage getModelsPackage();

} //ModelsFactory
