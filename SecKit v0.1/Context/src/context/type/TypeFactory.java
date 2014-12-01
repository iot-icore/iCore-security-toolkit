/**
 */
package context.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = context.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Situation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Situation Type</em>'.
     * @generated
     */
    ContextSituationType createContextSituationType();

    /**
     * Returns a new object of class '<em>Context Information Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Information Type</em>'.
     * @generated
     */
    ContextInformationType createContextInformationType();

    /**
     * Returns a new object of class '<em>Context Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Type Package</em>'.
     * @generated
     */
    ContextTypePackage createContextTypePackage();

    /**
     * Returns a new object of class '<em>Entity Role Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Role Type</em>'.
     * @generated
     */
    EntityRoleType createEntityRoleType();

    /**
     * Returns a new object of class '<em>Composite Context Situation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Composite Context Situation Type</em>'.
     * @generated
     */
    CompositeContextSituationType createCompositeContextSituationType();

    /**
     * Returns a new object of class '<em>Situation Role Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Situation Role Type</em>'.
     * @generated
     */
    SituationRoleType createSituationRoleType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
