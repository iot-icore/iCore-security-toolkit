/**
 */
package structure.instantiation.util;

import models.Element;
import models.Hiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Reference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structure.instantiation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see structure.instantiation.InstantiationPackage
 * @generated
 */
public class InstantiationSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationSwitch() {
        if (modelPackage == null) {
            modelPackage = InstantiationPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case InstantiationPackage.ENTITY_INSTANTIATION: {
                EntityInstantiation entityInstantiation = (EntityInstantiation)theEObject;
                T result = caseEntityInstantiation(entityInstantiation);
                if (result == null) result = caseElement(entityInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ACTION_POINT_INSTANTIATION: {
                ActionPointInstantiation actionPointInstantiation = (ActionPointInstantiation)theEObject;
                T result = caseActionPointInstantiation(actionPointInstantiation);
                if (result == null) result = caseActivityPointInstantiation(actionPointInstantiation);
                if (result == null) result = caseLocalizableInstantiation(actionPointInstantiation);
                if (result == null) result = caseElement(actionPointInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION: {
                InteractionPointInstantiation interactionPointInstantiation = (InteractionPointInstantiation)theEObject;
                T result = caseInteractionPointInstantiation(interactionPointInstantiation);
                if (result == null) result = caseActivityPointInstantiation(interactionPointInstantiation);
                if (result == null) result = caseElement(interactionPointInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ACTIVITY_POINT_INSTANTIATION: {
                ActivityPointInstantiation activityPointInstantiation = (ActivityPointInstantiation)theEObject;
                T result = caseActivityPointInstantiation(activityPointInstantiation);
                if (result == null) result = caseElement(activityPointInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION: {
                InteractionPointParticipationInstantiation interactionPointParticipationInstantiation = (InteractionPointParticipationInstantiation)theEObject;
                T result = caseInteractionPointParticipationInstantiation(interactionPointParticipationInstantiation);
                if (result == null) result = caseElement(interactionPointParticipationInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY: {
                EntityInstantiationHierarchy entityInstantiationHierarchy = (EntityInstantiationHierarchy)theEObject;
                T result = caseEntityInstantiationHierarchy(entityInstantiationHierarchy);
                if (result == null) result = caseInstantiationHierarchy(entityInstantiationHierarchy);
                if (result == null) result = caseHiearchy(entityInstantiationHierarchy);
                if (result == null) result = caseElement(entityInstantiationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE: {
                EntityInstantiationReference entityInstantiationReference = (EntityInstantiationReference)theEObject;
                T result = caseEntityInstantiationReference(entityInstantiationReference);
                if (result == null) result = caseInstantiationReference(entityInstantiationReference);
                if (result == null) result = caseReference(entityInstantiationReference);
                if (result == null) result = caseElement(entityInstantiationReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.LOCATION_INSTANTIATION: {
                LocationInstantiation locationInstantiation = (LocationInstantiation)theEObject;
                T result = caseLocationInstantiation(locationInstantiation);
                if (result == null) result = caseElement(locationInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION: {
                InteractionPointParticipationOfInstantiation interactionPointParticipationOfInstantiation = (InteractionPointParticipationOfInstantiation)theEObject;
                T result = caseInteractionPointParticipationOfInstantiation(interactionPointParticipationOfInstantiation);
                if (result == null) result = caseInteractionPointParticipationInstantiation(interactionPointParticipationOfInstantiation);
                if (result == null) result = caseLocalizableInstantiation(interactionPointParticipationOfInstantiation);
                if (result == null) result = caseElement(interactionPointParticipationOfInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_TYPE: {
                InteractionPointParticipationOfType interactionPointParticipationOfType = (InteractionPointParticipationOfType)theEObject;
                T result = caseInteractionPointParticipationOfType(interactionPointParticipationOfType);
                if (result == null) result = caseAbstractInteractionPointParticipationOfType(interactionPointParticipationOfType);
                if (result == null) result = caseInteractionPointParticipationInstantiation(interactionPointParticipationOfType);
                if (result == null) result = caseElement(interactionPointParticipationOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION: {
                DelegatedInteractionPointParticipation delegatedInteractionPointParticipation = (DelegatedInteractionPointParticipation)theEObject;
                T result = caseDelegatedInteractionPointParticipation(delegatedInteractionPointParticipation);
                if (result == null) result = caseAbstractInteractionPointParticipationOfType(delegatedInteractionPointParticipation);
                if (result == null) result = caseInteractionPointParticipationInstantiation(delegatedInteractionPointParticipation);
                if (result == null) result = caseElement(delegatedInteractionPointParticipation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE: {
                AbstractInteractionPointParticipationOfType abstractInteractionPointParticipationOfType = (AbstractInteractionPointParticipationOfType)theEObject;
                T result = caseAbstractInteractionPointParticipationOfType(abstractInteractionPointParticipationOfType);
                if (result == null) result = caseInteractionPointParticipationInstantiation(abstractInteractionPointParticipationOfType);
                if (result == null) result = caseElement(abstractInteractionPointParticipationOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.LOCALIZABLE_INSTANTIATION: {
                LocalizableInstantiation localizableInstantiation = (LocalizableInstantiation)theEObject;
                T result = caseLocalizableInstantiation(localizableInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstantiation(EntityInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Point Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionPointInstantiation(ActionPointInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointInstantiation(InteractionPointInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Point Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityPointInstantiation(ActivityPointInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Participation Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Participation Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointParticipationInstantiation(InteractionPointParticipationInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstantiationHierarchy(EntityInstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstantiationReference(EntityInstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocationInstantiation(LocationInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Participation Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Participation Of Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointParticipationOfInstantiation(InteractionPointParticipationOfInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Participation Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Participation Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointParticipationOfType(InteractionPointParticipationOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delegated Interaction Point Participation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delegated Interaction Point Participation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDelegatedInteractionPointParticipation(DelegatedInteractionPointParticipation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Interaction Point Participation Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Interaction Point Participation Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractInteractionPointParticipationOfType(AbstractInteractionPointParticipationOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Localizable Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Localizable Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalizableInstantiation(LocalizableInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHiearchy(Hiearchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationHierarchy(InstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReference(Reference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationReference(InstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //InstantiationSwitch
