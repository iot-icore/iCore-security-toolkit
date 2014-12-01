/**
 */
package role.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import role.RoleAssignment;
import role.RolePackage;
import role.RoleRuntimeModel;
import role.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleRuntimeModelImpl#getRoleMap <em>Role Map</em>}</li>
 *   <li>{@link role.impl.RoleRuntimeModelImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleRuntimeModelImpl extends ModelImpl implements RoleRuntimeModel {
    /**
     * The cached value of the '{@link #getRoleMap() <em>Role Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleMap()
     * @generated
     * @ordered
     */
    protected EMap<RoleType, RoleAssignment> roleMap;

    /**
     * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignments()
     * @generated
     * @ordered
     */
    protected EList<RoleAssignment> assignments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleRuntimeModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_RUNTIME_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<RoleType, RoleAssignment> getRoleMap() {
        if (roleMap == null) {
            roleMap = new EcoreEMap<RoleType,RoleAssignment>(RolePackage.Literals.ROLE_ASSIGNMENT_MAP, RoleAssignmentMapImpl.class, this, RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP);
        }
        return roleMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleAssignment> getAssignments() {
        if (assignments == null) {
            assignments = new EObjectContainmentEList<RoleAssignment>(RoleAssignment.class, this, RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS);
        }
        return assignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP:
                return ((InternalEList<?>)getRoleMap()).basicRemove(otherEnd, msgs);
            case RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS:
                return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP:
                if (coreType) return getRoleMap();
                else return getRoleMap().map();
            case RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS:
                return getAssignments();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP:
                ((EStructuralFeature.Setting)getRoleMap()).set(newValue);
                return;
            case RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS:
                getAssignments().clear();
                getAssignments().addAll((Collection<? extends RoleAssignment>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP:
                getRoleMap().clear();
                return;
            case RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS:
                getAssignments().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RolePackage.ROLE_RUNTIME_MODEL__ROLE_MAP:
                return roleMap != null && !roleMap.isEmpty();
            case RolePackage.ROLE_RUNTIME_MODEL__ASSIGNMENTS:
                return assignments != null && !assignments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RoleRuntimeModelImpl
