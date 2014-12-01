/**
 */
package models.variable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see models.variable.VariablePackage
 * @generated
 */
public interface VariableFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariableFactory eINSTANCE = models.variable.impl.VariableFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Reference Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Variable Assignment</em>'.
     * @generated
     */
    ReferenceVariableAssignment createReferenceVariableAssignment();

    /**
     * Returns a new object of class '<em>XPath Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XPath Variable Assignment</em>'.
     * @generated
     */
    XPathVariableAssignment createXPathVariableAssignment();

    /**
     * Returns a new object of class '<em>String Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Assignment</em>'.
     * @generated
     */
    StringAssignment createStringAssignment();

    /**
     * Returns a new object of class '<em>Reg Exp Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reg Exp Variable Assignment</em>'.
     * @generated
     */
    RegExpVariableAssignment createRegExpVariableAssignment();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VariablePackage getVariablePackage();

} //VariableFactory
