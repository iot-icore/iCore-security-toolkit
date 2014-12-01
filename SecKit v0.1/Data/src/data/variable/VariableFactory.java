/**
 */
package data.variable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data.variable.VariablePackage
 * @generated
 */
public interface VariableFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariableFactory eINSTANCE = data.variable.impl.VariableFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Data Type Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Type Variable</em>'.
     * @generated
     */
    DataTypeVariable createDataTypeVariable();

    /**
     * Returns a new object of class '<em>Data Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instantiation Variable</em>'.
     * @generated
     */
    DataInstantiationVariable createDataInstantiationVariable();

    /**
     * Returns a new object of class '<em>Data Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instance Variable</em>'.
     * @generated
     */
    DataInstanceVariable createDataInstanceVariable();

    /**
     * Returns a new object of class '<em>Data Instance Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instance Assignment</em>'.
     * @generated
     */
    DataInstanceAssignment createDataInstanceAssignment();

    /**
     * Returns a new object of class '<em>Data Instantiation Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Instantiation Assignment</em>'.
     * @generated
     */
    DataInstantiationAssignment createDataInstantiationAssignment();

    /**
     * Returns a new object of class '<em>Data Type Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Type Assignment</em>'.
     * @generated
     */
    DataTypeAssignment createDataTypeAssignment();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VariablePackage getVariablePackage();

} //VariableFactory
