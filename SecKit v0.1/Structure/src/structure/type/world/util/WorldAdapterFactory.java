/**
 */
package structure.type.world.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structure.type.EntityType;

import structure.type.world.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structure.type.world.WorldPackage
 * @generated
 */
public class WorldAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static WorldPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorldAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = WorldPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorldSwitch<Adapter> modelSwitch =
        new WorldSwitch<Adapter>() {
            @Override
            public Adapter caseServiceAssembly(ServiceAssembly object) {
                return createServiceAssemblyAdapter();
            }
            @Override
            public Adapter casePerson(Person object) {
                return createPersonAdapter();
            }
            @Override
            public Adapter caseBuilding(Building object) {
                return createBuildingAdapter();
            }
            @Override
            public Adapter caseRoom(Room object) {
                return createRoomAdapter();
            }
            @Override
            public Adapter caseSoftwareEntity(SoftwareEntity object) {
                return createSoftwareEntityAdapter();
            }
            @Override
            public Adapter caseIntangibleEntity(IntangibleEntity object) {
                return createIntangibleEntityAdapter();
            }
            @Override
            public Adapter caseTangibleEntity(TangibleEntity object) {
                return createTangibleEntityAdapter();
            }
            @Override
            public Adapter casePointEntity(PointEntity object) {
                return createPointEntityAdapter();
            }
            @Override
            public Adapter casePhysicalContainerEntity(PhysicalContainerEntity object) {
                return createPhysicalContainerEntityAdapter();
            }
            @Override
            public Adapter caseLevel(Level object) {
                return createLevelAdapter();
            }
            @Override
            public Adapter caseDeviceType(DeviceType object) {
                return createDeviceTypeAdapter();
            }
            @Override
            public Adapter caseInformationSystem(InformationSystem object) {
                return createInformationSystemAdapter();
            }
            @Override
            public Adapter caseAdministrator(Administrator object) {
                return createAdministratorAdapter();
            }
            @Override
            public Adapter caseStakeholder(Stakeholder object) {
                return createStakeholderAdapter();
            }
            @Override
            public Adapter caseOwner(Owner object) {
                return createOwnerAdapter();
            }
            @Override
            public Adapter caseContainedTypeRole(ContainedTypeRole object) {
                return createContainedTypeRoleAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseEntityType(EntityType object) {
                return createEntityTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.ServiceAssembly <em>Service Assembly</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.ServiceAssembly
     * @generated
     */
    public Adapter createServiceAssemblyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Person
     * @generated
     */
    public Adapter createPersonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Building <em>Building</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Building
     * @generated
     */
    public Adapter createBuildingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Room <em>Room</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Room
     * @generated
     */
    public Adapter createRoomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.SoftwareEntity <em>Software Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.SoftwareEntity
     * @generated
     */
    public Adapter createSoftwareEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.IntangibleEntity <em>Intangible Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.IntangibleEntity
     * @generated
     */
    public Adapter createIntangibleEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.TangibleEntity <em>Tangible Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.TangibleEntity
     * @generated
     */
    public Adapter createTangibleEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.PointEntity <em>Point Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.PointEntity
     * @generated
     */
    public Adapter createPointEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.PhysicalContainerEntity <em>Physical Container Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.PhysicalContainerEntity
     * @generated
     */
    public Adapter createPhysicalContainerEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Level <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Level
     * @generated
     */
    public Adapter createLevelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.DeviceType <em>Device Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.DeviceType
     * @generated
     */
    public Adapter createDeviceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.InformationSystem <em>Information System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.InformationSystem
     * @generated
     */
    public Adapter createInformationSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Administrator <em>Administrator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Administrator
     * @generated
     */
    public Adapter createAdministratorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Stakeholder <em>Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Stakeholder
     * @generated
     */
    public Adapter createStakeholderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.Owner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.Owner
     * @generated
     */
    public Adapter createOwnerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.world.ContainedTypeRole <em>Contained Type Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.world.ContainedTypeRole
     * @generated
     */
    public Adapter createContainedTypeRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.EntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.EntityType
     * @generated
     */
    public Adapter createEntityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //WorldAdapterFactory
