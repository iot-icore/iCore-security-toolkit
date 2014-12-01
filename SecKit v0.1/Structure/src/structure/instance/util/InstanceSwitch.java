/**
 */
package structure.instance.util;

import identity.instance.IdentityOwner;
import models.Element;
import models.Hiearchy;
import models.InstanceHiearchy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structure.instance.*;

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
 * @see structure.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceSwitch() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
            case InstancePackage.ENTITY: {
                Entity entity = (Entity)theEObject;
                T result = caseEntity(entity);
                if (result == null) result = caseElement(entity);
                if (result == null) result = caseIdentityOwner(entity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.LOCATION: {
                Location location = (Location)theEObject;
                T result = caseLocation(location);
                if (result == null) result = caseElement(location);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.INTERACTION_POINT_PARTICIPATION: {
                InteractionPointParticipation interactionPointParticipation = (InteractionPointParticipation)theEObject;
                T result = caseInteractionPointParticipation(interactionPointParticipation);
                if (result == null) result = caseElement(interactionPointParticipation);
                if (result == null) result = caseLocalizableInstance(interactionPointParticipation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ACTIVITY_POINT: {
                ActivityPoint activityPoint = (ActivityPoint)theEObject;
                T result = caseActivityPoint(activityPoint);
                if (result == null) result = caseElement(activityPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ACTION_POINT: {
                ActionPoint actionPoint = (ActionPoint)theEObject;
                T result = caseActionPoint(actionPoint);
                if (result == null) result = caseActivityPoint(actionPoint);
                if (result == null) result = caseLocalizableInstance(actionPoint);
                if (result == null) result = caseElement(actionPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.INTERACTION_POINT: {
                InteractionPoint interactionPoint = (InteractionPoint)theEObject;
                T result = caseInteractionPoint(interactionPoint);
                if (result == null) result = caseActivityPoint(interactionPoint);
                if (result == null) result = caseElement(interactionPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY: {
                EntityInstanceHiearchy entityInstanceHiearchy = (EntityInstanceHiearchy)theEObject;
                T result = caseEntityInstanceHiearchy(entityInstanceHiearchy);
                if (result == null) result = caseInstanceHiearchy(entityInstanceHiearchy);
                if (result == null) result = caseHiearchy(entityInstanceHiearchy);
                if (result == null) result = caseElement(entityInstanceHiearchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ENTITY_INSTANCE_REFERENCE: {
                EntityInstanceReference entityInstanceReference = (EntityInstanceReference)theEObject;
                T result = caseEntityInstanceReference(entityInstanceReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ENTITY_INSTANCE_STATIC_REFERENCE: {
                EntityInstanceStaticReference entityInstanceStaticReference = (EntityInstanceStaticReference)theEObject;
                T result = caseEntityInstanceStaticReference(entityInstanceStaticReference);
                if (result == null) result = caseEntityInstanceReference(entityInstanceStaticReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.ENTITY_INSTANCE_VARIABLE_REFERENCE: {
                EntityInstanceVariableReference entityInstanceVariableReference = (EntityInstanceVariableReference)theEObject;
                T result = caseEntityInstanceVariableReference(entityInstanceVariableReference);
                if (result == null) result = caseEntityInstanceReference(entityInstanceVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.LOCALIZABLE_INSTANCE: {
                LocalizableInstance localizableInstance = (LocalizableInstance)theEObject;
                T result = caseLocalizableInstance(localizableInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocation(Location object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Participation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Participation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointParticipation(InteractionPointParticipation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityPoint(ActivityPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionPoint(ActionPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPoint(InteractionPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instance Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instance Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstanceHiearchy(EntityInstanceHiearchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instance Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instance Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstanceReference(EntityInstanceReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instance Static Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instance Static Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstanceStaticReference(EntityInstanceStaticReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instance Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instance Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstanceVariableReference(EntityInstanceVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Localizable Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Localizable Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalizableInstance(LocalizableInstance object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Identity Owner</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Owner</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityOwner(IdentityOwner object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Instance Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceHiearchy(InstanceHiearchy object) {
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

} //InstanceSwitch
