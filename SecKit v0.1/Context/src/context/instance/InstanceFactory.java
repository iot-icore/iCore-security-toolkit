/**
 */
package context.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstanceFactory eINSTANCE = context.instance.impl.InstanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Context Situation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Situation</em>'.
     * @generated
     */
    ContextSituation createContextSituation();

    /**
     * Returns a new object of class '<em>Entity Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Role</em>'.
     * @generated
     */
    EntityRole createEntityRole();

    /**
     * Returns a new object of class '<em>Numeric Precision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numeric Precision</em>'.
     * @generated
     */
    NumericPrecision createNumericPrecision();

    /**
     * Returns a new object of class '<em>Quality Of Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quality Of Context</em>'.
     * @generated
     */
    QualityOfContext createQualityOfContext();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstancePackage getInstancePackage();

} //InstanceFactory
