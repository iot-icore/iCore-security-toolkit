/**
 */
package role.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import role.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleFactoryImpl extends EFactoryImpl implements RoleFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RoleFactory init() {
        try {
            RoleFactory theRoleFactory = (RoleFactory)EPackage.Registry.INSTANCE.getEFactory(RolePackage.eNS_URI);
            if (theRoleFactory != null) {
                return theRoleFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RoleFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case RolePackage.ROLE_TYPE: return createRoleType();
            case RolePackage.ROLE_DESIGN_MODEL: return createRoleDesignModel();
            case RolePackage.ROLE_TYPE_PACKAGE: return createRoleTypePackage();
            case RolePackage.ROLE_RUNTIME_MODEL: return createRoleRuntimeModel();
            case RolePackage.ROLE_ASSIGNMENT_MAP: return (EObject)createRoleAssignmentMap();
            case RolePackage.ROLE_ASSIGNMENT: return createRoleAssignment();
            case RolePackage.ROLE_PATTERN: return createRolePattern();
            case RolePackage.IDENTITY_ROLE_PATTERN: return createIdentityRolePattern();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType createRoleType() {
        RoleTypeImpl roleType = new RoleTypeImpl();
        return roleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleDesignModel createRoleDesignModel() {
        RoleDesignModelImpl roleDesignModel = new RoleDesignModelImpl();
        return roleDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleTypePackage createRoleTypePackage() {
        RoleTypePackageImpl roleTypePackage = new RoleTypePackageImpl();
        return roleTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleRuntimeModel createRoleRuntimeModel() {
        RoleRuntimeModelImpl roleRuntimeModel = new RoleRuntimeModelImpl();
        return roleRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<RoleType, RoleAssignment> createRoleAssignmentMap() {
        RoleAssignmentMapImpl roleAssignmentMap = new RoleAssignmentMapImpl();
        return roleAssignmentMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAssignment createRoleAssignment() {
        RoleAssignmentImpl roleAssignment = new RoleAssignmentImpl();
        return roleAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RolePattern createRolePattern() {
        RolePatternImpl rolePattern = new RolePatternImpl();
        return rolePattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityRolePattern createIdentityRolePattern() {
        IdentityRolePatternImpl identityRolePattern = new IdentityRolePatternImpl();
        return identityRolePattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RolePackage getRolePackage() {
        return (RolePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RolePackage getPackage() {
        return RolePackage.eINSTANCE;
    }

} //RoleFactoryImpl
