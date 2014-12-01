/**
 */
package context.instance.tmp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see context.instance.tmp.TmpPackage
 * @generated
 */
public interface TmpFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TmpFactory eINSTANCE = context.instance.tmp.impl.TmpFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Event Precision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Precision</em>'.
     * @generated
     */
    EventPrecision createEventPrecision();

    /**
     * Returns a new object of class '<em>Fever</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fever</em>'.
     * @generated
     */
    Fever createFever();

    /**
     * Returns a new object of class '<em>Available Devices</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Available Devices</em>'.
     * @generated
     */
    AvailableDevices createAvailableDevices();

    /**
     * Returns a new object of class '<em>Formal Relation Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formal Relation Context</em>'.
     * @generated
     */
    FormalRelationContext createFormalRelationContext();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TmpPackage getTmpPackage();

} //TmpFactory
