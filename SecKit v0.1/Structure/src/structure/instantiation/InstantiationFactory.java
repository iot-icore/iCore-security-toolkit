/**
 */
package structure.instantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structure.instantiation.InstantiationPackage
 * @generated
 */
public interface InstantiationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationFactory eINSTANCE = structure.instantiation.impl.InstantiationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Entity Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instantiation</em>'.
     * @generated
     */
    EntityInstantiation createEntityInstantiation();

    /**
     * Returns a new object of class '<em>Action Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Point Instantiation</em>'.
     * @generated
     */
    ActionPointInstantiation createActionPointInstantiation();

    /**
     * Returns a new object of class '<em>Interaction Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Instantiation</em>'.
     * @generated
     */
    InteractionPointInstantiation createInteractionPointInstantiation();

    /**
     * Returns a new object of class '<em>Entity Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instantiation Hierarchy</em>'.
     * @generated
     */
    EntityInstantiationHierarchy createEntityInstantiationHierarchy();

    /**
     * Returns a new object of class '<em>Entity Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Instantiation Reference</em>'.
     * @generated
     */
    EntityInstantiationReference createEntityInstantiationReference();

    /**
     * Returns a new object of class '<em>Location Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location Instantiation</em>'.
     * @generated
     */
    LocationInstantiation createLocationInstantiation();

    /**
     * Returns a new object of class '<em>Interaction Point Participation Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Participation Of Instantiation</em>'.
     * @generated
     */
    InteractionPointParticipationOfInstantiation createInteractionPointParticipationOfInstantiation();

    /**
     * Returns a new object of class '<em>Interaction Point Participation Of Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Point Participation Of Type</em>'.
     * @generated
     */
    InteractionPointParticipationOfType createInteractionPointParticipationOfType();

    /**
     * Returns a new object of class '<em>Delegated Interaction Point Participation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delegated Interaction Point Participation</em>'.
     * @generated
     */
    DelegatedInteractionPointParticipation createDelegatedInteractionPointParticipation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstantiationPackage getInstantiationPackage();

} //InstantiationFactory
