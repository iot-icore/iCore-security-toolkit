/**
 */
package behavior.type.action.util;

import behavior.type.AbstractDataProducerType;
import behavior.type.ActionType;
import behavior.type.ActivityType;
import behavior.type.DataProducerType;

import behavior.type.action.*;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see behavior.type.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ActionPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionSwitch() {
        if (modelPackage == null) {
            modelPackage = ActionPackage.eINSTANCE;
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
            case ActionPackage.CREATE: {
                Create create = (Create)theEObject;
                T result = caseCreate(create);
                if (result == null) result = casePersistenceStorageActionType(create);
                if (result == null) result = caseActionType(create);
                if (result == null) result = caseActivityType(create);
                if (result == null) result = caseDataProducerType(create);
                if (result == null) result = caseAbstractDataProducerType(create);
                if (result == null) result = caseElement(create);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.READ: {
                Read read = (Read)theEObject;
                T result = caseRead(read);
                if (result == null) result = casePersistenceStorageActionType(read);
                if (result == null) result = caseActionType(read);
                if (result == null) result = caseActivityType(read);
                if (result == null) result = caseDataProducerType(read);
                if (result == null) result = caseAbstractDataProducerType(read);
                if (result == null) result = caseElement(read);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.UPDATE: {
                Update update = (Update)theEObject;
                T result = caseUpdate(update);
                if (result == null) result = casePersistenceStorageActionType(update);
                if (result == null) result = caseActionType(update);
                if (result == null) result = caseActivityType(update);
                if (result == null) result = caseDataProducerType(update);
                if (result == null) result = caseAbstractDataProducerType(update);
                if (result == null) result = caseElement(update);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.DELETE: {
                Delete delete = (Delete)theEObject;
                T result = caseDelete(delete);
                if (result == null) result = casePersistenceStorageActionType(delete);
                if (result == null) result = caseActionType(delete);
                if (result == null) result = caseActivityType(delete);
                if (result == null) result = caseDataProducerType(delete);
                if (result == null) result = caseAbstractDataProducerType(delete);
                if (result == null) result = caseElement(delete);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.PERSISTENCE_STORAGE_ACTION_TYPE: {
                PersistenceStorageActionType persistenceStorageActionType = (PersistenceStorageActionType)theEObject;
                T result = casePersistenceStorageActionType(persistenceStorageActionType);
                if (result == null) result = caseActionType(persistenceStorageActionType);
                if (result == null) result = caseActivityType(persistenceStorageActionType);
                if (result == null) result = caseDataProducerType(persistenceStorageActionType);
                if (result == null) result = caseAbstractDataProducerType(persistenceStorageActionType);
                if (result == null) result = caseElement(persistenceStorageActionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.HUMAN_ACTION: {
                HumanAction humanAction = (HumanAction)theEObject;
                T result = caseHumanAction(humanAction);
                if (result == null) result = caseActionType(humanAction);
                if (result == null) result = caseActivityType(humanAction);
                if (result == null) result = caseDataProducerType(humanAction);
                if (result == null) result = caseAbstractDataProducerType(humanAction);
                if (result == null) result = caseElement(humanAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.DISCOVER_ENTITY: {
                DiscoverEntity discoverEntity = (DiscoverEntity)theEObject;
                T result = caseDiscoverEntity(discoverEntity);
                if (result == null) result = caseActionType(discoverEntity);
                if (result == null) result = caseActivityType(discoverEntity);
                if (result == null) result = caseDataProducerType(discoverEntity);
                if (result == null) result = caseAbstractDataProducerType(discoverEntity);
                if (result == null) result = caseElement(discoverEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Create</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCreate(Create object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRead(Read object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Update</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUpdate(Update object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDelete(Delete object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Persistence Storage Action Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persistence Storage Action Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersistenceStorageActionType(PersistenceStorageActionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Human Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Human Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHumanAction(HumanAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discover Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discover Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscoverEntity(DiscoverEntity object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataProducerType(AbstractDataProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProducerType(DataProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityType(ActivityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionType(ActionType object) {
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

} //ActionSwitch
