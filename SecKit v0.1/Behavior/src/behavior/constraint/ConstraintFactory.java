/**
 */
package behavior.constraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.constraint.ConstraintPackage
 * @generated
 */
public interface ConstraintFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConstraintFactory eINSTANCE = behavior.constraint.impl.ConstraintFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Reference Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Data Establishment</em>'.
     * @generated
     */
    ReferenceDataEstablishment createReferenceDataEstablishment();

    /**
     * Returns a new object of class '<em>Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Establishment</em>'.
     * @generated
     */
    DataEstablishment createDataEstablishment();

    /**
     * Returns a new object of class '<em>Static Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Data Establishment</em>'.
     * @generated
     */
    StaticDataEstablishment createStaticDataEstablishment();

    /**
     * Returns a new object of class '<em>Data Establishment From Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Establishment From Variable</em>'.
     * @generated
     */
    DataEstablishmentFromVariable createDataEstablishmentFromVariable();

    /**
     * Returns a new object of class '<em>Identity Establishment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Establishment</em>'.
     * @generated
     */
    IdentityEstablishment createIdentityEstablishment();

    /**
     * Returns a new object of class '<em>Identity Establishment From Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identity Establishment From Variable</em>'.
     * @generated
     */
    IdentityEstablishmentFromVariable createIdentityEstablishmentFromVariable();

    /**
     * Returns a new object of class '<em>Reference Identity Establishment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Identity Establishment</em>'.
     * @generated
     */
    ReferenceIdentityEstablishment createReferenceIdentityEstablishment();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConstraintPackage getConstraintPackage();

} //ConstraintFactory
