/**
 */
package structure.type.world.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structure.type.EntityType;

import structure.type.world.*;

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
 * @see structure.type.world.WorldPackage
 * @generated
 */
public class WorldSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static WorldPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorldSwitch() {
        if (modelPackage == null) {
            modelPackage = WorldPackage.eINSTANCE;
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
            case WorldPackage.SERVICE_ASSEMBLY: {
                ServiceAssembly serviceAssembly = (ServiceAssembly)theEObject;
                T result = caseServiceAssembly(serviceAssembly);
                if (result == null) result = caseSoftwareEntity(serviceAssembly);
                if (result == null) result = caseIntangibleEntity(serviceAssembly);
                if (result == null) result = caseEntityType(serviceAssembly);
                if (result == null) result = caseElement(serviceAssembly);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.PERSON: {
                Person person = (Person)theEObject;
                T result = casePerson(person);
                if (result == null) result = casePointEntity(person);
                if (result == null) result = caseTangibleEntity(person);
                if (result == null) result = caseEntityType(person);
                if (result == null) result = caseElement(person);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.BUILDING: {
                Building building = (Building)theEObject;
                T result = caseBuilding(building);
                if (result == null) result = casePhysicalContainerEntity(building);
                if (result == null) result = caseTangibleEntity(building);
                if (result == null) result = caseEntityType(building);
                if (result == null) result = caseElement(building);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.ROOM: {
                Room room = (Room)theEObject;
                T result = caseRoom(room);
                if (result == null) result = casePhysicalContainerEntity(room);
                if (result == null) result = caseTangibleEntity(room);
                if (result == null) result = caseEntityType(room);
                if (result == null) result = caseElement(room);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.SOFTWARE_ENTITY: {
                SoftwareEntity softwareEntity = (SoftwareEntity)theEObject;
                T result = caseSoftwareEntity(softwareEntity);
                if (result == null) result = caseIntangibleEntity(softwareEntity);
                if (result == null) result = caseEntityType(softwareEntity);
                if (result == null) result = caseElement(softwareEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.INTANGIBLE_ENTITY: {
                IntangibleEntity intangibleEntity = (IntangibleEntity)theEObject;
                T result = caseIntangibleEntity(intangibleEntity);
                if (result == null) result = caseEntityType(intangibleEntity);
                if (result == null) result = caseElement(intangibleEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.TANGIBLE_ENTITY: {
                TangibleEntity tangibleEntity = (TangibleEntity)theEObject;
                T result = caseTangibleEntity(tangibleEntity);
                if (result == null) result = caseEntityType(tangibleEntity);
                if (result == null) result = caseElement(tangibleEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.POINT_ENTITY: {
                PointEntity pointEntity = (PointEntity)theEObject;
                T result = casePointEntity(pointEntity);
                if (result == null) result = caseTangibleEntity(pointEntity);
                if (result == null) result = caseEntityType(pointEntity);
                if (result == null) result = caseElement(pointEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.PHYSICAL_CONTAINER_ENTITY: {
                PhysicalContainerEntity physicalContainerEntity = (PhysicalContainerEntity)theEObject;
                T result = casePhysicalContainerEntity(physicalContainerEntity);
                if (result == null) result = caseTangibleEntity(physicalContainerEntity);
                if (result == null) result = caseEntityType(physicalContainerEntity);
                if (result == null) result = caseElement(physicalContainerEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.LEVEL: {
                Level level = (Level)theEObject;
                T result = caseLevel(level);
                if (result == null) result = casePhysicalContainerEntity(level);
                if (result == null) result = caseTangibleEntity(level);
                if (result == null) result = caseEntityType(level);
                if (result == null) result = caseElement(level);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.DEVICE_TYPE: {
                DeviceType deviceType = (DeviceType)theEObject;
                T result = caseDeviceType(deviceType);
                if (result == null) result = casePointEntity(deviceType);
                if (result == null) result = caseTangibleEntity(deviceType);
                if (result == null) result = caseEntityType(deviceType);
                if (result == null) result = caseElement(deviceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.INFORMATION_SYSTEM: {
                InformationSystem informationSystem = (InformationSystem)theEObject;
                T result = caseInformationSystem(informationSystem);
                if (result == null) result = caseIntangibleEntity(informationSystem);
                if (result == null) result = caseEntityType(informationSystem);
                if (result == null) result = caseElement(informationSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.ADMINISTRATOR: {
                Administrator administrator = (Administrator)theEObject;
                T result = caseAdministrator(administrator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.STAKEHOLDER: {
                Stakeholder stakeholder = (Stakeholder)theEObject;
                T result = caseStakeholder(stakeholder);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.OWNER: {
                Owner owner = (Owner)theEObject;
                T result = caseOwner(owner);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorldPackage.CONTAINED_TYPE_ROLE: {
                ContainedTypeRole containedTypeRole = (ContainedTypeRole)theEObject;
                T result = caseContainedTypeRole(containedTypeRole);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Assembly</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Assembly</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceAssembly(ServiceAssembly object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerson(Person object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Building</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBuilding(Building object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Room</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoom(Room object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareEntity(SoftwareEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intangible Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intangible Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntangibleEntity(IntangibleEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tangible Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tangible Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTangibleEntity(TangibleEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePointEntity(PointEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Container Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Container Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalContainerEntity(PhysicalContainerEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLevel(Level object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Device Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Device Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceType(DeviceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Information System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Information System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInformationSystem(InformationSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Administrator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Administrator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdministrator(Administrator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStakeholder(Stakeholder object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwner(Owner object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contained Type Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contained Type Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContainedTypeRole(ContainedTypeRole object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityType(EntityType object) {
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

} //WorldSwitch
