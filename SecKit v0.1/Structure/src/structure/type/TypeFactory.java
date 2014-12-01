/**
 */
package structure.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = structure.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Location Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location Type</em>'.
     * @generated
     */
    LocationType createLocationType();

    /**
     * Returns a new object of class '<em>Interaction Point Participation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Participation Type</em>'.
     * @generated
     */
    InteractionPointParticipationType createInteractionPointParticipationType();

    /**
     * Returns a new object of class '<em>Action Point Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Point Type</em>'.
     * @generated
     */
    ActionPointType createActionPointType();

    /**
     * Returns a new object of class '<em>Interaction Point Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Type</em>'.
     * @generated
     */
    InteractionPointType createInteractionPointType();

    /**
     * Returns a new object of class '<em>Entity Type Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Type Package</em>'.
     * @generated
     */
    EntityTypePackage createEntityTypePackage();

    /**
     * Returns a new object of class '<em>Entity Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Type</em>'.
     * @generated
     */
    EntityType createEntityType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
