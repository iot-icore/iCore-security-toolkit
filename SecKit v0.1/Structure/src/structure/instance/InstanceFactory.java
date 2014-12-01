/**
 */
package structure.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstanceFactory eINSTANCE = structure.instance.impl.InstanceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity</em>'.
     * @generated
     */
    Entity createEntity();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Interaction Point Participation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Participation</em>'.
     * @generated
     */
    InteractionPointParticipation createInteractionPointParticipation();

    /**
     * Returns a new object of class '<em>Action Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Point</em>'.
     * @generated
     */
    ActionPoint createActionPoint();

    /**
     * Returns a new object of class '<em>Interaction Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point</em>'.
     * @generated
     */
    InteractionPoint createInteractionPoint();

    /**
     * Returns a new object of class '<em>Entity Instance Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instance Hiearchy</em>'.
     * @generated
     */
    EntityInstanceHiearchy createEntityInstanceHiearchy();

    /**
     * Returns a new object of class '<em>Entity Instance Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instance Reference</em>'.
     * @generated
     */
    EntityInstanceReference createEntityInstanceReference();

    /**
     * Returns a new object of class '<em>Entity Instance Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instance Variable Reference</em>'.
     * @generated
     */
    EntityInstanceVariableReference createEntityInstanceVariableReference();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstancePackage getInstancePackage();

} //InstanceFactory
