/**
 */
package role.util;

import java.util.Map;

import models.Element;
import models.Model;
import models.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import role.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see role.RolePackage
 * @generated
 */
public class RoleAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RolePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RolePackage.eINSTANCE;
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
    protected RoleSwitch<Adapter> modelSwitch =
        new RoleSwitch<Adapter>() {
            @Override
            public Adapter caseRoleType(RoleType object) {
                return createRoleTypeAdapter();
            }
            @Override
            public Adapter caseRoleDesignModel(RoleDesignModel object) {
                return createRoleDesignModelAdapter();
            }
            @Override
            public Adapter caseRoleTypePackage(RoleTypePackage object) {
                return createRoleTypePackageAdapter();
            }
            @Override
            public Adapter caseRoleRuntimeModel(RoleRuntimeModel object) {
                return createRoleRuntimeModelAdapter();
            }
            @Override
            public Adapter caseRoleAssignmentMap(Map.Entry<RoleType, RoleAssignment> object) {
                return createRoleAssignmentMapAdapter();
            }
            @Override
            public Adapter caseRoleAssignment(RoleAssignment object) {
                return createRoleAssignmentAdapter();
            }
            @Override
            public Adapter caseRolePattern(RolePattern object) {
                return createRolePatternAdapter();
            }
            @Override
            public Adapter caseIdentityRolePattern(IdentityRolePattern object) {
                return createIdentityRolePatternAdapter();
            }
            @Override
            public Adapter caseAbstractRolePattern(AbstractRolePattern object) {
                return createAbstractRolePatternAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseModel(Model object) {
                return createModelAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
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
     * Creates a new adapter for an object of class '{@link role.RoleType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RoleType
     * @generated
     */
    public Adapter createRoleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.RoleDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RoleDesignModel
     * @generated
     */
    public Adapter createRoleDesignModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.RoleTypePackage <em>Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RoleTypePackage
     * @generated
     */
    public Adapter createRoleTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.RoleRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RoleRuntimeModel
     * @generated
     */
    public Adapter createRoleRuntimeModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Assignment Map</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
    public Adapter createRoleAssignmentMapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.RoleAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RoleAssignment
     * @generated
     */
    public Adapter createRoleAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.RolePattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.RolePattern
     * @generated
     */
    public Adapter createRolePatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.IdentityRolePattern <em>Identity Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.IdentityRolePattern
     * @generated
     */
    public Adapter createIdentityRolePatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link role.AbstractRolePattern <em>Abstract Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see role.AbstractRolePattern
     * @generated
     */
    public Adapter createAbstractRolePatternAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Pattern
     * @generated
     */
    public Adapter createPatternAdapter() {
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

} //RoleAdapterFactory
